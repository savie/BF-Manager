package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public final class C22141 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f71666;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C20772 f71667;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C23595 f71668;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m49109(int i) {
        if (i >= 65536) {
            return true;
        }
        char c = (char) i;
        int i2 = C4312.f15487;
        return c >= 55296 && c < 57344;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C13052 m49107(C23595 c23595) {
        if (!(c23595 instanceof C19402)) {
            return null;
        }
        C13052 c13052 = new C13052();
        c13052.f43505 = ((C19402) c23595).f62544;
        if (c23595.getClass() == C0351.class) {
            C0351 c0351 = (C0351) c23595;
            c13052.f43507 = 1;
            c13052.f43510 = c0351.f1778;
            c13052.f43506 = c0351.f1778.f76439;
            c13052.f43502 = (int[]) c0351.f1779.clone();
            return c13052;
        }
        if (c23595.getClass() == C8819.class) {
            C8819 c8819 = (C8819) c23595;
            c13052.f43507 = 2;
            c13052.f43510 = c8819.f30322;
            c13052.f43506 = c8819.f30322.f76439;
            c13052.f43501 = c8819.f30321;
            return c13052;
        }
        if (c23595.getClass() == C7407.class) {
            C7407 c7407 = (C7407) c23595;
            c13052.f43507 = 3;
            c13052.f43510 = c7407.f24602;
            c13052.f43509 = Arrays.copyOf(c7407.f24603.f42141, c7407.f24603.f42142);
            return c13052;
        }
        if (c23595.getClass() == C10230.class) {
            C10230 c10230 = (C10230) c23595;
            c13052.f43507 = 4;
            c13052.f43510 = c10230.f34916;
            c13052.f43501 = c10230.f34915;
            return c13052;
        }
        if (c23595.getClass() == C15875.class) {
            C15875 c15875 = (C15875) c23595;
            c13052.f43507 = 5;
            c13052.f43510 = c15875.f51353;
            c13052.f43503 = new C1056(c15875.f51354);
            c13052.f43504 = c15875.f51355;
            return c13052;
        }
        if (c23595.getClass() != C20813.class) {
            return null;
        }
        C20813 c20813 = (C20813) c23595;
        c13052.f43507 = 6;
        c13052.f43510 = c20813.f67649;
        c13052.f43503 = new C1056(c20813.f67652);
        c13052.f43501 = c20813.f67651;
        c13052.f43508 = c20813.f67650;
        return c13052;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1056 m49102(C23595 c23595) {
        if (c23595 instanceof C12306) {
            InterfaceC16539 interfaceC16539 = ((C12306) c23595).f41136;
            if (C6009.m16315(interfaceC16539)) {
                return new C1056(((C22224) interfaceC16539).f72669);
            }
        }
        throw new IllegalArgumentException("Unknown looking-at check: ".concat(c23595.getClass().getName()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13717 m49108(C23595 c23595) {
        if (c23595 instanceof C5955) {
            return ((C5955) c23595).f20257;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m49106(C14732 c14732) {
        return c14732.f48162;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13717 m49103(InterfaceC13717 interfaceC13717, InterfaceC13717 interfaceC13718, InterfaceC13717 interfaceC13719, boolean z) {
        return C3111.m9337(C3111.m9337(interfaceC13717, interfaceC13718, z), interfaceC13719, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20376 m49104(int i) {
        return new C3878(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49101(InterfaceC13717 interfaceC13717) {
        if (interfaceC13717 instanceof C21081) {
            return ((C21081) interfaceC13717).f68666.length << 6;
        }
        if (interfaceC13717 instanceof C18965) {
            return ((C18965) interfaceC13717).f61412.length << 6;
        }
        int iM14663 = C5290.m14663(interfaceC13717);
        if (iM14663 >= 0) {
            return iM14663 + 1;
        }
        return 65536;
    }

    static {
        int[] iArrCopyOf = new int[4096];
        int i = 0;
        for (int i2 = 0; i2 <= 65535; i2++) {
            int upperCase = Character.toUpperCase(i2);
            if (upperCase != i2 || Character.toLowerCase(upperCase) != i2) {
                if (i == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
                }
                iArrCopyOf[i] = i2;
                i++;
            }
        }
        f71666 = Arrays.copyOf(iArrCopyOf, i);
        f71668 = new C23595();
        f71667 = new C20772();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C3399 m49100(C23595 c23595) {
        return C2467.m7575(c23595);
    }
}
