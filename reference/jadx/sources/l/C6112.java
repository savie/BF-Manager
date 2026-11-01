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

/* JADX INFO: renamed from: l.ۛܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes.dex */
public final class C6112 {

    /* JADX INFO: renamed from: ᩻ᩴܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f20855;

    static {
        ApplicationC6132.m17119(86);
        f20855 = new short[]{666, 6257, 6240, 6242, 6250, 6240, 6246, 6244, 6190, 6257, 6240, 6242, 6250, 6240, 6246, 6244, 6188, 6248, 6255, 6247, 6254, 6193, 6265, 6248, 6245, 6255, 6240, 6252, 6244, 6242, 6254, 6255, 6247, 6248, 6246, 6221, 6240, 6264, 6254, 6260, 6261, 6257, 6259, 6244, 6247, 6248, 6265, 6253, 6248, 6243, 6259, 6240, 6259, 6264, 6254, 6263, 6244, 6259, 6253, 6240, 6264, 6244, 6255, 6261, 6259, 6264, 6240, 6242, 6261, 6254, 6259, 6258, 6261, 6240, 6246, 6244, 6245, 6208, 6253, 6248, 6240, 6258, 6240, 6261, 6261, 6259, 6258, 6261, 6240, 6246, 6244, 6245, 6227, 6244, 6258, 6216, 6245, 6247, 6248, 6255, 6240, 6253, 6248, 6267, 6244, 6245, 6227, 6244, 6258, 6216, 6245, 6257, 6254, 6253, 6248, 6242, 6264, 6247, 6253, 6240, 6246, 6258, 6239, 6240, 6261, 6261, 6259, 6188, 6257, 6259, 6248, 6263, 6240, 6261, 6244, 6234, 6237, 6262, 6237, 6188, 6239, 6236, 6186, 6261, 6264, 6257, 6244, 6180, 6193, 6195, 6233, 6261, 6264, 6257, 6244, 6188, 6248, 6255, 6247, 6254, 6261, 6264, 6257, 6244, 6259, 6244, 6240, 6253, 6223, 6240, 6252, 6244, 6261, 6259, 6260, 6244, 6245, 6244, 6247, 6240, 6260, 6253, 6261, 6225, 6260, 6243, 6253, 6248, 6242, 6245, 6244, 6247, 6240, 6260, 6253, 6261, 6230, 6244, 6240, 6250, 6245, 6244, 6247, 6240, 6260, 6253, 6261, 6210, 6254, 6252, 6257, 6240, 6242, 6261, 6234, 6206, 6209, 6236, 6238, 6257, 6259, 6248, 6188, 6258, 6261, 6240, 6246, 6244, 6245, 6208, 6257, 6248, 6244, 6265, 6261, 6259, 6240, 6229, 6264, 6257, 6244, 6226, 6257, 6244, 6242, 6215, 6253, 6240, 6246, 6258, 4972, -7050, -7067, -7068, -7052, -7057, -7046, -7045, -7052, -7048, -7047, -7055, -7042, -7056, -7053, -7050, -7069, -7050, -7047, -7050, -7046, -7054, -7069, -7046, -7065, -7085, -7042, -7067, -7057, -7046, -7045, -7068, -7085, -7050, -7069, -7050, -7057, -7046, -7045, -7068, -7065, -7044, -7056, -7068, -7048, -7067, -7069, -7067, -7054, -7068, -7048, -7070, -7067, -7052, -7054, -7068, 8169, -10312, -10325, -10326, -10310, -10250, -10323, -10316, -10327, -10339, -10320, -10325, -10312, -10325, -10326, -10310};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native List m17077(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z);

    /* JADX WARN: Code duplicated, block: B:119:0x03d3 A[PHI: r6 r7 r17 r19 r20
      0x03d3: PHI (r6v2 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v5 short[]) binds: [B:27:0x00b7, B:116:0x03ba, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r7v3 char) = (r7v1 char), (r7v2 char), (r7v1 char) binds: [B:27:0x00b7, B:116:0x03ba, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r17v37 int) = (r17v7 int), (r17v16 int), (r17v41 int) binds: [B:27:0x00b7, B:116:0x03ba, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r19v33 java.io.IOException) = (r19v3 java.io.IOException), (r19v13 java.io.IOException), (r19v35 java.io.IOException) binds: [B:27:0x00b7, B:116:0x03ba, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x03d3: PHI (r20v29 boolean) = (r20v1 boolean), (r20v9 boolean), (r20v32 boolean) binds: [B:27:0x00b7, B:116:0x03ba, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x040d A[PHI: r12 r17 r19 r20
      0x040d: PHI (r12v3 short) = (r12v1 short), (r12v2 short), (r12v1 short) binds: [B:122:0x040b, B:100:0x02f8, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x040d: PHI (r17v28 int) = (r17v15 int), (r17v20 int), (r17v29 int) binds: [B:122:0x040b, B:100:0x02f8, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x040d: PHI (r19v25 java.io.IOException) = (r19v12 java.io.IOException), (r19v17 java.io.IOException), (r3v1 java.io.IOException) binds: [B:122:0x040b, B:100:0x02f8, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x040d: PHI (r20v21 boolean) = (r20v8 boolean), (r20v13 boolean), (r2v1 boolean) binds: [B:122:0x040b, B:100:0x02f8, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x0445 A[PHI: r11 r17 r19 r20
      0x0445: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:126:0x0443, B:104:0x031e, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r17v35 int) = (r17v14 int), (r17v19 int), (r17v36 int) binds: [B:126:0x0443, B:104:0x031e, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r19v31 java.io.IOException) = (r19v11 java.io.IOException), (r19v16 java.io.IOException), (r19v32 java.io.IOException) binds: [B:126:0x0443, B:104:0x031e, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r20v27 boolean) = (r20v7 boolean), (r20v12 boolean), (r20v28 boolean) binds: [B:126:0x0443, B:104:0x031e, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x04b0 A[PHI: r17 r19 r20
      0x04b0: PHI (r17v34 int) = (r17v8 int), (r17v11 int), (r17v36 int) binds: [B:23:0x00a5, B:134:0x04ae, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x04b0: PHI (r19v30 java.io.IOException) = (r19v4 java.io.IOException), (r19v8 java.io.IOException), (r19v32 java.io.IOException) binds: [B:23:0x00a5, B:134:0x04ae, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x04b0: PHI (r20v26 boolean) = (r20v2 boolean), (r20v4 boolean), (r20v28 boolean) binds: [B:23:0x00a5, B:134:0x04ae, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.f7262 != false) goto L38;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m17078(l.AbstractC20745 r22, l.AbstractC20745 r23) {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6112.m17078(l.᩷۠ۚ, l.᩷۠ۚ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m17076(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) throws Throwable {
        boolean z = false;
        List listM17077 = null;
        Throwable th = null;
        int i = 356061226;
        int i2 = C0050.f912;
        int i3 = AbstractC0464.f2088;
        int iM45029 = (C19806.m45029("᩷۬") ^ i3) * 61;
        int i4 = ((iM45029 ^ i2) * 23939) ^ (-435828998);
        int i5 = 920854609;
        while (true) {
            i = ((((i ^ i2) * (-13929)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2078529297:
                case -257683100:
                    C0629.m2907();
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿ᩻")) * 97;
                        i4 = ((iM45029 ^ i2) * 19715) ^ 539114702;
                        i5 = 20210062;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21441) ^ 1450629925;
                        i5 = 1095742983;
                    }
                    break;
                case -1917221878:
                case 2079029230:
                    if (C3722.m10894() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿ᩻")) * 97;
                        i4 = ((iM45029 ^ i2) * 19715) ^ 539114702;
                        i5 = 20210062;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩶") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-11699)) ^ 988067851;
                        i5 = -921019206;
                    }
                    break;
                case -1810616269:
                case -1415897761:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ۤ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5489)) ^ 2069211366;
                        i5 = -935957109;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۫") ^ i3) * (-113);
                        i4 = ((iM45029 ^ i2) * (-9443)) ^ 1602708659;
                        i5 = -207733435;
                    }
                    break;
                case -1788169383:
                case -1639540882:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19853)) ^ (-1454208541);
                        i5 = 138779443;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10839) ^ (-1063385211);
                        i5 = 596310538;
                    }
                    break;
                case -1694133221:
                case 1601230214:
                    try {
                        listM17077 = m17077(abstractC20745, abstractC20746, z);
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12357)) ^ 133365042;
                        i5 = 1157938283;
                    } catch (Throwable th2) {
                        th = th2;
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۜ")) * (-53);
                        i4 = ((iM45029 ^ i3) * 19907) ^ 1620037834;
                        i5 = -299262886;
                    }
                    break;
                case -1447615995:
                case 224785536:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿ᩻")) * 97;
                        i4 = ((iM45029 ^ i2) * 19715) ^ 539114702;
                        i5 = 20210062;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۧ")) * (-97);
                        i4 = ((iM45029 ^ i2) * 10663) ^ (-1059890169);
                        i5 = -5022954;
                    }
                    break;
                case -1405313411:
                case -1232152670:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19853)) ^ (-1454208541);
                        i5 = 138779443;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܽ") ^ i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 9387) ^ 569310132;
                        i5 = 2118724132;
                    }
                    break;
                case -1302002075:
                case -1191679144:
                    z = true;
                    iM45029 = (i2 - C19806.m45029("᩸ۤ")) * (-57);
                    i4 = ((iM45029 ^ i3) * (-25483)) ^ (-16977341);
                    i5 = 1414210055;
                    break;
                case -1150714181:
                case 1654674320:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ۤ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5489)) ^ 2069211366;
                        i5 = -935957109;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜۚ")) * (-41);
                        i4 = ((iM45029 ^ i2) * (-9273)) ^ 2101746645;
                        i5 = 238969238;
                    }
                    break;
                case -1128715869:
                case 1033260199:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19853)) ^ (-1454208541);
                        i5 = 138779443;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21875) ^ (-1885533114);
                        i5 = 780800296;
                    }
                    break;
                case -1057803291:
                case 251968738:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۛۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23621) ^ (-1530858033);
                        i5 = -650055194;
                    } else {
                        iM45029 = C19806.m45029("ۤ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5489)) ^ 2069211366;
                        i5 = -935957109;
                    }
                    break;
                case -1017508130:
                case 2103221467:
                    C2788.m8472();
                    C0050.m946();
                    return null;
                case -1001503863:
                case 1344542603:
                    if (!C2332.f8260) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿ᩻")) * 97;
                        i4 = ((iM45029 ^ i2) * 19715) ^ 539114702;
                        i5 = 20210062;
                    } else {
                        iM45029 = C19806.m45029("ۤ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5489)) ^ 2069211366;
                        i5 = -935957109;
                    }
                    break;
                case -713935720:
                case 1994836029:
                    C8340.m21777();
                    throw th;
                case -697454471:
                case 1240919800:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19853)) ^ (-1454208541);
                        i5 = 138779443;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17413)) ^ 890796394;
                        i5 = -28348649;
                    }
                    break;
                case 493172563:
                case 1856835736:
                    C8340.m21777();
                    return listM17077;
                case 833463386:
                case 970807163:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-19853)) ^ (-1454208541);
                        i5 = 138779443;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3061)) ^ 1707657378;
                        i5 = -667053250;
                    }
                    break;
                case 1391962163:
                case 2084315557:
                    C1066.m4023();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۧ")) * (-97);
                    i4 = ((iM45029 ^ i2) * 10663) ^ (-1059890169);
                    i5 = -5022954;
                    break;
                default:
                    if (C0526.f2219) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳۧ")) * (-97);
                        i4 = ((iM45029 ^ i2) * 10663) ^ (-1059890169);
                        i5 = -5022954;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23063)) ^ 398960986;
                        i5 = 1710497258;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0093 A[PHI: r2 r4
      0x0093: PHI (r2v4 java.lang.StringBuilder) = (r2v3 java.lang.StringBuilder), (r2v2 java.lang.StringBuilder) binds: [B:25:0x0091, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:25:0x0091, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17075(String str, HashSet hashSet) {
        int iM45029;
        int i;
        String strM3407 = null;
        StringBuilder sbM23356 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1926866867;
        int i6 = C2642.f10294;
        int i7 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("ܳ᩻") ^ i6;
        int i8 = ((iM11306 ^ i7) * (-2657)) ^ (-911488323);
        int i9 = -352479538;
        while (true) {
            int i10 = iM11306 ^ i9;
            StringBuilder sb = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 26135) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1993982119:
                    case -177859236:
                        if (C2871.f10837 >= 0) {
                            iM45029 = C19806.m45029("֨ᩴ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 171) ^ 1214155422;
                            i = 1316324854;
                        } else {
                            iM45029 = C19806.m45029("ۚۚ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 28497) ^ (-1765315458);
                            i = -389679338;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -1860195396:
                    case -1253551307:
                        C0817.m3408(sb, 2);
                        if (C1460.f5948 < 0) {
                            iM45029 = C19806.m45029("᩵ۘ") ^ i6;
                            i8 = ((iM45029 ^ i7) * (-19829)) ^ (-1527116048);
                            i = -1961569314;
                            i10 = iM45029 ^ i;
                        }
                        break;
                    case -1802726681:
                    case -224395434:
                        strM3407 = C0817.m3407(sb);
                        i2 = 3;
                        iM45029 = (C19806.m45029("۬ۡ") ^ i7) * 65;
                        i8 = ((iM45029 ^ i6) * (-9711)) ^ (-133622767);
                        i = 1514253570;
                        i10 = iM45029 ^ i;
                        break;
                    case -1560467927:
                    case 172954083:
                        if (C1419.m4973()) {
                            iM45029 = (i6 - C19806.m45029("᩻֨")) * (-57);
                            i8 = ((iM45029 ^ i7) * (-22073)) ^ (-1707506772);
                            i = 625707744;
                        } else {
                            iM45029 = C19806.m45029("ۨۘ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-30987)) ^ 650243187;
                            i = -597705124;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -1439884045:
                    case 119448942:
                        if (C2124.f7782 > 0) {
                            iM45029 = (i6 - C19806.m45029("᩻֨")) * (-57);
                            i8 = ((iM45029 ^ i7) * (-22073)) ^ (-1707506772);
                            i = 625707744;
                        } else {
                            iM45029 = C19806.m45029("֨ᩴ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 171) ^ 1214155422;
                            i = 1316324854;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -1087533582:
                    case 1292944682:
                        C1066.m4023();
                        if (C0526.f2219) {
                            iM45029 = C19806.m45029("֨ᩴ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 171) ^ 1214155422;
                            i = 1316324854;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-25445)) ^ (-1402530328);
                            i = -1890327834;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -766355301:
                    case 2010255888:
                        C1875.m6086();
                        return null;
                    case -598490968:
                    case 1574276532:
                        if (C1025.f4800 < 0) {
                            sb = new StringBuilder();
                            C2788.m8480(sb, str);
                            if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            }
                            iM45029 = C19806.m45029("᩶ᩴ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 17889) ^ (-414797033);
                            i = -1429182543;
                            i10 = iM45029 ^ i;
                            break;
                        }
                        break;
                    case -568306080:
                    case -332828530:
                        i4 = i2 + i3;
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ܿۛ") ^ i6;
                            i8 = ((iM45029 ^ i7) * (-21615)) ^ 750433601;
                            i = 1407650262;
                            i10 = iM45029 ^ i;
                        }
                        break;
                    case -545768595:
                    case 852245721:
                        if (C1875.m6103(hashSet, strM3407)) {
                            iM45029 = C19806.m45029("۠ܿ") ^ i7;
                            i8 = ((iM45029 ^ i6) * 7031) ^ (-1037269837);
                            i = 1361369919;
                        } else {
                            iM45029 = C19806.m45029("ܽۘ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 29855) ^ (-1787493900);
                            i = 942656063;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case -144812436:
                    case 1332556466:
                        if (RunnableC0195.f1321 < 0) {
                            iM45029 = (C19806.m45029("ۗۙ") + i7) * 91;
                            i8 = ((iM45029 ^ i6) * 8979) ^ 1648625248;
                            i = 1583659319;
                            i10 = iM45029 ^ i;
                        }
                        break;
                    case -115255946:
                    case 695373141:
                        if (RunnableC1895.f7152) {
                            iM45029 = (i6 - C19806.m45029("ۙܿ")) * 57;
                            i8 = ((iM45029 ^ i7) * (-15289)) ^ (-828532068);
                            i = 801510678;
                        } else {
                            iM45029 = C19806.m45029("֨ᩴ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 171) ^ 1214155422;
                            i = 1316324854;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case 261911603:
                    case 1482025514:
                        C1377.m4833();
                        C0817.m3399();
                        iM45029 = (i6 - C19806.m45029("᩻֨")) * (-57);
                        i8 = ((iM45029 ^ i7) * (-22073)) ^ (-1707506772);
                        i = 625707744;
                        i10 = iM45029 ^ i;
                        break;
                    case 349244623:
                    case 666130238:
                        sbM23356 = C9023.m23356(str);
                        i3 = 1;
                        if (C2788.f10625 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-25445)) ^ (-1402530328);
                            i = -1890327834;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۜۨ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-28105)) ^ 851038170;
                            i = -917005096;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case 560156864:
                    case 1952067770:
                        return strM3407;
                    case 648758018:
                    case 1178927548:
                        if (C10634.f36300 >= 0) {
                            iM45029 = (i6 - C19806.m45029("᩻֨")) * (-57);
                            i8 = ((iM45029 ^ i7) * (-22073)) ^ (-1707506772);
                            i = 625707744;
                        } else {
                            iM45029 = C19806.m45029("᩻ܳ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-28323)) ^ (-70610428);
                            i = 2024310390;
                        }
                        i10 = iM45029 ^ i;
                        break;
                    case 1283232912:
                    case 2057959309:
                        C2124.m6683(sbM23356, i2);
                        strM3407 = C0817.m3407(sbM23356);
                        i2 = i4;
                        iM45029 = (C19806.m45029("۬ۡ") ^ i7) * 65;
                        i8 = ((iM45029 ^ i6) * (-9711)) ^ (-133622767);
                        i = 1514253570;
                        i10 = iM45029 ^ i;
                        break;
                    default:
                        CallableC1627.m5507();
                        if (RunnableC0195.f1321 >= 0) {
                            iM45029 = (i6 - C19806.m45029("᩻֨")) * (-57);
                            i8 = ((iM45029 ^ i7) * (-22073)) ^ (-1707506772);
                            i = 625707744;
                        } else {
                            iM45029 = C19806.m45029("ܰۡ") ^ i7;
                            i8 = ((iM45029 ^ i6) * 7957) ^ (-202308676);
                            i = 2099984449;
                        }
                        i10 = iM45029 ^ i;
                        break;
                }
            }
            iM11306 = ThreadFactoryC3888.m11306("ܽۧ") ^ i6;
            i8 = ((iM11306 ^ i7) * (-641)) ^ 1959978126;
            i9 = 1384863834;
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x064b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0669  */
    /* JADX WARN: Code duplicated, block: B:196:0x067c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0692  */
    /* JADX WARN: Code duplicated, block: B:200:0x069a  */
    /* JADX WARN: Code duplicated, block: B:201:0x06a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17073(C7262 c7262, final C22577 c22577, AbstractC20745 abstractC20745, C11018 c11018, final ThreadLocal threadLocal, final AbstractC20745 abstractC20746, final AtomicInteger atomicInteger, final ThreadLocal threadLocal2, List list, final boolean z, final ThreadLocal threadLocal3, int i, int i2) {
        String strM10056;
        int i3;
        String strM3859;
        String strM2308;
        boolean z2;
        C17212 c17212;
        C18597 c18597;
        C18597 c18598;
        C18597 c18599;
        String strM1437;
        HashSet hashSet;
        String str;
        String str2;
        int iMo25270;
        String str3;
        List list2 = list;
        short s = f20855[0];
        int i4 = s + 8840;
        int i5 = (s * 35360) - (i4 * i4) > 0 ? 46375 : 6145;
        C18597 c185910 = new C18597();
        C18597 c185911 = new C18597();
        C18597 c185912 = new C18597();
        AbstractC20745 abstractC20745M4364 = C1189.m4364(abstractC20745, c7262.getPackageName());
        int i6 = i;
        while (true) {
            boolean zM8474 = C2788.m8474(abstractC20745M4364);
            strM10056 = RunnableC3388.m10056(f20855, 1, 7, i5);
            if (!zM8474) {
                break;
            }
            StringBuilder sb = new StringBuilder(strM10056);
            C0817.m3408(sb, i6);
            abstractC20745M4364 = C1189.m4364(abstractC20745, C2124.m6674(sb));
            i6++;
        }
        if (abstractC20745M4364.mo33987()) {
            i3 = i6;
        } else {
            StringBuilder sb2 = new StringBuilder(strM10056);
            C0817.m3408(sb2, i6);
            abstractC20745M4364 = C1189.m4364(abstractC20745, C0817.m3407(sb2));
            ViewTreeObserverOnPreDrawListenerC3327.m9871(abstractC20745M4364);
            i3 = i6 + 1;
        }
        c11018.m27786(C2642.m8160(abstractC20745M4364));
        c11018.mo24508(i2);
        StringBuilder sb3 = new StringBuilder();
        C2788.m8480(sb3, C2642.m8160(abstractC20745M4364));
        String strM10057 = RunnableC3388.m10056(f20855, 8, 1, i5);
        C1148.m4223(sb3, strM10057);
        String strM3407 = C0817.m3407(sb3);
        C2093 c2093 = (C2093) threadLocal.get();
        C3286.m9779(c2093);
        C12463 c12463 = new C12463(C15489.m37076(strM3407, C0050.m940(f20855, 9, 12, i5)), c2093);
        if (c2093.m6635().length() > 20480) {
            c2093.m6635().m35462();
        }
        c12463.mo24062(strM10056);
        int iMo19106 = c7262.mo19106();
        C18597 c185913 = c185912;
        String strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(f20855, 21, 2, i5);
        String strM17074 = m17074(iMo19106, 2, strM9715);
        String strM8640 = C2871.m8640(f20855, 23, 2, i5);
        C2477.m7606(c12463, strM8640, strM17074);
        String packageName = c7262.getPackageName();
        C18597 c185914 = c185911;
        String strM6918 = C2249.m6918(f20855, 25, 4, i5);
        C2477.m7606(c12463, strM6918, packageName);
        if (c7262.mo19107() != EnumC10977.AOSP) {
            C2477.m7606(c12463, C1419.m4969(f20855, 29, 12, i5), c7262.mo19107().f37394);
        }
        String strM50081 = c22577.m50081(c7262.mo19106());
        if (!RunnableC0195.m1432(strM50081)) {
            RunnableC1606.m5466(c12463, C3535.m10423(f20855, 41, 6, i5), strM50081);
        }
        Iterator itM10417 = C3535.m10417(c7262.mo19108());
        while (RunnableC1564.m5348(itM10417)) {
            InterfaceC22661 interfaceC22661 = (InterfaceC22661) C0216.m1584(itM10417);
            Iterator it = itM10417;
            String strM38510 = C1025.m3859(f20855, 47, 7, i5);
            c12463.mo24062(strM38510);
            RunnableC1606.m5466(c12463, strM8640, m17074(interfaceC22661.mo35685(), 2, strM9715));
            C2477.m7606(c12463, strM6918, interfaceC22661.getPackageName());
            c12463.mo24060(strM38510);
            itM10417 = it;
        }
        Iterator itM4898 = C1398.m4898(c7262.mo19110());
        while (C0962.m3748(itM4898)) {
            InterfaceC14900 interfaceC14900 = (InterfaceC14900) C0216.m1584(itM4898);
            Iterator it2 = itM4898;
            String strM10058 = RunnableC3388.m10056(f20855, 54, 7, i5);
            c12463.mo24062(strM10058);
            C2477.m7606(c12463, strM6918, interfaceC14900.getName());
            if (!C2249.m6911(interfaceC14900.mo35622())) {
                C2477.m7606(c12463, C1148.m4230(f20855, 66, 5, i5), interfaceC14900.mo35622());
            }
            Iterator itM10418 = C3535.m10417(interfaceC14900.mo35623());
            while (C0962.m3748(itM10418)) {
                InterfaceC21249 interfaceC21249 = (InterfaceC21249) C0278.m1776(itM10418);
                Iterator it3 = itM10418;
                String strM2424 = C0526.m2424(f20855, UMErrorCode.E_UM_BE_CREATE_FAILED, 6, i5);
                c12463.mo24062(strM2424);
                String str4 = strM10057;
                String str5 = strM3407;
                RunnableC1606.m5466(c12463, C0797.m3361(f20855, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 5, i5), m17074(interfaceC21249.mo42826(), 8, strM9715));
                InterfaceC10609 interfaceC10609Mo42827 = interfaceC21249.mo42827();
                for (int i7 = 0; i7 < C7105.m18986(interfaceC10609Mo42827); i7++) {
                    c12463.mo24062(strM8640);
                    c12463.text(m17074(interfaceC10609Mo42827.getInt(i7), 8, strM9715));
                    c12463.mo24060(strM8640);
                }
                c12463.mo24060(strM2424);
                itM10418 = it3;
                strM10057 = str4;
                strM3407 = str5;
            }
            c12463.mo24060(strM10058);
            itM4898 = it2;
            strM6918 = strM6918;
        }
        String str6 = strM6918;
        String str7 = strM3407;
        String str8 = strM10057;
        Iterator itM10419 = C3535.m10417(c7262.mo19111());
        while (true) {
            boolean zM5348 = RunnableC1564.m5348(itM10419);
            strM3859 = C1025.m3859(f20855, 61, 5, i5);
            if (!zM5348) {
                break;
            }
            C20668 c20668 = (C20668) C0216.m1584(itM10419);
            String strM1429 = RunnableC0195.m1429(f20855, 71, 11, i5);
            c12463.mo24062(strM1429);
            for (Iterator itM104110 = C3535.m10417(c20668.mo37321()); RunnableC1564.m5348(itM104110); itM104110 = itM104110) {
                C15730 c15730 = (C15730) C0216.m1584(itM104110);
                c12463.mo24062(strM3859);
                RunnableC1606.m5466(c12463, C7105.m18989(f20855, 86, 11, i5), m17074(c15730.mo20683(), 8, strM9715));
                C2477.m7606(c12463, C2477.m7604(f20855, 97, 14, i5), m17074(c15730.mo20682(), 8, strM9715));
                c12463.mo24060(strM3859);
                itM10419 = itM10419;
            }
            c12463.mo24060(strM1429);
        }
        c12463.mo24060(strM10056);
        final C16696 c16696M30942 = c12463.m30942(C1189.m4364(abstractC20746, C2124.m6684(atomicInteger.getAndIncrement())), C1189.m4364(abstractC20746, C2124.m6684(atomicInteger.getAndIncrement())), (C11018) threadLocal2.get());
        ViewGroupOnHierarchyChangeListenerC1916.m6231(list2, new Callable() { // from class: l.᩵ܳۘ
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                boolean z3 = z;
                C16696 c16696 = c16696M30942;
                if (!z3) {
                    C17401 c17401 = (C17401) threadLocal3.get();
                    C13638.requireNonNull(c17401);
                    c17401.m40547(c16696);
                }
                return c16696;
            }
        });
        ArrayList arrayList = new ArrayList(c7262.mo7941());
        Iterator itM4899 = C1398.m4898(c7262.mo19112());
        int i8 = 0;
        while (true) {
            boolean zM3748 = C0962.m3748(itM4899);
            strM2308 = AbstractC0464.m2308(f20855, 82, 4, i5);
            if (!zM3748) {
                break;
            }
            C0206 c0206 = (C0206) C0216.m1584(itM4899);
            if (AbstractC0464.m2315(C1875.m6108(c0206), strM2308)) {
                arrayList.add(i8, c0206);
                i8++;
            } else {
                C3660.m10788(arrayList, c0206);
            }
        }
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet(C0050.m938(arrayList));
        C17212 c17213 = new C17212(C0050.m938(arrayList));
        Iterator itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
        while (C0962.m3748(itM9863)) {
            C0206 c0207 = (C0206) C0278.m1776(itM9863);
            boolean zM2315 = AbstractC0464.m2315(C1875.m6108(c0207), strM2308);
            Iterator it4 = itM9863;
            String str9 = strM2308;
            boolean zM2316 = AbstractC0464.m2315(C0671.m3020(c0207), C0817.m3406(f20855, 122, 13, i5));
            String strM6108 = C1875.m6108(c0207);
            if (!strM6108.matches(C1189.m4365(f20855, 135, 8, i5)) || C1977.m6360(strM6108) > 20) {
                strM6108 = String.format(C0629.m2906(f20855, 143, 8, i5), C1148.m4234(c0207.mo26942()));
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C0671.m3018(hashSet3, strM6108)) {
                strM6108 = m17075(strM6108, hashSet3);
                z2 = true;
            }
            C2788.m8468(c17213, c0207.mo26942(), strM6108);
            StringBuilder sb4 = new StringBuilder();
            String str10 = str7;
            C1148.m4223(sb4, str10);
            C2788.m8480(sb4, strM6108);
            HashSet hashSet4 = hashSet3;
            C2788.m8480(sb4, str8);
            String strM6674 = C2124.m6674(sb4);
            int iMo19107 = ((c7262.mo19106() & 255) << 24) | ((c0207.mo26942() & 255) << 16);
            Iterator itM48910 = C1398.m4898(c0207.mo25271());
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (!C0962.m3748(itM48910)) {
                    c17212 = c17213;
                    break;
                }
                Iterator itM48911 = C1398.m4898(((InterfaceC12783) C0278.m1776(itM48910)).mo31746());
                while (C0962.m3748(itM48911)) {
                    InterfaceC3609 interfaceC3609 = (InterfaceC3609) C0278.m1776(itM48911);
                    if (interfaceC3609.mo7649()) {
                        i12++;
                    } else {
                        i9++;
                    }
                    if (interfaceC3609.mo7648()) {
                        i10++;
                    } else {
                        i11++;
                    }
                    if (interfaceC3609.mo7646()) {
                        i13++;
                    } else {
                        i14++;
                    }
                }
                Iterator it5 = itM48910;
                c17212 = c17213;
                if (Math.abs(i12 - i9) > 50 && Math.abs(i10 - i11) > 50 && Math.abs(i13 - i14) > 50) {
                    break;
                }
                c17213 = c17212;
                itM48910 = it5;
            }
            int i15 = i9;
            int i16 = i10;
            int i17 = i11;
            String str11 = strM3859;
            int i18 = i13;
            int i19 = i14;
            boolean z3 = i12 > i15;
            if (z3) {
                c18597 = c185910;
                c18597.add(c0207.mo26942());
            } else {
                c18597 = c185910;
            }
            boolean z4 = i16 > i17;
            if (z4) {
                c18598 = c185914;
                c18598.add(c0207.mo26942());
            } else {
                c18598 = c185914;
            }
            boolean z5 = i18 > i19;
            if (z5) {
                c18599 = c185913;
                c18599.add(c0207.mo26942());
            } else {
                c18599 = c185913;
            }
            C2093 c2094 = (C2093) threadLocal.get();
            C3286.m9779(c2094);
            c185913 = c18599;
            c185914 = c18598;
            c185910 = c18597;
            HashSet hashSet5 = hashSet2;
            C12463 c12464 = new C12463(C15489.m37076(strM6674, RunnableC1564.m5344(f20855, 151, 9, i5)), c2094);
            if (c2094.m6635().length() > 20480) {
                c2094.m6635().m35462();
            }
            String strM10571 = C3577.m10571(f20855, DHParameters.DEFAULT_MINIMUM_LENGTH, 4, i5);
            c12464.mo24062(strM10571);
            C2477.m7606(c12464, strM8640, m17074(c0207.mo26942(), 2, strM9715));
            String strM1588 = C0216.m1588(f20855, 164, 8, i5);
            if (z2) {
                C2477.m7606(c12464, strM1588, C0671.m3020(c0207));
                c0207.m1534(strM6108);
            }
            String strM5070 = C1461.m5070(f20855, 172, 4, i5);
            if (z3) {
                RunnableC1606.m5466(c12464, C1937.m6288(f20855, PicnicEngine.MAX_AUX_BYTES, 13, i5), strM5070);
            }
            if (z4) {
                RunnableC1606.m5466(c12464, C1148.m4230(f20855, 189, 11, i5), strM5070);
            }
            if (z5) {
                RunnableC1606.m5466(c12464, C3743.m10964(f20855, 200, 14, i5), strM5070);
            }
            HashSet hashSet6 = new HashSet();
            int iMo1519 = c0207.mo1519();
            int i20 = 0;
            while (i20 < iMo1519) {
                String strM1533 = c0207.m1533(i20);
                if (strM1533 == null) {
                    str3 = strM1588;
                    hashSet = hashSet5;
                    zM2316 = zM2316;
                    str2 = str11;
                } else {
                    boolean zM6911 = C2249.m6911(strM1533);
                    String strM14210 = RunnableC0195.m1429(f20855, 214, 4, i5);
                    String strM6164 = RunnableC1895.m6164(f20855, 218, 1, i5);
                    if (zM6911) {
                        strM1437 = RunnableC0195.m1437(m17074(i20, 4, C1875.m6108(c0207)), strM14210, strM6164);
                        c0207.m1525(i20, strM1437);
                        break;
                    }
                    int iM8641 = C2871.m8641(strM1533);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= iM8641) {
                            strM1437 = strM1533;
                            break;
                        }
                        char cM8652 = C2871.m8652(strM1533, i21);
                        int i22 = iM8641;
                        if (('0' > cM8652 || cM8652 > '9') && (('a' > cM8652 || cM8652 > 'z') && !(('A' <= cM8652 && cM8652 <= 'Z') || cM8652 == '_' || cM8652 == '.'))) {
                            strM1437 = RunnableC0195.m1437(m17074(i20, 4, C1875.m6108(c0207)), strM14210, strM6164);
                            c0207.m1525(i20, strM1437);
                            break;
                        }
                        i21++;
                        iM8641 = i22;
                    }
                    hashSet = hashSet5;
                    if (zM2316 && C3535.m10416(hashSet, strM1437)) {
                        strM1437 = ViewTreeObserverOnPreDrawListenerC3327.m9865(ViewTreeObserverOnPreDrawListenerC3327.m9869(f20855, 219, 4, i5), strM1533);
                        c0207.m1525(i20, strM1437);
                    }
                    if (!C1875.m6103(hashSet6, strM1437) || C2249.m6911(strM1437)) {
                        str = strM1588;
                    } else {
                        int iM8642 = C2871.m8641(strM1437);
                        int i23 = 0;
                        while (true) {
                            if (i23 < iM8642) {
                                int i24 = iM8642;
                                char cM6362 = C1977.m6362(strM1437, i23);
                                str = strM1588;
                                if (cM6362 != '?' && cM6362 != '@') {
                                    i23++;
                                    iM8642 = i24;
                                    strM1588 = str;
                                }
                            } else {
                                str = strM1588;
                            }
                            if (zM2315) {
                                C1875.m6103(hashSet, strM1437);
                            }
                            str2 = str11;
                            c12464.mo24062(str2);
                            C2477.m7606(c12464, strM8640, m17074(iMo19107 | i20, 8, strM9715));
                            str6 = str6;
                            C2477.m7606(c12464, str6, strM1437);
                            if (c0207.mo25272(i20)) {
                                C2477.m7606(c12464, C2704.m8240(f20855, 223, 9, i5), strM5070);
                            }
                            iMo25270 = c0207.mo25270(i20);
                            if (iMo25270 != 0) {
                                C2477.m7606(c12464, AbstractC0464.m2308(f20855, 232, 18, i5), m17074(iMo25270, 8, strM9715));
                            }
                            if (AbstractC0464.m2315(strM1437, strM1533)) {
                                str3 = str;
                            } else {
                                str3 = str;
                                RunnableC1606.m5466(c12464, str3, strM1533);
                            }
                            c12464.mo24060(str2);
                        }
                    }
                    String strM7078 = C2332.m7078(m17074(iMo19107 | i20, 8, C15489.m37076(strM1437, strM6164)), strM14210, strM6164);
                    if (!C0671.m3018(hashSet6, strM7078)) {
                        strM7078 = m17075(RunnableC0195.m1437(ViewTreeObserverOnPreDrawListenerC3327.m9865(strM1533, strM6164), strM14210, strM6164), hashSet6);
                    }
                    strM1437 = strM7078;
                    c0207.m1525(i20, strM1437);
                    if (zM2315) {
                        C1875.m6103(hashSet, strM1437);
                    }
                    str2 = str11;
                    c12464.mo24062(str2);
                    C2477.m7606(c12464, strM8640, m17074(iMo19107 | i20, 8, strM9715));
                    str6 = str6;
                    C2477.m7606(c12464, str6, strM1437);
                    if (c0207.mo25272(i20)) {
                        C2477.m7606(c12464, C2704.m8240(f20855, 223, 9, i5), strM5070);
                    }
                    iMo25270 = c0207.mo25270(i20);
                    if (iMo25270 != 0) {
                        C2477.m7606(c12464, AbstractC0464.m2308(f20855, 232, 18, i5), m17074(iMo25270, 8, strM9715));
                    }
                    if (AbstractC0464.m2315(strM1437, strM1533)) {
                        str3 = str;
                        RunnableC1606.m5466(c12464, str3, strM1533);
                    } else {
                        str3 = str;
                    }
                    c12464.mo24060(str2);
                }
                i20++;
                str11 = str2;
                strM1588 = str3;
                zM2316 = zM2316;
                iMo1519 = iMo1519;
                strM10571 = strM10571;
                hashSet5 = hashSet;
            }
            c12464.mo24060(strM10571);
            final C16696 c16696M30943 = c12464.m30942(C1668.m5585(abstractC20746, C0817.m3410(atomicInteger.getAndIncrement())), C1189.m4364(abstractC20746, C2124.m6684(atomicInteger.getAndIncrement())), (C11018) threadLocal2.get());
            ViewGroupOnHierarchyChangeListenerC1916.m6231(list, new Callable() { // from class: l.ۡܳۘ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    boolean z6 = z;
                    C16696 c16696 = c16696M30943;
                    if (!z6) {
                        C17401 c17401 = (C17401) threadLocal3.get();
                        C13638.requireNonNull(c17401);
                        c17401.m40547(c16696);
                    }
                    return c16696;
                }
            });
            strM2308 = str9;
            strM3859 = str11;
            hashSet2 = hashSet5;
            hashSet3 = hashSet4;
            str7 = str10;
            itM9863 = it4;
            list2 = list;
            c17213 = c17212;
        }
        C17212 c17214 = c17213;
        List list3 = list2;
        String str12 = str7;
        Iterator itM48912 = C1398.m4898(c7262.mo19112());
        while (C0962.m3748(itM48912)) {
            InterfaceC19133 interfaceC19133 = (InterfaceC19133) C0216.m1584(itM48912);
            C2820 c2820 = new C2820();
            C18597 c185915 = c185910;
            c2820.f10704 = c185915.contains(interfaceC19133.mo26942());
            C18597 c185916 = c185914;
            c2820.f10703 = c185916.contains(interfaceC19133.mo26942());
            C18597 c185917 = c185913;
            c2820.f10702 = c185917.contains(interfaceC19133.mo26942());
            C17212 c17215 = c17214;
            String str13 = (String) c17215.m40144(interfaceC19133.mo26942(), (Integer) null);
            C1419.m4970(str13);
            StringBuilder sb5 = new StringBuilder();
            String str14 = str12;
            C2788.m8480(sb5, str14);
            C2788.m8480(sb5, str13);
            String str15 = str8;
            C2788.m8480(sb5, str15);
            final String strM6675 = C2124.m6674(sb5);
            HashSet hashSet7 = new HashSet();
            Iterator itM104111 = C3535.m10417(interfaceC19133.mo25271());
            while (RunnableC1564.m5348(itM104111)) {
                final InterfaceC12783 interfaceC12783 = (InterfaceC12783) C0216.m1584(itM104111);
                if (C0671.m3018(hashSet7, interfaceC12783.mo31757())) {
                    String str16 = str15;
                    final String str17 = str13;
                    String str18 = str13;
                    final C2820 c2821 = c2820;
                    Iterator it6 = itM48912;
                    List list4 = list3;
                    ViewGroupOnHierarchyChangeListenerC1916.m6231(list4, new Callable() { // from class: l.ۤܳۘ
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            C2093 c2095 = (C2093) threadLocal.get();
                            C13638.requireNonNull(c2095);
                            StringBuilder sbM8976 = C3012.m8976(strM6675, str17);
                            InterfaceC12783 interfaceC12784 = interfaceC12783;
                            sbM8976.append(interfaceC12784.mo31757());
                            C12463 c12465 = new C12463(sbM8976.toString(), c2095);
                            if (c2095.m6635().length() > 20480) {
                                c2095.m6635().m35462();
                            }
                            c12465.mo24062("resources");
                            if (interfaceC12784.mo31750()) {
                                c12465.mo24061("sparse", "true");
                            }
                            if (interfaceC12784.mo31748()) {
                                c12465.mo24061("offset16", "true");
                            }
                            Iterator it7 = interfaceC12784.mo31746().iterator();
                            while (it7.hasNext()) {
                                C7054.m18907(c12465, (InterfaceC3609) it7.next(), c22577, c2821);
                            }
                            c12465.mo24060("resources");
                            AtomicInteger atomicInteger2 = atomicInteger;
                            String strValueOf = String.valueOf(atomicInteger2.getAndIncrement());
                            AbstractC20745 abstractC20747 = abstractC20746;
                            C16696 c16696M30944 = c12465.m30942(abstractC20747.m46690(strValueOf), abstractC20747.m46690(String.valueOf(atomicInteger2.getAndIncrement())), (C11018) threadLocal2.get());
                            if (!z) {
                                C17401 c17401 = (C17401) threadLocal3.get();
                                C13638.requireNonNull(c17401);
                                c17401.m40547(c16696M30944);
                            }
                            return c16696M30944;
                        }
                    });
                    list3 = list4;
                    c185915 = c185915;
                    hashSet7 = hashSet7;
                    c185916 = c185916;
                    str14 = str14;
                    str13 = str18;
                    c17215 = c17215;
                    str15 = str16;
                    c185917 = c185917;
                    c2820 = c2820;
                    itM48912 = it6;
                }
            }
            str8 = str15;
            str12 = str14;
            c185910 = c185915;
            c17214 = c17215;
            c185913 = c185917;
            c185914 = c185916;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c5 A[PHI: r9
      0x01c5: PHI (r9v5 java.lang.StringBuilder) = 
      (r9v4 java.lang.StringBuilder)
      (r9v4 java.lang.StringBuilder)
      (r9v4 java.lang.StringBuilder)
      (r9v6 java.lang.StringBuilder)
     binds: [B:61:0x01c3, B:57:0x01a6, B:45:0x0158, B:31:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17074(int i, int i2, String str) {
        int iM45029;
        int i3;
        String hexString = null;
        int iM6360 = 0;
        int i4 = 0;
        int i5 = 1240178223;
        int i6 = C1668.f6641;
        int i7 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("᩹ܰ") ^ i6) * (-13);
        int i8 = ((iM11306 ^ i7) * 55) ^ (-1733584207);
        int i9 = -987339009;
        while (true) {
            int i10 = iM11306 ^ i9;
            StringBuilder sb = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 13063) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1947092842:
                    case 1671929116:
                        return C15489.m37076(str, hexString);
                    case -1946781785:
                    case 968703898:
                        if (C1875.m6086() != 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֨᩺") ^ i6;
                            i8 = ((iM45029 ^ i7) * 6583) ^ (-1891285723);
                            i3 = -1068762657;
                        } else {
                            iM45029 = (i6 - C19806.m45029("۟ܰ")) * (-63);
                            i8 = ((iM45029 ^ i7) * 5167) ^ (-1336190358);
                            i3 = 1485417476;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -1939578912:
                    case 293060975:
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (C19806.m45029("᩵ۤ") + i6) * 109;
                            i8 = ((iM45029 ^ i7) * 23731) ^ (-689497996);
                            i3 = -1603131636;
                        } else {
                            iM45029 = (C19806.m45029("ۤᩴ") + i6) * (-19);
                            i8 = ((iM45029 ^ i7) * (-12637)) ^ (-168707606);
                            i3 = 329997672;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -1938626493:
                    case -1050577198:
                        C2788.m8480(sb, hexString);
                        return C0817.m3407(sb);
                    case -1924453824:
                    case 1462885522:
                        if (C3660.f13403 >= 0) {
                        }
                        iM45029 = C19806.m45029("ܶܿ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 15733) ^ (-1531963986);
                        i3 = 1584806446;
                        i10 = iM45029 ^ i3;
                        break;
                    case -1830736072:
                    case 528746384:
                        if (i4 < iM6360) {
                            iM45029 = C19806.m45029("ܺ۟") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-2223)) ^ 469965708;
                            i3 = 191683513;
                        } else {
                            iM45029 = C19806.m45029("ܽ᩵") ^ i6;
                            i8 = ((iM45029 ^ i7) * 27155) ^ (-1574307968);
                            i3 = 453574148;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -1605497974:
                    case -1180946480:
                        ThreadFactoryC3888.m11302(sb, '0');
                        i4++;
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۢۧ")) * 43;
                        i8 = ((iM45029 ^ i6) * (-11167)) ^ (-221590374);
                        i3 = 296360573;
                        i10 = iM45029 ^ i3;
                        break;
                    case -1601707130:
                    case -776864966:
                        CallableC1627.m5507();
                        if (RunnableC0195.f1321 < 0) {
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֨᩺") ^ i6;
                        i8 = ((iM45029 ^ i7) * 6583) ^ (-1891285723);
                        i3 = -1068762657;
                        i10 = iM45029 ^ i3;
                        break;
                    case -1595598554:
                    case 1797913809:
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                            iM45029 = (C19806.m45029("ۤᩴ") + i6) * (-19);
                            i8 = ((iM45029 ^ i7) * (-12637)) ^ (-168707606);
                            i3 = 329997672;
                        } else {
                            iM45029 = C19806.m45029("ܺۛ") ^ i7;
                            i8 = ((iM45029 ^ i6) * 3547) ^ (-1116455031);
                            i3 = 1049930637;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -1133168967:
                    case -283500514:
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                            iM45029 = (i7 - C19806.m45029("ۚۜ")) * (-127);
                            i8 = ((iM45029 ^ i6) * (-30507)) ^ (-1171998843);
                            i3 = -1680576052;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ᩴۢ") ^ i7) * (-59);
                            i8 = ((iM45029 ^ i6) * 5031) ^ 418385863;
                            i3 = 1005514628;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -973113193:
                    case 212721736:
                        C2477.m7593();
                        C0817.m3399();
                        iM45029 = C19806.m45029("ܶܿ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 15733) ^ (-1531963986);
                        i3 = 1584806446;
                        i10 = iM45029 ^ i3;
                        break;
                    case -765083029:
                    case 247091084:
                        C1461.m5080();
                        if (C0797.f3386) {
                            iM45029 = ThreadFactoryC3888.m11306("֨᩺") ^ i6;
                            i8 = ((iM45029 ^ i7) * 6583) ^ (-1891285723);
                            i3 = -1068762657;
                        } else {
                            iM45029 = (i7 - C19806.m45029("ۚۜ")) * (-127);
                            i8 = ((iM45029 ^ i6) * (-30507)) ^ (-1171998843);
                            i3 = -1680576052;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -764870788:
                    case 1984683496:
                        if (C1668.f6641 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֨᩺") ^ i6;
                            i8 = ((iM45029 ^ i7) * 6583) ^ (-1891285723);
                            i3 = -1068762657;
                        } else {
                            iM45029 = (C19806.m45029("֫᩸") ^ i7) * 75;
                            i8 = ((iM45029 ^ i6) * (-3345)) ^ 276334073;
                            i3 = 1784093361;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -580358801:
                    case 114847130:
                        if (C1419.m4973()) {
                            iM45029 = (C19806.m45029("ۤᩴ") + i6) * (-19);
                            i8 = ((iM45029 ^ i7) * (-12637)) ^ (-168707606);
                            i3 = 329997672;
                        } else {
                            iM45029 = C19806.m45029("ܿܶ") ^ i6;
                            i8 = ((iM45029 ^ i7) * (-23503)) ^ (-582784989);
                            i3 = 2019568470;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case -528721686:
                    case 489943422:
                        if (!C0526.f2219) {
                            iM45029 = ThreadFactoryC3888.m11306("ۡۖ") ^ i7;
                            i8 = ((iM45029 ^ i6) * 18823) ^ (-465091875);
                            i3 = -640077240;
                            i10 = iM45029 ^ i3;
                        }
                        break;
                    case -107730694:
                    case -98869522:
                        hexString = Integer.toHexString(i);
                        if (C1977.m6360(hexString) < i2) {
                            iM45029 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i6;
                            i8 = ((iM45029 ^ i7) * 24267) ^ 477570550;
                            i3 = -16156826;
                        } else {
                            iM45029 = (C19806.m45029("ᩳۘ") ^ i7) * 99;
                            i8 = ((iM45029 ^ i6) * (-17197)) ^ (-1491338586);
                            i3 = -1074189139;
                        }
                        i10 = iM45029 ^ i3;
                        break;
                    case 30354814:
                    case 1752394647:
                        int iM8641 = C2871.m8641(str) + i2;
                        if (C1148.m4232() > 0) {
                            sb = new StringBuilder(iM8641);
                            if (C3743.f13569) {
                                iM45029 = C19806.m45029("ܰܺ") ^ i6;
                                i8 = ((iM45029 ^ i7) * (-27215)) ^ 1869294993;
                                i3 = -178078220;
                            } else {
                                iM45029 = (C19806.m45029("ۤᩴ") + i6) * (-19);
                                i8 = ((iM45029 ^ i7) * (-12637)) ^ (-168707606);
                                i3 = 329997672;
                            }
                            i10 = iM45029 ^ i3;
                        }
                        break;
                    case 549765658:
                    case 1589224128:
                        if (!C3286.f12186) {
                            iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i6;
                            i8 = ((iM45029 ^ i7) * 22703) ^ (-1596688567);
                            i3 = -516814249;
                            i10 = iM45029 ^ i3;
                        }
                        break;
                    case 823897273:
                    case 1645786977:
                        iM6360 = i2 - C1977.m6360(hexString);
                        C1148.m4223(sb, str);
                        i4 = 0;
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۢۧ")) * 43;
                        i8 = ((iM45029 ^ i6) * (-11167)) ^ (-221590374);
                        i3 = 296360573;
                        i10 = iM45029 ^ i3;
                        break;
                    default:
                        RunnableC1895.m6170();
                        return null;
                }
            }
            iM11306 = (i6 - ThreadFactoryC3888.m11306("ۨۗ")) * (-97);
            i8 = ((iM11306 ^ i7) * 31097) ^ 1966278435;
            i9 = -1771180520;
        }
    }
}
