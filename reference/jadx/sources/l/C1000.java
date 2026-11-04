package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0940 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1000 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۧ᩸۫, reason: not valid java name and contains not printable characters */
    private static final short[] f3609 = {1379, -23266, -23269, -23282, -23269, 3584, -11579, -14428, -10189};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC23571 f3610;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f3611;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9202 f3612;

    /* JADX WARN: Code duplicated, block: B:28:0x00b9 A[PHI: r3
      0x00b9: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:27:0x00b7, B:17:0x007f, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x018b A[PHI: r10 r11 r15
      0x018b: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:47:0x0189, B:31:0x00ee, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:47:0x0189, B:31:0x00ee, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:47:0x0189, B:31:0x00ee, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c1 A[PHI: r8 r9 r12
      0x01c1: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:51:0x01bf, B:43:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:51:0x01bf, B:43:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:51:0x01bf, B:43:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f8 A[PHI: r7
      0x01f8: PHI (r7v4 char) = (r7v3 char), (r7v2 char) binds: [B:55:0x01f6, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0244 A[PHI: r2 r4 r5 r14 r20
      0x0244: PHI (r2v4 l.ۡۜۤ) = (r2v2 l.ۡۜۤ), (r2v2 l.ۡۜۤ), (r2v3 l.ۡۜۤ), (r2v2 l.ۡۜۤ), (r2v2 l.ۡۜۤ), (r2v2 l.ۡۜۤ), (r2v2 l.ۡۜۤ) binds: [B:63:0x0242, B:59:0x0226, B:35:0x0110, B:23:0x0096, B:15:0x007c, B:12:0x0073, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:63:0x0242, B:59:0x0226, B:35:0x0110, B:23:0x0096, B:15:0x007c, B:12:0x0073, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:63:0x0242, B:59:0x0226, B:35:0x0110, B:23:0x0096, B:15:0x007c, B:12:0x0073, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:63:0x0242, B:59:0x0226, B:35:0x0110, B:23:0x0096, B:15:0x007c, B:12:0x0073, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0242, B:59:0x0226, B:35:0x0110, B:23:0x0096, B:15:0x007c, B:12:0x0073, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM2761;
        int i;
        int i2;
        int i3 = C3099.f10023;
        int i4 = C23916.f77426;
        int iM3169 = C0773.m3169("ۛۘ") ^ i4;
        int i5 = ((iM3169 ^ i3) * (-1637)) ^ 315134561;
        String strM11996 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 1305839173;
        ActivityC9202 activityC9202 = null;
        int iM31610 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1376108206;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 11861) >> 31));
            switch (i13) {
                case -2122058298:
                case -1569954937:
                    i11 = 10274;
                    iM2761 = (C0619.m2761("᩹᩵") ^ i4) * (-67);
                    i = ((iM2761 ^ i3) * 12557) ^ (-1939893090);
                    i2 = -2119656925;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2119765106:
                case 375895998:
                    i8 = s * s2;
                    i9 = s * s;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ܰۘ") ^ i4;
                        i = ((iM2761 ^ i3) * 24153) ^ (-872928117);
                        i2 = 2048104444;
                    } else {
                        iM2761 = (C0619.m2761("۫ۡ") + i4) * q.h;
                        i = ((iM2761 ^ i3) * (-6081)) ^ 183674744;
                        i2 = 936947189;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2102491792:
                case 2000031374:
                    sArr = f3609;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    } else {
                        iM2761 = C0619.m2761("᩺ۘ") ^ i3;
                        i = ((iM2761 ^ i4) * 4551) ^ 1029481963;
                        i2 = 2126017219;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1997619073:
                case 1236471407:
                    strM11996 = C3690.m11996(sArr2, i12, 3, i11);
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۤ֡") + i3) * 67;
                        i = ((iM2761 ^ i4) * 7435) ^ (-447840230);
                        i2 = -1421662345;
                    } else {
                        iM2761 = (C0619.m2761("ۛܽ") ^ i4) * 97;
                        i = ((iM2761 ^ i3) * 4671) ^ 1813926973;
                        i2 = -992685189;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1927161264:
                case 2124451945:
                    C1146.m4231();
                    if (C3779.f12953 > 0) {
                        iM2761 = (C0619.m2761("ۤ֡") + i3) * 67;
                        i = ((iM2761 ^ i4) * 7435) ^ (-447840230);
                        i2 = -1421662345;
                    } else {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1891742638:
                case 652850139:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    } else {
                        iM2761 = C0619.m2761("᩸۟") ^ i4;
                        i = ((iM2761 ^ i3) * (-4165)) ^ (-1111170604);
                        i2 = 450563470;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1797098321:
                case -406938692:
                    iM31610 = C0773.m3169(strM11996);
                    i7 = 2100023247;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    } else {
                        iM2761 = C0619.m2761("۫᩸") ^ i4;
                        i = ((iM2761 ^ i3) * 12779) ^ (-241702263);
                        i2 = -702096220;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1772774039:
                case -322600993:
                    m8191(activityC9202, iM31610 ^ i7);
                    break;
                case -1680215026:
                case 1398441449:
                    i12 = 6;
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("ܰۘ") ^ i4;
                        i = ((iM2761 ^ i3) * 24153) ^ (-872928117);
                        i2 = 2048104444;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۛᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i4) * 21075) ^ (-1428130552);
                        i2 = 908703329;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1589079738:
                case 540763519:
                    c = 5;
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ᩴ۫") ^ i4;
                        i = ((iM2761 ^ i3) * 29719) ^ 982433784;
                        i2 = -1212042447;
                    } else {
                        iM2761 = C0773.m3169("ۨᩳ") ^ i4;
                        i = ((iM2761 ^ i3) * 23681) ^ (-1473110773);
                        i2 = 861311039;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1495134857:
                case -156021047:
                    i10 = 199233225;
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ۗۚ") + i3) * (-87);
                        i = ((iM2761 ^ i4) * 29415) ^ 399679136;
                        i2 = -685948336;
                    } else {
                        iM2761 = (C0773.m3169("۬ۙ") ^ i3) * (-43);
                        i = ((iM2761 ^ i4) * (-20419)) ^ (-483233158);
                        i2 = 1613358691;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1260674639:
                case -1229728386:
                    C0773.m3161();
                    break;
                case -1002194399:
                case -216513844:
                    AbstractC3624.m11755();
                    iM2761 = (C0619.m2761("ۤ֡") + i3) * 67;
                    i = ((iM2761 ^ i4) * 7435) ^ (-447840230);
                    i2 = -1421662345;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -703138510:
                case 162870050:
                    s = sArr[c];
                    s2 = 28230;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("۬ۙ") ^ i3) * (-43);
                        i = ((iM2761 ^ i4) * (-20419)) ^ (-483233158);
                        i2 = 1613358691;
                    } else {
                        iM2761 = (C0773.m3169("ܳܺ") ^ i3) * (-39);
                        i = ((iM2761 ^ i4) * (-11291)) ^ 1849810235;
                        i2 = 182151735;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -490260815:
                case 1089479106:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    } else {
                        iM2761 = C0619.m2761("ᩴ۫") ^ i4;
                        i = ((iM2761 ^ i3) * 29719) ^ 982433784;
                        i2 = -1212042447;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -407825251:
                case 1497090895:
                    i11 = 16782;
                    iM2761 = (C0619.m2761("᩹᩵") ^ i4) * (-67);
                    i = ((iM2761 ^ i3) * 12557) ^ (-1939893090);
                    i2 = -2119656925;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 384835009:
                case 522652491:
                    activityC9202 = this.f3612;
                    sArr2 = f3609;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    } else {
                        iM2761 = (C0619.m2761("ܳۜ") ^ i3) * (-81);
                        i = ((iM2761 ^ i4) * (-12353)) ^ (-357710578);
                        i2 = 1566470952;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1243262436:
                case 1396224915:
                    C0773.m3161();
                    if (C1542.f5343 > 0) {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 9863) ^ 1442345331;
                        i2 = -1676567739;
                    } else {
                        iM2761 = C0619.m2761("ܰۘ") ^ i4;
                        i = ((iM2761 ^ i3) * 24153) ^ (-872928117);
                        i2 = 2048104444;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (i8 - (i9 + i10) > 0) {
                        iM2761 = C0619.m2761("۫ۘ") ^ i3;
                        i = ((iM2761 ^ i4) * (-32267)) ^ 1224059968;
                        i2 = -640560627;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩸") ^ i4;
                        i = ((iM2761 ^ i3) * 2511) ^ (-1237004186);
                        i2 = -581785577;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C1000(ActivityC9202 activityC9202, ArrayList arrayList, RunnableC23571 runnableC23571) {
        int i = 1683114631;
        int i2 = C0487.f2131;
        int i3 = C1542.f5343;
        this.f3612 = activityC9202;
        this.f3611 = arrayList;
        this.f3610 = runnableC23571;
        int iM3169 = C0773.m3169("᩺۬") ^ i2;
        int i4 = ((iM3169 ^ i3) * 765) ^ (-1464021432);
        int i5 = 1670707343;
        while (true) {
            i = (iM3169 ^ i5) ^ (i4 & (((i ^ i3) * 32197) >> 31));
            switch (i) {
                case -898467647:
                case 2124084660:
                    C17202.m40372();
                    throw new RuntimeException();
                case -142189788:
                case 313476192:
                    if (C2878.m9491() > 0) {
                        iM3169 = C0619.m2761("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27083)) ^ 524402977;
                        i5 = -1299776523;
                    } else {
                        iM3169 = C0619.m2761("ܰ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11999)) ^ (-951731763);
                        i5 = -706952630;
                    }
                    break;
                case -68711081:
                case 543493108:
                    C3492.m11488();
                    C2485.m8357();
                    iM3169 = C0619.m2761("ۙۖ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 21693) ^ 1689908016;
                    i5 = 939257477;
                    break;
                case -56617469:
                case 1961264165:
                    if (C2966.m9664()) {
                        iM3169 = C0773.m3169("֫᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22281)) ^ 496164961;
                        i5 = 1565392059;
                    } else {
                        iM3169 = C0619.m2761("ܺۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19313)) ^ 1261611560;
                        i5 = 1540252332;
                    }
                    break;
                case 377292747:
                case 1407202597:
                    if (AbstractC0116.m1243() == 0) {
                        iM3169 = C0619.m2761("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27083)) ^ 524402977;
                        i5 = -1299776523;
                    } else {
                        iM3169 = C0619.m2761("ۙۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21693) ^ 1689908016;
                        i5 = 939257477;
                    }
                    break;
                case 1245475208:
                case 1889095936:
                    return;
                default:
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27083)) ^ 524402977;
                        i5 = -1299776523;
                    } else {
                        iM3169 = C0773.m3169("᩹ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27465) ^ 1574078601;
                        i5 = 17764296;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02f7 A[PHI: r14 r15 r16 r17 r25
      0x02f7: PHI (r14v6 int) = (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:77:0x02f5, B:73:0x02da, B:59:0x024b, B:92:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r15v6 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:77:0x02f5, B:73:0x02da, B:59:0x024b, B:92:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r16v7 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:77:0x02f5, B:73:0x02da, B:59:0x024b, B:92:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r17v7 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:77:0x02f5, B:73:0x02da, B:59:0x024b, B:92:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r25v8 int) = (r25v3 int), (r25v3 int), (r25v4 int), (r25v3 int) binds: [B:77:0x02f5, B:73:0x02da, B:59:0x024b, B:92:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        short s;
        int i4;
        C1000 c1000 = this;
        String strM49871 = null;
        int i5 = 0;
        EnumC7234[] enumC7234Arr = null;
        C14691 c14691M30926 = null;
        C6489 c6489 = null;
        Iterator itM7968 = null;
        C11636 c11636 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1344416208;
        int i9 = C2966.f9654;
        int i10 = C2702.f8586;
        int iM3169 = (C0773.m3169("֨ܶ") ^ i9) * 3;
        int i11 = ((iM3169 ^ i10) * (-3391)) ^ (-304238872);
        int i12 = iM3169 ^ 551909571;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s2 = 0;
        int i16 = 0;
        ActivityC9202 activityC9202 = null;
        int i17 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-20415)) >> 31));
            switch (i8) {
                case -2047621222:
                case -1258319405:
                    if (C3998.m12923(itM7968)) {
                        iM2761 = C0619.m2761("ۙۜ") ^ i9;
                        i = ((iM2761 ^ i10) * 30557) ^ 530250348;
                        i2 = -1048634450;
                    } else {
                        iM2761 = C0773.m3169("ۘۜ") ^ i10;
                        i = ((iM2761 ^ i9) * (-13699)) ^ (-1114572863);
                        i2 = -692969815;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -2008263060:
                case -29440680:
                    C0950.m3785();
                    C13473.m33144();
                    iM2761 = C0619.m2761("۬ܰ") ^ i10;
                    i = ((iM2761 ^ i9) * (-5669)) ^ (-1944706117);
                    i2 = -1242358015;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1939147662:
                case 1109735356:
                    i17 = i16 * i16;
                    i6 = s2 * s2;
                    i7 = 87909376;
                    if (C1826.f6190 <= 0) {
                        iM2762 = C0773.m3169("᩶ܽ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-30127)) ^ (-1768780342);
                        i3 = 280618733;
                    } else {
                        iM2762 = C0619.m2761("ۧܳ") ^ i10;
                        i11 = ((iM2762 ^ i9) * 19511) ^ (-1708691652);
                        i3 = -2045062036;
                    }
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case -1814456122:
                case -201173405:
                    enumC7234Arr[0] = EnumC7234.OrderedField;
                    if (C3099.f10023 > 0) {
                        iM2761 = (C0619.m2761("ۚۙ") ^ i10) * 33;
                        i = ((iM2761 ^ i9) * 20723) ^ (-1250818305);
                        i2 = 958947021;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        iM2762 = (C0773.m3169("ᩳᩴ") + i9) * (-39);
                        i11 = ((iM2762 ^ i10) * (-16657)) ^ (-1230636795);
                        i3 = 502953805;
                        i12 = iM2762 ^ i3;
                        c1000 = this;
                    }
                    break;
                case -1809500209:
                case 1298420147:
                    i5 = 1;
                    enumC7234Arr = new EnumC7234[1];
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ᩴܰ") ^ i10;
                        i = ((iM2761 ^ i9) * (-2287)) ^ 783521790;
                        i2 = 1359615563;
                    } else {
                        iM2761 = (C0619.m2761("᩵۟") + i9) * 75;
                        i = ((iM2761 ^ i10) * (-17801)) ^ 1358422160;
                        i2 = -45913492;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1799926908:
                case 308124105:
                    C1146.m4231();
                    if (C2834.f9334 > 0) {
                        iM2762 = C0773.m3169("᩶ܽ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-30127)) ^ (-1768780342);
                        i3 = 280618733;
                        i12 = iM2762 ^ i3;
                        c1000 = this;
                    } else {
                        iM2761 = C0773.m3169("ᩴܰ") ^ i10;
                        i = ((iM2761 ^ i9) * (-2287)) ^ 783521790;
                        i2 = 1359615563;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -1629740527:
                case 222956255:
                    activityC9202.f30013.m49879(c14691M30926.mo30929());
                    break;
                case -1609017013:
                case 2127645817:
                    i13 = 20281;
                    iM2762 = C0619.m2761("ۨᩳ") ^ i10;
                    i11 = ((iM2762 ^ i9) * 15169) ^ 1799729981;
                    i3 = -203054380;
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case -1523769466:
                case 303528250:
                    i15 = 4;
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("۬ܰ") ^ i10;
                        i = ((iM2761 ^ i9) * (-5669)) ^ (-1944706117);
                        i2 = -1242358015;
                    } else {
                        iM2761 = (i9 - C0619.m2761("᩺ۚ")) * (-97);
                        i = ((iM2761 ^ i10) * 21281) ^ 1882177534;
                        i2 = -1626342664;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1310514065:
                case -23349361:
                    c6489.m18324(c11636.f36490).set(i5, c11636.f36482);
                    iM2761 = (C0773.m3169("۬ۧ") ^ i10) * (-107);
                    i = ((iM2761 ^ i9) * 24793) ^ 1624594137;
                    i2 = 1008642377;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1148471837:
                case -1119171286:
                    ActivityC9202 activityC9203 = c1000.f3612;
                    strM49871 = activityC9203.f30013.m49871();
                    if (!RunnableC3646.f12471) {
                        int iM31610 = (C0773.m3169("ۧ۫") ^ i10) * 41;
                        i4 = ((iM31610 ^ i9) * 25707) ^ 715863541;
                        i12 = iM31610 ^ 226670295;
                        activityC9202 = activityC9203;
                        i11 = i4;
                        c1000 = this;
                    } else {
                        activityC9202 = activityC9203;
                        iM2761 = C0619.m2761("۬ܰ") ^ i10;
                        i = ((iM2761 ^ i9) * (-5669)) ^ (-1944706117);
                        i2 = -1242358015;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -961829554:
                case 1549796686:
                    c11636 = (C11636) C0950.m3796(itM7968);
                    if (c11636.f36482 != null) {
                        iM2761 = (C0773.m3169("ۨ۠") + i9) * (-99);
                        i = ((iM2761 ^ i10) * 18369) ^ (-1572906317);
                        i2 = -1023760864;
                    } else {
                        iM2761 = (C0773.m3169("۬ۧ") ^ i10) * (-107);
                        i = ((iM2761 ^ i9) * 24793) ^ 1624594137;
                        i2 = 1008642377;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -831197444:
                case -417726699:
                    int i18 = i6 + i7;
                    if (i17 - (i18 + i18) <= 0) {
                        iM2762 = (i9 - C0773.m3169("ܰ᩵")) * 85;
                        i11 = ((iM2762 ^ i10) * (-30871)) ^ (-1226018643);
                        i3 = 43043395;
                    } else {
                        iM2762 = C0619.m2761("᩶ۢ") ^ i9;
                        i11 = ((iM2762 ^ i10) * 2457) ^ 1255938217;
                        i3 = 1023715236;
                    }
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case -773280653:
                case 1542747279:
                    c = 0;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2762 = C0773.m3169("᩶ܽ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-30127)) ^ (-1768780342);
                        i3 = 280618733;
                    } else {
                        iM2762 = C0619.m2761("ۡᩴ") ^ i10;
                        i11 = ((iM2762 ^ i9) * 27479) ^ (-1329253083);
                        i3 = -1480458659;
                    }
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case -273680814:
                case 1172043555:
                    s2 = sArr[c];
                    if (C2354.f7599 >= 0) {
                        iM2762 = (C0773.m3169("ᩳᩴ") + i9) * (-39);
                        i11 = ((iM2762 ^ i10) * (-16657)) ^ (-1230636795);
                        i3 = 502953805;
                    } else {
                        iM2762 = C0773.m3169("۫ܿ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-32029)) ^ 1652024270;
                        i3 = 1841429426;
                    }
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case -138731228:
                case 1127221079:
                    sArr = f3609;
                    if (C3734.f12817 >= 0) {
                        iM2762 = C0773.m3169("᩶ܽ") ^ i10;
                        i11 = ((iM2762 ^ i9) * (-30127)) ^ (-1768780342);
                        i3 = 280618733;
                    } else {
                        iM2762 = (i9 - C0619.m2761("۠ܶ")) * 81;
                        i11 = ((iM2762 ^ i10) * 26823) ^ 1008761595;
                        i3 = -315379726;
                    }
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case -40032903:
                case 721482043:
                    C0269.m1775();
                    C4282.m13644();
                    break;
                case 30325826:
                case 698953621:
                    i13 = 42362;
                    iM2762 = C0619.m2761("ۨᩳ") ^ i10;
                    i11 = ((iM2762 ^ i9) * 15169) ^ 1799729981;
                    i3 = -203054380;
                    i12 = iM2762 ^ i3;
                    c1000 = this;
                    break;
                case 426232523:
                case 509873990:
                    if (!RunnableC1848.f6235) {
                        s = s2;
                        int iM2763 = C0619.m2761("۠᩶") ^ i9;
                        i12 = iM2763 ^ 1663168269;
                        s2 = s;
                        i11 = ((iM2763 ^ i10) * 12957) ^ 1466981073;
                        c1000 = this;
                    } else {
                        iM2761 = C0619.m2761("۬ܰ") ^ i10;
                        i = ((iM2761 ^ i9) * (-5669)) ^ (-1944706117);
                        i2 = -1242358015;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case 565132721:
                case 1864208942:
                    c14691M30926 = AbstractC12454.m30926(strM49871, enumC7234Arr);
                    sArr2 = f3609;
                    i14 = 1;
                    if (C2485.f7950 == 0) {
                        iM2761 = C0619.m2761("ۡܶ") ^ i9;
                        i = ((iM2761 ^ i10) * 19227) ^ 1598611378;
                        i2 = -1895276404;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        iM2762 = (C0773.m3169("ᩳᩴ") + i9) * (-39);
                        i11 = ((iM2762 ^ i10) * (-16657)) ^ (-1230636795);
                        i3 = 502953805;
                        i12 = iM2762 ^ i3;
                        c1000 = this;
                    }
                    break;
                case 632275386:
                case 1878508917:
                    s = s2;
                    int i19 = s + 9376;
                    if (C3998.f13671 == 0) {
                        int iM2764 = C0619.m2761("֨֡") ^ i9;
                        s2 = s;
                        i4 = ((iM2764 ^ i10) * (-10651)) ^ 1565631760;
                        i12 = iM2764 ^ (-549828986);
                        i16 = i19;
                        i11 = i4;
                        c1000 = this;
                    } else {
                        i16 = i19;
                        int iM2765 = C0619.m2761("۠᩶") ^ i9;
                        i12 = iM2765 ^ 1663168269;
                        s2 = s;
                        i11 = ((iM2765 ^ i10) * 12957) ^ 1466981073;
                        c1000 = this;
                    }
                    break;
                case 1063735396:
                case 1490303702:
                    C0487.m2356();
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ᩴܰ") ^ i10;
                        i = ((iM2761 ^ i9) * (-2287)) ^ 783521790;
                        i2 = 1359615563;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        s = s2;
                        int iM2766 = C0619.m2761("۠᩶") ^ i9;
                        i12 = iM2766 ^ 1663168269;
                        s2 = s;
                        i11 = ((iM2766 ^ i10) * 12957) ^ 1466981073;
                        c1000 = this;
                    }
                    break;
                default:
                    C6489 c6489M35345 = c14691M30926.m35345(C2702.m8881(sArr2, i14, i15, i13));
                    itM7968 = C2354.m7968(c1000.f3611);
                    c6489 = c6489M35345;
                    iM2761 = (C0773.m3169("۬ۧ") ^ i10) * (-107);
                    i = ((iM2761 ^ i9) * 24793) ^ 1624594137;
                    i2 = 1008642377;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f3610.run();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20932.m47845(this);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC9202 activityC9202 = null;
        int i = -1236775740;
        int i2 = RunnableC0334.f1808;
        int i3 = AbstractC3624.f12429;
        int iM2761 = (C0619.m2761("ۘۢ") + i3) * (-49);
        int i4 = ((iM2761 ^ i2) * (-23675)) ^ 329952915;
        int i5 = 96289569;
        while (true) {
            i = ((((i ^ i2) * 32029) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2112464328:
                case 1486290796:
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("᩻۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 528923378;
                        i5 = -745154120;
                    } else {
                        iM2761 = C0773.m3169("ܺ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21229)) ^ (-1760307503);
                        i5 = -1295807097;
                    }
                    break;
                case -2070998972:
                case -747856700:
                    C1321.m4852();
                    break;
                case -2021881399:
                case -1428232748:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("ۚᩳ") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * (-3557)) ^ 806025510;
                        i5 = -882741028;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۢ") + i3) * 115;
                        i4 = ((iM2761 ^ i2) * (-1141)) ^ 132576128;
                        i5 = 1857532060;
                    }
                    break;
                case -1986834838:
                case -1814993696:
                    RunnableC3055.m9930(activityC9202, exc, null);
                    break;
                case -1770612249:
                case -1736717918:
                    C1519.m5403();
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 21403) ^ (-2050900244);
                        i5 = 2077477923;
                    } else {
                        iM2761 = (C0619.m2761("ۚᩳ") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * (-3557)) ^ 806025510;
                        i5 = -882741028;
                    }
                    break;
                case -1743199282:
                case -1521354572:
                    C1542.m5459();
                    iM2761 = (C0619.m2761("ۚᩳ") + i2) * (-89);
                    i4 = ((iM2761 ^ i3) * (-3557)) ^ 806025510;
                    i5 = -882741028;
                    break;
                case -1648024286:
                case -341694241:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("ۛᩴ") + i2) * 9;
                        i4 = ((iM2761 ^ i3) * (-19737)) ^ 2132669813;
                        i5 = 811111354;
                    } else {
                        iM2761 = (C0773.m3169("ܶ۬") + i3) * 63;
                        i4 = ((iM2761 ^ i2) * 13165) ^ 843607863;
                        i5 = -150961492;
                    }
                    break;
                case -1177219090:
                case 1349952937:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("᩹᩺") + i2) * 31;
                        i4 = ((iM2761 ^ i3) * 11665) ^ (-533193105);
                        i5 = -291521619;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۧۤ")) * (-99);
                        i4 = ((iM2761 ^ i2) * 673) ^ (-1048756585);
                        i5 = -979288715;
                    }
                    break;
                case -927448318:
                case 1824174424:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩻۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 528923378;
                        i5 = -745154120;
                    } else {
                        iM2761 = (C0773.m3169("᩺ܽ") + i2) * 35;
                        i4 = ((iM2761 ^ i3) * (-14211)) ^ (-1177668495);
                        i5 = -1307368855;
                    }
                    break;
                case -824865368:
                case 1815727037:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩻۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 528923378;
                        i5 = -745154120;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 21403) ^ (-2050900244);
                        i5 = 2077477923;
                    }
                    break;
                case -745484366:
                case -472068407:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("᩹᩺") + i2) * 31;
                        i4 = ((iM2761 ^ i3) * 11665) ^ (-533193105);
                        i5 = -291521619;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 21403) ^ (-2050900244);
                        i5 = 2077477923;
                    }
                    break;
                case -571713270:
                case 1210521810:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("᩹᩺") + i2) * 31;
                        i4 = ((iM2761 ^ i3) * 11665) ^ (-533193105);
                        i5 = -291521619;
                    } else {
                        iM2761 = C0619.m2761("ۢۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12413)) ^ 1412856597;
                        i5 = 660031186;
                    }
                    break;
                case 77689969:
                case 1926099533:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("᩻۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29019) ^ 528923378;
                        i5 = -745154120;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ᩸") ^ i2) * 79;
                        i4 = ((iM2761 ^ i3) * (-23717)) ^ 846692755;
                        i5 = 753896344;
                    }
                    break;
                case 402651117:
                case 1715226412:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 21403) ^ (-2050900244);
                        i5 = 2077477923;
                    } else {
                        iM2761 = C0773.m3169("᩵ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28363) ^ (-370863617);
                        i5 = -1783541016;
                    }
                    break;
                case 1809414545:
                case 1917447360:
                    activityC9202 = this.f3612;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("ۛᩴ") + i2) * 9;
                        i4 = ((iM2761 ^ i3) * (-19737)) ^ 2132669813;
                        i5 = 811111354;
                    } else {
                        iM2761 = C0773.m3169("֨ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4509)) ^ 346078056;
                        i5 = -1502729188;
                    }
                    break;
                default:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0773.m3169("ᩴ᩹") ^ i3) * 3;
                        i4 = ((iM2761 ^ i2) * 21403) ^ (-2050900244);
                        i5 = 2077477923;
                    } else {
                        iM2761 = C0619.m2761("۟ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3639) ^ 904652383;
                        i5 = -397181967;
                    }
                    break;
            }
            return;
        }
    }
}
