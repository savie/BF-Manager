package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W18B */
/* JADX INFO: loaded from: classes.dex */
public class C21990 extends AbstractC15910 {

    /* JADX INFO: renamed from: ۬ܽ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f71312;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f71313;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ForegroundColorSpan f71314;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f71315;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f71316;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f71317;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f71318;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f71319;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List f71320;

    static {
        ApplicationC6132.m17119(159);
        f71312 = new short[]{3907, 15524, 15593, 15595, 15614, 15593, 15586, 15524, 15593, 15595, 15614, 15593, 15586, 15595, 15590, 15590, 15524, 15593, 15590, 15595, 15609, 15609, 15524, 15609, 15615, 15610, 15599, 15608, 15524, 15587, 15591, 15610, 15590, 15599, 15591, 15599, 15588, 15614, 15609, 15524, 15609, 15589, 15615, 15608, 15593, 15599, 15524, 15590, 15587, 15588, 15599, 15524, 15590, 15589, 15593, 15595, 15590, 15609, 15524, 15608, 15599, 15597, 15587, 15609, 15614, 15599, 15608, 15609, 15524, 15610, 15608, 15589, 15590, 15589, 15597, 15615, 15599, 15524, 15595, 15588, 15588, 15589, 15614, 15595, 15614, 15587, 15589, 15588, 15524, 15599, 15588, 15598, 15530, 15595, 15588, 15588, 15589, 15614, 15595, 15614, 15587, 15589, 15588, 15524, 15609, 15615, 15592, 15595, 15588, 15588, 15589, 15614, 15595, 15614, 15587, 15589, 15588, 15524, 15599, 15588, 15598, 15530, 15609, 15615, 15592, 15595, 15588, 15588, 15589, 15614, 15595, 15614, 15587, 15589, 15588, 15524, 15610, 15595, 15608, 15595, 15591, 15524, 15599, 15588, 15598, 15530, 15610, 15595, 15608, 15595, 15591, 15524, 15590, 15589, 15593, 15595, 15590, 15524, 15599, 15588, 15598, 15530, 15590, 15589, 15593, 15595, 15590, 15524, 15608, 15599, 15609, 15614, 15595, 15608, 15614, 15530, 15590, 15589, 15593, 15595, 15590, 15524, 15596, 15587, 15599, 15590, 15598, 15524, 15599, 15588, 15598, 15530, 15596, 15587, 15599, 15590, 15598, 15524, 15591, 15599, 15614, 15586, 15589, 15598, 15524, 15599, 15588, 15598, 15530, 15591, 15599, 15614, 15586, 15589, 15598, 15524, 15595, 15608, 15608, 15595, 15603, 15527, 15598, 15595, 15614, 15595, 15524, 15599, 15588, 15598, 15530, 15595, 15608, 15608, 15595, 15603, 15527, 15598, 15595, 15614, 15595, 15524, 15610, 15595, 15593, 15585, 15599, 15598, 15527, 15609, 15613, 15587, 15614, 15593, 15586, 15524, 15599, 15588, 15598, 15530, 15610, 15595, 15593, 15585, 15599, 15598, 15527, 15609, 15613, 15587, 15614, 15593, 15586, 15524, 15609, 15610, 15595, 15608, 15609, 15599, 15527, 15609, 15613, 15587, 15614, 15593, 15586, 15524, 15599, 15588, 15598, 15530, 15609, 15610, 15595, 15608, 15609, 15599, 15527, 15609, 15613, 15587, 15614, 15593, 15586, 5119, 27107, 27054, 27041, 27052, 27070, 27070, 27117, 27107, 27040, 27048, 27065, 27045, 27042, 27049, 27117, 27107, 27051, 27044, 27048, 27041, 27049, 27117, 27107, 27048, 27043, 27049, 27117, 6473, -4987};
    }

    public native C21990(Context context, C7474 c7474);

    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e5 A[PHI: r10 r11
      0x01e5: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:54:0x01e3, B:50:0x01c2, B:19:0x009d, B:16:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:54:0x01e3, B:50:0x01c2, B:19:0x009d, B:16:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0270 A[PHI: r8 r9 r13 r14 r15
      0x0270: PHI (r8v5 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:67:0x026e, B:58:0x021d, B:24:0x00bb, B:96:0x0270] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:67:0x026e, B:58:0x021d, B:24:0x00bb, B:96:0x0270] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r13v5 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:67:0x026e, B:58:0x021d, B:24:0x00bb, B:96:0x0270] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:67:0x026e, B:58:0x021d, B:24:0x00bb, B:96:0x0270] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r15v5 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:67:0x026e, B:58:0x021d, B:24:0x00bb, B:96:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a0 A[PHI: r3 r4 r5 r20
      0x02a0: PHI (r3v4 l.ۗ֫ۖ) = (r3v2 l.ۗ֫ۖ), (r3v2 l.ۗ֫ۖ), (r3v3 l.ۗ֫ۖ), (r3v2 l.ۗ֫ۖ), (r3v2 l.ۗ֫ۖ) binds: [B:71:0x029e, B:62:0x023c, B:34:0x0111, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:71:0x029e, B:62:0x023c, B:34:0x0111, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:71:0x029e, B:62:0x023c, B:34:0x0111, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r20v5 short[]) = (r20v3 short[]), (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:71:0x029e, B:62:0x023c, B:34:0x0111, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ */
    public final void mo30809(C6111 c6111, CharSequence charSequence) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1419.f5860;
        int i4 = C1460.f5948;
        int iM45029 = (i4 - C19806.m45029("᩸ܿ")) * 55;
        int i5 = ((iM45029 ^ i3) * (-27419)) ^ (-996634293);
        InterfaceC2916 interfaceC2916M10961 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-1289001636);
        String strM3407 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1020341144;
        String strM37076 = null;
        int i14 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 1743) >> 31));
            switch (i13) {
                case -1957114520:
                case 489076696:
                    i10 = 60581;
                    iM11306 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                    i = ((iM11306 ^ i3) * (-14237)) ^ 1459982832;
                    i2 = 1429928629;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1753707072:
                case 588692881:
                    int i15 = 398920729 + i8;
                    i9 = i15 + i15;
                    if (C2704.f10408) {
                        iM11306 = (C19806.m45029("ܽ֨") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i4) * 26437) ^ 321388089;
                        i2 = 506090734;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۤ᩸")) * 71;
                        i = ((iM11306 ^ i3) * 27159) ^ (-381115397);
                        i2 = 1617944942;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1692105727:
                case -1290828027:
                    if (C0962.f3784) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-31503)) ^ 21272301;
                        i2 = 728937929;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۢ") ^ i3;
                        i = ((iM11306 ^ i4) * (-8605)) ^ 1284223378;
                        i2 = -431598727;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1625270889:
                case -1322302429:
                    strM3407 = C0817.m3407((SpannableString) charSequence);
                    if (this.f71313) {
                        iM11306 = (C19806.m45029("ۙ۟") ^ i4) * 3;
                        i = ((iM11306 ^ i3) * 18291) ^ (-602605585);
                        i2 = -943812932;
                    } else {
                        strM37076 = strM3407;
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۙ") ^ i3) * 13;
                        i = ((iM11306 ^ i4) * 20713) ^ 1949821127;
                        i2 = -555069729;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1395397223:
                case 1229817423:
                    int i16 = s + s2;
                    if ((i16 * i16) - i9 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۟ۡ")) * 115;
                        i = ((iM11306 ^ i3) * (-5411)) ^ 1237284318;
                        i2 = -18643116;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۬") ^ i3;
                        i = ((iM11306 ^ i4) * 3319) ^ 1884062762;
                        i2 = -1931268447;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1344480111:
                case -60437792:
                    c6111.mo17029(C2871.m8641(strM37076) + this.f71318);
                    break;
                case -1283746640:
                case -1127346417:
                    sArr = f71312;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-31503)) ^ 21272301;
                        i2 = 728937929;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܿ") ^ i3;
                        i = ((iM11306 ^ i4) * 9809) ^ (-189878843);
                        i2 = 463906392;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1221100237:
                case 1444749171:
                    interfaceC2916M10961.replace(i7, i14, strM37076);
                    if (C2332.f8260) {
                        int iM11307 = (ThreadFactoryC3888.m11306("ۘ᩸") + i3) * (-109);
                        i5 = ((iM11307 ^ i4) * (-28713)) ^ 551528089;
                        i6 = iM11307 ^ (-166488562);
                    } else {
                        iM11306 = (C19806.m45029("ۘ۠") + i4) * (-119);
                        i = ((iM11306 ^ i3) * (-25487)) ^ (-1536005932);
                        i2 = -1469214375;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1129891253:
                case 1813759341:
                    s2 = 19973;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۤ᩸")) * 71;
                        i = ((iM11306 ^ i3) * 27159) ^ (-381115397);
                        i2 = 1617944942;
                    } else {
                        iM11306 = C19806.m45029("᩹ۜ") ^ i3;
                        i = ((iM11306 ^ i4) * (-21579)) ^ 704853005;
                        i2 = 2037440352;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -838448851:
                case -197632677:
                    s = sArr[333];
                    i8 = s * s;
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ۘ۠") + i4) * (-119);
                        i = ((iM11306 ^ i3) * (-25487)) ^ (-1536005932);
                        i2 = -1469214375;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") ^ i4) * 75;
                        i = ((iM11306 ^ i3) * 7863) ^ 409509399;
                        i2 = -241596159;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -737366640:
                case 1905038490:
                    AbstractC0464.m2313();
                    if (C0797.f3386) {
                        iM11306 = (i4 - C19806.m45029("ۤ᩸")) * 71;
                        i = ((iM11306 ^ i3) * 27159) ^ (-381115397);
                        i2 = 1617944942;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۖ")) * 25;
                        i = ((iM11306 ^ i3) * 17275) ^ 132728998;
                        i2 = 567351539;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -506467282:
                case 128179897:
                    interfaceC2916M10961 = C3743.m10961(c6111);
                    i7 = this.f71318;
                    i14 = this.f71319;
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۗ᩵") ^ i4;
                        i = ((iM11306 ^ i3) * (-25975)) ^ 242059010;
                        i2 = -1307872069;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-31503)) ^ 21272301;
                        i2 = 728937929;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -45742483:
                case 1741467650:
                    C0278.m1789();
                    RunnableC1564.m5345();
                    iM11306 = (i4 - C19806.m45029("ۤ᩸")) * 71;
                    i = ((iM11306 ^ i3) * 27159) ^ (-381115397);
                    i2 = 1617944942;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 215880797:
                case 1811780876:
                    sArr2 = f71312;
                    i11 = 334;
                    i12 = 1;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (C19806.m45029("ۘ۠") + i4) * (-119);
                        i = ((iM11306 ^ i3) * (-25487)) ^ (-1536005932);
                        i2 = -1469214375;
                    } else {
                        iM11306 = C19806.m45029("ۙۡ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6885)) ^ 1846154301;
                        i2 = -1688478299;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 563322496:
                case 1438437943:
                    C0962.m3746();
                    break;
                case 570892998:
                case 1325076471:
                    strM37076 = C15489.m37076(strM3407, C1066.m4040(sArr2, i11, i12, i10));
                    iM11306 = (ThreadFactoryC3888.m11306("᩵ۙ") ^ i3) * 13;
                    i = ((iM11306 ^ i4) * 20713) ^ 1949821127;
                    i2 = -555069729;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 580928951:
                case 1364170487:
                    C0278.m1789();
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ܺ")) * (-67);
                        i = ((iM11306 ^ i4) * 8011) ^ 39000112;
                        i2 = -1006992056;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-31503)) ^ 21272301;
                        i2 = 728937929;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 870745849:
                case 2109009801:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ۘ۠") + i4) * (-119);
                        i = ((iM11306 ^ i3) * (-25487)) ^ (-1536005932);
                        i2 = -1469214375;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i4;
                        i = ((iM11306 ^ i3) * 27127) ^ 1073956957;
                        i2 = -1208990446;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1409055245:
                case 1497373871:
                    i10 = 18744;
                    iM11306 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                    i = ((iM11306 ^ i3) * (-14237)) ^ 1459982832;
                    i2 = 1429928629;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1615559720:
                case 1669550882:
                    C2249.m6915();
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۖ")) * 25;
                        i = ((iM11306 ^ i3) * 17275) ^ 132728998;
                        i2 = 567351539;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ܺ")) * (-67);
                        i = ((iM11306 ^ i4) * 8011) ^ 39000112;
                        i2 = -1006992056;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-31503)) ^ 21272301;
                        i2 = 728937929;
                    } else {
                        iM11306 = (C19806.m45029("۟ܰ") + i4) * 95;
                        i = ((iM11306 ^ i3) * (-16985)) ^ 1335605898;
                        i2 = 409164726;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 65961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC15910
    /* JADX INFO: renamed from: ۙ */
    public final l.C20848 mo30806(int r74, java.lang.CharSequence r75) {
        /*
            Method dump skipped, instruction units count: 6596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21990.mo30806(int, java.lang.CharSequence):l.᩷ۨۚ");
    }
}
