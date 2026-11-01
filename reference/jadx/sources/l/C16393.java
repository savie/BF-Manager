package l;

import android.util.Base64;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q139 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16393 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C16531 f52749;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52751;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5809[] f52752;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0164 f52753;

    /* JADX INFO: renamed from: ۨ᩶᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f52750 = {287, 2757, 2801, 2808, 2772, 2777, 2772, 2767, 2756, 2769, 2723, 2800, 2780, 2734, 2782, 2812, 2735, 2779, 2724, 2808, 2725, 2800, 2785, 2734, 2752, 2775, 2721, 2757, 2758, 2804, 2780, 2812, 2772, 7901, -4317, -4328, -4351, -4351};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f52748 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38603(String str) {
        this.f52752[m38601(str)].m15990(this.f52753, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38600(C16531 c16531) {
        f52749 = c16531;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01e8 A[PHI: r2 r6 r7 r16
      0x01e8: PHI (r2v4 char) = (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:60:0x01e6, B:48:0x017a, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:60:0x01e6, B:48:0x017a, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:60:0x01e6, B:48:0x017a, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r16v15 int) = (r16v3 int), (r16v6 int), (r16v16 int) binds: [B:60:0x01e6, B:48:0x017a, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0246 A[PHI: r1 r16
      0x0246: PHI (r1v4 short[]) = (r1v2 short[]), (r1v3 short[]), (r1v2 short[]) binds: [B:68:0x0244, B:64:0x0223, B:19:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r16v13 int) = (r16v1 int), (r16v2 int), (r16v14 int) binds: [B:68:0x0244, B:64:0x0223, B:19:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x026e A[PHI: r3 r4 r5 r8 r16
      0x026e: PHI (r3v4 short) = (r3v3 short), (r3v2 short), (r3v2 short), (r3v2 short) binds: [B:56:0x01c0, B:52:0x019c, B:44:0x0156, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:56:0x01c0, B:52:0x019c, B:44:0x0156, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:56:0x01c0, B:52:0x019c, B:44:0x0156, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:56:0x01c0, B:52:0x019c, B:44:0x0156, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r16v17 int) = (r16v4 int), (r16v5 int), (r16v7 int), (r16v20 int) binds: [B:56:0x01c0, B:52:0x019c, B:44:0x0156, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38601(String str) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int iM11307;
        int i4;
        int i5;
        int i6 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1870360598;
        int i12 = C2788.f10625;
        int i13 = C2642.f10294;
        int iM45029 = (C19806.m45029("ۜ᩸") ^ i13) * (-17);
        int i14 = ((iM45029 ^ i12) * (-25713)) ^ 63964347;
        int i15 = -1564857555;
        while (true) {
            int i16 = iM45029 ^ i15;
            while (true) {
                i11 = ((((i11 ^ i12) * 27225) >> 31) & i14) ^ i16;
                switch (i11) {
                    case -1917411008:
                    case 2133772308:
                        i = i6;
                        i9 = s * s3;
                        if (C1189.f5284 <= 0) {
                            iM11306 = C19806.m45029("ۘܽ") ^ i13;
                            i2 = ((iM11306 ^ i12) * 5909) ^ 840028360;
                            i3 = -617720795;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i12;
                            i2 = ((iM11306 ^ i13) * 20755) ^ (-1077156117);
                            i3 = -469543777;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case -1881248812:
                    case 1753974082:
                        if (RunnableC3388.f12514 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i13) * (-45);
                            i14 = ((iM45029 ^ i12) * (-3951)) ^ (-257614949);
                            i15 = -775206780;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i13;
                            i14 = ((iM45029 ^ i12) * 12881) ^ 1044670538;
                            i15 = -2054703913;
                        }
                        break;
                    case -1720605242:
                    case 20599737:
                        i10 = 61293;
                        iM11307 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i13;
                        i = i6;
                        i4 = ((iM11307 ^ i12) * (-2147)) ^ (-860717570);
                        i5 = 1447590182;
                        i14 = i4;
                        i16 = iM11307 ^ i5;
                        i6 = i;
                        break;
                    case -1709435969:
                    case 1544867563:
                        C3535.m10431();
                        return 0;
                    case -1663088672:
                    case -799680040:
                        short[] sArr2 = f52750;
                        if (C0671.f2816 == 0) {
                            if (C3660.f13403 < 0) {
                                throw new RuntimeException(C0216.m1588(sArr2, 34, 4, i10));
                            }
                            iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i13;
                            i14 = ((iM45029 ^ i12) * 12881) ^ 1044670538;
                            i15 = -2054703913;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i13) * (-45);
                            i14 = ((iM45029 ^ i12) * (-3951)) ^ (-257614949);
                            i15 = -775206780;
                        }
                        break;
                    case -1558086234:
                    case 837634025:
                        i = i6;
                        if ((i9 + 1) - i8 > 0) {
                            iM11306 = (C19806.m45029("۠ܿ") + i13) * (-39);
                            i2 = ((iM11306 ^ i12) * 29049) ^ 1651621423;
                            i3 = -347975973;
                        } else {
                            iM11306 = (C19806.m45029("֫᩺") + i12) * (-57);
                            i2 = ((iM11306 ^ i13) * 5111) ^ (-812040416);
                            i3 = -992930779;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case -1544085299:
                    case -1254082727:
                        C0278.m1789();
                        if (CallableC1627.m5507() == 0) {
                            i = i6;
                            iM11306 = C19806.m45029("֫۟") ^ i12;
                            i2 = ((iM11306 ^ i13) * (-29271)) ^ (-1374604795);
                            i3 = -1215950994;
                            i16 = iM11306 ^ i3;
                            i14 = i2;
                            i6 = i;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i13;
                            i14 = ((iM45029 ^ i12) * 12881) ^ 1044670538;
                            i15 = -2054703913;
                        }
                        break;
                    case -1460524347:
                    case 988159368:
                        i = i6;
                        i7 = s + s2;
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM11306 = C19806.m45029("ۘܽ") ^ i13;
                            i2 = ((iM11306 ^ i12) * 5909) ^ 840028360;
                            i3 = -617720795;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i13;
                            i2 = ((iM11306 ^ i12) * (-20871)) ^ (-1078968245);
                            i3 = 1767927803;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case -1384509537:
                    case 1609248696:
                        i = i6;
                        c = '!';
                        if (C3722.f13525 <= 0) {
                            iM11306 = (i12 - C19806.m45029("ۤᩳ")) * (-7);
                            i2 = ((iM11306 ^ i13) * 29709) ^ 953826727;
                            i3 = -1449111717;
                        } else {
                            iM11306 = (C19806.m45029("ۧ᩹") ^ i13) * (-75);
                            i2 = ((iM11306 ^ i12) * (-6073)) ^ (-1492941224);
                            i3 = -294498429;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case -999522198:
                    case -218130966:
                        i10 = 63696;
                        iM11307 = ThreadFactoryC3888.m11306("᩻ܶ") ^ i13;
                        i = i6;
                        i4 = ((iM11307 ^ i12) * (-2147)) ^ (-860717570);
                        i5 = 1447590182;
                        i14 = i4;
                        i16 = iM11307 ^ i5;
                        i6 = i;
                        break;
                    case -994708102:
                    case -741563249:
                        C3535.m10431();
                        if (C2788.m8472() == 0) {
                            i = i6;
                            iM11306 = (i12 - C19806.m45029("ۤᩳ")) * (-7);
                            i2 = ((iM11306 ^ i13) * 29709) ^ 953826727;
                            i3 = -1449111717;
                            i16 = iM11306 ^ i3;
                            i14 = i2;
                            i6 = i;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻ۤ") ^ i13) * (-45);
                            i14 = ((iM45029 ^ i12) * (-3951)) ^ (-257614949);
                            i15 = -775206780;
                        }
                        break;
                    case -881386479:
                    case 1651004204:
                        C2871.m8646();
                        iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i13;
                        i14 = ((iM45029 ^ i12) * 12881) ^ 1044670538;
                        i15 = -2054703913;
                        break;
                    case 245758314:
                    case 1105641862:
                        i = i6;
                        if (C1189.f5284 <= 0) {
                            iM11306 = C19806.m45029("֫۟") ^ i12;
                            i2 = ((iM11306 ^ i13) * (-29271)) ^ (-1374604795);
                            i3 = -1215950994;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i12;
                            i2 = ((iM11306 ^ i13) * 17415) ^ (-1948552576);
                            i3 = -911657140;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case 428633601:
                    case 1394357099:
                        i = i6;
                        s = sArr[c];
                        s2 = 1;
                        if (C1977.f7413 <= 0) {
                            iM11306 = C19806.m45029("ۘܽ") ^ i13;
                            i2 = ((iM11306 ^ i12) * 5909) ^ 840028360;
                            i3 = -617720795;
                        } else {
                            iM11306 = (i12 - ThreadFactoryC3888.m11306("ܽ᩸")) * (-97);
                            i2 = ((iM11306 ^ i13) * (-29077)) ^ 1764818808;
                            i3 = -901903251;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case 474416767:
                    case 650053056:
                        i = i6;
                        sArr = f52750;
                        if (C3660.m10791() != 0) {
                            iM11306 = C19806.m45029("֫۟") ^ i12;
                            i2 = ((iM11306 ^ i13) * (-29271)) ^ (-1374604795);
                            i3 = -1215950994;
                        } else {
                            iM11306 = (C19806.m45029("ܺۚ") + i12) * 127;
                            i2 = ((iM11306 ^ i13) * 21163) ^ (-970073097);
                            i3 = -1937570091;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case 1238384391:
                    case 2077304450:
                        int iIndexOf = this.f52751.indexOf(str);
                        if (iIndexOf == -1) {
                            i = iIndexOf;
                            iM11306 = (ThreadFactoryC3888.m11306("ᩴ֨") + i12) * 115;
                            i2 = ((iM11306 ^ i13) * 14643) ^ (-612693452);
                            i3 = -879513562;
                            i16 = iM11306 ^ i3;
                            i14 = i2;
                            i6 = i;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("۫᩸") ^ i12;
                            i = iIndexOf;
                            i4 = ((iM11307 ^ i13) * 31239) ^ 1833573635;
                            i5 = -1161413434;
                            i14 = i4;
                            i16 = iM11307 ^ i5;
                            i6 = i;
                        }
                        break;
                    case 1725768750:
                    case 1995976452:
                        i = i6;
                        i8 = i7 * i7;
                        s3 = 2;
                        if (C0050.f912 <= 0) {
                            iM11306 = (i12 - C19806.m45029("ۤᩳ")) * (-7);
                            i2 = ((iM11306 ^ i13) * 29709) ^ 953826727;
                            i3 = -1449111717;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩺᩺") ^ i13;
                            i2 = ((iM11306 ^ i12) * 10329) ^ 81709976;
                            i3 = -1842441158;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                    case 1864902397:
                    case 2056528377:
                        return i6;
                    default:
                        i = i6;
                        if (C0817.f3443) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰۡ") ^ i13;
                            i2 = ((iM11306 ^ i12) * (-1219)) ^ (-1108271419);
                            i3 = 1585274381;
                        } else {
                            iM11306 = C19806.m45029("ۘܽ") ^ i13;
                            i2 = ((iM11306 ^ i12) * 5909) ^ 840028360;
                            i3 = -617720795;
                        }
                        i16 = iM11306 ^ i3;
                        i14 = i2;
                        i6 = i;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x029c A[PHI: r18 r19
      0x029c: PHI (r18v4 byte) = (r18v2 byte), (r18v3 byte), (r18v2 byte) binds: [B:180:0x029c, B:68:0x029a, B:10:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:180:0x029c, B:68:0x029a, B:10:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    public C16393(String str) {
        int iM45029;
        int i;
        StringBuilder sb;
        int iM30246;
        int i2;
        short[] sArr;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int iM450210;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM11306;
        int i10;
        int i11;
        int i12;
        int iM450211;
        int i13;
        int i14;
        int i15;
        short[] sArr2;
        StringBuilder sb2;
        int i16;
        int i17;
        int i18;
        StringBuilder sb3;
        int iM11307;
        int i19;
        C16393 c16393 = this;
        int i20 = ThreadFactoryC3888.f14547;
        int i21 = C1398.f5802;
        short s = f52750[0];
        int i22 = s + 10956;
        int i23 = (s * s) + 120033936;
        int i24 = (i23 + i23) - (i22 * i22) < 0 ? 61759 : 2710;
        byte[] bArrDecode = Base64.decode(str, 0);
        C10749 c10749 = new C10749();
        int iM450212 = C19806.m45029("᩹᩶") ^ i21;
        int i25 = ((iM450212 ^ i20) * 19979) ^ (-1875199778);
        int i26 = iM450212 ^ (-706005552);
        int i27 = i24;
        C10749 c107410 = c10749;
        byte[] bArr2 = bArrDecode;
        int i28 = i25;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C5809[] c5809Arr = null;
        C5809 c5809 = null;
        short[] sArr3 = null;
        StringBuilder sb4 = null;
        int i29 = 0;
        int i30 = 0;
        C12160 c12160 = null;
        int i31 = 0;
        int i32 = 0;
        int length = 0;
        int i33 = 0;
        int iIndexOf = 0;
        byte b = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 1650520482;
        int i40 = 0;
        byte[] bArrM30247 = null;
        int i41 = 0;
        while (true) {
            i39 = i26 ^ ((((i39 ^ i20) * (-16655)) >> 31) & i28);
            switch (i39) {
                case -2055628830:
                case -1800751314:
                    int i42 = i36 % 10;
                    C2124.m6683(sb4, i42);
                    i37 = i42;
                    iM45029 = (i21 - ThreadFactoryC3888.m11306("ۤۙ")) * (-73);
                    i28 = ((iM45029 ^ i20) * 14237) ^ 1236899442;
                    i = -792774071;
                    i26 = iM45029 ^ i;
                    break;
                case -1947796170:
                case -1545637932:
                    ThreadFactoryC3888.m11302(sb4, (char) (i36 + 97));
                    i37 = i36;
                    iM45029 = (i21 - ThreadFactoryC3888.m11306("ۤۙ")) * (-73);
                    i28 = ((iM45029 ^ i20) * 14237) ^ 1236899442;
                    i = -792774071;
                    i26 = iM45029 ^ i;
                    break;
                case -1880888989:
                case -344048902:
                    i9 = i38;
                    c16393.f52752 = new C5809[i9];
                    i41 = 0;
                    iM11306 = (i20 - ThreadFactoryC3888.m11306("ۗܿ")) * (-121);
                    i10 = ((iM11306 ^ i21) * 11337) ^ 375984942;
                    i11 = 677922645;
                    int i43 = iM11306 ^ i11;
                    sArr3 = sArr3;
                    i12 = i30;
                    i38 = i9;
                    sb4 = sb4;
                    i26 = i43;
                    i29 = i29;
                    i40 = i40;
                    i28 = i10;
                    i30 = i12;
                    break;
                case -1841631214:
                case -1588020362:
                    C2124.m6683(sb4, (i29 ^ i37) % 10);
                    iM45029 = ThreadFactoryC3888.m11306("ۘۘ") ^ i21;
                    i28 = ((iM45029 ^ i20) * 28739) ^ 1906551506;
                    i = -913406898;
                    i26 = iM45029 ^ i;
                    break;
                case -1798327765:
                case -1167254380:
                    i15 = i40;
                    sArr2 = sArr3;
                    i3 = i29;
                    int length2 = bArrM30247.length;
                    if (C0817.f3443) {
                        sb4 = new StringBuilder(length2 << 2);
                        i31 = 0;
                        length = bArrM30247.length;
                        int iM450213 = C19806.m45029("ܿᩳ") ^ i20;
                        sArr3 = sArr2;
                        i8 = i15;
                        i28 = ((iM450213 ^ i21) * (-23407)) ^ 1702879739;
                        sb4 = sb4;
                        i26 = iM450213 ^ 319508816;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۙ֨") ^ i21;
                        int i44 = ((iM11308 ^ i20) * (-16035)) ^ 1594647418;
                        i26 = iM11308 ^ (-138041955);
                        sArr3 = sArr2;
                        sb4 = null;
                        i8 = i15;
                        i28 = i44;
                    }
                    i29 = i3;
                    i40 = i8;
                    break;
                case -1701301962:
                case 1488908265:
                    sb = sb4;
                    iM30246 = i38;
                    i2 = i40;
                    sArr = sArr3;
                    i3 = i29;
                    i4 = i30;
                    bArr = bArr2;
                    if (C0526.f2219) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۗᩴ") ^ i21;
                        bArr2 = bArr;
                        sArr3 = sArr;
                        i29 = i3;
                        i40 = i2;
                        i28 = ((iM11309 ^ i20) * (-17079)) ^ (-700525116);
                        c16393 = this;
                        i12 = i4;
                        i38 = iM30246;
                        sb4 = sb;
                        i26 = iM11309 ^ (-727924302);
                        i30 = i12;
                    } else {
                        i5 = iM30246;
                        C10749 c107411 = c107410;
                        c16393.f52753 = new C0164(c16393, c107411);
                        if (C2249.m6915() <= 0) {
                            iM450210 = (i20 - C19806.m45029("᩷ܺ")) * (-57);
                            c107410 = c107411;
                            i6 = ((iM450210 ^ i21) * (-23575)) ^ (-1300051752);
                            i7 = 1848763700;
                            int i45 = iM450210 ^ i7;
                            sArr3 = sArr;
                            i8 = i2;
                            i28 = i6;
                            sb4 = sb;
                            i26 = i45;
                            i30 = i4;
                            i38 = i5;
                            bArr2 = bArr;
                            i29 = i3;
                            i40 = i8;
                        } else {
                            c107410 = c107411;
                            int iM113010 = ThreadFactoryC3888.m11306("ۧۜ") ^ i21;
                            int i46 = ((iM113010 ^ i20) * 20489) ^ 1948388369;
                            sArr3 = sArr;
                            i26 = iM113010 ^ 920594663;
                            sb4 = sb;
                            bArr2 = bArr;
                            i29 = i3;
                            i40 = i2;
                            i28 = i46;
                            i30 = i4;
                            i38 = i5;
                        }
                    }
                    break;
                case -1692927810:
                case 53685873:
                    sb4 = sb4;
                    i9 = i38;
                    i40 = i40;
                    sArr3 = sArr3;
                    i29 = i29;
                    i30 = i30;
                    if (i41 < i9) {
                        iM11306 = (i20 - ThreadFactoryC3888.m11306("᩹᩵")) * 21;
                        i10 = ((iM11306 ^ i21) * 31347) ^ 1482588815;
                        i11 = -1400564356;
                    } else {
                        i32 = 0;
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۖ") ^ i21;
                        i10 = ((iM11306 ^ i20) * (-28703)) ^ (-1863238833);
                        i11 = 173568936;
                    }
                    int i47 = iM11306 ^ i11;
                    sArr3 = sArr3;
                    i12 = i30;
                    i38 = i9;
                    sb4 = sb4;
                    i26 = i47;
                    i29 = i29;
                    i40 = i40;
                    i28 = i10;
                    i30 = i12;
                    break;
                case -1630694063:
                case 166960297:
                    if (ThreadFactoryC3888.m11300() > 0) {
                        i15 = i40;
                        sArr2 = sArr3;
                        i3 = i29;
                        int iM113011 = ThreadFactoryC3888.m11306("ۙ֨") ^ i21;
                        int i48 = ((iM113011 ^ i20) * (-16035)) ^ 1594647418;
                        i26 = iM113011 ^ (-138041955);
                        sArr3 = sArr2;
                        sb4 = null;
                        i8 = i15;
                        i28 = i48;
                        i29 = i3;
                        i40 = i8;
                    } else {
                        sb2 = sb4;
                        int i49 = i40;
                        i16 = i29;
                        i17 = i49;
                        int iM450214 = (i20 - C19806.m45029("ۖۤ")) * (-55);
                        i28 = (-813231634) ^ ((iM450214 ^ i21) * (-2749));
                        StringBuilder sb5 = sb2;
                        i26 = iM450214 ^ (-1303995057);
                        sb4 = sb5;
                        int i50 = i16;
                        i40 = i17;
                        i29 = i50;
                    }
                    break;
                case -1606759660:
                case 2117126602:
                    ThreadFactoryC3888.m11302(sb4, (char) (i36 + 65));
                    i37 = i36;
                    iM45029 = (i21 - ThreadFactoryC3888.m11306("ۤۙ")) * (-73);
                    i28 = ((iM45029 ^ i20) * 14237) ^ 1236899442;
                    i = -792774071;
                    i26 = iM45029 ^ i;
                    break;
                case -1502417067:
                case 767583894:
                    ThreadFactoryC3888.m11302(sb4, (char) (i29 + 65));
                    iM45029 = ThreadFactoryC3888.m11306("ۘۘ") ^ i21;
                    i28 = ((iM45029 ^ i20) * 28739) ^ 1906551506;
                    i = -913406898;
                    i26 = iM45029 ^ i;
                    break;
                case -1387818742:
                case 1443429549:
                    sb2 = sb4;
                    i16 = i29;
                    ArrayList arrayList3 = c16393.f52751;
                    sArr3 = f52750;
                    i33 = 1;
                    i17 = 32;
                    if (C3286.m9798() > 0) {
                        int iM450215 = C19806.m45029("ۧܰ") ^ i21;
                        i28 = ((iM450215 ^ i20) * 31869) ^ 1446031495;
                        i18 = iM450215 ^ (-734608033);
                        arrayList2 = arrayList3;
                        sb4 = sb2;
                        i29 = i16;
                        i40 = 32;
                        i26 = i18;
                    } else {
                        arrayList2 = arrayList3;
                        int iM450216 = (i20 - C19806.m45029("ۖۤ")) * (-55);
                        i28 = (-813231634) ^ ((iM450216 ^ i21) * (-2749));
                        StringBuilder sb6 = sb2;
                        i26 = iM450216 ^ (-1303995057);
                        sb4 = sb6;
                        int i51 = i16;
                        i40 = i17;
                        i29 = i51;
                    }
                    break;
                case -1356849274:
                case 1164451904:
                    sb3 = sb4;
                    if (i31 < length) {
                        iM11307 = (ThreadFactoryC3888.m11306("֨۟") ^ i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i28 = (-257139908) ^ ((iM11307 ^ i21) * (-20195));
                        i19 = 1600860146;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩹᩺") + i21) * (-127);
                        i28 = (-610590508) ^ ((iM11307 ^ i20) * 6651);
                        i19 = -169714341;
                    }
                    StringBuilder sb7 = sb3;
                    i26 = iM11307 ^ i19;
                    sb4 = sb7;
                    break;
                case -1184776076:
                case 1793299188:
                    sb = sb4;
                    i2 = i40;
                    sArr = sArr3;
                    i3 = i29;
                    arrayList = c16393.f52751;
                    bArrM30247 = c12160.m30247(16);
                    if (C3660.m10791() == 0) {
                        iM450211 = (C19806.m45029("ܿ᩷") ^ i21) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i13 = ((iM450211 ^ i20) * 23887) ^ 521639298;
                        i14 = -1764570212;
                        int i52 = iM450211 ^ i14;
                        sArr3 = sArr;
                        StringBuilder sb8 = sb;
                        i26 = i52;
                        sb4 = sb8;
                        int i53 = i2;
                        i28 = i13;
                        i29 = i3;
                        i40 = i53;
                    } else {
                        bArr = bArr2;
                        iM30246 = i38;
                        i4 = i30;
                        int iM113012 = ThreadFactoryC3888.m11306("ۗᩴ") ^ i21;
                        bArr2 = bArr;
                        sArr3 = sArr;
                        i29 = i3;
                        i40 = i2;
                        i28 = ((iM113012 ^ i20) * (-17079)) ^ (-700525116);
                        c16393 = this;
                        i12 = i4;
                        i38 = iM30246;
                        sb4 = sb;
                        i26 = iM113012 ^ (-727924302);
                        i30 = i12;
                    }
                    break;
                case -1126179830:
                case 1770640369:
                    sb4 = sb4;
                    c5809Arr[i32] = c5809;
                    i32++;
                    i9 = i38;
                    i40 = i40;
                    sArr3 = sArr3;
                    i29 = i29;
                    i30 = i30;
                    iM11306 = ThreadFactoryC3888.m11306("ᩳۖ") ^ i21;
                    i10 = ((iM11306 ^ i20) * (-28703)) ^ (-1863238833);
                    i11 = 173568936;
                    int i410 = iM11306 ^ i11;
                    sArr3 = sArr3;
                    i12 = i30;
                    i38 = i9;
                    sb4 = sb4;
                    i26 = i410;
                    i29 = i29;
                    i40 = i40;
                    i28 = i10;
                    i30 = i12;
                    break;
                case -1098187713:
                case 1629811201:
                    if (RunnableC1606.m5473() == 0) {
                        iM45029 = (C19806.m45029("ܺ۟") + i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i28 = ((iM45029 ^ i20) * 6371) ^ 1545498266;
                        i = -1511898085;
                        i26 = iM45029 ^ i;
                    } else {
                        i15 = i40;
                        sArr2 = sArr3;
                        i3 = i29;
                        int iM113013 = ThreadFactoryC3888.m11306("ۙ֨") ^ i21;
                        int i411 = ((iM113013 ^ i20) * (-16035)) ^ 1594647418;
                        i26 = iM113013 ^ (-138041955);
                        sArr3 = sArr2;
                        sb4 = null;
                        i8 = i15;
                        i28 = i411;
                        i29 = i3;
                        i40 = i8;
                    }
                    break;
                case -1087725994:
                case -1031092695:
                    C3286.m9798();
                    C0216.m1591();
                    throw new RuntimeException();
                case -1011946644:
                case 1257460366:
                    if (i29 % 2 == 0) {
                        iM45029 = C19806.m45029("ۤ᩶") ^ i20;
                        i28 = ((iM45029 ^ i21) * 24107) ^ 1208539489;
                        i = 1353048040;
                    } else {
                        iM45029 = (C19806.m45029("ܽۖ") ^ i21) * (-103);
                        i28 = ((iM45029 ^ i20) * 29425) ^ (-512028957);
                        i = 206232689;
                    }
                    i26 = iM45029 ^ i;
                    break;
                case -959486135:
                case 33968137:
                    sb3 = sb4;
                    c5809Arr = c16393.f52752;
                    C5809 c58010 = new C5809(c12160, c12160.m30246());
                    if (C2477.f9839 > 0) {
                        int iM450217 = C19806.m45029("ۗ۟") ^ i21;
                        i28 = ((iM450217 ^ i20) * (-13881)) ^ (-1039669556);
                        i18 = iM450217 ^ 1117535460;
                        c5809 = c58010;
                        sb4 = sb3;
                        i26 = i18;
                    } else {
                        c5809 = c58010;
                        iM11307 = ThreadFactoryC3888.m11306("ۨۖ") ^ i20;
                        i28 = (-467949298) ^ ((iM11307 ^ i21) * 9001);
                        i19 = 392922312;
                        StringBuilder sb9 = sb3;
                        i26 = iM11307 ^ i19;
                        sb4 = sb9;
                    }
                    break;
                case -889599258:
                case 113681918:
                    C19806.m45023(sb4, (char) (i29 + 97));
                    iM45029 = ThreadFactoryC3888.m11306("ۘۘ") ^ i21;
                    i28 = ((iM45029 ^ i20) * 28739) ^ 1906551506;
                    i = -913406898;
                    i26 = iM45029 ^ i;
                    break;
                case -779541837:
                case 711734767:
                    b = bArrM30247[i31];
                    i34 = b & bo.j;
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ۢ۫") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-12993)) ^ (-473944807);
                        i = 299349558;
                    } else {
                        iM45029 = C19806.m45029("᩺ᩳ") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-29069)) ^ (-322754834);
                        i = -1334574884;
                    }
                    i26 = iM45029 ^ i;
                    break;
                case -708560349:
                case 558791830:
                    sb4 = sb4;
                    i9 = i38;
                    i40 = i40;
                    sArr3 = sArr3;
                    i29 = i29;
                    if (i32 < i9) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۗ") ^ i20;
                        i30 = i30;
                        i10 = ((iM11306 ^ i21) * 17315) ^ 452923263;
                        i11 = -1867763711;
                    } else {
                        i30 = i30;
                        iM11306 = (C19806.m45029("۠ܺ") + i20) * (-119);
                        i10 = ((iM11306 ^ i21) * (-2935)) ^ 355516268;
                        i11 = 2048129860;
                    }
                    int i412 = iM11306 ^ i11;
                    sArr3 = sArr3;
                    i12 = i30;
                    i38 = i9;
                    sb4 = sb4;
                    i26 = i412;
                    i29 = i29;
                    i40 = i40;
                    i28 = i10;
                    i30 = i12;
                    break;
                case -602782385:
                case -434846239:
                    i35 = b >> 3;
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܰ") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-16725)) ^ (-1751684870);
                        i = -387338866;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ܿ") ^ i21) * (-33);
                        i28 = ((iM45029 ^ i20) * 14911) ^ 456892119;
                        i = 1277518934;
                    }
                    i26 = iM45029 ^ i;
                    break;
                case -590329457:
                case -213942005:
                    C2332.m7079();
                    sb2 = sb4;
                    int i413 = i40;
                    i16 = i29;
                    i17 = i413;
                    int iM450218 = (i20 - C19806.m45029("ۖۤ")) * (-55);
                    i28 = (-813231634) ^ ((iM450218 ^ i21) * (-2749));
                    StringBuilder sb10 = sb2;
                    i26 = iM450218 ^ (-1303995057);
                    sb4 = sb10;
                    int i54 = i16;
                    i40 = i17;
                    i29 = i54;
                    break;
                case -493782909:
                case 1091097122:
                    if (C2124.f7782 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܰ") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-16725)) ^ (-1751684870);
                        i = -387338866;
                        i26 = iM45029 ^ i;
                    } else {
                        i15 = i40;
                        sArr2 = sArr3;
                        i3 = i29;
                        int iM113014 = ThreadFactoryC3888.m11306("ۙ֨") ^ i21;
                        int i414 = ((iM113014 ^ i20) * (-16035)) ^ 1594647418;
                        i26 = iM113014 ^ (-138041955);
                        sArr3 = sArr2;
                        sb4 = null;
                        i8 = i15;
                        i28 = i414;
                        i29 = i3;
                        i40 = i8;
                    }
                    break;
                case -493131085:
                case 823237962:
                    i31++;
                    i15 = i40;
                    sArr2 = sArr3;
                    i3 = i29;
                    int iM450219 = C19806.m45029("ܿᩳ") ^ i20;
                    sArr3 = sArr2;
                    i8 = i15;
                    i28 = ((iM450219 ^ i21) * (-23407)) ^ 1702879739;
                    sb4 = sb4;
                    i26 = iM450219 ^ 319508816;
                    i29 = i3;
                    i40 = i8;
                    break;
                case -461855025:
                case 1737310833:
                    if (i29 < i30) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۜ") + i20) * 13;
                        i28 = ((iM45029 ^ i21) * (-341)) ^ 1385471428;
                        i = 701190913;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ۬") ^ i21;
                        i28 = ((iM45029 ^ i20) * 18303) ^ 602889621;
                        i = -1974638339;
                    }
                    i26 = iM45029 ^ i;
                    break;
                case -460770669:
                case 446859457:
                    sb = sb4;
                    c16393.f52752[iIndexOf].m15990(c16393.f52753, true);
                    i2 = i40;
                    sArr = sArr3;
                    i3 = i29;
                    iM450211 = (i21 - ThreadFactoryC3888.m11306("ܿܰ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i13 = ((iM450211 ^ i20) * (-9549)) ^ 1060967900;
                    i14 = -191890010;
                    int i55 = iM450211 ^ i14;
                    sArr3 = sArr;
                    StringBuilder sb11 = sb;
                    i26 = i55;
                    sb4 = sb11;
                    int i56 = i2;
                    i28 = i13;
                    i29 = i3;
                    i40 = i56;
                    break;
                case -422544046:
                case -7792078:
                    if (C1189.m4368() <= 0) {
                        sb3 = sb4;
                        iM11307 = ThreadFactoryC3888.m11306("ۨۖ") ^ i20;
                        i28 = (-467949298) ^ ((iM11307 ^ i21) * 9001);
                        i19 = 392922312;
                        StringBuilder sb12 = sb3;
                        i26 = iM11307 ^ i19;
                        sb4 = sb12;
                    } else {
                        i15 = i40;
                        sArr2 = sArr3;
                        i3 = i29;
                        int iM113015 = ThreadFactoryC3888.m11306("ۙ֨") ^ i21;
                        int i415 = ((iM113015 ^ i20) * (-16035)) ^ 1594647418;
                        i26 = iM113015 ^ (-138041955);
                        sArr3 = sArr2;
                        sb4 = null;
                        i8 = i15;
                        i28 = i415;
                        i29 = i3;
                        i40 = i8;
                    }
                    break;
                case -408920944:
                case 938388180:
                    if (i36 % 2 == 0) {
                        iM45029 = (C19806.m45029("᩶ܶ") + i20) * 27;
                        i28 = ((iM45029 ^ i21) * (-4075)) ^ (-1962253125);
                        i = 1659247910;
                    } else {
                        iM45029 = C19806.m45029("᩵᩷") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-28745)) ^ (-1207971857);
                        i = -171988110;
                    }
                    i26 = iM45029 ^ i;
                    break;
                case -298666702:
                case 1203036283:
                    if (C1148.f5161 <= 0) {
                        sb = sb4;
                        iM30246 = i38;
                        i2 = i40;
                        sArr = sArr3;
                        i3 = i29;
                        i4 = i30;
                        bArr = bArr2;
                        int iM113016 = ThreadFactoryC3888.m11306("ۗᩴ") ^ i21;
                        bArr2 = bArr;
                        sArr3 = sArr;
                        i29 = i3;
                        i40 = i2;
                        i28 = ((iM113016 ^ i20) * (-17079)) ^ (-700525116);
                        c16393 = this;
                        i12 = i4;
                        i38 = iM30246;
                        sb4 = sb;
                        i26 = iM113016 ^ (-727924302);
                        i30 = i12;
                    } else {
                        iM45029 = (C19806.m45029("ܺ۟") + i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i28 = ((iM45029 ^ i20) * 6371) ^ 1545498266;
                        i = -1511898085;
                        i26 = iM45029 ^ i;
                    }
                    break;
                case -16953552:
                case 1035019810:
                    sb = sb4;
                    i2 = i40;
                    sArr = sArr3;
                    i3 = i29;
                    bArr = bArr2;
                    int i57 = i38;
                    i4 = i30;
                    c16393.f52751 = new ArrayList();
                    if (C0216.f1393 != 0) {
                        iM30246 = i57;
                        int iM113017 = ThreadFactoryC3888.m11306("ۗᩴ") ^ i21;
                        bArr2 = bArr;
                        sArr3 = sArr;
                        i29 = i3;
                        i40 = i2;
                        i28 = ((iM113017 ^ i20) * (-17079)) ^ (-700525116);
                        c16393 = this;
                        i12 = i4;
                        i38 = iM30246;
                        sb4 = sb;
                        i26 = iM113017 ^ (-727924302);
                        i30 = i12;
                    } else {
                        int iM113018 = ThreadFactoryC3888.m11306("᩷۬") ^ i20;
                        sArr3 = sArr;
                        i30 = i4;
                        i38 = i57;
                        bArr2 = bArr;
                        i29 = i3;
                        i40 = i2;
                        i28 = ((iM113018 ^ i21) * (-11755)) ^ (-286645053);
                        sb4 = sb;
                        i26 = iM113018 ^ 249454264;
                        c16393 = this;
                    }
                    break;
                case -14471797:
                case 867787420:
                    sb = sb4;
                    i2 = i40;
                    sArr = sArr3;
                    iIndexOf = arrayList2.indexOf(C1148.m4230(sArr, i33, i2, i27));
                    if (iIndexOf != -1) {
                        iM450211 = ThreadFactoryC3888.m11306("֫ۚ") ^ i20;
                        i3 = i29;
                        i13 = ((iM450211 ^ i21) * (-18113)) ^ (-582541224);
                        i14 = -1293283816;
                    } else {
                        i3 = i29;
                        iM450211 = (i21 - ThreadFactoryC3888.m11306("ܿܰ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i13 = ((iM450211 ^ i20) * (-9549)) ^ 1060967900;
                        i14 = -191890010;
                    }
                    int i58 = iM450211 ^ i14;
                    sArr3 = sArr;
                    StringBuilder sb13 = sb;
                    i26 = i58;
                    sb4 = sb13;
                    int i59 = i2;
                    i28 = i13;
                    i29 = i3;
                    i40 = i59;
                    break;
                case 30404946:
                case 499827151:
                    sb = sb4;
                    i4 = i30;
                    i2 = i40;
                    sArr = sArr3;
                    i3 = i29;
                    bArr = bArr2;
                    c12160 = new C12160(bArr);
                    iM30246 = c12160.m30246();
                    if (C0671.f2816 == 0) {
                        iM450210 = (C19806.m45029("ۚۜ") ^ i21) * (-57);
                        i5 = iM30246;
                        i6 = ((iM450210 ^ i20) * (-19603)) ^ (-46995808);
                        i7 = -402768358;
                        int i416 = iM450210 ^ i7;
                        sArr3 = sArr;
                        i8 = i2;
                        i28 = i6;
                        sb4 = sb;
                        i26 = i416;
                        i30 = i4;
                        i38 = i5;
                        bArr2 = bArr;
                        i29 = i3;
                        i40 = i8;
                    } else {
                        int iM113019 = ThreadFactoryC3888.m11306("ۗᩴ") ^ i21;
                        bArr2 = bArr;
                        sArr3 = sArr;
                        i29 = i3;
                        i40 = i2;
                        i28 = ((iM113019 ^ i20) * (-17079)) ^ (-700525116);
                        c16393 = this;
                        i12 = i4;
                        i38 = iM30246;
                        sb4 = sb;
                        i26 = iM113019 ^ (-727924302);
                        i30 = i12;
                    }
                    break;
                case 165219642:
                case 733678643:
                    if (!C0629.m2907()) {
                        sb2 = sb4;
                        int i417 = i40;
                        i16 = i29;
                        i17 = i417;
                        int iM4502110 = (i20 - C19806.m45029("ۖۤ")) * (-55);
                        i28 = (-813231634) ^ ((iM4502110 ^ i21) * (-2749));
                        StringBuilder sb14 = sb2;
                        i26 = iM4502110 ^ (-1303995057);
                        sb4 = sb14;
                        int i510 = i16;
                        i40 = i17;
                        i29 = i510;
                    } else {
                        iM45029 = C19806.m45029("ۢ۫") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-12993)) ^ (-473944807);
                        i = 299349558;
                        i26 = iM45029 ^ i;
                    }
                    break;
                case 729244859:
                case 1041070815:
                    i29 = i35 & 31;
                    i36 = i34 ^ i29;
                    if (i36 < 26) {
                        int iM113020 = ThreadFactoryC3888.m11306("ۨ֡") ^ i21;
                        i26 = iM113020 ^ 486229136;
                        i28 = ((iM113020 ^ i20) * 27519) ^ 1777110404;
                    } else {
                        int iM450220 = (C19806.m45029("۫ۡ") + i20) * (-87);
                        i28 = ((iM450220 ^ i21) * 27183) ^ (-29254539);
                        i26 = iM450220 ^ 927618884;
                    }
                    i30 = 26;
                    break;
                case 765902063:
                case 1798810437:
                    C2249.m6905(arrayList, C2124.m6674(sb4));
                    i41++;
                    i9 = i38;
                    iM11306 = (i20 - ThreadFactoryC3888.m11306("ۗܿ")) * (-121);
                    i10 = ((iM11306 ^ i21) * 11337) ^ 375984942;
                    i11 = 677922645;
                    int i418 = iM11306 ^ i11;
                    sArr3 = sArr3;
                    i12 = i30;
                    i38 = i9;
                    sb4 = sb4;
                    i26 = i418;
                    i29 = i29;
                    i40 = i40;
                    i28 = i10;
                    i30 = i12;
                    break;
                case 1497503922:
                case 1879328094:
                    C2249.m6905(f52748, new WeakReference(c16393));
                    return;
                default:
                    if (C3660.f13403 < 0) {
                        iM45029 = C19806.m45029("ۢ۫") ^ i20;
                        i28 = ((iM45029 ^ i21) * (-12993)) ^ (-473944807);
                        i = 299349558;
                    } else {
                        iM45029 = (i21 - ThreadFactoryC3888.m11306("ۖۚ")) * (-61);
                        i28 = ((iM45029 ^ i20) * 8429) ^ (-1179952438);
                        i = -1751298216;
                    }
                    i26 = iM45029 ^ i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0164 m38602() {
        return this.f52753;
    }
}
