package l;

/* JADX INFO: renamed from: l.۠ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8348 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f27344;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f27345;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f27346;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f27347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f27348;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f27349;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f27350;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f27351;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f27352;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f27353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f27354;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f27355;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f27356;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f27357;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f27358;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f27359;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C15673 f27360;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f27361;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f27362;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f27363;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f27364;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f27365;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f27366;

    public C8348(C15673 c15673, Object obj, Object obj2, boolean z, boolean z2, int i, int i2, int i3) {
        int iM33756;
        char c;
        boolean z3;
        boolean z4;
        this.f27360 = c15673;
        this.f27350 = obj;
        this.f27352 = obj2;
        this.f27355 = z;
        this.f27357 = z2;
        this.f27358 = i;
        this.f27361 = i2;
        this.f27356 = i3;
        boolean z5 = obj instanceof int[];
        int i4 = 2;
        boolean z6 = z5 && ((int[]) obj).length == 2;
        this.f27348 = z6;
        int iM33757 = -1;
        this.f27359 = z6 ? ((int[]) obj)[0] : -1;
        this.f27351 = z6 ? ((int[]) obj)[1] : -1;
        this.f27344 = obj instanceof InterfaceC2885 ? (InterfaceC2885) obj : null;
        this.f27346 = obj2 instanceof InterfaceC2885 ? (InterfaceC2885) obj2 : null;
        this.f27363 = m22454(obj);
        this.f27349 = m22454(obj2);
        if (z5) {
            int[] iArr = (int[]) obj;
            iM33756 = iArr.length == 1 ? iArr[0] : -1;
        } else {
            C0407 c0407 = C5233.f18438;
            iM33756 = C13830.m33756((InterfaceC2885) obj);
        }
        this.f27353 = iM33756;
        if (obj2 instanceof int[]) {
            int[] iArr2 = (int[]) obj2;
            if (iArr2.length == 1) {
                iM33757 = iArr2[0];
            }
        } else {
            C0407 c0408 = C5233.f18438;
            iM33757 = C13830.m33756((InterfaceC2885) obj2);
        }
        this.f27365 = iM33757;
        this.f27345 = c15673 != null && c15673.f50967 && !z && c15673.f50965 < 0 && iM33756 >= 0 && iM33756 < 128 && iM33757 >= 0 && iM33757 < 128 && iM33756 != iM33757;
        if (c15673 == null) {
            c = 0;
            i4 = 0;
        } else {
            EnumC9355 enumC9355 = c15673.f50966;
            boolean z7 = c15673.f50967;
            if (!z7 || z) {
                int i5 = c15673.f50965;
                if (i5 >= 0 || z) {
                    if (i5 >= 0 || !z || !z6 || z7 || enumC9355 != EnumC9355.POSSESSIVE || iM33757 < 0) {
                        i4 = (i5 >= 0 && c15673.f50964 && z6 && iM33757 >= 0 && (enumC9355 == EnumC9355.GREEDY || enumC9355 == EnumC9355.LAZY)) ? 3 : 4;
                    } else {
                        i4 = 6;
                    }
                } else if (iM33756 >= 0 && iM33757 >= 0) {
                    int i6 = C2382.f7664[enumC9355.ordinal()];
                    if (i6 == 1) {
                        i4 = (iM33756 != iM33757 || c15673.f50970 >= 1024) ? 5 : 9;
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
        this.f27366 = i4;
        long j = 0;
        long j2 = 0;
        for (int i7 = 0; i7 < 128; i7++) {
            if (m22457(i7, obj) || (i3 == 0 && m22457(i7, obj2))) {
                if (i7 < 64) {
                    j |= 1 << i7;
                } else {
                    j2 |= 1 << i7;
                }
            }
        }
        this.f27362 = j;
        this.f27347 = j2;
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
        this.f27364 = z3;
        for (int i9 = 56320; i9 <= 57343; i9++) {
            if (m22457(i9, obj2)) {
                z4 = false;
                this.f27354 = z4;
            }
        }
        z4 = true;
        this.f27354 = z4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22460(int i) {
        if (i < 128) {
            return ((i < 64 ? this.f27362 : this.f27347) & (1 << i)) != 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22454(Object obj) {
        if (!(obj instanceof int[]) || ((int[]) obj).length == 1) {
            int i = -1;
            for (int i2 = 0; i2 < 128; i2++) {
                if (m22457(i2, obj)) {
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
    public static boolean m22457(int i, Object obj) {
        if (obj instanceof int[]) {
            return ((int[]) obj)[0] == i;
        }
        return ((InterfaceC2885) obj).mo1303(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0126, code lost:
    
        if (m22456(r1, 23, r17) != false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C8348 m22459(int[] r17, java.lang.Object[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8348.m22459(int[], java.lang.Object[], int):l.۠ۗۤ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22455(int[] iArr, Object[] objArr, int i) {
        if (m22458(i, iArr)) {
            int i2 = iArr[i + 2];
            Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
            int i3 = iArr[i];
            if (i3 == 1) {
                if (obj instanceof InterfaceC2885) {
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
    public static boolean m22456(int i, int i2, int[] iArr) {
        return m22458(i, iArr) && iArr[i] == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22458(int i, int[] iArr) {
        return i >= 0 && i % 8 == 0 && i <= iArr.length + (-8);
    }
}
