package l;

import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܿۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAQE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17236 extends AbstractC17535 {

    /* JADX INFO: renamed from: ᩸᩸֨, reason: not valid java name and contains not printable characters */
    private static final short[] f54911 = {3140, -8392, -8385, -8412, -8330, -8412, -8386, -8330, -8415, -8408, -8413, -8406, -8391, -8411, -8330, -8426, -8432, -8336, -8351, -8339};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f54912;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri f54913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f54914;

    /* JADX WARN: Code duplicated, block: B:44:0x014e A[PHI: r6 r7 r8 r17
      0x014e: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:43:0x014c, B:39:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:43:0x014c, B:39:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:43:0x014c, B:39:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r17v10 int) = (r17v9 int), (r17v11 int) binds: [B:43:0x014c, B:39:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6 A[PHI: r2 r9 r11 r17
      0x01a6: PHI (r2v3 long) = (r2v2 long), (r2v1 long), (r2v1 long), (r2v1 long) binds: [B:51:0x01a4, B:35:0x0108, B:27:0x00c6, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:51:0x01a4, B:35:0x0108, B:27:0x00c6, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:51:0x01a4, B:35:0x0108, B:27:0x00c6, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r17v18 int) = (r17v7 int), (r17v12 int), (r17v14 int), (r17v21 int) binds: [B:51:0x01a4, B:35:0x0108, B:27:0x00c6, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f7 A[PHI: r4 r10 r12 r13 r17 r18
      0x01f7: PHI (r4v4 long) = (r4v1 long), (r4v1 long), (r4v3 long), (r4v1 long), (r4v1 long), (r4v1 long) binds: [B:59:0x01f5, B:55:0x01d4, B:47:0x0185, B:31:0x00e5, B:23:0x00a4, B:8:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:59:0x01f5, B:55:0x01d4, B:47:0x0185, B:31:0x00e5, B:23:0x00a4, B:8:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:59:0x01f5, B:55:0x01d4, B:47:0x0185, B:31:0x00e5, B:23:0x00a4, B:8:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r13v3 java.io.InputStream) = 
      (r13v1 java.io.InputStream)
      (r13v1 java.io.InputStream)
      (r13v1 java.io.InputStream)
      (r13v1 java.io.InputStream)
      (r13v2 java.io.InputStream)
      (r13v1 java.io.InputStream)
     binds: [B:59:0x01f5, B:55:0x01d4, B:47:0x0185, B:31:0x00e5, B:23:0x00a4, B:8:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r17v19 int) = (r17v5 int), (r17v6 int), (r17v8 int), (r17v13 int), (r17v15 int), (r17v20 int) binds: [B:59:0x01f5, B:55:0x01d4, B:47:0x0185, B:31:0x00e5, B:23:0x00a4, B:8:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r18v3 char) = (r18v2 char), (r18v1 char), (r18v1 char), (r18v1 char), (r18v1 char), (r18v1 char) binds: [B:59:0x01f5, B:55:0x01d4, B:47:0x0185, B:31:0x00e5, B:23:0x00a4, B:8:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (l.C1066.f4915 > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17236.hashCode():int");
    }

    public final boolean equals(Object obj) {
        C17236 c17236 = null;
        long j = 0;
        int i = 1647195216;
        int i2 = C0278.f1572;
        int i3 = C10634.f36300;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿ᩻")) * (-59);
        int i4 = ((iM11306 ^ i2) * 11199) ^ 269704182;
        int i5 = 617083346;
        while (true) {
            i = ((((i ^ i2) * (-15661)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2029020550:
                case -608346342:
                    return true;
                case -2010453693:
                case 401236149:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i3 - C19806.m45029("᩹ۚ")) * (-33);
                        i4 = ((iM11306 ^ i2) * (-24835)) ^ (-1587476900);
                        i5 = 1180335984;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i3) * 5;
                        i4 = ((iM11306 ^ i2) * 27959) ^ (-370915303);
                        i5 = -565114098;
                    }
                    break;
                case -1852756562:
                case -1774629912:
                    if (CallableC1627.m5505(this.f54912, c17236.f54912)) {
                        iM11306 = (C19806.m45029("ۨ֨") ^ i3) * 87;
                        i4 = ((iM11306 ^ i2) * (-31917)) ^ 1656731886;
                        i5 = 1835458919;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") + i3) * (-11);
                        i4 = ((iM11306 ^ i2) * 17209) ^ (-1941214671);
                        i5 = -429597019;
                    }
                    break;
                case -1723666337:
                case 1794018918:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۧ") ^ i2) * (-61);
                        i4 = ((iM11306 ^ i3) * (-22553)) ^ (-1113291398);
                        i5 = 1155895168;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25955)) ^ (-1408742024);
                        i5 = 1611679389;
                    }
                    break;
                case -1413845751:
                case -1098174777:
                    C0671.m3008();
                    iM11306 = C19806.m45029("۬۫") ^ i2;
                    i4 = ((iM11306 ^ i3) * 19655) ^ (-1106436165);
                    i5 = 450380298;
                    break;
                case -1326846748:
                case 1556482137:
                    c17236 = (C17236) obj;
                    j = this.f54914;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩹ۚ")) * (-33);
                        i4 = ((iM11306 ^ i2) * (-24835)) ^ (-1587476900);
                        i5 = 1180335984;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۨ᩶")) * (-83);
                        i4 = ((iM11306 ^ i3) * 1039) ^ 1183024907;
                        i5 = 958977408;
                    }
                    break;
                case -1322548042:
                case 1298110370:
                    if (C2704.m8252(this.f54913, c17236.f54913)) {
                        iM11306 = (i2 - C19806.m45029("ۢ۠")) * (-71);
                        i4 = ((iM11306 ^ i3) * 9697) ^ 2043905228;
                        i5 = 1168772623;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") + i3) * (-11);
                        i4 = ((iM11306 ^ i2) * 17209) ^ (-1941214671);
                        i5 = -429597019;
                    }
                    break;
                case -1032103400:
                case 1699118539:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۧ") ^ i2) * (-61);
                        i4 = ((iM11306 ^ i3) * (-22553)) ^ (-1113291398);
                        i5 = 1155895168;
                    } else {
                        iM11306 = C19806.m45029("۬۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19655) ^ (-1106436165);
                        i5 = 450380298;
                    }
                    break;
                case -870618932:
                case 128949266:
                    C3535.m10431();
                    return false;
                case -723344324:
                case 1268725285:
                    if (j == c17236.f54914) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬᩻")) * (-107);
                        i4 = ((iM11306 ^ i2) * (-8917)) ^ (-396471187);
                        i5 = -1738226630;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") + i3) * (-11);
                        i4 = ((iM11306 ^ i2) * 17209) ^ (-1941214671);
                        i5 = -429597019;
                    }
                    break;
                case -556514535:
                case 1128229819:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۧ") ^ i2) * (-61);
                        i4 = ((iM11306 ^ i3) * (-22553)) ^ (-1113291398);
                        i5 = 1155895168;
                    } else {
                        iM11306 = C19806.m45029("ۘܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29427)) ^ (-2078547071);
                        i5 = -1347321368;
                    }
                    break;
                case -478153146:
                case -237915941:
                    if (C19806.f63586) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ֨")) * 19;
                        i4 = ((iM11306 ^ i2) * 5685) ^ 1236666957;
                        i5 = -281687143;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۗ۫")) * 55;
                        i4 = ((iM11306 ^ i3) * 23587) ^ 1177761768;
                        i5 = 179959888;
                    }
                    break;
                case -361482921:
                case 1591429349:
                    if (obj instanceof C17236) {
                        iM11306 = (C19806.m45029("᩻ܳ") ^ i3) * (-105);
                        i4 = ((iM11306 ^ i2) * (-20137)) ^ 589965251;
                        i5 = -116123508;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") + i3) * (-11);
                        i4 = ((iM11306 ^ i2) * 17209) ^ (-1941214671);
                        i5 = -429597019;
                    }
                    break;
                case -281354729:
                case 647782054:
                    RunnableC1895.m6170();
                    if (C0671.m3008() < 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܳ")) * 93;
                        i4 = ((iM11306 ^ i3) * 23491) ^ 259126348;
                        i5 = -1947189779;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ֨")) * 19;
                        i4 = ((iM11306 ^ i2) * 5685) ^ 1236666957;
                        i5 = -281687143;
                    }
                    break;
                case 148315480:
                case 956282001:
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ֨")) * 19;
                        i4 = ((iM11306 ^ i2) * 5685) ^ 1236666957;
                        i5 = -281687143;
                    } else {
                        iM11306 = C19806.m45029("۬۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19655) ^ (-1106436165);
                        i5 = 450380298;
                    }
                    break;
                case 280340193:
                case 315960054:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ֨")) * 19;
                        i4 = ((iM11306 ^ i2) * 5685) ^ 1236666957;
                        i5 = -281687143;
                    } else {
                        iM11306 = (C19806.m45029("ۤܳ") ^ i2) * 63;
                        i4 = ((iM11306 ^ i3) * (-6655)) ^ 1046758212;
                        i5 = 571788878;
                    }
                    break;
                case 577982305:
                case 1653916694:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("۬۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19655) ^ (-1106436165);
                        i5 = 450380298;
                    } else {
                        iM11306 = C19806.m45029("ۗۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12415) ^ (-577554758);
                        i5 = -706041604;
                    }
                    break;
                case 1613458531:
                case 1733081325:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ֨")) * 19;
                        i4 = ((iM11306 ^ i2) * 5685) ^ 1236666957;
                        i5 = -281687143;
                    } else {
                        iM11306 = C19806.m45029("۟֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10005) ^ 1106161791;
                        i5 = -1460779401;
                    }
                    break;
                case 1637841154:
                case 2103738047:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩸ܳ")) * 93;
                        i4 = ((iM11306 ^ i3) * 23491) ^ 259126348;
                        i5 = -1947189779;
                    } else {
                        iM11306 = (C19806.m45029("۫ۡ") + i2) * (-5);
                        i4 = ((iM11306 ^ i3) * (-11705)) ^ (-1125128846);
                        i5 = 199500962;
                    }
                    break;
                case 1699026272:
                case 2114538646:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = C19806.m45029("۬۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19655) ^ (-1106436165);
                        i5 = 450380298;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1217) ^ 1471128004;
                        i5 = -324641751;
                    }
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        if (l.C0629.f2722 > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17236.toString():java.lang.String");
    }

    public C17236(Uri uri, InputStream inputStream, long j) {
        this.f54913 = uri;
        this.f54912 = inputStream;
        this.f54914 = j;
    }

    public final long length() {
        return this.f54914;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m40173() {
        return this.f54912;
    }
}
