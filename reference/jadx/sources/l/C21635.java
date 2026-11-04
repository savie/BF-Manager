package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.preference.PluginPreference;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C3YU */
/* JADX INFO: loaded from: classes.dex */
public final class C21635 extends AbstractC14921 implements PluginPreference.List {

    /* JADX INFO: renamed from: ֡ۢۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f69077 = {5690, 32227, 32254, 32239, 32231, 32164, 32228, 32235, 32231, 32239};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f69078;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f69079;

    /* JADX WARN: Code duplicated, block: B:36:0x0101 A[PHI: r3 r12 r13
      0x0101: PHI (r3v4 l.ܿ᩺֫) = (r3v3 l.ܿ᩺֫), (r3v2 l.ܿ᩺֫), (r3v2 l.ܿ᩺֫) binds: [B:35:0x00ff, B:11:0x005b, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:35:0x00ff, B:11:0x005b, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:35:0x00ff, B:11:0x005b, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d5 A[PHI: r4 r6 r7
      0x01d5: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:54:0x01d3, B:30:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:54:0x01d3, B:30:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:54:0x01d3, B:30:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x023b A[PHI: r8 r9
      0x023b: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:62:0x0239, B:50:0x01ae, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:62:0x0239, B:50:0x01ae, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x026d A[PHI: r10
      0x026d: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:66:0x026b, B:46:0x0189, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List.Item addItem(CharSequence charSequence, String str) {
        int iM3169;
        int i;
        int i2;
        this = this;
        int i3 = C2354.f7599;
        int i4 = C3779.f12953;
        int iM2761 = (C0619.m2761("ۡ᩶") + i4) * (-19);
        int i5 = ((iM2761 ^ i3) * 26563) ^ 1120379936;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-521427800);
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -771617915;
        String strM9486 = null;
        C18651 c18651 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 12007) >> 31));
            switch (i12) {
                case -2122192557:
                case 714307402:
                    s = sArr[0];
                    s2 = 1176;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("֨֨") ^ i3;
                        i = ((iM3169 ^ i4) * 3621) ^ (-1052893516);
                        i2 = 215382348;
                    } else {
                        iM3169 = (C0773.m3169("֨۬") + i3) * 61;
                        i = ((iM3169 ^ i4) * 6729) ^ (-1337788390);
                        i2 = -221514506;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2024920150:
                case -1782169230:
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    i8 = s * s;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("᩶᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 519) ^ (-94755222);
                        i2 = 1396084319;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳۙ")) * (-51);
                        i = ((iM3169 ^ i4) * (-6583)) ^ 770595204;
                        i2 = 50708734;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1930577133:
                case 2058197462:
                    C2310.m7813();
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("֡ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 83) ^ (-1055817352);
                        i2 = -530519571;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    iM3169 = C0773.m3169("ܿܰ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6281)) ^ (-1695425107);
                    i2 = -205125568;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1928840294:
                case 158609959:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("᩶ۡ") ^ i3;
                        i = ((iM3169 ^ i4) * (-24553)) ^ 197374514;
                        i2 = -109650574;
                    } else {
                        iM3169 = C0773.m3169("֡ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 83) ^ (-1055817352);
                        i2 = -530519571;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1892436613:
                case 767889756:
                    sArr = f69077;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ܿܰ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6281)) ^ (-1695425107);
                        i2 = -205125568;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۢܰ")) * (-11);
                        i = ((iM3169 ^ i3) * (-12471)) ^ 458885121;
                        i2 = 485413762;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1665743396:
                case 536911766:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("᩶ۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 29793) ^ 582846375;
                        i2 = 1070176758;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    iM3169 = C0773.m3169("ܿܰ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6281)) ^ (-1695425107);
                    i2 = -205125568;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1510352524:
                case 369263926:
                    i10 = 32084;
                    iM3169 = C0619.m2761("֡ܽ") ^ i4;
                    i = ((iM3169 ^ i3) * 22105) ^ 1769501197;
                    i2 = 160280546;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1044058849:
                case -80142037:
                    strM9486 = C2878.m9486(sArr2, i11, 9, i10);
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("֨֨") ^ i3;
                        i = ((iM3169 ^ i4) * 3621) ^ (-1052893516);
                        i2 = 215382348;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۤܺ")) * (-49);
                        i = ((iM3169 ^ i3) * 2933) ^ (-1531942029);
                        i2 = -201306565;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -837296212:
                case 1041116028:
                    i9 = 1382976;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("֡ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 83) ^ (-1055817352);
                        i2 = -530519571;
                    } else {
                        iM3169 = (C0619.m2761("ۢۢ") ^ i4) * (-85);
                        i = ((iM3169 ^ i3) * 9403) ^ 165986073;
                        i2 = 544084897;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -631327065:
                case 1746780763:
                    C1519.m5403();
                    C2288.m7767();
                    return null;
                case -513169128:
                case -33456229:
                    C12684.m31477(charSequence, strM9486);
                    c18651.f60652 = this;
                    c18651.f60654 = charSequence;
                    if (C17202.f56030) {
                        int iM2762 = (i3 - C0619.m2761("ۘ۠")) * 63;
                        i6 = iM2762 ^ (-1481203563);
                        i5 = ((iM2762 ^ i4) * 13267) ^ (-107206793);
                    } else {
                        iM3169 = C0773.m3169("ܿܰ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6281)) ^ (-1695425107);
                        i2 = -205125568;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -507519605:
                case 275274173:
                    i10 = 32138;
                    iM3169 = C0619.m2761("֡ܽ") ^ i4;
                    i = ((iM3169 ^ i3) * 22105) ^ 1769501197;
                    i2 = 160280546;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -89942719:
                case 1879070162:
                    C0950.m3785();
                    iM3169 = C0773.m3169("ܿܰ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6281)) ^ (-1695425107);
                    i2 = -205125568;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 219370351:
                case 538264424:
                    c18651 = new C18651();
                    sArr2 = f69077;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("᩶ۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 29793) ^ 582846375;
                        i2 = 1070176758;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܶ᩶")) * (-111);
                        i = ((iM3169 ^ i4) * (-20469)) ^ 1229070346;
                        i2 = -254598089;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 250256592:
                case 551212013:
                    c18651.f60655 = str;
                    RunnableC0334.m2054(this.f69078, c18651);
                    return c18651;
                case 261592144:
                case 1763045321:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("᩶᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 519) ^ (-94755222);
                        i2 = 1396084319;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۟") ^ i4) * 49;
                        i = ((iM3169 ^ i3) * 7591) ^ 1209736201;
                        i2 = 2030257353;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 271957107:
                case 1998764380:
                    int i14 = i8 + i9;
                    if ((i14 + i14) - i7 >= 0) {
                        iM3169 = C0619.m2761("֫ۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-23281)) ^ (-1709901419);
                        i2 = 1910465168;
                    } else {
                        iM3169 = C0619.m2761("֫ܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-1269)) ^ (-1832313378);
                        i2 = 1067084530;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 374537196:
                case 1343306497:
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("᩶᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 519) ^ (-94755222);
                        i2 = 1396084319;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    iM3169 = C0773.m3169("ܿܰ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6281)) ^ (-1695425107);
                    i2 = -205125568;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 1;
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("᩶ۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 29793) ^ 582846375;
                        i2 = 1070176758;
                    } else {
                        iM3169 = (C0773.m3169("ۙۜ") ^ i3) * 83;
                        i = ((iM3169 ^ i4) * 11055) ^ (-2026992731);
                        i2 = 878539042;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List defaultValue(String str) {
        this.f69079 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List summary(CharSequence charSequence) {
        this.f48740 = charSequence;
        return this;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final void mo3118(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        Iterator itM13647 = null;
        C18651 c18651 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i = 1361090787;
        int i2 = C2834.f9334;
        int i3 = C1783.f6087;
        int iM3169 = (C0773.m3169("ܿ۠") + i3) * (-111);
        int i4 = ((iM3169 ^ i2) * 10121) ^ (-2069754547);
        int i5 = -1262434171;
        while (true) {
            i = ((((i ^ i2) * 6023) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2127784434:
                case -2104534302:
                    if (C2485.f7950 == 0) {
                        iM3169 = (C0619.m2761("֨ۚ") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-27059)) ^ 873279789;
                        i5 = -369915329;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩵") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * 20299) ^ (-2025038269);
                        i5 = -923014783;
                    }
                    break;
                case -2086694788:
                case -1576893740:
                    c18651.f60653 = C17159.m40331(localString, (String) charSequence4);
                    iM3169 = (C0619.m2761("ۙܺ") ^ i2) * 5;
                    i4 = ((iM3169 ^ i3) * (-32531)) ^ (-1382611482);
                    i5 = -690164882;
                    break;
                case -1952001480:
                case 316570440:
                    c18651 = (C18651) C4238.m13529(itM13647);
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i2 - C0619.m2761("᩹ۡ")) * 73;
                        i4 = ((iM3169 ^ i3) * (-23749)) ^ (-184137498);
                        i5 = 429360234;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩷ۨ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i2) * (-11491)) ^ 1070704276;
                        i5 = -1502228116;
                    }
                    break;
                case -1648507458:
                case 1776501240:
                    C1826.m6301();
                    C2287.m7745();
                    break;
                case -1594504800:
                case 1753662218:
                    this.f48739 = C17159.m40331(localString, (String) charSequence);
                    iM3169 = (C0773.m3169("᩵᩶") ^ i2) * 97;
                    i4 = ((iM3169 ^ i3) * (-26111)) ^ 679824952;
                    i5 = 1842148315;
                    break;
                case -1591375609:
                case -477738513:
                    if (C3998.m12920()) {
                        iM3169 = C0619.m2761("ۨۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31353) ^ (-119237617);
                        i5 = -1683163740;
                    } else {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2071) ^ (-199077920);
                        i5 = -1827844865;
                    }
                    break;
                case -1536703913:
                case -1261512893:
                    charSequence4 = c18651.f60653;
                    if (charSequence4 instanceof String) {
                        iM3169 = C0619.m2761("ۜۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29275) ^ (-2126502798);
                        i5 = -313791348;
                    } else {
                        iM3169 = (C0619.m2761("ۙܺ") ^ i2) * 5;
                        i4 = ((iM3169 ^ i3) * (-32531)) ^ (-1382611482);
                        i5 = -690164882;
                    }
                    break;
                case -1527085070:
                case -203679725:
                    if (C11235.m28309() == 0) {
                        iM3169 = (C0773.m3169("ۤ᩵") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * 20299) ^ (-2025038269);
                        i5 = -923014783;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۡ᩷")) * 75;
                        i4 = ((iM3169 ^ i3) * (-79)) ^ 2032522687;
                        i5 = -95695563;
                    }
                    break;
                case -1367871964:
                case 1533557200:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2071) ^ (-199077920);
                        i5 = -1827844865;
                    } else {
                        iM3169 = C0619.m2761("᩷ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17831) ^ 1211344832;
                        i5 = 784592965;
                    }
                    break;
                case -1322833590:
                case 153053486:
                    charSequence = this.f48739;
                    if (charSequence instanceof String) {
                        iM3169 = (i3 - C0773.m3169("᩺ۜ")) * (-103);
                        i4 = ((iM3169 ^ i2) * (-10243)) ^ 243771646;
                        i5 = 1320197950;
                    } else {
                        iM3169 = (C0773.m3169("᩵᩶") ^ i2) * 97;
                        i4 = ((iM3169 ^ i3) * (-26111)) ^ 679824952;
                        i5 = 1842148315;
                    }
                    break;
                case -1072053077:
                case -380358916:
                    C1080.m4050();
                    C3998.m12920();
                    iM3169 = (C0773.m3169("ۤ᩵") ^ i3) * (-23);
                    i4 = ((iM3169 ^ i2) * 20299) ^ (-2025038269);
                    i5 = -923014783;
                    break;
                case -778551134:
                case 50836875:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("֨ۚ") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-27059)) ^ 873279789;
                        i5 = -369915329;
                    } else {
                        iM3169 = (C0773.m3169("֡ۜ") ^ i2) * 101;
                        i4 = ((iM3169 ^ i3) * 5375) ^ (-663155116);
                        i5 = -1331394655;
                    }
                    break;
                case -777030234:
                case -460105920:
                    break;
                case -599276853:
                case 1572958021:
                    if (C23916.f77426 > 0) {
                        iM3169 = (i2 - C0619.m2761("᩹ۡ")) * 73;
                        i4 = ((iM3169 ^ i3) * (-23749)) ^ (-184137498);
                        i5 = 429360234;
                    } else {
                        iM3169 = (C0619.m2761("֨ۚ") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-27059)) ^ 873279789;
                        i5 = -369915329;
                    }
                    break;
                case -595986500:
                case 432031673:
                    charSequence3 = c18651.f60654;
                    if (charSequence3 instanceof String) {
                        iM3169 = (C0619.m2761("ܰۢ") + i3) * 41;
                        i4 = ((iM3169 ^ i2) * 1875) ^ 839777858;
                        i5 = -1464480716;
                    } else {
                        iM3169 = C0619.m2761("ܿܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30307)) ^ 911822974;
                        i5 = -75004601;
                    }
                    break;
                case -574701607:
                case -229376458:
                    this.f48740 = C17159.m40331(localString, (String) charSequence2);
                    iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                    i4 = ((iM3169 ^ i3) * 3585) ^ 42576200;
                    i5 = 1912827189;
                    break;
                case -526203466:
                case 1245449692:
                    c18651.f60654 = C17159.m40331(localString, (String) charSequence3);
                    iM3169 = C0619.m2761("ܿܳ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-30307)) ^ 911822974;
                    i5 = -75004601;
                    break;
                case -498035317:
                case 1028268775:
                    itM13647 = C4282.m13647(this.f69078);
                    iM3169 = (C0619.m2761("ۙܺ") ^ i2) * 5;
                    i4 = ((iM3169 ^ i3) * (-32531)) ^ (-1382611482);
                    i5 = -690164882;
                    break;
                case -421403891:
                case 1693754097:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2071) ^ (-199077920);
                        i5 = -1827844865;
                    } else {
                        iM3169 = C0619.m2761("ۨܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5307) ^ 2119524312;
                        i5 = 1126948234;
                    }
                    break;
                case -302262076:
                case 2026329364:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2071) ^ (-199077920);
                        i5 = -1827844865;
                    } else {
                        iM3169 = C0619.m2761("᩹᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18373) ^ 396337482;
                        i5 = -1447989499;
                    }
                    break;
                case -144068234:
                case 1237641981:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2071) ^ (-199077920);
                        i5 = -1827844865;
                    } else {
                        iM3169 = (C0619.m2761("֫ۜ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-2421)) ^ (-740607339);
                        i5 = 1731609957;
                    }
                    break;
                case 155397827:
                case 1097777489:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("᩹ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2071) ^ (-199077920);
                        i5 = -1827844865;
                    } else {
                        iM3169 = (C0773.m3169("ۗ۠") + i2) * 43;
                        i4 = ((iM3169 ^ i3) * (-6825)) ^ 172858627;
                        i5 = 692132359;
                    }
                    break;
                case 208853178:
                case 1521732859:
                    if (C3998.m12923(itM13647)) {
                        iM3169 = C0619.m2761("֡ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25627)) ^ (-135457691);
                        i5 = -990915905;
                    } else {
                        iM3169 = C0619.m2761("ܺᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8445)) ^ (-608626949);
                        i5 = -1364736817;
                    }
                    break;
                case 334011445:
                case 1788445191:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩵") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * 20299) ^ (-2025038269);
                        i5 = -923014783;
                    } else {
                        iM3169 = C0773.m3169("ܿۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30341)) ^ 616443558;
                        i5 = 237474811;
                    }
                    break;
                case 1722136074:
                case 1877301781:
                    charSequence2 = this.f48740;
                    if (charSequence2 instanceof String) {
                        iM3169 = (i3 - C0773.m3169("᩷ܳ")) * (-17);
                        i4 = ((iM3169 ^ i2) * (-12891)) ^ 1789068545;
                        i5 = -521661904;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3585) ^ 42576200;
                        i5 = 1912827189;
                    }
                    break;
                default:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0619.m2761("֨ۚ") ^ i3) * 59;
                        i4 = ((iM3169 ^ i2) * (-27059)) ^ 873279789;
                        i5 = -369915329;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۛ᩸")) * 89;
                        i4 = ((iM3169 ^ i2) * (-28449)) ^ 1738321325;
                        i5 = -670212956;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f48742 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List visible(boolean z) {
        this.f48738 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List
    public final PluginPreference.List enable(boolean z) {
        this.f48736 = z;
        return this;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4481 mo3117() {
        return EnumC4481.f16022;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final void mo3119(bin.mt.plugin.api.PluginContext r30) {
        /*
            Method dump skipped, instruction units count: 2044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21635.mo3119(bin.mt.plugin.api.PluginContext):void");
    }
}
