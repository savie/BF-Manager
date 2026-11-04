package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SIWO */
/* JADX INFO: loaded from: classes3.dex */
public final class C2127 extends AbstractC6683 implements InterfaceC4452 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2127 f7005 = new C2127(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7317(C2551 c2551) {
        C2127 c2127 = f7005;
        C24590.m54904(c2551, (InterfaceC14892) c2127);
        if (c2551.mo17865(EnumC1763.REQUEST_CODE_SHRINK)) {
            C7347.m20164(c2551);
            if (c2551.m8529()) {
                C24590.m54901(c2551, (InterfaceC4452) c2127);
            }
        }
    }

    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        if (!m7321(c2551, interfaceC18213)) {
            return true;
        }
        c2551.mo17866(EnumC1763.REQUEST_CODE_SHRINK);
        return true;
    }

    @Override // l.InterfaceC4452
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7322(C2551 c2551, InterfaceC18213 interfaceC18213) {
        if (!m7321(c2551, interfaceC18213)) {
            return false;
        }
        C7347.m20164(c2551);
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m7321(C2551 c2551, InterfaceC18213 interfaceC18213) {
        C18981 c18981M41927;
        AbstractC16481 abstractC16481Mo17528;
        if (interfaceC18213 instanceof C9067) {
            C9067 c9067 = (C9067) interfaceC18213;
            if (!c9067.mo17865(EnumC1763.ELSE_IF_CHAIN)) {
                InterfaceC6281 interfaceC6281M24203 = c9067.m24203();
                InterfaceC6281 interfaceC6281M24200 = c9067.m24200();
                if (interfaceC6281M24203 != null) {
                    C6041 c6041 = null;
                    if (interfaceC6281M24200 == null) {
                        C21943 c21943M7316 = m7316(c9067.m24203());
                        if (c21943M7316 != null) {
                            C18959 c18959 = (C18959) ((ArrayList) c21943M7316.mo1986()).get(0);
                            if (c18959.m44027() != null) {
                                C6041 c6041M44027 = c18959.m44027();
                                if (c6041M44027.m17530().m41946().size() == 1 && (c18981M41927 = c6041M44027.m17530().m41927()) != null && c18981M41927.m44039() == 2) {
                                    for (AbstractC16481 abstractC16481 : c18981M41927.m44026()) {
                                        if (!c6041M44027.m17535(abstractC16481)) {
                                            c6041 = (C6041) abstractC16481;
                                            break;
                                        }
                                    }
                                    if (c6041 != null) {
                                        C18959 c18959M17529 = c6041.m17529();
                                        if (c2551.m8529() || ((c2551.m8536().m55554() && c2551.mo8532().m49706()) || (c18959M17529 == null || !c18959M17529.m44025() ? !c18959.m44027().m17534(c6041) : m7319(c2551, c18959, c18959M17529)))) {
                                            C21943 c21943 = (C21943) c9067.mo1257().get(0);
                                            if (c9067.getParent().mo19029(c9067, c21943)) {
                                                if (c18959M17529 == null || !c18959M17529.m44025()) {
                                                    abstractC16481Mo17528 = c6041.mo17528();
                                                } else {
                                                    abstractC16481Mo17528 = AbstractC16481.m39110(c18959M17529.mo4072());
                                                    C17973 c17973M17530 = c18959M17529.m44027().m17530();
                                                    if (c17973M17530.m41952() == 1 && c17973M17530.m41927() == c18981M41927) {
                                                        C9804.m25534(c2551, c18959M17529);
                                                    }
                                                }
                                                C4789 c4789 = new C4789(c9067.m1251(), c18981M41927.m44027().mo17528(), AbstractC16481.m39110(c18959), abstractC16481Mo17528);
                                                c4789.m14763();
                                                C9804.m25540(c2551, c18981M41927);
                                                C9804.m25535(c2551, c18981M41927);
                                                C9804.m25542(c2551, c18959);
                                                C20993.m47982(c21943M7316, c18959);
                                                ((ArrayList) c21943.mo1986()).clear();
                                                c4789.mo14759();
                                                ((ArrayList) c21943.mo1986()).add(c4789);
                                                m7318(c21943, c9067.mo1257());
                                                C7347.m20164(c2551);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        C21943 c21943M7317 = m7316(interfaceC6281M24203);
                        C21943 c21943M7318 = m7316(interfaceC6281M24200);
                        if (c21943M7317 != null && c21943M7318 != null) {
                            EnumC1763 enumC1763 = EnumC1763.DUPLICATED;
                            if (!c21943M7317.mo17865(enumC1763) && !c21943M7318.mo17865(enumC1763)) {
                                List listMo1257 = c9067.mo1257();
                                if (!listMo1257.isEmpty()) {
                                    C21943 c21944 = (C21943) listMo1257.get(0);
                                    C18959 c189510 = (C18959) ((ArrayList) c21943M7317.mo1986()).get(0);
                                    C18959 c189511 = (C18959) ((ArrayList) c21943M7318.mo1986()).get(0);
                                    if (m7319(c2551, c189510, c189511)) {
                                        C6041 c6041M44028 = c189510.m44027();
                                        C6041 c6041M44029 = c189511.m44027();
                                        if (c6041M44028 != null && c6041M44029 != null) {
                                            C18981 c18981M41928 = c6041M44028.m17530().m41927();
                                            C18981 c18981M41929 = c6041M44029.m17530().m41927();
                                            if (c18981M41928 != null && c18981M41928 == c18981M41929 && c9067.getParent().mo19029(c9067, c21944)) {
                                                C20993.m47982(c21943M7317, c189510);
                                                C20993.m47982(c21943M7318, c189511);
                                                if (c18981M41928.m44039() == 2) {
                                                    c6041M44028 = c18981M41928.m44027();
                                                } else {
                                                    c18981M41928.m44089(c6041M44029);
                                                }
                                                C4789 c47810 = new C4789(c9067.m1251(), c6041M44028.mo17528(), AbstractC16481.m39110(c189510.mo4072()), AbstractC16481.m39110(c189511.mo4072()));
                                                c47810.m16978(Math.max(c9067.mo1256(), Math.max(c189510.m16977(), c189511.m16977())));
                                                C9804.m25538(c2551, c189510);
                                                C9804.m25538(c2551, c189511);
                                                c47810.mo14759();
                                                if (c18981M41928.m44039() == 0) {
                                                    C9804.m25542(c2551, c18981M41928);
                                                    C9804.m25535(c2551, c18981M41928);
                                                }
                                                ((ArrayList) c21944.mo1986()).clear();
                                                ((ArrayList) c21944.mo1986()).add(c47810);
                                                m7318(c21944, listMo1257);
                                                return true;
                                            }
                                        } else if (!c2551.m8534()) {
                                            EnumC24203 type = c189510.getType();
                                            EnumC24203 enumC24203 = EnumC24203.RETURN;
                                            if (type == enumC24203 && c189511.getType() == enumC24203) {
                                                AbstractC16481 abstractC16481Mo44035 = c189510.mo44035(0);
                                                AbstractC16481 abstractC16481Mo44036 = c189511.mo44035(0);
                                                abstractC16481Mo44035.getClass();
                                                boolean z = abstractC16481Mo44035 instanceof C23195;
                                                abstractC16481Mo44036.getClass();
                                                if (z == (abstractC16481Mo44036 instanceof C23195) && c9067.getParent().mo19029(c9067, c21944)) {
                                                    C20993.m47982(c21943M7317, c189510);
                                                    C20993.m47982(c21943M7318, c189511);
                                                    EnumC1763 enumC1764 = EnumC1763.RETURN;
                                                    c21943M7317.m39418(enumC1764);
                                                    c21943M7318.m39418(enumC1764);
                                                    C4789 c47811 = new C4789(c9067.m1251(), null, abstractC16481Mo44035, abstractC16481Mo44036);
                                                    C18959 c189512 = new C18959(enumC24203, 1);
                                                    AbstractC16481 abstractC16481M39110 = AbstractC16481.m39110(c47811);
                                                    abstractC16481M39110.mo1130(abstractC16481Mo44035.getType());
                                                    c189512.mo44014(abstractC16481M39110);
                                                    ((ArrayList) c21944.mo1986()).clear();
                                                    c189512.mo14759();
                                                    ((ArrayList) c21944.mo1986()).add(c189512);
                                                    c21944.mo17866(enumC1764);
                                                    m7318(c21944, listMo1257);
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7319(C2551 c2551, C18959 c18959, C18959 c189510) {
        C18959 c18959M17529;
        int iM16977;
        if (c2551.mo17865(EnumC1763.USE_LINES_HINTS) && c18959.m16977() != c189510.m16977()) {
            if (c18959.m16977() != 0 && c189510.m16977() != 0) {
                if (c18959.m44027() == null || c189510.m44027() == null) {
                    return false;
                }
                C18981 c18981M41927 = c18959.m44027().m17530().m41927();
                C18981 c18981M41928 = c189510.m44027().m17530().m41927();
                if (c18981M41928 == null || c18981M41927 != c18981M41928) {
                    return false;
                }
                HashMap map = new HashMap(c18981M41927.m44039());
                for (AbstractC16481 abstractC16481 : c18981M41927.m44026()) {
                    abstractC16481.getClass();
                    if ((abstractC16481 instanceof C6041) && (c18959M17529 = ((C6041) abstractC16481).m17529()) != null && (iM16977 = c18959M17529.m16977()) != 0) {
                        C11392.merge(map, Integer.valueOf(iM16977), 1, new C10828());
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Map.Entry) it.next()).getValue()).intValue() >= 2) {
                    }
                }
                return false;
            }
            if (m7320(c18959) || m7320(c189510)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7318(C21943 c21943, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21943 c21944 = (C21943) it.next();
            if (c21944 != c21943) {
                ((ArrayList) c21944.mo1986()).clear();
                c21944.mo17866(EnumC1763.REMOVE);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m7316(InterfaceC6281 interfaceC6281) {
        if (!(interfaceC6281 instanceof C12050)) {
            return null;
        }
        C12050 c12050 = (C12050) interfaceC6281;
        if (((ArrayList) c12050.mo19035()).size() != 1) {
            return null;
        }
        InterfaceC6281 interfaceC6282 = (InterfaceC6281) ((ArrayList) c12050.mo19035()).get(0);
        if (!(interfaceC6282 instanceof C21943)) {
            return null;
        }
        C21943 c21943 = (C21943) interfaceC6282;
        if (((ArrayList) c21943.mo1986()).size() == 1) {
            return c21943;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7320(C18959 c18959) {
        if (c18959.getType() == EnumC24203.TERNARY) {
            return true;
        }
        for (int i = 0; i < c18959.m44039(); i++) {
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(i);
            abstractC16481Mo44035.getClass();
            if ((abstractC16481Mo44035 instanceof C17227) && m7320(((C17227) abstractC16481Mo44035).m40461())) {
                return true;
            }
        }
        return false;
    }
}
