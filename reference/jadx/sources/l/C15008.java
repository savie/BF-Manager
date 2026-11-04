package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V4FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15008 {

    /* JADX INFO: renamed from: ۘۧۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f49022 = {5735, 18936, 18933, 18833, 18908, 18884, 18882, 18885, 18833, 18899, 18900, 18885, 18886, 18900, 18900, 18911, 18833, 18817, 18889, 18817, 18817, 18833, 18885, 18910, 18833, 18817, 18889, 18935, 18935, 18936, 18933, 18833, 18833, 18911, 18910, 18885, 18833, 18903, 18910, 18884, 18911, 18901, 18833};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f49023;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f49024;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final short[] f49025;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49026;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15008(byte[] bArr) {
        this(new DataInputStream(new C18933(bArr, bArr.length)));
        int i = -990520950;
        int i2 = C3099.f10023;
        int i3 = C3448.f11240;
        int iM3169 = C0773.m3169("ۛᩳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 10097) ^ (-1068598800);
        int i5 = 1500178370;
        while (true) {
            i = ((((i ^ i2) * (-31801)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2088525004:
                case -1323059812:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("ۜ᩺") + i2) * (-93);
                        i4 = ((iM3169 ^ i3) * (-21957)) ^ 568135470;
                        i5 = -290047717;
                    } else {
                        iM3169 = (C0773.m3169("᩷֡") ^ i2) * (-53);
                        i4 = ((iM3169 ^ i3) * (-26503)) ^ 493309937;
                        i5 = 426132059;
                    }
                    break;
                case -1444303801:
                case 401114046:
                    if (C1343.f4799 == 0) {
                        iM3169 = C0619.m2761("ۜ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17349) ^ (-1128632810);
                        i5 = -1626020765;
                    } else {
                        iM3169 = (C0773.m3169("֫᩷") + i3) * (-101);
                        i4 = ((iM3169 ^ i2) * 16105) ^ (-2043618180);
                        i5 = 296251674;
                    }
                    break;
                case -1368039073:
                case -202797764:
                    return;
                case -250480004:
                case 2051378118:
                    C3033.m9845();
                    if (C2287.f7432 < 0) {
                        iM3169 = C0619.m2761("ۜ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17349) ^ (-1128632810);
                        i5 = -1626020765;
                    } else {
                        iM3169 = C0773.m3169("᩵ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28995)) ^ (-1537481938);
                        i5 = -239571518;
                    }
                    break;
                case 120727159:
                case 1941031639:
                    if (C13473.f42873 == 0) {
                        iM3169 = (C0773.m3169("֫᩷") + i3) * (-101);
                        i4 = ((iM3169 ^ i2) * 16105) ^ (-2043618180);
                        i5 = 296251674;
                    } else {
                        iM3169 = C0773.m3169("ᩳۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19803)) ^ (-2098235570);
                        i5 = 425425950;
                    }
                    break;
                case 158591807:
                case 2002630616:
                    C3033.m9845();
                    iM3169 = (C0773.m3169("֫᩷") + i3) * (-101);
                    i4 = ((iM3169 ^ i2) * 16105) ^ (-2043618180);
                    i5 = 296251674;
                    break;
                default:
                    C2310.m7813();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0153 A[PHI: r8 r13 r18
      0x0153: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:43:0x0151, B:29:0x00e0, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:43:0x0151, B:29:0x00e0, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r18v25 int) = (r18v15 int), (r18v18 int), (r18v26 int) binds: [B:43:0x0151, B:29:0x00e0, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e9 A[PHI: r18
      0x01e9: PHI (r18v20 int) = (r18v10 int), (r18v19 int), (r18v21 int) binds: [B:54:0x01e7, B:25:0x00be, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0247 A[PHI: r5 r6 r10 r11 r12 r18
      0x0247: PHI (r5v4 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:62:0x0245, B:58:0x021d, B:33:0x0105, B:18:0x007f, B:16:0x007b, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r6v4 int[]) = (r6v1 int[]), (r6v2 int[]), (r6v1 int[]), (r6v1 int[]), (r6v1 int[]), (r6v1 int[]) binds: [B:62:0x0245, B:58:0x021d, B:33:0x0105, B:18:0x007f, B:16:0x007b, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r10v4 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:62:0x0245, B:58:0x021d, B:33:0x0105, B:18:0x007f, B:16:0x007b, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r11v4 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:62:0x0245, B:58:0x021d, B:33:0x0105, B:18:0x007f, B:16:0x007b, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r12v4 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:62:0x0245, B:58:0x021d, B:33:0x0105, B:18:0x007f, B:16:0x007b, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r18v31 int) = (r18v8 int), (r18v9 int), (r18v17 int), (r18v24 int), (r18v26 int), (r18v32 int) binds: [B:62:0x0245, B:58:0x021d, B:33:0x0105, B:18:0x007f, B:16:0x007b, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b7 A[PHI: r3 r9 r18 r19
      0x02b7: PHI (r3v3 byte) = (r3v2 byte), (r3v1 byte), (r3v1 byte) binds: [B:71:0x02b5, B:39:0x012f, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02b7: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:71:0x02b5, B:39:0x012f, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02b7: PHI (r18v28 int) = (r18v6 int), (r18v16 int), (r18v33 int) binds: [B:71:0x02b5, B:39:0x012f, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02b7: PHI (r19v3 int) = (r19v2 int), (r19v1 int), (r19v1 int) binds: [B:71:0x02b5, B:39:0x012f, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public C15008(DataInputStream dataInputStream) throws IOException {
        int iM3169;
        int i;
        int i2;
        byte b = 0;
        int i3 = 0;
        int i4 = 0;
        int[] iArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1153318574;
        int i13 = RunnableC0334.f1808;
        int i14 = C0269.f1558;
        int iM31610 = (C0773.m3169("᩸ۧ") + i14) * 41;
        int i15 = ((iM31610 ^ i13) * 10665) ^ 1980785792;
        int i16 = iM31610 ^ 1158366520;
        int iM10036 = 0;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i13) * 20363) >> 31));
            switch (i17) {
                case -2031189162:
                case 1760391056:
                    this.f49025 = new short[i4];
                    i5 = 0;
                    iM3169 = C0773.m3169("᩵ۨ") ^ i14;
                    i = ((iM3169 ^ i13) * (-2897)) ^ (-731261623);
                    i2 = 970655157;
                    int i18 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i18;
                    break;
                case -1799201652:
                case -6062123:
                    i17 = i17;
                    C2485.m8357();
                    C1519.m5403();
                    iM3169 = C0619.m2761("۠ۛ") ^ i13;
                    i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                    i2 = -89640084;
                    int i19 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i19;
                    break;
                case -1765848845:
                case -342012609:
                    i17 = i17;
                    this.f49024[i5] = C3077.m10036(dataInputStream);
                    if (C0950.m3785() != 0) {
                        iM3169 = C0773.m3169("۟᩺") ^ i13;
                        i = ((iM3169 ^ i14) * (-31717)) ^ (-1954440481);
                        i2 = -159868425;
                    } else {
                        iM3169 = C0773.m3169("᩷ۘ") ^ i14;
                        i = ((iM3169 ^ i13) * 375) ^ (-889459625);
                        i2 = -2037461466;
                    }
                    int i110 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i110;
                    break;
                case -1619552306:
                case 2124303290:
                    i17 = i17;
                    dataInputStream.skipBytes(i3);
                    i11 = iM10036 - 4;
                    iM3169 = C0619.m2761("ܰۤ") ^ i14;
                    i = ((iM3169 ^ i13) * 29839) ^ 139156412;
                    i2 = 342561135;
                    int i111 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i111;
                    break;
                case -1605488540:
                case -809094077:
                    i17 = i17;
                    sArr[i5] = (short) i10;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("۟᩺") ^ i13;
                        i = ((iM3169 ^ i14) * (-31717)) ^ (-1954440481);
                        i2 = -159868425;
                    } else {
                        iM3169 = C0773.m3169("ۡ۬") ^ i13;
                        i = ((iM3169 ^ i14) * 23427) ^ (-295443779);
                        i2 = -1560253929;
                    }
                    int i112 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i112;
                    break;
                case -1596253537:
                case -673602426:
                    i17 = i17;
                    iM10036 = C3077.m10036(dataInputStream);
                    b = dataInputStream.readByte();
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۢ֡") ^ i14;
                        i = ((iM3169 ^ i13) * 18513) ^ 332485702;
                        i2 = 1387975633;
                    } else {
                        iM3169 = C0773.m3169("ۜܶ") ^ i13;
                        i = ((iM3169 ^ i14) * (-21603)) ^ 1834726623;
                        i2 = 457471003;
                    }
                    int i113 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i113;
                    break;
                case -1531993077:
                case -358614969:
                    i17 = i17;
                    i10 = i8 & i9;
                    if (C0950.m3785() != 0) {
                        iM3169 = (C0773.m3169("᩺ۛ") + i14) * (-5);
                        i = ((iM3169 ^ i13) * (-26151)) ^ (-247875474);
                        i2 = -2025029172;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩹") ^ i14;
                        i = ((iM3169 ^ i13) * (-20491)) ^ (-1214189138);
                        i2 = -528458679;
                    }
                    int i114 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i114;
                    break;
                case -1446285960:
                case -410022328:
                    i5++;
                    iM3169 = C0773.m3169("᩵ۨ") ^ i14;
                    i = ((iM3169 ^ i13) * (-2897)) ^ (-731261623);
                    i2 = 970655157;
                    int i115 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i115;
                    break;
                case -1411643480:
                case 2113704241:
                    if (C2354.f7599 >= 0) {
                        i17 = i17;
                        iM3169 = C0619.m2761("۠ۛ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                        i2 = -89640084;
                    } else {
                        iM3169 = C0773.m3169("ܺۤ") ^ i13;
                        i17 = i17;
                        i = ((iM3169 ^ i14) * (-27473)) ^ 638340290;
                        i2 = -913910799;
                    }
                    int i116 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i116;
                    break;
                case -1407896696:
                case 1714044176:
                    i17 = i17;
                    i7 = i11 - i6;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۢ֡") ^ i14;
                        i = ((iM3169 ^ i13) * 18513) ^ 332485702;
                        i2 = 1387975633;
                    } else {
                        iM3169 = C0619.m2761("ۛܺ") ^ i14;
                        i = ((iM3169 ^ i13) * (-1553)) ^ (-925249943);
                        i2 = 1476747909;
                    }
                    int i117 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i117;
                    break;
                case -1310415979:
                case -1010333629:
                    if (!C3077.f9998) {
                        i17 = i17;
                        iM3169 = C0619.m2761("ۢ֡") ^ i14;
                        i = ((iM3169 ^ i13) * 18513) ^ 332485702;
                        i2 = 1387975633;
                        int i118 = i17;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        i12 = i118;
                    }
                    i17 = i17;
                    iM3169 = C0619.m2761("۠ۛ") ^ i13;
                    i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                    i2 = -89640084;
                    int i119 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i119;
                    break;
                case -1100602502:
                case -74492704:
                    i17 = i17;
                    iArr = new int[i4];
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("۠ۛ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                        i2 = -89640084;
                    } else {
                        iM3169 = (C0773.m3169("֡֨") ^ i13) * 11;
                        i = ((iM3169 ^ i14) * 27251) ^ (-1264630710);
                        i2 = 2107326125;
                    }
                    int i1110 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1110;
                    break;
                case -591103757:
                case 788222222:
                    i17 = i17;
                    i3 = 4;
                    if (b > 112) {
                        iM3169 = (C0773.m3169("֡ۧ") + i13) * (-51);
                        i = ((iM3169 ^ i14) * 10233) ^ (-1160349302);
                        i2 = -705982785;
                    } else {
                        i11 = iM10036;
                        iM3169 = C0619.m2761("ܰۤ") ^ i14;
                        i = ((iM3169 ^ i13) * 29839) ^ 139156412;
                        i2 = 342561135;
                    }
                    int i1111 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1111;
                    break;
                case -446480659:
                case 2000888101:
                    byte[] bArr = new byte[i7];
                    this.f49023 = bArr;
                    dataInputStream.readFully(bArr);
                    return;
                case -196892496:
                case -63321132:
                    i17 = i17;
                    C2878.m9491();
                    if (C2375.m8065() > 0) {
                        iM3169 = C0619.m2761("۠ۛ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                        i2 = -89640084;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۛ") + i14) * (-5);
                        i = ((iM3169 ^ i13) * (-26151)) ^ (-247875474);
                        i2 = -2025029172;
                    }
                    int i1112 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1112;
                    break;
                case 118213222:
                case 1570314725:
                    i17 = i17;
                    sArr = this.f49025;
                    i8 = dataInputStream.read();
                    i9 = 255;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("۠ۛ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                        i2 = -89640084;
                    } else {
                        iM3169 = (C0773.m3169("ۙۢ") ^ i14) * (-111);
                        i = ((iM3169 ^ i13) * 6643) ^ 734951479;
                        i2 = 1779901393;
                    }
                    int i1113 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1113;
                    break;
                case 328172452:
                case 992832708:
                    i17 = i17;
                    dataInputStream.readShort();
                    i4 = dataInputStream.readByte();
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("۠ۛ") ^ i13;
                        i = ((iM3169 ^ i14) * (-16997)) ^ (-1045355135);
                        i2 = -89640084;
                    } else {
                        iM3169 = (C0619.m2761("ܶ۫") + i14) * 3;
                        i = ((iM3169 ^ i13) * (-1587)) ^ (-1942958195);
                        i2 = 1985556316;
                    }
                    int i1114 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1114;
                    break;
                case 379496121:
                case 1983350717:
                    i17 = i17;
                    if (i5 < i4) {
                        iM3169 = (C0619.m2761("ܶܰ") + i13) * 93;
                        i = ((iM3169 ^ i14) * (-21489)) ^ (-64423611);
                        i2 = -628458720;
                    } else {
                        iM3169 = (C0619.m2761("ܿܳ") + i13) * (-39);
                        i = ((iM3169 ^ i14) * (-15337)) ^ 1042206221;
                        i2 = -1331460444;
                    }
                    int i1115 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1115;
                    break;
                case 849545557:
                case 1266870234:
                    i17 = i17;
                    this.f49024 = iArr;
                    if (C3077.m10041()) {
                        iM3169 = C0773.m3169("۟᩺") ^ i13;
                        i = ((iM3169 ^ i14) * (-31717)) ^ (-1954440481);
                        i2 = -159868425;
                    } else {
                        iM3169 = (C0773.m3169("֨᩹") + i14) * 53;
                        i = ((iM3169 ^ i13) * (-26199)) ^ (-143303151);
                        i2 = 1328137702;
                    }
                    int i1116 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1116;
                    break;
                case 1246073390:
                case 2134858639:
                    i17 = i17;
                    i6 = (i4 * 5) + i3;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("᩺ۛ") + i14) * (-5);
                        i = ((iM3169 ^ i13) * (-26151)) ^ (-247875474);
                        i2 = -2025029172;
                    } else {
                        iM3169 = (C0619.m2761("ۨ۟") ^ i13) * 51;
                        i = ((iM3169 ^ i14) * (-3207)) ^ 1470677351;
                        i2 = -751178696;
                    }
                    int i1117 = i17;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    i12 = i1117;
                    break;
                default:
                    C3734.m12152();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0123 A[PHI: r8 r11 r12
      0x0123: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:43:0x0121, B:31:0x00c0, B:17:0x0060, B:15:0x005c, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r11v3 byte) = (r11v1 byte), (r11v2 byte), (r11v1 byte), (r11v1 byte), (r11v1 byte) binds: [B:43:0x0121, B:31:0x00c0, B:17:0x0060, B:15:0x005c, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r12v3 byte) = (r12v1 byte), (r12v2 byte), (r12v1 byte), (r12v1 byte), (r12v1 byte) binds: [B:43:0x0121, B:31:0x00c0, B:17:0x0060, B:15:0x005c, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x015e A[PHI: r6 r7 r10 r13
      0x015e: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:47:0x015c, B:35:0x00e1, B:27:0x009e, B:12:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r7v3 byte) = (r7v2 byte), (r7v1 byte), (r7v1 byte), (r7v1 byte) binds: [B:47:0x015c, B:35:0x00e1, B:27:0x009e, B:12:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:47:0x015c, B:35:0x00e1, B:27:0x009e, B:12:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:47:0x015c, B:35:0x00e1, B:27:0x009e, B:12:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0191 A[PHI: r4 r5
      0x0191: PHI (r4v3 int) = (r4v2 int), (r4v1 int) binds: [B:51:0x018f, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:51:0x018f, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (l.C20932.f66974 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (l.C0773.f2792 <= 0) goto L44;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m36134() {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15008.m36134():int");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01de A[PHI: r16 r17 r18
      0x01de: PHI (r16v25 int) = (r16v16 int), (r16v27 int) binds: [B:54:0x0196, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r17v22 short[]) = (r17v13 short[]), (r17v24 short[]) binds: [B:54:0x0196, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r18v25 char) = (r18v16 char), (r18v28 char) binds: [B:54:0x0196, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m36135(int i) {
        int iM3169;
        int i2;
        short[] sArr = null;
        int i3 = 0;
        short[] sArr2 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1850751648;
        int i8 = C2702.f8586;
        int i9 = C2288.f7433;
        int iM31610 = (C0773.m3169("ܶᩳ") + i8) * 79;
        int i10 = ((iM31610 ^ i9) * 30833) ^ (-307727370);
        int i11 = 2059418793;
        while (true) {
            int i12 = iM31610 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * 24499) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2102944886:
                    case -1177682136:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        short[] sArr3 = f49022;
                        if (C13473.f42873 == 0) {
                            throw new RuntimeException(AbstractC0116.m1236(sArr3, 1, 28, i6));
                        }
                        iM3169 = C0619.m2761("ܶۖ") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-28741)) ^ (-1023527308);
                        i2 = 1203964797;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -2050006167:
                    case -229052568:
                        break;
                    case -1925393563:
                    case 505698364:
                        RunnableC3646.m11813();
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        iM3169 = (i9 - C0619.m2761("᩹ۗ")) * 83;
                        i10 = ((iM3169 ^ i8) * 2035) ^ (-940798516);
                        i2 = 1266425402;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -1893807124:
                    case -942961602:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        if (i4 - (i5 * i5) <= 0) {
                            iM3169 = C0773.m3169("ۘᩴ") ^ i9;
                            i10 = ((iM3169 ^ i8) * (-11205)) ^ 2047426585;
                            i2 = 324087554;
                        } else {
                            iM3169 = (C0773.m3169("ۙ᩵") + i8) * 29;
                            i10 = ((iM3169 ^ i9) * 18283) ^ (-1967144808);
                            i2 = -1922361378;
                        }
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -1796577417:
                    case 1582407544:
                        C2878.m9491();
                        C1564.m5509();
                        return;
                    case -1769680520:
                    case 1111047478:
                        short[] sArr4 = f49022;
                        i7 = i7;
                        if (C0269.f1558 <= 0) {
                            int iM2761 = C0619.m2761("ۢۜ") ^ i9;
                            i10 = (-1627125618) ^ ((iM2761 ^ i8) * 26549);
                            i12 = 2088149851 ^ iM2761;
                            i7 = i7;
                        } else if (C1783.f6087 > 0) {
                            sArr2 = sArr2;
                            String strM53420 = C23916.m53420(sArr4, 29, 3, i6);
                            short[] sArr5 = f49022;
                            if (C1542.f5343 > 0) {
                                c = c;
                                StringBuilder sbM12235 = C3769.m12235(i, strM53420, C23916.m53420(sArr5, 32, 11, i6));
                                if (C3448.m11248() == 0) {
                                    String string = Arrays.toString(sArr);
                                    if (C1146.f4234 < 0) {
                                        C1783.m6234(sbM12235, string);
                                        throw new RuntimeException(C1080.m4058(sbM12235));
                                    }
                                    iM3169 = (i8 - C0773.m3169("ۨ۠")) * (-21);
                                    i10 = ((iM3169 ^ i9) * (-32109)) ^ (-2052725604);
                                    i2 = 1625314147;
                                }
                                i12 = iM3169 ^ i2;
                                i7 = i7;
                                sArr2 = sArr2;
                                c = c;
                            } else {
                                c = c;
                            }
                            iM3169 = C0619.m2761("ܶۖ") ^ i9;
                            i10 = ((iM3169 ^ i8) * (-28741)) ^ (-1023527308);
                            i2 = 1203964797;
                            i12 = iM3169 ^ i2;
                            i7 = i7;
                            sArr2 = sArr2;
                            c = c;
                        } else {
                            sArr2 = sArr2;
                            c = c;
                            iM3169 = (C0619.m2761("ۗܿ") ^ i8) * (-83);
                            i10 = ((iM3169 ^ i9) * 22803) ^ 1395076366;
                            i2 = 1731838258;
                            i12 = iM3169 ^ i2;
                            i7 = i7;
                            sArr2 = sArr2;
                            c = c;
                        }
                        break;
                    case -1569935072:
                    case 1203709975:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        i4 = s * s2;
                        i5 = s + 15;
                        if (C4238.f15451 >= 0) {
                            iM3169 = (i9 - C0619.m2761("᩹ۗ")) * 83;
                            i10 = ((iM3169 ^ i8) * 2035) ^ (-940798516);
                            i2 = 1266425402;
                        } else {
                            iM3169 = C0619.m2761("ۢ᩻") ^ i9;
                            i10 = ((iM3169 ^ i8) * 24643) ^ (-677372806);
                            i2 = -313785496;
                        }
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -1415654641:
                    case 630311488:
                        if (C0773.m3161() != 0) {
                            sArr2 = sArr2;
                            c = c;
                            i7 = i7;
                            iM3169 = (i8 - C0773.m3169("ۨ۠")) * (-21);
                            i10 = ((iM3169 ^ i9) * (-32109)) ^ (-2052725604);
                            i2 = 1625314147;
                            i12 = iM3169 ^ i2;
                            i7 = i7;
                            sArr2 = sArr2;
                            c = c;
                        } else {
                            i7 = i7;
                            int iM2762 = C0619.m2761("ۢۜ") ^ i9;
                            i10 = (-1627125618) ^ ((iM2762 ^ i8) * 26549);
                            i12 = 2088149851 ^ iM2762;
                            i7 = i7;
                        }
                        break;
                    case -1273723511:
                    case -1178575802:
                        i6 = UMModuleRegister.SHARE_EVENT_VALUE_LOW;
                        iM3169 = (C0619.m2761("ۡ᩵") ^ i9) * (-37);
                        i10 = ((iM3169 ^ i8) * 17717) ^ 1129988701;
                        i2 = 276354050;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -1153263888:
                    case 61787188:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        sArr = this.f49025;
                        if (i3 < sArr.length) {
                            iM3169 = (i9 - C0773.m3169("ᩴۧ")) * 39;
                            i10 = ((iM3169 ^ i8) * 15037) ^ 211247283;
                            i2 = 2143905615;
                        } else {
                            iM3169 = C0619.m2761("᩷ۚ") ^ i9;
                            i10 = ((iM3169 ^ i8) * 25547) ^ (-340671688);
                            i2 = -187314842;
                        }
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -705869104:
                    case 353981332:
                        i3 = 0;
                        iM3169 = C0773.m3169("֡ᩴ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-1297)) ^ (-1120451062);
                        i2 = -215172673;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -478413354:
                    case 478777187:
                        C3734.m12152();
                        if (C3492.f12043 <= 0) {
                            i7 = i7;
                            int iM2763 = C0619.m2761("ۢۜ") ^ i9;
                            i10 = (-1627125618) ^ ((iM2763 ^ i8) * 26549);
                            i12 = 2088149851 ^ iM2763;
                            i7 = i7;
                        } else {
                            sArr2 = sArr2;
                            c = c;
                            i7 = i7;
                            iM3169 = (i9 - C0619.m2761("᩹ۗ")) * 83;
                            i10 = ((iM3169 ^ i8) * 2035) ^ (-940798516);
                            i2 = 1266425402;
                            i12 = iM3169 ^ i2;
                            i7 = i7;
                            sArr2 = sArr2;
                            c = c;
                        }
                        break;
                    case -187482192:
                    case 1847152271:
                        if (C4282.f15546 > 0) {
                            sArr2 = sArr2;
                            c = c;
                            i7 = i7;
                            iM3169 = (C0619.m2761("ۗܿ") ^ i8) * (-83);
                            i10 = ((iM3169 ^ i9) * 22803) ^ 1395076366;
                            i2 = 1731838258;
                            i12 = iM3169 ^ i2;
                            i7 = i7;
                            sArr2 = sArr2;
                            c = c;
                        }
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        iM3169 = (i9 - C0619.m2761("᩹ۗ")) * 83;
                        i10 = ((iM3169 ^ i8) * 2035) ^ (-940798516);
                        i2 = 1266425402;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case -80808919:
                    case 1867659648:
                        i3++;
                        iM3169 = C0773.m3169("֡ᩴ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-1297)) ^ (-1120451062);
                        i2 = -215172673;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case 289963973:
                    case 363724194:
                        short[] sArr6 = sArr2;
                        i7 = i7;
                        c = 0;
                        if (C2966.f9654 >= 0) {
                            sArr2 = sArr6;
                            int iM2764 = C0619.m2761("ۢۜ") ^ i9;
                            i10 = (-1627125618) ^ ((iM2764 ^ i8) * 26549);
                            i12 = 2088149851 ^ iM2764;
                            i7 = i7;
                        } else {
                            int iM2765 = (C0619.m2761("ۘܽ") + i8) * (-13);
                            i10 = ((iM2765 ^ i9) * 24163) ^ 159178059;
                            i12 = iM2765 ^ 1041249379;
                            i7 = i7;
                            sArr2 = sArr6;
                        }
                        break;
                    case 541496510:
                    case 1964181730:
                        c = c;
                        i7 = i7;
                        sArr2 = f49022;
                        if (C1343.f4799 == 0) {
                            int iM2766 = C0619.m2761("᩺ۡ") ^ i9;
                            i10 = ((iM2766 ^ i8) * (-30665)) ^ 286502509;
                            i12 = iM2766 ^ 1931043647;
                            i7 = i7;
                            c = c;
                        } else {
                            c = c;
                            int iM2767 = C0619.m2761("ۢۜ") ^ i9;
                            i10 = (-1627125618) ^ ((iM2767 ^ i8) * 26549);
                            i12 = 2088149851 ^ iM2767;
                            i7 = i7;
                        }
                        break;
                    case 1093811405:
                    case 1821527064:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        if (i <= 255) {
                            iM3169 = (i9 - C0773.m3169("ۡ᩸")) * 95;
                            i10 = ((iM3169 ^ i8) * (-23667)) ^ 2098596522;
                            i2 = -1446056886;
                        } else {
                            iM3169 = (C0773.m3169("ۖ֡") + i8) * (-111);
                            i10 = ((iM3169 ^ i9) * 9409) ^ (-456759224);
                            i2 = 355248573;
                        }
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case 1318619587:
                    case 1728637242:
                        this.f49026 = this.f49024[i3];
                        return;
                    case 1696941841:
                    case 1816339248:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        s = sArr2[c];
                        s2 = 60;
                        if (C2354.f7599 >= 0) {
                            iM3169 = (C0619.m2761("ۗܿ") ^ i8) * (-83);
                            i10 = ((iM3169 ^ i9) * 22803) ^ 1395076366;
                            i2 = 1731838258;
                        } else {
                            iM3169 = (C0619.m2761("ۜۨ") ^ i8) * 49;
                            i10 = ((iM3169 ^ i9) * 1139) ^ (-128961600);
                            i2 = 2138387472;
                        }
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    case 1760271381:
                    case 1896081091:
                        i6 = 18865;
                        iM3169 = (C0619.m2761("ۡ᩵") ^ i9) * (-37);
                        i10 = ((iM3169 ^ i8) * 17717) ^ 1129988701;
                        i2 = 276354050;
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                    default:
                        sArr2 = sArr2;
                        c = c;
                        i7 = i7;
                        if (i >= 0) {
                            iM3169 = (C0619.m2761("᩺ᩴ") + i8) * (-123);
                            i10 = ((iM3169 ^ i9) * 12603) ^ 1007920180;
                            i2 = 1569577942;
                        } else {
                            iM3169 = (C0773.m3169("ۖ֡") + i8) * (-111);
                            i10 = ((iM3169 ^ i9) * 9409) ^ (-456759224);
                            i2 = 355248573;
                        }
                        i12 = iM3169 ^ i2;
                        i7 = i7;
                        sArr2 = sArr2;
                        c = c;
                        break;
                }
            }
            if (sArr[i3] == i) {
                iM31610 = (C0773.m3169("۠ܺ") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                i10 = ((iM31610 ^ i9) * 23717) ^ 713811314;
                i11 = 137264369;
            } else {
                iM31610 = (C0773.m3169("ۤ᩹") + i8) * (-125);
                i10 = ((iM31610 ^ i9) * (-31857)) ^ 1432358811;
                i11 = -835606669;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36136(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 1946859442;
        int i5 = C1519.f5300;
        int i6 = C23916.f77426;
        int iM2761 = C0619.m2761("᩹ۤ") ^ i6;
        int i7 = ((iM2761 ^ i5) * 23263) ^ (-1084389231);
        int i8 = 1995300230;
        while (true) {
            i4 = ((((i4 ^ i5) * 799) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -1922205181:
                case 380059584:
                    if (C3779.f12953 > 0) {
                        iM2761 = C0619.m2761("ۨ֨") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-3173)) ^ 472802709;
                        i8 = -1357633813;
                    } else {
                        iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                        i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                        i8 = -88406259;
                    }
                    break;
                case -1893466389:
                case 1924443500:
                    C0773.m3161();
                    C1146.m4231();
                    return false;
                case -1834072203:
                case 623201907:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("֫ۡ") ^ i6) * (-109);
                        i7 = ((iM2761 ^ i5) * 29021) ^ (-1972845538);
                        i8 = -1735939695;
                    } else {
                        iM2761 = C0773.m3169("᩺᩻") ^ i6;
                        i7 = ((iM2761 ^ i5) * 8853) ^ (-1532591830);
                        i8 = -1614643164;
                    }
                    break;
                case -1524458253:
                case -1300574511:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                        i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                        i8 = -88406259;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩸֡")) * (-33);
                        i7 = ((iM2761 ^ i6) * (-18539)) ^ (-498451761);
                        i8 = -501402718;
                    }
                    break;
                case -1202354897:
                case -803992592:
                    m36135(i);
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("۫ۗ") ^ i6) * 19;
                        i7 = ((iM2761 ^ i5) * 14999) ^ (-1675456572);
                        i8 = 1212458478;
                    } else {
                        iM2761 = C0619.m2761("ۗᩳ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-6053)) ^ 980801307;
                        i8 = 585832170;
                    }
                    break;
                case -754658168:
                case 1244625707:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0619.m2761("֫ۡ") ^ i6) * (-109);
                        i7 = ((iM2761 ^ i5) * 29021) ^ (-1972845538);
                        i8 = -1735939695;
                    } else {
                        iM2761 = (C0773.m3169("۫ۚ") + i6) * 89;
                        i7 = ((iM2761 ^ i5) * (-31165)) ^ 1733873428;
                        i8 = -2044238401;
                    }
                    break;
                case -607955376:
                case -9201118:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                        i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                        i8 = -88406259;
                    } else {
                        iM2761 = (i6 - C0773.m3169("۬ܿ")) * 67;
                        i7 = ((iM2761 ^ i5) * (-6085)) ^ (-512115539);
                        i8 = -787392730;
                    }
                    break;
                case -40539991:
                case 628354309:
                    i2 = this.f49026;
                    i3 = 1;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("᩶ۙ") ^ i6) * 77;
                        i7 = ((iM2761 ^ i5) * 6471) ^ (-508397134);
                        i8 = -1900206207;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܰ") ^ i5) * (-121);
                        i7 = ((iM2761 ^ i6) * 18193) ^ (-2105634748);
                        i8 = 393511643;
                    }
                    break;
                case 383752841:
                case 1992568049:
                    return false;
                case 468067476:
                case 1275966875:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("᩶ۙ") ^ i6) * 77;
                        i7 = ((iM2761 ^ i5) * 6471) ^ (-508397134);
                        i8 = -1900206207;
                    } else {
                        iM2761 = C0773.m3169("᩸ܿ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13261) ^ (-517662804);
                        i8 = 1667724908;
                    }
                    break;
                case 829807388:
                case 1731917248:
                    if (this.f49023[i2] != 0) {
                        iM2761 = C0619.m2761("ۚᩴ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 7987) ^ (-881472468);
                        i8 = -2080987794;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۖᩴ")) * 71;
                        i7 = ((iM2761 ^ i5) * 27573) ^ 1499029019;
                        i8 = 571358841;
                    }
                    break;
                case 862507911:
                case 1502027325:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0773.m3169("۫ۗ") ^ i6) * 19;
                        i7 = ((iM2761 ^ i5) * 14999) ^ (-1675456572);
                        i8 = 1212458478;
                    } else {
                        iM2761 = (C0619.m2761("ۛۚ") + i5) * (-77);
                        i7 = ((iM2761 ^ i6) * 5073) ^ (-252771455);
                        i8 = -1963994369;
                    }
                    break;
                case 1002592752:
                case 1287558624:
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0773.m3169("۫ۗ") ^ i6) * 19;
                        i7 = ((iM2761 ^ i5) * 14999) ^ (-1675456572);
                        i8 = 1212458478;
                    } else {
                        iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                        i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                        i8 = -88406259;
                    }
                    break;
                case 1279488901:
                case 1356900008:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                        i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                        i8 = -88406259;
                    } else {
                        iM2761 = C0773.m3169("ܶܺ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 30243) ^ 1681347297;
                        i8 = -94685048;
                    }
                    break;
                case 1361964366:
                case 1552472971:
                    return true;
                case 1705945708:
                case 1953552017:
                    C4282.m13644();
                    C0862.m3503();
                    iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                    i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                    i8 = -88406259;
                    break;
                case 1738832402:
                case 1886022932:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("֫ۡ") ^ i6) * (-109);
                        i7 = ((iM2761 ^ i5) * 29021) ^ (-1972845538);
                        i8 = -1735939695;
                    } else {
                        iM2761 = (C0619.m2761("ۘۧ") + i5) * (-43);
                        i7 = ((iM2761 ^ i6) * 7921) ^ (-1393311497);
                        i8 = -88406259;
                    }
                    break;
                default:
                    this.f49026 = i2 + i3;
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0619.m2761("ۨ֨") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-3173)) ^ 472802709;
                        i8 = -1357633813;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۗ") + i6) * 77;
                        i7 = ((iM2761 ^ i5) * 20431) ^ 637613417;
                        i8 = -2043882984;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m36138(int i) {
        int iM36134 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int iM36135 = 0;
        long j4 = 0;
        int i2 = 315223872;
        int i3 = C2702.f8586;
        int i4 = C2288.f7433;
        int iM2761 = (C0619.m2761("ܽᩴ") ^ i4) * 63;
        int i5 = ((iM2761 ^ i3) * (-22665)) ^ (-1600271995);
        int i6 = -416243374;
        while (true) {
            i2 = ((((i2 ^ i3) * (-8211)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2045952598:
                case -332436767:
                    j3 = j & j2;
                    iM36135 = m36134();
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("ۗۖ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * 3469) ^ 440341451;
                        i6 = -1856313324;
                    } else {
                        iM2761 = C0619.m2761("᩵ۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10671)) ^ 9393584;
                        i6 = -785200215;
                    }
                    break;
                case -2040372693:
                case 322199798:
                    C2702.m8876();
                    return 0L;
                case -1819439281:
                case 1819848162:
                    C0487.m2356();
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩸ܽ")) * (-49);
                        i5 = ((iM2761 ^ i4) * (-24931)) ^ (-1978978663);
                        i6 = 2045960131;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩵᩻")) * 71;
                        i5 = ((iM2761 ^ i3) * 30859) ^ (-625330174);
                        i6 = 1357543991;
                    }
                    break;
                case -1618659996:
                case 629023667:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ܿᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30575)) ^ 1341538152;
                        i6 = 237662635;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩻") ^ i4;
                        i5 = ((iM2761 ^ i3) * 4967) ^ (-1636942631);
                        i6 = -1523827299;
                    }
                    break;
                case -1540811928:
                case 426634371:
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0619.m2761("ۗۖ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * 3469) ^ 440341451;
                        i6 = -1856313324;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22555)) ^ 1727384862;
                        i6 = -2021005496;
                    }
                    break;
                case -1319694819:
                case 1671887066:
                    j = iM36134;
                    j2 = 4294967295L;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۙۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21163)) ^ 1446077065;
                        i6 = -1581758856;
                    } else {
                        iM2761 = C0773.m3169("ۧ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-32143)) ^ 1696841728;
                        i6 = -832372340;
                    }
                    break;
                case -1285302285:
                case 1829139845:
                    j4 = iM36135;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۗۖ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * 3469) ^ 440341451;
                        i6 = -1856313324;
                    } else {
                        iM2761 = C0773.m3169("ۜۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22055) ^ 1541073560;
                        i6 = -1170862887;
                    }
                    break;
                case -947981031:
                case 749268552:
                    if (C0773.m3161() != 0) {
                        iM2761 = C0773.m3169("ۙۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21163)) ^ 1446077065;
                        i6 = -1581758856;
                    } else {
                        iM2761 = C0773.m3169("֫᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-27663)) ^ (-966171941);
                        i6 = -1642253274;
                    }
                    break;
                case -715905628:
                case 1803977031:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ۗۖ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * 3469) ^ 440341451;
                        i6 = -1856313324;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩸") + i3) * 31;
                        i5 = ((iM2761 ^ i4) * (-6235)) ^ 1075586474;
                        i6 = -588853581;
                    }
                    break;
                case -438620504:
                case 1486462970:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("ۙۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21163)) ^ 1446077065;
                        i6 = -1581758856;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֡᩵")) * (-107);
                        i5 = ((iM2761 ^ i4) * (-26119)) ^ 1623501658;
                        i6 = -1668873765;
                    }
                    break;
                case -371819803:
                case 923987628:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("ۗۖ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * 3469) ^ 440341451;
                        i6 = -1856313324;
                    } else {
                        iM2761 = C0773.m3169("ܿᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30575)) ^ 1341538152;
                        i6 = 237662635;
                    }
                    break;
                case -295958217:
                case 1519831674:
                    C1783.m6232();
                    iM2761 = (i4 - C0619.m2761("᩵᩻")) * 71;
                    i5 = ((iM2761 ^ i3) * 30859) ^ (-625330174);
                    i6 = 1357543991;
                    break;
                case -229101330:
                case 165614416:
                    return (j4 << 32) | j3;
                case -36116814:
                case 1118901280:
                    iM36134 = m36134();
                    if (C0773.m3161() != 0) {
                        iM2761 = C0773.m3169("ۙۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-21163)) ^ 1446077065;
                        i6 = -1581758856;
                    } else {
                        iM2761 = (C0619.m2761("֡۫") ^ i4) * (-29);
                        i5 = ((iM2761 ^ i3) * (-5843)) ^ 209053826;
                        i6 = -1090283745;
                    }
                    break;
                case 119384906:
                case 708452979:
                    C3779.m12264();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ܿᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30575)) ^ 1341538152;
                        i6 = 237662635;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩸ܽ")) * (-49);
                        i5 = ((iM2761 ^ i4) * (-24931)) ^ (-1978978663);
                        i6 = 2045960131;
                    }
                    break;
                default:
                    m36135(i);
                    if (C20932.m47848() != 0) {
                        iM2761 = (i3 - C0619.m2761("᩸ܽ")) * (-49);
                        i5 = ((iM2761 ^ i4) * (-24931)) ^ (-1978978663);
                        i6 = 2045960131;
                    } else {
                        iM2761 = (C0619.m2761("᩶᩷") + i4) * 53;
                        i5 = ((iM2761 ^ i3) * (-15979)) ^ 884480960;
                        i6 = 419454998;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m36137(int i) {
        int i2 = 1990888207;
        int i3 = AbstractC0116.f1064;
        int i4 = C1542.f5343;
        int iM3169 = (C0773.m3169("ۖ֫") + i3) * (-89);
        int i5 = ((iM3169 ^ i4) * 31583) ^ (-1611302211);
        int i6 = -738957616;
        while (true) {
            i2 = ((((i2 ^ i4) * 4705) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2073212355:
                case 1101502408:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("۟ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 18105) ^ (-1849789026);
                        i6 = 294052783;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩸") ^ i4) * (-117);
                        i5 = ((iM3169 ^ i3) * (-8249)) ^ (-929324341);
                        i6 = 599611869;
                    }
                    break;
                case -1982537426:
                case 1477426808:
                    C20932.m47848();
                    C13473.m33144();
                    iM3169 = C0773.m3169("֫ᩳ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 1317) ^ (-399303477);
                    i6 = -1951142772;
                    break;
                case -1941019172:
                case 1428734886:
                    C3448.m11248();
                    if (C4282.f15546 > 0) {
                        iM3169 = (C0619.m2761("۠᩹") ^ i3) * (-51);
                        i5 = ((iM3169 ^ i4) * (-6803)) ^ 1385957471;
                        i6 = -1479113841;
                    } else {
                        iM3169 = C0773.m3169("֫ᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 1317) ^ (-399303477);
                        i6 = -1951142772;
                    }
                    break;
                case -1716215845:
                case -1026365816:
                    C1080.m4050();
                    C1321.m4852();
                    return null;
                case 362332708:
                case 2101021717:
                    if (C4238.m13540() > 0) {
                        iM3169 = (C0773.m3169("ۛ᩸") ^ i4) * (-117);
                        i5 = ((iM3169 ^ i3) * (-8249)) ^ (-929324341);
                        i6 = 599611869;
                    } else {
                        iM3169 = (C0619.m2761("۠᩹") ^ i3) * (-51);
                        i5 = ((iM3169 ^ i4) * (-6803)) ^ 1385957471;
                        i6 = -1479113841;
                    }
                    break;
                case 415025911:
                case 494050945:
                    int i7 = this.f49026;
                    if (!RunnableC3646.f12471) {
                        int i8 = i7 + 1;
                        this.f49026 = i8;
                        if (!C0619.m2763()) {
                            byte[] bArr = this.f49023;
                            int i9 = bArr[i7];
                            if (C1146.f4234 < 0) {
                                int i10 = i9 & 255;
                                if (C3033.f9831 >= 0) {
                                    iM3169 = C0619.m2761("۟ܶ") ^ i3;
                                    i5 = ((iM3169 ^ i4) * 18105) ^ (-1849789026);
                                    i6 = 294052783;
                                    break;
                                } else {
                                    int i11 = i7 + 2;
                                    this.f49026 = i11;
                                    if (C2834.f9334 > 0) {
                                        int i12 = bArr[i8] & 255;
                                        if (C0773.f2792 > 0) {
                                            if (C2310.f7472 < 0) {
                                                int i13 = (i12 << 8) | i10;
                                                byte[] bArr2 = new byte[i13];
                                                if (!RunnableC3646.f12471) {
                                                    C2702.m8882(bArr, i11, bArr2, 0, i13);
                                                    int i14 = this.f49026 + i13;
                                                    if (C2966.f9654 < 0) {
                                                        this.f49026 = i14;
                                                        return new String(bArr2, StandardCharsets.UTF_8);
                                                    }
                                                    iM3169 = (C0773.m3169("ۛ᩸") ^ i4) * (-117);
                                                    i5 = ((iM3169 ^ i3) * (-8249)) ^ (-929324341);
                                                    i6 = 599611869;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iM3169 = C0773.m3169("֫ᩳ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 1317) ^ (-399303477);
                            i6 = -1951142772;
                        } else {
                            iM3169 = (C0619.m2761("۠᩹") ^ i3) * (-51);
                            i5 = ((iM3169 ^ i4) * (-6803)) ^ 1385957471;
                            i6 = -1479113841;
                        }
                        break;
                    }
                    iM3169 = (i4 - C0773.m3169("᩺֨")) * (-85);
                    i5 = ((iM3169 ^ i3) * (-11275)) ^ (-220628037);
                    i6 = -499515358;
                    break;
                default:
                    m36135(i);
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0773.m3169("֫ᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 1317) ^ (-399303477);
                        i6 = -1951142772;
                    } else {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7433)) ^ (-814023989);
                        i6 = 480432176;
                    }
                    break;
            }
        }
    }
}
