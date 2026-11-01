package l;

import android.app.Activity;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10945 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37214;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37216;

    public /* synthetic */ RunnableC10945(int i, Object obj, Object obj2) {
        int i2 = 769522069;
        int i3 = C1937.f7317;
        int i4 = C0278.f1572;
        this.f37215 = i;
        this.f37216 = obj;
        this.f37214 = obj2;
        int iM45029 = C19806.m45029("۠ܶ") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-8619)) ^ (-303979447);
        int i6 = 1142584408;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i4) * (-1065)) >> 31));
            switch (i2) {
                case -2092179928:
                case -1035295245:
                    C0526.m2437();
                    if (C0962.m3746() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۛ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19839)) ^ (-210698521);
                        i6 = -1351338081;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۗܽ")) * (-115);
                        i5 = ((iM45029 ^ i4) * (-7435)) ^ 963925620;
                        i6 = -131601637;
                    }
                    break;
                case -1963088357:
                case 1620799292:
                    return;
                case -1497882202:
                case -1348018845:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8179) ^ 62730926;
                        i6 = -1960313400;
                    } else {
                        iM45029 = (C19806.m45029("۫ۗ") + i4) * 17;
                        i5 = ((iM45029 ^ i3) * 19361) ^ 2143365781;
                        i6 = 2008954315;
                    }
                    break;
                case -1308366622:
                case 264029205:
                    C3577.m10565();
                    C3286.m9798();
                    throw new RuntimeException();
                case -958512655:
                case -530619120:
                    C0629.m2907();
                    C3286.m9798();
                    iM45029 = ThreadFactoryC3888.m11306("ۡۛ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-19839)) ^ (-210698521);
                    i6 = -1351338081;
                    break;
                case -292521286:
                case 62896884:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27887)) ^ 1020567516;
                        i6 = 199240474;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۛ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19839)) ^ (-210698521);
                        i6 = -1351338081;
                    }
                    break;
                default:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27887)) ^ 1020567516;
                        i6 = 199240474;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۗ") + i4) * 41;
                        i5 = ((iM45029 ^ i3) * 16675) ^ 1924483637;
                        i6 = 1443130654;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03a2 A[PHI: r18
      0x03a2: PHI (r18v40 int) = (r18v11 int), (r18v12 int), (r18v41 int) binds: [B:115:0x03a0, B:111:0x0383, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x03d6 A[PHI: r18
      0x03d6: PHI (r18v30 int) = (r18v10 int), (r18v31 int) binds: [B:119:0x03d4, B:25:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x0409 A[PHI: r6 r7 r18
      0x0409: PHI (r6v4 java.io.InputStream) = (r6v1 java.io.InputStream), (r6v3 java.io.InputStream), (r6v1 java.io.InputStream) binds: [B:123:0x0407, B:84:0x025f, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r7v4 android.os.ParcelFileDescriptor$AutoCloseOutputStream) = 
      (r7v1 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
      (r7v3 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
      (r7v1 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
     binds: [B:123:0x0407, B:84:0x025f, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r18v33 int) = (r18v9 int), (r18v16 int), (r18v34 int) binds: [B:123:0x0407, B:84:0x025f, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x043b A[PHI: r18
      0x043b: PHI (r18v17 int) = (r18v8 int), (r18v13 int), (r18v18 int) binds: [B:127:0x0439, B:107:0x0361, B:80:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0478 A[PHI: r4 r5 r18 r19
      0x0478: PHI (r4v4 l.᩷᩻ۙ) = (r4v1 l.᩷᩻ۙ), (r4v3 l.᩷᩻ۙ), (r4v1 l.᩷᩻ۙ) binds: [B:133:0x0476, B:90:0x0288, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:133:0x0476, B:90:0x0288, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r18v37 int) = (r18v6 int), (r18v15 int), (r18v38 int) binds: [B:133:0x0476, B:90:0x0288, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r19v4 int) = (r19v3 int), (r19v1 int), (r19v1 int) binds: [B:133:0x0476, B:90:0x0288, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b A[PHI: r18
      0x007b: PHI (r18v39 int) = (r18v35 int), (r18v41 int) binds: [B:18:0x0078, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae A[PHI: r18
      0x00ae: PHI (r18v36 int) = (r18v29 int), (r18v35 int), (r18v38 int) binds: [B:28:0x00ab, B:18:0x0078, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf A[PHI: r18
      0x00cf: PHI (r18v32 int) = (r18v28 int), (r18v31 int), (r18v34 int) binds: [B:32:0x00cc, B:25:0x00a1, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef A[PHI: r18
      0x00ef: PHI (r18v42 int) = (r18v27 int), (r18v28 int), (r18v29 int), (r18v44 int) binds: [B:35:0x00e7, B:32:0x00cc, B:28:0x00ab, B:9:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ܺ᩻ۙ] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r2;
        ?? r3 = 0;
        Object obj = null;
        C21200 c21200 = null;
        int i7 = 0;
        InputStream inputStream = null;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = null;
        long j = 0;
        InterfaceC8978 interfaceC8978 = null;
        Throwable th = null;
        Throwable th2 = null;
        Object obj2 = null;
        Object obj3 = null;
        int i8 = -1378419434;
        int i9 = C0629.f2722;
        int i10 = C1461.f5957;
        int iM45029 = (i9 - C19806.m45029("۫ۗ")) * (-5);
        int i11 = ((iM45029 ^ i10) * (-24397)) ^ (-685226572);
        int i12 = iM45029 ^ (-1401505783);
        int i13 = 0;
        while (true) {
            int i14 = i12 ^ (i11 & (((i8 ^ i10) * 9839) >> 31));
            switch (i14) {
                case -2106122611:
                case -1676473462:
                    i = i14;
                    try {
                        ViewGroupOnHierarchyChangeListenerC1916.m6242(th, obj2);
                        iM11306 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 4753) ^ 1490562975;
                        i4 = -919365196;
                        r2 = r3;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iM11306 = C19806.m45029("۟ۜ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-20455)) ^ (-1023287882);
                        i4 = 367906694;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1988707055:
                case 890182039:
                    i = i14;
                    if (C3660.m10791() != 0) {
                        iM11306 = C19806.m45029("֫ۜ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-30561)) ^ 1989054524;
                        i4 = 771928122;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("ᩴܽ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-12355)) ^ (-1984432944);
                        i4 = 49891854;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1951364199:
                case 1030608495:
                    i = i14;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۗۧ")) * 99;
                        i3 = ((iM11306 ^ i9) * (-30219)) ^ (-889919674);
                        i4 = -311139303;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("ۚۜ") ^ i10;
                        i3 = ((iM11306 ^ i9) * 27579) ^ (-1978252424);
                        i4 = -245879625;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1932476987:
                case 1297866787:
                    i = i14;
                    Object obj4 = this.f37214;
                    obj = this.f37216;
                    switch (i13) {
                        case 0:
                            iM11306 = (C19806.m45029("ۙ᩺") + i9) * 55;
                            i3 = ((iM11306 ^ i10) * 13641) ^ (-370613490);
                            i4 = 1462351514;
                            r2 = obj4;
                            break;
                        case 1:
                            iM11306 = (ThreadFactoryC3888.m11306("ۢۘ") ^ i9) * (-101);
                            i3 = ((iM11306 ^ i10) * (-2873)) ^ (-1294861968);
                            i4 = 38903980;
                            r2 = obj4;
                            break;
                        case 2:
                            iM11306 = (C19806.m45029("ۧۨ") + i10) * 11;
                            i3 = ((iM11306 ^ i9) * 13573) ^ 1525409830;
                            i4 = -486913150;
                            r2 = obj4;
                            break;
                        case 3:
                            iM11306 = C19806.m45029("ۧܰ") ^ i9;
                            i3 = ((iM11306 ^ i10) * (-16787)) ^ (-932150933);
                            i4 = 1051261595;
                            r2 = obj4;
                            break;
                        case 4:
                            iM11306 = ThreadFactoryC3888.m11306("ܰۢ") ^ i9;
                            i3 = ((iM11306 ^ i10) * (-18065)) ^ 1594387336;
                            i4 = 1190206567;
                            r2 = obj4;
                            break;
                        case 5:
                            iM11306 = ThreadFactoryC3888.m11306("ܰ۬") ^ i10;
                            i3 = ((iM11306 ^ i9) * 21405) ^ 68408328;
                            i4 = 39489201;
                            r2 = obj4;
                            break;
                        default:
                            iM11306 = C19806.m45029("ۢۗ") ^ i10;
                            i3 = ((iM11306 ^ i9) * 937) ^ (-338636743);
                            i4 = 1286475869;
                            r2 = obj4;
                            break;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1819068355:
                case -130827712:
                    i = i14;
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩺") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-21963)) ^ (-1565418947);
                        i4 = -788956438;
                        r2 = r3;
                    } else {
                        iM11306 = (i9 - C19806.m45029("֡۬")) * (-107);
                        i3 = ((iM11306 ^ i10) * (-9447)) ^ (-1672407864);
                        i4 = 132804637;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1754955867:
                case 371202282:
                    i = i14;
                    C0216.m1591();
                    if (C10634.f36300 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 12591) ^ (-1086263631);
                        i4 = -1479722572;
                        r2 = r3;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۗۧ")) * 99;
                        i3 = ((iM11306 ^ i9) * (-30219)) ^ (-889919674);
                        i4 = -311139303;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1737222458:
                case 2010428427:
                    i = i14;
                    try {
                        C3286.m9794(autoCloseOutputStream);
                        iM11306 = ThreadFactoryC3888.m11306("ܰᩴ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 4753) ^ 1490562975;
                        i4 = -919365196;
                        r2 = r3;
                        i2 = i;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        r3 = r2;
                        i8 = i2;
                    } catch (Throwable th4) {
                        int iM11307 = (i10 - ThreadFactoryC3888.m11306("ܰۗ")) * 27;
                        i5 = ((iM11307 ^ i9) * (-17043)) ^ (-1669568489);
                        i6 = iM11307 ^ (-830059490);
                        obj2 = th4;
                        i11 = i5;
                        i8 = i;
                        i12 = i6;
                    }
                    break;
                case -1521016210:
                case 1407415669:
                    i = i14;
                    String str = C14396.f47198;
                    if (C0962.f3784) {
                        iM11306 = (i9 - C19806.m45029("֡۬")) * (-107);
                        i3 = ((iM11306 ^ i10) * (-9447)) ^ (-1672407864);
                        i4 = 132804637;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("֡ۘ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-9441)) ^ (-2085793260);
                        i4 = 1767353961;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1485072087:
                case 31361905:
                    i = i14;
                    try {
                        C0629.m2911(th2, obj3);
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 20763) ^ (-1958073917);
                        i4 = -835281184;
                        r2 = r3;
                    } catch (IOException unused) {
                        iM11306 = C19806.m45029("᩸۠") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-20211)) ^ (-130038611);
                        i4 = 249871578;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1455568298:
                case 909937961:
                    i = i14;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۗۧ")) * 99;
                        i3 = ((iM11306 ^ i9) * (-30219)) ^ (-889919674);
                        i4 = -311139303;
                        r2 = r3;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۚ") + i9) * (-15);
                        i3 = ((iM11306 ^ i10) * 15065) ^ (-1981636934);
                        i4 = 1612499269;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1411424295:
                case 422585156:
                    i = i14;
                    if (C0278.f1572 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۚ") + i9) * (-15);
                        i3 = ((iM11306 ^ i10) * 15065) ^ (-1981636934);
                        i4 = 1612499269;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("֫ۜ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-30561)) ^ 1989054524;
                        i4 = 771928122;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1293416063:
                case 1494215103:
                    i = i14;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i9 - C19806.m45029("ᩳ᩶")) * (-97);
                        i3 = ((iM11306 ^ i10) * (-31019)) ^ 521156938;
                        i4 = -1762819928;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("֫ۜ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-30561)) ^ 1989054524;
                        i4 = 771928122;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1264893320:
                case -631459788:
                    i = i14;
                    throw th;
                case -1219165397:
                case 768079734:
                    i = i14;
                    inputStream = (InputStream) obj;
                    autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) r3;
                    if (C1875.f7103 >= 0) {
                        iM11306 = C19806.m45029("᩷ۜ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-13)) ^ (-2027756367);
                        i4 = 132280228;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩷") ^ i10;
                        i3 = ((iM11306 ^ i9) * 17181) ^ (-763085591);
                        i4 = 193376939;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1147998975:
                case -1016965907:
                    r3.mo2618(i7, c21200.f69001);
                    return;
                case -1132915591:
                case 574219780:
                    i = i14;
                    if (C1977.f7413 > 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩸ۨ")) * (-127);
                        i3 = ((iM11306 ^ i9) * 15487) ^ 1176210248;
                        i4 = 957901894;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("᩷ۜ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-13)) ^ (-2027756367);
                        i4 = 132280228;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1057816896:
                case -406385680:
                    i = i14;
                    try {
                        C0278.m1781(inputStream);
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 20763) ^ (-1958073917);
                        i4 = -835281184;
                        r2 = r3;
                        i2 = i;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        r3 = r2;
                        i8 = i2;
                    } catch (Throwable th5) {
                        int iM11308 = (ThreadFactoryC3888.m11306("۫ۡ") + i9) * 41;
                        i5 = ((iM11308 ^ i10) * (-15387)) ^ 374293205;
                        i6 = iM11308 ^ 483748187;
                        obj3 = th5;
                        i11 = i5;
                        i8 = i;
                        i12 = i6;
                    }
                    break;
                case -1013559053:
                case 1144629068:
                    i = i14;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("᩷ۜ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-13)) ^ (-2027756367);
                        i4 = 132280228;
                        r2 = r3;
                    } else {
                        iM11306 = (C19806.m45029("᩸᩵") ^ i10) * 9;
                        i3 = ((iM11306 ^ i9) * (-25887)) ^ (-339233885);
                        i4 = 1544025125;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1012510944:
                case -805493177:
                    i = i14;
                    if (C1025.m3861() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 12591) ^ (-1086263631);
                        i4 = -1479722572;
                        r2 = r3;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩸ۨ")) * (-127);
                        i3 = ((iM11306 ^ i9) * 15487) ^ 1176210248;
                        i4 = 957901894;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -898595902:
                case 1436428561:
                    ((InterfaceC3263) obj).mo3187((C10840) r3);
                    return;
                case -874798548:
                case 780277975:
                    i = i14;
                    try {
                        C22487.m49992(inputStream, autoCloseOutputStream, j, interfaceC8978);
                        C1419.m4975(autoCloseOutputStream);
                        C0216.m1577(inputStream);
                        iM11306 = C19806.m45029("᩸۠") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-20211)) ^ (-130038611);
                        i4 = 249871578;
                        r2 = r3;
                        i2 = i;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        r3 = r2;
                        i8 = i2;
                    } catch (Throwable th6) {
                        int iM450210 = (C19806.m45029("᩷֫") + i10) * 99;
                        i5 = ((iM450210 ^ i9) * (-6567)) ^ (-617059436);
                        i6 = iM450210 ^ 1202913230;
                        th = th6;
                        i11 = i5;
                        i8 = i;
                        i12 = i6;
                    }
                    break;
                case -581326795:
                case 1102842500:
                    i = i14;
                    throw th2;
                case -412753456:
                case 1489634726:
                    ThreadFactoryC3888.m11300();
                    if (RunnableC1606.f6488 < 0) {
                        i = i14;
                        iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 12591) ^ (-1086263631);
                        i4 = -1479722572;
                        r2 = r3;
                    } else {
                        iM11306 = C19806.m45029("ۗᩴ") ^ i10;
                        i = i14;
                        i3 = ((iM11306 ^ i9) * 22843) ^ 1955445859;
                        i4 = 1096151194;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -412737277:
                case 109233311:
                    i = i14;
                    if (inputStream != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i10) * (-31);
                        i3 = ((iM11306 ^ i9) * 16445) ^ 231438885;
                        i4 = -1403059059;
                        r2 = r3;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۤ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 20763) ^ (-1958073917);
                        i4 = -835281184;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -400118347:
                case 1602513218:
                    i = i14;
                    C0962.m3746();
                    if (C1937.f7317 < 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩸ۨ")) * (-127);
                        i3 = ((iM11306 ^ i9) * 15487) ^ 1176210248;
                        i4 = 957901894;
                        r2 = r3;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۙ") + i9) * (-13);
                        i3 = ((iM11306 ^ i10) * 235) ^ 695900729;
                        i4 = 359083947;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 241550244:
                case 849577633:
                    i = i14;
                    int i15 = this.f37215;
                    if (C2124.f7782 <= 0) {
                        i13 = i15;
                        iM11306 = C19806.m45029("ۚۜ") ^ i10;
                        i3 = ((iM11306 ^ i9) * 27579) ^ (-1978252424);
                        i4 = -245879625;
                        r2 = r3;
                        i2 = i;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        r3 = r2;
                    } else {
                        int iM450211 = (i10 - C19806.m45029("ۤ۫")) * 25;
                        i13 = i15;
                        i11 = ((iM450211 ^ i9) * 32481) ^ 2063418885;
                        i2 = i;
                        i12 = iM450211 ^ 1509868028;
                        r3 = r3;
                    }
                    i8 = i2;
                    break;
                case 348910027:
                case 1465230544:
                    ((C0206) obj).m1534((String) r3);
                    return;
                case 405466601:
                case 1514100398:
                    C8847.m22974((C8847) obj, (String[]) r3);
                    return;
                case 465348023:
                case 2047906569:
                    C21444.m48040((Activity) obj, (C16857) r3);
                    return;
                case 511214837:
                case 1017899188:
                    i = i14;
                    C2704.m8255();
                    RunnableC0195.m1431();
                    iM11306 = ThreadFactoryC3888.m11306("ۖۛ") ^ i9;
                    i3 = ((iM11306 ^ i10) * 12591) ^ (-1086263631);
                    i4 = -1479722572;
                    r2 = r3;
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 781805614:
                case 2111293696:
                    i = i14;
                    c21200 = (C21200) obj;
                    i7 = c21200.f69000;
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ۚۜ") ^ i10;
                        i3 = ((iM11306 ^ i9) * 27579) ^ (-1978252424);
                        i4 = -245879625;
                        r2 = r3;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ܳ֨")) * 67;
                        i3 = ((iM11306 ^ i9) * (-28873)) ^ (-1023074546);
                        i4 = -1714302741;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 917418649:
                case 1467892778:
                    C21780.m48543((Context) obj, (C22176) r3);
                    return;
                case 1161286274:
                case 1201535595:
                    i = i14;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۙ") + i9) * (-13);
                        i3 = ((iM11306 ^ i10) * 235) ^ 695900729;
                        i4 = 359083947;
                        r2 = r3;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-3271)) ^ (-987585039);
                        i4 = -1584960155;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 1451407889:
                case 1758217087:
                    return;
                case 1466755522:
                case 1520389348:
                    i = i14;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i9 - C19806.m45029("֡۬")) * (-107);
                        i3 = ((iM11306 ^ i10) * (-9447)) ^ (-1672407864);
                        i4 = 132804637;
                        r2 = r3;
                    } else {
                        iM11306 = (i10 - C19806.m45029("ܽܿ")) * 115;
                        i3 = ((iM11306 ^ i9) * 17357) ^ (-420373395);
                        i4 = -129416624;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 1846813758:
                case 2050542586:
                    i = i14;
                    j = -1;
                    interfaceC8978 = null;
                    iM11306 = C19806.m45029("ܳ᩹") ^ i9;
                    i3 = ((iM11306 ^ i10) * (-32269)) ^ (-551792952);
                    i4 = 1038954933;
                    r2 = r3;
                    i2 = i;
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                default:
                    C1189.m4368();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return;
            }
        }
    }
}
