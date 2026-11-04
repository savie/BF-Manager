package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8GX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20532 implements InterfaceC11581 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f65750;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f65751;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20532 m47084(int i, C21287 c21287) {
        InterfaceC11581 c12327;
        String str;
        String str2;
        C22811 c22811 = new C22811();
        int iM48509 = c21287.m48509();
        int iM52698 = -2;
        while (c21287.m48486() > 8) {
            int iM48483 = c21287.m48483();
            int iM48516 = c21287.m48516() + c21287.m48483();
            c21287.m48517(iM48516);
            if (iM48483 != 1414744396) {
                C12327 c12328 = null;
                switch (iM48483) {
                    case 1718776947:
                        if (iM52698 != 2) {
                            if (iM52698 == 1) {
                                int iM48504 = c21287.m48504();
                                if (iM48504 == 1) {
                                    str = "audio/raw";
                                } else if (iM48504 == 85) {
                                    str = "audio/mpeg";
                                } else if (iM48504 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM48504 != 8192) {
                                    str = iM48504 != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM48505 = c21287.m48504();
                                    int iM48484 = c21287.m48483();
                                    c21287.m48503(6);
                                    int iM48506 = c21287.m48504();
                                    String str3 = C7116.f23455;
                                    int iM19463 = C7116.m19463(iM48506, ByteOrder.LITTLE_ENDIAN);
                                    int iM48507 = c21287.m48486() > 0 ? c21287.m48504() : 0;
                                    C20124 c20124 = new C20124();
                                    c20124.m46315(str);
                                    c20124.m46329(iM48505);
                                    c20124.m46332(iM48484);
                                    if (str.equals("audio/raw") && iM19463 != 0) {
                                        c20124.m46293(iM19463);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iM48507 > 0) {
                                        byte[] bArr = new byte[iM48507];
                                        c21287.m48490(0, iM48507, bArr);
                                        c20124.m46301((List) AbstractC1928.of((Object) bArr));
                                    }
                                    c12327 = new C12327(c20124.m46295());
                                } else {
                                    j$$ExternalSyntheticOutline0.m(iM48504, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                C1896.m6517("Ignoring strf box for unsupported track type: " + C7116.m19500(iM52698));
                            }
                            break;
                        } else {
                            c21287.m48503(4);
                            int iM48485 = c21287.m48483();
                            int iM48486 = c21287.m48483();
                            c21287.m48503(4);
                            int iM48487 = c21287.m48483();
                            switch (iM48487) {
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
                                j$$ExternalSyntheticOutline0.m(iM48487, "Ignoring track with unsupported compression ");
                            } else {
                                C20124 c20125 = new C20124();
                                c20125.m46291(iM48485);
                                c20125.m46333(iM48486);
                                c20125.m46315(str2);
                                c12328 = new C12327(c20125.m46295());
                            }
                        }
                        c12327 = c12328;
                        break;
                    case 1751742049:
                        c12327 = C16056.m38212(c21287);
                        break;
                    case 1752331379:
                        c12327 = C23516.m52697(c21287);
                        break;
                    case 1852994675:
                        c12327 = C6362.m18076(c21287);
                        break;
                    default:
                        c12327 = c12328;
                        break;
                }
            } else {
                c12327 = m47084(c21287.m48483(), c21287);
            }
            if (c12327 != null) {
                if (c12327.getType() == 1752331379) {
                    iM52698 = ((C23516) c12327).m52698();
                }
                c22811.m19807(c12327);
            }
            c21287.m48510(iM48516);
            c21287.m48517(iM48509);
        }
        return new C20532(i, c22811.m51441());
    }

    public C20532(int i, AbstractC1928 abstractC1928) {
        this.f65751 = i;
        this.f65750 = abstractC1928;
    }

    @Override // l.InterfaceC11581
    public final int getType() {
        return this.f65751;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11581 m47085(Class cls) {
        AbstractC14956 abstractC14956ListIterator = this.f65750.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            InterfaceC11581 interfaceC11581 = (InterfaceC11581) abstractC14956ListIterator.next();
            if (interfaceC11581.getClass() == cls) {
                return interfaceC11581;
            }
        }
        return null;
    }
}
