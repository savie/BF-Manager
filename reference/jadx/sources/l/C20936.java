package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.internal.a;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩷ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71UU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20936 implements InterfaceC20302 {

    /* JADX INFO: renamed from: ۖۢ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f68243 = {2679, 6165, 973, -6932, 5347, 9878, 16143, -11510, 7645, 23501, -17590, -23776, 8698, -21499, 17975, 23521, 1532, -328, -13784, 9633};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15998 f68244;

    /* JADX WARN: Code duplicated, block: B:50:0x01e9 A[PHI: r3 r8 r12 r16 r17
      0x01e9: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:49:0x01e7, B:30:0x0106, B:26:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:49:0x01e7, B:30:0x0106, B:26:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:49:0x01e7, B:30:0x0106, B:26:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r16v15 int) = (r16v6 int), (r16v14 int), (r16v16 int) binds: [B:49:0x01e7, B:30:0x0106, B:26:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r17v15 java.lang.String[]) = (r17v6 java.lang.String[]), (r17v14 java.lang.String[]), (r17v16 java.lang.String[]) binds: [B:49:0x01e7, B:30:0x0106, B:26:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0245 A[PHI: r5 r6 r7 r16 r17
      0x0245: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:57:0x0243, B:53:0x0222, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:57:0x0243, B:53:0x0222, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:57:0x0243, B:53:0x0222, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r16v19 int) = (r16v4 int), (r16v5 int), (r16v20 int) binds: [B:57:0x0243, B:53:0x0222, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r17v19 java.lang.String[]) = (r17v4 java.lang.String[]), (r17v5 java.lang.String[]), (r17v20 java.lang.String[]) binds: [B:57:0x0243, B:53:0x0222, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x027d A[PHI: r4 r9 r16 r17
      0x027d: PHI (r4v4 short[]) = (r4v3 short[]), (r4v2 short[]) binds: [B:61:0x027b, B:45:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r9v3 short) = (r9v2 short), (r9v4 short) binds: [B:61:0x027b, B:45:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r16v7 int) = (r16v3 int), (r16v8 int) binds: [B:61:0x027b, B:45:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r17v7 java.lang.String[]) = (r17v3 java.lang.String[]), (r17v8 java.lang.String[]) binds: [B:61:0x027b, B:45:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x027f A[PHI: r1 r2 r4 r9 r11 r16
      0x027f: PHI (r1v56 java.lang.String[]) = (r1v18 java.lang.String[]), (r1v31 java.lang.String[]), (r1v2 java.lang.String[]), (r1v2 java.lang.String[]) binds: [B:62:0x027d, B:34:0x012f, B:22:0x00b8, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r2v6 int) = (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:62:0x027d, B:34:0x012f, B:22:0x00b8, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r4v6 short[]) = (r4v4 short[]), (r4v2 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:62:0x027d, B:34:0x012f, B:22:0x00b8, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r9v6 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:62:0x027d, B:34:0x012f, B:22:0x00b8, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r11v5 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:62:0x027d, B:34:0x012f, B:22:0x00b8, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r16v25 int) = (r16v7 int), (r16v13 int), (r16v17 int), (r16v29 int) binds: [B:62:0x027d, B:34:0x012f, B:22:0x00b8, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02b3 A[PHI: r16 r17
      0x02b3: PHI (r16v21 int) = (r16v2 int), (r16v18 int), (r16v20 int), (r16v22 int) binds: [B:66:0x02b1, B:16:0x008c, B:6:0x004d, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r17v21 java.lang.String[]) = (r17v2 java.lang.String[]), (r17v18 java.lang.String[]), (r17v20 java.lang.String[]), (r17v22 java.lang.String[]) binds: [B:66:0x02b1, B:16:0x008c, B:6:0x004d, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ۙ */
    public final void mo45817(String str) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1875.f7103;
        int i4 = C3535.f13026;
        int iM45029 = (C19806.m45029("֫ۚ") + i3) * (-87);
        int i5 = ((iM45029 ^ i4) * (-8775)) ^ 1000229758;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-804261331);
        String[] strArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1641125895;
        String strM7082 = null;
        int iM450210 = 0;
        while (true) {
            int i12 = i6 ^ (i5 & (((i11 ^ i4) * (-16981)) >> 31));
            switch (i12) {
                case -1948038337:
                case 121705465:
                    strArr = strArr;
                    i12 = i12;
                    sArr = f68243;
                    if (C7105.f23796 >= 0) {
                        strArr = strArr;
                        iM11306 = C19806.m45029("᩹ܰ") ^ i4;
                        strArr = strArr;
                        i = ((iM11306 ^ i3) * 30141) ^ (-1175540890);
                        i2 = -1047206350;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ۫") ^ i4;
                        i = ((iM11306 ^ i3) * 13281) ^ 1169829671;
                        i2 = -873124791;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -1810499929:
                case 1725293923:
                    strArr = strArr;
                    i12 = i12;
                    c = 4;
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * 10569) ^ 1432007764;
                        i2 = 371155133;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۢ۠")) * (-117);
                        i = ((iM11306 ^ i3) * 32725) ^ (-1053667988);
                        i2 = -673796282;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -1636310534:
                case -1510834931:
                    C1419.m4973();
                    if (!C1977.m6356()) {
                        strArr = strArr;
                        i12 = i12;
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i4;
                        i = ((iM11306 ^ i3) * 12565) ^ 1965083754;
                        i2 = 1672706904;
                        i11 = i12;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        strArr = strArr;
                    } else {
                        int iM450211 = C19806.m45029("֫ᩳ") ^ i3;
                        i6 = iM450211 ^ 1833196431;
                        i5 = ((iM450211 ^ i4) * (-9041)) ^ (-406496838);
                        i11 = i12;
                    }
                    break;
                case -1605926558:
                case 557914277:
                    strArr = strArr;
                    i12 = i12;
                    strM7082 = C2332.m7082(sArr2, i10, 3, i9);
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۜܺ")) * (-115);
                        i = ((iM11306 ^ i4) * 15283) ^ 1777636133;
                        i2 = -1818843305;
                    } else {
                        iM11306 = C19806.m45029("ۖۖ") ^ i4;
                        i = ((iM11306 ^ i3) * 19451) ^ 1660535064;
                        i2 = 1443002706;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -1604963855:
                case 592106115:
                    strArr = strArr;
                    i12 = i12;
                    i10 = 5;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۜܺ")) * (-115);
                        i = ((iM11306 ^ i4) * 15283) ^ 1777636133;
                        i2 = -1818843305;
                    } else {
                        iM11306 = (C19806.m45029("ܰ᩹") ^ i3) * (-95);
                        i = ((iM11306 ^ i4) * 26737) ^ 1087151756;
                        i2 = 406737926;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -1478536621:
                case 165846925:
                    i12 = i12;
                    iM450210 = 2097706151 ^ C19806.m45029(strM7082);
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("᩹ܰ") ^ i4;
                        strArr = strArr;
                        i = ((iM11306 ^ i3) * 30141) ^ (-1175540890);
                        i2 = -1047206350;
                    } else {
                        iM11306 = (C19806.m45029("ۘۖ") ^ i3) * (-47);
                        strArr = strArr;
                        i = ((iM11306 ^ i4) * (-455)) ^ 1757730790;
                        i2 = -1887632248;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -1038370895:
                case 277551716:
                    strArr = strArr;
                    i12 = i12;
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i4;
                        i = ((iM11306 ^ i3) * 12565) ^ 1965083754;
                        i2 = 1672706904;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 365) ^ 1136175909;
                        i2 = 1624424367;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -977676699:
                case 84342892:
                    strArr = strArr;
                    i12 = i12;
                    i8 = i7 + 251064025;
                    if (C2642.m8171() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۜܺ")) * (-115);
                        i = ((iM11306 ^ i4) * 15283) ^ 1777636133;
                        i2 = -1818843305;
                    } else {
                        iM11306 = C19806.m45029("ܿ۫") ^ i3;
                        i = ((iM11306 ^ i4) * 26005) ^ 2072395203;
                        i2 = -1061118813;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -893367980:
                case 2004191205:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        i12 = i12;
                        iM11306 = C19806.m45029("᩹ܰ") ^ i4;
                        strArr = strArr;
                        i = ((iM11306 ^ i3) * 30141) ^ (-1175540890);
                        i2 = -1047206350;
                        i11 = i12;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        strArr = strArr;
                    } else {
                        int iM450212 = C19806.m45029("֫ᩳ") ^ i3;
                        i6 = iM450212 ^ 1833196431;
                        i5 = ((iM450212 ^ i4) * (-9041)) ^ (-406496838);
                        i11 = i12;
                    }
                    break;
                case -795555266:
                case 1194171468:
                    strArr = strArr;
                    i12 = i12;
                    if (i8 - (s * s2) < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-7267)) ^ (-1330144550);
                        i2 = 804194312;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ᩷")) * (-59);
                        i = ((iM11306 ^ i4) * 16009) ^ 1001600282;
                        i2 = 852979178;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -734593305:
                case -114234886:
                    i9 = 44057;
                    iM11306 = (C19806.m45029("ۚ֫") + i4) * (-89);
                    i = ((iM11306 ^ i3) * 12795) ^ 649138203;
                    i2 = 1118727320;
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -612538753:
                case -113278611:
                    strArr = strArr;
                    i12 = i12;
                    s = sArr[c];
                    i7 = s * s;
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * 10569) ^ 1432007764;
                        i2 = 371155133;
                    } else {
                        iM11306 = C19806.m45029("ܰ֨") ^ i3;
                        i = ((iM11306 ^ i4) * 22403) ^ 321110103;
                        i2 = 780673456;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -595178069:
                case 1880090950:
                    i9 = 23346;
                    iM11306 = (C19806.m45029("ۚ֫") + i4) * (-89);
                    i = ((iM11306 ^ i3) * 12795) ^ 649138203;
                    i2 = 1118727320;
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case -401529400:
                case 1264424668:
                    i12 = i12;
                    strArr = new String[]{str};
                    int i13 = C15998.f51799;
                    sArr2 = f68243;
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("᩹ܰ") ^ i4;
                        strArr = strArr;
                        i = ((iM11306 ^ i3) * 30141) ^ (-1175540890);
                        i2 = -1047206350;
                    } else {
                        iM11306 = C19806.m45029("᩷᩸") ^ i3;
                        strArr = strArr;
                        i = ((iM11306 ^ i4) * (-4049)) ^ (-1885975217);
                        i2 = -931622961;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case 77176657:
                case 1587613003:
                    C0216.m1581(this.f68244, C0278.m1786(iM450210, strArr));
                    break;
                case 737241218:
                case 1382897495:
                    strArr = strArr;
                    i12 = i12;
                    s2 = 31690;
                    if (C0216.m1591() <= 0) {
                        strArr = strArr;
                        iM11306 = C19806.m45029("᩹ܰ") ^ i4;
                        strArr = strArr;
                        i = ((iM11306 ^ i3) * 30141) ^ (-1175540890);
                        i2 = -1047206350;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֨") ^ i4) * (-53);
                        i = ((iM11306 ^ i3) * 31509) ^ (-1501672610);
                        i2 = -152790289;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case 860562596:
                case 1241481460:
                    i12 = i12;
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    strArr = strArr;
                    iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i4;
                    i = ((iM11306 ^ i3) * 12565) ^ 1965083754;
                    i2 = 1672706904;
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
                case 1012112759:
                case 1279546551:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                default:
                    i12 = i12;
                    strArr = strArr;
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ֫") ^ i4;
                        i = ((iM11306 ^ i3) * 12565) ^ 1965083754;
                        i2 = 1672706904;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * 10569) ^ 1432007764;
                        i2 = 371155133;
                    }
                    i11 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    strArr = strArr;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c A[PHI: r2 r3 r4
      0x009c: PHI (r2v4 java.lang.String) = 
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:24:0x009a, B:20:0x007b, B:12:0x005a, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:24:0x009a, B:20:0x007b, B:12:0x005a, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:24:0x009a, B:20:0x007b, B:12:0x005a, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0164 A[PHI: r10 r13
      0x0164: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:43:0x0162, B:28:0x00ca, B:14:0x005d, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:43:0x0162, B:28:0x00ca, B:14:0x005d, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d1 A[PHI: r6
      0x01d1: PHI (r6v4 char) = (r6v3 char), (r6v2 char) binds: [B:55:0x01cf, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0200 A[PHI: r7 r8 r9
      0x0200: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:59:0x01fe, B:51:0x01b3, B:47:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:59:0x01fe, B:51:0x01b3, B:47:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:59:0x01fe, B:51:0x01b3, B:47:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x022e A[PHI: r1 r12 r18
      0x022e: PHI (r1v4 l.ܺܳۨ) = (r1v2 l.ܺܳۨ), (r1v2 l.ܺܳۨ), (r1v6 l.ܺܳۨ) binds: [B:63:0x022c, B:9:0x0053, B:70:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v6 short[]) binds: [B:63:0x022c, B:9:0x0053, B:70:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r18v6 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:63:0x022c, B:9:0x0053, B:70:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ۨ */
    public final void mo45819() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3577.f13150;
        int i4 = C2871.f10837;
        int iM450210 = C19806.m45029("ۚ۬") ^ i3;
        int i5 = ((iM450210 ^ i4) * (-9293)) ^ 627933438;
        String strM9788 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ 2121868697;
        C15998 c15998 = null;
        int iM11306 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1615175447;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-5229)) >> 31));
            switch (i12) {
                case -2143366097:
                case 1095432016:
                    if ((s * s2) - i9 <= 0) {
                        iM45029 = (C19806.m45029("᩵ۨ") ^ i3) * (-61);
                        i = ((iM45029 ^ i4) * (-14851)) ^ 393493072;
                        i2 = -1660363249;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠۫") ^ i4;
                        i = ((iM45029 ^ i3) * (-13075)) ^ 122094805;
                        i2 = -946463943;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2117745201:
                case -1214491773:
                    i10 = 13588;
                    iM45029 = (i4 - C19806.m45029("ۘۢ")) * (-3);
                    i = ((iM45029 ^ i3) * (-32087)) ^ 741796475;
                    i2 = -786931279;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2078928223:
                case 908736715:
                    c15998 = this.f68244;
                    sArr2 = f68243;
                    if (C19806.m45024()) {
                        iM45029 = C19806.m45029("᩹۫") ^ i4;
                        i = ((iM45029 ^ i3) * 25509) ^ 1840592988;
                        i2 = 532037881;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("᩹ܽ") ^ i3) * 55;
                        i5 = ((iM11307 ^ i4) * 3625) ^ 31927105;
                        i6 = iM11307 ^ (-686210542);
                    }
                    break;
                case -2042716694:
                case -1496015769:
                    i9 = i8 + 111471364;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 30747) ^ (-392078062);
                        i2 = -1297088497;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i = ((iM45029 ^ i4) * (-13975)) ^ (-295313288);
                        i2 = 1634903700;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1938986080:
                case 413361942:
                    c = '\b';
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * 2167) ^ (-2117319544);
                        i2 = 1950962995;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۤ֡")) * (-23);
                        i = ((iM45029 ^ i3) * 1177) ^ 942064662;
                        i2 = -1928528560;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1926460322:
                case -998858372:
                    iM11306 = ThreadFactoryC3888.m11306(strM9788);
                    i7 = 2124673481;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۧ") ^ i4;
                        i = ((iM45029 ^ i3) * 27933) ^ 222587315;
                        i2 = -2076488748;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 23907) ^ 1613556358;
                        i2 = 1113367105;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1815749111:
                case 702316122:
                    strM9788 = C3286.m9788(sArr2, i11, 3, i10);
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۧ") ^ i4;
                        i = ((iM45029 ^ i3) * 27933) ^ 222587315;
                        i2 = -2076488748;
                    } else {
                        iM45029 = C19806.m45029("ۘۧ") ^ i3;
                        i = ((iM45029 ^ i4) * 2763) ^ 421122258;
                        i2 = 400626946;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1790614461:
                case 1658503783:
                    i11 = 9;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ۢۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 19145) ^ (-437569504);
                        i2 = -162697350;
                    } else {
                        iM45029 = C19806.m45029("۫᩶") ^ i4;
                        i = ((iM45029 ^ i3) * 28021) ^ 460979095;
                        i2 = -1691575235;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1411430859:
                case 1636760247:
                    s = sArr[c];
                    i8 = s * s;
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 30747) ^ (-392078062);
                        i2 = -1297088497;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ۬") ^ i3;
                        i = ((iM45029 ^ i4) * (-6123)) ^ (-1559119812);
                        i2 = 1008285894;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1387959833:
                case -750141926:
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * 2167) ^ (-2117319544);
                        i2 = 1950962995;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۧ") ^ i4;
                        i = ((iM45029 ^ i3) * 27933) ^ 222587315;
                        i2 = -2076488748;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1304329937:
                case 1969673662:
                    i10 = a.o;
                    iM45029 = (i4 - C19806.m45029("ۘۢ")) * (-3);
                    i = ((iM45029 ^ i3) * (-32087)) ^ 741796475;
                    i2 = -786931279;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1034386055:
                case 1153278415:
                    C10634.m26820();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    break;
                case -661570855:
                case 1380481507:
                    c15998.m41562(iM11306 ^ i7);
                    break;
                case -457917288:
                case -66842895:
                    sArr = f68243;
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("᩹۫") ^ i4;
                        i = ((iM45029 ^ i3) * 25509) ^ 1840592988;
                        i2 = 532037881;
                    } else {
                        iM45029 = C19806.m45029("ܰۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 25953) ^ (-1722310805);
                        i2 = -1609621694;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -277941979:
                case 679324865:
                    C1875.m6086();
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۧ") ^ i4;
                        i = ((iM45029 ^ i3) * 27933) ^ 222587315;
                        i2 = -2076488748;
                    } else {
                        iM45029 = C19806.m45029("᩹۫") ^ i4;
                        i = ((iM45029 ^ i3) * 25509) ^ 1840592988;
                        i2 = 532037881;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -71521695:
                case 1027066552:
                    s2 = 21116;
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ۢۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 19145) ^ (-437569504);
                        i2 = -162697350;
                    } else {
                        iM45029 = C19806.m45029("֫ܳ") ^ i4;
                        i = ((iM45029 ^ i3) * (-30899)) ^ 431627508;
                        i2 = -205892812;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -3657212:
                case 919307299:
                    RunnableC1895.m6170();
                    AbstractC0464.m2313();
                    iM45029 = C19806.m45029("ۢۛ") ^ i4;
                    i = ((iM45029 ^ i3) * 19145) ^ (-437569504);
                    i2 = -162697350;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 318761061:
                case 475067386:
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 30747) ^ (-392078062);
                        i2 = -1297088497;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10417)) ^ 323066013;
                        i2 = 379635529;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ۢۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 19145) ^ (-437569504);
                        i2 = -162697350;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۧ") ^ i4;
                        i = ((iM45029 ^ i3) * 27933) ^ 222587315;
                        i2 = -2076488748;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0213 A[PHI: r3 r4 r9 r10
      0x0213: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:60:0x0211, B:48:0x01b6, B:24:0x009d, B:89:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:60:0x0211, B:48:0x01b6, B:24:0x009d, B:89:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:60:0x0211, B:48:0x01b6, B:24:0x009d, B:89:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:60:0x0211, B:48:0x01b6, B:24:0x009d, B:89:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0246 A[PHI: r6 r7 r8 r11 r19
      0x0246: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:64:0x0244, B:56:0x01f6, B:52:0x01d6, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:64:0x0244, B:56:0x01f6, B:52:0x01d6, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:64:0x0244, B:56:0x01f6, B:52:0x01d6, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:64:0x0244, B:56:0x01f6, B:52:0x01d6, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0244, B:56:0x01f6, B:52:0x01d6, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ۖ */
    public final void mo45815() {
        int iM45029;
        int i;
        int i2;
        int i3 = C0629.f2722;
        int i4 = C1025.f4800;
        int iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 4679) ^ (-1131461438);
        String strM6918 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 936936842;
        C15998 c15998 = null;
        int iM11307 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1262570694;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-16521)) >> 31));
            switch (i13) {
                case -1854031199:
                case -1012717080:
                    if ((i9 + i10) - i8 < 0) {
                        iM45029 = C19806.m45029("ۙ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-24999)) ^ (-116679747);
                        i2 = -2146638271;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܺۘ")) * (-17);
                        i = ((iM45029 ^ i4) * 12373) ^ (-2087055169);
                        i2 = -1294936121;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1802835763:
                case 1908434660:
                    i12 = 1;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳۜ")) * (-83);
                        i = ((iM45029 ^ i3) * 15643) ^ (-748488129);
                        i2 = 2072486034;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠֫") ^ i3;
                        i = ((iM45029 ^ i4) * 19273) ^ (-1872113708);
                        i2 = 14332565;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1728244001:
                case 616009649:
                    sArr = f68243;
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i4;
                        i = ((iM45029 ^ i3) * 17005) ^ (-1042328505);
                        i2 = 1928940975;
                    } else {
                        iM45029 = C19806.m45029("۬ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * (-28097)) ^ (-1440290734);
                        i2 = -832895617;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1593422415:
                case 1879171124:
                    c15998.m41562(iM11307 ^ i7);
                    break;
                case -1572321170:
                case -1151540984:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0278.f1572 > 0) {
                        iM45029 = (i3 - C19806.m45029("֡᩹")) * 27;
                        i = ((iM45029 ^ i4) * 9455) ^ (-638615052);
                        i2 = -809381482;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11308 = (ThreadFactoryC3888.m11306("ۗ۠") + i4) * 13;
                        i5 = ((iM11308 ^ i3) * 10689) ^ 1714568801;
                        i6 = iM11308 ^ (-1043026347);
                    }
                    break;
                case -1394306162:
                case 330676378:
                    strM6918 = C2249.m6918(sArr2, i12, 3, i11);
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = C19806.m45029("ᩴ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * 30561) ^ (-1594052624);
                        i2 = 1670051795;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("ۗ۠") + i4) * 13;
                        i5 = ((iM11309 ^ i3) * 10689) ^ 1714568801;
                        i6 = iM11309 ^ (-1043026347);
                    }
                    break;
                case -1288155749:
                case 816353639:
                    iM11307 = ThreadFactoryC3888.m11306(strM6918);
                    i7 = 2126689911;
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ۢۖ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9575)) ^ 644787746;
                        i2 = 1668213956;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖ۠")) * 9;
                        i = ((iM45029 ^ i4) * 26061) ^ (-1938514538);
                        i2 = -165132759;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1161017659:
                case 1204477623:
                    c = 0;
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i4;
                        i = ((iM45029 ^ i3) * 17005) ^ (-1042328505);
                        i2 = 1928940975;
                    } else {
                        iM45029 = C19806.m45029("᩻ۚ") ^ i3;
                        i = ((iM45029 ^ i4) * 17315) ^ 1494424059;
                        i2 = -37610520;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1127733989:
                case 124952701:
                    i11 = 24678;
                    iM45029 = (i3 - C19806.m45029("᩻֨")) * (-111);
                    i = ((iM45029 ^ i4) * (-577)) ^ (-127280589);
                    i2 = -1435697532;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1015807214:
                case -405156125:
                    C0216.m1591();
                    if (C0671.f2816 == 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖ۠")) * 9;
                        i = ((iM45029 ^ i4) * 26061) ^ (-1938514538);
                        i2 = -165132759;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۗ۠") + i4) * 13;
                        i5 = ((iM113010 ^ i3) * 10689) ^ 1714568801;
                        i6 = iM113010 ^ (-1043026347);
                    }
                    break;
                case -797360809:
                case 518663390:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖ۠")) * 9;
                        i = ((iM45029 ^ i4) * 26061) ^ (-1938514538);
                        i2 = -165132759;
                    } else {
                        iM45029 = (C19806.m45029("ۡ۟") ^ i3) * 119;
                        i = ((iM45029 ^ i4) * (-23499)) ^ 635194591;
                        i2 = -1303199853;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -646922771:
                case 752750748:
                    C0817.m3399();
                    int iM113011 = (ThreadFactoryC3888.m11306("ۗ۠") + i4) * 13;
                    i5 = ((iM113011 ^ i3) * 10689) ^ 1714568801;
                    i6 = iM113011 ^ (-1043026347);
                    break;
                case -294932088:
                case 965091491:
                    c15998 = this.f68244;
                    sArr2 = f68243;
                    if (!C3743.f13569) {
                        int iM113012 = (ThreadFactoryC3888.m11306("ۗ۠") + i4) * 13;
                        i5 = ((iM113012 ^ i3) * 10689) ^ 1714568801;
                        i6 = iM113012 ^ (-1043026347);
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩻") + i4) * (-27);
                        i = ((iM45029 ^ i3) * 13751) ^ 1858874259;
                        i2 = -1931375050;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -290525037:
                case 581608180:
                    s = sArr[c];
                    s2 = 15876;
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i4;
                        i = ((iM45029 ^ i3) * 17005) ^ (-1042328505);
                        i2 = 1928940975;
                    } else {
                        iM45029 = (C19806.m45029("֫ۢ") + i4) * (-77);
                        i = ((iM45029 ^ i3) * 26529) ^ 1003164023;
                        i2 = 1030637615;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 120339069:
                case 2130358620:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖ۠")) * 9;
                        i = ((iM45029 ^ i4) * 26061) ^ (-1938514538);
                        i2 = -165132759;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧܶ") ^ i3;
                        i = ((iM45029 ^ i4) * 8007) ^ (-1478750501);
                        i2 = 451924554;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 371708400:
                case 1488986637:
                    C2642.m8171();
                    break;
                case 1247323252:
                case 1489953763:
                    C2332.m7079();
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳۜ")) * (-83);
                        i = ((iM45029 ^ i3) * 15643) ^ (-748488129);
                        i2 = 2072486034;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("ۗ۠") + i4) * 13;
                        i5 = ((iM113013 ^ i3) * 10689) ^ 1714568801;
                        i6 = iM113013 ^ (-1043026347);
                    }
                    break;
                case 1354628172:
                case 1734732304:
                    i11 = 15653;
                    iM45029 = (i3 - C19806.m45029("᩻֨")) * (-111);
                    i = ((iM45029 ^ i4) * (-577)) ^ (-127280589);
                    i2 = -1435697532;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 63011844;
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i4;
                        i = ((iM45029 ^ i3) * 17005) ^ (-1042328505);
                        i2 = 1928940975;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ᩳܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i3) * (-25573)) ^ (-445996175);
                        i2 = -1939714483;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x024d A[PHI: r7 r8 r9 r19
      0x024d: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:58:0x024b, B:54:0x022a, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:58:0x024b, B:54:0x022a, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:58:0x024b, B:54:0x022a, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r19v24 java.lang.Object[]) = (r19v6 java.lang.Object[]), (r19v7 java.lang.Object[]), (r19v29 java.lang.Object[]) binds: [B:58:0x024b, B:54:0x022a, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02bd A[PHI: r4 r5 r10 r11 r13 r14 r15 r19
      0x02bd: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r5v8 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r19v15 java.lang.Object[]) = (r19v2 java.lang.Object[]), (r19v4 java.lang.Object[]), (r19v8 java.lang.Object[]), (r19v16 java.lang.Object[]) binds: [B:7:0x005a, B:67:0x02bb, B:50:0x0206, B:32:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ܰ */
    public final void mo45821(String str) {
        int iM11306;
        int i;
        int i2;
        int i3 = C7105.f23796;
        int i4 = C1066.f4915;
        int iM45029 = C19806.m45029("ۚۙ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 13739) ^ (-101438313);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-1366135323);
        Object[] objArr = null;
        char c = 0;
        int i7 = 0;
        int iM11307 = 0;
        int i8 = 0;
        char c2 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1016430481;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 30891) >> 31));
            switch (i14) {
                case -1868100727:
                case -1392656485:
                    objArr = objArr;
                    c2 = 16;
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩺") ^ i3) * 75;
                        i = ((iM11306 ^ i4) * 27537) ^ 557420106;
                        i2 = 1844980889;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21609)) ^ (-336099435);
                        i2 = 1159386340;
                    }
                    Object[] objArr2 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr2;
                    break;
                case -1808271315:
                case 567052214:
                    C1377.m4833();
                    if (CallableC1627.m5507() == 0) {
                        iM11306 = C19806.m45029("᩻ᩳ") ^ i4;
                        objArr = objArr;
                        i = ((iM11306 ^ i3) * 28261) ^ (-1648212720);
                        i2 = 556627039;
                        Object[] objArr3 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr3;
                    } else {
                        int iM450210 = C19806.m45029("ۜۖ") ^ i3;
                        i6 = iM450210 ^ (-1104425646);
                        i5 = ((iM450210 ^ i4) * (-181)) ^ 6885288;
                    }
                    break;
                case -1226638828:
                case -124340506:
                    i7 = iM11307 ^ i8;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۖۙ")) * 13;
                        objArr = objArr;
                        i = ((iM11306 ^ i3) * 23389) ^ 818718034;
                        i2 = 2078975673;
                        Object[] objArr4 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr4;
                    } else {
                        int iM450211 = C19806.m45029("ۧ᩺") ^ i3;
                        i6 = iM450211 ^ 570118067;
                        i5 = ((iM450211 ^ i4) * 4837) ^ 1460076489;
                        i7 = i7;
                    }
                    break;
                case -1215217503:
                case 1866817945:
                    objArr = objArr;
                    sArr = f68243;
                    if (RunnableC1564.f6300) {
                        objArr = objArr;
                        iM11306 = C19806.m45029("᩻ᩳ") ^ i4;
                        objArr = objArr;
                        i = ((iM11306 ^ i3) * 28261) ^ (-1648212720);
                        i2 = 556627039;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ۘ") ^ i3) * (-119);
                        i = ((iM11306 ^ i4) * (-1955)) ^ 274973395;
                        i2 = 1203312448;
                    }
                    Object[] objArr5 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr5;
                    break;
                case -1020820239:
                case 2062919787:
                    objArr = new Object[1];
                    if (C2249.f8050 >= 0) {
                        c = 0;
                        iM11306 = C19806.m45029("᩻ᩳ") ^ i4;
                        objArr = objArr;
                        i = ((iM11306 ^ i3) * 28261) ^ (-1648212720);
                        i2 = 556627039;
                        Object[] objArr6 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr6;
                    } else {
                        int iM450212 = C19806.m45029("ۖܳ") ^ i4;
                        i6 = iM450212 ^ 565078082;
                        i5 = ((iM450212 ^ i3) * 9229) ^ 1089853448;
                        c = 0;
                    }
                    break;
                case -886136908:
                case 1656636425:
                    objArr = objArr;
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("ۚۢ") + i4) * (-43);
                        i = ((iM11306 ^ i3) * (-26105)) ^ 1171599542;
                        i2 = -1174641671;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩶") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i3) * (-3439)) ^ (-1095278918);
                        i2 = -925011476;
                    }
                    Object[] objArr7 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr7;
                    break;
                case -855402588:
                case 297123351:
                    i11 = 27225;
                    iM11306 = (i3 - C19806.m45029("۟ۤ")) * (-63);
                    i = ((iM11306 ^ i4) * 5791) ^ (-1894063546);
                    i2 = 1265667745;
                    Object[] objArr8 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr8;
                    break;
                case -748277564:
                case 1365792790:
                    C2788.m8472();
                    ThreadFactoryC3888.m11300();
                    iM11306 = C19806.m45029("᩻ᩳ") ^ i4;
                    objArr = objArr;
                    i = ((iM11306 ^ i3) * 28261) ^ (-1648212720);
                    i2 = 556627039;
                    Object[] objArr9 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr9;
                    break;
                case -537423898:
                case 1951351559:
                    C2788.m8472();
                    if (C3660.m10791() != 0) {
                        iM11306 = (i4 - C19806.m45029("ۖۙ")) * 13;
                        objArr = objArr;
                        i = ((iM11306 ^ i3) * 23389) ^ 818718034;
                        i2 = 2078975673;
                        Object[] objArr10 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr10;
                    }
                    iM11306 = C19806.m45029("᩻ᩳ") ^ i4;
                    objArr = objArr;
                    i = ((iM11306 ^ i3) * 28261) ^ (-1648212720);
                    i2 = 556627039;
                    Object[] objArr11 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr11;
                    break;
                case -347826384:
                case -10823977:
                    objArr = objArr;
                    i10 = i9 + 16491721;
                    s2 = 8122;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۚۢ") + i4) * (-43);
                        i = ((iM11306 ^ i3) * (-26105)) ^ 1171599542;
                        i2 = -1174641671;
                    } else {
                        iM11306 = C19806.m45029("ܳۧ") ^ i3;
                        i = ((iM11306 ^ i4) * 4773) ^ (-969107175);
                        i2 = -1348822227;
                    }
                    Object[] objArr12 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr12;
                    break;
                case -341841169:
                case 973732252:
                    C0278.m1784(this.f68244, C0216.m1574(i7, objArr));
                    break;
                case -261954105:
                case 838319129:
                    i11 = 43381;
                    iM11306 = (i3 - C19806.m45029("۟ۤ")) * (-63);
                    i = ((iM11306 ^ i4) * 5791) ^ (-1894063546);
                    i2 = 1265667745;
                    Object[] objArr13 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr13;
                    break;
                case 389833228:
                case 1480476606:
                    sArr2 = f68243;
                    i13 = 3;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        objArr = objArr;
                        i12 = 17;
                        iM11306 = (C19806.m45029("ۚۢ") + i4) * (-43);
                        i = ((iM11306 ^ i3) * (-26105)) ^ 1171599542;
                        i2 = -1174641671;
                        Object[] objArr14 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr14;
                    } else {
                        int iM450213 = (i4 - C19806.m45029("ۜۚ")) * 29;
                        i6 = iM450213 ^ (-2136209110);
                        i5 = ((iM450213 ^ i3) * (-11029)) ^ 834188587;
                        i12 = 17;
                    }
                    break;
                case 547735181:
                case 553553234:
                    objArr = objArr;
                    s = sArr[c2];
                    i9 = s * s;
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩺") ^ i3) * 75;
                        i = ((iM11306 ^ i4) * 27537) ^ 557420106;
                        i2 = 1844980889;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-4025)) ^ 88952693;
                        i2 = 893237351;
                    }
                    Object[] objArr15 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr15;
                    break;
                case 850904006:
                case 1711155222:
                    objArr = objArr;
                    if (i10 - (s * s2) < 0) {
                        iM11306 = (i4 - C19806.m45029("֨ܽ")) * 109;
                        i = ((iM11306 ^ i3) * (-349)) ^ (-10830419);
                        i2 = -1647545919;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۙ") ^ i4;
                        i = ((iM11306 ^ i3) * (-27019)) ^ 1812469759;
                        i2 = -1780601963;
                    }
                    Object[] objArr16 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr16;
                    break;
                case 1142069809:
                case 1634610581:
                    objArr[c] = str;
                    if (C0526.m2437() >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۖۙ")) * 13;
                        objArr = objArr;
                        i = ((iM11306 ^ i3) * 23389) ^ 818718034;
                        i2 = 2078975673;
                    } else {
                        objArr = objArr;
                        iM11306 = C19806.m45029("۠ۖ") ^ i3;
                        i = ((iM11306 ^ i4) * (-31891)) ^ 1515792473;
                        i2 = -581374763;
                    }
                    Object[] objArr17 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr17;
                    break;
                case 1150423657:
                case 1212133796:
                    C1460.m5050();
                    break;
                case 1354520215:
                case 1657658854:
                    C1377.m4833();
                    if (C0050.f912 <= 0) {
                        objArr = objArr;
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩺") ^ i3) * 75;
                        i = ((iM11306 ^ i4) * 27537) ^ 557420106;
                        i2 = 1844980889;
                        Object[] objArr18 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr18;
                    }
                    iM11306 = C19806.m45029("᩻ᩳ") ^ i4;
                    objArr = objArr;
                    i = ((iM11306 ^ i3) * 28261) ^ (-1648212720);
                    i2 = 556627039;
                    Object[] objArr19 = objArr;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    objArr = objArr19;
                    break;
                default:
                    iM11307 = ThreadFactoryC3888.m11306(C3535.m10423(sArr2, i12, i13, i11));
                    if (C1875.f7103 >= 0) {
                        objArr = objArr;
                        i8 = 2118396664;
                        iM11306 = (C19806.m45029("ۚۢ") + i4) * (-43);
                        i = ((iM11306 ^ i3) * (-26105)) ^ 1171599542;
                        i2 = -1174641671;
                        Object[] objArr110 = objArr;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        objArr = objArr110;
                    } else {
                        int iM11308 = (ThreadFactoryC3888.m11306("ۖۗ") + i3) * (-85);
                        i6 = iM11308 ^ 888251318;
                        i5 = ((iM11308 ^ i4) * 22521) ^ (-104667460);
                        i8 = 2118396664;
                    }
                    break;
            }
            return;
        }
    }

    public C20936(C15998 c15998) {
        this.f68244 = c15998;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b2 A[PHI: r3 r4
      0x00b2: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:24:0x00b0, B:15:0x007b, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x00b2: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:24:0x00b0, B:15:0x007b, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0186 A[PHI: r1 r11 r13
      0x0186: PHI (r1v4 l.ܺܳۨ) = (r1v2 l.ܺܳۨ), (r1v2 l.ܺܳۨ), (r1v6 l.ܺܳۨ) binds: [B:44:0x0184, B:9:0x006c, B:71:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r11v5 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:44:0x0184, B:9:0x006c, B:71:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v6 short[]) binds: [B:44:0x0184, B:9:0x006c, B:71:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021a A[PHI: r2 r6 r10
      0x021a: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:60:0x0218, B:48:0x01b9, B:28:0x00e8, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:60:0x0218, B:48:0x01b9, B:28:0x00e8, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:60:0x0218, B:48:0x01b9, B:28:0x00e8, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024c A[PHI: r7 r8 r9 r14 r19
      0x024c: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:64:0x024a, B:56:0x01fa, B:52:0x01dc, B:32:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:64:0x024a, B:56:0x01fa, B:52:0x01dc, B:32:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x024a, B:56:0x01fa, B:52:0x01dc, B:32:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:64:0x024a, B:56:0x01fa, B:52:0x01dc, B:32:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x024a, B:56:0x01fa, B:52:0x01dc, B:32:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ܰ */
    public final void mo45820() {
        int iM11306;
        int i;
        int i2;
        int i3 = C3577.f13150;
        int i4 = C0050.f912;
        int iM11307 = (ThreadFactoryC3888.m11306("ۜܽ") ^ i3) * (-83);
        int i5 = ((iM11307 ^ i4) * 9413) ^ 1246980942;
        String strM8172 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ 428690287;
        C15998 c15998 = null;
        int iM45029 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -516772178;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-1307)) >> 31));
            switch (i13) {
                case -2104241420:
                case -119674413:
                    if (RunnableC1895.f7152) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * (-73);
                        i = ((iM11306 ^ i3) * (-12151)) ^ 208629008;
                        i2 = 1163962684;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩷ܶ")) * 29;
                        i = ((iM11306 ^ i4) * (-7635)) ^ 1947500893;
                        i2 = -1255765386;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1937845070:
                case -813668054:
                    int i14 = i8 + i9;
                    i10 = i14 + i14;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩷ܶ")) * 29;
                        i = ((iM11306 ^ i4) * (-7635)) ^ 1947500893;
                        i2 = -1255765386;
                    } else {
                        iM11306 = (C19806.m45029("֨᩻") + i3) * (-25);
                        i = ((iM11306 ^ i4) * (-17769)) ^ (-1832162795);
                        i2 = -1770841175;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1841208438:
                case 1364907094:
                    iM45029 = C19806.m45029(strM8172);
                    i7 = 2124104230;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܳ") ^ i3;
                        i = ((iM11306 ^ i4) * (-1773)) ^ (-461283507);
                        i2 = -1109435910;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * (-73);
                        i = ((iM11306 ^ i3) * (-12151)) ^ 208629008;
                        i2 = 1163962684;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1644534232:
                case -745817486:
                    i11 = 51203;
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("۠ۜ")) * (-61);
                    i = ((iM11306 ^ i3) * (-4141)) ^ (-1820954557);
                    i2 = 2039516238;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1549978693:
                case -1093514710:
                    c15998 = this.f68244;
                    sArr2 = f68243;
                    if (C1066.m4023() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 12613) ^ 1433963557;
                        i2 = 408843533;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۙ۠") ^ i3;
                        i5 = ((iM11308 ^ i4) * 10451) ^ (-2028907348);
                        i6 = iM11308 ^ 1717161239;
                    }
                    break;
                case -1063788551:
                case -91307834:
                    c = '\f';
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩷ܶ")) * 29;
                        i = ((iM11306 ^ i4) * (-7635)) ^ 1947500893;
                        i2 = -1255765386;
                    } else {
                        iM11306 = C19806.m45029("ۛۛ") ^ i4;
                        i = ((iM11306 ^ i3) * (-30797)) ^ (-2072347241);
                        i2 = -1490219291;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -863368486:
                case 1012383676:
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 12613) ^ 1433963557;
                        i2 = 408843533;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * (-31851)) ^ (-1840494834);
                        i2 = -1142814998;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -690331611:
                case 1079200614:
                    sArr = f68243;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i4) * (-9);
                        i = ((iM11306 ^ i3) * (-8175)) ^ 979730848;
                        i2 = 1860105097;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * (-21931)) ^ (-1890220390);
                        i2 = 1615035188;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -680157863:
                case 2006174691:
                    s2 = 19702;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i = ((iM11306 ^ i4) * 12613) ^ 1433963557;
                        i2 = 408843533;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܰ۫")) * (-25);
                        i = ((iM11306 ^ i3) * 29103) ^ 2114556621;
                        i2 = 943927304;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -351843226:
                case 2069786753:
                    s = sArr[c];
                    if (C1148.m4232() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i4) * (-9);
                        i = ((iM11306 ^ i3) * (-8175)) ^ 979730848;
                        i2 = 1860105097;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ᩳܿ")) * (-47);
                        i = ((iM11306 ^ i3) * 1433) ^ (-1592996594);
                        i2 = 365123439;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -137865222:
                case 630353419:
                    C19806.m45024();
                    C19806.m45024();
                    break;
                case -57387933:
                case 1140331706:
                    i12 = 13;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i4) * (-9);
                        i = ((iM11306 ^ i3) * (-8175)) ^ 979730848;
                        i2 = 1860105097;
                    } else {
                        iM11306 = (C19806.m45029("᩸᩶") + i3) * 19;
                        i = ((iM11306 ^ i4) * (-10049)) ^ 1104469931;
                        i2 = 1411212985;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 229029628:
                case 1195399239:
                    C1148.m4232();
                    C3660.m10791();
                    iM11306 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i4;
                    i = ((iM11306 ^ i3) * (-31851)) ^ (-1840494834);
                    i2 = -1142814998;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 285657864:
                case 799659794:
                    i8 = s * s;
                    i9 = 388168804;
                    if (C1148.m4232() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i4) * (-9);
                        i = ((iM11306 ^ i3) * (-8175)) ^ 979730848;
                        i2 = 1860105097;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 27065) ^ 1288507266;
                        i2 = 1431172899;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 655433975:
                case 1933987856:
                    c15998.m41562(iM45029 ^ i7);
                    break;
                case 694661050:
                case 1459234609:
                    strM8172 = C2642.m8172(sArr2, i12, 3, i11);
                    if (C0050.m946() <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩷ܶ")) * 29;
                        i = ((iM11306 ^ i4) * (-7635)) ^ 1947500893;
                        i2 = -1255765386;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * (-28733)) ^ 1688365963;
                        i2 = 493927896;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 731531103:
                case 846047325:
                    i11 = 15988;
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("۠ۜ")) * (-61);
                    i = ((iM11306 ^ i3) * (-4141)) ^ (-1820954557);
                    i2 = 2039516238;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1036273682:
                case 1437502964:
                    RunnableC1564.m5345();
                    if (C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i4;
                        i = ((iM11306 ^ i3) * (-31851)) ^ (-1840494834);
                        i2 = -1142814998;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ܺ")) * (-73);
                        i = ((iM11306 ^ i3) * (-12151)) ^ 208629008;
                        i2 = 1163962684;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i15 = s + s2;
                    if ((i15 * i15) - i10 <= 0) {
                        iM11306 = (C19806.m45029("ۢܽ") ^ i3) * (-67);
                        i = ((iM11306 ^ i4) * (-8749)) ^ (-2006062965);
                        i2 = -1348154406;
                    } else {
                        iM11306 = (C19806.m45029("ۗۨ") + i4) * 27;
                        i = ((iM11306 ^ i3) * 4395) ^ 1949064839;
                        i2 = 989395457;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ۙ */
    public final void mo45816(int i) {
        this.f68244.mo21455(i);
    }

    @Override // l.InterfaceC20302
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo45818() {
        return C3577.m10564(this.f68244);
    }
}
