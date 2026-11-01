package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۗۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3128 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m9445(AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 1) {
            return ((C15434) abstractC8774).f50298;
        }
        if (i != 2) {
            return null;
        }
        return ((C8378) abstractC8774).f29099;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m9466(AbstractC8774 abstractC8774) {
        if (abstractC8774.m22847(EnumC18651.f60478)) {
            AbstractC11242 abstractC11242 = ((C23195) abstractC8774).f75272;
            if (abstractC11242 == abstractC11242.f38032.f21322.f77632) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m9475(AbstractC8774 abstractC8774) {
        return (!m9466(abstractC8774) || (((C23195) abstractC8774).f75263.f77447 & 2305843009213693952L) == 0 || (((C23195) abstractC8774).f75263.f77447 & 2251799813685248L) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m9441(C21825 c21825, C23942 c23942) {
        AbstractC11242 abstractC11242M9472;
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
            if (abstractC8774.m22847(EnumC18651.f60549)) {
                C10870 c10870 = (C10870) abstractC8774;
                if (c10870.f36960.m22847(EnumC18651.f60539) && ((abstractC11242M9472 = m9472(((C15434) c10870.f36960).f50296)) == c23942.f77533 || abstractC11242M9472 == c23942.f77638)) {
                    return abstractC11242M9472;
                }
            }
        }
        return c23942.f77594;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9457(AbstractC8774 abstractC8774) {
        C23570 c23570;
        AbstractC23903 abstractC23903;
        AbstractC11242 abstractC11242M9472;
        if (!abstractC8774.m22847(EnumC18651.f60549)) {
            return false;
        }
        C10870 c10870 = (C10870) abstractC8774;
        if (!c10870.f36960.m22847(EnumC18651.f60510)) {
            return false;
        }
        C3812 c3812 = (C3812) c10870.f36960;
        return (!c3812.f14145.m22847(EnumC18651.f60473) || (abstractC23903 = (c23570 = (C23570) c3812.f14145).f76355) == null || (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || (abstractC11242M9472 = m9472(c23570.f76357)) == null || abstractC11242M9472 != abstractC11242M9472.f38032.f21322.f77533) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9456(AbstractC8774 abstractC8774) {
        AbstractC11242 abstractC11242M9472;
        if (abstractC8774.m22847(EnumC18651.f60549)) {
            C10870 c10870 = (C10870) abstractC8774;
            if (c10870.f36960.m22847(EnumC18651.f60539)) {
                abstractC11242M9472 = m9472(((C15434) c10870.f36960).f50296);
            } else {
                abstractC11242M9472 = null;
            }
        } else {
            abstractC11242M9472 = null;
        }
        return abstractC11242M9472 != null && abstractC11242M9472 == abstractC11242M9472.f38032.f21322.f77638;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9454(AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 3) {
            return m9454(m9467(abstractC8774));
        }
        if (i != 4) {
            return false;
        }
        AbstractC11242 abstractC11242 = ((C3107) abstractC8774).f11715;
        return abstractC11242 == abstractC11242.f38032.f21322.f77533;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m9469(AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 3) {
            return m9469(m9467(abstractC8774));
        }
        if (i == 4) {
            return true;
        }
        if (i != 5) {
            return false;
        }
        return m9454(((C23570) abstractC8774).f76357);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m9444(C8753 c8753) {
        return (C21825) C9030.stream(c8753.f30090).filter(new C15396(4)).map(new C21745(11)).filter(new C5850(2)).collect(C21825.m48587());
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9455(AbstractC8774 abstractC8774) {
        C15434 c15434M9452 = m9452(abstractC8774);
        if (c15434M9452 == null) {
            return false;
        }
        AbstractC11242 abstractC11242M9472 = m9472(c15434M9452.f50296);
        return abstractC11242M9472 == null || abstractC11242M9472 != abstractC11242M9472.f38032.f21322.f77533;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C15434 m9452(AbstractC8774 abstractC8774) {
        C21452 c21452;
        if (!abstractC8774.m22847(EnumC18651.f60478)) {
            return null;
        }
        C23195 c23195 = (C23195) abstractC8774;
        AbstractC11242 abstractC11242 = c23195.f75272;
        if (abstractC11242 != abstractC11242.f38032.f21322.f77632 || (c21452 = c23195.f75268) == null) {
            return null;
        }
        C21825 c21825 = c21452.f69737;
        while (c21825.m48595() && m9457((AbstractC8774) c21825.f70876)) {
            c21825 = c21825.f70877;
        }
        if (c21825.isEmpty() || !((AbstractC14728) c21825.f70876).m22847(EnumC18651.f60549)) {
            return null;
        }
        C10870 c10870 = (C10870) c21825.f70876;
        if (c10870.f36960.m22847(EnumC18651.f60539)) {
            return (C15434) c10870.f36960;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m9473(AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 2) {
            return m9473(((C8378) abstractC8774).f29095);
        }
        if (i == 6) {
            return ((C11596) abstractC8774).f38962.isEmpty();
        }
        if (i != 7) {
            return false;
        }
        return m9473(((C2401) abstractC8774).f9659);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m9468(AbstractC8774 abstractC8774) {
        return C17240.f54926[abstractC8774.mo1803().ordinal()] == 8 && (((C6656) abstractC8774).f22476.f70567 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9447(AbstractC8774 abstractC8774, EnumC0615 enumC0615) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 1) {
            ((C15434) abstractC8774).f53897 = enumC0615;
            return;
        }
        if (i == 2) {
            ((C8378) abstractC8774).f53897 = enumC0615;
        } else if (i == 9) {
            ((C6966) abstractC8774).f23406 = enumC0615;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC8774);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9448(AbstractC16579 abstractC16579, AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 1) {
            ((C15434) abstractC8774).f50299 = abstractC16579;
            return;
        }
        if (i == 2) {
            ((C8378) abstractC8774).f29094 = abstractC16579;
        } else if (i == 9) {
            ((C6966) abstractC8774).f23405 = abstractC16579;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC8774);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9449(AbstractC5930 abstractC5930) {
        int i = C17240.f54926[abstractC5930.mo1803().ordinal()];
        if (i != 1 && i != 2) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9451(AbstractC8774 abstractC8774, C23942 c23942) {
        if (abstractC8774 != null) {
            int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
            if (i == 4) {
                AbstractC11242 abstractC11242 = ((C3107) abstractC8774).f11715;
                if (abstractC11242 != c23942.f77533 && abstractC11242 != c23942.f77638) {
                    EnumC10477 enumC10477 = m9471(abstractC8774).f77452;
                    return enumC10477 == EnumC10477.f35865 || enumC10477 == EnumC10477.f35867;
                }
            } else {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            return m9451(((C2401) abstractC8774).f9659, c23942);
                        }
                        if (i != 27) {
                        }
                    }
                    return true;
                }
                EnumC10477 enumC10478 = m9471(abstractC8774).f77452;
                if ((enumC10478 == EnumC10477.f35865 || enumC10478 == EnumC10477.f35867) && m9451(((C23570) abstractC8774).f76357, c23942)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m9470(AbstractC8774 abstractC8774) {
        return abstractC8774.m22847(EnumC18651.f60472) && ((C1321) abstractC8774).f5611 == EnumC6617.BOT;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m9474(AbstractC8774 abstractC8774) {
        if (abstractC8774.m22847(EnumC18651.f60513)) {
            C21452 c21452 = (C21452) abstractC8774;
            if (c21452.f69737.m48595()) {
                return ((AbstractC14728) c21452.f69737.f70876).f30189;
            }
        }
        return abstractC8774.f30189;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m9432(AbstractC8774 abstractC8774) {
        int i;
        int i2;
        int i3;
        if (abstractC8774.m22847(EnumC18651.f60513) && (i3 = ((C21452) abstractC8774).f69738) != -1) {
            return i3;
        }
        if (abstractC8774.m22847(EnumC18651.f60563)) {
            return m9432(((C3437) abstractC8774).f12662);
        }
        if (abstractC8774.m22847(EnumC18651.f60481)) {
            C13713 c13713 = (C13713) abstractC8774;
            C21452 c21452 = c13713.f45218;
            if (c21452 == null) {
                c21452 = c13713.f45221.m48595() ? ((C19336) c13713.f45221.last()).f62362 : c13713.f45220;
            }
            return m9432(c21452);
        }
        if (!abstractC8774.m22847(EnumC18651.f60475) || (i2 = ((C2026) abstractC8774).f7569) == -1) {
            return (!abstractC8774.m22847(EnumC18651.f60487) || (i = ((C9789) abstractC8774).f33502) == -1) ? abstractC8774.f30189 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m9453(AbstractC8774 abstractC8774) {
        if (abstractC8774 == null) {
            return -1;
        }
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 1) {
            return m9453(((C15434) abstractC8774).f50296);
        }
        if (i == 2) {
            AbstractC5930 abstractC5930 = ((C8378) abstractC8774).f29093;
            if (abstractC5930 != null) {
                return m9453(abstractC5930);
            }
        } else {
            if (i == 5) {
                return m9453(((C23570) abstractC8774).f76357);
            }
            if (i == 6) {
                return m9453(((C11596) abstractC8774).f38963);
            }
            if (i == 7) {
                C2401 c2401 = (C2401) abstractC8774;
                if (c2401.f9658.m48595()) {
                    if (c2401.f9659.m22847(EnumC18651.f60566) || c2401.f9659.m22847(EnumC18651.f60473)) {
                        return m9453(c2401.f9659);
                    }
                    return m9453((AbstractC8774) c2401.f9658.f70876);
                }
                return m9453(c2401.f9659);
            }
            if (i != 8) {
                switch (i) {
                    case 12:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                        return m9453(((AbstractC10495) abstractC8774).mo17996(EnumC9084.LEFT));
                    case 14:
                        return m9453(((C3812) abstractC8774).f14145);
                    case 26:
                        C21825 c21825 = ((C12281) abstractC8774).f41061;
                        if (c21825 != null && c21825.m48595()) {
                            return m9453((AbstractC8774) c21825.f70876);
                        }
                        break;
                    case 27:
                        return m9453(((C0990) abstractC8774).f4638);
                    case 28:
                        C18255 c18255 = (C18255) abstractC8774;
                        C21783 c21783 = c18255.f58252;
                        return c21783.f70566.isEmpty() ? c18255.f30189 : ((C5224) c21783.f70566.f70876).f30189;
                    case 29:
                        C7672 c7672 = (C7672) abstractC8774;
                        return c7672.f25386.isEmpty() ? c7672.f30189 : ((C5224) c7672.f25386.f70876).f30189;
                    case 49:
                        int i2 = ((C8753) abstractC8774).f30089.f30189;
                        if (i2 != -1) {
                            return i2;
                        }
                        break;
                    case 50:
                        return m9453(((C7341) abstractC8774).f24394);
                    case 51:
                        return m9453(((C10870) abstractC8774).f36960);
                    case 52:
                        return m9453(((C22158) abstractC8774).f72477);
                    case 53:
                        C23195 c23195 = (C23195) abstractC8774;
                        int i3 = c23195.f75267.f30189;
                        if (i3 != -1) {
                            return i3;
                        }
                        if (c23195.f75269.m48595()) {
                            return m9453((AbstractC8774) c23195.f75269.f70876);
                        }
                        AbstractC5930 abstractC5931 = c23195.f75266;
                        return abstractC5931 == null ? c23195.f30189 : m9453(abstractC5931);
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        return m9453(((C11906) abstractC8774).f39945);
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        return m9453(((C15103) abstractC8774).f49323);
                    case 56:
                        return m9453(((C9459) abstractC8774).f32014);
                }
            } else {
                C6656 c6656 = (C6656) abstractC8774;
                int i4 = c6656.f22480;
                if (i4 != -1) {
                    return i4;
                }
                int i5 = c6656.f22476.f30189;
                if (i5 != -1) {
                    return i5;
                }
                AbstractC5930 abstractC5932 = c6656.f22477;
                if (abstractC5932 == null || abstractC5932.f30189 == -1) {
                    return c6656.f30189;
                }
                return m9453(abstractC5932);
            }
        }
        return abstractC8774.f30189;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9435(AbstractC8774 abstractC8774, InterfaceC4518 interfaceC4518) {
        if (abstractC8774 != null) {
            if (interfaceC4518 == null) {
                return m9432(abstractC8774);
            }
            int iMo6625 = interfaceC4518.mo6625(abstractC8774);
            if (iMo6625 != -1) {
                return iMo6625;
            }
            int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
            if (i == 7) {
                return m9435(((C2401) abstractC8774).f9659, interfaceC4518);
            }
            if (i == 50) {
                return m9435(((C7341) abstractC8774).f24392, interfaceC4518);
            }
            if (i != 54) {
                if (i != 10 && i != 11) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        case 26:
                            C21825 c21825 = ((C12281) abstractC8774).f41061;
                            if (c21825 != null && c21825.m48595()) {
                                return m9435((AbstractC8774) c21825.last(), interfaceC4518);
                            }
                            break;
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 56:
                                            return m9435(((C9459) abstractC8774).f32013, interfaceC4518);
                                        case 61:
                                            return m9435((AbstractC8774) ((C18630) abstractC8774).f60403.last(), interfaceC4518);
                                        case 62:
                                            return m9435(((C19336) abstractC8774).f62362, interfaceC4518);
                                        case 63:
                                            return m9435(((C14398) abstractC8774).f47206, interfaceC4518);
                                        case 64:
                                            return m9435(((C16514) abstractC8774).f53043, interfaceC4518);
                                        case 65:
                                            C4849 c4849 = (C4849) abstractC8774;
                                            AbstractC14728 abstractC14728 = c4849.f17077;
                                            if (abstractC14728 == null) {
                                                return m9435(c4849.f17075, interfaceC4518);
                                            }
                                            return m9435(abstractC14728, interfaceC4518);
                                        case 66:
                                            return m9435(((C2732) abstractC8774).f10508, interfaceC4518);
                                        case 67:
                                            return m9435((AbstractC8774) ((C21783) abstractC8774).f70566.last(), interfaceC4518);
                                        case 68:
                                            return m9435(((C3437) abstractC8774).f12662, interfaceC4518);
                                        case 69:
                                            return m9435((AbstractC8774) ((C10164) abstractC8774).f34727.last(), interfaceC4518);
                                        case 70:
                                            C13713 c13713 = (C13713) abstractC8774;
                                            C21452 c21452 = c13713.f45218;
                                            if (c21452 != null) {
                                                return m9435(c21452, interfaceC4518);
                                            }
                                            if (!c13713.f45221.isEmpty()) {
                                                return m9435((AbstractC8774) c13713.f45221.last(), interfaceC4518);
                                            }
                                            return m9435(c13713.f45220, interfaceC4518);
                                        case 71:
                                            return m9435(((C15124) abstractC8774).f49398, interfaceC4518);
                                        case 72:
                                            return m9435(((C2422) abstractC8774).f9708, interfaceC4518);
                                        case 73:
                                            return m9435(((C22885) abstractC8774).f74425, interfaceC4518);
                                        case 74:
                                            return m9435(((C16139) abstractC8774).f52149, interfaceC4518);
                                    }
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                case 46:
                                case 47:
                                case 48:
                                    return m9435(((AbstractC10495) abstractC8774).mo17996(EnumC9084.RIGHT), interfaceC4518);
                            }
                    }
                }
                return m9435(((AbstractC10495) abstractC8774).mo17996(EnumC9084.RIGHT), interfaceC4518);
            }
            return m9435(((C11906) abstractC8774).f39946, interfaceC4518);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12260 m9459(AbstractC8774 abstractC8774) {
        return new C16535(abstractC8774, m9432(abstractC8774));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9434(AbstractC8774 abstractC8774, EnumC1717 enumC1717) {
        if (abstractC8774.m22847(EnumC18651.f60481)) {
            C13713 c13713 = (C13713) abstractC8774;
            C6171.m17171(c13713.f45218);
            return enumC1717.m5715(c13713.f45218);
        }
        if (abstractC8774.m22847(EnumC18651.f60563)) {
            return m9432(((C3437) abstractC8774).f12662);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8774 m9440(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774, boolean z) {
        C12302 c12302 = new C12302(abstractC23903);
        abstractC8774.mo1802(c12302);
        AbstractC8774 abstractC8775 = c12302.f20240;
        if (abstractC8775 == null && z) {
            return null;
        }
        return abstractC8775 != null ? abstractC8775 : abstractC8774;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8774 m9439(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774) {
        C5951 c5951 = new C5951(abstractC23903);
        abstractC8774.mo1802(c5951);
        return c5951.f20240;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14728 m9442(C2732 c2732) {
        AbstractC14728 abstractC14728 = c2732;
        do {
            abstractC14728 = ((C2732) abstractC14728).f10508;
        } while (abstractC14728.m22847(EnumC18651.f60490));
        int i = C17240.f54926[abstractC14728.mo1803().ordinal()];
        return (i == 63 || i == 64 || i == 73 || i == 75 || i == 76) ? abstractC14728 : c2732;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC5930 m9461(AbstractC5930 abstractC5930) {
        while (abstractC5930.m22847(EnumC18651.f60509)) {
            abstractC5930 = ((C21077) abstractC5930).f68656;
        }
        return abstractC5930;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static AbstractC8774 m9467(AbstractC8774 abstractC8774) {
        return abstractC8774.m22847(EnumC18651.f60509) ? m9461((AbstractC5930) abstractC8774) : abstractC8774;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m9446(C21825 c21825) {
        C19003 c19003 = new C19003();
        while (c21825.m48595()) {
            c19003.m43723(((AbstractC8774) c21825.f70876).f30190);
            c21825 = c21825.f70877;
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m9472(AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 4) {
            return ((C3107) abstractC8774).f11715;
        }
        if (i == 5) {
            return ((C23570) abstractC8774).f76356;
        }
        if (i != 6) {
            return null;
        }
        return m9472(((C11596) abstractC8774).f38963);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m9460(AbstractC8774 abstractC8774) {
        AbstractC11242 abstractC11242M9460;
        AbstractC8774 abstractC8774M9467 = m9467(abstractC8774);
        int i = C17240.f54926[abstractC8774M9467.mo1803().ordinal()];
        if (i == 4) {
            return ((C3107) abstractC8774M9467).f11715;
        }
        if (i == 5 && (abstractC11242M9460 = m9460(((C23570) abstractC8774M9467).f76357)) != null) {
            return abstractC11242M9460.m28209('.', m9472(abstractC8774M9467));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static AbstractC23903 m9471(AbstractC8774 abstractC8774) {
        AbstractC8774 abstractC8774M9467 = m9467(abstractC8774);
        int i = C17240.f54926[abstractC8774M9467.mo1803().ordinal()];
        if (i == 4) {
            return ((C3107) abstractC8774M9467).f11716;
        }
        if (i == 5) {
            return ((C23570) abstractC8774M9467).f76355;
        }
        if (i == 6) {
            return m9471(((C11596) abstractC8774M9467).f38963);
        }
        if (i == 7) {
            return m9471(((C2401) abstractC8774M9467).f9659);
        }
        if (i != 9) {
            return null;
        }
        return ((C6966) abstractC8774M9467).f23412;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C21783 m9433(AbstractC8774 abstractC8774) {
        AbstractC8774 abstractC8774M9467 = m9467(abstractC8774);
        int i = C17240.f54926[abstractC8774M9467.mo1803().ordinal()];
        if (i == 8) {
            return ((C6656) abstractC8774M9467).f22476;
        }
        if (i == 28) {
            return ((C18255) abstractC8774M9467).f58252;
        }
        if (i == 49) {
            return ((C8753) abstractC8774M9467).f30089;
        }
        if (i != 53) {
            return null;
        }
        return ((C23195) abstractC8774M9467).f75267;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m9464(AbstractC23903 abstractC23903, AbstractC8774 abstractC8774) {
        AbstractC8774 abstractC8774M9467 = m9467(abstractC8774);
        int i = C17240.f54926[abstractC8774M9467.mo1803().ordinal()];
        if (i == 4) {
            ((C3107) abstractC8774M9467).f11716 = abstractC23903;
        } else {
            if (i != 5) {
                return;
            }
            ((C23570) abstractC8774M9467).f76355 = abstractC23903;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static long m9431(AbstractC8774 abstractC8774) {
        int i = C17240.f54926[abstractC8774.mo1803().ordinal()];
        if (i == 8) {
            return ((C6656) abstractC8774).f22476.f70567;
        }
        if (i == 49) {
            return ((C8753) abstractC8774).f30089.f70567;
        }
        if (i == 53) {
            return ((C23195) abstractC8774).f75267.f70567;
        }
        if (i != 80) {
            return 0L;
        }
        return ((C21452) abstractC8774).f69739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9436(EnumC18651 enumC18651) {
        int i = C17240.f54926[enumC18651.ordinal()];
        if (i == 54) {
            return 10;
        }
        if (i == 81) {
            return 15;
        }
        switch (i) {
            case 10:
            case 11:
                return 14;
            case 12:
            case 13:
                return 15;
            case 14:
                return 1;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return 2;
            default:
                switch (i) {
                    case 30:
                        return 4;
                    case 31:
                        return 5;
                    case 32:
                        return 6;
                    case 33:
                        return 7;
                    case 34:
                        return 8;
                    case 35:
                    case 36:
                        return 9;
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        return 10;
                    case 41:
                    case 42:
                    case 43:
                        return 11;
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        return 12;
                    case 46:
                    case 47:
                    case 48:
                        return 13;
                    default:
                        switch (i) {
                            case 57:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case 60:
                                return 14;
                            default:
                                throw new AssertionError();
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC12490 m9463(EnumC18651 enumC18651) {
        int i = C17240.f54926[enumC18651.ordinal()];
        if (i == 77) {
            return EnumC12490.ANNOTATION;
        }
        if (i != 78) {
            switch (i) {
                case 10:
                    return EnumC12490.PREFIX_INCREMENT;
                case 11:
                    return EnumC12490.PREFIX_DECREMENT;
                case 12:
                    return EnumC12490.POSTFIX_INCREMENT;
                case 13:
                    return EnumC12490.POSTFIX_DECREMENT;
                default:
                    switch (i) {
                        case 15:
                            return EnumC12490.OR_ASSIGNMENT;
                        case 16:
                            return EnumC12490.XOR_ASSIGNMENT;
                        case 17:
                            return EnumC12490.AND_ASSIGNMENT;
                        case 18:
                            return EnumC12490.LEFT_SHIFT_ASSIGNMENT;
                        case 19:
                            return EnumC12490.RIGHT_SHIFT_ASSIGNMENT;
                        case 20:
                            return EnumC12490.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT;
                        case 21:
                            return EnumC12490.PLUS_ASSIGNMENT;
                        case 22:
                            return EnumC12490.MINUS_ASSIGNMENT;
                        case 23:
                            return EnumC12490.MULTIPLY_ASSIGNMENT;
                        case 24:
                            return EnumC12490.DIVIDE_ASSIGNMENT;
                        case 25:
                            return EnumC12490.REMAINDER_ASSIGNMENT;
                        default:
                            switch (i) {
                                case 30:
                                    return EnumC12490.CONDITIONAL_OR;
                                case 31:
                                    return EnumC12490.CONDITIONAL_AND;
                                case 32:
                                    return EnumC12490.OR;
                                case 33:
                                    return EnumC12490.XOR;
                                case 34:
                                    return EnumC12490.AND;
                                case 35:
                                    return EnumC12490.EQUAL_TO;
                                case 36:
                                    return EnumC12490.NOT_EQUAL_TO;
                                case 37:
                                    return EnumC12490.LESS_THAN;
                                case 38:
                                    return EnumC12490.GREATER_THAN;
                                case 39:
                                    return EnumC12490.LESS_THAN_EQUAL;
                                case 40:
                                    return EnumC12490.GREATER_THAN_EQUAL;
                                case 41:
                                    return EnumC12490.LEFT_SHIFT;
                                case 42:
                                    return EnumC12490.RIGHT_SHIFT;
                                case 43:
                                    return EnumC12490.UNSIGNED_RIGHT_SHIFT;
                                case 44:
                                    return EnumC12490.PLUS;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    return EnumC12490.MINUS;
                                case 46:
                                    return EnumC12490.MULTIPLY;
                                case 47:
                                    return EnumC12490.DIVIDE;
                                case 48:
                                    return EnumC12490.REMAINDER;
                                default:
                                    switch (i) {
                                        case 57:
                                            return EnumC12490.UNARY_PLUS;
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            return EnumC12490.UNARY_MINUS;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                            return EnumC12490.LOGICAL_COMPLEMENT;
                                        case 60:
                                            return EnumC12490.BITWISE_COMPLEMENT;
                                        default:
                                            switch (i) {
                                                case 81:
                                                    return EnumC12490.OTHER;
                                                case 82:
                                                    return EnumC12490.EXPORTS;
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                    return EnumC12490.OPENS;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
        return EnumC12490.TYPE_ANNOTATION;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC5930 m9458(AbstractC5930 abstractC5930) {
        int i = C17240.f54926[abstractC5930.mo1803().ordinal()];
        if (i == 4 || i == 5 || i == 6) {
            return abstractC5930;
        }
        if (i == 7) {
            return ((C2401) abstractC5930).f9659;
        }
        if (i == 26 || i == 27 || i == 71 || i == 79 || i == 84) {
            return abstractC5930;
        }
        throw new AssertionError("Unexpected type tree: " + abstractC5930);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8774 m9438(AbstractC8774 abstractC8774, boolean z) {
        AbstractC8774 abstractC8775;
        int i;
        while (true) {
            abstractC8775 = null;
            while (true) {
                i = C17240.f54926[abstractC8774.mo1803().ordinal()];
                if (i != 7) {
                    break;
                }
                abstractC8775 = abstractC8774;
                abstractC8774 = ((C2401) abstractC8774).f9659;
            }
            if (i == 27) {
                abstractC8774 = ((C0990) abstractC8774).f4638;
            } else {
                if (i != 71) {
                    break;
                }
                abstractC8774 = ((C15124) abstractC8774).f49398;
            }
        }
        return (z || abstractC8775 == null) ? abstractC8774 : abstractC8775;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m9465(AbstractC8774 abstractC8774) {
        C9480 c9480 = new C9480();
        c9480.f32077 = false;
        c9480.mo7248(abstractC8774);
        return c9480.f32077;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9450(AbstractC5930 abstractC5930, C21825 c21825) {
        return abstractC5930.f30190.f53222.f77452 == EnumC10477.f35866 && C9030.stream(c21825).flatMap(new C4355(7)).allMatch(new C1534(2));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10891 m9462(AbstractC20372 abstractC20372) {
        int i = C17240.f54926[abstractC20372.mo1803().ordinal()];
        boolean z = true;
        if (i == 55) {
            return new C10891(((C15103) abstractC20372).f30190, true);
        }
        if (i != 56) {
            if (i == 74) {
                return m9462(((C16139) abstractC20372).f52149);
            }
            throw new AssertionError();
        }
        C9459 c9459 = (C9459) abstractC20372;
        C10891 c10891M9462 = m9462(c9459.f32014);
        boolean zM27291 = c10891M9462.m27291();
        if (c9459.f32013.f30190.m39001(EnumC6617.BOOLEAN) && zM27291) {
            Object objMo24292 = c9459.f32013.f30190.mo24292();
            if (objMo24292 == null || ((Integer) objMo24292).intValue() != 1) {
                z = false;
            }
        } else {
            z = zM27291;
        }
        return new C10891(c10891M9462.m27290(), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15103 m9443(AbstractC20372 abstractC20372) {
        int i = C17240.f54926[abstractC20372.mo1803().ordinal()];
        if (i == 55) {
            return (C15103) abstractC20372;
        }
        if (i == 56) {
            return m9443(((C9459) abstractC20372).f32014);
        }
        if (i == 74) {
            return m9443(((C16139) abstractC20372).f52149);
        }
        throw new AssertionError();
    }
}
