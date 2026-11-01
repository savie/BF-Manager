package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18094 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f57860 = {"imports", "symbols", "entries", "relocations"};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m42083(long j) {
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m42093(long j) {
        if (j < 0 || j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m42094(String str) {
        return C15489.m37076(str, "\nstrings");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6805 m42087(C18094 c18094, C21622 c21622, String str, int i, int i2, int i3, int i4, int i5, C23034 c23034, C2956 c2956) {
        c18094.getClass();
        c21622.m48337(str);
        C15979 c15979 = new C15979(C15308.m36655(c2956.f11082, false));
        try {
            C6805 c6805M42089 = m42089(c21622, (InterfaceC21301) c15979, i, i2, i3, i4, i5 - c23034.f74846.size());
            c15979.close();
            return c6805M42089;
        } catch (Throwable th) {
            try {
                c15979.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6805 m42088(C18094 c18094, C21622 c21622, String str, boolean[] zArr, int i, int i2, int i3, int i4, C23034 c23034, C2956 c2956) {
        long j;
        C15979 c15979;
        c18094.getClass();
        c21622.m48337(str);
        C2323 c2323 = c21622.f70131.f5122;
        try {
            if (zArr[0]) {
                int i5 = c2323.f8244;
                int i6 = c2323.f8250;
                if (i5 == i) {
                    if (c2323.f8248 == i2) {
                        if (c2323.f8245 == i3 && i6 >= 0) {
                            c21622.f70130.put(m42094(str), Integer.valueOf(i6));
                            j = c2323.f8247;
                        }
                        long j2 = j;
                        zArr[0] = false;
                        c15979 = new C15979(C15308.m36655(c2956.f11082, true));
                        C6805 c6805M42090 = m42090(c21622, c15979, i, i2, i3, j2, i4 - c23034.f74846.size());
                        c15979.close();
                        return c6805M42090;
                    }
                    j = -1;
                    long j3 = j;
                    zArr[0] = false;
                    c15979 = new C15979(C15308.m36655(c2956.f11082, true));
                    C6805 c6805M42091 = m42090(c21622, c15979, i, i2, i3, j3, i4 - c23034.f74846.size());
                    c15979.close();
                    return c6805M42091;
                }
                j = -1;
                long j4 = j;
                zArr[0] = false;
                c15979 = new C15979(C15308.m36655(c2956.f11082, true));
                C6805 c6805M42092 = m42090(c21622, c15979, i, i2, i3, j4, i4 - c23034.f74846.size());
                c15979.close();
                return c6805M42092;
            }
            C6805 c6805M42093 = m42090(c21622, c15979, i, i2, i3, j4, i4 - c23034.f74846.size());
            c15979.close();
            return c6805M42093;
        } catch (Throwable th) {
            try {
                c15979.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        j = -1;
        long j5 = j;
        zArr[0] = false;
        c15979 = new C15979(C15308.m36655(c2956.f11082, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23034 m42099(C21956 c21956, C14952 c14952, C1139 c1139, final int i, int i2, int i3, int i4, final int i5) throws C12731 {
        int i6;
        C21622 c21622;
        ArrayList arrayList;
        int i7 = i2;
        C21622 c21623 = new C21622(this, c21956, c14952, c1139);
        ArrayList arrayList2 = c21623.f70129;
        final C23034 c23034 = new C23034(arrayList2.size());
        int i8 = 0;
        int iMax = Math.max(0, i7);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            final int iMax2 = iMax == i7 ? Math.max(i8, i3) : 0;
            try {
                final C21622 c21624 = c21623;
                c21622 = c21623;
                arrayList = arrayList2;
                final int i9 = iMax;
                final int iMax3 = iMax == i7 ? Math.max(i8, i4) : 0;
                i6 = iMax;
                try {
                    C6805 c6805 = (C6805) C9308.m23879(c21623.f70133, c21623.f70132, c21623.f70131.f5124, str, new InterfaceC1545() { // from class: l.ۘܰ۬
                        @Override // l.InterfaceC1545
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo5330(C2956 c2956) {
                            return C18094.m42087(this.f14781, c21624, str, i, i9, iMax2, iMax3, i5, c23034, c2956);
                        }
                    });
                    c23034.f74846.addAll(c6805.f22955);
                    if (c6805.f22953) {
                        c23034.f74844++;
                    }
                    C2323 c2323 = c6805.f22954;
                    c23034.f74843 = c2323;
                    if (c2323 != null) {
                        break;
                    }
                    iMax = i6 + 1;
                    i8 = 0;
                    arrayList2 = arrayList;
                    i7 = i2;
                    c21623 = c21622;
                } catch (RuntimeException unused) {
                    c23034.f74845 = true;
                } catch (C12731 e) {
                    e = e;
                    if (C11497.m28687(e)) {
                        throw e;
                    }
                    c23034.f74845 = true;
                }
            } catch (RuntimeException unused2) {
                i6 = iMax;
                c21622 = c21623;
                arrayList = arrayList2;
            } catch (C12731 e2) {
                e = e2;
                i6 = iMax;
                c21622 = c21623;
                arrayList = arrayList2;
            }
        }
        return c23034;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23034 m42098(C21956 c21956, C14952 c14952, C1139 c1139, final int i, int i2, int i3, final int i4) throws C12731 {
        int i5;
        C21622 c21622;
        ArrayList arrayList;
        int i6 = i2;
        C21622 c21623 = new C21622(this, c21956, c14952, c1139);
        ArrayList arrayList2 = c21623.f70129;
        final C23034 c23034 = new C23034(arrayList2.size());
        int i7 = 0;
        int iMax = Math.max(0, i6);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            int iMax2 = iMax == i6 ? Math.max(i7, i3) : 0;
            final boolean[] zArr = new boolean[1];
            zArr[i7] = true;
            try {
                final C21622 c21624 = c21623;
                c21622 = c21623;
                final int i8 = iMax;
                final int i9 = iMax2;
                arrayList = arrayList2;
                i5 = iMax;
                try {
                    C6805 c6805 = (C6805) C9308.m23879(c21623.f70133, c21623.f70132, c21623.f70131.f5124, str, new InterfaceC1545() { // from class: l.۬ܰ۬
                        @Override // l.InterfaceC1545
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo5330(C2956 c2956) {
                            return C18094.m42088(this.f43796, c21624, str, zArr, i, i8, i9, i4, c23034, c2956);
                        }
                    });
                    c23034.f74846.addAll(c6805.f22955);
                    if (c6805.f22953) {
                        c23034.f74844++;
                    }
                    C2323 c2323 = c6805.f22954;
                    c23034.f74843 = c2323;
                    if (c2323 != null) {
                        break;
                    }
                    iMax = i5 + 1;
                    i7 = 0;
                    i6 = i2;
                    arrayList2 = arrayList;
                    c21623 = c21622;
                } catch (RuntimeException unused) {
                    c23034.f74845 = true;
                } catch (C12731 e) {
                    e = e;
                    if (C11497.m28687(e)) {
                        throw e;
                    }
                    c23034.f74845 = true;
                }
            } catch (RuntimeException unused2) {
                i5 = iMax;
                c21622 = c21623;
                arrayList = arrayList2;
            } catch (C12731 e2) {
                e = e2;
                i5 = iMax;
                c21622 = c21623;
                arrayList = arrayList2;
            }
        }
        return c23034;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 l.ￖﾨￛﾘￛﾬ, still in use, count: 2, list:
          (r14v3 l.ￖﾨￛﾘￛﾬ) from 0x021c: MOVE (r3v29 l.ￖﾨￛﾘￛﾬ) = (r14v3 l.ￖﾨￛﾘￛﾬ)
          (r14v3 l.ￖﾨￛﾘￛﾬ) from 0x021f: PHI (r3v24 l.ￖﾨￛﾘￛﾬ) = (r14v3 l.ￖﾨￛﾘￛﾬ), (r14v3 l.ￖﾨￛﾘￛﾬ), (r14v3 l.ￖﾨￛﾘￛﾬ), (r3v29 l.ￖﾨￛﾘￛﾬ) binds: [B:68:0x020d, B:70:0x0213, B:72:0x0216, B:73:0x021c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C6805 m42089(l.C21622 r35, l.InterfaceC21301 r36, int r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18094.m42089(l.᩸ܰ۬, l.᩸ۗ֨, int, int, int, int, int):l.ۜܰ۬");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6805 m42090(C21622 c21622, InterfaceC21301 interfaceC21301, int i, int i2, int i3, long j, int i4) throws C12731 {
        HashMap map;
        int i5;
        String strM50267;
        long j2;
        String str;
        int i6;
        List list;
        int i7;
        C21622 c21623 = c21622;
        HashMap map2 = c21623.f70130;
        C6805 c6805 = new C6805(0);
        String str2 = (String) c21623.f70129.get(i2);
        int size = i3;
        long j3 = j;
        while (true) {
            Integer num = (Integer) map2.get(m42094(str2));
            int iIntValue = num == null ? -1 : num.intValue();
            try {
                C6135 c6135M39210 = ((C15979) interfaceC21301).f51752.m39210(size, iIntValue, j3);
                int i8 = c6135M39210.f20947;
                long j4 = c6135M39210.f20950;
                int i9 = c6135M39210.f20949;
                List list2 = c6135M39210.f20948;
                if (i8 != size || c6135M39210.f20951 != 1024 || i9 < 0 || list2.size() > 1024) {
                    break;
                }
                int size2 = list2.size();
                if (i8 > i9 || ((iIntValue >= 0 && iIntValue != i9) || ((long) i8) + ((long) size2) > i9)) {
                    throw m42091();
                }
                map2.put(m42094(str2), Integer.valueOf(i9));
                c6805.f22953 = true;
                if (size > i9) {
                    throw m42091();
                }
                int i10 = 0;
                while (i10 < list2.size()) {
                    C17424 c17424 = (C17424) list2.get(i10);
                    String str3 = c17424.f55435;
                    long j5 = c17424.f55438;
                    int i11 = i10;
                    List list3 = list2;
                    long j6 = c17424.f55437;
                    long j7 = j4;
                    long j8 = c17424.f55436;
                    if (str3.isEmpty()) {
                        map = map2;
                    } else {
                        map = map2;
                        C13614 c13614 = c21623.f70128;
                        C1139 c1139 = c21623.f70131;
                        C4440 c4440M33293 = c13614.m33293(str3, str3);
                        if (c4440M33293 != null) {
                            if (c1139.f5117) {
                                i5 = i9;
                                StringBuilder sb = new StringBuilder("section=\"");
                                sb.append(m42096(c17424.f55439));
                                sb.append("\" file=");
                                sb.append(m42095(j8));
                                sb.append(" va=");
                                sb.append(m42084(j6));
                                sb.append(" len=");
                                sb.append(j5 < 0 ? "?" : Long.toString(j5));
                                sb.append(" \"");
                                strM50267 = C22697.m50267(sb, m42096(c17424.f55435), "\"");
                                int i12 = c1139.f5129;
                                if (i12 > 0 && strM50267.length() > i12) {
                                    strM50267 = strM50267.substring(0, i12);
                                }
                            } else {
                                i5 = i9;
                                strM50267 = null;
                            }
                            if (c1139.f5131) {
                                c4440M33293.m12388();
                            } else {
                                c4440M33293 = null;
                            }
                            long jM42083 = m42083(j8);
                            long jM42084 = m42083(j6);
                            if (jM42083 >= 0) {
                                str = "file_offset";
                                j2 = jM42083;
                            } else if (jM42084 >= 0) {
                                str = "virtual";
                                j2 = jM42084;
                            } else {
                                j2 = -1;
                                str = null;
                            }
                            String str4 = strM50267;
                            i6 = i11;
                            C4440 c4440 = c4440M33293;
                            list = list3;
                            i7 = i5;
                            C0870 c0870 = new C0870("native_string", "strings.text", str4, c4440, str2, new C16663("", "", "", false, jM42084, jM42083, m42093(jM42083), j5 > 0 ? j5 : 0L, str, j2));
                            if (!C18800.m43360(c0870)) {
                                throw m42091();
                            }
                            ArrayList arrayList = c6805.f22955;
                            arrayList.add(c0870);
                            if (arrayList.size() >= i4) {
                                int i13 = i6 + 1;
                                c6805.f22954 = C2323.m7059(i, i2, size + i6 + 1, c6135M39210.f20949, i13 < list.size() ? ((C17424) list.get(i13)).f55436 : j7);
                                return c6805;
                            }
                        }
                        i10 = i6 + 1;
                        c21623 = c21622;
                        list2 = list;
                        i9 = i7;
                        j4 = j7;
                        map2 = map;
                    }
                    list = list3;
                    i6 = i11;
                    i7 = i9;
                    i10 = i6 + 1;
                    c21623 = c21622;
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
                    return c6805;
                }
                if (list4.isEmpty()) {
                    throw m42091();
                }
                c21623 = c21622;
                j3 = j9;
                map2 = map3;
            } catch (RuntimeException unused) {
                throw m42091();
            }
        }
        throw m42091();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42092(C16014 c16014, String str, int i, int i2) throws C12731 {
        String str2 = c16014.f51835;
        int i3 = c16014.f51836;
        int i4 = c16014.f51834;
        List list = c16014.f51838;
        if (!str.equals(str2) || i4 != i || c16014.f51837 != 1024 || i3 < 0 || list.size() > 1024) {
            throw m42091();
        }
        int size = list.size();
        if (i4 <= i3 && ((i2 < 0 || i2 == i3) && ((long) i4) + ((long) size) <= i3)) {
            if ("entries".equals(str)) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM42086 = m42086((InterfaceC7546) it.next());
                if (strM42086 != null && strM42086.length() > 4096) {
                    throw m42091();
                }
            }
            return;
        }
        throw m42091();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m42097(InterfaceC7546 interfaceC7546) {
        if (interfaceC7546 instanceof C8958) {
            return ((C8958) interfaceC7546).f30688;
        }
        if (interfaceC7546 instanceof C14603) {
            return ((C14603) interfaceC7546).f47785;
        }
        if (interfaceC7546 instanceof C0490) {
            return ((C0490) interfaceC7546).f2178;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42086(InterfaceC7546 interfaceC7546) {
        if (interfaceC7546 instanceof C8958) {
            return ((C8958) interfaceC7546).f30693;
        }
        if (interfaceC7546 instanceof C14603) {
            return ((C14603) interfaceC7546).f47786;
        }
        if (interfaceC7546 instanceof C0490) {
            return ((C0490) interfaceC7546).f2175;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42085(String str) {
        return (str == null || str.isEmpty()) ? "" : C22697.m50267(new StringBuilder(" demangled=\""), m42096(str), "\"");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42084(long j) {
        if (j < 0) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m42095(long j) {
        if (j < 0 || j > 2147483647L) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m42096(String str) {
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
    public static C12731 m42091() {
        return C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
    }
}
