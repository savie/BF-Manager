package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.֨ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBGV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4669 f3546;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2718 f3547;

    public C0872(C4669 c4669, C2718 c2718) {
        if (c4669 == null) {
            throw new NullPointerException("file == null");
        }
        this.f3546 = c4669;
        this.f3547 = c2718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3491(AbstractC9901 abstractC9901) {
        int iM3489 = m3489(abstractC9901);
        C2718 c2718 = this.f3547;
        if (iM3489 != 0 && iM3489 != 6 && iM3489 != 2) {
            if (iM3489 == 3) {
                C0418.m2185(c2718, iM3489, ((AbstractC10377) abstractC9901).mo21659());
                return;
            }
            if (iM3489 != 4) {
                if (iM3489 == 16) {
                    C0418.m2181(c2718, iM3489, ((C15316) abstractC9901).mo21659() << 32);
                    return;
                }
                if (iM3489 == 17) {
                    C0418.m2181(c2718, iM3489, ((C4025) abstractC9901).mo21659());
                    return;
                }
                C4669 c4669 = this.f3546;
                switch (iM3489) {
                    case 21:
                        C0418.m2185(c2718, iM3489, c4669.m12888().m27800(((C16727) abstractC9901).m39215()));
                        return;
                    case 22:
                        C0418.m2185(c2718, iM3489, c4669.m12890().m19993((C16022) abstractC9901));
                        return;
                    case 23:
                        C0418.m2185(c2718, iM3489, c4669.m12886().m12264((C17432) abstractC9901));
                        return;
                    case 24:
                        C0418.m2185(c2718, iM3489, c4669.m12877().m28601((C6143) abstractC9901));
                        return;
                    case 25:
                        C0418.m2185(c2718, iM3489, c4669.m12889().m32494((C23077) abstractC9901));
                        return;
                    case 26:
                        C0418.m2185(c2718, iM3489, c4669.m12884().m37944((AbstractC11788) abstractC9901));
                        return;
                    case 27:
                        C0418.m2185(c2718, iM3489, c4669.m12889().m32494(((C6848) abstractC9901).m18451()));
                        return;
                    case 28:
                        c2718.m8280(iM3489);
                        m3492((C13905) abstractC9901, false);
                        return;
                    case 29:
                        c2718.m8280(iM3489);
                        m3493(((C3549) abstractC9901).m10468(), false);
                        return;
                    case 30:
                        c2718.m8280(iM3489);
                        return;
                    case 31:
                        c2718.m8280((((C2614) abstractC9901).mo21658() << 5) | iM3489);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo21659 = ((AbstractC10377) abstractC9901).mo21659();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo21659 >> 63) ^ jMo21659)) >> 3;
        c2718.m8280(iM3489 | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            c2718.m8280((byte) jMo21659);
            jMo21659 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m3489(AbstractC9901 abstractC9901) {
        if (abstractC9901 instanceof C5437) {
            return 0;
        }
        if (abstractC9901 instanceof C12494) {
            return 2;
        }
        if (abstractC9901 instanceof C13199) {
            return 3;
        }
        if (abstractC9901 instanceof C21665) {
            return 4;
        }
        if (abstractC9901 instanceof C7554) {
            return 6;
        }
        if (abstractC9901 instanceof C15316) {
            return 16;
        }
        if (abstractC9901 instanceof C4025) {
            return 17;
        }
        if (abstractC9901 instanceof C16727) {
            return 21;
        }
        if (abstractC9901 instanceof C16022) {
            return 22;
        }
        if (abstractC9901 instanceof C17432) {
            return 23;
        }
        if (abstractC9901 instanceof C6143) {
            return 24;
        }
        if (abstractC9901 instanceof C23077) {
            return 25;
        }
        if (abstractC9901 instanceof C20255) {
            return 26;
        }
        if (abstractC9901 instanceof C6848) {
            return 27;
        }
        if (abstractC9901 instanceof C13905) {
            return 28;
        }
        if (abstractC9901 instanceof C3549) {
            return 29;
        }
        if (abstractC9901 instanceof C8260) {
            return 30;
        }
        if (abstractC9901 instanceof C2614) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3492(C13905 c13905, boolean z) {
        C2718 c2718 = this.f3547;
        boolean z2 = z && c2718.m8288();
        C4731 c4731M33738 = c13905.m33738();
        int size = c4731M33738.size();
        if (z2) {
            c2718.m8285("  size: ".concat(C22475.m49978(size)));
        }
        c2718.m8293(size);
        for (int i = 0; i < size; i++) {
            AbstractC9901 abstractC9901M15267get = c4731M33738.m15267get(i);
            if (z2) {
                c2718.m8285("  [" + Integer.toHexString(i) + "] " + m3490(abstractC9901M15267get));
            }
            m3491(abstractC9901M15267get);
        }
        if (z2) {
            c2718.m8294();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3493(C23535 c23535, boolean z) {
        C2718 c2718 = this.f3547;
        boolean z2 = z && c2718.m8288();
        C4669 c4669 = this.f3546;
        C4400 c4400M12886 = c4669.m12886();
        C11457 c11457M12877 = c4669.m12877();
        C6143 type = c23535.getType();
        int iM28601 = c11457M12877.m28601(type);
        if (z2) {
            c2718.m8285("  type_idx: " + C22475.m49978(iM28601) + " // " + type.mo2376());
        }
        c2718.m8293(c11457M12877.m28601(c23535.getType()));
        Collection<C3072> collectionM51861 = c23535.m51861();
        int size = collectionM51861.size();
        if (z2) {
            c2718.m8285("  size: ".concat(C22475.m49978(size)));
        }
        c2718.m8293(size);
        int i = 0;
        for (C3072 c3072 : collectionM51861) {
            C17432 name = c3072.getName();
            int iM12264 = c4400M12886.m12264(name);
            AbstractC9901 value = c3072.getValue();
            if (z2) {
                c2718.m8283(0, "  elements[" + i + "]:");
                i++;
                c2718.m8285("    name_idx: " + C22475.m49978(iM12264) + " // " + name.mo2376());
            }
            c2718.m8293(iM12264);
            if (z2) {
                c2718.m8285("    value: " + m3490(value));
            }
            m3491(value);
        }
        if (z2) {
            c2718.m8294();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m3490(AbstractC9901 abstractC9901) {
        if (m3489(abstractC9901) == 30) {
            return "null";
        }
        return abstractC9901.mo2375() + ' ' + abstractC9901.mo2376();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3488(C4669 c4669, C23535 c23535) {
        C11457 c11457M12877 = c4669.m12877();
        C4400 c4400M12886 = c4669.m12886();
        c11457M12877.m28604(c23535.getType());
        for (C3072 c3072 : c23535.m51861()) {
            c4400M12886.m12268(c3072.getName());
            m3487(c4669, c3072.getValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3487(C4669 c4669, AbstractC9901 abstractC9901) {
        if (abstractC9901 instanceof C3549) {
            m3488(c4669, ((C3549) abstractC9901).m10468());
            return;
        }
        if (abstractC9901 instanceof C13905) {
            C4731 c4731M33738 = ((C13905) abstractC9901).m33738();
            int size = c4731M33738.size();
            for (int i = 0; i < size; i++) {
                m3487(c4669, c4731M33738.m15267get(i));
            }
            return;
        }
        c4669.m12883(abstractC9901);
    }
}
