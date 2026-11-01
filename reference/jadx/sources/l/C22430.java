package l;

import java.util.HashSet;
import java.util.Random;

/* JADX INFO: renamed from: l.᩹ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes.dex */
public final class C22430 implements InterfaceC2673 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f73200;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73201;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Random f73202;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f73203;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f73204;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f73205;

    @Override // l.InterfaceC2673
    /* JADX INFO: renamed from: ۙ */
    public final synchronized String mo8217() {
        int i;
        StringBuilder sb;
        if (this.f73204.size() >= this.f73200) {
            m49793(this.f73201 + 1);
        }
        int iM8641 = C2871.m8641(this.f73205);
        int[] iArr = this.f73203;
        int i2 = 0;
        while (true) {
            if (i2 >= 1000) {
                i = -1;
                break;
            }
            i = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int iNextInt = this.f73202.nextInt(iM8641);
                iArr[i3] = iNextInt;
                i = (i * iM8641) + iNextInt;
            }
            if (!C3535.m10416(this.f73204, C2788.m8476(i))) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            for (int i4 = 0; i4 < this.f73200; i4++) {
                if (!C1398.m4905(this.f73204, C2788.m8476(i4))) {
                    int i5 = i4;
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        iArr[length] = i5 % iM8641;
                        i5 /= iM8641;
                    }
                    i = i4;
                    break;
                }
            }
        }
        if (i == -1) {
            throw new RuntimeException();
        }
        C0671.m3018(this.f73204, C1148.m4234(i));
        sb = new StringBuilder();
        for (int i6 : iArr) {
            C19806.m45023(sb, C1977.m6362(this.f73205, i6));
        }
        return C0817.m3407(sb);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0147 A[PHI: r3 r4 r16
      0x0147: PHI (r3v5 int[]) = (r3v3 int[]), (r3v2 int[]), (r3v2 int[]), (r3v2 int[]) binds: [B:43:0x0145, B:39:0x0127, B:17:0x007e, B:7:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:43:0x0145, B:39:0x0127, B:17:0x007e, B:7:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r16v20 int) = (r16v6 int), (r16v7 int), (r16v13 int), (r16v21 int) binds: [B:43:0x0145, B:39:0x0127, B:17:0x007e, B:7:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0197 A[PHI: r5 r16
      0x0197: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:51:0x0195, B:35:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r16v8 int) = (r16v4 int), (r16v9 int) binds: [B:51:0x0195, B:35:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8 A[PHI: r12 r16
      0x01c8: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:55:0x01c6, B:47:0x0179, B:23:0x009c, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r16v17 int) = (r16v3 int), (r16v5 int), (r16v12 int), (r16v22 int) binds: [B:55:0x01c6, B:47:0x0179, B:23:0x009c, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f8 A[PHI: r6 r8 r10 r16
      0x01f8: PHI (r6v3 double) = (r6v1 double), (r6v2 double), (r6v1 double), (r6v1 double) binds: [B:59:0x01f6, B:31:0x00e5, B:27:0x00c2, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r8v3 double) = (r8v1 double), (r8v2 double), (r8v1 double), (r8v1 double) binds: [B:59:0x01f6, B:31:0x00e5, B:27:0x00c2, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r10v3 double) = (r10v1 double), (r10v1 double), (r10v2 double), (r10v1 double) binds: [B:59:0x01f6, B:31:0x00e5, B:27:0x00c2, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r16v15 int) = (r16v2 int), (r16v10 int), (r16v11 int), (r16v16 int) binds: [B:59:0x01f6, B:31:0x00e5, B:27:0x00c2, B:12:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49793(int i) {
        int i2;
        int iM45029;
        int i3;
        int i4;
        int i5 = C7105.f23796;
        int i6 = C1066.f4915;
        int iM450210 = C19806.m45029("֡ᩳ") ^ i6;
        int i7 = ((iM450210 ^ i5) * (-15595)) ^ (-1019680132);
        String str = null;
        double dPow = 0.0d;
        int i8 = iM450210 ^ (-216323376);
        int[] iArr = null;
        int i9 = 0;
        int i10 = 1238468040;
        double d = 0.0d;
        double d2 = 0.0d;
        int iM8641 = 0;
        while (true) {
            int i11 = i8 ^ (i7 & (((i10 ^ i5) * 30817) >> 31));
            switch (i11) {
                case -2000608508:
                case 1119532416:
                    i2 = i11;
                    d2 = iM8641;
                    d = i;
                    if (C3722.m10894() <= 0) {
                        iM45029 = C19806.m45029("ܰܳ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 161) ^ 855196417;
                        i4 = -529335975;
                    } else {
                        iM45029 = C19806.m45029("۬֫") ^ i6;
                        i3 = ((iM45029 ^ i5) * 13953) ^ (-818592081);
                        i4 = -75316760;
                    }
                    int i12 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i12;
                    break;
                case -1881797898:
                case 706103925:
                    C3722.m10894();
                    if (C1460.m5050() != 0) {
                        i2 = i11;
                        iM45029 = C19806.m45029("ܺ۟") ^ i5;
                        i3 = ((iM45029 ^ i6) * 11229) ^ 1949151619;
                        i4 = 934875638;
                    } else {
                        iM45029 = C19806.m45029("᩹ۛ") ^ i6;
                        i2 = i11;
                        i3 = ((iM45029 ^ i5) * 317) ^ 1232080509;
                        i4 = -1796814280;
                    }
                    int i13 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i13;
                    break;
                case -1767388340:
                case -1675162977:
                    i2 = i11;
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("ۨܽ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 28987) ^ 2015199672;
                        i4 = -2588381;
                    } else {
                        iM45029 = C19806.m45029("ܰܳ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 161) ^ 855196417;
                        i4 = -529335975;
                    }
                    int i14 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i14;
                    break;
                case -1640090439:
                case 520618344:
                    i2 = i11;
                    dPow = Math.pow(d2, d);
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("ܰܳ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 161) ^ 855196417;
                        i4 = -529335975;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۙ") + i6) * 15;
                        i3 = ((iM45029 ^ i5) * 28095) ^ (-241616580);
                        i4 = -1755040778;
                    }
                    int i15 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i15;
                    break;
                case -1509484501:
                case -35806660:
                    C1025.m3861();
                    C0962.m3746();
                    break;
                case -1444535399:
                case 1632817963:
                    i2 = i11;
                    i9 = (int) dPow;
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۛ") + i6) * 23;
                        i3 = ((iM45029 ^ i5) * (-7661)) ^ 2126628158;
                        i4 = 711529448;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ܳܿ")) * (-79);
                        i3 = ((iM45029 ^ i6) * (-21935)) ^ (-1316120735);
                        i4 = 1841205950;
                    }
                    int i16 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i16;
                    break;
                case -1442258495:
                case -420592787:
                    this.f73200 = i9;
                    this.f73204.clear();
                    break;
                case -245770028:
                case 2058226398:
                    i2 = i11;
                    C2788.m8472();
                    C3743.m10966();
                    iM45029 = C19806.m45029("ܺ۟") ^ i5;
                    i3 = ((iM45029 ^ i6) * 11229) ^ 1949151619;
                    i4 = 934875638;
                    int i17 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i17;
                    break;
                case -80676718:
                case 705153573:
                    i2 = i11;
                    iM8641 = C2871.m8641(str);
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܶ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 4569) ^ (-1359331266);
                        i4 = -707973276;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۧ") ^ i5;
                        i3 = ((iM45029 ^ i6) * (-31859)) ^ 905156578;
                        i4 = -1998694768;
                    }
                    int i18 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i18;
                    break;
                case -29476405:
                case 1861049951:
                    i2 = i11;
                    iArr = new int[i];
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ܺ۟") ^ i5;
                        i3 = ((iM45029 ^ i6) * 11229) ^ 1949151619;
                        i4 = 934875638;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨֡") + i6) * (-99);
                        i3 = ((iM45029 ^ i5) * 31777) ^ (-1730485690);
                        i4 = -1903525929;
                    }
                    int i19 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i19;
                    break;
                case 160500794:
                case 1923032003:
                    C1875.m6086();
                    if (C2871.f10837 < 0) {
                        i2 = i11;
                        iM45029 = C19806.m45029("ܰܳ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 161) ^ 855196417;
                        i4 = -529335975;
                        int i110 = i2;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                        i10 = i110;
                    }
                    i2 = i11;
                    iM45029 = C19806.m45029("ܺ۟") ^ i5;
                    i3 = ((iM45029 ^ i6) * 11229) ^ 1949151619;
                    i4 = 934875638;
                    int i111 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i111;
                    break;
                case 523868222:
                case 696222204:
                    i2 = i11;
                    this.f73203 = iArr;
                    str = this.f73205;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ܺ۟") ^ i5;
                        i3 = ((iM45029 ^ i6) * 11229) ^ 1949151619;
                        i4 = 934875638;
                    } else {
                        iM45029 = C19806.m45029("ۛ֨") ^ i5;
                        i3 = ((iM45029 ^ i6) * 5733) ^ 804373035;
                        i4 = 827619216;
                    }
                    int i112 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i112;
                    break;
                case 724629103:
                case 866337995:
                    i2 = i11;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܶ") ^ i6;
                        i3 = ((iM45029 ^ i5) * 4569) ^ (-1359331266);
                        i4 = -707973276;
                    } else {
                        iM45029 = C19806.m45029("ۙᩴ") ^ i5;
                        i3 = ((iM45029 ^ i6) * 24863) ^ 1562948;
                        i4 = -1124740494;
                    }
                    int i113 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i113;
                    break;
                case 745289444:
                case 1989241318:
                    i2 = i11;
                    this.f73201 = i;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۛ") + i6) * 23;
                        i3 = ((iM45029 ^ i5) * (-7661)) ^ 2126628158;
                        i4 = 711529448;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۗ") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-2599)) ^ 874317812;
                        i4 = -1686033532;
                    }
                    int i114 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i114;
                    break;
                case 901515609:
                case 1806138237:
                    i2 = i11;
                    if (C1398.m4895() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۛ") + i6) * 23;
                        i3 = ((iM45029 ^ i5) * (-7661)) ^ 2126628158;
                        i4 = 711529448;
                    } else {
                        iM45029 = C19806.m45029("ۚ۬") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-21071)) ^ 1312024967;
                        i4 = 1444919031;
                    }
                    int i115 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i115;
                    break;
                default:
                    RunnableC1895.m6170();
                    if (C1668.m5583()) {
                        i2 = i11;
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۛ") + i6) * 23;
                        i3 = ((iM45029 ^ i5) * (-7661)) ^ 2126628158;
                        i4 = 711529448;
                        int i116 = i2;
                        i8 = iM45029 ^ i4;
                        i7 = i3;
                        i10 = i116;
                    }
                    i2 = i11;
                    iM45029 = C19806.m45029("ܺ۟") ^ i5;
                    i3 = ((iM45029 ^ i6) * 11229) ^ 1949151619;
                    i4 = 934875638;
                    int i117 = i2;
                    i8 = iM45029 ^ i4;
                    i7 = i3;
                    i10 = i117;
                    break;
            }
            return;
        }
    }

    public C22430(String str) {
        Random random = null;
        HashSet hashSet = null;
        int i = 945531523;
        int i2 = C3535.f13026;
        int i3 = RunnableC1606.f6488;
        int iM45029 = C19806.m45029("ۡ᩹") ^ i2;
        int i4 = ((iM45029 ^ i3) * 1897) ^ (-1222997941);
        int i5 = 388397679;
        while (true) {
            i = ((((i ^ i3) * (-18913)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2098201625:
                case -1873590905:
                    this.f73204 = hashSet;
                    this.f73205 = str;
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("᩶᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9055) ^ 1252184745;
                        i5 = 583610317;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29109) ^ 544353908;
                        i5 = -2009515758;
                    }
                    break;
                case -1797313694:
                case 529106202:
                    C0962.m3746();
                    C1377.m4833();
                    throw new RuntimeException();
                case -1770269211:
                case 1743626670:
                    m49793(1);
                    return;
                case -1570920810:
                case -330110263:
                    hashSet = new HashSet();
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۛ") + i2) * (-91);
                        i4 = ((iM45029 ^ i3) * (-32303)) ^ 939218916;
                        i5 = -1496888342;
                    } else {
                        iM45029 = (C19806.m45029("ۛۛ") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * (-4473)) ^ (-2081334563);
                        i5 = 1517867684;
                    }
                    break;
                case -1538721826:
                case -1072307449:
                    RunnableC3388.m10064();
                    iM45029 = (C19806.m45029("ۖ᩶") ^ i2) * 53;
                    i4 = ((iM45029 ^ i3) * (-21055)) ^ (-1699862101);
                    i5 = -972943023;
                    break;
                case -1518618111:
                case -979060351:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("ۖ᩶") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-21055)) ^ (-1699862101);
                        i5 = -972943023;
                    } else {
                        iM45029 = C19806.m45029("ܶܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5057) ^ (-1955591362);
                        i5 = -336026754;
                    }
                    break;
                case -1249768773:
                case -328929538:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("ۖ᩶") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-21055)) ^ (-1699862101);
                        i5 = -972943023;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30645) ^ 406855506;
                        i5 = -1564094402;
                    }
                    break;
                case -1234373868:
                case -47883602:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31375)) ^ (-2011298404);
                        i5 = 1228994020;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺܳ")) * (-13);
                        i4 = ((iM45029 ^ i2) * (-13723)) ^ 1111415034;
                        i5 = 2003726060;
                    }
                    break;
                case -1035749437:
                case -377078296:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܰۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2595)) ^ (-215110191);
                        i5 = -648018883;
                    } else {
                        iM45029 = C19806.m45029("᩶᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9055) ^ 1252184745;
                        i5 = 583610317;
                    }
                    break;
                case -853690454:
                case 297407883:
                    if (C1937.f7317 < 0) {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2905) ^ (-516536009);
                        i5 = 801208966;
                    } else {
                        iM45029 = (C19806.m45029("ۖ᩶") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-21055)) ^ (-1699862101);
                        i5 = -972943023;
                    }
                    break;
                case -170261370:
                case 1279206939:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31375)) ^ (-2011298404);
                        i5 = 1228994020;
                    } else {
                        iM45029 = C19806.m45029("᩶᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9055) ^ 1252184745;
                        i5 = 583610317;
                    }
                    break;
                case -127792272:
                case 379843127:
                    C0817.m3399();
                    if (!RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۖ᩶") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-21055)) ^ (-1699862101);
                        i5 = -972943023;
                    } else {
                        iM45029 = C19806.m45029("᩶᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9055) ^ 1252184745;
                        i5 = 583610317;
                    }
                    break;
                case 70226785:
                case 1614517343:
                    this.f73202 = random;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ۖ᩶") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * (-21055)) ^ (-1699862101);
                        i5 = -972943023;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11071) ^ 1916610477;
                        i5 = -37838400;
                    }
                    break;
                case 71571763:
                case 917976914:
                    if (C2332.m7079() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-31375)) ^ (-2011298404);
                        i5 = 1228994020;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13639) ^ 341256266;
                        i5 = -1283191073;
                    }
                    break;
                case 946576276:
                case 1220979144:
                    random = new Random();
                    if (C1189.m4368() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۛ") + i2) * (-91);
                        i4 = ((iM45029 ^ i3) * (-32303)) ^ 939218916;
                        i5 = -1496888342;
                    } else {
                        iM45029 = C19806.m45029("֫ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24637) ^ 660069443;
                        i5 = -301277802;
                    }
                    break;
                default:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2905) ^ (-516536009);
                        i5 = 801208966;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺۧ")) * 57;
                        i4 = ((iM45029 ^ i2) * (-14839)) ^ (-1165274233);
                        i5 = -1889708357;
                    }
                    break;
            }
        }
    }
}
