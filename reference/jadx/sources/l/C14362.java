package l;

import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8GX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14362 implements InterfaceC0249 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f47094;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f47095;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14362 m34600(int i, C2460 c2460) {
        InterfaceC0249 c1660;
        String str;
        String str2;
        C4793 c4793 = new C4793();
        int iM7509 = c2460.m7509();
        int iM27156 = -2;
        while (c2460.m7503() > 8) {
            int iM7502 = c2460.m7502();
            int iM7500 = c2460.m7500() + c2460.m7502();
            c2460.m7501(iM7500);
            if (iM7502 != 1414744396) {
                C1660 c1661 = null;
                switch (iM7502) {
                    case 1718776947:
                        if (iM27156 != 2) {
                            if (iM27156 == 1) {
                                int iM7528 = c2460.m7528();
                                if (iM7528 == 1) {
                                    str = "audio/raw";
                                } else if (iM7528 == 85) {
                                    str = "audio/mpeg";
                                } else if (iM7528 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM7528 != 8192) {
                                    str = iM7528 != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM7529 = c2460.m7528();
                                    int iM7503 = c2460.m7502();
                                    c2460.m7535(6);
                                    int iM75210 = c2460.m7528();
                                    String str3 = C17983.f57504;
                                    int iM41816 = C17983.m41816(iM75210, ByteOrder.LITTLE_ENDIAN);
                                    int iM75211 = c2460.m7503() > 0 ? c2460.m7528() : 0;
                                    C10471 c10471 = new C10471();
                                    c10471.m26533(str);
                                    c10471.m26494(iM7529);
                                    c10471.m26511(iM7503);
                                    if (str.equals("audio/raw") && iM41816 != 0) {
                                        c10471.m26512(iM41816);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iM75211 > 0) {
                                        byte[] bArr = new byte[iM75211];
                                        c2460.m7507(0, iM75211, bArr);
                                        c10471.m26503((List) AbstractC22433.of((Object) bArr));
                                    }
                                    c1660 = new C1660(c10471.m26497());
                                } else {
                                    C7309.m19506(iM7528, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                C0303.m1848("Ignoring strf box for unsupported track type: " + C17983.m41864(iM27156));
                            }
                            break;
                        } else {
                            c2460.m7535(4);
                            int iM7504 = c2460.m7502();
                            int iM7505 = c2460.m7502();
                            c2460.m7535(4);
                            int iM7506 = c2460.m7502();
                            switch (iM7506) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                C7309.m19506(iM7506, "Ignoring track with unsupported compression ");
                            } else {
                                C10471 c10472 = new C10471();
                                c10472.m26525(iM7504);
                                c10472.m26534(iM7505);
                                c10472.m26533(str2);
                                c1661 = new C1660(c10472.m26497());
                            }
                        }
                        c1660 = c1661;
                        break;
                    case 1751742049:
                        c1660 = C5894.m16132(c2460);
                        break;
                    case 1752331379:
                        c1660 = C10834.m27155(c2460);
                        break;
                    case 1852994675:
                        c1660 = C9423.m24181(c2460);
                        break;
                    default:
                        c1660 = c1661;
                        break;
                }
            } else {
                c1660 = m34600(c2460.m7502(), c2460);
            }
            if (c1660 != null) {
                if (c1660.getType() == 1752331379) {
                    iM27156 = ((C10834) c1660).m27156();
                }
                c4793.m52163(c1660);
            }
            c2460.m7510(iM7500);
            c2460.m7501(iM7509);
        }
        return new C14362(i, c4793.m13309());
    }

    public C14362(int i, AbstractC22433 abstractC22433) {
        this.f47095 = i;
        this.f47094 = abstractC22433;
    }

    @Override // l.InterfaceC0249
    public final int getType() {
        return this.f47095;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0249 m34601(Class cls) {
        AbstractC16706 abstractC16706ListIterator = this.f47094.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            InterfaceC0249 interfaceC0249 = (InterfaceC0249) abstractC16706ListIterator.next();
            if (interfaceC0249.getClass() == cls) {
                return interfaceC0249;
            }
        }
        return null;
    }
}
