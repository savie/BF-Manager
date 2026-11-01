package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩸ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V4FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21775 {

    /* JADX INFO: renamed from: ۗܳᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f70544 = {3132, -22393, -22390, -22290, -22365, -22341, -22339, -22342, -22290, -22356, -22357, -22342, -22343, -22357, -22357, -22368, -22290, -22274, -22346, -22274, -22274, -22290, -22342, -22367, -22290, -22274, -22346, -22392, -22392, -22393, -22390, -22290, -22290, -22368, -22367, -22342, -22290, -22360, -22367, -22341, -22368, -22358, -22290};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f70545;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f70546;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f70547;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short[] f70548;

    /* JADX WARN: Code duplicated, block: B:25:0x0093 A[PHI: r13
      0x0093: PHI (r13v3 int) = (r13v2 int), (r13v1 int) binds: [B:24:0x0091, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd A[PHI: r11 r12 r14 r15
      0x00cd: PHI (r11v3 byte) = (r11v2 byte), (r11v1 byte), (r11v1 byte), (r11v1 byte) binds: [B:28:0x00cb, B:20:0x006e, B:14:0x0053, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r12v3 byte) = (r12v2 byte), (r12v1 byte), (r12v1 byte), (r12v1 byte) binds: [B:28:0x00cb, B:20:0x006e, B:14:0x0053, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r14v3 byte) = (r14v1 byte), (r14v2 byte), (r14v1 byte), (r14v1 byte) binds: [B:28:0x00cb, B:20:0x006e, B:14:0x0053, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r15v3 byte) = (r15v1 byte), (r15v2 byte), (r15v1 byte), (r15v1 byte) binds: [B:28:0x00cb, B:20:0x006e, B:14:0x0053, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0162 A[PHI: r6 r7 r10
      0x0162: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:44:0x0160, B:32:0x00ff, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r7v3 byte) = (r7v2 byte), (r7v1 byte), (r7v1 byte) binds: [B:44:0x0160, B:32:0x00ff, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:44:0x0160, B:32:0x00ff, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0201 A[PHI: r4 r5 r20 r21
      0x0201: PHI (r4v5 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:48:0x0197, B:16:0x0057, B:14:0x0053, B:11:0x004d, B:60:0x01ff] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r5v5 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:48:0x0197, B:16:0x0057, B:14:0x0053, B:11:0x004d, B:60:0x01ff] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r20v4 int) = (r20v1 int), (r20v1 int), (r20v1 int), (r20v1 int), (r20v6 int) binds: [B:48:0x0197, B:16:0x0057, B:14:0x0053, B:11:0x004d, B:60:0x01ff] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r21v12 int) = (r21v3 int), (r21v3 int), (r21v3 int), (r21v3 int), (r21v14 int) binds: [B:48:0x0197, B:16:0x0057, B:14:0x0053, B:11:0x004d, B:60:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48534() {
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int iM11306;
        int i5;
        C21775 c21775 = this;
        byte[] bArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        byte b = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        byte b2 = 0;
        byte b3 = 0;
        int i12 = 0;
        byte b4 = 0;
        byte b5 = 0;
        int i13 = -972651575;
        int i14 = C3660.f13403;
        int i15 = C1875.f7103;
        int iM11307 = (ThreadFactoryC3888.m11306("ܶܿ") ^ i15) * (-97);
        int i16 = ((iM11307 ^ i14) * 7669) ^ (-100232476);
        int i17 = iM11307 ^ 910644531;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-31805)) >> 31));
            switch (i13) {
                case -2056838060:
                case -1412889449:
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("᩻ܿ") + i14) * 19;
                        i3 = ((iM11306 ^ i15) * 25813) ^ (-237987947);
                        i5 = 1529669333;
                    } else {
                        iM11306 = C19806.m45029("᩺۟") ^ i15;
                        i3 = ((iM11306 ^ i14) * 22749) ^ (-1560754590);
                        i5 = 1961307429;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -1675501568:
                case 1827989071:
                    C0278.m1789();
                    return 0;
                case -1670105011:
                case 419760240:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i14) * (-121);
                        i3 = ((iM11306 ^ i15) * (-21905)) ^ 844327593;
                        i5 = 581695896;
                    } else {
                        iM11306 = (i15 - ThreadFactoryC3888.m11306("ܰܰ")) * (-69);
                        i3 = ((iM11306 ^ i14) * (-19683)) ^ 887111026;
                        i5 = 2090386203;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -1613429459:
                case 147328752:
                    C0797.m3359();
                    C0216.m1591();
                    iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i14) * (-121);
                    i3 = ((iM11306 ^ i15) * (-21905)) ^ 844327593;
                    i5 = 581695896;
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -1503909864:
                case 1987357319:
                    b2 = bArr[i8];
                    b3 = 255;
                    if (C3535.m10431() <= 0) {
                        iM11306 = C19806.m45029("᩺۟") ^ i15;
                        i3 = ((iM11306 ^ i14) * 22749) ^ (-1560754590);
                        i5 = 1961307429;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ᩻") ^ i15;
                        i3 = ((iM11306 ^ i14) * 18725) ^ (-1305261802);
                        i5 = -1529014062;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -1450494581:
                case -12477649:
                    c21775.f70545 = i18 + 4;
                    b4 = bArr[i11];
                    b5 = 255;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("᩺۟") ^ i15;
                        i3 = ((iM11306 ^ i14) * 22749) ^ (-1560754590);
                        i5 = 1961307429;
                    } else {
                        iM11306 = (i14 - C19806.m45029("۬᩷")) * 17;
                        i3 = ((iM11306 ^ i15) * (-1307)) ^ (-1680272599);
                        i5 = -1640191199;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -905551715:
                case 66483842:
                    i8 = i18 + i7;
                    c21775.f70545 = i8;
                    b = bArr[i19];
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i15 - ThreadFactoryC3888.m11306("ܰܰ")) * (-69);
                        i3 = ((iM11306 ^ i14) * (-19683)) ^ 887111026;
                        i5 = 2090386203;
                    } else {
                        iM11306 = (i15 - ThreadFactoryC3888.m11306("֨ۧ")) * 57;
                        i3 = ((iM11306 ^ i14) * 32045) ^ 166335718;
                        i5 = -1841284373;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -897627622:
                case -526683324:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("᩺۟") ^ i15;
                        i3 = ((iM11306 ^ i14) * 22749) ^ (-1560754590);
                        i5 = 1961307429;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i14) * (-121);
                        i3 = ((iM11306 ^ i15) * (-21905)) ^ 844327593;
                        i5 = 581695896;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -813369451:
                case 206286026:
                    i9 = b & 255;
                    if (C1377.m4833() == 0) {
                        iM11306 = C19806.m45029("᩹۠") ^ i14;
                        i3 = ((iM11306 ^ i15) * (-3935)) ^ (-2084622167);
                        i5 = -840482183;
                        i17 = iM11306 ^ i5;
                        i16 = i3;
                    }
                    i = i19;
                    iM45029 = (C19806.m45029("ܰᩳ") ^ i14) * (-35);
                    i2 = i;
                    i3 = ((iM45029 ^ i15) * (-15145)) ^ (-1423785336);
                    i4 = -388924265;
                    int i20 = iM45029 ^ i4;
                    i19 = i2;
                    i17 = i20;
                    i16 = i3;
                    break;
                case -767619821:
                case 2044335970:
                    i11 = i18 + 3;
                    c21775.f70545 = i11;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i15 - ThreadFactoryC3888.m11306("ܰܰ")) * (-69);
                        i3 = ((iM11306 ^ i14) * (-19683)) ^ 887111026;
                        i5 = 2090386203;
                    } else {
                        iM11306 = C19806.m45029("ᩳܰ") ^ i14;
                        i3 = ((iM11306 ^ i15) * 19321) ^ 1283614276;
                        i5 = -505827111;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case -746695904:
                case -732606417:
                    int i21 = c21775.f70545;
                    i19 = i21 + 1;
                    if (C2249.m6915() <= 0) {
                        i18 = i21;
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i14) * (-121);
                        i3 = ((iM11306 ^ i15) * (-21905)) ^ 844327593;
                        i5 = 581695896;
                        i17 = iM11306 ^ i5;
                        i16 = i3;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("᩹۬") ^ i14;
                        i17 = iM11308 ^ (-1094798636);
                        i18 = i21;
                        i16 = ((iM11308 ^ i15) * (-7865)) ^ 1448887263;
                        c21775 = this;
                    }
                    break;
                case -714107536:
                case 689154052:
                    i = i19;
                    c21775.f70545 = i;
                    bArr = c21775.f70546;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ܰᩳ") ^ i14) * (-35);
                        i2 = i;
                        i3 = ((iM45029 ^ i15) * (-15145)) ^ (-1423785336);
                        i4 = -388924265;
                    } else {
                        i2 = i;
                        iM45029 = (i15 - C19806.m45029("֡᩹")) * (-103);
                        i3 = ((iM45029 ^ i14) * 22139) ^ (-898826160);
                        i4 = 818357659;
                    }
                    int i22 = iM45029 ^ i4;
                    i19 = i2;
                    i17 = i22;
                    i16 = i3;
                    break;
                case 60148796:
                case 1867961526:
                    i6 = bArr[i18] & 255;
                    i7 = 2;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i14) * (-121);
                        i3 = ((iM11306 ^ i15) * (-21905)) ^ 844327593;
                        i5 = 581695896;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i14;
                        i3 = ((iM11306 ^ i15) * (-20823)) ^ (-1909612826);
                        i5 = 1571519201;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                case 1149121309:
                case 1514821821:
                    i10 = (i9 << 8) | i6;
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܿ") ^ i15;
                        i3 = ((iM11306 ^ i14) * 6173) ^ (-1188770207);
                        i5 = 957262592;
                        i17 = iM11306 ^ i5;
                        i16 = i3;
                    }
                    i = i19;
                    iM45029 = (C19806.m45029("ܰᩳ") ^ i14) * (-35);
                    i2 = i;
                    i3 = ((iM45029 ^ i15) * (-15145)) ^ (-1423785336);
                    i4 = -388924265;
                    int i23 = iM45029 ^ i4;
                    i19 = i2;
                    i17 = i23;
                    i16 = i3;
                    break;
                case 1340928727:
                case 1775299807:
                    i12 = i10 | ((b2 & b3) << 16);
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("᩻ܿ") + i14) * 19;
                        i3 = ((iM11306 ^ i15) * 25813) ^ (-237987947);
                        i5 = 1529669333;
                    } else {
                        iM11306 = (i15 - ThreadFactoryC3888.m11306("ۤ֨")) * (-65);
                        i3 = ((iM11306 ^ i14) * 30995) ^ 414611416;
                        i5 = -515204900;
                    }
                    i17 = iM11306 ^ i5;
                    i16 = i3;
                    break;
                default:
                    return ((b4 & b5) << 24) | i12;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m48537(int i) {
        int iM48534 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int iM48535 = 0;
        long j4 = 0;
        int i2 = 1238917390;
        int i3 = C1461.f5957;
        int i4 = C2642.f10294;
        int iM45029 = C19806.m45029("ۜܳ") ^ i3;
        int i5 = ((iM45029 ^ i4) * 16899) ^ 1206828702;
        int i6 = -1342822135;
        while (true) {
            i2 = ((((i2 ^ i4) * 16207) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2091486467:
                case -2031785891:
                    if (C1189.m4368() <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-7);
                        i5 = ((iM45029 ^ i3) * (-8687)) ^ (-752899589);
                        i6 = 339803779;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۚ") ^ i3) * (-101);
                        i5 = ((iM45029 ^ i4) * (-26263)) ^ 1340326680;
                        i6 = -1606274959;
                    }
                    break;
                case -2084714201:
                case -1284500400:
                    m48533(i);
                    if (C2788.m8472() != 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-7);
                        i5 = ((iM45029 ^ i3) * (-8687)) ^ (-752899589);
                        i6 = 339803779;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8709) ^ 1942973702;
                        i6 = 2026024784;
                    }
                    break;
                case -1804503246:
                case -248043829:
                    j4 = iM48535;
                    if (C19806.f63586) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-7);
                        i5 = ((iM45029 ^ i3) * (-8687)) ^ (-752899589);
                        i6 = 339803779;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ᩳ᩸")) * (-55);
                        i5 = ((iM45029 ^ i3) * (-26855)) ^ 1259933348;
                        i6 = -212495960;
                    }
                    break;
                case -1489977985:
                case 178687185:
                    j3 = j & j2;
                    iM48535 = m48534();
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12767) ^ 386773623;
                        i6 = -871065798;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-7);
                        i5 = ((iM45029 ^ i3) * (-8687)) ^ (-752899589);
                        i6 = 339803779;
                    }
                    break;
                case -1073917709:
                case 2014346899:
                    if (C1461.m5080()) {
                        iM45029 = (C19806.m45029("֡֫") + i3) * 13;
                        i5 = ((iM45029 ^ i4) * (-11401)) ^ 1444198039;
                        i6 = 375857797;
                    } else {
                        iM45029 = C19806.m45029("ۘ᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27611)) ^ (-928533430);
                        i6 = -606594524;
                    }
                    break;
                case -1045693979:
                case -449662041:
                    j = iM48534;
                    j2 = 4294967295L;
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-4535)) ^ (-1559420853);
                        i6 = 1734957809;
                    } else {
                        iM45029 = C19806.m45029("᩺᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-22253)) ^ (-197011070);
                        i6 = 1388379727;
                    }
                    break;
                case -988085099:
                case 1410900831:
                    return (j4 << 32) | j3;
                case -868581111:
                case -141308035:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28833) ^ (-396795753);
                        i6 = 1601065390;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-4535)) ^ (-1559420853);
                        i6 = 1734957809;
                    }
                    break;
                case -519639612:
                case 741573838:
                    C1148.m4232();
                    iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-28833)) ^ 959705337;
                    i6 = 2106118878;
                    break;
                case -458212882:
                case 1800037868:
                    if (C2642.m8171() == 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰܳ")) * (-7);
                        i5 = ((iM45029 ^ i3) * (-8687)) ^ (-752899589);
                        i6 = 339803779;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12665) ^ 235054055;
                        i6 = 1951818465;
                    }
                    break;
                case 46874896:
                case 1057789525:
                    if (C1148.f5161 > 0) {
                        iM45029 = (C19806.m45029("֡֫") + i3) * 13;
                        i5 = ((iM45029 ^ i4) * (-11401)) ^ 1444198039;
                        i6 = 375857797;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12665) ^ 235054055;
                        i6 = 1951818465;
                    }
                    break;
                case 123561273:
                case 387527412:
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-28833)) ^ 959705337;
                        i6 = 2106118878;
                    } else {
                        iM45029 = C19806.m45029("ܿܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 16379) ^ 1168393238;
                        i6 = -1664225508;
                    }
                    break;
                case 407707418:
                case 1089848457:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12665) ^ 235054055;
                        i6 = 1951818465;
                    } else {
                        iM45029 = C19806.m45029("۫ۡ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5381) ^ 1525176006;
                        i6 = 1597539788;
                    }
                    break;
                case 684475337:
                case 1733895544:
                    iM48534 = m48534();
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12665) ^ 235054055;
                        i6 = 1951818465;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܿ۬")) * (-75);
                        i5 = ((iM45029 ^ i3) * 6499) ^ 1284974548;
                        i6 = 2082274996;
                    }
                    break;
                case 747122843:
                case 914689276:
                    if (C7105.f23796 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12665) ^ 235054055;
                        i6 = 1951818465;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-28833)) ^ 959705337;
                        i6 = 2106118878;
                    }
                    break;
                default:
                    RunnableC1895.m6170();
                    C3660.m10791();
                    return 0L;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21775(byte[] bArr) {
        this(new DataInputStream(new C8262(bArr, bArr.length)));
        int i = 1236115278;
        int i2 = C1461.f5957;
        int i3 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-16545)) ^ (-1783519308);
        int i5 = 1936663631;
        while (true) {
            i = ((((i ^ i3) * (-28295)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1582966777:
                case 1977931360:
                    C0278.m1789();
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩻ܽ")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-8257)) ^ 831624493;
                        i5 = -1754869693;
                    } else {
                        iM11306 = C19806.m45029("ۡܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3621)) ^ 1446495326;
                        i5 = 672163126;
                    }
                    break;
                case -1329424246:
                case -920417200:
                    C1460.m5050();
                    iM11306 = C19806.m45029("ۡܽ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-3621)) ^ 1446495326;
                    i5 = 672163126;
                    break;
                case -238997938:
                case 578731248:
                    if (C2788.f10625 < 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩻ܽ")) * (-109);
                        i4 = ((iM11306 ^ i3) * (-8257)) ^ 831624493;
                        i5 = -1754869693;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܿ") ^ i3) * 93;
                        i4 = ((iM11306 ^ i2) * 5217) ^ 888411877;
                        i5 = -352916479;
                    }
                    break;
                case -113534255:
                case 722018957:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("ۜۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28545)) ^ (-171157531);
                        i5 = 1949867095;
                    } else {
                        iM11306 = (C19806.m45029("۫ۤ") + i2) * (-67);
                        i4 = ((iM11306 ^ i3) * (-29971)) ^ (-2040385135);
                        i5 = -1312570871;
                    }
                    break;
                case 225349264:
                case 1042055561:
                    C1148.m4232();
                    throw new RuntimeException();
                case 1104164589:
                case 1363570930:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ۡܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3621)) ^ 1446495326;
                        i5 = 672163126;
                    } else {
                        iM11306 = (C19806.m45029("ۘۜ") + i2) * (-79);
                        i4 = ((iM11306 ^ i3) * 18663) ^ 292273061;
                        i5 = 1237273145;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01e4 A[PHI: r8 r9 r18
      0x01e4: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:53:0x01e2, B:41:0x014e, B:17:0x006a, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:53:0x01e2, B:41:0x014e, B:17:0x006a, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r18v30 int) = (r18v9 int), (r18v14 int), (r18v23 int), (r18v33 int) binds: [B:53:0x01e2, B:41:0x014e, B:17:0x006a, B:6:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b5 A[PHI: r3 r6 r18 r19
      0x02b5: PHI (r3v3 byte) = (r3v2 byte), (r3v1 byte), (r3v1 byte) binds: [B:70:0x02b3, B:57:0x0218, B:27:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r6v3 int[]) = (r6v1 int[]), (r6v2 int[]), (r6v1 int[]) binds: [B:70:0x02b3, B:57:0x0218, B:27:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r18v17 int) = (r18v5 int), (r18v8 int), (r18v18 int) binds: [B:70:0x02b3, B:57:0x0218, B:27:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r19v3 int) = (r19v2 int), (r19v1 int), (r19v1 int) binds: [B:70:0x02b3, B:57:0x0218, B:27:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (l.C2332.m7079() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (l.RunnableC1606.f6488 >= 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21775(java.io.DataInputStream r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21775.<init>(java.io.DataInputStream):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48535(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 992104631;
        int i5 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i6 = RunnableC0195.f1321;
        int iM45029 = (C19806.m45029("ܶۨ") ^ i6) * (-39);
        int i7 = ((iM45029 ^ i5) * (-28479)) ^ (-2056948540);
        int i8 = 759999398;
        while (true) {
            i4 = ((((i4 ^ i5) * 9311) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -1993157564:
                case 1759598979:
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (i6 - C19806.m45029("֡֡")) * 7;
                        i7 = ((iM45029 ^ i5) * 19973) ^ (-589228487);
                        i8 = 1224400787;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-18571)) ^ 1430893539;
                        i8 = 892349006;
                    }
                    break;
                case -1979771598:
                case -1037878961:
                    C0817.m3399();
                    if (!C1977.m6356()) {
                        iM45029 = (i6 - C19806.m45029("֡֡")) * 7;
                        i7 = ((iM45029 ^ i5) * 19973) ^ (-589228487);
                        i8 = 1224400787;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 31849) ^ (-40546380);
                        i8 = 248205364;
                    }
                    break;
                case -1957946682:
                case 1633798543:
                    this.f70545 = i2 + i3;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩸") + i5) * (-71);
                        i7 = ((iM45029 ^ i6) * 4993) ^ 492551627;
                        i8 = -715848744;
                    } else {
                        iM45029 = C19806.m45029("֡ۨ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-5999)) ^ 1433820197;
                        i8 = 416785040;
                    }
                    break;
                case -1808477664:
                case 46271624:
                    if (C1937.f7317 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩸") + i5) * (-71);
                        i7 = ((iM45029 ^ i6) * 4993) ^ 492551627;
                        i8 = -715848744;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۙ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 9513) ^ (-1096497236);
                        i8 = 1643514549;
                    }
                    break;
                case -1671920639:
                case 841560310:
                    C0817.m3399();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    return false;
                case -1597186452:
                case -127234010:
                    m48533(i);
                    if (RunnableC1564.f6300) {
                        iM45029 = (i6 - C19806.m45029("֡֡")) * 7;
                        i7 = ((iM45029 ^ i5) * 19973) ^ (-589228487);
                        i8 = 1224400787;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۨ") + i6) * (-63);
                        i7 = ((iM45029 ^ i5) * (-9569)) ^ (-1355820884);
                        i8 = -1821066173;
                    }
                    break;
                case -1555359821:
                case -261937153:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 31849) ^ (-40546380);
                        i8 = 248205364;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۢ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-17903)) ^ 1977646617;
                        i8 = -376780772;
                    }
                    break;
                case -1499139287:
                case -106461593:
                    return false;
                case -1193529664:
                case 2017639584:
                    C1668.m5583();
                    if (C2124.f7782 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۙ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 9513) ^ (-1096497236);
                        i8 = 1643514549;
                    } else {
                        iM45029 = (i6 - C19806.m45029("֡֡")) * 7;
                        i7 = ((iM45029 ^ i5) * 19973) ^ (-589228487);
                        i8 = 1224400787;
                    }
                    break;
                case -1171755261:
                case -442251302:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩸") + i5) * (-71);
                        i7 = ((iM45029 ^ i6) * 4993) ^ 492551627;
                        i8 = -715848744;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۤ") + i5) * (-5);
                        i7 = ((iM45029 ^ i6) * 4329) ^ 1936472451;
                        i8 = 1731062254;
                    }
                    break;
                case -1094212605:
                case 1200531173:
                    C0629.m2907();
                    iM45029 = (i6 - C19806.m45029("֡֡")) * 7;
                    i7 = ((iM45029 ^ i5) * 19973) ^ (-589228487);
                    i8 = 1224400787;
                    break;
                case -278124270:
                case 230848072:
                    return true;
                case -155937758:
                case 391810582:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 31849) ^ (-40546380);
                        i8 = 248205364;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("᩺ܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM45029 ^ i5) * 24967) ^ (-713045607);
                        i8 = -1080739153;
                    }
                    break;
                case 3122075:
                case 974995903:
                    if (C2332.m7079() <= 0) {
                        iM45029 = (i6 - C19806.m45029("֡֡")) * 7;
                        i7 = ((iM45029 ^ i5) * 19973) ^ (-589228487);
                        i8 = 1224400787;
                    } else {
                        iM45029 = C19806.m45029("۟ܺ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-26711)) ^ (-547709836);
                        i8 = -1066088980;
                    }
                    break;
                case 27378390:
                case 1368513124:
                    if (this.f70546[i2] != 0) {
                        iM45029 = C19806.m45029("۫ܺ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 5823) ^ 1440795019;
                        i8 = 1149527668;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-14321)) ^ 1747838786;
                        i8 = 91365262;
                    }
                    break;
                case 667484511:
                case 1002365809:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 31849) ^ (-40546380);
                        i8 = 248205364;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۤۧ")) * (-61);
                        i7 = ((iM45029 ^ i5) * 18977) ^ (-1441526425);
                        i8 = -160441621;
                    }
                    break;
                case 861233878:
                case 2088099123:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 4163) ^ (-214815366);
                        i8 = -1592466979;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۡ") + i6) * (-3);
                        i7 = ((iM45029 ^ i5) * 1509) ^ (-957881507);
                        i8 = -1370257500;
                    }
                    break;
                default:
                    i2 = this.f70545;
                    i3 = 1;
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 4163) ^ (-214815366);
                        i8 = -1592466979;
                    } else {
                        iM45029 = C19806.m45029("᩸ۧ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-27735)) ^ (-1860779058);
                        i8 = -1028184909;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m48536(int i) {
        int i2 = 1150878727;
        int i3 = C2124.f7782;
        int i4 = C1937.f7317;
        int iM11306 = ThreadFactoryC3888.m11306("֡ۖ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-8953)) ^ 1477177637;
        int i6 = -1162997896;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1497)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1649836908:
                case -836455483:
                    RunnableC1564.m5345();
                    C2704.m8255();
                    return null;
                case -1577989715:
                case 680403494:
                    C1189.m4368();
                    if (C3577.m10565()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10327)) ^ 1288499115;
                        i6 = 76964942;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11355)) ^ 278669231;
                        i6 = 753358451;
                    }
                    break;
                case -659148286:
                case 210067407:
                    ThreadFactoryC3888.m11300();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (C19806.m45029("᩻۬") + i4) * 65;
                        i5 = ((iM11306 ^ i3) * (-12949)) ^ (-1194135050);
                        i6 = 361280379;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11355)) ^ 278669231;
                        i6 = 753358451;
                    }
                    break;
                case -278868992:
                case 1360187200:
                    m48533(i);
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 370555819;
                        i6 = -415642430;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22009) ^ 715327117;
                        i6 = -1221963210;
                    }
                    break;
                case -274493048:
                case 1930246467:
                    C1189.m4368();
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 15761) ^ 370555819;
                        i6 = -415642430;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-11355)) ^ 278669231;
                        i6 = 753358451;
                    }
                    break;
                case 1535109877:
                case 1741953069:
                    C0962.m3746();
                    iM11306 = (C19806.m45029("᩻۬") + i4) * 65;
                    i5 = ((iM11306 ^ i3) * (-12949)) ^ (-1194135050);
                    i6 = 361280379;
                    break;
                default:
                    int i7 = this.f70545;
                    if (C1460.f5948 < 0) {
                        int i8 = i7 + 1;
                        this.f70545 = i8;
                        if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                            byte[] bArr = this.f70546;
                            int i9 = bArr[i7];
                            if (C2871.m8646()) {
                                int i10 = i9 & 255;
                                if (!C0797.f3386) {
                                    int i11 = i7 + 2;
                                    this.f70545 = i11;
                                    if (C2788.f10625 < 0) {
                                        int i12 = bArr[i8] & 255;
                                        if (C1460.f5948 < 0) {
                                            if (C1189.f5284 > 0) {
                                                int i13 = (i12 << 8) | i10;
                                                byte[] bArr2 = new byte[i13];
                                                if (C1398.f5802 > 0) {
                                                    C0526.m2427(bArr, i11, bArr2, 0, i13);
                                                    int i14 = this.f70545 + i13;
                                                    if (C2477.f9839 > 0) {
                                                        this.f70545 = i14;
                                                        return new String(bArr2, StandardCharsets.UTF_8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iM11306 = ThreadFactoryC3888.m11306("᩻֨") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-11355)) ^ 278669231;
                            i6 = 753358451;
                            break;
                        }
                        iM11306 = C19806.m45029("ۜۡ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31901) ^ 850259132;
                        i6 = 1246586693;
                        break;
                    }
                    iM11306 = (C19806.m45029("᩻۬") + i4) * 65;
                    i5 = ((iM11306 ^ i3) * (-12949)) ^ (-1194135050);
                    i6 = 361280379;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e7 A[PHI: r17 r18 r19
      0x01e7: PHI (r17v19 int) = (r17v17 int), (r17v20 int) binds: [B:61:0x01cf, B:53:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r18v13 short[]) = (r18v11 short[]), (r18v14 short[]) binds: [B:61:0x01cf, B:53:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r19v11 char) = (r19v9 char), (r19v12 char) binds: [B:61:0x01cf, B:53:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m48533(int i) {
        int iM11306;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int iM11309;
        int i10;
        int i11;
        int i12 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1801105353;
        int i18 = C1398.f5802;
        int i19 = C2477.f9839;
        int iM450210 = (C19806.m45029("᩵᩸") + i19) * (-49);
        int i20 = ((iM450210 ^ i18) * 23117) ^ (-1029196060);
        int i21 = iM450210 ^ 2109796938;
        short[] sArr2 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * (-27159)) >> 31));
            switch (i17) {
                case -2130822961:
                case -804059648:
                    sArr = sArr;
                    i17 = i17;
                    c = 0;
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i19;
                        i4 = ((iM45029 ^ i18) * 30491) ^ 1954139650;
                        i5 = -1647849341;
                    } else {
                        iM45029 = (C19806.m45029("ܰ۟") + i19) * (-97);
                        i4 = ((iM45029 ^ i18) * (-11859)) ^ 124727554;
                        i5 = -344843397;
                    }
                    i21 = iM45029 ^ i5;
                    i20 = i4;
                    i17 = i17;
                    sArr = sArr;
                    break;
                case -1949987306:
                case 1930452712:
                    i12 = 0;
                    iM11307 = (C19806.m45029("۟۟") + i18) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i6 = ((iM11307 ^ i19) * 16107) ^ 1882994095;
                    i7 = -1392708391;
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -1823698567:
                case -563589191:
                    C2642.m8171();
                    sArr = sArr;
                    i17 = i17;
                    iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i19;
                    i4 = ((iM45029 ^ i18) * 30491) ^ 1954139650;
                    i5 = -1647849341;
                    i21 = iM45029 ^ i5;
                    i20 = i4;
                    i17 = i17;
                    sArr = sArr;
                    break;
                case -1783651730:
                case 2031512056:
                    i12++;
                    iM11307 = (C19806.m45029("۟۟") + i18) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i6 = ((iM11307 ^ i19) * 16107) ^ 1882994095;
                    i7 = -1392708391;
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -1771617288:
                case -1691898148:
                    sArr = sArr;
                    c = c;
                    i17 = i17;
                    s = sArr[c];
                    s2 = 15526;
                    if (!RunnableC1564.f6300) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩶ۜ") + i18) * 27;
                        i6 = ((iM11307 ^ i19) * (-22817)) ^ (-1256111070);
                        i7 = -790374508;
                        i21 = iM11307 ^ i7;
                        i20 = i6;
                        i17 = i17;
                        sArr = sArr;
                        c = c;
                    } else {
                        c = c;
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i19;
                        i4 = ((iM45029 ^ i18) * 30491) ^ 1954139650;
                        i5 = -1647849341;
                        i21 = iM45029 ^ i5;
                        i20 = i4;
                        i17 = i17;
                        sArr = sArr;
                    }
                    break;
                case -1667945999:
                case 105329588:
                    C1668.m5583();
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i19;
                        i2 = ((iM11306 ^ i18) * 27433) ^ 857639583;
                        i3 = -2067467197;
                        int i22 = i2;
                        i21 = iM11306 ^ i3;
                        i20 = i22;
                    } else {
                        sArr = sArr;
                        i17 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i19;
                        i4 = ((iM45029 ^ i18) * 30491) ^ 1954139650;
                        i5 = -1647849341;
                        i21 = iM45029 ^ i5;
                        i20 = i4;
                        i17 = i17;
                        sArr = sArr;
                    }
                    break;
                case -1618522325:
                case -372576426:
                    i16 = 43214;
                    iM11307 = (ThreadFactoryC3888.m11306("ܿۡ") + i19) * (-51);
                    i6 = ((iM11307 ^ i18) * (-27747)) ^ (-2093402486);
                    i7 = -707839614;
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -1362787450:
                case 1739623762:
                    sArr = sArr;
                    c = c;
                    i17 = i17;
                    short[] sArr3 = this.f70548;
                    if (i12 < sArr3.length) {
                        iM11309 = (C19806.m45029("᩺ܰ") + i19) * 7;
                        i10 = ((iM11309 ^ i18) * 19401) ^ (-452527288);
                        i11 = 1853316611;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۗۧ") ^ i19;
                        i10 = ((iM11309 ^ i18) * 30803) ^ 413993041;
                        i11 = -863391826;
                    }
                    i21 = iM11309 ^ i11;
                    sArr2 = sArr3;
                    i20 = i10;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -1128762448:
                case 2123319160:
                    short[] sArr4 = f70544;
                    i17 = i17;
                    if (C0629.f2722 > 0) {
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            sArr = sArr;
                            c = c;
                        } else {
                            sArr = sArr;
                            String strM3747 = C0962.m3747(sArr4, 29, 3, i16);
                            short[] sArr5 = f70544;
                            if (RunnableC1606.f6488 >= 0) {
                                iM11307 = (i18 - ThreadFactoryC3888.m11306("ۢۚ")) * 83;
                                i6 = ((iM11307 ^ i19) * (-28397)) ^ (-1215118618);
                                i7 = -237098645;
                                i21 = iM11307 ^ i7;
                                i20 = i6;
                                i17 = i17;
                                sArr = sArr;
                                c = c;
                                break;
                            } else {
                                c = c;
                                StringBuilder sbM40153 = C17214.m40153(i, strM3747, RunnableC0195.m1429(sArr5, 32, 11, i16));
                                if (ThreadFactoryC3888.f14547 <= 0) {
                                    sArr = sArr;
                                } else {
                                    String string = Arrays.toString(sArr2);
                                    if (C3577.f13150 < 0) {
                                        C2788.m8480(sbM40153, string);
                                        throw new RuntimeException(C2124.m6674(sbM40153));
                                    }
                                }
                            }
                        }
                        iM11307 = (C19806.m45029("ܽ۫") ^ i18) * 79;
                        i6 = ((iM11307 ^ i19) * 9173) ^ (-376807087);
                        i7 = -1953140226;
                        i21 = iM11307 ^ i7;
                        i20 = i6;
                        i17 = i17;
                        sArr = sArr;
                        c = c;
                    } else {
                        c = c;
                    }
                    iM11308 = ThreadFactoryC3888.m11306("᩺ۨ") ^ i19;
                    i8 = ((iM11308 ^ i18) * (-18363)) ^ (-634065871);
                    i9 = -478237639;
                    i21 = iM11308 ^ i9;
                    i20 = i8;
                    i17 = i17;
                    c = c;
                    break;
                case -1085453365:
                case -130323083:
                    c = c;
                    i17 = i17;
                    sArr = f70544;
                    if (C1977.f7413 <= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("᩺ۨ") ^ i19;
                        i8 = ((iM11308 ^ i18) * (-18363)) ^ (-634065871);
                        i9 = -478237639;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("֡۟") ^ i18) * 97;
                        i8 = ((iM11308 ^ i19) * (-8099)) ^ 2010079638;
                        i9 = -2093564989;
                    }
                    i21 = iM11308 ^ i9;
                    i20 = i8;
                    i17 = i17;
                    c = c;
                    break;
                case -1071024957:
                case -92728803:
                    if (C0962.m3746() < 0) {
                        c = c;
                        i17 = i17;
                        iM11308 = ThreadFactoryC3888.m11306("᩺ۨ") ^ i19;
                        i8 = ((iM11308 ^ i18) * (-18363)) ^ (-634065871);
                        i9 = -478237639;
                        i21 = iM11308 ^ i9;
                        i20 = i8;
                        i17 = i17;
                        c = c;
                    } else {
                        sArr = sArr;
                        i17 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i19;
                        i4 = ((iM45029 ^ i18) * 30491) ^ 1954139650;
                        i5 = -1647849341;
                        i21 = iM45029 ^ i5;
                        i20 = i4;
                        i17 = i17;
                        sArr = sArr;
                    }
                    break;
                case -1061570431:
                case 1942111794:
                    sArr = sArr;
                    c = c;
                    i17 = i17;
                    if (i >= 0) {
                        iM11307 = (C19806.m45029("ۚ᩶") ^ i18) * (-45);
                        i6 = ((iM11307 ^ i19) * 29413) ^ (-16787795);
                        i7 = -1443825754;
                    } else {
                        iM11307 = C19806.m45029("ۛܿ") ^ i18;
                        i6 = ((iM11307 ^ i19) * 4143) ^ 350434298;
                        i7 = 1305343128;
                    }
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -992441195:
                case 1543330441:
                    sArr = sArr;
                    c = c;
                    i17 = i17;
                    if (i <= 255) {
                        iM11307 = (i19 - ThreadFactoryC3888.m11306("ᩳۘ")) * (-55);
                        i6 = ((iM11307 ^ i18) * 11097) ^ (-1989287918);
                        i7 = 1844227367;
                    } else {
                        iM11307 = C19806.m45029("ۛܿ") ^ i18;
                        i6 = ((iM11307 ^ i19) * 4143) ^ 350434298;
                        i7 = 1305343128;
                    }
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -940360742:
                case 1886727744:
                    sArr = sArr;
                    c = c;
                    i17 = i17;
                    if ((i14 + i15) - i13 < 0) {
                        iM11307 = C19806.m45029("۟ۚ") ^ i19;
                        i6 = ((iM11307 ^ i18) * 18901) ^ (-484151735);
                        i7 = 1044243228;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۘۜ") ^ i18;
                        i6 = ((iM11307 ^ i19) * (-23483)) ^ 1002957390;
                        i7 = -1265458734;
                    }
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -921650434:
                case 2132445759:
                    if (sArr2[i12] == i) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗܺ") ^ i18) * (-109);
                        i2 = ((iM11306 ^ i19) * (-5079)) ^ 490769293;
                        i3 = 747129303;
                    } else {
                        iM11306 = (C19806.m45029("ۡ᩻") + i18) * 87;
                        i2 = ((iM11306 ^ i19) * (-10805)) ^ 540832579;
                        i3 = 824800095;
                    }
                    int i23 = i2;
                    i21 = iM11306 ^ i3;
                    i20 = i23;
                    break;
                case -302650763:
                case 1552979806:
                    C1066.m4023();
                    return;
                case -247536120:
                case 1309425193:
                    i16 = 56877;
                    iM11307 = (ThreadFactoryC3888.m11306("ܿۡ") + i19) * (-51);
                    i6 = ((iM11307 ^ i18) * (-27747)) ^ (-2093402486);
                    i7 = -707839614;
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case -185269695:
                case 824537097:
                    C0797.m3359();
                    if (C3660.m10791() == 0) {
                        sArr = sArr;
                        c = c;
                        i17 = i17;
                        iM11307 = (C19806.m45029("ܽ۫") ^ i18) * 79;
                        i6 = ((iM11307 ^ i19) * 9173) ^ (-376807087);
                        i7 = -1953140226;
                        i21 = iM11307 ^ i7;
                        i20 = i6;
                        i17 = i17;
                        sArr = sArr;
                        c = c;
                    } else {
                        sArr = sArr;
                        i17 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i19;
                        i4 = ((iM45029 ^ i18) * 30491) ^ 1954139650;
                        i5 = -1647849341;
                        i21 = iM45029 ^ i5;
                        i20 = i4;
                        i17 = i17;
                        sArr = sArr;
                    }
                    break;
                case 57047494:
                case 1534081317:
                    sArr = sArr;
                    c = c;
                    i17 = i17;
                    i13 = s * s2;
                    i14 = s * s;
                    i15 = 60264169;
                    if (C2704.f10408) {
                        iM11307 = ThreadFactoryC3888.m11306("۫ܽ") ^ i19;
                        i6 = ((iM11307 ^ i18) * 25505) ^ 755254235;
                        i7 = -1211965306;
                    } else {
                        iM11307 = (C19806.m45029("ܽ۫") ^ i18) * 79;
                        i6 = ((iM11307 ^ i19) * 9173) ^ (-376807087);
                        i7 = -1953140226;
                    }
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                case 1725438625:
                case 2020541986:
                    sArr = sArr;
                    i17 = i17;
                    short[] sArr6 = f70544;
                    if (!C0797.f3386) {
                        throw new RuntimeException(C0817.m3406(sArr6, 1, 28, i16));
                    }
                    iM11307 = (i18 - ThreadFactoryC3888.m11306("ۢۚ")) * 83;
                    i6 = ((iM11307 ^ i19) * (-28397)) ^ (-1215118618);
                    i7 = -237098645;
                    i21 = iM11307 ^ i7;
                    i20 = i6;
                    i17 = i17;
                    sArr = sArr;
                    c = c;
                    break;
                default:
                    this.f70545 = this.f70547[i12];
                    return;
            }
        }
    }
}
