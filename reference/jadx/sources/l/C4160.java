package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 650G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4160 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static WeakReference f15198;

    /* JADX INFO: renamed from: ܽᩳ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f15199 = {9528, 580, 578, 599, 576, 576, 584, 576, 587, 593, 523, 593, 605, 593, 532, 532, 532, 559, 12853, 22383, 3894, -32041, -18644, -32512, -17516, 17352, 22973, -31138, 19384, -20563, 17182, -21425, -20303, -20776, 6323, -15998, -11806, -12343, 13729, -16056, -12727, 12914, -15306, -4176};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SpannableStringBuilder f15200;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f15201;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f15202;

    /* JADX WARN: Code duplicated, block: B:24:0x00ba A[PHI: r7
      0x00ba: PHI (r7v6 int) = (r7v4 int), (r7v2 int), (r7v2 int) binds: [B:23:0x00b8, B:11:0x006d, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01f0 A[PHI: r9 r10 r11 r14 r15 r22
      0x01f0: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01ee, B:43:0x0193, B:31:0x0125, B:17:0x0090, B:14:0x0076, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:51:0x01ee, B:43:0x0193, B:31:0x0125, B:17:0x0090, B:14:0x0076, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:51:0x01ee, B:43:0x0193, B:31:0x0125, B:17:0x0090, B:14:0x0076, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:51:0x01ee, B:43:0x0193, B:31:0x0125, B:17:0x0090, B:14:0x0076, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:51:0x01ee, B:43:0x0193, B:31:0x0125, B:17:0x0090, B:14:0x0076, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r22v7 short[]) = (r22v6 short[]), (r22v3 short[]), (r22v3 short[]), (r22v3 short[]), (r22v3 short[]), (r22v3 short[]) binds: [B:51:0x01ee, B:43:0x0193, B:31:0x0125, B:17:0x0090, B:14:0x0076, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0064, code lost:
    
        if (l.RunnableC0195.f1321 >= 0) goto L24;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m11806(l.C4160 r23) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4160.m11806(l.ۘ᩶ۘ):void");
    }

    public C4160(AbstractActivityC12483 abstractActivityC12483) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int i4;
        SpannableStringBuilder spannableStringBuilder;
        int i5 = C10634.f36300;
        int i6 = RunnableC0195.f1321;
        short s = f15199[0];
        int i7 = (s * 2) + 1;
        int i8 = s + 1;
        int i9 = i7 - (i8 * i8) > 0 ? 56080 : 549;
        int iM11307 = (ThreadFactoryC3888.m11306("᩻᩶") + i5) * 87;
        int i10 = ((iM11307 ^ i6) * 8867) ^ 831073207;
        String strM18991 = null;
        int i11 = iM11307 ^ 274996636;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean zM6911 = false;
        int iM9702 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iM9703 = 0;
        boolean zM4899 = false;
        int i15 = -99820216;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        String line = null;
        BufferedReader bufferedReader3 = null;
        int i16 = i10;
        int i17 = 0;
        while (true) {
            i15 = i11 ^ (i16 & (((i15 ^ i6) * (-27081)) >> 31));
            switch (i15) {
                case -2113804992:
                case -373470561:
                    i = i14;
                    if (iM9702 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܺ") ^ i6;
                        i2 = ((iM11306 ^ i5) * 21243) ^ (-1951925475);
                        i3 = -1748723255;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i5;
                        i2 = ((iM11306 ^ i6) * 28475) ^ (-557383921);
                        i3 = 550806059;
                    }
                    int i18 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i18;
                    i16 = i2;
                    break;
                case -2047088043:
                case 547066795:
                    i = i14;
                    this.f15200 = spannableStringBuilder2;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("ܳۘ")) * 23;
                    i2 = ((iM11306 ^ i6) * 13773) ^ 1966656157;
                    i3 = -458118433;
                    int i19 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i19;
                    i16 = i2;
                    break;
                case -2017838501:
                case -1979929348:
                    i = i14;
                    try {
                        spannableStringBuilder2 = new SpannableStringBuilder();
                        try {
                            i4 = i17;
                            try {
                                spannableStringBuilder = spannableStringBuilder2;
                                try {
                                    bufferedReader2 = new BufferedReader(new InputStreamReader(abstractActivityC12483.getAssets().open(C2704.m8240(f15199, 1, 13, i9)), StandardCharsets.UTF_8));
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    int iM45029 = C19806.m45029("ۗܽ") ^ i6;
                                    i16 = ((iM45029 ^ i5) * 8003) ^ (-2075280533);
                                    i14 = i;
                                    bufferedReader3 = bufferedReader3;
                                    i11 = iM45029 ^ (-755525664);
                                } catch (IOException unused) {
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    bufferedReader2 = null;
                                    i14 = i;
                                    bufferedReader3 = bufferedReader;
                                    int iM11308 = ThreadFactoryC3888.m11306("ۧۙ") ^ i6;
                                    i16 = ((iM11308 ^ i5) * (-31243)) ^ 333435231;
                                    i11 = iM11308 ^ 1143347535;
                                }
                            } catch (IOException unused2) {
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                        } catch (IOException unused3) {
                            i4 = i17;
                        }
                    } catch (IOException unused4) {
                        i4 = i17;
                        spannableStringBuilder2 = null;
                    }
                    i17 = i4;
                    break;
                case -1613536073:
                case -123323635:
                    int i20 = i14;
                    C0797.m3349(spannableStringBuilder2, C10634.m26821(f15199, 14, 3, i9));
                    try {
                        try {
                            ThreadFactoryC3888.m11309(spannableStringBuilder2, new ForegroundColorSpan(0), MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder2) - 3, C1461.m5086(spannableStringBuilder2), 17);
                            int iM5086 = C1461.m5086(spannableStringBuilder2);
                            try {
                                C1025.m3865(spannableStringBuilder2, strM18991);
                                iM9703 = MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder2);
                                zM4899 = C1398.m4899(strM18991, C3577.m10571(f15199, 18, 1, i9));
                                int iM11309 = ThreadFactoryC3888.m11306("ܺۘ") ^ i6;
                                i11 = iM11309 ^ 1292458876;
                                i14 = iM5086;
                                i16 = ((iM11309 ^ i5) * (-28595)) ^ 915409430;
                                i12 = 0;
                                i13 = 17;
                            } catch (IOException unused5) {
                                i14 = iM5086;
                                i12 = 0;
                                i13 = 17;
                                i4 = i17;
                                bufferedReader3 = bufferedReader2;
                                int iM113010 = ThreadFactoryC3888.m11306("ۧۙ") ^ i6;
                                i16 = ((iM113010 ^ i5) * (-31243)) ^ 333435231;
                                i11 = iM113010 ^ 1143347535;
                                i17 = i4;
                            }
                        } catch (IOException unused6) {
                            i14 = i20;
                        }
                    } catch (IOException unused7) {
                        i14 = i20;
                        i12 = 0;
                    }
                    break;
                case -1565611315:
                case 1931659001:
                    try {
                        C19806.m45018(spannableStringBuilder2, new RelativeSizeSpan(1.1f), i14, iM9703, i13);
                        C19806.m45018(spannableStringBuilder2, new StyleSpan(i17), i14, iM9703, i13);
                        try {
                            i = i14;
                            try {
                                C0797.m3349(spannableStringBuilder2, C7105.m18989(f15199, 19, 1, i9));
                                int i21 = iM9703 + 1;
                                C19806.m45018(spannableStringBuilder2, new ForegroundColorSpan(i12), iM9703, i21, i13);
                                ThreadFactoryC3888.m11309(spannableStringBuilder2, new RelativeSizeSpan(1.5f), iM9703, i21, i13);
                                C19806.m45018(spannableStringBuilder2, new StyleSpan(i17), iM9703, i21, i13);
                                i4 = i17;
                                int iM450210 = C19806.m45029("ۗܽ") ^ i6;
                                i16 = ((iM450210 ^ i5) * 8003) ^ (-2075280533);
                                i14 = i;
                                bufferedReader3 = bufferedReader3;
                                i11 = iM450210 ^ (-755525664);
                            } catch (IOException unused8) {
                                i14 = i;
                                i4 = i17;
                                bufferedReader3 = bufferedReader2;
                                int iM113011 = ThreadFactoryC3888.m11306("ۧۙ") ^ i6;
                                i16 = ((iM113011 ^ i5) * (-31243)) ^ 333435231;
                                i11 = iM113011 ^ 1143347535;
                            }
                        } catch (IOException unused9) {
                            i = i14;
                        }
                    } catch (IOException unused10) {
                    }
                    i17 = i4;
                    break;
                case -1460527185:
                case -744232204:
                    i = i14;
                    if (line != null) {
                        iM11306 = C19806.m45029("ܶ֡") ^ i5;
                        i2 = ((iM11306 ^ i6) * 27849) ^ (-45687039);
                        i3 = -866067006;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩶") + i6) * 123;
                        i2 = ((iM11306 ^ i5) * 28299) ^ 1247296362;
                        i3 = 1018124290;
                    }
                    int i110 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i110;
                    i16 = i2;
                    break;
                case -1439333784:
                case 1935983746:
                    i = i14;
                    strM18991 = C7105.m18991(line);
                    zM6911 = C2249.m6911(strM18991);
                    iM11306 = (i6 - ThreadFactoryC3888.m11306("ܳ᩵")) * 27;
                    i2 = ((iM11306 ^ i5) * 11655) ^ 162963129;
                    i3 = -1744591128;
                    int i111 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i111;
                    i16 = i2;
                    break;
                case -1347054198:
                case -71967274:
                    i17 = 1;
                    this.f15201 = true;
                    this.f15202 = abstractActivityC12483;
                    bufferedReader = null;
                    int iM450211 = (C19806.m45029("ۜۜ") ^ i5) * 47;
                    i16 = ((iM450211 ^ i6) * 23959) ^ 921519933;
                    i14 = i14;
                    bufferedReader3 = bufferedReader3;
                    i11 = iM450211 ^ (-1770426754);
                    break;
                case -1277953002:
                case 764077339:
                    i = i14;
                    iM9702 = MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder2);
                    iM11306 = ThreadFactoryC3888.m11306("ۨۧ") ^ i5;
                    i2 = ((iM11306 ^ i6) * (-30315)) ^ 1203932940;
                    i3 = 1023788500;
                    int i112 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i112;
                    i16 = i2;
                    break;
                case -1003403846:
                case -546250685:
                    i = i14;
                    if (!zM6911) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ܺ") ^ i6) * (-123);
                        i2 = ((iM11306 ^ i5) * (-18941)) ^ (-194633633);
                        i3 = 1697564854;
                        int i113 = iM11306 ^ i3;
                        i14 = i;
                        i11 = i113;
                        i16 = i2;
                    } else {
                        i4 = i17;
                        int iM450212 = C19806.m45029("ۗܽ") ^ i6;
                        i16 = ((iM450212 ^ i5) * 8003) ^ (-2075280533);
                        i14 = i;
                        bufferedReader3 = bufferedReader3;
                        i11 = iM450212 ^ (-755525664);
                        i17 = i4;
                    }
                    break;
                case -839931403:
                case 1576836493:
                    break;
                case -403500082:
                case 1197612387:
                    C1377.m4829(bufferedReader3);
                    break;
                case 39801956:
                case 1898093301:
                    i = i14;
                    line = bufferedReader2.readLine();
                    iM11306 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i5;
                    i2 = ((iM11306 ^ i6) * 22423) ^ 411708446;
                    i3 = 401987711;
                    int i114 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i114;
                    i16 = i2;
                    break;
                case 873567300:
                case 1055242203:
                    i = i14;
                    C0797.m3349(spannableStringBuilder2, C3577.m10571(f15199, 17, 1, i9));
                    iM11306 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i5;
                    i2 = ((iM11306 ^ i6) * 28475) ^ (-557383921);
                    i3 = 550806059;
                    int i115 = iM11306 ^ i3;
                    i14 = i;
                    i11 = i115;
                    i16 = i2;
                    break;
                default:
                    i = i14;
                    if (!zM4899) {
                        i4 = i17;
                        int iM450213 = C19806.m45029("ۗܽ") ^ i6;
                        i16 = ((iM450213 ^ i5) * 8003) ^ (-2075280533);
                        i14 = i;
                        bufferedReader3 = bufferedReader3;
                        i11 = iM450213 ^ (-755525664);
                        i17 = i4;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩵") ^ i5) * (-53);
                        i2 = ((iM11306 ^ i6) * (-30863)) ^ 876300348;
                        i3 = -775336938;
                        int i116 = iM11306 ^ i3;
                        i14 = i;
                        i11 = i116;
                        i16 = i2;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m11805(C4160 c4160) {
        AbstractActivityC12483 abstractActivityC12483 = null;
        String strM4784 = null;
        int i = -874700124;
        int i2 = C1668.f6641;
        int i3 = AbstractC0464.f2088;
        int iM45029 = C19806.m45029("ܶۢ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-8129)) ^ (-315150604);
        int i5 = 1148937448;
        while (true) {
            i = ((((i ^ i3) * 15523) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2052392978:
                case -137665657:
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("ܺܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16169) ^ (-693798751);
                        i5 = 1960917013;
                    } else {
                        iM45029 = (C19806.m45029("ܽܰ") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-30189)) ^ 1840367773;
                        i5 = -295977274;
                    }
                    break;
                case -1966464802:
                case -937431185:
                    ThreadFactoryC3888.m11300();
                    iM45029 = (C19806.m45029("ܽܰ") ^ i2) * 97;
                    i4 = ((iM45029 ^ i3) * (-30189)) ^ 1840367773;
                    i5 = -295977274;
                    break;
                case -1956277942:
                case 961862502:
                    C1189.m4368();
                    C1937.m6279();
                    break;
                case -1917226203:
                case 840069023:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ܺܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16169) ^ (-693798751);
                        i5 = 1960917013;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩺") ^ i2) * 49;
                        i4 = ((iM45029 ^ i3) * 2147) ^ (-1789630341);
                        i5 = -1720616077;
                    }
                    break;
                case -1491802957:
                case -675680103:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * 8291) ^ 1348124161;
                        i5 = 943705712;
                    } else {
                        iM45029 = (C19806.m45029("ܽܰ") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-30189)) ^ 1840367773;
                        i5 = -295977274;
                    }
                    break;
                case -1311739233:
                case 146166984:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ܿۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13223) ^ 1958810270;
                        i5 = -1347865815;
                    } else {
                        iM45029 = (C19806.m45029("֨ܿ") + i2) * 49;
                        i4 = ((iM45029 ^ i3) * 13447) ^ (-546119235);
                        i5 = 689163727;
                    }
                    break;
                case -889072486:
                case 1598150621:
                    ActivityC14082.m34069((Context) abstractActivityC12483, strM4784, true);
                    break;
                case -754880997:
                case -513116221:
                    abstractActivityC12483 = c4160.f15202;
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ۧܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13297) ^ (-133688123);
                        i5 = -40093512;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4349) ^ (-2082327410);
                        i5 = -374181875;
                    }
                    break;
                case -630982756:
                case 2020663576:
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("ܺܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16169) ^ (-693798751);
                        i5 = 1960917013;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩶") + i2) * (-107);
                        i4 = ((iM45029 ^ i3) * 21239) ^ 1370377308;
                        i5 = -927237303;
                    }
                    break;
                case -329636625:
                case 611196243:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20397)) ^ (-706278618);
                        i5 = -760500628;
                    } else {
                        iM45029 = C19806.m45029("ܿۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28531)) ^ (-2120144050);
                        i5 = -707058818;
                    }
                    break;
                case -59581667:
                case 1730875155:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۧܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13297) ^ (-133688123);
                        i5 = -40093512;
                    } else {
                        iM45029 = (C19806.m45029("᩺ܺ") + i2) * 73;
                        i4 = ((iM45029 ^ i3) * (-23755)) ^ (-1199659813);
                        i5 = 1519848550;
                    }
                    break;
                case 1121425790:
                case 1720070780:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20397)) ^ (-706278618);
                        i5 = -760500628;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20359) ^ (-145986257);
                        i5 = 776169049;
                    }
                    break;
                case 1156706853:
                case 1981876824:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۧܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13297) ^ (-133688123);
                        i5 = -40093512;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܳ") ^ i2) * 77;
                        i4 = ((iM45029 ^ i3) * (-2835)) ^ (-695143140);
                        i5 = -1414749868;
                    }
                    break;
                case 1242092778:
                case 1793460488:
                    if (C1066.f4915 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20397)) ^ (-706278618);
                        i5 = -760500628;
                    } else {
                        iM45029 = (C19806.m45029("ܽܰ") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-30189)) ^ 1840367773;
                        i5 = -295977274;
                    }
                    break;
                case 1720405210:
                case 1752078641:
                    strM4784 = C1355.m4784();
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("ܿۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13223) ^ 1958810270;
                        i5 = -1347865815;
                    } else {
                        iM45029 = (C19806.m45029("۬۟") ^ i3) * (-5);
                        i4 = ((iM45029 ^ i2) * 517) ^ 2102299272;
                        i5 = -1928185658;
                    }
                    break;
                default:
                    C1025.m3861();
                    if (!C0962.f3784) {
                        iM45029 = C19806.m45029("ۧܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13297) ^ (-133688123);
                        i5 = -40093512;
                    } else {
                        iM45029 = (C19806.m45029("ܽܰ") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * (-30189)) ^ 1840367773;
                        i5 = -295977274;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11808(RunnableC17277 runnableC17277) {
        int i = 1267681747;
        int i2 = C1398.f5802;
        int i3 = RunnableC0195.f1321;
        int iM45029 = C19806.m45029("᩺ۡ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-26991)) ^ (-1569142947);
        int i5 = 2047850288;
        while (true) {
            i = ((((i ^ i2) * 3349) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2123093568:
                case -2018059978:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6511)) ^ (-971403006);
                        i5 = -264307158;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩵") ^ i3) * (-45);
                        i4 = ((iM45029 ^ i2) * (-29783)) ^ 2091683717;
                        i5 = 822312390;
                    }
                    break;
                case -2115254737:
                case 340042191:
                    this.f15201 = false;
                    if (C0050.m946() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27403) ^ 2066120878;
                        i5 = 1781334423;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۛ") + i3) * (-51);
                        i4 = ((iM45029 ^ i2) * (-18523)) ^ (-1420520428);
                        i5 = -1537149961;
                    }
                    break;
                case -2021298607:
                case -37148994:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢۨ")) * 35;
                        i4 = ((iM45029 ^ i2) * (-23387)) ^ 270700623;
                        i5 = 1323622919;
                    } else {
                        iM45029 = C19806.m45029("ܶۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23739)) ^ 526706615;
                        i5 = -1436419490;
                    }
                    break;
                case -1902594602:
                case -1336768916:
                    if (C2788.m8472() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6511)) ^ (-971403006);
                        i5 = -264307158;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27403) ^ 2066120878;
                        i5 = 1781334423;
                    }
                    break;
                case -1838984467:
                case 687525312:
                    C0050.m946();
                    C0629.m2907();
                    iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i2;
                    i4 = ((iM45029 ^ i3) * 27403) ^ 2066120878;
                    i5 = 1781334423;
                    break;
                case -1796775690:
                case -548403663:
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6511)) ^ (-971403006);
                        i5 = -264307158;
                    } else {
                        iM45029 = C19806.m45029("ܰۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9935) ^ 1851811621;
                        i5 = -690161925;
                    }
                    break;
                case -1656381290:
                case -82015393:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢۨ")) * 35;
                        i4 = ((iM45029 ^ i2) * (-23387)) ^ 270700623;
                        i5 = 1323622919;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27311) ^ (-1446072028);
                        i5 = 1367705009;
                    }
                    break;
                case -640066876:
                case 618151552:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢۨ")) * 35;
                        i4 = ((iM45029 ^ i2) * (-23387)) ^ 270700623;
                        i5 = 1323622919;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֡") ^ i3) * (-3);
                        i4 = ((iM45029 ^ i2) * 3535) ^ 1292446447;
                        i5 = -875507564;
                    }
                    break;
                case -617906715:
                case -250852933:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("֨᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26997)) ^ (-446942597);
                        i5 = -1684217888;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢۨ")) * 35;
                        i4 = ((iM45029 ^ i2) * (-23387)) ^ 270700623;
                        i5 = 1323622919;
                    }
                    break;
                case -229601374:
                case 1316618548:
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬֨") ^ i2) * (-115);
                        i4 = ((iM45029 ^ i3) * (-4891)) ^ 1934122373;
                        i5 = -103927877;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6511)) ^ (-971403006);
                        i5 = -264307158;
                    }
                    break;
                case -6195473:
                case 1179735138:
                    if (C3577.f13150 < 0) {
                        int i6 = 0;
                        if (C1419.f5860 < 0) {
                            C0817.m3402(new RunnableC2749(i6, this, runnableC17277), 1000L);
                            return;
                        }
                        iM45029 = C19806.m45029("ۙ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26907) ^ 252295968;
                        i5 = -1517457685;
                    } else {
                        iM45029 = C19806.m45029("֨᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26997)) ^ (-446942597);
                        i5 = -1684217888;
                    }
                    break;
                case 42368524:
                case 809916102:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("ۙ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26907) ^ 252295968;
                        i5 = -1517457685;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10329)) ^ (-2037935924);
                        i5 = -804589441;
                    }
                    break;
                case 525515682:
                case 1094245328:
                    C3577.m10565();
                    C2477.m7593();
                    return;
                case 944357500:
                case 1944005292:
                    if (!C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27403) ^ 2066120878;
                        i5 = 1781334423;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢۨ")) * 35;
                        i4 = ((iM45029 ^ i2) * (-23387)) ^ 270700623;
                        i5 = 1323622919;
                    }
                    break;
                case 1558827510:
                case 1692010149:
                    if (this.f15201) {
                        iM45029 = (C19806.m45029("ۢܿ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * (-25675)) ^ 844945537;
                        i5 = -609898527;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܽ֨")) * 77;
                        i4 = ((iM45029 ^ i2) * 8207) ^ (-68407442);
                        i5 = 1907889718;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11807() {
        int i = 244355152;
        int i2 = C3535.f13026;
        int i3 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 7997) ^ (-1283325997);
        int i5 = 379412905;
        while (true) {
            i = ((((i ^ i2) * 4193) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1982331580:
                case -1420044195:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ۗᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13113)) ^ 608026772;
                        i5 = 1191351779;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29895)) ^ 623728088;
                        i5 = -747888994;
                    }
                    break;
                case -1940711370:
                case -1448875931:
                    if (this.f15201) {
                        iM11306 = (i3 - C19806.m45029("ۤۘ")) * (-127);
                        i4 = ((iM11306 ^ i2) * (-20137)) ^ (-1199768733);
                        i5 = 669245445;
                    } else {
                        iM11306 = C19806.m45029("᩷ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22305) ^ (-763832343);
                        i5 = -279002021;
                    }
                    break;
                case -1868233604:
                case 606421004:
                    C0817.m3399();
                    iM11306 = (C19806.m45029("ܿ᩷") ^ i2) * (-107);
                    i4 = ((iM11306 ^ i3) * 7157) ^ 1098017080;
                    i5 = -9149943;
                    break;
                case -1724659700:
                case -1375248915:
                    if (C2477.f9839 > 0) {
                        C0797.m3355(new RunnableC11923(0, this));
                        return;
                    }
                    iM11306 = C19806.m45029("ۗᩴ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-13113)) ^ 608026772;
                    i5 = 1191351779;
                    break;
                case -1440784740:
                case -75238253:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۜ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18831) ^ 492319233;
                        i5 = -764361059;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤᩳ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-17865)) ^ 2069934251;
                        i5 = -1170732177;
                    }
                    break;
                case -1329741049:
                case 1185671937:
                    throw new IllegalStateException();
                case -1287121159:
                case 326800986:
                    this.f15201 = false;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ܿ᩷") ^ i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 7157) ^ 1098017080;
                        i5 = -9149943;
                    } else {
                        iM11306 = C19806.m45029("ۛۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13389) ^ (-25092619);
                        i5 = -626769397;
                    }
                    break;
                case -900598348:
                case 544956029:
                    if (C7105.m18985()) {
                        iM11306 = (C19806.m45029("ܿ᩷") ^ i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 7157) ^ 1098017080;
                        i5 = -9149943;
                    } else {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21535)) ^ 888733091;
                        i5 = -730290698;
                    }
                    break;
                case -422937779:
                case 994017232:
                    C0216.m1591();
                    if (!C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤᩳ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-17865)) ^ 2069934251;
                        i5 = -1170732177;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩷") ^ i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 7157) ^ 1098017080;
                        i5 = -9149943;
                    }
                    break;
                case -369027715:
                case -286019085:
                    AbstractC0464.m2313();
                    if (!C2871.m8646()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30089)) ^ 278049424;
                        i5 = 2076547711;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩷") ^ i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 7157) ^ 1098017080;
                        i5 = -9149943;
                    }
                    break;
                case -79308745:
                case 634325585:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30089)) ^ 278049424;
                        i5 = 2076547711;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27729) ^ (-2017547253);
                        i5 = -189055108;
                    }
                    break;
                case 309899802:
                case 1437035618:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    return;
                case 417482625:
                case 972989698:
                    AbstractC0464.m2313();
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22661)) ^ 208827242;
                        i5 = -1577940614;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30089)) ^ 278049424;
                        i5 = 2076547711;
                    }
                    break;
                case 716134641:
                case 1080679224:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("ۗᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13113)) ^ 608026772;
                        i5 = 1191351779;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30871) ^ 542666060;
                        i5 = -1532567806;
                    }
                    break;
                case 1220370270:
                case 2100169915:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("֨֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22661)) ^ 208827242;
                        i5 = -1577940614;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛᩳ") + i2) * (-35);
                        i4 = ((iM11306 ^ i3) * (-8961)) ^ (-1394432591);
                        i5 = 778497647;
                    }
                    break;
                case 1320500394:
                case 1601356266:
                    if (C0050.m946() <= 0) {
                        iM11306 = C19806.m45029("ۗᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13113)) ^ 608026772;
                        i5 = 1191351779;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23839)) ^ (-1129344659);
                        i5 = 885703678;
                    }
                    break;
                default:
                    if (C1977.f7413 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30089)) ^ 278049424;
                        i5 = 2076547711;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3019) ^ 31308409;
                        i5 = -167800211;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11804(C4160 c4160, RunnableC17277 runnableC17277) {
        int iM11306;
        int i;
        int i2;
        boolean z;
        int iM45029;
        int i3;
        int i4;
        int iM11307;
        int i5;
        int i6;
        short s;
        int iM11308;
        int i7;
        int iM11309;
        int i8;
        int iM113010;
        int i9;
        int i10;
        final C4160 c4161 = c4160;
        C8067 c8067 = null;
        DialogInterfaceOnClickListenerC5572 dialogInterfaceOnClickListenerC5572 = null;
        DialogInterfaceOnClickListenerC22506 dialogInterfaceOnClickListenerC22506 = null;
        boolean zM18173 = false;
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        final DialogInterfaceC19356 dialogInterfaceC19356M5514 = null;
        TextView textView = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int iM113011 = 0;
        int i11 = 0;
        int iM113012 = 0;
        short[] sArr = null;
        char c = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 11776473;
        int i15 = C2477.f9839;
        int i16 = C1460.f5948;
        int iM450210 = C19806.m45029("᩻ܿ") ^ i16;
        int i17 = ((iM450210 ^ i15) * 22679) ^ (-1155280924);
        int i18 = iM450210 ^ 392330533;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = 0;
        int iM450211 = 0;
        int i20 = 0;
        boolean z2 = false;
        WeakReference weakReference = null;
        short s2 = 0;
        int i21 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-28799)) >> 31));
            switch (i14) {
                case -2101257625:
                case -1485578388:
                    i19 = 29386;
                    iM113010 = ThreadFactoryC3888.m11306("ۧ۫") ^ i15;
                    i9 = ((iM113010 ^ i16) * 3381) ^ 34044980;
                    i10 = 772392226;
                    i18 = iM113010 ^ i10;
                    i17 = i9;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -2088129499:
                case -267477009:
                    C0797.m3359();
                    RunnableC1606.m5473();
                    break;
                case -2005635958:
                case 1491632514:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    sArr2 = sArr2;
                    i21 = i21;
                    c8067 = c8067;
                    s2 = sArr[c];
                    i12 = s2 * s2;
                    i13 = 202151524;
                    if (C3660.f13403 >= 0) {
                        iM11309 = ThreadFactoryC3888.m11306("ۚ֫") ^ i16;
                        i17 = ((iM11309 ^ i15) * (-8809)) ^ (-622959776);
                        i8 = 72754645;
                    } else {
                        iM11309 = (i15 - ThreadFactoryC3888.m11306("ۛܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i17 = ((iM11309 ^ i16) * (-15789)) ^ 1843921603;
                        i8 = 1987058215;
                    }
                    i18 = iM11309 ^ i8;
                    c4161 = c4160;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -1903012533:
                case 1594373007:
                    C3660.m10791();
                    iM11306 = C19806.m45029("ۛۡ") ^ i16;
                    i = ((iM11306 ^ i15) * (-2865)) ^ (-2144714264);
                    i2 = 1738535669;
                    i18 = iM11306 ^ i2;
                    i17 = i;
                    break;
                case -1473514963:
                case -172833304:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    C1460.m5055(c8067, iM113011 ^ i11, dialogInterfaceOnClickListenerC5572);
                    dialogInterfaceOnClickListenerC22506 = new DialogInterfaceOnClickListenerC22506();
                    if (!C1419.m4973()) {
                        iM11307 = (C19806.m45029("۬֫") + i16) * (-17);
                        i5 = ((iM11307 ^ i15) * 4397) ^ (-465687735);
                        i6 = 531571664;
                        i18 = iM11307 ^ i6;
                        i17 = i5;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    } else {
                        z2 = z2 ? 1 : 0;
                        sArr2 = sArr2;
                        i21 = i21;
                        c8067 = c8067;
                        iM11309 = ThreadFactoryC3888.m11306("ۚ֫") ^ i16;
                        i17 = ((iM11309 ^ i15) * (-8809)) ^ (-622959776);
                        i8 = 72754645;
                        i18 = iM11309 ^ i8;
                        c4161 = c4160;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    }
                    break;
                case -1448823487:
                case -410449173:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    c8067.m21278(RunnableC1895.m6164(f15199, 30, 4, i19), (DialogInterface.OnClickListener) null);
                    iM11307 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i15;
                    i5 = ((iM11307 ^ i16) * (-22627)) ^ (-1054340836);
                    i6 = 1504283442;
                    i18 = iM11307 ^ i6;
                    i17 = i5;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    break;
                case -1282605537:
                case -527699216:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z = z2 ? 1 : 0;
                    ThreadFactoryC3888.m11299(c8067, z);
                    dialogInterfaceOnClickListenerC5572 = new DialogInterfaceOnClickListenerC5572(z ? 1 : 0, runnableC17277);
                    sArr3 = f15199;
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("֫ۡ") ^ i16) * (-3);
                        i3 = ((iM45029 ^ i15) * (-12699)) ^ (-1229560601);
                        i4 = -1801416791;
                        i18 = iM45029 ^ i4;
                        z2 = z;
                        i17 = i3;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("ܿܺ") ^ i16;
                        i17 = ((iM113013 ^ i15) * (-17053)) ^ 645553680;
                        i18 = iM113013 ^ (-71330758);
                        z2 = z;
                    }
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    break;
                case -1036108306:
                case 531232343:
                    if (C2642.f10294 <= 0) {
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        z2 = z2 ? 1 : 0;
                        sArr2 = sArr2;
                        i21 = i21;
                        c8067 = c8067;
                        iM11309 = ThreadFactoryC3888.m11306("ۚ֫") ^ i16;
                        i17 = ((iM11309 ^ i15) * (-8809)) ^ (-622959776);
                        i8 = 72754645;
                        i18 = iM11309 ^ i8;
                        c4161 = c4160;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    }
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    sArr2 = sArr2;
                    i21 = i21;
                    c8067 = c8067;
                    s = s2;
                    iM11308 = C19806.m45029("ۤܿ") ^ i15;
                    i17 = ((iM11308 ^ i16) * (-11139)) ^ 1129674803;
                    i7 = 792324538;
                    i18 = iM11308 ^ i7;
                    c4161 = c4160;
                    s2 = s;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -975348373:
                case 1228586451:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    iM113012 = ThreadFactoryC3888.m11306(C3577.m10571(f15199, 27, 3, i19));
                    if (C1875.f7103 < 0) {
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("ܽۚ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM11307 ^ i16) * 31895) ^ (-1891786371);
                        i6 = 1268537612;
                        i18 = iM11307 ^ i6;
                        i17 = i5;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    } else {
                        z2 = z2 ? 1 : 0;
                        sArr2 = sArr2;
                        i21 = i21;
                        c8067 = c8067;
                        s = s2;
                        iM11308 = C19806.m45029("ۤܿ") ^ i15;
                        i17 = ((iM11308 ^ i16) * (-11139)) ^ 1129674803;
                        i7 = 792324538;
                        i18 = iM11308 ^ i7;
                        c4161 = c4160;
                        s2 = s;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    }
                    break;
                case -954341111:
                case -365342936:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    iM113011 = ThreadFactoryC3888.m11306(C1066.m4040(sArr3, 24, 3, i19));
                    i11 = 2124547221;
                    if (RunnableC0195.f1321 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i15;
                        i5 = ((iM11307 ^ i16) * 6519) ^ 682208505;
                        i6 = -669402561;
                        i18 = iM11307 ^ i6;
                        i17 = i5;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    } else {
                        z = z2 ? 1 : 0;
                        int iM113014 = ThreadFactoryC3888.m11306("ܿܺ") ^ i16;
                        i17 = ((iM113014 ^ i15) * (-17053)) ^ 645553680;
                        i18 = iM113014 ^ (-71330758);
                        z2 = z;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    }
                    break;
                case -838817311:
                case -279341840:
                    if (C2477.f9839 <= 0) {
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        z2 = z2 ? 1 : 0;
                        sArr2 = sArr2;
                        i21 = i21;
                        c8067 = c8067;
                        s = s2;
                        iM11308 = C19806.m45029("ۤܿ") ^ i15;
                        i17 = ((iM11308 ^ i16) * (-11139)) ^ 1129674803;
                        i7 = 792324538;
                        i18 = iM11308 ^ i7;
                        c4161 = c4160;
                        s2 = s;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    } else {
                        iM11306 = C19806.m45029("ۛۡ") ^ i16;
                        i = ((iM11306 ^ i15) * (-2865)) ^ (-2144714264);
                        i2 = 1738535669;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    }
                    break;
                case -762141882:
                case 1460209200:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    sArr2 = sArr2;
                    i21 = i21;
                    c8067 = c8067;
                    int i22 = i12 + i13;
                    s = s2;
                    int i23 = s + 14218;
                    if ((i23 * i23) - (i22 + i22) <= 0) {
                        iM11308 = (C19806.m45029("ۧܰ") ^ i16) * 127;
                        i17 = ((iM11308 ^ i15) * 26751) ^ 1035305389;
                        i7 = -986519427;
                    } else {
                        iM11308 = (i15 - ThreadFactoryC3888.m11306("᩹᩷")) * (-75);
                        i17 = ((iM11308 ^ i16) * (-53)) ^ (-1054893143);
                        i7 = -2048329348;
                    }
                    i18 = iM11308 ^ i7;
                    c4161 = c4160;
                    s2 = s;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -561393897:
                case 796544345:
                    textView.setLineSpacing(f, f2);
                    C0817.m3402(new Runnable() { // from class: l.۬᩶ۘ

                        /* JADX INFO: renamed from: ۡܳ᩵, reason: not valid java name and contains not printable characters */
                        private static final short[] f44244 = {8657, -20063, -28041, 25059};

                        /* JADX WARN: Code duplicated, block: B:17:0x0069  */
                        /* JADX WARN: Code duplicated, block: B:28:0x00d1 A[PHI: r14
                          0x00d1: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:9:0x0055, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:52:0x01d4 A[PHI: r9 r12 r13
                          0x01d4: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01d2, B:31:0x0102, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x01d4: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:51:0x01d2, B:31:0x0102, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x01d4: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:51:0x01d2, B:31:0x0102, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:56:0x020a A[PHI: r7 r8 r10
                          0x020a: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:55:0x0208, B:47:0x01b2] A[DONT_GENERATE, DONT_INLINE]
                          0x020a: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:55:0x0208, B:47:0x01b2] A[DONT_GENERATE, DONT_INLINE]
                          0x020a: PHI (r10v3 short) = (r10v2 short), (r10v4 short) binds: [B:55:0x0208, B:47:0x01b2] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0297 A[PHI: r3 r5 r6 r19
                          0x0297: PHI (r3v4 java.lang.String) = 
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v3 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                          (r3v2 java.lang.String)
                         binds: [B:71:0x0295, B:67:0x0277, B:63:0x0259, B:59:0x023d, B:25:0x00b5, B:18:0x007f, B:15:0x0065, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x0297: PHI (r5v4 char) = (r5v2 char), (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:71:0x0295, B:67:0x0277, B:63:0x0259, B:59:0x023d, B:25:0x00b5, B:18:0x007f, B:15:0x0065, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x0297: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:71:0x0295, B:67:0x0277, B:63:0x0259, B:59:0x023d, B:25:0x00b5, B:18:0x007f, B:15:0x0065, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
                          0x0297: PHI (r19v5 short[]) = 
                          (r19v4 short[])
                          (r19v3 short[])
                          (r19v3 short[])
                          (r19v3 short[])
                          (r19v3 short[])
                          (r19v3 short[])
                          (r19v3 short[])
                          (r19v3 short[])
                         binds: [B:71:0x0295, B:67:0x0277, B:63:0x0259, B:59:0x023d, B:25:0x00b5, B:18:0x007f, B:15:0x0065, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int iM113015;
                            int i24;
                            int i25;
                            int i26 = MenuItemOnMenuItemClickListenerC3244.f12064;
                            int i27 = RunnableC1606.f6488;
                            int iM450212 = (i27 - C19806.m45029("ۗᩳ")) * (-83);
                            int i28 = ((iM450212 ^ i26) * 9827) ^ (-726158613);
                            short[] sArr4 = null;
                            short[] sArr5 = null;
                            int i29 = iM450212 ^ 851823588;
                            Window windowM44378 = null;
                            char c2 = 0;
                            short s3 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            short s4 = 0;
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            int i36 = 408216043;
                            String strM6288 = null;
                            int iM113016 = 0;
                            while (true) {
                                i36 = i29 ^ (i28 & (((i36 ^ i26) * (-13953)) >> 31));
                                switch (i36) {
                                    case -1965719523:
                                    case 1156374884:
                                        RunnableC1564.m5345();
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۢ۟") ^ i27;
                                            i24 = ((iM113015 ^ i26) * (-31053)) ^ (-1177108846);
                                            i25 = 210457103;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -1896020718:
                                    case 1230549982:
                                        int i37 = i30 + i31;
                                        i32 = i37 + i37;
                                        if (RunnableC1564.m5345()) {
                                            iM113015 = ThreadFactoryC3888.m11306("ۤܺ") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 18535) ^ 1720887830;
                                            i25 = 735529340;
                                        } else {
                                            iM113015 = (C19806.m45029("᩻۫") + i27) * (-119);
                                            i24 = ((iM113015 ^ i26) * 4755) ^ 1277279116;
                                            i25 = -491211970;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -1731798200:
                                    case 1876694937:
                                        sArr5 = f44244;
                                        i34 = 1;
                                        if (C1398.f5802 <= 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ۤܺ") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 18535) ^ 1720887830;
                                            i25 = 735529340;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ܿۖ") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 30449) ^ 1995612891;
                                            i25 = 968516600;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -1581494666:
                                    case 1635380412:
                                        int i38 = s3 + s4;
                                        if ((i38 * i38) - i32 > 0) {
                                            iM113015 = C19806.m45029("ۡ֡") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 3847) ^ 228902142;
                                            i25 = -1328528066;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("᩵᩹") ^ i27) * (-123);
                                            i24 = ((iM113015 ^ i26) * 17339) ^ 761842260;
                                            i25 = -969595420;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -1506762728:
                                    case 465846333:
                                        iM113016 = 2118535181 ^ ThreadFactoryC3888.m11306(strM6288);
                                        iM113015 = (ThreadFactoryC3888.m11306("֡ۘ") ^ i26) * (-9);
                                        i24 = ((iM113015 ^ i27) * 22139) ^ 1222748064;
                                        i25 = 1645110460;
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -1361703419:
                                    case -1288874445:
                                        C1189.m4368();
                                        C3286.m9798();
                                        break;
                                    case -1276958174:
                                    case 989715473:
                                        break;
                                    case -1265907246:
                                    case 261579208:
                                        sArr4 = f44244;
                                        if (C2477.m7593() >= 0) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = (i26 - ThreadFactoryC3888.m11306("ۘ᩶")) * 97;
                                            i24 = ((iM113015 ^ i27) * (-5713)) ^ 1081900887;
                                            i25 = 43333148;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -1205510786:
                                    case 299010665:
                                        i33 = 61452;
                                        iM113015 = ThreadFactoryC3888.m11306("ۜܺ") ^ i27;
                                        i24 = ((iM113015 ^ i26) * 28011) ^ 23600655;
                                        i25 = 424857166;
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -868151349:
                                    case -245897485:
                                        if (C3743.m10966() > 0) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۤܺ") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 18535) ^ 1720887830;
                                            i25 = 735529340;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -828192703:
                                    case 1834808777:
                                        strM6288 = C1937.m6288(sArr5, i34, i35, i33);
                                        if (C1668.f6641 >= 0) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("᩹ܶ") ^ i27) * 109;
                                            i24 = ((iM113015 ^ i26) * (-32083)) ^ (-340469893);
                                            i25 = 107784988;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -727894994:
                                    case -480487190:
                                        C0216.m1591();
                                        iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                        i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                        i25 = 1085333250;
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -458061763:
                                    case 66774629:
                                        if (RunnableC1564.m5345()) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = C19806.m45029("᩵ۤ") ^ i27;
                                            i24 = ((iM113015 ^ i26) * 21473) ^ (-1713911115);
                                            i25 = -818808165;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -230144318:
                                    case 936745560:
                                        s3 = sArr4[c2];
                                        if (C7105.f23796 >= 0) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = C19806.m45029("ۤܿ") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 10715) ^ 1038376173;
                                            i25 = 1457123601;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case -159005880:
                                    case 1501131708:
                                        windowM44378 = dialogInterfaceC19356M5514.m44378();
                                        if (windowM44378 != null) {
                                            int iM450213 = (i27 - C19806.m45029("۠ۘ")) * 93;
                                            i28 = ((iM450213 ^ i26) * 4639) ^ (-1707340072);
                                            i29 = iM450213 ^ 1321547001;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܰᩳ") + i26) * 89;
                                            i24 = ((iM113015 ^ i27) * (-8155)) ^ (-1601992951);
                                            i25 = -1058150149;
                                            i29 = iM113015 ^ i25;
                                            i28 = i24;
                                        }
                                        break;
                                    case -136628099:
                                    case 1482331756:
                                        i30 = s3 * s3;
                                        i31 = 3892729;
                                        if (C0050.f912 <= 0) {
                                            iM113015 = (ThreadFactoryC3888.m11306("֡᩻") + i27) * 45;
                                            i24 = ((iM113015 ^ i26) * 877) ^ 1547582782;
                                            i25 = 1894904896;
                                        } else {
                                            iM113015 = (C19806.m45029("۠᩷") ^ i26) * (-61);
                                            i24 = ((iM113015 ^ i27) * (-22495)) ^ 187773300;
                                            i25 = -351087170;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case 49256840:
                                    case 910110757:
                                        i33 = 59040;
                                        iM113015 = ThreadFactoryC3888.m11306("ۜܺ") ^ i27;
                                        i24 = ((iM113015 ^ i26) * 28011) ^ 23600655;
                                        i25 = 424857166;
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case 551884620:
                                    case 1145418137:
                                        c2 = 0;
                                        if (ThreadFactoryC3888.m11300() <= 0) {
                                            iM113015 = (C19806.m45029("᩶ᩴ") ^ i26) * (-113);
                                            i24 = ((iM113015 ^ i27) * (-14525)) ^ 460271723;
                                            i25 = 1085333250;
                                        } else {
                                            iM113015 = (i27 - ThreadFactoryC3888.m11306("ۗۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i24 = ((iM113015 ^ i26) * (-28715)) ^ 294735697;
                                            i25 = -1361750422;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case 664181268:
                                    case 887504028:
                                        try {
                                            windowM44378.setWindowAnimations(iM113016);
                                            break;
                                        } catch (RuntimeException unused) {
                                        }
                                        iM113015 = (ThreadFactoryC3888.m11306("ܰᩳ") + i26) * 89;
                                        i24 = ((iM113015 ^ i27) * (-8155)) ^ (-1601992951);
                                        i25 = -1058150149;
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case 918406669:
                                    case 1508238250:
                                        if (RunnableC1564.f6300) {
                                            iM113015 = ThreadFactoryC3888.m11306("۫ܺ") ^ i27;
                                            i24 = ((iM113015 ^ i26) * (-21547)) ^ (-385205000);
                                            i25 = 511765892;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۢ۟") ^ i27;
                                            i24 = ((iM113015 ^ i26) * (-31053)) ^ (-1177108846);
                                            i25 = 210457103;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    case 1670570198:
                                    case 1671450071:
                                        s4 = 1973;
                                        if (C1460.f5948 >= 0) {
                                            iM113015 = (ThreadFactoryC3888.m11306("֡᩻") + i27) * 45;
                                            i24 = ((iM113015 ^ i26) * 877) ^ 1547582782;
                                            i25 = 1894904896;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۢ֡") ^ i26;
                                            i24 = ((iM113015 ^ i27) * 13655) ^ 678681914;
                                            i25 = -1065671692;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                    default:
                                        i35 = 3;
                                        if (C1875.f7103 >= 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("۫ܺ") ^ i27;
                                            i24 = ((iM113015 ^ i26) * (-21547)) ^ (-385205000);
                                            i25 = 511765892;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("᩷᩸") ^ i27;
                                            i24 = ((iM113015 ^ i26) * 27947) ^ 1001455954;
                                            i25 = -2104988176;
                                        }
                                        i29 = iM113015 ^ i25;
                                        i28 = i24;
                                        break;
                                }
                                return;
                            }
                        }
                    }, 500L);
                    break;
                case -532645262:
                case 949925405:
                    if (C3722.f13525 > 0) {
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩷ۘ")) * (-91);
                        i5 = ((iM11307 ^ i16) * (-10763)) ^ (-1078264142);
                        i6 = -776458144;
                        i18 = iM11307 ^ i6;
                        i17 = i5;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    } else {
                        iM11306 = C19806.m45029("ۛۡ") ^ i16;
                        i = ((iM11306 ^ i15) * (-2865)) ^ (-2144714264);
                        i2 = 1738535669;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    }
                    break;
                case -500752740:
                case -481578944:
                    i19 = 54670;
                    iM113010 = ThreadFactoryC3888.m11306("ۧ۫") ^ i15;
                    i9 = ((iM113010 ^ i16) * 3381) ^ 34044980;
                    i10 = 772392226;
                    i18 = iM113010 ^ i10;
                    i17 = i9;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -475074901:
                case -180325856:
                    textView = (TextView) dialogInterfaceC19356M5514.m44364(R.id.message);
                    f = 0.0f;
                    f2 = 1.3f;
                    if (!C2332.f8260) {
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        z = z2 ? 1 : 0;
                        int iM113015 = ThreadFactoryC3888.m11306("ܿܺ") ^ i16;
                        i17 = ((iM113015 ^ i15) * (-17053)) ^ 645553680;
                        i18 = iM113015 ^ (-71330758);
                        z2 = z;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܰ") ^ i16) * (-21);
                        i = ((iM11306 ^ i15) * 23687) ^ 1691714788;
                        i2 = 1699799857;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    }
                    break;
                case -438339809:
                case 149775301:
                    dialogInterfaceC19356 = (DialogInterfaceC19356) weakReference.get();
                    if (dialogInterfaceC19356 == null) {
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        z2 = z2 ? 1 : 0;
                        sArr2 = sArr2;
                        i21 = i21;
                        c8067 = c8067;
                        iM113010 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i16;
                        i9 = ((iM113010 ^ i15) * 24813) ^ 691709224;
                        i10 = -667644655;
                        i18 = iM113010 ^ i10;
                        i17 = i9;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܿ") ^ i16;
                        i = ((iM11306 ^ i15) * (-17931)) ^ 2057030340;
                        i2 = 53160034;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    }
                    break;
                case -415403637:
                case 1140177916:
                    C1189.m4367(dialogInterfaceC19356);
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    sArr2 = sArr2;
                    i21 = i21;
                    c8067 = c8067;
                    iM113010 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i16;
                    i9 = ((iM113010 ^ i15) * 24813) ^ 691709224;
                    i10 = -667644655;
                    i18 = iM113010 ^ i10;
                    i17 = i9;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -345286849:
                case -197505069:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    C1377.m4836(c8067, iM450211 ^ i20);
                    C1875.m6095(c8067, c4161.f15200);
                    z2 = false;
                    z2 = false;
                    if (C3286.f12186) {
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩷ۘ")) * (-91);
                        i5 = ((iM11307 ^ i16) * (-10763)) ^ (-1078264142);
                        i6 = -776458144;
                    } else {
                        iM11307 = (i15 - C19806.m45029("ۜᩴ")) * 31;
                        i5 = ((iM11307 ^ i16) * (-24595)) ^ (-1263609661);
                        i6 = 1968771098;
                    }
                    i18 = iM11307 ^ i6;
                    i17 = i5;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    break;
                case -264487184:
                case 1580736296:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    sArr2 = sArr2;
                    i21 = i21;
                    c8067 = c8067;
                    weakReference = f15198;
                    if (weakReference != null) {
                        iM113010 = ThreadFactoryC3888.m11306("ۜܰ") ^ i16;
                        i9 = ((iM113010 ^ i15) * (-13467)) ^ (-1560090650);
                        i10 = -319079001;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i16;
                        i9 = ((iM113010 ^ i15) * 24813) ^ 691709224;
                        i10 = -667644655;
                    }
                    i18 = iM113010 ^ i10;
                    i17 = i9;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -210254665:
                case 1261148535:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    sArr2 = sArr2;
                    i21 = i21;
                    c8067 = c8067;
                    s = s2;
                    sArr = f15199;
                    c = 20;
                    if (C0629.f2722 <= 0) {
                        iM11308 = C19806.m45029("ۤܿ") ^ i15;
                        i17 = ((iM11308 ^ i16) * (-11139)) ^ 1129674803;
                        i7 = 792324538;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۜ᩹") ^ i16) * (-47);
                        i17 = ((iM11308 ^ i15) * 16275) ^ (-293273817);
                        i7 = -1751775727;
                    }
                    i18 = iM11308 ^ i7;
                    c4161 = c4160;
                    s2 = s;
                    sArr2 = sArr2;
                    c8067 = c8067;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    i21 = i21;
                    z2 = z2;
                    break;
                case -30387785:
                case 1008808839:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z = z2 ? 1 : 0;
                    AbstractActivityC12483 abstractActivityC12483 = c4161.f15202;
                    int i24 = DialogInterfaceC19356.f62401;
                    c8067 = new C8067(abstractActivityC12483);
                    sArr2 = f15199;
                    i21 = 21;
                    if (!C2704.f10408) {
                        z2 = z ? 1 : 0;
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩷ۘ")) * (-91);
                        i5 = ((iM11307 ^ i16) * (-10763)) ^ (-1078264142);
                        i6 = -776458144;
                        i18 = iM11307 ^ i6;
                        i17 = i5;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    } else {
                        iM45029 = (C19806.m45029("ۤܺ") ^ i16) * 17;
                        i3 = ((iM45029 ^ i15) * 541) ^ 1510600566;
                        i4 = 1029419809;
                        i18 = iM45029 ^ i4;
                        z2 = z;
                        i17 = i3;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                    }
                    break;
                case -18973968:
                case 698070750:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    dialogInterfaceC19356M5514 = CallableC1627.m5514(c8067);
                    f15198 = new WeakReference(dialogInterfaceC19356M5514);
                    if (zM18173) {
                        iM11307 = (C19806.m45029("᩶᩵") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM11307 ^ i16) * (-4085)) ^ 116367308;
                        i6 = -1910465763;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i15;
                        i5 = ((iM11307 ^ i16) * (-18991)) ^ 652280018;
                        i6 = -1818438892;
                    }
                    i18 = iM11307 ^ i6;
                    i17 = i5;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    break;
                case 404773953:
                case 2103845409:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    z2 = z2 ? 1 : 0;
                    c8067 = c8067;
                    sArr2 = sArr2;
                    int i25 = i21;
                    iM450211 = C19806.m45029(C2477.m7604(sArr2, i25, 3, i19));
                    i20 = 2118525333;
                    if (AbstractC0464.f2088 > 0) {
                        iM113010 = (C19806.m45029("۠ۧ") ^ i15) * 81;
                        i21 = i25;
                        i9 = ((iM113010 ^ i16) * 4155) ^ (-365982311);
                        i10 = -1946416022;
                        i18 = iM113010 ^ i10;
                        i17 = i9;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    } else {
                        i21 = i25;
                        s = s2;
                        iM11308 = C19806.m45029("ۤܿ") ^ i15;
                        i17 = ((iM11308 ^ i16) * (-11139)) ^ 1129674803;
                        i7 = 792324538;
                        i18 = iM11308 ^ i7;
                        c4161 = c4160;
                        s2 = s;
                        sArr2 = sArr2;
                        c8067 = c8067;
                        dialogInterfaceC19356 = dialogInterfaceC19356;
                        i21 = i21;
                        z2 = z2;
                    }
                    break;
                case 737001474:
                case 998923917:
                    C7105.m18993(AbstractC0464.m2310(dialogInterfaceC19356M5514), new View.OnClickListener() { // from class: l.֨᩶ۘ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C4160.m11805(this.f5651);
                        }
                    });
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    iM11307 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i15;
                    i5 = ((iM11307 ^ i16) * (-18991)) ^ 652280018;
                    i6 = -1818438892;
                    i18 = iM11307 ^ i6;
                    i17 = i5;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    break;
                default:
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    C10634.m26830(c8067, iM113012 ^ 2119977134, dialogInterfaceOnClickListenerC22506);
                    zM18173 = C6730.m18173();
                    if (zM18173) {
                        iM11307 = (i16 - C19806.m45029("ۜۧ")) * (-71);
                        i5 = ((iM11307 ^ i15) * 18517) ^ (-1549247573);
                        i6 = 1517602040;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i15;
                        i5 = ((iM11307 ^ i16) * (-22627)) ^ (-1054340836);
                        i6 = 1504283442;
                    }
                    i18 = iM11307 ^ i6;
                    i17 = i5;
                    dialogInterfaceC19356 = dialogInterfaceC19356;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11803(C4160 c4160) {
        AbstractActivityC12483 abstractActivityC12483 = null;
        String strM4784 = null;
        int i = 559707106;
        int i2 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i3 = C1668.f6641;
        int iM45029 = (i3 - C19806.m45029("۫ۘ")) * 123;
        int i4 = ((iM45029 ^ i2) * (-30609)) ^ (-229864706);
        int i5 = -1850254813;
        while (true) {
            i = ((((i ^ i2) * (-14657)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1955100799:
                case -360460503:
                    strM4784 = C1355.m4784();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") ^ i3) * (-77);
                        i4 = ((iM45029 ^ i2) * 28331) ^ 308653428;
                        i5 = -1108234413;
                    }
                    break;
                case -1449210473:
                case 1419194759:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    } else {
                        iM45029 = C19806.m45029("ᩳ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32129) ^ 687014967;
                        i5 = 1471461695;
                    }
                    break;
                case -1349844592:
                case -417287269:
                    RunnableC1564.m5345();
                    C2124.m6673();
                    iM45029 = ThreadFactoryC3888.m11306("ۢۤ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 31953) ^ 1414121357;
                    i5 = 1205644614;
                    break;
                case -1280211676:
                case 1444021829:
                    abstractActivityC12483 = c4160.f15202;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("᩹ۤ") ^ i3) * (-47);
                        i4 = ((iM45029 ^ i2) * (-4663)) ^ 2106928432;
                        i5 = -679399217;
                    } else {
                        iM45029 = C19806.m45029("ܿ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13615)) ^ (-545811141);
                        i5 = -611183782;
                    }
                    break;
                case -1273174554:
                case 1290274012:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3747)) ^ 1983544715;
                        i5 = 144676447;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    }
                    break;
                case -1267648926:
                case 1981406997:
                    C0671.m3008();
                    if (C1066.f4915 > 0) {
                        iM45029 = (C19806.m45029("᩹ۤ") ^ i3) * (-47);
                        i4 = ((iM45029 ^ i2) * (-4663)) ^ 2106928432;
                        i5 = -679399217;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31953) ^ 1414121357;
                        i5 = 1205644614;
                    }
                    break;
                case -1099465264:
                case 1732755077:
                    if (C1189.m4368() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31953) ^ 1414121357;
                        i5 = 1205644614;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۤ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * (-13043)) ^ (-1920195267);
                        i5 = 851376594;
                    }
                    break;
                case -1060279250:
                case 156453311:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("֫ۖ") ^ i3) * 119;
                        i4 = ((iM45029 ^ i2) * 31381) ^ (-805966110);
                        i5 = 1464142903;
                    } else {
                        iM45029 = (C19806.m45029("֡۬") + i2) * (-9);
                        i4 = ((iM45029 ^ i3) * (-5487)) ^ (-249534692);
                        i5 = 23184310;
                    }
                    break;
                case -843652385:
                case 1256720066:
                    ActivityC14082.m34069((Context) abstractActivityC12483, strM4784, true);
                    break;
                case -421632845:
                case 413286580:
                    C1937.m6279();
                    break;
                case -323188750:
                case 1318469453:
                    if (C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩷ۤ")) * (-119);
                        i4 = ((iM45029 ^ i3) * (-16035)) ^ 1922725156;
                        i5 = -1744894614;
                    }
                    break;
                case -106398872:
                case 1020283644:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    } else {
                        iM45029 = (C19806.m45029("ۜۨ") + i2) * (-29);
                        i4 = ((iM45029 ^ i3) * (-30379)) ^ (-957485469);
                        i5 = -497433023;
                    }
                    break;
                case -16177739:
                case 1175543073:
                    C3286.m9798();
                    if (!C3577.m10565()) {
                        iM45029 = (C19806.m45029("֫ۖ") ^ i3) * 119;
                        i4 = ((iM45029 ^ i2) * 31381) ^ (-805966110);
                        i5 = 1464142903;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۤ") ^ i3) * (-47);
                        i4 = ((iM45029 ^ i2) * (-4663)) ^ 2106928432;
                        i5 = -679399217;
                    }
                    break;
                case 552824104:
                case 1252657637:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ᩴ") + i2) * (-91);
                        i4 = ((iM45029 ^ i3) * 5683) ^ (-2066780303);
                        i5 = 695133813;
                    }
                    break;
                case 1050334075:
                case 1790836622:
                    C2871.m8646();
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("᩹ۤ") ^ i3) * (-47);
                        i4 = ((iM45029 ^ i2) * (-4663)) ^ 2106928432;
                        i5 = -679399217;
                    } else {
                        iM45029 = C19806.m45029("᩸֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7101)) ^ 2070348852;
                        i5 = 359668220;
                    }
                    break;
                default:
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8425)) ^ 1209511002;
                        i5 = 1577585480;
                    } else {
                        iM45029 = (C19806.m45029("ܳ֡") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * 26547) ^ (-1530188915);
                        i5 = -1062867460;
                    }
                    break;
            }
            return;
        }
    }
}
