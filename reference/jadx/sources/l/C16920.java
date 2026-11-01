package l;

import org.bouncycastle.pqc.crypto.falcon.FalconVrfy;

/* JADX INFO: renamed from: l.ܽ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S3XU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16920 {

    /* JADX INFO: renamed from: ᩹᩹ܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f54102 = {4549, 7223, 7210, 7227, 7219, 578, 13758, 13732, 13758};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11897 f54103;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f54104;

    public C16920(C11897 c11897, String str) {
        int i = -844301267;
        int i2 = C1419.f5860;
        int i3 = C2788.f10625;
        short s = f54102[0];
        C2704.m8238(c11897, C1461.m5070(f54102, 1, 4, (s * 24804) - ((s * s) + 153809604) <= 0 ? 7262 : 11927));
        int iM11306 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i3;
        int i4 = ((iM11306 ^ i2) * 8997) ^ 693993748;
        int i5 = -413829156;
        while (true) {
            i = ((((i ^ i2) * 12853) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2129570031:
                case -521374591:
                    this.f54104 = str;
                    return;
                case -2110222585:
                case -1423876012:
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24731)) ^ 1632368680;
                        i5 = -1150665915;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18707)) ^ (-92576555);
                        i5 = -619035378;
                    }
                    break;
                case -2097896546:
                case 334411650:
                    if (!CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24731)) ^ 1632368680;
                        i5 = -1150665915;
                    } else {
                        iM11306 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27585)) ^ 2051833153;
                        i5 = -1610419654;
                    }
                    break;
                case -1993097948:
                case -509301763:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩹֫")) * 49;
                        i4 = ((iM11306 ^ i3) * (-29377)) ^ (-319971451);
                        i5 = 1145010127;
                    } else {
                        iM11306 = (C19806.m45029("ۗܶ") ^ i3) * 83;
                        i4 = ((iM11306 ^ i2) * 17819) ^ (-201077576);
                        i5 = -570252916;
                    }
                    break;
                case -1869770957:
                case 1854401440:
                    C1377.m4833();
                    throw new RuntimeException();
                case -1869143770:
                case 1384928867:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩹֫")) * 49;
                        i4 = ((iM11306 ^ i3) * (-29377)) ^ (-319971451);
                        i5 = 1145010127;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-23673)) ^ (-1983049684);
                        i5 = 1552977745;
                    }
                    break;
                case -1798524731:
                case 1898928838:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (i2 - C19806.m45029("ۢ۫")) * (-115);
                        i4 = ((iM11306 ^ i3) * 16875) ^ (-1879454107);
                        i5 = 445646207;
                    } else {
                        iM11306 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27585)) ^ 2051833153;
                        i5 = -1610419654;
                    }
                    break;
                case -1596426272:
                case -1489186457:
                    RunnableC1895.m6170();
                    C2788.m8472();
                    iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-24731)) ^ 1632368680;
                    i5 = -1150665915;
                    break;
                case -1409242538:
                case 851144071:
                    this.f54103 = c11897;
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ܺ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11231)) ^ 1155991912;
                        i5 = 1097620504;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ۟") + i2) * (-73);
                        i4 = ((iM11306 ^ i3) * 26083) ^ (-733341766);
                        i5 = 2010275793;
                    }
                    break;
                case -1232420719:
                case -342852990:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۚ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17739) ^ (-496605035);
                        i5 = -2023599511;
                    } else {
                        iM11306 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27585)) ^ 2051833153;
                        i5 = -1610419654;
                    }
                    break;
                case -807767983:
                case 271428428:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۢ۫")) * (-115);
                        i4 = ((iM11306 ^ i3) * 16875) ^ (-1879454107);
                        i5 = 445646207;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩻") ^ i3) * 47;
                        i4 = ((iM11306 ^ i2) * 13999) ^ (-1528335448);
                        i5 = 1649248949;
                    }
                    break;
                case -801789891:
                case -54607149:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ܳ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11263)) ^ (-901229658);
                        i5 = 1663709170;
                    } else {
                        iM11306 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27585)) ^ 2051833153;
                        i5 = -1610419654;
                    }
                    break;
                case 150378559:
                case 1978445425:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩹֫")) * 49;
                        i4 = ((iM11306 ^ i3) * (-29377)) ^ (-319971451);
                        i5 = 1145010127;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24731)) ^ 1632368680;
                        i5 = -1150665915;
                    }
                    break;
                case 250893786:
                case 1080970009:
                    if (C0216.f1393 != 0) {
                        iM11306 = (i2 - C19806.m45029("ۢ۫")) * (-115);
                        i4 = ((iM11306 ^ i3) * 16875) ^ (-1879454107);
                        i5 = 445646207;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܽ") ^ i2) * (-21);
                        i4 = ((iM11306 ^ i3) * (-5357)) ^ (-1065487664);
                        i5 = 1776488965;
                    }
                    break;
                case 1228682127:
                case 1657544960:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27585)) ^ 2051833153;
                        i5 = -1610419654;
                    } else {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12091)) ^ (-1195419772);
                        i5 = 98274085;
                    }
                    break;
                default:
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("ܺ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11231)) ^ 1155991912;
                        i5 = 1097620504;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17275)) ^ 214330209;
                        i5 = 894210602;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0201 A[PHI: r2 r4 r23 r24
      0x0201: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:55:0x01ff, B:42:0x0157, B:86:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:55:0x01ff, B:42:0x0157, B:86:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r23v6 int) = (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:55:0x01ff, B:42:0x0157, B:86:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r24v4 int) = (r24v2 int), (r24v1 int), (r24v1 int) binds: [B:55:0x01ff, B:42:0x0157, B:86:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0238 A[PHI: r5 r8 r9
      0x0238: PHI (r5v4 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:59:0x0236, B:27:0x00cb, B:17:0x007f, B:38:0x0131, B:88:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:59:0x0236, B:27:0x00cb, B:17:0x007f, B:38:0x0131, B:88:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r9v4 java.lang.StringBuilder) = 
      (r9v2 java.lang.StringBuilder)
      (r9v2 java.lang.StringBuilder)
      (r9v2 java.lang.StringBuilder)
      (r9v3 java.lang.StringBuilder)
      (r9v2 java.lang.StringBuilder)
     binds: [B:59:0x0236, B:27:0x00cb, B:17:0x007f, B:38:0x0131, B:88:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        int iM45029;
        int i;
        int i2;
        int i3 = C0050.f912;
        int i4 = C1025.f4800;
        int iM450210 = C19806.m45029("᩹۠") ^ i3;
        int i5 = ((iM450210 ^ i4) * (-27663)) ^ (-579261577);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ (-207489070);
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        StringBuilder sb = null;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -906465227;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String strM29678 = null;
        String strM29681 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * FalconVrfy.R) >> 31));
            switch (i12) {
                case -2082723317:
                case 1448668574:
                    C11897 c11897 = this.f54103;
                    strM29681 = c11897.m29681();
                    strM29678 = c11897.m29678();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("۬ܿ") + i3) * (-5);
                        i = ((iM45029 ^ i4) * 27819) ^ 1146449956;
                        i2 = 1893936906;
                    } else {
                        iM45029 = C19806.m45029("᩸ۛ") ^ i3;
                        i = ((iM45029 ^ i4) * (-17401)) ^ 1417443181;
                        i2 = 1490096622;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2062141998:
                case 781495157:
                    C1148.m4232();
                    iM45029 = (C19806.m45029("ۘۘ") + i4) * 89;
                    i = ((iM45029 ^ i3) * (-7869)) ^ 935695174;
                    i2 = 1182597702;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2019285189:
                case -1101556841:
                    C1148.m4223(sb, str);
                    sArr2 = f54102;
                    i11 = 6;
                    i7 = 1;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۙ") + i3) * 15;
                        i = ((iM45029 ^ i4) * (-23377)) ^ (-724465861);
                        i2 = -1951775361;
                    } else {
                        iM45029 = (C19806.m45029("ۗᩳ") + i4) * (-109);
                        i = ((iM45029 ^ i3) * (-13129)) ^ (-1314881488);
                        i2 = -901939778;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1910982589:
                case 221854019:
                    i13 = s * s;
                    i14 = 262342809;
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (C19806.m45029("۬ܿ") + i3) * (-5);
                        i = ((iM45029 ^ i4) * 27819) ^ 1146449956;
                        i2 = 1893936906;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۗ") ^ i3) * (-57);
                        i = ((iM45029 ^ i4) * 28537) ^ (-960968567);
                        i2 = -814254168;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1850104790:
                case 351843182:
                    if (!C3577.m10565()) {
                        int iM450211 = C19806.m45029("ܶܺ") ^ i3;
                        i6 = iM450211 ^ (-918795531);
                        i5 = ((iM450211 ^ i4) * (-17163)) ^ 607247279;
                        sb = null;
                    } else {
                        sb = new StringBuilder();
                        str = this.f54104;
                        if (C0629.f2722 <= 0) {
                            iM45029 = (C19806.m45029("ۘۘ") + i4) * 89;
                            i = ((iM45029 ^ i3) * (-7869)) ^ 935695174;
                            i2 = 1182597702;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۬ۙ") ^ i3;
                            i = ((iM45029 ^ i4) * 30679) ^ (-597915333);
                            i2 = -879860811;
                        }
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1845346570:
                case 1084102569:
                    i10 = 55862;
                    iM45029 = (ThreadFactoryC3888.m11306("ۗܳ") ^ i4) * 17;
                    i = ((iM45029 ^ i3) * 22101) ^ 1982065237;
                    i2 = 1477969192;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1797144909:
                case -48131340:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("۬ܿ") + i3) * (-5);
                        i = ((iM45029 ^ i4) * 27819) ^ 1146449956;
                        i2 = 1893936906;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450212 = C19806.m45029("ܶܺ") ^ i3;
                        i6 = iM450212 ^ (-918795531);
                        i5 = ((iM450212 ^ i4) * (-17163)) ^ 607247279;
                        sb = null;
                    }
                    break;
                case -1385926715:
                case -813910635:
                    s = sArr[c];
                    if (C7105.m18985()) {
                        iM45029 = (C19806.m45029("ۘۘ") + i4) * 89;
                        i = ((iM45029 ^ i3) * (-7869)) ^ 935695174;
                        i2 = 1182597702;
                    } else {
                        iM45029 = C19806.m45029("ܺۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 23117) ^ 1255078390;
                        i2 = 1091782210;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1140053665:
                case 1049444890:
                    i10 = 13726;
                    iM45029 = (ThreadFactoryC3888.m11306("ۗܳ") ^ i4) * 17;
                    i = ((iM45029 ^ i3) * 22101) ^ 1982065237;
                    i2 = 1477969192;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1093925503:
                case -569820173:
                    C0797.m3359();
                    if (C1148.f5161 <= 0) {
                        int iM450213 = C19806.m45029("ܶܺ") ^ i3;
                        i6 = iM450213 ^ (-918795531);
                        i5 = ((iM450213 ^ i4) * (-17163)) ^ 607247279;
                        sb = null;
                    } else {
                        iM45029 = (C19806.m45029("ۘۘ") + i4) * 89;
                        i = ((iM45029 ^ i3) * (-7869)) ^ 935695174;
                        i2 = 1182597702;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1081584202:
                case -327960262:
                    sArr = f54102;
                    c = 5;
                    if (C2642.f10294 > 0) {
                        iM45029 = (C19806.m45029("ܽ᩺") + i4) * 87;
                        i = ((iM45029 ^ i3) * 13527) ^ (-1230607743);
                        i2 = 598984417;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450214 = C19806.m45029("ܶܺ") ^ i3;
                        i6 = iM450214 ^ (-918795531);
                        i5 = ((iM450214 ^ i4) * (-17163)) ^ 607247279;
                        sb = null;
                    }
                    break;
                case -933806927:
                case 1315103179:
                    C2124.m6673();
                    C3577.m10565();
                    return null;
                case -857773184:
                case 1159204958:
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) < 0) {
                        iM45029 = (i3 - C19806.m45029("ۧܶ")) * 9;
                        i = ((iM45029 ^ i4) * (-767)) ^ (-128013116);
                        i2 = -303450627;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i4;
                        i = ((iM45029 ^ i3) * 2525) ^ 681679460;
                        i2 = -298036756;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -731683265:
                case 1467500081:
                    sArr3 = f54102;
                    i8 = 7;
                    if (C2124.m6673() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ۟") ^ i4) * (-101);
                        i = ((iM45029 ^ i3) * (-24313)) ^ (-885197798);
                        i2 = -1562215259;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450215 = C19806.m45029("ܶܺ") ^ i3;
                        i6 = iM450215 ^ (-918795531);
                        i5 = ((iM450215 ^ i4) * (-17163)) ^ 607247279;
                        sb = null;
                    }
                    break;
                case -370654033:
                case 2067931233:
                    C2788.m8480(sb, C2124.m6685(sArr2, i11, i7, i10));
                    C2788.m8480(sb, strM29681);
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۘۘ") + i4) * 89;
                        i = ((iM45029 ^ i3) * (-7869)) ^ 935695174;
                        i2 = 1182597702;
                    } else {
                        iM45029 = C19806.m45029("᩶۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-12571)) ^ (-798173065);
                        i2 = 458351867;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -205158792:
                case 104312675:
                    C2704.m8255();
                    if (C1377.m4833() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۖ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6909)) ^ 182498618;
                        i2 = 246944520;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450216 = C19806.m45029("ܶܺ") ^ i3;
                        i6 = iM450216 ^ (-918795531);
                        i5 = ((iM450216 ^ i4) * (-17163)) ^ 607247279;
                        sb = null;
                    }
                    break;
                case 146924980:
                case 823666992:
                    C1148.m4223(sb, C1460.m5047(sArr3, i8, 2, i10));
                    C1148.m4223(sb, strM29678);
                    return C0817.m3407(sb);
                default:
                    int i16 = i13 + i14;
                    i9 = i16 + i16;
                    s2 = 16197;
                    if (C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۖ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6909)) ^ 182498618;
                        i2 = 246944520;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i4;
                        i = ((iM45029 ^ i3) * (-19161)) ^ (-973185732);
                        i2 = -1784083725;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m39608() {
        String str = null;
        String str2 = null;
        int i = -328490550;
        int i2 = C10634.f36300;
        int i3 = C1977.f7413;
        int iM45029 = C19806.m45029("۬ܽ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-29379)) ^ 884470606;
        int i5 = 763333642;
        while (true) {
            i = ((((i ^ i2) * (-18383)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1992604167:
                case 553411576:
                    if (C0526.m2437() >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩶ۗ")) * 45;
                        i4 = ((iM45029 ^ i3) * 16339) ^ (-2115442463);
                        i5 = 807453317;
                    } else {
                        iM45029 = C19806.m45029("᩵ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-963)) ^ (-1768768713);
                        i5 = -1927950893;
                    }
                    break;
                case -1982729809:
                case -1806273931:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i2 - C19806.m45029("᩶ۗ")) * 45;
                        i4 = ((iM45029 ^ i3) * 16339) ^ (-2115442463);
                        i5 = 807453317;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܿ") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * (-5735)) ^ 343684185;
                        i5 = 931776844;
                    }
                    break;
                case -1757509236:
                case -430557879:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31549)) ^ 140894857;
                        i5 = 547915526;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۜܺ")) * 101;
                        i4 = ((iM45029 ^ i3) * (-18149)) ^ 614877728;
                        i5 = 1685795102;
                    }
                    break;
                case -1717628296:
                case -1649681458:
                    return str2;
                case -1553057657:
                case -47801068:
                    C2249.m6915();
                    C3743.m10966();
                    return null;
                case -1348263304:
                case 953935551:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31549)) ^ 140894857;
                        i5 = 547915526;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۧ") + i2) * (-109);
                        i4 = ((iM45029 ^ i3) * 13707) ^ 658294756;
                        i5 = 1802002138;
                    }
                    break;
                case -1248896083:
                case -445657484:
                    str2 = null;
                    iM45029 = C19806.m45029("᩺۬") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-27423)) ^ 1422321163;
                    i5 = -879119282;
                    break;
                case -1156575992:
                case 1660392088:
                    C2249.m6915();
                    C10634.m26820();
                    iM45029 = (i2 - C19806.m45029("᩶ۗ")) * 45;
                    i4 = ((iM45029 ^ i3) * 16339) ^ (-2115442463);
                    i5 = 807453317;
                    break;
                case -1058768724:
                case -1053975376:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31549)) ^ 140894857;
                        i5 = 547915526;
                    } else {
                        iM45029 = C19806.m45029("ۧܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1603) ^ (-1205448636);
                        i5 = -1611119957;
                    }
                    break;
                case -1055494830:
                case 1610962482:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۜ") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * (-25101)) ^ (-905284655);
                        i5 = 997970671;
                    } else {
                        iM45029 = (C19806.m45029("᩵᩹") ^ i3) * 15;
                        i4 = ((iM45029 ^ i2) * (-27453)) ^ (-1069101059);
                        i5 = 256623184;
                    }
                    break;
                case -677114337:
                case 439141177:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۜ") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * (-25101)) ^ (-905284655);
                        i5 = 997970671;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20217) ^ 1903824520;
                        i5 = -985924846;
                    }
                    break;
                case -552375471:
                case 967169507:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26075) ^ (-1442844023);
                        i5 = 821220328;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6975)) ^ 110963767;
                        i5 = 1811470692;
                    }
                    break;
                case -351823371:
                case 1549317000:
                    if (C2249.f8050 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31549)) ^ 140894857;
                        i5 = 547915526;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26075) ^ (-1442844023);
                        i5 = 821220328;
                    }
                    break;
                case -99139625:
                case 2138754143:
                    str = this.f54104;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩶ۗ")) * 45;
                        i4 = ((iM45029 ^ i3) * 16339) ^ (-2115442463);
                        i5 = 807453317;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4417) ^ 1465792956;
                        i5 = -967625480;
                    }
                    break;
                case 123872035:
                case 1249026218:
                    if (C1377.f5749) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽ۟")) * 49;
                        i4 = ((iM45029 ^ i3) * (-25763)) ^ (-838125644);
                        i5 = 1691325740;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31549)) ^ 140894857;
                        i5 = 547915526;
                    }
                    break;
                case 212126023:
                case 1547892027:
                    if (C1875.m6096(str) == 0) {
                        iM45029 = (C19806.m45029("ۨۗ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * (-18275)) ^ 1235098947;
                        i5 = -2058275566;
                    } else {
                        str2 = str;
                        iM45029 = C19806.m45029("᩺۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27423)) ^ 1422321163;
                        i5 = -879119282;
                    }
                    break;
                case 972979969:
                case 1401884600:
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("ۛᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4643) ^ (-744480642);
                        i5 = -481892439;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۜ") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * (-25101)) ^ (-905284655);
                        i5 = 997970671;
                    }
                    break;
                default:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26075) ^ (-1442844023);
                        i5 = 821220328;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩶ۗ")) * 45;
                        i4 = ((iM45029 ^ i3) * 16339) ^ (-2115442463);
                        i5 = 807453317;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11897 m39607() {
        return this.f54103;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m39609() {
        return this.f54104;
    }
}
