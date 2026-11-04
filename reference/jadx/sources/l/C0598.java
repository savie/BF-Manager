package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.֡ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0598 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۢ֫۟, reason: not valid java name and contains not printable characters */
    private static final short[] f2386 = {8346, -6568, -7049, 109, -1898, -2238, -7595, 8179, 1173, -8112, 338, -561, 15839, 522, 15813, 15826, 15812, 15832, 15810, 15813, 15828, 15826, 15812, 15769, 15830, 15813, 15812, 15828, 15838, 15828, 15832, 15833, 15769, 15815, 15833, 15824, 2633, -29038, -24941, -29479};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f2387;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20472 f2388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f2389;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f2390;

    /* JADX WARN: Code duplicated, block: B:16:0x0085  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f3 A[PHI: r2 r4 r5 r6 r9 r11 r12 r14 r15
      0x01f3: PHI (r2v4 l.۟ۢ֫) = (r2v2 l.۟ۢ֫), (r2v2 l.۟ۢ֫), (r2v3 l.۟ۢ֫), (r2v2 l.۟ۢ֫), (r2v2 l.۟ۢ֫) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r4v3 l.ۛ۫) = (r4v2 l.ۛ۫), (r4v2 l.ۛ۫), (r4v2 l.ۛ۫), (r4v2 l.ۛ۫), (r4v4 l.ۛ۫) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:57:0x01f1, B:49:0x01b5, B:38:0x013f, B:30:0x00fc, B:22:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0226 A[PHI: r3 r7 r10 r21
      0x0226: PHI (r3v5 l.᩵ۢ֫) = (r3v2 l.᩵ۢ֫), (r3v2 l.᩵ۢ֫), (r3v2 l.᩵ۢ֫), (r3v3 l.᩵ۢ֫), (r3v2 l.᩵ۢ֫) binds: [B:61:0x0224, B:53:0x01d4, B:34:0x011b, B:26:0x00d3, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:61:0x0224, B:53:0x01d4, B:34:0x011b, B:26:0x00d3, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:61:0x0224, B:53:0x01d4, B:34:0x011b, B:26:0x00d3, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r21v6 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:61:0x0224, B:53:0x01d4, B:34:0x011b, B:26:0x00d3, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025c A[PHI: r16
      0x025c: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:65:0x025a, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0950.f3488;
        int i4 = C2354.f7599;
        int iM31610 = (C0773.m3169("᩺ۗ") + i4) * (-87);
        int i5 = ((iM31610 ^ i3) * (-14223)) ^ 1544972544;
        C6389 c6389 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-928440886);
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1432036133;
        char c = 0;
        C20472 c20472 = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-21935)) >> 31));
            switch (i14) {
                case -1725057631:
                case -228560588:
                    c6389 = c20472.f65587;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0619.m2761("᩻۟") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-1015)) ^ (-1368039853);
                        i2 = -1534378786;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩵֨")) * (-27);
                        i = ((iM3169 ^ i4) * 19451) ^ 1745814939;
                        i2 = 1138576985;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1564458340:
                case -1085471696:
                    i9 = s + 1;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ۤ۟") + i4) * (-43);
                        i = ((iM3169 ^ i3) * (-1141)) ^ 736097324;
                        i2 = -1340364635;
                    } else {
                        iM3169 = C0773.m3169("ܶۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 14367) ^ (-638177977);
                        i2 = 1328367097;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1315973697:
                case 892634199:
                    iM2761 = C0619.m2761(C3033.m9847(sArr2, i13, i8, i12));
                    i7 = 2098724189;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("᩻۟") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-1015)) ^ (-1368039853);
                        i2 = -1534378786;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۤ᩷")) * 33;
                        i = ((iM3169 ^ i3) * 5825) ^ 2055757725;
                        i2 = 1814727147;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1309595185:
                case 365200224:
                    i12 = 2968;
                    iM3169 = (C0773.m3169("ܶ۠") ^ i3) * (-57);
                    i = ((iM3169 ^ i4) * 26885) ^ 1858592409;
                    i2 = 796005146;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1248975907:
                case 126328918:
                    RunnableC1848.m6360();
                    if (C0269.m1775() > 0) {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i4;
                        i = ((iM3169 ^ i3) * 3653) ^ 9299897;
                        i2 = -602598362;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۟ᩳ")) * 77;
                        i = ((iM3169 ^ i3) * (-10347)) ^ 1784284569;
                        i2 = -578392285;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1227745586:
                case -453213142:
                    c = '$';
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("ۤ۟") + i4) * (-43);
                        i = ((iM3169 ^ i3) * (-1141)) ^ 736097324;
                        i2 = -1340364635;
                    } else {
                        iM3169 = (C0619.m2761("ۙۤ") + i4) * (-51);
                        i = ((iM3169 ^ i3) * 23047) ^ (-576825803);
                        i2 = 2064621949;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1131755856:
                case 2036724720:
                    i12 = 30622;
                    iM3169 = (C0773.m3169("ܶ۠") ^ i3) * (-57);
                    i = ((iM3169 ^ i4) * 26885) ^ 1858592409;
                    i2 = 796005146;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -962826784:
                case 1298336964:
                    this.f2390 = DialogInterfaceOnClickListenerC14300.m34706(c6389.getDrawable());
                    break;
                case -927538371:
                case 602221076:
                    i8 = 3;
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ۤ۟") + i4) * (-43);
                        i = ((iM3169 ^ i3) * (-1141)) ^ 736097324;
                        i2 = -1340364635;
                    } else {
                        iM3169 = C0773.m3169("᩸᩶") ^ i4;
                        i = ((iM3169 ^ i3) * 26167) ^ 280891590;
                        i2 = 569152209;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -670681669:
                case 1698277522:
                    i10 = i9 * i9;
                    i11 = s * 2;
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("᩻۟") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-1015)) ^ (-1368039853);
                        i2 = -1534378786;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩻") ^ i4) * (-59);
                        i = ((iM3169 ^ i3) * (-15293)) ^ 1109256365;
                        i2 = 1417165409;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -650473482:
                case 652894335:
                    sArr = f2386;
                    if (RunnableC1848.m6360()) {
                        iM3169 = (i4 - C0619.m2761("۟ᩳ")) * 77;
                        i = ((iM3169 ^ i3) * (-10347)) ^ 1784284569;
                        i2 = -578392285;
                    } else {
                        iM3169 = (C0773.m3169("ۢ۫") ^ i3) * 97;
                        i = ((iM3169 ^ i4) * (-15723)) ^ 891125789;
                        i2 = -239786357;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -354086862:
                case -304103052:
                    if ((i11 + 1) - i10 > 0) {
                        iM3169 = (C0773.m3169("ۧۜ") ^ i4) * (-17);
                        i = ((iM3169 ^ i3) * 1565) ^ (-42612917);
                        i2 = -719646501;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰ᩻")) * (-81);
                        i = ((iM3169 ^ i4) * (-31907)) ^ 1618348588;
                        i2 = 1044438959;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -261570314:
                case 958391962:
                    m8191(viewOnClickListenerC7793, iM2761 ^ i7);
                    c20472 = this.f2388;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۤ۟") + i4) * (-43);
                        i = ((iM3169 ^ i3) * (-1141)) ^ 736097324;
                        i2 = -1340364635;
                    } else {
                        iM3169 = (C0619.m2761("ۨۡ") + i3) * 71;
                        i = ((iM3169 ^ i4) * (-27347)) ^ 1005102722;
                        i2 = 523476599;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 230456407:
                case 262337666:
                    if (C0269.f1558 > 0) {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i4;
                        i = ((iM3169 ^ i3) * 3653) ^ 9299897;
                        i2 = -602598362;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶܳ")) * 65;
                        i = ((iM3169 ^ i4) * 28285) ^ 603570574;
                        i2 = 138362507;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 721057291:
                case 2015761264:
                    viewOnClickListenerC7793 = this.f2389;
                    sArr2 = f2386;
                    i13 = 37;
                    if (C3779.m12264()) {
                        iM3169 = C0619.m2761("ۢܶ") ^ i3;
                        i = ((iM3169 ^ i4) * (-13531)) ^ (-1817532959);
                        i2 = -1261543252;
                    } else {
                        iM3169 = (C0619.m2761("᩻۟") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-1015)) ^ (-1368039853);
                        i2 = -1534378786;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 945528169:
                case 1776924068:
                    C3077.m10041();
                    RunnableC1848.m6360();
                    iM3169 = C0773.m3169("ܶ᩹") ^ i4;
                    i = ((iM3169 ^ i3) * 3653) ^ 9299897;
                    i2 = -602598362;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1203621826:
                case 1220207602:
                    s = sArr[c];
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("᩻۟") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-1015)) ^ (-1368039853);
                        i2 = -1534378786;
                    } else {
                        iM3169 = C0619.m2761("۫ܽ") ^ i4;
                        i = ((iM3169 ^ i3) * 9877) ^ 1997979786;
                        i2 = 849385150;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1282795445:
                case 1511710327:
                    C3998.m12920();
                    break;
                default:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("ܶ᩹") ^ i4;
                        i = ((iM3169 ^ i3) * 3653) ^ 9299897;
                        i2 = -602598362;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۟") + i4) * (-43);
                        i = ((iM3169 ^ i3) * (-1141)) ^ 736097324;
                        i2 = -1340364635;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 24621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        /*
            Method dump skipped, instruction units count: 2462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0598.mo1136():void");
    }

    public C0598(ViewOnClickListenerC7793 viewOnClickListenerC7793, C20472 c20472, AbstractC22044 abstractC22044) {
        int i = -647037859;
        int i2 = C0950.f3488;
        int i3 = C4282.f15546;
        this.f2389 = viewOnClickListenerC7793;
        this.f2388 = c20472;
        this.f2387 = abstractC22044;
        int iM3169 = C0773.m3169("֨ۤ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 11337) ^ (-693312215);
        int i5 = -940392014;
        while (true) {
            i = (iM3169 ^ i5) ^ (i4 & (((i ^ i3) * (-30577)) >> 31));
            switch (i) {
                case -1946334571:
                case -1611227580:
                    C3998.m12920();
                    iM3169 = C0619.m2761("۬֡") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-30213)) ^ (-1156811844);
                    i5 = -1309383261;
                    break;
                case -1789458813:
                case 1929698299:
                    C2310.m7813();
                    C0619.m2763();
                    throw new RuntimeException();
                case -811993034:
                case -608215604:
                    return;
                case -137458445:
                case 2146742222:
                    C13473.m33144();
                    if (C2485.f7950 == 0) {
                        iM3169 = C0773.m3169("۠ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18211) ^ (-1414712016);
                        i5 = -313595942;
                    } else {
                        iM3169 = C0619.m2761("۬֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30213)) ^ (-1156811844);
                        i5 = -1309383261;
                    }
                    break;
                case 725561574:
                case 1356456354:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ۘۨ") ^ i2) * 91;
                        i4 = ((iM3169 ^ i3) * 2053) ^ 809621777;
                        i5 = -198641965;
                    } else {
                        iM3169 = (C0773.m3169("᩺ᩴ") + i2) * (-125);
                        i4 = ((iM3169 ^ i3) * (-19445)) ^ 1048307287;
                        i5 = -173629186;
                    }
                    break;
                case 1112300499:
                case 1212973703:
                    C2419.m8174();
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("֫۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27139) ^ 613261882;
                        i5 = 1532470863;
                    } else {
                        iM3169 = C0773.m3169("۠ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18211) ^ (-1414712016);
                        i5 = -313595942;
                    }
                    break;
                default:
                    RunnableC1848.m6360();
                    if (C1542.m5459() < 0) {
                        iM3169 = C0619.m2761("۬֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30213)) ^ (-1156811844);
                        i5 = -1309383261;
                    } else {
                        iM3169 = C0773.m3169("᩸ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16099) ^ (-154532978);
                        i5 = -1151985091;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int iM2762;
        int i4;
        int i5;
        final C0598 c0598 = this;
        int i6 = C1564.f5401;
        int i7 = C1783.f6087;
        int iM2763 = C0619.m2761("᩸᩺") ^ i7;
        int i8 = ((iM2763 ^ i6) * (-17175)) ^ 709471981;
        Object[] objArr = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String strM5471 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM2763 ^ (-39005434);
        int iM31610 = 0;
        int i10 = 0;
        int iM2764 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 1491342737;
        String strM11806 = null;
        C2361 c2361 = null;
        String strM12925 = null;
        final AbstractC22044 abstractC22044 = null;
        int i14 = 0;
        String strM33142 = null;
        while (true) {
            i13 = i9 ^ (i8 & (((i13 ^ i6) * (-10929)) >> 31));
            switch (i13) {
                case -2098710582:
                case 1769464155:
                    C1343.m4943();
                    C2287.m7745();
                    break;
                case -1889110562:
                case -1560562854:
                    if (C1542.f5343 > 0) {
                        iM3169 = C0773.m3169("۠ۨ") ^ i7;
                        i = ((iM3169 ^ i6) * 10161) ^ 1503908503;
                        i2 = -207985449;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        objArr = objArr;
                        abstractC22044 = abstractC22044;
                        iM2762 = (C0619.m2761("ᩳܰ") ^ i6) * (-47);
                        i4 = ((iM2762 ^ i7) * 2687) ^ 1570294293;
                        i5 = 865392982;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    }
                    break;
                case -1544874313:
                case 1848782162:
                    abstractC22044 = c0598.f2387;
                    strM11806 = RunnableC3646.m11806(abstractC22044);
                    Object[] objArr2 = new Object[1];
                    if (C1542.f5343 <= 0) {
                        objArr = objArr2;
                        iM3169 = C0773.m3169("۠ۨ") ^ i7;
                        i = ((iM3169 ^ i6) * 10161) ^ 1503908503;
                        i2 = -207985449;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        int iM2765 = C0619.m2761("ܰᩳ") ^ i6;
                        i9 = iM2765 ^ 455247613;
                        objArr = objArr2;
                        i8 = ((iM2765 ^ i7) * 30619) ^ (-764083741);
                        c0598 = this;
                    }
                    break;
                case -1448450740:
                case -1401591779:
                    iM2764 = C0619.m2761(C0487.m2361(sArr, 4, 3, i11));
                    i14 = 2103355771;
                    if (C1519.f5300 < 0) {
                        iM3169 = C0773.m3169("ۤۧ") ^ i6;
                        i = ((iM3169 ^ i7) * 3019) ^ (-2059279971);
                        i2 = 758258496;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        objArr = objArr;
                        abstractC22044 = abstractC22044;
                        iM2761 = C0619.m2761("֡ܶ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-12395)) ^ 1137990666;
                        i3 = 1817833543;
                        i9 = iM2761 ^ i3;
                        c0598 = this;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    }
                    break;
                case -1383148894:
                case 1264940393:
                    i11 = 28498;
                    iM2761 = C0619.m2761("۬۠") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-18313)) ^ 1714416162;
                    i3 = -371219915;
                    i9 = iM2761 ^ i3;
                    c0598 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1214515726:
                case 280287360:
                    objArr = objArr;
                    abstractC22044 = abstractC22044;
                    s = f2386[0];
                    i12 = s * 2;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("֡ܶ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-12395)) ^ 1137990666;
                        i3 = 1817833543;
                    } else {
                        iM2761 = (C0619.m2761("ۘᩴ") + i7) * (-77);
                        i8 = ((iM2761 ^ i6) * 18665) ^ (-533730221);
                        i3 = 1259180933;
                    }
                    i9 = iM2761 ^ i3;
                    c0598 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -1179725527:
                case 1657276291:
                    C2288.m7767();
                    if (C0862.f3233 == 0) {
                        objArr = objArr;
                        abstractC22044 = abstractC22044;
                        iM2762 = (C0619.m2761("ᩳܰ") ^ i6) * (-47);
                        i4 = ((iM2762 ^ i7) * 2687) ^ 1570294293;
                        i5 = 865392982;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    } else {
                        iM3169 = C0773.m3169("ܰ᩺") ^ i6;
                        i = ((iM3169 ^ i7) * (-31745)) ^ 1325833312;
                        i2 = 333511074;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    }
                    break;
                case -741925735:
                case 1460531547:
                    i11 = 39463;
                    iM2761 = C0619.m2761("۬۠") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-18313)) ^ 1714416162;
                    i3 = -371219915;
                    i9 = iM2761 ^ i3;
                    c0598 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -541087924:
                case 1639292429:
                    objArr = objArr;
                    abstractC22044 = abstractC22044;
                    objArr[0] = strM11806;
                    ViewOnClickListenerC7793 viewOnClickListenerC7794 = c0598.f2389;
                    if (C2375.f7641 <= 0) {
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        iM2762 = (C0619.m2761("ᩳܰ") ^ i6) * (-47);
                        i4 = ((iM2762 ^ i7) * 2687) ^ 1570294293;
                        i5 = 865392982;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                    } else {
                        int iM2766 = (i7 - C0619.m2761("ܳ᩸")) * 69;
                        i8 = ((iM2766 ^ i6) * 28845) ^ (-555606977);
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        i9 = iM2766 ^ (-1069897190);
                    }
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -419836013:
                case 298328301:
                    objArr = objArr;
                    abstractC22044 = abstractC22044;
                    int i15 = s + 1;
                    if ((i12 + 1) - (i15 * i15) > 0) {
                        iM2761 = C0773.m3169("ۘ֡") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-13847)) ^ (-1427453522);
                        i3 = 765118753;
                    } else {
                        iM2761 = C0773.m3169("᩹᩵") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-6699)) ^ 1716837830;
                        i3 = 837934022;
                    }
                    i9 = iM2761 ^ i3;
                    c0598 = this;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case -47471492:
                case 1642877910:
                    objArr = objArr;
                    ViewOnClickListenerC7793 viewOnClickListenerC7795 = viewOnClickListenerC7793;
                    strM33142 = C13473.m33142(viewOnClickListenerC7795, iM31610 ^ i10, objArr);
                    int i16 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(viewOnClickListenerC7795);
                    short[] sArr3 = f2386;
                    if (C4282.m13644()) {
                        int iM2767 = C0619.m2761("ᩴ֫") ^ i7;
                        i8 = ((iM2767 ^ i6) * 31291) ^ (-871801961);
                        viewOnClickListenerC7793 = viewOnClickListenerC7795;
                        sArr = sArr3;
                        i9 = iM2767 ^ (-476236531);
                    } else {
                        viewOnClickListenerC7793 = viewOnClickListenerC7795;
                        sArr = sArr3;
                        iM2762 = (C0773.m3169("᩻ᩳ") + i7) * 93;
                        abstractC22044 = abstractC22044;
                        i4 = ((iM2762 ^ i6) * 569) ^ (-2001212807);
                        i5 = 1422254604;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                    }
                    objArr = objArr;
                    break;
                case 382641217:
                case 1160963323:
                    if (!C0619.f2439) {
                        objArr = objArr;
                        iM2762 = (C0773.m3169("᩻ᩳ") + i7) * 93;
                        abstractC22044 = abstractC22044;
                        i4 = ((iM2762 ^ i6) * 569) ^ (-2001212807);
                        i5 = 1422254604;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    } else {
                        iM3169 = C0773.m3169("ܰ᩺") ^ i6;
                        i = ((iM3169 ^ i7) * (-31745)) ^ 1325833312;
                        i2 = 333511074;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    }
                    break;
                case 645872212:
                case 864316466:
                    strM12925 = C3998.m12925(sArr2, 7, 3, i11);
                    if (C2288.f7433 > 0) {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i6;
                        i = ((iM3169 ^ i7) * (-11195)) ^ 1577883799;
                        i2 = 616076663;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        objArr = objArr;
                        iM2762 = (C0773.m3169("᩻ᩳ") + i7) * 93;
                        abstractC22044 = abstractC22044;
                        i4 = ((iM2762 ^ i6) * 569) ^ (-2001212807);
                        i5 = 1422254604;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    }
                    break;
                case 835350970:
                case 1931441088:
                    onClickListener = new DialogInterface.OnClickListener(c0598) { // from class: l.ܿᩳ֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C0598 f60180;

                        {
                            int i17 = 148599458;
                            int i18 = AbstractC0116.f1064;
                            int i19 = C3690.f12684;
                            int iM31611 = C0773.m3169("ۤ۟") ^ i19;
                            int i20 = ((iM31611 ^ i18) * 18267) ^ (-418666056);
                            int i21 = -1324976400;
                            while (true) {
                                i17 = ((((i17 ^ i18) * (-32683)) >> 31) & i20) ^ (iM31611 ^ i21);
                                switch (i17) {
                                    case -2114054185:
                                    case -944374441:
                                        if (C0487.f2131 <= 0) {
                                            iM31611 = (C0619.m2761("ۨ᩻") + i19) * 23;
                                            i20 = ((iM31611 ^ i18) * 5295) ^ 124204702;
                                            i21 = 721536217;
                                        } else {
                                            iM31611 = (C0619.m2761("ᩳ᩻") + i18) * (-93);
                                            i20 = ((iM31611 ^ i19) * (-12967)) ^ (-1291645825);
                                            i21 = 2062914656;
                                        }
                                        break;
                                    case -2075146281:
                                    case -680072826:
                                        if (C23916.m53419() != 0) {
                                            iM31611 = (C0619.m2761("᩻ۛ") ^ i18) * (-103);
                                            i20 = ((iM31611 ^ i19) * 1195) ^ 307623997;
                                            i21 = 1970076237;
                                        } else {
                                            iM31611 = C0773.m3169("ۙ۠") ^ i18;
                                            i20 = ((iM31611 ^ i19) * 23319) ^ (-871323136);
                                            i21 = 1553890800;
                                        }
                                        break;
                                    case -1930315764:
                                    case 967844949:
                                        RunnableC3055.m9933();
                                        RunnableC0334.m2063();
                                        iM31611 = (i18 - C0619.m2761("ܽ֨")) * (-17);
                                        i20 = ((iM31611 ^ i19) * (-28369)) ^ (-823761539);
                                        i21 = 783730111;
                                        break;
                                    case -1879708693:
                                    case -1596854770:
                                        this.f60180 = c0598;
                                        if (C0773.f2792 <= 0) {
                                            iM31611 = C0619.m2761("ܺ᩸") ^ i18;
                                            i20 = ((iM31611 ^ i19) * 12345) ^ (-882744019);
                                            i21 = 422916566;
                                        } else {
                                            iM31611 = C0619.m2761("֨ۛ") ^ i19;
                                            i20 = ((iM31611 ^ i18) * (-1877)) ^ (-1006142099);
                                            i21 = 529244107;
                                        }
                                        break;
                                    case -1799968640:
                                    case -1573439092:
                                        C1343.m4943();
                                        C2419.m8174();
                                        throw new RuntimeException();
                                    case -1658486828:
                                    case -1187853133:
                                        return;
                                    case -1625841736:
                                    case 761912913:
                                        if (C0269.m1775() > 0) {
                                            iM31611 = (C0619.m2761("ۨ᩻") + i19) * 23;
                                            i20 = ((iM31611 ^ i18) * 5295) ^ 124204702;
                                            i21 = 721536217;
                                        } else {
                                            iM31611 = (i18 - C0619.m2761("ܽ֨")) * (-17);
                                            i20 = ((iM31611 ^ i19) * (-28369)) ^ (-823761539);
                                            i21 = 783730111;
                                        }
                                        break;
                                    case 13658327:
                                    case 311501393:
                                        if (C0269.f1558 <= 0) {
                                            iM31611 = C0619.m2761("ܺ᩸") ^ i18;
                                            i20 = ((iM31611 ^ i19) * 12345) ^ (-882744019);
                                            i21 = 422916566;
                                        } else {
                                            iM31611 = (i18 - C0773.m3169("ۨۙ")) * (-61);
                                            i20 = ((iM31611 ^ i19) * 8139) ^ 16482668;
                                            i21 = -1109335278;
                                        }
                                        break;
                                    case 19911558:
                                    case 80468843:
                                        if (C1783.m6232()) {
                                            iM31611 = (C0619.m2761("۬ᩴ") + i19) * 93;
                                            i20 = ((iM31611 ^ i18) * 17601) ^ (-1160506382);
                                            i21 = -563730657;
                                        } else {
                                            iM31611 = (C0619.m2761("ۨ᩻") + i19) * 23;
                                            i20 = ((iM31611 ^ i18) * 5295) ^ 124204702;
                                            i21 = 721536217;
                                        }
                                        break;
                                    case 92258956:
                                    case 353666399:
                                        if (C3998.f13671 != 0) {
                                            iM31611 = (C0773.m3169("᩸ۧ") ^ i19) * 23;
                                            i20 = ((iM31611 ^ i18) * (-22907)) ^ (-1169847588);
                                            i21 = -138678206;
                                        } else {
                                            iM31611 = C0619.m2761("֫ᩳ") ^ i19;
                                            i20 = ((iM31611 ^ i18) * (-24471)) ^ 1307796549;
                                            i21 = -1162064737;
                                        }
                                        break;
                                    case 377602128:
                                    case 561539224:
                                        if (C2354.m7983()) {
                                            iM31611 = C0773.m3169("᩵ۧ") ^ i18;
                                            i20 = ((iM31611 ^ i19) * (-26395)) ^ (-834582510);
                                            i21 = 1693819870;
                                        } else {
                                            iM31611 = C0619.m2761("ܺ᩸") ^ i18;
                                            i20 = ((iM31611 ^ i19) * 12345) ^ (-882744019);
                                            i21 = 422916566;
                                        }
                                        break;
                                    case 489371156:
                                    case 1247430955:
                                        if (C3734.f12817 < 0) {
                                            iM31611 = (C0773.m3169("᩸ۧ") ^ i19) * 23;
                                            i20 = ((iM31611 ^ i18) * (-22907)) ^ (-1169847588);
                                            i21 = -138678206;
                                        } else {
                                            iM31611 = (C0619.m2761("᩻ۛ") ^ i18) * (-103);
                                            i20 = ((iM31611 ^ i19) * 1195) ^ 307623997;
                                            i21 = 1970076237;
                                        }
                                        break;
                                    case 1004167654:
                                    case 1484807019:
                                        if (C3779.f12953 <= 0) {
                                            iM31611 = C0619.m2761("ܺ᩸") ^ i18;
                                            i20 = ((iM31611 ^ i19) * 12345) ^ (-882744019);
                                            i21 = 422916566;
                                        } else {
                                            iM31611 = C0619.m2761("ۚܽ") ^ i19;
                                            i20 = ((iM31611 ^ i18) * 26039) ^ (-865198556);
                                            i21 = 1071401285;
                                        }
                                        break;
                                    case 1344341787:
                                    case 1839311678:
                                        C3690.m11987();
                                        if (C1321.f4751 < 0) {
                                            iM31611 = (C0619.m2761("᩻ۛ") ^ i18) * (-103);
                                            i20 = ((iM31611 ^ i19) * 1195) ^ 307623997;
                                            i21 = 1970076237;
                                        } else {
                                            iM31611 = (i18 - C0619.m2761("ܽ֨")) * (-17);
                                            i20 = ((iM31611 ^ i19) * (-28369)) ^ (-823761539);
                                            i21 = 783730111;
                                        }
                                        break;
                                    case 1625843056:
                                    case 2124080676:
                                        if (C11235.m28309() != 0) {
                                            iM31611 = (i18 - C0619.m2761("ܽ֨")) * (-17);
                                            i20 = ((iM31611 ^ i19) * (-28369)) ^ (-823761539);
                                            i21 = 783730111;
                                        } else {
                                            iM31611 = (C0773.m3169("ܿۘ") + i19) * (-81);
                                            i20 = ((iM31611 ^ i18) * (-11959)) ^ (-888730259);
                                            i21 = 1598896758;
                                        }
                                        break;
                                    default:
                                        if (C1080.m4050()) {
                                            iM31611 = C0773.m3169("ۙ᩶") ^ i18;
                                            i20 = ((iM31611 ^ i19) * (-17135)) ^ (-1955004431);
                                            i21 = -2048916266;
                                        } else {
                                            iM31611 = (C0619.m2761("᩻ۛ") ^ i18) * (-103);
                                            i20 = ((iM31611 ^ i19) * 1195) ^ 307623997;
                                            i21 = 1970076237;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i17) {
                            ViewOnClickListenerC7793 viewOnClickListenerC7796 = null;
                            int i18 = 1566992665;
                            int i19 = C2354.f7599;
                            int i20 = C20932.f66974;
                            int iM31611 = (C0773.m3169("֡ۡ") + i19) * (-119);
                            int i21 = ((iM31611 ^ i20) * 7177) ^ (-635079702);
                            int i22 = 1694235400;
                            while (true) {
                                i18 = ((((i18 ^ i20) * (-22711)) >> 31) & i21) ^ (iM31611 ^ i22);
                                switch (i18) {
                                    case -2097781071:
                                    case -1879947201:
                                        C0487.m2356();
                                        if (C2702.f8586 > 0) {
                                            iM31611 = (C0619.m2761("ܰ֡") ^ i20) * 21;
                                            i21 = ((iM31611 ^ i19) * (-7171)) ^ (-1621352353);
                                            i22 = 1895793757;
                                        } else {
                                            iM31611 = C0619.m2761("ۢܶ") ^ i19;
                                            i21 = ((iM31611 ^ i20) * (-20003)) ^ (-575163139);
                                            i22 = 579749285;
                                        }
                                        break;
                                    case -2013477512:
                                    case 989318159:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM31611 = (C0773.m3169("᩵ۙ") + i19) * 45;
                                            i21 = ((iM31611 ^ i20) * (-19159)) ^ 837578723;
                                            i22 = -672309243;
                                        } else {
                                            iM31611 = C0773.m3169("ۢ֨") ^ i19;
                                            i21 = ((iM31611 ^ i20) * (-24531)) ^ 1006327341;
                                            i22 = 793110446;
                                        }
                                        break;
                                    case -1910194085:
                                    case -897270166:
                                        if (RunnableC3055.m9933() != 0) {
                                            iM31611 = (C0773.m3169("᩵ۙ") + i19) * 45;
                                            i21 = ((iM31611 ^ i20) * (-19159)) ^ 837578723;
                                            i22 = -672309243;
                                        } else {
                                            iM31611 = (i19 - C0773.m3169("᩶֡")) * (-111);
                                            i21 = ((iM31611 ^ i20) * 21021) ^ (-1557418736);
                                            i22 = -942870405;
                                        }
                                        break;
                                    case -1861785116:
                                    case -1487328242:
                                        if (C2966.f9654 >= 0) {
                                            iM31611 = C0619.m2761("ۢܶ") ^ i19;
                                            i21 = ((iM31611 ^ i20) * (-20003)) ^ (-575163139);
                                            i22 = 579749285;
                                        } else {
                                            iM31611 = C0619.m2761("᩺۠") ^ i20;
                                            i21 = ((iM31611 ^ i19) * 17189) ^ 973854686;
                                            i22 = 717112391;
                                        }
                                        break;
                                    case -1841910567:
                                    case 2014824750:
                                        if (C1343.m4943()) {
                                            iM31611 = C0619.m2761("֡᩺") ^ i19;
                                            i21 = ((iM31611 ^ i20) * 28501) ^ (-1523393866);
                                            i22 = 23570573;
                                        } else {
                                            iM31611 = (C0619.m2761("ۖ۫") + i20) * (-41);
                                            i21 = ((iM31611 ^ i19) * (-11497)) ^ (-810443929);
                                            i22 = -800628900;
                                        }
                                        break;
                                    case -1609758962:
                                    case -69356498:
                                        if (C4238.f15451 >= 0) {
                                            iM31611 = (C0619.m2761("ۖ۫") + i20) * (-41);
                                            i21 = ((iM31611 ^ i19) * (-11497)) ^ (-810443929);
                                            i22 = -800628900;
                                        } else {
                                            iM31611 = C0619.m2761("ܳۨ") ^ i20;
                                            i21 = ((iM31611 ^ i19) * (-24457)) ^ (-582531849);
                                            i22 = 1390143422;
                                        }
                                        break;
                                    case -1292988255:
                                    case 1713605889:
                                        C3033.m9845();
                                        iM31611 = (C0619.m2761("ۖ۫") + i20) * (-41);
                                        i21 = ((iM31611 ^ i19) * (-11497)) ^ (-810443929);
                                        i22 = -800628900;
                                        break;
                                    case -1231131135:
                                    case 1979514443:
                                        C3779.m12264();
                                        if (C3448.f11240 < 0) {
                                            iM31611 = C0619.m2761("ۢܶ") ^ i19;
                                            i21 = ((iM31611 ^ i20) * (-20003)) ^ (-575163139);
                                            i22 = 579749285;
                                        } else {
                                            iM31611 = (C0619.m2761("ۖ۫") + i20) * (-41);
                                            i21 = ((iM31611 ^ i19) * (-11497)) ^ (-810443929);
                                            i22 = -800628900;
                                        }
                                        break;
                                    case -1088080584:
                                    case -1029237182:
                                        if (RunnableC3646.f12471) {
                                            iM31611 = (C0619.m2761("ۖ۫") + i20) * (-41);
                                            i21 = ((iM31611 ^ i19) * (-11497)) ^ (-810443929);
                                            i22 = -800628900;
                                        } else {
                                            iM31611 = (C0619.m2761("ۤܺ") + i20) * (-95);
                                            i21 = ((iM31611 ^ i19) * (-27193)) ^ 884494300;
                                            i22 = -685040303;
                                        }
                                        break;
                                    case -941984511:
                                    case 1893788883:
                                        String strM4220 = C1146.m4220(abstractC22044);
                                        int i23 = ViewOnClickListenerC7793.f25871;
                                        Main.m93(viewOnClickListenerC7796, strM4220);
                                        break;
                                    case -283452588:
                                    case 1919462617:
                                        viewOnClickListenerC7796 = this.f60180.f2389;
                                        if (C1321.f4751 >= 0) {
                                            iM31611 = C0619.m2761("᩷᩶") ^ i19;
                                            i21 = ((iM31611 ^ i20) * 2023) ^ 1281190856;
                                            i22 = 529600368;
                                        } else {
                                            iM31611 = (C0773.m3169("ۘ᩹") ^ i19) * 79;
                                            i21 = ((iM31611 ^ i20) * 11335) ^ 1859455844;
                                            i22 = -49826612;
                                        }
                                        break;
                                    case -230673319:
                                    case 570996546:
                                        if (C20932.f66974 <= 0) {
                                            iM31611 = (C0773.m3169("᩵ۙ") + i19) * 45;
                                            i21 = ((iM31611 ^ i20) * (-19159)) ^ 837578723;
                                            i22 = -672309243;
                                        } else {
                                            iM31611 = (C0619.m2761("ۖ۫") + i20) * (-41);
                                            i21 = ((iM31611 ^ i19) * (-11497)) ^ (-810443929);
                                            i22 = -800628900;
                                        }
                                        break;
                                    case -178812470:
                                    case 1326049575:
                                        AbstractC0641.m2813();
                                        C1542.m5459();
                                        break;
                                    case 7452516:
                                    case 813069413:
                                        if (C2485.f7950 != 0) {
                                            iM31611 = (C0619.m2761("ܰ֡") ^ i20) * 21;
                                            i21 = ((iM31611 ^ i19) * (-7171)) ^ (-1621352353);
                                            i22 = 1895793757;
                                        } else {
                                            iM31611 = (C0619.m2761("ۡۜ") + i20) * 77;
                                            i21 = ((iM31611 ^ i19) * (-1119)) ^ 1657678148;
                                            i22 = -496146891;
                                        }
                                        break;
                                    case 553083105:
                                    case 1035461141:
                                        if (C4282.f15546 <= 0) {
                                            iM31611 = (C0619.m2761("ܰ֡") ^ i20) * 21;
                                            i21 = ((iM31611 ^ i19) * (-7171)) ^ (-1621352353);
                                            i22 = 1895793757;
                                        } else {
                                            iM31611 = C0619.m2761("᩷ۢ") ^ i19;
                                            i21 = ((iM31611 ^ i20) * 1061) ^ (-724348121);
                                            i22 = 2117491552;
                                        }
                                        break;
                                    default:
                                        if (C0773.f2792 <= 0) {
                                            iM31611 = (C0773.m3169("᩵ۙ") + i19) * 45;
                                            i21 = ((iM31611 ^ i20) * (-19159)) ^ 837578723;
                                            i22 = -672309243;
                                        } else {
                                            iM31611 = C0773.m3169("᩷ۡ") ^ i20;
                                            i21 = ((iM31611 ^ i19) * 5129) ^ (-758296870);
                                            i22 = 1487363862;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    strM5471 = C1542.m5471(f2386, 10, 3, i11);
                    if (C4238.m13540() > 0) {
                        iM3169 = C0773.m3169("ܺۧ") ^ i7;
                        i = ((iM3169 ^ i6) * (-32279)) ^ (-226221178);
                        i2 = -1439401795;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        objArr = objArr;
                        abstractC22044 = abstractC22044;
                        iM2762 = (C0619.m2761("ᩳܰ") ^ i6) * (-47);
                        i4 = ((iM2762 ^ i7) * 2687) ^ 1570294293;
                        i5 = 865392982;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    }
                    break;
                case 1072164815:
                case 1515735838:
                    objArr = objArr;
                    iM31610 = C0773.m3169(C0269.m1785(f2386, 1, 3, i11));
                    i10 = 2097263842;
                    if (C1080.f3865 >= 0) {
                        iM2762 = (C0773.m3169("᩻ᩳ") + i7) * 93;
                        abstractC22044 = abstractC22044;
                        i4 = ((iM2762 ^ i6) * 569) ^ (-2001212807);
                        i5 = 1422254604;
                    } else {
                        abstractC22044 = abstractC22044;
                        iM2762 = C0619.m2761("ۨ᩻") ^ i6;
                        i4 = ((iM2762 ^ i7) * 24575) ^ (-2140458880);
                        i5 = 461062902;
                    }
                    i9 = iM2762 ^ i5;
                    i8 = i4;
                    abstractC22044 = abstractC22044;
                    objArr = objArr;
                    break;
                case 1154252015:
                case 1470441072:
                    C2485.m8345(c2361, iM2764 ^ i14);
                    C1519.m5410(c2361, strM33142);
                    sArr2 = f2386;
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("ܰ᩺") ^ i6;
                        i = ((iM3169 ^ i7) * (-31745)) ^ 1325833312;
                        i2 = 333511074;
                    } else {
                        iM3169 = (i7 - C0773.m3169("֫ۛ")) * 37;
                        i = ((iM3169 ^ i6) * (-3781)) ^ 865621401;
                        i2 = -1626875926;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 1223045445:
                case 1295975256:
                    C0773.m3161();
                    C20932.m47848();
                    iM3169 = C0773.m3169("ܰ᩺") ^ i6;
                    i = ((iM3169 ^ i7) * (-31745)) ^ 1325833312;
                    i2 = 333511074;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 1579961859:
                case 2088833950:
                    C3492.m11487(c2361, C0619.m2761(strM12925) ^ 2124835312, null);
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ܽۗ") ^ i7;
                        i = ((iM3169 ^ i6) * (-26995)) ^ 1594675337;
                        i2 = 959184140;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        objArr = objArr;
                        iM2762 = (C0773.m3169("᩻ᩳ") + i7) * 93;
                        abstractC22044 = abstractC22044;
                        i4 = ((iM2762 ^ i6) * 569) ^ (-2001212807);
                        i5 = 1422254604;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                        abstractC22044 = abstractC22044;
                        objArr = objArr;
                    }
                    break;
                default:
                    C2375.m8063(c2361, C0619.m2761(strM5471) ^ 2126316563, onClickListener);
                    C1321.m4860(c2361);
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        Object obj = null;
        int i = 854045356;
        int i2 = C3033.f9831;
        int i3 = C0269.f1558;
        int iM2761 = C0619.m2761("ܳۤ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-21293)) ^ (-809165079);
        int i5 = -1857721225;
        while (true) {
            i = ((((i ^ i2) * (-5663)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2055315105:
                case -1767098267:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ܳۛ") + i3) * 67;
                        i4 = ((iM2761 ^ i2) * (-31663)) ^ 62810206;
                        i5 = -1219154445;
                    } else {
                        iM2761 = (C0619.m2761("֡᩷") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-5017)) ^ 791884154;
                        i5 = -1536969322;
                    }
                    break;
                case -1925659433:
                case -387765818:
                    C2354.m7983();
                    C4238.m13540();
                    iM2761 = (C0619.m2761("֡᩷") ^ i2) * (-121);
                    i4 = ((iM2761 ^ i3) * (-5017)) ^ 791884154;
                    i5 = -1536969322;
                    break;
                case -1901249257:
                case -673257805:
                    AbstractC0641.m2814(viewOnClickListenerC7793, exc, obj);
                    C3734.m12147(this.f2387);
                    break;
                case -1588821740:
                case 1009883113:
                    if (C2419.m8174() >= 0) {
                        iM2761 = (i2 - C0619.m2761("֨ۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * (-20469)) ^ 821746196;
                        i5 = -1769455568;
                    } else {
                        iM2761 = C0619.m2761("֫ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31749)) ^ (-869103202);
                        i5 = 1131022353;
                    }
                    break;
                case -1500120855:
                case -993033848:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۗᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2047) ^ (-1719370589);
                        i5 = 1092844791;
                    } else {
                        iM2761 = C0773.m3169("᩸ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17811) ^ (-1005502552);
                        i5 = -1301214816;
                    }
                    break;
                case -1397318347:
                case -32424590:
                    if (C3099.m10095()) {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-12717)) ^ 1240532534;
                        i5 = 184601711;
                    } else {
                        iM2761 = C0619.m2761("ܿۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4531) ^ (-1906844431);
                        i5 = -1982625933;
                    }
                    break;
                case -1107094919:
                case 1766281916:
                    if (C3998.m12920()) {
                        iM2761 = (C0773.m3169("ܽۖ") + i3) * (-19);
                        i4 = ((iM2761 ^ i2) * 32397) ^ 1066280023;
                        i5 = -587395732;
                    } else {
                        iM2761 = (C0619.m2761("֡᩷") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-5017)) ^ 791884154;
                        i5 = -1536969322;
                    }
                    break;
                case -692397471:
                case 465252394:
                    C1519.m5403();
                    if (!C0619.f2439) {
                        iM2761 = (C0619.m2761("֡᩷") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-5017)) ^ 791884154;
                        i5 = -1536969322;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֨ۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * (-20469)) ^ 821746196;
                        i5 = -1769455568;
                    }
                    break;
                case -453320189:
                case 434199711:
                    obj = null;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۗᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2047) ^ (-1719370589);
                        i5 = 1092844791;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩻") + i2) * (-21);
                        i4 = ((iM2761 ^ i3) * 4855) ^ 1306358693;
                        i5 = -2063427477;
                    }
                    break;
                case -437085170:
                case 1852115605:
                    AbstractC0641.m2813();
                    if (C2287.m7745() > 0) {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-12717)) ^ 1240532534;
                        i5 = 184601711;
                    } else {
                        iM2761 = (C0773.m3169("ܳۛ") + i3) * 67;
                        i4 = ((iM2761 ^ i2) * (-31663)) ^ 62810206;
                        i5 = -1219154445;
                    }
                    break;
                case -214954861:
                case 1333813330:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-12717)) ^ 1240532534;
                        i5 = 184601711;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۖ") + i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-26241)) ^ (-384464100);
                        i5 = 2127886513;
                    }
                    break;
                case 83325970:
                case 1164293173:
                    C2834.m9344();
                    break;
                case 805771864:
                case 1791612600:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("֡᩷") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-5017)) ^ 791884154;
                        i5 = -1536969322;
                    } else {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23715) ^ (-895597701);
                        i5 = 1297034365;
                    }
                    break;
                case 1571688806:
                case 1851807573:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۗᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2047) ^ (-1719370589);
                        i5 = 1092844791;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11295) ^ (-1895340162);
                        i5 = -539245851;
                    }
                    break;
                case 1644857469:
                case 1712763448:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۗᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2047) ^ (-1719370589);
                        i5 = 1092844791;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۖ֡")) * (-95);
                        i4 = ((iM2761 ^ i2) * (-7613)) ^ 94532987;
                        i5 = -2043786361;
                    }
                    break;
                default:
                    viewOnClickListenerC7793 = this.f2389;
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0773.m3169("ۗᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2047) ^ (-1719370589);
                        i5 = 1092844791;
                    } else {
                        iM2761 = C0619.m2761("ܿۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26203) ^ 180531110;
                        i5 = 916923387;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
        C1519.m5412();
    }
}
