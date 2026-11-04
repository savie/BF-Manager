package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.Serializable;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes4.dex */
public class C11044 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۠ܺ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f34861 = {3060, -30100, -31941, -22088, -30655, 20711, -30539, 7165, -6069, -6076, -6079, -6072, -6068, -6049, -6070, -6056, -6080, -6072, -6077, -6055, -6074, -6072, -6072, -6051, -6036, -6051, -6074, -6018, -6076, -6070, -6033, -6079, -6078, -6066, -6074, -6030, -6049, -6141, -6055, -6080, -6051, 9481, 32621, 32610, 32615, 32622, -5609, 5569, -7029, 7304, -1701, -5787};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f34862;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C2513 f34863;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f34864;

    /* JADX WARN: Code duplicated, block: B:25:0x009b A[PHI: r3 r14 r15
      0x009b: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:24:0x0099, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r14v3 short[]) = (r14v2 short[]), (r14v1 short[]) binds: [B:24:0x0099, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r15v3 int) = (r15v2 int), (r15v1 int) binds: [B:24:0x0099, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x011b A[PHI: r11 r12 r13
      0x011b: PHI (r11v3 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:36:0x0119, B:12:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:36:0x0119, B:12:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r13v3 int) = (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:36:0x0119, B:12:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01aa A[PHI: r8 r9
      0x01aa: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:47:0x01a8, B:14:0x005c, B:12:0x0058, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r9v3 short) = (r9v2 short), (r9v1 short), (r9v1 short), (r9v1 short) binds: [B:47:0x01a8, B:14:0x005c, B:12:0x0058, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0200 A[PHI: r5 r6 r7
      0x0200: PHI (r5v4 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:55:0x01fe, B:51:0x01e1, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:55:0x01fe, B:51:0x01e1, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r7v4 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:55:0x01fe, B:51:0x01e1, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x024c A[PHI: r2 r16 r21 r22
      0x024c: PHI (r2v3 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v4 java.lang.String)
     binds: [B:63:0x024a, B:59:0x022e, B:32:0x00f7, B:28:0x00d3, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x024a, B:59:0x022e, B:32:0x00f7, B:28:0x00d3, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r21v3 int) = (r21v1 int), (r21v1 int), (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:63:0x024a, B:59:0x022e, B:32:0x00f7, B:28:0x00d3, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r22v5 char) = (r22v3 char), (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:63:0x024a, B:59:0x022e, B:32:0x00f7, B:28:0x00d3, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        int iM3169;
        int i;
        int i2;
        String strM11809 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 1447907719;
        int i11 = C3448.f11240;
        int i12 = C1542.f5343;
        int iM31610 = C0773.m3169("᩷ܽ") ^ i11;
        int i13 = ((iM31610 ^ i12) * (-17545)) ^ (-378675270);
        int i14 = iM31610 ^ 273260659;
        short[] sArr3 = null;
        int i15 = 0;
        int iM31611 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-14825)) >> 31));
            switch (i10) {
                case -1974074803:
                case -111804157:
                    int i16 = i3 + i4;
                    i5 = i16 + i16;
                    s2 = 6451;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("᩻᩹") ^ i12) * 43;
                        i = ((iM3169 ^ i11) * 18441) ^ (-922497811);
                        i2 = -472319191;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۢ") + i12) * (-67);
                        i = ((iM3169 ^ i11) * (-2941)) ^ (-766706855);
                        i2 = -1626252450;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1953457734:
                case 27728527:
                    i6 = 56744;
                    iM3169 = (C0773.m3169("ۚ᩺") ^ i11) * (-29);
                    i = ((iM3169 ^ i12) * (-6619)) ^ 766448258;
                    i2 = -746050799;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1852747151:
                case -408122738:
                    s = sArr3[c];
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("۫ۘ") ^ i12;
                        i = ((iM3169 ^ i11) * (-6263)) ^ 1878962398;
                        i2 = 1419362905;
                    } else {
                        iM3169 = C0619.m2761("ۤ۟") ^ i12;
                        i = ((iM3169 ^ i11) * (-8007)) ^ (-698844146);
                        i2 = 406572421;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1641037645:
                case 1900932295:
                    c = 0;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i11 - C0773.m3169("᩺ۚ")) * q.h;
                        i = ((iM3169 ^ i12) * (-13675)) ^ 1697918816;
                        i2 = -1983770871;
                    } else {
                        iM3169 = C0619.m2761("ܶۚ") ^ i12;
                        i = ((iM3169 ^ i11) * (-2559)) ^ 2099680785;
                        i2 = -655330247;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1385548992:
                case -177143367:
                    sArr2 = f34861;
                    i9 = 4;
                    i15 = 3;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩹ۜ") ^ i12;
                        i = ((iM3169 ^ i11) * 30777) ^ 264614680;
                        i2 = 1452537666;
                    } else {
                        iM3169 = C0773.m3169("֫֨") ^ i12;
                        i = ((iM3169 ^ i11) * 29287) ^ 1595108714;
                        i2 = 2033728437;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1336483057:
                case -1189222558:
                    C4282.m13644();
                    break;
                case -628289560:
                case 1877729928:
                    iM31611 = C0773.m3169(C1343.m4939(sArr, i7, i8, i6));
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i11 - C0773.m3169("᩺ۚ")) * q.h;
                        i = ((iM3169 ^ i12) * (-13675)) ^ 1697918816;
                        i2 = -1983770871;
                    } else {
                        iM3169 = (i12 - C0773.m3169("ܰ֫")) * 19;
                        i = ((iM3169 ^ i11) * (-32211)) ^ 1098437389;
                        i2 = 1567025668;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -475074329:
                case 500822125:
                    if (C0487.f2131 > 0) {
                        iM3169 = C0773.m3169("᩹᩶") ^ i11;
                        i = ((iM3169 ^ i12) * 5127) ^ 2138744581;
                        i2 = -2096804239;
                    } else {
                        iM3169 = C0773.m3169("᩹ۜ") ^ i12;
                        i = ((iM3169 ^ i11) * 30777) ^ 264614680;
                        i2 = 1452537666;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -449018891:
                case 1364906450:
                    i3 = s * s;
                    i4 = 41615401;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("۫ۘ") ^ i12;
                        i = ((iM3169 ^ i11) * (-6263)) ^ 1878962398;
                        i2 = 1419362905;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i11;
                        i = ((iM3169 ^ i12) * 24579) ^ 1767159190;
                        i2 = 287265639;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -134011021:
                case 1367458237:
                    sArr3 = f34861;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i11 - C0773.m3169("᩺ۚ")) * q.h;
                        i = ((iM3169 ^ i12) * (-13675)) ^ 1697918816;
                        i2 = -1983770871;
                    } else {
                        iM3169 = (i11 - C0773.m3169("᩸ᩴ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i12) * (-1793)) ^ (-1896488170);
                        i2 = -1239425535;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 229461477:
                case 1434668250:
                    int i17 = s + s2;
                    if (i5 - (i17 * i17) >= 0) {
                        iM3169 = C0773.m3169("ۛᩴ") ^ i11;
                        i = ((iM3169 ^ i12) * 25767) ^ 1889269296;
                        i2 = 1675217893;
                    } else {
                        iM3169 = C0773.m3169("ۗۖ") ^ i12;
                        i = ((iM3169 ^ i11) * 31437) ^ 1182656358;
                        i2 = 1191838132;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 241900359:
                case 617039920:
                    i6 = 20728;
                    iM3169 = (C0773.m3169("ۚ᩺") ^ i11) * (-29);
                    i = ((iM3169 ^ i12) * (-6619)) ^ 766448258;
                    i2 = -746050799;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 328293016:
                case 1870892101:
                    m43859(C0773.m3169(strM11809) ^ 2118250738);
                    break;
                case 502849336:
                case 888425369:
                    C1519.m5403();
                    iM3169 = (C0619.m2761("᩻᩹") ^ i12) * 43;
                    i = ((iM3169 ^ i11) * 18441) ^ (-922497811);
                    i2 = -472319191;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 535891181:
                case 1004254964:
                    C2375.m8065();
                    if (AbstractC0116.m1243() == 0) {
                        iM3169 = (C0619.m2761("᩻᩹") ^ i12) * 43;
                        i = ((iM3169 ^ i11) * 18441) ^ (-922497811);
                        i2 = -472319191;
                    } else {
                        iM3169 = C0773.m3169("᩹᩶") ^ i11;
                        i = ((iM3169 ^ i12) * 5127) ^ 2138744581;
                        i2 = -2096804239;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 794207271:
                case 1279024203:
                    RunnableC1848.m6364(this, iM31611 ^ 2118603972);
                    if (C2023.m6964() <= 0) {
                        iM3169 = (i11 - C0773.m3169("᩺ۚ")) * q.h;
                        i = ((iM3169 ^ i12) * (-13675)) ^ 1697918816;
                        i2 = -1983770871;
                    } else {
                        iM3169 = C0773.m3169("ۘܺ") ^ i11;
                        i = ((iM3169 ^ i12) * 25401) ^ (-1025038255);
                        i2 = 490235517;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 811159236:
                case 1845547055:
                    strM11809 = RunnableC3646.m11809(sArr2, i9, i15, i6);
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (i11 - C0773.m3169("᩺ۚ")) * q.h;
                        i = ((iM3169 ^ i12) * (-13675)) ^ 1697918816;
                        i2 = -1983770871;
                    } else {
                        iM3169 = C0619.m2761("۬ᩴ") ^ i11;
                        i = ((iM3169 ^ i12) * (-30833)) ^ (-1495904445);
                        i2 = -2016755221;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1635464567:
                case 2084144387:
                    sArr = f34861;
                    i7 = 1;
                    i8 = 3;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩹᩶") ^ i11;
                        i = ((iM3169 ^ i12) * 5127) ^ 2138744581;
                        i2 = -2096804239;
                    } else {
                        iM3169 = (i11 - C0619.m2761("᩶ܺ")) * (-99);
                        i = ((iM3169 ^ i12) * (-8261)) ^ 1683939282;
                        i2 = 1129835858;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                default:
                    C3033.m9845();
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("᩻᩹") ^ i12) * 43;
                        i = ((iM3169 ^ i11) * 18441) ^ (-922497811);
                        i2 = -472319191;
                    } else {
                        iM3169 = C0619.m2761("۫ۘ") ^ i12;
                        i = ((iM3169 ^ i11) * (-6263)) ^ 1878962398;
                        i2 = 1419362905;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22045 = null;
        int i = 103803103;
        int i2 = C0269.f1558;
        int i3 = C0487.f2131;
        int iM3169 = (C0773.m3169("֡ܿ") + i3) * 25;
        int i4 = ((iM3169 ^ i2) * 25613) ^ 54881086;
        int i5 = -1937544690;
        while (true) {
            i = ((((i ^ i2) * 3753) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1953079857:
                case 1020631668:
                    if (C3690.m11994(c12187)) {
                        iM3169 = (C0619.m2761("᩶ۘ") + i3) * 25;
                        i4 = ((iM3169 ^ i2) * 6571) ^ 1583338893;
                        i5 = 1362321479;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19023)) ^ 1335792209;
                        i5 = 2140014355;
                    }
                    break;
                case -1854090696:
                case -1486977759:
                    C2878.m9491();
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * 31;
                        i4 = ((iM3169 ^ i2) * 25207) ^ (-1645392643);
                        i5 = 725186019;
                    } else {
                        iM3169 = (C0619.m2761("۠ܳ") ^ i2) * (-33);
                        i4 = ((iM3169 ^ i3) * (-31417)) ^ (-1972309473);
                        i5 = -868743276;
                    }
                    break;
                case -1819587967:
                case 1833654665:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i2 - C0773.m3169("᩻ۜ")) * (-87);
                        i4 = ((iM3169 ^ i3) * 21351) ^ (-148631357);
                        i5 = 1464146223;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۨۘ")) * (-111);
                        i4 = ((iM3169 ^ i2) * 2185) ^ (-923036334);
                        i5 = -1184707999;
                    }
                    break;
                case -1728612435:
                case 1844977686:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ۛܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32519)) ^ 357121566;
                        i5 = 911965238;
                    } else {
                        iM3169 = C0773.m3169("ܽ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11023) ^ 646717334;
                        i5 = -1662518061;
                    }
                    break;
                case -1595516098:
                case -673151275:
                    C1519.m5412();
                    break;
                case -1566944414:
                case -921176931:
                    if (C0619.f2439) {
                        iM3169 = (i2 - C0773.m3169("᩻ۜ")) * (-87);
                        i4 = ((iM3169 ^ i3) * 21351) ^ (-148631357);
                        i5 = 1464146223;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺᩳ")) * (-55);
                        i4 = ((iM3169 ^ i2) * (-30031)) ^ (-1336955171);
                        i5 = -1190529271;
                    }
                    break;
                case -1528141970:
                case 916865842:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("۠ܳ") ^ i2) * (-33);
                        i4 = ((iM3169 ^ i3) * (-31417)) ^ (-1972309473);
                        i5 = -868743276;
                    } else {
                        iM3169 = (C0619.m2761("֫ܺ") + i2) * 33;
                        i4 = ((iM3169 ^ i3) * (-16985)) ^ (-423723743);
                        i5 = 1976111320;
                    }
                    break;
                case -1458477833:
                case -39480685:
                    C2375.m8065();
                    iM3169 = (C0619.m2761("۠ܳ") ^ i2) * (-33);
                    i4 = ((iM3169 ^ i3) * (-31417)) ^ (-1972309473);
                    i5 = -868743276;
                    break;
                case -1406901045:
                case 1406782340:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (C0619.m2761("۠ܳ") ^ i2) * (-33);
                        i4 = ((iM3169 ^ i3) * (-31417)) ^ (-1972309473);
                        i5 = -868743276;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩺") + i2) * 119;
                        i4 = ((iM3169 ^ i3) * 29685) ^ 184041871;
                        i5 = -1307747361;
                    }
                    break;
                case -1353970911:
                case -174570038:
                    C3734.m12147(abstractC22045);
                    iM3169 = (C0619.m2761("᩶ۘ") + i3) * 25;
                    i4 = ((iM3169 ^ i2) * 6571) ^ 1583338893;
                    i5 = 1362321479;
                    break;
                case -1210455693:
                case -962405656:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۛܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32519)) ^ 357121566;
                        i5 = 911965238;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܶܽ")) * 127;
                        i4 = ((iM3169 ^ i3) * (-5917)) ^ 2007307503;
                        i5 = -1165685195;
                    }
                    break;
                case -857455482:
                case 569368161:
                    C2287.m7745();
                    if (!C2966.m9664()) {
                        iM3169 = (i2 - C0773.m3169("᩻ۜ")) * (-87);
                        i4 = ((iM3169 ^ i3) * 21351) ^ (-148631357);
                        i5 = 1464146223;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * 31;
                        i4 = ((iM3169 ^ i2) * 25207) ^ (-1645392643);
                        i5 = 725186019;
                    }
                    break;
                case -668934540:
                case 1864577737:
                    if (C0773.m3161() != 0) {
                        iM3169 = (i2 - C0773.m3169("᩻ۜ")) * (-87);
                        i4 = ((iM3169 ^ i3) * 21351) ^ (-148631357);
                        i5 = 1464146223;
                    } else {
                        iM3169 = C0619.m2761("ۖܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16929)) ^ 1847880681;
                        i5 = 1151883137;
                    }
                    break;
                case 237406343:
                case 458479597:
                    abstractC22044 = this.f34862;
                    if (abstractC22044 != null) {
                        iM3169 = C0619.m2761("ۛ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11299) ^ 2117723110;
                        i5 = 1638808045;
                    } else {
                        iM3169 = (C0773.m3169("᩷᩸") + i2) * (-5);
                        i4 = ((iM3169 ^ i3) * 15911) ^ (-436898749);
                        i5 = -1285020098;
                    }
                    break;
                case 421347217:
                case 661658696:
                    if (C11235.f35427 < 0) {
                        iM3169 = (i2 - C0773.m3169("᩻ۜ")) * (-87);
                        i4 = ((iM3169 ^ i3) * 21351) ^ (-148631357);
                        i5 = 1464146223;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩹") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * 5029) ^ (-1476163694);
                        i5 = -855202552;
                    }
                    break;
                case 456837963:
                case 1339457246:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i2 - C0773.m3169("᩻ۜ")) * (-87);
                        i4 = ((iM3169 ^ i3) * 21351) ^ (-148631357);
                        i5 = 1464146223;
                    } else {
                        iM3169 = C0773.m3169("ۘ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3529) ^ 279372239;
                        i5 = 1108155038;
                    }
                    break;
                case 734606752:
                case 1525521547:
                    C1080.m4050();
                    break;
                case 746657974:
                case 1994368211:
                    C17202.m40378(abstractC22044);
                    iM3169 = (C0773.m3169("᩷᩸") + i2) * (-5);
                    i4 = ((iM3169 ^ i3) * 15911) ^ (-436898749);
                    i5 = -1285020098;
                    break;
                case 1114625018:
                case 1355523541:
                    abstractC22045 = this.f34864;
                    if (abstractC22045 != null) {
                        iM3169 = (C0773.m3169("᩻ۛ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-8805)) ^ (-1204158570);
                        i5 = 1532869113;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۘ") + i3) * 25;
                        i4 = ((iM3169 ^ i2) * 6571) ^ 1583338893;
                        i5 = 1362321479;
                    }
                    break;
                case 1212782805:
                case 1278911072:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * 31;
                        i4 = ((iM3169 ^ i2) * 25207) ^ (-1645392643);
                        i5 = 725186019;
                    } else {
                        iM3169 = (C0773.m3169("ۛ֨") ^ i2) * (-35);
                        i4 = ((iM3169 ^ i3) * 25991) ^ 1693044333;
                        i5 = -740581595;
                    }
                    break;
                default:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۤ۬")) * 31;
                        i4 = ((iM3169 ^ i2) * 25207) ^ (-1645392643);
                        i5 = 725186019;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1383) ^ 833749471;
                        i5 = -1281855756;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46057;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x016d A[PHI: r1 r8 r10
      0x016d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:41:0x016b, B:21:0x00aa, B:11:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:41:0x016b, B:21:0x00aa, B:11:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:41:0x016b, B:21:0x00aa, B:11:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0200 A[PHI: r2 r3 r4 r7 r12 r13 r15
      0x0200: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r3v5 java.lang.String[]) = 
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v3 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
     binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r4v6 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r7v5 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v3 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r13v5 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v6 short[]) binds: [B:52:0x01fe, B:33:0x011c, B:25:0x00d6, B:8:0x006f, B:87:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0252 A[PHI: r9
      0x0252: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:60:0x0250, B:17:0x0098, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0286 A[PHI: r5 r6 r16 r17 r18 r23
      0x0286: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:64:0x0284, B:56:0x0234, B:29:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:64:0x0284, B:56:0x0234, B:29:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0284, B:56:0x0234, B:29:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0284, B:56:0x0234, B:29:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:64:0x0284, B:56:0x0234, B:29:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int) binds: [B:64:0x0284, B:56:0x0234, B:29:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        int iM2761;
        int i;
        int i2;
        int i3 = C2966.f9654;
        int i4 = C3033.f9831;
        int iM3169 = (C0773.m3169("ᩴۢ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i5 = ((iM3169 ^ i4) * 23959) ^ (-1561278073);
        String strM10092 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-621199649);
        int iM2762 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = -1016779492;
        int i13 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i14 = 0;
        String strM43840 = null;
        String strM2756 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 13923) >> 31));
            switch (i12) {
                case -1967110823:
                case -769273280:
                    C4238.m13540();
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-3613)) ^ 396219372;
                        i2 = -1312988035;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰ᩶")) * (-97);
                        i = ((iM2761 ^ i4) * (-14485)) ^ 456928983;
                        i2 = -377275207;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1630029798:
                case -704161522:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-3613)) ^ 396219372;
                        i2 = -1312988035;
                    } else {
                        iM2761 = (C0619.m2761("᩺ܽ") ^ i3) * (-115);
                        i = ((iM2761 ^ i4) * 29961) ^ (-205202510);
                        i2 = 1117503636;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1524449528:
                case 1124090952:
                    strM10092 = C3099.m10092(sArr3, 46, 3, i14);
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡ᩷")) * 75;
                        i = ((iM2761 ^ i4) * (-5321)) ^ 112431530;
                        i2 = -634558577;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۫᩷")) * (-3);
                        i = ((iM2761 ^ i4) * (-3395)) ^ 1841122142;
                        i2 = -30401699;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1496765519:
                case 103171311:
                    strArr = new String[]{strM43840, AbstractC0116.m1244(iM2762 ^ i7)};
                    sArr2 = f34861;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (i3 - C0773.m3169("ۡ᩷")) * 75;
                        i = ((iM2761 ^ i4) * (-5321)) ^ 112431530;
                        i2 = -634558577;
                    } else {
                        iM2761 = C0773.m3169("ܶ֨") ^ i4;
                        i = ((iM2761 ^ i3) * 9139) ^ (-1627534339);
                        i2 = -869714519;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1365780485:
                case 1328965934:
                    int i15 = s + s2;
                    if (i10 - (i15 * i15) < 0) {
                        iM2761 = (i3 - C0619.m2761("ܰۜ")) * 73;
                        i = ((iM2761 ^ i4) * 2839) ^ (-287828308);
                        i2 = -911553857;
                    } else {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20799)) ^ 1826185738;
                        i2 = -1955614053;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1269747422:
                case 674812802:
                    strM43840 = m43840(strM2756);
                    sArr3 = f34861;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡ᩷")) * 75;
                        i = ((iM2761 ^ i4) * (-5321)) ^ 112431530;
                        i2 = -634558577;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM2763 = (C0619.m2761("ܶ᩻") + i4) * (-71);
                        i5 = ((iM2763 ^ i3) * (-11821)) ^ 1142464540;
                        i6 = iM2763 ^ 984383551;
                    }
                    break;
                case -1258461806:
                case 1689299521:
                    i14 = 32523;
                    iM2761 = (i3 - C0773.m3169("۟۬")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM2761 ^ i4) * (-7797)) ^ 2034284318;
                    i2 = 1322161465;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -941467961:
                case 838911746:
                    s = sArr[c];
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("᩺ܽ") ^ i3) * (-115);
                        i = ((iM2761 ^ i4) * 29961) ^ (-205202510);
                        i2 = 1117503636;
                    } else {
                        iM2761 = C0619.m2761("᩸ܺ") ^ i3;
                        i = ((iM2761 ^ i4) * (-25299)) ^ (-1801754202);
                        i2 = 1168682211;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -904112467:
                case 2042527779:
                    strM2756 = C0619.m2756(f34861, 42, 4, i14);
                    if (C2375.f7641 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ܰ᩶")) * (-97);
                        i = ((iM2761 ^ i4) * (-14485)) ^ 456928983;
                        i2 = -377275207;
                    } else {
                        iM2761 = (C0773.m3169("۟۫") + i4) * 61;
                        i = ((iM2761 ^ i3) * 29181) ^ (-1044259543);
                        i2 = -1812342884;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -710174326:
                case 1487646792:
                    C4282.m13644();
                    if (C2375.f7641 > 0) {
                        iM2761 = C0619.m2761("᩹ۡ") ^ i4;
                        i = ((iM2761 ^ i3) * (-3613)) ^ 396219372;
                        i2 = -1312988035;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡ᩷")) * 75;
                        i = ((iM2761 ^ i4) * (-5321)) ^ 112431530;
                        i2 = -634558577;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -694969818:
                case -176351435:
                    iM2762 = C0619.m2761(strM10092);
                    i7 = 2100249207;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ܿ֡") ^ i4) * (-31);
                        i = ((iM2761 ^ i3) * 31429) ^ 1584089557;
                        i2 = 569348450;
                    } else {
                        iM2761 = C0773.m3169("۠۫") ^ i3;
                        i = ((iM2761 ^ i4) * (-24507)) ^ 408326964;
                        i2 = 1003893369;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -659270942:
                case -637342389:
                    i11 = s * s;
                    i13 = 10404;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("ܿ֡") ^ i4) * (-31);
                        i = ((iM2761 ^ i3) * 31429) ^ 1584089557;
                        i2 = 569348450;
                    } else {
                        iM2761 = C0773.m3169("ܳ۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-5423)) ^ 1849065777;
                        i2 = -2102945651;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -328959409:
                case 1836801343:
                    int i16 = i11 + i13;
                    i10 = i16 + i16;
                    s2 = 102;
                    if (C2702.m8876()) {
                        iM2761 = C0773.m3169("֫ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * 7021) ^ (-1760174266);
                        i2 = -769058181;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۡ᩷")) * 75;
                        i = ((iM2761 ^ i4) * (-5321)) ^ 112431530;
                        i2 = -634558577;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 73870384:
                case 967735247:
                    i14 = 30394;
                    iM2761 = (i3 - C0773.m3169("۟۬")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM2761 ^ i4) * (-7797)) ^ 2034284318;
                    i2 = 1322161465;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 347709774:
                case 1973230852:
                    sArr = f34861;
                    c = ')';
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ܿ֡") ^ i4) * (-31);
                        i = ((iM2761 ^ i3) * 31429) ^ 1584089557;
                        i2 = 569348450;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۜۘ")) * (-83);
                        i = ((iM2761 ^ i3) * (-21607)) ^ (-1501670520);
                        i2 = 166157844;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 603321137:
                case 1524167021:
                    i8 = 49;
                    i9 = 3;
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("᩸ۢ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i3) * (-27685)) ^ 498458142;
                        i2 = 1913299237;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰ᩶")) * (-97);
                        i = ((iM2761 ^ i4) * (-14485)) ^ 456928983;
                        i2 = -377275207;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 694160980:
                case 1045176156:
                    C0619.m2763();
                    return null;
                case 1039867952:
                case 1583512671:
                    C2702.m8876();
                    C3448.m11248();
                    iM2761 = (C0619.m2761("᩺ܽ") ^ i3) * (-115);
                    i = ((iM2761 ^ i4) * 29961) ^ (-205202510);
                    i2 = 1117503636;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    return C17202.m40366(C0773.m3169(C17202.m40377(sArr2, i8, i9, i14)) ^ 2123653911, strArr);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        int i = 115314716;
        int i2 = C1542.f5343;
        int i3 = C0269.f1558;
        int iM3169 = C0773.m3169("۫ܰ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 19135) ^ 586156816;
        int i5 = 2018614802;
        while (true) {
            i = ((((i ^ i3) * 31919) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2122885251:
                case -742198043:
                    C2834.m9344();
                    break;
                case -1903374656:
                case -1627841175:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۤ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24239) ^ 1056696110;
                        i5 = 1959387843;
                    } else {
                        iM3169 = C0773.m3169("ۙۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21235) ^ (-304622702);
                        i5 = -393866464;
                    }
                    break;
                case -1899742910:
                case -432700198:
                    if (C3779.m12264()) {
                        iM3169 = (C0773.m3169("ܳ֡") + i3) * 3;
                        i4 = ((iM3169 ^ i2) * (-16051)) ^ 1852452441;
                        i5 = -1297224695;
                    } else {
                        iM3169 = C0773.m3169("ۤ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24239) ^ 1056696110;
                        i5 = 1959387843;
                    }
                    break;
                case -1540383944:
                case 1065065166:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ܿۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12871)) ^ (-554806918);
                        i5 = 1923282820;
                    } else {
                        iM3169 = C0773.m3169("᩻۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1199) ^ 1681108384;
                        i5 = 1806083048;
                    }
                    break;
                case -1251435442:
                case -943697900:
                    if (C3690.m11994(c12187)) {
                        iM3169 = C0619.m2761("ۧܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6045) ^ 622179859;
                        i5 = 1050380270;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩵᩷")) * 47;
                        i4 = ((iM3169 ^ i2) * 829) ^ (-900365838);
                        i5 = 1291675216;
                    }
                    break;
                case -1242858128:
                case 1128271444:
                    C0619.m2762(c8614, C3998.m12926(this.f34864));
                    c8614.m23216();
                    iM3169 = (i3 - C0619.m2761("᩵᩷")) * 47;
                    i4 = ((iM3169 ^ i2) * 829) ^ (-900365838);
                    i5 = 1291675216;
                    break;
                case -1220527623:
                case 1978413717:
                    if (C1146.m4231()) {
                        iM3169 = (C0619.m2761("۠ۗ") ^ i2) * 85;
                        i4 = ((iM3169 ^ i3) * (-28683)) ^ 1526896737;
                        i5 = -1010359586;
                    } else {
                        iM3169 = C0619.m2761("᩵ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12655) ^ 1719134012;
                        i5 = 1817508164;
                    }
                    break;
                case -1210413471:
                case 825263003:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("ܿۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12871)) ^ (-554806918);
                        i5 = 1923282820;
                    } else {
                        iM3169 = (C0773.m3169("ܿ᩸") + i2) * (-29);
                        i4 = ((iM3169 ^ i3) * (-2491)) ^ (-930911688);
                        i5 = -2047669549;
                    }
                    break;
                case -509142109:
                case 1049051506:
                    break;
                case -216091468:
                case 1059116969:
                    if (!C3492.m11488()) {
                        iM3169 = (C0619.m2761("ۡۙ") ^ i2) * 87;
                        i4 = ((iM3169 ^ i3) * 22965) ^ 1711229207;
                        i5 = 1903674065;
                    } else {
                        iM3169 = C0773.m3169("ܿۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12871)) ^ (-554806918);
                        i5 = 1923282820;
                    }
                    break;
                case 45114017:
                case 1002688723:
                    C0773.m3161();
                    C1826.m6301();
                    iM3169 = (C0619.m2761("ۡۙ") ^ i2) * 87;
                    i4 = ((iM3169 ^ i3) * 22965) ^ 1711229207;
                    i5 = 1903674065;
                    break;
                case 59100585:
                case 624296558:
                    C3779.m12264();
                    if (C2485.f7950 == 0) {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5155) ^ (-1048146859);
                        i5 = -598151040;
                    } else {
                        iM3169 = C0773.m3169("ܿۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12871)) ^ (-554806918);
                        i5 = 1923282820;
                    }
                    break;
                case 585432266:
                case 1762529642:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("᩵ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12655) ^ 1719134012;
                        i5 = 1817508164;
                    } else {
                        iM3169 = (C0619.m2761("ۤۤ") ^ i3) * 87;
                        i4 = ((iM3169 ^ i2) * (-21073)) ^ 2116250150;
                        i5 = 743618293;
                    }
                    break;
                case 706987004:
                case 737716276:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ܿۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12871)) ^ (-554806918);
                        i5 = 1923282820;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫ۘ")) * 19;
                        i4 = ((iM3169 ^ i2) * (-23589)) ^ 596320126;
                        i5 = -350114628;
                    }
                    break;
                case 852070009:
                case 1536140891:
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("᩵ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12655) ^ 1719134012;
                        i5 = 1817508164;
                    } else {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5155) ^ (-1048146859);
                        i5 = -598151040;
                    }
                    break;
                case 1018422524:
                case 1024550545:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ܿۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12871)) ^ (-554806918);
                        i5 = 1923282820;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۡ") + i2) * (-119);
                        i4 = ((iM3169 ^ i3) * (-2451)) ^ (-506286115);
                        i5 = 70949116;
                    }
                    break;
                case 1093924400:
                case 2072989711:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5155) ^ (-1048146859);
                        i5 = -598151040;
                    } else {
                        iM3169 = (C0773.m3169("᩷֡") + i3) * 49;
                        i4 = ((iM3169 ^ i2) * (-28313)) ^ (-1955635713);
                        i5 = 2026703692;
                    }
                    break;
                case 1642015734:
                case 2012912372:
                    if (m43863(c8614)) {
                        iM3169 = C0619.m2761("ۛܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21291) ^ 249696160;
                        i5 = -1699922224;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩵᩷")) * 47;
                        i4 = ((iM3169 ^ i2) * 829) ^ (-900365838);
                        i5 = 1291675216;
                    }
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5155) ^ (-1048146859);
                        i5 = -598151040;
                    } else {
                        iM3169 = C0619.m2761("᩹ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28081)) ^ (-656618870);
                        i5 = 854436779;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        Serializable serializableM43853;
        short[] sArr;
        int i;
        String str;
        int i2;
        int iM2761;
        int i3;
        short s;
        String str2;
        short[] sArr2;
        int i4;
        int iM3169;
        int i5;
        short[] sArr3;
        int i6;
        String strM4861;
        int iM31610;
        int i7;
        int i8;
        int i9;
        Serializable serializable;
        int iM2762;
        C11044 c11044 = this;
        int i10 = C4238.f15451;
        int i11 = C2288.f7433;
        int iM2763 = (i10 - C0619.m2761("ۧۗ")) * 127;
        int i12 = ((iM2763 ^ i11) * 347) ^ (-168210251);
        C9651 c9651M43843 = null;
        AbstractC22044 abstractC22044M49862 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i13 = iM2763 ^ 248140787;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        String str3 = null;
        int i17 = -1152292904;
        int i18 = 0;
        Serializable serializable2 = null;
        String strM2361 = null;
        AbstractC22044 abstractC22044M43860 = null;
        C22233 c22233 = null;
        int i19 = 0;
        boolean zM3170 = false;
        while (true) {
            i17 = i13 ^ (i12 & (((i17 ^ i11) * (-29593)) >> 31));
            switch (i17) {
                case -2040231200:
                case 1113765029:
                    zM3170 = C0773.m3170(c11044, C3998.m12925(sArr6, i15, i19, i16));
                    if (C0773.f2792 > 0) {
                        iM2761 = (C0773.m3169("᩻ܳ") ^ i10) * 99;
                        i2 = ((iM2761 ^ i11) * 13233) ^ 1748571387;
                        i3 = -1519943465;
                        i13 = iM2761 ^ i3;
                        i12 = i2;
                    } else {
                        sArr2 = sArr5;
                        String str4 = str3;
                        i4 = i19;
                        s = s2;
                        str2 = str4;
                        iM3169 = (i10 - C0773.m3169("ᩴܿ")) * (-91);
                        i12 = ((iM3169 ^ i11) * (-31263)) ^ 1211246597;
                        i5 = 1428557220;
                        i13 = iM3169 ^ i5;
                        c11044 = this;
                        sArr5 = sArr2;
                        String str5 = str2;
                        s2 = s;
                        i19 = i4;
                        str3 = str5;
                    }
                    break;
                case -2029718849:
                case -1222221780:
                    sArr3 = sArr5;
                    i6 = i19;
                    strM4861 = C1321.m4861(f34861, 8, 4, i16);
                    if (C0862.f3233 != 0) {
                        iM31610 = (C0773.m3169("ۖ᩺") + i11) * 57;
                        i7 = ((iM31610 ^ i10) * (-8991)) ^ (-172487143);
                        i8 = 1213929320;
                    } else {
                        iM31610 = C0773.m3169("۫ۜ") ^ i11;
                        i7 = ((iM31610 ^ i10) * (-29535)) ^ (-1753297601);
                        i8 = 1452671056;
                    }
                    i13 = iM31610 ^ i8;
                    i12 = i7;
                    sArr5 = sArr3;
                    i19 = i6;
                    str3 = strM4861;
                    c11044 = this;
                    break;
                case -1994339320:
                case 2114839489:
                    AbstractC22044 abstractC22044M49838 = abstractC22044M43860.m49838(strM2361);
                    c11044.f34864 = abstractC22044M49838;
                    C22979.m51863(abstractC22044M43860, abstractC22044M49838, zM3170, c11044.f34863, c22233);
                    iM2761 = (i11 - C0619.m2761("ܶܽ")) * 21;
                    i2 = ((iM2761 ^ i10) * (-23713)) ^ 1378144286;
                    i3 = -1264566247;
                    i13 = iM2761 ^ i3;
                    i12 = i2;
                    break;
                case -1876684904:
                case -1052878752:
                    strM2361 = C0487.m2361(sArr7, 35, 2, i16);
                    if (c9651M43843 != null) {
                        iM2761 = C0773.m3169("ۖ᩹") ^ i10;
                        i2 = ((iM2761 ^ i11) * 11921) ^ 902030993;
                        i3 = 1405415833;
                    } else {
                        iM2761 = C0619.m2761("۫᩸") ^ i11;
                        i2 = ((iM2761 ^ i10) * 31935) ^ (-1040118802);
                        i3 = -344843336;
                    }
                    i13 = iM2761 ^ i3;
                    i12 = i2;
                    break;
                case -1736598305:
                case 1375442874:
                    c9651M43843 = m43843();
                    sArr6 = f34861;
                    i15 = 20;
                    i19 = 15;
                    if (C2485.f7950 == 0) {
                        iM2761 = (i10 - C0773.m3169("֫ۚ")) * 67;
                        i2 = ((iM2761 ^ i11) * 8665) ^ 1909532254;
                        i3 = 1470214318;
                        i13 = iM2761 ^ i3;
                        i12 = i2;
                    } else {
                        s = s2;
                        str2 = str3;
                        sArr2 = sArr5;
                        i4 = 15;
                        iM3169 = (i10 - C0773.m3169("ᩴܿ")) * (-91);
                        i12 = ((iM3169 ^ i11) * (-31263)) ^ 1211246597;
                        i5 = 1428557220;
                        i13 = iM3169 ^ i5;
                        c11044 = this;
                        sArr5 = sArr2;
                        String str6 = str2;
                        s2 = s;
                        i19 = i4;
                        str3 = str6;
                    }
                    break;
                case -1542845353:
                case 76838512:
                    return m43857();
                case -1447438324:
                case 2040766257:
                    C3448.m11248();
                    if (C1826.m6301() < 0) {
                        iM2761 = C0773.m3169("᩷ܿ") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-30843)) ^ 1800549225;
                        i3 = -1259971139;
                        i13 = iM2761 ^ i3;
                        i12 = i2;
                    } else {
                        strM4861 = str3;
                        sArr3 = sArr5;
                        i6 = i19;
                        iM31610 = (C0773.m3169("ۖ᩺") + i11) * 57;
                        i7 = ((iM31610 ^ i10) * (-8991)) ^ (-172487143);
                        i8 = 1213929320;
                        i13 = iM31610 ^ i8;
                        i12 = i7;
                        sArr5 = sArr3;
                        i19 = i6;
                        str3 = strM4861;
                        c11044 = this;
                    }
                    break;
                case -1431068716:
                case -1027415745:
                    sArr2 = sArr5;
                    String str7 = str3;
                    i4 = i19;
                    s = s2;
                    str2 = str7;
                    sArr4 = f34861;
                    c = 7;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i10 - C0773.m3169("ᩴܿ")) * (-91);
                        i12 = ((iM3169 ^ i11) * (-31263)) ^ 1211246597;
                        i5 = 1428557220;
                    } else {
                        iM3169 = (C0773.m3169("ۢܽ") + i10) * (-115);
                        i12 = ((iM3169 ^ i11) * 7871) ^ (-481116539);
                        i5 = -1021175036;
                    }
                    i13 = iM3169 ^ i5;
                    c11044 = this;
                    sArr5 = sArr2;
                    String str8 = str2;
                    s2 = s;
                    i19 = i4;
                    str3 = str8;
                    break;
                case -1406877551:
                case -670175656:
                    C3448.m11248();
                    C2878.m9491();
                    return null;
                case -1357123806:
                case 987592529:
                    return C1519.m5409();
                case -1264723252:
                case -146082772:
                    String str9 = str3;
                    sArr2 = sArr5;
                    i4 = i19;
                    int i20 = s2 + s3;
                    s = s2;
                    str2 = str9;
                    if ((i20 * i20) - (s * 25668) < 0) {
                        iM3169 = (i11 - C0619.m2761("ܳۘ")) * (-79);
                        i12 = ((iM3169 ^ i10) * 18443) ^ 1640539252;
                        i5 = -2017058510;
                    } else {
                        iM3169 = (C0773.m3169("۠ۗ") + i10) * 81;
                        i12 = ((iM3169 ^ i11) * 21137) ^ 691295203;
                        i5 = -2086809155;
                    }
                    i13 = iM3169 ^ i5;
                    c11044 = this;
                    sArr5 = sArr2;
                    String str10 = str2;
                    s2 = s;
                    i19 = i4;
                    str3 = str10;
                    break;
                case -1260571247:
                case 50066724:
                    c22233 = new C22233(c11044);
                    sArr7 = f34861;
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (C0619.m2761("ۛܳ") + i11) * (-35);
                        i2 = ((iM2761 ^ i10) * 27245) ^ 2123898768;
                        i3 = 511876025;
                        i13 = iM2761 ^ i3;
                        i12 = i2;
                    } else {
                        strM4861 = str3;
                        sArr3 = sArr5;
                        i6 = i19;
                        iM31610 = (C0773.m3169("ۖ᩺") + i11) * 57;
                        i7 = ((iM31610 ^ i10) * (-8991)) ^ (-172487143);
                        i8 = 1213929320;
                        i13 = iM31610 ^ i8;
                        i12 = i7;
                        sArr5 = sArr3;
                        i19 = i6;
                        str3 = strM4861;
                        c11044 = this;
                    }
                    break;
                case -1183844570:
                case -1167598431:
                    c11044.f34862 = abstractC22044M49862;
                    i14 = 0;
                    C22979.m51863(abstractC22044M43860, abstractC22044M49862, false, c11044.f34863, c22233);
                    if (C2375.m8058(this)) {
                        iM2761 = (C0773.m3169("ᩳܳ") ^ i10) * (-101);
                        i2 = ((iM2761 ^ i11) * (-8457)) ^ (-1697573103);
                        i3 = 1172468049;
                    } else {
                        iM2761 = (C0619.m2761("ۙܿ") ^ i11) * 123;
                        i2 = ((iM2761 ^ i10) * 30049) ^ 97424814;
                        i3 = 125451385;
                    }
                    i13 = iM2761 ^ i3;
                    i12 = i2;
                    break;
                case -1131482343:
                case 38951740:
                    if (C3077.m10041()) {
                        str = str3;
                        int iM31611 = (i10 - C0773.m3169("ۨ᩶")) * 67;
                        i13 = iM31611 ^ (-1397222684);
                        str3 = str;
                        i12 = ((iM31611 ^ i11) * (-25877)) ^ 1890413320;
                        c11044 = this;
                    }
                    strM4861 = str3;
                    sArr3 = sArr5;
                    i6 = i19;
                    iM31610 = (C0773.m3169("ۖ᩺") + i11) * 57;
                    i7 = ((iM31610 ^ i10) * (-8991)) ^ (-172487143);
                    i8 = 1213929320;
                    i13 = iM31610 ^ i8;
                    i12 = i7;
                    sArr5 = sArr3;
                    i19 = i6;
                    str3 = strM4861;
                    c11044 = this;
                    break;
                case -976713373:
                case -568521466:
                    sArr = sArr5;
                    i = i18;
                    serializableM43853 = c11044.m43853(C2023.m6966(sArr, i, 8, i16));
                    if (C2023.f6737) {
                        iM2762 = (i11 - C0619.m2761("ۘ᩺")) * 69;
                        serializable = serializableM43853;
                        i12 = ((iM2762 ^ i10) * 18973) ^ 1055607019;
                        i9 = 105370966;
                    } else {
                        iM2762 = (C0619.m2761("֡᩻") + i11) * (-111);
                        serializable = serializableM43853;
                        i12 = ((iM2762 ^ i10) * 21431) ^ 379781254;
                        i9 = 1494483017;
                    }
                    int i21 = iM2762 ^ i9;
                    i18 = i;
                    serializable2 = serializable;
                    i13 = i21;
                    sArr5 = sArr;
                    break;
                case -445439277:
                case 950773573:
                    abstractC22044M49862 = abstractC22044M43860.m49862(C2834.m9343(f34861, 37, 4, i16));
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("᩷ܿ") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-30843)) ^ 1800549225;
                        i3 = -1259971139;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩸") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-16467)) ^ 2137290585;
                        i3 = 214962154;
                    }
                    i13 = iM2761 ^ i3;
                    i12 = i2;
                    break;
                case 20118108:
                case 1529174962:
                    C2354.m7983();
                    if (C2287.m7745() <= 0) {
                        serializableM43853 = serializable2;
                        sArr = sArr5;
                        i = i18;
                        iM2762 = (i11 - C0619.m2761("ۘ᩺")) * 69;
                        serializable = serializableM43853;
                        i12 = ((iM2762 ^ i10) * 18973) ^ 1055607019;
                        i9 = 105370966;
                        int i22 = iM2762 ^ i9;
                        i18 = i;
                        serializable2 = serializable;
                        i13 = i22;
                        sArr5 = sArr;
                    } else {
                        iM2761 = C0773.m3169("᩷ܿ") ^ i10;
                        i2 = ((iM2761 ^ i11) * (-30843)) ^ 1800549225;
                        i3 = -1259971139;
                        i13 = iM2761 ^ i3;
                        i12 = i2;
                    }
                    break;
                case 119392782:
                case 1527071530:
                    c11044.f34863 = (C2513) serializable2;
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۜۤ") ^ i11;
                        i2 = ((iM2761 ^ i10) * 8797) ^ 314375145;
                        i3 = -97558518;
                        i13 = iM2761 ^ i3;
                        i12 = i2;
                    } else {
                        sArr2 = sArr5;
                        String str11 = str3;
                        i4 = i19;
                        s = s2;
                        str2 = str11;
                        iM3169 = (i10 - C0773.m3169("ᩴܿ")) * (-91);
                        i12 = ((iM3169 ^ i11) * (-31263)) ^ 1211246597;
                        i5 = 1428557220;
                        i13 = iM3169 ^ i5;
                        c11044 = this;
                        sArr5 = sArr2;
                        String str12 = str2;
                        s2 = s;
                        i19 = i4;
                        str3 = str12;
                    }
                    break;
                case 289704034:
                case 678328304:
                    String str13 = str3;
                    sArr3 = sArr5;
                    i6 = i19;
                    short s4 = sArr4[c];
                    s3 = 6417;
                    if (C1343.f4799 != 0) {
                        s2 = s4;
                        strM4861 = str13;
                        iM31610 = (C0773.m3169("ۖ᩺") + i11) * 57;
                        i7 = ((iM31610 ^ i10) * (-8991)) ^ (-172487143);
                        i8 = 1213929320;
                        i13 = iM31610 ^ i8;
                        i12 = i7;
                        sArr5 = sArr3;
                        i19 = i6;
                        str3 = strM4861;
                    } else {
                        int iM2764 = C0619.m2761("ۜᩴ") ^ i11;
                        i13 = iM2764 ^ (-1793573783);
                        i12 = ((iM2764 ^ i10) * (-30037)) ^ 1974208964;
                        sArr5 = sArr3;
                        i19 = i6;
                        str3 = str13;
                        s2 = s4;
                    }
                    c11044 = this;
                    break;
                case 791344362:
                case 1771346629:
                    i16 = 32576;
                    int iM2765 = (i10 - C0619.m2761("ܶ۫")) * (-7);
                    int i23 = ((iM2765 ^ i11) * (-4879)) ^ 291709994;
                    i13 = iM2765 ^ (-2046340181);
                    c11044 = this;
                    sArr5 = sArr5;
                    str3 = str3;
                    i12 = i23;
                    i19 = i19;
                    break;
                case 883136825:
                case 2098077301:
                    C0619.m2763();
                    strM4861 = str3;
                    sArr3 = sArr5;
                    i6 = i19;
                    iM31610 = (C0773.m3169("ۖ᩺") + i11) * 57;
                    i7 = ((iM31610 ^ i10) * (-8991)) ^ (-172487143);
                    i8 = 1213929320;
                    i13 = iM31610 ^ i8;
                    i12 = i7;
                    sArr5 = sArr3;
                    i19 = i6;
                    str3 = strM4861;
                    c11044 = this;
                    break;
                case 885324380:
                case 1711230246:
                    str = str3;
                    abstractC22044M43860 = c11044.m43860(str);
                    sArr5 = f34861;
                    i18 = 12;
                    if (C3448.f11240 < 0) {
                        int iM31612 = C0773.m3169("ۨ᩸") ^ i10;
                        i2 = ((iM31612 ^ i11) * 31943) ^ (-950697127);
                        i13 = iM31612 ^ 1937720538;
                        c11044 = this;
                        str3 = str;
                        i12 = i2;
                    } else {
                        int iM31613 = (i10 - C0773.m3169("ۨ᩶")) * 67;
                        i13 = iM31613 ^ (-1397222684);
                        str3 = str;
                        i12 = ((iM31613 ^ i11) * (-25877)) ^ 1890413320;
                        c11044 = this;
                    }
                    break;
                case 1154684339:
                case 1403134621:
                    i16 = 59437;
                    int iM2766 = (i10 - C0619.m2761("ܶ۫")) * (-7);
                    int i24 = ((iM2766 ^ i11) * (-4879)) ^ 291709994;
                    i13 = iM2766 ^ (-2046340181);
                    c11044 = this;
                    sArr5 = sArr5;
                    str3 = str3;
                    i12 = i24;
                    i19 = i19;
                    break;
                default:
                    c11044.mo16839(i14);
                    AbstractC22044 abstractC22044M49839 = abstractC22044M43860.m49838(strM2361);
                    c11044.f34864 = abstractC22044M49839;
                    C0938.m3750(c11044.f34862, abstractC22044M49839, c9651M43843, c11044);
                    iM2761 = (i11 - C0619.m2761("ܶܽ")) * 21;
                    i2 = ((iM2761 ^ i10) * (-23713)) ^ 1378144286;
                    i3 = -1264566247;
                    i13 = iM2761 ^ i3;
                    i12 = i2;
                    break;
            }
        }
    }
}
