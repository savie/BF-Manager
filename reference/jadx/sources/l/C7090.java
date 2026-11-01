package l;

import android.content.DialogInterface;
import android.graphics.RectF;
import bin.mt.plus.R;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۜ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7090 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨ۖ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f23766 = {8245, -14189, -14131, -14125, -14118};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11644 f23767;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f23768;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f23769;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f23770;

    public C7090(C11545 c11545, AbstractC20745 abstractC20745) {
        this.f23768 = c11545;
        this.f23769 = abstractC20745;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f23768.m28824(), R.string.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0146 A[PHI: r4 r5
      0x0146: PHI (r4v3 java.lang.StringBuilder) = (r4v2 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder) binds: [B:42:0x0144, B:19:0x0095, B:13:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String) binds: [B:42:0x0144, B:19:0x0095, B:13:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02c9 A[PHI: r15 r16
      0x02c9: PHI (r15v3 int) = (r15v2 int), (r15v1 int) binds: [B:73:0x02c7, B:13:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r16v3 short) = (r16v2 short), (r16v1 short) binds: [B:73:0x02c7, B:13:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0300 A[PHI: r6 r9 r12 r13 r17 r25
      0x0300: PHI (r6v4 java.lang.String) = 
      (r6v1 java.lang.String)
      (r6v1 java.lang.String)
      (r6v1 java.lang.String)
      (r6v3 java.lang.String)
      (r6v1 java.lang.String)
     binds: [B:77:0x02fe, B:69:0x02a8, B:38:0x011d, B:34:0x00fa, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r9v2 l.ۨۜ᩹) = (r9v1 l.ۨۜ᩹), (r9v1 l.ۨۜ᩹), (r9v1 l.ۨۜ᩹), (r9v1 l.ۨۜ᩹), (r9v3 l.ۨۜ᩹) binds: [B:77:0x02fe, B:69:0x02a8, B:38:0x011d, B:34:0x00fa, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:77:0x02fe, B:69:0x02a8, B:38:0x011d, B:34:0x00fa, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r13v3 short) = (r13v2 short), (r13v1 short), (r13v1 short), (r13v1 short), (r13v1 short) binds: [B:77:0x02fe, B:69:0x02a8, B:38:0x011d, B:34:0x00fa, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r17v3 int) = (r17v1 int), (r17v2 int), (r17v1 int), (r17v1 int), (r17v1 int) binds: [B:77:0x02fe, B:69:0x02a8, B:38:0x011d, B:34:0x00fa, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r25v5 short) = (r25v4 short), (r25v3 short), (r25v3 short), (r25v3 short), (r25v3 short) binds: [B:77:0x02fe, B:69:0x02a8, B:38:0x011d, B:34:0x00fa, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0335 A[PHI: r19
      0x0335: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:81:0x0333, B:16:0x008f, B:9:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0367 A[PHI: r7 r8 r18
      0x0367: PHI (r7v2 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v3 java.lang.String)
     binds: [B:85:0x0365, B:21:0x0099, B:19:0x0095, B:16:0x008f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v3 boolean) binds: [B:85:0x0365, B:21:0x0099, B:19:0x0095, B:16:0x008f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:85:0x0365, B:21:0x0099, B:19:0x0095, B:16:0x008f, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public void mo1159() throws Throwable {
        int iM11306;
        int i;
        int i2;
        InputStream inputStreamM1780 = null;
        Throwable th = null;
        StringBuilder sb = null;
        String strM46718 = null;
        String strM26821 = null;
        String strM6674 = null;
        boolean z = false;
        C11545 c11545 = null;
        Object obj = null;
        short s = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = -316666901;
        int i6 = ThreadFactoryC3888.f14547;
        int i7 = RunnableC0195.f1321;
        int iM11307 = (ThreadFactoryC3888.m11306("ۘܽ") + i7) * 95;
        int i8 = ((iM11307 ^ i6) * (-13109)) ^ (-555337623);
        int i9 = iM11307 ^ 821200795;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = 0;
        char c = 0;
        AbstractC20745 abstractC20745 = null;
        short s3 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i6) * 7625) >> 31));
            switch (i5) {
                case -2145495101:
                case -153934903:
                    C19806.m45024();
                    iM11306 = (ThreadFactoryC3888.m11306("᩵ۘ") + i7) * (-127);
                    i = ((iM11306 ^ i6) * (-4217)) ^ (-71514151);
                    i2 = 1019734643;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -2139005216:
                case 1677160752:
                    c11545 = this.f23768;
                    if (C3743.f13569) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ܽۤ")) * (-89);
                        i = ((iM11306 ^ i7) * 4491) ^ (-740688672);
                        i2 = -1615810383;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩹") ^ i6) * 31;
                        i = ((iM11306 ^ i7) * 30727) ^ 1308797218;
                        i2 = -1992266698;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -2026077422:
                case 1745214714:
                    this.f23770 = c11545.m28771(strM6674, z).m46693(true);
                    return;
                case -1972700960:
                case -965636987:
                    throw th;
                case -1953002459:
                case 1067148994:
                    C3577.m10565();
                    return;
                case -1926644637:
                case 710035525:
                    sb = new StringBuilder();
                    strM46718 = abstractC20745.m46718();
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * 11893) ^ (-1547013468);
                        i2 = 600362993;
                    } else {
                        iM11306 = C19806.m45029("ۤۨ") ^ i6;
                        i = ((iM11306 ^ i7) * 13901) ^ 1239502054;
                        i2 = -1377481136;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1892750021:
                case -1523742589:
                    s = sArr[c];
                    s3 = 37152;
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩹") ^ i6) * 31;
                        i = ((iM11306 ^ i7) * 30727) ^ 1308797218;
                        i2 = -1992266698;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۧ") ^ i7) * (-19);
                        i = ((iM11306 ^ i6) * (-12767)) ^ 473725825;
                        i2 = 1982723475;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1805856168:
                case -1221484486:
                    if (inputStreamM1780 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܽ") ^ i7;
                        i = ((iM11306 ^ i6) * (-21083)) ^ (-1730227090);
                        i2 = -260691872;
                    } else {
                        iM11306 = (C19806.m45029("ܿܳ") ^ i7) * (-83);
                        i = ((iM11306 ^ i6) * (-15207)) ^ (-1867870014);
                        i2 = 1804208603;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1795675727:
                case -1210680255:
                    c = 0;
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("ۨۡ") ^ i6) * 89;
                        i = ((iM11306 ^ i7) * (-31613)) ^ 888051403;
                        i2 = -237343739;
                    } else {
                        iM11306 = C19806.m45029("֡۬") ^ i7;
                        i = ((iM11306 ^ i6) * 18557) ^ 1105962996;
                        i2 = 754683395;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1711827685:
                case -1399651392:
                    C0278.m1781(inputStreamM1780);
                    iM11306 = (i6 - C19806.m45029("᩸ܺ")) * 43;
                    i = ((iM11306 ^ i7) * (-18999)) ^ 441073163;
                    i2 = 251959669;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1668891414:
                case 334830901:
                    i10 = 50088;
                    iM11306 = ThreadFactoryC3888.m11306("۠۬") ^ i7;
                    i = ((iM11306 ^ i6) * 13409) ^ 819235737;
                    i2 = -876161016;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1597717908:
                case -88865525:
                    C0278.m1789();
                    if (C3577.f13150 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * 11893) ^ (-1547013468);
                        i2 = 600362993;
                    } else {
                        iM11306 = C19806.m45029("ۢ֡") ^ i6;
                        i = ((iM11306 ^ i7) * 17071) ^ (-1766715247);
                        i2 = 856648253;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1591632556:
                case 1749009398:
                    i3 = s * s3;
                    s2 = 9288;
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۢ֡") ^ i6;
                        i = ((iM11306 ^ i7) * 17071) ^ (-1766715247);
                        i2 = 856648253;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۘ") ^ i6) * 45;
                        i = ((iM11306 ^ i7) * 23103) ^ 1219973540;
                        i2 = 1737283667;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1581398662:
                case -1262633007:
                    if (i3 - (i4 * i4) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩻") ^ i6;
                        i = ((iM11306 ^ i7) * 25469) ^ 296761288;
                        i2 = 1167484741;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܿ") ^ i6;
                        i = ((iM11306 ^ i7) * 14985) ^ (-785088560);
                        i2 = -1198365135;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1533171979:
                case -60546586:
                    if (inputStreamM1780 != null) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩵ܰ")) * (-77);
                        i = ((iM11306 ^ i6) * (-14115)) ^ (-594971417);
                        i2 = 355754152;
                    } else {
                        iM11306 = (i6 - C19806.m45029("᩸ܺ")) * 43;
                        i = ((iM11306 ^ i7) * (-18999)) ^ 441073163;
                        i2 = 251959669;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1283865941:
                case -1205108346:
                    strM26821 = C10634.m26821(sArr2, 1, 4, i10);
                    if (C0797.m3359()) {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۧᩴ")) * (-71);
                        i = ((iM11306 ^ i7) * (-21995)) ^ (-1507754399);
                        i2 = 1650258710;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩹") ^ i6) * 31;
                        i = ((iM11306 ^ i7) * 30727) ^ 1308797218;
                        i2 = -1992266698;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -713681599:
                case -75097904:
                    C2788.m8480(sb, strM46718);
                    sArr2 = f23766;
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩹") ^ i6) * 31;
                        i = ((iM11306 ^ i7) * 30727) ^ 1308797218;
                        i2 = -1992266698;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩵") + i7) * (-121);
                        i = ((iM11306 ^ i6) * (-15831)) ^ 998177752;
                        i2 = 928471663;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -657618534:
                case 1232336583:
                    i4 = s + s2;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩹") ^ i6) * 31;
                        i = ((iM11306 ^ i7) * 30727) ^ 1308797218;
                        i2 = -1992266698;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۡ") ^ i7;
                        i = ((iM11306 ^ i6) * (-30955)) ^ (-264228760);
                        i2 = 392738210;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -626693030:
                case -286192745:
                    i10 = 51389;
                    iM11306 = ThreadFactoryC3888.m11306("۠۬") ^ i7;
                    i = ((iM11306 ^ i6) * 13409) ^ 819235737;
                    i2 = -876161016;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -345842950:
                case 1403197808:
                    try {
                        C0216.m1577(inputStreamM1780);
                        iM11306 = (C19806.m45029("ܿܳ") ^ i7) * (-83);
                        i = ((iM11306 ^ i6) * (-15207)) ^ (-1867870014);
                        i2 = 1804208603;
                        i9 = iM11306 ^ i2;
                    } catch (Throwable th2) {
                        int iM11308 = (ThreadFactoryC3888.m11306("ۖ᩸") + i6) * 81;
                        i = ((iM11308 ^ i7) * 27487) ^ (-2037934628);
                        i9 = iM11308 ^ 1696100658;
                        obj = th2;
                    }
                    i8 = i;
                    break;
                case -173836657:
                case 1701591750:
                    C1461.m5080();
                    if (C2871.m8646()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۘ") + i7) * (-127);
                        i = ((iM11306 ^ i6) * (-4217)) ^ (-71514151);
                        i2 = 1019734643;
                    } else {
                        iM11306 = (C19806.m45029("ۨۡ") ^ i6) * 89;
                        i = ((iM11306 ^ i7) * (-31613)) ^ 888051403;
                        i2 = -237343739;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -111980048:
                case 1674963657:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۘ") + i7) * (-127);
                        i = ((iM11306 ^ i6) * (-4217)) ^ (-71514151);
                        i2 = 1019734643;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i7;
                        i = ((iM11306 ^ i6) * 11893) ^ (-1547013468);
                        i2 = 600362993;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -61246253:
                case 652997630:
                    sArr = f23766;
                    if (C0216.f1393 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۘ") + i7) * (-127);
                        i = ((iM11306 ^ i6) * (-4217)) ^ (-71514151);
                        i2 = 1019734643;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܿ") ^ i6) * 55;
                        i = ((iM11306 ^ i7) * (-2021)) ^ (-1110534758);
                        i2 = 948040140;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -50874321:
                case 2134233355:
                    C7105.m18985();
                    if (C1189.m4368() > 0) {
                        iM11306 = (C19806.m45029("ۨۡ") ^ i6) * 89;
                        i = ((iM11306 ^ i7) * (-31613)) ^ 888051403;
                        i2 = -237343739;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("֨۫")) * (-43);
                        i = ((iM11306 ^ i6) * 15187) ^ 2082941787;
                        i2 = -604545220;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 379960419:
                case 819095924:
                    ViewGroupOnHierarchyChangeListenerC1916.m6242(th, obj);
                    iM11306 = (C19806.m45029("ܿܳ") ^ i7) * (-83);
                    i = ((iM11306 ^ i6) * (-15207)) ^ (-1867870014);
                    i2 = 1804208603;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 1186932525:
                case 1883347827:
                    try {
                        this.f23767 = C11644.m29081(inputStreamM1780);
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ܰ֫")) * (-11);
                        i = ((iM11306 ^ i7) * 7195) ^ 1656660009;
                        i2 = -312523288;
                    } catch (Throwable th3) {
                        th = th3;
                        iM11306 = ThreadFactoryC3888.m11306("۟ܶ") ^ i6;
                        i = ((iM11306 ^ i7) * (-7121)) ^ 85615554;
                        i2 = -1036024725;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 1746129495:
                case 1962821557:
                    AbstractC20745 abstractC20746 = this.f23769;
                    inputStreamM1780 = C0278.m1780(abstractC20746);
                    int iM45029 = C19806.m45029("ۛᩴ") ^ i7;
                    i8 = ((iM45029 ^ i6) * (-14651)) ^ (-2015187016);
                    abstractC20745 = abstractC20746;
                    i9 = iM45029 ^ (-446029945);
                    break;
                default:
                    C2788.m8480(sb, strM26821);
                    strM6674 = C2124.m6674(sb);
                    z = false;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۘ") + i7) * (-127);
                        i = ((iM11306 ^ i6) * (-4217)) ^ (-71514151);
                        i2 = 1019734643;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨ۠")) * (-19);
                        i = ((iM11306 ^ i6) * (-2575)) ^ (-839955109);
                        i2 = 1471160543;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        RectF rectFM29095 = this.f23767.m29095();
        int iM29084 = (int) this.f23767.m29084();
        int iM29096 = (int) this.f23767.m29096();
        if (iM29084 == -1 && iM29096 == -1) {
            iM29084 = (int) (rectFM29095.right - rectFM29095.left);
            iM29096 = (int) (rectFM29095.bottom - rectFM29095.top);
        } else if (rectFM29095 == null) {
            this.f23767.m29089(iM29084, iM29096);
        }
        int i = iM29084;
        int i2 = iM29096;
        new C4267(this, this.f23768.m28824(), i, i2, i, i2);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f23768.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
