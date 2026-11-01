package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f2204 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2401() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        for (int size = f2204.size() - 1; size >= 0; size--) {
            C7817 c7817 = (C7817) f2204.get(size);
            if (!c7817.f25723.get()) {
                c7817.m20577();
                f2204.remove(size);
            } else if (!c7817.m20610() && jCurrentTimeMillis - c7817.f25728 >= 30000) {
                if (i >= 2) {
                    c7817.m20592();
                    c7817.m20577();
                    f2204.remove(size);
                } else {
                    c7817.m20592();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized C7817 m2404() {
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C7817 c7817 : f2204) {
                if (!c7817.f25723.get()) {
                    arrayList.add(c7817);
                } else if (!c7817.f25729 && !c7817.m20610()) {
                    synchronized (c7817) {
                        if (jCurrentTimeMillis - c7817.f25728 > 50) {
                            c7817.f25728 = jCurrentTimeMillis;
                            m2402(arrayList);
                            return c7817;
                        }
                    }
                }
            }
            m2402(arrayList);
            return m2403();
        } catch (Throwable th) {
            m2402(arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2405() {
        ArrayList arrayList = f2204;
        f2204 = new ArrayList();
        C4716.f16636.execute(new RunnableC9187(1, arrayList));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m2400() {
        return f2204.isEmpty();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C7817 m2403() throws IOException {
        try {
            C0577.m2741("creating connection");
            C7817 c7817M6251 = ((AbstractC1921) C19812.m45045()).m6251(true);
            C0577.m2741("connection created uid-" + c7817M6251.f25722);
            ArrayList arrayList = new ArrayList(0);
            for (C7817 c7817 : f2204) {
                if (!c7817.f25723.get()) {
                    arrayList.add(c7817);
                }
            }
            m2402(arrayList);
            f2204.add(c7817M6251);
            C0577.m2741("connection count " + f2204.size());
            return c7817M6251;
        } catch (IOException e) {
            int i = C0577.f2523;
            C0577.m2747("mtio ".concat(d.O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2402(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f2204.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C7817) it.next()).m20577();
        }
    }
}
