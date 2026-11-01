package l;

/* JADX INFO: renamed from: l.ۨ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11910 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f39975;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f39976;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f39977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f39978;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f39979;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f39980;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f39981;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f39982;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object f39983;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f39984;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f39985;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f39986;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f39987;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f39988;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f39989;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39990;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f39991;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22847 f39992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f39993;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f39994;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f39995;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f39996;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f39997;

    public C11910(C22847 c22847, Object obj, Object obj2, boolean z, boolean z2, int i, int i2, int i3) {
        int iM14663;
        char c;
        boolean z3;
        boolean z4;
        this.f39992 = c22847;
        this.f39985 = obj;
        this.f39983 = obj2;
        this.f39996 = z;
        this.f39988 = z2;
        this.f39995 = i;
        this.f39993 = i2;
        this.f39990 = i3;
        boolean z5 = obj instanceof int[];
        int i4 = 2;
        boolean z6 = z5 && ((int[]) obj).length == 2;
        this.f39986 = z6;
        int iM14664 = -1;
        this.f39979 = z6 ? ((int[]) obj)[0] : -1;
        this.f39980 = z6 ? ((int[]) obj)[1] : -1;
        this.f39977 = obj instanceof InterfaceC13717 ? (InterfaceC13717) obj : null;
        this.f39994 = obj2 instanceof InterfaceC13717 ? (InterfaceC13717) obj2 : null;
        this.f39976 = m29711(obj);
        this.f39984 = m29711(obj2);
        if (z5) {
            int[] iArr = (int[]) obj;
            iM14663 = iArr.length == 1 ? iArr[0] : -1;
        } else {
            C23595 c23595 = C22141.f71668;
            iM14663 = C5290.m14663((InterfaceC13717) obj);
        }
        this.f39975 = iM14663;
        if (obj2 instanceof int[]) {
            int[] iArr2 = (int[]) obj2;
            if (iArr2.length == 1) {
                iM14664 = iArr2[0];
            }
        } else {
            C23595 c23596 = C22141.f71668;
            iM14664 = C5290.m14663((InterfaceC13717) obj2);
        }
        this.f39981 = iM14664;
        this.f39982 = c22847 != null && c22847.f74313 && !z && c22847.f74311 < 0 && iM14663 >= 0 && iM14663 < 128 && iM14664 >= 0 && iM14664 < 128 && iM14663 != iM14664;
        if (c22847 == null) {
            c = 0;
            i4 = 0;
        } else {
            EnumC4584 enumC4584 = c22847.f74307;
            boolean z7 = c22847.f74313;
            if (!z7 || z) {
                int i5 = c22847.f74311;
                if (i5 >= 0 || z) {
                    if (i5 >= 0 || !z || !z6 || z7 || enumC4584 != EnumC4584.POSSESSIVE || iM14664 < 0) {
                        i4 = (i5 >= 0 && c22847.f74309 && z6 && iM14664 >= 0 && (enumC4584 == EnumC4584.GREEDY || enumC4584 == EnumC4584.LAZY)) ? 3 : 4;
                    } else {
                        i4 = 6;
                    }
                } else if (iM14663 >= 0 && iM14664 >= 0) {
                    int i6 = C14027.f46134[enumC4584.ordinal()];
                    if (i6 == 1) {
                        i4 = (iM14663 != iM14664 || c22847.f74308 >= 1024) ? 5 : 9;
                    } else if (i6 == 2) {
                        i4 = 7;
                    } else {
                        if (i6 != 3) {
                            throw new IllegalArgumentException("Invalid exact literal quantifier type");
                        }
                        i4 = 8;
                    }
                }
                c = 0;
            } else {
                c = 0;
                i4 = 1;
            }
        }
        this.f39997 = i4;
        long j = 0;
        long j2 = 0;
        for (int i7 = 0; i7 < 128; i7++) {
            if (m29714(i7, obj) || (i3 == 0 && m29714(i7, obj2))) {
                if (i7 < 64) {
                    j |= 1 << i7;
                } else {
                    j2 |= 1 << i7;
                }
            }
        }
        this.f39987 = j;
        this.f39978 = j2;
        if (z5) {
            int[] iArr3 = (int[]) obj;
            z3 = i3 != 0 || iArr3.length <= 1;
            for (int i8 = 1; i8 < iArr3.length; i8++) {
                if (iArr3[i8] == iArr3[c]) {
                    z3 = false;
                }
            }
        } else {
            z3 = true;
        }
        this.f39991 = z3;
        for (int i9 = 56320; i9 <= 57343; i9++) {
            if (m29714(i9, obj2)) {
                z4 = false;
                this.f39989 = z4;
            }
        }
        z4 = true;
        this.f39989 = z4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29717(int i) {
        if (i < 128) {
            return ((i < 64 ? this.f39987 : this.f39978) & (1 << i)) != 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29711(Object obj) {
        if (!(obj instanceof int[]) || ((int[]) obj).length == 1) {
            int i = -1;
            for (int i2 = 0; i2 < 128; i2++) {
                if (m29714(i2, obj)) {
                    if (i < 0) {
                        i = i2;
                    }
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29714(int i, Object obj) {
        if (obj instanceof int[]) {
            return ((int[]) obj)[0] == i;
        }
        return ((InterfaceC13717) obj).mo1813(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0126, code lost:
    
        if (m29713(r1, 23, r17) != false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11910 m29716(int[] r17, java.lang.Object[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11910.m29716(int[], java.lang.Object[], int):l.ۨ᩵ۨ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m29712(int[] iArr, Object[] objArr, int i) {
        if (m29715(i, iArr)) {
            int i2 = iArr[i + 2];
            Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
            int i3 = iArr[i];
            if (i3 == 1) {
                if (obj instanceof InterfaceC13717) {
                    return obj;
                }
            } else if (i3 == 3 && (obj instanceof int[])) {
                int[] iArr2 = (int[]) obj;
                if (iArr2.length != 0) {
                    for (int i4 : iArr2) {
                        if (i4 >= 0 && i4 <= 65535) {
                        }
                    }
                    return iArr2.clone();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29713(int i, int i2, int[] iArr) {
        return m29715(i, iArr) && iArr[i] == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29715(int i, int[] iArr) {
        return i >= 0 && i % 8 == 0 && i <= iArr.length + (-8);
    }
}
