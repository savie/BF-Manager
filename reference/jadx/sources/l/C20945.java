package l;

import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩷ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VR */
/* JADX INFO: loaded from: classes.dex */
public class C20945 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C12812 f68260;

    /* JADX INFO: renamed from: ۜۛ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f68261;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f68262;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f68263;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68264;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C17140 f68265;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f68266;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f68267;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f68268;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f68269;

    public native C20945(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m47098(StringBuilder sb, byte[] bArr, C6037 c6037, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m47108(C6037 c6037, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m47109(C6037 c6037, boolean z, AbstractC20745 abstractC20745);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public native void m47116(C6037 c6037, boolean z);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public native C1894 m47118();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47099(char c) {
        int i = 1003706685;
        int i2 = C10634.f36300;
        int i3 = C0050.f912;
        int iM45029 = C19806.m45029("᩻᩶") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-17095)) ^ (-1442532212);
        int i5 = 2038948885;
        while (true) {
            i = ((((i ^ i2) * 29453) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2083740922:
                case -1405868128:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20661) ^ 375366532;
                        i5 = -1519297041;
                    } else {
                        iM45029 = C19806.m45029("ᩴܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16411)) ^ 1785290178;
                        i5 = 1708518395;
                    }
                    break;
                case -1984635236:
                case 1757089288:
                    C1460.m5050();
                    C1461.m5080();
                    iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 20661) ^ 375366532;
                    i5 = -1519297041;
                    break;
                case -1984290000:
                case 1416767161:
                    return true;
                case -1946940652:
                case -872797023:
                    C3535.m10431();
                    if (C1066.f4915 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27411) ^ 1388297718;
                        i5 = -1616452863;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27653)) ^ (-1891504767);
                        i5 = -1912545232;
                    }
                    break;
                case -1694342249:
                case 178997080:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("ۛܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21379) ^ 143590796;
                        i5 = -536484927;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗ᩸")) * 19;
                        i4 = ((iM45029 ^ i2) * (-12637)) ^ (-2069749002);
                        i5 = -1658208199;
                    }
                    break;
                case -1691025845:
                case -74954065:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۢ")) * (-103);
                        i4 = ((iM45029 ^ i3) * 29971) ^ (-206265340);
                        i5 = -290667031;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֫ۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-20053)) ^ 14206969;
                        i5 = -893313111;
                    }
                    break;
                case -1631354756:
                case 1447936588:
                    if (c >= 'A') {
                        iM45029 = ThreadFactoryC3888.m11306("۫ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10361)) ^ (-626782259);
                        i5 = -89115710;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩻") + i3) * (-29);
                        i4 = ((iM45029 ^ i2) * (-28271)) ^ 305083646;
                        i5 = 977060954;
                    }
                    break;
                case -1406164506:
                case 1010737294:
                    C2477.m7593();
                    if (!C3743.f13569) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۢ")) * (-103);
                        i4 = ((iM45029 ^ i3) * 29971) ^ (-206265340);
                        i5 = -290667031;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27411) ^ 1388297718;
                        i5 = -1616452863;
                    }
                    break;
                case -1305332770:
                case -623760209:
                    if (C0629.m2907()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8231) ^ (-668160147);
                        i5 = -1759000919;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20661) ^ 375366532;
                        i5 = -1519297041;
                    }
                    break;
                case -1037393316:
                case -897574400:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("ۧۜ") + i3) * (-123);
                        i4 = ((iM45029 ^ i2) * (-5841)) ^ (-1917047287);
                        i5 = 262601616;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20661) ^ 375366532;
                        i5 = -1519297041;
                    }
                    break;
                case -857173313:
                case 1734700601:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ۛܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21379) ^ 143590796;
                        i5 = -536484927;
                    } else {
                        iM45029 = C19806.m45029("᩻᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3909) ^ (-1593312171);
                        i5 = -1246956439;
                    }
                    break;
                case -848049702:
                case 900608685:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27653)) ^ (-1891504767);
                        i5 = -1912545232;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5087) ^ (-2028249070);
                        i5 = 337437069;
                    }
                    break;
                case -692783105:
                case 354407168:
                    if (c <= 'z') {
                        iM45029 = C19806.m45029("ܰ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-797)) ^ 905797186;
                        i5 = 918436650;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۧ") ^ i3) * 43;
                        i4 = ((iM45029 ^ i2) * (-11923)) ^ 1782337389;
                        i5 = -603622393;
                    }
                    break;
                case -628653373:
                case 1602775705:
                    if (C3286.f12186) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۢ")) * (-103);
                        i4 = ((iM45029 ^ i3) * 29971) ^ (-206265340);
                        i5 = -290667031;
                    } else {
                        iM45029 = C19806.m45029("֨۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4611)) ^ (-193484742);
                        i5 = -806974303;
                    }
                    break;
                case -376922689:
                case 1697467528:
                    if (c >= 'a') {
                        iM45029 = (C19806.m45029("ܳۚ") + i3) * (-31);
                        i4 = ((iM45029 ^ i2) * 23637) ^ (-41330966);
                        i5 = 269448533;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۧ") ^ i3) * 43;
                        i4 = ((iM45029 ^ i2) * (-11923)) ^ 1782337389;
                        i5 = -603622393;
                    }
                    break;
                case -240211862:
                case 1479882613:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20661) ^ 375366532;
                        i5 = -1519297041;
                    } else {
                        iM45029 = (C19806.m45029("᩷ܿ") ^ i2) * 7;
                        i4 = ((iM45029 ^ i3) * 24169) ^ 770493948;
                        i5 = -474876778;
                    }
                    break;
                case -151262496:
                case 547549060:
                    C1419.m4973();
                    if (!C0962.f3784) {
                        iM45029 = (C19806.m45029("ۧۜ") + i3) * (-123);
                        i4 = ((iM45029 ^ i2) * (-5841)) ^ (-1917047287);
                        i5 = 262601616;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27653)) ^ (-1891504767);
                        i5 = -1912545232;
                    }
                    break;
                case 273804188:
                case 443980317:
                    C3535.m10431();
                    return false;
                case 324914731:
                case 673441512:
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("ۛܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21379) ^ 143590796;
                        i5 = -536484927;
                    } else {
                        iM45029 = C19806.m45029("᩵ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13159)) ^ 586232841;
                        i5 = 1496995449;
                    }
                    break;
                case 353629335:
                case 688437731:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27653)) ^ (-1891504767);
                        i5 = -1912545232;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫ᩳ")) * (-107);
                        i4 = ((iM45029 ^ i3) * 24221) ^ (-485800184);
                        i5 = -758678896;
                    }
                    break;
                case 387762507:
                case 1818104509:
                    if (c == '_') {
                        iM45029 = C19806.m45029("ܰ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-797)) ^ 905797186;
                        i5 = 918436650;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܽۨ")) * 59;
                        i4 = ((iM45029 ^ i3) * 20039) ^ (-467800601);
                        i5 = -1215178608;
                    }
                    break;
                case 492359701:
                case 805276306:
                    if (c <= '9') {
                        iM45029 = C19806.m45029("ܰ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-797)) ^ 905797186;
                        i5 = 918436650;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۙ") ^ i3) * (-91);
                        i4 = ((iM45029 ^ i2) * (-15257)) ^ (-1794489145);
                        i5 = -1162563370;
                    }
                    break;
                case 779076654:
                case 977172607:
                    if (c >= '0') {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27381) ^ 653459200;
                        i5 = -1862555014;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۙ") ^ i3) * (-91);
                        i4 = ((iM45029 ^ i2) * (-15257)) ^ (-1794489145);
                        i5 = -1162563370;
                    }
                    break;
                case 1169428994:
                case 1563779770:
                    if (c <= 'Z') {
                        iM45029 = C19806.m45029("ܰ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-797)) ^ 905797186;
                        i5 = 918436650;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩻") + i3) * (-29);
                        i4 = ((iM45029 ^ i2) * (-28271)) ^ 305083646;
                        i5 = 977060954;
                    }
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20945 m47103(byte[] bArr) throws IOException {
        int iM45029;
        int i;
        RuntimeException e = null;
        int i2 = -250678389;
        int i3 = C2477.f9839;
        int i4 = C2871.f10837;
        int iM450210 = (C19806.m45029("ۘ᩹") + i4) * (-87);
        int i5 = ((iM450210 ^ i3) * (-26633)) ^ (-374584504);
        int i6 = 545971617;
        while (true) {
            int i7 = iM450210 ^ i6;
            C20945 c20945 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 29429) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1862126629:
                    case 304290599:
                        return c20945;
                    case -1627289898:
                    case -242966347:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        if (C2788.m8472() == 0) {
                            iM45029 = (C19806.m45029("ۘܽ") ^ i4) * (-71);
                            i5 = ((iM45029 ^ i3) * (-10035)) ^ 2033350276;
                            i = 1542735709;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ܶܺ")) * (-117);
                            i5 = ((iM45029 ^ i4) * (-15969)) ^ 1434679947;
                            i = -1341149772;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1534262151:
                    case 267720234:
                        if (RunnableC1564.m5345()) {
                            iM45029 = C19806.m45029("ܿۧ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-31155)) ^ 1218313985;
                            i = -2118827565;
                        } else {
                            iM45029 = (C19806.m45029("ۘܽ") ^ i4) * (-71);
                            i5 = ((iM45029 ^ i3) * (-10035)) ^ 2033350276;
                            i = 1542735709;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 80496444:
                    case 1020123451:
                        C3743.m10966();
                        return null;
                    case 168747386:
                    case 2017122063:
                        C3286.m9798();
                        C2788.m8472();
                        iM45029 = (C19806.m45029("ۘܽ") ^ i4) * (-71);
                        i5 = ((iM45029 ^ i3) * (-10035)) ^ 2033350276;
                        i = 1542735709;
                        i7 = iM45029 ^ i;
                        break;
                    case 278021140:
                    case 754082449:
                        try {
                            c20945 = new C20945(bArr);
                            iM45029 = C19806.m45029("ᩳۖ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-24645)) ^ 856434279;
                            i = -1596968088;
                            i7 = iM45029 ^ i;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM450210 = ThreadFactoryC3888.m11306("۟᩷") ^ i3;
                            i5 = ((iM450210 ^ i4) * (-1853)) ^ 583829483;
                            i6 = 1181343414;
                        }
                        break;
                    case 911750944:
                    case 1568523269:
                        if (CallableC1627.m5507() != 0) {
                            iM45029 = (C19806.m45029("ۘܽ") ^ i4) * (-71);
                            i5 = ((iM45029 ^ i3) * (-10035)) ^ 2033350276;
                            i = 1542735709;
                        } else if (C1148.f5161 <= 0) {
                            iM45029 = C19806.m45029("ܿۧ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-31155)) ^ 1218313985;
                            i = -2118827565;
                        } else if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ܶܺ")) * (-117);
                            i5 = ((iM45029 ^ i4) * (-15969)) ^ 1434679947;
                            i = -1341149772;
                        } else if (RunnableC0195.f1321 < 0) {
                            if (C0671.f2816 == 0) {
                                if (ThreadFactoryC3888.f14547 <= 0 || C0050.f912 <= 0) {
                                    iM45029 = C19806.m45029("ܿۧ") ^ i3;
                                    i5 = ((iM45029 ^ i4) * (-31155)) ^ 1218313985;
                                    i = -2118827565;
                                } else if (C2332.f8260) {
                                    if (C3535.f13026 <= 0) {
                                        iM45029 = C19806.m45029("۟ۤ") ^ i4;
                                        i5 = ((iM45029 ^ i3) * (-31397)) ^ (-1219037778);
                                        i = -1123688637;
                                    } else if (C1875.f7103 < 0) {
                                        throw new IOException(e);
                                    }
                                }
                            }
                            iM45029 = (C19806.m45029("ۗ۟") + i4) * 31;
                            i5 = ((iM45029 ^ i3) * 26085) ^ (-665309937);
                            i = 570293262;
                        } else {
                            iM45029 = C19806.m45029("۟ۤ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-31397)) ^ (-1219037778);
                            i = -1123688637;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        if (C2642.f10294 > 0) {
                            iM45029 = C19806.m45029("ܿۧ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-31155)) ^ 1218313985;
                            i = -2118827565;
                        } else {
                            iM45029 = C19806.m45029("۟ۤ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-31397)) ^ (-1219037778);
                            i = -1123688637;
                        }
                        i7 = iM45029 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x039c A[PHI: r16 r18
      0x039c: PHI (r16v26 int) = (r16v8 int), (r16v10 int), (r16v27 int) binds: [B:108:0x039a, B:100:0x033c, B:37:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r18v22 byte[]) = (r18v5 byte[]), (r18v7 byte[]), (r18v23 byte[]) binds: [B:108:0x039a, B:100:0x033c, B:37:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x03d3 A[PHI: r16 r18
      0x03d3: PHI (r16v42 int) = (r16v7 int), (r16v43 int) binds: [B:112:0x03d1, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r18v38 byte[]) = (r18v4 byte[]), (r18v39 byte[]) binds: [B:112:0x03d1, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0409 A[PHI: r6 r16 r18
      0x0409: PHI (r6v3 char) = (r6v1 char), (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:116:0x0407, B:96:0x0319, B:17:0x006e, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r16v41 int) = (r16v6 int), (r16v11 int), (r16v36 int), (r16v43 int) binds: [B:116:0x0407, B:96:0x0319, B:17:0x006e, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r18v37 byte[]) = (r18v3 byte[]), (r18v8 byte[]), (r18v31 byte[]), (r18v39 byte[]) binds: [B:116:0x0407, B:96:0x0319, B:17:0x006e, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0444 A[PHI: r5 r7 r8 r16 r18
      0x0444: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]) binds: [B:120:0x0442, B:92:0x02f6] A[DONT_GENERATE, DONT_INLINE]
      0x0444: PHI (r7v2 short) = (r7v1 short), (r7v3 short) binds: [B:120:0x0442, B:92:0x02f6] A[DONT_GENERATE, DONT_INLINE]
      0x0444: PHI (r8v2 short) = (r8v1 short), (r8v3 short) binds: [B:120:0x0442, B:92:0x02f6] A[DONT_GENERATE, DONT_INLINE]
      0x0444: PHI (r16v12 int) = (r16v5 int), (r16v13 int) binds: [B:120:0x0442, B:92:0x02f6] A[DONT_GENERATE, DONT_INLINE]
      0x0444: PHI (r18v9 byte[]) = (r18v2 byte[]), (r18v10 byte[]) binds: [B:120:0x0442, B:92:0x02f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (l.C0817.f3443 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (l.C1189.f5284 <= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C20945 m47096(l.AbstractC20745 r24) {
        /*
            Method dump skipped, instruction units count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20945.m47096(l.᩷۠ۚ):l.᩷ܳ᩺");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20945 m47095(C1388 c1388) throws EOFException {
        long length = 0;
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        byte[] bArrM47105 = null;
        C20945 c20945M47103 = null;
        int i3 = 693872380;
        int i4 = RunnableC0195.f1321;
        int i5 = ThreadFactoryC3888.f14547;
        int iM45029 = (i5 - C19806.m45029("ۜ᩸")) * (-123);
        int i6 = ((iM45029 ^ i4) * (-11935)) ^ 16756530;
        int i7 = 1958060237;
        while (true) {
            i3 = ((((i3 ^ i4) * 32487) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2069739989:
                case -1589598591:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (i4 - C19806.m45029("֨ܽ")) * 35;
                        i6 = ((iM45029 ^ i5) * 28803) ^ 254817846;
                        i7 = 758347084;
                    } else {
                        iM45029 = C19806.m45029("ܳᩴ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 23337) ^ 34359217;
                        i7 = -1672280442;
                    }
                    break;
                case -1863729453:
                case 753754700:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 7311) ^ (-662214828);
                        i7 = -1630958600;
                    } else {
                        iM45029 = C19806.m45029("ۡ֡") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14409) ^ (-276846428);
                        i7 = 1592461695;
                    }
                    break;
                case -1647072528:
                case 1963782024:
                    RunnableC1895.m6170();
                    if (!C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 7311) ^ (-662214828);
                        i7 = -1630958600;
                    } else {
                        iM45029 = (C19806.m45029("۫᩻") + i4) * (-21);
                        i6 = ((iM45029 ^ i5) * 19487) ^ (-996677796);
                        i7 = 1603630053;
                    }
                    break;
                case -1597116828:
                case -24218614:
                    try {
                        c20945M47103 = m47103(bArrM47105);
                        iM45029 = (C19806.m45029("۟ۨ") ^ i5) * 99;
                        i6 = ((iM45029 ^ i4) * (-16969)) ^ 2001184351;
                        i7 = 1661655920;
                    } catch (Throwable unused) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i5) * (-127);
                        i6 = ((iM45029 ^ i4) * (-26933)) ^ (-2121952959);
                        i7 = -603528955;
                    }
                    break;
                case -1444073990:
                case 940967673:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-21457)) ^ (-1955842772);
                        i7 = 1387805232;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۤ") + i5) * 67;
                        i6 = ((iM45029 ^ i4) * 18121) ^ (-1372204357);
                        i7 = 212775812;
                    }
                    break;
                case -1401732440:
                case -1179474728:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-21457)) ^ (-1955842772);
                        i7 = 1387805232;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰܿ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i4) * (-26305)) ^ (-1516015329);
                        i7 = -1171522992;
                    }
                    break;
                case -1150805920:
                case -811113875:
                    if (length > 52428800) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-13171)) ^ (-627497213);
                        i7 = -1151520210;
                    } else {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 23665) ^ (-876619333);
                        i7 = -1494363547;
                    }
                    break;
                case -1149721806:
                case -314706062:
                    bArrM47105 = m47105(c1388);
                    iM45029 = C19806.m45029("ۙۖ") ^ i4;
                    i6 = ((iM45029 ^ i5) * (-24781)) ^ (-1410981703);
                    i7 = -1925325503;
                    break;
                case -928433383:
                case 128026915:
                    C3286.m9798();
                    return null;
                case -789261212:
                case -123352029:
                    RunnableC1895.m6170();
                    C1066.m4023();
                    iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i5;
                    i6 = ((iM45029 ^ i4) * 7311) ^ (-662214828);
                    i7 = -1630958600;
                    break;
                case -578569796:
                case 1287510774:
                    c1388.m4864(bArr, i2, i);
                    return m47103(bArr);
                case -324595900:
                case -244394330:
                    if (C0050.f912 > 0) {
                        iM45029 = (i4 - C19806.m45029("֨ܽ")) * 35;
                        i6 = ((iM45029 ^ i5) * 28803) ^ 254817846;
                        i7 = 758347084;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 7311) ^ (-662214828);
                        i7 = -1630958600;
                    }
                    break;
                case -322576569:
                case -46266932:
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("۫᩻") + i4) * (-21);
                        i6 = ((iM45029 ^ i5) * 19487) ^ (-996677796);
                        i7 = 1603630053;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۙ") ^ i5) * (-123);
                        i6 = ((iM45029 ^ i4) * 27473) ^ (-1250032189);
                        i7 = 33626417;
                    }
                    break;
                case -121866756:
                case 715562099:
                    c1388.seek(0L);
                    iM45029 = C19806.m45029("ᩳᩳ") ^ i4;
                    i6 = ((iM45029 ^ i5) * 23665) ^ (-876619333);
                    i7 = -1494363547;
                    break;
                case 87771734:
                case 1241275818:
                    i = (int) length;
                    bArr = new byte[i];
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("᩸۠") + i5) * 127;
                        i6 = ((iM45029 ^ i4) * (-14877)) ^ (-903626739);
                        i7 = -1443422436;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ֨") ^ i5;
                        i6 = ((iM45029 ^ i4) * 5989) ^ 1655205478;
                        i7 = 1131463915;
                    }
                    break;
                case 170537541:
                case 1017805964:
                    length = c1388.length();
                    if (C2788.m8472() != 0) {
                        iM45029 = (i4 - C19806.m45029("֨ܽ")) * 35;
                        i6 = ((iM45029 ^ i5) * 28803) ^ 254817846;
                        i7 = 758347084;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠۫") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-663)) ^ (-2118422250);
                        i7 = -759099356;
                    }
                    break;
                case 191002071:
                case 1911310820:
                    return c20945M47103;
                case 353610298:
                case 739360022:
                    i2 = 0;
                    if (C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-21457)) ^ (-1955842772);
                        i7 = 1387805232;
                    } else {
                        iM45029 = C19806.m45029("᩷ܳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30219) ^ (-1113758477);
                        i7 = 2119521395;
                    }
                    break;
                case 787009551:
                case 1326913800:
                    if (bArrM47105 != null) {
                        iM45029 = (C19806.m45029("ۗ֨") ^ i4) * 3;
                        i6 = ((iM45029 ^ i5) * (-8947)) ^ (-242427564);
                        i7 = 1270006210;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i5) * (-127);
                        i6 = ((iM45029 ^ i4) * (-26933)) ^ (-2121952959);
                        i7 = -603528955;
                    }
                    break;
                case 1065757044:
                case 2058709155:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-8593)) ^ (-588904628);
                        i7 = 171452383;
                    } else {
                        iM45029 = (C19806.m45029("᩸۠") + i5) * 127;
                        i6 = ((iM45029 ^ i4) * (-14877)) ^ (-903626739);
                        i7 = -1443422436;
                    }
                    break;
                case 1259348918:
                case 1438654586:
                    if (!C19806.f63586) {
                        iM45029 = (C19806.m45029("᩸۠") + i5) * 127;
                        i6 = ((iM45029 ^ i4) * (-14877)) ^ (-903626739);
                        i7 = -1443422436;
                    } else {
                        iM45029 = (C19806.m45029("۫᩻") + i4) * (-21);
                        i6 = ((iM45029 ^ i5) * 19487) ^ (-996677796);
                        i7 = 1603630053;
                    }
                    break;
                default:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("۫᩻") + i4) * (-21);
                        i6 = ((iM45029 ^ i5) * 19487) ^ (-996677796);
                        i7 = 1603630053;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗۨ")) * 93;
                        i6 = ((iM45029 ^ i5) * (-14315)) ^ (-94711162);
                        i7 = 673976370;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20945 m47094(InputStream inputStream) throws Throwable {
        int iM45029;
        int i;
        Throwable th = null;
        Object th2 = null;
        RuntimeException e = null;
        int i2 = 649886055;
        int i3 = C3535.f13026;
        int i4 = RunnableC1606.f6488;
        int iM450210 = (i4 - C19806.m45029("ۡᩴ")) * 35;
        int i5 = ((iM450210 ^ i3) * (-21465)) ^ (-305423748);
        int i6 = 1614715670;
        while (true) {
            int i7 = iM450210 ^ i6;
            C20945 c20945 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 13031) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2082898577:
                    case -874221900:
                        if (inputStream != null) {
                            iM45029 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i3;
                            i5 = ((iM45029 ^ i4) * 19147) ^ (-1097430100);
                            i = 1894993126;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۨ۫") ^ i4;
                            i5 = ((iM45029 ^ i3) * 23301) ^ 655460930;
                            i = -344864522;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -2058124247:
                    case 1265324565:
                        try {
                            C0216.m1577(inputStream);
                            iM45029 = (i4 - C19806.m45029("ۢ᩺")) * 83;
                            i5 = ((iM45029 ^ i3) * 9401) ^ (-1570958549);
                            i = -1523931359;
                        } catch (Throwable th3) {
                            th2 = th3;
                            iM45029 = (C19806.m45029("ۛۢ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM45029 ^ i3) * 18451) ^ (-2080063032);
                            i = -263745129;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1844778033:
                    case -1079904836:
                        C0629.m2907();
                        C2332.m7079();
                        return null;
                    case -1823246343:
                    case -520569751:
                        C3743.m10966();
                        C1668.m5583();
                        iM45029 = (i3 - C19806.m45029("۫ܿ")) * (-87);
                        i5 = ((iM45029 ^ i4) * 32383) ^ (-726264202);
                        i = -115604884;
                        i7 = iM45029 ^ i;
                        break;
                    case -1751729771:
                    case -1018807649:
                        if (C0817.m3399()) {
                            iM450210 = ThreadFactoryC3888.m11306("ۜۧ") ^ i4;
                            i5 = ((iM450210 ^ i3) * 20101) ^ (-855821827);
                            i6 = 1365043322;
                        }
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * (-83);
                        i5 = ((iM45029 ^ i3) * 21393) ^ (-1690956971);
                        i = -575187069;
                        i7 = iM45029 ^ i;
                        break;
                    case -1478098404:
                    case 1570338172:
                        if (CallableC1627.f6528) {
                            iM45029 = (i3 - C19806.m45029("۫ܿ")) * (-87);
                            i5 = ((iM45029 ^ i4) * 32383) ^ (-726264202);
                            i = -115604884;
                        } else {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * (-83);
                            i5 = ((iM45029 ^ i3) * 21393) ^ (-1690956971);
                            i = -575187069;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1436614375:
                    case 2077726485:
                        try {
                            if (C2642.f10294 > 0) {
                                if (C1668.f6641 < 0 && C0050.f912 > 0) {
                                    if (!C1977.m6356()) {
                                        if (AbstractC0464.m2313() != 0) {
                                            iM450210 = ThreadFactoryC3888.m11306("ۜۧ") ^ i4;
                                            i5 = ((iM450210 ^ i3) * 20101) ^ (-855821827);
                                            i6 = 1365043322;
                                        }
                                        if (C1461.f5957 > 0 && RunnableC1895.f7152) {
                                            if (C1398.f5802 > 0 && C3577.f13150 < 0) {
                                                if (C1148.m4232() > 0) {
                                                    c20945 = new C20945(C19431.m44470(inputStream, 0));
                                                    iM45029 = C19806.m45029("֫᩶") ^ i4;
                                                    i5 = ((iM45029 ^ i3) * (-29431)) ^ 639317911;
                                                    i = 1812881820;
                                                    i7 = iM45029 ^ i;
                                                } else {
                                                    iM450210 = ThreadFactoryC3888.m11306("۫ۗ") ^ i3;
                                                    i5 = ((iM450210 ^ i4) * 21983) ^ (-2124805601);
                                                    i6 = -931768122;
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    iM450210 = (C19806.m45029("ۙ᩷") ^ i3) * (-57);
                                    i5 = ((iM450210 ^ i4) * (-225)) ^ (-92810288);
                                    i6 = -1252555078;
                                }
                                break;
                                iM450210 = (ThreadFactoryC3888.m11306("ܽۗ") + i4) * (-13);
                                i5 = ((iM450210 ^ i3) * 19323) ^ 1664243863;
                                i6 = -337684895;
                            }
                            iM450210 = (ThreadFactoryC3888.m11306("۫ۡ") + i4) * (-3);
                            i5 = ((iM450210 ^ i3) * (-19939)) ^ 60237701;
                            i6 = 1844221450;
                        } catch (Throwable th4) {
                            th = th4;
                            iM450210 = (i3 - ThreadFactoryC3888.m11306("᩷۠")) * (-25);
                            i5 = ((iM450210 ^ i4) * (-31985)) ^ (-273574673);
                            i6 = -2120511632;
                        }
                        break;
                    case -1351404864:
                    case -136060592:
                        try {
                            C0629.m2911(th, th2);
                            iM45029 = (i4 - C19806.m45029("ۢ᩺")) * 83;
                            i5 = ((iM45029 ^ i3) * 9401) ^ (-1570958549);
                            i = -1523931359;
                        } catch (RuntimeException e2) {
                            e = e2;
                            iM45029 = (C19806.m45029("֡ۖ") + i3) * (-89);
                            i5 = ((iM45029 ^ i4) * (-13989)) ^ 1559221860;
                            i = -584820130;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1214475230:
                    case 2066422280:
                        C1875.m6086();
                        if (RunnableC3388.f12514 < 0) {
                            iM450210 = (C19806.m45029("ۙ᩷") ^ i3) * (-57);
                            i5 = ((iM450210 ^ i4) * (-225)) ^ (-92810288);
                            i6 = -1252555078;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("۫ۡ") + i4) * (-3);
                        i5 = ((iM450210 ^ i3) * (-19939)) ^ 60237701;
                        i6 = 1844221450;
                        break;
                    case -1100838998:
                    case 2011714802:
                        throw new IOException(e);
                    case -1098128087:
                    case 801575080:
                        if (C1668.f6641 < 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ܽۗ") + i4) * (-13);
                            i5 = ((iM450210 ^ i3) * 19323) ^ 1664243863;
                            i6 = -337684895;
                            break;
                        }
                        iM450210 = (C19806.m45029("ۙ᩷") ^ i3) * (-57);
                        i5 = ((iM450210 ^ i4) * (-225)) ^ (-92810288);
                        i6 = -1252555078;
                        break;
                    case -1094053267:
                    case 1736852001:
                        throw th;
                    case -626125605:
                    case 586245226:
                        if (inputStream != null) {
                            iM45029 = (C19806.m45029("᩶᩵") + i3) * 15;
                            i5 = ((iM45029 ^ i4) * 10503) ^ (-573803318);
                            i = 453420843;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ۢ᩺")) * 83;
                            i5 = ((iM45029 ^ i3) * 9401) ^ (-1570958549);
                            i = -1523931359;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 78037805:
                    case 844204987:
                        return c20945;
                    case 789809596:
                    case 919932422:
                        C0278.m1781(inputStream);
                        iM45029 = ThreadFactoryC3888.m11306("ۨ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 23301) ^ 655460930;
                        i = -344864522;
                        i7 = iM45029 ^ i;
                        break;
                    case 975245175:
                    case 1764194739:
                        C0278.m1789();
                        if (C3743.f13569) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * (-83);
                            i5 = ((iM45029 ^ i3) * 21393) ^ (-1690956971);
                            i = -575187069;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                            i5 = ((iM45029 ^ i4) * 14483) ^ (-1896297989);
                            i = 617348187;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        C2871.m8646();
                        if (C2788.f10625 >= 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("۫ۡ") + i4) * (-3);
                            i5 = ((iM450210 ^ i3) * (-19939)) ^ 60237701;
                            i6 = 1844221450;
                        }
                        iM45029 = (i3 - C19806.m45029("۫ܿ")) * (-87);
                        i5 = ((iM45029 ^ i4) * 32383) ^ (-726264202);
                        i = -115604884;
                        i7 = iM45029 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47100(long j, InputStream inputStream) {
        int i = -414314996;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C1461.f5957;
        int iM45029 = (C19806.m45029("۠ܺ") + i3) * (-89);
        int i4 = ((iM45029 ^ i2) * 6445) ^ (-280827414);
        int i5 = 378842566;
        while (true) {
            i = ((((i ^ i2) * 6015) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2076108355:
                case -1997146838:
                    if (j < 108) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ۠") ^ i3) * (-115);
                        i4 = ((iM45029 ^ i2) * (-11483)) ^ 2055649869;
                        i5 = 1641216595;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30497)) ^ 980693886;
                        i5 = -1298495352;
                    }
                    break;
                case -1983023368:
                case 1616929919:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23415)) ^ (-1621540055);
                        i5 = 1371884756;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21375) ^ 1956403073;
                        i5 = -1258646051;
                    }
                    break;
                case -1773656004:
                case 355601256:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۧ") + i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-31497)) ^ (-824981135);
                        i5 = -1599102236;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۢ") ^ i2) * 71;
                        i4 = ((iM45029 ^ i3) * (-12071)) ^ (-710164798);
                        i5 = 231893816;
                    }
                    break;
                case -1737095016:
                case 2025393959:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۚ") ^ i3) * (-45);
                        i4 = ((iM45029 ^ i2) * 1687) ^ (-1453658269);
                        i5 = 1214904120;
                    } else {
                        iM45029 = (C19806.m45029("ۗۘ") ^ i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-28977)) ^ 1628494287;
                        i5 = -154005016;
                    }
                    break;
                case -1697047105:
                case 1585385286:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ۗۘ") ^ i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-28977)) ^ 1628494287;
                        i5 = -154005016;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۜ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 10179) ^ 1945751672;
                        i5 = -2014208834;
                    }
                    break;
                case -1661767029:
                case -453379132:
                    return m47101(new C3255(inputStream));
                case -1529486887:
                case 161524628:
                    C2871.m8646();
                    iM45029 = (i2 - C19806.m45029("۟ۜ")) * 35;
                    i4 = ((iM45029 ^ i3) * 23893) ^ (-1715242736);
                    i5 = 2036608693;
                    break;
                case -1364066682:
                case 1762163:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("ۗۘ") ^ i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-28977)) ^ 1628494287;
                        i5 = -154005016;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23415)) ^ (-1621540055);
                        i5 = 1371884756;
                    }
                    break;
                case -1239817760:
                case 341217630:
                    C3660.m10791();
                    return false;
                case -1109965839:
                case -128012142:
                    C3660.m10791();
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23415)) ^ (-1621540055);
                        i5 = 1371884756;
                    } else {
                        iM45029 = C19806.m45029("ܽܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13639) ^ (-1661327466);
                        i5 = 1450806997;
                    }
                    break;
                case -914123914:
                case 736713770:
                    return false;
                case -493228216:
                case 1748397315:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("ۗۘ") ^ i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-28977)) ^ 1628494287;
                        i5 = -154005016;
                    } else {
                        iM45029 = C19806.m45029("᩻ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28799) ^ 1655987416;
                        i5 = 1273533182;
                    }
                    break;
                case 306278000:
                case 1036920079:
                    if (C0817.m3399()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22295) ^ 856043244;
                        i5 = 1933564919;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۢ") ^ i2) * 71;
                        i4 = ((iM45029 ^ i3) * (-12071)) ^ (-710164798);
                        i5 = 231893816;
                    }
                    break;
                case 322345308:
                case 328111329:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ۨۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23537)) ^ 1662873223;
                        i5 = -837460365;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23415)) ^ (-1621540055);
                        i5 = 1371884756;
                    }
                    break;
                case 727320808:
                case 1921386601:
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23415)) ^ (-1621540055);
                        i5 = 1371884756;
                    } else {
                        iM45029 = (C19806.m45029("᩶۫") ^ i2) * (-79);
                        i4 = ((iM45029 ^ i3) * 17787) ^ 1050668770;
                        i5 = -832472611;
                    }
                    break;
                case 879083908:
                case 1377065677:
                    if (C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۢ") ^ i2) * 71;
                        i4 = ((iM45029 ^ i3) * (-12071)) ^ (-710164798);
                        i5 = 231893816;
                    } else {
                        iM45029 = C19806.m45029("֨֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31523) ^ 668831069;
                        i5 = -777453662;
                    }
                    break;
                case 1048127275:
                case 1325753817:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۢ") ^ i2) * 71;
                        i4 = ((iM45029 ^ i3) * (-12071)) ^ (-710164798);
                        i5 = 231893816;
                    } else {
                        iM45029 = C19806.m45029("᩶᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17473)) ^ 519533073;
                        i5 = 136301565;
                    }
                    break;
                default:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23415)) ^ (-1621540055);
                        i5 = 1371884756;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۟ۜ")) * 35;
                        i4 = ((iM45029 ^ i3) * 23893) ^ (-1715242736);
                        i5 = 2036608693;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cd, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.m9874() != false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[], l.۠᩻᩺] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m47105(l.C1388 r36) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20945.m47105(l.֨᩸ۨ):byte[]");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x020d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0258  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x0300  */
    /* JADX WARN: Code duplicated, block: B:94:0x0332 A[PHI: r5
      0x0332: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:93:0x0330, B:77:0x0284, B:61:0x01ed, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47101(C3255 c3255) {
        int iM45029;
        int i;
        int i2;
        short s = 0;
        boolean z = false;
        int iM9736 = 0;
        int i3 = 0;
        int iM9737 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        int iM9738 = 0;
        int iM9739 = 0;
        int i6 = -2022715468;
        int i7 = C1460.f5948;
        int i8 = C2124.f7782;
        int iM11306 = (i7 - ThreadFactoryC3888.m11306("᩹ᩳ")) * 57;
        int i9 = ((iM11306 ^ i8) * (-491)) ^ (-2019002908);
        int i10 = iM11306 ^ 882234101;
        boolean z3 = false;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * (-18369)) >> 31));
            switch (i6) {
                case -2096314124:
                case -2060604113:
                    z2 = false;
                    iM45029 = (ThreadFactoryC3888.m11306("۫۠") ^ i8) * (-5);
                    i = ((iM45029 ^ i7) * (-32629)) ^ 1207197889;
                    i2 = 1373991495;
                    int i11 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11;
                    break;
                case -2000138161:
                case 1776209890:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i8;
                        i = ((iM45029 ^ i7) * 13139) ^ 904169778;
                        i2 = 1149702637;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i8;
                        i = ((iM45029 ^ i7) * 17185) ^ 1660284796;
                        i2 = 394909975;
                    }
                    int i12 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i12;
                    break;
                case -1999440316:
                case 83131747:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۤ") + i7) * 89;
                        i = ((iM45029 ^ i8) * 12247) ^ 1708165069;
                        i2 = 637425481;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i8;
                        i = ((iM45029 ^ i7) * 17185) ^ 1660284796;
                        i2 = 394909975;
                    }
                    int i13 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i13;
                    break;
                case -1976872236:
                case -913084010:
                    if (iM9738 == z) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") + i8) * 63;
                        i = ((iM45029 ^ i7) * 28481) ^ (-1711959559);
                        i2 = -1442951646;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 11541) ^ 1920889075;
                        i2 = -725104658;
                    }
                    int i14 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i14;
                    break;
                case -1831271602:
                case 1114105441:
                    z = true;
                    if (s != 3) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۡ") ^ i7;
                        i = ((iM45029 ^ i8) * 23143) ^ 1874154923;
                        i2 = 469422899;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܶ") ^ i7;
                        i = ((iM45029 ^ i8) * (-30137)) ^ (-1934998059);
                        i2 = 1631318950;
                    }
                    int i15 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i15;
                    break;
                case -1823014736:
                case -483606590:
                    if (C2788.m8472() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۜ") ^ i8;
                        i = ((iM45029 ^ i7) * (-18529)) ^ (-1566583770);
                        i2 = -11954515;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i8;
                        i = ((iM45029 ^ i7) * 4143) ^ 1542868510;
                        i2 = -1171736585;
                    }
                    int i16 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i16;
                    break;
                case -1757408275:
                case -964545886:
                    return z;
                case -1727164852:
                case 1815073441:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("۫ۙ") ^ i7) * 15;
                        i = ((iM45029 ^ i8) * 3037) ^ 1643486541;
                        i2 = 397607353;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۜ") ^ i8;
                        i = ((iM45029 ^ i7) * (-18529)) ^ (-1566583770);
                        i2 = -11954515;
                    }
                    int i17 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i17;
                    break;
                case -1554212162:
                case -656289133:
                    return z3;
                case -1468480147:
                case 795752917:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i8;
                        i = ((iM45029 ^ i7) * 13139) ^ 904169778;
                        i2 = 1149702637;
                    } else {
                        iM45029 = C19806.m45029("۟᩹") ^ i8;
                        i = ((iM45029 ^ i7) * (-11463)) ^ 1834958416;
                        i2 = -1693602657;
                    }
                    int i18 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i18;
                    break;
                case -1261413394:
                case -420453769:
                    if (z2) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("֨᩹")) * 33;
                        i = ((iM45029 ^ i7) * (-26161)) ^ (-970103960);
                        i2 = 1043199390;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") + i8) * 63;
                        i = ((iM45029 ^ i7) * 28481) ^ (-1711959559);
                        i2 = -1442951646;
                    }
                    int i19 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i19;
                    break;
                case -1213960729:
                case 1523819694:
                    s = c3255.readShort();
                    iM45029 = (C19806.m45029("ܰۨ") + i7) * 79;
                    i = ((iM45029 ^ i8) * (-8211)) ^ (-1822488406);
                    i2 = 559792275;
                    int i110 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i110;
                    break;
                case -1081228021:
                case -1253188:
                    z2 = true;
                    iM45029 = (ThreadFactoryC3888.m11306("۫۠") ^ i8) * (-5);
                    i = ((iM45029 ^ i7) * (-32629)) ^ 1207197889;
                    i2 = 1373991495;
                    int i111 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i111;
                    break;
                case -1059124668:
                case -932787313:
                    c3255.skipBytes(i3);
                    iM9737 = c3255.m9736();
                    iM45029 = (ThreadFactoryC3888.m11306("ۘ۫") ^ i7) * (-95);
                    i = ((iM45029 ^ i8) * (-37)) ^ 1435143035;
                    i2 = -1583649689;
                    int i112 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i112;
                    break;
                case -984572918:
                case 529123974:
                    if (iM9737 == i4) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۧ") ^ i7;
                        i = ((iM45029 ^ i8) * 31805) ^ (-595629146);
                        i2 = -1512747590;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 11541) ^ 1920889075;
                        i2 = -725104658;
                    }
                    int i113 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i113;
                    break;
                case -967438626:
                case -417709871:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("᩹ۗ") ^ i8;
                        i = ((iM45029 ^ i7) * (-12509)) ^ 44926980;
                        i2 = -2056621536;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۙ") + i8) * 55;
                        i = ((iM45029 ^ i7) * (-1037)) ^ 1466267227;
                        i2 = 2071810057;
                    }
                    int i114 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i114;
                    break;
                case -885952883:
                case 1227680516:
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i8;
                        i = ((iM45029 ^ i7) * 13139) ^ 904169778;
                        i2 = 1149702637;
                    } else {
                        iM45029 = C19806.m45029("ܶۘ") ^ i7;
                        i = ((iM45029 ^ i8) * 27305) ^ 988489998;
                        i2 = -1879051406;
                    }
                    int i115 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i115;
                    break;
                case -843847053:
                case 1657304387:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۜ") ^ i8;
                        i = ((iM45029 ^ i7) * (-18529)) ^ (-1566583770);
                        i2 = -11954515;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩸ۛ")) * 119;
                        i = ((iM45029 ^ i8) * (-30095)) ^ 458061485;
                        i2 = -1130410379;
                    }
                    int i116 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i116;
                    break;
                case -807674088:
                case -133020307:
                    iM9736 = c3255.m9736();
                    iM45029 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i8;
                    i = ((iM45029 ^ i7) * (-15111)) ^ 2036462681;
                    i2 = 1310933878;
                    int i117 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i117;
                    break;
                case -325663250:
                case 1714636529:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܺ᩵")) * 29;
                        i = ((iM45029 ^ i7) * 17105) ^ 965053882;
                        i2 = -1449922761;
                    } else {
                        iM45029 = C19806.m45029("ܰ֫") ^ i7;
                        i = ((iM45029 ^ i8) * (-14449)) ^ 739062064;
                        i2 = -531975974;
                    }
                    int i118 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i118;
                    break;
                case -302874760:
                case 1423947492:
                    try {
                        c3255.skipBytes(i5);
                        c3255.skipBytes(c3255.readInt() - 8);
                        iM9739 = c3255.m9736();
                        iM45029 = (C19806.m45029("֡ۛ") + i7) * 19;
                        i = ((iM45029 ^ i8) * (-19733)) ^ (-1484490779);
                        i2 = -2022158719;
                    } catch (Throwable unused) {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 11541) ^ 1920889075;
                        i2 = -725104658;
                    }
                    int i119 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i119;
                    break;
                case -218968235:
                case 63645944:
                    C2249.m6915();
                    if (C3577.f13150 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i8;
                        i = ((iM45029 ^ i7) * 13139) ^ 904169778;
                        i2 = 1149702637;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܺ᩵")) * 29;
                        i = ((iM45029 ^ i7) * 17105) ^ 965053882;
                        i2 = -1449922761;
                    }
                    int i1110 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1110;
                    break;
                case -97940318:
                case 833037283:
                    i4 = MLKEMEngine.KyberPolyBytes;
                    i5 = 2;
                    if (iM9737 == z) {
                        iM45029 = C19806.m45029("֨۫") ^ i8;
                        i = ((iM45029 ^ i7) * (-6337)) ^ 725205531;
                        i2 = -1018467418;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩺᩷")) * (-69);
                        i = ((iM45029 ^ i8) * (-29055)) ^ 1854959076;
                        i2 = 1132645737;
                    }
                    int i1111 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1111;
                    break;
                case -67599939:
                case 73191703:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i8;
                        i = ((iM45029 ^ i7) * 17185) ^ 1660284796;
                        i2 = 394909975;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i8;
                        i = ((iM45029 ^ i7) * (-30739)) ^ (-475864979);
                        i2 = 1052005958;
                    }
                    int i1112 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1112;
                    break;
                case -53282231:
                case 2026268846:
                    z3 = false;
                    iM45029 = C19806.m45029("ܿ۫") ^ i8;
                    i = ((iM45029 ^ i7) * 3655) ^ 1134771934;
                    i2 = -1069609888;
                    int i1113 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1113;
                    break;
                case 288936829:
                case 1791044785:
                    if (iM9739 == i4) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") + i8) * 63;
                        i = ((iM45029 ^ i7) * 28481) ^ (-1711959559);
                        i2 = -1442951646;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i = ((iM45029 ^ i7) * 11541) ^ 1920889075;
                        i2 = -725104658;
                    }
                    int i1114 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1114;
                    break;
                case 477563835:
                case 857492458:
                    CallableC1627.m5507();
                    C0050.m946();
                    return false;
                case 621944935:
                case 2017778715:
                    C1066.m4023();
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۜ") ^ i8;
                        i = ((iM45029 ^ i7) * (-18529)) ^ (-1566583770);
                        i2 = -11954515;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹᩺") ^ i7) * (-53);
                        i = ((iM45029 ^ i8) * (-27215)) ^ (-148632150);
                        i2 = -2117908143;
                    }
                    int i1115 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1115;
                    break;
                case 681834557:
                case 1611837546:
                    RunnableC1606.m5473();
                    C1461.m5080();
                    iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i8;
                    i = ((iM45029 ^ i7) * 13139) ^ 904169778;
                    i2 = 1149702637;
                    int i1116 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1116;
                    break;
                case 909879403:
                case 1258043185:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i7;
                        i = ((iM45029 ^ i8) * (-8723)) ^ 1449327520;
                        i2 = 121205779;
                    } else {
                        iM45029 = (i8 - C19806.m45029("ܽۡ")) * 51;
                        i = ((iM45029 ^ i7) * (-30879)) ^ 317541515;
                        i2 = 2075485384;
                    }
                    int i1117 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1117;
                    break;
                case 968592153:
                case 1810932561:
                    i3 = iM9736 - 4;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܺ᩵")) * 29;
                        i = ((iM45029 ^ i7) * 17105) ^ 965053882;
                        i2 = -1449922761;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܿ") + i7) * (-11);
                        i = ((iM45029 ^ i8) * 10047) ^ (-1937343941);
                        i2 = 1590394112;
                    }
                    int i1118 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1118;
                    break;
                case 999002488:
                case 1192152998:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܺ᩵")) * 29;
                        i = ((iM45029 ^ i7) * 17105) ^ 965053882;
                        i2 = -1449922761;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܰ֨")) * (-31);
                        i = ((iM45029 ^ i8) * 24509) ^ 1029130862;
                        i2 = -2038744657;
                    }
                    int i1119 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i1119;
                    break;
                case 1103310360:
                case 2041696507:
                    c3255.skipBytes(i5);
                    c3255.skipBytes(c3255.readInt() - 8);
                    iM9738 = c3255.m9736();
                    iM45029 = (C19806.m45029("ᩴܰ") + i7) * 49;
                    i = ((iM45029 ^ i8) * 5665) ^ (-1199359429);
                    i2 = 1635688388;
                    int i11110 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11110;
                    break;
                case 1171929488:
                case 1186875372:
                    C7105.m18985();
                    if (C1419.f5860 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۫") ^ i8;
                        i = ((iM45029 ^ i7) * 4143) ^ 1542868510;
                        i2 = -1171736585;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i7;
                        i = ((iM45029 ^ i8) * (-8723)) ^ 1449327520;
                        i2 = 121205779;
                    }
                    int i11111 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11111;
                    break;
                case 1810469030:
                case 2027532191:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("᩹ۗ") ^ i8;
                        i = ((iM45029 ^ i7) * (-12509)) ^ 44926980;
                        i2 = -2056621536;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۛ۬")) * (-69);
                        i = ((iM45029 ^ i7) * 11171) ^ (-1523293050);
                        i2 = -2074162216;
                    }
                    int i11112 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11112;
                    break;
                default:
                    if (C1937.f7317 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i8;
                        i = ((iM45029 ^ i7) * 13139) ^ 904169778;
                        i2 = 1149702637;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۜ") ^ i8;
                        i = ((iM45029 ^ i7) * (-18529)) ^ (-1566583770);
                        i2 = -11954515;
                    }
                    int i11113 = i;
                    i10 = iM45029 ^ i2;
                    i9 = i11113;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[PHI: r6 r7
      0x00d3: PHI (r6v4 byte[]) = (r6v3 byte[]), (r6v2 byte[]), (r6v2 byte[]) binds: [B:36:0x00d1, B:16:0x004b, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:36:0x00d1, B:16:0x004b, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x011b A[PHI: r3
      0x011b: PHI (r3v5 boolean) = (r3v4 boolean), (r3v2 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:41:0x0119, B:18:0x004f, B:16:0x004b, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be A[PHI: r4 r5 r15
      0x01be: PHI (r4v3 l.۠᩻᩺) = (r4v2 l.۠᩻᩺), (r4v5 l.۠᩻᩺) binds: [B:56:0x01bc, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r5v3 l.ܿۚۨ) = (r5v2 l.ܿۚۨ), (r5v5 l.ܿۚۨ) binds: [B:56:0x01bc, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r15v8 l.ۧ۬ۨ) = (r15v5 l.ۧ۬ۨ), (r15v4 l.ۧ۬ۨ) binds: [B:56:0x01bc, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m47111() {
        int iM45029;
        int i;
        short s = 0;
        boolean z = false;
        C8516 c8516 = null;
        C17140 c17140 = null;
        byte[] bArr = null;
        int length = 0;
        int i2 = 0;
        int size = 0;
        int i3 = -2080614979;
        int i4 = C1189.f5284;
        int i5 = C3577.f13150;
        int iM11306 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * (-29);
        int i6 = ((iM11306 ^ i5) * 2031) ^ (-1106370803);
        int i7 = 1779264244;
        while (true) {
            int i8 = iM11306 ^ i7;
            C11018 c11018 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-18975)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1489397173:
                    case 1415050114:
                        C0216.m1591();
                        ThreadFactoryC3888.m11300();
                        return null;
                    case -1182379311:
                    case 229732381:
                        c11018.seek(4L);
                        size = c11018.size();
                        if (C3660.m10791() == 0) {
                            iM45029 = C19806.m45029("ۜܶ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-1557)) ^ (-165486516);
                            i = 2081744548;
                            i8 = iM45029 ^ i;
                        }
                        break;
                    case -1146867368:
                    case 558135139:
                        c11018.write(bArr, i2, length - i2);
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                            iM45029 = C19806.m45029("ۤ᩹") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11131)) ^ 1670907048;
                            i = 1476195423;
                        } else {
                            iM45029 = C19806.m45029("᩸᩸") ^ i4;
                            i6 = ((iM45029 ^ i5) * (-10851)) ^ 1799103446;
                            i = 2113176876;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -852408807:
                    case 1517269858:
                        if (C1189.m4368() > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i4;
                            i6 = ((iM45029 ^ i5) * 31273) ^ 561349465;
                            i = 605141441;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i4;
                            i6 = ((iM45029 ^ i5) * 11801) ^ 711069742;
                            i = 1888533290;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -840296179:
                    case 1994744530:
                        s = 3;
                        if (ThreadFactoryC3888.f14547 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۜܰ") + i5) * (-37);
                            i6 = ((iM45029 ^ i4) * 31459) ^ (-1181239441);
                            i = -1786960916;
                            i8 = iM45029 ^ i;
                        }
                        break;
                    case -421953747:
                    case 1866751625:
                        RunnableC1606.m5475(c11018, size);
                        return c11018.m27773();
                    case -101515727:
                    case 1825045981:
                        if (C1977.f7413 > 0) {
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11801) ^ 711069742;
                        i = 1888533290;
                        i8 = iM45029 ^ i;
                        break;
                    case 13973679:
                    case 1352157543:
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i4;
                        i6 = ((iM45029 ^ i5) * 31273) ^ 561349465;
                        i = 605141441;
                        i8 = iM45029 ^ i;
                        break;
                    case 307215407:
                    case 322182033:
                        c17140.m40059(c11018, z, c8516);
                        bArr = this.f68268;
                        length = bArr.length;
                        if (C1937.f7317 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i4;
                            i6 = ((iM45029 ^ i5) * 11801) ^ 711069742;
                            i = 1888533290;
                        } else {
                            iM45029 = C19806.m45029("᩹֨") ^ i4;
                            i6 = ((iM45029 ^ i5) * (-13363)) ^ 1896580657;
                            i = 1341942261;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case 764565778:
                    case 1921539300:
                        if (!RunnableC3388.m10064()) {
                        }
                        c11018 = new C11018();
                        if (C2871.f10837 >= 0) {
                            iM45029 = (C19806.m45029("ۤܽ") + i5) * (-71);
                            i6 = ((iM45029 ^ i4) * (-17109)) ^ 297898131;
                            i = 2081597201;
                        } else {
                            iM45029 = C19806.m45029("ۧۛ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 7899) ^ 1213907053;
                            i = -1112768536;
                        }
                        i8 = iM45029 ^ i;
                        break;
                        break;
                    case 790571059:
                    case 1088565847:
                        if (AbstractC0464.f2088 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i4;
                            i6 = ((iM45029 ^ i5) * 31273) ^ 561349465;
                            i = 605141441;
                        } else {
                            iM45029 = C19806.m45029("ۤ᩹") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11131)) ^ 1670907048;
                            i = 1476195423;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case 836911795:
                    case 1069148555:
                        i2 = this.f68269;
                        if (C3577.f13150 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۫᩶") ^ i5;
                            i6 = ((iM45029 ^ i4) * 29855) ^ 920135468;
                            i = -1148598821;
                            i8 = iM45029 ^ i;
                        }
                        break;
                    case 893945777:
                    case 1045184794:
                        c11018.mo24505(s);
                        c11018.mo24505((short) 8);
                        if (C2477.f9839 <= 0) {
                            iM45029 = C19806.m45029("ۤ᩹") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11131)) ^ 1670907048;
                            i = 1476195423;
                        } else {
                            iM45029 = (i5 - C19806.m45029("۟᩻")) * (-3);
                            i6 = ((iM45029 ^ i4) * 14129) ^ (-628862885);
                            i = 2002330126;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case 1489118581:
                    case 2136626180:
                        c11018.skipBytes(4);
                        z = true;
                        if (C3722.f13525 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i4;
                            i6 = ((iM45029 ^ i5) * 31273) ^ 561349465;
                            i = 605141441;
                        } else {
                            iM45029 = (C19806.m45029("ۢۤ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM45029 ^ i5) * (-5243)) ^ 942395028;
                            i = 2115882119;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    default:
                        c8516 = null;
                        c17140 = this.f68265;
                        if (C3535.f13026 <= 0) {
                            iM45029 = (C19806.m45029("ۤܽ") + i5) * (-71);
                            i6 = ((iM45029 ^ i4) * (-17109)) ^ 297898131;
                            i = 2081597201;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳۙ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-16865)) ^ 622521954;
                            i = -1980079356;
                        }
                        i8 = iM45029 ^ i;
                        break;
                }
            }
            iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i4;
            i6 = ((iM11306 ^ i5) * (-10913)) ^ (-985634897);
            i7 = 1599687029;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final XmlResourceParserC11068 m47106() {
        int iM11306;
        int i;
        int iM45029;
        int i2;
        int i3 = 1010190550;
        int i4 = C1460.f5948;
        int i5 = C2249.f8050;
        int iM11307 = ThreadFactoryC3888.m11306("۬ۤ") ^ i4;
        int i6 = ((iM11307 ^ i5) * 21473) ^ (-1360865492);
        int i7 = 2028349076;
        while (true) {
            int i8 = iM11307 ^ i7;
            ByteArrayInputStream byteArrayInputStream = null;
            XmlResourceParserC11068 xmlResourceParserC11068 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-11167)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2024412652:
                    case 1870413889:
                        AbstractC0464.m2313();
                        if (C2642.f10294 <= 0) {
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩸֨")) * (-67);
                        i6 = ((iM11306 ^ i4) * 15815) ^ (-809145672);
                        i = -933366212;
                        i8 = iM11306 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case -1661960614:
                    case -823262985:
                        if (C1419.f5860 >= 0) {
                        }
                        if (RunnableC3388.f12514 >= 0) {
                            iM11306 = (i5 - ThreadFactoryC3888.m11306("᩸֨")) * (-67);
                            i6 = ((iM11306 ^ i4) * 15815) ^ (-809145672);
                            i = -933366212;
                        } else {
                            if (C1377.f5749) {
                                if (!RunnableC1895.f7152) {
                                }
                                if (C2332.f8260) {
                                    byte[] bArr = this.f68268;
                                    if (C1066.f4915 <= 0) {
                                        break;
                                    }
                                    int length = bArr.length;
                                    if (C2871.f10837 < 0) {
                                        int i9 = this.f68269;
                                        int i10 = length - i9;
                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                                            byteArrayInputStream = new ByteArrayInputStream(bArr, i9, i10);
                                            if (C1398.f5802 > 0) {
                                                xmlResourceParserC11068 = new XmlResourceParserC11068();
                                                if (RunnableC1895.f7152) {
                                                    iM45029 = (C19806.m45029("ܽ֫") + i4) * (-111);
                                                    i6 = ((iM45029 ^ i5) * 4195) ^ (-2137346479);
                                                    i2 = -1049174477;
                                                } else {
                                                    iM45029 = (C19806.m45029("᩸۟") ^ i5) * (-69);
                                                    i6 = ((iM45029 ^ i4) * (-20707)) ^ (-1285540589);
                                                    i2 = 821828366;
                                                }
                                                i8 = iM45029 ^ i2;
                                            }
                                            break;
                                        }
                                    } else {
                                        iM11306 = C19806.m45029("۠ܿ") ^ i5;
                                        i6 = ((iM11306 ^ i4) * 27647) ^ (-286855949);
                                        i = -1200107552;
                                    }
                                }
                                break;
                            }
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰ᩺")) * (-7);
                            i6 = ((iM11306 ^ i5) * 16495) ^ 126572728;
                            i = -1407882931;
                        }
                        i8 = iM11306 ^ i;
                        byteArrayInputStream = null;
                        break;
                        break;
                    case -1449889357:
                    case 385839318:
                        C2788.m8472();
                        if (C1398.m4895() <= 0) {
                        }
                        iM11306 = C19806.m45029("۠ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27647) ^ (-286855949);
                        i = -1200107552;
                        i8 = iM11306 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case -1378758311:
                    case 2014593744:
                        C0526.m2437();
                        return null;
                    case -397728706:
                    case 1898825876:
                        C0526.m2437();
                        C0216.m1591();
                        iM11306 = C19806.m45029("۠ܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 27647) ^ (-286855949);
                        i = -1200107552;
                        i8 = iM11306 ^ i;
                        byteArrayInputStream = null;
                        break;
                    case -33659596:
                    case 1854151871:
                        if (RunnableC0195.f1321 < 0) {
                            iM45029 = (C19806.m45029("᩸۟") ^ i5) * (-69);
                            i6 = ((iM45029 ^ i4) * (-20707)) ^ (-1285540589);
                            i2 = 821828366;
                            i8 = iM45029 ^ i2;
                        } else {
                            iM11306 = C19806.m45029("۠ܿ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 27647) ^ (-286855949);
                            i = -1200107552;
                            i8 = iM11306 ^ i;
                            byteArrayInputStream = null;
                        }
                        break;
                    default:
                        xmlResourceParserC11068.m27900(byteArrayInputStream, this.f68265);
                        return xmlResourceParserC11068;
                }
            }
            iM11307 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
            i6 = ((iM11307 ^ i5) * 18387) ^ 450340928;
            i7 = -1791256875;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m47112(C6037 c6037) throws IOException {
        int iM45029;
        int i;
        XmlPullParserException e = null;
        byte[] bArrM35065 = null;
        int i2 = -1681640424;
        int i3 = AbstractC0464.f2088;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM450210 = (C19806.m45029("֫ۡ") + i3) * (-121);
        int i5 = ((iM450210 ^ i4) * 13977) ^ (-1080575137);
        int i6 = 500718973;
        while (true) {
            int i7 = iM450210 ^ i6;
            ByteArrayInputStream byteArrayInputStream = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 31847) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2131036671:
                    case -971635617:
                        if (CallableC1627.f6528) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۛۖ") + i4) * 37;
                            i5 = ((iM45029 ^ i3) * (-4571)) ^ (-133344317);
                            i = 1076896619;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܿ")) * (-39);
                            i5 = ((iM45029 ^ i4) * (-14439)) ^ (-1440545113);
                            i = -617640641;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1823285299:
                    case -1386614313:
                        if (C2788.f10625 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ᩳۜ") + i3) * 127;
                            i5 = ((iM45029 ^ i4) * (-18547)) ^ 336724334;
                            i = -1100203395;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ܰۨ")) * 63;
                            i5 = ((iM45029 ^ i3) * (-30963)) ^ 1012753853;
                            i = 623584130;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1719754381:
                    case 164980205:
                        return bArrM35065;
                    case -1643754746:
                    case -1065004053:
                        if (C10634.f36300 < 0) {
                            iM45029 = (C19806.m45029("ᩳۢ") ^ i3) * (-105);
                            i5 = ((iM45029 ^ i4) * 15171) ^ 885923071;
                            i = 1057373657;
                            i7 = iM45029 ^ i;
                        } else {
                            iM450210 = (C19806.m45029("ܿ֡") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM450210 ^ i3) * 6421) ^ 1529616811;
                            i6 = -517881378;
                        }
                        break;
                    case -1388977676:
                    case 399347259:
                        C3743.m10966();
                        iM450210 = (C19806.m45029("ܿ֡") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM450210 ^ i3) * 6421) ^ 1529616811;
                        i6 = -517881378;
                        break;
                    case -827821397:
                    case -680834803:
                        if (C2642.f10294 > 0) {
                            iM45029 = (i3 - C19806.m45029("۟᩹")) * 85;
                            i5 = ((iM45029 ^ i4) * 11825) ^ 299587160;
                            i = -886729796;
                            i7 = iM45029 ^ i;
                        } else {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܺܶ")) * 71;
                            i5 = ((iM450210 ^ i3) * (-13485)) ^ (-740473879);
                            i6 = 1211086328;
                        }
                        break;
                    case -578733327:
                    case 618233046:
                        if (C1875.m6086() != 0) {
                            iM45029 = (C19806.m45029("᩺᩻") ^ i4) * 91;
                            i5 = ((iM45029 ^ i3) * (-917)) ^ 351158564;
                            i = 477630109;
                        } else {
                            iM45029 = C19806.m45029("۬ۖ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 22153) ^ 1776745075;
                            i = -1533528288;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -451852606:
                    case 441276377:
                        if (C1066.f4915 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ᩳۜ") + i3) * 127;
                            i5 = ((iM45029 ^ i4) * (-18547)) ^ 336724334;
                            i = -1100203395;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܿ")) * (-39);
                            i5 = ((iM45029 ^ i4) * (-14439)) ^ (-1440545113);
                            i = -617640641;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -400634160:
                    case -50700947:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ۙ")) * 39;
                            i5 = ((iM45029 ^ i3) * 8147) ^ (-995244591);
                            i = 1256374909;
                            i7 = iM45029 ^ i;
                        } else {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܺܶ")) * 71;
                            i5 = ((iM450210 ^ i3) * (-13485)) ^ (-740473879);
                            i6 = 1211086328;
                        }
                        break;
                    case -104450230:
                    case 1693885554:
                        byte[] bArr = this.f68268;
                        if (C1066.f4915 > 0) {
                            int length = bArr.length;
                            int i8 = this.f68269;
                            if (!C1977.m6356()) {
                                byteArrayInputStream = new ByteArrayInputStream(bArr, i8, length - i8);
                                iM45029 = (C19806.m45029("᩹ۘ") ^ i3) * 37;
                                i5 = ((iM45029 ^ i4) * (-25509)) ^ (-738002774);
                                i = -2135812252;
                                i7 = iM45029 ^ i;
                            } else {
                                iM450210 = (C19806.m45029("ܿ֡") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i5 = ((iM450210 ^ i3) * 6421) ^ 1529616811;
                                i6 = -517881378;
                            }
                        } else {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܺܶ")) * 71;
                            i5 = ((iM450210 ^ i3) * (-13485)) ^ (-740473879);
                            i6 = 1211086328;
                        }
                        break;
                    case 89489700:
                    case 1694448749:
                        C2477.m7593();
                        if (C19806.f63586) {
                            iM450210 = (C19806.m45029("ܿ֡") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM450210 ^ i3) * 6421) ^ 1529616811;
                            i6 = -517881378;
                        }
                        iM45029 = (C19806.m45029("᩺᩻") ^ i4) * 91;
                        i5 = ((iM45029 ^ i3) * (-917)) ^ 351158564;
                        i = 477630109;
                        i7 = iM45029 ^ i;
                        break;
                    case 131658752:
                    case 757017959:
                        m47102(c6037);
                        if (C1668.f6641 < 0) {
                            iM45029 = C19806.m45029("ۗۙ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-27525)) ^ 1438929514;
                            i = 1016383927;
                            i7 = iM45029 ^ i;
                        } else {
                            iM450210 = (C19806.m45029("ܿ֡") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM450210 ^ i3) * 6421) ^ 1529616811;
                            i6 = -517881378;
                        }
                        break;
                    case 877014335:
                    case 1185636316:
                        try {
                            bArrM35065 = new C14596(byteArrayInputStream, this.f68265).m35065();
                            iM45029 = ThreadFactoryC3888.m11306("ܰܳ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 4369) ^ 24988601;
                            i = 1370961097;
                        } catch (XmlPullParserException e2) {
                            e = e2;
                            iM45029 = C19806.m45029("᩷֨") ^ i4;
                            i5 = ((iM45029 ^ i3) * 7491) ^ 1750300749;
                            i = -258967273;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 878594698:
                    case 1136803443:
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        RunnableC1606.m5473();
                        return null;
                    case 1116561283:
                    case 1666139070:
                        if (C2871.m8646()) {
                            iM45029 = C19806.m45029("۠᩻") ^ i4;
                            i5 = ((iM45029 ^ i3) * 19985) ^ 375464690;
                            i = -1983680029;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿܿ")) * (-39);
                            i5 = ((iM45029 ^ i4) * (-14439)) ^ (-1440545113);
                            i = -617640641;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 1379328272:
                    case 1446062827:
                        if (C3286.f12186) {
                            iM45029 = (ThreadFactoryC3888.m11306("ᩳۜ") + i3) * 127;
                            i5 = ((iM45029 ^ i4) * (-18547)) ^ 336724334;
                            i = -1100203395;
                        } else {
                            iM45029 = (C19806.m45029("᩺᩻") ^ i4) * 91;
                            i5 = ((iM45029 ^ i3) * (-917)) ^ 351158564;
                            i = 477630109;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        throw new IOException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m47114() {
        return this.f68266;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47115(C6037 c6037) {
        m47102(c6037);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 135181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m47102(l.C6037 r89) {
        /*
            Method dump skipped, instruction units count: 13518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20945.m47102(l.ۛۨۨ):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m47104(StringBuilder sb, int i) {
        C17140 c17140 = null;
        int i2 = 981965188;
        int i3 = RunnableC0195.f1321;
        int i4 = C2788.f10625;
        int iM45029 = C19806.m45029("ᩴܺ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 21997) ^ (-303664161);
        int i6 = -1327398170;
        while (true) {
            i2 = ((((i2 ^ i3) * 9609) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2078938203:
                case 752594540:
                    break;
                case -2070360530:
                case 1695306614:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۧۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 5829) ^ (-1488958861);
                        i6 = 1492298280;
                    } else {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 149) ^ (-1834507292);
                        i6 = 885004375;
                    }
                    break;
                case -1927504860:
                case 185009484:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 149) ^ (-1834507292);
                        i6 = 885004375;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * 3141) ^ 1366022787;
                        i6 = 1213261196;
                    }
                    break;
                case -1760223111:
                case -714913339:
                    if (C1875.f7103 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩻") + i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-21169)) ^ 1368428676;
                        i6 = 6290669;
                    } else {
                        iM45029 = (C19806.m45029("ۙۙ") ^ i4) * 47;
                        i5 = ((iM45029 ^ i3) * 8817) ^ 1414080895;
                        i6 = -1186571979;
                    }
                    break;
                case -1632497188:
                case 945615203:
                    C0797.m3359();
                    RunnableC1564.m5345();
                    iM45029 = ThreadFactoryC3888.m11306("ۨܶ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 18235) ^ (-2048587306);
                    i6 = -1736668417;
                    break;
                case -1472593332:
                case 1651837977:
                    c17140 = this.f68265;
                    if (i >= c17140.size()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-9471)) ^ 1702269975;
                        i6 = 1375459880;
                    } else {
                        iM45029 = C19806.m45029("ܽ۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-31415)) ^ 1855828437;
                        i6 = -1182159418;
                    }
                    break;
                case -1460339447:
                case -166625:
                    if (!C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8679) ^ (-837232986);
                        i6 = 1030167797;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18235) ^ (-2048587306);
                        i6 = -1736668417;
                    }
                    break;
                case -1108771585:
                case 1557113176:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i4;
                        i5 = ((iM45029 ^ i3) * 9275) ^ 700221218;
                        i6 = -92679431;
                    } else {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 149) ^ (-1834507292);
                        i6 = 885004375;
                    }
                    break;
                case -1033623597:
                case 2121532119:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩻") + i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-21169)) ^ 1368428676;
                        i6 = 6290669;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-26205)) ^ 1254739958;
                        i6 = -769854464;
                    }
                    break;
                case -970002214:
                case 847289764:
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 149) ^ (-1834507292);
                        i6 = 885004375;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۖ") + i4) * (-47);
                        i5 = ((iM45029 ^ i3) * 26357) ^ (-1010273435);
                        i6 = -466157199;
                    }
                    break;
                case -964104850:
                case 59365914:
                    ThreadFactoryC3888.m11302(sb, ':');
                    iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-9471)) ^ 1702269975;
                    i6 = 1375459880;
                    break;
                case -343553384:
                case 294614353:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ۙۙ") ^ i4) * 47;
                        i5 = ((iM45029 ^ i3) * 8817) ^ 1414080895;
                        i6 = -1186571979;
                    } else {
                        iM45029 = C19806.m45029("ܺۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 16461) ^ (-356808618);
                        i6 = -587132664;
                    }
                    break;
                case -335882957:
                case 40788020:
                    C1398.m4895();
                    if (!RunnableC0195.m1431()) {
                        iM45029 = (C19806.m45029("ۙۙ") ^ i4) * 47;
                        i5 = ((iM45029 ^ i3) * 8817) ^ 1414080895;
                        i6 = -1186571979;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8679) ^ (-837232986);
                        i6 = 1030167797;
                    }
                    break;
                case -159178952:
                case 1818730578:
                    C1148.m4223(sb, c17140.m10939(i));
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 149) ^ (-1834507292);
                        i6 = 885004375;
                    } else {
                        iM45029 = C19806.m45029("ܶܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23673) ^ (-1581646669);
                        i6 = -1604523277;
                    }
                    break;
                case 301664105:
                case 744935280:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8679) ^ (-837232986);
                        i6 = 1030167797;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ᩳ") ^ i3) * 91;
                        i5 = ((iM45029 ^ i4) * (-22697)) ^ (-351126756);
                        i6 = -77155486;
                    }
                    break;
                case 318309800:
                case 2127831430:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩻") + i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-21169)) ^ 1368428676;
                        i6 = 6290669;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 20103) ^ 1416435300;
                        i6 = -1005136159;
                    }
                    break;
                case 320594552:
                case 1301462375:
                    C2332.m7079();
                    C7105.m18985();
                    break;
                case 360574346:
                case 1909061779:
                    if (i >= 0) {
                        iM45029 = (C19806.m45029("᩻֨") + i3) * (-49);
                        i5 = ((iM45029 ^ i4) * (-27633)) ^ 1756694847;
                        i6 = -1056519879;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-9471)) ^ 1702269975;
                        i6 = 1375459880;
                    }
                    break;
                default:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8679) ^ (-837232986);
                        i6 = 1030167797;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ۠") ^ i3) * (-11);
                        i5 = ((iM45029 ^ i4) * 21111) ^ 1349956681;
                        i6 = 934464094;
                    }
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC6132.m17119(EnumC2300.f8185);
        f68261 = new short[]{6718, 12772, 12699, 12792, 12752, 12792, 12746, 12674, 12679, 12674, 12757, 12753, 12747, 12752, 12703, 12674, 12741, 12745, 12756, 12703, 12674, 12744, 12752, 12703, 12674, 12739, 12752, 12703, 12792, 12792, 12703, 810, 2976, 3837, -17733, -17734, -17735, -17736, -17729, -17730, -17731, -17732, -17741, -17742, -17686, -17687, -17688, -17681, -17682, -17683, -17733, -17734, -17735, -17736, -17729, -17730, -17731, -17732, -17741, -17742, -17718, -17719, -17720, -17713, -17714, -17715, -17677, -17690, -17689, -17691, -17672, -17743, -17733, -17677, -17713, -17682, -17669, -17671, -17682, -17688, -17686, -17665, -17682, -17681, -17749, -17756, -17739, -17791, -17737, -17756, -17665, -17671, -17666, -17682, -17682, -17671, -17671, -17692, -17671, -17683, -17686, -17689, -17672, -17682, -17752, -17747, -17752, -17747, -17686, -17690, -17669, -17744, -17747, -17689, -17665, -17744, -17747, -17684, -17665, -17744, -17744, 4953, 14247, 14267, 14267, 14271, 14325, 14304, 14304, 14268, 14252, 14247, 14250, 14242, 14254, 14268, 14305, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14305, 14252, 14240, 14242, 14304, 14254, 14271, 14244, 14304, 14254, 14271, 14271, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14247, 14267, 14267, 14271, 14325, 14304, 14304, 14268, 14252, 14247, 14250, 14242, 14254, 14268, 14305, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14305, 14252, 14240, 14242, 14304, 14254, 14271, 14244, 14304, 14269, 14250, 14268, 14304, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14247, 14267, 14267, 14271, 14325, 14304, 14304, 14268, 14252, 14247, 14250, 14242, 14254, 14268, 14305, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14305, 14252, 14240, 14242, 14304, 14254, 14271, 14244, 14304, 14271, 14269, 14265, 14304, 14269, 14250, 14268, 14304, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14247, 14267, 14267, 14271, 14325, 14304, 14304, 14268, 14252, 14247, 14250, 14242, 14254, 14268, 14305, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14305, 14252, 14240, 14242, 14304, 14254, 14271, 14244, 14304, 14251, 14246, 14268, 14267, 14269, 14246, 14253, 14266, 14267, 14246, 14240, 14241, 14252, 14266, 14268, 14267, 14240, 14242, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14271, 14269, 14265, 14251, 14246, 14268, 14267, 14246, 14251, 14335, 14334, 14333, 14332, 14331, 14330, 14329, 14328, 14327, 14326, 14254, 14253, 14252, 14251, 14250, 14249, 14247, 14267, 14267, 14271, 14325, 14304, 14304, 14268, 14252, 14247, 14250, 14242, 14254, 14268, 14305, 14254, 14241, 14251, 14269, 14240, 14246, 14251, 14305, 14252, 14240, 14242, 14304, 14254, 14271, 14244, 14304, 14269, 14250, 14268, 14306, 14254, 14266, 14267, 14240, 7734, 26015, -26768, -30263, 1265, 15438, 14643, 15834, 9480, -7677, 8046, 1157, 3717, 13133, -14716, 5052};
        f68260 = new C12812();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0863 A[PHI: r4 r5 r6 r8 r14 r23 r24 r25 r26 r27 r28 r33 r34
      0x0863: PHI (r4v11 int) = (r4v10 int), (r4v13 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r5v11 int) = (r5v10 int), (r5v13 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r6v11 short[]) = (r6v10 short[]), (r6v13 short[]) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r8v20 int) = (r8v19 int), (r8v22 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r14v20 int) = (r14v19 int), (r14v22 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r23v11 int) = (r23v10 int), (r23v13 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r24v11 java.lang.StringBuilder) = (r24v10 java.lang.StringBuilder), (r24v13 java.lang.StringBuilder) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r25v11 char) = (r25v10 char), (r25v13 char) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r26v11 char) = (r26v10 char), (r26v13 char) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r27v11 short[]) = (r27v10 short[]), (r27v13 short[]) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r28v15 int) = (r28v14 int), (r28v18 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r33v25 short[]) = (r33v24 short[]), (r33v28 short[]) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r34v13 int) = (r34v12 int), (r34v15 int) binds: [B:160:0x084b, B:154:0x0811] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x0a08 A[PHI: r4 r5 r6 r8 r14 r16 r17 r18 r19 r23 r24 r25 r26 r27 r28 r33 r34
      0x0a08: PHI (r4v24 int) = (r4v3 int), (r4v4 int), (r4v25 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r5v22 int) = (r5v3 int), (r5v4 int), (r5v24 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r6v28 short[]) = (r6v3 short[]), (r6v4 short[]), (r6v29 short[]) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r8v33 int) = (r8v12 int), (r8v13 int), (r8v34 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r14v28 int) = (r14v12 int), (r14v13 int), (r14v29 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r16v6 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r18v6 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r19v6 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r23v22 int) = (r23v3 int), (r23v4 int), (r23v23 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r24v23 java.lang.StringBuilder) = (r24v3 java.lang.StringBuilder), (r24v4 java.lang.StringBuilder), (r24v24 java.lang.StringBuilder) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r25v22 char) = (r25v3 char), (r25v4 char), (r25v23 char) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r26v24 char) = (r26v3 char), (r26v4 char), (r26v25 char) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r27v21 short[]) = (r27v3 short[]), (r27v4 short[]), (r27v23 short[]) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r28v29 int) = (r28v7 int), (r28v8 int), (r28v30 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r33v39 short[]) = (r33v17 short[]), (r33v18 short[]), (r33v40 short[]) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0a08: PHI (r34v26 int) = (r34v5 int), (r34v6 int), (r34v27 int) binds: [B:184:0x0a06, B:180:0x09cd, B:135:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0146  */
    /* JADX WARN: Code duplicated, block: B:37:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x023b  */
    /* JADX WARN: Code duplicated, block: B:93:0x03df A[PHI: r0 r6 r8 r12 r13
      0x03df: PHI (r0v69 int) = (r0v60 int), (r0v2 int), (r0v2 int) binds: [B:92:0x03dd, B:46:0x01b7, B:12:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r6v51 char) = (r6v42 char), (r6v2 char), (r6v2 char) binds: [B:92:0x03dd, B:46:0x01b7, B:12:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r8v111 short[]) = (r8v59 short[]), (r8v99 short[]), (r8v2 short[]) binds: [B:92:0x03dd, B:46:0x01b7, B:12:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r12v7 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:92:0x03dd, B:46:0x01b7, B:12:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:92:0x03dd, B:46:0x01b7, B:12:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47093(String str) {
        int i;
        short[] sArr;
        int i2;
        short[] sArr2;
        int i3;
        int i4;
        short[] sArr3;
        StringBuilder sb;
        short[] sArr4;
        int iM11306;
        int i5;
        int iM45029;
        int i6;
        int i7;
        short[] sArr5;
        short[] sArr6;
        int i8;
        int i9;
        int i10;
        int i11;
        char c;
        short[] sArr7;
        int i12;
        int i13;
        int i14;
        int iM11307;
        int i15;
        int i16;
        int iM11308;
        int i17;
        int i18;
        short[] sArr8;
        int i19;
        int i20;
        int iM11309;
        int i21;
        int iM113010;
        int i22;
        int i23;
        int i24 = -283871512;
        int i25 = C1461.f5957;
        int i26 = C1875.f7103;
        int iM450210 = C19806.m45029("᩶ܺ") ^ i26;
        int i27 = ((iM450210 ^ i25) * 12697) ^ 420269093;
        int i28 = iM450210 ^ (-1744422607);
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        int i29 = 0;
        StringBuilder sb2 = null;
        char c2 = 0;
        int i30 = 0;
        char c3 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        char c4 = 0;
        short s = 0;
        short s2 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        String strM26821 = null;
        short[] sArr15 = null;
        char c5 = 0;
        int i42 = 0;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * (-9295)) >> 31));
            switch (i24) {
                case -2086181664:
                case -784485861:
                    sArr2 = sArr14;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr3 = sArr15;
                    i37 = i37;
                    sb = sb2;
                    short[] sArr16 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr16;
                    s = sArr9[c4];
                    s2 = 25954;
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ۧۙ") ^ i26;
                        i27 = ((iM11306 ^ i25) * (-14819)) ^ (-2004176216);
                        i5 = 2112587777;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i26;
                        i27 = ((iM11306 ^ i25) * (-19585)) ^ (-1961477876);
                        i5 = 989916336;
                    }
                    int i43 = iM11306 ^ i5;
                    sb2 = sb;
                    i37 = i37;
                    sArr15 = sArr3;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr2;
                    i28 = i43;
                    i29 = i4;
                    i40 = i3;
                    short[] sArr17 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr17;
                    break;
                case -2066325298:
                case 1697566956:
                    return "";
                case -2064304708:
                case 1255480972:
                    sArr2 = sArr14;
                    if (c3 != '\"') {
                        iM11309 = C19806.m45029("ܿۚ") ^ i26;
                        i19 = ((iM11309 ^ i25) * 27431) ^ 1710592200;
                        i21 = -1797842074;
                    } else {
                        iM11309 = (i25 - ThreadFactoryC3888.m11306("۟᩺")) * (-109);
                        i19 = ((iM11309 ^ i26) * (-313)) ^ (-1734046598);
                        i21 = -1580087927;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case -2053133411:
                case -1568399626:
                    if (C13985.m33834(c3)) {
                        iM113010 = C19806.m45029("᩺ۛ") ^ i26;
                        i22 = ((iM113010 ^ i25) * (-6415)) ^ (-22958614);
                        i23 = 1168417207;
                    } else {
                        iM113010 = (C19806.m45029("ܰۢ") + i25) * 59;
                        i22 = ((iM113010 ^ i26) * (-6319)) ^ (-961702503);
                        i23 = -1680586771;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -2031293377:
                case -300380778:
                    sArr2 = sArr14;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    short[] sArr18 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr18;
                    sArr15 = sArr15;
                    i11 = i37;
                    c = '\\';
                    if (!C3535.m10420(str, RunnableC1606.m5481(sArr15, i11, 1, i42))) {
                        int iM450211 = (i25 - C19806.m45029("᩹۬")) * (-113);
                        sArr15 = sArr15;
                        c5 = c5;
                        i29 = i4;
                        i38 = i38;
                        i40 = i3;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = iM450211 ^ 372495150;
                        i27 = ((iM450211 ^ i26) * 26161) ^ 1406393871;
                        sb2 = sb2;
                        i37 = i11;
                        c2 = '\\';
                        short[] sArr19 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr19;
                    } else {
                        int iM450212 = (C19806.m45029("֫᩺") + i25) * 39;
                        i29 = i4;
                        i40 = i3;
                        sArr5 = sArr2;
                        i28 = iM450212 ^ 1166584740;
                        i27 = ((iM450212 ^ i26) * (-8205)) ^ (-1681030897);
                        sb2 = sb2;
                        i37 = i11;
                        c2 = c;
                        sArr15 = sArr15;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr5;
                        short[] sArr20 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr20;
                    }
                    break;
                case -2030799848:
                case -56918671:
                    C2788.m8480(sb2, C0629.m2906(f68261, 9, 6, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM113011 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113011 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113011 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -2000224301:
                case 446071766:
                    C3660.m10791();
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        iM113010 = (ThreadFactoryC3888.m11306("ۡ֡") ^ i25) * (-21);
                        i22 = ((iM113010 ^ i26) * (-2161)) ^ (-1541590894);
                        i23 = -163907407;
                        i28 = iM113010 ^ i23;
                        i27 = i22;
                    } else {
                        sArr6 = sArr14;
                        i10 = i37;
                        i8 = i40;
                        i41 = i41;
                        i9 = i29;
                        sb2 = sb2;
                        i30 = i30;
                        i38 = i38;
                        c5 = c5;
                        sArr15 = sArr15;
                        short[] sArr21 = sArr10;
                        c3 = c3;
                        i39 = i39;
                        sArr4 = sArr21;
                        int iM113012 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i26;
                        i37 = i10;
                        i27 = ((iM113012 ^ i25) * (-20961)) ^ (-1308770338);
                        i29 = i9;
                        i40 = i8;
                        sArr5 = sArr6;
                        i28 = iM113012 ^ (-1715706460);
                        sb2 = sb2;
                        i37 = i37;
                        sArr15 = sArr15;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr5;
                        short[] sArr22 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr22;
                    }
                    break;
                case -1871526264:
                case -1064615632:
                    sArr14 = sArr14;
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    C1148.m4223(sb2, C1148.m4230(sArr, i2, i, i42));
                    int iM113013 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113013 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113013 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -1859193134:
                case 32057649:
                    return C0817.m3407(sb2);
                case -1798330190:
                case -1488547207:
                    sArr2 = sArr14;
                    if (c3 != '\n') {
                        iM11309 = (i25 - ThreadFactoryC3888.m11306("᩹ۡ")) * (-47);
                        i19 = ((iM11309 ^ i26) * (-26759)) ^ 381106669;
                        i21 = -1059496964;
                    } else {
                        iM11309 = (i25 - ThreadFactoryC3888.m11306("᩵֫")) * (-101);
                        i19 = ((iM11309 ^ i26) * 19119) ^ (-1679768180);
                        i21 = 1275076749;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case -1797789094:
                case -521228358:
                    short[] sArr23 = sArr14;
                    int i44 = i40;
                    i41 = i41;
                    int i45 = i29;
                    char cM8652 = C2871.m8652(str, i30);
                    if (cM8652 != '\t') {
                        iM11308 = C19806.m45029("᩺۟") ^ i26;
                        i17 = ((iM11308 ^ i25) * (-23737)) ^ 701421990;
                        i18 = 1282718321;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("֫ۖ") ^ i26;
                        i17 = ((iM11308 ^ i25) * (-14373)) ^ (-888743496);
                        i18 = -1409167994;
                    }
                    i29 = i45;
                    i40 = i44;
                    sArr8 = sArr23;
                    i28 = iM11308 ^ i18;
                    i27 = i17;
                    c3 = cM8652;
                    i41 = i41;
                    sArr14 = sArr8;
                    break;
                case -1764079746:
                case 264855354:
                    C3743.m10966();
                    if (!C2332.f8260) {
                        sArr2 = sArr14;
                        i3 = i40;
                        i41 = i41;
                        i4 = i29;
                        c5 = c5;
                        short[] sArr24 = sArr10;
                        c3 = c3;
                        i39 = i39;
                        sArr4 = sArr24;
                        int iM450213 = (i25 - C19806.m45029("ۖۚ")) * (-71);
                        int i46 = ((iM450213 ^ i26) * (-8697)) ^ (-1784853439);
                        i12 = iM450213 ^ 1818504158;
                        i37 = i37;
                        sArr15 = sArr15;
                        i27 = i46;
                        i29 = i4;
                        i40 = i3;
                        char c6 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = i12;
                        c5 = c6;
                        short[] sArr25 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr25;
                    } else {
                        iM113010 = (ThreadFactoryC3888.m11306("۟ܰ") + i25) * 123;
                        i22 = ((iM113010 ^ i26) * 18313) ^ (-1078391829);
                        i23 = 232329122;
                        i28 = iM113010 ^ i23;
                        i27 = i22;
                    }
                    break;
                case -1659358400:
                case 321520368:
                    sArr2 = sArr14;
                    i37 = i37;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    short[] sArr26 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr26;
                    sb2 = new StringBuilder();
                    sArr15 = f68261;
                    if (C0526.f2219) {
                        int iM450214 = (i25 - C19806.m45029("ۖۚ")) * (-71);
                        int i47 = ((iM450214 ^ i26) * (-8697)) ^ (-1784853439);
                        i12 = iM450214 ^ 1818504158;
                        i37 = i37;
                        sArr15 = sArr15;
                        i27 = i47;
                        i29 = i4;
                        i40 = i3;
                        char c7 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = i12;
                        c5 = c7;
                        short[] sArr27 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr27;
                    } else {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۛ᩶") ^ i25) * (-57);
                        i27 = ((iM113014 ^ i26) * (-29059)) ^ 972510310;
                        i29 = i4;
                        i40 = i3;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = iM113014 ^ (-1764767742);
                        c5 = c5;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr4;
                        i37 = i37;
                        sArr15 = sArr15;
                    }
                    break;
                case -1630779743:
                case 465346777:
                    C1148.m4223(sb2, C1461.m5070(sArr12, i31, i32, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM113015 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113015 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113015 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -1393522706:
                case -1365866053:
                    ThreadFactoryC3888.m11302(sb2, c3);
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM113016 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113016 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113016 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -1359551986:
                case 351986556:
                    C1148.m4223(sb2, strM26821);
                    C0817.m3408(sb2, c3);
                    ThreadFactoryC3888.m11302(sb2, ';');
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM113017 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113017 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113017 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -1354604553:
                case 1254393328:
                    if (C1189.f5284 <= 0) {
                        iM113010 = (ThreadFactoryC3888.m11306("ۡ֡") ^ i25) * (-21);
                        i22 = ((iM113010 ^ i26) * (-2161)) ^ (-1541590894);
                        i23 = -163907407;
                    } else {
                        iM113010 = (ThreadFactoryC3888.m11306("۟ܰ") + i25) * 123;
                        i22 = ((iM113010 ^ i26) * 18313) ^ (-1078391829);
                        i23 = 232329122;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -1340894137:
                case 1932792088:
                    sArr2 = sArr14;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr3 = sArr15;
                    i37 = i37;
                    sb = sb2;
                    short[] sArr28 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr28;
                    sArr9 = f68261;
                    c4 = 0;
                    if (C0671.f2816 != 0) {
                        iM11306 = C19806.m45029("ۧۙ") ^ i26;
                        i27 = ((iM11306 ^ i25) * (-14819)) ^ (-2004176216);
                        i5 = 2112587777;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") ^ i25) * (-99);
                        i27 = ((iM11306 ^ i26) * 12415) ^ 139000012;
                        i5 = 1396232452;
                    }
                    int i48 = iM11306 ^ i5;
                    sb2 = sb;
                    i37 = i37;
                    sArr15 = sArr3;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr2;
                    i28 = i48;
                    i29 = i4;
                    i40 = i3;
                    short[] sArr110 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr110;
                    break;
                case -1292098483:
                case 1791789546:
                    C2788.m8480(sb2, C3722.m10901(f68261, 28, 2, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM113018 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113018 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113018 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -1198202985:
                case 968260413:
                    C1148.m4223(sb2, C0962.m3747(sArr14, i33, 1, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM113019 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM113019 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM113019 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case -1010408468:
                case 1925746722:
                    i13 = i30 + 1;
                    iM11307 = C19806.m45029("ۖۧ") ^ i25;
                    i14 = i13;
                    i15 = ((iM11307 ^ i26) * 19517) ^ (-1669470745);
                    i16 = 438281768;
                    i29 = i29;
                    i40 = i40;
                    sArr8 = sArr14;
                    i28 = iM11307 ^ i16;
                    i27 = i15;
                    i30 = i14;
                    i41 = i41;
                    sArr14 = sArr8;
                    break;
                case -1000447110:
                case -467387975:
                    C1148.m4223(sb2, strM26821);
                    C0817.m3408(sb2, c3);
                    sArr14 = f68261;
                    i33 = 30;
                    if (C1875.m6086() != 0) {
                        iM113010 = ThreadFactoryC3888.m11306("֡ۧ") ^ i26;
                        i22 = ((iM113010 ^ i25) * (-32091)) ^ 344727567;
                        i23 = -1577770181;
                    } else {
                        iM113010 = (i26 - ThreadFactoryC3888.m11306("᩺᩸")) * 115;
                        i22 = ((iM113010 ^ i25) * (-30069)) ^ (-2131323712);
                        i23 = 488366666;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -984406769:
                case -160381712:
                    C2871.m8646();
                    if (C1461.f5957 > 0) {
                        iM113010 = C19806.m45029("ۨ᩷") ^ i25;
                        i22 = ((iM113010 ^ i26) * 23379) ^ (-1837293512);
                        i23 = 1323892766;
                    } else {
                        iM113010 = C19806.m45029("ܿ۫") ^ i26;
                        i22 = ((iM113010 ^ i25) * (-8709)) ^ (-669450379);
                        i23 = -607623868;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -966011185:
                case -814837296:
                    i13 = 0;
                    iM11307 = C19806.m45029("ۖۧ") ^ i25;
                    i14 = i13;
                    i15 = ((iM11307 ^ i26) * 19517) ^ (-1669470745);
                    i16 = 438281768;
                    i29 = i29;
                    i40 = i40;
                    sArr8 = sArr14;
                    i28 = iM11307 ^ i16;
                    i27 = i15;
                    i30 = i14;
                    i41 = i41;
                    sArr14 = sArr8;
                    break;
                case -946062998:
                case 119958845:
                    sb2 = sb2;
                    sArr6 = sArr14;
                    i8 = i40;
                    i41 = i41;
                    i9 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr15 = sArr15;
                    short[] sArr29 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr29;
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i10 = 1;
                        int iM1130110 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i26;
                        i37 = i10;
                        i27 = ((iM1130110 ^ i25) * (-20961)) ^ (-1308770338);
                        i29 = i9;
                        i40 = i8;
                        sArr5 = sArr6;
                        i28 = iM1130110 ^ (-1715706460);
                        sb2 = sb2;
                        i37 = i37;
                        sArr15 = sArr15;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr5;
                        short[] sArr210 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr210;
                    } else {
                        int iM450215 = (C19806.m45029("۠ۧ") + i26) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i27 = ((iM450215 ^ i25) * (-10185)) ^ (-265522048);
                        sArr15 = sArr15;
                        c5 = c5;
                        i29 = i9;
                        i38 = i38;
                        i40 = i8;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr6;
                        i28 = iM450215 ^ (-885793789);
                        sb2 = sb2;
                        i37 = 1;
                        short[] sArr111 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr111;
                    }
                    break;
                case -901995107:
                case -695634109:
                    if (c3 < 127) {
                        iM113010 = (C19806.m45029("᩶۟") ^ i25) * (-113);
                        i22 = ((iM113010 ^ i26) * 11381) ^ 1753975003;
                        i23 = -1742277974;
                    } else {
                        iM113010 = C19806.m45029("۫ܺ") ^ i25;
                        i22 = ((iM113010 ^ i26) * 15765) ^ (-1184588578);
                        i23 = -85852422;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -882240551:
                case 378326322:
                    if (C1875.f7103 < 0) {
                        sArr2 = sArr14;
                        iM11309 = ThreadFactoryC3888.m11306("ܽ۠") ^ i26;
                        i19 = ((iM11309 ^ i25) * 24119) ^ 997325198;
                        i21 = 1677134653;
                        i20 = iM11309 ^ i21;
                        sArr8 = sArr2;
                        i28 = i20;
                        i27 = i19;
                        sArr14 = sArr8;
                    } else {
                        sArr6 = sArr14;
                        i10 = i37;
                        i8 = i40;
                        i41 = i41;
                        i9 = i29;
                        sb2 = sb2;
                        i30 = i30;
                        i38 = i38;
                        c5 = c5;
                        sArr15 = sArr15;
                        short[] sArr211 = sArr10;
                        c3 = c3;
                        i39 = i39;
                        sArr4 = sArr211;
                        int iM1130111 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i26;
                        i37 = i10;
                        i27 = ((iM1130111 ^ i25) * (-20961)) ^ (-1308770338);
                        i29 = i9;
                        i40 = i8;
                        sArr5 = sArr6;
                        i28 = iM1130111 ^ (-1715706460);
                        sb2 = sb2;
                        i37 = i37;
                        sArr15 = sArr15;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr5;
                        short[] sArr212 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr212;
                    }
                    break;
                case -802081071:
                case 911118563:
                    sArr2 = sArr14;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr3 = sArr15;
                    i37 = i37;
                    sb = sb2;
                    short[] sArr30 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr30;
                    i34 = s * s2;
                    i35 = s * s;
                    i36 = 168402529;
                    if (C1419.f5860 < 0) {
                        iM11306 = (C19806.m45029("ۧ֨") ^ i25) * 11;
                        i27 = ((iM11306 ^ i26) * (-24569)) ^ (-1640995079);
                        i5 = 715199416;
                        int i49 = iM11306 ^ i5;
                        sb2 = sb;
                        i37 = i37;
                        sArr15 = sArr3;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = i49;
                        i29 = i4;
                        i40 = i3;
                        short[] sArr112 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr112;
                    } else {
                        sArr15 = sArr3;
                        sb2 = sb;
                        int iM450216 = (i25 - C19806.m45029("ۖۚ")) * (-71);
                        int i410 = ((iM450216 ^ i26) * (-8697)) ^ (-1784853439);
                        i12 = iM450216 ^ 1818504158;
                        i37 = i37;
                        sArr15 = sArr15;
                        i27 = i410;
                        i29 = i4;
                        i40 = i3;
                        char c8 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = i12;
                        c5 = c8;
                        short[] sArr213 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr213;
                    }
                    break;
                case -730488218:
                case 821662053:
                    RunnableC1564.m5345();
                    if (RunnableC3388.f12514 >= 0) {
                        iM113010 = (ThreadFactoryC3888.m11306("ۡ֡") ^ i25) * (-21);
                        i22 = ((iM113010 ^ i26) * (-2161)) ^ (-1541590894);
                        i23 = -163907407;
                    } else {
                        iM113010 = C19806.m45029("ۨ᩷") ^ i25;
                        i22 = ((iM113010 ^ i26) * 23379) ^ (-1837293512);
                        i23 = 1323892766;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -679907079:
                case 1324831685:
                    sArr2 = sArr14;
                    if (c3 != '<') {
                        iM11309 = ThreadFactoryC3888.m11306("֫ۢ") ^ i26;
                        i19 = ((iM11309 ^ i25) * 16109) ^ 1289516046;
                        i21 = 939351342;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i25;
                        i19 = ((iM11309 ^ i26) * 10213) ^ (-217900504);
                        i21 = 1692897186;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case -670177109:
                case 2145841072:
                    sArr2 = sArr14;
                    if (c3 != '&') {
                        iM11309 = (C19806.m45029("ۙܶ") ^ i25) * 49;
                        i19 = ((iM11309 ^ i26) * 10117) ^ (-1451629917);
                        i21 = 1022902407;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ܳۖ") ^ i26) * (-51);
                        i19 = ((iM11309 ^ i25) * (-32427)) ^ (-988037607);
                        i21 = 669889167;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case -590546924:
                case 307683263:
                    sArr2 = sArr14;
                    if (c3 != '>') {
                        iM11309 = ThreadFactoryC3888.m11306("ۚ֡") ^ i26;
                        i19 = ((iM11309 ^ i25) * (-17063)) ^ 1019042950;
                        i21 = -1094513155;
                    } else {
                        iM11309 = (C19806.m45029("ۛۚ") + i25) * 109;
                        i19 = ((iM11309 ^ i26) * 32449) ^ (-945778262);
                        i21 = -421059033;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case -497198343:
                case 142891236:
                    if (c3 >= ' ') {
                        iM113010 = (ThreadFactoryC3888.m11306("ۙ۬") + i26) * 69;
                        i22 = ((iM113010 ^ i25) * (-19791)) ^ (-1768875763);
                        i23 = -1370896387;
                    } else {
                        iM113010 = C19806.m45029("۫ܺ") ^ i25;
                        i22 = ((iM113010 ^ i26) * 15765) ^ (-1184588578);
                        i23 = -85852422;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case -423497298:
                case 543615818:
                    sArr14 = sArr14;
                    i40 = i40;
                    i41 = i41;
                    i29 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr15 = sArr15;
                    i37 = i37;
                    sb2 = sb2;
                    short[] sArr31 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr31;
                    if ((i35 + i36) - i34 < 0) {
                        iM45029 = (i26 - C19806.m45029("᩻۫")) * 19;
                        i6 = ((iM45029 ^ i25) * (-10001)) ^ 5464050;
                        i7 = 913303192;
                    } else {
                        iM45029 = C19806.m45029("۟᩸") ^ i26;
                        i6 = ((iM45029 ^ i25) * 3645) ^ 1440484220;
                        i7 = -1282255300;
                    }
                    i29 = i29;
                    i40 = i40;
                    sArr5 = sArr14;
                    i28 = iM45029 ^ i7;
                    i27 = i6;
                    sb2 = sb2;
                    i37 = i37;
                    sArr15 = sArr15;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr5;
                    short[] sArr214 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr214;
                    break;
                case -359741986:
                case -223539428:
                    c3 = c3;
                    c5 = c5;
                    sArr2 = sArr14;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    short[] sArr32 = f68261;
                    i38 = 2;
                    i39 = 1;
                    if (C1668.f6641 >= 0) {
                        sArr4 = sArr32;
                        sArr3 = sArr15;
                        i37 = i37;
                        i39 = 1;
                        sb = sb2;
                        iM11306 = C19806.m45029("ۧۙ") ^ i26;
                        i27 = ((iM11306 ^ i25) * (-14819)) ^ (-2004176216);
                        i5 = 2112587777;
                        int i411 = iM11306 ^ i5;
                        sb2 = sb;
                        i37 = i37;
                        sArr15 = sArr3;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = i411;
                        i29 = i4;
                        i40 = i3;
                        short[] sArr113 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr113;
                    } else {
                        int iM450217 = (C19806.m45029("֫ۧ") ^ i26) * (-83);
                        int i50 = ((iM450217 ^ i25) * (-23175)) ^ (-603848892);
                        i29 = i4;
                        i30 = i30;
                        i41 = i41;
                        i40 = i3;
                        sArr14 = sArr2;
                        i28 = iM450217 ^ (-3713958);
                        c3 = c3;
                        sArr10 = sArr32;
                        i27 = i50;
                        c5 = c5;
                        i38 = 2;
                    }
                    break;
                case -334268618:
                case 1235156784:
                    RunnableC1895.m6170();
                    C0629.m2907();
                    sArr6 = sArr14;
                    i10 = i37;
                    i8 = i40;
                    i41 = i41;
                    i9 = i29;
                    sb2 = sb2;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr15 = sArr15;
                    short[] sArr215 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr215;
                    int iM1130112 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i26;
                    i37 = i10;
                    i27 = ((iM1130112 ^ i25) * (-20961)) ^ (-1308770338);
                    i29 = i9;
                    i40 = i8;
                    sArr5 = sArr6;
                    i28 = iM1130112 ^ (-1715706460);
                    sb2 = sb2;
                    i37 = i37;
                    sArr15 = sArr15;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr5;
                    short[] sArr216 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr216;
                    break;
                case -293332156:
                case 2147210387:
                    sArr14 = sArr14;
                    i40 = i40;
                    i41 = i41;
                    i29 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr15 = sArr15;
                    i37 = i37;
                    sb2 = sb2;
                    short[] sArr33 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr33;
                    if (str != null) {
                        iM45029 = C19806.m45029("ۘۜ") ^ i26;
                        i6 = ((iM45029 ^ i25) * 5445) ^ 238362978;
                        i7 = -1617847308;
                    } else {
                        iM45029 = (C19806.m45029("ܽ᩷") ^ i25) * (-87);
                        i6 = ((iM45029 ^ i26) * (-30559)) ^ 579126766;
                        i7 = -1874336499;
                    }
                    i29 = i29;
                    i40 = i40;
                    sArr5 = sArr14;
                    i28 = iM45029 ^ i7;
                    i27 = i6;
                    sb2 = sb2;
                    i37 = i37;
                    sArr15 = sArr15;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr5;
                    short[] sArr217 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr217;
                    break;
                case -165631443:
                case 1060938772:
                    sArr2 = sArr14;
                    strM26821 = C10634.m26821(sArr13, i29, 2, i42);
                    if (c3 != c5) {
                        iM11309 = (i26 - ThreadFactoryC3888.m11306("᩷֫")) * 55;
                        i19 = ((iM11309 ^ i25) * 16699) ^ (-55335516);
                        i21 = 36473443;
                    } else {
                        iM11309 = (C19806.m45029("ۜۢ") ^ i25) * (-105);
                        i19 = ((iM11309 ^ i26) * (-9419)) ^ 2001354852;
                        i21 = -1429309009;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case -9444623:
                case 1107878911:
                    sArr4 = sArr10;
                    i42 = o.a.D;
                    iM45029 = C19806.m45029("ۤۚ") ^ i25;
                    i6 = ((iM45029 ^ i26) * 15753) ^ (-1488742929);
                    i7 = -1226704239;
                    i29 = i29;
                    i40 = i40;
                    sArr5 = sArr14;
                    i28 = iM45029 ^ i7;
                    i27 = i6;
                    sb2 = sb2;
                    i37 = i37;
                    sArr15 = sArr15;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr5;
                    short[] sArr218 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr218;
                    break;
                case 114870007:
                case 1629399404:
                    sArr2 = sArr14;
                    c5 = '\r';
                    sArr13 = f68261;
                    i29 = 7;
                    if (!C3577.m10565()) {
                        sArr14 = sArr2;
                        iM113010 = ThreadFactoryC3888.m11306("֡ۧ") ^ i26;
                        i22 = ((iM113010 ^ i25) * (-32091)) ^ 344727567;
                        i23 = -1577770181;
                        i28 = iM113010 ^ i23;
                        i27 = i22;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ܽܽ") ^ i26;
                        i19 = ((iM11309 ^ i25) * (-28819)) ^ 654843695;
                        i21 = -737325031;
                        i20 = iM11309 ^ i21;
                        sArr8 = sArr2;
                        i28 = i20;
                        i27 = i19;
                        sArr14 = sArr8;
                    }
                    break;
                case 273465337:
                case 946049918:
                    C0278.m1789();
                    if (RunnableC3388.f12514 >= 0) {
                        iM113010 = C19806.m45029("ۨ᩷") ^ i25;
                        i22 = ((iM113010 ^ i26) * 23379) ^ (-1837293512);
                        i23 = 1323892766;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("֡ۧ") ^ i26;
                        i22 = ((iM113010 ^ i25) * (-32091)) ^ 344727567;
                        i23 = -1577770181;
                    }
                    i28 = iM113010 ^ i23;
                    i27 = i22;
                    break;
                case 280031303:
                case 1921927690:
                    C3577.m10565();
                    return null;
                case 341510892:
                case 1960273790:
                    C0050.m946();
                    if (C2249.f8050 < 0) {
                        iM113010 = (i25 - C19806.m45029("ܳ᩷")) * 83;
                        i22 = ((iM113010 ^ i26) * (-8473)) ^ 2118732287;
                        i23 = 1592971101;
                        i28 = iM113010 ^ i23;
                        i27 = i22;
                    } else {
                        sArr6 = sArr14;
                        i10 = i37;
                        i8 = i40;
                        i41 = i41;
                        i9 = i29;
                        sb2 = sb2;
                        i30 = i30;
                        i38 = i38;
                        c5 = c5;
                        sArr15 = sArr15;
                        short[] sArr219 = sArr10;
                        c3 = c3;
                        i39 = i39;
                        sArr4 = sArr219;
                        int iM1130113 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i26;
                        i37 = i10;
                        i27 = ((iM1130113 ^ i25) * (-20961)) ^ (-1308770338);
                        i29 = i9;
                        i40 = i8;
                        sArr5 = sArr6;
                        i28 = iM1130113 ^ (-1715706460);
                        sb2 = sb2;
                        i37 = i37;
                        sArr15 = sArr15;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr5;
                        short[] sArr2110 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr2110;
                    }
                    break;
                case 526282207:
                case 1194354848:
                    i4 = i29;
                    sArr2 = sArr14;
                    sArr11 = f68261;
                    i41 = 3;
                    if (C1419.f5860 < 0) {
                        int iM450218 = (C19806.m45029("ۚۧ") ^ i25) * 47;
                        i19 = ((iM450218 ^ i26) * 26461) ^ 945612283;
                        i20 = iM450218 ^ (-96590718);
                        i29 = i4;
                        i40 = 2;
                        sArr8 = sArr2;
                        i28 = i20;
                        i27 = i19;
                        sArr14 = sArr8;
                    } else {
                        i41 = 3;
                        i3 = 2;
                        c5 = c5;
                        short[] sArr220 = sArr10;
                        c3 = c3;
                        i39 = i39;
                        sArr4 = sArr220;
                        int iM450219 = (i25 - C19806.m45029("ۖۚ")) * (-71);
                        int i412 = ((iM450219 ^ i26) * (-8697)) ^ (-1784853439);
                        i12 = iM450219 ^ 1818504158;
                        i37 = i37;
                        sArr15 = sArr15;
                        i27 = i412;
                        i29 = i4;
                        i40 = i3;
                        char c9 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr2;
                        i28 = i12;
                        c5 = c9;
                        short[] sArr2111 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr2111;
                    }
                    break;
                case 542554128:
                case 1657925564:
                    ThreadFactoryC3888.m11302(sb2, c3);
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM1130114 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM1130114 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM1130114 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case 771172766:
                case 1115308378:
                    sArr14 = sArr14;
                    i40 = i40;
                    i41 = i41;
                    i29 = i29;
                    if (i30 < C2871.m8641(str)) {
                        iM11307 = (i25 - ThreadFactoryC3888.m11306("ۗ᩷")) * (-73);
                        i14 = i30;
                        i15 = ((iM11307 ^ i26) * 28193) ^ 206373960;
                        i16 = 730579135;
                    } else {
                        i14 = i30;
                        iM11307 = (i26 - ThreadFactoryC3888.m11306("֫᩹")) * 31;
                        i15 = ((iM11307 ^ i25) * 5315) ^ (-619818203);
                        i16 = -336195405;
                    }
                    i29 = i29;
                    i40 = i40;
                    sArr8 = sArr14;
                    i28 = iM11307 ^ i16;
                    i27 = i15;
                    i30 = i14;
                    i41 = i41;
                    sArr14 = sArr8;
                    break;
                case 839097178:
                case 1877986972:
                    sArr2 = sArr14;
                    sArr7 = sArr10;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    c3 = c3;
                    i38 = i38;
                    i39 = i39;
                    c5 = c5;
                    C19806.m45023(sb2, c2);
                    int iM113020 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i26;
                    sArr4 = sArr7;
                    i27 = ((iM113020 ^ i25) * (-26895)) ^ (-1281017115);
                    i12 = iM113020 ^ 760883958;
                    i29 = i4;
                    i40 = i3;
                    char c10 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr2;
                    i28 = i12;
                    c5 = c10;
                    short[] sArr2112 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr2112;
                    break;
                case 929738637:
                case 1956664157:
                    sArr14 = sArr14;
                    i40 = i40;
                    i41 = i41;
                    i29 = i29;
                    i30 = i30;
                    i38 = i38;
                    c5 = c5;
                    sArr15 = sArr15;
                    i37 = i37;
                    sb2 = sb2;
                    short[] sArr34 = sArr10;
                    c3 = c3;
                    i39 = i39;
                    sArr4 = sArr34;
                    if (C2249.m6911(str)) {
                        iM45029 = (C19806.m45029("ܽ᩷") ^ i25) * (-87);
                        i6 = ((iM45029 ^ i26) * (-30559)) ^ 579126766;
                        i7 = -1874336499;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۙ") ^ i26;
                        i6 = ((iM45029 ^ i25) * 14845) ^ (-1632482061);
                        i7 = -132405396;
                    }
                    i29 = i29;
                    i40 = i40;
                    sArr5 = sArr14;
                    i28 = iM45029 ^ i7;
                    i27 = i6;
                    sb2 = sb2;
                    i37 = i37;
                    sArr15 = sArr15;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr5;
                    short[] sArr2113 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr2113;
                    break;
                case 1015122133:
                case 2123386879:
                    C1148.m4223(sb2, C2704.m8240(f68261, 20, 4, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM1130115 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM1130115 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM1130115 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case 1064264141:
                case 1092625735:
                    sArr2 = sArr14;
                    sArr7 = sArr10;
                    i3 = i40;
                    i41 = i41;
                    i4 = i29;
                    i30 = i30;
                    c3 = c3;
                    i38 = i38;
                    i39 = i39;
                    c5 = c5;
                    if (C3535.m10420(str, CallableC1627.m5502(sArr7, i38, i39, i42))) {
                        sArr4 = sArr7;
                        sArr15 = sArr15;
                        c = c2;
                        i11 = i37;
                        int iM4502110 = (C19806.m45029("֫᩺") + i25) * 39;
                        i29 = i4;
                        i40 = i3;
                        sArr5 = sArr2;
                        i28 = iM4502110 ^ 1166584740;
                        i27 = ((iM4502110 ^ i26) * (-8205)) ^ (-1681030897);
                        sb2 = sb2;
                        i37 = i11;
                        c2 = c;
                        sArr15 = sArr15;
                        c5 = c5;
                        i38 = i38;
                        i30 = i30;
                        i41 = i41;
                        sArr14 = sArr5;
                        short[] sArr2114 = sArr4;
                        i39 = i39;
                        c3 = c3;
                        sArr10 = sArr2114;
                    }
                    int iM113021 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i26;
                    sArr4 = sArr7;
                    i27 = ((iM113021 ^ i25) * (-26895)) ^ (-1281017115);
                    i12 = iM113021 ^ 760883958;
                    i29 = i4;
                    i40 = i3;
                    char c11 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr2;
                    i28 = i12;
                    c5 = c11;
                    short[] sArr2115 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr2115;
                    break;
                case 1163801568:
                case 1168081917:
                    C2788.m8480(sb2, C2124.m6685(f68261, 24, 4, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM1130116 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM1130116 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM1130116 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
                case 1318391728:
                case 1834262674:
                    sArr2 = sArr14;
                    sArr12 = f68261;
                    i31 = 5;
                    i32 = 2;
                    if (C1148.f5161 <= 0) {
                        iM11309 = ThreadFactoryC3888.m11306("ܽ۠") ^ i26;
                        i19 = ((iM11309 ^ i25) * 24119) ^ 997325198;
                        i21 = 1677134653;
                    } else {
                        iM11309 = C19806.m45029("ܺ۫") ^ i26;
                        i19 = ((iM11309 ^ i25) * (-25973)) ^ 327380493;
                        i21 = 1979560957;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                case 1354316495:
                case 1487121128:
                    sArr4 = sArr10;
                    i42 = 12708;
                    iM45029 = C19806.m45029("ۤۚ") ^ i25;
                    i6 = ((iM45029 ^ i26) * 15753) ^ (-1488742929);
                    i7 = -1226704239;
                    i29 = i29;
                    i40 = i40;
                    sArr5 = sArr14;
                    i28 = iM45029 ^ i7;
                    i27 = i6;
                    sb2 = sb2;
                    i37 = i37;
                    sArr15 = sArr15;
                    c5 = c5;
                    i38 = i38;
                    i30 = i30;
                    i41 = i41;
                    sArr14 = sArr5;
                    short[] sArr2116 = sArr4;
                    i39 = i39;
                    c3 = c3;
                    sArr10 = sArr2116;
                    break;
                case 1441973335:
                case 1978000624:
                    sArr2 = sArr14;
                    if (c3 != c2) {
                        iM11309 = ThreadFactoryC3888.m11306("֡ܰ") ^ i25;
                        i19 = ((iM11309 ^ i26) * (-22287)) ^ 1476274316;
                        i21 = 1356976360;
                    } else {
                        iM11309 = C19806.m45029("ۗ᩺") ^ i26;
                        i19 = ((iM11309 ^ i25) * (-31843)) ^ 1086689502;
                        i21 = -2114095932;
                    }
                    i20 = iM11309 ^ i21;
                    sArr8 = sArr2;
                    i28 = i20;
                    i27 = i19;
                    sArr14 = sArr8;
                    break;
                default:
                    C2788.m8480(sb2, C3577.m10571(f68261, 15, 5, i42));
                    i = i40;
                    sArr = sArr11;
                    i2 = i41;
                    int iM1130117 = (ThreadFactoryC3888.m11306("ۤ᩺") + i25) * (-25);
                    sArr11 = sArr;
                    i27 = ((iM1130117 ^ i26) * 13047) ^ (-1390787744);
                    i41 = i2;
                    sArr14 = sArr14;
                    i28 = iM1130117 ^ (-1648104701);
                    i29 = i29;
                    i40 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47097(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = -306975892;
        int i4 = RunnableC1606.f6488;
        int i5 = C3577.f13150;
        int iM45029 = C19806.m45029("ۧۛ") ^ i5;
        int i6 = ((iM45029 ^ i4) * 21789) ^ (-743102715);
        int i7 = 1416920433;
        while (true) {
            i3 = ((((i3 ^ i4) * 4507) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2080553252:
                case -1255549140:
                    i2++;
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ۙ")) * (-43);
                    i6 = ((iM45029 ^ i5) * (-28177)) ^ (-2102833324);
                    i7 = -531666240;
                    break;
                case -2011591482:
                case 995622499:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ۤ᩶") ^ i4) * 127;
                        i6 = ((iM45029 ^ i5) * 17557) ^ (-2085738810);
                        i7 = 1519002128;
                    } else {
                        iM45029 = C19806.m45029("ۡۤ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 5153) ^ 342055877;
                        i7 = -2013725556;
                    }
                    break;
                case -1868580050:
                case 1113427421:
                    if (RunnableC1895.m6170() == 0) {
                        iM45029 = (C19806.m45029("ۤ᩶") ^ i4) * 127;
                        i6 = ((iM45029 ^ i5) * 17557) ^ (-2085738810);
                        i7 = 1519002128;
                    } else {
                        iM45029 = (C19806.m45029("᩷۟") ^ i5) * 23;
                        i6 = ((iM45029 ^ i4) * (-10547)) ^ 452806556;
                        i7 = 516353161;
                    }
                    break;
                case -1782080403:
                case -786113060:
                    C0671.m3008();
                    break;
                case -1590289370:
                case -25165783:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("᩷۟") ^ i5) * 23;
                        i6 = ((iM45029 ^ i4) * (-10547)) ^ 452806556;
                        i7 = 516353161;
                    } else {
                        iM45029 = (C19806.m45029("֡۟") ^ i5) * (-11);
                        i6 = ((iM45029 ^ i4) * (-2521)) ^ 690006542;
                        i7 = -2013085779;
                    }
                    break;
                case -1484053763:
                case 7296091:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("᩺۟") ^ i4) * (-59);
                        i6 = ((iM45029 ^ i5) * (-22493)) ^ 434968981;
                        i7 = -72300052;
                    } else {
                        iM45029 = C19806.m45029("ۗۘ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-4267)) ^ 1303091944;
                        i7 = -1216910763;
                    }
                    break;
                case -1137102841:
                case 666663044:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۡ") + i5) * (-55);
                        i6 = ((iM45029 ^ i4) * 31717) ^ (-195400494);
                        i7 = 892172597;
                    } else {
                        iM45029 = (C19806.m45029("֡۟") ^ i5) * (-11);
                        i6 = ((iM45029 ^ i4) * (-2521)) ^ 690006542;
                        i7 = -2013085779;
                    }
                    break;
                case -826678282:
                case -485656272:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩵") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-19557)) ^ (-650441788);
                        i7 = -2064490696;
                    } else {
                        iM45029 = (C19806.m45029("᩺۟") ^ i4) * (-59);
                        i6 = ((iM45029 ^ i5) * (-22493)) ^ 434968981;
                        i7 = -72300052;
                    }
                    break;
                case -697319590:
                case 663399270:
                    if (C0817.f3443) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۖ")) * 7;
                        i6 = ((iM45029 ^ i4) * 24045) ^ (-1687225569);
                        i7 = -1675779752;
                    } else {
                        iM45029 = (C19806.m45029("ۤ᩶") ^ i4) * 127;
                        i6 = ((iM45029 ^ i5) * 17557) ^ (-2085738810);
                        i7 = 1519002128;
                    }
                    break;
                case -566279257:
                case 724934334:
                    ThreadFactoryC3888.m11302(sb, ' ');
                    if (C1148.m4232() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") ^ i5) * (-25);
                        i6 = ((iM45029 ^ i4) * 11419) ^ 2044274528;
                        i7 = 475977721;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֡ۚ")) * 45;
                        i6 = ((iM45029 ^ i5) * 20167) ^ 1254274800;
                        i7 = -1644612481;
                    }
                    break;
                case -438512898:
                case 1209883858:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") ^ i5) * (-25);
                        i6 = ((iM45029 ^ i4) * 11419) ^ 2044274528;
                        i7 = 475977721;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۛ") ^ i5) * 109;
                        i6 = ((iM45029 ^ i4) * (-10275)) ^ (-398198414);
                        i7 = -833247879;
                    }
                    break;
                case -162918940:
                case 5284745:
                    C2249.m6915();
                    RunnableC0195.m1431();
                    iM45029 = (C19806.m45029("֡۟") ^ i5) * (-11);
                    i6 = ((iM45029 ^ i4) * (-2521)) ^ 690006542;
                    i7 = -2013085779;
                    break;
                case 31059676:
                case 1691546593:
                    if (C0817.m3399()) {
                        iM45029 = (C19806.m45029("᩻᩶") + i4) * (-3);
                        i6 = ((iM45029 ^ i5) * 13059) ^ 267601840;
                        i7 = 2020856245;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") ^ i5) * (-25);
                        i6 = ((iM45029 ^ i4) * 11419) ^ 2044274528;
                        i7 = 475977721;
                    }
                    break;
                case 507505762:
                case 829930512:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("֨ۨ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-32109)) ^ 99159468;
                        i7 = -1962568839;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") ^ i5) * (-25);
                        i6 = ((iM45029 ^ i4) * 11419) ^ 2044274528;
                        i7 = 475977721;
                    }
                    break;
                case 674498761:
                case 1460057870:
                    if (i2 < i) {
                        iM45029 = C19806.m45029("᩸ܿ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 29047) ^ 811324749;
                        i7 = -991857759;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ᩳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-18565)) ^ (-1845914724);
                        i7 = -294770713;
                    }
                    break;
                case 767226599:
                case 1117230909:
                    i2 = 0;
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ۙ")) * (-43);
                    i6 = ((iM45029 ^ i5) * (-28177)) ^ (-2102833324);
                    i7 = -531666240;
                    break;
                case 1393018329:
                case 1956874944:
                    break;
                case 1516032026:
                case 1747973751:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۤ᩶") ^ i4) * 127;
                        i6 = ((iM45029 ^ i5) * 17557) ^ (-2085738810);
                        i7 = 1519002128;
                    } else {
                        iM45029 = C19806.m45029("ܰۙ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-19767)) ^ 313484174;
                        i7 = -933390313;
                    }
                    break;
                default:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("᩺۟") ^ i4) * (-59);
                        i6 = ((iM45029 ^ i5) * (-22493)) ^ 434968981;
                        i7 = -72300052;
                    } else {
                        iM45029 = (C19806.m45029("ۤ᩶") ^ i4) * 127;
                        i6 = ((iM45029 ^ i5) * 17557) ^ (-2085738810);
                        i7 = 1519002128;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m47113() {
        return this.f68267;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m47117() {
        return this.f68268;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47110(byte[] bArr) {
        this.f68268 = bArr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m47107() {
        return this.f68269;
    }
}
