package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4319 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f15644 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m13807() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        for (int size = f15644.size() - 1; size >= 0; size--) {
            C15945 c15945 = (C15945) f15644.get(size);
            if (!c15945.f51775.get()) {
                c15945.m38022();
                f15644.remove(size);
            } else if (!c15945.m38044() && jCurrentTimeMillis - c15945.f51784 >= 30000) {
                if (i >= 2) {
                    c15945.m38053();
                    c15945.m38022();
                    f15644.remove(size);
                } else {
                    c15945.m38053();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized C15945 m13809() {
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C15945 c15945 : f15644) {
                if (!c15945.f51775.get()) {
                    arrayList.add(c15945);
                } else if (!c15945.f51785 && !c15945.m38044()) {
                    synchronized (c15945) {
                        if (jCurrentTimeMillis - c15945.f51784 > 50) {
                            c15945.f51784 = jCurrentTimeMillis;
                            m13808(arrayList);
                            return c15945;
                        }
                    }
                }
            }
            m13808(arrayList);
            return m13810();
        } catch (Throwable th) {
            m13808(arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized void m13811() {
        ArrayList arrayList = f15644;
        f15644 = new ArrayList();
        C5261.f18540.execute(new RunnableC1518(2, arrayList));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m13812() {
        return f15644.isEmpty();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C15945 m13810() throws IOException {
        try {
            C20653.m47266("creating connection");
            C15945 c15945M4908 = ((AbstractC1336) C4013.m12986()).m4908(true);
            C20653.m47266("connection created uid-" + c15945M4908.f51777);
            ArrayList arrayList = new ArrayList(0);
            for (C15945 c15945 : f15644) {
                if (!c15945.f51775.get()) {
                    arrayList.add(c15945);
                }
            }
            m13808(arrayList);
            f15644.add(c15945M4908);
            C20653.m47266("connection count " + f15644.size());
            return c15945M4908;
        } catch (IOException e) {
            int i = C20653.f66233;
            C20653.m47272("mtio ".concat(d.O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13808(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f15644.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C15945) it.next()).m38022();
        }
    }
}
