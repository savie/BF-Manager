package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L17P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7742 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f25500 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C15945 m21077(boolean z) {
        if (z) {
            return C4319.m13809();
        }
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C15945 c15945 : f25500) {
                if (!c15945.f51775.get()) {
                    arrayList.add(c15945);
                } else if (!c15945.f51785 && !c15945.m38044()) {
                    synchronized (c15945) {
                        if (jCurrentTimeMillis - c15945.f51784 > 50) {
                            c15945.f51784 = jCurrentTimeMillis;
                            m21079(arrayList);
                            return c15945;
                        }
                    }
                }
            }
            m21079(arrayList);
            return m21083();
        } catch (Throwable th) {
            m21079(arrayList);
            throw th;
        }
    }

    static {
        if (C21576.m49082()) {
            return;
        }
        Thread thread = new Thread(new RunnableC18183());
        thread.setDaemon(true);
        thread.setName("mtio-idle-cleaner");
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21078() {
        while (true) {
            try {
                Thread.sleep(25000L);
                synchronized (C7742.class) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    for (int size = f25500.size() - 1; size >= 0; size--) {
                        C15945 c15945 = (C15945) f25500.get(size);
                        if (!c15945.f51775.get()) {
                            c15945.m38022();
                            f25500.remove(size);
                        } else if (!c15945.m38044() && jCurrentTimeMillis - c15945.f51784 >= 30000) {
                            if (i >= 2) {
                                c15945.m38053();
                                c15945.m38022();
                                f25500.remove(size);
                            } else {
                                c15945.m38053();
                                i++;
                            }
                        }
                    }
                }
                C4319.m13807();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m21080() {
        return f25500.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15945 m21076(String str) {
        return m21077(C4013.m12986().mo29538() && (!str.startsWith("/data") ? C17743.m41554(str) == null : !(str.startsWith("/data/data/") || str.startsWith("/data/user/") || str.startsWith("/data/user_de/"))));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C15945 m21081(boolean z) throws IOException {
        C15945 c15945M21077;
        C15945 c15945M21078 = m21077(z);
        try {
            c15945M21078.m38045();
            return c15945M21078;
        } catch (IOException e) {
            c15945M21078.m38022();
            try {
                c15945M21077 = m21077(z);
                try {
                    c15945M21077.m38045();
                    return c15945M21077;
                } catch (IOException e2) {
                    e = e2;
                    if (c15945M21077 != null) {
                        c15945M21077.m38022();
                    }
                    e.addSuppressed(e);
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                c15945M21077 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C15945 m21083() throws IOException {
        try {
            C20653.m47266("creating connection");
            C15945 c15945M4908 = ((AbstractC1336) C4013.m12986()).m4908(false);
            int i = c15945M4908.f51777;
            C20653.m47266("connection created uid-" + i);
            ArrayList arrayList = new ArrayList(0);
            for (C15945 c15945 : f25500) {
                if (!c15945.f51775.get()) {
                    arrayList.add(c15945);
                } else if (c15945.f51777 != i) {
                    arrayList.add(c15945);
                }
            }
            m21079(arrayList);
            f25500.add(c15945M4908);
            C20653.m47266("connection count " + f25500.size());
            return c15945M4908;
        } catch (IOException e) {
            int i2 = C20653.f66233;
            C20653.m47272("mtio ".concat(d.O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21082() {
        ArrayList arrayList = f25500;
        f25500 = new ArrayList();
        C5261.f18540.execute(new RunnableC0284(0, arrayList));
        C4319.m13811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21079(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f25500.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C15945) it.next()).m38022();
        }
    }
}
