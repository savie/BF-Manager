package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.᩶᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes.dex */
public final class C21664 {

    /* JADX INFO: renamed from: ܳܺۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f69136;

    static {
        ApplicationC23172.m52091(156);
        f69136 = new short[]{930, -28526, -28541, -28543, -28535, -28541, -28539, -28537, -28467, -28526, -28541, -28543, -28535, -28541, -28539, -28537, -28465, -28533, -28532, -28540, -28531, -28462, -28518, -28533, -28538, -28532, -28541, -28529, -28537, -28543, -28531, -28532, -28540, -28533, -28539, -28498, -28541, -28517, -28531, -28521, -28522, -28526, -28528, -28537, -28540, -28533, -28518, -28530, -28533, -28544, -28528, -28541, -28528, -28517, -28531, -28524, -28537, -28528, -28530, -28541, -28517, -28537, -28532, -28522, -28528, -28517, -28541, -28543, -28522, -28531, -28528, -28527, -28522, -28541, -28539, -28537, -28538, -28509, -28530, -28533, -28541, -28527, -28541, -28522, -28522, -28528, -28527, -28522, -28541, -28539, -28537, -28538, -28496, -28537, -28527, -28501, -28538, -28540, -28533, -28532, -28541, -28530, -28533, -28520, -28537, -28538, -28496, -28537, -28527, -28501, -28538, -28526, -28531, -28530, -28533, -28543, -28517, -28540, -28530, -28541, -28539, -28527, -28484, -28541, -28522, -28522, -28528, -28465, -28526, -28528, -28533, -28524, -28541, -28522, -28537, -28487, -28482, -28523, -28482, -28465, -28484, -28481, -28471, -28522, -28517, -28526, -28537, -28473, -28462, -28464, -28486, -28522, -28517, -28526, -28537, -28465, -28533, -28532, -28540, -28531, -28522, -28517, -28526, -28537, -28528, -28537, -28541, -28530, -28500, -28541, -28529, -28537, -28522, -28528, -28521, -28537, -28538, -28537, -28540, -28541, -28521, -28530, -28522, -28494, -28521, -28544, -28530, -28533, -28543, -28538, -28537, -28540, -28541, -28521, -28530, -28522, -28491, -28537, -28541, -28535, -28538, -28537, -28540, -28541, -28521, -28530, -28522, -28511, -28531, -28529, -28526, -28541, -28543, -28522, -28487, -28451, -28510, -28481, -28483, -28526, -28528, -28533, -28465, -28527, -28522, -28541, -28539, -28537, -28538, -28509, -28526, -28533, -28537, -28518, -28522, -28528, -28541, -28490, -28517, -28526, -28537, -28495, -28526, -28537, -28543, -28508, -28530, -28541, -28539, -28527, 7588, 541, 526, 527, 543, 516, 529, 528, 543, 531, 530, 538, 533, 539, 536, 541, 520, 541, 530, 541, 529, 537, 520, 529, 524, 568, 533, 526, 516, 529, 528, 527, 568, 541, 520, 541, 516, 529, 528, 527, 524, 535, 539, 527, 531, 526, 520, 526, 537, 527, 531, 521, 526, 543, 537, 527, 3578, 15227, 15208, 15209, 15225, 15157, 15214, 15223, 15210, 15198, 15219, 15208, 15227, 15208, 15209, 15225};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native List m49202(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m49201(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) throws Throwable {
        boolean z = false;
        List listM49202 = null;
        Throwable th = null;
        int i = -1455201692;
        int i2 = C3779.f12953;
        int i3 = C3690.f12684;
        int iM2761 = (C0619.m2761("ۤۨ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i4 = ((iM2761 ^ i3) * 30265) ^ (-142418448);
        int i5 = -2068830639;
        while (true) {
            i = ((((i ^ i3) * 11731) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2048575134:
                case -400416678:
                    try {
                        listM49202 = m49202(abstractC22044, abstractC22045, z);
                        iM2761 = (C0619.m2761("ۨۡ") ^ i2) * 5;
                        i4 = ((iM2761 ^ i3) * 7073) ^ (-1884704441);
                        i5 = -35054205;
                    } catch (Throwable th2) {
                        th = th2;
                        iM2761 = (C0619.m2761("ᩳۘ") ^ i3) * (-57);
                        i4 = ((iM2761 ^ i2) * 13893) ^ (-1016167115);
                        i5 = 1996494236;
                    }
                    break;
                case -2042508570:
                case 1095126853:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ܳۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29257) ^ (-1445988619);
                        i5 = -504239776;
                    } else {
                        iM2761 = C0773.m3169("ܺۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15003) ^ (-1571350132);
                        i5 = 954448427;
                    }
                    break;
                case -1977871235:
                case -706178439:
                    C2878.m9491();
                    return null;
                case -1955303969:
                case 1068063331:
                    C2008.m6852();
                    throw th;
                case -1743213992:
                case 1110143165:
                    if (C3033.m9845() > 0) {
                        iM2761 = C0773.m3169("֡֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27711)) ^ 1010761326;
                        i5 = 395440556;
                    } else {
                        iM2761 = C0619.m2761("ۗۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7885)) ^ (-1039099219);
                        i5 = -59764310;
                    }
                    break;
                case -1653569560:
                case -258998959:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ܺۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15003) ^ (-1571350132);
                        i5 = 954448427;
                    } else {
                        iM2761 = C0619.m2761("֡ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18909) ^ (-1314222883);
                        i5 = -1653105573;
                    }
                    break;
                case -1563703121:
                case 1505529772:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("֡֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27711)) ^ 1010761326;
                        i5 = 395440556;
                    } else {
                        iM2761 = C0773.m3169("᩺ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22225)) ^ (-1858877291);
                        i5 = 634340302;
                    }
                    break;
                case -1551603624:
                case -25802940:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("֡֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27711)) ^ 1010761326;
                        i5 = 395440556;
                    } else {
                        iM2761 = C0619.m2761("ܰۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1593) ^ 810495924;
                        i5 = -672385467;
                    }
                    break;
                case -1411417696:
                case 1165218660:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0619.m2761("ᩳ᩵") + i3) * (-45);
                        i4 = ((iM2761 ^ i2) * (-13605)) ^ 57820236;
                        i5 = -1215026391;
                    } else {
                        iM2761 = (C0773.m3169("ۢ֡") + i2) * (-85);
                        i4 = ((iM2761 ^ i3) * 13655) ^ (-568320923);
                        i5 = 213482019;
                    }
                    break;
                case -1279207221:
                case -553497085:
                    z = true;
                    iM2761 = C0773.m3169("ۗ۬") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-11161)) ^ (-1960815955);
                    i5 = -1156144393;
                    break;
                case -622802956:
                case 694289638:
                    C1783.m6232();
                    C2966.m9664();
                    iM2761 = C0619.m2761("ۗۜ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-7885)) ^ (-1039099219);
                    i5 = -59764310;
                    break;
                case -25916725:
                case 1891940481:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ܺۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15003) ^ (-1571350132);
                        i5 = 954448427;
                    } else {
                        iM2761 = (C0619.m2761("֨ܿ") ^ i2) * 83;
                        i4 = ((iM2761 ^ i3) * 29581) ^ 396370708;
                        i5 = -86737963;
                    }
                    break;
                case 206840159:
                case 2055232501:
                    if (C2966.m9664()) {
                        iM2761 = (C0619.m2761("۠۠") ^ i2) * 69;
                        i4 = ((iM2761 ^ i3) * 9463) ^ 1269290894;
                        i5 = 500316036;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20243) ^ (-571841831);
                        i5 = -1317009044;
                    }
                    break;
                case 293275074:
                case 354564797:
                    C0950.m3785();
                    if (C0950.m3785() == 0) {
                        iM2761 = (C0619.m2761("ᩳ᩵") + i3) * (-45);
                        i4 = ((iM2761 ^ i2) * (-13605)) ^ 57820236;
                        i5 = -1215026391;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20243) ^ (-571841831);
                        i5 = -1317009044;
                    }
                    break;
                case 482924932:
                case 840138888:
                    C2008.m6852();
                    return listM49202;
                case 734646282:
                case 798785574:
                    if (C3779.m12264()) {
                        iM2761 = (i3 - C0619.m2761("۟ۤ")) * 109;
                        i4 = ((iM2761 ^ i2) * (-1915)) ^ (-1944412087);
                        i5 = -2008619461;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ᩵") + i3) * (-45);
                        i4 = ((iM2761 ^ i2) * (-13605)) ^ 57820236;
                        i5 = -1215026391;
                    }
                    break;
                case 1016647748:
                case 1458478656:
                    if (C1080.m4050()) {
                        iM2761 = (i3 - C0773.m3169("ܺܽ")) * (-65);
                        i4 = ((iM2761 ^ i2) * 13633) ^ 1584168812;
                        i5 = -1727555253;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20243) ^ (-571841831);
                        i5 = -1317009044;
                    }
                    break;
                case 1284233075:
                case 1497141711:
                    C3998.m12920();
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20243) ^ (-571841831);
                        i5 = -1317009044;
                    } else {
                        iM2761 = C0619.m2761("ۗۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7885)) ^ (-1039099219);
                        i5 = -59764310;
                    }
                    break;
                default:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("֡֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27711)) ^ 1010761326;
                        i5 = 395440556;
                    } else {
                        iM2761 = C0619.m2761("ۘۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7827)) ^ 390888681;
                        i5 = -1674030389;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03bb A[PHI: r7 r13 r18 r20 r21
      0x03bb: PHI (r7v5 char) = (r7v2 char), (r7v1 char), (r7v1 char) binds: [B:114:0x03b9, B:98:0x02f9, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r13v5 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:114:0x03b9, B:98:0x02f9, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r18v39 int) = (r18v20 int), (r18v25 int), (r18v40 int) binds: [B:114:0x03b9, B:98:0x02f9, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r20v34 java.io.IOException) = (r20v16 java.io.IOException), (r20v21 java.io.IOException), (r3v1 java.io.IOException) binds: [B:114:0x03b9, B:98:0x02f9, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r21v29 boolean) = (r21v10 boolean), (r21v15 boolean), (r2v1 boolean) binds: [B:114:0x03b9, B:98:0x02f9, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0484 A[PHI: r11 r12 r18 r20 r21
      0x0484: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:21:0x00ac, B:130:0x0482, B:102:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r12v2 short) = (r12v1 short), (r12v1 short), (r12v3 short) binds: [B:21:0x00ac, B:130:0x0482, B:102:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r18v23 int) = (r18v12 int), (r18v14 int), (r18v24 int) binds: [B:21:0x00ac, B:130:0x0482, B:102:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r20v19 java.io.IOException) = (r20v8 java.io.IOException), (r20v10 java.io.IOException), (r20v20 java.io.IOException) binds: [B:21:0x00ac, B:130:0x0482, B:102:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r21v13 boolean) = (r21v2 boolean), (r21v4 boolean), (r21v14 boolean) binds: [B:21:0x00ac, B:130:0x0482, B:102:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x04ba A[PHI: r18 r20 r21
      0x04ba: PHI (r18v35 int) = (r18v13 int), (r18v15 int), (r18v42 int) binds: [B:134:0x04b8, B:126:0x0461, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r20v32 java.io.IOException) = (r20v9 java.io.IOException), (r20v11 java.io.IOException), (r20v37 java.io.IOException) binds: [B:134:0x04b8, B:126:0x0461, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r21v26 boolean) = (r21v3 boolean), (r21v5 boolean), (r21v32 boolean) binds: [B:134:0x04b8, B:126:0x0461, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49203(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int i5;
        IOException iOException;
        int iM2762;
        int i6;
        int i7;
        boolean z = false;
        IOException iOException2 = null;
        Throwable th = null;
        boolean z2 = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 966315751;
        int i13 = C3492.f12043;
        int i14 = C0773.f2792;
        int iM2763 = (i14 - C0619.m2761("᩸ۡ")) * (-61);
        int i15 = ((iM2763 ^ i13) * (-7817)) ^ (-404804686);
        int i16 = iM2763 ^ (-737226389);
        boolean zM12930 = false;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i13) * 213) >> 31));
            switch (i17) {
                case -2089037493:
                case 2019180303:
                    i17 = i17;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩵") ^ i13;
                        i = ((iM3169 ^ i14) * (-27945)) ^ (-207853457);
                        i2 = 1925129470;
                        i5 = iM3169 ^ i2;
                        int i18 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i18;
                    } else {
                        z = z;
                        iOException2 = iOException2;
                        iM2761 = C0619.m2761("ܰ֨") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-3753)) ^ (-1287821006);
                        i4 = -664925168;
                        int i19 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i19;
                        i15 = i3;
                        z = z;
                    }
                    break;
                case -1926260583:
                case -1084350949:
                    i17 = i17;
                    try {
                        z2 = iOException2 instanceof IOException;
                        iM3169 = (i14 - C0619.m2761("ۖ᩺")) * (-117);
                        i = ((iM3169 ^ i13) * (-5261)) ^ (-120938318);
                        i2 = -1955143556;
                        i5 = iM3169 ^ i2;
                        int i110 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i110;
                    } catch (Throwable th2) {
                        th = th2;
                        iOException = iOException2;
                        iM2762 = (C0773.m3169("ܶܺ") + i14) * (-83);
                        i6 = ((iM2762 ^ i13) * (-2787)) ^ (-984839191);
                        i7 = -546098612;
                        int i20 = iM2762 ^ i7;
                        i12 = i17;
                        i16 = i20;
                        i15 = i6;
                        iOException2 = iOException;
                    }
                    break;
                case -1921779980:
                case 2060477595:
                    i17 = i17;
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0619.m2761("ۨۙ") ^ i14;
                        i3 = ((iM2761 ^ i13) * 23783) ^ (-997549291);
                        i4 = -612691364;
                        int i111 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i111;
                        i15 = i3;
                        z = z;
                    }
                    z = z;
                    iOException2 = iOException2;
                    iM2761 = C0773.m3169("ۘۚ") ^ i14;
                    i3 = ((iM2761 ^ i13) * (-3015)) ^ (-526454860);
                    i4 = 1834906188;
                    int i112 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i112;
                    i15 = i3;
                    z = z;
                    break;
                case -1912643177:
                case 476821792:
                    C17202.m40372();
                    C20932.m47848();
                    return;
                case -1750530250:
                case 1695332011:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ܺۢ") ^ i13;
                        i3 = ((iM2761 ^ i14) * 26763) ^ (-650945932);
                        i4 = 486882608;
                    } else {
                        iM2761 = (C0619.m2761("ܰۨ") ^ i14) * (-85);
                        i3 = ((iM2761 ^ i13) * 2649) ^ (-419914653);
                        i4 = 1256229723;
                    }
                    int i113 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i113;
                    i15 = i3;
                    z = z;
                    break;
                case -1691353957:
                case -523109327:
                    i11 = 52834;
                    iM2761 = C0773.m3169("ܽۧ") ^ i13;
                    i3 = ((iM2761 ^ i14) * 8643) ^ (-2133170124);
                    i4 = -1106785158;
                    int i114 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i114;
                    i15 = i3;
                    z = z;
                    break;
                case -1685408249:
                case -1409386210:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    i10 = s * s3;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("ۨۙ") ^ i14;
                        i3 = ((iM2761 ^ i13) * 23783) ^ (-997549291);
                        i4 = -612691364;
                    } else {
                        iM2761 = (C0773.m3169("ܿ᩹") + i13) * (-105);
                        i3 = ((iM2761 ^ i14) * (-29219)) ^ 618563259;
                        i4 = -2092325744;
                    }
                    int i115 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i115;
                    i15 = i3;
                    z = z;
                    break;
                case -1607878553:
                case 225328046:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    c = 306;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ۨۙ") ^ i14;
                        i3 = ((iM2761 ^ i13) * 23783) ^ (-997549291);
                        i4 = -612691364;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۨ") ^ i14) * (-101);
                        i3 = ((iM2761 ^ i13) * (-83)) ^ 1056914566;
                        i4 = 1689527615;
                    }
                    int i116 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i116;
                    i15 = i3;
                    z = z;
                    break;
                case -1586859338:
                case 159084081:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("ܽ۟") ^ i13) * 77;
                        i3 = ((iM2761 ^ i14) * (-21411)) ^ (-332131094);
                        i4 = 471244824;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩸") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-30113)) ^ 424831515;
                        i4 = -511466560;
                    }
                    int i117 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i117;
                    i15 = i3;
                    z = z;
                    break;
                case -1556043971:
                case -554721388:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    s = sArr[c];
                    s2 = 1;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ۘۚ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-3015)) ^ (-526454860);
                        i4 = 1834906188;
                    } else {
                        iM2761 = C0773.m3169("ܿ۟") ^ i14;
                        i3 = ((iM2761 ^ i13) * 16297) ^ (-1857573082);
                        i4 = -1127911652;
                    }
                    int i118 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i118;
                    i15 = i3;
                    z = z;
                    break;
                case -1444563452:
                case 875563974:
                    i17 = i17;
                    if (C4238.f15451 >= 0) {
                        z = z;
                        iOException2 = iOException2;
                        iM2761 = C0619.m2761("ܰ֨") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-3753)) ^ (-1287821006);
                        i4 = -664925168;
                        int i119 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i119;
                        i15 = i3;
                        z = z;
                    } else {
                        iM3169 = C0773.m3169("ۙۖ") ^ i14;
                        i = ((iM3169 ^ i13) * 12755) ^ (-1400399440);
                        i2 = -10370525;
                        i5 = iM3169 ^ i2;
                        int i1110 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i1110;
                    }
                    break;
                case -1417795604:
                case 153566693:
                    C2008.m6852();
                    throw th;
                case -1407440773:
                case 1686338820:
                    i17 = i17;
                    C3734.m12147(abstractC22045);
                    iOException = iOException2;
                    iM2762 = C0619.m2761("֨֫") ^ i13;
                    i6 = ((iM2762 ^ i14) * 11241) ^ 535573145;
                    i7 = -1398261807;
                    int i21 = iM2762 ^ i7;
                    i12 = i17;
                    i16 = i21;
                    i15 = i6;
                    iOException2 = iOException;
                    break;
                case -1376667655:
                case -1215754957:
                    i17 = i17;
                    zM12930 = C3998.m12930(abstractC22045);
                    z = false;
                    int iM31610 = (i14 - C0773.m3169("᩸ۤ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM31610 ^ i13) * (-23799)) ^ (-72967972);
                    i5 = iM31610 ^ 1143179362;
                    iOException2 = iOException2;
                    int i1111 = i17;
                    i16 = i5;
                    i15 = i;
                    i12 = i1111;
                    break;
                case -1319079436:
                case -194181876:
                    iOException = iOException2;
                    i17 = i17;
                    if (zM12930) {
                        iM2762 = (i13 - C0619.m2761("ۡ۠")) * (-111);
                        i6 = ((iM2762 ^ i14) * 30691) ^ 1212567362;
                        i7 = 1454127572;
                    } else {
                        iM2762 = (i14 - C0619.m2761("ۡᩴ")) * 123;
                        i6 = ((iM2762 ^ i13) * (-24153)) ^ (-1416910398);
                        i7 = 1966322486;
                    }
                    int i22 = iM2762 ^ i7;
                    i12 = i17;
                    i16 = i22;
                    i15 = i6;
                    iOException2 = iOException;
                    break;
                case -1182600717:
                case -832835531:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    i8 = s + s2;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܰۙ") ^ i14;
                        i3 = ((iM2761 ^ i13) * 12983) ^ (-814226650);
                        i4 = -1817006821;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩻") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-31275)) ^ 581361906;
                        i4 = -1018287048;
                    }
                    int i1112 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i1112;
                    i15 = i3;
                    z = z;
                    break;
                case -1145744896:
                case 1983327649:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("۟ۛ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-10301)) ^ 2005983835;
                        i4 = -1223295;
                    } else {
                        iM2761 = (i13 - C0619.m2761("ۡۛ")) * (-97);
                        i3 = ((iM2761 ^ i14) * (-6595)) ^ 29034719;
                        i4 = 1366537851;
                    }
                    int i1113 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i1113;
                    i15 = i3;
                    z = z;
                    break;
                case -878152543:
                case 2059648443:
                    i17 = i17;
                    if (C0862.f3233 != 0) {
                        z = z;
                        iOException2 = iOException2;
                        iM2761 = C0773.m3169("ۘۚ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-3015)) ^ (-526454860);
                        i4 = 1834906188;
                        int i1114 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i1114;
                        i15 = i3;
                        z = z;
                    } else {
                        iM3169 = C0773.m3169("ۙۖ") ^ i14;
                        i = ((iM3169 ^ i13) * 12755) ^ (-1400399440);
                        i2 = -10370525;
                        i5 = iM3169 ^ i2;
                        int i1115 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i1115;
                    }
                    break;
                case -793223532:
                case -56536753:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    i9 = i8 * i8;
                    s3 = 2;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("۟ۛ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-10301)) ^ 2005983835;
                        i4 = -1223295;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ᩵") + i14) * (-35);
                        i3 = ((iM2761 ^ i13) * 30401) ^ 594365743;
                        i4 = -132140959;
                    }
                    int i1116 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i1116;
                    i15 = i3;
                    z = z;
                    break;
                case -688482282:
                case 602211820:
                    throw iOException2;
                case -619590066:
                case -227159841:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    sArr = f69136;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ܰ֨") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-3753)) ^ (-1287821006);
                        i4 = -664925168;
                    } else {
                        iM2761 = C0619.m2761("ۚ֡") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-20063)) ^ (-1173686770);
                        i4 = 513310048;
                    }
                    int i1117 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i1117;
                    i15 = i3;
                    z = z;
                    break;
                case -538354798:
                case -517197797:
                    C2485.m8357();
                    if (C4282.m13644()) {
                        z = z;
                        iOException2 = iOException2;
                        i17 = i17;
                        iM2761 = C0619.m2761("ܺۢ") ^ i13;
                        i3 = ((iM2761 ^ i14) * 26763) ^ (-650945932);
                        i4 = 486882608;
                        int i1118 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i1118;
                        i15 = i3;
                        z = z;
                    }
                    i17 = i17;
                    iM2761 = C0619.m2761("ۨۙ") ^ i14;
                    i3 = ((iM2761 ^ i13) * 23783) ^ (-997549291);
                    i4 = -612691364;
                    int i1119 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i1119;
                    i15 = i3;
                    z = z;
                    break;
                case -467330077:
                case 378088971:
                    i17 = i17;
                    if (z2) {
                        iM3169 = C0619.m2761("ܶܿ") ^ i13;
                        i = ((iM3169 ^ i14) * (-14319)) ^ 1111533763;
                        i2 = 806584300;
                    } else {
                        iM3169 = (C0619.m2761("۠۬") ^ i13) * 3;
                        i = ((iM3169 ^ i14) * (-8471)) ^ 1610222388;
                        i2 = 1574640832;
                    }
                    i5 = iM3169 ^ i2;
                    int i11110 = i17;
                    i16 = i5;
                    i15 = i;
                    i12 = i11110;
                    break;
                case -443856745:
                case 1870428599:
                    iOException2 = iOException2;
                    i17 = i17;
                    try {
                        m49202(abstractC22044, abstractC22045, z);
                        z = z;
                        try {
                            C3734.m12147(C2310.m7806(abstractC22045, C2878.m9486(f69136, 307, 11, i11)));
                            iM2761 = C0619.m2761("ܺ᩵") ^ i13;
                            i3 = ((iM2761 ^ i14) * 31927) ^ 955155997;
                            i4 = 310375881;
                            int i11111 = iM2761 ^ i4;
                            i12 = i17;
                            iOException2 = iOException2;
                            i16 = i11111;
                            i15 = i3;
                        } catch (Throwable th3) {
                            th = th3;
                            int iM2764 = (i14 - C0619.m2761("ۜܳ")) * 3;
                            iOException2 = th;
                            i15 = ((iM2764 ^ i13) * (-23595)) ^ (-1403930349);
                            i12 = i17;
                            i16 = iM2764 ^ (-1548364934);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = z;
                    }
                    z = z;
                    break;
                case -213876035:
                case 250824465:
                    C3077.m10041();
                    if (C4238.m13540() > 0) {
                        iM3169 = (i14 - C0773.m3169("֡ۧ")) * 127;
                        i17 = i17;
                        i = ((iM3169 ^ i13) * (-14547)) ^ (-573202784);
                        i2 = -1541807822;
                        i5 = iM3169 ^ i2;
                        int i11112 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i11112;
                    } else {
                        i17 = i17;
                        iM2761 = C0619.m2761("ۨۙ") ^ i14;
                        i3 = ((iM2761 ^ i13) * 23783) ^ (-997549291);
                        i4 = -612691364;
                        int i11113 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i11113;
                        i15 = i3;
                        z = z;
                    }
                    break;
                case -16921262:
                case 1278941045:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    if (i9 - (i10 + 1) < 0) {
                        iM2761 = C0619.m2761("ۙܶ") ^ i14;
                        i3 = ((iM2761 ^ i13) * 19889) ^ (-806265689);
                        i4 = -374251697;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ۟") + i13) * 19;
                        i3 = ((iM2761 ^ i14) * 16513) ^ (-341046708);
                        i4 = 413012740;
                    }
                    int i11114 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i11114;
                    i15 = i3;
                    z = z;
                    break;
                case 25793403:
                case 694520875:
                    C2008.m6852();
                    return;
                case 249384862:
                case 2004793493:
                    i17 = i17;
                    try {
                        iOException = iOException2;
                        try {
                            C17202.m40378(C2310.m7806(abstractC22045, C3099.m10092(f69136, 318, 4, i11)));
                            iM2762 = C0619.m2761("֨֫") ^ i13;
                            i6 = ((iM2762 ^ i14) * 11241) ^ 535573145;
                            i7 = -1398261807;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            iM2762 = (C0773.m3169("ܶܺ") + i14) * (-83);
                            i6 = ((iM2762 ^ i13) * (-2787)) ^ (-984839191);
                            i7 = -546098612;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        iOException = iOException2;
                    }
                    int i23 = iM2762 ^ i7;
                    i12 = i17;
                    i16 = i23;
                    i15 = i6;
                    iOException2 = iOException;
                    break;
                case 476389683:
                case 490047703:
                    i17 = i17;
                    C2288.m7767();
                    C2878.m9491();
                    iM3169 = C0773.m3169("ۙۖ") ^ i14;
                    i = ((iM3169 ^ i13) * 12755) ^ (-1400399440);
                    i2 = -10370525;
                    i5 = iM3169 ^ i2;
                    int i11115 = i17;
                    i16 = i5;
                    i15 = i;
                    i12 = i11115;
                    break;
                case 532730343:
                case 845396609:
                    i17 = i17;
                    C3998.m12920();
                    if (C2419.m8174() < 0) {
                        z = z;
                        iOException2 = iOException2;
                        iM2761 = (C0619.m2761("ܽ۟") ^ i13) * 77;
                        i3 = ((iM2761 ^ i14) * (-21411)) ^ (-332131094);
                        i4 = 471244824;
                        int i11116 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i11116;
                        i15 = i3;
                        z = z;
                    } else {
                        iM3169 = C0773.m3169("ۙۖ") ^ i14;
                        i = ((iM3169 ^ i13) * 12755) ^ (-1400399440);
                        i2 = -10370525;
                        i5 = iM3169 ^ i2;
                        int i11117 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i11117;
                    }
                    break;
                case 754386349:
                case 1049775050:
                    z = z;
                    iOException2 = iOException2;
                    i17 = i17;
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ܺۢ") ^ i13;
                        i3 = ((iM2761 ^ i14) * 26763) ^ (-650945932);
                        i4 = 486882608;
                    } else {
                        iM2761 = C0619.m2761("ᩳۧ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-13475)) ^ (-1492795421);
                        i4 = -738774837;
                    }
                    int i11118 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i11118;
                    i15 = i3;
                    z = z;
                    break;
                case 1662325080:
                case 2049519201:
                    i11 = 15130;
                    iM2761 = C0773.m3169("ܽۧ") ^ i13;
                    i3 = ((iM2761 ^ i14) * 8643) ^ (-2133170124);
                    i4 = -1106785158;
                    int i11119 = iM2761 ^ i4;
                    i12 = i17;
                    iOException2 = iOException2;
                    i16 = i11119;
                    i15 = i3;
                    z = z;
                    break;
                case 1715068559:
                case 1752193773:
                    throw new IOException(iOException2);
                default:
                    i17 = i17;
                    C0950.m3785();
                    if (C3690.f12684 <= 0) {
                        z = z;
                        iOException2 = iOException2;
                        iM2761 = C0619.m2761("۟ۛ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-10301)) ^ 2005983835;
                        i4 = -1223295;
                        int i111110 = iM2761 ^ i4;
                        i12 = i17;
                        iOException2 = iOException2;
                        i16 = i111110;
                        i15 = i3;
                        z = z;
                    } else {
                        iM3169 = C0773.m3169("ۙۖ") ^ i14;
                        i = ((iM3169 ^ i13) * 12755) ^ (-1400399440);
                        i2 = -10370525;
                        i5 = iM3169 ^ i2;
                        int i111111 = i17;
                        i16 = i5;
                        i15 = i;
                        i12 = i111111;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49199(int i, int i2, String str) {
        int iM2761;
        int i3;
        String hexString = null;
        int iM9671 = 0;
        int i4 = 0;
        int i5 = -2083598208;
        int i6 = AbstractC0116.f1064;
        int i7 = C2310.f7472;
        int iM3169 = C0773.m3169("᩵ۗ") ^ i6;
        int i8 = ((iM3169 ^ i7) * (-21889)) ^ (-2060168795);
        int i9 = 1338847642;
        while (true) {
            int i10 = iM3169 ^ i9;
            StringBuilder sb = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 4333) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2123851451:
                    case -131593500:
                        if (C20932.f66974 > 0) {
                            iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                            i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                            i3 = -1587671261;
                        } else {
                            iM2761 = (C0773.m3169("۟᩻") ^ i6) * 35;
                            i8 = ((iM2761 ^ i7) * 27791) ^ (-460369062);
                            i3 = -1744713503;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -2062029930:
                    case -1248454172:
                        if (C0950.m3785() != 0) {
                            iM2761 = C0773.m3169("ۧᩳ") ^ i7;
                            i8 = ((iM2761 ^ i6) * (-32667)) ^ 387516259;
                            i3 = -233409561;
                        } else {
                            iM2761 = (C0619.m2761("۟ܺ") + i7) * 67;
                            i8 = ((iM2761 ^ i6) * 6913) ^ (-133236417);
                            i3 = -1794798185;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -1941601716:
                    case -1489521611:
                        C3779.m12258(sb, hexString);
                        return C2023.m6952(sb);
                    case -1935780448:
                    case 1840852521:
                        return C14483.m34972(str, hexString);
                    case -1874817348:
                    case 1763296493:
                        if (!C2023.f6737) {
                            iM2761 = (C0619.m2761("۬᩵") + i7) * 59;
                            i8 = ((iM2761 ^ i6) * (-3531)) ^ (-137635106);
                            i3 = 1070749994;
                            i10 = iM2761 ^ i3;
                        }
                        break;
                    case -1776420756:
                    case -1733421466:
                        if (C1080.f3865 >= 0) {
                            iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                            i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                            i3 = -1587671261;
                        } else {
                            iM2761 = C0619.m2761("᩺᩸") ^ i6;
                            i8 = ((iM2761 ^ i7) * (-17887)) ^ 1003807049;
                            i3 = -2130028268;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -1705568725:
                    case 2019002644:
                        if (!RunnableC3646.f12471) {
                            iM2761 = (C0773.m3169("᩹ܺ") + i6) * (-49);
                            i8 = ((iM2761 ^ i7) * 11467) ^ (-1489295969);
                            i3 = 1550531614;
                            i10 = iM2761 ^ i3;
                        }
                        break;
                    case -1464700696:
                    case 1498325497:
                        hexString = Integer.toHexString(i);
                        if (C2966.m9671(hexString) < i2) {
                            iM2761 = C0619.m2761("ۖۚ") ^ i6;
                            i8 = ((iM2761 ^ i7) * 20593) ^ 1420933244;
                            i3 = 1910680692;
                        } else {
                            iM2761 = C0773.m3169("᩺ۡ") ^ i7;
                            i8 = ((iM2761 ^ i6) * 18165) ^ (-654833757);
                            i3 = 1521444190;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -1308296735:
                    case 1979484940:
                        int iM9672 = C2966.m9671(str) + i2;
                        if (!C0619.f2439) {
                            sb = new StringBuilder(iM9672);
                            if (C3492.f12043 <= 0) {
                                iM2761 = C0619.m2761("ۙۛ") ^ i6;
                                i8 = ((iM2761 ^ i7) * (-16905)) ^ 61570380;
                                i3 = 377998159;
                            } else {
                                iM2761 = C0619.m2761("ۖ᩷") ^ i7;
                                i8 = ((iM2761 ^ i6) * 2231) ^ 991331321;
                                i3 = 1641941744;
                            }
                            i10 = iM2761 ^ i3;
                        }
                        break;
                    case -1209208888:
                    case 313772653:
                        iM9671 = i2 - C2966.m9671(hexString);
                        C1783.m6234(sb, str);
                        i4 = 0;
                        iM2761 = (i6 - C0619.m2761("ܳ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((iM2761 ^ i7) * (-2971)) ^ 1210043497;
                        i3 = -505042821;
                        i10 = iM2761 ^ i3;
                        break;
                    case -1064894194:
                    case 704676533:
                        if (C11235.f35427 >= 0) {
                            iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                            i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                            i3 = -1587671261;
                        } else {
                            iM2761 = (C0773.m3169("֡ܶ") ^ i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i8 = ((iM2761 ^ i6) * (-22905)) ^ 181014746;
                            i3 = 371355693;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -908896665:
                    case -634374953:
                        C2023.m6955(sb, '0');
                        i4++;
                        iM2761 = (i6 - C0619.m2761("ܳ᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((iM2761 ^ i7) * (-2971)) ^ 1210043497;
                        i3 = -505042821;
                        i10 = iM2761 ^ i3;
                        break;
                    case -618161220:
                    case 606374098:
                        if (C0773.f2792 > 0) {
                        }
                        iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                        i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                        i3 = -1587671261;
                        i10 = iM2761 ^ i3;
                        break;
                    case -375811529:
                    case 5404569:
                        if (i4 < iM9671) {
                            iM2761 = (i6 - C0619.m2761("ᩴۘ")) * 91;
                            i8 = ((iM2761 ^ i7) * (-16967)) ^ (-1922870151);
                            i3 = -1139993425;
                        } else {
                            iM2761 = (i7 - C0619.m2761("֡᩸")) * 29;
                            i8 = ((iM2761 ^ i6) * (-30693)) ^ (-2004951045);
                            i3 = -808384682;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -300538837:
                    case 735989153:
                        if (RunnableC3055.f9898 >= 0) {
                            iM2761 = C0773.m3169("ۧᩳ") ^ i7;
                            i8 = ((iM2761 ^ i6) * (-32667)) ^ 387516259;
                            i3 = -233409561;
                        } else {
                            iM2761 = (C0773.m3169("᩻ܽ") + i7) * 35;
                            i8 = ((iM2761 ^ i6) * (-5333)) ^ (-462854331);
                            i3 = -548061763;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case -126931688:
                    case 1271985956:
                        if (C0269.f1558 > 0) {
                            iM2761 = C0619.m2761("ۜ֡") ^ i6;
                            i8 = ((iM2761 ^ i7) * 5579) ^ (-1573453477);
                            i3 = -996595977;
                            i10 = iM2761 ^ i3;
                        }
                        break;
                    case -24668464:
                    case 1645376444:
                        if (C3690.f12684 <= 0) {
                            iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                            i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                            i3 = -1587671261;
                        } else {
                            iM2761 = (C0773.m3169("ۜܽ") + i6) * (-101);
                            i8 = ((iM2761 ^ i7) * 12205) ^ 512150287;
                            i3 = 102860022;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    case 136140961:
                    case 837100812:
                        C1146.m4231();
                        C1542.m5459();
                        iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                        i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                        i3 = -1587671261;
                        i10 = iM2761 ^ i3;
                        break;
                    case 312077777:
                    case 697796252:
                        C1080.m4050();
                        if (C20932.f66974 > 0) {
                            iM2761 = (i7 - C0619.m2761("ۗܺ")) * (-121);
                            i8 = ((iM2761 ^ i6) * (-4167)) ^ (-1399439466);
                            i3 = -1587671261;
                        } else {
                            iM2761 = C0773.m3169("ۧᩳ") ^ i7;
                            i8 = ((iM2761 ^ i6) * (-32667)) ^ 387516259;
                            i3 = -233409561;
                        }
                        i10 = iM2761 ^ i3;
                        break;
                    default:
                        C1519.m5403();
                        C0269.m1775();
                        return null;
                }
            }
            iM3169 = C0773.m3169("۬᩷") ^ i6;
            i8 = ((iM3169 ^ i7) * (-27285)) ^ 139871707;
            i9 = -2055825934;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e1 A[PHI: r2 r4 r5
      0x01e1: PHI (r2v4 java.lang.StringBuilder) = 
      (r2v2 java.lang.StringBuilder)
      (r2v3 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
      (r2v2 java.lang.StringBuilder)
     binds: [B:64:0x01df, B:28:0x0098, B:24:0x0076, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:64:0x01df, B:28:0x0098, B:24:0x0076, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:64:0x01df, B:28:0x0098, B:24:0x0076, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49200(String str, HashSet hashSet) {
        int iM3169;
        int i;
        String strM6952 = null;
        StringBuilder sbM27333 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -178556635;
        int i6 = RunnableC0334.f1808;
        int i7 = C3492.f12043;
        int iM31610 = C0773.m3169("۫ۡ") ^ i6;
        int i8 = ((iM31610 ^ i7) * 20761) ^ 734139954;
        int i9 = 930291999;
        while (true) {
            int i10 = iM31610 ^ i9;
            StringBuilder sb = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 27299) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2013465837:
                    case 1519874760:
                        if (C3690.f12684 <= 0) {
                            iM3169 = (C0773.m3169("᩵ܺ") ^ i7) * (-55);
                            i8 = ((iM3169 ^ i6) * (-5961)) ^ (-1785495458);
                            i = -1001584851;
                        } else {
                            iM3169 = (C0773.m3169("ᩳۜ") ^ i6) * (-55);
                            i8 = ((iM3169 ^ i7) * 20771) ^ 1623004494;
                            i = -881418942;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1921528097:
                    case -335496224:
                        if (AbstractC3624.f12429 > 0) {
                            iM3169 = (C0773.m3169("ᩳۜ") ^ i6) * (-55);
                            i8 = ((iM3169 ^ i7) * 20771) ^ 1623004494;
                            i = -881418942;
                        } else {
                            iM3169 = C0619.m2761("۟ܰ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 867) ^ 1993651614;
                            i = 1231106608;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1717236134:
                    case 1991219367:
                        i4 = i2 + i3;
                        if (C0773.f2792 <= 0) {
                            iM3169 = C0773.m3169("֫᩻") ^ i6;
                            i8 = ((iM3169 ^ i7) * (-4933)) ^ 1474220621;
                            i = -1194788320;
                        } else {
                            iM3169 = (i6 - C0773.m3169("۠۠")) * (-11);
                            i8 = ((iM3169 ^ i7) * (-13111)) ^ (-1652777622);
                            i = -762865375;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1680609646:
                    case 567089077:
                        sbM27333 = C10732.m27333(str);
                        i3 = 1;
                        if (C20932.f66974 <= 0) {
                            iM3169 = C0773.m3169("֫᩻") ^ i6;
                            i8 = ((iM3169 ^ i7) * (-4933)) ^ 1474220621;
                            i = -1194788320;
                        } else {
                            iM3169 = C0773.m3169("ۨۤ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 17445) ^ (-261516065);
                            i = -1974251921;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1521662798:
                    case 1649285178:
                        C1783.m6237(sbM27333, i2);
                        strM6952 = C1080.m4058(sbM27333);
                        i2 = i4;
                        iM3169 = (C0619.m2761("ܰۢ") ^ i6) * (-5);
                        i8 = ((iM3169 ^ i7) * (-10665)) ^ (-1529834380);
                        i = -35786917;
                        i10 = iM3169 ^ i;
                        break;
                    case -1474876310:
                    case 244947412:
                        if (C2287.m7748(hashSet, strM6952)) {
                            iM3169 = C0773.m3169("۬ܿ") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-13391)) ^ (-667723467);
                            i = -922805742;
                        } else {
                            iM3169 = (i6 - C0773.m3169("۠ۢ")) * (-23);
                            i8 = ((iM3169 ^ i7) * (-7117)) ^ (-1508859277);
                            i = -1342164729;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1456158029:
                    case -1241030458:
                        strM6952 = C2023.m6952(sb);
                        i2 = 3;
                        iM3169 = (C0619.m2761("ܰۢ") ^ i6) * (-5);
                        i8 = ((iM3169 ^ i7) * (-10665)) ^ (-1529834380);
                        i = -35786917;
                        i10 = iM3169 ^ i;
                        break;
                    case -1409137453:
                    case 2070877540:
                        if (C2834.f9334 <= 0) {
                            iM3169 = C0619.m2761("۟ܰ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 867) ^ 1993651614;
                            i = 1231106608;
                        } else {
                            iM3169 = C0773.m3169("۬ܳ") ^ i6;
                            i8 = ((iM3169 ^ i7) * 13989) ^ (-297192507);
                            i = 1445240263;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -1238777745:
                    case 1671151311:
                        if (C1321.f4751 < 0) {
                            sb = new StringBuilder();
                            C1783.m6234(sb, str);
                            if (C3779.f12953 > 0) {
                                iM3169 = C0773.m3169("᩹֡") ^ i7;
                                i8 = ((iM3169 ^ i6) * (-9665)) ^ 1685070701;
                                i = 225823574;
                                i10 = iM3169 ^ i;
                            }
                        }
                        break;
                    case -1158389222:
                    case 1920335137:
                        C2310.m7813();
                        C1826.m6301();
                        return null;
                    case -1090027532:
                    case -650768153:
                        C0773.m3161();
                        C2834.m9344();
                        iM3169 = (C0773.m3169("᩵ܺ") ^ i7) * (-55);
                        i8 = ((iM3169 ^ i6) * (-5961)) ^ (-1785495458);
                        i = -1001584851;
                        i10 = iM3169 ^ i;
                        break;
                    case -1004391109:
                    case -445638557:
                        if (C13473.f42873 != 0) {
                            iM3169 = C0619.m2761("۟ܰ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 867) ^ 1993651614;
                            i = 1231106608;
                        } else {
                            iM3169 = C0619.m2761("۫ۨ") ^ i6;
                            i8 = ((iM3169 ^ i7) * 17651) ^ (-354762066);
                            i = -1104929609;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case -620143864:
                    case 930909048:
                        return strM6952;
                    case -432492223:
                    case -35246391:
                        if (C3492.f12043 > 0) {
                            iM3169 = C0619.m2761("۟ܰ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 867) ^ 1993651614;
                            i = 1231106608;
                        } else {
                            iM3169 = C0773.m3169("֫᩻") ^ i6;
                            i8 = ((iM3169 ^ i7) * (-4933)) ^ 1474220621;
                            i = -1194788320;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case 46924422:
                    case 1001777764:
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("֫᩻") ^ i6;
                            i8 = ((iM3169 ^ i7) * (-4933)) ^ 1474220621;
                            i = -1194788320;
                        } else {
                            iM3169 = (C0773.m3169("֨ۡ") + i6) * 19;
                            i8 = ((iM3169 ^ i7) * 5543) ^ 1196719433;
                            i = -2111602794;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case 432040328:
                    case 511733207:
                        C3779.m12269(sb, 2);
                        if (C0950.m3785() != 0) {
                            iM3169 = C0619.m2761("۟ܰ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 867) ^ 1993651614;
                            i = 1231106608;
                        } else {
                            iM3169 = C0619.m2761("᩺᩸") ^ i7;
                            i8 = ((iM3169 ^ i6) * 28723) ^ 196880477;
                            i = -1510821071;
                        }
                        i10 = iM3169 ^ i;
                        break;
                    case 531313552:
                    case 2137919502:
                        if (C2419.f7754 < 0) {
                            iM3169 = C0619.m2761("ۨۖ") ^ i7;
                            i8 = ((iM3169 ^ i6) * 32631) ^ 1085208704;
                            i = -673942244;
                            i10 = iM3169 ^ i;
                        }
                        break;
                    default:
                        if (C20932.f66974 <= 0) {
                            iM3169 = (C0773.m3169("᩵ܺ") ^ i7) * (-55);
                            i8 = ((iM3169 ^ i6) * (-5961)) ^ (-1785495458);
                            i = -1001584851;
                        } else {
                            iM3169 = C0773.m3169("۠֨") ^ i7;
                            i8 = ((iM3169 ^ i6) * (-25289)) ^ 1613913077;
                            i = -1074527534;
                        }
                        i10 = iM3169 ^ i;
                        break;
                }
            }
            iM31610 = C0619.m2761("ۗᩴ") ^ i6;
            i8 = ((iM31610 ^ i7) * 10741) ^ 1883093823;
            i9 = -746085901;
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x064a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0668  */
    /* JADX WARN: Code duplicated, block: B:196:0x067b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0691  */
    /* JADX WARN: Code duplicated, block: B:200:0x0699  */
    /* JADX WARN: Code duplicated, block: B:201:0x069f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49198(C25239 c25239, final C2863 c2863, AbstractC22044 abstractC22044, C6178 c6178, final ThreadLocal threadLocal, final AbstractC22044 abstractC22045, final AtomicInteger atomicInteger, final ThreadLocal threadLocal2, List list, final boolean z, final ThreadLocal threadLocal3, int i, int i2) throws IOException {
        String strM8350;
        int i3;
        String strM9486;
        String strM47853;
        boolean z2;
        C2375 c2375;
        C0594 c0594;
        C0594 c0595;
        C0594 c0596;
        String strM2364;
        HashSet hashSet;
        String str;
        String str2;
        int iMo33924;
        String str3;
        List list2 = list;
        short s = f69136[0];
        int i4 = s + 1;
        int i5 = (i4 * i4) - ((s * 2) + 1) < 0 ? 10974 : 37090;
        C0594 c0597 = new C0594();
        C0594 c0598 = new C0594();
        C0594 c0599 = new C0594();
        AbstractC22044 abstractC22044M7806 = C2310.m7806(abstractC22044, c25239.getPackageName());
        int i6 = i;
        while (true) {
            boolean zM6303 = C1826.m6303(abstractC22044M7806);
            strM8350 = C2485.m8350(f69136, 1, 7, i5);
            if (!zM6303) {
                break;
            }
            StringBuilder sb = new StringBuilder(strM8350);
            C1783.m6237(sb, i6);
            abstractC22044M7806 = C0269.m1774(abstractC22044, C2023.m6952(sb));
            i6++;
        }
        if (abstractC22044M7806.mo4274()) {
            i3 = i6;
        } else {
            StringBuilder sb2 = new StringBuilder(strM8350);
            C1783.m6237(sb2, i6);
            abstractC22044M7806 = C0269.m1774(abstractC22044, C2023.m6952(sb2));
            C2419.m8176(abstractC22044M7806);
            i3 = i6 + 1;
        }
        c6178.m17800(C1826.m6311(abstractC22044M7806));
        c6178.mo17812(i2);
        StringBuilder sb3 = new StringBuilder();
        C3779.m12258(sb3, C1826.m6311(abstractC22044M7806));
        String strM11996 = C3690.m11996(f69136, 8, 1, i5);
        C3779.m12258(sb3, strM11996);
        String strM6952 = C2023.m6952(sb3);
        C0560 c0560 = (C0560) threadLocal.get();
        C3099.m10086(c0560);
        C4510 c4510 = new C4510(C14483.m34972(strM6952, C1783.m6233(f69136, 9, 12, i5)), c0560);
        if (c0560.m2566().length() > 20480) {
            c0560.m2566().m43006();
        }
        c4510.mo14234(strM8350);
        int iMo27607 = c25239.mo27607();
        C0594 c05910 = c0599;
        String strM5510 = C1564.m5510(f69136, 21, 2, i5);
        String strM49199 = m49199(iMo27607, 2, strM5510);
        String strM7803 = C2310.m7803(f69136, 23, 2, i5);
        c4510.mo14233(strM7803, strM49199);
        String packageName = c25239.getPackageName();
        C0594 c05911 = c0598;
        String strM8881 = C2702.m8881(f69136, 25, 4, i5);
        c4510.mo14233(strM8881, packageName);
        if (c25239.mo27606() != EnumC18262.AOSP) {
            c4510.mo14233(C1321.m4861(f69136, 29, 12, i5), c25239.mo27606().f59591);
        }
        String strM9455 = c2863.m9455(c25239.mo27607());
        if (!C0487.m2349(strM9455)) {
            c4510.mo14233(C3077.m10047(f69136, 41, 6, i5), strM9455);
        }
        Iterator itM2357 = C0487.m2357(c25239.mo19828());
        while (C1826.m6317(itM2357)) {
            InterfaceC13917 interfaceC13917 = (InterfaceC13917) C0950.m3796(itM2357);
            Iterator it = itM2357;
            String strM7749 = C2287.m7749(f69136, 47, 7, i5);
            c4510.mo14234(strM7749);
            c4510.mo14233(strM7803, m49199(interfaceC13917.mo33895(), 2, strM5510));
            c4510.mo14233(strM8881, interfaceC13917.getPackageName());
            c4510.mo14232(strM7749);
            itM2357 = it;
        }
        Iterator itM2358 = C0487.m2357(c25239.mo19824());
        while (C3998.m12923(itM2358)) {
            InterfaceC4904 interfaceC4904 = (InterfaceC4904) C0950.m3796(itM2358);
            Iterator it2 = itM2358;
            String strM1236 = AbstractC0116.m1236(f69136, 54, 7, i5);
            c4510.mo14234(strM1236);
            c4510.mo14233(strM8881, interfaceC4904.getName());
            if (!C2878.m9480(interfaceC4904.mo15048())) {
                c4510.mo14233(C3099.m10092(f69136, 66, 5, i5), interfaceC4904.mo15048());
            }
            Iterator itM2359 = C0487.m2357(interfaceC4904.mo15047());
            while (C3998.m12923(itM2359)) {
                InterfaceC22058 interfaceC22058 = (InterfaceC22058) C4238.m13529(itM2359);
                Iterator it3 = itM2359;
                String strM28300 = C11235.m28300(f69136, UMErrorCode.E_UM_BE_CREATE_FAILED, 6, i5);
                c4510.mo14234(strM28300);
                String str4 = strM11996;
                String str5 = strM6952;
                c4510.mo14233(C2966.m9670(f69136, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 5, i5), m49199(interfaceC22058.mo7535(), 8, strM5510));
                InterfaceC9018 interfaceC9018Mo7534 = interfaceC22058.mo7534();
                for (int i7 = 0; i7 < C2834.m9336(interfaceC9018Mo7534); i7++) {
                    c4510.mo14234(strM7803);
                    c4510.text(m49199(interfaceC9018Mo7534.getInt(i7), 8, strM5510));
                    c4510.mo14232(strM7803);
                }
                c4510.mo14232(strM28300);
                itM2359 = it3;
                strM11996 = str4;
                strM6952 = str5;
            }
            c4510.mo14232(strM1236);
            itM2358 = it2;
            strM8881 = strM8881;
        }
        String str6 = strM8881;
        String str7 = strM6952;
        String str8 = strM11996;
        Iterator itM47859 = C20932.m47859(c25239.mo19825());
        while (true) {
            boolean zM6317 = C1826.m6317(itM47859);
            strM9486 = C2878.m9486(f69136, 61, 5, i5);
            if (!zM6317) {
                break;
            }
            C17033 c17033 = (C17033) C4238.m13529(itM47859);
            String strM2756 = C0619.m2756(f69136, 71, 11, i5);
            c4510.mo14234(strM2756);
            for (Iterator itM23510 = C0487.m2357(c17033.mo12015()); C1826.m6317(itM23510); itM23510 = itM23510) {
                C17779 c17779 = (C17779) C0950.m3796(itM23510);
                c4510.mo14234(strM9486);
                c4510.mo14233(C17202.m40377(f69136, 86, 11, i5), m49199(c17779.mo45587(), 8, strM5510));
                c4510.mo14233(C3690.m11996(f69136, 97, 14, i5), m49199(c17779.mo45586(), 8, strM5510));
                c4510.mo14232(strM9486);
                itM47859 = itM47859;
            }
            c4510.mo14232(strM2756);
        }
        c4510.mo14232(strM8350);
        final C24648 c24648M14231 = c4510.m14231(C0269.m1774(abstractC22045, C2288.m7760(atomicInteger.getAndIncrement())), C0269.m1774(abstractC22045, C2288.m7760(atomicInteger.getAndIncrement())), (C6178) threadLocal2.get());
        C2287.m7744(list2, new Callable() { // from class: l.᩻᩻ۧ
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                boolean z3 = z;
                C24648 c24648 = c24648M14231;
                if (!z3) {
                    C14950 c14950 = (C14950) threadLocal3.get();
                    C17359.requireNonNull(c14950);
                    c14950.m35971(c24648);
                }
                return c24648;
            }
        });
        ArrayList arrayList = new ArrayList(c25239.mo19820());
        Iterator itM478510 = C20932.m47859(c25239.mo19822());
        int i8 = 0;
        while (true) {
            boolean zM12923 = C3998.m12923(itM478510);
            strM47853 = C20932.m47853(f69136, 82, 4, i5);
            if (!zM12923) {
                break;
            }
            C23747 c23747 = (C23747) C4238.m13529(itM478510);
            if (C3492.m11490(RunnableC0334.m2058(c23747), strM47853)) {
                C3077.m10033(arrayList, i8, c23747);
                i8++;
            } else {
                C1519.m5406(arrayList, c23747);
            }
        }
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet(C2288.m7752(arrayList));
        C2375 c2376 = new C2375(C2702.m8879(arrayList));
        Iterator itM4942 = C1343.m4942(arrayList);
        while (C3998.m12923(itM4942)) {
            C23747 c23748 = (C23747) C0950.m3796(itM4942);
            boolean zM11490 = C3492.m11490(RunnableC0334.m2058(c23748), strM47853);
            Iterator it4 = itM4942;
            String str9 = strM47853;
            boolean zM11491 = C3492.m11490(RunnableC0334.m2058(c23748), C0269.m1785(f69136, 122, 13, i5));
            String strM5401 = C1519.m5401(c23748);
            if (!strM5401.matches(C13473.m33137(f69136, 135, 8, i5)) || C2966.m9671(strM5401) > 20) {
                strM5401 = String.format(C2287.m7749(f69136, 143, 8, i5), C0619.m2764(c23748.mo35833()));
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C2287.m7748(hashSet3, strM5401)) {
                strM5401 = m49200(strM5401, hashSet3);
                z2 = true;
            }
            C0269.m1788(c2376, c23748.mo35833(), strM5401);
            StringBuilder sb4 = new StringBuilder();
            String str10 = str7;
            C3779.m12258(sb4, str10);
            C1783.m6234(sb4, strM5401);
            HashSet hashSet4 = hashSet3;
            C3779.m12258(sb4, str8);
            String strM6953 = C2023.m6952(sb4);
            int iMo27608 = ((c25239.mo27607() & 255) << 24) | ((c23748.mo35833() & 255) << 16);
            Iterator itM23511 = C0487.m2357(c23748.mo33925());
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (!C1826.m6317(itM23511)) {
                    c2375 = c2376;
                    break;
                }
                Iterator itM478511 = C20932.m47859(((InterfaceC2731) C4238.m13529(itM23511)).mo9078());
                while (C3998.m12923(itM478511)) {
                    InterfaceC8697 interfaceC8697 = (InterfaceC8697) C0950.m3796(itM478511);
                    if (interfaceC8697.mo18152()) {
                        i12++;
                    } else {
                        i9++;
                    }
                    if (interfaceC8697.mo18157()) {
                        i10++;
                    } else {
                        i11++;
                    }
                    if (interfaceC8697.mo18151()) {
                        i13++;
                    } else {
                        i14++;
                    }
                }
                Iterator it5 = itM23511;
                c2375 = c2376;
                if (Math.abs(i12 - i9) > 50 && Math.abs(i10 - i11) > 50 && Math.abs(i13 - i14) > 50) {
                    break;
                }
                c2376 = c2375;
                itM23511 = it5;
            }
            int i15 = i9;
            int i16 = i10;
            int i17 = i11;
            String str11 = strM9486;
            int i18 = i13;
            int i19 = i14;
            boolean z3 = i12 > i15;
            if (z3) {
                c0594 = c0597;
                c0594.add(c23748.mo35833());
            } else {
                c0594 = c0597;
            }
            boolean z4 = i16 > i17;
            if (z4) {
                c0595 = c05911;
                c0595.add(c23748.mo35833());
            } else {
                c0595 = c05911;
            }
            boolean z5 = i18 > i19;
            if (z5) {
                c0596 = c05910;
                c0596.add(c23748.mo35833());
            } else {
                c0596 = c05910;
            }
            C0560 c0561 = (C0560) threadLocal.get();
            C3099.m10086(c0561);
            c05910 = c0596;
            c05911 = c0595;
            c0597 = c0594;
            HashSet hashSet5 = hashSet2;
            C4510 c4511 = new C4510(C14483.m34972(strM6953, C1564.m5510(f69136, 151, 9, i5)), c0561);
            if (c0561.m2566().length() > 20480) {
                c0561.m2566().m43006();
            }
            String strM8166 = C2419.m8166(f69136, DHParameters.DEFAULT_MINIMUM_LENGTH, 4, i5);
            c4511.mo14234(strM8166);
            c4511.mo14233(strM7803, m49199(c23748.mo35833(), 2, strM5510));
            String strM11809 = RunnableC3646.m11809(f69136, 164, 8, i5);
            if (z2) {
                c4511.mo14233(strM11809, C1519.m5401(c23748));
                c23748.m53022(strM5401);
            }
            String strM1237 = AbstractC0116.m1236(f69136, 172, 4, i5);
            if (z3) {
                c4511.mo14233(C2485.m8350(f69136, PicnicEngine.MAX_AUX_BYTES, 13, i5), strM1237);
            }
            if (z4) {
                c4511.mo14233(C1783.m6233(f69136, 189, 11, i5), strM1237);
            }
            if (z5) {
                c4511.mo14233(RunnableC3646.m11809(f69136, 200, 14, i5), strM1237);
            }
            HashSet hashSet6 = new HashSet();
            int iMo4328 = c23748.mo4328();
            int i20 = 0;
            while (i20 < iMo4328) {
                String strM53021 = c23748.m53021(i20);
                if (strM53021 == null) {
                    str3 = strM11809;
                    hashSet = hashSet5;
                    zM11491 = zM11491;
                    str2 = str11;
                } else {
                    boolean zM5512 = C1564.m5512(strM53021);
                    String strM10047 = C3077.m10047(f69136, 214, 4, i5);
                    String strM118010 = RunnableC3646.m11809(f69136, 218, 1, i5);
                    if (zM5512) {
                        strM2364 = C0487.m2364(m49199(i20, 4, RunnableC0334.m2058(c23748)), strM10047, strM118010);
                        c23748.m53015(i20, strM2364);
                        break;
                    }
                    int iM10045 = C3077.m10045(strM53021);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= iM10045) {
                            strM2364 = strM53021;
                            break;
                        }
                        char cM13656 = C4282.m13656(strM53021, i21);
                        int i22 = iM10045;
                        if (('0' > cM13656 || cM13656 > '9') && (('a' > cM13656 || cM13656 > 'z') && !(('A' <= cM13656 && cM13656 <= 'Z') || cM13656 == '_' || cM13656 == '.'))) {
                            strM2364 = C0487.m2364(m49199(i20, 4, RunnableC0334.m2058(c23748)), strM10047, strM118010);
                            c23748.m53015(i20, strM2364);
                            break;
                        }
                        i21++;
                        iM10045 = i22;
                    }
                    hashSet = hashSet5;
                    if (zM11491 && C0487.m2352(hashSet, strM2364)) {
                        strM2364 = C4282.m13652(C3779.m12266(f69136, 219, 4, i5), strM53021);
                        c23748.m53015(i20, strM2364);
                    }
                    if (!C2287.m7748(hashSet6, strM2364) || C1564.m5512(strM2364)) {
                        str = strM11809;
                    } else {
                        int iM9671 = C2966.m9671(strM2364);
                        int i23 = 0;
                        while (true) {
                            if (i23 < iM9671) {
                                int i24 = iM9671;
                                char cM13657 = C4282.m13656(strM2364, i23);
                                str = strM11809;
                                if (cM13657 != '?' && cM13657 != '@') {
                                    i23++;
                                    iM9671 = i24;
                                    strM11809 = str;
                                }
                            } else {
                                str = strM11809;
                            }
                            if (zM11490) {
                                C0862.m3502(hashSet, strM2364);
                            }
                            str2 = str11;
                            c4511.mo14234(str2);
                            c4511.mo14233(strM7803, m49199(iMo27608 | i20, 8, strM5510));
                            str6 = str6;
                            c4511.mo14233(str6, strM2364);
                            if (c23748.mo33926(i20)) {
                                c4511.mo14233(C3033.m9847(f69136, 223, 9, i5), strM1237);
                            }
                            iMo33924 = c23748.mo33924(i20);
                            if (iMo33924 != 0) {
                                c4511.mo14233(C17202.m40377(f69136, 232, 18, i5), m49199(iMo33924, 8, strM5510));
                            }
                            if (C2419.m8175(strM2364, strM53021)) {
                                str3 = str;
                            } else {
                                str3 = str;
                                c4511.mo14233(str3, strM53021);
                            }
                            c4511.mo14232(str2);
                        }
                    }
                    String strM47846 = C20932.m47846(m49199(iMo27608 | i20, 8, C14483.m34972(strM2364, strM118010)), strM10047, strM118010);
                    if (!C0862.m3502(hashSet6, strM47846)) {
                        strM47846 = m49200(C20932.m47846(C4282.m13652(strM53021, strM118010), strM10047, strM118010), hashSet6);
                    }
                    strM2364 = strM47846;
                    c23748.m53015(i20, strM2364);
                    if (zM11490) {
                        C0862.m3502(hashSet, strM2364);
                    }
                    str2 = str11;
                    c4511.mo14234(str2);
                    c4511.mo14233(strM7803, m49199(iMo27608 | i20, 8, strM5510));
                    str6 = str6;
                    c4511.mo14233(str6, strM2364);
                    if (c23748.mo33926(i20)) {
                        c4511.mo14233(C3033.m9847(f69136, 223, 9, i5), strM1237);
                    }
                    iMo33924 = c23748.mo33924(i20);
                    if (iMo33924 != 0) {
                        c4511.mo14233(C17202.m40377(f69136, 232, 18, i5), m49199(iMo33924, 8, strM5510));
                    }
                    if (C2419.m8175(strM2364, strM53021)) {
                        str3 = str;
                        c4511.mo14233(str3, strM53021);
                    } else {
                        str3 = str;
                    }
                    c4511.mo14232(str2);
                }
                i20++;
                str11 = str2;
                strM11809 = str3;
                zM11491 = zM11491;
                iMo4328 = iMo4328;
                strM8166 = strM8166;
                hashSet5 = hashSet;
            }
            c4511.mo14232(strM8166);
            final C24648 c24648M14232 = c4511.m14231(C0269.m1774(abstractC22045, C2702.m8878(atomicInteger.getAndIncrement())), C2310.m7806(abstractC22045, C2288.m7760(atomicInteger.getAndIncrement())), (C6178) threadLocal2.get());
            C2287.m7744(list, new Callable() { // from class: l.ܺ᩻ۧ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    boolean z6 = z;
                    C24648 c24648 = c24648M14232;
                    if (!z6) {
                        C14950 c14950 = (C14950) threadLocal3.get();
                        C17359.requireNonNull(c14950);
                        c14950.m35971(c24648);
                    }
                    return c24648;
                }
            });
            strM47853 = str9;
            strM9486 = str11;
            hashSet2 = hashSet5;
            hashSet3 = hashSet4;
            str7 = str10;
            itM4942 = it4;
            list2 = list;
            c2376 = c2375;
        }
        C2375 c2377 = c2376;
        List list3 = list2;
        String str12 = str7;
        Iterator itM23512 = C0487.m2357(c25239.mo19822());
        while (C1826.m6317(itM23512)) {
            InterfaceC15344 interfaceC15344 = (InterfaceC15344) C0950.m3796(itM23512);
            C1372 c1372 = new C1372();
            C0594 c05912 = c0597;
            c1372.f4895 = c05912.contains(interfaceC15344.mo35833());
            C0594 c05913 = c05911;
            c1372.f4894 = c05913.contains(interfaceC15344.mo35833());
            C0594 c05914 = c05910;
            c1372.f4893 = c05914.contains(interfaceC15344.mo35833());
            C2375 c2378 = c2377;
            String str13 = (String) C8341.m22446(c2378, interfaceC15344.mo35833());
            C3099.m10086(str13);
            StringBuilder sb5 = new StringBuilder();
            String str14 = str12;
            C3779.m12258(sb5, str14);
            C1783.m6234(sb5, str13);
            String str15 = str8;
            C3779.m12258(sb5, str15);
            final String strM6954 = C2023.m6952(sb5);
            HashSet hashSet7 = new HashSet();
            Iterator itM478512 = C20932.m47859(interfaceC15344.mo33925());
            while (C3998.m12923(itM478512)) {
                final InterfaceC2731 interfaceC2731 = (InterfaceC2731) C0950.m3796(itM478512);
                if (C2287.m7748(hashSet7, interfaceC2731.mo9074())) {
                    String str16 = str15;
                    final String str17 = str13;
                    String str18 = str13;
                    final C1372 c1373 = c1372;
                    Iterator it6 = itM23512;
                    List list4 = list3;
                    C0862.m3493(list4, new Callable() { // from class: l.ܽ᩻ۧ
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            C0560 c0562 = (C0560) threadLocal.get();
                            C17359.requireNonNull(c0562);
                            StringBuilder sbM10405 = C3188.m10405(strM6954, str17);
                            InterfaceC2731 interfaceC2732 = interfaceC2731;
                            sbM10405.append(interfaceC2732.mo9074());
                            C4510 c4512 = new C4510(sbM10405.toString(), c0562);
                            if (c0562.m2566().length() > 20480) {
                                c0562.m2566().m43006();
                            }
                            c4512.mo14234("resources");
                            if (interfaceC2732.mo9072()) {
                                c4512.mo14233("sparse", "true");
                            }
                            if (interfaceC2732.mo9067()) {
                                c4512.mo14233("offset16", "true");
                            }
                            Iterator it7 = interfaceC2732.mo9078().iterator();
                            while (it7.hasNext()) {
                                C14049.m34217(c4512, (InterfaceC8697) it7.next(), c2863, c1373);
                            }
                            c4512.mo14232("resources");
                            AtomicInteger atomicInteger2 = atomicInteger;
                            String strValueOf = String.valueOf(atomicInteger2.getAndIncrement());
                            AbstractC22044 abstractC22046 = abstractC22045;
                            C24648 c24648M14233 = c4512.m14231(abstractC22046.m49876(strValueOf), abstractC22046.m49876(String.valueOf(atomicInteger2.getAndIncrement())), (C6178) threadLocal2.get());
                            if (!z) {
                                C14950 c14950 = (C14950) threadLocal3.get();
                                C17359.requireNonNull(c14950);
                                c14950.m35971(c24648M14233);
                            }
                            return c24648M14233;
                        }
                    });
                    list3 = list4;
                    c05912 = c05912;
                    hashSet7 = hashSet7;
                    c05913 = c05913;
                    str14 = str14;
                    str13 = str18;
                    c2378 = c2378;
                    str15 = str16;
                    c05914 = c05914;
                    c1372 = c1372;
                    itM23512 = it6;
                }
            }
            str8 = str15;
            str12 = str14;
            c0597 = c05912;
            c2377 = c2378;
            c05910 = c05914;
            c05911 = c05913;
        }
        return i3;
    }
}
