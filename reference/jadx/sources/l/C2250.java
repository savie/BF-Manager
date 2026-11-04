package l;

/* JADX INFO: renamed from: l.֫᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2250 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f7357;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7358;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f7359;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f7360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f7361;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f7362;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f7363;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f7364;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f7365;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f7366;

    public C2250(C22036 c22036, int i, C22036 c22037, C24515 c24515, C22036 c22038, C14576 c14576) {
        this.f7362 = c22036.f71066;
        this.f7363 = m7668(c22036);
        this.f7360 = i;
        this.f7364 = c22037.f71066;
        this.f7366 = m7668(c22037);
        this.f7357 = c24515 == null ? null : c24515.f34347;
        this.f7359 = c24515 == null ? 0 : c24515.f34348;
        this.f7361 = c22038.f71066;
        this.f7365 = c14576.f45932;
        this.f7358 = c14576.f45934;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2250 m7666(C14576 c14576) {
        int i;
        int i2;
        C0407 c0407;
        C0407 c0408;
        C0407 c0409;
        C16068 c16068;
        C22036 c22036;
        C22036 c22036M7667;
        C24515 c24515;
        C22036 c22037;
        InterfaceC2885 interfaceC2885;
        C0407 c04010;
        if (c14576 != null) {
            int i3 = c14576.f45933;
            if (c14576.getClass() == C14576.class && (i = c14576.f45932) >= 0 && c14576.f45934 >= i && c14576.f45930 >= -1 && i3 >= 0 && (i2 = c14576.f45931) >= 0 && i3 != i2 && (c0407 = c14576.f45929) != null && c0407.getClass() == C17560.class) {
                C17560 c17560 = (C17560) c14576.f45929;
                boolean z = c17560.f57061;
                int i4 = c17560.f57062;
                if (z && i4 == i3 && (c0408 = c17560.f1952) != null && c0408.getClass() == C8106.class) {
                    C8106 c8106 = (C8106) c17560.f1952;
                    C0407[] c0407Arr = c8106.f26768;
                    C0407 c04011 = c8106.f26771;
                    if (c0407Arr != null && c8106.f26769 == 2 && c0407Arr.length >= 2 && c04011 != null && c04011.getClass() == C19293.class && (c0409 = c04011.f1952) != null && c0409.getClass() == C16068.class && c17560.f57063 == (c16068 = (C16068) c04011.f1952) && c16068.f52070 && c16068.f52069 == 0 && c16068.f52068 == i4 && c16068.f1952 == c14576) {
                        C22036 c22036M7668 = m7667(c8106.f26768[0]);
                        C22036 c22036M7669 = m7667(c8106.f26768[1]);
                        if (c22036M7668 != null && c22036M7669 != null) {
                            if (c22036M7668.f1952 == c04011) {
                                c22036 = c22036M7668;
                                c22036M7668 = c22036M7669;
                            } else if (c22036M7669.f1952 == c04011) {
                                c22036 = c22036M7669;
                            }
                            InterfaceC2885 interfaceC2886 = c22036M7668.f71066;
                            if (m7668(c22036M7668) && (c22036M7667 = m7667(c22036M7668.f1952)) != null && c22036M7667.f1952 == c04011) {
                                C0407 c04012 = c14576.f1952;
                                if (c04012 == null || c04012.getClass() != C24515.class) {
                                    c24515 = null;
                                } else {
                                    C24515 c24516 = (C24515) c04012;
                                    if (c24516.f34348 >= 0 && c24516.f34347 != null) {
                                        c24515 = c24516;
                                        c04012 = c24516.f1952;
                                    }
                                }
                                if (m7668(c04012) && (interfaceC2885 = (c22037 = (C22036) c04012).f71066) != null && (c04010 = c22037.f1952) != null && c04010.getClass() == C3390.class) {
                                    boolean zM7668 = m7668(c22036);
                                    int iMax = Math.max(C5233.m15728(interfaceC2886), C5233.m15728(interfaceC2885));
                                    if (c24515 != null) {
                                        iMax = Math.max(iMax, C5233.m15728(c24515.f34347));
                                    }
                                    int i5 = -1;
                                    for (int i6 = 0; i6 < iMax; i6++) {
                                        boolean zMo1303 = interfaceC2886.mo1303(i6);
                                        if (zMo1303) {
                                            if (i5 < 0 && !Character.isSurrogate((char) i6)) {
                                                i5 = i6;
                                            }
                                        }
                                        boolean zMo1304 = interfaceC2885.mo1303(i6);
                                        boolean z2 = c24515 != null && c24515.f34347.mo1303(i6);
                                        if (zMo1304 && z2) {
                                            return null;
                                        }
                                        boolean z3 = zMo1304 || z2;
                                        if (!zM7668 && z3 && Character.isSurrogate((char) i6)) {
                                            return null;
                                        }
                                        if (zMo1303 && z3) {
                                            return null;
                                        }
                                        if ((zMo1303 || z3) && c22036.f71066.mo1303(i6)) {
                                            return null;
                                        }
                                    }
                                    if (i5 < 0) {
                                        return null;
                                    }
                                    return new C2250(c22036, i5, c22036M7667, c24515, c22037, c14576);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22036 m7667(C0407 c0407) {
        if (c0407 == null) {
            return null;
        }
        Class<?> cls = c0407.getClass();
        if (cls != C22036.class && cls != C15322.class && cls != C2470.class && !m7668(c0407)) {
            return null;
        }
        C22036 c22036 = (C22036) c0407;
        if (c22036.f71066 == null) {
            return null;
        }
        return c22036;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m7668(C0407 c0407) {
        return c0407 != null && c0407.getClass() == C6615.class;
    }
}
