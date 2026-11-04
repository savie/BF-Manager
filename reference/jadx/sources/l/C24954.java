package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: renamed from: l.᩻ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes.dex */
public final class C24954 {

    /* JADX INFO: renamed from: ۛۙ᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f80785 = {1835, -22459, -22438, -22458, -22438, -22452, -22464, -22460, -22438, -22459, -22460, -22460, -22464, -22463, -22438, -22457, -22438, -22459, -22438, -22461, -22459, -22438, -22457, -22438, -22459, -22457, -22458, -22438, -22460, -22438, -22457, -22464, -22459, -22438, -22457, -22438, -22459, -22457, -22458, -22438, -22460, -22438, -22457, -22463, -22492, -22439, -22458, -22463, -22462, -22492, -22439, -22457, -22452, -22464, -22492, -22439, -22463, -22458, -22459};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f80786;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f80787;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f80788;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f80789;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final BigInteger f80790;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f80791;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BigInteger f80792;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x035b  */
    /* JADX WARN: Code duplicated, block: B:143:0x04a5 A[PHI: r10 r14
      0x04a5: PHI (r10v6 short) = (r10v4 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:142:0x04a3, B:93:0x02b3, B:73:0x01de, B:28:0x00d9, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r14v4 short) = (r14v3 short), (r14v1 short), (r14v1 short), (r14v1 short), (r14v1 short) binds: [B:142:0x04a3, B:93:0x02b3, B:73:0x01de, B:28:0x00d9, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x04d3 A[PHI: r12 r15 r16 r23
      0x04d3: PHI (r12v4 char) = (r12v1 char), (r12v1 char), (r12v6 char) binds: [B:138:0x0483, B:115:0x0388, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x04d3: PHI (r15v4 int) = (r15v3 int), (r15v1 int), (r15v1 int) binds: [B:138:0x0483, B:115:0x0388, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x04d3: PHI (r16v6 short) = (r16v5 short), (r16v1 short), (r16v1 short) binds: [B:138:0x0483, B:115:0x0388, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x04d3: PHI (r23v4 short[]) = (r23v3 short[]), (r23v3 short[]), (r23v6 short[]) binds: [B:138:0x0483, B:115:0x0388, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f8 A[PHI: r4 r17
      0x01f8: PHI (r4v4 byte[]) = (r4v1 byte[]), (r4v2 byte[]), (r4v1 byte[]) binds: [B:148:0x01f8, B:78:0x01f6, B:42:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r17v6 java.lang.String) = (r17v2 java.lang.String), (r17v4 java.lang.String), (r17v2 java.lang.String) binds: [B:148:0x01f8, B:78:0x01f6, B:42:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x02bf  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24954 m55707(PublicKey publicKey) {
        String str;
        String strM4222;
        int iM2761;
        int i;
        int i2;
        ECPublicKey eCPublicKey = null;
        DSAParams params = null;
        byte[] encoded = null;
        ASN1Encodable parameters = null;
        String id = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = -281249767;
        int i5 = C4238.f15451;
        int i6 = C1080.f3865;
        int iM2762 = (i6 - C0619.m2761("֫ۡ")) * (-63);
        int i7 = ((iM2762 ^ i5) * (-19817)) ^ (-1959597534);
        int i8 = iM2762 ^ (-66918746);
        String str2 = null;
        short[] sArr = null;
        int i9 = 0;
        boolean z = false;
        int iBitLength = 0;
        short s3 = 0;
        int fieldSize = 0;
        byte b = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * (-4379)) >> 31));
            switch (i4) {
                case -2085144041:
                case 242511653:
                    i9 = 58338;
                    iM2761 = (i6 - C0773.m3169("ۜۚ")) * (-51);
                    i = ((iM2761 ^ i5) * (-15263)) ^ (-587016136);
                    i2 = -160431513;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -2053194359:
                case 754372812:
                    b = 0;
                    if (publicKey instanceof ECPublicKey) {
                        iM2761 = (i5 - C0619.m2761("ۛۢ")) * 115;
                        i = ((iM2761 ^ i6) * 13193) ^ 2052055202;
                        i2 = 1177601387;
                    } else {
                        iM2761 = (C0773.m3169("ۢۚ") + i6) * (-65);
                        i = ((iM2761 ^ i5) * 14295) ^ 1897666142;
                        i2 = 1693257618;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -2048748314:
                case -941461958:
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                    String algorithm = publicKey.getAlgorithm();
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("֫ۜ") + i5) * (-39);
                        i = ((iM2761 ^ i6) * 24809) ^ (-97399349);
                        i2 = 294743129;
                    } else {
                        BigInteger modulus = rSAPublicKey.getModulus();
                        if (AbstractC0116.f1064 > 0) {
                            int iBitLength2 = modulus.bitLength();
                            BigInteger publicExponent = rSAPublicKey.getPublicExponent();
                            if (C1343.m4943()) {
                                BigInteger modulus2 = rSAPublicKey.getModulus();
                                if (C2878.m9491() > 0) {
                                    return new C24954(1, algorithm, iBitLength2, publicExponent, modulus2, null, null);
                                }
                            } else {
                                iM2761 = (C0773.m3169("۫֫") + i6) * 53;
                                i = ((iM2761 ^ i5) * (-7135)) ^ (-446131064);
                                i2 = 734719970;
                            }
                        }
                        iM2761 = (i6 - C0773.m3169("ܿۤ")) * 83;
                        i = ((iM2761 ^ i5) * (-13621)) ^ 1614991841;
                        i2 = 1535612722;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1869351686:
                case -1451067260:
                    if (C0269.f1558 > 0) {
                        iM2761 = (C0773.m3169("֫ۜ") + i5) * (-39);
                        i = ((iM2761 ^ i6) * 24809) ^ (-97399349);
                        i2 = 294743129;
                    } else {
                        iM2761 = (C0619.m2761("ۧۜ") + i6) * (-13);
                        i = ((iM2761 ^ i5) * 12129) ^ 467212056;
                        i2 = -1740821012;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1824021326:
                case -238835441:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ۨۨ") ^ i6) * 13;
                        i = ((iM2761 ^ i5) * 31849) ^ 1375759679;
                        i2 = -1613566708;
                    } else {
                        iM2761 = (C0619.m2761("ۙۗ") + i6) * 127;
                        i = ((iM2761 ^ i5) * (-24655)) ^ (-1849372876);
                        i2 = -212001259;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1579398011:
                case -294281366:
                    if ((s3 * s2) - i3 > 0) {
                        iM2761 = (C0773.m3169("ۘ᩺") + i5) * (-113);
                        i = ((iM2761 ^ i6) * 21351) ^ (-2363511);
                        i2 = -620523150;
                    } else {
                        iM2761 = C0619.m2761("ۚ֫") ^ i6;
                        i = ((iM2761 ^ i5) * (-26109)) ^ (-1158089640);
                        i2 = 709201350;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1493772303:
                case 1705973471:
                    fieldSize = 0;
                    iM2761 = C0619.m2761("ۨ۟") ^ i5;
                    i = ((iM2761 ^ i6) * (-687)) ^ 1175511134;
                    i2 = -123014604;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1407174960:
                case 776339244:
                    String algorithm2 = publicKey.getAlgorithm();
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("ۧۜ") + i6) * (-13);
                        i = ((iM2761 ^ i5) * 12129) ^ 467212056;
                        i2 = -1740821012;
                    } else {
                        if (C3734.f12817 < 0) {
                            return new C24954(0, algorithm2, 0, null, null, null, null);
                        }
                        iM2761 = (C0619.m2761("ۨۨ") ^ i6) * 13;
                        i = ((iM2761 ^ i5) * 31849) ^ 1375759679;
                        i2 = -1613566708;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1243522023:
                case -23592403:
                    fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
                    iM2761 = C0619.m2761("ۨ۟") ^ i5;
                    i = ((iM2761 ^ i6) * (-687)) ^ 1175511134;
                    i2 = -123014604;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1243267242:
                case -1128764539:
                    if (publicKey instanceof RSAPublicKey) {
                        iM2761 = C0619.m2761("᩶۫") ^ i6;
                        i = ((iM2761 ^ i5) * (-13241)) ^ (-18736784);
                        i2 = 1585969467;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩷") ^ i5;
                        i = ((iM2761 ^ i6) * 29975) ^ 206376232;
                        i2 = -1707010241;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1142425660:
                case -883634766:
                    C2023.m6964();
                    return null;
                case -1091774837:
                case 708061782:
                    int i10 = s3 + s;
                    i3 = i10 * i10;
                    s2 = 48736;
                    if (C17202.m40372()) {
                        iM2761 = (i5 - C0619.m2761("᩸ۡ")) * (-45);
                        i = ((iM2761 ^ i6) * 6441) ^ 2032161287;
                        i2 = 204353066;
                    } else {
                        iM2761 = (C0773.m3169("۫֫") + i6) * 53;
                        i = ((iM2761 ^ i5) * (-7135)) ^ (-446131064);
                        i2 = 734719970;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -664141405:
                case -62047056:
                    try {
                        id = ((ASN1ObjectIdentifier) parameters).getId();
                    } catch (Exception unused) {
                        id = str2;
                    }
                    iM2761 = C0619.m2761("֨᩹") ^ i6;
                    i = ((iM2761 ^ i5) * (-18683)) ^ (-1311170940);
                    i2 = 598988797;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -606426141:
                case 773917554:
                    if (publicKey instanceof DSAPublicKey) {
                        iM2761 = (i5 - C0773.m3169("᩸ܰ")) * 63;
                        i = ((iM2761 ^ i6) * (-18615)) ^ (-148988709);
                        i2 = -1001270584;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۙ") ^ i6) * (-85);
                        i = ((iM2761 ^ i5) * (-7853)) ^ 45123519;
                        i2 = 152523604;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -484481216:
                case 1443860539:
                    if (z) {
                        iM2761 = (C0773.m3169("ۖᩴ") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i6) * (-23325)) ^ 1616692220;
                        i2 = -1565061667;
                    } else {
                        id = str2;
                        iM2761 = C0619.m2761("֨᩹") ^ i6;
                        i = ((iM2761 ^ i5) * (-18683)) ^ (-1311170940);
                        i2 = 598988797;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -249364161:
                case -146292713:
                    i9 = 43124;
                    iM2761 = (i6 - C0773.m3169("ۜۚ")) * (-51);
                    i = ((iM2761 ^ i5) * (-15263)) ^ (-587016136);
                    i2 = -160431513;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -242910664:
                case 728551151:
                    if (C2354.m7983()) {
                        iM2761 = (C0773.m3169("֫ۜ") + i5) * (-39);
                        i = ((iM2761 ^ i6) * 24809) ^ (-97399349);
                        i2 = 294743129;
                    } else {
                        iM2761 = C0619.m2761("֫ܶ") ^ i5;
                        i = ((iM2761 ^ i6) * 10581) ^ 705406092;
                        i2 = 523629382;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -193040554:
                case 429581750:
                    C0862.m3503();
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0619.m2761("ۙۗ") + i6) * 127;
                        i = ((iM2761 ^ i5) * (-24655)) ^ (-1849372876);
                        i2 = -212001259;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ܿۤ")) * 83;
                        i = ((iM2761 ^ i5) * (-13621)) ^ 1614991841;
                        i2 = 1535612722;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -120239932:
                case 351128592:
                    String algorithm3 = publicKey.getAlgorithm();
                    if (id != null) {
                        switch (C0773.m3169(id)) {
                            case 367694928:
                                if (!C2419.m8175(id, C1146.m4222(f80785, 1, 19, i9))) {
                                    b = -1;
                                }
                                break;
                            case 1290711797:
                                if (!C2419.m8175(id, C1519.m5399(f80785, 20, 12, i9))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 1290711798:
                                if (!C2419.m8175(id, C3033.m9847(f80785, 32, 12, i9))) {
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
                                strM4222 = C1146.m4222(f80785, 44, 5, i9);
                                str = strM4222;
                                break;
                            case 1:
                                strM4222 = C1542.m5471(f80785, 49, 5, i9);
                                str = strM4222;
                                break;
                            case 2:
                                strM4222 = RunnableC0334.m2049(f80785, 54, 5, i9);
                                str = strM4222;
                                break;
                            default:
                                str = str2;
                                break;
                        }
                    } else {
                        str = str2;
                    }
                    return new C24954(2, algorithm3, fieldSize, null, null, str, id);
                case -64173366:
                case 1205360977:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ۨۨ") ^ i6) * 13;
                        i = ((iM2761 ^ i5) * 31849) ^ 1375759679;
                        i2 = -1613566708;
                    } else {
                        iM2761 = (C0773.m3169("֫ۜ") + i5) * (-39);
                        i = ((iM2761 ^ i6) * 24809) ^ (-97399349);
                        i2 = 294743129;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -26792529:
                case 1517144889:
                    parameters = SubjectPublicKeyInfo.getInstance(encoded).getAlgorithm().getParameters();
                    z = parameters instanceof ASN1ObjectIdentifier;
                    iM2761 = (C0773.m3169("۬֡") ^ i6) * (-93);
                    i = ((iM2761 ^ i5) * 20799) ^ (-1340767335);
                    i2 = -1465849097;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 116906961:
                case 1440558925:
                    eCPublicKey = (ECPublicKey) publicKey;
                    if (eCPublicKey.getParams() == null) {
                        iM2761 = C0773.m3169("֡ۚ") ^ i6;
                        i = ((iM2761 ^ i5) * (-12989)) ^ 768424166;
                        i2 = -1094060690;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩸") ^ i5) * 15;
                        i = ((iM2761 ^ i6) * 21097) ^ (-1178184661);
                        i2 = 19258806;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 365903361:
                case 1469877476:
                    String algorithm4 = publicKey.getAlgorithm();
                    if (!C2878.f9462) {
                        return new C24954(3, algorithm4, iBitLength, null, null, null, null);
                    }
                    iM2761 = (C0619.m2761("ۧۜ") + i6) * (-13);
                    i = ((iM2761 ^ i5) * 12129) ^ 467212056;
                    i2 = -1740821012;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 603386076:
                case 1416870439:
                    iBitLength = 0;
                    iM2761 = C0773.m3169("ۡ᩶") ^ i6;
                    i = ((iM2761 ^ i5) * (-12851)) ^ 1898989057;
                    i2 = -1929759303;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 646270147:
                case 840796167:
                    params = ((DSAPublicKey) publicKey).getParams();
                    if (params == null) {
                        iM2761 = (C0619.m2761("᩵ۨ") + i6) * (-41);
                        i = ((iM2761 ^ i5) * (-1883)) ^ (-1007695089);
                        i2 = -2003439;
                    } else {
                        iM2761 = C0619.m2761("۬۬") ^ i5;
                        i = ((iM2761 ^ i6) * (-361)) ^ 1467839563;
                        i2 = -294597215;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 754951956:
                case 1489448200:
                    iBitLength = params.getP().bitLength();
                    iM2761 = C0773.m3169("ۡ᩶") ^ i6;
                    i = ((iM2761 ^ i5) * (-12851)) ^ 1898989057;
                    i2 = -1929759303;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 800696931:
                case 1201110858:
                    if (C3492.m11488()) {
                        iM2761 = (C0619.m2761("ۧۜ") + i6) * (-13);
                        i = ((iM2761 ^ i5) * 12129) ^ 467212056;
                        i2 = -1740821012;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܳ") + i5) * (-67);
                        i = ((iM2761 ^ i6) * 18451) ^ 435989120;
                        i2 = 883464574;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 913943093:
                case 1723661249:
                    s3 = sArr[c];
                    s = 12184;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ۧۜ") + i6) * (-13);
                        i = ((iM2761 ^ i5) * 12129) ^ 467212056;
                        i2 = -1740821012;
                    } else {
                        iM2761 = (C0619.m2761("ܳۤ") ^ i6) * (-79);
                        i = ((iM2761 ^ i5) * 23791) ^ (-931184931);
                        i2 = 1635469695;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 946385651:
                case 1678949162:
                    C2310.m7813();
                    iM2761 = (C0619.m2761("ۨۨ") ^ i6) * 13;
                    i = ((iM2761 ^ i5) * 31849) ^ 1375759679;
                    i2 = -1613566708;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 1111008674:
                case 1310528490:
                    encoded = publicKey.getEncoded();
                    str2 = null;
                    if (encoded == null) {
                        id = str2;
                        iM2761 = C0619.m2761("֨᩹") ^ i6;
                        i = ((iM2761 ^ i5) * (-18683)) ^ (-1311170940);
                        i2 = 598988797;
                    } else {
                        iM2761 = C0773.m3169("᩶֨") ^ i5;
                        i = ((iM2761 ^ i6) * 28891) ^ 1390954295;
                        i2 = -321269790;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 1140814475:
                case 1587606557:
                    C3033.m9845();
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("ۨۨ") ^ i6) * 13;
                        i = ((iM2761 ^ i5) * 31849) ^ 1375759679;
                        i2 = -1613566708;
                    } else {
                        iM2761 = C0619.m2761("۫۬") ^ i5;
                        i = ((iM2761 ^ i6) * 14853) ^ 327959227;
                        i2 = 1251682946;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 1523400154:
                case 2053409323:
                    C17202.m40372();
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("۫۬") ^ i5;
                        i = ((iM2761 ^ i6) * 14853) ^ 327959227;
                        i2 = 1251682946;
                    } else {
                        iM2761 = (C0619.m2761("֫֡") ^ i5) * 21;
                        i = ((iM2761 ^ i6) * (-2465)) ^ 1314136864;
                        i2 = 214801252;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                default:
                    sArr = f80785;
                    c = 0;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("۫֫") + i6) * 53;
                        i = ((iM2761 ^ i5) * (-7135)) ^ (-446131064);
                        i2 = 734719970;
                    } else {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i = ((iM2761 ^ i6) * 26471) ^ (-581879354);
                        i2 = -2133963741;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }

    public C24954(int i, String str, int i2, BigInteger bigInteger, BigInteger bigInteger2, String str2, String str3) {
        int i3 = -450628127;
        int i4 = C4238.f15451;
        int i5 = C2310.f7472;
        int iM2761 = C0619.m2761("ۡ۫") ^ i5;
        int i6 = ((iM2761 ^ i4) * (-5805)) ^ 1328135069;
        int i7 = 1371220743;
        while (true) {
            i3 = ((((i3 ^ i4) * 28013) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2113026224:
                case 879505040:
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ۗۚ") + i5) * (-17);
                        i6 = ((iM2761 ^ i4) * (-10325)) ^ 385940865;
                        i7 = 544033691;
                    } else {
                        iM2761 = (C0619.m2761("ܰۡ") + i5) * 21;
                        i6 = ((iM2761 ^ i4) * (-29123)) ^ (-1738030641);
                        i7 = 499109479;
                    }
                    break;
                case -2033049818:
                case 522181812:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("֡֫") ^ i4;
                        i6 = ((iM2761 ^ i5) * 14645) ^ 63696738;
                        i7 = -2099533933;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩶᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-9245)) ^ (-134801159);
                        i7 = -1237469463;
                    }
                    break;
                case -2021000076:
                case -1946377529:
                    this.f80788 = i;
                    this.f80786 = str;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i4 - C0773.m3169("᩶᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-9245)) ^ (-134801159);
                        i7 = -1237469463;
                    } else {
                        iM2761 = C0619.m2761("᩹᩸") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-31265)) ^ (-1396453236);
                        i7 = -1169773024;
                    }
                    break;
                case -1969152158:
                case -1060593271:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i4 - C0773.m3169("᩶᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-9245)) ^ (-134801159);
                        i7 = -1237469463;
                    } else {
                        iM2761 = C0619.m2761("ۧܽ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-7651)) ^ (-1537953412);
                        i7 = -919794981;
                    }
                    break;
                case -1886254155:
                case -1577564235:
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("ۛ۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * 8467) ^ 1971461760;
                        i7 = -1450849319;
                    } else {
                        iM2761 = C0619.m2761("᩵ۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 31789) ^ 884074897;
                        i7 = -1447546454;
                    }
                    break;
                case -1842971172:
                case -672700703:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("ۗۚ") + i5) * (-17);
                        i6 = ((iM2761 ^ i4) * (-10325)) ^ 385940865;
                        i7 = 544033691;
                    } else {
                        iM2761 = C0619.m2761("ۛ۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * 8467) ^ 1971461760;
                        i7 = -1450849319;
                    }
                    break;
                case -1249459695:
                case -420217441:
                    C20932.m47848();
                    if (C2287.f7432 < 0) {
                        iM2761 = C0619.m2761("֨֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * 4167) ^ (-980859799);
                        i7 = -1839526580;
                    } else {
                        iM2761 = (C0619.m2761("ۧᩳ") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2761 ^ i5) * (-12625)) ^ (-602987067);
                        i7 = 1587103211;
                    }
                    break;
                case -1100815905:
                case 433855665:
                    this.f80790 = bigInteger;
                    if (C13473.f42873 != 0) {
                        iM2761 = (i4 - C0773.m3169("᩶᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-9245)) ^ (-134801159);
                        i7 = -1237469463;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩹") ^ i5) * 23;
                        i6 = ((iM2761 ^ i4) * 27589) ^ 1318980336;
                        i7 = 1682090217;
                    }
                    break;
                case -844572794:
                case 520894342:
                    this.f80789 = i2;
                    if (C1783.m6232()) {
                        iM2761 = (C0619.m2761("ۛܳ") ^ i4) * 11;
                        i6 = ((iM2761 ^ i5) * (-18275)) ^ 1915035252;
                        i7 = -1069878134;
                    } else {
                        iM2761 = C0619.m2761("ۛ۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * 8467) ^ 1971461760;
                        i7 = -1450849319;
                    }
                    break;
                case -654672341:
                case 217242646:
                    if (C1519.m5403()) {
                        iM2761 = (C0773.m3169("֨ᩳ") + i5) * 39;
                        i6 = ((iM2761 ^ i4) * (-29365)) ^ (-1648251374);
                        i7 = -266849882;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩶᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-9245)) ^ (-134801159);
                        i7 = -1237469463;
                    }
                    break;
                case -61098724:
                case 619480421:
                    RunnableC3646.m11813();
                    if (C2419.m8174() < 0) {
                        iM2761 = (C0619.m2761("ۧᩳ") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2761 ^ i5) * (-12625)) ^ (-602987067);
                        i7 = 1587103211;
                    } else {
                        iM2761 = C0619.m2761("ۛ۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * 8467) ^ 1971461760;
                        i7 = -1450849319;
                    }
                    break;
                case 219896427:
                case 1730888960:
                    RunnableC3055.m9933();
                    iM2761 = C0619.m2761("ۛ۬") ^ i5;
                    i6 = ((iM2761 ^ i4) * 8467) ^ 1971461760;
                    i7 = -1450849319;
                    break;
                case 1369852378:
                case 1509279535:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("֨֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * 4167) ^ (-980859799);
                        i7 = -1839526580;
                    } else {
                        iM2761 = (C0619.m2761("ܺ۠") ^ i5) * 127;
                        i6 = ((iM2761 ^ i4) * (-3457)) ^ 286329629;
                        i7 = -1970402709;
                    }
                    break;
                case 1523583720:
                case 1782002128:
                    this.f80792 = bigInteger2;
                    this.f80791 = str2;
                    this.f80787 = str3;
                    return;
                case 1732820322:
                case 2142706673:
                    C0950.m3785();
                    throw new RuntimeException();
                default:
                    if (C11235.m28309() != 0) {
                        iM2761 = (i4 - C0773.m3169("᩶᩸")) * 3;
                        i6 = ((iM2761 ^ i5) * (-9245)) ^ (-134801159);
                        i7 = -1237469463;
                    } else {
                        iM2761 = (C0619.m2761("ܽ᩷") + i4) * (-83);
                        i6 = ((iM2761 ^ i5) * (-4897)) ^ 1029186313;
                        i7 = 42825358;
                    }
                    break;
            }
        }
    }
}
