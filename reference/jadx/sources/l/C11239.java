package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۧ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11239 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m28327(AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 1) {
            return ((C24533) abstractC8036).f79555;
        }
        if (i != 2) {
            return null;
        }
        return ((C18565) abstractC8036).f60325;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m28348(AbstractC8036 abstractC8036) {
        if (abstractC8036.m21911(EnumC21461.f68505)) {
            AbstractC19728 abstractC19728 = ((C6633) abstractC8036).f22150;
            if (abstractC19728 == abstractC19728.f63499.f73707.f49865) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m28361(AbstractC8036 abstractC8036) {
        return (!m28348(abstractC8036) || (((C6633) abstractC8036).f22152.f38071 & 2305843009213693952L) == 0 || (((C6633) abstractC8036).f22152.f38071 & 2251799813685248L) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19728 m28329(C14769 c14769, C15252 c15252) {
        AbstractC19728 abstractC19728M28319;
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
            if (abstractC8036.m21911(EnumC21461.f68533)) {
                C11106 c11106 = (C11106) abstractC8036;
                if (c11106.f35018.m21911(EnumC21461.f68526) && ((abstractC19728M28319 = m28319(((C24533) c11106.f35018).f79554)) == c15252.f49836 || abstractC19728M28319 == c15252.f49851)) {
                    return abstractC19728M28319;
                }
            }
        }
        return c15252.f49799;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m28339(AbstractC8036 abstractC8036) {
        C23041 c23041;
        AbstractC11781 abstractC11781;
        AbstractC19728 abstractC19728M28319;
        if (!abstractC8036.m21911(EnumC21461.f68533)) {
            return false;
        }
        C11106 c11106 = (C11106) abstractC8036;
        if (!c11106.f35018.m21911(EnumC21461.f68452)) {
            return false;
        }
        C20605 c20605 = (C20605) c11106.f35018;
        return (!c20605.f66030.m21911(EnumC21461.f68485) || (abstractC11781 = (c23041 = (C23041) c20605.f66030).f74775) == null || (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || (abstractC19728M28319 = m28319(c23041.f74776)) == null || abstractC19728M28319 != abstractC19728M28319.f63499.f73707.f49836) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m28343(AbstractC8036 abstractC8036) {
        AbstractC19728 abstractC19728M28319;
        if (abstractC8036.m21911(EnumC21461.f68533)) {
            C11106 c11106 = (C11106) abstractC8036;
            if (c11106.f35018.m21911(EnumC21461.f68526)) {
                abstractC19728M28319 = m28319(((C24533) c11106.f35018).f79554);
            } else {
                abstractC19728M28319 = null;
            }
        } else {
            abstractC19728M28319 = null;
        }
        return abstractC19728M28319 != null && abstractC19728M28319 == abstractC19728M28319.f63499.f73707.f49851;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m28360(AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 3) {
            return m28360(m28345(abstractC8036));
        }
        if (i != 4) {
            return false;
        }
        AbstractC19728 abstractC19728 = ((C5887) abstractC8036).f20169;
        return abstractC19728 == abstractC19728.f63499.f73707.f49836;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m28359(AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 3) {
            return m28359(m28345(abstractC8036));
        }
        if (i == 4) {
            return true;
        }
        if (i != 5) {
            return false;
        }
        return m28360(((C23041) abstractC8036).f74776);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m28326(C7926 c7926) {
        return (C14769) C1170.stream(c7926.f26344).filter(new C15165(6)).map(new C22493(7)).filter(new C23326(5)).collect(C14769.m35544());
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m28318(AbstractC8036 abstractC8036) {
        C24533 c24533M28350 = m28350(abstractC8036);
        if (c24533M28350 == null) {
            return false;
        }
        AbstractC19728 abstractC19728M28319 = m28319(c24533M28350.f79554);
        return abstractC19728M28319 == null || abstractC19728M28319 != abstractC19728M28319.f63499.f73707.f49836;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C24533 m28350(AbstractC8036 abstractC8036) {
        C4197 c4197;
        if (!abstractC8036.m21911(EnumC21461.f68505)) {
            return null;
        }
        C6633 c6633 = (C6633) abstractC8036;
        AbstractC19728 abstractC19728 = c6633.f22150;
        if (abstractC19728 != abstractC19728.f63499.f73707.f49865 || (c4197 = c6633.f22148) == null) {
            return null;
        }
        C14769 c14769 = c4197.f15344;
        while (c14769.m35550() && m28339((AbstractC8036) c14769.f48335)) {
            c14769 = c14769.f48336;
        }
        if (c14769.isEmpty() || !((AbstractC19969) c14769.f48335).m21911(EnumC21461.f68533)) {
            return null;
        }
        C11106 c11106 = (C11106) c14769.f48335;
        if (c11106.f35018.m21911(EnumC21461.f68526)) {
            return (C24533) c11106.f35018;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m28349(AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 2) {
            return m28349(((C18565) abstractC8036).f60323);
        }
        if (i == 6) {
            return ((C25191) abstractC8036).f81424.isEmpty();
        }
        if (i != 7) {
            return false;
        }
        return m28349(((C16875) abstractC8036).f55198);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m28347(AbstractC8036 abstractC8036) {
        return C21682.f69208[abstractC8036.mo2285().ordinal()] == 8 && (((C12510) abstractC8036).f40170.f15825 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28333(AbstractC8036 abstractC8036, EnumC8869 enumC8869) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 1) {
            ((C24533) abstractC8036).f24265 = enumC8869;
            return;
        }
        if (i == 2) {
            ((C18565) abstractC8036).f24265 = enumC8869;
        } else if (i == 9) {
            ((C12598) abstractC8036).f40438 = enumC8869;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC8036);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28334(AbstractC22664 abstractC22664, AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 1) {
            ((C24533) abstractC8036).f79553 = abstractC22664;
            return;
        }
        if (i == 2) {
            ((C18565) abstractC8036).f60324 = abstractC22664;
        } else if (i == 9) {
            ((C12598) abstractC8036).f40440 = abstractC22664;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC8036);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28336(AbstractC22295 abstractC22295) {
        int i = C21682.f69208[abstractC22295.mo2285().ordinal()];
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
    public static boolean m28335(AbstractC8036 abstractC8036, C15252 c15252) {
        if (abstractC8036 != null) {
            int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
            if (i == 4) {
                AbstractC19728 abstractC19728 = ((C5887) abstractC8036).f20169;
                if (abstractC19728 != c15252.f49836 && abstractC19728 != c15252.f49851) {
                    EnumC13603 enumC13603 = m28352(abstractC8036).f38066;
                    return enumC13603 == EnumC13603.f43213 || enumC13603 == EnumC13603.f43219;
                }
            } else {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            return m28335(((C16875) abstractC8036).f55198, c15252);
                        }
                        if (i != 27) {
                        }
                    }
                    return true;
                }
                EnumC13603 enumC13604 = m28352(abstractC8036).f38066;
                if ((enumC13604 == EnumC13603.f43213 || enumC13604 == EnumC13603.f43219) && m28335(((C23041) abstractC8036).f74776, c15252)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m28351(AbstractC8036 abstractC8036) {
        return abstractC8036.m21911(EnumC21461.f68484) && ((C23787) abstractC8036).f77042 == EnumC21172.BOT;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m28346(AbstractC8036 abstractC8036) {
        if (abstractC8036.m21911(EnumC21461.f68492)) {
            C4197 c4197 = (C4197) abstractC8036;
            if (c4197.f15344.m35550()) {
                return ((AbstractC19969) c4197.f15344.f48335).f26658;
            }
        }
        return abstractC8036.f26658;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m28358(AbstractC8036 abstractC8036) {
        int i;
        int i2;
        int i3;
        if (abstractC8036.m21911(EnumC21461.f68492) && (i3 = ((C4197) abstractC8036).f15343) != -1) {
            return i3;
        }
        if (abstractC8036.m21911(EnumC21461.f68511)) {
            return m28358(((C5799) abstractC8036).f19918);
        }
        if (abstractC8036.m21911(EnumC21461.f68456)) {
            C11764 c11764 = (C11764) abstractC8036;
            C4197 c4197 = c11764.f38024;
            if (c4197 == null) {
                c4197 = c11764.f38025.m35550() ? ((C0468) c11764.f38025.last()).f2079 : c11764.f38022;
            }
            return m28358(c4197);
        }
        if (!abstractC8036.m21911(EnumC21461.f68544) || (i2 = ((C15493) abstractC8036).f50424) == -1) {
            return (!abstractC8036.m21911(EnumC21461.f68531) || (i = ((C13256) abstractC8036).f42354) == -1) ? abstractC8036.f26658 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m28342(AbstractC8036 abstractC8036) {
        if (abstractC8036 == null) {
            return -1;
        }
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 1) {
            return m28342(((C24533) abstractC8036).f79554);
        }
        if (i == 2) {
            AbstractC22295 abstractC22295 = ((C18565) abstractC8036).f60321;
            if (abstractC22295 != null) {
                return m28342(abstractC22295);
            }
        } else {
            if (i == 5) {
                return m28342(((C23041) abstractC8036).f74776);
            }
            if (i == 6) {
                return m28342(((C25191) abstractC8036).f81425);
            }
            if (i == 7) {
                C16875 c16875 = (C16875) abstractC8036;
                if (c16875.f55197.m35550()) {
                    if (c16875.f55198.m21911(EnumC21461.f68553) || c16875.f55198.m21911(EnumC21461.f68485)) {
                        return m28342(c16875.f55198);
                    }
                    return m28342((AbstractC8036) c16875.f55197.f48335);
                }
                return m28342(c16875.f55198);
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
                        return m28342(((AbstractC19311) abstractC8036).mo11610(EnumC8124.LEFT));
                    case 14:
                        return m28342(((C20605) abstractC8036).f66030);
                    case 26:
                        C14769 c14769 = ((C13891) abstractC8036).f44048;
                        if (c14769 != null && c14769.m35550()) {
                            return m28342((AbstractC8036) c14769.f48335);
                        }
                        break;
                    case 27:
                        return m28342(((C23589) abstractC8036).f76594);
                    case 28:
                        C14835 c14835 = (C14835) abstractC8036;
                        C4395 c4395 = c14835.f48525;
                        return c4395.f15824.isEmpty() ? c14835.f26658 : ((C17621) c4395.f15824.f48335).f26658;
                    case 29:
                        C10360 c10360 = (C10360) abstractC8036;
                        return c10360.f32979.isEmpty() ? c10360.f26658 : ((C17621) c10360.f32979.f48335).f26658;
                    case 49:
                        int i2 = ((C7926) abstractC8036).f26341.f26658;
                        if (i2 != -1) {
                            return i2;
                        }
                        break;
                    case 50:
                        return m28342(((C10162) abstractC8036).f32546);
                    case 51:
                        return m28342(((C11106) abstractC8036).f35018);
                    case 52:
                        return m28342(((C16129) abstractC8036).f52413);
                    case 53:
                        C6633 c6633 = (C6633) abstractC8036;
                        int i3 = c6633.f22144.f26658;
                        if (i3 != -1) {
                            return i3;
                        }
                        if (c6633.f22154.m35550()) {
                            return m28342((AbstractC8036) c6633.f22154.f48335);
                        }
                        AbstractC22295 abstractC22296 = c6633.f22147;
                        return abstractC22296 == null ? c6633.f26658 : m28342(abstractC22296);
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        return m28342(((C25279) abstractC8036).f81646);
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        return m28342(((C24335) abstractC8036).f78930);
                    case 56:
                        return m28342(((C13344) abstractC8036).f42553);
                }
            } else {
                C12510 c12510 = (C12510) abstractC8036;
                int i4 = c12510.f40165;
                if (i4 != -1) {
                    return i4;
                }
                int i5 = c12510.f40170.f26658;
                if (i5 != -1) {
                    return i5;
                }
                AbstractC22295 abstractC22297 = c12510.f40166;
                if (abstractC22297 == null || abstractC22297.f26658 == -1) {
                    return c12510.f26658;
                }
                return m28342(abstractC22297);
            }
        }
        return abstractC8036.f26658;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28320(AbstractC8036 abstractC8036, InterfaceC1960 interfaceC1960) {
        if (abstractC8036 != null) {
            if (interfaceC1960 == null) {
                return m28358(abstractC8036);
            }
            int iMo6743 = interfaceC1960.mo6743(abstractC8036);
            if (iMo6743 != -1) {
                return iMo6743;
            }
            int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
            if (i == 7) {
                return m28320(((C16875) abstractC8036).f55198, interfaceC1960);
            }
            if (i == 50) {
                return m28320(((C10162) abstractC8036).f32545, interfaceC1960);
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
                            C14769 c14769 = ((C13891) abstractC8036).f44048;
                            if (c14769 != null && c14769.m35550()) {
                                return m28320((AbstractC8036) c14769.last(), interfaceC1960);
                            }
                            break;
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 56:
                                            return m28320(((C13344) abstractC8036).f42552, interfaceC1960);
                                        case 61:
                                            return m28320((AbstractC8036) ((C21351) abstractC8036).f68009.last(), interfaceC1960);
                                        case 62:
                                            return m28320(((C0468) abstractC8036).f2079, interfaceC1960);
                                        case 63:
                                            return m28320(((C20057) abstractC8036).f64456, interfaceC1960);
                                        case 64:
                                            return m28320(((C7180) abstractC8036).f23709, interfaceC1960);
                                        case 65:
                                            C2158 c2158 = (C2158) abstractC8036;
                                            AbstractC19969 abstractC19969 = c2158.f7116;
                                            if (abstractC19969 == null) {
                                                return m28320(c2158.f7115, interfaceC1960);
                                            }
                                            return m28320(abstractC19969, interfaceC1960);
                                        case 66:
                                            return m28320(((C17073) abstractC8036).f55742, interfaceC1960);
                                        case 67:
                                            return m28320((AbstractC8036) ((C4395) abstractC8036).f15824.last(), interfaceC1960);
                                        case 68:
                                            return m28320(((C5799) abstractC8036).f19918, interfaceC1960);
                                        case 69:
                                            return m28320((AbstractC8036) ((C19113) abstractC8036).f61857.last(), interfaceC1960);
                                        case 70:
                                            C11764 c11764 = (C11764) abstractC8036;
                                            C4197 c4197 = c11764.f38024;
                                            if (c4197 != null) {
                                                return m28320(c4197, interfaceC1960);
                                            }
                                            if (!c11764.f38025.isEmpty()) {
                                                return m28320((AbstractC8036) c11764.f38025.last(), interfaceC1960);
                                            }
                                            return m28320(c11764.f38022, interfaceC1960);
                                        case 71:
                                            return m28320(((C24445) abstractC8036).f79357, interfaceC1960);
                                        case 72:
                                            return m28320(((C16985) abstractC8036).f55515, interfaceC1960);
                                        case 73:
                                            return m28320(((C6545) abstractC8036).f21978, interfaceC1960);
                                        case 74:
                                            return m28320(((C9614) abstractC8036).f31095, interfaceC1960);
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
                                    return m28320(((AbstractC19311) abstractC8036).mo11610(EnumC8124.RIGHT), interfaceC1960);
                            }
                    }
                }
                return m28320(((AbstractC19311) abstractC8036).mo11610(EnumC8124.RIGHT), interfaceC1960);
            }
            return m28320(((C25279) abstractC8036).f81647, interfaceC1960);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5075 m28340(AbstractC8036 abstractC8036) {
        return new C14001(abstractC8036, m28358(abstractC8036));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28321(AbstractC8036 abstractC8036, EnumC5274 enumC5274) {
        if (abstractC8036.m21911(EnumC21461.f68456)) {
            C11764 c11764 = (C11764) abstractC8036;
            C11972.m30021(c11764.f38024);
            return enumC5274.m15862(c11764.f38024);
        }
        if (abstractC8036.m21911(EnumC21461.f68511)) {
            return m28358(((C5799) abstractC8036).f19918);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8036 m28325(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036, boolean z) {
        C4528 c4528 = new C4528(abstractC11781);
        abstractC8036.mo2284(c4528);
        AbstractC8036 abstractC8037 = c4528.f33389;
        if (abstractC8037 == null && z) {
            return null;
        }
        return abstractC8037 != null ? abstractC8037 : abstractC8036;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8036 m28324(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036) {
        C10493 c10493 = new C10493(abstractC11781);
        abstractC8036.mo2284(c10493);
        return c10493.f33389;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19969 m28330(C17073 c17073) {
        AbstractC19969 abstractC19969 = c17073;
        do {
            abstractC19969 = ((C17073) abstractC19969).f55742;
        } while (abstractC19969.m21911(EnumC21461.f68490));
        int i = C21682.f69208[abstractC19969.mo2285().ordinal()];
        return (i == 63 || i == 64 || i == 73 || i == 75 || i == 76) ? abstractC19969 : c17073;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22295 m28353(AbstractC22295 abstractC22295) {
        while (abstractC22295.m21911(EnumC21461.f68475)) {
            abstractC22295 = ((C1412) abstractC22295).f4986;
        }
        return abstractC22295;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC8036 m28345(AbstractC8036 abstractC8036) {
        return abstractC8036.m21911(EnumC21461.f68475) ? m28353((AbstractC22295) abstractC8036) : abstractC8036;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m28328(C14769 c14769) {
        C18499 c18499 = new C18499();
        while (c14769.m35550()) {
            c18499.m43089(((AbstractC8036) c14769.f48335).f26659);
            c14769 = c14769.f48336;
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC19728 m28319(AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 4) {
            return ((C5887) abstractC8036).f20169;
        }
        if (i == 5) {
            return ((C23041) abstractC8036).f74774;
        }
        if (i != 6) {
            return null;
        }
        return m28319(((C25191) abstractC8036).f81425);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC19728 m28338(AbstractC8036 abstractC8036) {
        AbstractC19728 abstractC19728M28338;
        AbstractC8036 abstractC8036M28345 = m28345(abstractC8036);
        int i = C21682.f69208[abstractC8036M28345.mo2285().ordinal()];
        if (i == 4) {
            return ((C5887) abstractC8036M28345).f20169;
        }
        if (i == 5 && (abstractC19728M28338 = m28338(((C23041) abstractC8036M28345).f74776)) != null) {
            return abstractC19728M28338.m45428('.', m28319(abstractC8036M28345));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static AbstractC11781 m28352(AbstractC8036 abstractC8036) {
        AbstractC8036 abstractC8036M28345 = m28345(abstractC8036);
        int i = C21682.f69208[abstractC8036M28345.mo2285().ordinal()];
        if (i == 4) {
            return ((C5887) abstractC8036M28345).f20170;
        }
        if (i == 5) {
            return ((C23041) abstractC8036M28345).f74775;
        }
        if (i == 6) {
            return m28352(((C25191) abstractC8036M28345).f81425);
        }
        if (i == 7) {
            return m28352(((C16875) abstractC8036M28345).f55198);
        }
        if (i != 9) {
            return null;
        }
        return ((C12598) abstractC8036M28345).f40439;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4395 m28317(AbstractC8036 abstractC8036) {
        AbstractC8036 abstractC8036M28345 = m28345(abstractC8036);
        int i = C21682.f69208[abstractC8036M28345.mo2285().ordinal()];
        if (i == 8) {
            return ((C12510) abstractC8036M28345).f40170;
        }
        if (i == 28) {
            return ((C14835) abstractC8036M28345).f48525;
        }
        if (i == 49) {
            return ((C7926) abstractC8036M28345).f26341;
        }
        if (i != 53) {
            return null;
        }
        return ((C6633) abstractC8036M28345).f22144;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28356(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036) {
        AbstractC8036 abstractC8036M28345 = m28345(abstractC8036);
        int i = C21682.f69208[abstractC8036M28345.mo2285().ordinal()];
        if (i == 4) {
            ((C5887) abstractC8036M28345).f20170 = abstractC11781;
        } else {
            if (i != 5) {
                return;
            }
            ((C23041) abstractC8036M28345).f74775 = abstractC11781;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static long m28344(AbstractC8036 abstractC8036) {
        int i = C21682.f69208[abstractC8036.mo2285().ordinal()];
        if (i == 8) {
            return ((C12510) abstractC8036).f40170.f15825;
        }
        if (i == 49) {
            return ((C7926) abstractC8036).f26341.f15825;
        }
        if (i == 53) {
            return ((C6633) abstractC8036).f22144.f15825;
        }
        if (i != 80) {
            return 0L;
        }
        return ((C4197) abstractC8036).f15345;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28322(EnumC21461 enumC21461) {
        int i = C21682.f69208[enumC21461.ordinal()];
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC22621 m28355(EnumC21461 enumC21461) {
        int i = C21682.f69208[enumC21461.ordinal()];
        if (i == 77) {
            return EnumC22621.ANNOTATION;
        }
        if (i != 78) {
            switch (i) {
                case 10:
                    return EnumC22621.PREFIX_INCREMENT;
                case 11:
                    return EnumC22621.PREFIX_DECREMENT;
                case 12:
                    return EnumC22621.POSTFIX_INCREMENT;
                case 13:
                    return EnumC22621.POSTFIX_DECREMENT;
                default:
                    switch (i) {
                        case 15:
                            return EnumC22621.OR_ASSIGNMENT;
                        case 16:
                            return EnumC22621.XOR_ASSIGNMENT;
                        case 17:
                            return EnumC22621.AND_ASSIGNMENT;
                        case 18:
                            return EnumC22621.LEFT_SHIFT_ASSIGNMENT;
                        case 19:
                            return EnumC22621.RIGHT_SHIFT_ASSIGNMENT;
                        case 20:
                            return EnumC22621.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT;
                        case 21:
                            return EnumC22621.PLUS_ASSIGNMENT;
                        case 22:
                            return EnumC22621.MINUS_ASSIGNMENT;
                        case 23:
                            return EnumC22621.MULTIPLY_ASSIGNMENT;
                        case 24:
                            return EnumC22621.DIVIDE_ASSIGNMENT;
                        case 25:
                            return EnumC22621.REMAINDER_ASSIGNMENT;
                        default:
                            switch (i) {
                                case 30:
                                    return EnumC22621.CONDITIONAL_OR;
                                case 31:
                                    return EnumC22621.CONDITIONAL_AND;
                                case 32:
                                    return EnumC22621.OR;
                                case 33:
                                    return EnumC22621.XOR;
                                case 34:
                                    return EnumC22621.AND;
                                case 35:
                                    return EnumC22621.EQUAL_TO;
                                case 36:
                                    return EnumC22621.NOT_EQUAL_TO;
                                case 37:
                                    return EnumC22621.LESS_THAN;
                                case 38:
                                    return EnumC22621.GREATER_THAN;
                                case 39:
                                    return EnumC22621.LESS_THAN_EQUAL;
                                case 40:
                                    return EnumC22621.GREATER_THAN_EQUAL;
                                case 41:
                                    return EnumC22621.LEFT_SHIFT;
                                case 42:
                                    return EnumC22621.RIGHT_SHIFT;
                                case 43:
                                    return EnumC22621.UNSIGNED_RIGHT_SHIFT;
                                case 44:
                                    return EnumC22621.PLUS;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    return EnumC22621.MINUS;
                                case 46:
                                    return EnumC22621.MULTIPLY;
                                case 47:
                                    return EnumC22621.DIVIDE;
                                case 48:
                                    return EnumC22621.REMAINDER;
                                default:
                                    switch (i) {
                                        case 57:
                                            return EnumC22621.UNARY_PLUS;
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            return EnumC22621.UNARY_MINUS;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                            return EnumC22621.LOGICAL_COMPLEMENT;
                                        case 60:
                                            return EnumC22621.BITWISE_COMPLEMENT;
                                        default:
                                            switch (i) {
                                                case 81:
                                                    return EnumC22621.OTHER;
                                                case 82:
                                                    return EnumC22621.EXPORTS;
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                    return EnumC22621.OPENS;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
        return EnumC22621.TYPE_ANNOTATION;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22295 m28341(AbstractC22295 abstractC22295) {
        int i = C21682.f69208[abstractC22295.mo2285().ordinal()];
        if (i == 4 || i == 5 || i == 6) {
            return abstractC22295;
        }
        if (i == 7) {
            return ((C16875) abstractC22295).f55198;
        }
        if (i == 26 || i == 27 || i == 71 || i == 79 || i == 84) {
            return abstractC22295;
        }
        throw new AssertionError("Unexpected type tree: " + abstractC22295);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8036 m28323(AbstractC8036 abstractC8036, boolean z) {
        AbstractC8036 abstractC8037;
        int i;
        while (true) {
            abstractC8037 = null;
            while (true) {
                i = C21682.f69208[abstractC8036.mo2285().ordinal()];
                if (i != 7) {
                    break;
                }
                abstractC8037 = abstractC8036;
                abstractC8036 = ((C16875) abstractC8036).f55198;
            }
            if (i == 27) {
                abstractC8036 = ((C23589) abstractC8036).f76594;
            } else {
                if (i != 71) {
                    break;
                }
                abstractC8036 = ((C24445) abstractC8036).f79357;
            }
        }
        return (z || abstractC8037 == null) ? abstractC8036 : abstractC8037;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m28357(AbstractC8036 abstractC8036) {
        C1545 c1545 = new C1545();
        c1545.f5346 = false;
        c1545.mo5474(abstractC8036);
        return c1545.f5346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28337(AbstractC22295 abstractC22295, C14769 c14769) {
        return abstractC22295.f26659.f73596.f38066 == EnumC13603.f43208 && C1170.stream(c14769).flatMap(new C15033(7)).allMatch(new C2471(2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22428 m28354(AbstractC2903 abstractC2903) {
        int i = C21682.f69208[abstractC2903.mo2285().ordinal()];
        boolean z = true;
        if (i == 55) {
            return new C22428(((C24335) abstractC2903).f26659, true);
        }
        if (i != 56) {
            if (i == 74) {
                return m28354(((C9614) abstractC2903).f31095);
            }
            throw new AssertionError();
        }
        C13344 c13344 = (C13344) abstractC2903;
        C22428 c22428M28354 = m28354(c13344.f42553);
        boolean zM50573 = c22428M28354.m50573();
        if (c13344.f42552.f26659.m51067(EnumC21172.BOOLEAN) && zM50573) {
            Object objMo39105 = c13344.f42552.f26659.mo39105();
            if (objMo39105 == null || ((Integer) objMo39105).intValue() != 1) {
                z = false;
            }
        } else {
            z = zM50573;
        }
        return new C22428(c22428M28354.m50572(), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24335 m28332(AbstractC2903 abstractC2903) {
        int i = C21682.f69208[abstractC2903.mo2285().ordinal()];
        if (i == 55) {
            return (C24335) abstractC2903;
        }
        if (i == 56) {
            return m28332(((C13344) abstractC2903).f42553);
        }
        if (i == 74) {
            return m28332(((C9614) abstractC2903).f31095);
        }
        throw new AssertionError();
    }
}
