package l;

import android.R;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23871 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۫ۘ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f77137 = {9038, 31286, 31284, 31267, 31294, 31265, 31294, 31267, 31278, 31265, -4866, 9481, -5322, 31281, 31294, 31289, 31283, 31233, 31294, 31282, 31264, 31253, 31278, 31262, 31283, 31359, 31353, 31353, 31353, 31358, -4453, 8257, -3281, -969, 9870, -4359, 8452, 6703, -790, 9306, 13700, -6985, -4486, 10931, 9514, 4245, 11593, 9967, 3368, 4411, 1307, 9878, -5649, 1984, -984, 3556, -5254, 6710, 17672, -16701, 30055, -17338, -23953, 31940, 8558, 5697, 27640, -28926, -24976, 17019, 32730, 25435, 29526, 27153, 27439, 27798, 26822, -29951, 5700, 5727, 5720, 5696, 5750, 5716, 5699, 5726, 5697, 5714, 5746, 5722, 5718, 5726, 5723};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f77138;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f77139;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f77140;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f77141;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f77142;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f77143;

    /* JADX WARN: Code duplicated, block: B:31:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:0x03e4 A[PHI: r5 r9 r10 r13 r15 r16 r30
      0x03e4: PHI (r5v12 short[]) = (r5v9 short[]), (r5v11 short[]), (r5v9 short[]), (r5v9 short[]), (r5v9 short[]), (r5v9 short[]) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r9v4 l.ۡ᩺ۙ) = (r9v2 l.ۡ᩺ۙ), (r9v2 l.ۡ᩺ۙ), (r9v3 l.ۡ᩺ۙ), (r9v2 l.ۡ᩺ۙ), (r9v2 l.ۡ᩺ۙ), (r9v2 l.ۡ᩺ۙ) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r10v4 l.ܶ᩶۠) = (r10v2 l.ܶ᩶۠), (r10v2 l.ܶ᩶۠), (r10v3 l.ܶ᩶۠), (r10v2 l.ܶ᩶۠), (r10v2 l.ܶ᩶۠), (r10v2 l.ܶ᩶۠) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r30v3 int) = (r30v1 int), (r30v2 int), (r30v1 int), (r30v1 int), (r30v1 int), (r30v1 int) binds: [B:106:0x03e4, B:65:0x03e2, B:50:0x02fd, B:43:0x028d, B:20:0x00f2, B:112:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC23871(AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356, View view, final Consumer consumer) {
        String strM1588;
        short[] sArr;
        int i;
        int i2;
        short[] sArr2;
        int iM45029;
        int i3;
        int i4;
        short[] sArr3;
        int i5;
        short[] sArr4;
        int i6;
        int i7;
        int i8;
        int iM450210;
        int i9;
        int iM11306;
        final ViewOnClickListenerC23871 viewOnClickListenerC23871 = this;
        DialogInterfaceC19356 dialogInterfaceC19357 = dialogInterfaceC19356;
        int i10 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i11 = AbstractC0464.f2088;
        short s = f77137[0];
        int i12 = (s * s) + 6195121;
        int i13 = s + 2489;
        int i14 = (i12 + i12) - (i13 * i13) >= 0 ? 31319 : 37977;
        CallableC1627.m5508(abstractActivityC12483, C1977.m6363(f77137, 1, 8, i14));
        C2704.m8238(view, C1148.m4230(f77137, 9, 1, i14));
        int iM450211 = C19806.m45029("ᩴۢ") ^ i10;
        View viewM10957 = null;
        String strM6241 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        String str = null;
        C9186 c9186 = null;
        int i15 = 0;
        int iM11307 = 0;
        int i16 = 0;
        int iM11308 = 0;
        int i17 = 0;
        int iM450212 = 0;
        int iM450213 = 0;
        View viewM10958 = null;
        int i18 = 0;
        int i19 = -1645121743;
        View view2 = null;
        int i20 = 0;
        View.OnClickListener onClickListener = null;
        InterfaceC15456 interfaceC15456 = null;
        int i21 = ((iM450211 ^ i11) * (-29801)) ^ 279730445;
        int i22 = iM450211 ^ 294466826;
        short[] sArr7 = null;
        int iM450214 = 0;
        while (true) {
            i19 = i22 ^ ((((i19 ^ i11) * 1351) >> 31) & i21);
            switch (i19) {
                case -2112456801:
                case -2012154529:
                    sArr3 = sArr7;
                    i5 = i20;
                    viewM10958 = C3743.m10957(view, iM450214 ^ 2102110300);
                    sArr4 = f77137;
                    i6 = 13;
                    if (C0629.f2722 <= 0) {
                        int iM11309 = (ThreadFactoryC3888.m11306("۬᩸") + i10) * (-121);
                        i21 = 306827701 ^ ((iM11309 ^ i11) * (-13489));
                        i22 = 290902118 ^ iM11309;
                        i20 = i5;
                        sArr7 = sArr3;
                        sArr5 = sArr4;
                        i18 = i6;
                        dialogInterfaceC19357 = dialogInterfaceC19356;
                    } else {
                        int iM450215 = C19806.m45029("֡᩹") ^ i11;
                        i21 = 526593502 ^ ((iM450215 ^ i10) * 22295);
                        i22 = (-1721939279) ^ iM450215;
                        dialogInterfaceC19357 = dialogInterfaceC19356;
                        i20 = i5;
                        sArr7 = sArr3;
                        i18 = 13;
                        sArr5 = sArr4;
                    }
                    break;
                case -2012949355:
                case -1782758022:
                    if (C1709.m5683()) {
                        iM45029 = (i11 - C19806.m45029("۫ۧ")) * (-71);
                        i21 = 1768391720 ^ ((iM45029 ^ i10) * (-3853));
                        i3 = -1394950966;
                    } else {
                        iM45029 = C19806.m45029("᩷ܰ") ^ i11;
                        i21 = 1482756612 ^ ((iM45029 ^ i10) * (-29861));
                        i3 = 1108363150;
                    }
                    i22 = i3 ^ iM45029;
                    break;
                case -1863440031:
                case -368415261:
                    View viewM10959 = C3743.m10957(view, iM450213 ^ 2120520902);
                    C7105.m18993(viewM10959, viewOnClickListenerC23871);
                    C0674.m3027(viewM10959);
                    viewM10957 = C3743.m10957(view, R.id.button1);
                    onClickListener = new View.OnClickListener() { // from class: l.᩷ᩳ᩺
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Consumer consumer2 = null;
                            int i23 = -1411911393;
                            int i24 = C3722.f13525;
                            int i25 = C2642.f10294;
                            int iM450216 = (C19806.m45029("֫᩻") ^ i25) * 59;
                            int i26 = ((iM450216 ^ i24) * (-21647)) ^ (-2023130481);
                            int i27 = -1260719154;
                            while (true) {
                                i23 = ((((i23 ^ i24) * (-7723)) >> 31) & i26) ^ (iM450216 ^ i27);
                                switch (i23) {
                                    case -2030823130:
                                    case 2061707642:
                                        ViewOnClickListenerC23871.m52595(consumer2, viewOnClickListenerC23871);
                                        break;
                                    case -2000318019:
                                    case -1718532432:
                                        if (C0216.f1393 != 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 30625) ^ 781383308;
                                            i27 = 1059355652;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۚۨ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 30033) ^ 665887066;
                                            i27 = 469427209;
                                        }
                                        break;
                                    case -1778727721:
                                    case -1375422715:
                                        if (C0216.f1393 == 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 30625) ^ 781383308;
                                            i27 = 1059355652;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("᩸᩵") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-8179)) ^ 1129950670;
                                            i27 = 813135234;
                                        }
                                        break;
                                    case -1572710202:
                                    case 467728119:
                                        if (C1189.f5284 <= 0) {
                                            iM450216 = (C19806.m45029("֡ۤ") + i25) * 27;
                                            i26 = ((iM450216 ^ i24) * 5523) ^ (-552188578);
                                            i27 = -1780696342;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۨᩴ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 7097) ^ 168096052;
                                            i27 = 453804820;
                                        }
                                        break;
                                    case -1286351063:
                                    case 73483645:
                                        consumer2 = consumer;
                                        if (C2704.f10408) {
                                            iM450216 = (C19806.m45029("᩶ۤ") ^ i24) * 11;
                                            i26 = ((iM450216 ^ i25) * (-27639)) ^ 1992834602;
                                            i27 = 447453018;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("֡ۗ") ^ i25) * 85;
                                            i26 = ((iM450216 ^ i24) * (-693)) ^ (-1990606008);
                                            i27 = -1927756820;
                                        }
                                        break;
                                    case -1125126450:
                                    case 883999100:
                                        if (C2332.f8260) {
                                            iM450216 = C19806.m45029("ᩳ۫") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 30329) ^ (-2000243595);
                                            i27 = 1163744684;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("᩸᩵") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-8179)) ^ 1129950670;
                                            i27 = 813135234;
                                        }
                                        break;
                                    case -1062879387:
                                    case -185522700:
                                        C0050.m946();
                                        C3535.m10431();
                                        break;
                                    case -980172902:
                                    case 77007266:
                                        if (C2124.f7782 <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 30625) ^ 781383308;
                                            i27 = 1059355652;
                                        } else {
                                            iM450216 = (C19806.m45029("᩺ۨ") ^ i25) * 47;
                                            i26 = ((iM450216 ^ i24) * 3313) ^ 1142869967;
                                            i27 = 642065775;
                                        }
                                        break;
                                    case -608792910:
                                    case 549451341:
                                        C0050.m946();
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("᩸᩵") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-8179)) ^ 1129950670;
                                            i27 = 813135234;
                                        } else {
                                            iM450216 = (C19806.m45029("֡ۤ") + i25) * 27;
                                            i26 = ((iM450216 ^ i24) * 5523) ^ (-552188578);
                                            i27 = -1780696342;
                                        }
                                        break;
                                    case -357486781:
                                    case -123454438:
                                        if (CallableC1627.m5507() != 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("᩸᩵") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-8179)) ^ 1129950670;
                                            i27 = 813135234;
                                        } else {
                                            iM450216 = C19806.m45029("ܺܿ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 303) ^ (-1535103418);
                                            i27 = -1380237022;
                                        }
                                        break;
                                    case -340071238:
                                    case -207413968:
                                        C0797.m3359();
                                        if (!C0962.f3784) {
                                            iM450216 = ThreadFactoryC3888.m11306("᩸᩵") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-8179)) ^ 1129950670;
                                            i27 = 813135234;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧܰ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-103)) ^ 1985793267;
                                            i27 = -1333514716;
                                        }
                                        break;
                                    case -222549278:
                                    case 1189610778:
                                        if (C2704.m8255() <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧܰ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-103)) ^ 1985793267;
                                            i27 = -1333514716;
                                        } else {
                                            iM450216 = C19806.m45029("ۘܳ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 28049) ^ 502620093;
                                            i27 = -2043810430;
                                        }
                                        break;
                                    case -117127773:
                                    case 1612732590:
                                        if (C3743.f13569) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۘܿ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-27423)) ^ 1374353046;
                                            i27 = -2026064773;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 30625) ^ 781383308;
                                            i27 = 1059355652;
                                        }
                                        break;
                                    case -63217280:
                                    case 439347547:
                                        if (C7105.m18985()) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧܰ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-103)) ^ 1985793267;
                                            i27 = -1333514716;
                                        } else {
                                            iM450216 = (C19806.m45029("ۛۜ") ^ i24) * 25;
                                            i26 = ((iM450216 ^ i25) * (-19859)) ^ (-739785091);
                                            i27 = 1540961441;
                                        }
                                        break;
                                    case 352980133:
                                    case 1796811026:
                                        C0962.m3746();
                                        iM450216 = (C19806.m45029("֡ۤ") + i25) * 27;
                                        i26 = ((iM450216 ^ i24) * 5523) ^ (-552188578);
                                        i27 = -1780696342;
                                        break;
                                    default:
                                        if (C0050.m946() <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("ۧܰ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-103)) ^ 1985793267;
                                            i27 = -1333514716;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֨ۢ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-25109)) ^ (-1461203796);
                                            i27 = -1552670002;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i23 = 1174575703;
                            int i24 = C0629.f2722;
                            int i25 = RunnableC1606.f6488;
                            int iM113010 = ThreadFactoryC3888.m11306("֡ܰ") ^ i25;
                            int i26 = ((iM113010 ^ i24) * (-9441)) ^ 506253839;
                            int i27 = -2126905000;
                            while (true) {
                                i23 = ((((i23 ^ i24) * (-887)) >> 31) & i26) ^ (iM113010 ^ i27);
                                switch (i23) {
                                    case -2062225332:
                                    case -725004706:
                                        if (C1398.f5802 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩶᩹") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-17637)) ^ (-249095390);
                                            i27 = 1589831844;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩻᩶") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-13333)) ^ (-12611184);
                                            i27 = 1283339915;
                                        }
                                        break;
                                    case -1855668074:
                                    case -746639634:
                                        if (C0526.f2219) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩶᩹") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-17637)) ^ (-249095390);
                                            i27 = 1589831844;
                                        } else {
                                            iM113010 = C19806.m45029("ۜۙ") ^ i25;
                                            i26 = ((iM113010 ^ i24) * (-15179)) ^ 957105568;
                                            i27 = -1115009239;
                                        }
                                        break;
                                    case -1852442364:
                                    case 1303279267:
                                        C0526.m2437();
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۙۜ") ^ i25;
                                            i26 = ((iM113010 ^ i24) * 1229) ^ 1218493445;
                                            i27 = 1470998555;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-693)) ^ (-1128381222);
                                            i27 = 995079608;
                                        }
                                        break;
                                    case -1784226839:
                                    case 183982832:
                                        if (C2871.f10837 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩶᩹") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-17637)) ^ (-249095390);
                                            i27 = 1589831844;
                                        } else {
                                            iM113010 = (i25 - C19806.m45029("ۤۤ")) * (-101);
                                            i26 = ((iM113010 ^ i24) * 453) ^ (-1606586194);
                                            i27 = -1259965162;
                                        }
                                        break;
                                    case -1733995635:
                                    case 1861050927:
                                        if (C1875.f7103 >= 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۙᩳ") ^ i25) * 49;
                                            i26 = ((iM113010 ^ i24) * (-3061)) ^ 710661044;
                                            i27 = -620294001;
                                        } else {
                                            iM113010 = (i24 - ThreadFactoryC3888.m11306("֡᩶")) * 33;
                                            i26 = ((iM113010 ^ i25) * 24347) ^ 1397951733;
                                            i27 = 271892793;
                                        }
                                        break;
                                    case -1712477783:
                                    case 1595058452:
                                        if (C0629.f2722 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۙۜ") ^ i25;
                                            i26 = ((iM113010 ^ i24) * 1229) ^ 1218493445;
                                            i27 = 1470998555;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("֨᩷") ^ i25;
                                            i26 = ((iM113010 ^ i24) * (-23979)) ^ 970168561;
                                            i27 = 355963534;
                                        }
                                        break;
                                    case -1066424541:
                                    case -246524993:
                                        if (C0817.f3443) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۢ֫") ^ i24;
                                            i26 = ((iM113010 ^ i25) * 17769) ^ (-466036860);
                                            i27 = -2033594332;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-693)) ^ (-1128381222);
                                            i27 = 995079608;
                                        }
                                        break;
                                    case -1053777031:
                                    case 1226698034:
                                        C1460.m5050();
                                        C2249.m6915();
                                        iM113010 = (ThreadFactoryC3888.m11306("ۙᩳ") ^ i25) * 49;
                                        i26 = ((iM113010 ^ i24) * (-3061)) ^ 710661044;
                                        i27 = -620294001;
                                        break;
                                    case -834760089:
                                    case -85946983:
                                        if (RunnableC1895.f7152) {
                                            iM113010 = C19806.m45029("ܰ֨") ^ i24;
                                            i26 = ((iM113010 ^ i25) * 11867) ^ (-2113659500);
                                            i27 = -241076684;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۙᩳ") ^ i25) * 49;
                                            i26 = ((iM113010 ^ i24) * (-3061)) ^ 710661044;
                                            i27 = -620294001;
                                        }
                                        break;
                                    case -489799032:
                                    case 1856777872:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113010 = (C19806.m45029("᩶ۜ") + i25) * (-93);
                                            i26 = ((iM113010 ^ i24) * (-24025)) ^ (-827556482);
                                            i27 = -1187231803;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩶᩹") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-17637)) ^ (-249095390);
                                            i27 = 1589831844;
                                        }
                                        break;
                                    case -448768717:
                                    case 1683370367:
                                        return;
                                    case 673225784:
                                    case 1269440042:
                                        RunnableC1606.m5473();
                                        if (C0050.f912 > 0) {
                                            iM113010 = (i24 - C19806.m45029("᩻۟")) * (-89);
                                            i26 = ((iM113010 ^ i25) * 18581) ^ (-1457469197);
                                            i27 = 1985863218;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۙᩳ") ^ i25) * 49;
                                            i26 = ((iM113010 ^ i24) * (-3061)) ^ 710661044;
                                            i27 = -620294001;
                                        }
                                        break;
                                    case 830525113:
                                    case 1381843596:
                                        if (C2332.f8260) {
                                            iM113010 = (i24 - C19806.m45029("᩶ܽ")) * 85;
                                            i26 = ((iM113010 ^ i25) * 3213) ^ (-965152169);
                                            i27 = 1185610783;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۙۜ") ^ i25;
                                            i26 = ((iM113010 ^ i24) * 1229) ^ 1218493445;
                                            i27 = 1470998555;
                                        }
                                        break;
                                    case 859232845:
                                    case 2059395003:
                                        C2477.m7593();
                                        C2871.m8646();
                                        throw new RuntimeException();
                                    case 900165982:
                                    case 1397759052:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113010 = C19806.m45029("ܶ֡") ^ i25;
                                            i26 = ((iM113010 ^ i24) * (-26359)) ^ 1312108403;
                                            i27 = 800625872;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩶᩹") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-17637)) ^ (-249095390);
                                            i27 = 1589831844;
                                        }
                                        break;
                                    default:
                                        CallableC1627.m5507();
                                        if (C3722.f13525 > 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i24;
                                            i26 = ((iM113010 ^ i25) * (-693)) ^ (-1128381222);
                                            i27 = 995079608;
                                        } else {
                                            iM113010 = (i24 - C19806.m45029("᩻۟")) * (-89);
                                            i26 = ((iM113010 ^ i25) * 18581) ^ (-1457469197);
                                            i27 = 1985863218;
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    if (RunnableC1564.f6300) {
                        sArr4 = sArr5;
                        i6 = i18;
                        i5 = i20;
                        sArr3 = sArr7;
                        int iM113010 = (ThreadFactoryC3888.m11306("۬᩸") + i10) * (-121);
                        i21 = 306827701 ^ ((iM113010 ^ i11) * (-13489));
                        i22 = 290902118 ^ iM113010;
                        i20 = i5;
                        sArr7 = sArr3;
                        sArr5 = sArr4;
                        i18 = i6;
                        dialogInterfaceC19357 = dialogInterfaceC19356;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ܺۜ") ^ i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i21 = ((iM113011 ^ i11) * (-22413)) ^ 144585474;
                        i22 = iM113011 ^ (-2136790403);
                    }
                    break;
                case -1851386067:
                case 1711391191:
                    C7105.m18983(c9186, dialogInterfaceC19357, new C14699(interfaceC15456));
                    iM11307 = ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(f77137, 42, 3, i14));
                    i16 = 2101112229;
                    if (C1461.m5080()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i11) * 67;
                        i21 = (-1585543304) ^ ((iM45029 ^ i10) * 31723);
                        i3 = 1654697019;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܳ") + i10) * 27;
                        i21 = 1767842424 ^ ((iM45029 ^ i11) * (-31459));
                        i3 = 1027552241;
                    }
                    i22 = i3 ^ iM45029;
                    break;
                case -1835329099:
                case -577905794:
                    i4 = i20;
                    View viewM8167 = C2642.m8167(view, C19806.m45029(RunnableC1606.m5481(sArr7, i4, i15, i14)) ^ 2098086104);
                    C1937.m6286(viewM8167, str);
                    viewOnClickListenerC23871.f77143 = (TextView) viewM8167;
                    sArr6 = f77137;
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i10;
                        i21 = ((iM11306 ^ i11) * (-25121)) ^ 125455322;
                        i9 = -1118402044;
                    } else {
                        iM11306 = C19806.m45029("᩹ۡ") ^ i11;
                        i21 = ((iM11306 ^ i10) * 8995) ^ 401993786;
                        i9 = 1892613377;
                    }
                    i22 = iM11306 ^ i9;
                    i20 = i4;
                    break;
                case -1829879048:
                case 1154593852:
                    C1937.m6291(viewM10957, onClickListener);
                    C7105.m18993(C2642.m8167(view, R.id.button3), new View.OnClickListener() { // from class: l.ܺᩳ᩺
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ViewOnClickListenerC23871.m52592(this.f52091);
                        }
                    });
                    final Button button = (Button) C3743.m10957(view, R.id.button2);
                    C7105.m18993(button, new View.OnClickListener() { // from class: l.᩶ᩳ᩺
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ViewOnClickListenerC23871.m52599(this.f65884);
                        }
                    });
                    C1937.m6282(C3141.f11846, dialogInterfaceC19357, new C14699(new InterfaceC15456() { // from class: l.֡ᩳ᩺

                        /* JADX INFO: renamed from: ᩶᩻ܶ, reason: not valid java name and contains not printable characters */
                        private static final short[] f2556 = {6677, -29283, -29285, -29299, -29286, -29253, -29284, -29303, -29284, -29299, 779, 1783, -6189, 2302, 5108, -4589};

                        /* JADX WARN: Code duplicated, block: B:84:0x0358 A[PHI: r6 r7 r8 r9 r14 r15 r16 r27
                          0x0358: PHI (r6v5 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r7v4 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v3 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r16v5 short[]) = (r16v2 short[]), (r16v4 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
                          0x0358: PHI (r27v28 l.ۢۡ᩺) = (r27v21 l.ۢۡ᩺), (r27v22 l.ۢۡ᩺), (r27v3 l.ۢۡ᩺), (r27v3 l.ۢۡ᩺), (r27v3 l.ۢۡ᩺) binds: [B:58:0x0229, B:55:0x0206, B:39:0x0141, B:17:0x009d, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:6:0x006d, code lost:
                        
                            if (l.C7105.m18985() != false) goto L16;
                         */
                        @Override // l.InterfaceC15456
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r30) {
                            /*
                                Method dump skipped, instruction units count: 1104
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.C0586.invoke(java.lang.Object):java.lang.Object");
                        }
                    }));
                    if (C1977.m6366()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۟") + i10) * (-123);
                        i21 = 671405441 ^ ((iM45029 ^ i11) * (-16125));
                        i3 = 908931367;
                    } else {
                        iM45029 = (i11 - C19806.m45029("۫ۧ")) * (-71);
                        i21 = 1768391720 ^ ((iM45029 ^ i10) * (-3853));
                        i3 = -1394950966;
                    }
                    i22 = i3 ^ iM45029;
                    break;
                case -1681472463:
                case 2068594323:
                    viewOnClickListenerC23871.f77141 = (TextView) view2;
                    C7105.m18983(C3141.f11848, dialogInterfaceC19357, new C14699(new InterfaceC15456() { // from class: l.ܽᩳ᩺
                        @Override // l.InterfaceC15456
                        public final Object invoke(Object obj) {
                            ViewOnClickListenerC23871 viewOnClickListenerC23872 = null;
                            int i23 = 925243852;
                            int i24 = C7105.f23796;
                            int i25 = C1189.f5284;
                            int iM450216 = C19806.m45029("ۨ᩷") ^ i25;
                            int i26 = ((iM450216 ^ i24) * 3331) ^ 1988267884;
                            int i27 = -1710058444;
                            while (true) {
                                i23 = ((((i23 ^ i24) * (-20573)) >> 31) & i26) ^ (iM450216 ^ i27);
                                switch (i23) {
                                    case -2121471119:
                                    case 470373439:
                                        if (C0050.f912 <= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۢ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-5341)) ^ 1299728430;
                                            i27 = 725806343;
                                        } else {
                                            iM450216 = (ThreadFactoryC3888.m11306("ۖ֡") + i25) * 45;
                                            i26 = ((iM450216 ^ i24) * (-27681)) ^ 605207584;
                                            i27 = 1914254253;
                                        }
                                        break;
                                    case -2027653198:
                                    case 59018234:
                                        if (C1461.f5957 <= 0) {
                                            iM450216 = C19806.m45029("ܶۡ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-11409)) ^ 1704413555;
                                            i27 = 1432003647;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۛۘ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-26793)) ^ (-932714421);
                                            i27 = -962936234;
                                        }
                                        break;
                                    case -1794035767:
                                    case -1705670559:
                                        if (C1875.m6086() != 0) {
                                            iM450216 = C19806.m45029("ۤۙ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 22893) ^ (-76202959);
                                            i27 = -543160344;
                                        } else {
                                            iM450216 = C19806.m45029("ܺۚ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-23751)) ^ (-2017961983);
                                            i27 = 136726176;
                                        }
                                        break;
                                    case -1583646608:
                                    case -22502772:
                                        return ViewOnClickListenerC23871.m52594(viewOnClickListenerC23872, (C1730) obj);
                                    case -1534765247:
                                    case 986842671:
                                        if (C0216.f1393 == 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۢ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-5341)) ^ 1299728430;
                                            i27 = 725806343;
                                        } else {
                                            iM450216 = C19806.m45029("ۤۙ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 22893) ^ (-76202959);
                                            i27 = -543160344;
                                        }
                                        break;
                                    case -1227054278:
                                    case 1149963444:
                                        viewOnClickListenerC23872 = this.f53821;
                                        if (C1461.f5957 <= 0) {
                                            iM450216 = (C19806.m45029("᩶۫") + i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i26 = ((iM450216 ^ i25) * (-16049)) ^ 1980596445;
                                            i27 = -558961687;
                                        } else {
                                            iM450216 = (C19806.m45029("۫֨") + i24) * 81;
                                            i26 = ((iM450216 ^ i25) * (-31019)) ^ 1796203837;
                                            i27 = -1415585412;
                                        }
                                        break;
                                    case -1220977116:
                                    case 1527046743:
                                        if (!C2332.f8260) {
                                            iM450216 = C19806.m45029("ۤۙ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 22893) ^ (-76202959);
                                            i27 = -543160344;
                                        } else {
                                            iM450216 = C19806.m45029("ܶۡ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-11409)) ^ 1704413555;
                                            i27 = 1432003647;
                                        }
                                        break;
                                    case -1152063017:
                                    case -1046710157:
                                        if (C2642.f10294 <= 0) {
                                            iM450216 = (C19806.m45029("᩶۫") + i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i26 = ((iM450216 ^ i25) * (-16049)) ^ 1980596445;
                                            i27 = -558961687;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֨᩸") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 28407) ^ (-952170358);
                                            i27 = 1942157339;
                                        }
                                        break;
                                    case -1035799185:
                                    case 1443389152:
                                        if (C2704.f10408) {
                                            iM450216 = ThreadFactoryC3888.m11306("ܿ᩵") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 22033) ^ 1400617926;
                                            i27 = 1273513288;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۢ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-5341)) ^ 1299728430;
                                            i27 = 725806343;
                                        }
                                        break;
                                    case -893278964:
                                    case 365203122:
                                        C0629.m2907();
                                        iM450216 = C19806.m45029("ܶۡ") ^ i25;
                                        i26 = ((iM450216 ^ i24) * (-11409)) ^ 1704413555;
                                        i27 = 1432003647;
                                        break;
                                    case -660050125:
                                    case -395889789:
                                        if (C3722.f13525 <= 0) {
                                            iM450216 = C19806.m45029("ۤۙ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * 22893) ^ (-76202959);
                                            i27 = -543160344;
                                        } else {
                                            iM450216 = C19806.m45029("۬ܳ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 11469) ^ (-513498003);
                                            i27 = -367792233;
                                        }
                                        break;
                                    case -623586579:
                                    case 1455104107:
                                        C2871.m8646();
                                        if (!RunnableC1564.f6300) {
                                            iM450216 = (i24 - ThreadFactoryC3888.m11306("ۖۨ")) * 59;
                                            i26 = ((iM450216 ^ i25) * 3069) ^ 305830536;
                                            i27 = -1640024768;
                                        } else {
                                            iM450216 = C19806.m45029("ܶۡ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-11409)) ^ 1704413555;
                                            i27 = 1432003647;
                                        }
                                        break;
                                    case -510937238:
                                    case 2108566915:
                                        if (C3660.m10791() != 0) {
                                            iM450216 = (C19806.m45029("᩶۫") + i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i26 = ((iM450216 ^ i25) * (-16049)) ^ 1980596445;
                                            i27 = -558961687;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤ۬") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-1235)) ^ 1036943342;
                                            i27 = 570669604;
                                        }
                                        break;
                                    case -363536758:
                                    case 1993796181:
                                        if (C2332.f8260) {
                                            iM450216 = C19806.m45029("᩺ۘ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * 5295) ^ 2107627881;
                                            i27 = 233548844;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֡ۢ") ^ i25;
                                            i26 = ((iM450216 ^ i24) * (-5341)) ^ 1299728430;
                                            i27 = 725806343;
                                        }
                                        break;
                                    case -107791955:
                                    case 622655589:
                                        C0797.m3359();
                                        return null;
                                    default:
                                        if (C0629.f2722 <= 0) {
                                            iM450216 = (i24 - ThreadFactoryC3888.m11306("ۖۨ")) * 59;
                                            i26 = ((iM450216 ^ i25) * 3069) ^ 305830536;
                                            i27 = -1640024768;
                                        } else {
                                            iM450216 = C19806.m45029("ۙܽ") ^ i24;
                                            i26 = ((iM450216 ^ i25) * (-1493)) ^ 206284922;
                                            i27 = 200865496;
                                        }
                                        break;
                                }
                            }
                        }
                    }));
                    C1937.m6282(C3141.f11850, dialogInterfaceC19357, new C14699(new InterfaceC15456() { // from class: l.۫ᩳ᩺
                        @Override // l.InterfaceC15456
                        public final Object invoke(Object obj) {
                            ViewOnClickListenerC23871 viewOnClickListenerC23872 = null;
                            int i23 = 412427521;
                            int i24 = C1937.f7317;
                            int i25 = C3722.f13525;
                            int iM113012 = (i24 - ThreadFactoryC3888.m11306("ۢ᩺")) * 29;
                            int i26 = ((iM113012 ^ i25) * 26517) ^ (-2067982722);
                            int i27 = -212369483;
                            while (true) {
                                i23 = ((((i23 ^ i25) * (-18859)) >> 31) & i26) ^ (iM113012 ^ i27);
                                switch (i23) {
                                    case -1893707741:
                                    case 1434588515:
                                        C1066.m4023();
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        return null;
                                    case -1863654019:
                                    case 1198087764:
                                        if (C2124.f7782 <= 0) {
                                            iM113012 = C19806.m45029("ۜۙ") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 3085) ^ 1169490434;
                                            i27 = 1895627204;
                                        } else {
                                            iM113012 = (i25 - ThreadFactoryC3888.m11306("ۡۤ")) * 81;
                                            i26 = ((iM113012 ^ i24) * (-28429)) ^ (-9686222);
                                            i27 = 1218084920;
                                        }
                                        break;
                                    case -1854379946:
                                    case 868342735:
                                        viewOnClickListenerC23872 = this.f42051;
                                        if (CallableC1627.f6528) {
                                            iM113012 = C19806.m45029("ۤ֫") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-10145)) ^ (-288607062);
                                            i27 = -590639624;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("֡۬") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-30927)) ^ (-450378576);
                                            i27 = -592878285;
                                        }
                                        break;
                                    case -1808759585:
                                    case 335401491:
                                        if (C2477.f9839 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۚۢ") ^ i24;
                                            i26 = ((iM113012 ^ i25) * (-27253)) ^ 133929753;
                                            i27 = 769285332;
                                        } else {
                                            iM113012 = (C19806.m45029("ܳ᩷") + i24) * 47;
                                            i26 = ((iM113012 ^ i25) * 30719) ^ (-29582788);
                                            i27 = -326630549;
                                        }
                                        break;
                                    case -1631732553:
                                    case -1517747629:
                                        if (!C2332.f8260) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۚۢ") ^ i24;
                                            i26 = ((iM113012 ^ i25) * (-27253)) ^ 133929753;
                                            i27 = 769285332;
                                        } else {
                                            iM113012 = (i25 - ThreadFactoryC3888.m11306("ۚ֫")) * 73;
                                            i26 = ((iM113012 ^ i24) * 12811) ^ 599903166;
                                            i27 = 1795962725;
                                        }
                                        break;
                                    case -1420859532:
                                    case 704182643:
                                        if (C1066.m4023() <= 0) {
                                            iM113012 = C19806.m45029("ۜۙ") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 3085) ^ 1169490434;
                                            i27 = 1895627204;
                                        } else {
                                            iM113012 = (i24 - C19806.m45029("ۢۗ")) * 87;
                                            i26 = ((iM113012 ^ i25) * (-17141)) ^ 1077882638;
                                            i27 = 230388595;
                                        }
                                        break;
                                    case -1349039576:
                                    case -1161280235:
                                        if (C1977.f7413 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۚۢ") ^ i24;
                                            i26 = ((iM113012 ^ i25) * (-27253)) ^ 133929753;
                                            i27 = 769285332;
                                        } else {
                                            iM113012 = C19806.m45029("ܿ۟") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-15261)) ^ 1218061862;
                                            i27 = 984781293;
                                        }
                                        break;
                                    case -1049265207:
                                    case 1439686654:
                                        if (C1460.f5948 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("֡۬") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-30927)) ^ (-450378576);
                                            i27 = -592878285;
                                        } else {
                                            iM113012 = C19806.m45029("ܿۢ") ^ i24;
                                            i26 = ((iM113012 ^ i25) * (-3887)) ^ 2895085;
                                            i27 = 2059729592;
                                        }
                                        break;
                                    case -966331663:
                                    case 751919517:
                                        C1460.m5050();
                                        C3286.m9798();
                                        iM113012 = C19806.m45029("ۜۙ") ^ i25;
                                        i26 = ((iM113012 ^ i24) * 3085) ^ 1169490434;
                                        i27 = 1895627204;
                                        break;
                                    case -736846280:
                                    case -128274560:
                                        if (C2871.f10837 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("֡۬") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-30927)) ^ (-450378576);
                                            i27 = -592878285;
                                        } else {
                                            iM113012 = (C19806.m45029("ۗ۫") + i24) * 99;
                                            i26 = ((iM113012 ^ i25) * 21219) ^ (-1376833486);
                                            i27 = 647424537;
                                        }
                                        break;
                                    case -608990924:
                                    case 1588146462:
                                        C19806.m45024();
                                        if (C2249.f8050 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۚۢ") ^ i24;
                                            i26 = ((iM113012 ^ i25) * (-27253)) ^ 133929753;
                                            i27 = 769285332;
                                        } else {
                                            iM113012 = C19806.m45029("ۜۙ") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 3085) ^ 1169490434;
                                            i27 = 1895627204;
                                        }
                                        break;
                                    case -105553563:
                                    case 1162933727:
                                        return ViewOnClickListenerC23871.m52597(viewOnClickListenerC23872, (C1730) obj);
                                    case -103291006:
                                    case 1893357102:
                                        if (C1460.f5948 < 0) {
                                            iM113012 = (i24 - C19806.m45029("֡᩵")) * 123;
                                            i26 = ((iM113012 ^ i25) * (-21301)) ^ (-831624553);
                                            i27 = -425534352;
                                        } else {
                                            iM113012 = C19806.m45029("ۜۙ") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 3085) ^ 1169490434;
                                            i27 = 1895627204;
                                        }
                                        break;
                                    case 31156180:
                                    case 533479863:
                                        if (C1025.f4800 >= 0) {
                                            iM113012 = (i25 - ThreadFactoryC3888.m11306("ۚ֫")) * 73;
                                            i26 = ((iM113012 ^ i24) * 12811) ^ 599903166;
                                            i27 = 1795962725;
                                        } else {
                                            iM113012 = (C19806.m45029("᩶ۘ") ^ i24) * 5;
                                            i26 = ((iM113012 ^ i25) * (-22955)) ^ 367403357;
                                            i27 = 1659250699;
                                        }
                                        break;
                                    case 293233019:
                                    case 622191731:
                                        if (C19806.m45024()) {
                                            iM113012 = ThreadFactoryC3888.m11306("֡۬") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-30927)) ^ (-450378576);
                                            i27 = -592878285;
                                        } else {
                                            iM113012 = C19806.m45029("᩵۫") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 7317) ^ 1790339464;
                                            i27 = -1964357916;
                                        }
                                        break;
                                    default:
                                        if (C1977.m6356()) {
                                            iM113012 = (i24 - C19806.m45029("֡᩵")) * 123;
                                            i26 = ((iM113012 ^ i25) * (-21301)) ^ (-831624553);
                                            i27 = -425534352;
                                        } else {
                                            iM113012 = C19806.m45029("ۛۗ") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-9963)) ^ (-1002866832);
                                            i27 = 1890661240;
                                        }
                                        break;
                                }
                            }
                        }
                    }));
                    C9186 c9187 = C3141.f11847;
                    InterfaceC15456 interfaceC15457 = new InterfaceC15456() { // from class: l.ܿᩳ᩺
                        @Override // l.InterfaceC15456
                        public final Object invoke(Object obj) {
                            ViewOnClickListenerC23871 viewOnClickListenerC23872 = null;
                            int i23 = -607868257;
                            int i24 = C2642.f10294;
                            int i25 = C1189.f5284;
                            int iM113012 = (ThreadFactoryC3888.m11306("ᩳۙ") + i25) * 43;
                            int i26 = ((iM113012 ^ i24) * 28711) ^ (-384162444);
                            int i27 = -71714064;
                            while (true) {
                                i23 = ((((i23 ^ i24) * (-20465)) >> 31) & i26) ^ (iM113012 ^ i27);
                                switch (i23) {
                                    case -1801813449:
                                    case -196284774:
                                        viewOnClickListenerC23872 = this.f55692;
                                        if (C1066.m4023() <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩺᩹") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-19767)) ^ (-1284749161);
                                            i27 = 391087429;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ܰܶ") + i25) * (-113);
                                            i26 = ((iM113012 ^ i24) * (-13005)) ^ (-1169149354);
                                            i27 = -1304377023;
                                        }
                                        break;
                                    case -1330193429:
                                    case 222314609:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩹᩶") + i24) * 69;
                                            i26 = ((iM113012 ^ i25) * (-18965)) ^ (-1426736862);
                                            i27 = 1573212019;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۖۡ") ^ i25) * 65;
                                            i26 = ((iM113012 ^ i24) * (-7647)) ^ 45370602;
                                            i27 = -1151164305;
                                        }
                                        break;
                                    case -1269814850:
                                    case -230669353:
                                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩹᩶") + i24) * 69;
                                            i26 = ((iM113012 ^ i25) * (-18965)) ^ (-1426736862);
                                            i27 = 1573212019;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ܶ᩻") ^ i24;
                                            i26 = ((iM113012 ^ i25) * 173) ^ 628531436;
                                            i27 = 316391502;
                                        }
                                        break;
                                    case -1037922568:
                                    case -552299337:
                                        return ViewOnClickListenerC23871.m52598(viewOnClickListenerC23872, (C1730) obj);
                                    case -1002512602:
                                    case -555491448:
                                        C1189.m4368();
                                        iM113012 = C19806.m45029("᩷᩸") ^ i25;
                                        i26 = ((iM113012 ^ i24) * 875) ^ (-98646554);
                                        i27 = 847571919;
                                        break;
                                    case -763711736:
                                    case 1728737355:
                                        if (!RunnableC1895.f7152) {
                                            iM113012 = C19806.m45029("ۨ᩷") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 32399) ^ (-611706106);
                                            i27 = -1412161486;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩹᩶") + i24) * 69;
                                            i26 = ((iM113012 ^ i25) * (-18965)) ^ (-1426736862);
                                            i27 = 1573212019;
                                        }
                                        break;
                                    case -670496000:
                                    case -588864844:
                                        CallableC1627.m5507();
                                        if (!RunnableC1564.f6300) {
                                            iM113012 = C19806.m45029("ۨ᩷") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 32399) ^ (-611706106);
                                            i27 = -1412161486;
                                        } else {
                                            iM113012 = (C19806.m45029("ۜۖ") ^ i24) * 83;
                                            i26 = ((iM113012 ^ i25) * (-19623)) ^ (-9647257);
                                            i27 = -510224312;
                                        }
                                        break;
                                    case -611161460:
                                    case 1517772854:
                                        C0671.m3008();
                                        if (C1398.f5802 > 0) {
                                            iM113012 = (C19806.m45029("ۜۖ") ^ i24) * 83;
                                            i26 = ((iM113012 ^ i25) * (-19623)) ^ (-9647257);
                                            i27 = -510224312;
                                        } else {
                                            iM113012 = C19806.m45029("᩷᩸") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 875) ^ (-98646554);
                                            i27 = 847571919;
                                        }
                                        break;
                                    case -543544914:
                                    case 1997735410:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩺᩹") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-19767)) ^ (-1284749161);
                                            i27 = 391087429;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i24;
                                            i26 = ((iM113012 ^ i25) * (-26819)) ^ (-650301671);
                                            i27 = 820082396;
                                        }
                                        break;
                                    case -537282356:
                                    case -431587811:
                                        if (C3660.f13403 >= 0) {
                                            iM113012 = C19806.m45029("ۨ᩷") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 32399) ^ (-611706106);
                                            i27 = -1412161486;
                                        } else {
                                            iM113012 = (i25 - C19806.m45029("ۤܳ")) * 79;
                                            i26 = ((iM113012 ^ i24) * (-28393)) ^ (-650181703);
                                            i27 = -252627710;
                                        }
                                        break;
                                    case -445799625:
                                    case 1119952671:
                                        C1419.m4973();
                                        return null;
                                    case 30611431:
                                    case 1210842782:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113012 = (C19806.m45029("ۜۖ") ^ i24) * 83;
                                            i26 = ((iM113012 ^ i25) * (-19623)) ^ (-9647257);
                                            i27 = -510224312;
                                        } else {
                                            iM113012 = (i24 - ThreadFactoryC3888.m11306("ܺۜ")) * 73;
                                            i26 = ((iM113012 ^ i25) * (-5701)) ^ 1725043887;
                                            i27 = 1946616298;
                                        }
                                        break;
                                    case 237862591:
                                    case 985415445:
                                        if (C1189.f5284 <= 0) {
                                            iM113012 = (C19806.m45029("ۜۖ") ^ i24) * 83;
                                            i26 = ((iM113012 ^ i25) * (-19623)) ^ (-9647257);
                                            i27 = -510224312;
                                        } else {
                                            iM113012 = (i24 - C19806.m45029("ᩴ᩵")) * (-53);
                                            i26 = ((iM113012 ^ i25) * 18967) ^ (-573408509);
                                            i27 = -505122684;
                                        }
                                        break;
                                    case 425920616:
                                    case 796582748:
                                        if (C1148.f5161 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩺᩹") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-19767)) ^ (-1284749161);
                                            i27 = 391087429;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ۘۛ") ^ i25;
                                            i26 = ((iM113012 ^ i24) * 22189) ^ (-423611719);
                                            i27 = -1346381314;
                                        }
                                        break;
                                    case 1434346556:
                                    case 1969768153:
                                        if (C1066.f4915 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩺᩹") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-19767)) ^ (-1284749161);
                                            i27 = 391087429;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ܽܰ") ^ i24;
                                            i26 = ((iM113012 ^ i25) * 16813) ^ (-107924527);
                                            i27 = -304357762;
                                        }
                                        break;
                                    default:
                                        if (C2788.f10625 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩺᩹") ^ i25;
                                            i26 = ((iM113012 ^ i24) * (-19767)) ^ (-1284749161);
                                            i27 = 391087429;
                                        } else {
                                            iM113012 = (C19806.m45029("᩻᩹") ^ i25) * (-41);
                                            i26 = ((iM113012 ^ i24) * (-9095)) ^ (-983867118);
                                            i27 = 85501662;
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    if (C2788.f10625 < 0) {
                        C1937.m6282(c9187, dialogInterfaceC19357, new C14699(interfaceC15457));
                        C1937.m6282(C3141.f11852, dialogInterfaceC19357, new C14699(new InterfaceC15456() { // from class: l.ۛᩳ᩺
                            @Override // l.InterfaceC15456
                            public final Object invoke(Object obj) {
                                int i23 = 1846223628;
                                int i24 = C1398.f5802;
                                int i25 = C7105.f23796;
                                int iM450216 = C19806.m45029("۠۟") ^ i24;
                                int i26 = ((iM450216 ^ i25) * 22963) ^ 1051102775;
                                int i27 = 2138335076;
                                while (true) {
                                    i23 = ((((i23 ^ i25) * 8713) >> 31) & i26) ^ (iM450216 ^ i27);
                                    switch (i23) {
                                        case -2118848929:
                                        case 1044269374:
                                            if (C1977.m6356()) {
                                                iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                                i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                                i27 = -521698910;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("᩺ܳ") ^ i24;
                                                i26 = ((iM450216 ^ i25) * (-31523)) ^ (-1237113822);
                                                i27 = -473059625;
                                            }
                                            break;
                                        case -1959109087:
                                        case -1019838670:
                                            return ViewOnClickListenerC23871.m52593(this.f21148);
                                        case -1862118049:
                                        case 65701758:
                                            if (C1461.m5080()) {
                                                iM450216 = ThreadFactoryC3888.m11306("֨᩸") ^ i25;
                                                i26 = ((iM450216 ^ i24) * 3065) ^ 1718286417;
                                                i27 = 458823490;
                                            } else {
                                                iM450216 = (C19806.m45029("ܺۡ") + i25) * 53;
                                                i26 = ((iM450216 ^ i24) * (-19)) ^ (-346442627);
                                                i27 = -623189806;
                                            }
                                            break;
                                        case -1635316962:
                                        case -784495683:
                                            if (C2124.f7782 > 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("֫۬") ^ i25;
                                                i26 = ((iM450216 ^ i24) * (-22925)) ^ (-694699615);
                                                i27 = -116904031;
                                            } else {
                                                iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                                i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                                i27 = -521698910;
                                            }
                                            break;
                                        case -1522167257:
                                        case 862768175:
                                            C1461.m5080();
                                            C2332.m7079();
                                            iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                            i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                            i27 = -521698910;
                                            break;
                                        case -1242392743:
                                        case -353468897:
                                            if (C1189.m4368() <= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("֫۬") ^ i25;
                                                i26 = ((iM450216 ^ i24) * (-22925)) ^ (-694699615);
                                                i27 = -116904031;
                                            } else {
                                                iM450216 = (i24 - C19806.m45029("ۧ᩻")) * 5;
                                                i26 = ((iM450216 ^ i25) * 22793) ^ 858707743;
                                                i27 = -1663075895;
                                            }
                                            break;
                                        case -1202679934:
                                        case 212283997:
                                            if (C3577.f13150 >= 0) {
                                                iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                                i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                                i27 = -521698910;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ۙ᩹") + i25) * (-7);
                                                i26 = ((iM450216 ^ i24) * 22287) ^ (-1323152777);
                                                i27 = -158348760;
                                            }
                                            break;
                                        case -925130541:
                                        case 1159161070:
                                            if (C1377.m4833() != 0) {
                                                iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                                i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                                i27 = -521698910;
                                            } else {
                                                iM450216 = (C19806.m45029("۟ᩳ") + i25) * (-19);
                                                i26 = ((iM450216 ^ i24) * (-9381)) ^ (-51495137);
                                                i27 = -107913063;
                                            }
                                            break;
                                        case -181826299:
                                        case 1028940520:
                                            if (RunnableC0195.f1321 >= 0) {
                                                iM450216 = (C19806.m45029("ܰ᩻") + i24) * 61;
                                                i26 = ((iM450216 ^ i25) * 10139) ^ (-142741242);
                                                i27 = 1940595919;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ۤۗ") + i24) * (-63);
                                                i26 = ((iM450216 ^ i25) * 29123) ^ 471499392;
                                                i27 = 756403257;
                                            }
                                            break;
                                        case 461390313:
                                        case 1270489700:
                                            if (ThreadFactoryC3888.f14547 <= 0) {
                                                iM450216 = (i25 - C19806.m45029("ۢۤ")) * (-23);
                                                i26 = ((iM450216 ^ i24) * (-14049)) ^ 908259043;
                                                i27 = -1499983580;
                                            } else {
                                                iM450216 = C19806.m45029("ۖܽ") ^ i25;
                                                i26 = ((iM450216 ^ i24) * (-26267)) ^ (-415073468);
                                                i27 = -147788576;
                                            }
                                            break;
                                        case 793016671:
                                        case 931268666:
                                            C10634.m26820();
                                            return null;
                                        case 847180252:
                                        case 937582823:
                                            if (C3660.f13403 < 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("֨᩸") ^ i25;
                                                i26 = ((iM450216 ^ i24) * 3065) ^ 1718286417;
                                                i27 = 458823490;
                                            } else {
                                                iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                                i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                                i27 = -521698910;
                                            }
                                            break;
                                        case 1009750108:
                                        case 1865219158:
                                            if (C3743.f13569) {
                                                iM450216 = ThreadFactoryC3888.m11306("۫ۨ") ^ i24;
                                                i26 = ((iM450216 ^ i25) * (-31043)) ^ 1673405909;
                                                i27 = -1040476481;
                                            } else {
                                                iM450216 = (C19806.m45029("ܰ᩻") + i24) * 61;
                                                i26 = ((iM450216 ^ i25) * 10139) ^ (-142741242);
                                                i27 = 1940595919;
                                            }
                                            break;
                                        case 1216657993:
                                        case 1757993108:
                                            if (AbstractC0464.f2088 <= 0) {
                                                iM450216 = (i25 - C19806.m45029("ۢۤ")) * (-23);
                                                i26 = ((iM450216 ^ i24) * (-14049)) ^ 908259043;
                                                i27 = -1499983580;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("᩸ۤ") ^ i25) * (-93);
                                                i26 = ((iM450216 ^ i24) * 16131) ^ (-1179526673);
                                                i27 = -212422776;
                                            }
                                            break;
                                        case 1865909450:
                                        case 2005414801:
                                            if (!CallableC1627.f6528) {
                                                iM450216 = (C19806.m45029("ܰ᩻") + i24) * 61;
                                                i26 = ((iM450216 ^ i25) * 10139) ^ (-142741242);
                                                i27 = 1940595919;
                                            } else {
                                                iM450216 = (i24 - ThreadFactoryC3888.m11306("ܺܿ")) * 5;
                                                i26 = ((iM450216 ^ i25) * (-13869)) ^ (-1696864080);
                                                i27 = -521698910;
                                            }
                                            break;
                                        default:
                                            if (C0629.f2722 <= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("֫۬") ^ i25;
                                                i26 = ((iM450216 ^ i24) * (-22925)) ^ (-694699615);
                                                i27 = -116904031;
                                            } else {
                                                iM450216 = (C19806.m45029("ۙܽ") ^ i24) * (-35);
                                                i26 = ((iM450216 ^ i25) * (-12941)) ^ (-307726415);
                                                i27 = 279402280;
                                            }
                                            break;
                                    }
                                }
                            }
                        }));
                        c9186 = C3141.f11849;
                        interfaceC15456 = new InterfaceC15456() { // from class: l.ۧᩳ᩺
                            @Override // l.InterfaceC15456
                            public final Object invoke(Object obj) {
                                int i23 = 640777831;
                                int i24 = C3577.f13150;
                                int i25 = C1189.f5284;
                                int iM450216 = (C19806.m45029("ۗ۬") + i24) * 83;
                                int i26 = ((iM450216 ^ i25) * (-16307)) ^ 308533210;
                                int i27 = -685477841;
                                while (true) {
                                    i23 = ((((i23 ^ i25) * 4761) >> 31) & i26) ^ (iM450216 ^ i27);
                                    switch (i23) {
                                        case -1980562112:
                                        case -776804602:
                                            if (!C1419.m4973()) {
                                                iM450216 = (i25 - ThreadFactoryC3888.m11306("ۢۤ")) * (-101);
                                                i26 = ((iM450216 ^ i24) * 25155) ^ (-596206062);
                                                i27 = 219585646;
                                            } else {
                                                iM450216 = (C19806.m45029("֨ۘ") + i24) * 35;
                                                i26 = ((iM450216 ^ i25) * (-9519)) ^ (-1903915656);
                                                i27 = 677957084;
                                            }
                                            break;
                                        case -1790044155:
                                        case -333244928:
                                            if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                                                iM450216 = (i25 - ThreadFactoryC3888.m11306("ۢۤ")) * (-101);
                                                i26 = ((iM450216 ^ i24) * 25155) ^ (-596206062);
                                                i27 = 219585646;
                                            } else {
                                                iM450216 = C19806.m45029("ۨ᩵") ^ i25;
                                                i26 = ((iM450216 ^ i24) * (-30443)) ^ 1908345840;
                                                i27 = 607009738;
                                            }
                                            break;
                                        case -1587510284:
                                        case 1018531699:
                                            if (C19806.f63586) {
                                                iM450216 = C19806.m45029("ܳ᩷") ^ i24;
                                                i26 = ((iM450216 ^ i25) * 12159) ^ (-1049561723);
                                                i27 = -1161814572;
                                            } else {
                                                iM450216 = C19806.m45029("ᩳܽ") ^ i24;
                                                i26 = ((iM450216 ^ i25) * 32535) ^ (-1840820867);
                                                i27 = 260071804;
                                            }
                                            break;
                                        case -1298590123:
                                        case 2087880814:
                                            if (ThreadFactoryC3888.f14547 <= 0) {
                                                iM450216 = C19806.m45029("ܳ᩷") ^ i24;
                                                i26 = ((iM450216 ^ i25) * 12159) ^ (-1049561723);
                                                i27 = -1161814572;
                                            } else {
                                                iM450216 = C19806.m45029("᩷۬") ^ i25;
                                                i26 = ((iM450216 ^ i24) * (-11971)) ^ (-459646780);
                                                i27 = 185098616;
                                            }
                                            break;
                                        case -1183191845:
                                        case 786443515:
                                            C1377.m4833();
                                            if (C0216.f1393 == 0) {
                                                iM450216 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i25) * (-63);
                                                i26 = ((iM450216 ^ i24) * 10451) ^ 895028226;
                                                i27 = -1142787819;
                                            } else {
                                                iM450216 = (C19806.m45029("֨ۘ") + i24) * 35;
                                                i26 = ((iM450216 ^ i25) * (-9519)) ^ (-1903915656);
                                                i27 = 677957084;
                                            }
                                            break;
                                        case -1181231075:
                                        case 1416130934:
                                            if (C0278.m1789() <= 0) {
                                                iM450216 = (C19806.m45029("֨ۘ") + i24) * 35;
                                                i26 = ((iM450216 ^ i25) * (-9519)) ^ (-1903915656);
                                                i27 = 677957084;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("ۜۘ") ^ i25;
                                                i26 = ((iM450216 ^ i24) * 13167) ^ 998167686;
                                                i27 = 1523913838;
                                            }
                                            break;
                                        case -750896853:
                                        case 1260034984:
                                            if (C7105.f23796 >= 0) {
                                                iM450216 = (C19806.m45029("ۤܶ") + i24) * (-9);
                                                i26 = ((iM450216 ^ i25) * 32669) ^ (-1735707396);
                                                i27 = 1601306805;
                                            } else {
                                                iM450216 = (i24 - C19806.m45029("֫᩺")) * (-51);
                                                i26 = ((iM450216 ^ i25) * 3427) ^ 1516690113;
                                                i27 = -5467775;
                                            }
                                            break;
                                        case -689405611:
                                        case 37481499:
                                            if (C1025.f4800 >= 0) {
                                                iM450216 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i25) * (-63);
                                                i26 = ((iM450216 ^ i24) * 10451) ^ 895028226;
                                                i27 = -1142787819;
                                            } else {
                                                iM450216 = (i25 - C19806.m45029("ܺᩳ")) * (-95);
                                                i26 = ((iM450216 ^ i24) * 19645) ^ (-309512380);
                                                i27 = 711938774;
                                            }
                                            break;
                                        case -447816182:
                                        case -102914132:
                                            C10634.m26820();
                                            iM450216 = (C19806.m45029("֨ۘ") + i24) * 35;
                                            i26 = ((iM450216 ^ i25) * (-9519)) ^ (-1903915656);
                                            i27 = 677957084;
                                            break;
                                        case -403239305:
                                        case 241502776:
                                            if (C3660.f13403 >= 0) {
                                                iM450216 = (i25 - ThreadFactoryC3888.m11306("ۢۤ")) * (-101);
                                                i26 = ((iM450216 ^ i24) * 25155) ^ (-596206062);
                                                i27 = 219585646;
                                            } else {
                                                iM450216 = (C19806.m45029("᩷᩷") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i26 = ((iM450216 ^ i25) * 21557) ^ (-929002703);
                                                i27 = 325607915;
                                            }
                                            break;
                                        case -133992236:
                                        case 1178822298:
                                            return ViewOnClickListenerC23871.m52596(this.f37850);
                                        case -113776107:
                                        case 37762101:
                                            ViewTreeObserverOnPreDrawListenerC3327.m9874();
                                            return null;
                                        case 714306851:
                                        case 2076087719:
                                            if (C3535.f13026 <= 0) {
                                                iM450216 = (i25 - ThreadFactoryC3888.m11306("ۢۤ")) * (-101);
                                                i26 = ((iM450216 ^ i24) * 25155) ^ (-596206062);
                                                i27 = 219585646;
                                            } else {
                                                iM450216 = (C19806.m45029("۠ܳ") + i24) * (-97);
                                                i26 = ((iM450216 ^ i25) * 25345) ^ (-1011296088);
                                                i27 = -2066195919;
                                            }
                                            break;
                                        case 1153165843:
                                        case 1844139136:
                                            if (C3535.f13026 <= 0) {
                                                iM450216 = (C19806.m45029("֨ۘ") + i24) * 35;
                                                i26 = ((iM450216 ^ i25) * (-9519)) ^ (-1903915656);
                                                i27 = 677957084;
                                            } else {
                                                iM450216 = (C19806.m45029("֨ۙ") + i25) * (-33);
                                                i26 = ((iM450216 ^ i24) * (-23719)) ^ 1883596802;
                                                i27 = -1166078931;
                                            }
                                            break;
                                        case 1500042179:
                                        case 2068701212:
                                            if (RunnableC1606.f6488 >= 0) {
                                                iM450216 = C19806.m45029("ܳ᩷") ^ i24;
                                                i26 = ((iM450216 ^ i25) * 12159) ^ (-1049561723);
                                                i27 = -1161814572;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ᩴ᩺") ^ i24) * (-15);
                                                i26 = ((iM450216 ^ i25) * 4511) ^ (-282531710);
                                                i27 = 367939409;
                                            }
                                            break;
                                        default:
                                            if (AbstractC0464.f2088 > 0) {
                                                iM450216 = (C19806.m45029("ۤܶ") + i24) * (-9);
                                                i26 = ((iM450216 ^ i25) * 32669) ^ (-1735707396);
                                                i27 = 1601306805;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ۨۖ") ^ i25) * (-63);
                                                i26 = ((iM450216 ^ i24) * 10451) ^ 895028226;
                                                i27 = -1142787819;
                                            }
                                            break;
                                    }
                                }
                            }
                        };
                        if (CallableC1627.m5507() != 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i11) * 67;
                            i21 = (-1585543304) ^ ((iM45029 ^ i10) * 31723);
                            i3 = 1654697019;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۜ֡") ^ i11;
                            i21 = (-1550130313) ^ ((iM45029 ^ i10) * 9689);
                            i3 = 1046719669;
                        }
                        i22 = i3 ^ iM45029;
                    } else {
                        i4 = i20;
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i10;
                        i21 = ((iM11306 ^ i11) * (-25121)) ^ 125455322;
                        i9 = -1118402044;
                        i22 = iM11306 ^ i9;
                        i20 = i4;
                    }
                    break;
                case -1606916476:
                case 868043384:
                    C2642.m8171();
                    if (!C0797.f3386) {
                        sArr4 = sArr5;
                        i6 = i18;
                        i5 = i20;
                        sArr3 = sArr7;
                        int iM113012 = (ThreadFactoryC3888.m11306("۬᩸") + i10) * (-121);
                        i21 = 306827701 ^ ((iM113012 ^ i11) * (-13489));
                        i22 = 290902118 ^ iM113012;
                        i20 = i5;
                        sArr7 = sArr3;
                        sArr5 = sArr4;
                        i18 = i6;
                        dialogInterfaceC19357 = dialogInterfaceC19356;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i11) * 67;
                        i21 = (-1585543304) ^ ((iM45029 ^ i10) * 31723);
                        i3 = 1654697019;
                        i22 = i3 ^ iM45029;
                    }
                    break;
                case -1332995501:
                case 892149516:
                    int i23 = i18;
                    short[] sArr8 = sArr7;
                    viewOnClickListenerC23871.f77140 = abstractActivityC12483;
                    iM450214 = C19806.m45029(ThreadFactoryC3888.m11312(f77137, 10, 3, i14));
                    int iM450216 = C19806.m45029("ۤ᩸") ^ i10;
                    int i24 = ((iM450216 ^ i11) * (-28947)) ^ (-211083532);
                    i22 = 689049852 ^ iM450216;
                    viewOnClickListenerC23871 = this;
                    dialogInterfaceC19357 = dialogInterfaceC19356;
                    i20 = i20;
                    sArr5 = sArr5;
                    i21 = i24;
                    sArr7 = sArr8;
                    i18 = i23;
                    break;
                case -1305129808:
                case -739276187:
                    C0817.m3399();
                    C0629.m2907();
                    iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i11) * 67;
                    i21 = (-1585543304) ^ ((iM45029 ^ i10) * 31723);
                    i3 = 1654697019;
                    i22 = i3 ^ iM45029;
                    break;
                case -1052822162:
                case -175177752:
                    sArr = sArr5;
                    i = i18;
                    strM1588 = C0216.m1588(sArr, i, 17, i14);
                    i2 = i20;
                    View view3 = viewM10958;
                    C7105.m18988(view3, strM1588);
                    viewOnClickListenerC23871.f77139 = (TextView) view3;
                    sArr2 = sArr7;
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(f77137, 30, 3, i14);
                    if (CallableC1627.f6528) {
                        iM450210 = ThreadFactoryC3888.m11306("۫ۗ") ^ i10;
                        i8 = ((iM450210 ^ i11) * 14503) ^ 106641688;
                        i7 = 1282987191;
                    } else {
                        iM450210 = (C19806.m45029("ۜ᩻") ^ i10) * 77;
                        i8 = ((iM450210 ^ i11) * 13861) ^ 43140254;
                        i7 = -1106579731;
                    }
                    int i25 = iM450210 ^ i7;
                    i20 = i2;
                    sArr7 = sArr2;
                    sArr5 = sArr;
                    i18 = i;
                    i21 = i8;
                    str = strM1588;
                    dialogInterfaceC19357 = dialogInterfaceC19356;
                    i22 = i25;
                    break;
                case -961501961:
                case 209931826:
                    View viewM109510 = C3743.m10957(view, iM11307 ^ i16);
                    C1937.m6291(viewM109510, viewOnClickListenerC23871);
                    C0674.m3027(viewM109510);
                    iM11308 = ThreadFactoryC3888.m11306(C1066.m4040(f77137, 45, 3, i14));
                    i17 = 2123476536;
                    iM45029 = ThreadFactoryC3888.m11306("֫ܿ") ^ i11;
                    i21 = (-790172141) ^ ((iM45029 ^ i10) * 5043);
                    i3 = 1025378781;
                    i22 = i3 ^ iM45029;
                    break;
                case -903132175:
                case 1702627342:
                    C7105.m18993(C2642.m8167(view, iM11308 ^ i17), viewOnClickListenerC23871);
                    iM450212 = C19806.m45029(ThreadFactoryC3888.m11312(f77137, 48, 3, i14));
                    if (C3722.f13525 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i10;
                        i21 = 1367750213 ^ ((iM45029 ^ i11) * (-1697));
                        i3 = 1284327038;
                        i22 = i3 ^ iM45029;
                    } else {
                        i4 = i20;
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i10;
                        i21 = ((iM11306 ^ i11) * (-25121)) ^ 125455322;
                        i9 = -1118402044;
                        i22 = iM11306 ^ i9;
                        i20 = i4;
                    }
                    break;
                case -804903815:
                case 135150237:
                    return;
                case -752870744:
                case -188277325:
                    if (C0216.f1393 == 0) {
                        strM1588 = str;
                        sArr = sArr5;
                        i = i18;
                        i2 = i20;
                        sArr2 = sArr7;
                        iM450210 = (C19806.m45029("ۜ᩻") ^ i10) * 77;
                        i8 = ((iM450210 ^ i11) * 13861) ^ 43140254;
                        i7 = -1106579731;
                        int i26 = iM450210 ^ i7;
                        i20 = i2;
                        sArr7 = sArr2;
                        sArr5 = sArr;
                        i18 = i;
                        i21 = i8;
                        str = strM1588;
                        dialogInterfaceC19357 = dialogInterfaceC19356;
                        i22 = i26;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i11) * 67;
                        i21 = (-1585543304) ^ ((iM45029 ^ i10) * 31723);
                        i3 = 1654697019;
                        i22 = i3 ^ iM45029;
                    }
                    break;
                case -433125819:
                case 475295845:
                    C1066.m4023();
                    if (!C3577.m10565()) {
                        strM1588 = str;
                        sArr = sArr5;
                        i = i18;
                        i2 = i20;
                        sArr2 = sArr7;
                        iM450210 = (C19806.m45029("ۜ᩻") ^ i10) * 77;
                        i8 = ((iM450210 ^ i11) * 13861) ^ 43140254;
                        i7 = -1106579731;
                        int i27 = iM450210 ^ i7;
                        i20 = i2;
                        sArr7 = sArr2;
                        sArr5 = sArr;
                        i18 = i;
                        i21 = i8;
                        str = strM1588;
                        dialogInterfaceC19357 = dialogInterfaceC19356;
                        i22 = i27;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ܰ᩶")) * (-75);
                        i21 = 1132894902 ^ ((iM45029 ^ i10) * (-19563));
                        i3 = -1150994031;
                        i22 = i3 ^ iM45029;
                    }
                    break;
                case -310764468:
                case 583708112:
                    View viewM109511 = C3743.m10957(view, C19806.m45029(strM6241) ^ 2100297740);
                    C1937.m6286(viewM109511, str);
                    viewOnClickListenerC23871.f77138 = (TextView) viewM109511;
                    sArr7 = f77137;
                    i20 = 33;
                    i15 = 3;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("۠۫") ^ i11;
                        i21 = 1993071626 ^ ((iM45029 ^ i10) * 8147);
                        i3 = -889621863;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i11) * 67;
                        i21 = (-1585543304) ^ ((iM45029 ^ i10) * 31723);
                        i3 = 1654697019;
                    }
                    i22 = i3 ^ iM45029;
                    break;
                case -309584751:
                case 1822355436:
                    View viewM109512 = C3743.m10957(view, iM450212 ^ 2126778554);
                    C7105.m18993(viewM109512, viewOnClickListenerC23871);
                    C0674.m3027(viewM109512);
                    iM450213 = C19806.m45029(C3660.m10790(f77137, 51, 3, i14));
                    iM45029 = (i11 - ThreadFactoryC3888.m11306("ۛ᩷")) * 99;
                    i21 = (-735772232) ^ ((iM45029 ^ i10) * (-20361));
                    i3 = -942013118;
                    i22 = i3 ^ iM45029;
                    break;
                case 443665200:
                case 1667665927:
                    C1668.m5576(C19806.m45029(C19806.m45020(f77137, 54, 3, i14)) ^ 2098589808);
                    iM45029 = (i11 - C19806.m45029("۫ۧ")) * (-71);
                    i21 = 1768391720 ^ ((iM45029 ^ i10) * (-3853));
                    i3 = -1394950966;
                    i22 = i3 ^ iM45029;
                    break;
                case 760270128:
                case 1085226218:
                    C1977.m6356();
                    C0050.m946();
                    throw new RuntimeException();
                case 997647870:
                case 2075567773:
                    View viewM109513 = C3743.m10957(view, ThreadFactoryC3888.m11306(C1461.m5070(f77137, 39, 3, i14)) ^ 2120309912);
                    C1937.m6286(viewM109513, str);
                    if (C0817.f3443) {
                        int iM450217 = C19806.m45029("᩷ۖ") ^ i10;
                        i21 = ((iM450217 ^ i11) * 4837) ^ (-160678615);
                        i22 = iM450217 ^ (-632483813);
                        view2 = viewM109513;
                    } else {
                        view2 = viewM109513;
                        iM45029 = (i11 - C19806.m45029("ܰ᩶")) * (-75);
                        i21 = 1132894902 ^ ((iM45029 ^ i10) * (-19563));
                        i3 = -1150994031;
                        i22 = i3 ^ iM45029;
                    }
                    break;
                default:
                    View viewM8168 = C2642.m8167(view, ThreadFactoryC3888.m11306(C1148.m4230(sArr6, 36, 3, i14)) ^ 2120810837);
                    C7105.m18988(viewM8168, str);
                    viewOnClickListenerC23871.f77142 = (TextView) viewM8168;
                    iM45029 = C19806.m45029("֨۠") ^ i10;
                    i21 = 53800235 ^ ((iM45029 ^ i11) * 3429);
                    i3 = -625736430;
                    i22 = i3 ^ iM45029;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0162 A[PHI: r9
      0x0162: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:41:0x0160, B:13:0x006f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0249 A[PHI: r7
      0x0249: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:61:0x0247, B:13:0x006f, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x03ab A[PHI: r2 r5 r10 r11 r13 r22
      0x03ab: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:89:0x03a9, B:78:0x0323, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r5v5 android.content.Intent) = (r5v2 android.content.Intent), (r5v2 android.content.Intent), (r5v6 android.content.Intent) binds: [B:89:0x03a9, B:78:0x0323, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r10v5 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v6 short[]) binds: [B:89:0x03a9, B:78:0x0323, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:89:0x03a9, B:78:0x0323, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:89:0x03a9, B:78:0x0323, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short) binds: [B:89:0x03a9, B:78:0x0323, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        if (l.C0216.f1393 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (l.RunnableC1606.f6488 >= 0) goto L62;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23871.onClick(android.view.View):void");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C7321 m52596(ViewOnClickListenerC23871 viewOnClickListenerC23871) {
        TextView textView = null;
        long jM5687 = 0;
        int i = -661863180;
        int i2 = C0629.f2722;
        int i3 = C0278.f1572;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۖܳ")) * (-19);
        int i4 = ((iM11306 ^ i2) * (-30395)) ^ 1298973043;
        int i5 = -1982216715;
        while (true) {
            i = ((((i ^ i2) * 9207) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2104400410:
                case 1065774351:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 23109) ^ 1773836206;
                        i5 = 1580835373;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩵ܶ")) * (-43);
                        i4 = ((iM11306 ^ i2) * (-8419)) ^ 1602628932;
                        i5 = 695628776;
                    }
                    break;
                case -1911564010:
                case 1406120535:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 541) ^ 1208740244;
                        i5 = 1885085674;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-5989)) ^ (-396860332);
                        i5 = 587647849;
                    }
                    break;
                case -1822635597:
                case -1430958970:
                    if (C0050.m946() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 541) ^ 1208740244;
                        i5 = 1885085674;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܳۖ")) * (-83);
                        i4 = ((iM11306 ^ i3) * 15059) ^ 1376999897;
                        i5 = 246983273;
                    }
                    break;
                case -1699091427:
                case -714453670:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15579) ^ (-2064054844);
                        i5 = -1176866110;
                    } else {
                        iM11306 = (C19806.m45029("ۡܶ") ^ i2) * (-117);
                        i4 = ((iM11306 ^ i3) * (-20161)) ^ (-557906500);
                        i5 = -1210637854;
                    }
                    break;
                case -1508694322:
                case 496217929:
                    if (RunnableC1895.f7152) {
                        iM11306 = (C19806.m45029("ܶ۟") + i2) * 39;
                        i4 = ((iM11306 ^ i3) * (-10391)) ^ 1974984285;
                        i5 = 2015641293;
                    } else {
                        iM11306 = C19806.m45029("ۛۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15869) ^ (-1925457888);
                        i5 = 67350623;
                    }
                    break;
                case -1444408583:
                case -258294335:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 23109) ^ 1773836206;
                        i5 = 1580835373;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15089) ^ (-488768919);
                        i5 = 399509803;
                    }
                    break;
                case -1112454908:
                case 2130115811:
                    if (C2249.m6915() <= 0) {
                        iM11306 = C19806.m45029("ۛۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15869) ^ (-1925457888);
                        i5 = 67350623;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 23109) ^ 1773836206;
                        i5 = 1580835373;
                    }
                    break;
                case -1067803462:
                case 967139659:
                    RunnableC0195.m1431();
                    return null;
                case -509951444:
                case 1405759489:
                    jM5687 = C1709.m5687();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15579) ^ (-2064054844);
                        i5 = -1176866110;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩵")) * 37;
                        i4 = ((iM11306 ^ i2) * 22161) ^ 1084684981;
                        i5 = -1469304332;
                    }
                    break;
                case -360919741:
                case 1261238485:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, C5319.m14739(jM5687));
                    return C7321.f24318;
                case -303424018:
                case 1831585715:
                    C0671.m3008();
                    if (C1066.f4915 > 0) {
                        iM11306 = (i2 - C19806.m45029("ܳۖ")) * (-83);
                        i4 = ((iM11306 ^ i3) * 15059) ^ 1376999897;
                        i5 = 246983273;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 23109) ^ 1773836206;
                        i5 = 1580835373;
                    }
                    break;
                case 178778261:
                case 1449043238:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܳۖ")) * (-83);
                        i4 = ((iM11306 ^ i3) * 15059) ^ 1376999897;
                        i5 = 246983273;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-20961)) ^ (-1341765388);
                        i5 = -218773172;
                    }
                    break;
                case 393001978:
                case 1031897696:
                    C1148.m4232();
                    iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i3) * 127;
                    i4 = ((iM11306 ^ i2) * 23109) ^ 1773836206;
                    i5 = 1580835373;
                    break;
                case 620434710:
                case 1028395712:
                    if (C0817.f3443) {
                        iM11306 = (i3 - C19806.m45029("ۙۡ")) * (-115);
                        i4 = ((iM11306 ^ i2) * 23031) ^ (-1816053930);
                        i5 = 1710804349;
                    } else {
                        iM11306 = C19806.m45029("ۛۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15869) ^ (-1925457888);
                        i5 = 67350623;
                    }
                    break;
                case 747644122:
                case 1508034423:
                    textView = viewOnClickListenerC23871.f77141;
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ۛۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15869) ^ (-1925457888);
                        i5 = 67350623;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27215)) ^ 236250071;
                        i5 = 753493750;
                    }
                    break;
                default:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 23109) ^ 1773836206;
                        i5 = 1580835373;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫֨") ^ i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 19481) ^ (-1124049635);
                        i5 = 2060018960;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01af A[PHI: r1 r12
      0x01af: PHI (r1v4 android.text.SpannableString) = 
      (r1v2 android.text.SpannableString)
      (r1v3 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
     binds: [B:62:0x01ad, B:46:0x0122, B:16:0x0055, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r12v6 android.text.style.UnderlineSpan) = 
      (r12v4 android.text.style.UnderlineSpan)
      (r12v5 android.text.style.UnderlineSpan)
      (r12v4 android.text.style.UnderlineSpan)
      (r12v4 android.text.style.UnderlineSpan)
     binds: [B:62:0x01ad, B:46:0x0122, B:16:0x0055, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x020e A[PHI: r4 r5
      0x020e: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:70:0x020c, B:58:0x0190, B:25:0x008b, B:11:0x004b, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:70:0x020c, B:58:0x0190, B:25:0x008b, B:11:0x004b, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0238 A[PHI: r3
      0x0238: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:74:0x0236, B:29:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7321 m52598(ViewOnClickListenerC23871 viewOnClickListenerC23871, C1730 c1730) {
        int iM11306;
        int i;
        TextView textView = null;
        SpannableString spannableString = null;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        String strM5742 = null;
        int i4 = 1794153142;
        int i5 = C1977.f7413;
        int i6 = C3660.f13403;
        int iM45029 = (i6 - C19806.m45029("ۛ۠")) * (-93);
        int i7 = ((iM45029 ^ i5) * 5565) ^ 1437972113;
        int i8 = -362444032;
        while (true) {
            int i9 = iM45029 ^ i8;
            UnderlineSpan underlineSpan = null;
            while (true) {
                i4 = ((((i4 ^ i5) * (-8037)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2041584671:
                    case -590316517:
                        if (C2871.f10837 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۟ۗ") + i5) * (-59);
                            i7 = ((iM11306 ^ i6) * (-11459)) ^ 870015468;
                            i = 1584331570;
                            i9 = iM11306 ^ i;
                        }
                        break;
                    case -2008620015:
                    case -892002032:
                        if (C0216.m1591() <= 0) {
                            iM11306 = C19806.m45029("ۗ۫") ^ i5;
                            i7 = ((iM11306 ^ i6) * (-17679)) ^ (-862888311);
                            i = 1372702533;
                        } else {
                            iM11306 = (i5 - C19806.m45029("ۚܺ")) * (-101);
                            i7 = ((iM11306 ^ i6) * 31377) ^ (-756171390);
                            i = 49692839;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case -1791471001:
                    case 788820529:
                        strM5742 = c1730.m5742();
                        iM11306 = ThreadFactoryC3888.m11306("֡ۨ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-22067)) ^ 1301673711;
                        i = 846420404;
                        i9 = iM11306 ^ i;
                        break;
                    case -1710944618:
                    case -1494629973:
                        if (!C0526.f2219) {
                            iM11306 = (C19806.m45029("᩷ۛ") + i6) * 127;
                            i7 = ((iM11306 ^ i5) * (-25923)) ^ 526529155;
                            i = -210128136;
                            i9 = iM11306 ^ i;
                        }
                        break;
                    case -1512190576:
                    case -1040617889:
                        MenuItemOnMenuItemClickListenerC3244.m9704(textView, strM5742);
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("֨ۜ")) * (-17);
                        i7 = ((iM11306 ^ i5) * 13065) ^ (-1532325176);
                        i = -1597352329;
                        i9 = iM11306 ^ i;
                        break;
                    case -1403886377:
                    case 16723660:
                        length = spannableString.length();
                        if (C1377.f5749) {
                            iM11306 = ThreadFactoryC3888.m11306("ܶܳ") ^ i6;
                            i7 = ((iM11306 ^ i5) * 27151) ^ 1511744635;
                            i = -1342600532;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܳ᩻") ^ i6;
                            i7 = ((iM11306 ^ i5) * 12561) ^ (-2073658992);
                            i = -2019140430;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case -1395439037:
                    case -766480033:
                        spannableString.setSpan(underlineSpan, i3, length, i2);
                        C1461.m5083(textView, spannableString);
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("֨ۜ")) * (-17);
                        i7 = ((iM11306 ^ i5) * 13065) ^ (-1532325176);
                        i = -1597352329;
                        i9 = iM11306 ^ i;
                        break;
                    case -1283107839:
                    case 907754443:
                        textView = viewOnClickListenerC23871.f77143;
                        if (C1709.m5683()) {
                            iM11306 = (C19806.m45029("ܳ᩹") ^ i5) * (-91);
                            i7 = ((iM11306 ^ i6) * 15749) ^ 603770147;
                            i = 176145024;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗۨ") ^ i6) * (-13);
                            i7 = ((iM11306 ^ i5) * (-5241)) ^ 57116007;
                            i = -1137594405;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case -1008948529:
                    case -730817702:
                        C0526.m2437();
                        C0817.m3399();
                        return null;
                    case -874400979:
                    case 208147802:
                        if (C2249.f8050 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܳ᩻") ^ i6;
                            i7 = ((iM11306 ^ i5) * 12561) ^ (-2073658992);
                            i = -2019140430;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۫᩶") ^ i6;
                            i7 = ((iM11306 ^ i5) * 22447) ^ 1673534267;
                            i = -629330069;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case -764762774:
                    case -38301052:
                        if (c1730 != null) {
                            iM11306 = ThreadFactoryC3888.m11306("۟֨") ^ i5;
                            i7 = ((iM11306 ^ i6) * 2797) ^ 194133888;
                            i = -952298166;
                        } else {
                            iM11306 = C19806.m45029("֡ۤ") ^ i6;
                            i7 = ((iM11306 ^ i5) * 9627) ^ 643219730;
                            i = -442391374;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case -355665905:
                    case 945245522:
                        i2 = 33;
                        i3 = 0;
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = C19806.m45029("ۗ۫") ^ i5;
                            i7 = ((iM11306 ^ i6) * (-17679)) ^ (-862888311);
                            i = 1372702533;
                        } else {
                            iM11306 = (C19806.m45029("᩵ܺ") ^ i5) * (-39);
                            i7 = ((iM11306 ^ i6) * 397) ^ 1438430894;
                            i = 741333498;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case -265512915:
                    case 709727572:
                        spannableString = new SpannableString(c1730 != null ? c1730.m5742() : "");
                        if (!C0962.f3784) {
                            underlineSpan = new UnderlineSpan();
                            if (ThreadFactoryC3888.f14547 <= 0) {
                                iM11306 = (C19806.m45029("ܶۖ") + i5) * (-51);
                                i7 = ((iM11306 ^ i6) * (-16523)) ^ 1125413590;
                                i = 2093163214;
                            } else {
                                iM11306 = (i5 - C19806.m45029("ۤۘ")) * (-99);
                                i7 = ((iM11306 ^ i6) * (-23481)) ^ (-483123234);
                                i = -461688313;
                            }
                            i9 = iM11306 ^ i;
                        }
                        break;
                    case -148071745:
                    case 64258101:
                        if (C1460.f5948 < 0) {
                        }
                        iM11306 = (C19806.m45029("ܶۖ") + i5) * (-51);
                        i7 = ((iM11306 ^ i6) * (-16523)) ^ 1125413590;
                        i = 2093163214;
                        i9 = iM11306 ^ i;
                        break;
                    case -90853735:
                    case 2128196240:
                        C0817.m3399();
                        iM11306 = (C19806.m45029("ܶۖ") + i5) * (-51);
                        i7 = ((iM11306 ^ i6) * (-16523)) ^ 1125413590;
                        i = 2093163214;
                        i9 = iM11306 ^ i;
                        break;
                    case 79488019:
                    case 1303491190:
                        return C7321.f24318;
                    case 766148861:
                    case 2123309892:
                        if (C10634.f36300 < 0) {
                        }
                        iM11306 = C19806.m45029("ۗ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-17679)) ^ (-862888311);
                        i = 1372702533;
                        i9 = iM11306 ^ i;
                        break;
                    case 797544449:
                    case 1189936382:
                        if (C1875.f7103 >= 0) {
                            iM11306 = (C19806.m45029("ܶۖ") + i5) * (-51);
                            i7 = ((iM11306 ^ i6) * (-16523)) ^ 1125413590;
                            i = 2093163214;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i6;
                            i7 = ((iM11306 ^ i5) * 22005) ^ (-1249060520);
                            i = 1568388801;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    case 850033612:
                    case 1913598098:
                        strM5742 = null;
                        iM11306 = ThreadFactoryC3888.m11306("֡ۨ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-22067)) ^ 1301673711;
                        i = 846420404;
                        i9 = iM11306 ^ i;
                        break;
                    case 1305738947:
                    case 2028987372:
                        if (C3660.m10791() != 0) {
                            iM11306 = C19806.m45029("ۗ۫") ^ i5;
                            i7 = ((iM11306 ^ i6) * (-17679)) ^ (-862888311);
                            i = 1372702533;
                        } else {
                            iM11306 = C19806.m45029("ۚۙ") ^ i5;
                            i7 = ((iM11306 ^ i6) * (-14627)) ^ (-1779101982);
                            i = -1898628448;
                        }
                        i9 = iM11306 ^ i;
                        break;
                    default:
                        if (C2332.f8260) {
                            iM11306 = C19806.m45029("ۗ۫") ^ i5;
                            i7 = ((iM11306 ^ i6) * (-17679)) ^ (-862888311);
                            i = 1372702533;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۛ᩶") ^ i5;
                            i7 = ((iM11306 ^ i6) * (-31877)) ^ 17601901;
                            i = 747262011;
                        }
                        i9 = iM11306 ^ i;
                        break;
                }
            }
            iM45029 = (ThreadFactoryC3888.m11306("ܳᩳ") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
            i7 = ((iM45029 ^ i5) * 8239) ^ 305611272;
            i8 = 1263934418;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m52592(ViewOnClickListenerC23871 viewOnClickListenerC23871) {
        int i = 55495145;
        int i2 = C1148.f5161;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("ۜܶ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 15845) ^ (-1132088937);
        int i5 = -1848831180;
        while (true) {
            i = ((((i ^ i2) * 22589) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -605289585:
                case 1590382294:
                    C0629.m2907();
                    iM45029 = (C19806.m45029("ۢۙ") ^ i2) * (-87);
                    i4 = ((iM45029 ^ i3) * 13551) ^ (-1110705405);
                    i5 = 1739774722;
                    break;
                case -104154492:
                case 2054274435:
                    if (C3660.f13403 < 0 && C0671.f2816 == 0) {
                        if (RunnableC1606.f6488 >= 0) {
                            iM45029 = (C19806.m45029("ۢۙ") ^ i2) * (-87);
                            i4 = ((iM45029 ^ i3) * 13551) ^ (-1110705405);
                            i5 = 1739774722;
                        } else {
                            if (!C0797.f3386) {
                                if (!C19806.f63586) {
                                    if (!RunnableC3388.m10064() || MenuItemOnMenuItemClickListenerC3244.f12064 >= 0 || C3660.m10791() != 0) {
                                        iM45029 = C19806.m45029("ۘ۫") ^ i2;
                                        i4 = ((iM45029 ^ i3) * 23827) ^ 1568121820;
                                        i5 = -2116929144;
                                    } else if (RunnableC1895.f7152) {
                                        AbstractActivityC12483 abstractActivityC12483 = viewOnClickListenerC23871.f77140;
                                        if (C1460.f5948 < 0) {
                                            C3286.m9800(abstractActivityC12483, new Intent(abstractActivityC12483, (Class<?>) ViewOnClickListenerC23604.class));
                                        } else {
                                            iM45029 = (i2 - ThreadFactoryC3888.m11306("ۡۢ")) * (-109);
                                            i4 = ((iM45029 ^ i3) * (-15095)) ^ (-1659448870);
                                            i5 = -2129200783;
                                        }
                                        break;
                                    }
                                }
                            }
                            iM45029 = (i3 - C19806.m45029("ۡܳ")) * (-97);
                            i4 = ((iM45029 ^ i2) * (-2199)) ^ (-1373993333);
                            i5 = 1980173162;
                        }
                        break;
                    }
                    iM45029 = ThreadFactoryC3888.m11306("ۛ۟") ^ i3;
                    i4 = ((iM45029 ^ i2) * 25139) ^ 24140245;
                    i5 = 935233171;
                    break;
                case -56470578:
                case 568870851:
                    C2249.m6915();
                    if (C1460.f5948 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25139) ^ 24140245;
                        i5 = 935233171;
                    } else {
                        iM45029 = C19806.m45029("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23827) ^ 1568121820;
                        i5 = -2116929144;
                    }
                    break;
                case -28559022:
                case 1902401442:
                    C0797.m3359();
                    RunnableC1606.m5473();
                    break;
                case -27148420:
                case 1807463931:
                    C0817.m3399();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (i3 - C19806.m45029("ۡܳ")) * (-97);
                        i4 = ((iM45029 ^ i2) * (-2199)) ^ (-1373993333);
                        i5 = 1980173162;
                    } else {
                        iM45029 = (C19806.m45029("ۢۙ") ^ i2) * (-87);
                        i4 = ((iM45029 ^ i3) * 13551) ^ (-1110705405);
                        i5 = 1739774722;
                    }
                    break;
                default:
                    C0817.m3399();
                    if (!RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("ۢۙ") ^ i2) * (-87);
                        i4 = ((iM45029 ^ i3) * 13551) ^ (-1110705405);
                        i5 = 1739774722;
                    } else {
                        iM45029 = C19806.m45029("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23827) ^ 1568121820;
                        i5 = -2116929144;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C7321 m52597(ViewOnClickListenerC23871 viewOnClickListenerC23871, C1730 c1730) {
        TextView textView = null;
        String strM5742 = null;
        int i = 541313217;
        int i2 = C1668.f6641;
        int i3 = C0278.f1572;
        int iM11306 = (ThreadFactoryC3888.m11306("۠ۖ") + i3) * (-59);
        int i4 = ((iM11306 ^ i2) * (-14441)) ^ 275947701;
        int i5 = 1785902081;
        while (true) {
            i = ((((i ^ i2) * (-25405)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1940805614:
                case 199999426:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, strM5742);
                    return C7321.f24318;
                case -1857338245:
                case 507028187:
                    C0817.m3399();
                    iM11306 = C19806.m45029("ۧۧ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-14401)) ^ 412978167;
                    i5 = 661341667;
                    break;
                case -1785160114:
                case 1688853839:
                    strM5742 = null;
                    iM11306 = (i3 - C19806.m45029("ۨ᩶")) * (-47);
                    i4 = ((iM11306 ^ i2) * 27165) ^ 950069582;
                    i5 = 453190203;
                    break;
                case -1716621145:
                case 524318322:
                    if (C3577.f13150 < 0) {
                        iM11306 = (i3 - C19806.m45029("ܺ֨")) * (-97);
                        i4 = ((iM11306 ^ i2) * 28185) ^ 894209304;
                        i5 = 1198913692;
                    } else {
                        iM11306 = C19806.m45029("ۧۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14401)) ^ 412978167;
                        i5 = 661341667;
                    }
                    break;
                case -1607348849:
                case -27304169:
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6503)) ^ (-808536496);
                        i5 = -72168572;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֫ۗ")) * (-17);
                        i4 = ((iM11306 ^ i2) * (-835)) ^ 1647460848;
                        i5 = 1050988644;
                    }
                    break;
                case -1477166973:
                case -1341033060:
                    C1148.m4232();
                    C1875.m6086();
                    return null;
                case -1382530754:
                case -1043903817:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6503)) ^ (-808536496);
                        i5 = -72168572;
                    } else {
                        iM11306 = C19806.m45029("᩻ۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22137)) ^ 1810937945;
                        i5 = 1330746608;
                    }
                    break;
                case -1359487709:
                case 897594641:
                    textView = viewOnClickListenerC23871.f77138;
                    if (c1730 != null) {
                        iM11306 = C19806.m45029("ۡ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28499) ^ 1369352221;
                        i5 = -703482270;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19881)) ^ (-1759624678);
                        i5 = -1997756916;
                    }
                    break;
                case -1336717989:
                case 1968354214:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ۧۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14401)) ^ 412978167;
                        i5 = 661341667;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") + i3) * (-41);
                        i4 = ((iM11306 ^ i2) * 2451) ^ (-1485878013);
                        i5 = -1627547000;
                    }
                    break;
                case -1165181671:
                case 1148856462:
                    C0050.m946();
                    if (!C1668.m5583()) {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28045)) ^ 598505597;
                        i5 = -2009488979;
                    } else {
                        iM11306 = C19806.m45029("ۧۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14401)) ^ 412978167;
                        i5 = 661341667;
                    }
                    break;
                case -1143056889:
                case 532146280:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺ۜ")) * (-39);
                        i4 = ((iM11306 ^ i3) * 8481) ^ (-1030353979);
                        i5 = -1463934469;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֨۫")) * (-49);
                        i4 = ((iM11306 ^ i2) * 5611) ^ (-1376959981);
                        i5 = -1458184824;
                    }
                    break;
                case -668449840:
                case 1886727160:
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6503)) ^ (-808536496);
                        i5 = -72168572;
                    } else {
                        iM11306 = C19806.m45029("ܿܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7311) ^ 776135138;
                        i5 = -1999772884;
                    }
                    break;
                case -644454566:
                case 1838255726:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6503)) ^ (-808536496);
                        i5 = -72168572;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30299) ^ (-2053794664);
                        i5 = 1152656926;
                    }
                    break;
                case -423264563:
                case 265370747:
                    if (!C0817.f3443) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺ۜ")) * (-39);
                        i4 = ((iM11306 ^ i3) * 8481) ^ (-1030353979);
                        i5 = -1463934469;
                    } else {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28045)) ^ 598505597;
                        i5 = -2009488979;
                    }
                    break;
                case -179379820:
                case 1720091846:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺ۜ")) * (-39);
                        i4 = ((iM11306 ^ i3) * 8481) ^ (-1030353979);
                        i5 = -1463934469;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۬᩸")) * 39;
                        i4 = ((iM11306 ^ i3) * (-6979)) ^ 1647987682;
                        i5 = -305525646;
                    }
                    break;
                case 15943783:
                case 1596797328:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܺ֨")) * (-97);
                        i4 = ((iM11306 ^ i2) * 28185) ^ 894209304;
                        i5 = 1198913692;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25955)) ^ 366222419;
                        i5 = 1605755022;
                    }
                    break;
                case 999349314:
                case 1120021265:
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("ۧۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14401)) ^ 412978167;
                        i5 = 661341667;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30149)) ^ 2141740090;
                        i5 = -500661212;
                    }
                    break;
                case 1097577796:
                case 1973836106:
                    strM5742 = c1730.m5742();
                    iM11306 = (i3 - C19806.m45029("ۨ᩶")) * (-47);
                    i4 = ((iM11306 ^ i2) * 27165) ^ 950069582;
                    i5 = 453190203;
                    break;
                default:
                    if (RunnableC3388.m10064()) {
                        iM11306 = C19806.m45029("ۙܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25373)) ^ 762492228;
                        i5 = -592407897;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺ۜ")) * (-39);
                        i4 = ((iM11306 ^ i3) * 8481) ^ (-1030353979);
                        i5 = -1463934469;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m52594(ViewOnClickListenerC23871 viewOnClickListenerC23871, C1730 c1730) {
        TextView textView = null;
        String strM5742 = null;
        int i = 231053892;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C2642.f10294;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("ܿۤ")) * (-51);
        int i4 = ((iM11306 ^ i3) * 25739) ^ (-1161499190);
        int i5 = 1007944839;
        while (true) {
            i = ((((i ^ i3) * 19549) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2006203097:
                case -28194577:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27969) ^ (-478720804);
                        i5 = -289778439;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23297)) ^ (-180207708);
                        i5 = -1253572378;
                    }
                    break;
                case -2003702933:
                case -1668498625:
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۗ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-20785)) ^ 1450616446;
                        i5 = -205910240;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7155)) ^ 1946162755;
                        i5 = 1800833438;
                    }
                    break;
                case -1924622625:
                case 1030660853:
                    C2788.m8472();
                    iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-7155)) ^ 1946162755;
                    i5 = 1800833438;
                    break;
                case -1920294971:
                case 661295188:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۖۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30649) ^ (-150837488);
                        i5 = 1747585484;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۚܿ")) * (-19);
                        i4 = ((iM11306 ^ i3) * (-1731)) ^ 1543746453;
                        i5 = 1478271195;
                    }
                    break;
                case -1862673504:
                case 1736057373:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = C19806.m45029("ܿ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27527) ^ 698431950;
                        i5 = 442067410;
                    } else {
                        iM11306 = C19806.m45029("ᩴᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6831) ^ 812384182;
                        i5 = -2095804539;
                    }
                    break;
                case -1766941428:
                case 1057228678:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, strM5742);
                    return C7321.f24318;
                case -1501935272:
                case -827216344:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ۖۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30649) ^ (-150837488);
                        i5 = 1747585484;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۤۧ")) * (-15);
                        i4 = ((iM11306 ^ i3) * (-9871)) ^ 820462289;
                        i5 = 1222190471;
                    }
                    break;
                case -1428978820:
                case -720539462:
                    textView = viewOnClickListenerC23871.f77139;
                    if (c1730 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19723) ^ (-920085295);
                        i5 = 1559864392;
                    } else {
                        iM11306 = (C19806.m45029("ۨۨ") + i3) * 53;
                        i4 = ((iM11306 ^ i2) * 14545) ^ 239865061;
                        i5 = 1559356350;
                    }
                    break;
                case -1192300298:
                case -192069316:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7155)) ^ 1946162755;
                        i5 = 1800833438;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۢ") ^ i3) * (-109);
                        i4 = ((iM11306 ^ i2) * 32239) ^ (-1370245399);
                        i5 = -154423432;
                    }
                    break;
                case -844035649:
                case -676336452:
                    strM5742 = null;
                    iM11306 = C19806.m45029("֡ܳ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 13467) ^ (-1630006962);
                    i5 = 547342350;
                    break;
                case -734125796:
                case 387897544:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7155)) ^ 1946162755;
                        i5 = 1800833438;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5765)) ^ 418887850;
                        i5 = 227569311;
                    }
                    break;
                case -696573657:
                case 1026942804:
                    C0629.m2907();
                    RunnableC0195.m1431();
                    return null;
                case -693327472:
                case 1278870943:
                    if (!C2332.f8260) {
                        iM11306 = C19806.m45029("ۖۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30649) ^ (-150837488);
                        i5 = 1747585484;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩵") + i3) * (-17);
                        i4 = ((iM11306 ^ i2) * 24487) ^ 1541985989;
                        i5 = 1809160098;
                    }
                    break;
                case -249433356:
                case 1620426081:
                    C2871.m8646();
                    if (!C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩵") + i3) * (-17);
                        i4 = ((iM11306 ^ i2) * 24487) ^ 1541985989;
                        i5 = 1809160098;
                    } else {
                        iM11306 = C19806.m45029("ܿ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27527) ^ 698431950;
                        i5 = 442067410;
                    }
                    break;
                case -230406565:
                case 2061518911:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ܿ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27527) ^ 698431950;
                        i5 = 442067410;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12593) ^ 1808569812;
                        i5 = -878344424;
                    }
                    break;
                case 177804584:
                case 709510951:
                    strM5742 = c1730.m5742();
                    iM11306 = C19806.m45029("֡ܳ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 13467) ^ (-1630006962);
                    i5 = 547342350;
                    break;
                case 421107150:
                case 1044994315:
                    C1189.m4368();
                    if (C1148.m4232() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩵") + i3) * (-17);
                        i4 = ((iM11306 ^ i2) * 24487) ^ 1541985989;
                        i5 = 1809160098;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7155)) ^ 1946162755;
                        i5 = 1800833438;
                    }
                    break;
                case 1542666433:
                case 2101663847:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("ܿ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27527) ^ 698431950;
                        i5 = 442067410;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27219)) ^ 1023053954;
                        i5 = -1473075865;
                    }
                    break;
                default:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۖۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30649) ^ (-150837488);
                        i5 = 1747585484;
                    } else {
                        iM11306 = (C19806.m45029("ܺۡ") ^ i2) * (-117);
                        i4 = ((iM11306 ^ i3) * 16817) ^ (-1452666954);
                        i5 = 343336929;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52595(Consumer consumer, ViewOnClickListenerC23871 viewOnClickListenerC23871) {
        consumer.n(viewOnClickListenerC23871.f77140);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52599(ViewOnClickListenerC23871 viewOnClickListenerC23871) {
        ViewOnClickListenerC13209.m32681(viewOnClickListenerC23871.f77140, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m52593(ViewOnClickListenerC23871 viewOnClickListenerC23871) {
        SpannableString spannableString;
        int iM11306;
        int i;
        int i2;
        String strM14739;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int i6 = C1419.f5860;
        int i7 = C1668.f6641;
        int iM11307 = ThreadFactoryC3888.m11306("᩸ۛ") ^ i6;
        int i8 = ((iM11307 ^ i7) * 7423) ^ 45700267;
        short[] sArr = null;
        int i9 = iM11307 ^ 328739904;
        UnderlineSpan underlineSpan = null;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 569913855;
        SpannableString spannableString2 = null;
        String strM6105 = null;
        String str = null;
        Object obj = null;
        TextView textView = null;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i7) * 21013) >> 31));
            switch (i14) {
                case -2129260089:
                case -427166082:
                    C1398.m4895();
                    textView = textView;
                    int iM11308 = (ThreadFactoryC3888.m11306("᩸ۙ") + i7) * (-87);
                    textView = textView;
                    spannableString2 = null;
                    i9 = iM11308 ^ (-127353694);
                    i8 = ((iM11308 ^ i6) * (-30127)) ^ (-2047843252);
                    underlineSpan = null;
                    break;
                case -2126670219:
                case -740468175:
                    strM14739 = C0671.m3017(ThreadFactoryC3888.m11306(strM6105) ^ 2102000607);
                    str = strM14739;
                    iM11306 = (i6 - C19806.m45029("ۢۙ")) * 27;
                    i = ((iM11306 ^ i7) * (-26135)) ^ (-895329976);
                    i2 = 236087975;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1982092106:
                case 1602972864:
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(str);
                    obj = str;
                    spannableString = spannableString2;
                    int iM11309 = (ThreadFactoryC3888.m11306("ۙ۟") + i7) * 43;
                    i = ((iM11309 ^ i6) * 11877) ^ (-1779091766);
                    i3 = iM11309 ^ 399459920;
                    spannableString2 = spannableString;
                    textView = textView;
                    i9 = i3;
                    i8 = i;
                    break;
                case -1395434327:
                case -1052971569:
                    spannableString = spannableString2;
                    spannableString.setSpan(underlineSpan, 0, spannableString2.length(), 33);
                    obj = spannableString;
                    int iM113010 = (ThreadFactoryC3888.m11306("ۙ۟") + i7) * 43;
                    i = ((iM113010 ^ i6) * 11877) ^ (-1779091766);
                    i3 = iM113010 ^ 399459920;
                    spannableString2 = spannableString;
                    textView = textView;
                    i9 = i3;
                    i8 = i;
                    break;
                case -1344731768:
                case -969204135:
                    textView = textView;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    sArr = f77137;
                    c = '9';
                    if (C0962.m3746() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܰ") + i7) * 87;
                        i4 = ((iM45029 ^ i6) * (-10723)) ^ (-135769406);
                        i5 = 1612682300;
                    } else {
                        iM45029 = C19806.m45029("ۛۢ") ^ i7;
                        i4 = ((iM45029 ^ i6) * (-1175)) ^ (-449302936);
                        i5 = 561105603;
                    }
                    TextView textView2 = textView;
                    i9 = iM45029 ^ i5;
                    i8 = i4;
                    underlineSpan = underlineSpan;
                    spannableString2 = spannableString2;
                    textView = textView2;
                    break;
                case -1240728261:
                case 2071513601:
                    textView = textView;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    s = sArr[c];
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۤ֫") ^ i6) * 7;
                        i4 = ((iM45029 ^ i7) * 1483) ^ 317266309;
                        i5 = 837568981;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩺") ^ i6;
                        i4 = ((iM45029 ^ i7) * 26703) ^ 1291691968;
                        i5 = -587463550;
                    }
                    TextView textView3 = textView;
                    i9 = iM45029 ^ i5;
                    i8 = i4;
                    underlineSpan = underlineSpan;
                    spannableString2 = spannableString2;
                    textView = textView3;
                    break;
                case -1104737101:
                case 267425742:
                    i13 = 28195;
                    iM45029 = ThreadFactoryC3888.m11306("֫ۜ") ^ i6;
                    i4 = ((iM45029 ^ i7) * 7753) ^ (-1203405983);
                    i5 = -1570595203;
                    TextView textView4 = textView;
                    i9 = iM45029 ^ i5;
                    i8 = i4;
                    underlineSpan = underlineSpan;
                    spannableString2 = spannableString2;
                    textView = textView4;
                    break;
                case -1086963511:
                case 1983472480:
                    strM14739 = C5319.m14739(C1709.m5681());
                    str = strM14739;
                    iM11306 = (i6 - C19806.m45029("ۢۙ")) * 27;
                    i = ((iM11306 ^ i7) * (-26135)) ^ (-895329976);
                    i2 = 236087975;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -819134808:
                case 2074742106:
                    i13 = 8404;
                    iM45029 = ThreadFactoryC3888.m11306("֫ۜ") ^ i6;
                    i4 = ((iM45029 ^ i7) * 7753) ^ (-1203405983);
                    i5 = -1570595203;
                    TextView textView5 = textView;
                    i9 = iM45029 ^ i5;
                    i8 = i4;
                    underlineSpan = underlineSpan;
                    spannableString2 = spannableString2;
                    textView = textView5;
                    break;
                case -745293764:
                case -629110481:
                    C3660.m10791();
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        textView = textView;
                        spannableString2 = spannableString2;
                        underlineSpan = underlineSpan;
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܰ") + i7) * 87;
                        i4 = ((iM45029 ^ i6) * (-10723)) ^ (-135769406);
                        i5 = 1612682300;
                        TextView textView6 = textView;
                        i9 = iM45029 ^ i5;
                        i8 = i4;
                        underlineSpan = underlineSpan;
                        spannableString2 = spannableString2;
                        textView = textView6;
                    } else {
                        textView = textView;
                        int iM113011 = (ThreadFactoryC3888.m11306("᩸ۙ") + i7) * (-87);
                        textView = textView;
                        spannableString2 = null;
                        i9 = iM113011 ^ (-127353694);
                        i8 = ((iM113011 ^ i6) * (-30127)) ^ (-2047843252);
                        underlineSpan = null;
                    }
                    break;
                case -442852713:
                case 2065671482:
                    textView = textView;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    int i15 = s + s2;
                    if ((i15 * i15) - i12 > 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۡ᩷")) * 39;
                        i4 = ((iM45029 ^ i6) * 21875) ^ 1675750978;
                        i5 = -1380807732;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("۬ۧ")) * 77;
                        i4 = ((iM45029 ^ i7) * 31167) ^ (-1195596250);
                        i5 = -1882405605;
                    }
                    TextView textView7 = textView;
                    i9 = iM45029 ^ i5;
                    i8 = i4;
                    underlineSpan = underlineSpan;
                    spannableString2 = spannableString2;
                    textView = textView7;
                    break;
                case -383541445:
                case 1214256657:
                    strM6105 = C1875.m6105(f77137, 61, 3, i13);
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۠") + i6) * (-15);
                        i = ((iM11306 ^ i7) * (-29017)) ^ 620873438;
                        i2 = -1471575176;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        textView = textView;
                        spannableString2 = spannableString2;
                        underlineSpan = underlineSpan;
                        iM45029 = (C19806.m45029("ۤ֫") ^ i6) * 7;
                        i4 = ((iM45029 ^ i7) * 1483) ^ 317266309;
                        i5 = 837568981;
                        TextView textView8 = textView;
                        i9 = iM45029 ^ i5;
                        i8 = i4;
                        underlineSpan = underlineSpan;
                        spannableString2 = spannableString2;
                        textView = textView8;
                    }
                    break;
                case -308677440:
                case 1146106727:
                    textView = textView;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    int i16 = i10 + i11;
                    i12 = i16 + i16;
                    s2 = 1344;
                    if (!C3743.f13569) {
                        int iM450210 = C19806.m45029("᩸ܳ") ^ i6;
                        textView = textView;
                        i9 = iM450210 ^ 103844605;
                        i8 = ((iM450210 ^ i7) * (-15707)) ^ 1535295365;
                        underlineSpan = underlineSpan;
                        spannableString2 = null;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜۨ") ^ i6) * 59;
                        i4 = ((iM45029 ^ i7) * (-23847)) ^ (-1446281848);
                        i5 = 1192180616;
                        TextView textView9 = textView;
                        i9 = iM45029 ^ i5;
                        i8 = i4;
                        underlineSpan = underlineSpan;
                        spannableString2 = spannableString2;
                        textView = textView9;
                    }
                    break;
                case -240256372:
                case 1711654983:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, obj);
                    return C7321.f24318;
                case -229558723:
                case -162598602:
                    C1460.m5050();
                    if (!C1668.m5583()) {
                        textView = textView;
                        spannableString2 = spannableString2;
                        underlineSpan = underlineSpan;
                        iM45029 = (C19806.m45029("ۤ֫") ^ i6) * 7;
                        i4 = ((iM45029 ^ i7) * 1483) ^ 317266309;
                        i5 = 837568981;
                        TextView textView10 = textView;
                        i9 = iM45029 ^ i5;
                        i8 = i4;
                        underlineSpan = underlineSpan;
                        spannableString2 = spannableString2;
                        textView = textView10;
                    } else {
                        textView = textView;
                        int iM113012 = (ThreadFactoryC3888.m11306("᩸ۙ") + i7) * (-87);
                        textView = textView;
                        spannableString2 = null;
                        i9 = iM113012 ^ (-127353694);
                        i8 = ((iM113012 ^ i6) * (-30127)) ^ (-2047843252);
                        underlineSpan = null;
                    }
                    break;
                case 44291542:
                case 546074315:
                    if (C1709.m5697()) {
                        iM11306 = C19806.m45029("ۡ᩶") ^ i7;
                        i = ((iM11306 ^ i6) * (-28129)) ^ (-960801126);
                        i2 = -551938757;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩺") + i6) * 93;
                        i = ((iM11306 ^ i7) * (-15257)) ^ 1663888540;
                        i2 = 609911381;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 157089262:
                case 2140547027:
                    textView = textView;
                    spannableString2 = spannableString2;
                    underlineSpan = underlineSpan;
                    i10 = s * s;
                    i11 = 1806336;
                    if (C1461.f5957 > 0) {
                        iM45029 = (i7 - C19806.m45029("ᩴܶ")) * (-61);
                        i4 = ((iM45029 ^ i6) * 12377) ^ 718298754;
                        i5 = -1406496848;
                        TextView textView11 = textView;
                        i9 = iM45029 ^ i5;
                        i8 = i4;
                        underlineSpan = underlineSpan;
                        spannableString2 = spannableString2;
                        textView = textView11;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("᩸ۙ") + i7) * (-87);
                        textView = textView;
                        spannableString2 = null;
                        i9 = iM113013 ^ (-127353694);
                        i8 = ((iM113013 ^ i6) * (-30127)) ^ (-2047843252);
                        underlineSpan = null;
                    }
                    break;
                case 453942847:
                case 1402816072:
                    C1148.m4232();
                    if (C3660.f13403 >= 0) {
                        textView = textView;
                        int iM450211 = (C19806.m45029("֨ۙ") ^ i7) * 115;
                        i = ((iM450211 ^ i6) * 13017) ^ 1660327899;
                        i3 = iM450211 ^ (-38253284);
                        textView = textView;
                        i9 = i3;
                        i8 = i;
                    } else {
                        textView = textView;
                        int iM113014 = (ThreadFactoryC3888.m11306("᩸ۙ") + i7) * (-87);
                        textView = textView;
                        spannableString2 = null;
                        i9 = iM113014 ^ (-127353694);
                        i8 = ((iM113014 ^ i6) * (-30127)) ^ (-2047843252);
                        underlineSpan = null;
                    }
                    break;
                case 1695034228:
                case 2085147810:
                    C0216.m1591();
                    C1875.m6086();
                    return null;
                case 1770929891:
                case 2009211286:
                    SpannableString spannableString3 = spannableString2;
                    UnderlineSpan underlineSpan2 = underlineSpan;
                    TextView textView12 = viewOnClickListenerC23871.f77142;
                    int i17 = C14015.f46057;
                    if (C1977.m6366()) {
                        int iM450212 = C19806.m45029("ۧܺ") ^ i6;
                        i8 = ((iM450212 ^ i7) * (-26401)) ^ (-1221645961);
                        i9 = iM450212 ^ (-687668833);
                    } else {
                        int iM113015 = ThreadFactoryC3888.m11306("ۜ۬") ^ i7;
                        i9 = iM113015 ^ (-534373956);
                        i8 = ((iM113015 ^ i6) * (-4345)) ^ (-1248177891);
                    }
                    textView = textView12;
                    underlineSpan = underlineSpan2;
                    spannableString2 = spannableString3;
                    break;
                default:
                    textView = textView;
                    short[] sArr2 = f77137;
                    if (RunnableC1895.f7152) {
                        underlineSpan = underlineSpan;
                        String strM6164 = RunnableC1895.m6164(sArr2, 58, 3, i13);
                        if (AbstractC0464.f2088 > 0) {
                            int iM113016 = ThreadFactoryC3888.m11306(strM6164) ^ 2122568266;
                            if (C1189.f5284 > 0) {
                                SpannableString spannableString4 = new SpannableString(C0671.m3017(iM113016));
                                if (C1668.m5583()) {
                                    underlineSpan = new UnderlineSpan();
                                    if (C2704.f10408) {
                                        int iM113017 = (ThreadFactoryC3888.m11306("ۜ᩶") ^ i7) * (-39);
                                        spannableString2 = spannableString4;
                                        i8 = ((iM113017 ^ i6) * 22783) ^ (-1102242209);
                                        textView = textView;
                                        i9 = iM113017 ^ 760585074;
                                    } else {
                                        spannableString2 = spannableString4;
                                        int iM450213 = (C19806.m45029("֨ۙ") ^ i7) * 115;
                                        i = ((iM450213 ^ i6) * 13017) ^ 1660327899;
                                        i3 = iM450213 ^ (-38253284);
                                        textView = textView;
                                        i9 = i3;
                                        i8 = i;
                                    }
                                }
                            }
                            break;
                        }
                        int iM450214 = C19806.m45029("᩸ܳ") ^ i6;
                        textView = textView;
                        i9 = iM450214 ^ 103844605;
                        i8 = ((iM450214 ^ i7) * (-15707)) ^ 1535295365;
                        underlineSpan = underlineSpan;
                        spannableString2 = null;
                        break;
                    }
                    int iM113018 = (ThreadFactoryC3888.m11306("᩸ۙ") + i7) * (-87);
                    textView = textView;
                    spannableString2 = null;
                    i9 = iM113018 ^ (-127353694);
                    i8 = ((iM113018 ^ i6) * (-30127)) ^ (-2047843252);
                    underlineSpan = null;
                    break;
            }
        }
    }
}
