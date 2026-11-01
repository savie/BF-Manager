package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۡۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8583 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩴ᩶۬, reason: not valid java name and contains not printable characters */
    private static final short[] f29676 = {2338, -14739, -6632, -13245, 1215, 1898, -7003, -15278, -13982, 4995, 2439, 10089, -5570, 681, 31808, 2980, -8126, 225, 3818, 909, 6791, 10027, -6611, 10437, 7341, -32584, 27246, -31785, 6987, 4912, 2212, -1162, 12919, 12666, 10568, -7072, 10387, 12643, -6485, 4583, -4851, 16379, 7186, -2123, 6658, 10157, -2789, 1583, 14350, -4317, 4695};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f29677;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f29678;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18419 f29679;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9994 f29680;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f29681;

    /* JADX WARN: Code duplicated, block: B:52:0x01ca A[PHI: r8 r9
      0x01ca: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:51:0x01c8, B:13:0x0067, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01c8, B:13:0x0067, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[PHI: r2 r7
      0x0202: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:55:0x0200, B:21:0x0086, B:10:0x0061, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x0200, B:21:0x0086, B:10:0x0061, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0235 A[PHI: r1 r6 r10 r11
      0x0235: PHI (r1v4 l.ۤۖۘ) = (r1v2 l.ۤۖۘ), (r1v2 l.ۤۖۘ), (r1v2 l.ۤۖۘ), (r1v2 l.ۤۖۘ), (r1v6 l.ۤۖۘ) binds: [B:59:0x0233, B:47:0x01a5, B:15:0x006b, B:13:0x0067, B:86:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r6v5 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:59:0x0233, B:47:0x01a5, B:15:0x006b, B:13:0x0067, B:86:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:59:0x0233, B:47:0x01a5, B:15:0x006b, B:13:0x0067, B:86:0x0235] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r11v5 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:59:0x0233, B:47:0x01a5, B:15:0x006b, B:13:0x0067, B:86:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0265 A[PHI: r3 r4 r20
      0x0265: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:63:0x0263, B:33:0x0102, B:25:0x00ad, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:63:0x0263, B:33:0x0102, B:25:0x00ad, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0263, B:33:0x0102, B:25:0x00ad, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22365(ViewOnClickListenerC8583 viewOnClickListenerC8583) {
        int iM45029;
        int i;
        int i2;
        int i3 = C0278.f1572;
        int i4 = RunnableC3388.f12514;
        int iM450210 = C19806.m45029("᩺᩸") ^ i4;
        int i5 = ((iM450210 ^ i3) * (-13209)) ^ 1170834053;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-1782794684);
        ActivityC9994 activityC9994 = null;
        int i7 = 0;
        int iM450211 = 0;
        int i8 = 0;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1473431233;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 12351) >> 31));
            switch (i15) {
                case -2065222984:
                case -774723559:
                    i9 = s * s;
                    i10 = 38056561;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۢ") ^ i4) * 29;
                        i = ((iM45029 ^ i3) * (-15537)) ^ 1821158044;
                        i2 = -782957216;
                    } else {
                        iM45029 = (C19806.m45029("֨᩻") ^ i3) * (-107);
                        i = ((iM45029 ^ i4) * (-24063)) ^ 148235681;
                        i2 = -678629874;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1956305369:
                case 211484819:
                    c = 24;
                    if (C3722.m10894() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-27211)) ^ (-973526628);
                        i2 = 1280384891;
                    } else {
                        iM45029 = C19806.m45029("ܿۧ") ^ i3;
                        i = ((iM45029 ^ i4) * 12803) ^ 1143446720;
                        i2 = 443264963;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1951869312:
                case -304435929:
                    activityC9994 = viewOnClickListenerC8583.f29680;
                    C17132.m40038(activityC9994.f34141);
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-27211)) ^ (-973526628);
                        i2 = 1280384891;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11306 = (i4 - ThreadFactoryC3888.m11306("۠ۚ")) * 93;
                        i5 = ((iM11306 ^ i3) * 265) ^ 837731634;
                        i6 = iM11306 ^ 146001812;
                    }
                    break;
                case -1949364856:
                case 1361387576:
                    C0671.m3008();
                    break;
                case -1936238257:
                case -164574856:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-27211)) ^ (-973526628);
                        i2 = 1280384891;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۢ") ^ i4) * 29;
                        i = ((iM45029 ^ i3) * (-15537)) ^ 1821158044;
                        i2 = -782957216;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1883961316:
                case 119294764:
                    s = sArr[c];
                    if (C0629.m2907()) {
                        iM45029 = C19806.m45029("᩶᩺") ^ i4;
                        i = ((iM45029 ^ i3) * 24263) ^ 1508186981;
                        i2 = 1339103074;
                    } else {
                        iM45029 = C19806.m45029("֫ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14253)) ^ (-233057733);
                        i2 = -1847530316;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1782863462:
                case 441629658:
                    sArr2 = f29676;
                    i13 = 25;
                    i14 = 3;
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 8947) ^ 934646801;
                        i2 = 1636734348;
                    } else {
                        iM45029 = C19806.m45029("֨᩶") ^ i3;
                        i = ((iM45029 ^ i4) * 16319) ^ (-650119163);
                        i2 = -748585917;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1732336751:
                case 1857300229:
                    activityC9994.f34139 = null;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۗ۬") ^ i3;
                        i = ((iM45029 ^ i4) * 30121) ^ 98174790;
                        i2 = 1233652159;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۬") + i3) * (-55);
                        i = ((iM45029 ^ i4) * 6243) ^ (-710033211);
                        i2 = -1323977838;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1571949707:
                case 928116196:
                    C2124.m6673();
                    iM45029 = ThreadFactoryC3888.m11306("᩻ܿ") ^ i3;
                    i = ((iM45029 ^ i4) * (-27211)) ^ (-973526628);
                    i2 = 1280384891;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -837372182:
                case 2052469125:
                    iM450211 = C19806.m45029(C0526.m2424(sArr2, i13, i14, i12));
                    i8 = 2125557637;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۗ۬") ^ i3;
                        i = ((iM45029 ^ i4) * 30121) ^ 98174790;
                        i2 = 1233652159;
                    } else {
                        iM45029 = C19806.m45029("᩹᩺") ^ i4;
                        i = ((iM45029 ^ i3) * (-12603)) ^ 691249327;
                        i2 = -567562904;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -607155565:
                case -287962420:
                    int i16 = s + s2;
                    if (i11 - (i16 * i16) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-28361)) ^ 1242614021;
                        i2 = 2000926782;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩷ܽ")) * (-81);
                        i = ((iM45029 ^ i3) * (-27673)) ^ (-857504995);
                        i2 = 461846654;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -130498544:
                case 2036508874:
                    int i17 = i9 + i10;
                    i11 = i17 + i17;
                    s2 = 6169;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("۬ᩴ") ^ i3) * 57;
                        i = ((iM45029 ^ i4) * 3201) ^ 1763995479;
                        i2 = 1633874043;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-27211)) ^ (-973526628);
                        i2 = 1280384891;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -7422100:
                case 1436250712:
                    if (C0671.m3008() < 0) {
                        iM45029 = C19806.m45029("֫ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14253)) ^ (-233057733);
                        i2 = -1847530316;
                    } else {
                        iM45029 = C19806.m45029("ۗ۬") ^ i3;
                        i = ((iM45029 ^ i4) * 30121) ^ 98174790;
                        i2 = 1233652159;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 107013476:
                case 423516777:
                    i12 = 33481;
                    iM45029 = (ThreadFactoryC3888.m11306("֫ܰ") ^ i3) * 25;
                    i = ((iM45029 ^ i4) * 6081) ^ 1059915626;
                    i2 = 1796763442;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 197068997:
                case 1662199242:
                    sArr = f29676;
                    if (C2704.f10408) {
                        iM45029 = (i4 - C19806.m45029("۬᩸")) * (-89);
                        i = ((iM45029 ^ i3) * 19925) ^ 397053054;
                        i2 = -1701124126;
                    } else {
                        iM45029 = C19806.m45029("ۗ۬") ^ i3;
                        i = ((iM45029 ^ i4) * 30121) ^ 98174790;
                        i2 = 1233652159;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 262070675:
                case 377446942:
                    C1189.m4360(i7);
                    C3535.m10422(activityC9994.f34140);
                    viewOnClickListenerC8583.m22364();
                    break;
                case 849362372:
                case 1076368374:
                    i7 = iM450211 ^ i8;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("֫ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14253)) ^ (-233057733);
                        i2 = -1847530316;
                    } else {
                        iM45029 = C19806.m45029("᩹᩶") ^ i4;
                        i = ((iM45029 ^ i3) * (-22813)) ^ (-1674805214);
                        i2 = -1851957455;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1426051117:
                case 1847837150:
                    C0962.m3746();
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۢ") ^ i4) * 29;
                        i = ((iM45029 ^ i3) * (-15537)) ^ 1821158044;
                        i2 = -782957216;
                    } else {
                        iM45029 = C19806.m45029("֫ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-14253)) ^ (-233057733);
                        i2 = -1847530316;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    i12 = 60374;
                    iM45029 = (ThreadFactoryC3888.m11306("֫ܰ") ^ i3) * 25;
                    i = ((iM45029 ^ i4) * 6081) ^ 1059915626;
                    i2 = 1796763442;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01a9 A[PHI: r7 r13 r14
      0x01a9: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:50:0x01a7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:50:0x01a7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:50:0x01a7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01fb A[PHI: r5 r6
      0x01fb: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:54:0x01e1, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r6v4 l.ۤۖۘ) = (r6v3 l.ۤۖۘ), (r6v2 l.ۤۖۘ) binds: [B:54:0x01e1, B:36:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0224 A[PHI: r2 r4 r25
      0x0224: PHI (r2v4 android.widget.TextView) = (r2v3 android.widget.TextView), (r2v2 android.widget.TextView) binds: [B:58:0x0222, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:58:0x0222, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r25v5 int) = (r25v4 int), (r25v3 int) binds: [B:58:0x0222, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02a7 A[PHI: r10 r11 r15 r18 r20
      0x02a7: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:28:0x00de, B:24:0x00bb, B:18:0x0097, B:15:0x007b, B:12:0x0075, B:9:0x006f, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:28:0x00de, B:24:0x00bb, B:18:0x0097, B:15:0x007b, B:12:0x0075, B:9:0x006f, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:28:0x00de, B:24:0x00bb, B:18:0x0097, B:15:0x007b, B:12:0x0075, B:9:0x006f, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v5 int) binds: [B:28:0x00de, B:24:0x00bb, B:18:0x0097, B:15:0x007b, B:12:0x0075, B:9:0x006f, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r20v3 short) = (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v5 short) binds: [B:28:0x00de, B:24:0x00bb, B:18:0x0097, B:15:0x007b, B:12:0x0075, B:9:0x006f, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02fc A[PHI: r8 r9 r16 r17 r19
      0x02fc: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:75:0x02fa, B:71:0x02da, B:42:0x015b, B:32:0x0102, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:75:0x02fa, B:71:0x02da, B:42:0x015b, B:32:0x0102, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:75:0x02fa, B:71:0x02da, B:42:0x015b, B:32:0x0102, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:75:0x02fa, B:71:0x02da, B:42:0x015b, B:32:0x0102, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:75:0x02fa, B:71:0x02da, B:42:0x015b, B:32:0x0102, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22366() {
        int iM45029;
        int i;
        int i2;
        int i3 = RunnableC1606.f6488;
        int i4 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 25315) ^ (-673380390);
        ActivityC9994 activityC9994 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 503881242;
        TextView textView = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iM450210 = 0;
        int iM11307 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 1398610969;
        int defaultColor = 0;
        while (true) {
            i17 = i6 ^ (i5 & (((i17 ^ i4) * 15489) >> 31));
            switch (i17) {
                case -2027416197:
                case -1253875882:
                    ThreadFactoryC3888.m11303(textView, 2119359761 ^ iM11307);
                    break;
                case -1972601654:
                case -1224506453:
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                        i2 = -791057193;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۛ") + i4) * (-25);
                        i = ((iM45029 ^ i3) * 1285) ^ 1650040205;
                        i2 = 1500749796;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1945839804:
                case 398889372:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("۫ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * 3319) ^ 1162775662;
                        i2 = -1357736261;
                    } else {
                        iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                        i2 = -791057193;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1861423572:
                case -75540148:
                    int i18 = s + s2;
                    if ((i18 * i18) - i16 > 0) {
                        iM45029 = (i4 - C19806.m45029("ۢ᩹")) * 27;
                        i = ((iM45029 ^ i3) * (-18419)) ^ (-1238534999);
                        i2 = -530385685;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۗ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16865)) ^ 1634158528;
                        i2 = -108341344;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1373410074:
                case 341077178:
                    i11 = 17429;
                    iM45029 = ThreadFactoryC3888.m11306("ۢ۫") ^ i3;
                    i = ((iM45029 ^ i4) * (-1073)) ^ (-1208519562);
                    i2 = 316148363;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1259539191:
                case -676658001:
                    if (activityC9994.f34139.m29823() != this.f29679.m42727()) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴ۬")) * (-107);
                        i = ((iM45029 ^ i3) * (-27071)) ^ 724882690;
                        i2 = 624439902;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-22801)) ^ (-1516864032);
                        i2 = 1425437514;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1167290294:
                case 673818488:
                    i14 = s * s;
                    i15 = 1643524;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i3 - C19806.m45029("۫ۘ")) * (-69);
                        i = ((iM45029 ^ i4) * 12297) ^ 270936627;
                        i2 = 1288186901;
                    } else {
                        iM45029 = C19806.m45029("᩻۬") ^ i4;
                        i = ((iM45029 ^ i3) * 17217) ^ 264175547;
                        i2 = 2041850730;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1138075813:
                case -544864122:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                        i2 = -791057193;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۫ۘ")) * (-69);
                        i = ((iM45029 ^ i4) * 12297) ^ 270936627;
                        i2 = 1288186901;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1014463006:
                case 1867197800:
                    ThreadFactoryC3888.m11303(textView, 2117033947 ^ iM450210);
                    break;
                case -982458377:
                case -341749934:
                    C1148.m4225(textView, i9);
                    sArr = f29676;
                    i12 = 45;
                    if (C2704.f10408) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۨ᩺")) * 39;
                        i = ((iM45029 ^ i3) * 9181) ^ (-401833884);
                        i2 = -1177878089;
                    } else {
                        iM45029 = (C19806.m45029("᩶ܿ") ^ i3) * (-41);
                        i = ((iM45029 ^ i4) * 891) ^ 2090585074;
                        i2 = 1231287937;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -982438620:
                case 1978851395:
                    i8 = defaultColor & i7;
                    activityC9994 = this.f29680;
                    if (activityC9994.f34139 != null) {
                        iM45029 = (C19806.m45029("۠ۖ") + i4) * (-63);
                        i = ((iM45029 ^ i3) * 13031) ^ (-652998754);
                        i2 = 303111039;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴ۬")) * (-107);
                        i = ((iM45029 ^ i3) * (-27071)) ^ 724882690;
                        i2 = 624439902;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -875684266:
                case 1863844187:
                    C1148.m4225(textView, i10);
                    sArr2 = f29676;
                    i13 = 48;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                        i2 = -791057193;
                    } else {
                        iM45029 = C19806.m45029("ۧᩳ") ^ i3;
                        i = ((iM45029 ^ i4) * 30507) ^ 800920291;
                        i2 = -1671044161;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -631345975:
                case -49348582:
                    textView = this.f29677;
                    defaultColor = textView.getTextColors().getDefaultColor();
                    i7 = 16777215;
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("۫ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * 3319) ^ 1162775662;
                        i2 = -1357736261;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩻ۧ")) * 31;
                        i = ((iM45029 ^ i4) * 23575) ^ 297006021;
                        i2 = 2135696951;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -587966891:
                case 1603593702:
                    i11 = 26872;
                    iM45029 = ThreadFactoryC3888.m11306("ۢ۫") ^ i3;
                    i = ((iM45029 ^ i4) * (-1073)) ^ (-1208519562);
                    i2 = 316148363;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -477958517:
                case 266263119:
                    iM450210 = C19806.m45029(RunnableC1606.m5481(sArr, i12, 3, i11));
                    if (C1377.m4833() != 0) {
                        iM45029 = (i3 - C19806.m45029("۫ۘ")) * (-69);
                        i = ((iM45029 ^ i4) * 12297) ^ 270936627;
                        i2 = 1288186901;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵᩸")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i4) * 10459) ^ 1654201327;
                        i2 = -1281674739;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -237210814:
                case 992276958:
                    s = f29676[44];
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i3 - C19806.m45029("۫ۘ")) * (-69);
                        i = ((iM45029 ^ i4) * 12297) ^ 270936627;
                        i2 = 1288186901;
                    } else {
                        iM45029 = C19806.m45029("ۢۜ") ^ i3;
                        i = ((iM45029 ^ i4) * (-18215)) ^ (-1569189046);
                        i2 = -939610726;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -40904558:
                case 1941095691:
                    iM11307 = ThreadFactoryC3888.m11306(C3286.m9788(sArr2, i13, 3, i11));
                    if (C1977.m6356()) {
                        iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                        i2 = -791057193;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-7485)) ^ (-1145502249);
                        i2 = -1875003920;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 208851204:
                case 1889566676:
                    textView.setEnabled(true);
                    i9 = i8 | (-16777216);
                    if (C0050.m946() <= 0) {
                        iM45029 = (C19806.m45029("᩶ܿ") ^ i3) * (-41);
                        i = ((iM45029 ^ i4) * 891) ^ 2090585074;
                        i2 = 1231287937;
                    } else {
                        iM45029 = (C19806.m45029("ۗ۫") ^ i3) * (-91);
                        i = ((iM45029 ^ i4) * 4685) ^ (-56646677);
                        i2 = 1429201678;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 254302148:
                case 824621201:
                    C1025.m3861();
                    C1460.m5050();
                    iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                    i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                    i2 = -791057193;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 319380226:
                case 1904779818:
                    textView.setEnabled(false);
                    i10 = i8 | (-872415232);
                    if (C3286.f12186) {
                        iM45029 = (i3 - C19806.m45029("۫ۘ")) * (-69);
                        i = ((iM45029 ^ i4) * 12297) ^ 270936627;
                        i2 = 1288186901;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۠") ^ i3) * 43;
                        i = ((iM45029 ^ i4) * 26179) ^ (-767482926);
                        i2 = -2099039559;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1057849680:
                case 1455904932:
                    C1419.m4973();
                    C1377.m4833();
                    break;
                default:
                    int i19 = i14 + i15;
                    i16 = i19 + i19;
                    s2 = 1282;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩸ۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 3809) ^ 298965065;
                        i2 = -791057193;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤܳ")) * (-27);
                        i = ((iM45029 ^ i4) * (-27043)) ^ (-1217826437);
                        i2 = 1328347201;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22361(final ViewOnClickListenerC8583 viewOnClickListenerC8583) {
        ActivityC9994 activityC9994 = null;
        C18419 c18419 = null;
        int i = 598462993;
        int i2 = C1148.f5161;
        int i3 = C1461.f5957;
        int iM11306 = (ThreadFactoryC3888.m11306("᩹ܿ") ^ i3) * (-73);
        int i4 = ((iM11306 ^ i2) * 29465) ^ 1770702319;
        int i5 = -132992425;
        while (true) {
            i = ((((i ^ i2) * (-5521)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2144464882:
                case -2131425970:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1191) ^ (-382235832);
                        i5 = -1667679042;
                    } else {
                        iM11306 = (C19806.m45029("֨ۗ") ^ i2) * (-43);
                        i4 = ((iM11306 ^ i3) * 7759) ^ 373063937;
                        i5 = 1673219759;
                    }
                    break;
                case -2023650263:
                case -565891364:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1191) ^ (-382235832);
                        i5 = -1667679042;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15487) ^ (-38997819);
                        i5 = -1988552960;
                    }
                    break;
                case -1838867159:
                case -1055241996:
                    C2642.m8171();
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1191) ^ (-382235832);
                        i5 = -1667679042;
                    } else {
                        iM11306 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11361) ^ 1303222359;
                        i5 = 85415185;
                    }
                    break;
                case -1804220771:
                case 498826012:
                    if (C2788.m8472() != 0) {
                        iM11306 = (C19806.m45029("ۖ۠") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * 15437) ^ (-1827570594);
                        i5 = 1056164358;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۚ᩻")) * (-127);
                        i4 = ((iM11306 ^ i3) * 7215) ^ 694618226;
                        i5 = -1844484694;
                    }
                    break;
                case -1673584257:
                case 855278596:
                    activityC9994 = viewOnClickListenerC8583.f29680;
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1191) ^ (-382235832);
                        i5 = -1667679042;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۙۡ")) * (-27);
                        i4 = ((iM11306 ^ i2) * 30011) ^ 995194237;
                        i5 = -372538500;
                    }
                    break;
                case -1609849054:
                case -721870493:
                    C1419.m4973();
                    if (C2332.m7079() <= 0) {
                        iM11306 = (C19806.m45029("ۖ۠") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * 15437) ^ (-1827570594);
                        i5 = 1056164358;
                    } else {
                        iM11306 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11361) ^ 1303222359;
                        i5 = 85415185;
                    }
                    break;
                case -1557935898:
                case 981456683:
                    ActivityC5760.m15861(activityC9994, c18419, new Runnable() { // from class: l.᩵ۖۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC8583 viewOnClickListenerC8584 = null;
                            ActivityC9994 activityC9995 = null;
                            String str = null;
                            int i6 = 507593181;
                            int i7 = RunnableC1606.f6488;
                            int i8 = C10634.f36300;
                            int iM45029 = C19806.m45029("۟ۘ") ^ i7;
                            int i9 = ((iM45029 ^ i8) * 11513) ^ 762117919;
                            int i10 = 1123644456;
                            while (true) {
                                i6 = ((((i6 ^ i8) * (-19137)) >> 31) & i9) ^ (iM45029 ^ i10);
                                switch (i6) {
                                    case -2103411945:
                                    case 1076778853:
                                        C7105.m18985();
                                        RunnableC1606.m5473();
                                        break;
                                    case -2053235343:
                                    case -1573130059:
                                        activityC9995 = viewOnClickListenerC8584.f29680;
                                        if (C1460.f5948 >= 0) {
                                            iM45029 = C19806.m45029("ܽܳ") ^ i7;
                                            i9 = ((iM45029 ^ i8) * (-6309)) ^ (-1368864412);
                                            i10 = 852123194;
                                        } else {
                                            iM45029 = C19806.m45029("ܽᩳ") ^ i8;
                                            i9 = ((iM45029 ^ i7) * (-1255)) ^ 1605120576;
                                            i10 = 298629620;
                                        }
                                        break;
                                    case -1978448999:
                                    case -1112506952:
                                        if (C2788.f10625 >= 0) {
                                            iM45029 = (i7 - C19806.m45029("᩶᩺")) * 73;
                                            i9 = ((iM45029 ^ i8) * 30663) ^ 999224984;
                                            i10 = -1288760107;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        }
                                        break;
                                    case -1947824596:
                                    case -1389463255:
                                        viewOnClickListenerC8584 = this.f61896;
                                        if (C3722.f13525 <= 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("ܳۡ") ^ i8;
                                            i9 = ((iM45029 ^ i7) * (-3873)) ^ 125118432;
                                            i10 = 573254231;
                                        }
                                        break;
                                    case -1928157416:
                                    case 547405088:
                                        if (C1377.f5749) {
                                            iM45029 = ThreadFactoryC3888.m11306("ۤۧ") ^ i7;
                                            i9 = ((iM45029 ^ i8) * (-16069)) ^ 1357250772;
                                            i10 = 1783174954;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("᩷۟") ^ i8;
                                            i9 = ((iM45029 ^ i7) * 2761) ^ (-1548561870);
                                            i10 = 890537146;
                                        }
                                        break;
                                    case -1867603692:
                                    case 51292224:
                                        C1398.m4901(activityC9995.f34140);
                                        break;
                                    case -1677601843:
                                    case -1178958774:
                                        if (C1460.f5948 >= 0) {
                                            iM45029 = (i7 - C19806.m45029("᩶᩺")) * 73;
                                            i9 = ((iM45029 ^ i8) * 30663) ^ 999224984;
                                            i10 = -1288760107;
                                        } else {
                                            iM45029 = (i8 - ThreadFactoryC3888.m11306("ۤۛ")) * (-3);
                                            i9 = ((iM45029 ^ i7) * (-1131)) ^ (-1389443789);
                                            i10 = -778587416;
                                        }
                                        break;
                                    case -1671294255:
                                    case 1707377323:
                                        activityC9995.f34139 = C17132.m40033(str);
                                        if (C0526.f2219) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i7;
                                            i9 = ((iM45029 ^ i8) * 15813) ^ 941578428;
                                            i10 = 2138672567;
                                        }
                                        break;
                                    case -1657851854:
                                    case -1310089359:
                                        if (C1461.f5957 <= 0) {
                                            iM45029 = (i7 - C19806.m45029("᩶᩺")) * 73;
                                            i9 = ((iM45029 ^ i8) * 30663) ^ 999224984;
                                            i10 = -1288760107;
                                        } else {
                                            iM45029 = (C19806.m45029("᩸ۖ") ^ i7) * 77;
                                            i9 = ((iM45029 ^ i8) * 8789) ^ (-832433931);
                                            i10 = -539791778;
                                        }
                                        break;
                                    case -1362575543:
                                    case 821685716:
                                        str = activityC9995.f34141;
                                        if (C0817.f3443) {
                                            iM45029 = (C19806.m45029("᩸ۧ") ^ i8) * (-119);
                                            i9 = ((iM45029 ^ i7) * 4859) ^ (-711866258);
                                            i10 = -1358925835;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("᩵ܿ") + i8) * 87;
                                            i9 = ((iM45029 ^ i7) * 29955) ^ 2047744353;
                                            i10 = -1357158460;
                                        }
                                        break;
                                    case -810786316:
                                    case 1240924021:
                                        if (C1460.f5948 >= 0) {
                                            iM45029 = C19806.m45029("ܽܳ") ^ i7;
                                            i9 = ((iM45029 ^ i8) * (-6309)) ^ (-1368864412);
                                            i10 = 852123194;
                                        } else {
                                            iM45029 = (C19806.m45029("ۘۤ") + i7) * (-101);
                                            i9 = ((iM45029 ^ i8) * 22279) ^ 1135176022;
                                            i10 = -432319162;
                                        }
                                        break;
                                    case -793388703:
                                    case -484687200:
                                        if (!C1377.f5749) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        } else {
                                            iM45029 = C19806.m45029("ܽܳ") ^ i7;
                                            i9 = ((iM45029 ^ i8) * (-6309)) ^ (-1368864412);
                                            i10 = 852123194;
                                        }
                                        break;
                                    case -585273484:
                                    case 2134174007:
                                        C1398.m4895();
                                        C7105.m18985();
                                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                        i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                        i10 = -872729323;
                                        break;
                                    case 325325516:
                                    case 833389395:
                                        if (RunnableC1895.f7152) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ۫") + i7) * 115;
                                            i9 = ((iM45029 ^ i8) * 30269) ^ 865650669;
                                            i10 = 860867594;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        }
                                        break;
                                    case 1154588327:
                                    case 1576501751:
                                        C1066.m4023();
                                        if (C3577.f13150 >= 0) {
                                            iM45029 = ThreadFactoryC3888.m11306("᩷۟") ^ i8;
                                            i9 = ((iM45029 ^ i7) * 2761) ^ (-1548561870);
                                            i10 = 890537146;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        }
                                        break;
                                    default:
                                        if (C2124.f7782 <= 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i8) * 53;
                                            i9 = ((iM45029 ^ i7) * 25823) ^ (-295513558);
                                            i10 = -872729323;
                                        } else {
                                            iM45029 = (C19806.m45029("ۤ᩷") + i8) * 101;
                                            i9 = ((iM45029 ^ i7) * (-3245)) ^ (-847622101);
                                            i10 = -1829098430;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1305750628:
                case 2032512801:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("ۖ۠") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * 15437) ^ (-1827570594);
                        i5 = 1056164358;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ۬") + i3) * 119;
                        i4 = ((iM11306 ^ i2) * (-3603)) ^ (-779046549);
                        i5 = 181325225;
                    }
                    break;
                case -748963135:
                case 1567708083:
                    RunnableC0195.m1431();
                    break;
                case -483749916:
                case 1563307203:
                    C0629.m2907();
                    iM11306 = C19806.m45029("᩵ۖ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 11361) ^ 1303222359;
                    i5 = 85415185;
                    break;
                case -312231770:
                case 1151475323:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (C19806.m45029("ۖ۠") + i3) * (-73);
                        i4 = ((iM11306 ^ i2) * 15437) ^ (-1827570594);
                        i5 = 1056164358;
                    } else {
                        iM11306 = (C19806.m45029("ۛ֡") + i2) * 99;
                        i4 = ((iM11306 ^ i3) * (-11479)) ^ 239420164;
                        i5 = -498816951;
                    }
                    break;
                case -277075001:
                case 1572969059:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-555)) ^ 1876759007;
                        i5 = -364011359;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1191) ^ (-382235832);
                        i5 = -1667679042;
                    }
                    break;
                case -200228115:
                case 974772783:
                    C0629.m2907();
                    if (!RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11361) ^ 1303222359;
                        i5 = 85415185;
                    } else {
                        iM11306 = C19806.m45029("ᩳۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17265)) ^ (-949923610);
                        i5 = -1096142910;
                    }
                    break;
                case -154469264:
                case 378014232:
                    c18419 = viewOnClickListenerC8583.f29679;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܿ") ^ i2) * 53;
                        i4 = ((iM11306 ^ i3) * (-31405)) ^ (-582172605);
                        i5 = -1529613450;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۚ") + i3) * (-11);
                        i4 = ((iM11306 ^ i2) * (-18957)) ^ 1417769859;
                        i5 = 167576886;
                    }
                    break;
                case 880118188:
                case 1071057045:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11361) ^ 1303222359;
                        i5 = 85415185;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩸") ^ i3) * 53;
                        i4 = ((iM11306 ^ i2) * (-32397)) ^ 772937811;
                        i5 = -935444495;
                    }
                    break;
                default:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ᩳۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17265)) ^ (-949923610);
                        i5 = -1096142910;
                    } else {
                        iM11306 = (C19806.m45029("֫ۘ") ^ i2) * (-69);
                        i4 = ((iM11306 ^ i3) * (-991)) ^ (-1885923944);
                        i5 = 333447239;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public ViewOnClickListenerC8583(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Code duplicated, block: B:35:0x0130 A[PHI: r4 r9
      0x0130: PHI (r4v4 android.content.DialogInterface$OnClickListener) = (r4v3 android.content.DialogInterface$OnClickListener), (r4v2 android.content.DialogInterface$OnClickListener) binds: [B:34:0x012e, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:34:0x012e, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0195 A[PHI: r10 r11 r13 r14
      0x0195: PHI (r10v5 int) = (r10v2 int), (r10v4 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:42:0x0193, B:25:0x00c4, B:19:0x009b, B:16:0x0081, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:42:0x0193, B:25:0x00c4, B:19:0x009b, B:16:0x0081, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:42:0x0193, B:25:0x00c4, B:19:0x009b, B:16:0x0081, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v5 short[]) binds: [B:42:0x0193, B:25:0x00c4, B:19:0x009b, B:16:0x0081, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0270 A[PHI: r2
      0x0270: PHI (r2v4 l.ۤۖۘ) = (r2v3 l.ۤۖۘ), (r2v2 l.ۤۖۘ) binds: [B:61:0x0257, B:50:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        short s;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM450210;
        int iM11307;
        int i6;
        final ViewOnClickListenerC8583 viewOnClickListenerC8583 = this;
        int i7 = -1076357071;
        int i8 = C1460.f5948;
        int i9 = C3577.f13150;
        int iM11308 = (ThreadFactoryC3888.m11306("᩸֨") + i8) * 73;
        int i10 = ((iM11308 ^ i9) * (-22979)) ^ (-1983005321);
        int i11 = iM11308 ^ (-717673968);
        String strM8470 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int iM11309 = 0;
        int iM113010 = 0;
        int i12 = 0;
        int iM113011 = 0;
        int iM450211 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s2 = 0;
        int i16 = 0;
        DialogInterface.OnClickListener onClickListener = null;
        C8067 c8067M3751 = null;
        ActivityC9994 activityC9994 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * (-28083)) >> 31));
            switch (i7) {
                case -2127047867:
                case -1286357797:
                    if (C1977.f7413 <= 0) {
                        iM450210 = (C19806.m45029("ۗۜ") ^ i9) * (-5);
                        i10 = ((iM450210 ^ i8) * (-1043)) ^ 1265264825;
                        i5 = 1103880044;
                        i11 = iM450210 ^ i5;
                        viewOnClickListenerC8583 = this;
                    } else {
                        iM11306 = C19806.m45029("ܽ֨") ^ i8;
                        i = ((iM11306 ^ i9) * 5053) ^ 1303600614;
                        i2 = 1607065129;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -2112567704:
                case -1695537359:
                    strM8470 = C2788.m8470(f29676, 29, 3, i14);
                    if (C1398.f5802 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩹") + i9) * (-27);
                        i = ((iM11306 ^ i8) * (-20103)) ^ (-1622845664);
                        i2 = 220055080;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    } else {
                        iM450210 = (C19806.m45029("ۗۜ") ^ i9) * (-5);
                        i10 = ((iM450210 ^ i8) * (-1043)) ^ 1265264825;
                        i5 = 1103880044;
                        i11 = iM450210 ^ i5;
                        viewOnClickListenerC8583 = this;
                    }
                    break;
                case -1866502294:
                case 1866893180:
                    i14 = 26233;
                    iM11306 = C19806.m45029("ۢ֫") ^ i9;
                    i = ((iM11306 ^ i8) * 29677) ^ 746086797;
                    i2 = -2117886009;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1591578460:
                case 1523415022:
                    C1189.m4360(ThreadFactoryC3888.m11306(strM8470) ^ 2127845309);
                    break;
                case -1571353004:
                case 94132894:
                    C1148.m4224(c8067M3751, iM113010 ^ i12);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩳۖۘ

                        /* JADX INFO: renamed from: ۨᩴ֫, reason: not valid java name and contains not printable characters */
                        private static final short[] f56324 = {9619, 12791, 11878, 9225, -18833, 14509, -7849, -1921, -14621, -10351, 11852, -5843, 16193, -11569};

                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
                        
                            if (l.C1066.f4915 <= 0) goto L14;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.content.DialogInterface r28, int r29) {
                            /*
                                Method dump skipped, instruction units count: 1106
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC17754.onClick(android.content.DialogInterface, int):void");
                        }
                    };
                    if (C7105.m18985()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i8) * (-13);
                        i = ((iM11306 ^ i9) * (-26373)) ^ (-1213978298);
                        i2 = -989269498;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܶ") ^ i8;
                        i = ((iM11306 ^ i9) * 18377) ^ 330333054;
                        i2 = -1023226564;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1546554031:
                case -283481747:
                    C1066.m4025(c8067M3751, iM450211 ^ i13, null);
                    CallableC1627.m5514(c8067M3751);
                    break;
                case -1489696372:
                case 1822311155:
                    m22364();
                    break;
                case -1344932327:
                case -619195429:
                    C0671.m3008();
                    if (C3722.f13525 <= 0) {
                        sArr = sArr2;
                        s = s2;
                        iM45029 = (i8 - C19806.m45029("ۛܳ")) * 41;
                        sArr2 = sArr;
                        i4 = ((iM45029 ^ i9) * 22875) ^ (-1778751375);
                        i3 = 105900779;
                        i11 = iM45029 ^ i3;
                        i10 = i4;
                        s2 = s;
                        viewOnClickListenerC8583 = this;
                    } else {
                        iM11306 = C19806.m45029("ܽ֨") ^ i8;
                        i = ((iM11306 ^ i9) * 5053) ^ 1303600614;
                        i2 = 1607065129;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1204298978:
                case -288555565:
                    C2477.m7593();
                    if (RunnableC1564.f6300) {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۘܰ")) * (-7);
                        i = ((iM11306 ^ i8) * 13455) ^ (-40015503);
                        i2 = 109463543;
                    } else {
                        iM11306 = C19806.m45029("ܽ֨") ^ i8;
                        i = ((iM11306 ^ i9) * 5053) ^ 1303600614;
                        i2 = 1607065129;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1142964844:
                case 488658628:
                    C0671.m3008();
                    C0629.m2907();
                    iM11306 = (i9 - ThreadFactoryC3888.m11306("ۘܰ")) * (-7);
                    i = ((iM11306 ^ i8) * 13455) ^ (-40015503);
                    i2 = 109463543;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1106969648:
                case 699473108:
                    s2 = sArr2[c];
                    i16 = s2 * s2;
                    i15 = 352050169;
                    if (RunnableC1895.f7152) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۛᩴ") ^ i9) * 65;
                        i10 = ((iM450210 ^ i8) * 6115) ^ (-95465052);
                        i5 = 1336963369;
                    } else {
                        iM450210 = (C19806.m45029("ۗۜ") ^ i9) * (-5);
                        i10 = ((iM450210 ^ i8) * (-1043)) ^ 1265264825;
                        i5 = 1103880044;
                    }
                    i11 = iM450210 ^ i5;
                    viewOnClickListenerC8583 = this;
                    break;
                case -1024497452:
                case 713329822:
                    C2332.m7079();
                    C7105.m18985();
                    break;
                case -839025638:
                case 685580970:
                    C1377.m4836(c8067M3751, 2119461479 ^ iM11309);
                    sArr3 = f29676;
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۘܰ")) * (-7);
                        i = ((iM11306 ^ i8) * 13455) ^ (-40015503);
                        i2 = 109463543;
                    } else {
                        iM11306 = (i8 - C19806.m45029("ܿۙ")) * (-45);
                        i = ((iM11306 ^ i9) * (-15513)) ^ (-876728971);
                        i2 = -2031477089;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -563178874:
                case 1650938112:
                    s = s2;
                    sArr = f29676;
                    c = 28;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i8 - C19806.m45029("ۛܳ")) * 41;
                        sArr2 = sArr;
                        i4 = ((iM45029 ^ i9) * 22875) ^ (-1778751375);
                        i3 = 105900779;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ۟") ^ i8;
                        sArr2 = sArr;
                        i4 = ((iM45029 ^ i9) * (-10393)) ^ 1716822020;
                        i3 = -844660857;
                    }
                    i11 = iM45029 ^ i3;
                    i10 = i4;
                    s2 = s;
                    viewOnClickListenerC8583 = this;
                    break;
                case -422540088:
                case 1044732259:
                    iM450211 = C19806.m45029(C0050.m940(sArr4, 41, 3, i14));
                    i13 = 2119001245;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۘܰ")) * (-7);
                        i = ((iM11306 ^ i8) * 13455) ^ (-40015503);
                        i2 = 109463543;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩶") ^ i9;
                        i = ((iM11306 ^ i8) * 10701) ^ (-38039618);
                        i2 = 1977080657;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -375280276:
                case 453904029:
                    if (viewOnClickListenerC8583.f29679.m42726() > 3) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩷") ^ i8) * 123;
                        i = ((iM11306 ^ i9) * 3817) ^ 1986314704;
                        i2 = 204842435;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻۠") ^ i8;
                        i = ((iM11306 ^ i9) * 22287) ^ 682581739;
                        i2 = 289638388;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -340216845:
                case 25732611:
                    int i17 = i16 + i15;
                    short s3 = s2;
                    int i18 = s3 + 18763;
                    if ((i17 + i17) - (i18 * i18) >= 0) {
                        iM11307 = (i8 - C19806.m45029("ۙۚ")) * (-17);
                        i10 = ((iM11307 ^ i9) * (-29823)) ^ 891994718;
                        i6 = 1244709745;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܳ᩸") ^ i9;
                        i10 = ((iM11307 ^ i8) * 13601) ^ (-244575595);
                        i6 = -1309038000;
                    }
                    i11 = iM11307 ^ i6;
                    viewOnClickListenerC8583 = this;
                    s2 = s3;
                    break;
                case -241384820:
                case -178898553:
                    activityC9994 = viewOnClickListenerC8583.f29680;
                    if (activityC9994.f34139 != null) {
                        iM11306 = (C19806.m45029("ۗ᩻") + i9) * (-71);
                        i = ((iM11306 ^ i8) * 18237) ^ (-1111560910);
                        i2 = 138268774;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۤ") ^ i8;
                        i = ((iM11306 ^ i9) * 5021) ^ 779763834;
                        i2 = 1126217558;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 4735117:
                case 1805750202:
                    c8067M3751 = C0962.m3751(activityC9994);
                    iM11309 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f29676, 32, 3, i14));
                    if (!C2704.f10408) {
                        iM450210 = (C19806.m45029("ۗۜ") ^ i9) * (-5);
                        i10 = ((iM450210 ^ i8) * (-1043)) ^ 1265264825;
                        i5 = 1103880044;
                        i11 = iM450210 ^ i5;
                        viewOnClickListenerC8583 = this;
                    } else {
                        iM11306 = (C19806.m45029("۟ۜ") + i9) * (-77);
                        i = ((iM11306 ^ i8) * 20969) ^ 73668646;
                        i2 = 1490929978;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case 20742959:
                case 1859727851:
                    iM113010 = ThreadFactoryC3888.m11306(C1937.m6288(sArr3, 35, 3, i14));
                    i12 = 2128626196;
                    if (!C2332.f8260) {
                        iM450210 = (C19806.m45029("ۗۜ") ^ i9) * (-5);
                        i10 = ((iM450210 ^ i8) * (-1043)) ^ 1265264825;
                        i5 = 1103880044;
                        i11 = iM450210 ^ i5;
                        viewOnClickListenerC8583 = this;
                    } else {
                        iM11306 = C19806.m45029("ܽ۠") ^ i9;
                        i = ((iM11306 ^ i8) * (-14883)) ^ (-1519404668);
                        i2 = -1622016114;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case 418227257:
                case 623643278:
                    if (activityC9994.f34139.m29823() > viewOnClickListenerC8583.f29679.m42727()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۗ") ^ i8;
                        i = ((iM11306 ^ i9) * (-32427)) ^ 321225967;
                        i2 = -463602010;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۤ") ^ i8;
                        i = ((iM11306 ^ i9) * 5021) ^ 779763834;
                        i2 = 1126217558;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 655687265:
                case 1107435745:
                    iM113011 = ThreadFactoryC3888.m11306(C0629.m2906(f29676, 38, 3, i14));
                    if (C7105.m18985()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i8) * (-13);
                        i = ((iM11306 ^ i9) * (-26373)) ^ (-1213978298);
                        i2 = -989269498;
                    } else {
                        iM11306 = (C19806.m45029("۟֫") ^ i9) * (-49);
                        i = ((iM11306 ^ i8) * 20567) ^ (-2105397351);
                        i2 = 810835158;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case 724832678:
                case 1685996915:
                    i14 = 42077;
                    iM11306 = C19806.m45029("ۢ֫") ^ i9;
                    i = ((iM11306 ^ i8) * 29677) ^ 746086797;
                    i2 = -2117886009;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                default:
                    C1460.m5055(c8067M3751, 2128649442 ^ iM113011, onClickListener);
                    sArr4 = f29676;
                    if (C0526.f2219) {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۘܰ")) * (-7);
                        i = ((iM11306 ^ i8) * 13455) ^ (-40015503);
                        i2 = 109463543;
                    } else {
                        iM11306 = C19806.m45029("ۨᩳ") ^ i8;
                        i = ((iM11306 ^ i9) * (-1683)) ^ (-599309699);
                        i2 = -632083362;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f7 A[PHI: r6 r11
      0x00f7: PHI (r6v5 android.content.DialogInterface$OnClickListener) = 
      (r6v3 android.content.DialogInterface$OnClickListener)
      (r6v2 android.content.DialogInterface$OnClickListener)
      (r6v2 android.content.DialogInterface$OnClickListener)
      (r6v2 android.content.DialogInterface$OnClickListener)
      (r6v2 android.content.DialogInterface$OnClickListener)
     binds: [B:29:0x00f5, B:19:0x0099, B:105:0x00f7, B:13:0x008b, B:104:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r11v6 java.lang.String) = 
      (r11v4 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
     binds: [B:29:0x00f5, B:19:0x0099, B:105:0x00f7, B:13:0x008b, B:104:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0293 A[PHI: r2 r3 r18 r19 r20
      0x0293: PHI (r2v10 l.ۤۖۘ) = (r2v4 l.ۤۖۘ), (r2v6 l.ۤۖۘ), (r2v2 l.ۤۖۘ) binds: [B:56:0x0291, B:44:0x01c9, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r3v4 l.۠ۡۜ) = (r3v3 l.۠ۡۜ), (r3v2 l.۠ۡۜ), (r3v2 l.۠ۡۜ) binds: [B:56:0x0291, B:44:0x01c9, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:56:0x0291, B:44:0x01c9, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:56:0x0291, B:44:0x01c9, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r20v4 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:56:0x0291, B:44:0x01c9, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m22364() {
        int iM45029;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int iM450210;
        int i4;
        int i5;
        int iM450211;
        int i6;
        int i7;
        int i8 = C3577.f13150;
        int i9 = C2642.f10294;
        int iM450212 = (C19806.m45029("᩹᩶") + i9) * 35;
        int i10 = ((iM450212 ^ i8) * (-9191)) ^ (-1274967529);
        DialogInterface.OnClickListener onClickListener = null;
        String strM10901 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM450212 ^ 823782777;
        int i12 = 0;
        int iM450213 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int iM11306 = 0;
        int i18 = 493523480;
        int i19 = 0;
        Object[] objArr = null;
        StringBuilder sb = null;
        C8067 c8067M3751 = null;
        ActivityC9994 activityC9994 = null;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i8) * 3909) >> 31));
            switch (i18) {
                case -2031424530:
                case -1008442890:
                    C1148.m4223(sb, this.f29679.m42741());
                    if (C2642.f10294 > 0) {
                        iM45029 = (C19806.m45029("᩸᩻") ^ i8) * (-19);
                        i = ((iM45029 ^ i9) * (-19701)) ^ (-1860590162);
                        i2 = 529780310;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        activityC9994 = activityC9994;
                        i3 = i16;
                        i17 = i17;
                        sArr = sArr2;
                        int iM450214 = (C19806.m45029("᩹۠") + i8) * (-99);
                        short[] sArr5 = sArr;
                        i10 = ((iM450214 ^ i9) * (-8367)) ^ 1676024564;
                        int i20 = iM450214 ^ 286000450;
                        sArr2 = sArr5;
                        i17 = i17;
                        i16 = i3;
                        activityC9994 = activityC9994;
                        i11 = i20;
                    }
                    break;
                case -2012388007:
                case -484210550:
                    i14 = 31840;
                    iM450211 = ThreadFactoryC3888.m11306("ۨۡ") ^ i9;
                    i4 = ((iM450211 ^ i8) * (-5869)) ^ 830246151;
                    i6 = 435184276;
                    i7 = iM450211 ^ i6;
                    sArr2 = sArr2;
                    i17 = i17;
                    ActivityC9994 activityC9995 = activityC9994;
                    i11 = i7;
                    i10 = i4;
                    activityC9994 = activityC9995;
                    break;
                case -1658401466:
                case -894240218:
                    objArr = new Object[]{C2124.m6674(sb)};
                    sArr3 = f29676;
                    if (C3577.f13150 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i9;
                        i = ((iM45029 ^ i8) * (-13643)) ^ (-631072171);
                        i2 = 608262221;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        activityC9994 = activityC9994;
                        i3 = i16;
                        i17 = i17;
                        sArr = sArr2;
                        int iM450215 = (C19806.m45029("᩹۠") + i8) * (-99);
                        short[] sArr6 = sArr;
                        i10 = ((iM450215 ^ i9) * (-8367)) ^ 1676024564;
                        int i21 = iM450215 ^ 286000450;
                        sArr2 = sArr6;
                        i17 = i17;
                        i16 = i3;
                        activityC9994 = activityC9994;
                        i11 = i21;
                    }
                    break;
                case -1645308367:
                case 1599698305:
                    activityC9994 = activityC9994;
                    i3 = i16;
                    i17 = i17;
                    sArr = sArr2;
                    iM11306 = ThreadFactoryC3888.m11306(C1668.m5577(sArr, i3, i17, i14));
                    i19 = 2121954405;
                    if (RunnableC0195.f1321 < 0) {
                        sArr2 = sArr;
                        iM450211 = (i9 - C19806.m45029("۠۠")) * (-117);
                        i16 = i3;
                        i4 = ((iM450211 ^ i8) * (-14865)) ^ 1149560467;
                        i6 = -2139313196;
                        i7 = iM450211 ^ i6;
                        sArr2 = sArr2;
                        i17 = i17;
                        ActivityC9994 activityC9996 = activityC9994;
                        i11 = i7;
                        i10 = i4;
                        activityC9994 = activityC9996;
                    } else {
                        int iM450216 = (C19806.m45029("᩹۠") + i8) * (-99);
                        short[] sArr7 = sArr;
                        i10 = ((iM450216 ^ i9) * (-8367)) ^ 1676024564;
                        int i22 = iM450216 ^ 286000450;
                        sArr2 = sArr7;
                        i17 = i17;
                        i16 = i3;
                        activityC9994 = activityC9994;
                        i11 = i22;
                    }
                    break;
                case -1571452104:
                case 1940556895:
                    C1066.m4025(c8067M3751, ThreadFactoryC3888.m11306(C0526.m2424(sArr4, i15, i12, i14)) ^ 2122037725, null);
                    C2704.m8239(c8067M3751);
                    break;
                case -1229853638:
                case 237569194:
                    activityC9994 = activityC9994;
                    C0050.m933(c8067M3751, iM11306 ^ i19);
                    sb = new StringBuilder();
                    C1148.m4223(sb, this.f29679.m42743());
                    if (RunnableC3388.f12514 >= 0) {
                        iM450210 = C19806.m45029("᩹ۡ") ^ i9;
                        i4 = ((iM450210 ^ i8) * 3941) ^ (-2079345361);
                        i5 = -710117844;
                    } else {
                        iM450210 = C19806.m45029("ۡܶ") ^ i8;
                        i4 = ((iM450210 ^ i9) * 7569) ^ (-919617370);
                        i5 = -1001276868;
                    }
                    i7 = iM450210 ^ i5;
                    ActivityC9994 activityC9997 = activityC9994;
                    i11 = i7;
                    i10 = i4;
                    activityC9994 = activityC9997;
                    break;
                case -1123553834:
                case 1043719829:
                    i14 = 57149;
                    iM450211 = ThreadFactoryC3888.m11306("ۨۡ") ^ i9;
                    i4 = ((iM450211 ^ i8) * (-5869)) ^ 830246151;
                    i6 = 435184276;
                    i7 = iM450211 ^ i6;
                    sArr2 = sArr2;
                    i17 = i17;
                    ActivityC9994 activityC9998 = activityC9994;
                    i11 = i7;
                    i10 = i4;
                    activityC9994 = activityC9998;
                    break;
                case -1087689016:
                case -1043213876:
                    activityC9994 = activityC9994;
                    i17 = i17;
                    sArr2 = sArr2;
                    int i23 = s + s2;
                    if ((39988 * s) - (i23 * i23) > 0) {
                        iM450211 = (i8 - ThreadFactoryC3888.m11306("ܿ֫")) * (-29);
                        i4 = ((iM450211 ^ i9) * 24373) ^ 476371544;
                        i6 = 1223456160;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ۢۖ") ^ i8;
                        i4 = ((iM450211 ^ i9) * 20405) ^ 2110178578;
                        i6 = 314637118;
                    }
                    i7 = iM450211 ^ i6;
                    sArr2 = sArr2;
                    i17 = i17;
                    ActivityC9994 activityC9999 = activityC9994;
                    i11 = i7;
                    i10 = i4;
                    activityC9994 = activityC9999;
                    break;
                case -1046054388:
                case 810766832:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1875.f7103 < 0) {
                        activityC9994 = activityC9994;
                        i17 = i17;
                        sArr2 = sArr2;
                        iM450211 = C19806.m45029("ۢᩳ") ^ i9;
                        i4 = ((iM450211 ^ i8) * (-29503)) ^ (-1470009128);
                        i6 = 1584118783;
                        i7 = iM450211 ^ i6;
                        sArr2 = sArr2;
                        i17 = i17;
                        ActivityC9994 activityC99910 = activityC9994;
                        i11 = i7;
                        i10 = i4;
                        activityC9994 = activityC99910;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۛۡ")) * 13;
                        i = ((iM45029 ^ i9) * (-7131)) ^ (-315213276);
                        i2 = -1463882554;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    }
                    break;
                case -987226252:
                case 1106259476:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۛۡ")) * 13;
                        i = ((iM45029 ^ i9) * (-7131)) ^ (-315213276);
                        i2 = -1463882554;
                    } else {
                        iM45029 = (i8 - C19806.m45029("֡ۨ")) * (-63);
                        i = ((iM45029 ^ i9) * (-22375)) ^ 273860309;
                        i2 = -1901809081;
                    }
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case -910312608:
                case 1587291162:
                    activityC9994 = activityC9994;
                    C2788.m8480(sb, RunnableC0195.m1429(f29676, 14, 1, i14));
                    if (C3577.f13150 < 0) {
                        iM450210 = (i9 - C19806.m45029("ۛۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM450210 ^ i8) * 30381) ^ (-1564572207);
                        i5 = 1996481712;
                        i7 = iM450210 ^ i5;
                        ActivityC9994 activityC99911 = activityC9994;
                        i11 = i7;
                        i10 = i4;
                        activityC9994 = activityC99911;
                    } else {
                        activityC9994 = activityC9994;
                        iM45029 = (i8 - C19806.m45029("֡ۨ")) * (-63);
                        i = ((iM45029 ^ i9) * (-22375)) ^ 273860309;
                        i2 = -1901809081;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    }
                    break;
                case -902547554:
                case -604031884:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1066.m4023();
                    iM45029 = (i8 - ThreadFactoryC3888.m11306("ۛۡ")) * 13;
                    i = ((iM45029 ^ i9) * (-7131)) ^ (-315213276);
                    i2 = -1463882554;
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case -488988745:
                case 1955518719:
                    C1460.m5055(c8067M3751, ThreadFactoryC3888.m11306(strM10901) ^ 2125454254, onClickListener);
                    sArr4 = f29676;
                    i15 = 21;
                    i12 = 3;
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܶܿ")) * (-3);
                        i = ((iM45029 ^ i8) * (-21597)) ^ (-7616547);
                        i2 = -761607694;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        activityC9994 = activityC9994;
                        i17 = i17;
                        sArr2 = sArr2;
                        iM450211 = C19806.m45029("ۢᩳ") ^ i9;
                        i4 = ((iM450211 ^ i8) * (-29503)) ^ (-1470009128);
                        i6 = 1584118783;
                        i7 = iM450211 ^ i6;
                        sArr2 = sArr2;
                        i17 = i17;
                        ActivityC9994 activityC99912 = activityC9994;
                        i11 = i7;
                        i10 = i4;
                        activityC9994 = activityC99912;
                    }
                    break;
                case 107725911:
                case 570249184:
                    activityC9994 = this.f29680;
                    c8067M3751 = C0962.m3751(activityC9994);
                    sArr2 = f29676;
                    i16 = 11;
                    i17 = 3;
                    if (C3577.m10565()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֫") ^ i8;
                        i = ((iM45029 ^ i9) * 18411) ^ 986537348;
                        i2 = 119598487;
                    } else {
                        iM45029 = (i8 - C19806.m45029("֡ۨ")) * (-63);
                        i = ((iM45029 ^ i9) * (-22375)) ^ 273860309;
                        i2 = -1901809081;
                    }
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case 430563227:
                case 1004196450:
                    iM450213 = C19806.m45029(C1875.m6105(sArr3, 15, 3, i14));
                    i13 = 2126970832;
                    iM45029 = ThreadFactoryC3888.m11306("֡ܺ") ^ i9;
                    i = ((iM45029 ^ i8) * (-19563)) ^ 1725879686;
                    i2 = -1793125854;
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case 495926975:
                case 548566345:
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.۠ۖۘ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i24) {
                            int i25 = 1430293084;
                            int i26 = C1419.f5860;
                            int i27 = C3722.f13525;
                            int iM450217 = (C19806.m45029("ۤۘ") ^ i26) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            int i28 = ((iM450217 ^ i27) * 1357) ^ 1005124118;
                            int i29 = 1726953131;
                            while (true) {
                                i25 = ((((i25 ^ i27) * (-741)) >> 31) & i28) ^ (iM450217 ^ i29);
                                switch (i25) {
                                    case -2142724447:
                                    case -206911415:
                                        ViewOnClickListenerC8583.m22361(this.f25912);
                                        break;
                                    case -2013678505:
                                    case 544573123:
                                        if (C1419.f5860 >= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ᩴۗ") + i26) * 15;
                                            i28 = ((iM450217 ^ i27) * (-21293)) ^ (-1526193945);
                                            i29 = 298888873;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("᩷ۗ") ^ i27;
                                            i28 = ((iM450217 ^ i26) * 9165) ^ 134339981;
                                            i29 = 1329060998;
                                        }
                                        break;
                                    case -1854102923:
                                    case 2037206221:
                                        if (C1461.f5957 <= 0) {
                                            iM450217 = ThreadFactoryC3888.m11306("᩹۫") ^ i27;
                                            i28 = ((iM450217 ^ i26) * (-1855)) ^ 836342379;
                                            i29 = 1292974364;
                                        } else {
                                            iM450217 = (i26 - ThreadFactoryC3888.m11306("֡᩹")) * (-85);
                                            i28 = ((iM450217 ^ i27) * 28495) ^ (-882919904);
                                            i29 = -1780080511;
                                        }
                                        break;
                                    case -1790857254:
                                    case -898427274:
                                        C1875.m6086();
                                        C1398.m4895();
                                        iM450217 = (C19806.m45029("ᩳ֡") ^ i27) * (-37);
                                        i28 = ((iM450217 ^ i26) * 10911) ^ 341562307;
                                        i29 = 1275454352;
                                        break;
                                    case -1611954891:
                                    case 292315991:
                                        if (C1066.f4915 <= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۤۚ") + i26) * (-125);
                                            i28 = ((iM450217 ^ i27) * (-32129)) ^ 1071111887;
                                            i29 = -173766013;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("ۨᩴ") ^ i26;
                                            i28 = ((iM450217 ^ i27) * (-21187)) ^ 963360219;
                                            i29 = 575680171;
                                        }
                                        break;
                                    case -1193533931:
                                    case 1618121741:
                                        if (C0526.f2219) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۤۚ") + i26) * (-125);
                                            i28 = ((iM450217 ^ i27) * (-32129)) ^ 1071111887;
                                            i29 = -173766013;
                                        } else {
                                            iM450217 = C19806.m45029("ۨۢ") ^ i26;
                                            i28 = ((iM450217 ^ i27) * 29425) ^ (-467466892);
                                            i29 = -548446090;
                                        }
                                        break;
                                    case -810360217:
                                    case -728272278:
                                        if (C3660.f13403 >= 0) {
                                            iM450217 = C19806.m45029("᩵ᩴ") ^ i26;
                                            i28 = ((iM450217 ^ i27) * (-7589)) ^ 1952272137;
                                            i29 = 927429031;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۜۘ") ^ i27) * 71;
                                            i28 = ((iM450217 ^ i26) * 10125) ^ 345057880;
                                            i29 = -428131157;
                                        }
                                        break;
                                    case -655815092:
                                    case -520625515:
                                        C0962.m3746();
                                        break;
                                    case -488360382:
                                    case 1027013934:
                                        if (!C1377.f5749) {
                                            iM450217 = ThreadFactoryC3888.m11306("᩹۫") ^ i27;
                                            i28 = ((iM450217 ^ i26) * (-1855)) ^ 836342379;
                                            i29 = 1292974364;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("ۤۚ") + i26) * (-125);
                                            i28 = ((iM450217 ^ i27) * (-32129)) ^ 1071111887;
                                            i29 = -173766013;
                                        }
                                        break;
                                    case -425345286:
                                    case -135211171:
                                        if (C0629.f2722 <= 0) {
                                            iM450217 = C19806.m45029("᩵ᩴ") ^ i26;
                                            i28 = ((iM450217 ^ i27) * (-7589)) ^ 1952272137;
                                            i29 = 927429031;
                                        } else {
                                            iM450217 = C19806.m45029("۟᩻") ^ i27;
                                            i28 = ((iM450217 ^ i26) * (-11287)) ^ (-683155676);
                                            i29 = 1158433963;
                                        }
                                        break;
                                    case -330065352:
                                    case 183481846:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ᩴۗ") + i26) * 15;
                                            i28 = ((iM450217 ^ i27) * (-21293)) ^ (-1526193945);
                                            i29 = 298888873;
                                        } else {
                                            iM450217 = (C19806.m45029("ܺᩴ") + i27) * (-41);
                                            i28 = ((iM450217 ^ i26) * 11007) ^ (-258783430);
                                            i29 = -440245531;
                                        }
                                        break;
                                    case -181498732:
                                    case 1774000688:
                                        if (C2332.m7079() <= 0) {
                                            iM450217 = C19806.m45029("᩵ᩴ") ^ i26;
                                            i28 = ((iM450217 ^ i27) * (-7589)) ^ 1952272137;
                                            i29 = 927429031;
                                        } else {
                                            iM450217 = (i27 - ThreadFactoryC3888.m11306("᩷ܳ")) * (-111);
                                            i28 = ((iM450217 ^ i26) * (-12865)) ^ 1911838756;
                                            i29 = 785384299;
                                        }
                                        break;
                                    case -138216051:
                                    case 1751922004:
                                        if (C1875.f7103 < 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ᩴۗ") + i26) * 15;
                                            i28 = ((iM450217 ^ i27) * (-21293)) ^ (-1526193945);
                                            i29 = 298888873;
                                        } else {
                                            iM450217 = (C19806.m45029("ᩳ֡") ^ i27) * (-37);
                                            i28 = ((iM450217 ^ i26) * 10911) ^ 341562307;
                                            i29 = 1275454352;
                                        }
                                        break;
                                    case 353013081:
                                    case 459444841:
                                        if (ThreadFactoryC3888.m11300() <= 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("ᩴۗ") + i26) * 15;
                                            i28 = ((iM450217 ^ i27) * (-21293)) ^ (-1526193945);
                                            i29 = 298888873;
                                        } else {
                                            iM450217 = C19806.m45029("ۛ᩶") ^ i26;
                                            i28 = ((iM450217 ^ i27) * 8091) ^ 1320204989;
                                            i29 = -1138885199;
                                        }
                                        break;
                                    case 902850410:
                                    case 1170944851:
                                        if (C1398.f5802 > 0) {
                                            iM450217 = ThreadFactoryC3888.m11306("᩹۫") ^ i27;
                                            i28 = ((iM450217 ^ i26) * (-1855)) ^ 836342379;
                                            i29 = 1292974364;
                                        } else {
                                            iM450217 = (C19806.m45029("ᩳ֡") ^ i27) * (-37);
                                            i28 = ((iM450217 ^ i26) * 10911) ^ 341562307;
                                            i29 = 1275454352;
                                        }
                                        break;
                                    default:
                                        if (C2477.m7593() >= 0) {
                                            iM450217 = ThreadFactoryC3888.m11306("᩹۫") ^ i27;
                                            i28 = ((iM450217 ^ i26) * (-1855)) ^ 836342379;
                                            i29 = 1292974364;
                                        } else {
                                            iM450217 = (C19806.m45029("ۙۚ") ^ i26) * 97;
                                            i28 = ((iM450217 ^ i27) * (-29095)) ^ 48005364;
                                            i29 = 1046304284;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    strM10901 = C3722.m10901(f29676, 18, 3, i14);
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۛۡ")) * 13;
                        i = ((iM45029 ^ i9) * (-7131)) ^ (-315213276);
                        i2 = -1463882554;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۜ") ^ i8;
                        i = ((iM45029 ^ i9) * 5169) ^ (-1075968186);
                        i2 = 2014635747;
                    }
                    i11 = iM45029 ^ i2;
                    i10 = i;
                    break;
                case 1334606925:
                case 1672244124:
                    activityC9994 = activityC9994;
                    i17 = i17;
                    sArr2 = sArr2;
                    s = f29676[10];
                    s2 = 9997;
                    if (C0962.f3784) {
                        iM450211 = C19806.m45029("ۢᩳ") ^ i9;
                        i4 = ((iM450211 ^ i8) * (-29503)) ^ (-1470009128);
                        i6 = 1584118783;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i9;
                        i4 = ((iM450211 ^ i8) * (-13859)) ^ (-1469078189);
                        i6 = -1598853288;
                    }
                    i7 = iM450211 ^ i6;
                    sArr2 = sArr2;
                    i17 = i17;
                    ActivityC9994 activityC99913 = activityC9994;
                    i11 = i7;
                    i10 = i4;
                    activityC9994 = activityC99913;
                    break;
                case 1762517931:
                case 1874167704:
                    if (RunnableC1895.m6170() == 0) {
                        activityC9994 = activityC9994;
                        iM450210 = C19806.m45029("᩹ۡ") ^ i9;
                        i4 = ((iM450210 ^ i8) * 3941) ^ (-2079345361);
                        i5 = -710117844;
                        i7 = iM450210 ^ i5;
                        ActivityC9994 activityC99914 = activityC9994;
                        i11 = i7;
                        i10 = i4;
                        activityC9994 = activityC99914;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۛۡ")) * 13;
                        i = ((iM45029 ^ i9) * (-7131)) ^ (-315213276);
                        i2 = -1463882554;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1842110388:
                case 1960826575:
                    C3577.m10565();
                    break;
                default:
                    C0671.m3015(c8067M3751, C1875.m6104(activityC9994, iM450213 ^ i13, objArr));
                    if (C2642.m8171() == 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۡ") ^ i8) * 115;
                        i = ((iM45029 ^ i9) * (-751)) ^ (-1624679371);
                        i2 = -1427351328;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        activityC9994 = activityC9994;
                        i3 = i16;
                        i17 = i17;
                        sArr = sArr2;
                        int iM450217 = (C19806.m45029("᩹۠") + i8) * (-99);
                        short[] sArr8 = sArr;
                        i10 = ((iM450217 ^ i9) * (-8367)) ^ 1676024564;
                        int i24 = iM450217 ^ 286000450;
                        sArr2 = sArr8;
                        i17 = i17;
                        i16 = i3;
                        activityC9994 = activityC9994;
                        i11 = i24;
                    }
                    break;
            }
            return;
        }
    }
}
