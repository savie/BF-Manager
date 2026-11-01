package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes2.dex */
public final class C5070 {

    /* JADX INFO: renamed from: ۨᩴ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f17669 = {1621, 30305, 30278, 30302, 30281, 30276, 30273, 30284, 30216, 30314, 30313, 30331, 30317, 30216, 30296, 30281, 30300, 30283, 30272, 30216, 30276, 30281, 30289, 30285, 30298, 30216, 30283, 30279, 30301, 30278, 30300, 30305, 30278, 30302, 30281, 30276, 30273, 30284, 30216, 30314, 30313, 30331, 30317, 30216, 30285, 30288, 30300, 30285, 30278, 30300, 30216, 30276, 30285, 30278, 30287, 30300, 30272, 30328, 30281, 30300, 30283, 30272, 30285, 30284, 30216, 30314, 30313, 30331, 30317, 30216, 30285, 30288, 30300, 30285, 30278, 30300, 30216, 30283, 30298, 30279, 30299, 30299, 30285, 30299, 30216, 30282, 30276, 30279, 30283, 30275, 30216, 30282, 30279, 30301, 30278, 30284, 30281, 30298, 30289, 30333, 30278, 30275, 30278, 30279, 30303, 30278, 30216, 30314, 30313, 30331, 30317, 30216, 30296, 30281, 30300, 30283, 30272, 30216, 30276, 30281, 30289, 30285, 30298, 30216, 30300, 30281, 30287, 30216, 30305, 30278, 30302, 30281, 30276, 30273, 30284, 30216, 30276, 30273, 30300, 30285, 30298, 30281, 30276, 30216, 30296, 30281, 30300, 30283, 30272, 30216, 30283, 30279, 30301, 30278, 30300, 30305, 30278, 30302, 30281, 30276, 30273, 30284, 30216, 30296, 30281, 30300, 30300, 30285, 30298, 30278, 30216, 30273, 30284, 30285, 30278, 30300, 30273, 30300, 30289, 30305, 30278, 30302, 30281, 30276, 30273, 30284, 30216, 30296, 30281, 30300, 30300, 30285, 30298, 30278, 30216, 30283, 30276, 30273, 30296, 30305, 30278, 30302, 30281, 30276, 30273, 30284, 30216, 30276, 30273, 30300, 30285, 30298, 30281, 30276, 30216, 30296, 30281, 30300, 30283, 30272, 30216, 30279, 30286, 30286, 30299, 30285, 30300, 30311, 30302, 30285, 30298, 30276, 30281, 30296, 30296, 30273, 30278, 30287, 30216, 30296, 30281, 30300, 30300, 30285, 30298, 30278, 30216, 30299, 30300, 30281, 30298, 30300, 30299, 30328, 30281, 30300, 30300, 30285, 30298, 30278, 30216, 30299, 30300, 30281, 30298, 30300, 30216, 30277, 30273, 30299, 30299, 30285, 30299, 30216, 30283, 30276, 30273, 30296, 2912, -155, -190, -166, -179, -192, -187, -184, -244, -164, -179, -168, -168, -183, -162, -190, -244, -164, -179, -168, -177, -188, -244, -162, -179, -190, -181, -183, -132, -179, -168, -177, -188, -244, -192, -179, -171, -183, -162, -161, -244, -178, -183, -192, -189, -190, -181, -244, -168, -189, -244, -184, -187, -182, -182, -183, -162, -183, -190, -168, -244, -178, -192, -189, -177, -185, -161, -132, -179, -168, -168, -183, -162, -190, -244, -164, -179, -168, -177, -188, -244, -177, -162, -189, -161, -161, -183, -161, -244, -179, -244, -230, -232, -244, -153, -187, -146, -244, -178, -192, -189, -177, -185, -151, -191, -164, -168, -171, -244, -164, -179, -168, -168, -183, -162, -190, -244, -164, -179, -168, -177, -188, -244, -162, -179, -190, -181, -183, -132, -179, -168, -168, -183, -162, -190, -244, -192, -179, -171, -183, -162, -244, -184, -189, -183, -161, -244, -190, -189, -168, -244, -187, -190, -168, -183, -162, -161, -183, -177, -168, -244, -187, -168, -161, -244, -177, -192, -187, -164, -132, -179, -168, -168, -183, -162, -190, -244, -161, -168, -179, -162, -168, -161, -244, -189, -166, -183, -162, -192, -179, -164, 790, 9568, 9553, 9540, 9555, 9560, 9488, 9567, 9558, 9558, 9539, 9557, 9540, 9503, 9542, 9553, 9564, 9541, 9557, 9488, 9564, 9557, 9566, 9559, 9540, 9560, 9488, 9565, 9561, 9539, 9565, 9553, 9540, 9555, 9560, 9568, 9553, 9540, 9555, 9560, 9488, 9567, 9558, 9558, 9539, 9557, 9540, 9539, 9488, 9565, 9541, 9539, 9540, 9488, 9554, 9557, 9488, 9539, 9567, 9538, 9540, 9557, 9556, 9488, 9543, 9561, 9540, 9560, 9561, 9566, 9488, 9567, 9566, 9557, 9488, 9554, 9564, 9567, 9555, 9563, 6909, 28256, 28241, 28228, 28243, 28248, 28176, 28226, 28241, 28254, 28247, 28245, 28176, 28243, 28226, 28255, 28227, 28227, 28245, 28227, 28176, 28241, 28176, 28166, 28164, 28176, 28283, 28249, 28274, 28176, 28242, 28252, 28255, 28243, 28251, 6855, 1005, 970, 978, 965, 968, 973, 960, 900, 972, 961, 988, 900, 967, 972, 961, 967, 975, 980, 971, 973, 970, 976, 926, 900, 131, -8201, -8237, -8247, -8247, -8237, -8236, -8227, -8294, -8231, -8238, -8225, -8231, -8239, -8246, -8235, -8237, -8236, -8242, -8294, -8246, -8229, -8242, -8242, -8225, -8248, -8236, -8294, -8237, -8226, -8225, -8236, -8242, -8237, -8242, -8253};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17670;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20157[] f17671;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ long m14117(long j) {
        return m14118(j, 40L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m14118(long j, long j2) {
        long j3 = 0;
        int i = 1205150546;
        int i2 = C3722.f13525;
        int i3 = C10634.f36300;
        int iM11306 = ThreadFactoryC3888.m11306("ᩴۘ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 29159) ^ (-167990047);
        int i5 = -110804971;
        while (true) {
            i = ((((i ^ i3) * (-6251)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2003603344:
                case 1483315294:
                    j3 = j2 + j;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24529) ^ 60573432;
                        i5 = -2121639585;
                    } else {
                        iM11306 = C19806.m45029("ᩴۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17837)) ^ (-1015502811);
                        i5 = 838499051;
                    }
                    break;
                case -1914218523:
                case -1729372350:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ᩴۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9059)) ^ (-1136467581);
                        i5 = 1506948240;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۬ܰ")) * (-5);
                        i4 = ((iM11306 ^ i3) * (-25061)) ^ 1181792957;
                        i5 = 623255464;
                    }
                    break;
                case -1895973772:
                case -267038962:
                    if (j3 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9135) ^ 978947235;
                        i5 = -1235386898;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 29797) ^ 1838062550;
                        i5 = 29729995;
                    }
                    break;
                case -1826376811:
                case -417703994:
                    if (j3 < j) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 29797) ^ 1838062550;
                        i5 = 29729995;
                    } else {
                        iM11306 = C19806.m45029("ۖܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1061) ^ (-599857769);
                        i5 = -976521260;
                    }
                    break;
                case -1659429379:
                case 2060406943:
                    return j3;
                case -1492249316:
                case 542306216:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31501) ^ (-553083836);
                        i5 = -1973728492;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘۧ")) * 97;
                        i4 = ((iM11306 ^ i3) * (-1337)) ^ (-712408294);
                        i5 = -875361990;
                    }
                    break;
                case -1404658657:
                case -574814269:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ᩻")) * (-113);
                        i4 = ((iM11306 ^ i2) * 5421) ^ 290411591;
                        i5 = -20649599;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31501) ^ (-553083836);
                        i5 = -1973728492;
                    }
                    break;
                case -1356486873:
                case 236988187:
                    ThreadFactoryC3888.m11300();
                    C3286.m9798();
                    return 0L;
                case -866859496:
                case 752791177:
                    if (C2871.m8646()) {
                        iM11306 = (C19806.m45029("ۗ᩻") ^ i3) * (-115);
                        i4 = ((iM11306 ^ i2) * 32273) ^ (-728787523);
                        i5 = 293179659;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ᩻")) * (-113);
                        i4 = ((iM11306 ^ i2) * 5421) ^ 290411591;
                        i5 = -20649599;
                    }
                    break;
                case -602387157:
                case 510372217:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31501) ^ (-553083836);
                        i5 = -1973728492;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3973) ^ 1006333812;
                        i5 = 862514322;
                    }
                    break;
                case -325207100:
                case 1638605370:
                    C7105.m18985();
                    iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 31501) ^ (-553083836);
                    i5 = -1973728492;
                    break;
                case -11329071:
                case 2107411787:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ᩻")) * (-113);
                        i4 = ((iM11306 ^ i2) * 5421) ^ 290411591;
                        i5 = -20649599;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20119)) ^ (-827238377);
                        i5 = 853599503;
                    }
                    break;
                case 195822431:
                case 1757298752:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩹") ^ i2) * (-23);
                        i4 = ((iM11306 ^ i3) * 11985) ^ (-1530289343);
                        i5 = 688876068;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24529) ^ 60573432;
                        i5 = -2121639585;
                    }
                    break;
                case 1049515460:
                case 1154837549:
                    C3660.m10791();
                    if (C2704.m8255() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-557)) ^ (-1785652692);
                        i5 = -1992789980;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۬ܰ")) * (-5);
                        i4 = ((iM11306 ^ i3) * (-25061)) ^ 1181792957;
                        i5 = 623255464;
                    }
                    break;
                case 1122726371:
                case 1360517838:
                    return C17492.FOREVER_NS;
                case 1374875543:
                case 2054932236:
                    C0962.m3746();
                    if (C1148.f5161 > 0) {
                        iM11306 = (i2 - C19806.m45029("۬ܰ")) * (-5);
                        i4 = ((iM11306 ^ i3) * (-25061)) ^ 1181792957;
                        i5 = 623255464;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31501) ^ (-553083836);
                        i5 = -1973728492;
                    }
                    break;
                case 1446326672:
                case 2091858349:
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24529) ^ 60573432;
                        i5 = -2121639585;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ֫") + i3) * 33;
                        i4 = ((iM11306 ^ i2) * (-20473)) ^ 1951703450;
                        i5 = -933224253;
                    }
                    break;
                case 1470241108:
                case 1968893141:
                    if (C2477.m7593() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-557)) ^ (-1785652692);
                        i5 = -1992789980;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۬᩶")) * (-93);
                        i4 = ((iM11306 ^ i3) * 24057) ^ (-32272292);
                        i5 = 1792099631;
                    }
                    break;
                default:
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31501) ^ (-553083836);
                        i5 = -1973728492;
                    } else {
                        iM11306 = C19806.m45029("ܽܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8161)) ^ (-1883021666);
                        i5 = -1814383294;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f2 A[PHI: r6 r7
      0x00f2: PHI (r6v6 l.᩶ۨ᩹) = (r6v3 l.᩶ۨ᩹), (r6v2 l.᩶ۨ᩹), (r6v2 l.᩶ۨ᩹), (r6v2 l.᩶ۨ᩹) binds: [B:32:0x00dd, B:28:0x00b8, B:25:0x0097, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r7v7 l.֫ۨ᩹) = (r7v2 l.֫ۨ᩹), (r7v4 l.֫ۨ᩹), (r7v2 l.֫ۨ᩹), (r7v2 l.֫ۨ᩹) binds: [B:32:0x00dd, B:28:0x00b8, B:25:0x0097, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x0244  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ab  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (l.C2249.f8050 < 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14133(int r17, int r18, java.util.IdentityHashMap r19, java.util.ArrayList r20) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14133(int, int, java.util.IdentityHashMap, java.util.ArrayList):void");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[PHI: r2 r4
      0x00e5: PHI (r2v6 long) = (r2v4 long), (r2v2 long), (r2v2 long) binds: [B:33:0x00cd, B:25:0x0094, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r4v5 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:33:0x00cd, B:25:0x0094, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e9 A[PHI: r5 r6 r16
      0x01e9: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]) binds: [B:61:0x01e7, B:53:0x01ab, B:49:0x018a] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v4 short) binds: [B:61:0x01e7, B:53:0x01ab, B:49:0x018a] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r16v14 long) = (r16v11 long), (r16v13 long), (r16v15 long) binds: [B:61:0x01e7, B:53:0x01ab, B:49:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x023a A[PHI: r7 r8 r16
      0x023a: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:69:0x0238, B:57:0x01ca, B:45:0x0168, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:69:0x0238, B:57:0x01ca, B:45:0x0168, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r16v24 long) = (r16v9 long), (r16v12 long), (r16v16 long), (r16v28 long) binds: [B:69:0x0238, B:57:0x01ca, B:45:0x0168, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0299 A[PHI: r16
      0x0299: PHI (r16v26 long) = (r16v7 long), (r16v10 long), (r16v21 long), (r16v27 long) binds: [B:77:0x0297, B:65:0x0217, B:28:0x00ba, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 < 0) goto L11;
     */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14128(int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14128(int, int):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14142(IdentityHashMap identityHashMap) {
        InterfaceC20157[] interfaceC20157Arr = null;
        int length = 0;
        boolean z = false;
        int i = 0;
        InterfaceC20157 interfaceC20157 = null;
        int i2 = -1042730798;
        int i3 = C1025.f4800;
        int i4 = C2788.f10625;
        int iM45029 = C19806.m45029("ۙܰ") ^ i3;
        int i5 = ((iM45029 ^ i4) * 30291) ^ (-735330962);
        int i6 = 216836159;
        while (true) {
            i2 = ((((i2 ^ i4) * (-4409)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2074500403:
                case -1857554972:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (!C7105.m18985()) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 21541) ^ (-2094502428);
                        i6 = 226125639;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 29637) ^ 394475952;
                        i6 = 233190333;
                    }
                    break;
                case -1875585327:
                case 1242297184:
                    if (C1025.m3861() <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸᩻")) * 53;
                        i5 = ((iM45029 ^ i3) * (-12937)) ^ (-1174772396);
                        i6 = 830223461;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-16233)) ^ 1330398002;
                        i6 = 1263162736;
                    }
                    break;
                case -1752986719:
                case -320181568:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 21541) ^ (-2094502428);
                        i6 = 226125639;
                    } else {
                        iM45029 = (C19806.m45029("֡۬") + i4) * 35;
                        i5 = ((iM45029 ^ i3) * 9623) ^ (-1375564948);
                        i6 = 979836223;
                    }
                    break;
                case -1678031420:
                case -105699016:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4331) ^ (-900691293);
                        i6 = -1104492930;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۡ") + i4) * q.h;
                        i5 = ((iM45029 ^ i3) * (-17567)) ^ 510556387;
                        i6 = 1372429646;
                    }
                    break;
                case -1669139083:
                case -1090877452:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4331) ^ (-900691293);
                        i6 = -1104492930;
                    } else {
                        iM45029 = C19806.m45029("۟ۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18783) ^ 558819443;
                        i6 = -924171843;
                    }
                    break;
                case -1254059245:
                case 37763020:
                    return z;
                case -868286923:
                case 1429493142:
                    interfaceC20157Arr = this.f17671;
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("ۛܺ") + i3) * (-107);
                        i5 = ((iM45029 ^ i4) * (-31363)) ^ 1996815257;
                        i6 = 1409622338;
                    } else {
                        iM45029 = C19806.m45029("۫֡") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5997)) ^ 1443656665;
                        i6 = -919455273;
                    }
                    break;
                case -670309656:
                case 1262864090:
                    C3743.m10966();
                    if (C1025.m3861() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4331) ^ (-900691293);
                        i6 = -1104492930;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸᩻")) * 53;
                        i5 = ((iM45029 ^ i3) * (-12937)) ^ (-1174772396);
                        i6 = 830223461;
                    }
                    break;
                case -597850233:
                case -344224701:
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4331) ^ (-900691293);
                        i6 = -1104492930;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 3365) ^ 859108525;
                        i6 = -436629637;
                    }
                    break;
                case -574052181:
                case 1550363693:
                    C2788.m8472();
                    RunnableC1564.m5345();
                    return false;
                case -488248868:
                case 182296257:
                    if (identityHashMap.containsKey(((C1811) interfaceC20157).f6970)) {
                        iM45029 = C19806.m45029("᩶ᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-21957)) ^ 1637830312;
                        i6 = -483174877;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۡ") ^ i3) * 25;
                        i5 = ((iM45029 ^ i4) * 7485) ^ (-1308076624);
                        i6 = 1614194379;
                    }
                    break;
                case -403004980:
                case 30189862:
                    interfaceC20157 = interfaceC20157Arr[i];
                    if (interfaceC20157 instanceof C1811) {
                        iM45029 = C19806.m45029("ܿܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-17075)) ^ (-1757065237);
                        i6 = 923526365;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۡ") ^ i3) * 25;
                        i5 = ((iM45029 ^ i4) * 7485) ^ (-1308076624);
                        i6 = 1614194379;
                    }
                    break;
                case 24838787:
                case 966981269:
                    i++;
                    iM45029 = (C19806.m45029("ۚ᩻") ^ i3) * (-67);
                    i5 = ((iM45029 ^ i4) * (-10145)) ^ (-392824293);
                    i6 = 1001727418;
                    break;
                case 94762460:
                case 1951434564:
                    if (C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 29637) ^ 394475952;
                        i6 = 233190333;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܿ") ^ i3) * 19;
                        i5 = ((iM45029 ^ i4) * 21789) ^ 22266186;
                        i6 = -317537552;
                    }
                    break;
                case 484183831:
                case 1360755283:
                    length = interfaceC20157Arr.length;
                    z = false;
                    i = 0;
                    iM45029 = (C19806.m45029("ۚ᩻") ^ i3) * (-67);
                    i5 = ((iM45029 ^ i4) * (-10145)) ^ (-392824293);
                    i6 = 1001727418;
                    break;
                case 653341069:
                case 1531734498:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4331) ^ (-900691293);
                        i6 = -1104492930;
                    } else {
                        iM45029 = C19806.m45029("᩶ۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5373) ^ (-403471365);
                        i6 = 478949851;
                    }
                    break;
                case 864152658:
                case 1798364807:
                    return true;
                case 874587831:
                case 1511194700:
                    if (i < length) {
                        iM45029 = (C19806.m45029("᩶ܽ") + i4) * (-121);
                        i5 = ((iM45029 ^ i3) * (-21253)) ^ (-724986170);
                        i6 = -515410131;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܿ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-741)) ^ (-959970805);
                        i6 = -676460865;
                    }
                    break;
                case 894124077:
                case 1917280000:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 21541) ^ (-2094502428);
                        i6 = 226125639;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ܺ") + i4) * 47;
                        i5 = ((iM45029 ^ i3) * EnumC12167.f40728) ^ (-1307754845);
                        i6 = -629371084;
                    }
                    break;
                case 1248698849:
                case 1855706225:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸᩻")) * 53;
                        i5 = ((iM45029 ^ i3) * (-12937)) ^ (-1174772396);
                        i6 = 830223461;
                    } else {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 21541) ^ (-2094502428);
                        i6 = 226125639;
                    }
                    break;
                case 1855501630:
                case 2025551562:
                    C0216.m1591();
                    iM45029 = C19806.m45029("ᩳܶ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 21541) ^ (-2094502428);
                    i6 = 226125639;
                    break;
                default:
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 29637) ^ 394475952;
                        i6 = 233190333;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۡ")) * (-13);
                        i5 = ((iM45029 ^ i4) * 23953) ^ 956906900;
                        i6 = -257751470;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0478 A[PHI: r17 r18 r25
      0x0478: PHI (r17v3 short[]) = (r17v2 short[]), (r17v4 short[]) binds: [B:102:0x0476, B:81:0x0380] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r18v3 char) = (r18v2 char), (r18v4 char) binds: [B:102:0x0476, B:81:0x0380] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r25v11 int) = (r25v6 int), (r25v12 int) binds: [B:102:0x0476, B:81:0x0380] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x04aa A[PHI: r25
      0x04aa: PHI (r25v23 int) = (r25v5 int), (r25v8 int), (r25v24 int) binds: [B:106:0x04a8, B:94:0x0422, B:10:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x03f2 A[PHI: r19 r20 r25
      0x03f2: PHI (r19v7 int) = (r19v2 int), (r19v6 int), (r19v2 int), (r19v2 int) binds: [B:90:0x03f0, B:78:0x0357, B:14:0x0088, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x03f2: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:90:0x03f0, B:78:0x0357, B:14:0x0088, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x03f2: PHI (r25v26 int) = (r25v9 int), (r25v13 int), (r25v20 int), (r25v31 int) binds: [B:90:0x03f0, B:78:0x0357, B:14:0x0088, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (l.C0797.f3386 != false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14135(java.io.DataOutputStream r30, int r31, int r32, java.util.IdentityHashMap r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14135(java.io.DataOutputStream, int, int, java.util.IdentityHashMap):void");
    }

    /* JADX WARN: Code duplicated, block: B:80:0x02f0 A[PHI: r7 r21 r23
      0x02f0: PHI (r7v3 long) = (r7v1 long), (r7v1 long), (r7v1 long), (r7v1 long), (r7v1 long), (r7v4 long) binds: [B:79:0x02ee, B:75:0x02cd, B:71:0x02ae, B:67:0x028c, B:59:0x0233, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r21v22 int) = (r21v9 int), (r21v10 int), (r21v11 int), (r21v12 int), (r21v15 int), (r21v23 int) binds: [B:79:0x02ee, B:75:0x02cd, B:71:0x02ae, B:67:0x028c, B:59:0x0233, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r23v11 long) = (r23v2 long), (r23v3 long), (r23v4 long), (r23v5 long), (r23v8 long), (r23v12 long) binds: [B:79:0x02ee, B:75:0x02cd, B:71:0x02ae, B:67:0x028c, B:59:0x0233, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m14138(int i, int i2) {
        int i3;
        int iM11306;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        long jMo5918;
        int i10 = i;
        int i11 = ThreadFactoryC3888.f14547;
        int i12 = C3722.f13525;
        int iM450211 = (C19806.m45029("᩷᩻") ^ i12) * (-69);
        int i13 = ((iM450211 ^ i11) * 12211) ^ 13948227;
        InterfaceC20157[] interfaceC20157Arr = null;
        long j = 0;
        long jM14118 = 0;
        int i14 = iM450211 ^ 473295425;
        int i15 = 0;
        int length = 0;
        int i16 = -1405319691;
        int i17 = 0;
        long j2 = 0;
        long j3 = 0;
        InterfaceC20157 interfaceC20157 = null;
        long j4 = 0;
        int i18 = 0;
        while (true) {
            i16 = i14 ^ (i13 & (((i16 ^ i11) * 23453) >> 31));
            switch (i16) {
                case -2129319667:
                case 396070509:
                    j2 = j2;
                    interfaceC20157 = interfaceC20157Arr[i18];
                    if (interfaceC20157.mo5915(i10, i15)) {
                        iM450210 = (i11 - ThreadFactoryC3888.m11306("۬ܿ")) * 37;
                        i8 = ((iM450210 ^ i12) * (-28459)) ^ (-1587819707);
                        i9 = 617892244;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩴۜ") ^ i12) * (-27);
                        i8 = ((iM450210 ^ i11) * 30939) ^ 271210660;
                        i9 = 47440716;
                    }
                    i14 = iM450210 ^ i9;
                    i13 = i8;
                    j2 = j2;
                    break;
                case -1975065291:
                case -154830750:
                    j2 = j2;
                    i3 = i17;
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                    } else {
                        iM45029 = (C19806.m45029("ۡ۫") ^ i11) * 35;
                        i6 = ((iM45029 ^ i12) * 5883) ^ (-225485819);
                        i7 = -731299507;
                    }
                    int i19 = iM45029 ^ i7;
                    i13 = i6;
                    i17 = i3;
                    j2 = j2;
                    i14 = i19;
                    i10 = i;
                    break;
                case -1853213829:
                case -420889318:
                    j2 = j2;
                    i3 = i17;
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩺") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-30139)) ^ (-20166539);
                        i7 = -1355268981;
                    }
                    int i110 = iM45029 ^ i7;
                    i13 = i6;
                    i17 = i3;
                    j2 = j2;
                    i14 = i110;
                    i10 = i;
                    break;
                case -1819137807:
                case -123904567:
                    j2 = j2;
                    length = interfaceC20157Arr.length;
                    j4 = j2 + j;
                    i18 = 0;
                    iM450210 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * 19;
                    i8 = ((iM450210 ^ i11) * 12909) ^ 1792650059;
                    i9 = -1777261443;
                    i14 = iM450210 ^ i9;
                    i13 = i8;
                    j2 = j2;
                    break;
                case -1686250027:
                case 858243488:
                    return j4;
                case -1580799418:
                case -762773561:
                    i18++;
                    j2 = j2;
                    j4 = jM14118;
                    iM450210 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * 19;
                    i8 = ((iM450210 ^ i11) * 12909) ^ 1792650059;
                    i9 = -1777261443;
                    i14 = iM450210 ^ i9;
                    i13 = i8;
                    j2 = j2;
                    break;
                case -1119956408:
                case -531086563:
                    j2 = j2;
                    i3 = i17;
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                    } else {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("᩹۫")) * 97;
                        i6 = ((iM45029 ^ i12) * (-14715)) ^ (-1189404439);
                        i7 = 737643081;
                    }
                    int i111 = iM45029 ^ i7;
                    i13 = i6;
                    i17 = i3;
                    j2 = j2;
                    i14 = i111;
                    i10 = i;
                    break;
                case -1118686728:
                case 151429709:
                    int i20 = i17;
                    j2 = ((long) i20) * 96;
                    if (C1398.f5802 <= 0) {
                        i17 = i20;
                        int iM11307 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i11;
                        i14 = iM11307 ^ (-490715474);
                        i13 = ((iM11307 ^ i12) * (-8211)) ^ 2091530475;
                        i10 = i;
                    } else {
                        int iM450212 = (i12 - C19806.m45029("᩺ܰ")) * (-29);
                        i13 = ((iM450212 ^ i11) * 18065) ^ (-2043509387);
                        i17 = i20;
                        i14 = iM450212 ^ 861816601;
                    }
                    break;
                case -743301672:
                case 152860918:
                    jMo5918 = 0;
                    j3 = jMo5918;
                    iM450210 = ThreadFactoryC3888.m11306("ۤ۬") ^ i12;
                    i8 = ((iM450210 ^ i11) * 855) ^ (-1971532418);
                    i9 = -567814230;
                    i14 = iM450210 ^ i9;
                    i13 = i8;
                    j2 = j2;
                    break;
                case -699523357:
                case 94649736:
                    if (C1148.f5161 <= 0) {
                        j2 = j2;
                        i3 = i17;
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܳᩴ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM45029 ^ i12) * (-17655)) ^ (-1840161700);
                        i7 = -373386852;
                        int i112 = iM45029 ^ i7;
                        i13 = i6;
                        i17 = i3;
                        j2 = j2;
                        i14 = i112;
                        i10 = i;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("۬֫")) * 95;
                        i4 = ((iM11306 ^ i11) * 5749) ^ (-1882265672);
                        i5 = -1943514482;
                        i14 = iM11306 ^ i5;
                        i13 = i4;
                    }
                    break;
                case -501412906:
                case 231072723:
                    C0797.m3359();
                    if (C2788.f10625 < 0) {
                        j2 = j2;
                        i3 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                        int i113 = iM45029 ^ i7;
                        i13 = i6;
                        i17 = i3;
                        j2 = j2;
                        i14 = i113;
                        i10 = i;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("۬֫")) * 95;
                        i4 = ((iM11306 ^ i11) * 5749) ^ (-1882265672);
                        i5 = -1943514482;
                        i14 = iM11306 ^ i5;
                        i13 = i4;
                    }
                    break;
                case -229691339:
                case 1294460648:
                    j2 = j2;
                    j = 48;
                    if (!C7105.m18985()) {
                        iM450210 = C19806.m45029("ۚᩴ") ^ i11;
                        i8 = ((iM450210 ^ i12) * 9409) ^ (-2084089028);
                        i9 = -1359070953;
                        i14 = iM450210 ^ i9;
                        i13 = i8;
                        j2 = j2;
                    } else {
                        i3 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                        int i114 = iM45029 ^ i7;
                        i13 = i6;
                        i17 = i3;
                        j2 = j2;
                        i14 = i114;
                        i10 = i;
                    }
                    break;
                case -115623925:
                case 1407974850:
                    j2 = j2;
                    i3 = i17;
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                    } else {
                        iM45029 = C19806.m45029("۠ᩴ") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-9627)) ^ 1295837799;
                        i7 = -1740633594;
                    }
                    int i115 = iM45029 ^ i7;
                    i13 = i6;
                    i17 = i3;
                    j2 = j2;
                    i14 = i115;
                    i10 = i;
                    break;
                case -78037768:
                case 101050300:
                    j2 = j2;
                    jM14118 = m14118(j4, Math.max(interfaceC20157.mo5917(), j3));
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM450210 = C19806.m45029("᩹۠") ^ i11;
                        i8 = ((iM450210 ^ i12) * 31341) ^ (-481589148);
                        i9 = -2065150396;
                        i14 = iM450210 ^ i9;
                        i13 = i8;
                        j2 = j2;
                    } else {
                        j2 = j2;
                        int iM11308 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i11;
                        i14 = iM11308 ^ (-490715474);
                        i13 = ((iM11308 ^ i12) * (-8211)) ^ 2091530475;
                        i10 = i;
                    }
                    break;
                case 69458084:
                case 135345323:
                    j2 = j2;
                    i3 = i17;
                    m14128(i, i2);
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֡") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-3875)) ^ (-1426132310);
                        i7 = -214757166;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩷") ^ i12;
                        i6 = ((iM45029 ^ i11) * 7393) ^ (-1979482642);
                        i7 = 1945836651;
                    }
                    int i116 = iM45029 ^ i7;
                    i13 = i6;
                    i17 = i3;
                    j2 = j2;
                    i14 = i116;
                    i10 = i;
                    break;
                case 469600519:
                case 1865164594:
                    j2 = j2;
                    i3 = i17;
                    if (C1875.m6086() != 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܳᩴ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM45029 ^ i12) * (-17655)) ^ (-1840161700);
                        i7 = -373386852;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i11;
                        i6 = ((iM45029 ^ i12) * 30065) ^ 1014408616;
                        i7 = 1379970025;
                    }
                    int i117 = iM45029 ^ i7;
                    i13 = i6;
                    i17 = i3;
                    j2 = j2;
                    i14 = i117;
                    i10 = i;
                    break;
                case 816676382:
                case 1585398374:
                    j2 = j2;
                    if (i18 < length) {
                        iM450210 = (i11 - C19806.m45029("᩶ܰ")) * 101;
                        i8 = ((iM450210 ^ i12) * (-7531)) ^ 932609960;
                        i9 = -1830038145;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۨۤ") ^ i12;
                        i8 = ((iM450210 ^ i11) * (-29105)) ^ (-661272309);
                        i9 = -1107085581;
                    }
                    i14 = iM450210 ^ i9;
                    i13 = i8;
                    j2 = j2;
                    break;
                case 1026076503:
                case 1506758546:
                    C1066.m4023();
                    C1875.m6086();
                    iM11306 = (i12 - ThreadFactoryC3888.m11306("۬֫")) * 95;
                    i4 = ((iM11306 ^ i11) * 5749) ^ (-1882265672);
                    i5 = -1943514482;
                    i14 = iM11306 ^ i5;
                    i13 = i4;
                    break;
                case 1280772193:
                case 1451648306:
                    j2 = j2;
                    i15 = i2 + i10;
                    interfaceC20157Arr = this.f17671;
                    int length2 = interfaceC20157Arr.length;
                    if (RunnableC3388.f12514 < 0) {
                        int iM450213 = C19806.m45029("᩸ᩴ") ^ i11;
                        int i21 = ((iM450213 ^ i12) * (-27029)) ^ (-115926909);
                        i14 = iM450213 ^ 1600546485;
                        i10 = i;
                        i17 = length2;
                        i13 = i21;
                        j2 = j2;
                    } else {
                        i17 = length2;
                        j2 = j2;
                        int iM11309 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i11;
                        i14 = iM11309 ^ (-490715474);
                        i13 = ((iM11309 ^ i12) * (-8211)) ^ 2091530475;
                        i10 = i;
                    }
                    break;
                case 1486269057:
                case 1531961855:
                    jMo5918 = interfaceC20157.mo5918(i10, i15);
                    j3 = jMo5918;
                    iM450210 = ThreadFactoryC3888.m11306("ۤ۬") ^ i12;
                    i8 = ((iM450210 ^ i11) * 855) ^ (-1971532418);
                    i9 = -567814230;
                    i14 = iM450210 ^ i9;
                    i13 = i8;
                    j2 = j2;
                    break;
                case 1705815051:
                case 1923686214:
                    C19806.m45024();
                    return 0L;
                default:
                    C0050.m946();
                    if (C3743.f13569) {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("۬֫")) * 95;
                        i4 = ((iM11306 ^ i11) * 5749) ^ (-1882265672);
                        i5 = -1943514482;
                    } else {
                        iM11306 = (C19806.m45029("ܰ᩷") + i11) * (-109);
                        i4 = ((iM11306 ^ i12) * 7217) ^ 1921630430;
                        i5 = -718728505;
                    }
                    i14 = iM11306 ^ i5;
                    i13 = i4;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14136(IdentityHashMap identityHashMap) {
        InterfaceC20157[] interfaceC20157Arr = null;
        int length = 0;
        int i = 0;
        InterfaceC20157 interfaceC20157 = null;
        C6045 c6045 = null;
        int i2 = -606770314;
        int i3 = C1461.f5957;
        int i4 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("ۧܶ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 27649) ^ (-2132669031);
        int i6 = 211255085;
        while (true) {
            i2 = ((((i2 ^ i4) * 24049) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2043717813:
                case 1376190514:
                    C0962.m3746();
                    if (C0671.f2816 == 0) {
                        iM11306 = (C19806.m45029("۫֫") + i4) * (-5);
                        i5 = ((iM11306 ^ i3) * (-8043)) ^ 718925481;
                        i6 = -1403198184;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30599)) ^ 1343520602;
                        i6 = 1321138032;
                    }
                    break;
                case -2033474203:
                case 125715466:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i3) * (-99);
                        i5 = ((iM11306 ^ i4) * 13779) ^ 1954860476;
                        i6 = -1338178626;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21735) ^ 1211615562;
                        i6 = 1168338871;
                    }
                    break;
                case -1960458052:
                case 878973493:
                    if (RunnableC1895.f7152) {
                        iM11306 = (C19806.m45029("ۚۗ") + i3) * (-79);
                        i5 = ((iM11306 ^ i4) * 14093) ^ (-800889447);
                        i6 = -286044938;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i3) * (-99);
                        i5 = ((iM11306 ^ i4) * 13779) ^ 1954860476;
                        i6 = -1338178626;
                    }
                    break;
                case -1951662780:
                case 2018400657:
                    if (i < length) {
                        iM11306 = (C19806.m45029("ܺۢ") + i4) * (-123);
                        i5 = ((iM11306 ^ i3) * (-32091)) ^ 834727409;
                        i6 = 69805209;
                    } else {
                        iM11306 = C19806.m45029("۟᩸") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30999)) ^ 1930787288;
                        i6 = -1309829299;
                    }
                    break;
                case -1812447872:
                case -251149907:
                    interfaceC20157Arr = this.f17671;
                    if (C0962.m3746() >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܽۡ")) * (-101);
                        i5 = ((iM11306 ^ i3) * 26981) ^ (-545945041);
                        i6 = 1527761825;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 28301) ^ 527479249;
                        i6 = 712394594;
                    }
                    break;
                case -1683496337:
                case 2039781893:
                    interfaceC20157 = interfaceC20157Arr[i];
                    if (interfaceC20157 instanceof C1811) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1725) ^ 2079376694;
                        i6 = -404992971;
                    } else {
                        iM11306 = C19806.m45029("᩹ۙ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 30409) ^ (-2091076002);
                        i6 = 1091186262;
                    }
                    break;
                case -1340472863:
                case 1314024513:
                    if (!C3743.f13569) {
                        iM11306 = C19806.m45029("᩵ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22891) ^ 504390977;
                        i6 = -565620249;
                    } else {
                        iM11306 = (C19806.m45029("۫֫") + i4) * (-5);
                        i5 = ((iM11306 ^ i3) * (-8043)) ^ 718925481;
                        i6 = -1403198184;
                    }
                    break;
                case -1078354289:
                case 1149936639:
                    c6045 = ((C1811) interfaceC20157).f6970;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i3) * (-99);
                        i5 = ((iM11306 ^ i4) * 13779) ^ 1954860476;
                        i6 = -1338178626;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩻ۢ")) * 43;
                        i5 = ((iM11306 ^ i3) * 10297) ^ 1243168243;
                        i6 = 2073280534;
                    }
                    break;
                case -676356634:
                case -61414316:
                    if (C2124.f7782 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i3) * (-99);
                        i5 = ((iM11306 ^ i4) * 13779) ^ 1954860476;
                        i6 = -1338178626;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30599)) ^ 1343520602;
                        i6 = 1321138032;
                    }
                    break;
                case -656232874:
                case 383455499:
                    AbstractC0464.m2313();
                    C3743.m10966();
                    break;
                case -376945257:
                case 670050881:
                    break;
                case -104930263:
                case 1839843942:
                    ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, c6045, Boolean.TRUE);
                    iM11306 = C19806.m45029("᩹ۙ") ^ i4;
                    i5 = ((iM11306 ^ i3) * 30409) ^ (-2091076002);
                    i6 = 1091186262;
                    break;
                case 79899923:
                case 392863698:
                    i++;
                    iM11306 = (i4 - C19806.m45029("ۗۗ")) * 45;
                    i5 = ((iM11306 ^ i3) * (-10581)) ^ (-1881686488);
                    i6 = 1461096645;
                    break;
                case 131236891:
                case 1452088854:
                    if (RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩹") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM11306 ^ i3) * 10193) ^ 927685704;
                        i6 = -2020600741;
                    } else {
                        iM11306 = (C19806.m45029("۫֫") + i4) * (-5);
                        i5 = ((iM11306 ^ i3) * (-8043)) ^ 718925481;
                        i6 = -1403198184;
                    }
                    break;
                case 384260272:
                case 1425186721:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("᩵ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22891) ^ 504390977;
                        i6 = -565620249;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩶") + i3) * 3;
                        i5 = ((iM11306 ^ i4) * 30749) ^ 2019382051;
                        i6 = 823430970;
                    }
                    break;
                case 527767186:
                case 1577536292:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i3) * (-99);
                        i5 = ((iM11306 ^ i4) * 13779) ^ 1954860476;
                        i6 = -1338178626;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * 2549) ^ (-2120434236);
                        i6 = 646399936;
                    }
                    break;
                case 942484156:
                case 1393305637:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30599)) ^ 1343520602;
                        i6 = 1321138032;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩺") ^ i4;
                        i5 = ((iM11306 ^ i3) * 24999) ^ (-393555167);
                        i6 = -794074684;
                    }
                    break;
                case 1137923250:
                case 1622546540:
                    C1025.m3861();
                    AbstractC0464.m2313();
                    iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-30599)) ^ 1343520602;
                    i6 = 1321138032;
                    break;
                case 1414476767:
                case 1893999417:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("۫֫") + i4) * (-5);
                        i5 = ((iM11306 ^ i3) * (-8043)) ^ 718925481;
                        i6 = -1403198184;
                    } else {
                        iM11306 = C19806.m45029("ۜۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-31583)) ^ 168888211;
                        i6 = -750768542;
                    }
                    break;
                case 1913667967:
                case 1981814635:
                    length = interfaceC20157Arr.length;
                    i = 0;
                    iM11306 = (i4 - C19806.m45029("ۗۗ")) * 45;
                    i5 = ((iM11306 ^ i3) * (-10581)) ^ (-1881686488);
                    i6 = 1461096645;
                    break;
                default:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("ᩳ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-12707)) ^ 1127415635;
                        i6 = 107040521;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܽۡ")) * (-101);
                        i5 = ((iM11306 ^ i3) * 26981) ^ (-545945041);
                        i6 = 1527761825;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x021e  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2247 m14139(int i, byte[] bArr, int i2, int i3) {
        int iM11306;
        int i4;
        boolean z = false;
        int i5 = -2008691809;
        int i6 = RunnableC3388.f12514;
        int i7 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11307 = ThreadFactoryC3888.m11306("ۗ۠") ^ i6;
        int i8 = ((iM11307 ^ i7) * (-14939)) ^ 416463446;
        int i9 = 148899133;
        while (true) {
            int i10 = iM11307 ^ i9;
            C17334 c17334 = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 9881) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1831951795:
                    case 96103827:
                        if (C1419.f5860 >= 0) {
                            iM11306 = (i7 - C19806.m45029("۫ۙ")) * 85;
                            i8 = ((iM11306 ^ i6) * 15943) ^ 1291980759;
                            i4 = 459200594;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܳܳ") ^ i7) * 5;
                            i8 = ((iM11306 ^ i6) * (-1777)) ^ (-933194882);
                            i4 = 517558187;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case -1795032958:
                    case 1337611577:
                        if (C1461.m5080()) {
                        }
                        iM11306 = (C19806.m45029("۟ۡ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM11306 ^ i7) * 27533) ^ 1887633120;
                        i4 = -836995182;
                        i10 = iM11306 ^ i4;
                        break;
                        break;
                    case -1763692949:
                    case -1715062728:
                        if (C0962.m3746() >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫᩵") ^ i7) * 51;
                            i8 = ((iM11306 ^ i6) * 12705) ^ 863950789;
                            i4 = -575631311;
                        } else {
                            iM11306 = (i6 - ThreadFactoryC3888.m11306("ܶ᩵")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i8 = ((iM11306 ^ i7) * 26865) ^ (-2077064846);
                            i4 = 379349401;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case -1591860395:
                    case -1136178949:
                        C22979.m50824(bArr.length, i2, i3);
                        m14128(i, i3);
                        z = false;
                        if (i3 == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩵۫") ^ i6;
                            i8 = ((iM11306 ^ i7) * (-13743)) ^ (-753218809);
                            i4 = -693281678;
                        } else {
                            iM11306 = (i7 - ThreadFactoryC3888.m11306("۟ۙ")) * (-77);
                            i8 = ((iM11306 ^ i6) * (-20835)) ^ 656062451;
                            i4 = 1087920332;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case -1419759015:
                    case -1273330388:
                        if (C19806.f63586) {
                            iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i6;
                            i8 = ((iM11306 ^ i7) * (-24065)) ^ 614543000;
                            i4 = 1439889638;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܰܺ") ^ i7;
                            i8 = ((iM11306 ^ i6) * 11869) ^ 1607005417;
                            i4 = 1889205584;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case -977539765:
                    case -836558410:
                        if (C1398.f5802 > 0) {
                        }
                        iM11306 = (i7 - C19806.m45029("۫ۙ")) * 85;
                        i8 = ((iM11306 ^ i6) * 15943) ^ 1291980759;
                        i4 = 459200594;
                        i10 = iM11306 ^ i4;
                        break;
                    case -875368862:
                    case -324894153:
                        C1875.m6086();
                        C1977.m6356();
                        iM11306 = (i7 - C19806.m45029("۫ۙ")) * 85;
                        i8 = ((iM11306 ^ i6) * 15943) ^ 1291980759;
                        i4 = 459200594;
                        i10 = iM11306 ^ i4;
                        break;
                    case -834147138:
                    case -778563859:
                        if (RunnableC1606.f6488 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫᩵") ^ i7) * 51;
                            i8 = ((iM11306 ^ i6) * 12705) ^ 863950789;
                            i4 = -575631311;
                        } else {
                            iM11306 = (C19806.m45029("ۚᩴ") + i7) * (-33);
                            i8 = ((iM11306 ^ i6) * 18061) ^ (-1834323573);
                            i4 = 1898331254;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case -763772853:
                    case -30744352:
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + i3);
                        if (C3660.f13403 >= 0) {
                        }
                        c17334 = new C17334(AbstractC13538.m33081(i, 1, i3), bArrCopyOfRange);
                        if (C1875.f7103 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i7) * 13;
                            i8 = ((iM11306 ^ i6) * (-12263)) ^ (-1402378358);
                            i4 = -1078019886;
                        } else {
                            iM11306 = C19806.m45029("ۤ᩷") ^ i6;
                            i8 = ((iM11306 ^ i7) * 16651) ^ 706887135;
                            i4 = -869915190;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                        break;
                    case -36918189:
                    case 1727431203:
                        if (C3743.m10966() <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܳܳ") ^ i7) * 5;
                            i8 = ((iM11306 ^ i6) * (-1777)) ^ (-933194882);
                            i4 = 517558187;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩹֡") + i7) * 3;
                            i8 = ((iM11306 ^ i6) * 28045) ^ 372479174;
                            i4 = -1395520358;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case 10559643:
                    case 220132061:
                        if (C1460.m5050() != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i6;
                            i8 = ((iM11306 ^ i7) * (-24065)) ^ 614543000;
                            i4 = 1439889638;
                        } else {
                            iM11306 = (i6 - ThreadFactoryC3888.m11306("ۡ۫")) * (-71);
                            i8 = ((iM11306 ^ i7) * (-4913)) ^ 31848822;
                            i4 = 1259110798;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case 148616187:
                    case 1339941735:
                        if (C7105.f23796 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i6;
                            i8 = ((iM11306 ^ i7) * (-24065)) ^ 614543000;
                            i4 = 1439889638;
                        } else {
                            iM11306 = (C19806.m45029("ۤܳ") ^ i7) * 7;
                            i8 = ((iM11306 ^ i6) * (-7021)) ^ (-1220677288);
                            i4 = 1443665001;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case 288561570:
                    case 1219401435:
                        return new C2247(this, z);
                    case 824120865:
                    case 1667134892:
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i6) * 81;
                        i8 = ((iM11306 ^ i7) * (-27041)) ^ 997618426;
                        i4 = 1112080992;
                        i10 = iM11306 ^ i4;
                        break;
                        break;
                    case 1003981976:
                    case 1640250834:
                        if (C1460.f5948 >= 0) {
                            iM11306 = (i7 - C19806.m45029("۫ۙ")) * 85;
                            i8 = ((iM11306 ^ i6) * 15943) ^ 1291980759;
                            i4 = 459200594;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i6;
                            i8 = ((iM11306 ^ i7) * (-24065)) ^ 614543000;
                            i4 = 1439889638;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                    case 1144365456:
                    case 1378231398:
                        C5070 c5070M14124 = m14124(c17334);
                        InterfaceC20157[] interfaceC20157Arr = c5070M14124.f17671;
                        for (InterfaceC20157 interfaceC20157 : this.f17671) {
                            if (interfaceC20157 instanceof C1811) {
                                C1811 c1811 = (C1811) interfaceC20157;
                                int length = interfaceC20157Arr.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= length) {
                                        z = true;
                                        return new C2247(c5070M14124, z);
                                    }
                                    InterfaceC20157 interfaceC20158 = interfaceC20157Arr[i11];
                                    if ((interfaceC20158 instanceof C1811) && ((C1811) interfaceC20158).f6970 == c1811.f6970) {
                                    }
                                    i11++;
                                    break;
                                }
                            }
                        }
                        return new C2247(c5070M14124, z);
                    case 1849254543:
                    case 1859963254:
                        C2477.m7593();
                        return null;
                    default:
                        C0962.m3746();
                        if (C7105.m18985()) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫᩵") ^ i7) * 51;
                            i8 = ((iM11306 ^ i6) * 12705) ^ 863950789;
                            i4 = -575631311;
                        } else {
                            iM11306 = (i7 - C19806.m45029("۫ۙ")) * 85;
                            i8 = ((iM11306 ^ i6) * 15943) ^ 1291980759;
                            i4 = 459200594;
                        }
                        i10 = iM11306 ^ i4;
                        break;
                }
            }
            iM11307 = (ThreadFactoryC3888.m11306("᩹۠") ^ i6) * (-51);
            i8 = ((iM11307 ^ i7) * 1531) ^ 567387915;
            i9 = 401609877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5070 m14120(int i) {
        int i2 = 545094609;
        int i3 = C1668.f6641;
        int i4 = C1875.f7103;
        int iM11306 = ThreadFactoryC3888.m11306("֨᩻") ^ i3;
        int i5 = ((iM11306 ^ i4) * 25305) ^ 429340255;
        int i6 = -1856282886;
        while (true) {
            i2 = ((((i2 ^ i4) * 28341) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1900383043:
                case -408647494:
                    C0962.m3746();
                    return null;
                case 102857654:
                case 964029264:
                    if (C1148.f5161 > 0) {
                        if (!C7105.m18985()) {
                            if (C1066.f4915 <= 0) {
                                iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * 83;
                                i5 = ((iM11306 ^ i4) * (-1003)) ^ (-1911082049);
                                i6 = -82854449;
                            } else if (C1937.f7317 >= 0) {
                                iM11306 = (C19806.m45029("᩻᩵") ^ i4) * (-7);
                                i5 = ((iM11306 ^ i3) * (-24407)) ^ 572295870;
                                i6 = -1255505551;
                            } else {
                                if (C1189.f5284 > 0 && !C19806.f63586) {
                                    if (!C0797.f3386) {
                                        if (C0278.m1789() > 0) {
                                            if (C10634.f36300 < 0) {
                                                int i7 = (-65536) & i;
                                                if (C0629.f2722 > 0) {
                                                    return new C5070(i7, new InterfaceC20157[0]);
                                                }
                                            }
                                        }
                                    }
                                }
                                iM11306 = C19806.m45029("۫᩻") ^ i3;
                                i5 = ((iM11306 ^ i4) * (-26159)) ^ 755901596;
                                i6 = -1639499563;
                            }
                            break;
                        }
                        iM11306 = (C19806.m45029("ۘۧ") + i3) * 35;
                        i5 = ((iM11306 ^ i4) * (-3807)) ^ 1316200029;
                        i6 = -166695747;
                        break;
                    }
                    iM11306 = (i4 - C19806.m45029("ۨ۟")) * (-19);
                    i5 = ((iM11306 ^ i3) * 25017) ^ (-648619905);
                    i6 = -325629393;
                    break;
                case 155002042:
                case 1640222532:
                    C1377.m4833();
                    if (!C2704.f10408) {
                        iM11306 = (C19806.m45029("᩻᩵") ^ i4) * (-7);
                        i5 = ((iM11306 ^ i3) * (-24407)) ^ 572295870;
                        i6 = -1255505551;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۨ۟")) * (-19);
                        i5 = ((iM11306 ^ i3) * 25017) ^ (-648619905);
                        i6 = -325629393;
                    }
                    break;
                case 615904334:
                case 1969165392:
                    if (!C19806.f63586) {
                        iM11306 = (C19806.m45029("ۘۧ") + i3) * 35;
                        i5 = ((iM11306 ^ i4) * (-3807)) ^ 1316200029;
                        i6 = -166695747;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۨ۟")) * (-19);
                        i5 = ((iM11306 ^ i3) * 25017) ^ (-648619905);
                        i6 = -325629393;
                    }
                    break;
                case 1140596855:
                case 1283325293:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!C7105.m18985()) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * 83;
                        i5 = ((iM11306 ^ i4) * (-1003)) ^ (-1911082049);
                        i6 = -82854449;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۨ۟")) * (-19);
                        i5 = ((iM11306 ^ i3) * 25017) ^ (-648619905);
                        i6 = -325629393;
                    }
                    break;
                default:
                    RunnableC1564.m5345();
                    C3577.m10565();
                    iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * 83;
                    i5 = ((iM11306 ^ i4) * (-1003)) ^ (-1911082049);
                    i6 = -82854449;
                    break;
            }
        }
    }

    public C5070(int i, InterfaceC20157[] interfaceC20157Arr) {
        int i2 = 323055524;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = C2249.f8050;
        int iM45029 = C19806.m45029("۟᩹") ^ i4;
        int i5 = ((iM45029 ^ i3) * 15113) ^ (-465471685);
        int i6 = -1483746937;
        while (true) {
            i2 = ((((i2 ^ i3) * 28983) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2132417920:
                case -647063266:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ۚۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7487) ^ (-433825670);
                        i6 = -1083005720;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܶ") + i4) * (-11);
                        i5 = ((iM45029 ^ i3) * 27469) ^ (-1407205406);
                        i6 = -904980455;
                    }
                    break;
                case -2075404527:
                case -266039155:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩸") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18263)) ^ 128118061;
                        i6 = 1212000198;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5165) ^ 1390949472;
                        i6 = -1406138460;
                    }
                    break;
                case -2033756592:
                case -2007090044:
                    RunnableC1606.m5473();
                    C1461.m5080();
                    iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 5165) ^ 1390949472;
                    i6 = -1406138460;
                    break;
                case -1811898292:
                case 811092786:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۡ᩻") + i4) * (-73);
                        i5 = ((iM45029 ^ i3) * 5297) ^ 2054223234;
                        i6 = -1551070769;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i3) * (-85);
                        i5 = ((iM45029 ^ i4) * (-6055)) ^ (-1085847203);
                        i6 = 257514443;
                    }
                    break;
                case -1755688117:
                case -445255437:
                    C7105.m18985();
                    C1066.m4023();
                    throw new RuntimeException();
                case -1536347726:
                case 954401353:
                    C1066.m4023();
                    if (!C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5165) ^ 1390949472;
                        i6 = -1406138460;
                    } else {
                        iM45029 = C19806.m45029("ᩳۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 9723) ^ 2055592299;
                        i6 = 1143717047;
                    }
                    break;
                case -1531440604:
                case 1849080447:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩸") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18263)) ^ 128118061;
                        i6 = 1212000198;
                    } else {
                        iM45029 = C19806.m45029("ܳۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 4397) ^ 1542905570;
                        i6 = 406812031;
                    }
                    break;
                case -1450757340:
                case 1905849099:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ܰܺ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-22011)) ^ (-1993243682);
                        i6 = 998438826;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5165) ^ 1390949472;
                        i6 = -1406138460;
                    }
                    break;
                case -1125493124:
                case 1699790983:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ᩳۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 9723) ^ 2055592299;
                        i6 = 1143717047;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩺") ^ i3) * 109;
                        i5 = ((iM45029 ^ i4) * 15891) ^ (-964046242);
                        i6 = 679208583;
                    }
                    break;
                case -665009633:
                case 459973450:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ܽۢ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-11593)) ^ 1312148600;
                        i6 = 942540534;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i3) * (-85);
                        i5 = ((iM45029 ^ i4) * (-6055)) ^ (-1085847203);
                        i6 = 257514443;
                    }
                    break;
                case -308699869:
                case 1925504051:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩸") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18263)) ^ 128118061;
                        i6 = 1212000198;
                    } else {
                        iM45029 = C19806.m45029("ۘܳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 21851) ^ (-343653626);
                        i6 = 661695671;
                    }
                    break;
                case 445896486:
                case 500176434:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ۚۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7487) ^ (-433825670);
                        i6 = -1083005720;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ᩳ᩵")) * (-31);
                        i5 = ((iM45029 ^ i3) * (-20921)) ^ 511991455;
                        i6 = -78140892;
                    }
                    break;
                case 1325927241:
                case 1555008420:
                    this.f17671 = interfaceC20157Arr;
                    return;
                case 1618917501:
                case 2131832521:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i3) * (-85);
                        i5 = ((iM45029 ^ i4) * (-6055)) ^ (-1085847203);
                        i6 = 257514443;
                    } else {
                        iM45029 = C19806.m45029("ᩳۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 9723) ^ 2055592299;
                        i6 = 1143717047;
                    }
                    break;
                case 1902652448:
                case 1926091623:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5165) ^ 1390949472;
                        i6 = -1406138460;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩵") + i4) * 89;
                        i5 = ((iM45029 ^ i3) * 3051) ^ (-1691930194);
                        i6 = -2020965205;
                    }
                    break;
                default:
                    this.f17670 = i;
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5165) ^ 1390949472;
                        i6 = -1406138460;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ۟")) * 65;
                        i5 = ((iM45029 ^ i4) * (-10679)) ^ (-1021213111);
                        i6 = -1432732382;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14131() {
        return this.f17670;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14140() {
        InterfaceC20157[] interfaceC20157Arr = null;
        int i = -492811106;
        int i2 = C1875.f7103;
        int i3 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("᩻۟") ^ i2;
        int i4 = ((iM11306 ^ i3) * 8727) ^ 1756462547;
        int i5 = -93961375;
        while (true) {
            i = ((((i ^ i3) * (-5549)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2016718325:
                case -1496222060:
                    if (C1977.f7413 > 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗ᩹")) * (-97);
                        i4 = ((iM11306 ^ i3) * 13259) ^ 1998541128;
                        i5 = -1010885771;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * (-63);
                        i4 = ((iM11306 ^ i2) * (-31383)) ^ 1274238980;
                        i5 = 1902844052;
                    }
                    break;
                case -2015404725:
                case 52913668:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * 73;
                        i4 = ((iM11306 ^ i2) * (-14811)) ^ 48028428;
                        i5 = -1617496140;
                    } else {
                        iM11306 = C19806.m45029("ۙ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11987)) ^ 2022793999;
                        i5 = -1473908940;
                    }
                    break;
                case -1877753346:
                case -1696756422:
                    if (C3535.m10431() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i2) * 81;
                        i4 = ((iM11306 ^ i3) * (-17791)) ^ (-547670206);
                        i5 = -318032271;
                    } else {
                        iM11306 = C19806.m45029("ܶ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19873) ^ (-971921838);
                        i5 = -135807911;
                    }
                    break;
                case -1874686363:
                case -1433198970:
                    if (C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i2) * 81;
                        i4 = ((iM11306 ^ i3) * (-17791)) ^ (-547670206);
                        i5 = -318032271;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۨ") + i2) * (-11);
                        i4 = ((iM11306 ^ i3) * (-8789)) ^ (-1242586323);
                        i5 = -1693198936;
                    }
                    break;
                case -1847581540:
                case 1937880541:
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6583)) ^ (-611864498);
                        i5 = -365624010;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * (-8847)) ^ 1216615593;
                        i5 = -713190364;
                    }
                    break;
                case -1467761959:
                case 290745096:
                    interfaceC20157Arr = this.f17671;
                    if (C2642.m8171() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * (-8847)) ^ 1216615593;
                        i5 = -713190364;
                    } else {
                        iM11306 = C19806.m45029("ܿ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32427)) ^ 1571327425;
                        i5 = -1336869805;
                    }
                    break;
                case -1415589115:
                case 803247877:
                    if (C2477.m7593() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i2) * 81;
                        i4 = ((iM11306 ^ i3) * (-17791)) ^ (-547670206);
                        i5 = -318032271;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * (-63);
                        i4 = ((iM11306 ^ i2) * (-31383)) ^ 1274238980;
                        i5 = 1902844052;
                    }
                    break;
                case -1175696522:
                case -263748831:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * 73;
                        i4 = ((iM11306 ^ i2) * (-14811)) ^ 48028428;
                        i5 = -1617496140;
                    } else {
                        iM11306 = C19806.m45029("ۡ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3041)) ^ 793692055;
                        i5 = 736352282;
                    }
                    break;
                case -963647878:
                case -832951082:
                    if (!C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * 73;
                        i4 = ((iM11306 ^ i2) * (-14811)) ^ 48028428;
                        i5 = -1617496140;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * (-63);
                        i4 = ((iM11306 ^ i2) * (-31383)) ^ 1274238980;
                        i5 = 1902844052;
                    }
                    break;
                case -709160442:
                case 556710679:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i2) * 81;
                        i4 = ((iM11306 ^ i3) * (-17791)) ^ (-547670206);
                        i5 = -318032271;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۘ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * (-16767)) ^ (-1788650081);
                        i5 = -905939780;
                    }
                    break;
                case -582031282:
                case 561967552:
                    C1460.m5050();
                    C2871.m8646();
                    iM11306 = (C19806.m45029("ۚ᩹") ^ i3) * (-63);
                    i4 = ((iM11306 ^ i2) * (-31383)) ^ 1274238980;
                    i5 = 1902844052;
                    break;
                case -569385196:
                case 2082563688:
                    return false;
                case 1746988:
                case 483808758:
                    if (C1668.m5583()) {
                        iM11306 = (i3 - C19806.m45029("᩺ᩳ")) * 75;
                        i4 = ((iM11306 ^ i2) * (-13887)) ^ 591063110;
                        i5 = -1025652307;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i2) * 81;
                        i4 = ((iM11306 ^ i3) * (-17791)) ^ (-547670206);
                        i5 = -318032271;
                    }
                    break;
                case 17100922:
                case 2004636343:
                    if (interfaceC20157Arr.length == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") ^ i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-23963)) ^ 665666551;
                        i5 = -804255902;
                    } else {
                        iM11306 = C19806.m45029("ܿ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24163) ^ 1234752021;
                        i5 = -2039640454;
                    }
                    break;
                case 175673850:
                case 509232891:
                    return true;
                case 680285441:
                case 1533088997:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗ᩹")) * (-97);
                        i4 = ((iM11306 ^ i3) * 13259) ^ 1998541128;
                        i5 = -1010885771;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۤۘ")) * 99;
                        i4 = ((iM11306 ^ i2) * (-27465)) ^ (-900273873);
                        i5 = -1114301092;
                    }
                    break;
                case 743216360:
                case 2143904038:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * (-8847)) ^ 1216615593;
                        i5 = -713190364;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻᩹") ^ i3) * 71;
                        i4 = ((iM11306 ^ i2) * (-19763)) ^ 799915518;
                        i5 = 435578037;
                    }
                    break;
                default:
                    C0962.m3746();
                    C1668.m5583();
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14137(IdentityHashMap identityHashMap, ArrayList arrayList) {
        InterfaceC20157[] interfaceC20157Arr = null;
        int length = 0;
        int i = 0;
        InterfaceC20157 interfaceC20157 = null;
        C1811 c1811 = null;
        int i2 = 1248194727;
        int i3 = C1461.f5957;
        int i4 = C1148.f5161;
        int iM11306 = (i4 - ThreadFactoryC3888.m11306("᩸ۚ")) * 15;
        int i5 = ((iM11306 ^ i3) * 7269) ^ 798425508;
        int i6 = 1768111834;
        while (true) {
            i2 = ((((i2 ^ i3) * (-15545)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1982702467:
                case -1560331713:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26311) ^ (-1238747694);
                        i6 = 840710592;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩺") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM11306 ^ i3) * (-19035)) ^ 1948911238;
                        i6 = -737405779;
                    }
                    break;
                case -1964498067:
                case -1646095068:
                    interfaceC20157Arr = this.f17671;
                    length = interfaceC20157Arr.length;
                    i = 0;
                    iM11306 = (i4 - C19806.m45029("֨ܶ")) * 115;
                    i5 = ((iM11306 ^ i3) * 21951) ^ (-815950457);
                    i6 = -2049356320;
                    break;
                case -1880929315:
                case -491604130:
                    i++;
                    iM11306 = (i4 - C19806.m45029("֨ܶ")) * 115;
                    i5 = ((iM11306 ^ i3) * 21951) ^ (-815950457);
                    i6 = -2049356320;
                    break;
                case -1766830230:
                case -173182169:
                    if (C1398.f5802 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֨") + i4) * (-127);
                        i5 = ((iM11306 ^ i3) * (-31171)) ^ 389967487;
                        i6 = -855947607;
                    } else {
                        iM11306 = C19806.m45029("۬᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9835) ^ 1242392569;
                        i6 = 1888730628;
                    }
                    break;
                case -1758382358:
                case -876687524:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("۬᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9835) ^ 1242392569;
                        i6 = 1888730628;
                    } else {
                        iM11306 = C19806.m45029("ۚᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5115) ^ (-1215135809);
                        i6 = -254738397;
                    }
                    break;
                case -1664709451:
                case 1768118298:
                    C1875.m6086();
                    C0671.m3008();
                    iM11306 = C19806.m45029("۬᩵") ^ i3;
                    i5 = ((iM11306 ^ i4) * 9835) ^ 1242392569;
                    i6 = 1888730628;
                    break;
                case -1464544422:
                case -455794161:
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩸") + i4) * (-85);
                        i5 = ((iM11306 ^ i3) * 32151) ^ 750420297;
                        i6 = 1429473348;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29483)) ^ 1701869531;
                        i6 = -1520186363;
                    }
                    break;
                case -1388636071:
                case 1786372737:
                    C1148.m4232();
                    if (C0216.f1393 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩸") + i4) * (-85);
                        i5 = ((iM11306 ^ i3) * 32151) ^ 750420297;
                        i6 = 1429473348;
                    } else {
                        iM11306 = C19806.m45029("ۨܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15279)) ^ 633182139;
                        i6 = -1379363882;
                    }
                    break;
                case -1323193900:
                case 29957070:
                    interfaceC20157 = interfaceC20157Arr[i];
                    if (interfaceC20157 instanceof C1811) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20337) ^ 1463669816;
                        i6 = 380077337;
                    } else {
                        iM11306 = (C19806.m45029("ۘᩳ") + i3) * (-5);
                        i5 = ((iM11306 ^ i4) * (-23317)) ^ (-1133023540);
                        i6 = -1531734636;
                    }
                    break;
                case -1299791213:
                case -516326731:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֨") + i4) * (-127);
                        i5 = ((iM11306 ^ i3) * (-31171)) ^ 389967487;
                        i6 = -855947607;
                    } else {
                        iM11306 = C19806.m45029("ܺۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 30707) ^ (-2038261027);
                        i6 = 1749390920;
                    }
                    break;
                case -848519415:
                case 1627395618:
                    ThreadFactoryC3888.m11300();
                    if (!CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۨܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15279)) ^ 633182139;
                        i6 = -1379363882;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֨") + i4) * (-127);
                        i5 = ((iM11306 ^ i3) * (-31171)) ^ 389967487;
                        i6 = -855947607;
                    }
                    break;
                case -749560899:
                case 305216273:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("֫ۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-14721)) ^ 1163402510;
                        i6 = -1635085874;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26311) ^ (-1238747694);
                        i6 = 840710592;
                    }
                    break;
                case -663823308:
                case -661102309:
                    if (i < length) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 137) ^ (-516240745);
                        i6 = 2121967752;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡۜ")) * (-9);
                        i5 = ((iM11306 ^ i4) * (-31903)) ^ (-1458258415);
                        i6 = -1176723314;
                    }
                    break;
                case -623882846:
                case 1742251309:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸᩸") + i4) * (-85);
                        i5 = ((iM11306 ^ i3) * 32151) ^ 750420297;
                        i6 = 1429473348;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 17109) ^ 1500477951;
                        i6 = 1689011657;
                    }
                    break;
                case -592981618:
                case 1511581622:
                    if (C0797.m3359()) {
                        iM11306 = C19806.m45029("ۙ۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * 19983) ^ (-1641882245);
                        i6 = -1274197604;
                    } else {
                        iM11306 = C19806.m45029("ۨܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15279)) ^ 633182139;
                        i6 = -1379363882;
                    }
                    break;
                case -573414576:
                case 1368898505:
                    C2249.m6905(arrayList, c1811.f6970);
                    iM11306 = (C19806.m45029("ۘᩳ") + i3) * (-5);
                    i5 = ((iM11306 ^ i4) * (-23317)) ^ (-1133023540);
                    i6 = -1531734636;
                    break;
                case -491045768:
                case 687239854:
                    C2477.m7593();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    break;
                case -302422430:
                case 1762922508:
                    c1811 = (C1811) interfaceC20157;
                    if (C0629.m2904(identityHashMap, c1811.f6970, Boolean.TRUE) == null) {
                        iM11306 = (C19806.m45029("ۚۧ") + i3) * (-109);
                        i5 = ((iM11306 ^ i4) * 19565) ^ (-212324366);
                        i6 = 219208217;
                    } else {
                        iM11306 = (C19806.m45029("ۘᩳ") + i3) * (-5);
                        i5 = ((iM11306 ^ i4) * (-23317)) ^ (-1133023540);
                        i6 = -1531734636;
                    }
                    break;
                case 473899793:
                case 1019839358:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("۬᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9835) ^ 1242392569;
                        i6 = 1888730628;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ۟") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-12907)) ^ 1870655792;
                        i6 = 217321622;
                    }
                    break;
                case 807423284:
                case 1066468808:
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("ۨܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15279)) ^ 633182139;
                        i6 = -1379363882;
                    } else {
                        iM11306 = (C19806.m45029("ܰܶ") ^ i3) * 81;
                        i5 = ((iM11306 ^ i4) * 6409) ^ (-1366848166);
                        i6 = 614313659;
                    }
                    break;
                case 1934070092:
                case 1951921937:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ۨܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15279)) ^ 633182139;
                        i6 = -1379363882;
                    } else {
                        iM11306 = C19806.m45029("ۚ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9575) ^ 998111671;
                        i6 = -776487975;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14141(int i, int i2) {
        int i3 = 0;
        InterfaceC20157[] interfaceC20157Arr = null;
        int length = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 1468673658;
        int i6 = C0629.f2722;
        int i7 = C1668.f6641;
        int iM11306 = ThreadFactoryC3888.m11306("᩶۫") ^ i6;
        int i8 = ((iM11306 ^ i7) * (-22931)) ^ (-1949837002);
        int i9 = -448873481;
        while (true) {
            i5 = ((((i5 ^ i7) * (-15545)) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -1951749054:
                case 415545235:
                    if (C2788.m8472() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟۟") ^ i7) * (-19);
                        i8 = ((iM11306 ^ i6) * 29771) ^ 1361319940;
                        i9 = 190944829;
                    } else {
                        iM11306 = C19806.m45029("ܽܳ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 29069) ^ 1698458317;
                        i9 = 1789455844;
                    }
                    break;
                case -1917485506:
                case -1421891365:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩷") ^ i7) * 55;
                        i8 = ((iM11306 ^ i6) * (-21719)) ^ (-472704898);
                        i9 = -2112180799;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 10189) ^ (-366231207);
                        i9 = -1700023589;
                    }
                    break;
                case -1834144907:
                case -1246045007:
                    interfaceC20157Arr = this.f17671;
                    length = interfaceC20157Arr.length;
                    z = false;
                    i4 = 0;
                    iM11306 = (C19806.m45029("᩸ۢ") + i6) * (-21);
                    i8 = ((iM11306 ^ i7) * 24793) ^ (-1317667151);
                    i9 = 895953542;
                    break;
                case -1709666912:
                case -1589991180:
                    if (C1461.m5080()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩻") ^ i6) * 81;
                        i8 = ((iM11306 ^ i7) * (-15985)) ^ 25038214;
                        i9 = 246897426;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩺") ^ i6;
                        i8 = ((iM11306 ^ i7) * 27227) ^ (-1785727402);
                        i9 = 1128662246;
                    }
                    break;
                case -1621840991:
                case 839062484:
                    if (interfaceC20157Arr[i4].mo5915(i, i3)) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۘ") ^ i6) * 49;
                        i8 = ((iM11306 ^ i7) * (-13803)) ^ (-667360826);
                        i9 = -1268802232;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i6) * (-35);
                        i8 = ((iM11306 ^ i7) * 26693) ^ (-1446887038);
                        i9 = 1238336377;
                    }
                    break;
                case -1402821680:
                case 1391930044:
                    if (i4 < length) {
                        iM11306 = C19806.m45029("ܳۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-23223)) ^ 1221299696;
                        i9 = 137273656;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-22539)) ^ (-434075390);
                        i9 = 2125321785;
                    }
                    break;
                case -1222730476:
                case 1728313117:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟۟") ^ i7) * (-19);
                        i8 = ((iM11306 ^ i6) * 29771) ^ 1361319940;
                        i9 = 190944829;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("۫ܿ")) * 45;
                        i8 = ((iM11306 ^ i7) * (-27603)) ^ 168474173;
                        i9 = -2003223262;
                    }
                    break;
                case -896763986:
                case 836210647:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩻") ^ i6) * 81;
                        i8 = ((iM11306 ^ i7) * (-15985)) ^ 25038214;
                        i9 = 246897426;
                    } else {
                        iM11306 = (C19806.m45029("֨ۗ") ^ i7) * (-89);
                        i8 = ((iM11306 ^ i6) * 29645) ^ (-1321528999);
                        i9 = 387381314;
                    }
                    break;
                case -539878496:
                case 161807110:
                    if (C19806.m45024()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩷") ^ i7) * 55;
                        i8 = ((iM11306 ^ i6) * (-21719)) ^ (-472704898);
                        i9 = -2112180799;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۘ۫")) * (-123);
                        i8 = ((iM11306 ^ i7) * 16223) ^ (-118252798);
                        i9 = 144005889;
                    }
                    break;
                case -519006164:
                case -501644046:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩻") ^ i6) * 81;
                        i8 = ((iM11306 ^ i7) * (-15985)) ^ 25038214;
                        i9 = 246897426;
                    } else {
                        iM11306 = (i7 - C19806.m45029("۠ܳ")) * 33;
                        i8 = ((iM11306 ^ i6) * 11043) ^ (-657574722);
                        i9 = 1500381804;
                    }
                    break;
                case -438176658:
                case 1504914197:
                    C3722.m10894();
                    iM11306 = (C19806.m45029("֨ۗ") ^ i7) * (-89);
                    i8 = ((iM11306 ^ i6) * 29645) ^ (-1321528999);
                    i9 = 387381314;
                    break;
                case -422736805:
                case 153099433:
                    if (!RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("֨ۗ") ^ i7) * (-89);
                        i8 = ((iM11306 ^ i6) * 29645) ^ (-1321528999);
                        i9 = 387381314;
                    } else {
                        iM11306 = C19806.m45029("᩵᩻") ^ i6;
                        i8 = ((iM11306 ^ i7) * 2569) ^ 957690782;
                        i9 = 1256174967;
                    }
                    break;
                case -233205581:
                case 679767897:
                    RunnableC3388.m10064();
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩷") ^ i7) * 55;
                        i8 = ((iM11306 ^ i6) * (-21719)) ^ (-472704898);
                        i9 = -2112180799;
                    } else {
                        iM11306 = C19806.m45029("᩵᩻") ^ i6;
                        i8 = ((iM11306 ^ i7) * 2569) ^ 957690782;
                        i9 = 1256174967;
                    }
                    break;
                case -162377722:
                case 55702758:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("֨ۗ") ^ i7) * (-89);
                        i8 = ((iM11306 ^ i6) * 29645) ^ (-1321528999);
                        i9 = 387381314;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩹") ^ i7;
                        i8 = ((iM11306 ^ i6) * 7533) ^ 1704346007;
                        i9 = 543457414;
                    }
                    break;
                case -85844153:
                case 1344969285:
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۟") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-13979)) ^ (-226923989);
                        i9 = -1883414491;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩷") ^ i7) * 55;
                        i8 = ((iM11306 ^ i6) * (-21719)) ^ (-472704898);
                        i9 = -2112180799;
                    }
                    break;
                case -12233398:
                case 231846352:
                    m14128(i, i2);
                    i3 = i2 + i;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟۟") ^ i7) * (-19);
                        i8 = ((iM11306 ^ i6) * 29771) ^ 1361319940;
                        i9 = 190944829;
                    } else {
                        iM11306 = C19806.m45029("ۡᩳ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 7155) ^ (-1996075281);
                        i9 = -1495931961;
                    }
                    break;
                case 202827918:
                case 684508933:
                    return true;
                case 503481264:
                case 508911900:
                    i4++;
                    iM11306 = (C19806.m45029("᩸ۢ") + i6) * (-21);
                    i8 = ((iM11306 ^ i7) * 24793) ^ (-1317667151);
                    i9 = 895953542;
                    break;
                case 743900623:
                case 1096843410:
                    C1066.m4023();
                    return false;
                case 2043140790:
                case 2062826642:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟۟") ^ i7) * (-19);
                        i8 = ((iM11306 ^ i6) * 29771) ^ 1361319940;
                        i9 = 190944829;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۘ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-15363)) ^ 1913492116;
                        i9 = 449803391;
                    }
                    break;
                default:
                    return z;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C5070 m14123(l.C5070 r42, int r43, l.C6045 r44, int r45, int r46, int r47, int r48, int[] r49, int r50, int r51) {
        /*
            Method dump skipped, instruction units count: 4166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14123(l.ۚۖ᩹, int, l.ۛۨ᩹, int, int, int, int, int[], int, int):l.ۚۖ᩹");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14134(int i, byte[] bArr, int i2, int i3) {
        InterfaceC20157[] interfaceC20157Arr = null;
        int length = 0;
        int i4 = 0;
        int i5 = 1827418073;
        int i6 = C1668.f6641;
        int i7 = C1398.f5802;
        int iM45029 = (C19806.m45029("ܶۧ") ^ i7) * 21;
        int i8 = ((iM45029 ^ i6) * 23779) ^ 161379658;
        int i9 = 112102131;
        while (true) {
            i5 = ((((i5 ^ i6) * 14259) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2052546473:
                case 538594984:
                    if (i4 < length) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚᩳ") + i6) * (-43);
                        i8 = ((iM45029 ^ i7) * (-19341)) ^ (-289873796);
                        i9 = 1817295203;
                    } else {
                        iM45029 = (C19806.m45029("ۢ᩶") ^ i7) * (-111);
                        i8 = ((iM45029 ^ i6) * (-17673)) ^ 2030268739;
                        i9 = 808362849;
                    }
                    break;
                case -1905995633:
                case 479271564:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-32313)) ^ (-1711805134);
                        i9 = 1518903541;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܰ֨")) * (-27);
                        i8 = ((iM45029 ^ i7) * (-9155)) ^ (-921050898);
                        i9 = -1775791994;
                    }
                    break;
                case -1878609051:
                case 726818477:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-32313)) ^ (-1711805134);
                        i9 = 1518903541;
                    } else {
                        iM45029 = C19806.m45029("ܿۘ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 25579) ^ 1124399411;
                        i9 = -304153956;
                    }
                    break;
                case -1803278845:
                case -1113194465:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-32313)) ^ (-1711805134);
                        i9 = 1518903541;
                    } else {
                        iM45029 = C19806.m45029("۬ۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 22291) ^ 1784239992;
                        i9 = 861541399;
                    }
                    break;
                case -1721036200:
                case -496788549:
                    interfaceC20157Arr[i4].mo5912(i, bArr, i + i3, i2);
                    i4++;
                    iM45029 = (C19806.m45029("ۗۗ") + i6) * (-91);
                    i8 = ((iM45029 ^ i7) * 2537) ^ 417953385;
                    i9 = 119167859;
                    break;
                case -1541967535:
                case -605822672:
                    interfaceC20157Arr = this.f17671;
                    length = interfaceC20157Arr.length;
                    i4 = 0;
                    iM45029 = (C19806.m45029("ۗۗ") + i6) * (-91);
                    i8 = ((iM45029 ^ i7) * 2537) ^ 417953385;
                    i9 = 119167859;
                    break;
                case -1117877287:
                case -389259975:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧᩳ")) * 11;
                        i8 = ((iM45029 ^ i7) * (-28239)) ^ 577356533;
                        i9 = -1179951449;
                    } else {
                        iM45029 = (C19806.m45029("۬ۖ") ^ i6) * (-85);
                        i8 = ((iM45029 ^ i7) * 32689) ^ (-778034313);
                        i9 = -194412786;
                    }
                    break;
                case -994759724:
                case 407895190:
                    if (C3535.m10431() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 4441) ^ 1982074288;
                        i9 = -1359564514;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۜܰ")) * 73;
                        i8 = ((iM45029 ^ i7) * (-14071)) ^ 1413110920;
                        i9 = -604986620;
                    }
                    break;
                case -972268750:
                case 2095740637:
                    C22979.m50824(bArr.length, i2, i3);
                    m14128(i, i3);
                    if (i3 == 0) {
                        iM45029 = (C19806.m45029("ۢ᩶") ^ i7) * (-111);
                        i8 = ((iM45029 ^ i6) * (-17673)) ^ 2030268739;
                        i9 = 808362849;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩺") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-6519)) ^ (-1322343228);
                        i9 = -1895756813;
                    }
                    break;
                case -959764456:
                case 2062394082:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܺܺ")) * (-49);
                        i8 = ((iM45029 ^ i7) * 2935) ^ 2125476875;
                        i9 = -817136774;
                    } else {
                        iM45029 = (C19806.m45029("ۗ֨") ^ i7) * 73;
                        i8 = ((iM45029 ^ i6) * (-29779)) ^ 1050397335;
                        i9 = -199300491;
                    }
                    break;
                case -869731116:
                case -823163989:
                    C2249.m6915();
                    if (!RunnableC3388.m10064()) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۧᩳ")) * 11;
                        i8 = ((iM45029 ^ i7) * (-28239)) ^ 577356533;
                        i9 = -1179951449;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 1945) ^ (-990886105);
                        i9 = 840055783;
                    }
                    break;
                case -583298160:
                case 625298972:
                    if (C0797.f3386) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܺܺ")) * (-49);
                        i8 = ((iM45029 ^ i7) * 2935) ^ 2125476875;
                        i9 = -817136774;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩸") + i6) * (-21);
                        i8 = ((iM45029 ^ i7) * (-29583)) ^ 819708348;
                        i9 = 1423595980;
                    }
                    break;
                case -369810895:
                case 1638452056:
                    break;
                case -365008153:
                case 278224225:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 4441) ^ 1982074288;
                        i9 = -1359564514;
                    } else {
                        iM45029 = C19806.m45029("ۜۧ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 4955) ^ (-1059877281);
                        i9 = -164725274;
                    }
                    break;
                case -210260645:
                case 965699296:
                    AbstractC0464.m2313();
                    iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i7;
                    i8 = ((iM45029 ^ i6) * (-32313)) ^ (-1711805134);
                    i9 = 1518903541;
                    break;
                case 73116822:
                case 1760999752:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܺܺ")) * (-49);
                        i8 = ((iM45029 ^ i7) * 2935) ^ 2125476875;
                        i9 = -817136774;
                    } else {
                        iM45029 = (C19806.m45029("֡᩵") + i6) * 59;
                        i8 = ((iM45029 ^ i7) * 32499) ^ 1439432584;
                        i9 = 1411700990;
                    }
                    break;
                case 419936498:
                case 2001834159:
                    C1066.m4023();
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 4441) ^ 1982074288;
                        i9 = -1359564514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-32313)) ^ (-1711805134);
                        i9 = 1518903541;
                    }
                    break;
                case 595543663:
                case 999721110:
                    if (!C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 1945) ^ (-990886105);
                        i9 = 840055783;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 4441) ^ 1982074288;
                        i9 = -1359564514;
                    }
                    break;
                case 1074009769:
                case 1772926436:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-32313)) ^ (-1711805134);
                        i9 = 1518903541;
                    } else {
                        iM45029 = C19806.m45029("۟ۖ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 31309) ^ (-134019153);
                        i9 = 793658044;
                    }
                    break;
                default:
                    C1875.m6086();
                    C1937.m6279();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017f A[PHI: r1 r6
      0x017f: PHI (r1v4 char) = (r1v3 char), (r1v2 char), (r1v2 char) binds: [B:54:0x017d, B:42:0x00f5, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:54:0x017d, B:42:0x00f5, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e0 A[PHI: r0
      0x01e0: PHI (r0v6 short[]) = (r0v2 short[]), (r0v2 short[]), (r0v2 short[]), (r0v8 short[]) binds: [B:62:0x01c8, B:58:0x01ae, B:15:0x0049, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (l.AbstractC0464.f2088 <= 0) goto L19;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.IOException m14129(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14129(java.lang.String):java.io.IOException");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0274 A[PHI: r3 r16 r17
      0x0274: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:68:0x0272, B:60:0x0235, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r16v15 int) = (r16v8 int), (r16v10 int), (r16v16 int) binds: [B:68:0x0272, B:60:0x0235, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r17v15 l.ۚۖ᩹) = (r17v8 l.ۚۖ᩹), (r17v10 l.ۚۖ᩹), (r17v17 l.ۚۖ᩹) binds: [B:68:0x0272, B:60:0x0235, B:28:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x032e A[PHI: r16 r17
      0x032e: PHI (r16v36 int) = (r16v3 int), (r16v6 int), (r16v22 int), (r16v40 int) binds: [B:88:0x032c, B:76:0x02c0, B:13:0x0077, B:8:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r17v34 l.ۚۖ᩹) = (r17v3 l.ۚۖ᩹), (r17v6 l.ۚۖ᩹), (r17v22 l.ۚۖ᩹), (r17v36 l.ۚۖ᩹) binds: [B:88:0x032c, B:76:0x02c0, B:13:0x0077, B:8:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x035e A[PHI: r16 r17
      0x035e: PHI (r16v18 int) = (r16v2 int), (r16v5 int), (r16v7 int), (r16v9 int), (r16v19 int) binds: [B:92:0x035c, B:80:0x02dd, B:72:0x02a2, B:64:0x0254, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r17v18 l.ۚۖ᩹) = (r17v2 l.ۚۖ᩹), (r17v5 l.ۚۖ᩹), (r17v7 l.ۚۖ᩹), (r17v9 l.ۚۖ᩹), (r17v19 l.ۚۖ᩹) binds: [B:92:0x035c, B:80:0x02dd, B:72:0x02a2, B:64:0x0254, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5070 m14130(int i, int i2) {
        C5070 c5070;
        int i3;
        int iM11306;
        int i4;
        int i5;
        int i6;
        int iM11307;
        int i7;
        int i8;
        int i9 = C3722.f13525;
        int i10 = C1189.f5284;
        int iM45029 = C19806.m45029("ۢ۫") ^ i9;
        int i11 = ((iM45029 ^ i10) * 9515) ^ 114570903;
        C5070 c5071 = null;
        InterfaceC20157[] interfaceC20157Arr = null;
        InterfaceC20157 interfaceC20157 = null;
        InterfaceC20157[] interfaceC20157Arr2 = null;
        int i12 = iM45029 ^ 2020123300;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -854211785;
        InterfaceC20157[] interfaceC20157Arr3 = null;
        int i18 = 0;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i10) * (-7301)) >> 31));
            switch (i17) {
                case -2113825134:
                case 1933030888:
                    c5070 = c5071;
                    i3 = i16;
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ֡") ^ i9;
                        i4 = ((iM11306 ^ i10) * 14947) ^ (-748528371);
                        i5 = -1562407557;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۖ") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-5227)) ^ (-1830324518);
                        i5 = 1290092654;
                    }
                    int i19 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i19;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -2019466423:
                case -485354131:
                    C2124.m6673();
                    if (C0050.f912 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۛܳ") ^ i9) * (-21);
                        i6 = i16;
                        i7 = ((iM11307 ^ i10) * (-8137)) ^ 236003083;
                        i8 = -1174622449;
                        int i20 = i6;
                        i12 = iM11307 ^ i8;
                        i11 = i7;
                        i16 = i20;
                    } else {
                        c5070 = c5071;
                        i3 = i16;
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-20853)) ^ (-1279966752);
                        i5 = 1110971719;
                        int i110 = iM11306 ^ i5;
                        i16 = i3;
                        i12 = i110;
                        i11 = i4;
                        c5071 = c5070;
                    }
                    break;
                case -1821894594:
                case 260933412:
                    i6 = i16;
                    interfaceC20157Arr3[i15] = interfaceC20157;
                    iM11307 = (ThreadFactoryC3888.m11306("֨ܶ") + i9) * (-31);
                    i7 = ((iM11307 ^ i10) * (-28153)) ^ (-219910189);
                    i8 = 541510307;
                    int i21 = i6;
                    i12 = iM11307 ^ i8;
                    i11 = i7;
                    i16 = i21;
                    break;
                case -1805714117:
                case 1458386822:
                    i6 = i16;
                    if (interfaceC20157Arr3 != null) {
                        iM11307 = (i10 - ThreadFactoryC3888.m11306("ᩳۡ")) * (-121);
                        i7 = ((iM11307 ^ i9) * (-1611)) ^ (-1945788447);
                        i8 = 1668338187;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֨ܶ") + i9) * (-31);
                        i7 = ((iM11307 ^ i10) * (-28153)) ^ (-219910189);
                        i8 = 541510307;
                    }
                    int i22 = i6;
                    i12 = iM11307 ^ i8;
                    i11 = i7;
                    i16 = i22;
                    break;
                case -1781636408:
                case -394656092:
                    i3 = i16;
                    InterfaceC20157[] interfaceC20157Arr4 = (InterfaceC20157[]) Arrays.copyOf(interfaceC20157Arr3, i15);
                    if (C2642.f10294 > 0) {
                        return new C5070(this.f17670, interfaceC20157Arr4);
                    }
                    c5070 = c5071;
                    iM11306 = ThreadFactoryC3888.m11306("ۙ֡") ^ i9;
                    i4 = ((iM11306 ^ i10) * 14947) ^ (-748528371);
                    i5 = -1562407557;
                    int i111 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i111;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                    break;
                case -1756121307:
                case 683877807:
                    c5070 = c5071;
                    i3 = i16;
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-20853)) ^ (-1279966752);
                        i5 = 1110971719;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۗ") ^ i9;
                        i4 = ((iM11306 ^ i10) * 5881) ^ (-97516085);
                        i5 = 1179416915;
                    }
                    int i112 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i112;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -1543075732:
                case 1726842151:
                    c5070 = c5071;
                    i3 = i16;
                    if (i15 == 0) {
                        iM11306 = (C19806.m45029("᩻᩶") + i9) * (-71);
                        i4 = ((iM11306 ^ i10) * (-17523)) ^ 580886300;
                        i5 = -726289430;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ᩳ") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-30699)) ^ (-222054476);
                        i5 = -444057750;
                    }
                    int i113 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i113;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -1535801573:
                case 1985129666:
                    i6 = i16;
                    if (interfaceC20157Arr3 != null) {
                        interfaceC20157Arr2 = interfaceC20157Arr3;
                        i16 = i15;
                        int iM11308 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i10) * (-67);
                        c5070 = c5071;
                        i4 = ((iM11308 ^ i9) * 25891) ^ 1023758751;
                        i12 = iM11308 ^ (-1193149586);
                        i11 = i4;
                        c5071 = c5070;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩴۗ") ^ i9;
                        i7 = ((iM11307 ^ i10) * (-17473)) ^ (-751108398);
                        i8 = 2034254549;
                        int i23 = i6;
                        i12 = iM11307 ^ i8;
                        i11 = i7;
                        i16 = i23;
                    }
                    break;
                case -1521812577:
                case 529625072:
                    i3 = i16;
                    C1148.m4232();
                    C2642.m8171();
                    c5070 = c5071;
                    iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM11306 ^ i10) * (-15455)) ^ (-1612996085);
                    i5 = -1354355798;
                    int i114 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i114;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -1456599353:
                case -387329333:
                    c5070 = c5071;
                    i3 = i16;
                    if (interfaceC20157Arr3 == null) {
                        iM11306 = C19806.m45029("֫ۗ") ^ i9;
                        i4 = ((iM11306 ^ i10) * (-9199)) ^ 1130568042;
                        i5 = 127340129;
                    } else {
                        iM11306 = C19806.m45029("۫ۧ") ^ i10;
                        i4 = ((iM11306 ^ i9) * 26761) ^ (-1190755164);
                        i5 = -733942015;
                    }
                    int i115 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i115;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -1273151337:
                case 847135146:
                    i3 = i16;
                    C2788.m8472();
                    if (C1668.f6641 < 0) {
                        c5070 = c5071;
                        iM11306 = (i10 - C19806.m45029("᩺ᩳ")) * (-49);
                        i4 = ((iM11306 ^ i9) * 9713) ^ (-996778915);
                        i5 = -1668683400;
                        int i116 = iM11306 ^ i5;
                        i16 = i3;
                        i12 = i116;
                        i11 = i4;
                        c5071 = c5070;
                    }
                    c5070 = c5071;
                    iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM11306 ^ i10) * (-15455)) ^ (-1612996085);
                    i5 = -1354355798;
                    int i117 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i117;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -1074559630:
                case -700832933:
                    c5070 = c5071;
                    i3 = i16;
                    m14128(i, i2);
                    i13 = i2 + i;
                    if (C1668.m5583()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩻") ^ i9) * 25;
                        i4 = ((iM11306 ^ i10) * (-12421)) ^ 3130546;
                        i5 = -2008676330;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ֡") ^ i9;
                        i4 = ((iM11306 ^ i10) * 14947) ^ (-748528371);
                        i5 = -1562407557;
                    }
                    int i118 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i118;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -987142081:
                case 626073182:
                    i6 = i16;
                    i18++;
                    interfaceC20157Arr3 = interfaceC20157Arr2;
                    i15 = i6;
                    iM11307 = C19806.m45029("᩵ܿ") ^ i10;
                    i7 = ((iM11307 ^ i9) * 1899) ^ 283010638;
                    i8 = 911564857;
                    int i24 = i6;
                    i12 = iM11307 ^ i8;
                    i11 = i7;
                    i16 = i24;
                    break;
                case -753649482:
                case 248111461:
                    c5070 = c5071;
                    i3 = i16;
                    interfaceC20157 = interfaceC20157Arr[i18];
                    if (interfaceC20157.mo5915(i, i13)) {
                        iM11306 = C19806.m45029("ۢۢ") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-27821)) ^ 1691312588;
                        i5 = 648761847;
                    } else {
                        iM11306 = C19806.m45029("ܺ֫") ^ i9;
                        i4 = ((iM11306 ^ i10) * (-25601)) ^ 1881359487;
                        i5 = 1395424937;
                    }
                    int i119 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i119;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -473982177:
                case 527676856:
                    c5070 = c5071;
                    i3 = i16;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i10) * (-15455)) ^ (-1612996085);
                        i5 = -1354355798;
                    } else {
                        iM11306 = C19806.m45029("᩺ܶ") ^ i9;
                        i4 = ((iM11306 ^ i10) * (-25303)) ^ 2134493811;
                        i5 = 963676681;
                    }
                    int i1110 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1110;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -468424969:
                case 1302737831:
                    return c5071;
                case -378621776:
                case 599501032:
                    C2332.m7079();
                    return null;
                case -334427917:
                case 470648367:
                    c5070 = c5071;
                    i3 = i16;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i10 - C19806.m45029("᩺ᩳ")) * (-49);
                        i4 = ((iM11306 ^ i9) * 9713) ^ (-996778915);
                        i5 = -1668683400;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢᩳ") ^ i10;
                        i4 = ((iM11306 ^ i9) * 3975) ^ (-2115133412);
                        i5 = 1485140047;
                    }
                    int i1111 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1111;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -264251450:
                case 1547522028:
                    InterfaceC20157[] interfaceC20157Arr5 = new InterfaceC20157[interfaceC20157Arr.length];
                    C0526.m2427(interfaceC20157Arr, i14, interfaceC20157Arr5, i14, i18);
                    interfaceC20157Arr2 = interfaceC20157Arr5;
                    i16 = i18;
                    int iM11309 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i10) * (-67);
                    c5070 = c5071;
                    i4 = ((iM11309 ^ i9) * 25891) ^ 1023758751;
                    i12 = iM11309 ^ (-1193149586);
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case -150648269:
                case 1433023737:
                    i3 = i16;
                    CallableC1627.m5507();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        c5070 = c5071;
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-20853)) ^ (-1279966752);
                        i5 = 1110971719;
                        int i1112 = iM11306 ^ i5;
                        i16 = i3;
                        i12 = i1112;
                        i11 = i4;
                        c5071 = c5070;
                    }
                    c5070 = c5071;
                    iM11306 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM11306 ^ i10) * (-15455)) ^ (-1612996085);
                    i5 = -1354355798;
                    int i1113 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1113;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case 60196215:
                case 1441262539:
                    i16 = i15 + 1;
                    interfaceC20157Arr2 = interfaceC20157Arr3;
                    int iM113010 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i10) * (-67);
                    c5070 = c5071;
                    i4 = ((iM113010 ^ i9) * 25891) ^ 1023758751;
                    i12 = iM113010 ^ (-1193149586);
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case 389827015:
                case 1175511394:
                    c5070 = c5071;
                    i3 = i16;
                    interfaceC20157Arr = this.f17671;
                    if (i18 < interfaceC20157Arr.length) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩷") ^ i9) * 97;
                        i4 = ((iM11306 ^ i10) * 18817) ^ 1688207047;
                        i5 = -435917933;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("۬᩶")) * (-111);
                        i4 = ((iM11306 ^ i9) * (-30327)) ^ 557598137;
                        i5 = -1185670436;
                    }
                    int i1114 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1114;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case 461455542:
                case 1017168162:
                    c5070 = c5071;
                    i3 = i16;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i10 - C19806.m45029("᩺ᩳ")) * (-49);
                        i4 = ((iM11306 ^ i9) * 9713) ^ (-996778915);
                        i5 = -1668683400;
                    } else {
                        iM11306 = C19806.m45029("ܽܳ") ^ i9;
                        i4 = ((iM11306 ^ i10) * (-27859)) ^ (-1671767856);
                        i5 = -1702013634;
                    }
                    int i1115 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1115;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case 556016703:
                case 1926391045:
                    i6 = i16;
                    c5071 = null;
                    interfaceC20157Arr3 = null;
                    i14 = 0;
                    i18 = 0;
                    i15 = 0;
                    iM11307 = C19806.m45029("᩵ܿ") ^ i10;
                    i7 = ((iM11307 ^ i9) * 1899) ^ 283010638;
                    i8 = 911564857;
                    int i25 = i6;
                    i12 = iM11307 ^ i8;
                    i11 = i7;
                    i16 = i25;
                    break;
                case 574949905:
                case 1664259177:
                    c5070 = c5071;
                    i3 = i16;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i10 - C19806.m45029("᩺ᩳ")) * (-49);
                        i4 = ((iM11306 ^ i9) * 9713) ^ (-996778915);
                        i5 = -1668683400;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۬") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-7589)) ^ 1078373434;
                        i5 = 57791474;
                    }
                    int i1116 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1116;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case 796942230:
                case 1561741623:
                    c5070 = c5071;
                    i3 = i16;
                    if (C3743.f13569) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۨ۠")) * (-81);
                        i4 = ((iM11306 ^ i9) * 11133) ^ 1614329778;
                        i5 = 437828685;
                    } else {
                        iM11306 = (i10 - C19806.m45029("᩺ᩳ")) * (-49);
                        i4 = ((iM11306 ^ i9) * 9713) ^ (-996778915);
                        i5 = -1668683400;
                    }
                    int i1117 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1117;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                case 1238070513:
                case 1677573306:
                    c5070 = c5071;
                    i3 = i16;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i10;
                        i4 = ((iM11306 ^ i9) * (-20853)) ^ (-1279966752);
                        i5 = 1110971719;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۡ") ^ i9) * (-109);
                        i4 = ((iM11306 ^ i10) * 4543) ^ 61360896;
                        i5 = 394713488;
                    }
                    int i1118 = iM11306 ^ i5;
                    i16 = i3;
                    i12 = i1118;
                    i11 = i4;
                    c5071 = c5070;
                    break;
                default:
                    return this;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x033d A[PHI: r7 r8 r9 r18 r19 r30
      0x033d: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:78:0x033b, B:74:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x033d: PHI (r8v3 long[]) = (r8v2 long[]), (r8v4 long[]) binds: [B:78:0x033b, B:74:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x033d: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:78:0x033b, B:74:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x033d: PHI (r18v4 int) = (r18v3 int), (r18v2 int) binds: [B:78:0x033b, B:74:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x033d: PHI (r19v4 int) = (r19v3 int), (r19v2 int) binds: [B:78:0x033b, B:74:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x033d: PHI (r30v11 int) = (r30v10 int), (r30v12 int) binds: [B:78:0x033b, B:74:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x03fb A[PHI: r4 r30
      0x03fb: PHI (r4v4 byte[]) = (r4v2 byte[]), (r4v3 byte[]), (r4v2 byte[]) binds: [B:94:0x03f9, B:82:0x0374, B:12:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x03fb: PHI (r30v49 int) = (r30v6 int), (r30v9 int), (r30v50 int) binds: [B:94:0x03f9, B:82:0x0374, B:12:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x042f A[PHI: r10 r30
      0x042f: PHI (r10v4 l.᩶ۨ᩹[]) = (r10v2 l.᩶ۨ᩹[]), (r10v3 l.᩶ۨ᩹[]), (r10v2 l.᩶ۨ᩹[]) binds: [B:98:0x042d, B:70:0x02f0, B:15:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x042f: PHI (r30v47 int) = (r30v5 int), (r30v13 int), (r30v48 int) binds: [B:98:0x042d, B:70:0x02f0, B:15:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008b, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        r30 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (l.C2704.m8255() > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        r30 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        if (l.RunnableC3388.f12514 < 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5070 m14132(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14132(int, int):l.ۚۖ᩹");
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0bd6 A[PHI: r1 r2 r5 r6 r7 r9 r10 r19 r24 r25 r26 r28 r35 r39 r40 r42 r56
      0x0bd6: PHI (r1v107 l.᩶ۨ᩹[]) = (r1v106 l.᩶ۨ᩹[]), (r1v108 l.᩶ۨ᩹[]) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r2v122 l.᩶ۨ᩹[]) = (r2v121 l.᩶ۨ᩹[]), (r2v123 l.᩶ۨ᩹[]) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r5v79 l.᩶ۨ᩹[]) = (r5v78 l.᩶ۨ᩹[]), (r5v80 l.᩶ۨ᩹[]) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r6v89 int) = (r6v88 int), (r6v90 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r7v55 int) = (r7v54 int), (r7v56 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r9v62 int) = (r9v61 int), (r9v63 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r10v53 int) = (r10v52 int), (r10v54 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r19v38 int) = (r19v37 int), (r19v39 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r24v37 int) = (r24v36 int), (r24v38 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r25v40 int) = (r25v39 int), (r25v41 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r26v35 long[]) = (r26v34 long[]), (r26v36 long[]) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r28v56 int) = (r28v55 int), (r28v57 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r35v68 int) = (r35v67 int), (r35v69 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r39v73 int) = (r39v72 int), (r39v74 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r40v58 long) = (r40v57 long), (r40v59 long) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r42v57 long) = (r42v56 long), (r42v58 long) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]
      0x0bd6: PHI (r56v81 int) = (r56v80 int), (r56v82 int) binds: [B:172:0x0bbd, B:169:0x0b7f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5070 m14124(InterfaceC20157 interfaceC20157) {
        long jM14118;
        int iM45029;
        int i;
        int i2;
        int i3;
        int i4;
        InterfaceC20157[] interfaceC20157Arr;
        int i5;
        InterfaceC20157[] interfaceC20157Arr2;
        InterfaceC20157[] interfaceC20157Arr3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC20157[] interfaceC20157Arr4;
        int i12;
        InterfaceC20157[] interfaceC20157Arr5;
        InterfaceC20157[] interfaceC20157Arr6;
        int i13;
        InterfaceC20157[] interfaceC20157Arr7;
        InterfaceC20157[] interfaceC20157Arr8;
        int i14;
        InterfaceC20157[] interfaceC20157Arr9;
        int iM450210;
        int i15;
        int i16;
        int i17;
        int i18;
        InterfaceC20157[] interfaceC20157Arr10;
        InterfaceC20157[] interfaceC20157Arr11;
        InterfaceC20157[] interfaceC20157Arr12;
        int iM450211;
        int i19;
        int i20;
        int i21;
        InterfaceC20157[] interfaceC20157Arr13;
        int i22;
        int i23;
        int i24;
        int i25;
        int iM11306;
        int i26;
        int i27;
        int iM450212;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int iM450213;
        int i35;
        int i36;
        int i37;
        long[] jArr;
        InterfaceC20157[] interfaceC20157Arr14;
        int i38;
        int i39;
        InterfaceC20157[] interfaceC20157Arr15;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        InterfaceC20157[] interfaceC20157Arr16;
        int iM450214;
        int i45;
        int i46;
        int iM11307;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        InterfaceC20157[] interfaceC20157Arr17;
        int i53;
        InterfaceC20157[] interfaceC20157Arr18;
        int i54;
        int i55;
        long[] jArr2;
        int i56;
        int i57;
        InterfaceC20157[] interfaceC20157Arr19;
        int i58;
        long j;
        long j2;
        InterfaceC20157[] interfaceC20157Arr20;
        int i59;
        int i60;
        int i61;
        InterfaceC20157[] interfaceC20157Arr21;
        int i62;
        int i63;
        int iM450215;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        long j3;
        int i70;
        int i71;
        int i72;
        long jMax;
        long j4;
        int iM11308;
        int i73;
        int i74;
        int i75;
        int iM450216;
        int i76;
        int i77;
        int iM450217;
        int i78;
        long[] jArr3 = null;
        long j5 = 0;
        long j6 = 0;
        int i79 = 0;
        int i80 = 0;
        long j7 = 0;
        long j8 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = 295906560;
        int i85 = RunnableC1606.f6488;
        int i86 = C3577.f13150;
        int iM450218 = (i86 - C19806.m45029("֫ۘ")) * 85;
        int i87 = ((iM450218 ^ i85) * (-30215)) ^ (-1324847236);
        int i88 = iM450218 ^ 1849148848;
        InterfaceC20157[] interfaceC20157Arr22 = null;
        InterfaceC20157[] interfaceC20157Arr23 = null;
        InterfaceC20157 interfaceC20158 = null;
        Object[] objArrCopyOf = null;
        InterfaceC20157[] interfaceC20157Arr24 = null;
        long[] jArr4 = null;
        InterfaceC20157 interfaceC20159 = null;
        long j9 = 0;
        int i89 = 0;
        int i90 = 0;
        int i91 = 0;
        int i92 = 0;
        int i93 = 0;
        int i94 = 0;
        int i95 = 0;
        int i96 = 0;
        int i97 = 0;
        int i98 = 0;
        int i99 = 0;
        InterfaceC20157[] interfaceC20157Arr25 = null;
        int length = 0;
        int i100 = 0;
        int i101 = 0;
        int i102 = 0;
        int length2 = 0;
        int length3 = 0;
        int i103 = 0;
        int length4 = 0;
        InterfaceC20157[] interfaceC20157Arr26 = null;
        C5070 c5070M14121 = null;
        long j10 = 0;
        int i104 = 0;
        InterfaceC20157[] interfaceC20157Arr27 = null;
        InterfaceC20157[] interfaceC20157Arr28 = null;
        int i105 = 0;
        while (true) {
            i84 = i88 ^ (i87 & (((i84 ^ i85) * 31019) >> 31));
            switch (i84) {
                case -2097187709:
                case -347594513:
                    if (C2124.m6673() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") + i86) * 7;
                        i = ((iM45029 ^ i85) * (-30779)) ^ (-233878027);
                        i2 = -321727909;
                    } else {
                        iM45029 = (i85 - C19806.m45029("ܿۚ")) * (-127);
                        i = ((iM45029 ^ i86) * (-25527)) ^ (-693748685);
                        i2 = -1740214511;
                    }
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case -2036917511:
                case 892560181:
                    i92 = i92;
                    i93 = i93;
                    i61 = i99;
                    interfaceC20157Arr21 = interfaceC20157Arr25;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    jArr4 = jArr4;
                    i97 = i97;
                    i62 = i98;
                    i63 = i101;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    long j11 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j11;
                    if (interfaceC20157Arr23 == null) {
                        iM450215 = (C19806.m45029("᩺ᩴ") + i86) * 5;
                        i64 = ((iM450215 ^ i85) * (-29619)) ^ 1633196517;
                        i65 = 929020312;
                    } else {
                        interfaceC20157Arr26 = interfaceC20157Arr23;
                        i96 = i105;
                        iM450215 = C19806.m45029("ܺۨ") ^ i86;
                        i64 = ((iM450215 ^ i85) * 16373) ^ 862301312;
                        i65 = -1772787857;
                    }
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    int i106 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i63;
                    i98 = i62;
                    i97 = i97;
                    i99 = i61;
                    i93 = i93;
                    i88 = iM450215 ^ i65;
                    i91 = i106;
                    long[] jArr5 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr21;
                    i87 = i64;
                    jArr4 = jArr5;
                    long j12 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j12;
                    break;
                case -2030679851:
                case -1981121538:
                    i61 = i99;
                    interfaceC20157Arr21 = interfaceC20157Arr25;
                    i66 = i98;
                    i63 = i101;
                    jM14118 = j9;
                    interfaceC20157Arr23[i105] = interfaceC20158;
                    i96 = i105 + 1;
                    interfaceC20157Arr26 = interfaceC20157Arr23;
                    i62 = i66;
                    iM450215 = C19806.m45029("ܺۨ") ^ i86;
                    i64 = ((iM450215 ^ i85) * 16373) ^ 862301312;
                    i65 = -1772787857;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    int i107 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i63;
                    i98 = i62;
                    i97 = i97;
                    i99 = i61;
                    i93 = i93;
                    i88 = iM450215 ^ i65;
                    i91 = i107;
                    long[] jArr6 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr21;
                    i87 = i64;
                    jArr4 = jArr6;
                    long j13 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j13;
                    break;
                case -1946990216:
                case -1743015024:
                    i3 = i92;
                    i4 = i93;
                    i5 = i99;
                    interfaceC20157Arr2 = interfaceC20157Arr25;
                    interfaceC20157Arr8 = interfaceC20157Arr22;
                    i7 = i89;
                    jArr4 = jArr4;
                    i10 = i97;
                    i105 = i105;
                    i14 = i98;
                    i6 = i101;
                    i8 = i90;
                    InterfaceC20157[] interfaceC20157Arr29 = interfaceC20157Arr27;
                    i9 = i91;
                    interfaceC20157Arr9 = interfaceC20157Arr23;
                    interfaceC20157Arr3 = interfaceC20157Arr29;
                    long j14 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j14;
                    if (interfaceC20157Arr9 != null) {
                        iM450210 = C19806.m45029("ܰۡ") ^ i86;
                        i15 = ((iM450210 ^ i85) * (-19585)) ^ 1938056939;
                        i16 = 1099400918;
                        int i108 = iM450210 ^ i16;
                        i105 = i105;
                        jArr4 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr2;
                        i87 = i15;
                        i90 = i8;
                        i101 = i6;
                        i98 = i14;
                        i97 = i10;
                        i99 = i5;
                        i93 = i4;
                        i88 = i108;
                        i89 = i7;
                        interfaceC20157Arr22 = interfaceC20157Arr8;
                        i92 = i3;
                        InterfaceC20157[] interfaceC20157Arr30 = interfaceC20157Arr3;
                        interfaceC20157Arr23 = interfaceC20157Arr9;
                        i91 = i9;
                        interfaceC20157Arr27 = interfaceC20157Arr30;
                        long j15 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j15;
                    } else {
                        interfaceC20157Arr = interfaceC20157Arr9;
                        i11 = i14;
                        interfaceC20157Arr7 = interfaceC20157Arr2;
                        int iM11309 = (i85 - ThreadFactoryC3888.m11306("ܽۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        interfaceC20157Arr4 = interfaceC20157Arr2;
                        i87 = ((iM11309 ^ i86) * (-18373)) ^ 1556265790;
                        i97 = i10;
                        i90 = i8;
                        i99 = i5;
                        i101 = i6;
                        i93 = i4;
                        i88 = iM11309 ^ 1706495445;
                        i98 = i11;
                        i91 = i9;
                        i89 = i7;
                        interfaceC20157Arr22 = interfaceC20157Arr7;
                        i92 = i3;
                        interfaceC20157Arr27 = interfaceC20157Arr3;
                        interfaceC20157Arr23 = interfaceC20157Arr;
                        interfaceC20157Arr12 = interfaceC20157Arr4;
                        i105 = i105;
                        jArr4 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr12;
                        long j16 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j16;
                    }
                    break;
                case -1933443559:
                case -615898828:
                    i7 = i89;
                    i3 = i92;
                    i4 = i93;
                    i5 = i99;
                    interfaceC20157Arr2 = interfaceC20157Arr25;
                    jArr4 = jArr4;
                    i10 = i97;
                    i105 = i105;
                    int i109 = i98;
                    i6 = i101;
                    i8 = i90;
                    InterfaceC20157[] interfaceC20157Arr31 = interfaceC20157Arr27;
                    i9 = i91;
                    InterfaceC20157[] interfaceC20157Arr32 = interfaceC20157Arr23;
                    long j17 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j17;
                    interfaceC20157Arr7 = (InterfaceC20157[]) Arrays.copyOf(interfaceC20157Arr32, i105);
                    interfaceC20157Arr3 = interfaceC20157Arr31;
                    interfaceC20157Arr = interfaceC20157Arr32;
                    i11 = i109;
                    int iM113010 = (i85 - ThreadFactoryC3888.m11306("ܽۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    interfaceC20157Arr4 = interfaceC20157Arr2;
                    i87 = ((iM113010 ^ i86) * (-18373)) ^ 1556265790;
                    i97 = i10;
                    i90 = i8;
                    i99 = i5;
                    i101 = i6;
                    i93 = i4;
                    i88 = iM113010 ^ 1706495445;
                    i98 = i11;
                    i91 = i9;
                    i89 = i7;
                    interfaceC20157Arr22 = interfaceC20157Arr7;
                    i92 = i3;
                    interfaceC20157Arr27 = interfaceC20157Arr3;
                    interfaceC20157Arr23 = interfaceC20157Arr;
                    interfaceC20157Arr12 = interfaceC20157Arr4;
                    i105 = i105;
                    jArr4 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr12;
                    long j18 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j18;
                    break;
                case -1889925752:
                case 419944578:
                    i92 = i92;
                    i93 = i93;
                    i61 = i99;
                    interfaceC20157Arr21 = interfaceC20157Arr25;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    jArr4 = jArr4;
                    int i110 = i98;
                    i63 = i101;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    int i111 = i97;
                    long j19 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j19;
                    if (i103 > i111) {
                        int iM113011 = (ThreadFactoryC3888.m11306("᩷֨") + i86) * (-83);
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i63;
                        i98 = i110;
                        jArr4 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr21;
                        i87 = ((iM113011 ^ i85) * (-29851)) ^ (-776060327);
                        i91 = i91;
                        i99 = i61;
                        i93 = i93;
                        i88 = iM113011 ^ 488344139;
                        i97 = i111;
                    } else {
                        i97 = i111;
                        iM450215 = (C19806.m45029("֫ᩳ") ^ i86) * 25;
                        i62 = i110;
                        i64 = ((iM450215 ^ i85) * (-16641)) ^ 1542853756;
                        i65 = 2027596651;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        int i1010 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i63;
                        i98 = i62;
                        i97 = i97;
                        i99 = i61;
                        i93 = i93;
                        i88 = iM450215 ^ i65;
                        i91 = i1010;
                        long[] jArr7 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr21;
                        i87 = i64;
                        jArr4 = jArr7;
                    }
                    long j110 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j110;
                    break;
                case -1862294771:
                case -241127180:
                    i75 = i93;
                    jMax = j10;
                    j4 = j9;
                    if (i89 < i92) {
                        iM450216 = C19806.m45029("ܰۧ") ^ i86;
                        i76 = ((iM450216 ^ i85) * 16799) ^ (-427029314);
                        i77 = -1463227968;
                    } else {
                        i80 = i90;
                        iM450216 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i85;
                        i76 = ((iM450216 ^ i86) * 2983) ^ (-930739983);
                        i77 = 1231542598;
                    }
                    i37 = i75;
                    i88 = iM450216 ^ i77;
                    i87 = i76;
                    j9 = j4;
                    j10 = jMax;
                    i93 = i37;
                    break;
                case -1843023757:
                case -423974459:
                    return new C5070(i103, interfaceC20157Arr24);
                case -1794970260:
                case 580006144:
                    C0671.m3008();
                    iM45029 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i85) * 61;
                    i = ((iM45029 ^ i86) * (-7503)) ^ (-675483740);
                    i2 = -502713850;
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case -1771301130:
                case 881772072:
                    if (C1977.f7413 <= 0) {
                        i92 = i92;
                        i93 = i93;
                        interfaceC20157Arr14 = interfaceC20157Arr23;
                        i39 = i99;
                        interfaceC20157Arr15 = interfaceC20157Arr27;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i89 = i89;
                        i40 = i91;
                        i41 = i97;
                        i42 = i98;
                        interfaceC20157Arr16 = interfaceC20157Arr25;
                        i43 = i101;
                        i44 = i90;
                        jArr = jArr4;
                        i38 = i105;
                        long j20 = j9;
                        i103 = i103;
                        i104 = i104;
                        j10 = j10;
                        jM14118 = j20;
                        iM450214 = (C19806.m45029("ܿܽ") + i86) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i45 = ((iM450214 ^ i85) * (-507)) ^ 2078067677;
                        i46 = 728852618;
                        int i112 = iM450214 ^ i46;
                        i105 = i38;
                        jArr4 = jArr;
                        i90 = i44;
                        interfaceC20157Arr25 = interfaceC20157Arr16;
                        i101 = i43;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i98 = i42;
                        i97 = i41;
                        i99 = i39;
                        i93 = i93;
                        i88 = i112;
                        i87 = i45;
                        i91 = i40;
                        interfaceC20157Arr27 = interfaceC20157Arr15;
                        interfaceC20157Arr23 = interfaceC20157Arr14;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") + i86) * 7;
                        i = ((iM45029 ^ i85) * (-30779)) ^ (-233878027);
                        i2 = -321727909;
                        i88 = iM45029 ^ i2;
                        i87 = i;
                    }
                    break;
                case -1691887460:
                case 1655841308:
                    i92 = i92;
                    i93 = i93;
                    i101 = i101;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    long j21 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j21;
                    interfaceC20157Arr24[interfaceC20157Arr27.length] = interfaceC20157;
                    i91 = i91;
                    if (interfaceC20157Arr24.length >= 16) {
                        iM450211 = (C19806.m45029("۬ۨ") + i86) * 77;
                        i19 = ((iM450211 ^ i85) * (-17247)) ^ (-1942642704);
                        i20 = -1595530199;
                    } else {
                        iM450211 = C19806.m45029("ۤܿ") ^ i85;
                        i19 = ((iM450211 ^ i86) * 10603) ^ 1393430726;
                        i20 = 158180294;
                    }
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    i33 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i101;
                    i93 = i93;
                    i88 = iM450211 ^ i20;
                    i87 = i19;
                    i91 = i33;
                    long j111 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j111;
                    break;
                case -1676070964:
                case 1679577473:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۖ") ^ i86;
                        i = ((iM45029 ^ i85) * 3673) ^ (-1845530431);
                        i2 = 265254337;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") + i86) * 7;
                        i = ((iM45029 ^ i85) * (-30779)) ^ (-233878027);
                        i2 = -321727909;
                    }
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case -1549807238:
                case -746839585:
                    long j22 = j9;
                    i67 = i103;
                    jM14118 = j22;
                    i68 = Integer.MAX_VALUE;
                    int iM113012 = (ThreadFactoryC3888.m11306("֡֫") ^ i85) * 119;
                    i69 = ((iM113012 ^ i86) * (-16979)) ^ (-2035974197);
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    j3 = j10;
                    i104 = i68;
                    i103 = i67;
                    i90 = i90;
                    i101 = i101;
                    i93 = i93;
                    i88 = iM113012 ^ 1748595085;
                    i87 = i69;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case -1536542613:
                case 2042767392:
                    i83 = Integer.MAX_VALUE;
                    iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i86;
                    i = ((iM45029 ^ i85) * 28167) ^ (-1257239164);
                    i2 = 1488046442;
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case -1506860662:
                case 399133399:
                    i3 = i92;
                    i4 = i93;
                    interfaceC20157Arr = interfaceC20157Arr23;
                    i5 = i99;
                    interfaceC20157Arr2 = interfaceC20157Arr25;
                    interfaceC20157Arr3 = interfaceC20157Arr27;
                    i6 = i101;
                    InterfaceC20157[] interfaceC20157Arr33 = interfaceC20157Arr22;
                    i7 = i89;
                    i8 = i90;
                    i9 = i91;
                    jArr4 = jArr4;
                    i10 = i97;
                    i105 = i105;
                    long j23 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j23;
                    i11 = 0;
                    if (interfaceC20157Arr2.length == 0) {
                        interfaceC20157Arr7 = interfaceC20157Arr2;
                        int iM113013 = (i85 - ThreadFactoryC3888.m11306("ܽۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        interfaceC20157Arr4 = interfaceC20157Arr2;
                        i87 = ((iM113013 ^ i86) * (-18373)) ^ 1556265790;
                        i97 = i10;
                        i90 = i8;
                        i99 = i5;
                        i101 = i6;
                        i93 = i4;
                        i88 = iM113013 ^ 1706495445;
                        i98 = i11;
                        i91 = i9;
                        i89 = i7;
                        interfaceC20157Arr22 = interfaceC20157Arr7;
                        i92 = i3;
                        interfaceC20157Arr27 = interfaceC20157Arr3;
                        interfaceC20157Arr23 = interfaceC20157Arr;
                    } else {
                        interfaceC20157Arr4 = interfaceC20157Arr2;
                        int iM450219 = C19806.m45029("ۤ֫") ^ i86;
                        i87 = ((iM450219 ^ i85) * (-5399)) ^ (-474419484);
                        i97 = i10;
                        i91 = i9;
                        i90 = i8;
                        i99 = i5;
                        interfaceC20157Arr27 = interfaceC20157Arr3;
                        i101 = i6;
                        i93 = i4;
                        interfaceC20157Arr23 = interfaceC20157Arr;
                        i98 = 0;
                        i88 = iM450219 ^ 1942621289;
                        i89 = i7;
                        interfaceC20157Arr22 = interfaceC20157Arr33;
                        i92 = i3;
                    }
                    interfaceC20157Arr12 = interfaceC20157Arr4;
                    i105 = i105;
                    jArr4 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr12;
                    long j112 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j112;
                    break;
                case -1499082018:
                case 839208484:
                    j7 = jArr4[i89];
                    int i113 = i93;
                    long j24 = ~jArr3[i89];
                    if (!RunnableC1895.f7152) {
                        i93 = i113;
                        j8 = j24;
                        long j25 = j9;
                        i103 = i103;
                        i104 = i104;
                        j10 = j10;
                        jM14118 = j25;
                        iM450211 = ThreadFactoryC3888.m11306("۫ܺ") ^ i85;
                        i19 = ((iM450211 ^ i86) * (-963)) ^ 1816266905;
                        i20 = -731686289;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                        i91 = i33;
                        long j113 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j113;
                    } else {
                        int iM450220 = (C19806.m45029("ᩳ᩶") ^ i85) * (-91);
                        i87 = ((iM450220 ^ i86) * (-21713)) ^ 732998538;
                        i37 = i113;
                        i88 = iM450220 ^ (-1459304444);
                        j8 = j24;
                        i93 = i37;
                    }
                    break;
                case -1498357473:
                case -374152344:
                    i95++;
                    i23 = i101;
                    interfaceC20157Arr13 = interfaceC20157Arr22;
                    i90 = i80;
                    i82 = 1024;
                    i22 = i102;
                    jM14118 = j9;
                    int iM113014 = (ThreadFactoryC3888.m11306("ܳᩴ") + i85) * (-47);
                    i102 = i22;
                    int i114 = ((iM113014 ^ i86) * 11605) ^ 2083075922;
                    int i115 = iM113014 ^ (-849593379);
                    length4 = length4;
                    i87 = i114;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr13;
                    i92 = i92;
                    i101 = i23;
                    i93 = i93;
                    i88 = i115;
                    long j114 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j114;
                    break;
                case -1435599880:
                case 719552959:
                    return c5070M14121;
                case -1427125348:
                case 1666355276:
                    i93 = i93;
                    long j26 = j10;
                    int i116 = length4;
                    jM14118 = j9;
                    i103 = i103;
                    i104 = i104;
                    interfaceC20159 = interfaceC20157Arr22[i95];
                    j10 = j26;
                    i92 = i92;
                    Arrays.fill(jArr4, 0L);
                    if (C1460.f5948 < 0) {
                        int iM113015 = ThreadFactoryC3888.m11306("᩷᩷") ^ i86;
                        length4 = i116;
                        i87 = ((iM113015 ^ i85) * 10203) ^ (-2007626828);
                        i93 = i93;
                        i88 = iM113015 ^ 1657394412;
                        i92 = i92;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    } else {
                        length4 = i116;
                        i101 = i101;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i89 = i89;
                        i90 = i90;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i91 = i91;
                        iM450211 = ThreadFactoryC3888.m11306("۟ܺ") ^ i85;
                        i19 = ((iM450211 ^ i86) * 27599) ^ 239109774;
                        i20 = 2042305557;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                        i91 = i33;
                        long j115 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j115;
                    }
                    break;
                case -1416938757:
                case 211338194:
                    jM14118 = j9;
                    interfaceC20157Arr5 = interfaceC20157Arr27;
                    interfaceC20157Arr6 = interfaceC20157Arr26;
                    i105 = i96;
                    i13 = i99 + 1;
                    i12 = i98;
                    int iM113016 = (ThreadFactoryC3888.m11306("۟۟") + i86) * 97;
                    i90 = i90;
                    i101 = i101;
                    i98 = i12;
                    i97 = i97;
                    i99 = i13;
                    i91 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr5;
                    interfaceC20157Arr23 = interfaceC20157Arr6;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    interfaceC20157Arr25 = interfaceC20157Arr25;
                    i87 = ((iM113016 ^ i85) * (-15949)) ^ 1399791806;
                    i93 = i93;
                    i88 = iM113016 ^ 1358525057;
                    jArr4 = jArr4;
                    long j116 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j116;
                    break;
                case -1403743407:
                case 354914291:
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    int i117 = length4;
                    i89 = i89;
                    int i118 = i90;
                    long j27 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j27;
                    long[] jArr8 = new long[1024];
                    i44 = i118;
                    interfaceC20157.mo5911(i103, i104, jArr8);
                    int length5 = interfaceC20157Arr22.length;
                    if (C0629.f2722 > 0) {
                        int iM450221 = C19806.m45029("ܽ᩹") ^ i85;
                        int i119 = ((iM450221 ^ i86) * (-25427)) ^ (-779420169);
                        jArr3 = jArr8;
                        i90 = i44;
                        i93 = i93;
                        i101 = 1024;
                        i88 = iM450221 ^ (-2135785489);
                        i102 = length5;
                        length4 = i117;
                        i87 = i119;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    } else {
                        i102 = length5;
                        jArr3 = jArr8;
                        length4 = i117;
                        interfaceC20157Arr14 = interfaceC20157Arr23;
                        i39 = i99;
                        interfaceC20157Arr16 = interfaceC20157Arr25;
                        interfaceC20157Arr15 = interfaceC20157Arr27;
                        i40 = i91;
                        jArr = jArr4;
                        i41 = i97;
                        i38 = i105;
                        i42 = i98;
                        i43 = 1024;
                        iM450214 = (C19806.m45029("ܿܽ") + i86) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i45 = ((iM450214 ^ i85) * (-507)) ^ 2078067677;
                        i46 = 728852618;
                        int i1110 = iM450214 ^ i46;
                        i105 = i38;
                        jArr4 = jArr;
                        i90 = i44;
                        interfaceC20157Arr25 = interfaceC20157Arr16;
                        i101 = i43;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i98 = i42;
                        i97 = i41;
                        i99 = i39;
                        i93 = i93;
                        i88 = i1110;
                        i87 = i45;
                        i91 = i40;
                        interfaceC20157Arr27 = interfaceC20157Arr15;
                        interfaceC20157Arr23 = interfaceC20157Arr14;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    }
                    break;
                case -1291442847:
                case -451998377:
                    i92 = i92;
                    i93 = i93;
                    i101 = i101;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    long j28 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j28;
                    objArrCopyOf = Arrays.copyOf(interfaceC20157Arr27, interfaceC20157Arr27.length + 1);
                    if (C1419.f5860 >= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("۫ܺ") ^ i85;
                        i19 = ((iM450211 ^ i86) * (-963)) ^ 1816266905;
                        i20 = -731686289;
                    } else {
                        iM450211 = C19806.m45029("ۤ᩶") ^ i86;
                        i19 = ((iM450211 ^ i85) * 1817) ^ 858039576;
                        i20 = -1644044906;
                    }
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    i33 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i101;
                    i93 = i93;
                    i88 = iM450211 ^ i20;
                    i87 = i19;
                    i91 = i33;
                    long j117 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j117;
                    break;
                case -1278884491:
                case -589870980:
                    interfaceC20157Arr28[i90] = interfaceC20159;
                    i80 = i90 + 1;
                    i75 = i93;
                    jMax = j10;
                    j4 = j9;
                    iM450216 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i85;
                    i76 = ((iM450216 ^ i86) * 2983) ^ (-930739983);
                    i77 = 1231542598;
                    i37 = i75;
                    i88 = iM450216 ^ i77;
                    i87 = i76;
                    j9 = j4;
                    j10 = jMax;
                    i93 = i37;
                    break;
                case -1260472879:
                case 1909620507:
                    j10 = j10;
                    jM14118 = j6 + 48;
                    length4 = interfaceC20157Arr24.length;
                    i94 = 0;
                    int iM113017 = (ThreadFactoryC3888.m11306("᩸ۖ") ^ i86) * 33;
                    i87 = ((iM113017 ^ i85) * 13489) ^ 1958912204;
                    i31 = iM113017 ^ (-2045494929);
                    i93 = i93;
                    i88 = i31;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    j3 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case -1155985669:
                case 476992707:
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i34 = length4;
                    i89 = i89;
                    long j29 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j29;
                    j6 = 96 * j5;
                    if (C1148.m4232() > 0) {
                        iM450213 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i86) * 83;
                        i35 = ((iM450213 ^ i85) * (-17017)) ^ (-996889341);
                        i36 = -2072713434;
                        i31 = iM450213 ^ i36;
                        length4 = i34;
                        i87 = i35;
                        i93 = i93;
                        i88 = i31;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    } else {
                        length4 = i34;
                        interfaceC20157Arr14 = interfaceC20157Arr23;
                        i39 = i99;
                        interfaceC20157Arr16 = interfaceC20157Arr25;
                        interfaceC20157Arr15 = interfaceC20157Arr27;
                        i40 = i91;
                        jArr = jArr4;
                        i41 = i97;
                        i38 = i105;
                        i42 = i98;
                        i43 = i101;
                        i44 = i90;
                        iM450214 = (C19806.m45029("ܿܽ") + i86) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i45 = ((iM450214 ^ i85) * (-507)) ^ 2078067677;
                        i46 = 728852618;
                        int i1111 = iM450214 ^ i46;
                        i105 = i38;
                        jArr4 = jArr;
                        i90 = i44;
                        interfaceC20157Arr25 = interfaceC20157Arr16;
                        i101 = i43;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i98 = i42;
                        i97 = i41;
                        i99 = i39;
                        i93 = i93;
                        i88 = i1111;
                        i87 = i45;
                        i91 = i40;
                        interfaceC20157Arr27 = interfaceC20157Arr15;
                        interfaceC20157Arr23 = interfaceC20157Arr14;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    }
                    break;
                case -1150325594:
                case 766862343:
                    i72 = i89 + 1;
                    i92 = 1024;
                    i70 = i103;
                    i71 = i104;
                    int iM113018 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i86) * (-105);
                    int i120 = i72;
                    int i121 = ((iM113018 ^ i85) * (-7223)) ^ 129248745;
                    int i122 = iM113018 ^ 1879692220;
                    length4 = length4;
                    i87 = i121;
                    i89 = i120;
                    i104 = i71;
                    i103 = i70;
                    j9 = j9;
                    j10 = j10;
                    i93 = i93;
                    i88 = i122;
                    break;
                case -1149425308:
                case 980255252:
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i24 = length4;
                    i89 = i89;
                    i25 = i90;
                    int i123 = length3;
                    long j30 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j30;
                    if (i95 >= i123) {
                        length3 = i123;
                        iM450212 = (i86 - C19806.m45029("ۖܳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i28 = ((iM450212 ^ i85) * 6253) ^ (-1320435381);
                        i29 = -777398705;
                        i31 = iM450212 ^ i29;
                        length4 = i24;
                        i87 = i28;
                        i90 = i25;
                        i93 = i93;
                        i88 = i31;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    } else {
                        iM11306 = (i85 - C19806.m45029("ۚۗ")) * (-79);
                        length3 = i123;
                        i26 = ((iM11306 ^ i86) * 22073) ^ 179150952;
                        i27 = -1610953881;
                        i30 = iM11306 ^ i27;
                        length4 = i24;
                        i87 = i26;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i32 = i93;
                        i88 = i30;
                        i90 = i25;
                        i93 = i32;
                        long j118 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j118;
                    }
                    break;
                case -1109053001:
                case 1420776645:
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i24 = length4;
                    i89 = i89;
                    i25 = i90;
                    int i124 = length2;
                    long j31 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j31;
                    if (i91 >= i124) {
                        length2 = i124;
                        iM450212 = (C19806.m45029("֡᩶") + i86) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i28 = ((iM450212 ^ i85) * 27375) ^ 858735918;
                        i29 = 1491085739;
                        i31 = iM450212 ^ i29;
                        length4 = i24;
                        i87 = i28;
                        i90 = i25;
                        i93 = i93;
                        i88 = i31;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰᩳ") + i85) * (-97);
                        length2 = i124;
                        i26 = ((iM11306 ^ i86) * 26097) ^ 29656961;
                        i27 = 1917748555;
                        i30 = iM11306 ^ i27;
                        length4 = i24;
                        i87 = i26;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i32 = i93;
                        i88 = i30;
                        i90 = i25;
                        i93 = i32;
                        long j119 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j119;
                    }
                    break;
                case -1031819074:
                case 1267027054:
                    if (c5070M14121.m14138(i93, i83 - i93) > j9) {
                        i92 = i92;
                        i93 = i93;
                        i101 = i101;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i89 = i89;
                        i90 = i90;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i91 = i91;
                        long j32 = j9;
                        i103 = i103;
                        i104 = i104;
                        j10 = j10;
                        jM14118 = j32;
                        iM450211 = C19806.m45029("ۤܿ") ^ i85;
                        i19 = ((iM450211 ^ i86) * 10603) ^ 1393430726;
                        i20 = 158180294;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                        i91 = i33;
                        long j1110 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j1110;
                    } else {
                        iM45029 = C19806.m45029("۟ۨ") ^ i85;
                        i = ((iM45029 ^ i86) * 20363) ^ 860201585;
                        i2 = 1169782473;
                        i88 = iM45029 ^ i2;
                        i87 = i;
                    }
                    break;
                case -1001418553:
                case -342468719:
                    C3743.m10966();
                    return null;
                case -980862536:
                case 974577656:
                    long j33 = j10;
                    jM14118 = j9;
                    i91++;
                    j10 = j33;
                    int iM113019 = (ThreadFactoryC3888.m11306("֫ۤ") + i86) * 11;
                    length4 = length4;
                    i87 = ((iM113019 ^ i85) * (-1777)) ^ 174023606;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    i32 = i93;
                    i88 = iM113019 ^ (-227088671);
                    i90 = i90;
                    i101 = i101;
                    i93 = i32;
                    long j1111 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j1111;
                    break;
                case -963524444:
                case -108035579:
                    i17 = i92;
                    i18 = i93;
                    interfaceC20157Arr10 = interfaceC20157Arr22;
                    long j34 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j34;
                    interfaceC20157Arr11 = interfaceC20157Arr10;
                    i81 = 65536;
                    int iM113020 = (ThreadFactoryC3888.m11306("ۜۡ") ^ i85) * 29;
                    InterfaceC20157[] interfaceC20157Arr34 = interfaceC20157Arr11;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr10;
                    i92 = i17;
                    interfaceC20157Arr12 = interfaceC20157Arr25;
                    i87 = ((iM113020 ^ i86) * (-5441)) ^ 233198102;
                    i90 = i90;
                    i101 = i101;
                    i98 = i98;
                    i97 = i97;
                    i99 = i99;
                    i93 = i18;
                    i88 = iM113020 ^ 816856740;
                    interfaceC20157Arr23 = interfaceC20157Arr23;
                    i91 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr34;
                    i105 = i105;
                    jArr4 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr12;
                    long j1112 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j1112;
                    break;
                case -951722674:
                case -632509871:
                    i75 = i93;
                    InterfaceC20157 interfaceC201510 = interfaceC20157Arr24[i94];
                    j4 = j9;
                    jMax = Math.max(interfaceC201510.mo5917(), interfaceC201510.mo5910());
                    if (C19806.f63586) {
                        iM450216 = ThreadFactoryC3888.m11306("ܶۜ") ^ i86;
                        i76 = ((iM450216 ^ i85) * (-1065)) ^ (-1036192966);
                        i77 = -720581697;
                    } else {
                        iM450216 = (C19806.m45029("ܳ֫") ^ i86) * 97;
                        i76 = ((iM450216 ^ i85) * (-15549)) ^ (-473175185);
                        i77 = -1750052725;
                    }
                    i37 = i75;
                    i88 = iM450216 ^ i77;
                    i87 = i76;
                    j9 = j4;
                    j10 = jMax;
                    i93 = i37;
                    break;
                case -893640732:
                case -283380132:
                    i83 = i81 + i93;
                    iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i86;
                    i = ((iM45029 ^ i85) * 28167) ^ (-1257239164);
                    i2 = 1488046442;
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case -815027119:
                case 1404076274:
                    i92 = i92;
                    i93 = i93;
                    i101 = i101;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    long j35 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j35;
                    length = interfaceC20157Arr27.length + 1;
                    if (C19806.f63586) {
                        iM450211 = ThreadFactoryC3888.m11306("۟ܺ") ^ i85;
                        i19 = ((iM450211 ^ i86) * 27599) ^ 239109774;
                        i20 = 2042305557;
                    } else {
                        iM450211 = C19806.m45029("ۙۘ") ^ i85;
                        i19 = ((iM450211 ^ i86) * (-31809)) ^ 894307736;
                        i20 = -1867761993;
                    }
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    i33 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i101;
                    i93 = i93;
                    i88 = iM450211 ^ i20;
                    i87 = i19;
                    i91 = i33;
                    long j1113 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j1113;
                    break;
                case -806146684:
                case 2138782576:
                    i92 = i92;
                    i93 = i93;
                    i21 = length;
                    i101 = i101;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    long j36 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j36;
                    interfaceC20157Arr24 = (InterfaceC20157[]) Arrays.copyOf(interfaceC20157Arr27, i21);
                    if (C2788.f10625 >= 0) {
                        int iM113021 = (i85 - ThreadFactoryC3888.m11306("ۤ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        length = i21;
                        i87 = ((iM113021 ^ i86) * (-27057)) ^ 1396446355;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM113021 ^ (-1887104622);
                    } else {
                        length = i21;
                        iM450211 = (C19806.m45029("۬۠") + i85) * 79;
                        i19 = ((iM450211 ^ i86) * 27057) ^ 1844662391;
                        i20 = -1728545816;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                    }
                    i91 = i33;
                    long j1114 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j1114;
                    break;
                case -753318809:
                case 522109134:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i86 - ThreadFactoryC3888.m11306("۟ܿ")) * (-47);
                        i = ((iM45029 ^ i85) * 20847) ^ (-1029339798);
                        i2 = 2097997997;
                        i88 = iM45029 ^ i2;
                        i87 = i;
                    } else {
                        i75 = i93;
                        jMax = j10;
                        j4 = j9;
                        iM450216 = ThreadFactoryC3888.m11306("ܶۜ") ^ i86;
                        i76 = ((iM450216 ^ i85) * (-1065)) ^ (-1036192966);
                        i77 = -720581697;
                        i37 = i75;
                        i88 = iM450216 ^ i77;
                        i87 = i76;
                        j9 = j4;
                        j10 = jMax;
                        i93 = i37;
                    }
                    break;
                case -717354703:
                case 1724448616:
                    long j37 = j9;
                    i67 = i103;
                    jM14118 = j37;
                    i68 = i67 + i100;
                    int iM1130110 = (ThreadFactoryC3888.m11306("֡֫") ^ i85) * 119;
                    i69 = ((iM1130110 ^ i86) * (-16979)) ^ (-2035974197);
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    j3 = j10;
                    i104 = i68;
                    i103 = i67;
                    i90 = i90;
                    i101 = i101;
                    i93 = i93;
                    i88 = iM1130110 ^ 1748595085;
                    i87 = i69;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case -680407391:
                case 1865152894:
                    if (C2704.m8255() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i85) * 61;
                        i = ((iM45029 ^ i86) * (-7503)) ^ (-675483740);
                        i2 = -502713850;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۖ") ^ i86;
                        i = ((iM45029 ^ i85) * 3673) ^ (-1845530431);
                        i2 = 265254337;
                    }
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case -605797056:
                case 2073674782:
                    i49 = i92;
                    i50 = i93;
                    i52 = i99;
                    interfaceC20157Arr17 = interfaceC20157Arr25;
                    interfaceC20157Arr18 = interfaceC20157Arr22;
                    i54 = i89;
                    jArr2 = jArr4;
                    int i125 = i97;
                    i56 = i105;
                    i51 = i98;
                    i53 = i101;
                    i55 = i90;
                    InterfaceC20157[] interfaceC20157Arr35 = interfaceC20157Arr27;
                    i57 = i91;
                    InterfaceC20157[] interfaceC20157Arr36 = interfaceC20157Arr23;
                    interfaceC20157Arr19 = interfaceC20157Arr35;
                    long j38 = j9;
                    int i126 = i103;
                    i58 = i104;
                    j = j10;
                    j2 = j38;
                    if (interfaceC20157Arr18.length == 0) {
                        interfaceC20157Arr20 = interfaceC20157Arr36;
                        i59 = i126;
                        i60 = i125;
                        int iM113022 = (ThreadFactoryC3888.m11306("᩻ۙ") + i85) * (-47);
                        int i127 = ((iM113022 ^ i86) * 24943) ^ (-871740502);
                        i99 = i52;
                        i90 = i55;
                        i93 = i50;
                        i88 = iM113022 ^ 256382067;
                        i101 = i53;
                        i89 = i54;
                        interfaceC20157Arr22 = interfaceC20157Arr18;
                        i92 = i49;
                        i98 = i51;
                        i97 = i60;
                        i105 = i56;
                        jArr4 = jArr2;
                        interfaceC20157Arr25 = interfaceC20157Arr17;
                        i87 = i127;
                        long j39 = j;
                        i103 = i59;
                        i104 = i58;
                        i91 = i57;
                        j9 = j2;
                        interfaceC20157Arr27 = interfaceC20157Arr19;
                        j10 = j39;
                        interfaceC20157Arr23 = interfaceC20157Arr20;
                    } else {
                        int iM450222 = (i85 - C19806.m45029("ᩳۘ")) * (-5);
                        int i128 = ((iM450222 ^ i86) * (-97)) ^ (-73773500);
                        i89 = i54;
                        interfaceC20157Arr22 = interfaceC20157Arr18;
                        i92 = i49;
                        i88 = iM450222 ^ 1239362339;
                        i90 = i55;
                        i101 = i53;
                        i98 = i51;
                        i97 = i125;
                        i99 = i52;
                        i93 = i50;
                        interfaceC20157Arr25 = interfaceC20157Arr17;
                        i87 = i128;
                        i105 = i56;
                        jArr4 = jArr2;
                        interfaceC20157Arr23 = interfaceC20157Arr36;
                        i91 = i57;
                        interfaceC20157Arr27 = interfaceC20157Arr19;
                        i103 = i126;
                        i104 = i58;
                        j9 = j2;
                        j10 = j;
                    }
                    break;
                case -484701539:
                case 468499757:
                    i92 = i92;
                    i93 = i93;
                    i61 = i99;
                    interfaceC20157Arr21 = interfaceC20157Arr25;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    jArr4 = jArr4;
                    i97 = i97;
                    i62 = i98;
                    i63 = i101;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    long j40 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j40;
                    if (interfaceC20157Arr27.length < 256) {
                        iM450215 = (i86 - ThreadFactoryC3888.m11306("֨ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i64 = ((iM450215 ^ i85) * (-3623)) ^ 1752993179;
                        i65 = 777386450;
                    } else {
                        iM450215 = ThreadFactoryC3888.m11306("ۜۢ") ^ i85;
                        i64 = ((iM450215 ^ i86) * 26855) ^ 215200909;
                        i65 = 181927945;
                    }
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    int i1011 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i63;
                    i98 = i62;
                    i97 = i97;
                    i99 = i61;
                    i93 = i93;
                    i88 = iM450215 ^ i65;
                    i91 = i1011;
                    long[] jArr9 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr21;
                    i87 = i64;
                    jArr4 = jArr9;
                    long j1115 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j1115;
                    break;
                case -385378947:
                case 1487430453:
                    i12 = i98;
                    interfaceC20157Arr5 = interfaceC20157Arr27;
                    jM14118 = j9;
                    interfaceC20157Arr6 = null;
                    i13 = 0;
                    i105 = 0;
                    int iM1130111 = (ThreadFactoryC3888.m11306("۟۟") + i86) * 97;
                    i90 = i90;
                    i101 = i101;
                    i98 = i12;
                    i97 = i97;
                    i99 = i13;
                    i91 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr5;
                    interfaceC20157Arr23 = interfaceC20157Arr6;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    interfaceC20157Arr25 = interfaceC20157Arr25;
                    i87 = ((iM1130111 ^ i85) * (-15949)) ^ 1399791806;
                    i93 = i93;
                    i88 = iM1130111 ^ 1358525057;
                    jArr4 = jArr4;
                    long j1116 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j1116;
                    break;
                case -378164690:
                case -160222927:
                    RunnableC1606.m5473();
                    if (C1937.f7317 >= 0) {
                        i75 = i93;
                        jMax = j10;
                        j4 = j9;
                        iM450216 = ThreadFactoryC3888.m11306("ܶۜ") ^ i86;
                        i76 = ((iM450216 ^ i85) * (-1065)) ^ (-1036192966);
                        i77 = -720581697;
                        i37 = i75;
                        i88 = iM450216 ^ i77;
                        i87 = i76;
                        j9 = j4;
                        j10 = jMax;
                        i93 = i37;
                    } else {
                        i92 = i92;
                        i93 = i93;
                        interfaceC20157Arr14 = interfaceC20157Arr23;
                        i39 = i99;
                        interfaceC20157Arr15 = interfaceC20157Arr27;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i89 = i89;
                        i40 = i91;
                        i41 = i97;
                        i42 = i98;
                        interfaceC20157Arr16 = interfaceC20157Arr25;
                        i43 = i101;
                        i44 = i90;
                        jArr = jArr4;
                        i38 = i105;
                        long j210 = j9;
                        i103 = i103;
                        i104 = i104;
                        j10 = j10;
                        jM14118 = j210;
                        iM450214 = (C19806.m45029("ܿܽ") + i86) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i45 = ((iM450214 ^ i85) * (-507)) ^ 2078067677;
                        i46 = 728852618;
                        int i1112 = iM450214 ^ i46;
                        i105 = i38;
                        jArr4 = jArr;
                        i90 = i44;
                        interfaceC20157Arr25 = interfaceC20157Arr16;
                        i101 = i43;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i98 = i42;
                        i97 = i41;
                        i99 = i39;
                        i93 = i93;
                        i88 = i1112;
                        i87 = i45;
                        i91 = i40;
                        interfaceC20157Arr27 = interfaceC20157Arr15;
                        interfaceC20157Arr23 = interfaceC20157Arr14;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    }
                    break;
                case -238235043:
                case -119536686:
                    i92 = i92;
                    i93 = i93;
                    InterfaceC20157[] interfaceC20157Arr37 = interfaceC20157Arr23;
                    int i129 = i99;
                    InterfaceC20157[] interfaceC20157Arr38 = interfaceC20157Arr25;
                    InterfaceC20157[] interfaceC20157Arr39 = interfaceC20157Arr27;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    int i130 = i91;
                    long[] jArr10 = jArr4;
                    int i131 = i97;
                    int i132 = i105;
                    int i133 = i98;
                    int i134 = i101;
                    int i135 = i90;
                    long j41 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j41;
                    if (i129 < interfaceC20157Arr38.length) {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i86;
                        i47 = ((iM11307 ^ i85) * 7741) ^ (-148917492);
                        i48 = -1524630022;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ֨") ^ i85;
                        i47 = ((iM11307 ^ i86) * (-21983)) ^ 1376106319;
                        i48 = 1680098796;
                    }
                    i31 = iM11307 ^ i48;
                    i105 = i132;
                    jArr4 = jArr10;
                    i90 = i135;
                    interfaceC20157Arr25 = interfaceC20157Arr38;
                    i87 = i47;
                    i101 = i134;
                    i91 = i130;
                    i98 = i133;
                    interfaceC20157Arr27 = interfaceC20157Arr39;
                    i97 = i131;
                    interfaceC20157Arr23 = interfaceC20157Arr37;
                    i99 = i129;
                    i93 = i93;
                    i88 = i31;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    j3 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case -206724117:
                case 1921622978:
                    int i136 = i93;
                    jMax = j10;
                    int i137 = length4;
                    j4 = j9;
                    if (i94 < i137) {
                        iM11308 = (C19806.m45029("ᩳۚ") ^ i86) * 123;
                        i73 = ((iM11308 ^ i85) * 30561) ^ 643467355;
                        i74 = -1149287091;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("۠᩹") ^ i85;
                        i73 = ((iM11308 ^ i86) * 5363) ^ (-1876061028);
                        i74 = -1286101210;
                    }
                    int i138 = iM11308 ^ i74;
                    length4 = i137;
                    i87 = i73;
                    i37 = i136;
                    i88 = i138;
                    j9 = j4;
                    j10 = jMax;
                    i93 = i37;
                    break;
                case -177393427:
                case 1551933031:
                    long j42 = j10;
                    jM14118 = j9;
                    int i139 = c5070M14121.f17670;
                    if (i139 > 2147418111) {
                        iM450217 = (ThreadFactoryC3888.m11306("֫᩷") + i85) * 79;
                        i69 = ((iM450217 ^ i86) * 18885) ^ 468198944;
                        i78 = 2048628764;
                    } else {
                        iM450217 = (i86 - C19806.m45029("ۘۢ")) * (-111);
                        i69 = ((iM450217 ^ i85) * (-20381)) ^ (-36631205);
                        i78 = 736307389;
                    }
                    i88 = iM450217 ^ i78;
                    j3 = j42;
                    i93 = i139;
                    i87 = i69;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case -133703585:
                case 1832252770:
                    i70 = i103;
                    i71 = i104;
                    interfaceC20159.mo5911(i70, i71, jArr4);
                    i72 = 0;
                    i92 = i82;
                    int iM1130112 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i86) * (-105);
                    int i1210 = i72;
                    int i1211 = ((iM1130112 ^ i85) * (-7223)) ^ 129248745;
                    int i1212 = iM1130112 ^ 1879692220;
                    length4 = length4;
                    i87 = i1211;
                    i89 = i1210;
                    i104 = i71;
                    i103 = i70;
                    j9 = j9;
                    j10 = j10;
                    i93 = i93;
                    i88 = i1212;
                    break;
                case 36852756:
                case 1657206237:
                    i17 = i92;
                    i18 = i93;
                    int i140 = length4;
                    long j43 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j43;
                    i79 = 65536;
                    interfaceC20157Arr10 = interfaceC20157Arr22;
                    if (i90 != interfaceC20157Arr10.length) {
                        int iM113023 = (i85 - ThreadFactoryC3888.m11306("᩵ۡ")) * (-27);
                        length4 = i140;
                        i87 = ((iM113023 ^ i86) * 21529) ^ 1607886654;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr10;
                        i92 = i17;
                        i32 = i18;
                        i88 = iM113023 ^ (-355912952);
                        i93 = i32;
                        long j1117 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j1117;
                    } else {
                        length4 = i140;
                        i81 = 65536;
                        interfaceC20157Arr11 = interfaceC20157Arr10;
                        int iM113024 = (ThreadFactoryC3888.m11306("ۜۡ") ^ i85) * 29;
                        InterfaceC20157[] interfaceC20157Arr310 = interfaceC20157Arr11;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr10;
                        i92 = i17;
                        interfaceC20157Arr12 = interfaceC20157Arr25;
                        i87 = ((iM113024 ^ i86) * (-5441)) ^ 233198102;
                        i90 = i90;
                        i101 = i101;
                        i98 = i98;
                        i97 = i97;
                        i99 = i99;
                        i93 = i18;
                        i88 = iM113024 ^ 816856740;
                        interfaceC20157Arr23 = interfaceC20157Arr23;
                        i91 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr310;
                        i105 = i105;
                        jArr4 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr12;
                        long j1118 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j1118;
                    }
                    break;
                case 80506839:
                case 532466494:
                    InterfaceC20157[] interfaceC20157Arr40 = (InterfaceC20157[]) objArrCopyOf;
                    interfaceC20157Arr40[interfaceC20157Arr27.length] = interfaceC20157;
                    return m14121(i103, interfaceC20157Arr40);
                case 155227449:
                case 1821876366:
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i34 = length4;
                    i89 = i89;
                    long j44 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j44;
                    if (!(interfaceC20157Arr24[i91] instanceof C17334)) {
                        length4 = i34;
                        i101 = i101;
                        i90 = i90;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i91 = i91;
                        iM450211 = C19806.m45029("ۤܿ") ^ i85;
                        i19 = ((iM450211 ^ i86) * 10603) ^ 1393430726;
                        i20 = 158180294;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                        i91 = i33;
                        long j1119 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j1119;
                    } else {
                        iM450213 = (C19806.m45029("ܽ᩵") + i85) * (-121);
                        i35 = ((iM450213 ^ i86) * (-21255)) ^ 1761671723;
                        i36 = -1735246808;
                        i31 = iM450213 ^ i36;
                        length4 = i34;
                        i87 = i35;
                        i93 = i93;
                        i88 = i31;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        j3 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j3;
                    }
                    break;
                case 199077134:
                case 2019099972:
                    jArr = jArr4;
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr14 = interfaceC20157Arr23;
                    i38 = i105;
                    i39 = i99;
                    interfaceC20157Arr15 = interfaceC20157Arr27;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    i40 = i91;
                    i41 = i97;
                    i42 = i98;
                    i43 = i101;
                    i44 = i90;
                    long j45 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j45;
                    interfaceC20157Arr16 = this.f17671;
                    if (C2249.f8050 >= 0) {
                        iM450214 = (C19806.m45029("ܿܽ") + i86) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i45 = ((iM450214 ^ i85) * (-507)) ^ 2078067677;
                        i46 = 728852618;
                    } else {
                        iM450214 = C19806.m45029("ۚ۟") ^ i85;
                        i45 = ((iM450214 ^ i86) * 15209) ^ (-1446355421);
                        i46 = 1241000983;
                    }
                    int i1113 = iM450214 ^ i46;
                    i105 = i38;
                    jArr4 = jArr;
                    i90 = i44;
                    interfaceC20157Arr25 = interfaceC20157Arr16;
                    i101 = i43;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    i98 = i42;
                    i97 = i41;
                    i99 = i39;
                    i93 = i93;
                    i88 = i1113;
                    i87 = i45;
                    i91 = i40;
                    interfaceC20157Arr27 = interfaceC20157Arr15;
                    interfaceC20157Arr23 = interfaceC20157Arr14;
                    j3 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case 202560355:
                case 617567421:
                    i92 = i92;
                    i93 = i93;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    int i141 = length4;
                    i89 = i89;
                    long j46 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j46;
                    c5070M14121 = m14121(i103, interfaceC20157Arr24);
                    i25 = i90;
                    long length6 = interfaceC20157Arr24.length;
                    if (C0629.f2722 > 0) {
                        int iM450223 = C19806.m45029("ܰ֫") ^ i85;
                        i26 = ((iM450223 ^ i86) * (-28017)) ^ (-1437946840);
                        i30 = iM450223 ^ 1422802008;
                        length4 = i141;
                        j5 = length6;
                        i87 = i26;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i32 = i93;
                        i88 = i30;
                        i90 = i25;
                        i93 = i32;
                        long j11110 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j11110;
                    } else {
                        j5 = length6;
                        length4 = i141;
                        i21 = length;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i91 = i91;
                        int i142 = i101;
                        i90 = i25;
                        i101 = i142;
                        int iM113025 = (i85 - ThreadFactoryC3888.m11306("ۤ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        length = i21;
                        i87 = ((iM113025 ^ i86) * (-27057)) ^ 1396446355;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM113025 ^ (-1887104622);
                        i91 = i33;
                        long j11111 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j11111;
                    }
                    break;
                case 376012163:
                case 1268633061:
                    if ((j7 & j8) != 0) {
                        iM45029 = C19806.m45029("᩶۬") ^ i85;
                        i = ((iM45029 ^ i86) * 23027) ^ 2053638254;
                        i2 = 1544628379;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩸") ^ i86;
                        i = ((iM45029 ^ i85) * (-4581)) ^ (-388887855);
                        i2 = -1216815985;
                    }
                    i88 = iM45029 ^ i2;
                    i87 = i;
                    break;
                case 449671159:
                case 907765442:
                    i49 = i92;
                    i50 = i93;
                    i51 = i98;
                    i52 = i99;
                    interfaceC20157Arr17 = interfaceC20157Arr25;
                    i53 = i101;
                    interfaceC20157Arr18 = interfaceC20157Arr22;
                    i54 = i89;
                    i55 = i90;
                    jArr2 = jArr4;
                    i56 = i105;
                    InterfaceC20157[] interfaceC20157Arr41 = interfaceC20157Arr27;
                    i57 = i91;
                    InterfaceC20157[] interfaceC20157Arr42 = interfaceC20157Arr23;
                    interfaceC20157Arr19 = interfaceC20157Arr41;
                    i58 = i104;
                    j = j10;
                    j2 = j9;
                    int length7 = interfaceC20157Arr18.length;
                    i100 = 65536;
                    interfaceC20157Arr20 = interfaceC20157Arr42;
                    i59 = this.f17670;
                    if (length7 >= 256) {
                        int iM113026 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i86;
                        i105 = i56;
                        i99 = i52;
                        jArr4 = jArr2;
                        i90 = i55;
                        i93 = i50;
                        i88 = iM113026 ^ (-514340719);
                        interfaceC20157Arr25 = interfaceC20157Arr17;
                        i87 = ((iM113026 ^ i85) * (-31811)) ^ 1946433125;
                        i101 = i53;
                        i89 = i54;
                        interfaceC20157Arr22 = interfaceC20157Arr18;
                        i92 = i49;
                        i98 = i51;
                        i97 = 2147418111;
                    } else {
                        i60 = 2147418111;
                        int iM113027 = (ThreadFactoryC3888.m11306("᩻ۙ") + i85) * (-47);
                        int i1213 = ((iM113027 ^ i86) * 24943) ^ (-871740502);
                        i99 = i52;
                        i90 = i55;
                        i93 = i50;
                        i88 = iM113027 ^ 256382067;
                        i101 = i53;
                        i89 = i54;
                        interfaceC20157Arr22 = interfaceC20157Arr18;
                        i92 = i49;
                        i98 = i51;
                        i97 = i60;
                        i105 = i56;
                        jArr4 = jArr2;
                        interfaceC20157Arr25 = interfaceC20157Arr17;
                        i87 = i1213;
                    }
                    long j310 = j;
                    i103 = i59;
                    i104 = i58;
                    i91 = i57;
                    j9 = j2;
                    interfaceC20157Arr27 = interfaceC20157Arr19;
                    j10 = j310;
                    interfaceC20157Arr23 = interfaceC20157Arr20;
                    break;
                case 558123102:
                case 1070695782:
                    i3 = i92;
                    i4 = i93;
                    i5 = i99;
                    interfaceC20157Arr2 = interfaceC20157Arr25;
                    interfaceC20157Arr8 = interfaceC20157Arr22;
                    i7 = i89;
                    jArr4 = jArr4;
                    i10 = i97;
                    i105 = i105;
                    i14 = i98;
                    i6 = i101;
                    i8 = i90;
                    InterfaceC20157[] interfaceC20157Arr43 = interfaceC20157Arr27;
                    i9 = i91;
                    interfaceC20157Arr9 = interfaceC20157Arr23;
                    interfaceC20157Arr3 = interfaceC20157Arr43;
                    long j47 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j47;
                    InterfaceC20157 interfaceC201511 = interfaceC20157Arr2[i5];
                    if (!interfaceC201511.mo5916(interfaceC20157)) {
                        iM450210 = (C19806.m45029("᩻᩸") ^ i85) * (-73);
                        interfaceC20158 = interfaceC201511;
                        i15 = ((iM450210 ^ i86) * 31721) ^ 913872799;
                        i16 = -1185887728;
                        int i1012 = iM450210 ^ i16;
                        i105 = i105;
                        jArr4 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr2;
                        i87 = i15;
                        i90 = i8;
                        i101 = i6;
                        i98 = i14;
                        i97 = i10;
                        i99 = i5;
                        i93 = i4;
                        i88 = i1012;
                        i89 = i7;
                        interfaceC20157Arr22 = interfaceC20157Arr8;
                        i92 = i3;
                        InterfaceC20157[] interfaceC20157Arr311 = interfaceC20157Arr3;
                        interfaceC20157Arr23 = interfaceC20157Arr9;
                        i91 = i9;
                        interfaceC20157Arr27 = interfaceC20157Arr311;
                        long j11112 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j11112;
                    } else {
                        int iM113028 = (ThreadFactoryC3888.m11306("֫ۙ") ^ i86) * 51;
                        int i143 = ((iM113028 ^ i85) * 32159) ^ 1542616653;
                        int i144 = iM113028 ^ (-499864782);
                        i105 = i105;
                        jArr4 = jArr4;
                        interfaceC20157Arr25 = interfaceC20157Arr2;
                        i87 = i143;
                        i89 = i7;
                        interfaceC20157Arr22 = interfaceC20157Arr8;
                        i92 = i3;
                        interfaceC20158 = interfaceC201511;
                        i90 = i8;
                        i101 = i6;
                        i98 = i14;
                        i97 = i10;
                        i99 = i5;
                        i93 = i4;
                        i88 = i144;
                        interfaceC20157Arr23 = interfaceC20157Arr9;
                        i91 = i9;
                        interfaceC20157Arr27 = interfaceC20157Arr3;
                        long j11113 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j11113;
                    }
                    break;
                case 623964931:
                case 2102692316:
                    i92 = i92;
                    i93 = i93;
                    i61 = i99;
                    interfaceC20157Arr21 = interfaceC20157Arr25;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i89 = i89;
                    jArr4 = jArr4;
                    i97 = i97;
                    i62 = i98;
                    i63 = i101;
                    i90 = i90;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i91 = i91;
                    long j48 = j9;
                    i103 = i103;
                    i104 = i104;
                    j10 = j10;
                    jM14118 = j48;
                    if (interfaceC20157Arr23 != null) {
                        iM450215 = (C19806.m45029("᩹֫") ^ i85) * 55;
                        i64 = ((iM450215 ^ i86) * (-4165)) ^ 344325596;
                        i65 = 257206872;
                    } else {
                        interfaceC20157Arr26 = interfaceC20157Arr23;
                        i96 = i105;
                        iM450215 = C19806.m45029("ܺۨ") ^ i86;
                        i64 = ((iM450215 ^ i85) * 16373) ^ 862301312;
                        i65 = -1772787857;
                    }
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    int i1013 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i63;
                    i98 = i62;
                    i97 = i97;
                    i99 = i61;
                    i93 = i93;
                    i88 = iM450215 ^ i65;
                    i91 = i1013;
                    long[] jArr11 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr21;
                    i87 = i64;
                    jArr4 = jArr11;
                    long j11114 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j11114;
                    break;
                case 703104021:
                case 1001672984:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C2477.m7593() < 0) {
                        i92 = i92;
                        i93 = i93;
                        i101 = i101;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i89 = i89;
                        i90 = i90;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i91 = i91;
                        long j49 = j9;
                        i103 = i103;
                        i104 = i104;
                        j10 = j10;
                        jM14118 = j49;
                        iM450211 = ThreadFactoryC3888.m11306("۟ܺ") ^ i85;
                        i19 = ((iM450211 ^ i86) * 27599) ^ 239109774;
                        i20 = 2042305557;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                        i91 = i33;
                        long j11115 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j11115;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") + i86) * 7;
                        i = ((iM45029 ^ i85) * (-30779)) ^ (-233878027);
                        i2 = -321727909;
                        i88 = iM45029 ^ i2;
                        i87 = i;
                    }
                    break;
                case 790213994:
                case 1701050081:
                    j10 = j10;
                    jM14118 = j9;
                    i91 = 0;
                    length2 = interfaceC20157Arr24.length;
                    int iM1130113 = (ThreadFactoryC3888.m11306("֫ۤ") + i86) * 11;
                    length4 = length4;
                    i87 = ((iM1130113 ^ i85) * (-1777)) ^ 174023606;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    i32 = i93;
                    i88 = iM1130113 ^ (-227088671);
                    i90 = i90;
                    i101 = i101;
                    i93 = i32;
                    long j11116 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j11116;
                    break;
                case 811354656:
                case 1954069078:
                    long j50 = j10;
                    i94++;
                    jM14118 = m14118(j9, j50);
                    j10 = j50;
                    int iM1130114 = (ThreadFactoryC3888.m11306("᩸ۖ") ^ i86) * 33;
                    i87 = ((iM1130114 ^ i85) * 13489) ^ 1958912204;
                    i31 = iM1130114 ^ (-2045494929);
                    i93 = i93;
                    i88 = i31;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    j3 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j3;
                    break;
                case 827158105:
                case 1540880185:
                    interfaceC20157Arr21 = interfaceC20157Arr25;
                    jM14118 = j9;
                    InterfaceC20157[] interfaceC20157Arr44 = new InterfaceC20157[interfaceC20157Arr21.length];
                    i66 = i98;
                    i63 = i101;
                    i61 = i99;
                    C0526.m2427(interfaceC20157Arr21, i66, interfaceC20157Arr44, i66, i61);
                    interfaceC20157Arr26 = interfaceC20157Arr44;
                    i96 = i61;
                    i62 = i66;
                    iM450215 = C19806.m45029("ܺۨ") ^ i86;
                    i64 = ((iM450215 ^ i85) * 16373) ^ 862301312;
                    i65 = -1772787857;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr22;
                    i92 = i92;
                    int i1014 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr27;
                    i90 = i90;
                    i101 = i63;
                    i98 = i62;
                    i97 = i97;
                    i99 = i61;
                    i93 = i93;
                    i88 = iM450215 ^ i65;
                    i91 = i1014;
                    long[] jArr12 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr21;
                    i87 = i64;
                    jArr4 = jArr12;
                    long j11117 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j11117;
                    break;
                case 1338077066:
                case 1493858491:
                    if (C0671.f2816 != 0) {
                        i93 = i93;
                        long j211 = j9;
                        i103 = i103;
                        i104 = i104;
                        j10 = j10;
                        jM14118 = j211;
                        iM450211 = ThreadFactoryC3888.m11306("۫ܺ") ^ i85;
                        i19 = ((iM450211 ^ i86) * (-963)) ^ 1816266905;
                        i20 = -731686289;
                        i89 = i89;
                        interfaceC20157Arr22 = interfaceC20157Arr22;
                        i92 = i92;
                        i33 = i91;
                        interfaceC20157Arr27 = interfaceC20157Arr27;
                        i90 = i90;
                        i101 = i101;
                        i93 = i93;
                        i88 = iM450211 ^ i20;
                        i87 = i19;
                        i91 = i33;
                        long j11118 = j10;
                        i103 = i103;
                        i104 = i104;
                        j9 = jM14118;
                        j10 = j11118;
                    } else {
                        iM45029 = (i85 - C19806.m45029("ܿۚ")) * (-127);
                        i = ((iM45029 ^ i86) * (-25527)) ^ (-693748685);
                        i2 = -1740214511;
                        i88 = iM45029 ^ i2;
                        i87 = i;
                    }
                    break;
                case 1868911595:
                case 1898789591:
                    interfaceC20157Arr13 = interfaceC20157Arr22;
                    i22 = i102;
                    jM14118 = j9;
                    i23 = i101;
                    jArr4 = new long[i23];
                    i95 = 0;
                    i82 = i23;
                    length3 = interfaceC20157Arr13.length;
                    interfaceC20157Arr28 = new InterfaceC20157[i22];
                    i90 = i98;
                    int iM1130115 = (ThreadFactoryC3888.m11306("ܳᩴ") + i85) * (-47);
                    i102 = i22;
                    int i1114 = ((iM1130115 ^ i86) * 11605) ^ 2083075922;
                    int i1115 = iM1130115 ^ (-849593379);
                    length4 = length4;
                    i87 = i1114;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr13;
                    i92 = i92;
                    i101 = i23;
                    i93 = i93;
                    i88 = i1115;
                    long j11119 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j11119;
                    break;
                default:
                    i18 = i93;
                    long j51 = j10;
                    jM14118 = j9;
                    i81 = i79;
                    i103 = i103;
                    i104 = i104;
                    j10 = j51;
                    i17 = i92;
                    interfaceC20157Arr10 = interfaceC20157Arr22;
                    interfaceC20157Arr11 = (InterfaceC20157[]) Arrays.copyOf(interfaceC20157Arr28, i90);
                    int iM113029 = (ThreadFactoryC3888.m11306("ۜۡ") ^ i85) * 29;
                    InterfaceC20157[] interfaceC20157Arr312 = interfaceC20157Arr11;
                    i89 = i89;
                    interfaceC20157Arr22 = interfaceC20157Arr10;
                    i92 = i17;
                    interfaceC20157Arr12 = interfaceC20157Arr25;
                    i87 = ((iM113029 ^ i86) * (-5441)) ^ 233198102;
                    i90 = i90;
                    i101 = i101;
                    i98 = i98;
                    i97 = i97;
                    i99 = i99;
                    i93 = i18;
                    i88 = iM113029 ^ 816856740;
                    interfaceC20157Arr23 = interfaceC20157Arr23;
                    i91 = i91;
                    interfaceC20157Arr27 = interfaceC20157Arr312;
                    i105 = i105;
                    jArr4 = jArr4;
                    interfaceC20157Arr25 = interfaceC20157Arr12;
                    long j111110 = j10;
                    i103 = i103;
                    i104 = i104;
                    j9 = jM14118;
                    j10 = j111110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0281  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        if (l.RunnableC0195.f1321 < 0) goto L88;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5070 m14121(int r32, l.InterfaceC20157[] r33) {
        /*
            Method dump skipped, instruction units count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14121(int, l.᩶ۨ᩹[]):l.ۚۖ᩹");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03d4 A[PHI: r1 r10 r11 r12 r13 r19 r21
      0x03d4: PHI (r1v49 short[]) = (r1v48 short[]), (r1v50 short[]) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r19v28 int) = (r19v27 int), (r19v29 int) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r21v14 int) = (r21v13 int), (r21v15 int) binds: [B:100:0x03d2, B:96:0x03a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5070 m14125(byte[] bArr, int i, int[] iArr) throws CloneNotSupportedException {
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int i5;
        int i6;
        int iM450211;
        int i7;
        int iM11306;
        int i8;
        int i9;
        int i10;
        int iM450212;
        int i11;
        int i12;
        int i13 = C3535.f13026;
        int i14 = C2249.f8050;
        int iM450213 = (i13 - C19806.m45029("᩶۟")) * 55;
        int i15 = ((iM450213 ^ i14) * 15629) ^ 1208762442;
        short[] sArr = null;
        int i16 = iM450213 ^ 848759864;
        int i17 = 0;
        int length = 0;
        char c = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1384988395;
        C17334 c17334 = null;
        while (true) {
            i25 = i16 ^ (i15 & (((i25 ^ i14) * (-23865)) >> 31));
            switch (i25) {
                case -2013190321:
                case 2078370993:
                    if (C1875.f7103 < 0) {
                        iM11306 = (C19806.m45029("ۙۘ") ^ i14) * (-25);
                        i8 = ((iM11306 ^ i13) * 6035) ^ 305767469;
                        i9 = -961084413;
                        i7 = iM11306 ^ i9;
                        sArr = sArr;
                        i15 = i8;
                        i19 = i19;
                        i20 = i20;
                        i16 = i7;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܰ۠") ^ i13;
                        i4 = ((iM450210 ^ i14) * 7075) ^ (-1918530350);
                        i5 = -1153256287;
                        i16 = iM450210 ^ i5;
                        i15 = i4;
                    }
                    break;
                case -1768858060:
                case 249550134:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    i17 = i & (-65536);
                    length = iArr.length;
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܳ") ^ i14) * 9;
                        i8 = ((iM11306 ^ i13) * 24511) ^ (-180959975);
                        i9 = 175683633;
                    } else {
                        iM11306 = C19806.m45029("᩺᩹") ^ i13;
                        i8 = ((iM11306 ^ i14) * 21539) ^ (-1726233089);
                        i9 = 603093809;
                    }
                    i7 = iM11306 ^ i9;
                    sArr = sArr;
                    i15 = i8;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -1758442329:
                case -6422029:
                    if (i18 != 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("۫ۙ") ^ i13) * (-73);
                        i4 = ((iM450210 ^ i14) * (-2525)) ^ 1708676630;
                        i5 = -52032318;
                    } else {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("֡ۜ")) * 45;
                        i4 = ((iM450210 ^ i13) * 25857) ^ 581137553;
                        i5 = 1011432158;
                    }
                    i16 = iM450210 ^ i5;
                    i15 = i4;
                    break;
                case -1521384692:
                case 205285012:
                    i24 = 9520;
                    iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") + i14) * (-77);
                    i2 = ((iM45029 ^ i13) * (-14791)) ^ 1220898756;
                    i3 = -1692745592;
                    i7 = iM45029 ^ i3;
                    sArr = sArr;
                    i15 = i2;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -1484028770:
                case 1085898973:
                    sArr = sArr;
                    i20 = i20;
                    i19 = i19;
                    if (i19 >= ((long) i17) + 65536) {
                        i19 = i19;
                        iM450212 = ThreadFactoryC3888.m11306("ۘܳ") ^ i13;
                        i11 = ((iM450212 ^ i14) * (-29101)) ^ 759903518;
                        i12 = 1371185641;
                        i16 = iM450212 ^ i12;
                        sArr = sArr;
                        i15 = i11;
                        i20 = i20;
                    } else {
                        iM11306 = (i14 - C19806.m45029("ۗۨ")) * 39;
                        i8 = ((iM11306 ^ i13) * 24825) ^ 338622865;
                        i9 = -667926123;
                        i7 = iM11306 ^ i9;
                        sArr = sArr;
                        i15 = i8;
                        i19 = i19;
                        i20 = i20;
                        i16 = i7;
                    }
                    break;
                case -1427359518:
                case -1416023143:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    if (C3660.f13403 >= 0) {
                        int iM11307 = (i13 - ThreadFactoryC3888.m11306("᩹۟")) * (-89);
                        int i26 = ((iM11307 ^ i14) * 20147) ^ (-678968273);
                        i7 = iM11307 ^ (-1723088862);
                        sArr = sArr;
                        i15 = i26;
                        i19 = i19;
                        i20 = i20;
                        c17334 = null;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܶ") ^ i13;
                        i2 = ((iM45029 ^ i14) * 31053) ^ 739471990;
                        i3 = -1354324651;
                        i7 = iM45029 ^ i3;
                        sArr = sArr;
                        i15 = i2;
                        i19 = i19;
                        i20 = i20;
                    }
                    i16 = i7;
                    break;
                case -1426348907:
                case 328962372:
                    i20 = i20;
                    sArr = sArr;
                    i19 = iArr[i18];
                    if (i19 >= i17) {
                        iM450212 = C19806.m45029("۫ۘ") ^ i13;
                        i11 = ((iM450212 ^ i14) * 20645) ^ 297902866;
                        i12 = 525951375;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("ۘܳ") ^ i13;
                        i11 = ((iM450212 ^ i14) * (-29101)) ^ 759903518;
                        i12 = 1371185641;
                    }
                    i16 = iM450212 ^ i12;
                    sArr = sArr;
                    i15 = i11;
                    i20 = i20;
                    break;
                case -1358890871:
                case 1916983406:
                    short[] sArr2 = f17669;
                    if (RunnableC0195.f1321 < 0) {
                        throw new IllegalArgumentException(C1937.m6288(sArr2, FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 34, i24));
                    }
                    iM11306 = (C19806.m45029("ۙۘ") ^ i14) * (-25);
                    i8 = ((iM11306 ^ i13) * 6035) ^ 305767469;
                    i9 = -961084413;
                    i7 = iM11306 ^ i9;
                    sArr = sArr;
                    i15 = i8;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -1345407140:
                case -160482199:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    AbstractC13538 abstractC13538M33082 = AbstractC13538.m33082(iArr.length, iArr);
                    Object objClone = bArr.clone();
                    if (RunnableC1606.f6488 >= 0) {
                        int iM11308 = (i13 - ThreadFactoryC3888.m11306("᩹۟")) * (-89);
                        int i27 = ((iM11308 ^ i14) * 20147) ^ (-678968273);
                        i7 = iM11308 ^ (-1723088862);
                        sArr = sArr;
                        i15 = i27;
                        i19 = i19;
                        i20 = i20;
                        c17334 = null;
                        i16 = i7;
                    } else {
                        C17334 c17335 = new C17334(abstractC13538M33082, (byte[]) objClone);
                        if (C19806.f63586) {
                            sArr = sArr;
                            c17334 = c17335;
                            iM450211 = (C19806.m45029("ۨ᩹") ^ i13) * (-75);
                            i4 = ((iM450211 ^ i14) * 24281) ^ (-605721761);
                            i6 = 1629828393;
                            int i28 = iM450211 ^ i6;
                            i19 = i19;
                            i20 = i20;
                            i16 = i28;
                            i15 = i4;
                        } else {
                            int iM450214 = (i13 - C19806.m45029("᩶ᩴ")) * (-35);
                            sArr = sArr;
                            c17334 = c17335;
                            i15 = ((iM450214 ^ i14) * (-9001)) ^ 762938550;
                            i20 = i20;
                            i16 = iM450214 ^ 1015998219;
                            i19 = i19;
                        }
                    }
                    break;
                case -1285444504:
                case 417645632:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    int i29 = s + s2;
                    i21 = i29 * i29;
                    i22 = s * s;
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i13) * (-97);
                        i2 = ((iM45029 ^ i14) * (-3759)) ^ (-1247507380);
                        i3 = 1423778773;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۡ") + i13) * (-43);
                        i2 = ((iM45029 ^ i14) * 5353) ^ (-743105032);
                        i3 = -1976147877;
                    }
                    i7 = iM45029 ^ i3;
                    sArr = sArr;
                    i15 = i2;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -1161542809:
                case 377319635:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    if (iArr.length == bArr.length) {
                        iM45029 = (C19806.m45029("᩶ۘ") ^ i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM45029 ^ i13) * 28617) ^ (-173941582);
                        i3 = 1720957721;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۟") ^ i13;
                        i2 = ((iM45029 ^ i14) * 27691) ^ (-2069273848);
                        i3 = 765605964;
                    }
                    i7 = iM45029 ^ i3;
                    sArr = sArr;
                    i15 = i2;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -1050498645:
                case 1413067557:
                    if (i19 <= i20) {
                        i20 = i20;
                        sArr = sArr;
                        iM450212 = ThreadFactoryC3888.m11306("ۘܳ") ^ i13;
                        i11 = ((iM450212 ^ i14) * (-29101)) ^ 759903518;
                        i12 = 1371185641;
                        i16 = iM450212 ^ i12;
                        sArr = sArr;
                        i15 = i11;
                        i20 = i20;
                    } else {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("֡ۜ")) * 45;
                        i4 = ((iM450210 ^ i13) * 25857) ^ 581137553;
                        i5 = 1011432158;
                        i16 = iM450210 ^ i5;
                        i15 = i4;
                    }
                    break;
                case -972792286:
                case 895552237:
                    if (C3535.m10431() <= 0) {
                        i19 = i19;
                        i20 = i20;
                        iM450211 = (C19806.m45029("ۨ᩹") ^ i13) * (-75);
                        i4 = ((iM450211 ^ i14) * 24281) ^ (-605721761);
                        i6 = 1629828393;
                        int i210 = iM450211 ^ i6;
                        i19 = i19;
                        i20 = i20;
                        i16 = i210;
                        i15 = i4;
                    } else {
                        iM11306 = (C19806.m45029("ۙۘ") ^ i14) * (-25);
                        i8 = ((iM11306 ^ i13) * 6035) ^ 305767469;
                        i9 = -961084413;
                        i7 = iM11306 ^ i9;
                        sArr = sArr;
                        i15 = i8;
                        i19 = i19;
                        i20 = i20;
                        i16 = i7;
                    }
                    break;
                case -856618758:
                case 1426392978:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    if (iArr.length == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۨ") ^ i14;
                        i8 = ((iM11306 ^ i13) * (-14347)) ^ (-1724952459);
                        i9 = -733046312;
                    } else {
                        iM11306 = (C19806.m45029("ۢۡ") ^ i14) * q.h;
                        i8 = ((iM11306 ^ i13) * 20123) ^ 1126523936;
                        i9 = 1599256396;
                    }
                    i7 = iM11306 ^ i9;
                    sArr = sArr;
                    i15 = i8;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -794783830:
                case -645147429:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    int i30 = i22 + i23;
                    if (i21 - (i30 + i30) <= 0) {
                        iM45029 = C19806.m45029("ܿ۟") ^ i13;
                        i2 = ((iM45029 ^ i14) * 7577) ^ (-1791566616);
                        i3 = 1406975243;
                    } else {
                        iM45029 = C19806.m45029("᩻ᩳ") ^ i13;
                        i2 = ((iM45029 ^ i14) * (-8785)) ^ 470976890;
                        i3 = -1919643344;
                    }
                    i7 = iM45029 ^ i3;
                    sArr = sArr;
                    i15 = i2;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -763895177:
                case 1301187157:
                    i24 = 14896;
                    iM45029 = (ThreadFactoryC3888.m11306("ۛۡ") + i14) * (-77);
                    i2 = ((iM45029 ^ i13) * (-14791)) ^ 1220898756;
                    i3 = -1692745592;
                    i7 = iM45029 ^ i3;
                    sArr = sArr;
                    i15 = i2;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case -739055526:
                case 338505413:
                    return m14120(i17);
                case -686924976:
                case -316910246:
                    i18++;
                    i20 = i19;
                    i10 = i20;
                    int iM11309 = (i14 - ThreadFactoryC3888.m11306("۟ܰ")) * 33;
                    int i31 = ((iM11309 ^ i13) * (-32087)) ^ 415222310;
                    i7 = iM11309 ^ (-678914709);
                    sArr = sArr;
                    i15 = i31;
                    i19 = i10;
                    i16 = i7;
                    break;
                case -666538826:
                case -29960610:
                    InterfaceC20157[] interfaceC20157Arr = new InterfaceC20157[1];
                    interfaceC20157Arr[c] = c17334;
                    return new C5070(i17, interfaceC20157Arr);
                case -544875322:
                case -9730201:
                    C3577.m10565();
                    if (!C19806.f63586) {
                        i19 = i19;
                        i20 = i20;
                        sArr = sArr;
                        int iM113010 = (i13 - ThreadFactoryC3888.m11306("᩹۟")) * (-89);
                        int i211 = ((iM113010 ^ i14) * 20147) ^ (-678968273);
                        i7 = iM113010 ^ (-1723088862);
                        sArr = sArr;
                        i15 = i211;
                        i19 = i19;
                        i20 = i20;
                        c17334 = null;
                        i16 = i7;
                    } else {
                        iM450210 = C19806.m45029("ܺܳ") ^ i14;
                        i4 = ((iM450210 ^ i13) * 12425) ^ 2143661560;
                        i5 = -189818579;
                        i16 = iM450210 ^ i5;
                        i15 = i4;
                    }
                    break;
                case -459117298:
                case 422294428:
                    C1189.m4368();
                    return null;
                case -257524106:
                case -94664484:
                    i19 = i19;
                    i20 = i20;
                    sArr = f17669;
                    if (C0797.f3386) {
                        iM450211 = (C19806.m45029("ۨ᩹") ^ i13) * (-75);
                        i4 = ((iM450211 ^ i14) * 24281) ^ (-605721761);
                        i6 = 1629828393;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ۗᩴ") + i14) * 45;
                        i4 = ((iM450211 ^ i13) * (-6497)) ^ (-106935111);
                        i6 = -354191830;
                    }
                    int i212 = iM450211 ^ i6;
                    i19 = i19;
                    i20 = i20;
                    i16 = i212;
                    i15 = i4;
                    break;
                case -252674285:
                case 1354366371:
                    C3722.m10894();
                    if (C2477.f9839 <= 0) {
                        i19 = i19;
                        i20 = i20;
                        sArr = sArr;
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܳ") ^ i14) * 9;
                        i8 = ((iM11306 ^ i13) * 24511) ^ (-180959975);
                        i9 = 175683633;
                        i7 = iM11306 ^ i9;
                        sArr = sArr;
                        i15 = i8;
                        i19 = i19;
                        i20 = i20;
                        i16 = i7;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܰ۠") ^ i13;
                        i4 = ((iM450210 ^ i14) * 7075) ^ (-1918530350);
                        i5 = -1153256287;
                        i16 = iM450210 ^ i5;
                        i15 = i4;
                    }
                    break;
                case 240797357:
                case 864393794:
                    short[] sArr3 = f17669;
                    if (ThreadFactoryC3888.f14547 > 0) {
                        throw new IllegalArgumentException(C0629.m2906(sArr3, 504, 45, i24));
                    }
                    iM11306 = (C19806.m45029("ۙۘ") ^ i14) * (-25);
                    i8 = ((iM11306 ^ i13) * 6035) ^ 305767469;
                    i9 = -961084413;
                    i7 = iM11306 ^ i9;
                    sArr = sArr;
                    i15 = i8;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case 456755605:
                case 1373222202:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    if (i18 < length) {
                        iM11306 = (i14 - C19806.m45029("ۨ᩶")) * (-31);
                        i8 = ((iM11306 ^ i13) * (-33)) ^ 744119987;
                        i9 = 518905940;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") ^ i13) * (-103);
                        i8 = ((iM11306 ^ i14) * (-635)) ^ 1198208281;
                        i9 = -1487335576;
                    }
                    i7 = iM11306 ^ i9;
                    sArr = sArr;
                    i15 = i8;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case 885796731:
                case 1281045394:
                    C7105.m18985();
                    if (!RunnableC1895.f7152) {
                        i19 = i19;
                        i20 = i20;
                        sArr = sArr;
                        int iM113011 = (i13 - ThreadFactoryC3888.m11306("᩹۟")) * (-89);
                        int i213 = ((iM113011 ^ i14) * 20147) ^ (-678968273);
                        i7 = iM113011 ^ (-1723088862);
                        sArr = sArr;
                        i15 = i213;
                        i19 = i19;
                        i20 = i20;
                        c17334 = null;
                        i16 = i7;
                    } else {
                        i19 = i19;
                        i20 = i20;
                        iM450211 = (C19806.m45029("ۨ᩹") ^ i13) * (-75);
                        i4 = ((iM450211 ^ i14) * 24281) ^ (-605721761);
                        i6 = 1629828393;
                        int i214 = iM450211 ^ i6;
                        i19 = i19;
                        i20 = i20;
                        i16 = i214;
                        i15 = i4;
                    }
                    break;
                case 925823924:
                case 1862347619:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    i23 = 31292836;
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("ۡ֫") ^ i14;
                        i2 = ((iM45029 ^ i13) * (-18773)) ^ 1891779759;
                        i3 = 281216047;
                        i7 = iM45029 ^ i3;
                        sArr = sArr;
                        i15 = i2;
                        i19 = i19;
                        i20 = i20;
                        i16 = i7;
                    } else {
                        sArr = sArr;
                        iM450211 = (C19806.m45029("ۨ᩹") ^ i13) * (-75);
                        i4 = ((iM450211 ^ i14) * 24281) ^ (-605721761);
                        i6 = 1629828393;
                        int i215 = iM450211 ^ i6;
                        i19 = i19;
                        i20 = i20;
                        i16 = i215;
                        i15 = i4;
                    }
                    break;
                case 998001238:
                case 1477126546:
                    i19 = i19;
                    i20 = i20;
                    sArr = sArr;
                    s = sArr[469];
                    s2 = 5594;
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i13) * (-97);
                        i2 = ((iM45029 ^ i14) * (-3759)) ^ (-1247507380);
                        i3 = 1423778773;
                    } else {
                        iM45029 = C19806.m45029("᩺᩵") ^ i14;
                        i2 = ((iM45029 ^ i13) * (-18985)) ^ (-1055540267);
                        i3 = -662382060;
                    }
                    i7 = iM45029 ^ i3;
                    sArr = sArr;
                    i15 = i2;
                    i19 = i19;
                    i20 = i20;
                    i16 = i7;
                    break;
                case 1020023075:
                case 2081490961:
                    i10 = i19;
                    c = 0;
                    i18 = 0;
                    i20 = Integer.MIN_VALUE;
                    int iM113012 = (i14 - ThreadFactoryC3888.m11306("۟ܰ")) * 33;
                    int i32 = ((iM113012 ^ i13) * (-32087)) ^ 415222310;
                    i7 = iM113012 ^ (-678914709);
                    sArr = sArr;
                    i15 = i32;
                    i19 = i10;
                    i16 = i7;
                    break;
                default:
                    C10634.m26820();
                    ThreadFactoryC3888.m11300();
                    iM450210 = ThreadFactoryC3888.m11306("ܰ۠") ^ i13;
                    i4 = ((iM450210 ^ i14) * 7075) ^ (-1918530350);
                    i5 = -1153256287;
                    i16 = iM450210 ^ i5;
                    i15 = i4;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14127(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iM1785 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int length = 0;
        int i7 = -779164494;
        int i8 = C1148.f5161;
        int i9 = C1419.f5860;
        int iM45029 = C19806.m45029("۠ܺ") ^ i9;
        int i10 = ((iM45029 ^ i8) * 5411) ^ 264759075;
        int i11 = -942212186;
        while (true) {
            i7 = ((((i7 ^ i8) * 29975) >> 31) & i10) ^ (iM45029 ^ i11);
            switch (i7) {
                case -2138892147:
                case 961204576:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3183) ^ (-1870518368);
                        i11 = 121974129;
                    } else {
                        iM45029 = (C19806.m45029("۟᩶") + i9) * (-119);
                        i10 = ((iM45029 ^ i8) * (-24785)) ^ (-2063238701);
                        i11 = 410855777;
                    }
                    break;
                case -2104286859:
                case -224715926:
                    if (i4 < iM1785) {
                        iM45029 = C19806.m45029("۫ܳ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-12335)) ^ 1091085568;
                        i11 = 2014425674;
                    } else {
                        i5 = iM1785;
                        iM45029 = C19806.m45029("ܳۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-20621)) ^ (-1260244003);
                        i11 = 144729227;
                    }
                    break;
                case -2071002221:
                case 1734072334:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("۟᩶") + i9) * (-119);
                        i10 = ((iM45029 ^ i8) * (-24785)) ^ (-2063238701);
                        i11 = 410855777;
                    } else {
                        iM45029 = C19806.m45029("ۚۙ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-9025)) ^ 1086133178;
                        i11 = 1395796084;
                    }
                    break;
                case -1664497159:
                case 1526255484:
                    if (C2477.m7593() >= 0) {
                        iM45029 = C19806.m45029("۫֡") ^ i9;
                        i10 = ((iM45029 ^ i8) * 23473) ^ 379832356;
                        i11 = -1079571272;
                    } else {
                        iM45029 = C19806.m45029("ۤܿ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-30731)) ^ (-1825184771);
                        i11 = 1741406526;
                    }
                    break;
                case -1547859234:
                case -680681024:
                    int iM1786 = C0278.m1785(i5, i3 - i5);
                    C0526.m2427(bArr2, i2, bArr2, i2 + i5, iM1786);
                    i5 += iM1786;
                    iM45029 = C19806.m45029("ܳۗ") ^ i8;
                    i10 = ((iM45029 ^ i9) * (-20621)) ^ (-1260244003);
                    i11 = 144729227;
                    break;
                case -1380882792:
                case -266986275:
                    i6 = i2 + i4;
                    length = (i + i4) % bArr.length;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3183) ^ (-1870518368);
                        i11 = 121974129;
                    } else {
                        iM45029 = (C19806.m45029("ܺۤ") ^ i8) * (-103);
                        i10 = ((iM45029 ^ i9) * (-20885)) ^ 914202387;
                        i11 = 705553726;
                    }
                    break;
                case -1264428805:
                case -713778627:
                    bArr2[i6] = bArr[length];
                    i4++;
                    iM45029 = ThreadFactoryC3888.m11306("ܳۚ") ^ i9;
                    i10 = ((iM45029 ^ i8) * 24527) ^ (-1522750823);
                    i11 = 1463012872;
                    break;
                case -1226997457:
                case 478012052:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ᩳۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 6265) ^ 1422851394;
                        i11 = 869780179;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩻") + i8) * (-77);
                        i10 = ((iM45029 ^ i9) * 23911) ^ (-490106725);
                        i11 = -19488913;
                    }
                    break;
                case -1122385993:
                case -246458092:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i9 - C19806.m45029("ۖ۟")) * 109;
                        i10 = ((iM45029 ^ i8) * 5329) ^ (-1273736649);
                        i11 = 1950742992;
                    } else {
                        iM45029 = (C19806.m45029("֨ۤ") + i9) * 39;
                        i10 = ((iM45029 ^ i8) * (-30051)) ^ 500243348;
                        i11 = -332993356;
                    }
                    break;
                case -950677616:
                case 309735046:
                    if (C2704.f10408) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܿ۠")) * (-25);
                        i10 = ((iM45029 ^ i8) * 21361) ^ 1081155914;
                        i11 = 529525228;
                    } else {
                        iM45029 = C19806.m45029("ᩳۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 6265) ^ 1422851394;
                        i11 = 869780179;
                    }
                    break;
                case -391693042:
                case 1997791080:
                    if (i5 < i3) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܽ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3131) ^ (-2107559141);
                        i11 = -603067621;
                    } else {
                        iM45029 = (C19806.m45029("ܺ֡") ^ i9) * (-27);
                        i10 = ((iM45029 ^ i8) * (-6609)) ^ 1073370961;
                        i11 = 1958574728;
                    }
                    break;
                case -192222888:
                case 1759032146:
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3183) ^ (-1870518368);
                        i11 = 121974129;
                    } else {
                        iM45029 = C19806.m45029("ܿܿ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 20293) ^ (-1478224622);
                        i11 = -1896029421;
                    }
                    break;
                case -189411165:
                case 1281863152:
                    if (C2124.f7782 > 0) {
                        iM45029 = (i9 - C19806.m45029("ۖ۟")) * 109;
                        i10 = ((iM45029 ^ i8) * 5329) ^ (-1273736649);
                        i11 = 1950742992;
                    } else {
                        iM45029 = C19806.m45029("۬᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3183) ^ (-1870518368);
                        i11 = 121974129;
                    }
                    break;
                case -173096725:
                case 1778899412:
                    C2642.m8171();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ᩳۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 6265) ^ 1422851394;
                        i11 = 869780179;
                    } else {
                        iM45029 = C19806.m45029("۬᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3183) ^ (-1870518368);
                        i11 = 121974129;
                    }
                    break;
                case -63983030:
                case 496746672:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i8;
                        i10 = ((iM45029 ^ i9) * 3183) ^ (-1870518368);
                        i11 = 121974129;
                    } else {
                        iM45029 = C19806.m45029("ܺۨ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 28593) ^ (-1956750024);
                        i11 = 1669164731;
                    }
                    break;
                case 33945345:
                case 410533890:
                    iM1785 = C0278.m1785(bArr.length, i3);
                    i4 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ܳۚ") ^ i9;
                    i10 = ((iM45029 ^ i8) * 24527) ^ (-1522750823);
                    i11 = 1463012872;
                    break;
                case 138075329:
                case 1023035203:
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("ۖ᩹") ^ i8) * (-75);
                        i10 = ((iM45029 ^ i9) * 30805) ^ 236693180;
                        i11 = -1950242588;
                    } else {
                        iM45029 = C19806.m45029("۫֡") ^ i9;
                        i10 = ((iM45029 ^ i8) * 23473) ^ 379832356;
                        i11 = -1079571272;
                    }
                    break;
                case 213548601:
                case 709460898:
                    break;
                case 746696364:
                case 1213848776:
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("۟᩶") + i9) * (-119);
                        i10 = ((iM45029 ^ i8) * (-24785)) ^ (-2063238701);
                        i11 = 410855777;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("᩷ۙ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i10 = ((iM45029 ^ i8) * (-26973)) ^ (-678430488);
                        i11 = 37004209;
                    }
                    break;
                case 1110650699:
                case 2029420955:
                    C0216.m1591();
                    C0050.m946();
                    iM45029 = (C19806.m45029("۟᩶") + i9) * (-119);
                    i10 = ((iM45029 ^ i8) * (-24785)) ^ (-2063238701);
                    i11 = 410855777;
                    break;
                default:
                    RunnableC0195.m1431();
                    RunnableC0195.m1431();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01ac A[PHI: r8 r9 r10
      0x01ac: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:56:0x01aa, B:52:0x018c, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:56:0x01aa, B:52:0x018c, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:56:0x01aa, B:52:0x018c, B:31:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14126(int i, int i2, long[] jArr) {
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM450210;
        int i6;
        int i7;
        int i8 = -586805188;
        int i9 = C7105.f23796;
        int i10 = C1398.f5802;
        int iM11306 = (i9 - ThreadFactoryC3888.m11306("ܺ᩷")) * 71;
        int i11 = ((iM11306 ^ i10) * 8429) ^ 216395972;
        int i12 = iM11306 ^ 1180564859;
        long j = 0;
        long j2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j3 = 0;
        int i22 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-16655)) >> 31));
            switch (i8) {
                case -2112203663:
                case -1416964482:
                    C1937.m6279();
                    if (C1148.f5161 <= 0) {
                        i3 = i13;
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ۫") ^ i10) * 27;
                        i4 = ((iM45029 ^ i9) * (-18899)) ^ 1238632208;
                        i5 = 1250006467;
                        i11 = i4;
                        int i23 = i3;
                        i12 = iM45029 ^ i5;
                        i13 = i23;
                    }
                    i3 = i13;
                    iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i9;
                    i4 = ((iM45029 ^ i10) * (-2901)) ^ 2133138461;
                    i5 = -640762643;
                    i11 = i4;
                    int i24 = i3;
                    i12 = iM45029 ^ i5;
                    i13 = i24;
                    break;
                case -2066748667:
                case 384702547:
                    j2 = j3 >>> (63 - i20);
                    if (i14 == i17) {
                        iM450210 = (i10 - C19806.m45029("ۧܽ")) * 9;
                        i6 = ((iM450210 ^ i9) * 5483) ^ (-119846741);
                        i7 = -1022591865;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩺᩶") ^ i10;
                        i6 = ((iM450210 ^ i9) * 32609) ^ (-1228279518);
                        i7 = -1174908200;
                    }
                    i12 = iM450210 ^ i7;
                    i11 = i6;
                    break;
                case -1998023389:
                case 1086022264:
                    jArr[i14] = jArr[i14] | (j2 & j);
                    break;
                case -1846797459:
                case -163033410:
                    i13 = i14 + 1;
                    if (C2704.f10408) {
                        iM450210 = ThreadFactoryC3888.m11306("ۘܽ") ^ i9;
                        i6 = ((iM450210 ^ i10) * (-5529)) ^ (-2078461098);
                        i7 = -1080794185;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM450210 ^ i10) * (-13789)) ^ 975630428;
                        i7 = 287521015;
                    }
                    i12 = iM450210 ^ i7;
                    i11 = i6;
                    break;
                case -1829885927:
                case 908911125:
                    jArr[i14] = j | jArr[i14];
                    if (C2642.m8171() != 0) {
                        iM450210 = C19806.m45029("ۧܺ") ^ i10;
                        i6 = ((iM450210 ^ i9) * (-6667)) ^ (-347898022);
                        i7 = -2137047376;
                    } else {
                        iM450210 = (C19806.m45029("ۢۤ") + i9) * 89;
                        i6 = ((iM450210 ^ i10) * (-18337)) ^ 568862751;
                        i7 = -1419346185;
                    }
                    i12 = iM450210 ^ i7;
                    i11 = i6;
                    break;
                case -1793725433:
                case 2105084213:
                    i3 = i13;
                    i14 = i >>> 6;
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-2901)) ^ 2133138461;
                        i5 = -640762643;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۗ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-2041)) ^ 8706571;
                        i5 = -1920386505;
                    }
                    i11 = i4;
                    int i25 = i3;
                    i12 = iM45029 ^ i5;
                    i13 = i25;
                    break;
                case -1238469919:
                case -127159436:
                    i17 = i15 >>> i16;
                    i18 = 63;
                    if (C19806.f63586) {
                        iM450210 = C19806.m45029("ۧܺ") ^ i10;
                        i6 = ((iM450210 ^ i9) * (-6667)) ^ (-347898022);
                        i7 = -2137047376;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۜ۟") + i10) * (-25);
                        i6 = ((iM450210 ^ i9) * (-15513)) ^ (-1887967797);
                        i7 = -587973838;
                    }
                    i12 = iM450210 ^ i7;
                    i11 = i6;
                    break;
                case -1090223422:
                case 303840492:
                    C1668.m5583();
                    C1668.m5583();
                    break;
                case -1043198684:
                case -581609956:
                    CallableC1627.m5507();
                    if (C1148.f5161 <= 0) {
                        i3 = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-2901)) ^ 2133138461;
                        i5 = -640762643;
                        i11 = i4;
                        int i26 = i3;
                        i12 = iM45029 ^ i5;
                        i13 = i26;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM450210 ^ i10) * (-13789)) ^ 975630428;
                        i7 = 287521015;
                        i12 = iM450210 ^ i7;
                        i11 = i6;
                    }
                    break;
                case -802253161:
                case 1206801479:
                    i3 = i13;
                    i21 = -1;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ۫") ^ i10) * 27;
                        i4 = ((iM45029 ^ i9) * (-18899)) ^ 1238632208;
                        i5 = 1250006467;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۙ") ^ i10) * (-67);
                        i4 = ((iM45029 ^ i9) * (-17759)) ^ 68121687;
                        i5 = 1071438709;
                    }
                    i11 = i4;
                    int i27 = i3;
                    i12 = iM45029 ^ i5;
                    i13 = i27;
                    break;
                case -605730853:
                case -227298946:
                    C3577.m10565();
                    iM450210 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM450210 ^ i10) * (-13789)) ^ 975630428;
                    i7 = 287521015;
                    i12 = iM450210 ^ i7;
                    i11 = i6;
                    break;
                case -540938994:
                case 1826501374:
                    j3 = -1;
                    j = (-1) << i22;
                    if (!C0962.f3784) {
                        iM450210 = C19806.m45029("᩵᩶") ^ i9;
                        i6 = ((iM450210 ^ i10) * (-26439)) ^ (-1642589011);
                        i7 = -2074122391;
                        i12 = iM450210 ^ i7;
                        i11 = i6;
                    } else {
                        i3 = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-2901)) ^ 2133138461;
                        i5 = -640762643;
                        i11 = i4;
                        int i28 = i3;
                        i12 = iM45029 ^ i5;
                        i13 = i28;
                    }
                    break;
                case -511731696:
                case 372011442:
                    i22 = i & i18;
                    if (C0962.f3784) {
                        iM450210 = C19806.m45029("ۧܺ") ^ i10;
                        i6 = ((iM450210 ^ i9) * (-6667)) ^ (-347898022);
                        i7 = -2137047376;
                    } else {
                        iM450210 = C19806.m45029("ۖۗ") ^ i9;
                        i6 = ((iM450210 ^ i10) * 24685) ^ 271353319;
                        i7 = 363160288;
                    }
                    i12 = iM450210 ^ i7;
                    i11 = i6;
                    break;
                case 329885629:
                case 1369025071:
                    if (C0278.f1572 <= 0) {
                        int iM11307 = ThreadFactoryC3888.m11306("۫۠") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-22553)) ^ (-886512780);
                        i13 = i13;
                        i12 = iM11307 ^ (-252661901);
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM450210 ^ i10) * (-13789)) ^ 975630428;
                        i7 = 287521015;
                        i12 = iM450210 ^ i7;
                        i11 = i6;
                    }
                    break;
                case 525144586:
                case 1978723837:
                    Arrays.fill(jArr, i13, i17, j3);
                    jArr[i17] = j2 | jArr[i17];
                    break;
                case 696049055:
                case 1469840775:
                    i20 = i15 & i19;
                    if (C0216.f1393 == 0) {
                        iM450210 = C19806.m45029("۫ۤ") ^ i10;
                        i6 = ((iM450210 ^ i9) * (-16715)) ^ (-2136154607);
                        i7 = -1344666719;
                        i12 = iM450210 ^ i7;
                        i11 = i6;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("۫۠") ^ i10;
                        i11 = ((iM11308 ^ i9) * (-22553)) ^ (-886512780);
                        i13 = i13;
                        i12 = iM11308 ^ (-252661901);
                    }
                    break;
                case 1245974492:
                case 1834603307:
                    break;
                case 1312324839:
                case 1485091153:
                    i19 = 63;
                    if (!C0962.f3784) {
                        iM450210 = (ThreadFactoryC3888.m11306("᩻᩷") + i10) * (-25);
                        i6 = ((iM450210 ^ i9) * 3401) ^ 1231078008;
                        i7 = -471455792;
                        i12 = iM450210 ^ i7;
                        i11 = i6;
                    } else {
                        i3 = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-2901)) ^ 2133138461;
                        i5 = -640762643;
                        i11 = i4;
                        int i29 = i3;
                        i12 = iM45029 ^ i5;
                        i13 = i29;
                    }
                    break;
                case 1490192902:
                case 1741937189:
                    i3 = i13;
                    if (i >= i2) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܳ") + i9) * (-83);
                        i4 = ((iM45029 ^ i10) * (-15873)) ^ 91798257;
                        i5 = 728315867;
                    } else {
                        iM45029 = C19806.m45029("ᩴ۟") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-20665)) ^ (-1337583107);
                        i5 = -1107041519;
                    }
                    i11 = i4;
                    int i210 = i3;
                    i12 = iM45029 ^ i5;
                    i13 = i210;
                    break;
                default:
                    i15 = i2 + i21;
                    i16 = 6;
                    if (C0216.f1393 == 0) {
                        i3 = i13;
                        iM45029 = (i9 - C19806.m45029("ᩳܿ")) * (-77);
                        i4 = ((iM45029 ^ i10) * 21355) ^ (-1180462375);
                        i5 = -1763352584;
                        i11 = i4;
                        int i211 = i3;
                        i12 = iM45029 ^ i5;
                        i13 = i211;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("۫۠") ^ i10;
                        i11 = ((iM11309 ^ i9) * (-22553)) ^ (-886512780);
                        i13 = i13;
                        i12 = iM11309 ^ (-252661901);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:249:0x14b8 A[PHI: r0 r5 r6 r8 r9 r10 r12 r16 r20 r21 r24 r25 r27 r28 r29 r32 r33 r34 r35 r36 r38 r40 r41 r44 r48 r50
      0x14b8: PHI (r0v20 int) = (r0v15 int), (r0v19 int), (r0v21 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r5v31 int) = (r5v26 int), (r5v30 int), (r5v32 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r6v20 long) = (r6v15 long), (r6v19 long), (r6v21 long) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r8v19 int) = (r8v14 int), (r8v18 int), (r8v20 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r9v19 int) = (r9v14 int), (r9v18 int), (r9v20 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r10v20 int) = (r10v15 int), (r10v19 int), (r10v21 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r12v20 int) = (r12v15 int), (r12v19 int), (r12v21 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r16v20 int) = (r16v15 int), (r16v19 int), (r16v21 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r20v18 int) = (r20v13 int), (r20v17 int), (r20v19 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r21v19 int) = (r21v14 int), (r21v18 int), (r21v20 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r24v18 byte[]) = (r24v13 byte[]), (r24v17 byte[]), (r24v19 byte[]) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r25v18 int) = (r25v13 int), (r25v17 int), (r25v19 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r27v18 int) = (r27v13 int), (r27v17 int), (r27v19 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r28v16 l.ܰۖ᩹) = (r28v11 l.ܰۖ᩹), (r28v15 l.ܰۖ᩹), (r28v17 l.ܰۖ᩹) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r29v19 int) = (r29v14 int), (r29v18 int), (r29v20 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r32v19 int) = (r32v14 int), (r32v18 int), (r32v20 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r33v16 int) = (r33v11 int), (r33v15 int), (r33v17 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r34v16 l.ۛۨ᩹) = (r34v11 l.ۛۨ᩹), (r34v15 l.ۛۨ᩹), (r34v17 l.ۛۨ᩹) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r35v15 int) = (r35v10 int), (r35v14 int), (r35v16 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r36v15 int[]) = (r36v10 int[]), (r36v14 int[]), (r36v16 int[]) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r38v16 long) = (r38v11 long), (r38v15 long), (r38v17 long) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r40v2 short[]) = (r40v1 short[]), (r40v1 short[]), (r40v3 short[]) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r41v2 char) = (r41v1 char), (r41v1 char), (r41v3 char) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r44v15 int) = (r44v10 int), (r44v14 int), (r44v16 int) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r48v23 long) = (r48v18 long), (r48v22 long), (r48v24 long) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]
      0x14b8: PHI (r50v8 long) = (r50v3 long), (r50v7 long), (r50v9 long) binds: [B:248:0x14b6, B:232:0x133b, B:228:0x12e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0398 A[PHI: r9 r33 r34
      0x0398: PHI (r9v120 int) = (r9v114 int), (r9v2 int) binds: [B:61:0x037b, B:54:0x031e] A[DONT_GENERATE, DONT_INLINE]
      0x0398: PHI (r33v62 l.ۛۨ᩹) = (r33v60 l.ۛۨ᩹), (r33v63 l.ۛۨ᩹) binds: [B:61:0x037b, B:54:0x031e] A[DONT_GENERATE, DONT_INLINE]
      0x0398: PHI (r34v74 int) = (r34v70 int), (r34v75 int) binds: [B:61:0x037b, B:54:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0222, code lost:
    
        if (l.C2704.f10408 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x027a, code lost:
    
        if (l.C1377.f5749 != false) goto L29;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5070 m14122(java.io.DataInput r58, int r59, int r60, l.C6045[] r61, l.C5401 r62) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5070.m14122(java.io.DataInput, int, int, l.ۛۨ᩹[], l.ۚܰ᩹):l.ۚۖ᩹");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14116(int i, int[] iArr) {
        int i2 = 0;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 617850848;
        int i7 = C0278.f1572;
        int i8 = C2642.f10294;
        int iM11306 = ThreadFactoryC3888.m11306("ۜ֡") ^ i8;
        int i9 = ((iM11306 ^ i7) * 5139) ^ 747599776;
        int i10 = 1683100365;
        while (true) {
            i6 = ((((i6 ^ i7) * 21987) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2065605080:
                case -1881578483:
                    return i2;
                case -2005703974:
                case 1597843148:
                    CallableC1627.m5507();
                    return 0;
                case -1942284765:
                case 548174378:
                    if (i2 < length) {
                        iM11306 = C19806.m45029("ܽۚ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 18249) ^ (-1452260682);
                        i10 = 142532258;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩺") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-19633)) ^ (-1096529991);
                        i10 = -1718184522;
                    }
                    break;
                case -1825228347:
                case 335441495:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۨ") + i7) * (-71);
                        i9 = ((iM11306 ^ i8) * 9233) ^ (-977010291);
                        i10 = -415412973;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ᩳۡ")) * (-97);
                        i9 = ((iM11306 ^ i8) * 19615) ^ 91427308;
                        i10 = -373321522;
                    }
                    break;
                case -1758421437:
                case 689340842:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("֡ᩳ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 18629) ^ (-2016374772);
                        i10 = -497681966;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ܰܰ")) * (-3);
                        i9 = ((iM11306 ^ i8) * 5499) ^ (-1439782798);
                        i10 = 1557941205;
                    }
                    break;
                case -1427156512:
                case -14536121:
                    C1189.m4368();
                    if (C1025.m3861() <= 0) {
                        iM11306 = (C19806.m45029("ܿܿ") + i8) * 3;
                        i9 = ((iM11306 ^ i7) * 22213) ^ (-448525455);
                        i10 = 2052818926;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i7) * (-77);
                        i9 = ((iM11306 ^ i8) * 5163) ^ (-1300146040);
                        i10 = 2067237932;
                    }
                    break;
                case -1217077120:
                case 2091212291:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۨ") + i7) * (-71);
                        i9 = ((iM11306 ^ i8) * 9233) ^ (-977010291);
                        i10 = -415412973;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ܰۛ")) * 9;
                        i9 = ((iM11306 ^ i8) * 18953) ^ (-77601473);
                        i10 = 540117558;
                    }
                    break;
                case -1120456212:
                case 536863511:
                    i2 = i5 + 1;
                    iM11306 = C19806.m45029("ۜۘ") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-22089)) ^ 10076830;
                    i10 = 1037804081;
                    break;
                case -1076524800:
                case -380615328:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۨ") + i7) * (-71);
                        i9 = ((iM11306 ^ i8) * 9233) ^ (-977010291);
                        i10 = -415412973;
                    } else {
                        iM11306 = C19806.m45029("᩹ۗ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 28769) ^ 799935932;
                        i10 = 958095202;
                    }
                    break;
                case -1061532455:
                case 646127142:
                    length = iArr.length;
                    i2 = 0;
                    iM11306 = C19806.m45029("ۜۘ") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-22089)) ^ 10076830;
                    i10 = 1037804081;
                    break;
                case -967058376:
                case 1158689402:
                    i5 = i3 >>> i4;
                    if (iArr[i5] < i) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜᩴ") + i7) * 61;
                        i9 = ((iM11306 ^ i8) * 15619) ^ (-1451409776);
                        i10 = 443231060;
                    } else {
                        length = i5;
                        iM11306 = C19806.m45029("ۜۘ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-22089)) ^ 10076830;
                        i10 = 1037804081;
                    }
                    break;
                case -873412493:
                case 400901029:
                    i3 = i2 + length;
                    i4 = 1;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۨ") + i7) * (-71);
                        i9 = ((iM11306 ^ i8) * 9233) ^ (-977010291);
                        i10 = -415412973;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-27363)) ^ (-604677598);
                        i10 = 1518864125;
                    }
                    break;
                case -485802022:
                case 2076816050:
                    if (C0050.m946() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i7) * (-77);
                        i9 = ((iM11306 ^ i8) * 5163) ^ (-1300146040);
                        i10 = 2067237932;
                    } else {
                        iM11306 = (C19806.m45029("۫ܿ") + i8) * 45;
                        i9 = ((iM11306 ^ i7) * 20539) ^ 788084079;
                        i10 = -1913628922;
                    }
                    break;
                case -466291852:
                case 59450320:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i7) * (-77);
                        i9 = ((iM11306 ^ i8) * 5163) ^ (-1300146040);
                        i10 = 2067237932;
                    } else {
                        iM11306 = (i7 - C19806.m45029("᩸ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM11306 ^ i8) * (-22901)) ^ 1527498548;
                        i10 = 70460323;
                    }
                    break;
                case -289640620:
                case 874901122:
                    C1875.m6086();
                    if (!C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i8;
                        i9 = ((iM11306 ^ i7) * 27129) ^ (-1135928082);
                        i10 = 893972521;
                    } else {
                        iM11306 = C19806.m45029("֡ᩳ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 18629) ^ (-2016374772);
                        i10 = -497681966;
                    }
                    break;
                case 69756520:
                case 1527012487:
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("᩺۟") ^ i8;
                        i9 = ((iM11306 ^ i7) * 17647) ^ (-874368486);
                        i10 = -1934788518;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i7) * (-77);
                        i9 = ((iM11306 ^ i8) * 5163) ^ (-1300146040);
                        i10 = 2067237932;
                    }
                    break;
                case 613327264:
                case 1166603356:
                    RunnableC0195.m1431();
                    if (!C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i8;
                        i9 = ((iM11306 ^ i7) * 27129) ^ (-1135928082);
                        i10 = 893972521;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i7) * (-77);
                        i9 = ((iM11306 ^ i8) * 5163) ^ (-1300146040);
                        i10 = 2067237932;
                    }
                    break;
                case 718492578:
                case 1890655936:
                    C2249.m6915();
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i7) * (-77);
                    i9 = ((iM11306 ^ i8) * 5163) ^ (-1300146040);
                    i10 = 2067237932;
                    break;
                case 1050635977:
                case 1817526982:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("ܿܿ") + i8) * 3;
                        i9 = ((iM11306 ^ i7) * 22213) ^ (-448525455);
                        i10 = 2052818926;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֫") + i8) * 73;
                        i9 = ((iM11306 ^ i7) * 12609) ^ 455833114;
                        i10 = 2028221501;
                    }
                    break;
                default:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ܿܿ") + i8) * 3;
                        i9 = ((iM11306 ^ i7) * 22213) ^ (-448525455);
                        i10 = 2052818926;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۧ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-32439)) ^ 969544018;
                        i10 = -154410075;
                    }
                    break;
            }
        }
    }
}
