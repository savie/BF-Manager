package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.Serializable;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes4.dex */
public class C13258 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۤۛۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f44026 = {4748, -756, 5864, 2039, 14247, 6678, 3981, 999, -29827, -29838, -29833, -29826, -29830, -29847, -29828, -29842, -29834, -29826, -29835, -29841, -29840, -29826, -29826, -29845, -29862, -29845, -29840, -29880, -29838, -29828, -29863, -29833, -29836, -29832, -29840, -29884, -29847, -29899, -29841, -29834, -29845, 4398, 27587, 27596, 27593, 27584, -6180, -3692, 431, 149, 3482, 5325};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C13964 f44027;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f44028;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f44029;

    /* JADX WARN: Code duplicated, block: B:52:0x019b A[PHI: r3 r9 r14 r15
      0x019b: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:51:0x0199, B:28:0x00bc, B:18:0x0081, B:16:0x007d, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:51:0x0199, B:28:0x00bc, B:18:0x0081, B:16:0x007d, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:51:0x0199, B:28:0x00bc, B:18:0x0081, B:16:0x007d, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:51:0x0199, B:28:0x00bc, B:18:0x0081, B:16:0x007d, B:12:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ec A[PHI: r2 r5 r6 r7 r8
      0x01ec: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String) binds: [B:55:0x01d1, B:24:0x009c, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r5v2 short) = (r5v1 short), (r5v1 short), (r5v1 short), (r5v4 short) binds: [B:55:0x01d1, B:24:0x009c, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r6v2 short) = (r6v1 short), (r6v1 short), (r6v1 short), (r6v4 short) binds: [B:55:0x01d1, B:24:0x009c, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:55:0x01d1, B:24:0x009c, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:55:0x01d1, B:24:0x009c, B:9:0x0053, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x021f A[PHI: r21 r22
      0x021f: PHI (r21v3 int) = (r21v1 int), (r21v2 int), (r21v1 int) binds: [B:61:0x021d, B:36:0x0106, B:32:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char) binds: [B:61:0x021d, B:36:0x0106, B:32:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024f A[PHI: r11 r12 r13 r16
      0x024f: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:65:0x024d, B:40:0x0128, B:16:0x007d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:65:0x024d, B:40:0x0128, B:16:0x007d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:65:0x024d, B:40:0x0128, B:16:0x007d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x024d, B:40:0x0128, B:16:0x007d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM11306;
        int i;
        int i2;
        String strM1429 = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -88148849;
        int i11 = RunnableC3388.f12514;
        int i12 = C0278.f1572;
        int iM11307 = (ThreadFactoryC3888.m11306("ܶ֨") + i12) * 127;
        int i13 = ((iM11307 ^ i11) * (-3893)) ^ (-1066471150);
        int i14 = iM11307 ^ 1862223050;
        short[] sArr3 = null;
        int i15 = 0;
        int iM45029 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 855) >> 31));
            switch (i10) {
                case -2013416437:
                case -1079997728:
                    sArr = f44026;
                    i7 = 1;
                    i8 = 3;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (C19806.m45029("۠ۧ") + i12) * 71;
                        i = ((iM11306 ^ i11) * (-13909)) ^ 562403256;
                        i2 = 601145175;
                    } else {
                        iM11306 = C19806.m45029("ۨ֡") ^ i11;
                        i = ((iM11306 ^ i12) * 24041) ^ (-1041026598);
                        i2 = 627801785;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1983787429:
                case 2026842797:
                    i6 = 9675;
                    iM11306 = C19806.m45029("᩶᩷") ^ i12;
                    i = ((iM11306 ^ i11) * (-7403)) ^ (-1223055386);
                    i2 = -1702233683;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1947958484:
                case -1150593857:
                    iM45029 = C19806.m45029(C0797.m3361(sArr, i7, i8, i6));
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("۬۟") ^ i12;
                        i = ((iM11306 ^ i11) * (-2321)) ^ 574925262;
                        i2 = -1527028991;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۬") ^ i12;
                        i = ((iM11306 ^ i11) * 19149) ^ (-191180494);
                        i2 = -1405273378;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1929478187:
                case 1330314644:
                    i5 = 195356529;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i12 - C19806.m45029("ܶ᩺")) * 97;
                        i = ((iM11306 ^ i11) * (-32271)) ^ (-517800703);
                        i2 = 321851358;
                    } else {
                        iM11306 = C19806.m45029("۠᩶") ^ i11;
                        i = ((iM11306 ^ i12) * 18913) ^ (-746425678);
                        i2 = -605441152;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1885288834:
                case -1181958891:
                    C2332.m7079();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("۠ۧ") + i12) * 71;
                        i = ((iM11306 ^ i11) * (-13909)) ^ 562403256;
                        i2 = 601145175;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i11;
                        i = ((iM11306 ^ i12) * 17159) ^ (-1874323812);
                        i2 = 1050991046;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1838118561:
                case 2060340400:
                    i6 = 24779;
                    iM11306 = C19806.m45029("᩶᩷") ^ i12;
                    i = ((iM11306 ^ i11) * (-7403)) ^ (-1223055386);
                    i2 = -1702233683;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1837575982:
                case 267012309:
                    C2124.m6673();
                    iM11306 = (i12 - C19806.m45029("ܶ᩺")) * 97;
                    i = ((iM11306 ^ i11) * (-32271)) ^ (-517800703);
                    i2 = 321851358;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1599813728:
                case -197796037:
                    C0629.m2907();
                    if (C1189.f5284 > 0) {
                        iM11306 = (i12 - C19806.m45029("ܶ᩺")) * 97;
                        i = ((iM11306 ^ i11) * (-32271)) ^ (-517800703);
                        i2 = 321851358;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i11;
                        i = ((iM11306 ^ i12) * (-18887)) ^ 1603278189;
                        i2 = -1063261411;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1454416393:
                case -259840211:
                    sArr3 = f44026;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("۠ۧ") + i12) * 71;
                        i = ((iM11306 ^ i11) * (-13909)) ^ 562403256;
                        i2 = 601145175;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܶ") + i12) * (-11);
                        i = ((iM11306 ^ i11) * 25909) ^ (-971088182);
                        i2 = -1881380492;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1320492309:
                case -37874597:
                    C0050.m934(this, iM45029 ^ 2102195494);
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("۬۟") ^ i12;
                        i = ((iM11306 ^ i11) * (-2321)) ^ 574925262;
                        i2 = -1527028991;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i11;
                        i = ((iM11306 ^ i12) * (-20101)) ^ 1340359456;
                        i2 = -1477483786;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -969979025:
                case -717796976:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C0050.m946() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i11;
                        i = ((iM11306 ^ i12) * 17159) ^ (-1874323812);
                        i2 = 1050991046;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۛ") ^ i12) * 39;
                        i = ((iM11306 ^ i11) * (-13651)) ^ (-349644947);
                        i2 = 872306551;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -756842593:
                case 1587527773:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0216.m1591() > 0) {
                        iM11306 = (i12 - C19806.m45029("ܶ᩺")) * 97;
                        i = ((iM11306 ^ i11) * (-32271)) ^ (-517800703);
                        i2 = 321851358;
                    } else {
                        iM11306 = (C19806.m45029("۠ۧ") + i12) * 71;
                        i = ((iM11306 ^ i11) * (-13909)) ^ 562403256;
                        i2 = 601145175;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -501909251:
                case 872717606:
                    c = 0;
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("۬۟") ^ i12;
                        i = ((iM11306 ^ i11) * (-2321)) ^ 574925262;
                        i2 = -1527028991;
                    } else {
                        iM11306 = C19806.m45029("ᩳܽ") ^ i11;
                        i = ((iM11306 ^ i12) * 19065) ^ (-445801345);
                        i2 = 732602487;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 152742754:
                case 1421106402:
                    strM1429 = RunnableC0195.m1429(sArr2, i9, i15, i6);
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i11;
                        i = ((iM11306 ^ i12) * 17159) ^ (-1874323812);
                        i2 = 1050991046;
                    } else {
                        iM11306 = C19806.m45029("ۢۚ") ^ i11;
                        i = ((iM11306 ^ i12) * (-305)) ^ 459865103;
                        i2 = -1445767941;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 358621333:
                case 1172942249:
                    if ((i4 + i5) - i3 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܿ") ^ i11;
                        i = ((iM11306 ^ i12) * (-24119)) ^ 285314209;
                        i2 = 398591011;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("᩷ܿ")) * 77;
                        i = ((iM11306 ^ i11) * (-3489)) ^ (-1146102949);
                        i2 = 1235459372;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 875986720:
                case 982942045:
                    C2788.m8472();
                    break;
                case 936606076:
                case 1941611091:
                    m41562(ThreadFactoryC3888.m11306(strM1429) ^ 2118483415);
                    break;
                case 971811031:
                case 1762193749:
                    sArr2 = f44026;
                    i9 = 4;
                    i15 = 3;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i12 - C19806.m45029("ܶ᩺")) * 97;
                        i = ((iM11306 ^ i11) * (-32271)) ^ (-517800703);
                        i2 = 321851358;
                    } else {
                        iM11306 = (i12 - C19806.m45029("ۢᩴ")) * 19;
                        i = ((iM11306 ^ i11) * (-7115)) ^ 930454256;
                        i2 = 2071406829;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                default:
                    s = sArr3[c];
                    s2 = 27954;
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i11;
                        i = ((iM11306 ^ i12) * 17159) ^ (-1874323812);
                        i2 = 1050991046;
                    } else {
                        iM11306 = (C19806.m45029("᩶᩺") + i11) * 31;
                        i = ((iM11306 ^ i12) * 2557) ^ (-1019683027);
                        i2 = -458455886;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = -629938548;
        int i2 = C1066.f4915;
        int i3 = C1460.f5948;
        int iM45029 = C19806.m45029("᩶۫") ^ i2;
        int i4 = ((iM45029 ^ i3) * 18321) ^ (-882469592);
        int i5 = 374079249;
        while (true) {
            i = ((((i ^ i3) * 501) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1946141765:
                case 303270885:
                    C2704.m8255();
                    if (!C0817.m3399()) {
                        iM45029 = (i2 - C19806.m45029("ܿ᩻")) * 87;
                        i4 = ((iM45029 ^ i3) * 24495) ^ (-1911181374);
                        i5 = 1102750881;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28501)) ^ (-549148819);
                        i5 = 1405838800;
                    }
                    break;
                case -1826542077:
                case -560079214:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28501)) ^ (-549148819);
                        i5 = 1405838800;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ֡")) * 15;
                        i4 = ((iM45029 ^ i2) * (-20745)) ^ (-1457875839);
                        i5 = 281373443;
                    }
                    break;
                case -1463455180:
                case 1574612195:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ܿ᩻")) * 87;
                        i4 = ((iM45029 ^ i3) * 24495) ^ (-1911181374);
                        i5 = 1102750881;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۧ᩵")) * 17;
                        i4 = ((iM45029 ^ i2) * (-28311)) ^ 1757048305;
                        i5 = 1853678107;
                    }
                    break;
                case -1307424009:
                case -879258224:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡۟")) * 35;
                        i4 = ((iM45029 ^ i2) * (-28307)) ^ (-940267673);
                        i5 = 1216903728;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6617) ^ 1761085641;
                        i5 = 1566767163;
                    }
                    break;
                case -1256307142:
                case -336659607:
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩺") ^ i2) * 17;
                        i4 = ((iM45029 ^ i3) * (-18807)) ^ (-306138865);
                        i5 = -1124759901;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܿ᩻")) * 87;
                        i4 = ((iM45029 ^ i3) * 24495) ^ (-1911181374);
                        i5 = 1102750881;
                    }
                    break;
                case -1210131497:
                case 43011993:
                    C0629.m2907();
                    break;
                case -1092648143:
                case 1718814264:
                    if (m41579(c11545)) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵֫") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * (-11841)) ^ 2112986157;
                        i5 = 145433660;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6617) ^ 1761085641;
                        i5 = 1566767163;
                    }
                    break;
                case -1057201134:
                case 1575810669:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۚۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16765)) ^ 520751061;
                        i5 = -525089946;
                    } else {
                        iM45029 = (C19806.m45029("۬ۛ") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-26083)) ^ 2134899066;
                        i5 = -774492344;
                    }
                    break;
                case -1029459873:
                case 1945431370:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32187) ^ 464296835;
                        i5 = 1746240914;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18883)) ^ 1413027019;
                        i5 = -847673394;
                    }
                    break;
                case -939547030:
                case 1300265440:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32187) ^ 464296835;
                        i5 = 1746240914;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩺ܽ")) * 67;
                        i4 = ((iM45029 ^ i3) * (-4181)) ^ (-2136413606);
                        i5 = 762604022;
                    }
                    break;
                case -752477825:
                case 240685477:
                    C0526.m2437();
                    if (C3722.m10894() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۜ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * (-22449)) ^ 897154492;
                        i5 = -782641514;
                    } else {
                        iM45029 = (C19806.m45029("۬ۛ") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-26083)) ^ 2134899066;
                        i5 = -774492344;
                    }
                    break;
                case -706422796:
                case 954099675:
                    break;
                case -535151308:
                case 917286619:
                    C10634.m26818(c11545, C3743.m10959(this.f44029));
                    c11545.m28830();
                    iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 6617) ^ 1761085641;
                    i5 = 1566767163;
                    break;
                case -435979087:
                case 1828145464:
                    RunnableC1895.m6170();
                    C0629.m2907();
                    iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-28501)) ^ (-549148819);
                    i5 = 1405838800;
                    break;
                case -385196579:
                case 1779304140:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܿ") ^ i3) * (-61);
                        i4 = ((iM45029 ^ i2) * (-16247)) ^ (-1954688516);
                        i5 = 1296340848;
                    } else {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32187) ^ 464296835;
                        i5 = 1746240914;
                    }
                    break;
                case 77962733:
                case 2097007127:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32187) ^ 464296835;
                        i5 = 1746240914;
                    } else {
                        iM45029 = (C19806.m45029("ۤۡ") + i2) * (-119);
                        i4 = ((iM45029 ^ i3) * 13117) ^ (-1760998288);
                        i5 = 637735360;
                    }
                    break;
                case 390163508:
                case 1259473875:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("۬ۛ") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-26083)) ^ 2134899066;
                        i5 = -774492344;
                    } else {
                        iM45029 = C19806.m45029("ܿۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26855) ^ (-1402471082);
                        i5 = 263375067;
                    }
                    break;
                case 1749432570:
                case 2105323785:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۜ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * (-22449)) ^ 897154492;
                        i5 = -782641514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22751) ^ 295098525;
                        i5 = 619330082;
                    }
                    break;
                default:
                    RunnableC1564.m5345();
                    if (C1461.f5957 > 0) {
                        iM45029 = (C19806.m45029("۬ۛ") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-26083)) ^ 2134899066;
                        i5 = -774492344;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28501)) ^ (-549148819);
                        i5 = 1405838800;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5722;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba A[PHI: r3 r15
      0x00ba: PHI (r3v4 java.lang.String[]) = (r3v3 java.lang.String[]), (r3v2 java.lang.String[]) binds: [B:24:0x00b8, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]) binds: [B:24:0x00b8, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x017f A[PHI: r1 r7 r8
      0x017f: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:40:0x017d, B:20:0x008e, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:40:0x017d, B:20:0x008e, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:40:0x017d, B:20:0x008e, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0243 A[PHI: r9 r11 r12
      0x0243: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:59:0x0241, B:51:0x0206, B:11:0x006f, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:59:0x0241, B:51:0x0206, B:11:0x006f, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:59:0x0241, B:51:0x0206, B:11:0x006f, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0277 A[PHI: r2 r4 r14 r16 r17 r22
      0x0277: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:63:0x0275, B:55:0x0223, B:32:0x012c, B:16:0x0079, B:14:0x0075, B:11:0x006f, B:70:0x0277] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r4v6 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:63:0x0275, B:55:0x0223, B:32:0x012c, B:16:0x0079, B:14:0x0075, B:11:0x006f, B:70:0x0277] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v6 short[]) binds: [B:63:0x0275, B:55:0x0223, B:32:0x012c, B:16:0x0079, B:14:0x0075, B:11:0x006f, B:70:0x0277] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0275, B:55:0x0223, B:32:0x012c, B:16:0x0079, B:14:0x0075, B:11:0x006f, B:70:0x0277] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r17v5 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:63:0x0275, B:55:0x0223, B:32:0x012c, B:16:0x0079, B:14:0x0075, B:11:0x006f, B:70:0x0277] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r22v6 int) = (r22v3 int), (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:63:0x0275, B:55:0x0223, B:32:0x012c, B:16:0x0079, B:14:0x0075, B:11:0x006f, B:70:0x0277] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3535.f13026;
        int i4 = C0278.f1572;
        int iM450210 = C19806.m45029("۫ۗ") ^ i3;
        int i5 = ((iM450210 ^ i4) * 9335) ^ 737018282;
        String strM9788 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-1843002100);
        int iM450211 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = 520005379;
        int i12 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i13 = 0;
        String strM41569 = null;
        String strM6685 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-6223)) >> 31));
            switch (i11) {
                case -2122241622:
                case -462588932:
                    int i14 = s + s2;
                    if ((i14 * i14) - i10 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۬") ^ i4;
                        i = ((iM45029 ^ i3) * 24857) ^ (-366234405);
                        i2 = -1515102866;
                    } else {
                        iM45029 = C19806.m45029("ۖܺ") ^ i3;
                        i = ((iM45029 ^ i4) * (-21575)) ^ 2127188135;
                        i2 = -1396000798;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1991228044:
                case -534044461:
                    strArr = new String[]{strM41569, C0671.m3017(iM450211 ^ i7)};
                    sArr2 = f44026;
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("۬֡") ^ i4;
                        i = ((iM45029 ^ i3) * (-21413)) ^ (-1219879929);
                        i2 = 898731085;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩻ۚ")) * 127;
                        i = ((iM45029 ^ i3) * 24519) ^ 1926417213;
                        i2 = 1330998365;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1906116232:
                case -551067199:
                    i12 = s * 2;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                        i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                        i2 = -1712360236;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۤ") + i3) * 127;
                        i = ((iM45029 ^ i4) * 24505) ^ (-1938824098);
                        i2 = 1447372818;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1871017813:
                case 387193630:
                    strM9788 = C3286.m9788(sArr3, 46, 3, i13);
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                        i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                        i2 = -1712360236;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * (-81);
                        i = ((iM45029 ^ i4) * 6467) ^ 1129046835;
                        i2 = -443532577;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1685232290:
                case -829041349:
                    C1025.m3861();
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-32107)) ^ 224931961;
                        i2 = 38611473;
                    } else {
                        iM45029 = C19806.m45029("ۖܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-21775)) ^ 2127557552;
                        i2 = 1615613720;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1447989097:
                case 2101057381:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                        i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                        i2 = -1712360236;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-32107)) ^ 224931961;
                        i2 = 38611473;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1237216295:
                case -842603425:
                    sArr = f44026;
                    c = ')';
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                        i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                        i2 = -1712360236;
                    } else {
                        iM45029 = (C19806.m45029("֨֨") ^ i3) * (-55);
                        i = ((iM45029 ^ i4) * 31561) ^ (-466767852);
                        i2 = -1944879925;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1194935994:
                case 1529739714:
                    i13 = 26127;
                    iM45029 = (C19806.m45029("ۛܽ") + i4) * 79;
                    i = ((iM45029 ^ i3) * 3921) ^ 725200559;
                    i2 = 1087672189;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1139947751:
                case 1285072863:
                    iM450211 = C19806.m45029(strM9788);
                    i7 = 2100322452;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("᩵֫") + i3) * 31;
                        i = ((iM45029 ^ i4) * 4169) ^ (-2135495351);
                        i2 = 117845493;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۜ") + i3) * (-123);
                        i = ((iM45029 ^ i4) * (-15717)) ^ (-866312609);
                        i2 = 1692782971;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -957397274:
                case -97706365:
                    i10 = i12 + 1;
                    s2 = 1;
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-32107)) ^ 224931961;
                        i2 = 38611473;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-11131)) ^ (-451917488);
                        i2 = -115695827;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -852713720:
                case -790734542:
                    C10634.m26820();
                    C3722.m10894();
                    return null;
                case -752525307:
                case 654854921:
                    i8 = 49;
                    i9 = 3;
                    if (C1377.f5749) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽۘ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM45029 ^ i4) * (-9559)) ^ 1965827272;
                        i2 = -1214552849;
                    } else {
                        iM45029 = C19806.m45029("ۖܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-21775)) ^ 2127557552;
                        i2 = 1615613720;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -712770393:
                case 200501813:
                    strM41569 = m41569(strM6685);
                    sArr3 = f44026;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                        i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                        i2 = -1712360236;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11306 = (ThreadFactoryC3888.m11306("ۙܳ") ^ i4) * 69;
                        i5 = ((iM11306 ^ i3) * (-6825)) ^ (-1710554441);
                        i6 = iM11306 ^ (-430365489);
                    }
                    break;
                case -355338596:
                case 1901226040:
                    s = sArr[c];
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܶ") ^ i3;
                        i = ((iM45029 ^ i4) * (-32107)) ^ 224931961;
                        i2 = 38611473;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܿ") ^ i4) * 97;
                        i = ((iM45029 ^ i3) * 19157) ^ 431320997;
                        i2 = -176378510;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -306262195:
                case 1462325978:
                    strM6685 = C2124.m6685(f44026, 42, 4, i13);
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("ۖܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-21775)) ^ 2127557552;
                        i2 = 1615613720;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨᩸")) * (-97);
                        i = ((iM45029 ^ i4) * (-25275)) ^ (-1937560996);
                        i2 = 2044087478;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -215330599:
                case 1024555522:
                    i13 = 27557;
                    iM45029 = (C19806.m45029("ۛܽ") + i4) * 79;
                    i = ((iM45029 ^ i3) * 3921) ^ 725200559;
                    i2 = 1087672189;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 686183199:
                case 1254410055:
                    C1977.m6356();
                    C0671.m3008();
                    iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                    i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                    i2 = -1712360236;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1358723775:
                case 1571670682:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("۬֡") ^ i4;
                        i = ((iM45029 ^ i3) * (-21413)) ^ (-1219879929);
                        i2 = 898731085;
                    } else {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i4) * 55;
                        i = ((iM45029 ^ i3) * (-831)) ^ (-883664839);
                        i2 = -1712360236;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    return C0278.m1786(ThreadFactoryC3888.m11306(RunnableC1895.m6164(sArr2, i8, i9, i13)) ^ 2123188756, strArr);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        int i;
        int iM45029;
        int i2;
        String str;
        int iM11306;
        int i3;
        int i4;
        int i5;
        int iM450210;
        int i6;
        int i7;
        short[] sArr;
        int iM11307;
        int i8;
        int i9;
        C13258 c13258 = this;
        int i10 = RunnableC3388.f12514;
        int i11 = C2124.f7782;
        int iM450211 = (C19806.m45029("᩹ۙ") ^ i10) * (-93);
        int i12 = ((iM450211 ^ i11) * 28701) ^ 1153167398;
        C14558 c14558M41593 = null;
        AbstractC20745 abstractC20745M46733 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i13 = iM450211 ^ (-1480167431);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        String strM5502 = null;
        int i21 = -1830823660;
        Serializable serializableM41584 = null;
        String strM7082 = null;
        AbstractC20745 abstractC20745M41587 = null;
        C1262 c1262 = null;
        int i22 = 0;
        boolean zM7070 = false;
        while (true) {
            i21 = i13 ^ (i12 & (((i21 ^ i11) * 20653) >> 31));
            switch (i21) {
                case -2077279927:
                case -813454247:
                    c1262 = new C1262(c13258);
                    strM7082 = C2332.m7082(f44026, 35, 2, i15);
                    if (c14558M41593 != null) {
                        iM450210 = (C19806.m45029("᩸ۚ") + i10) * 79;
                        i6 = ((iM450210 ^ i11) * 1253) ^ 952163879;
                        i7 = -2147419017;
                    } else {
                        iM450210 = (C19806.m45029("۬ܿ") ^ i11) * 95;
                        i6 = ((iM450210 ^ i10) * (-16067)) ^ 1924346116;
                        i7 = -685972455;
                    }
                    i13 = iM450210 ^ i7;
                    i12 = i6;
                    break;
                case -1902322824:
                case 1243073598:
                    zM7070 = C2332.m7070(c13258, C1189.m4365(sArr3, i17, i22, i15));
                    if (RunnableC3388.f12514 < 0) {
                        iM450210 = C19806.m45029("ۚۘ") ^ i10;
                        i6 = ((iM450210 ^ i11) * 25905) ^ 1785916794;
                        i7 = 1367574232;
                        i13 = iM450210 ^ i7;
                        i12 = i6;
                    } else {
                        i22 = i22;
                        int iM11308 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                        i12 = ((iM11308 ^ i11) * (-7345)) ^ (-1235823976);
                        i5 = iM11308 ^ 1112300709;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    }
                    break;
                case -1852757454:
                case 749978090:
                    i22 = i22;
                    strM5502 = strM5502;
                    sArr2 = sArr2;
                    int i23 = s + s2;
                    if (i20 - (i23 * i23) >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩻") ^ i11;
                        i3 = ((iM11306 ^ i10) * (-32259)) ^ 2018205319;
                        i4 = 2053187669;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i10;
                        i3 = ((iM11306 ^ i11) * (-20733)) ^ 1177121698;
                        i4 = 765683447;
                    }
                    i5 = iM11306 ^ i4;
                    strM5502 = strM5502;
                    i12 = i3;
                    sArr2 = sArr2;
                    i22 = i22;
                    i13 = i5;
                    c13258 = this;
                    break;
                case -1758926744:
                case -445768631:
                    C1148.m4232();
                    if (C1148.f5161 > 0) {
                        iM450210 = (C19806.m45029("ۛۡ") + i11) * 85;
                        i6 = ((iM450210 ^ i10) * (-5841)) ^ 344116120;
                        i7 = -1452691669;
                        i13 = iM450210 ^ i7;
                        i12 = i6;
                    } else {
                        sArr = sArr2;
                        iM11307 = C19806.m45029("ۗܳ") ^ i11;
                        i8 = ((iM11307 ^ i10) * 8815) ^ (-863540428);
                        i9 = 1960387259;
                        int i24 = iM11307 ^ i9;
                        sArr2 = sArr;
                        i = i22;
                        i13 = i24;
                        i12 = i8;
                        i22 = i;
                    }
                    break;
                case -1601091523:
                case -912962154:
                    c14558M41593 = m41593();
                    sArr3 = f44026;
                    i17 = 20;
                    i22 = 15;
                    if (C0216.f1393 == 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۖۚ") ^ i11;
                        i6 = ((iM450210 ^ i10) * 14575) ^ (-489915178);
                        i7 = 1032622321;
                        i13 = iM450210 ^ i7;
                        i12 = i6;
                    } else {
                        str = strM5502;
                        sArr2 = sArr2;
                        int iM450212 = (C19806.m45029("ܿܳ") + i10) * (-93);
                        strM5502 = str;
                        i12 = ((iM450212 ^ i11) * 15335) ^ (-607905121);
                        i13 = iM450212 ^ 2084432336;
                        c13258 = this;
                        sArr2 = sArr2;
                    }
                    break;
                case -1558575175:
                case 444918153:
                    i22 = i22;
                    sArr2 = sArr2;
                    strM5502 = CallableC1627.m5502(f44026, 8, 4, i15);
                    if (C0671.f2816 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ܰ") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-31033)) ^ (-834489644);
                        i2 = -1240060506;
                        i5 = iM45029 ^ i2;
                        sArr2 = sArr2;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    }
                    sArr2 = sArr2;
                    int iM11309 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                    i12 = ((iM11309 ^ i11) * (-7345)) ^ (-1235823976);
                    i5 = iM11309 ^ 1112300709;
                    i22 = i22;
                    i13 = i5;
                    c13258 = this;
                    break;
                case -1475369028:
                case 1062856932:
                    i22 = i22;
                    sArr2 = sArr2;
                    s = f44026[7];
                    if (AbstractC0464.f2088 > 0) {
                        iM45029 = C19806.m45029("ۨۨ") ^ i11;
                        i12 = ((iM45029 ^ i10) * (-12239)) ^ 1307377108;
                        i2 = -1935560687;
                        i5 = iM45029 ^ i2;
                        sArr2 = sArr2;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    }
                    sArr2 = sArr2;
                    int iM113010 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                    i12 = ((iM113010 ^ i11) * (-7345)) ^ (-1235823976);
                    i5 = iM113010 ^ 1112300709;
                    i22 = i22;
                    i13 = i5;
                    c13258 = this;
                    break;
                case -1281134296:
                case 1982112758:
                    i15 = 23245;
                    iM11306 = ThreadFactoryC3888.m11306("ۢᩳ") ^ i11;
                    i3 = ((iM11306 ^ i10) * (-28337)) ^ 644796955;
                    i4 = -729715101;
                    i5 = iM11306 ^ i4;
                    strM5502 = strM5502;
                    i12 = i3;
                    sArr2 = sArr2;
                    i22 = i22;
                    i13 = i5;
                    c13258 = this;
                    break;
                case -1245974223:
                case 633900750:
                    AbstractC20745 abstractC20745M46692 = abstractC20745M41587.m46692(strM7082);
                    c13258.f44029 = abstractC20745M46692;
                    C4084.m11614(abstractC20745M41587, abstractC20745M46692, zM7070, c13258.f44027, c1262);
                    iM450210 = (ThreadFactoryC3888.m11306("ܳᩳ") ^ i11) * 101;
                    i6 = ((iM450210 ^ i10) * 29393) ^ 1808844018;
                    i7 = 1211983179;
                    i13 = iM450210 ^ i7;
                    i12 = i6;
                    break;
                case -995013403:
                case 1674068696:
                    sArr = sArr2;
                    serializableM41584 = c13258.m41584(RunnableC0195.m1429(sArr, i16, 8, i15));
                    if (C3577.f13150 >= 0) {
                        iM11307 = C19806.m45029("ۗܳ") ^ i11;
                        i8 = ((iM11307 ^ i10) * 8815) ^ (-863540428);
                        i9 = 1960387259;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ᩴ᩻") + i10) * (-107);
                        i8 = ((iM11307 ^ i11) * (-8279)) ^ 2034725727;
                        i9 = -1441511628;
                    }
                    int i25 = iM11307 ^ i9;
                    sArr2 = sArr;
                    i = i22;
                    i13 = i25;
                    i12 = i8;
                    i22 = i;
                    break;
                case -934711128:
                case 1580033418:
                    c13258.f44027 = (C13964) serializableM41584;
                    if (C2642.f10294 <= 0) {
                        iM450210 = (i10 - ThreadFactoryC3888.m11306("᩺۫")) * 79;
                        i6 = ((iM450210 ^ i11) * 15077) ^ (-1332671834);
                        i7 = -897217797;
                    } else {
                        iM450210 = C19806.m45029("ۤ᩵") ^ i11;
                        i6 = ((iM450210 ^ i10) * 7455) ^ (-2127095728);
                        i7 = -687194585;
                    }
                    i13 = iM450210 ^ i7;
                    i12 = i6;
                    break;
                case -886133495:
                case 286686744:
                    C1189.m4368();
                    C0817.m3399();
                    return null;
                case -685741375:
                case 836148050:
                    c13258.f44028 = abstractC20745M46733;
                    i14 = 0;
                    C4084.m11614(abstractC20745M41587, abstractC20745M46733, false, c13258.f44027, c1262);
                    if (C3577.m10564(this)) {
                        iM450210 = C19806.m45029("ۢۗ") ^ i11;
                        i6 = ((iM450210 ^ i10) * 4757) ^ (-645725411);
                        i7 = 1060939171;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("۬֫") + i10) * (-23);
                        i6 = ((iM450210 ^ i11) * 6239) ^ (-898165047);
                        i7 = 603091098;
                    }
                    i13 = iM450210 ^ i7;
                    i12 = i6;
                    break;
                case -663320019:
                case 234504410:
                    i15 = 35611;
                    iM11306 = ThreadFactoryC3888.m11306("ۢᩳ") ^ i11;
                    i3 = ((iM11306 ^ i10) * (-28337)) ^ 644796955;
                    i4 = -729715101;
                    i5 = iM11306 ^ i4;
                    strM5502 = strM5502;
                    i12 = i3;
                    sArr2 = sArr2;
                    i22 = i22;
                    i13 = i5;
                    c13258 = this;
                    break;
                case -363160634:
                case 52008429:
                    i22 = i22;
                    strM5502 = strM5502;
                    sArr2 = sArr2;
                    int i26 = i18 + i19;
                    i20 = i26 + i26;
                    s2 = 12590;
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۠") ^ i10;
                        i3 = ((iM11306 ^ i11) * (-22235)) ^ (-1107571127);
                        i4 = 261284036;
                        i5 = iM11306 ^ i4;
                        strM5502 = strM5502;
                        i12 = i3;
                        sArr2 = sArr2;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    } else {
                        strM5502 = strM5502;
                        sArr2 = sArr2;
                        int iM113011 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                        i12 = ((iM113011 ^ i11) * (-7345)) ^ (-1235823976);
                        i5 = iM113011 ^ 1112300709;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    }
                    break;
                case -299626828:
                case 1449235910:
                    c13258.mo21455(i14);
                    AbstractC20745 abstractC20745M46693 = abstractC20745M41587.m46692(strM7082);
                    c13258.f44029 = abstractC20745M46693;
                    C11005.m27762(c13258.f44028, abstractC20745M46693, c14558M41593, c13258);
                    iM450210 = (ThreadFactoryC3888.m11306("ܳᩳ") ^ i11) * 101;
                    i6 = ((iM450210 ^ i10) * 29393) ^ 1808844018;
                    i7 = 1211983179;
                    i13 = iM450210 ^ i7;
                    i12 = i6;
                    break;
                case -80024806:
                case 807402170:
                    i22 = i22;
                    str = strM5502;
                    sArr2 = sArr2;
                    i18 = s * s;
                    i19 = 158508100;
                    if (!C0962.f3784) {
                        strM5502 = str;
                        iM45029 = C19806.m45029("ۘۢ") ^ i10;
                        i12 = ((iM45029 ^ i11) * 15805) ^ 2035597421;
                        i2 = 1952100723;
                        i5 = iM45029 ^ i2;
                        sArr2 = sArr2;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    } else {
                        i22 = i22;
                        int iM450213 = (C19806.m45029("ܿܳ") + i10) * (-93);
                        strM5502 = str;
                        i12 = ((iM450213 ^ i11) * 15335) ^ (-607905121);
                        i13 = iM450213 ^ 2084432336;
                        c13258 = this;
                        sArr2 = sArr2;
                    }
                    break;
                case 54689676:
                case 950848064:
                    C1025.m3861();
                    i22 = i22;
                    int iM113012 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                    i12 = ((iM113012 ^ i11) * (-7345)) ^ (-1235823976);
                    i5 = iM113012 ^ 1112300709;
                    i22 = i22;
                    i13 = i5;
                    c13258 = this;
                    break;
                case 198091945:
                case 1972727698:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1398.f5802 > 0) {
                        str = strM5502;
                        sArr2 = sArr2;
                        int iM450214 = (C19806.m45029("ܿܳ") + i10) * (-93);
                        strM5502 = str;
                        i12 = ((iM450214 ^ i11) * 15335) ^ (-607905121);
                        i13 = iM450214 ^ 2084432336;
                        c13258 = this;
                        sArr2 = sArr2;
                    } else {
                        iM450210 = (C19806.m45029("ۛۡ") + i11) * 85;
                        i6 = ((iM450210 ^ i10) * (-5841)) ^ 344116120;
                        i7 = -1452691669;
                        i13 = iM450210 ^ i7;
                        i12 = i6;
                    }
                    break;
                case 528872878:
                case 1259734928:
                    C2477.m7593();
                    if (!RunnableC1564.m5345()) {
                        i22 = i22;
                        int iM113013 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                        i12 = ((iM113013 ^ i11) * (-7345)) ^ (-1235823976);
                        i5 = iM113013 ^ 1112300709;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    } else {
                        sArr = sArr2;
                        iM11307 = C19806.m45029("ۗܳ") ^ i11;
                        i8 = ((iM11307 ^ i10) * 8815) ^ (-863540428);
                        i9 = 1960387259;
                        int i27 = iM11307 ^ i9;
                        sArr2 = sArr;
                        i = i22;
                        i13 = i27;
                        i12 = i8;
                        i22 = i;
                    }
                    break;
                case 1128862040:
                case 1919920203:
                    abstractC20745M46733 = abstractC20745M41587.m46733(C2704.m8240(f44026, 37, 4, i15));
                    if (C1189.f5284 > 0) {
                        iM450210 = (C19806.m45029("ۢ۟") + i10) * (-79);
                        i6 = ((iM450210 ^ i11) * (-14647)) ^ 2137806780;
                        i7 = -363788803;
                        i13 = iM450210 ^ i7;
                        i12 = i6;
                    } else {
                        str = strM5502;
                        sArr2 = sArr2;
                        int iM450215 = (C19806.m45029("ܿܳ") + i10) * (-93);
                        strM5502 = str;
                        i12 = ((iM450215 ^ i11) * 15335) ^ (-607905121);
                        i13 = iM450215 ^ 2084432336;
                        c13258 = this;
                        sArr2 = sArr2;
                    }
                    break;
                case 1218969501:
                case 2022512789:
                    return AbstractC0464.m2307();
                case 1422617990:
                case 2019834684:
                    return m41583();
                default:
                    i22 = i22;
                    String str2 = strM5502;
                    abstractC20745M41587 = c13258.m41587(str2);
                    sArr2 = f44026;
                    i16 = 12;
                    if (C0278.m1789() > 0) {
                        int iM113014 = ThreadFactoryC3888.m11306("ܳܰ") ^ i10;
                        strM5502 = str2;
                        i12 = ((iM113014 ^ i11) * (-24615)) ^ (-1242797124);
                        i = i22;
                        i13 = iM113014 ^ (-37202630);
                        i22 = i;
                    } else {
                        strM5502 = str2;
                        int iM113015 = (ThreadFactoryC3888.m11306("ܽۢ") + i10) * (-85);
                        i12 = ((iM113015 ^ i11) * (-7345)) ^ (-1235823976);
                        i5 = iM113015 ^ 1112300709;
                        i22 = i22;
                        i13 = i5;
                        c13258 = this;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745 = null;
        AbstractC20745 abstractC20746 = null;
        int i = -209798151;
        int i2 = C2642.f10294;
        int i3 = C3660.f13403;
        int iM45029 = (C19806.m45029("֨ۗ") + i3) * (-3);
        int i4 = ((iM45029 ^ i2) * (-11475)) ^ (-441344230);
        int i5 = 785639288;
        while (true) {
            i = ((((i ^ i2) * (-19779)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2141161401:
                case 419582537:
                    if (C3286.m9798() <= 0) {
                        iM45029 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1803)) ^ 1171127916;
                        i5 = -343410277;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28881) ^ 1504497642;
                        i5 = -308086792;
                    }
                    break;
                case -1866500205:
                case 701855292:
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1803)) ^ 1171127916;
                        i5 = -343410277;
                    } else {
                        iM45029 = C19806.m45029("᩺᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28583)) ^ (-200345932);
                        i5 = 572692927;
                    }
                    break;
                case -1854463586:
                case -1197102118:
                    if (C1977.m6356()) {
                        iM45029 = C19806.m45029("ۧ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16095) ^ 524413527;
                        i5 = -1893401128;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-29109)) ^ (-1205859382);
                        i5 = 1966824829;
                    }
                    break;
                case -1851663236:
                case 1809816887:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳܳ")) * 31;
                        i4 = ((iM45029 ^ i2) * 5641) ^ (-1701395141);
                        i5 = -863174429;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * (-32721)) ^ (-510167450);
                        i5 = 1589945327;
                    }
                    break;
                case -1799866135:
                case 1463425452:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21929)) ^ 594103518;
                        i5 = -1851904913;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۘ֫")) * (-15);
                        i4 = ((iM45029 ^ i2) * (-435)) ^ 79123253;
                        i5 = 917444319;
                    }
                    break;
                case -1763369151:
                case 2083062954:
                    C3722.m10894();
                    if (!C1377.f5749) {
                        iM45029 = C19806.m45029("᩺᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28583)) ^ (-200345932);
                        i5 = 572692927;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * (-32721)) ^ (-510167450);
                        i5 = 1589945327;
                    }
                    break;
                case -1602110226:
                case 338842424:
                    abstractC20746 = this.f44029;
                    if (abstractC20746 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۜ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 6065) ^ 612475909;
                        i5 = -1511768339;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11597) ^ (-835595944);
                        i5 = 1277560122;
                    }
                    break;
                case -1575270694:
                case 1202466095:
                    C0526.m2436(abstractC20745);
                    iM45029 = ThreadFactoryC3888.m11306("ۙܽ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-13343)) ^ (-90089199);
                    i5 = -163263782;
                    break;
                case -1341675336:
                case 352617008:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * (-32721)) ^ (-510167450);
                        i5 = 1589945327;
                    } else {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1887) ^ (-1409472585);
                        i5 = -567975181;
                    }
                    break;
                case -1339044056:
                case -371233948:
                    C1148.m4233();
                    break;
                case -1248856126:
                case -261292583:
                    RunnableC3388.m10064();
                    break;
                case -941759370:
                case 958279379:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ۧ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16095) ^ 524413527;
                        i5 = -1893401128;
                    } else {
                        iM45029 = C19806.m45029("᩺ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16387)) ^ 698499751;
                        i5 = -1773911887;
                    }
                    break;
                case -449390884:
                case 32071159:
                    if (C2332.f8260) {
                        iM45029 = (i2 - C19806.m45029("֫۠")) * (-91);
                        i4 = ((iM45029 ^ i3) * 891) ^ (-544400394);
                        i5 = 1945885921;
                    } else {
                        iM45029 = C19806.m45029("᩺᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28583)) ^ (-200345932);
                        i5 = 572692927;
                    }
                    break;
                case -399417213:
                case 660672580:
                    C0962.m3746();
                    C2249.m6915();
                    iM45029 = C19806.m45029("᩺᩸") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-28583)) ^ (-200345932);
                    i5 = 572692927;
                    break;
                case -356829088:
                case 1233680594:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1803)) ^ 1171127916;
                        i5 = -343410277;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ֨")) * 43;
                        i4 = ((iM45029 ^ i2) * 18071) ^ (-733728529);
                        i5 = 1662564660;
                    }
                    break;
                case -231123426:
                case 811839297:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * (-32721)) ^ (-510167450);
                        i5 = 1589945327;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3451)) ^ 357005196;
                        i5 = 1218558106;
                    }
                    break;
                case -145911893:
                case 309859310:
                    C0526.m2436(abstractC20746);
                    iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 11597) ^ (-835595944);
                    i5 = 1277560122;
                    break;
                case 104022860:
                case 974179053:
                    C2704.m8255();
                    if (!C19806.f63586) {
                        iM45029 = C19806.m45029("ۧ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16095) ^ 524413527;
                        i5 = -1893401128;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * (-32721)) ^ (-510167450);
                        i5 = 1589945327;
                    }
                    break;
                case 371236562:
                case 1463374232:
                    if (C2642.m8171() != 0) {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21929)) ^ 594103518;
                        i5 = -1851904913;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12601)) ^ (-1796136056);
                        i5 = 1950628945;
                    }
                    break;
                case 712492719:
                case 1522872792:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11597) ^ (-835595944);
                        i5 = 1277560122;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩳᩴ")) * (-37);
                        i4 = ((iM45029 ^ i3) * 26079) ^ 1432057078;
                        i5 = -813689523;
                    }
                    break;
                default:
                    abstractC20745 = this.f44028;
                    if (abstractC20745 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14693) ^ 1213622590;
                        i5 = -805111942;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13343)) ^ (-90089199);
                        i5 = -163263782;
                    }
                    break;
            }
            return;
        }
    }
}
