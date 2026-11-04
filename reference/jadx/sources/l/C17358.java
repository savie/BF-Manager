package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17358 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40785(String str, C11391 c11391) {
        C24818 c24818;
        C11391 c11391M40787 = m40787(c11391);
        if (str.isEmpty() || c11391M40787 == null) {
            m40788(str);
            return;
        }
        ArrayList arrayListM40782 = m40782();
        Iterator it = arrayListM40782.iterator();
        do {
            if (!it.hasNext()) {
                c24818 = null;
                break;
            }
            c24818 = (C24818) it.next();
        } while (!c24818.f80299.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c24818 != null) {
            c24818.f80298 = c11391M40787;
            c24818.f80297 = jCurrentTimeMillis;
        } else {
            arrayListM40782.add(new C24818(str, c11391M40787, jCurrentTimeMillis));
        }
        if (arrayListM40782.size() > 100) {
            Collections.sort(arrayListM40782, new C5426());
            while (arrayListM40782.size() > 100) {
                C2764.m9138(arrayListM40782, 1);
            }
        }
        m40786(arrayListM40782);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11391 m40783(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList<C24818> arrayListM40782 = m40782();
        for (C24818 c24818 : arrayListM40782) {
            if (c24818.f80299.equals(str)) {
                C11391 c11391M40787 = m40787(c24818.f80298);
                if (c11391M40787 == null) {
                    return null;
                }
                c24818.f80297 = System.currentTimeMillis();
                m40786(arrayListM40782);
                return c11391M40787;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40788(String str) {
        if (str.isEmpty()) {
            return;
        }
        ArrayList arrayListM40782 = m40782();
        for (int i = 0; i < arrayListM40782.size(); i++) {
            if (((C24818) arrayListM40782.get(i)).f80299.equals(str)) {
                arrayListM40782.remove(i);
                m40786(arrayListM40782);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11391 m40787(C11391 c11391) {
        int i = C1697.f5829[c11391.m28746().ordinal()];
        if (i == 1) {
            return new C11391(EnumC16612.OFF, -1, null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IncompatibleClassChangeError();
            }
            if (c11391.m28747() != null && !c11391.m28747().isEmpty()) {
                return new C11391(EnumC16612.FILE, -1, c11391.m28747());
            }
        } else if (c11391.m28745() >= 0) {
            return new C11391(EnumC16612.TRACK, c11391.m28745(), null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m40782() {
        byte[] bArrMo7903;
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
            if (interfaceC9801 != null && (bArrMo7903 = interfaceC9801.mo7903("vsts", (byte[]) null)) != null && bArrMo7903.length != 0) {
                C20348 c20348M46740 = C20348.m46740(bArrMo7903);
                c20348M46740.m46746(1699025495);
                int i = c20348M46740.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(C24818.m55335(c20348M46740));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40786(ArrayList arrayList) {
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        if (interfaceC9801 == null) {
            return;
        }
        C6178 c6178M34975 = C14483.m34975(1699025495);
        c6178M34975.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24818 c24818 = (C24818) it.next();
            c6178M34975.m17800(c24818.f80299);
            int i = C1697.f5829[c24818.f80298.m28746().ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    continue;
                }
            }
            c6178M34975.writeByte(i2);
            c6178M34975.writeInt(c24818.f80298.m28745());
            c6178M34975.m17787(c24818.f80298.m28747());
            c6178M34975.m17803(c24818.f80297);
        }
        interfaceC9801.edit().mo3488("vsts", c6178M34975.m17799()).apply();
    }
}
