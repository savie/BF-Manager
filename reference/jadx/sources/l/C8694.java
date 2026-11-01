package l;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: renamed from: l.ۡۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8694 {

    /* JADX INFO: renamed from: ᩳᩴ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f29905 = {1850, -23006, -22979, -23007, -22979, -22997, -23001, -23005, -22979, -23006, -23005, -23005, -23001, -23002, -22979, -23008, -22979, -23006, -22979, -23004, -23006, -22979, -23008, -22979, -23006, -23008, -23007, -22979, -23005, -22979, -23008, -23001, -23006, -22979, -23008, -22979, -23006, -23008, -23007, -22979, -23005, -22979, -23008, -23002, -22973, -22978, -23007, -23002, -23003, -22973, -22978, -23008, -22997, -23001, -22973, -22978, -23002, -23007, -23006};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f29906;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BigInteger f29907;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29908;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final BigInteger f29909;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f29910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f29911;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f29912;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x045a A[PHI: r15 r16
      0x045a: PHI (r15v4 int) = (r15v1 int), (r15v1 int), (r15v3 int), (r15v1 int) binds: [B:17:0x0095, B:13:0x0074, B:135:0x0458, B:192:0x045a] A[DONT_GENERATE, DONT_INLINE]
      0x045a: PHI (r16v9 int) = (r16v1 int), (r16v1 int), (r16v5 int), (r16v1 int) binds: [B:17:0x0095, B:13:0x0074, B:135:0x0458, B:192:0x045a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5 A[PHI: r4 r17
      0x01d5: PHI (r4v3 byte[]) = (r4v2 byte[]), (r4v1 byte[]), (r4v1 byte[]) binds: [B:73:0x01d3, B:37:0x00e1, B:148:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r17v5 java.lang.String) = (r17v3 java.lang.String), (r17v2 java.lang.String), (r17v2 java.lang.String) binds: [B:73:0x01d3, B:37:0x00e1, B:148:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8694 m22516(PublicKey publicKey) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        String str;
        String strM9788;
        PublicKey publicKey2 = publicKey;
        ECPublicKey eCPublicKey = null;
        DSAParams params = null;
        byte[] encoded = null;
        ASN1Encodable parameters = null;
        String id = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 986625276;
        int i7 = C2249.f8050;
        int i8 = C1066.f4915;
        int iM45029 = (C19806.m45029("᩷ۘ") ^ i8) * (-103);
        int i9 = ((iM45029 ^ i7) * (-6627)) ^ 187616224;
        int i10 = iM45029 ^ (-278564327);
        String str2 = null;
        short[] sArr = null;
        int i11 = 0;
        boolean z = false;
        int iBitLength = 0;
        short s2 = 0;
        int fieldSize = 0;
        byte b = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-14963)) >> 31));
            switch (i6) {
                case -2139902736:
                case 160825745:
                    C7105.m18985();
                    if (!C0629.m2907()) {
                        iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                        i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                        i3 = 1214502892;
                        i10 = iM11307 ^ i3;
                        publicKey2 = publicKey;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("۟᩶")) * 61;
                        i = ((iM11306 ^ i8) * (-9927)) ^ 1340452278;
                        i2 = 1666967497;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    }
                    break;
                case -2138181277:
                case 691076205:
                    fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
                    iM11306 = C19806.m45029("ۢۛ") ^ i8;
                    i = ((iM11306 ^ i7) * (-20363)) ^ 324055616;
                    i2 = -1716130151;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -2043815251:
                case -613160450:
                    b = 0;
                    if (publicKey2 instanceof ECPublicKey) {
                        iM11306 = (C19806.m45029("۠֨") ^ i7) * (-93);
                        i = ((iM11306 ^ i8) * (-16401)) ^ 963117164;
                        i2 = 2082533149;
                    } else {
                        iM11306 = (C19806.m45029("᩷ܳ") + i8) * 61;
                        i = ((iM11306 ^ i7) * (-22395)) ^ 1858537689;
                        i2 = 1579970794;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1946095136:
                case 1279722184:
                    i11 = 42515;
                    iM11306 = C19806.m45029("ۜ۟") ^ i7;
                    i = ((iM11306 ^ i8) * (-31643)) ^ (-1982948253);
                    i2 = 1855883236;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1783487187:
                case 1283162280:
                    C7105.m18985();
                    if (C3660.f13403 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܺ") ^ i8) * (-27);
                        i = ((iM11306 ^ i7) * 965) ^ 1469926851;
                        i2 = -2010203090;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") ^ i8) * 31;
                        i = ((iM11306 ^ i7) * 14219) ^ 235157543;
                        i2 = -147421390;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1655774315:
                case -503220305:
                    try {
                        id = ((ASN1ObjectIdentifier) parameters).getId();
                    } catch (Exception unused) {
                        id = str2;
                    }
                    iM11306 = C19806.m45029("᩵᩺") ^ i7;
                    i = ((iM11306 ^ i8) * (-16405)) ^ 1207891126;
                    i2 = 563733042;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1643643458:
                case -851664982:
                    C0278.m1789();
                    iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                    i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                    i3 = 1214502892;
                    i10 = iM11307 ^ i3;
                    publicKey2 = publicKey;
                    break;
                case -1639447752:
                case -1013684542:
                    String algorithm = publicKey.getAlgorithm();
                    if (!C2704.f10408) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("۟᩶")) * 61;
                        i = ((iM11306 ^ i8) * (-9927)) ^ 1340452278;
                        i2 = 1666967497;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    } else {
                        if (C0050.f912 > 0) {
                            return new C8694(0, algorithm, 0, null, null, null, null);
                        }
                        iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                        i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                        i3 = 1214502892;
                        i10 = iM11307 ^ i3;
                        publicKey2 = publicKey;
                    }
                    break;
                case -1593748431:
                case 1744218952:
                    eCPublicKey = (ECPublicKey) publicKey2;
                    if (eCPublicKey.getParams() == null) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۛ") ^ i8) * 39;
                        i = ((iM11306 ^ i7) * (-18413)) ^ (-2046141485);
                        i2 = -1160718518;
                    } else {
                        iM11306 = C19806.m45029("᩹ܰ") ^ i7;
                        i = ((iM11306 ^ i8) * (-18583)) ^ (-1639792184);
                        i2 = 1089313755;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1495805888:
                case 1480221912:
                    if (C1875.f7103 < 0) {
                        iM11307 = (i7 - C19806.m45029("֡ۖ")) * (-57);
                        i9 = ((iM11307 ^ i8) * (-25449)) ^ (-1212106001);
                        i3 = -36991840;
                        i10 = iM11307 ^ i3;
                        publicKey2 = publicKey;
                    } else {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i8;
                        i = ((iM11306 ^ i7) * 651) ^ 1186467939;
                        i2 = 1814745528;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1447104370:
                case 1555212673:
                    i4 = s2 * s;
                    int i12 = s2 + 12595;
                    if (!RunnableC3388.m10064()) {
                        i5 = i12;
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܺ") ^ i8) * (-27);
                        i = ((iM11306 ^ i7) * 965) ^ 1469926851;
                        i2 = -2010203090;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    } else {
                        int iM11308 = (i8 - ThreadFactoryC3888.m11306("ۖ᩸")) * (-99);
                        i10 = iM11308 ^ (-1927100224);
                        i5 = i12;
                        i9 = ((iM11308 ^ i7) * 12229) ^ (-1628946);
                        publicKey2 = publicKey;
                    }
                    break;
                case -1379420034:
                case 2078983272:
                    if (z) {
                        iM11306 = C19806.m45029("᩺۟") ^ i7;
                        i = ((iM11306 ^ i8) * 23687) ^ (-533131450);
                        i2 = 1563330911;
                    } else {
                        id = str2;
                        iM11306 = C19806.m45029("᩵᩺") ^ i7;
                        i = ((iM11306 ^ i8) * (-16405)) ^ 1207891126;
                        i2 = 563733042;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1359147768:
                case 960174881:
                    if (publicKey2 instanceof RSAPublicKey) {
                        iM11306 = C19806.m45029("ۖܰ") ^ i8;
                        i = ((iM11306 ^ i7) * (-1595)) ^ (-1400262360);
                        i2 = -2028777138;
                    } else {
                        iM11306 = C19806.m45029("ܳۜ") ^ i7;
                        i = ((iM11306 ^ i8) * 16721) ^ 532626395;
                        i2 = 454057624;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1272266799:
                case 2025478945:
                    if (!C2704.f10408) {
                        iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                        i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                        i3 = 1214502892;
                        i10 = iM11307 ^ i3;
                        publicKey2 = publicKey;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܺ") ^ i8) * (-27);
                        i = ((iM11306 ^ i7) * 965) ^ 1469926851;
                        i2 = -2010203090;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1251268393:
                case 1479678950:
                    i11 = 47904;
                    iM11306 = C19806.m45029("ۜ۟") ^ i7;
                    i = ((iM11306 ^ i8) * (-31643)) ^ (-1982948253);
                    i2 = 1855883236;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1114997928:
                case -663921451:
                    iBitLength = params.getP().bitLength();
                    iM11306 = (i7 - C19806.m45029("۠ۧ")) * (-47);
                    i = ((iM11306 ^ i8) * 10179) ^ (-967601396);
                    i2 = -169504554;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -1092163456:
                case 610035976:
                    iBitLength = 0;
                    iM11306 = (i7 - C19806.m45029("۠ۧ")) * (-47);
                    i = ((iM11306 ^ i8) * 10179) ^ (-967601396);
                    i2 = -169504554;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -914041643:
                case -491805894:
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey2;
                    String algorithm2 = publicKey.getAlgorithm();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۙ") ^ i8) * 31;
                        i = ((iM11306 ^ i7) * 14219) ^ 235157543;
                        i2 = -147421390;
                    } else {
                        BigInteger modulus = rSAPublicKey.getModulus();
                        if (CallableC1627.m5507() != 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                            i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                            i3 = 1214502892;
                            i10 = iM11307 ^ i3;
                            publicKey2 = publicKey;
                        } else {
                            int iBitLength2 = modulus.bitLength();
                            BigInteger publicExponent = rSAPublicKey.getPublicExponent();
                            if (C0671.f2816 == 0) {
                                BigInteger modulus2 = rSAPublicKey.getModulus();
                                if (C2477.f9839 > 0) {
                                    return new C8694(1, algorithm2, iBitLength2, publicExponent, modulus2, null, null);
                                }
                            }
                            iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i8;
                            i = ((iM11306 ^ i7) * 14469) ^ 106000660;
                            i2 = 63762668;
                        }
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -675237226:
                case 534801553:
                    if (C3660.m10791() == 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("۟᩶")) * 61;
                        i = ((iM11306 ^ i8) * (-9927)) ^ 1340452278;
                        i2 = 1666967497;
                    } else {
                        iM11306 = C19806.m45029("ܰ᩷") ^ i8;
                        i = ((iM11306 ^ i7) * 651) ^ 1186467939;
                        i2 = 1814745528;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -503710216:
                case -247362110:
                    String algorithm3 = publicKey.getAlgorithm();
                    if (id != null) {
                        switch (ThreadFactoryC3888.m11306(id)) {
                            case 367694928:
                                if (!C1460.m5058(id, C2477.m7604(f29905, 1, 19, i11))) {
                                    b = -1;
                                }
                                break;
                            case 1290711797:
                                if (!C1460.m5058(id, C2871.m8640(f29905, 20, 12, i11))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 1290711798:
                                if (!C1460.m5058(id, C0278.m1774(f29905, 32, 12, i11))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                strM9788 = C3286.m9788(f29905, 44, 5, i11);
                                str = strM9788;
                                break;
                            case 1:
                                strM9788 = C0278.m1774(f29905, 49, 5, i11);
                                str = strM9788;
                                break;
                            case 2:
                                strM9788 = C1668.m5577(f29905, 54, 5, i11);
                                str = strM9788;
                                break;
                            default:
                                str = str2;
                                break;
                        }
                    } else {
                        str = str2;
                    }
                    return new C8694(2, algorithm3, fieldSize, null, null, str, id);
                case -66511922:
                case 79504406:
                    encoded = publicKey.getEncoded();
                    str2 = null;
                    if (encoded == null) {
                        id = str2;
                        iM11306 = C19806.m45029("᩵᩺") ^ i7;
                        i = ((iM11306 ^ i8) * (-16405)) ^ 1207891126;
                        i2 = 563733042;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩹") ^ i8;
                        i = ((iM11306 ^ i7) * 8137) ^ 1187221827;
                        i2 = 615497436;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case -8725234:
                case 402961782:
                    sArr = f29905;
                    c = 0;
                    if (C0962.m3746() >= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                        i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                        i3 = 1214502892;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۫֡") ^ i7;
                        i9 = ((iM11307 ^ i8) * (-15583)) ^ 370696930;
                        i3 = -755996750;
                    }
                    i10 = iM11307 ^ i3;
                    publicKey2 = publicKey;
                    break;
                case 65070199:
                case 217579953:
                    C0671.m3008();
                    if (C1419.f5860 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܺ") ^ i8) * (-27);
                        i = ((iM11306 ^ i7) * 965) ^ 1469926851;
                        i2 = -2010203090;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۖ") + i8) * (-95);
                        i = ((iM11306 ^ i7) * 11227) ^ 1057335567;
                        i2 = -1471417092;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 97248607:
                case 1234440517:
                    C0962.m3746();
                    return null;
                case 311683787:
                case 321987550:
                    s2 = sArr[c];
                    s = 50380;
                    if (C0278.f1572 <= 0) {
                        iM11307 = (i7 - C19806.m45029("֡ۖ")) * (-57);
                        i9 = ((iM11307 ^ i8) * (-25449)) ^ (-1212106001);
                        i3 = -36991840;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8;
                        i9 = ((iM11307 ^ i7) * (-6343)) ^ (-1716717346);
                        i3 = 957206455;
                    }
                    i10 = iM11307 ^ i3;
                    publicKey2 = publicKey;
                    break;
                case 633004700:
                case 796519757:
                    if (i4 - (i5 * i5) <= 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۙܶ")) * 43;
                        i = ((iM11306 ^ i8) * (-24043)) ^ 1391037760;
                        i2 = 483315054;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۜ") ^ i8;
                        i = ((iM11306 ^ i7) * 24361) ^ 1929675340;
                        i2 = -791169139;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 708566419:
                case 1887327743:
                    params = ((DSAPublicKey) publicKey2).getParams();
                    if (params == null) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("֨ᩳ")) * 63;
                        i = ((iM11306 ^ i8) * 14515) ^ 539814782;
                        i2 = -421951012;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۧ") ^ i8) * (-89);
                        i = ((iM11306 ^ i7) * (-25975)) ^ 543285255;
                        i2 = 482716301;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 775271312:
                case 1622631304:
                    if (publicKey2 instanceof DSAPublicKey) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i7;
                        i = ((iM11306 ^ i8) * 30977) ^ 242756754;
                        i2 = -1340216721;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ֨") ^ i8;
                        i = ((iM11306 ^ i7) * (-8925)) ^ 1187569923;
                        i2 = -1507284322;
                    }
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 986385091:
                case 1569756162:
                    fieldSize = 0;
                    iM11306 = C19806.m45029("ۢۛ") ^ i8;
                    i = ((iM11306 ^ i7) * (-20363)) ^ 324055616;
                    i2 = -1716130151;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 1091795119:
                case 1208672528:
                    parameters = SubjectPublicKeyInfo.getInstance(encoded).getAlgorithm().getParameters();
                    z = parameters instanceof ASN1ObjectIdentifier;
                    iM11306 = C19806.m45029("۬ۗ") ^ i8;
                    i = ((iM11306 ^ i7) * 2543) ^ 1857117152;
                    i2 = -931443589;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 1291168288:
                case 1477042494:
                    String algorithm4 = publicKey.getAlgorithm();
                    if (C1419.f5860 < 0) {
                        return new C8694(3, algorithm4, iBitLength, null, null, null, null);
                    }
                    iM11306 = (C19806.m45029("۫ۧ") ^ i7) * 87;
                    i = ((iM11306 ^ i8) * (-1761)) ^ (-200800884);
                    i2 = 1269342880;
                    i10 = iM11306 ^ i2;
                    i9 = i;
                    break;
                case 1718617478:
                case 2033203723:
                    C1937.m6279();
                    if (C0629.f2722 > 0) {
                        iM11306 = (C19806.m45029("۫ۧ") ^ i7) * 87;
                        i = ((iM11306 ^ i8) * (-1761)) ^ (-200800884);
                        i2 = 1269342880;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                        i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                        i3 = 1214502892;
                        i10 = iM11307 ^ i3;
                        publicKey2 = publicKey;
                    }
                    break;
                default:
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩶") ^ i7;
                        i = ((iM11306 ^ i8) * 7061) ^ (-870690652);
                        i2 = -862445691;
                        i10 = iM11306 ^ i2;
                        i9 = i;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֡۟") ^ i7) * 35;
                        i9 = ((iM11307 ^ i8) * 5735) ^ (-1776039951);
                        i3 = 1214502892;
                        i10 = iM11307 ^ i3;
                        publicKey2 = publicKey;
                    }
                    break;
            }
        }
    }

    public C8694(int i, String str, int i2, BigInteger bigInteger, BigInteger bigInteger2, String str2, String str3) {
        int i3 = 204691990;
        int i4 = C3577.f13150;
        int i5 = C1977.f7413;
        int iM45029 = (C19806.m45029("۫ܶ") ^ i4) * (-43);
        int i6 = ((iM45029 ^ i5) * (-5483)) ^ (-1454195080);
        int i7 = -625111379;
        while (true) {
            i3 = ((((i3 ^ i5) * 8079) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2098961388:
                case -1678032521:
                    C1025.m3861();
                    throw new RuntimeException();
                case -1900341887:
                case 634105845:
                    this.f29906 = i;
                    this.f29908 = str;
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ۖۧ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-23979)) ^ (-1785321695);
                        i7 = 2137739888;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 22075) ^ (-1067020896);
                        i7 = 1731939368;
                    }
                    break;
                case -1873695057:
                case 899916928:
                    this.f29912 = i2;
                    if (C2477.m7593() >= 0) {
                        iM45029 = (C19806.m45029("ܺ۬") ^ i5) * (-103);
                        i6 = ((iM45029 ^ i4) * 1243) ^ 1835220729;
                        i7 = -298361641;
                    } else {
                        iM45029 = C19806.m45029("᩹֫") ^ i4;
                        i6 = ((iM45029 ^ i5) * 32109) ^ (-525190415);
                        i7 = -1698093466;
                    }
                    break;
                case -1244490279:
                case 644442614:
                    C1377.m4833();
                    C0797.m3359();
                    iM45029 = (ThreadFactoryC3888.m11306("۫᩷") ^ i4) * (-69);
                    i6 = ((iM45029 ^ i5) * 31163) ^ (-1023079464);
                    i7 = -579496974;
                    break;
                case -1182509266:
                case 1681928530:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۚ۠")) * 89;
                        i6 = ((iM45029 ^ i4) * 10573) ^ 762713174;
                        i7 = -1513165192;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۨ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-21705)) ^ 1798707045;
                        i7 = -2123335807;
                    }
                    break;
                case -950780198:
                case 355915695:
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("ۖۧ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-23979)) ^ (-1785321695);
                        i7 = 2137739888;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩷") ^ i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 31163) ^ (-1023079464);
                        i7 = -579496974;
                    }
                    break;
                case -928879887:
                case -747187851:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۚ۠")) * 89;
                        i6 = ((iM45029 ^ i4) * 10573) ^ 762713174;
                        i7 = -1513165192;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ۬") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-31659)) ^ (-989064617);
                        i7 = 155517427;
                    }
                    break;
                case -442053902:
                case 1218550573:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (!C3743.f13569) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۚ۠")) * 89;
                        i6 = ((iM45029 ^ i4) * 10573) ^ 762713174;
                        i7 = -1513165192;
                    } else {
                        iM45029 = (C19806.m45029("ܺ۬") ^ i5) * (-103);
                        i6 = ((iM45029 ^ i4) * 1243) ^ 1835220729;
                        i7 = -298361641;
                    }
                    break;
                case -313012681:
                case 482919:
                    this.f29909 = bigInteger;
                    if (C1461.m5080()) {
                        iM45029 = C19806.m45029("۫᩺") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-1543)) ^ 50957325;
                        i7 = -1789832271;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۛ") ^ i5) * (-37);
                        i6 = ((iM45029 ^ i4) * (-3997)) ^ 1466020215;
                        i7 = 1397054040;
                    }
                    break;
                case -126113138:
                case -34261671:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("۫᩺") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-1543)) ^ 50957325;
                        i7 = -1789832271;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۛۜ")) * (-11);
                        i6 = ((iM45029 ^ i4) * (-23837)) ^ (-1783397394);
                        i7 = 751310564;
                    }
                    break;
                case -119036769:
                case 301731665:
                    if (C3660.f13403 < 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۚ۠")) * 89;
                        i6 = ((iM45029 ^ i4) * 10573) ^ 762713174;
                        i7 = -1513165192;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩷") ^ i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 31163) ^ (-1023079464);
                        i7 = -579496974;
                    }
                    break;
                case 93667441:
                case 1426308763:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("᩺ᩳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 31789) ^ 943695786;
                        i7 = -24232904;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫᩷") ^ i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 31163) ^ (-1023079464);
                        i7 = -579496974;
                    }
                    break;
                case 416661979:
                case 1851900755:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۤ") + i5) * 95;
                        i6 = ((iM45029 ^ i4) * 327) ^ 1915642042;
                        i7 = -518443073;
                    } else {
                        iM45029 = C19806.m45029("۫᩺") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-1543)) ^ 50957325;
                        i7 = -1789832271;
                    }
                    break;
                case 559614239:
                case 884534501:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ۖۧ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-23979)) ^ (-1785321695);
                        i7 = 2137739888;
                    } else {
                        iM45029 = (C19806.m45029("֫᩵") ^ i4) * (-121);
                        i6 = ((iM45029 ^ i5) * 22833) ^ (-798255405);
                        i7 = -1162101348;
                    }
                    break;
                case 1464266539:
                case 1530937715:
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("ܺ۬") ^ i5) * (-103);
                        i6 = ((iM45029 ^ i4) * 1243) ^ 1835220729;
                        i7 = -298361641;
                    } else {
                        iM45029 = C19806.m45029("ܿۤ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-27833)) ^ 2054115652;
                        i7 = -1147753271;
                    }
                    break;
                default:
                    this.f29907 = bigInteger2;
                    this.f29911 = str2;
                    this.f29910 = str3;
                    return;
            }
        }
    }
}
