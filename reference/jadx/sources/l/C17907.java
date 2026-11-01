package l;

/* JADX INFO: renamed from: l.ᩳ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17907 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f56715;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f56716;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f56717;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56718;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f56719;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f56720;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f56721;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f56722;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f56723;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f56724;

    public C17907(C1015 c1015, int i, C1015 c1016, C16848 c16848, C1015 c1017, C17244 c17244) {
        this.f56715 = c1015.f4704;
        this.f56724 = m41597(c1015);
        this.f56721 = i;
        this.f56719 = c1016.f4704;
        this.f56716 = m41597(c1016);
        this.f56717 = c16848 == null ? null : c16848.f43382;
        this.f56722 = c16848 == null ? 0 : c16848.f43383;
        this.f56720 = c1017.f4704;
        this.f56723 = c17244.f54942;
        this.f56718 = c17244.f54941;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17907 m41596(C17244 c17244) {
        int i;
        int i2;
        C23595 c23595;
        C23595 c23596;
        C23595 c23597;
        C10189 c10189;
        C1015 c1015;
        C1015 c1015M41595;
        C16848 c16848;
        C1015 c1016;
        InterfaceC13717 interfaceC13717;
        C23595 c23598;
        if (c17244 != null) {
            int i3 = c17244.f54944;
            if (c17244.getClass() == C17244.class && (i = c17244.f54942) >= 0 && c17244.f54941 >= i && c17244.f54940 >= -1 && i3 >= 0 && (i2 = c17244.f54945) >= 0 && i3 != i2 && (c23595 = c17244.f54943) != null && c23595.getClass() == C8778.class) {
                C8778 c8778 = (C8778) c17244.f54943;
                boolean z = c8778.f30196;
                int i4 = c8778.f30197;
                if (z && i4 == i3 && (c23596 = c8778.f76439) != null && c23596.getClass() == C14732.class) {
                    C14732 c14732 = (C14732) c8778.f76439;
                    C23595[] c23595Arr = c14732.f48161;
                    C23595 c23599 = c14732.f48159;
                    if (c23595Arr != null && c14732.f48160 == 2 && c23595Arr.length >= 2 && c23599 != null && c23599.getClass() == C2030.class && (c23597 = c23599.f76439) != null && c23597.getClass() == C10189.class && c8778.f30195 == (c10189 = (C10189) c23599.f76439) && c10189.f34813 && c10189.f34815 == 0 && c10189.f34814 == i4 && c10189.f76439 == c17244) {
                        C1015 c1015M41596 = m41595(c14732.f48161[0]);
                        C1015 c1015M41597 = m41595(c14732.f48161[1]);
                        if (c1015M41596 != null && c1015M41597 != null) {
                            if (c1015M41596.f76439 == c23599) {
                                c1015 = c1015M41596;
                                c1015M41596 = c1015M41597;
                            } else if (c1015M41597.f76439 == c23599) {
                                c1015 = c1015M41597;
                            }
                            InterfaceC13717 interfaceC13718 = c1015M41596.f4704;
                            if (m41597(c1015M41596) && (c1015M41595 = m41595(c1015M41596.f76439)) != null && c1015M41595.f76439 == c23599) {
                                C23595 c235910 = c17244.f76439;
                                if (c235910 == null || c235910.getClass() != C16848.class) {
                                    c16848 = null;
                                } else {
                                    C16848 c16849 = (C16848) c235910;
                                    if (c16849.f43383 >= 0 && c16849.f43382 != null) {
                                        c16848 = c16849;
                                        c235910 = c16849.f76439;
                                    }
                                }
                                if (m41597(c235910) && (interfaceC13717 = (c1016 = (C1015) c235910).f4704) != null && (c23598 = c1016.f76439) != null && c23598.getClass() == C20772.class) {
                                    boolean zM41597 = m41597(c1015);
                                    int iMax = Math.max(C22141.m49101(interfaceC13718), C22141.m49101(interfaceC13717));
                                    if (c16848 != null) {
                                        iMax = Math.max(iMax, C22141.m49101(c16848.f43382));
                                    }
                                    int i5 = -1;
                                    for (int i6 = 0; i6 < iMax; i6++) {
                                        boolean zMo1813 = interfaceC13718.mo1813(i6);
                                        if (zMo1813) {
                                            if (i5 < 0 && !Character.isSurrogate((char) i6)) {
                                                i5 = i6;
                                            }
                                        }
                                        boolean zMo1814 = interfaceC13717.mo1813(i6);
                                        boolean z2 = c16848 != null && c16848.f43382.mo1813(i6);
                                        if (zMo1814 && z2) {
                                            return null;
                                        }
                                        boolean z3 = zMo1814 || z2;
                                        if (!zM41597 && z3 && Character.isSurrogate((char) i6)) {
                                            return null;
                                        }
                                        if (zMo1813 && z3) {
                                            return null;
                                        }
                                        if ((zMo1813 || z3) && c1015.f4704.mo1813(i6)) {
                                            return null;
                                        }
                                    }
                                    if (i5 < 0) {
                                        return null;
                                    }
                                    return new C17907(c1015, i5, c1015M41595, c16848, c1016, c17244);
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
    public static C1015 m41595(C23595 c23595) {
        if (c23595 == null) {
            return null;
        }
        Class<?> cls = c23595.getClass();
        if (cls != C1015.class && cls != C22889.class && cls != C13675.class && !m41597(c23595)) {
            return null;
        }
        C1015 c1015 = (C1015) c23595;
        if (c1015.f4704 == null) {
            return null;
        }
        return c1015;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m41597(C23595 c23595) {
        return c23595 != null && c23595.getClass() == C0619.class;
    }
}
