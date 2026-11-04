package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7994 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f26541 = {"imports", "symbols", "entries", "relocations"};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m21794(long j) {
        if (j < 0 || j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m21795(String str) {
        return C14483.m34972(str, "\nstrings");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m21799(long j) {
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14705 m21791(C7994 c7994, C0536 c0536, String str, int i, int i2, int i3, int i4, int i5, C21419 c21419, C17185 c17185) {
        c7994.getClass();
        c0536.m2507(str);
        C13959 c13959 = new C13959(C9752.m25419(c17185.f56010, false));
        try {
            C14705 c14705M21789 = m21789(c0536, (InterfaceC0383) c13959, i, i2, i3, i4, i5 - c21419.f68216.size());
            c13959.close();
            return c14705M21789;
        } catch (Throwable th) {
            try {
                c13959.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14705 m21792(C7994 c7994, C0536 c0536, String str, boolean[] zArr, int i, int i2, int i3, int i4, C21419 c21419, C17185 c17185) {
        long j;
        C13959 c13959;
        c7994.getClass();
        c0536.m2507(str);
        C14903 c14903 = c0536.f2246.f33863;
        try {
            if (zArr[0]) {
                int i5 = c14903.f48688;
                int i6 = c14903.f48689;
                if (i5 == i) {
                    if (c14903.f48687 == i2) {
                        if (c14903.f48692 == i3 && i6 >= 0) {
                            c0536.f2248.put(m21795(str), Integer.valueOf(i6));
                            j = c14903.f48690;
                        }
                        long j2 = j;
                        zArr[0] = false;
                        c13959 = new C13959(C9752.m25419(c17185.f56010, true));
                        C14705 c14705M21790 = m21790(c0536, c13959, i, i2, i3, j2, i4 - c21419.f68216.size());
                        c13959.close();
                        return c14705M21790;
                    }
                    j = -1;
                    long j3 = j;
                    zArr[0] = false;
                    c13959 = new C13959(C9752.m25419(c17185.f56010, true));
                    C14705 c14705M21791 = m21790(c0536, c13959, i, i2, i3, j3, i4 - c21419.f68216.size());
                    c13959.close();
                    return c14705M21791;
                }
                j = -1;
                long j4 = j;
                zArr[0] = false;
                c13959 = new C13959(C9752.m25419(c17185.f56010, true));
                C14705 c14705M21792 = m21790(c0536, c13959, i, i2, i3, j4, i4 - c21419.f68216.size());
                c13959.close();
                return c14705M21792;
            }
            C14705 c14705M21793 = m21790(c0536, c13959, i, i2, i3, j4, i4 - c21419.f68216.size());
            c13959.close();
            return c14705M21793;
        } catch (Throwable th) {
            try {
                c13959.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        j = -1;
        long j5 = j;
        zArr[0] = false;
        c13959 = new C13959(C9752.m25419(c17185.f56010, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21419 m21801(C14069 c14069, C18282 c18282, C10671 c10671, final int i, int i2, int i3, int i4, final int i5) throws C10186 {
        int i6;
        C0536 c0536;
        ArrayList arrayList;
        int i7 = i2;
        C0536 c0537 = new C0536(this, c14069, c18282, c10671);
        ArrayList arrayList2 = c0537.f2245;
        final C21419 c21419 = new C21419(arrayList2.size());
        int i8 = 0;
        int iMax = Math.max(0, i7);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            final int iMax2 = iMax == i7 ? Math.max(i8, i3) : 0;
            try {
                final C0536 c0538 = c0537;
                c0536 = c0537;
                arrayList = arrayList2;
                final int i9 = iMax;
                final int iMax3 = iMax == i7 ? Math.max(i8, i4) : 0;
                i6 = iMax;
                try {
                    C14705 c14705 = (C14705) C25391.m56749(c0537.f2247, c0537.f2249, c0537.f2246.f33862, str, new InterfaceC11964() { // from class: l.ۘܺۚ
                        @Override // l.InterfaceC11964
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo7002(C17185 c17185) {
                            return C7994.m21791(this.f15503, c0538, str, i, i9, iMax2, iMax3, i5, c21419, c17185);
                        }
                    });
                    c21419.f68216.addAll(c14705.f48045);
                    if (c14705.f48043) {
                        c21419.f68215++;
                    }
                    C14903 c14903 = c14705.f48044;
                    c21419.f68220 = c14903;
                    if (c14903 != null) {
                        break;
                    }
                    iMax = i6 + 1;
                    i8 = 0;
                    arrayList2 = arrayList;
                    i7 = i2;
                    c0537 = c0536;
                } catch (RuntimeException unused) {
                    c21419.f68218 = true;
                } catch (C10186 e) {
                    e = e;
                    if (C12666.m31434(e)) {
                        throw e;
                    }
                    c21419.f68218 = true;
                }
            } catch (RuntimeException unused2) {
                i6 = iMax;
                c0536 = c0537;
                arrayList = arrayList2;
            } catch (C10186 e2) {
                e = e2;
                i6 = iMax;
                c0536 = c0537;
                arrayList = arrayList2;
            }
        }
        return c21419;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21419 m21800(C14069 c14069, C18282 c18282, C10671 c10671, final int i, int i2, int i3, final int i4) throws C10186 {
        int i5;
        C0536 c0536;
        ArrayList arrayList;
        int i6 = i2;
        C0536 c0537 = new C0536(this, c14069, c18282, c10671);
        ArrayList arrayList2 = c0537.f2245;
        final C21419 c21419 = new C21419(arrayList2.size());
        int i7 = 0;
        int iMax = Math.max(0, i6);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            int iMax2 = iMax == i6 ? Math.max(i7, i3) : 0;
            final boolean[] zArr = new boolean[1];
            zArr[i7] = true;
            try {
                final C0536 c0538 = c0537;
                c0536 = c0537;
                final int i8 = iMax;
                final int i9 = iMax2;
                arrayList = arrayList2;
                i5 = iMax;
                try {
                    C14705 c14705 = (C14705) C25391.m56749(c0537.f2247, c0537.f2249, c0537.f2246.f33862, str, new InterfaceC11964() { // from class: l.᩺ܺۚ
                        @Override // l.InterfaceC11964
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo7002(C17185 c17185) {
                            return C7994.m21792(this.f79172, c0538, str, zArr, i, i8, i9, i4, c21419, c17185);
                        }
                    });
                    c21419.f68216.addAll(c14705.f48045);
                    if (c14705.f48043) {
                        c21419.f68215++;
                    }
                    C14903 c14903 = c14705.f48044;
                    c21419.f68220 = c14903;
                    if (c14903 != null) {
                        break;
                    }
                    iMax = i5 + 1;
                    i7 = 0;
                    i6 = i2;
                    arrayList2 = arrayList;
                    c0537 = c0536;
                } catch (RuntimeException unused) {
                    c21419.f68218 = true;
                } catch (C10186 e) {
                    e = e;
                    if (C12666.m31434(e)) {
                        throw e;
                    }
                    c21419.f68218 = true;
                }
            } catch (RuntimeException unused2) {
                i5 = iMax;
                c0536 = c0537;
                arrayList = arrayList2;
            } catch (C10186 e2) {
                e = e2;
                i5 = iMax;
                c0536 = c0537;
                arrayList = arrayList2;
            }
        }
        return c21419;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ, still in use, count: 2, list:
          (r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ) from 0x021c: MOVE (r3v29 l.￡ﾩﾸ￡ﾩﾺￛﾚ) = (r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ)
          (r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ) from 0x021f: PHI (r3v24 l.￡ﾩﾸ￡ﾩﾺￛﾚ) = (r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ), (r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ), (r14v3 l.￡ﾩﾸ￡ﾩﾺￛﾚ), (r3v29 l.￡ﾩﾸ￡ﾩﾺￛﾚ) binds: [B:68:0x020d, B:70:0x0213, B:72:0x0216, B:73:0x021c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C14705 m21789(l.C0536 r35, l.InterfaceC0383 r36, int r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7994.m21789(l.֡ܺۚ, l.֡ۧۚ, int, int, int, int, int):l.ܰܺۚ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14705 m21790(C0536 c0536, InterfaceC0383 interfaceC0383, int i, int i2, int i3, long j, int i4) throws C10186 {
        HashMap map;
        int i5;
        String strM23910;
        long j2;
        String str;
        int i6;
        List list;
        int i7;
        C0536 c0537 = c0536;
        HashMap map2 = c0537.f2248;
        C14705 c14705 = new C14705(0);
        String str2 = (String) c0537.f2245.get(i2);
        int size = i3;
        long j3 = j;
        while (true) {
            Integer num = (Integer) map2.get(m21795(str2));
            int iIntValue = num == null ? -1 : num.intValue();
            try {
                C11463 c11463M32338 = ((C13959) interfaceC0383).f44261.m32338(size, iIntValue, j3);
                int i8 = c11463M32338.f36048;
                long j4 = c11463M32338.f36045;
                int i9 = c11463M32338.f36046;
                List list2 = c11463M32338.f36044;
                if (i8 != size || c11463M32338.f36047 != 1024 || i9 < 0 || list2.size() > 1024) {
                    break;
                }
                int size2 = list2.size();
                if (i8 > i9 || ((iIntValue >= 0 && iIntValue != i9) || ((long) i8) + ((long) size2) > i9)) {
                    throw m21788();
                }
                map2.put(m21795(str2), Integer.valueOf(i9));
                c14705.f48043 = true;
                if (size > i9) {
                    throw m21788();
                }
                int i10 = 0;
                while (i10 < list2.size()) {
                    C1769 c1769 = (C1769) list2.get(i10);
                    String str3 = c1769.f6079;
                    long j5 = c1769.f6076;
                    int i11 = i10;
                    List list3 = list2;
                    long j6 = c1769.f6077;
                    long j7 = j4;
                    long j8 = c1769.f6075;
                    if (str3.isEmpty()) {
                        map = map2;
                    } else {
                        map = map2;
                        C20871 c20871 = c0537.f2250;
                        C10671 c10671 = c0537.f2246;
                        C3717 c3717M47696 = c20871.m47696(str3, str3);
                        if (c3717M47696 != null) {
                            if (c10671.f33864) {
                                i5 = i9;
                                StringBuilder sb = new StringBuilder("section=\"");
                                sb.append(m21797(c1769.f6078));
                                sb.append("\" file=");
                                sb.append(m21796(j8));
                                sb.append(" va=");
                                sb.append(m21785(j6));
                                sb.append(" len=");
                                sb.append(j5 < 0 ? "?" : Long.toString(j5));
                                sb.append(" \"");
                                strM23910 = C8947.m23910(sb, m21797(c1769.f6079), "\"");
                                int i12 = c10671.f33872;
                                if (i12 > 0 && strM23910.length() > i12) {
                                    strM23910 = strM23910.substring(0, i12);
                                }
                            } else {
                                i5 = i9;
                                strM23910 = null;
                            }
                            if (c10671.f33865) {
                                c3717M47696.m12102();
                            } else {
                                c3717M47696 = null;
                            }
                            long jM21799 = m21799(j8);
                            long jM217910 = m21799(j6);
                            if (jM21799 >= 0) {
                                str = "file_offset";
                                j2 = jM21799;
                            } else if (jM217910 >= 0) {
                                str = "virtual";
                                j2 = jM217910;
                            } else {
                                j2 = -1;
                                str = null;
                            }
                            String str4 = strM23910;
                            i6 = i11;
                            C3717 c3717 = c3717M47696;
                            list = list3;
                            i7 = i5;
                            C23131 c23131 = new C23131("native_string", "strings.text", str4, c3717, str2, new C14400("", "", "", false, jM217910, jM21799, m21794(jM21799), j5 > 0 ? j5 : 0L, str, j2));
                            if (!C19181.m44453(c23131)) {
                                throw m21788();
                            }
                            ArrayList arrayList = c14705.f48045;
                            arrayList.add(c23131);
                            if (arrayList.size() >= i4) {
                                int i13 = i6 + 1;
                                c14705.f48044 = C14903.m35853(i, i2, size + i6 + 1, c11463M32338.f36046, i13 < list.size() ? ((C1769) list.get(i13)).f6075 : j7);
                                return c14705;
                            }
                        }
                        i10 = i6 + 1;
                        c0537 = c0536;
                        list2 = list;
                        i9 = i7;
                        j4 = j7;
                        map2 = map;
                    }
                    list = list3;
                    i6 = i11;
                    i7 = i9;
                    i10 = i6 + 1;
                    c0537 = c0536;
                    list2 = list;
                    i9 = i7;
                    j4 = j7;
                    map2 = map;
                }
                HashMap map3 = map2;
                List list4 = list2;
                int i14 = i9;
                long j9 = j4;
                size += list4.size();
                if (size >= i14) {
                    return c14705;
                }
                if (list4.isEmpty()) {
                    throw m21788();
                }
                c0537 = c0536;
                j3 = j9;
                map2 = map3;
            } catch (RuntimeException unused) {
                throw m21788();
            }
        }
        throw m21788();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21793(C22652 c22652, String str, int i, int i2) throws C10186 {
        String str2 = c22652.f73562;
        int i3 = c22652.f73564;
        int i4 = c22652.f73566;
        List list = c22652.f73565;
        if (!str.equals(str2) || i4 != i || c22652.f73563 != 1024 || i3 < 0 || list.size() > 1024) {
            throw m21788();
        }
        int size = list.size();
        if (i4 <= i3 && ((i2 < 0 || i2 == i3) && ((long) i4) + ((long) size) <= i3)) {
            if ("entries".equals(str)) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM21787 = m21787((InterfaceC21906) it.next());
                if (strM21787 != null && strM21787.length() > 4096) {
                    throw m21788();
                }
            }
            return;
        }
        throw m21788();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m21798(InterfaceC21906 interfaceC21906) {
        if (interfaceC21906 instanceof C13482) {
            return ((C13482) interfaceC21906).f42893;
        }
        if (interfaceC21906 instanceof C17430) {
            return ((C17430) interfaceC21906).f56690;
        }
        if (interfaceC21906 instanceof C15192) {
            return ((C15192) interfaceC21906).f49600;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21787(InterfaceC21906 interfaceC21906) {
        if (interfaceC21906 instanceof C13482) {
            return ((C13482) interfaceC21906).f42892;
        }
        if (interfaceC21906 instanceof C17430) {
            return ((C17430) interfaceC21906).f56694;
        }
        if (interfaceC21906 instanceof C15192) {
            return ((C15192) interfaceC21906).f49597;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21786(String str) {
        return (str == null || str.isEmpty()) ? "" : C8947.m23910(new StringBuilder(" demangled=\""), m21797(str), "\"");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21785(long j) {
        if (j < 0) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m21796(long j) {
        if (j < 0 || j > 2147483647L) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m21797(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (Character.isISOControl(cCharAt)) {
                sb.append('?');
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m21788() {
        return C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
    }
}
