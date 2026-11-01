package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6029 extends C16309 {

    /* JADX INFO: renamed from: ۡܰۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f20496 = {7664, -16538, -16568, -16573, -16572, -16635, -16569, -16546, -16635, -16550, -16570, -16545, -16563, -16573, -16572, -16635, -16565, -16550, -16573, -16635, -16550, -16552, -16561, -16564, -16561, -16552, -16561, -16572, -16567, -16561, -16635, -16518, -16570, -16545, -16563, -16573, -16572, -16518, -16552, -16561, -16564, -16561, -16552, -16561, -16572, -16567, -16561, -16626, -16514, -16561, -16558, -16546, -16541, -16546, -16561, -16569, -16623, -16538, -16568, -16573, -16572, -16635, -16569, -16546, -16635, -16550, -16570, -16545, -16563, -16573, -16572, -16635, -16565, -16550, -16573, -16635, -16550, -16552, -16561, -16564, -16561, -16552, -16561, -16572, -16567, -16561, -16635, -16518, -16570, -16545, -16563, -16573, -16572, -16518, -16552, -16561, -16564, -16561, -16552, -16561, -16572, -16567, -16561, -16626, -16518, -16552, -16561, -16564, -16561, -16552, -16561, -16572, -16567, -16561, -16541, -16546, -16561, -16569, -16623, -16538, -16568, -16573, -16572, -16635, -16569, -16546, -16635, -16550, -16570, -16545, -16563, -16573, -16572, -16635, -16565, -16550, -16573, -16635, -16537, -16514, -16518, -16570, -16545, -16563, -16573, -16572, -16535, -16571, -16572, -16546, -16561, -16558, -16546, -16623, -16538, -16568, -16573, -16572, -16635, -16569, -16546, -16635, -16550, -16570, -16545, -16563, -16573, -16572, -16635, -16565, -16550, -16573, -16635, -16518, -16570, -16545, -16563, -16573, -16572, -16535, -16571, -16572, -16546, -16561, -16558, -16546, -16623};

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249 A[PHI: r3 r4 r5 r6 r18
      0x0249: PHI (r3v3 short) = (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:64:0x0247, B:60:0x0224, B:56:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:64:0x0247, B:60:0x0224, B:56:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:64:0x0247, B:60:0x0224, B:56:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r6v2 short) = (r6v1 short), (r6v1 short), (r6v3 short) binds: [B:64:0x0247, B:60:0x0224, B:56:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r18v10 int) = (r18v8 int), (r18v9 int), (r18v11 int) binds: [B:64:0x0247, B:60:0x0224, B:56:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0280 A[PHI: r2 r8 r18
      0x0280: PHI (r2v4 char) = (r2v3 char), (r2v1 char), (r2v1 char) binds: [B:68:0x027e, B:45:0x017f, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r8v3 short[]) = (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:68:0x027e, B:45:0x017f, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r18v24 int) = (r18v7 int), (r18v16 int), (r18v25 int) binds: [B:68:0x027e, B:45:0x017f, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b5 A[PHI: r10 r11 r12 r13 r14 r18 r19
      0x02b5: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r12v3 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v2 short[]), (r12v1 short[]) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r18v26 int) = (r18v6 int), (r18v19 int), (r18v20 int), (r18v31 int) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r19v3 short[]) = (r19v2 short[]), (r19v1 short[]), (r19v1 short[]), (r19v1 short[]) binds: [B:72:0x02b3, B:33:0x00f9, B:27:0x00d0, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02e7 A[PHI: r9 r18
      0x02e7: PHI (r9v4 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:76:0x02e5, B:41:0x015a, B:17:0x0072, B:7:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r18v29 int) = (r18v5 int), (r18v17 int), (r18v22 int), (r18v30 int) binds: [B:76:0x02e5, B:41:0x015a, B:17:0x0072, B:7:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.C16309
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo16351(String str) {
        int iM11306;
        int i;
        int i2;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        short[] sArr3 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 65251443;
        int i10 = C2642.f10294;
        int i11 = C7105.f23796;
        int iM11307 = ThreadFactoryC3888.m11306("ۨ᩹") ^ i11;
        int i12 = ((iM11307 ^ i10) * (-29549)) ^ (-1273555104);
        int i13 = iM11307 ^ (-550221168);
        short[] sArr4 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * (-21033)) >> 31));
            switch (i14) {
                case -2130387297:
                case 371913014:
                    i4 = 48938;
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("ۡᩴ")) * (-43);
                    i = ((iM11306 ^ i10) * 25253) ^ 1310892004;
                    i2 = 1905318246;
                    int i15 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -2086129435:
                case 742915249:
                    C19806.m45024();
                    if (RunnableC3388.f12514 >= 0) {
                        i14 = i14;
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") + i11) * 89;
                        i = ((iM11306 ^ i10) * (-20875)) ^ 634331078;
                        i2 = 1512632539;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i10;
                        i14 = i14;
                        i = ((iM11306 ^ i11) * 12453) ^ 1751004213;
                        i2 = -1263773763;
                    }
                    int i16 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1996175571:
                case -279911937:
                    i14 = i14;
                    sArr3 = f20496;
                    i7 = 119;
                    i8 = 35;
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ۡ۠") ^ i11;
                        i = ((iM11306 ^ i10) * 29463) ^ (-1681678414);
                        i2 = -433883775;
                    } else {
                        iM11306 = C19806.m45029("ۤᩴ") ^ i10;
                        i = ((iM11306 ^ i11) * (-8937)) ^ 907791875;
                        i2 = -1573248612;
                    }
                    int i17 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i17;
                    break;
                case -1861073852:
                case -1447129691:
                    return str;
                case -1784414541:
                case 119104950:
                    C0629.m2907();
                    C1419.m4973();
                    return null;
                case -1674968689:
                case 1545004262:
                    i14 = i14;
                    s3 = 43436;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩻") + i10) * 7;
                        i = ((iM11306 ^ i11) * (-16611)) ^ (-1517285102);
                        i2 = -1445891465;
                    } else {
                        iM11306 = C19806.m45029("ܶۙ") ^ i11;
                        i = ((iM11306 ^ i10) * 23547) ^ (-1748799071);
                        i2 = -2094305244;
                    }
                    int i18 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1636972582:
                case -200658336:
                    i14 = i14;
                    sArr4 = f20496;
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۡ۠") ^ i11;
                        i = ((iM11306 ^ i10) * 29463) ^ (-1681678414);
                        i2 = -433883775;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ܿ") ^ i10) * (-15);
                        i = ((iM11306 ^ i11) * (-17549)) ^ 954842822;
                        i2 = -844418732;
                    }
                    int i19 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1447532757:
                case -904579872:
                    return C2642.m8172(sArr2, i6, 62, i4);
                case -1422629918:
                case -24798489:
                    i14 = i14;
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") + i11) * 89;
                    i = ((iM11306 ^ i10) * (-20875)) ^ 634331078;
                    i2 = 1512632539;
                    int i110 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i110;
                    break;
                case -1400411489:
                case 1386148873:
                    return C3286.m9788(f20496, EnumC2300.f8185, 33, i4);
                case -1245364282:
                case -1113478218:
                    i14 = i14;
                    if (C1460.m5058(str, C2871.m8640(sArr3, i7, i8, i4))) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ۫") ^ i11) * (-81);
                        i = ((iM11306 ^ i10) * (-25877)) ^ (-674925816);
                        i2 = -1531958423;
                    } else {
                        iM11306 = C19806.m45029("ܺ۟") ^ i10;
                        i = ((iM11306 ^ i11) * 30197) ^ (-1917174959);
                        i2 = -1239084678;
                    }
                    int i111 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -1039409853:
                case 667962652:
                    i14 = i14;
                    i5 = 1;
                    if (C1377.m4833() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") + i11) * 89;
                        i = ((iM11306 ^ i10) * (-20875)) ^ 634331078;
                        i2 = 1512632539;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ܰ֨")) * 11;
                        i = ((iM11306 ^ i11) * (-26885)) ^ 1557776517;
                        i2 = 2077819429;
                    }
                    int i112 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i112;
                    break;
                case -391844489:
                case 1601946869:
                    i4 = 56516;
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("ۡᩴ")) * (-43);
                    i = ((iM11306 ^ i10) * 25253) ^ 1310892004;
                    i2 = 1905318246;
                    int i113 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -339799175:
                case 891766361:
                    i14 = i14;
                    c = 0;
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܳ") ^ i11;
                        i = ((iM11306 ^ i10) * (-24601)) ^ (-1053142874);
                        i2 = -1300653815;
                    } else {
                        iM11306 = (i11 - C19806.m45029("ܳ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i10) * 17109) ^ (-108077928);
                        i2 = -697319777;
                    }
                    int i114 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -110347229:
                case 2015197902:
                    i14 = i14;
                    s = sArr4[c];
                    s2 = 10859;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩻") + i10) * 7;
                        i = ((iM11306 ^ i11) * (-16611)) ^ (-1517285102);
                        i2 = -1445891465;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩺") + i10) * 41;
                        i = ((iM11306 ^ i11) * 5729) ^ (-216916014);
                        i2 = 1122791777;
                    }
                    int i115 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -46092978:
                case 617793363:
                    i14 = i14;
                    sArr2 = f20496;
                    i6 = 57;
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ۡ۠") ^ i11;
                        i = ((iM11306 ^ i10) * 29463) ^ (-1681678414);
                        i2 = -433883775;
                    } else {
                        iM11306 = (i10 - C19806.m45029("᩵֫")) * 23;
                        i = ((iM11306 ^ i11) * 11375) ^ 1093067190;
                        i2 = 2132127703;
                    }
                    int i116 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case 357625646:
                case 1373794434:
                    i14 = i14;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") + i11) * 89;
                        i = ((iM11306 ^ i10) * (-20875)) ^ 634331078;
                        i2 = 1512632539;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۖ") ^ i11;
                        i = ((iM11306 ^ i10) * (-4087)) ^ (-321479103);
                        i2 = 1047444665;
                    }
                    int i117 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case 545090931:
                case 870817621:
                    i14 = i14;
                    if (C1460.m5058(str, AbstractC0464.m2308(sArr, i5, 56, i4))) {
                        iM11306 = (i11 - C19806.m45029("۬ܰ")) * 5;
                        i = ((iM11306 ^ i10) * 29587) ^ (-1380440118);
                        i2 = 246544473;
                    } else {
                        iM11306 = (i11 - C19806.m45029("ۤ֫")) * 81;
                        i = ((iM11306 ^ i10) * (-14309)) ^ (-1589070220);
                        i2 = -2139269819;
                    }
                    int i118 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case 1011987072:
                case 1893543242:
                    i14 = i14;
                    RunnableC3388.m10051(str);
                    sArr = f20496;
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i11 - C19806.m45029("ܳ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i10) * 17109) ^ (-108077928);
                        i2 = -697319777;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۙ᩻")) * (-13);
                        i = ((iM11306 ^ i11) * (-18327)) ^ (-106225472);
                        i2 = -1490208853;
                    }
                    int i119 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case 1229964136:
                case 1626065531:
                    i14 = i14;
                    if (i3 - (s * s3) >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۚ") ^ i10) * 21;
                        i = ((iM11306 ^ i11) * 25309) ^ (-1452792378);
                        i2 = -2115056734;
                    } else {
                        iM11306 = C19806.m45029("᩸ᩴ") ^ i11;
                        i = ((iM11306 ^ i10) * (-29315)) ^ (-1415640505);
                        i2 = 583268004;
                    }
                    int i1110 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1110;
                    break;
                case 1390501865:
                case 1936422012:
                    i14 = i14;
                    int i20 = s + s2;
                    i3 = i20 * i20;
                    if (C0629.m2907()) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ᩴܺ")) * (-29);
                        i = ((iM11306 ^ i11) * 15675) ^ (-1239781400);
                        i2 = 936786618;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩻") + i10) * 7;
                        i = ((iM11306 ^ i11) * (-16611)) ^ (-1517285102);
                        i2 = -1445891465;
                    }
                    int i1111 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                case 1941748898:
                case 1954942094:
                    C0671.m3008();
                    if (C1148.f5161 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i10;
                        i14 = i14;
                        i = ((iM11306 ^ i11) * 12453) ^ 1751004213;
                        i2 = -1263773763;
                    } else {
                        i14 = i14;
                        iM11306 = (i11 - C19806.m45029("ܳ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM11306 ^ i10) * 17109) ^ (-108077928);
                        i2 = -697319777;
                    }
                    int i1112 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
                default:
                    if (C2704.f10408) {
                        i14 = i14;
                        iM11306 = C19806.m45029("ۡ۠") ^ i11;
                        i = ((iM11306 ^ i10) * 29463) ^ (-1681678414);
                        i2 = -433883775;
                        int i1113 = i14;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                        i9 = i1113;
                    }
                    i14 = i14;
                    iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") + i11) * 89;
                    i = ((iM11306 ^ i10) * (-20875)) ^ 634331078;
                    i2 = 1512632539;
                    int i1114 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1114;
                    break;
            }
        }
    }
}
