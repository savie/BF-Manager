package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NIUZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0723 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C21606 f2656 = new C21606(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C18622 f2657 = new C18622();

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        C2127.m7317(c2551);
        C24590.m54904(c2551, f2656);
        C24590.m54901(c2551, f2657);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3046(C2551 c2551) {
        if (c2551.mo17865(EnumC1763.REQUEST_IF_REGION_OPTIMIZE)) {
            try {
                C2127.m7317(c2551);
                C24590.m54904(c2551, f2656);
                C24590.m54901(c2551, f2657);
            } finally {
                c2551.m39418(EnumC1763.REQUEST_IF_REGION_OPTIMIZE);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3047(C2551 c2551, C9067 c9067) {
        C9812 c9812M1251;
        if (C20531.m47075(c9067.m24200())) {
            if (!C20531.m47075(c9067.m24203())) {
                if (c9067.m24200() != null) {
                    c9067.m24201();
                    return;
                }
                return;
            }
            if (c2551.mo17865(EnumC1763.USE_LINES_HINTS)) {
                int iM47079 = C20531.m47079(c9067.m24203());
                int iM470710 = C20531.m47079(c9067.m24200());
                if (iM47079 != 0 && iM470710 != 0) {
                    if (iM47079 <= iM470710 || c9067.m24200() == null) {
                        return;
                    }
                    c9067.m24201();
                    return;
                }
            }
            if (c9067.m1254() && (c9812M1251 = c9067.m1251()) != null && c9812M1251.m25590() == EnumC18763.NOT && c9067.m24200() != null) {
                c9067.m24201();
            }
            int iM47063 = C20531.m47063(c9067.m24203());
            int iM47064 = C20531.m47063(c9067.m24200());
            if (m3044(c2551, c9067.m24200())) {
                if (m3044(c2551, c9067.m24203()) && iM47064 < iM47063) {
                    if (c9067.m24200() != null) {
                        c9067.m24201();
                        return;
                    }
                    return;
                }
                if (iM47064 == 1) {
                    boolean zM47073 = C20531.m47073(c9067);
                    if (zM47073 && c2551.m8534()) {
                        if (!C8314.m22411(C20531.m47082(c9067.m24200()), EnumC24203.THROW) || c9067.m24200() == null) {
                            return;
                        }
                        c9067.m24201();
                        return;
                    }
                    if (iM47063 > 2 && (!zM47073 || iM47063 >= 4)) {
                        if (c9067.m24200() != null) {
                            c9067.m24201();
                            return;
                        }
                        return;
                    }
                }
            }
            boolean zM47076 = C20531.m47076(c9067.m24203());
            if (C20531.m47076(c9067.m24200()) && (!zM47076 || iM47064 < iM47063)) {
                if (c9067.m24200() != null) {
                    c9067.m24201();
                }
            } else if (m3045(c9067.m24203()) && !m3045(c9067.m24200()) && !zM47076) {
                if (c9067.m24200() != null) {
                    c9067.m24201();
                }
            } else {
                if (!C20531.m47077(c9067.m24200()) || c9067.m24200() == null) {
                    return;
                }
                c9067.m24201();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3045(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof C9067) {
            return true;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
            if (listMo19035.size() == 1 && (listMo19035.get(0) instanceof C9067)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3043(C2551 c2551, C9067 c9067) {
        if (m3044(c2551, c9067.m24203())) {
            return;
        }
        InterfaceC6238 interfaceC6238M24200 = c9067.m24200();
        if (interfaceC6238M24200 instanceof C12050) {
            ArrayList arrayList = (ArrayList) ((C12050) interfaceC6238M24200).mo19035();
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof C9067)) {
                InterfaceC6281 interfaceC6281 = (InterfaceC6281) arrayList.get(0);
                EnumC1763 enumC1763 = EnumC1763.ELSE_IF_CHAIN;
                interfaceC6281.mo17866(enumC1763);
                ((AbstractC16678) interfaceC6238M24200).mo17866(enumC1763);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3044(C2551 c2551, InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 != null) {
            if (!interfaceC6281.mo17865(EnumC1763.RETURN)) {
                if (!(interfaceC6281 instanceof C21943 ? C23231.m52180((C21943) interfaceC6281, c2551) : false)) {
                    if (interfaceC6281 instanceof InterfaceC18213) {
                        List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
                        if (listMo19035.size() == 1) {
                            InterfaceC6281 interfaceC6282 = (InterfaceC6281) listMo19035.get(0);
                            if (interfaceC6282 instanceof C21943 ? C23231.m52180((C21943) interfaceC6282, c2551) : false) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
