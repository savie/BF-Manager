package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1783 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5851(String str, long j, long j2) {
        C14485 c14485;
        if (j2 < 180000) {
            return;
        }
        if (j < 5000) {
            m5853(str);
            return;
        }
        if (j2 - j < 10000) {
            m5853(str);
            return;
        }
        ArrayList arrayListM5850 = m5850();
        Iterator it = arrayListM5850.iterator();
        do {
            if (!it.hasNext()) {
                c14485 = null;
                break;
            }
            c14485 = (C14485) it.next();
        } while (!c14485.f47466.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c14485 != null) {
            c14485.f47464 = j;
            c14485.f47465 = j2;
            c14485.f47467 = jCurrentTimeMillis;
        } else {
            arrayListM5850.add(new C14485(str, j, j2, jCurrentTimeMillis));
        }
        if (arrayListM5850.size() > 100) {
            Collections.sort(arrayListM5850, new C23657());
            while (arrayListM5850.size() > 100) {
                C19028.m43762(arrayListM5850, 1);
            }
        }
        m5852(arrayListM5850);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m5849(String str) {
        ArrayList<C14485> arrayListM5850 = m5850();
        for (C14485 c14485 : arrayListM5850) {
            if (c14485.f47466.equals(str)) {
                long j = c14485.f47464;
                if (j <= 0 || j > c14485.f47465) {
                    break;
                    break;
                }
                c14485.f47467 = System.currentTimeMillis();
                m5852(arrayListM5850);
                return c14485.f47464;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5853(String str) {
        ArrayList arrayListM5850 = m5850();
        for (int i = 0; i < arrayListM5850.size(); i++) {
            if (((C14485) arrayListM5850.get(i)).f47466.equals(str)) {
                arrayListM5850.remove(i);
                m5852(arrayListM5850);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5850() {
        ArrayList arrayList = new ArrayList();
        try {
            C17367 c17367M40441 = C17367.m40441(ApplicationC0716.f2992.mo16347("vpp", (byte[]) null));
            c17367M40441.m40447(1699025492);
            int i = c17367M40441.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C14485(c17367M40441.m40458(), c17367M40441.readLong(), c17367M40441.readLong(), c17367M40441.readLong()));
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5852(ArrayList arrayList) {
        C11018 c11018M43576 = C18917.m43576(1699025492);
        c11018M43576.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14485 c14485 = (C14485) it.next();
            c11018M43576.m27786(c14485.f47466);
            c11018M43576.m27791(c14485.f47464);
            c11018M43576.m27791(c14485.f47465);
            c11018M43576.m27791(c14485.f47467);
        }
        ApplicationC0716.f2992.edit().mo4067("vpp", c11018M43576.m27798()).apply();
    }
}
