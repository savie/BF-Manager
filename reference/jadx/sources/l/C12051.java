package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L17P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12051 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f40323 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C7817 m29947(boolean z) {
        if (z) {
            return C0510.m2404();
        }
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C7817 c7817 : f40323) {
                if (!c7817.f25723.get()) {
                    arrayList.add(c7817);
                } else if (!c7817.f25729 && !c7817.m20610()) {
                    synchronized (c7817) {
                        if (jCurrentTimeMillis - c7817.f25728 > 50) {
                            c7817.f25728 = jCurrentTimeMillis;
                            m29949(arrayList);
                            return c7817;
                        }
                    }
                }
            }
            m29949(arrayList);
            return m29945();
        } catch (Throwable th) {
            m29949(arrayList);
            throw th;
        }
    }

    static {
        if (C16737.m39291()) {
            return;
        }
        Thread thread = new Thread(new RunnableC21513(1));
        thread.setDaemon(true);
        thread.setName("mtio-idle-cleaner");
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29948() {
        while (true) {
            try {
                Thread.sleep(25000L);
                synchronized (C12051.class) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    for (int size = f40323.size() - 1; size >= 0; size--) {
                        C7817 c7817 = (C7817) f40323.get(size);
                        if (!c7817.f25723.get()) {
                            c7817.m20577();
                            f40323.remove(size);
                        } else if (!c7817.m20610() && jCurrentTimeMillis - c7817.f25728 >= 30000) {
                            if (i >= 2) {
                                c7817.m20592();
                                c7817.m20577();
                                f40323.remove(size);
                            } else {
                                c7817.m20592();
                                i++;
                            }
                        }
                    }
                }
                C0510.m2401();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m29950() {
        return f40323.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7817 m29946(String str) {
        return m29947(C19812.m45045().mo43870() && (!str.startsWith("/data") ? C8272.m21690(str) == null : !(str.startsWith("/data/data/") || str.startsWith("/data/user/") || str.startsWith("/data/user_de/"))));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7817 m29951(boolean z) throws IOException {
        C7817 c7817M29947;
        C7817 c7817M29948 = m29947(z);
        try {
            c7817M29948.m20605();
            return c7817M29948;
        } catch (IOException e) {
            c7817M29948.m20577();
            try {
                c7817M29947 = m29947(z);
                try {
                    c7817M29947.m20605();
                    return c7817M29947;
                } catch (IOException e2) {
                    e = e2;
                    if (c7817M29947 != null) {
                        c7817M29947.m20577();
                    }
                    e.addSuppressed(e);
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                c7817M29947 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C7817 m29945() throws IOException {
        try {
            C0577.m2741("creating connection");
            C7817 c7817M6251 = ((AbstractC1921) C19812.m45045()).m6251(false);
            int i = c7817M6251.f25722;
            C0577.m2741("connection created uid-" + i);
            ArrayList arrayList = new ArrayList(0);
            for (C7817 c7817 : f40323) {
                if (!c7817.f25723.get()) {
                    arrayList.add(c7817);
                } else if (c7817.f25722 != i) {
                    arrayList.add(c7817);
                }
            }
            m29949(arrayList);
            f40323.add(c7817M6251);
            C0577.m2741("connection count " + f40323.size());
            return c7817M6251;
        } catch (IOException e) {
            int i2 = C0577.f2523;
            C0577.m2747("mtio ".concat(d.O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29952() {
        ArrayList arrayList = f40323;
        f40323 = new ArrayList();
        C4716.f16636.execute(new RunnableC14990(1, arrayList));
        C0510.m2405();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29949(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f40323.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C7817) it.next()).m20577();
        }
    }
}
