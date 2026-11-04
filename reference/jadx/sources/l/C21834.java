package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HF */
/* JADX INFO: loaded from: classes.dex */
public final class C21834 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49506(String str, long j, long j2) {
        C4680 c4680;
        if (j2 < 180000) {
            return;
        }
        if (j < 5000) {
            m49508(str);
            return;
        }
        if (j2 - j < 10000) {
            m49508(str);
            return;
        }
        ArrayList arrayListM49505 = m49505();
        Iterator it = arrayListM49505.iterator();
        do {
            if (!it.hasNext()) {
                c4680 = null;
                break;
            }
            c4680 = (C4680) it.next();
        } while (!c4680.f16543.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c4680 != null) {
            c4680.f16545 = j;
            c4680.f16542 = j2;
            c4680.f16544 = jCurrentTimeMillis;
        } else {
            arrayListM49505.add(new C4680(str, j, j2, jCurrentTimeMillis));
        }
        if (arrayListM49505.size() > 100) {
            Collections.sort(arrayListM49505, new C13846());
            while (arrayListM49505.size() > 100) {
                C2764.m9138(arrayListM49505, 1);
            }
        }
        m49507(arrayListM49505);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m49504(String str) {
        ArrayList<C4680> arrayListM49505 = m49505();
        for (C4680 c4680 : arrayListM49505) {
            if (c4680.f16543.equals(str)) {
                long j = c4680.f16545;
                if (j <= 0 || j > c4680.f16542) {
                    break;
                    break;
                }
                c4680.f16544 = System.currentTimeMillis();
                m49507(arrayListM49505);
                return c4680.f16545;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49508(String str) {
        ArrayList arrayListM49505 = m49505();
        for (int i = 0; i < arrayListM49505.size(); i++) {
            if (((C4680) arrayListM49505.get(i)).f16543.equals(str)) {
                arrayListM49505.remove(i);
                m49507(arrayListM49505);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m49505() {
        ArrayList arrayList = new ArrayList();
        try {
            C20348 c20348M46740 = C20348.m46740(ApplicationC17729.f58258.mo7903("vpp", (byte[]) null));
            c20348M46740.m46746(1699025492);
            int i = c20348M46740.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C4680(c20348M46740.m46758(), c20348M46740.readLong(), c20348M46740.readLong(), c20348M46740.readLong()));
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49507(ArrayList arrayList) {
        C6178 c6178M34975 = C14483.m34975(1699025492);
        c6178M34975.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4680 c4680 = (C4680) it.next();
            c6178M34975.m17800(c4680.f16543);
            c6178M34975.m17803(c4680.f16545);
            c6178M34975.m17803(c4680.f16542);
            c6178M34975.m17803(c4680.f16544);
        }
        ApplicationC17729.f58258.edit().mo3488("vpp", c6178M34975.m17799()).apply();
    }
}
