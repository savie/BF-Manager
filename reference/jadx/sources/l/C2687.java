package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9A5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2687 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۢۧ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f8555 = {6008, 8006, 8023, 8023, 7955, 7966, 8023, 7961, 8015, 7945, 7953, 7958, 8008, 8009, 7953, 7952, 7956, 7966, 7964, 8023, 8023, 8004};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7162 f8556;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f8557;

    /* JADX WARN: Code duplicated, block: B:34:0x00f0 A[PHI: r9 r12 r14
      0x00f0: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:33:0x00ee, B:29:0x00ca, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:33:0x00ee, B:29:0x00ca, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:33:0x00ee, B:29:0x00ca, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0187 A[PHI: r6 r7
      0x0187: PHI (r6v4 boolean) = (r6v3 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:44:0x0185, B:21:0x0093, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r7v4 l.ܰܶܺ) = (r7v3 l.ܰܶܺ), (r7v2 l.ܰܶܺ), (r7v2 l.ܰܶܺ) binds: [B:44:0x0185, B:21:0x0093, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x027c A[PHI: r2 r4 r5 r16 r24
      0x027c: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:67:0x027a, B:56:0x0202, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x027c: PHI (r4v3 l.ۜܶܺ[]) = (r4v2 l.ۜܶܺ[]), (r4v2 l.ۜܶܺ[]), (r4v4 l.ۜܶܺ[]) binds: [B:67:0x027a, B:56:0x0202, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x027c: PHI (r5v3 l.ۜܶܺ) = (r5v2 l.ۜܶܺ), (r5v2 l.ۜܶܺ), (r5v4 l.ۜܶܺ) binds: [B:67:0x027a, B:56:0x0202, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x027c: PHI (r16v4 short) = (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:67:0x027a, B:56:0x0202, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x027c: PHI (r24v5 int) = (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:67:0x027a, B:56:0x0202, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02a8 A[PHI: r3 r13 r19
      0x02a8: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:52:0x01da, B:17:0x007e, B:15:0x007a, B:12:0x0072, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r13v3 short) = (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v5 short) binds: [B:52:0x01da, B:17:0x007e, B:15:0x007a, B:12:0x0072, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r19v3 short) = (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v5 short) binds: [B:52:0x01da, B:17:0x007e, B:15:0x007a, B:12:0x0072, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02da A[PHI: r17 r18
      0x02da: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:73:0x02d8, B:15:0x007a, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:73:0x02d8, B:15:0x007a, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        int iM2761;
        int i;
        int i2;
        int i3 = AbstractC0116.f1064;
        int i4 = RunnableC3055.f9898;
        int iM3169 = (C0773.m3169("۠ۜ") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i5 = ((iM3169 ^ i3) * 30385) ^ 971949758;
        EnumC7234 enumC7234 = null;
        String str = null;
        short[] sArr = null;
        int i6 = iM3169 ^ 1895608845;
        String strM49871 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        char c = 0;
        short s3 = 0;
        int i9 = 1795771668;
        int i10 = 0;
        EnumC7234[] enumC7234Arr = null;
        Iterator itM9936 = null;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        C14691 c14691M30926 = null;
        boolean z = false;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * (-29417)) >> 31));
            switch (i9) {
                case -2084308684:
                case 1274831857:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("֡ۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23109)) ^ (-49721596);
                        i2 = -1224596269;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i3) * (-13);
                        i = ((iM2761 ^ i4) * (-18131)) ^ 546879110;
                        i2 = -1576740906;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1984260875:
                case 1266883031:
                    if (C2419.m8175(str, C0619.m2756(sArr, i8, 21, i7))) {
                        iM2761 = (C0619.m2761("ۡۙ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i4) * 22201) ^ (-469618161);
                        i2 = 493121501;
                    } else {
                        iM2761 = C0773.m3169("۫۬") ^ i4;
                        i = ((iM2761 ^ i3) * 4765) ^ 94622335;
                        i2 = -1361448084;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1971894857:
                case -201022027:
                    str = (String) C4238.m13529(itM9936);
                    sArr = f8555;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("֡ۡ") + i4) * (-103);
                        i = ((iM2761 ^ i3) * 12141) ^ (-1967759267);
                        i2 = 1305250160;
                    } else {
                        iM2761 = (C0773.m3169("ۤۜ") ^ i3) * 57;
                        i = ((iM2761 ^ i4) * (-7427)) ^ (-1098330135);
                        i2 = -929309071;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1910710059:
                case 1495104079:
                    sArr2 = f8555;
                    c = 0;
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("۠ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-4231)) ^ 2088879498;
                        i2 = 724146445;
                    } else {
                        iM2761 = C0619.m2761("ۢᩳ") ^ i3;
                        i = ((iM2761 ^ i4) * 9639) ^ (-502760649);
                        i2 = -1647724091;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1903199278:
                case 1147848224:
                    strM49871 = this.f8556.f23670.m49871();
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0619.m2761("ۤ᩷") ^ i3) * 73;
                        i = ((iM2761 ^ i4) * 23869) ^ (-1482406026);
                        i2 = 1200135259;
                    } else {
                        iM2761 = (C0619.m2761("ۖۙ") + i3) * (-11);
                        i = ((iM2761 ^ i4) * (-3905)) ^ 1336282771;
                        i2 = -317539368;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1693054778:
                case 85881297:
                    if (i10 - (s * s2) >= 0) {
                        iM2761 = C0619.m2761("ۚۖ") ^ i3;
                        i = ((iM2761 ^ i4) * (-11261)) ^ 258427037;
                        i2 = -235769158;
                    } else {
                        iM2761 = (C0619.m2761("۫֡") + i3) * 95;
                        i = ((iM2761 ^ i4) * 8569) ^ 569172467;
                        i2 = -1338501019;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1343261719:
                case -1289982922:
                    C1519.m5403();
                    break;
                case -1265573973:
                case -169061318:
                    i7 = 8058;
                    iM2761 = C0619.m2761("ܿ᩺") ^ i4;
                    i = ((iM2761 ^ i3) * 8031) ^ 1689191695;
                    i2 = -1367946561;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1237099818:
                case -56545239:
                    if (C3998.m12923(itM9936)) {
                        iM2761 = (C0773.m3169("ۙ᩹") ^ i4) * 91;
                        i = ((iM2761 ^ i3) * 19041) ^ (-2131100526);
                        i2 = -1114915173;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩺ܺ")) * (-119);
                        i = ((iM2761 ^ i3) * (-20051)) ^ (-1320008672);
                        i2 = -344278513;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1053444751:
                case -221048005:
                    C2878.m9491();
                    iM2761 = C0619.m2761("֡ۚ") ^ i3;
                    i = ((iM2761 ^ i4) * (-23109)) ^ (-49721596);
                    i2 = -1224596269;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -982290517:
                case 946314163:
                    break;
                case -641351066:
                case -423975969:
                    enumC7234Arr = new EnumC7234[i11];
                    enumC7234 = EnumC7234.OrderedField;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ۤ᩷") ^ i3) * 73;
                        i = ((iM2761 ^ i4) * 23869) ^ (-1482406026);
                        i2 = 1200135259;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܳ۠")) * (-89);
                        i = ((iM2761 ^ i3) * 4221) ^ (-305328944);
                        i2 = 1835228484;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -252669455:
                case 1068697939:
                    i11 = 1;
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("֡ۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23109)) ^ (-49721596);
                        i2 = -1224596269;
                    } else {
                        iM2761 = C0619.m2761("۫ۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-2521)) ^ 427502357;
                        i2 = 212240663;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -245452571:
                case 1723011612:
                    z = false;
                    enumC7234Arr[0] = enumC7234;
                    c14691M30926 = AbstractC12454.m30926(strM49871, enumC7234Arr);
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i3) * (-13);
                        i = ((iM2761 ^ i4) * (-18131)) ^ 546879110;
                        i2 = -1576740906;
                    } else {
                        iM2761 = C0773.m3169("᩵۫") ^ i3;
                        i = ((iM2761 ^ i4) * (-23459)) ^ (-56102563);
                        i2 = -250095116;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -183885986:
                case 24099765:
                    itM9936 = RunnableC3055.m9936(c14691M30926.keySet());
                    i12 = 0;
                    iM2761 = (C0619.m2761("ۡۙ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM2761 ^ i4) * 22201) ^ (-469618161);
                    i2 = 493121501;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 573463253:
                case 1465881500:
                    i8 = 1;
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("֡ۡ") + i4) * (-103);
                        i = ((iM2761 ^ i3) * 12141) ^ (-1967759267);
                        i2 = 1305250160;
                    } else {
                        iM2761 = C0619.m2761("ܰ۟") ^ i3;
                        i = ((iM2761 ^ i4) * 2751) ^ 1941252747;
                        i2 = 1335689668;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 760185368:
                case 1370996669:
                    int i13 = s + s3;
                    i10 = i13 * i13;
                    s2 = 32784;
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("ܳۙ") ^ i4;
                        i = ((iM2761 ^ i3) * 5511) ^ 1591989157;
                        i2 = -285056941;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩷") ^ i3) * 73;
                        i = ((iM2761 ^ i4) * 23869) ^ (-1482406026);
                        i2 = 1200135259;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 867518776:
                case 1753061821:
                    if (C0773.m3161() == 0) {
                        iM2761 = C0619.m2761("֡ۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23109)) ^ (-49721596);
                        i2 = -1224596269;
                    } else {
                        iM2761 = C0619.m2761("۠ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-4231)) ^ 2088879498;
                        i2 = 724146445;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 938069131:
                case 1099123298:
                    i7 = 11556;
                    iM2761 = C0619.m2761("ܿ᩺") ^ i4;
                    i = ((iM2761 ^ i3) * 8031) ^ 1689191695;
                    i2 = -1367946561;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1112745565:
                case 1796831932:
                    if (C1080.f3865 < 0) {
                        iM2761 = C0619.m2761("۠ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-4231)) ^ 2088879498;
                        i2 = 724146445;
                    } else {
                        iM2761 = (C0773.m3169("֡ۡ") + i4) * (-103);
                        i = ((iM2761 ^ i3) * 12141) ^ (-1967759267);
                        i2 = 1305250160;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1153816969:
                case 1803835491:
                    String strM35343 = c14691M30926.m35343(str);
                    int i14 = i12 + 1;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i3) * (-13);
                        i = ((iM2761 ^ i4) * (-18131)) ^ 546879110;
                        i2 = -1576740906;
                    } else {
                        RunnableC0334.m2054(this.f8557, new C11636(strM35343, i12, str, z));
                        i12 = i14;
                        iM2761 = (C0619.m2761("ۡۙ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i4) * 22201) ^ (-469618161);
                        i2 = 493121501;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr2[c];
                    s3 = 8196;
                    if (C4282.m13644()) {
                        iM2761 = C0619.m2761("֨᩻") ^ i4;
                        i = ((iM2761 ^ i3) * 32557) ^ 1230387434;
                        i2 = -950813617;
                    } else {
                        iM2761 = C0619.m2761("֡ۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-23109)) ^ (-49721596);
                        i2 = -1224596269;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C2687(ActivityC7162 activityC7162) {
        ArrayList arrayList = null;
        int i = -206791356;
        int i2 = C0269.f1558;
        int i3 = C0487.f2131;
        this.f8556 = activityC7162;
        int iM2761 = (C0619.m2761("᩺ۨ") ^ i3) * (-69);
        int i4 = ((iM2761 ^ i2) * 2949) ^ 596428749;
        int i5 = -110615925;
        while (true) {
            i = ((((i ^ i2) * 5559) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2051338569:
                case 1711243826:
                    C1519.m5403();
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("᩻ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6541) ^ (-1820772240);
                        i5 = 1008250881;
                    } else {
                        iM2761 = (C0619.m2761("ܶۗ") + i2) * 91;
                        i4 = ((iM2761 ^ i3) * 4129) ^ (-812643228);
                        i5 = -953075367;
                    }
                    break;
                case -1920314287:
                case 328967669:
                    C1564.m5509();
                    iM2761 = C0773.m3169("᩻ۙ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 6541) ^ (-1820772240);
                    i5 = 1008250881;
                    break;
                case -1851060329:
                case 1729773080:
                    C23916.m53419();
                    if (C0950.m3785() == 0) {
                        iM2761 = (C0619.m2761("ۗ᩺") + i2) * (-67);
                        i4 = ((iM2761 ^ i3) * 20309) ^ 972024974;
                        i5 = -1277401489;
                    } else {
                        iM2761 = C0773.m3169("᩻ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6541) ^ (-1820772240);
                        i5 = 1008250881;
                    }
                    break;
                case -1486094798:
                case 728419495:
                    C2419.m8174();
                    throw new RuntimeException();
                case -1435762983:
                case 1910316597:
                    this.f8557 = arrayList;
                    return;
                case -1309031580:
                case 858929290:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ܽܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19113)) ^ 463132828;
                        i5 = 1886101154;
                    } else {
                        iM2761 = C0619.m2761("ᩴۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 29605) ^ (-197545214);
                        i5 = -1725301375;
                    }
                    break;
                case -1244511330:
                case -368615870:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("᩻ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6541) ^ (-1820772240);
                        i5 = 1008250881;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۨܶ")) * 47;
                        i4 = ((iM2761 ^ i2) * 3637) ^ 502521799;
                        i5 = 1470258975;
                    }
                    break;
                case -1234411670:
                case -1087261961:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("۫֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5989) ^ (-21090256);
                        i5 = 1253688891;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28771) ^ (-468424479);
                        i5 = 1596809610;
                    }
                    break;
                case 114169795:
                case 438896487:
                    if (C1080.m4050()) {
                        iM2761 = (C0773.m3169("֡֫") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * (-28189)) ^ (-1572528491);
                        i5 = -1788185415;
                    } else {
                        iM2761 = C0619.m2761("ܽܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19113)) ^ 463132828;
                        i5 = 1886101154;
                    }
                    break;
                case 156815065:
                case 1106280741:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ܽܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19113)) ^ 463132828;
                        i5 = 1886101154;
                    } else {
                        iM2761 = (C0619.m2761("ۗ᩺") + i2) * (-67);
                        i4 = ((iM2761 ^ i3) * 20309) ^ 972024974;
                        i5 = -1277401489;
                    }
                    break;
                case 185003795:
                case 436286217:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("۫֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5989) ^ (-21090256);
                        i5 = 1253688891;
                    } else {
                        iM2761 = C0619.m2761("۬۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22291)) ^ 558669082;
                        i5 = 1617834607;
                    }
                    break;
                case 234097557:
                case 1464615033:
                    arrayList = new ArrayList();
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ܽܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19113)) ^ 463132828;
                        i5 = 1886101154;
                    } else {
                        iM2761 = (C0619.m2761("ܰۗ") ^ i3) * 55;
                        i4 = ((iM2761 ^ i2) * 5913) ^ (-511982718);
                        i5 = 323022958;
                    }
                    break;
                case 1203268302:
                case 1882219955:
                    if (C2354.m7983()) {
                        iM2761 = (C0773.m3169("۟ۚ") ^ i3) * (-15);
                        i4 = ((iM2761 ^ i2) * (-19827)) ^ 1406971376;
                        i5 = -779432282;
                    } else {
                        iM2761 = C0619.m2761("۫֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5989) ^ (-21090256);
                        i5 = 1253688891;
                    }
                    break;
                case 1282016273:
                case 1328052208:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("ۗ᩺") + i2) * (-67);
                        i4 = ((iM2761 ^ i3) * 20309) ^ 972024974;
                        i5 = -1277401489;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-9);
                        i4 = ((iM2761 ^ i2) * 21885) ^ 638071640;
                        i5 = -1663333867;
                    }
                    break;
                case 1886066542:
                case 2001333243:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("ۗ᩺") + i2) * (-67);
                        i4 = ((iM2761 ^ i3) * 20309) ^ 972024974;
                        i5 = -1277401489;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۙ֨")) * (-55);
                        i4 = ((iM2761 ^ i2) * 28953) ^ 1589347720;
                        i5 = 257399189;
                    }
                    break;
                default:
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0619.m2761("ܽܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19113)) ^ 463132828;
                        i5 = 1886101154;
                    } else {
                        iM2761 = (C0619.m2761("ۖ᩶") + i2) * (-17);
                        i4 = ((iM2761 ^ i3) * 22233) ^ (-127111332);
                        i5 = -1678214305;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f8556, 300);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f8556.m26246(this.f8557);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20932.m47845(this);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC7162 activityC7162 = null;
        int i = 2133986206;
        int i2 = C0773.f2792;
        int i3 = C1321.f4751;
        int iM3169 = (C0773.m3169("᩺֡") + i3) * (-3);
        int i4 = ((iM3169 ^ i2) * (-2165)) ^ 932511608;
        int i5 = -602946812;
        while (true) {
            i = ((((i ^ i2) * 14955) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2059874505:
                case -376792588:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۗ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15027)) ^ (-2032474655);
                        i5 = 357248557;
                    } else {
                        iM3169 = (C0619.m2761("۬֫") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * (-19153)) ^ 1778613966;
                        i5 = 1114187288;
                    }
                    break;
                case -1948171190:
                case -1457059905:
                    AbstractC0116.m1243();
                    break;
                case -1893586729:
                case -802918050:
                    if (C2966.m9664()) {
                        iM3169 = C0773.m3169("᩻᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10307) ^ (-167911267);
                        i5 = 165444003;
                    } else {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * (-15085)) ^ (-396543752);
                        i5 = 1269530285;
                    }
                    break;
                case -1691733550:
                case 1444836747:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * 75;
                        i4 = ((iM3169 ^ i3) * (-14543)) ^ 1818889377;
                        i5 = 1076502740;
                    } else {
                        iM3169 = C0619.m2761("۠ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8023) ^ (-10778800);
                        i5 = -1687288162;
                    }
                    break;
                case -1646467392:
                case -589009325:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("ۗ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15027)) ^ (-2032474655);
                        i5 = 357248557;
                    } else {
                        iM3169 = C0619.m2761("ۧۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26363) ^ (-1167532711);
                        i5 = 612422128;
                    }
                    break;
                case -1278009387:
                case 1744279657:
                    if (C2419.m8174() >= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * (-15085)) ^ (-396543752);
                        i5 = 1269530285;
                    } else {
                        iM3169 = C0619.m2761("ܳۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26449) ^ (-1195951533);
                        i5 = 264191696;
                    }
                    break;
                case -1229155169:
                case 192035301:
                    activityC7162 = this.f8556;
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴ֡")) * (-91);
                        i4 = ((iM3169 ^ i2) * (-9427)) ^ 1635861858;
                        i5 = -543795112;
                    } else {
                        iM3169 = C0619.m2761("᩵ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6197)) ^ 1170166857;
                        i5 = 144471434;
                    }
                    break;
                case -1126055965:
                case -497935424:
                    if (C2878.f9462) {
                        iM3169 = (i3 - C0773.m3169("ᩴ֡")) * (-91);
                        i4 = ((iM3169 ^ i2) * (-9427)) ^ 1635861858;
                        i5 = -543795112;
                    } else {
                        iM3169 = C0773.m3169("֡ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27527) ^ 433419896;
                        i5 = 2054947975;
                    }
                    break;
                case -1081997154:
                case 1727318078:
                    C17202.m40372();
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * 75;
                        i4 = ((iM3169 ^ i3) * (-14543)) ^ 1818889377;
                        i5 = 1076502740;
                    } else {
                        iM3169 = C0619.m2761("ܳۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26449) ^ (-1195951533);
                        i5 = 264191696;
                    }
                    break;
                case -884095354:
                case 916875576:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ۗ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15027)) ^ (-2032474655);
                        i5 = 357248557;
                    } else {
                        iM3169 = (C0619.m2761("ۤۛ") ^ i2) * 49;
                        i4 = ((iM3169 ^ i3) * (-30961)) ^ 1871367985;
                        i5 = 1189157601;
                    }
                    break;
                case -749649923:
                case 637452014:
                    C3077.m10041();
                    C23916.m53419();
                    iM3169 = C0619.m2761("ܳۧ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 26449) ^ (-1195951533);
                    i5 = 264191696;
                    break;
                case -413460383:
                case 2067877482:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * (-15085)) ^ (-396543752);
                        i5 = 1269530285;
                    } else {
                        iM3169 = C0619.m2761("᩸᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3873)) ^ 1483494341;
                        i5 = -41657133;
                    }
                    break;
                case 361043249:
                case 1039533494:
                    if (C2966.m9664()) {
                        iM3169 = (i2 - C0773.m3169("ܳۛ")) * 51;
                        i4 = ((iM3169 ^ i3) * 20971) ^ (-2098231866);
                        i5 = 506065045;
                    } else {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * (-15085)) ^ (-396543752);
                        i5 = 1269530285;
                    }
                    break;
                case 391665566:
                case 1748558207:
                    C20932.m47848();
                    if (C0487.f2131 > 0) {
                        iM3169 = C0773.m3169("ۗ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15027)) ^ (-2032474655);
                        i5 = 357248557;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ᩳۡ")) * 75;
                        i4 = ((iM3169 ^ i3) * (-14543)) ^ 1818889377;
                        i5 = 1076502740;
                    }
                    break;
                case 1374368131:
                case 1528810664:
                    if (C3099.m10095()) {
                        iM3169 = (i3 - C0773.m3169("ᩴ֡")) * (-91);
                        i4 = ((iM3169 ^ i2) * (-9427)) ^ 1635861858;
                        i5 = -543795112;
                    } else {
                        iM3169 = C0773.m3169("᩸ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9581) ^ 2034277896;
                        i5 = 597896073;
                    }
                    break;
                default:
                    RunnableC3055.m9930(activityC7162, exc, null);
                    break;
            }
            return;
        }
    }
}
