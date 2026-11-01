package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3YD */
/* JADX INFO: loaded from: classes.dex */
public final class C23359 implements PluginPreference.Builder {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Class f75670;

    /* JADX INFO: renamed from: ܺ᩵ۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f75671 = {1194, -2757, -2804, -2815, -2792, -2808, -2739, -2814, -2805, -2739, -2739, -2802, -2804, -2813, -2739, -2813, -2814, -2791, -2739, -2801, -2808, -2739, -2813, -2792, -2815, -2815, 1491, -24061, -24034, -24061, -24037, -24046, 6103, -20291, -20320, -20291, -20315, -20308, -20318, -20308, -20304, 1113, -8675, -8704, -8675, -8699, -8692, -8702, -8692, -8688, 4515, 7253, 7240, 7253, 7245, 7236, 7242, 7236, 7256, 1193, -22434, -22461, -22434, -22458, -22449, -22463, -22449, -22445, 2719, -22285, -22290, -22285, -22293, -22302, 2322, -6162, -6157, -6162, -6154, -6145, -6159, -6145, -6173};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public CharSequence f75672;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceScreenCreatedListener f75673;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginContext f75674;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceChangeListener f75675;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LocalString f75676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f75677;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f75678;

    /* JADX WARN: Code duplicated, block: B:51:0x01c0 A[PHI: r3 r4 r9 r11
      0x01c0: PHI (r3v4 l.ۖ۬ۘ) = (r3v2 l.ۖ۬ۘ), (r3v3 l.ۖ۬ۘ), (r3v2 l.ۖ۬ۘ), (r3v2 l.ۖ۬ۘ) binds: [B:50:0x01be, B:39:0x0141, B:27:0x00b7, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:50:0x01be, B:39:0x0141, B:27:0x00b7, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:50:0x01be, B:39:0x0141, B:27:0x00b7, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:50:0x01be, B:39:0x0141, B:27:0x00b7, B:14:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x021a A[PHI: r6 r7 r8
      0x021a: PHI (r6v5 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:58:0x0218, B:54:0x01f6, B:18:0x0071, B:89:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:58:0x0218, B:54:0x01f6, B:18:0x0071, B:89:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0218, B:54:0x01f6, B:18:0x0071, B:89:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0253 A[PHI: r14 r19
      0x0253: PHI (r14v3 short[]) = (r14v2 short[]), (r14v4 short[]) binds: [B:62:0x0251, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]) binds: [B:62:0x0251, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Text addText(CharSequence charSequence, String str) {
        int iM45029;
        int i;
        int i2;
        str = str;
        int i3 = C2124.f7782;
        int i4 = C1419.f5860;
        int iM11306 = (i4 - ThreadFactoryC3888.m11306("᩶ۚ")) * 51;
        int i5 = ((iM11306 ^ i3) * 28837) ^ (-1025555574);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ (-2039724827);
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1747026072;
        String strM10901 = null;
        C2541 c2541 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 32449) >> 31));
            switch (i12) {
                case -1633348237:
                case -1189265180:
                    C1977.m6356();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i4 - C19806.m45029("ܿۨ")) * (-37);
                        i = ((iM45029 ^ i3) * 4435) ^ (-1873019578);
                        i2 = 870766764;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    iM45029 = ThreadFactoryC3888.m11306("֡᩶") ^ i3;
                    i = ((iM45029 ^ i4) * (-10099)) ^ 1231539094;
                    i2 = 1909809826;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1625348081:
                case 1046945083:
                    s = sArr[74];
                    i7 = s * s;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܿۨ")) * (-37);
                        i = ((iM45029 ^ i3) * 4435) ^ (-1873019578);
                        i2 = 870766764;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩹") ^ i4) * (-101);
                        i = ((iM45029 ^ i3) * (-8505)) ^ (-1943107423);
                        i2 = 1770019528;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1542994570:
                case 1694882892:
                    i10 = 75;
                    i11 = 5;
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩶") ^ i3;
                        i = ((iM45029 ^ i4) * (-10099)) ^ 1231539094;
                        i2 = 1909809826;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۘ")) * (-23);
                        i = ((iM45029 ^ i4) * 31837) ^ (-1145029160);
                        i2 = -1165962934;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1388410926:
                case 557588755:
                    strM10901 = C3722.m10901(sArr3, 80, 3, i9);
                    if (C3660.m10791() != 0) {
                        iM45029 = C19806.m45029("ۧܰ") ^ i3;
                        i = ((iM45029 ^ i4) * (-2609)) ^ (-2032822081);
                        i2 = -381792687;
                    } else {
                        iM45029 = C19806.m45029("᩷ܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-26553)) ^ 1092589418;
                        i2 = -1727341870;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1312912584:
                case -70128132:
                    m51473(charSequence, C0526.m2424(sArr2, i10, i11, i9));
                    sArr3 = f75671;
                    if (C0817.m3399()) {
                        iM45029 = (i3 - C19806.m45029("ᩳܺ")) * 13;
                        i = ((iM45029 ^ i4) * (-15153)) ^ (-246492493);
                        i2 = -1081783738;
                    } else {
                        iM45029 = C19806.m45029("ܶۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 7809) ^ 1043944321;
                        i2 = 487550325;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1252287283:
                case -388424750:
                    i9 = 53593;
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ۘ") + i4) * 123;
                    i = ((iM45029 ^ i3) * 21657) ^ 92647445;
                    i2 = 1232904998;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1185516198:
                case 2045829670:
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("ۧܰ") ^ i3;
                        i = ((iM45029 ^ i4) * (-2609)) ^ (-2032822081);
                        i2 = -381792687;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    iM45029 = ThreadFactoryC3888.m11306("֡᩶") ^ i3;
                    i = ((iM45029 ^ i4) * (-10099)) ^ 1231539094;
                    i2 = 1909809826;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1015269210:
                case 1250195952:
                    s2 = 5955;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ۧܰ") ^ i3;
                        i = ((iM45029 ^ i4) * (-2609)) ^ (-2032822081);
                        i2 = -381792687;
                    } else {
                        iM45029 = C19806.m45029("᩶ܺ") ^ i3;
                        i = ((iM45029 ^ i4) * (-7549)) ^ 1924104714;
                        i2 = 2082334472;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -866811752:
                case -35217128:
                    i9 = 59290;
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ۘ") + i4) * 123;
                    i = ((iM45029 ^ i3) * 21657) ^ 92647445;
                    i2 = 1232904998;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -552269564:
                case 1226325524:
                    int i13 = 35462025 + i7;
                    i8 = i13 + i13;
                    if (C3535.m10431() <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܿۨ")) * (-37);
                        i = ((iM45029 ^ i3) * 4435) ^ (-1873019578);
                        i2 = 870766764;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֨") ^ i3;
                        i = ((iM45029 ^ i4) * 23795) ^ (-720498548);
                        i2 = -1260092190;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -487763826:
                case 1788087581:
                    if (C3577.f13150 < 0) {
                        iM45029 = C19806.m45029("ۧܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-5681)) ^ 422904354;
                        i2 = 1828102419;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    iM45029 = ThreadFactoryC3888.m11306("֡᩶") ^ i3;
                    i = ((iM45029 ^ i4) * (-10099)) ^ 1231539094;
                    i2 = 1909809826;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -334670382:
                case 314167712:
                    c2541 = new C2541();
                    sArr2 = f75671;
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("ۧܰ") ^ i3;
                        i = ((iM45029 ^ i4) * (-2609)) ^ (-2032822081);
                        i2 = -381792687;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-14323)) ^ (-97834620);
                        i2 = -1331352463;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -108162301:
                case 1286203441:
                    m51473(str, strM10901);
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ܿۨ")) * (-37);
                        i = ((iM45029 ^ i3) * 4435) ^ (-1873019578);
                        i2 = 870766764;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450210 = C19806.m45029("۫ܿ") ^ i4;
                        i6 = iM450210 ^ (-551968056);
                        i5 = ((iM450210 ^ i3) * (-16279)) ^ (-372898324);
                    }
                    break;
                case 128657184:
                case 139550663:
                    if (C3535.m10431() <= 0) {
                        iM45029 = C19806.m45029("ۧܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-5681)) ^ 422904354;
                        i2 = 1828102419;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺ۖ")) * 3;
                        i = ((iM45029 ^ i4) * (-23087)) ^ 411114262;
                        i2 = 716976656;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 179926534:
                case 1457307943:
                    c2541.f10931 = charSequence;
                    c2541.f10929 = str;
                    C3660.m10788(this.f75677, c2541);
                    return c2541;
                case 193288839:
                case 619002834:
                    int i14 = s + s2;
                    if ((i14 * i14) - i8 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢᩳ") ^ i4;
                        i = ((iM45029 ^ i3) * (-15139)) ^ 321899424;
                        i2 = 435512883;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡۟") ^ i3;
                        i = ((iM45029 ^ i4) * 27247) ^ (-2142816386);
                        i2 = -1027559528;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 333889671:
                case 1061771681:
                    AbstractC0464.m2313();
                    iM45029 = ThreadFactoryC3888.m11306("֡᩶") ^ i3;
                    i = ((iM45029 ^ i4) * (-10099)) ^ 1231539094;
                    i2 = 1909809826;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1282731357:
                case 1619305388:
                    sArr = f75671;
                    if (C3286.m9798() <= 0) {
                        iM45029 = C19806.m45029("ܶۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 7809) ^ 1043944321;
                        i2 = 487550325;
                    } else {
                        iM45029 = C19806.m45029("᩷ۤ") ^ i4;
                        i = ((iM45029 ^ i3) * (-13407)) ^ (-383723384);
                        i2 = -339464436;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1461.m5080();
                    C3660.m10791();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    /* JADX WARN: Code duplicated, block: B:62:0x024e A[PHI: r15 r20
      0x024e: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:61:0x024c, B:31:0x0114] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]) binds: [B:61:0x024c, B:31:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0280 A[PHI: r3 r6 r7 r10 r12 r13 r14
      0x0280: PHI (r3v6 l.ܳ֨ۘ) = (r3v2 l.ܳ֨ۘ), (r3v2 l.ܳ֨ۘ), (r3v2 l.ܳ֨ۘ), (r3v3 l.ܳ֨ۘ), (r3v2 l.ܳ֨ۘ), (r3v2 l.ܳ֨ۘ), (r3v2 l.ܳ֨ۘ) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r6v6 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r7v6 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r10v6 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r12v6 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r13v6 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r14v6 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:65:0x027e, B:57:0x022e, B:49:0x01d2, B:39:0x015c, B:35:0x0135, B:9:0x0063, B:89:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Header addHeader(CharSequence charSequence, String str) {
        int iM11306;
        int i;
        int i2;
        String str2 = str;
        int i3 = C2249.f8050;
        int i4 = C1025.f4800;
        int iM45029 = (C19806.m45029("ۜۙ") + i3) * (-127);
        int i5 = ((iM45029 ^ i4) * 12231) ^ (-673750970);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM45029 ^ (-616751978);
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1721796170;
        String strM26821 = null;
        C14187 c14187 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 14733) >> 31));
            switch (i12) {
                case -2087795938:
                case -905025739:
                    i10 = 33;
                    i11 = 5;
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("᩵ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-21399)) ^ (-1839629708);
                        i2 = 106981480;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -2026668690:
                case 1219373968:
                    s = sArr[32];
                    s2 = 1;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                    } else {
                        iM11306 = C19806.m45029("ۡ֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-767)) ^ 505952499;
                        i2 = 731264194;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1952519519:
                case -307426065:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                        i6 = iM11306 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ۙܳ") ^ i3;
                    i = ((iM11306 ^ i4) * (-32563)) ^ 1408765451;
                    i2 = 815167712;
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1939498784:
                case -428680040:
                    if (C1977.f7413 <= 0) {
                        int iM450210 = C19806.m45029("֨ۙ") ^ i4;
                        i = ((iM450210 ^ i3) * (-22433)) ^ 1616479124;
                        i6 = iM450210 ^ (-1610220026);
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܳ") ^ i3;
                        i = ((iM11306 ^ i4) * (-32563)) ^ 1408765451;
                        i2 = 815167712;
                        i6 = iM11306 ^ i2;
                        str2 = str;
                    }
                    i5 = i;
                    break;
                case -1708169108:
                case -252316939:
                    if (C1025.m3861() <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۖ")) * 87;
                        i = ((iM11306 ^ i3) * 23243) ^ (-292222185);
                        i2 = -1610454741;
                        i6 = iM11306 ^ i2;
                        str2 = str;
                    } else {
                        int iM450211 = C19806.m45029("֨ۙ") ^ i4;
                        i = ((iM450211 ^ i3) * (-22433)) ^ 1616479124;
                        i6 = iM450211 ^ (-1610220026);
                    }
                    i5 = i;
                    break;
                case -1602473618:
                case -1489425484:
                    sArr = f75671;
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 3595) ^ 1234877573;
                        i2 = 1274970159;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩻ܿ")) * (-81);
                        i = ((iM11306 ^ i3) * 2041) ^ (-676439356);
                        i2 = -1340491147;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1580534997:
                case 149941053:
                    c14187 = new C14187();
                    sArr2 = f75671;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۧ") + i3) * (-105);
                        i = ((iM11306 ^ i4) * (-1819)) ^ 1557083665;
                        i2 = -1787400093;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1533273079:
                case 1433447034:
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺֨") ^ i3;
                        i = ((iM11306 ^ i4) * 3685) ^ 506743452;
                        i2 = 1733902517;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1518240863:
                case 1278111359:
                    C1189.m4368();
                    C0278.m1789();
                    return null;
                case -1033446018:
                case -687314877:
                    i8 = s * s3;
                    if (C0797.f3386) {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۚ") ^ i4;
                        i = ((iM11306 ^ i3) * (-30983)) ^ (-133930152);
                        i2 = 96412959;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -720499453:
                case 601701504:
                    if (i7 - (i8 + 1) < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤܶ") + i4) * (-17);
                        i = ((iM11306 ^ i3) * (-9389)) ^ (-2027837138);
                        i2 = 1053056357;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i3;
                        i = ((iM11306 ^ i4) * 7555) ^ 548276605;
                        i2 = -718714680;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -720098972:
                case 451168554:
                    i9 = 49898;
                    iM11306 = ThreadFactoryC3888.m11306("ۖۧ") ^ i3;
                    i = ((iM11306 ^ i4) * (-7891)) ^ (-558583861);
                    i2 = 1638496405;
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -690837562:
                case 1500058779:
                    m51473(charSequence, C0526.m2424(sArr2, i10, i11, i9));
                    sArr3 = f75671;
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֫") ^ i3;
                        i = ((iM11306 ^ i4) * (-13305)) ^ (-2072968351);
                        i2 = -1575764006;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 3595) ^ 1234877573;
                        i2 = 1274970159;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -336216243:
                case 1820932350:
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    s3 = 2;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۖ")) * 87;
                        i = ((iM11306 ^ i3) * 23243) ^ (-292222185);
                        i2 = -1610454741;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-32627)) ^ 315547269;
                        i2 = 316142729;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -254560454:
                case 135550262:
                    m51473(str2, strM26821);
                    if (C0050.f912 <= 0) {
                        iM11306 = (i4 - C19806.m45029("᩻۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8959)) ^ (-1390474883);
                        i2 = -76713486;
                        i6 = iM11306 ^ i2;
                        str2 = str;
                        i5 = i;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("᩺֡") ^ i3;
                        i6 = iM11307 ^ (-1221296972);
                        i5 = ((iM11307 ^ i4) * (-7565)) ^ (-811764430);
                        str2 = str;
                    }
                    break;
                case 399922595:
                case 1890893048:
                    RunnableC0195.m1431();
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۖ")) * 87;
                    i = ((iM11306 ^ i3) * 23243) ^ (-292222185);
                    i2 = -1610454741;
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 645030724:
                case 1651509869:
                    strM26821 = C10634.m26821(sArr3, 38, 3, i9);
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܳ") ^ i3;
                        i = ((iM11306 ^ i4) * (-32563)) ^ 1408765451;
                        i2 = 815167712;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬۠") + i4) * (-47);
                        i = ((iM11306 ^ i3) * 5655) ^ (-859814456);
                        i2 = -1489031035;
                    }
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 1169692395:
                case 2001999804:
                    c14187.f10931 = charSequence;
                    c14187.f10929 = str2;
                    C3660.m10788(this.f75677, c14187);
                    return c14187;
                default:
                    i9 = 45257;
                    iM11306 = ThreadFactoryC3888.m11306("ۖۧ") ^ i3;
                    i = ((iM11306 ^ i4) * (-7891)) ^ (-558583861);
                    i2 = 1638496405;
                    i6 = iM11306 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
            }
        }
    }

    static {
        ClassNotFoundException e = null;
        int i = 1032036326;
        int i2 = C1461.f5957;
        int i3 = C3722.f13525;
        int iM45029 = C19806.m45029("֨ۤ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 25139) ^ 2111089090;
        int i5 = -1983645937;
        while (true) {
            i = ((((i ^ i2) * 13713) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2028468668:
                case -301064173:
                    RunnableC3388.m10064();
                    if (C1419.f5860 >= 0) {
                        iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * (-35);
                        i4 = ((iM45029 ^ i3) * 32561) ^ (-964790598);
                        i5 = 314517506;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۫֨")) * 17;
                        i4 = ((iM45029 ^ i2) * 26733) ^ (-1743873812);
                        i5 = 782478345;
                    }
                    break;
                case -1970238406:
                case -1819555592:
                    if (C0671.f2816 == 0) {
                        if (C2124.m6673() > 0) {
                            if (C1668.m5583()) {
                                if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0 && C1066.f4915 > 0) {
                                    if (!C0962.f3784 && C1377.f5749) {
                                        if (C2249.m6915() <= 0) {
                                            iM45029 = C19806.m45029("᩵᩵") ^ i3;
                                            i4 = ((iM45029 ^ i2) * 18819) ^ (-1868004380);
                                            i5 = -214934886;
                                            break;
                                        } else if (!C7105.m18985()) {
                                            if (C3743.f13569) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                    }
                                }
                            }
                            iM45029 = (C19806.m45029("ۘܰ") ^ i3) * (-55);
                            i4 = ((iM45029 ^ i2) * 27643) ^ 895893980;
                            i5 = 1990407766;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * (-35);
                        i4 = ((iM45029 ^ i3) * 32561) ^ (-964790598);
                        i5 = 314517506;
                        break;
                    }
                    iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 12613) ^ 4125765;
                    i5 = 43937900;
                    break;
                case -1444365297:
                case -699587616:
                    C3535.m10431();
                    if (C2788.m8472() == 0) {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12613) ^ 4125765;
                        i5 = 43937900;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۫֨")) * 17;
                        i4 = ((iM45029 ^ i2) * 26733) ^ (-1743873812);
                        i5 = 782478345;
                    }
                    break;
                case -1396869399:
                case 1542534292:
                    try {
                        int i6 = ActivityC19041.f61585;
                        f75670 = ActivityC19041.class;
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6807)) ^ (-96372122);
                        i5 = -1130174462;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        iM45029 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13749)) ^ (-731911931);
                        i5 = -1225438802;
                    }
                    break;
                case -456705419:
                case 1102165222:
                    return;
                case -244099246:
                case -122551171:
                    if (!RunnableC1564.m5345()) {
                        iM45029 = C19806.m45029("᩵᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18819) ^ (-1868004380);
                        i5 = -214934886;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۫֨")) * 17;
                        i4 = ((iM45029 ^ i2) * 26733) ^ (-1743873812);
                        i5 = 782478345;
                    }
                    break;
                case 315393790:
                case 1408285572:
                    C1419.m4973();
                    C3577.m10565();
                    throw new RuntimeException();
                default:
                    C1148.m4232();
                    C7105.m18985();
                    iM45029 = (i3 - C19806.m45029("۫֨")) * 17;
                    i4 = ((iM45029 ^ i2) * 26733) ^ (-1743873812);
                    i5 = 782478345;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01c1 A[PHI: r4 r6
      0x01c1: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:54:0x01bf, B:27:0x00ac, B:23:0x0082, B:15:0x005e, B:12:0x0055, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:54:0x01bf, B:27:0x00ac, B:23:0x0082, B:15:0x005e, B:12:0x0055, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f3 A[PHI: r3 r5 r7 r9 r10 r11
      0x01f3: PHI (r3v4 l.ۨ۬ۘ) = (r3v2 l.ۨ۬ۘ), (r3v2 l.ۨ۬ۘ), (r3v3 l.ۨ۬ۘ), (r3v2 l.ۨ۬ۘ), (r3v2 l.ۨ۬ۘ) binds: [B:58:0x01f1, B:50:0x019f, B:39:0x012a, B:35:0x0108, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:58:0x01f1, B:50:0x019f, B:39:0x012a, B:35:0x0108, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:58:0x01f1, B:50:0x019f, B:39:0x012a, B:35:0x0108, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:58:0x01f1, B:50:0x019f, B:39:0x012a, B:35:0x0108, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:58:0x01f1, B:50:0x019f, B:39:0x012a, B:35:0x0108, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:58:0x01f1, B:50:0x019f, B:39:0x012a, B:35:0x0108, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0221  */
    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Switch addSwitch(CharSequence charSequence, String str) {
        int iM45029;
        int i;
        int i2 = C1189.f5284;
        int i3 = C1419.f5860;
        int iM11306 = (ThreadFactoryC3888.m11306("ۨܽ") ^ i3) * (-111);
        int i4 = ((iM11306 ^ i2) * (-17523)) ^ (-1788598015);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i5 = iM11306 ^ 1639569758;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -2146170177;
        String strM10571 = null;
        C11715 c11715 = null;
        while (true) {
            i10 = i5 ^ (i4 & (((i10 ^ i2) * (-23859)) >> 31));
            switch (i10) {
                case -2060477582:
                case 272178993:
                    RunnableC1564.m5345();
                    C2249.m6915();
                    iM45029 = C19806.m45029("ۢۗ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 12827) ^ 2116694942;
                    i = 642049649;
                    i5 = iM45029 ^ i;
                    break;
                case -2055389324:
                case -1345251832:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 7633) ^ (-864131371);
                        i = -1743502745;
                    } else {
                        iM45029 = (C19806.m45029("᩺᩹") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-32283)) ^ 1655178152;
                        i = 351616673;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -2033274181:
                case -578536340:
                    m51473(str, strM10571);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 14589) ^ 139420981;
                        i = -587280082;
                        i5 = iM45029 ^ i;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("ۧ᩵") ^ i3) * 63;
                        int i11 = ((iM11307 ^ i2) * 32497) ^ 340344371;
                        i5 = iM11307 ^ (-421108754);
                        i4 = i11;
                    }
                    break;
                case -1936879085:
                case -961838509:
                    sArr = f75671;
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֡") + i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-1485)) ^ (-69108533);
                        i = -2054027887;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17245) ^ 699067633;
                        i = 1958952842;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1642196402:
                case -718224633:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 14589) ^ 139420981;
                        i = -587280082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 7633) ^ (-864131371);
                        i = -1743502745;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1519888747:
                case 75855277:
                    s = sArr[59];
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 14589) ^ 139420981;
                        i = -587280082;
                    } else {
                        iM45029 = C19806.m45029("ۨܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24331)) ^ 1253626643;
                        i = 9467126;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1504723776:
                case -215777998:
                    i8 = 60;
                    i9 = 5;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֡") + i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-1485)) ^ (-69108533);
                        i = -2054027887;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23625) ^ 80823406;
                        i = 669151987;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -1455624799:
                case 1443004533:
                    ThreadFactoryC3888.m11300();
                    return null;
                case -1305779908:
                case 1954228226:
                    c11715.f10931 = charSequence;
                    c11715.f10929 = str;
                    C3660.m10788(this.f75677, c11715);
                    return c11715;
                case -1011511776:
                case -718233378:
                    int i12 = s + 6236;
                    i6 = i12 * i12;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֡") + i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-1485)) ^ (-69108533);
                        i = -2054027887;
                    } else {
                        iM45029 = (C19806.m45029("֫֫") + i3) * 27;
                        i4 = ((iM45029 ^ i2) * (-17467)) ^ (-2120970662);
                        i = -1149788936;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -979344361:
                case 1015266310:
                    if ((s * 24944) - i6 <= 0) {
                        iM45029 = (C19806.m45029("᩸ܰ") + i2) * 39;
                        i4 = ((iM45029 ^ i3) * (-30963)) ^ (-1661509132);
                        i = -1048310771;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21553) ^ 983816002;
                        i = -1742222135;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -945418809:
                case -624919950:
                    i7 = 43050;
                    iM45029 = (i2 - C19806.m45029("ۘۛ")) * (-63);
                    i4 = ((iM45029 ^ i3) * 19773) ^ 1998507253;
                    i = 573007456;
                    i5 = iM45029 ^ i;
                    break;
                case -663497062:
                case 129948864:
                    C0962.m3746();
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ۢۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12827) ^ 2116694942;
                        i = 642049649;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 14589) ^ 139420981;
                        i = -587280082;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -325552480:
                case 1538216141:
                    strM10571 = C3577.m10571(sArr3, 65, 3, i7);
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 14589) ^ 139420981;
                        i = -587280082;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹᩸")) * 85;
                        i4 = ((iM45029 ^ i3) * 29797) ^ 729163095;
                        i = -1062453695;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case -230604696:
                case 1023480956:
                    m51473(charSequence, C3722.m10901(sArr2, i8, i9, i7));
                    sArr3 = f75671;
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("᩵ܳ") ^ i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-11567)) ^ (-255025384);
                        i = -931450380;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۚ") + i2) * (-67);
                        i4 = ((iM45029 ^ i3) * (-31603)) ^ (-1660727629);
                        i = 45805910;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case 158706227:
                case 1303686645:
                    if (C0629.f2722 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 14589) ^ 139420981;
                        i = -587280082;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֡") + i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-1485)) ^ (-69108533);
                        i = -2054027887;
                    }
                    i5 = iM45029 ^ i;
                    break;
                case 599994170:
                case 1300701744:
                    i7 = 21178;
                    iM45029 = (i2 - C19806.m45029("ۘۛ")) * (-63);
                    i4 = ((iM45029 ^ i3) * 19773) ^ 1998507253;
                    i = 573007456;
                    i5 = iM45029 ^ i;
                    break;
                case 1555665343:
                case 2095674830:
                    c11715 = new C11715();
                    sArr2 = f75671;
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۨ") + i2) * (-81);
                        i4 = ((iM45029 ^ i3) * 4561) ^ 1651202730;
                        i = -1950722160;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֡") + i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-1485)) ^ (-69108533);
                        i = -2054027887;
                    }
                    i5 = iM45029 ^ i;
                    break;
                default:
                    if (C1875.m6086() != 0) {
                        iM45029 = C19806.m45029("ۢۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12827) ^ 2116694942;
                        i = 642049649;
                    } else {
                        iM45029 = C19806.m45029("ۨۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21847) ^ (-918402303);
                        i = 2054275698;
                    }
                    i5 = iM45029 ^ i;
                    break;
            }
        }
    }

    public C23359(PluginContext pluginContext) {
        ArrayList arrayList = null;
        int i = 893284248;
        int i2 = C2249.f8050;
        int i3 = C1668.f6641;
        int iM45029 = (i2 - C19806.m45029("᩷ܶ")) * 13;
        int i4 = ((iM45029 ^ i3) * (-16261)) ^ (-751802594);
        int i5 = -1344183781;
        while (true) {
            i = ((((i ^ i3) * (-12985)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2049968170:
                case -1715421552:
                    C1189.m4368();
                    AbstractC0464.m2313();
                    throw new RuntimeException();
                case -1800063216:
                case 641495562:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("֡ۧ") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * 19701) ^ (-1469831713);
                        i5 = 352102773;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩵ۨ")) * 47;
                        i4 = ((iM45029 ^ i3) * 7619) ^ 1083022846;
                        i5 = 1280194125;
                    }
                    break;
                case -1776555360:
                case 1795193227:
                    arrayList = new ArrayList();
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۡ") + i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 17925) ^ 401445063;
                        i5 = -472957984;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5051)) ^ 630825181;
                        i5 = 1817185461;
                    }
                    break;
                case -1405895721:
                case -150201285:
                    CallableC1627.m5507();
                    iM45029 = C19806.m45029("۟ۧ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 235) ^ (-396365490);
                    i5 = 247106023;
                    break;
                case -1352492867:
                case 477962614:
                    if (C2477.m7593() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3507) ^ 1272956399;
                        i5 = 254183028;
                    } else {
                        iM45029 = C19806.m45029("ۚۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14059) ^ 174571703;
                        i5 = 791626498;
                    }
                    break;
                case -1202359075:
                case -37169158:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۠۠")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * (-4949)) ^ 793100849;
                        i5 = -1471371981;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3507) ^ 1272956399;
                        i5 = 254183028;
                    }
                    break;
                case -1049419307:
                case 118813042:
                    C0797.m3359();
                    if (C1875.f7103 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5051)) ^ 630825181;
                        i5 = 1817185461;
                    } else {
                        iM45029 = C19806.m45029("۟ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 235) ^ (-396365490);
                        i5 = 247106023;
                    }
                    break;
                case -850611263:
                case 1181031181:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 3507) ^ 1272956399;
                        i5 = 254183028;
                    } else {
                        iM45029 = (C19806.m45029("֡ۧ") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * 19701) ^ (-1469831713);
                        i5 = 352102773;
                    }
                    break;
                case -808346982:
                case 785221049:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5051)) ^ 630825181;
                        i5 = 1817185461;
                    } else {
                        iM45029 = (C19806.m45029("ۧܰ") + i3) * (-119);
                        i4 = ((iM45029 ^ i2) * (-18123)) ^ (-720754615);
                        i5 = -1287043582;
                    }
                    break;
                case -684783694:
                case 87510010:
                    this.f75677 = arrayList;
                    this.f75674 = pluginContext;
                    return;
                case -525983770:
                case 501886121:
                    if (C1189.m4368() <= 0) {
                        iM45029 = (C19806.m45029("֡ۧ") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * 19701) ^ (-1469831713);
                        i5 = 352102773;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30983)) ^ (-1831688663);
                        i5 = -1322372801;
                    }
                    break;
                case -256849728:
                case 491455145:
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 235) ^ (-396365490);
                        i5 = 247106023;
                    } else {
                        iM45029 = (C19806.m45029("ۢܰ") + i3) * (-63);
                        i4 = ((iM45029 ^ i2) * (-31571)) ^ 590190015;
                        i5 = -1339642915;
                    }
                    break;
                case 145741360:
                case 1664309333:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧ᩶")) * (-85);
                        i4 = ((iM45029 ^ i2) * 14161) ^ 1319681763;
                        i5 = -233152739;
                    } else {
                        iM45029 = C19806.m45029("᩶᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28287)) ^ (-418572921);
                        i5 = 391059554;
                    }
                    break;
                case 636959924:
                case 1260844354:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (C19806.m45029("֡ۧ") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * 19701) ^ (-1469831713);
                        i5 = 352102773;
                    } else {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16441) ^ 226170320;
                        i5 = 941141793;
                    }
                    break;
                case 1273048233:
                case 1900908612:
                    if (C19806.f63586) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧ᩶")) * (-85);
                        i4 = ((iM45029 ^ i2) * 14161) ^ 1319681763;
                        i5 = -233152739;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29283) ^ 410083259;
                        i5 = 1741343529;
                    }
                    break;
                default:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (C19806.m45029("֡ۧ") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * 19701) ^ (-1469831713);
                        i5 = 352102773;
                    } else {
                        iM45029 = C19806.m45029("۟ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 235) ^ (-396365490);
                        i5 = 247106023;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final void setLocalString(LocalString localString) {
        this.f75676 = localString;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder title(CharSequence charSequence) {
        this.f75672 = charSequence;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0153 A[PHI: r3 r4
      0x0153: PHI (r3v4 l.ۙ۬ۘ) = (r3v3 l.ۙ۬ۘ), (r3v2 l.ۙ۬ۘ) binds: [B:42:0x0151, B:34:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r4v4 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v2 java.util.ArrayList) binds: [B:42:0x0151, B:34:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0266 A[PHI: r8 r9 r10 r12 r13 r14 r15 r20
      0x0266: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x0264, B:57:0x0209, B:53:0x01e4, B:38:0x0127, B:30:0x00d8, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.List addList(CharSequence charSequence, String str) {
        int iM45029;
        int i;
        int i2;
        String str2 = str;
        int i3 = C1148.f5161;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = ThreadFactoryC3888.m11306("ۖۗ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-8263)) ^ 1694470321;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 1734989663;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1513267532;
        ArrayList arrayList = null;
        short[] sArr3 = null;
        C4658 c4658 = null;
        int i12 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-18477)) >> 31));
            switch (i11) {
                case -2059325153:
                case 847151284:
                    i12 = 22496;
                    iM45029 = (ThreadFactoryC3888.m11306("۠᩹") + i4) * 77;
                    i = ((iM45029 ^ i3) * (-5755)) ^ (-483162947);
                    i2 = -842423785;
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -2006174178:
                case -1771687823:
                    c4658.f16455 = arrayList;
                    sArr3 = f75671;
                    if (C3722.m10894() <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܺ֨")) * 93;
                        i = ((iM45029 ^ i4) * 29393) ^ 636624030;
                        i2 = 340662890;
                    } else {
                        iM45029 = C19806.m45029("ᩳۤ") ^ i3;
                        i = ((iM45029 ^ i4) * (-6991)) ^ 1602069816;
                        i2 = -1718035771;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1674853334:
                case 2070888461:
                    sArr = f75671;
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܺ֨")) * 93;
                        i = ((iM45029 ^ i4) * 29393) ^ 636624030;
                        i2 = 340662890;
                    } else {
                        iM45029 = (C19806.m45029("ܳ۟") ^ i4) * (-31);
                        i = ((iM45029 ^ i3) * 14993) ^ (-1250346812);
                        i2 = 663488131;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1608434937:
                case 166305001:
                    c4658 = new C4658();
                    arrayList = new ArrayList();
                    if (C3286.m9798() <= 0) {
                        iM45029 = (i4 - C19806.m45029("֫ܰ")) * 35;
                        i = ((iM45029 ^ i3) * (-24663)) ^ 1256302272;
                        i2 = -1073312389;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 21239) ^ 421714316;
                        i2 = 929504995;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1490519336:
                case -1410338464:
                    s = sArr[50];
                    s2 = 1;
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("ᩳܽ") ^ i4) * (-93);
                        i = ((iM45029 ^ i3) * (-1115)) ^ (-1681624452);
                        i2 = 977771284;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۡ")) * 7;
                        i = ((iM45029 ^ i4) * 9257) ^ (-666478866);
                        i2 = -1275537974;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1302646420:
                case 703695064:
                    C1875.m6086();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۡ")) * 7;
                    i = ((iM45029 ^ i4) * 9257) ^ (-666478866);
                    i2 = -1275537974;
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1211762979:
                case -996302787:
                    m51473(str2, C2332.m7082(sArr2, i9, i10, i12));
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ܺܳ") ^ i4) * 13;
                        i = ((iM45029 ^ i3) * 19073) ^ 694511333;
                        i2 = -1619173286;
                        i6 = iM45029 ^ i2;
                        str2 = str;
                        i5 = i;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("ۘᩳ") ^ i4;
                        i6 = iM11307 ^ 464519416;
                        i5 = ((iM11307 ^ i3) * 20739) ^ (-1477163330);
                        str2 = str;
                    }
                    break;
                case -1193964573:
                case 1558487759:
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    s3 = 2;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܺ֨")) * 93;
                        i = ((iM45029 ^ i4) * 29393) ^ 636624030;
                        i2 = 340662890;
                    } else {
                        iM45029 = C19806.m45029("ܰۤ") ^ i3;
                        i = ((iM45029 ^ i4) * 13891) ^ 224885364;
                        i2 = 1930019008;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1162675244:
                case -862088693:
                    c4658.f10931 = charSequence;
                    c4658.f10929 = str2;
                    C3660.m10788(this.f75677, c4658);
                    return c4658;
                case -1024223157:
                case 213547155:
                    i8 = s * s3;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܺ֨")) * 93;
                        i = ((iM45029 ^ i4) * 29393) ^ 636624030;
                        i2 = 340662890;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩸ᩳ")) * (-13);
                        i = ((iM45029 ^ i3) * (-27679)) ^ (-83964176);
                        i2 = 175233420;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1020691507:
                case 1867233908:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۡ")) * 7;
                        i = ((iM45029 ^ i4) * 9257) ^ (-666478866);
                        i2 = -1275537974;
                        i6 = iM45029 ^ i2;
                        str2 = str;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i3;
                        i = ((iM11308 ^ i4) * 12543) ^ 1940809294;
                        i6 = iM11308 ^ 20697056;
                    }
                    i5 = i;
                    break;
                case -846325766:
                case -433537549:
                    m51473(charSequence, C1460.m5047(sArr3, 51, 5, i12));
                    if (C0526.f2219) {
                        iM45029 = (i4 - C19806.m45029("֫ܰ")) * 35;
                        i = ((iM45029 ^ i3) * (-24663)) ^ 1256302272;
                        i2 = -1073312389;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩻ۢ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i3) * 14611) ^ (-346240500);
                        i2 = -1564964265;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -837206002:
                case 1210099851:
                    C1461.m5080();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    return null;
                case -646041096:
                case 1527447611:
                    if (i7 - (i8 + 1) >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i3) * (-7);
                        i = ((iM45029 ^ i4) * 22971) ^ 1988957711;
                        i2 = 1744689089;
                    } else {
                        iM45029 = C19806.m45029("۬ܳ") ^ i3;
                        i = ((iM45029 ^ i4) * 4921) ^ 1956327988;
                        i2 = 1305280660;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -437534866:
                case 739381737:
                    i12 = 7201;
                    iM45029 = (ThreadFactoryC3888.m11306("۠᩹") + i4) * 77;
                    i = ((iM45029 ^ i3) * (-5755)) ^ (-483162947);
                    i2 = -842423785;
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 918622439:
                case 2079518878:
                    sArr2 = f75671;
                    i9 = 56;
                    i10 = 3;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("ᩴ֨") ^ i3) * 115;
                        i = ((iM45029 ^ i4) * 20919) ^ (-1946633870);
                        i2 = -1734299276;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺ֨")) * 93;
                        i = ((iM45029 ^ i4) * 29393) ^ 636624030;
                        i2 = 340662890;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 1148986087:
                case 2123082086:
                    if (C0671.m3008() < 0) {
                        iM45029 = (i3 - C19806.m45029("ܺ֨")) * 93;
                        i = ((iM45029 ^ i4) * 29393) ^ 636624030;
                        i2 = 340662890;
                        i6 = iM45029 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۡ")) * 7;
                    i = ((iM45029 ^ i4) * 9257) ^ (-666478866);
                    i2 = -1275537974;
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case 1894335715:
                case 2006693599:
                    C0526.m2437();
                    if (C0526.m2437() >= 0) {
                        iM45029 = (C19806.m45029("ܺܳ") ^ i4) * 13;
                        i = ((iM45029 ^ i3) * 19073) ^ 694511333;
                        i2 = -1619173286;
                        i6 = iM45029 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۡ")) * 7;
                    i = ((iM45029 ^ i4) * 9257) ^ (-666478866);
                    i2 = -1275537974;
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                default:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ܺܳ") ^ i4) * 13;
                        i = ((iM45029 ^ i3) * 19073) ^ 694511333;
                        i2 = -1619173286;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܺ") ^ i3;
                        i = ((iM45029 ^ i4) * (-27887)) ^ (-902480529);
                        i2 = 81576306;
                    }
                    i6 = iM45029 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder subtitle(CharSequence charSequence) {
        this.f75678 = charSequence;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01cf A[PHI: r5 r6 r10
      0x01cf: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:53:0x01cd, B:41:0x0169, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:53:0x01cd, B:41:0x0169, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:53:0x01cd, B:41:0x0169, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0204 A[PHI: r4 r7 r13 r14
      0x0204: PHI (r4v5 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:57:0x0202, B:49:0x01ab, B:28:0x00c1, B:88:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:57:0x0202, B:49:0x01ab, B:28:0x00c1, B:88:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:57:0x0202, B:49:0x01ab, B:28:0x00c1, B:88:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:57:0x0202, B:49:0x01ab, B:28:0x00c1, B:88:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x026d A[PHI: r8 r9
      0x026d: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:65:0x026b, B:45:0x018c, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:65:0x026b, B:45:0x018c, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (l.C0797.m3359() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (l.C0629.f2722 <= 0) goto L17;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Header addHeader(java.lang.CharSequence r21) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23359.addHeader(java.lang.CharSequence):bin.mt.plugin.api.preference.PluginPreference$Header");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51473(Object obj, String str) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 871702952;
        int i5 = C1875.f7103;
        int i6 = C1066.f4915;
        int iM11306 = (i6 - ThreadFactoryC3888.m11306("۠ܺ")) * (-91);
        int i7 = ((iM11306 ^ i5) * 169) ^ 928991433;
        int i8 = 1738373813;
        while (true) {
            i4 = ((((i4 ^ i5) * (-25987)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2025631262:
                case 1902647166:
                    s2 = 36404;
                    if (C3286.f12186) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֡ۚ")) * 45;
                        i7 = ((iM11306 ^ i6) * 11965) ^ 1000562730;
                        i8 = -1316082057;
                    } else {
                        iM11306 = (C19806.m45029("ۤۘ") + i5) * (-59);
                        i7 = ((iM11306 ^ i6) * (-15803)) ^ (-1986672708);
                        i8 = 1714521735;
                    }
                    break;
                case -1680280759:
                case -1161039460:
                    C1875.m6086();
                    return;
                case -1591613994:
                case 1174970496:
                    C0216.m1591();
                    C7105.m18985();
                    iM11306 = (C19806.m45029("ܺ᩵") ^ i5) * 33;
                    i7 = ((iM11306 ^ i6) * (-12607)) ^ (-1150282451);
                    i8 = -341519094;
                    break;
                case -1474469583:
                case 875044000:
                    i3 = 62829;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i5;
                    i7 = ((iM11306 ^ i6) * 9137) ^ (-1830524883);
                    i8 = -409265964;
                    break;
                case -1387516190:
                case 406779049:
                    if (i2 - (s * s2) >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩻") ^ i5;
                        i7 = ((iM11306 ^ i6) * 5491) ^ 631575104;
                        i8 = 1127169268;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܺ") + i6) * (-93);
                        i7 = ((iM11306 ^ i5) * 16397) ^ 884019423;
                        i8 = -540892215;
                    }
                    break;
                case -1380786701:
                case -710877698:
                    i3 = 21359;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i5;
                    i7 = ((iM11306 ^ i6) * 9137) ^ (-1830524883);
                    i8 = -409265964;
                    break;
                case -1309220015:
                case 107798953:
                    if (C0817.f3443) {
                        iM11306 = (i5 - C19806.m45029("ۖܶ")) * 101;
                        i7 = ((iM11306 ^ i6) * 17831) ^ (-1830893877);
                        i8 = -1378975943;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩵") ^ i5) * 33;
                        i7 = ((iM11306 ^ i6) * (-12607)) ^ (-1150282451);
                        i8 = -341519094;
                    }
                    break;
                case -1209075822:
                case -155188650:
                    C1668.m5583();
                    if (!C3286.f12186) {
                        iM11306 = (C19806.m45029("ܺ᩵") ^ i5) * 33;
                        i7 = ((iM11306 ^ i6) * (-12607)) ^ (-1150282451);
                        i8 = -341519094;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܰ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-32005)) ^ 198472504;
                        i8 = -996339311;
                    }
                    break;
                case -1185238045:
                case -140298792:
                    short[] sArr2 = f75671;
                    if (!RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 26391) ^ (-1545540398);
                        i8 = 502396514;
                    } else if (C7105.f23796 >= 0) {
                        iM11306 = (C19806.m45029("ܺ᩵") ^ i5) * 33;
                        i7 = ((iM11306 ^ i6) * (-12607)) ^ (-1150282451);
                        i8 = -341519094;
                    } else {
                        String strM10901 = C3722.m10901(sArr2, 1, 9, i3);
                        short[] sArr3 = f75671;
                        if (C0050.f912 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۧܰ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-32005)) ^ 198472504;
                            i8 = -996339311;
                        } else {
                            String strM10571 = C3577.m10571(sArr3, 10, 16, i3);
                            if (C2704.m8255() > 0) {
                                throw new NullPointerException(C16523.m38890(strM10901, str, strM10571));
                            }
                            iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-10115)) ^ 1038139206;
                            i8 = 859819771;
                        }
                    }
                    break;
                case -1051796798:
                case 1344324386:
                    return;
                case -609980986:
                case 693980533:
                    c = 0;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ܺ᩵") ^ i5) * 33;
                        i7 = ((iM11306 ^ i6) * (-12607)) ^ (-1150282451);
                        i8 = -341519094;
                    } else {
                        iM11306 = (C19806.m45029("ܽۢ") + i6) * (-31);
                        i7 = ((iM11306 ^ i5) * 1855) ^ 1592518247;
                        i8 = -1430186684;
                    }
                    break;
                case -582924261:
                case -435242317:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 26391) ^ (-1545540398);
                        i8 = 502396514;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩵") ^ i5) * 33;
                        i7 = ((iM11306 ^ i6) * (-12607)) ^ (-1150282451);
                        i8 = -341519094;
                    }
                    break;
                case 81522455:
                case 1661243122:
                    s = sArr[c];
                    i = s * s;
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۖ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-10115)) ^ 1038139206;
                        i8 = 859819771;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩷") + i5) * 81;
                        i7 = ((iM11306 ^ i6) * (-10785)) ^ (-197229698);
                        i8 = -1430652228;
                    }
                    break;
                case 212532076:
                case 1821043895:
                    if (obj != null) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * 28407) ^ 409450518;
                        i8 = -1527628971;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܺ") + i6) * (-31);
                        i7 = ((iM11306 ^ i5) * (-4201)) ^ (-2107410320);
                        i8 = 1505696536;
                    }
                    break;
                case 358099546:
                case 1741172888:
                    sArr = f75671;
                    if (C2704.m8255() <= 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 26391) ^ (-1545540398);
                        i8 = 502396514;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩺") + i6) * 115;
                        i7 = ((iM11306 ^ i5) * (-6391)) ^ (-866297609);
                        i8 = 1856413007;
                    }
                    break;
                case 464059684:
                case 1451426293:
                    if (C2642.m8171() == 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֡ۚ")) * 45;
                        i7 = ((iM11306 ^ i6) * 11965) ^ 1000562730;
                        i8 = -1316082057;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܰ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-32005)) ^ 198472504;
                        i8 = -996339311;
                    }
                    break;
                default:
                    i2 = 331312804 + i;
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܰ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-32005)) ^ 198472504;
                        i8 = -996339311;
                    } else {
                        iM11306 = (C19806.m45029("ܳ֡") ^ i6) * 31;
                        i7 = ((iM11306 ^ i5) * (-29531)) ^ 1372966845;
                        i8 = -694175870;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0182 A[PHI: r2 r10 r12
      0x0182: PHI (r2v3 l.ۖ۬ۘ) = (r2v2 l.ۖ۬ۘ), (r2v2 l.ۖ۬ۘ), (r2v4 l.ۖ۬ۘ) binds: [B:41:0x0180, B:14:0x0073, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:41:0x0180, B:14:0x0073, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:41:0x0180, B:14:0x0073, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0242 A[PHI: r5 r6 r7 r8 r9 r19
      0x0242: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:61:0x0240, B:53:0x0200, B:49:0x01dd, B:45:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:61:0x0240, B:53:0x0200, B:49:0x01dd, B:45:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:61:0x0240, B:53:0x0200, B:49:0x01dd, B:45:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:61:0x0240, B:53:0x0200, B:49:0x01dd, B:45:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:61:0x0240, B:53:0x0200, B:49:0x01dd, B:45:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:61:0x0240, B:53:0x0200, B:49:0x01dd, B:45:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0277 A[PHI: r4
      0x0277: PHI (r4v6 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:65:0x0275, B:57:0x0220, B:11:0x0066, B:89:0x0277] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (l.CallableC1627.m5507() == 0) goto L14;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Text addText(java.lang.CharSequence r21) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23359.addText(java.lang.CharSequence):bin.mt.plugin.api.preference.PluginPreference$Text");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x023f A[PHI: r8 r18
      0x023f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:61:0x023d, B:53:0x01fe, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:61:0x023d, B:53:0x01fe, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x026d A[PHI: r7 r11 r12 r13
      0x026d: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:65:0x026b, B:57:0x021e, B:30:0x00d4, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:65:0x026b, B:57:0x021e, B:30:0x00d4, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:65:0x026b, B:57:0x021e, B:30:0x00d4, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:65:0x026b, B:57:0x021e, B:30:0x00d4, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (l.C0817.f3443 != false) goto L12;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Input addInput(java.lang.CharSequence r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23359.addInput(java.lang.CharSequence, java.lang.String):bin.mt.plugin.api.preference.PluginPreference$Input");
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onPreferenceChange(PluginPreference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f75675 = onPreferenceChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onCreated(PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener) {
        this.f75673 = onPreferenceScreenCreatedListener;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x04f4 A[PHI: r6 r7 r9 r16 r18
      0x04f4: PHI (r6v53 bin.mt.plugin.api.LocalString) = 
      (r6v4 bin.mt.plugin.api.LocalString)
      (r6v29 bin.mt.plugin.api.LocalString)
      (r6v39 bin.mt.plugin.api.LocalString)
      (r6v40 bin.mt.plugin.api.LocalString)
      (r6v54 bin.mt.plugin.api.LocalString)
     binds: [B:133:0x04f3, B:114:0x042a, B:88:0x02c6, B:83:0x029e, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r7v4 java.lang.CharSequence) = 
      (r7v2 java.lang.CharSequence)
      (r7v2 java.lang.CharSequence)
      (r7v3 java.lang.CharSequence)
      (r7v2 java.lang.CharSequence)
      (r7v2 java.lang.CharSequence)
     binds: [B:133:0x04f3, B:114:0x042a, B:88:0x02c6, B:83:0x029e, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r9v4 char) = (r9v2 char), (r9v2 char), (r9v2 char), (r9v3 char), (r9v2 char) binds: [B:133:0x04f3, B:114:0x042a, B:88:0x02c6, B:83:0x029e, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r16v5 boolean) = (r16v2 boolean), (r16v2 boolean), (r16v4 boolean), (r16v2 boolean), (r16v2 boolean) binds: [B:133:0x04f3, B:114:0x042a, B:88:0x02c6, B:83:0x029e, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r18v32 java.lang.String) = 
      (r18v3 java.lang.String)
      (r18v11 java.lang.String)
      (r18v21 java.lang.String)
      (r18v22 java.lang.String)
      (r18v33 java.lang.String)
     binds: [B:133:0x04f3, B:114:0x042a, B:88:0x02c6, B:83:0x029e, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01e6 A[PHI: r2 r15
      0x01e6: PHI (r2v87 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v86 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:65:0x01cd, B:56:0x0189, B:50:0x014c, B:44:0x0112, B:38:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r15v4 java.lang.CharSequence) = 
      (r15v3 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
     binds: [B:65:0x01cd, B:56:0x0189, B:50:0x014c, B:44:0x0112, B:38:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0328 A[PHI: r6 r18
      0x0328: PHI (r6v37 bin.mt.plugin.api.LocalString) = (r6v36 bin.mt.plugin.api.LocalString), (r6v38 bin.mt.plugin.api.LocalString) binds: [B:94:0x030e, B:91:0x02ee] A[DONT_GENERATE, DONT_INLINE]
      0x0328: PHI (r18v19 java.lang.String) = (r18v18 java.lang.String), (r18v20 java.lang.String) binds: [B:94:0x030e, B:91:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.f7262 == false) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m51474() {
        /*
            Method dump skipped, instruction units count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23359.m51474():java.util.ArrayList");
    }
}
