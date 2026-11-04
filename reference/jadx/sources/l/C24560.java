package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YT */
/* JADX INFO: loaded from: classes.dex */
public class C24560 extends AbstractC13213 implements InterfaceC12314 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f79603;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f79604;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f79605;

    /* JADX INFO: renamed from: ۨۤᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f79606 = {3346, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29080, -29057, -29065, -29067, -29074, -29057, -29132, -29112, -29057, -29065, -29067, -29074, -29057, -29111, -29057, -29080, -29076, -29057, -29080, -29111, -29057, -29080, -29076, -29069, -29063, -29057, -29132, -29093, -29095, -29106, -29101, -29099, -29100, -29115, -29111, -29106, -29093, -29112, -29106, -29089, -29090, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29078, -29066, -29073, -29079, -29132, -29092, -29106, -29110, -29115, -29111, -29089, -29112, -29108, -29089, -29112, -29115, -29111, -29106, -29093, -29112, -29106, -29089, -29090, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29065, -29063, -29078, -29132, -29093, -29095, -29106, -29101, -29099, -29100, -29115, -29111, -29106, -29093, -29112, -29106, -29089, -29090, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29080, -29057, -29065, -29067, -29074, -29057, -29132, -29112, -29057, -29065, -29067, -29074, -29057, -29111, -29057, -29080, -29076, -29057, -29080, -29111, -29057, -29080, -29076, -29069, -29063, -29057, -29132, -29093, -29095, -29106, -29101, -29099, -29100, -29115, -29092, -29093, -29101, -29098, -29089, -29090, -29115, -29106, -29099, -29115, -29111, -29106, -29093, -29112, -29106, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29078, -29066, -29073, -29079, -29132, -29092, -29106, -29110, -29115, -29111, -29089, -29112, -29108, -29089, -29112, -29115, -29092, -29093, -29101, -29098, -29089, -29090, -29115, -29106, -29099, -29115, -29111, -29106, -29093, -29112, -29106, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29065, -29063, -29078, -29132, -29093, -29095, -29106, -29101, -29099, -29100, -29115, -29092, -29093, -29101, -29098, -29089, -29090, -29115, -29106, -29099, -29115, -29111, -29106, -29093, -29112, -29106, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29080, -29057, -29065, -29067, -29074, -29057, -29132, -29112, -29057, -29065, -29067, -29074, -29057, -29111, -29057, -29080, -29076, -29057, -29080, -29111, -29057, -29080, -29076, -29069, -29063, -29057, -29132, -29093, -29095, -29106, -29101, -29099, -29100, -29115, -29111, -29106, -29099, -29110, -29110, -29089, -29090, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29078, -29066, -29073, -29079, -29132, -29092, -29106, -29110, -29115, -29111, -29089, -29112, -29108, -29089, -29112, -29115, -29111, -29106, -29099, -29110, -29110, -29089, -29090, -29064, -29069, -29068, -29132, -29065, -29074, -29132, -29065, -29063, -29078, -29132, -29093, -29095, -29106, -29101, -29099, -29100, -29115, -29111, -29106, -29099, -29110, -29110, -29089, -29090, 728, 18218, 18224, 4252, 10041, -11332, -6575, 2560, -13773, -15483, -13188, 7035, -15797, -8711, 6061, 7633, 14998, 2216, 17551, 11209, 9203, -12391, 374, -3377, -3340, -3343, -3340, -3339, -3347, -3340, -3398, -3351, -3346, -3333, -3352, -3346, -3345, -3350, -3398, -3351, -3329, -3352, -3348, -3341, -3335, -3329, -3424, -3398};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Handler f79607;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Runnable[] f79608;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f79609;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f79610;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f79611;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f79612;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f79613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f79614;

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo29776(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo29778(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ void mo29779(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo29781(InterfaceC11217 interfaceC11217) {
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01e8 A[PHI: r3 r4 r6 r17
      0x01e8: PHI (r3v4 short) = (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:54:0x01e6, B:46:0x018f, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r4v4 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:54:0x01e6, B:46:0x018f, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:54:0x01e6, B:46:0x018f, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r17v19 int) = (r17v5 int), (r17v7 int), (r17v20 int) binds: [B:54:0x01e6, B:46:0x018f, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0240 A[PHI: r1 r2 r9 r10 r11 r16 r17
      0x0240: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r2v3 char) = (r2v1 char), (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r16v3 int) = (r16v1 int), (r16v1 int), (r16v1 int), (r16v1 int), (r16v4 int) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r17v15 int) = (r17v3 int), (r17v4 int), (r17v11 int), (r17v12 int), (r17v16 int) binds: [B:62:0x023e, B:58:0x021a, B:31:0x00ec, B:27:0x00c6, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0275 A[PHI: r7 r17
      0x0275: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:66:0x0273, B:42:0x016e, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r17v14 int) = (r17v2 int), (r17v8 int), (r17v17 int) binds: [B:66:0x0273, B:42:0x016e, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (l.RunnableC0334.f1808 <= 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m54843(l.C24560 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24560.m54843(l.᩺᩷ۧ, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[PHI: r2
      0x00d7: PHI (r2v3 java.lang.Runnable[]) = (r2v2 java.lang.Runnable[]), (r2v5 java.lang.Runnable[]) binds: [B:34:0x00d5, B:30:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    public C24560() {
        int iM3169;
        int i;
        ArrayList arrayList = null;
        Runnable[] runnableArr = null;
        int i2 = 1048016871;
        int i3 = C2288.f7433;
        int i4 = C0773.f2792;
        int iM2761 = C0619.m2761("ۜ᩸") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-3369)) ^ 1760881491;
        int i6 = 1469653745;
        while (true) {
            int i7 = iM2761 ^ i6;
            Handler handler = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-18513)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2101820858:
                    case 707470261:
                        this.f79607 = handler;
                        if (C2288.f7433 > 0) {
                            iM3169 = C0619.m2761("᩺ۗ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 8441) ^ 207541802;
                            i = -378494608;
                            i7 = iM3169 ^ i;
                        } else {
                            iM2761 = C0619.m2761("۟᩺") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-31651)) ^ (-615408166);
                            i6 = 426775433;
                        }
                        break;
                    case -1723742964:
                    case -37627403:
                        C0269.m1775();
                        C1519.m5403();
                        throw new RuntimeException();
                    case -1434277743:
                    case -971558858:
                        this.f79612 = arrayList;
                        if (C2702.f8586 <= 0) {
                            iM3169 = (C0773.m3169("۫ۨ") ^ i4) * (-11);
                            i5 = ((iM3169 ^ i3) * 233) ^ 527876770;
                            i = -63772862;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩹ۨ")) * (-123);
                            i5 = ((iM3169 ^ i3) * 4595) ^ 1942749201;
                            i = 672108610;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1225014225:
                    case -285454724:
                        C2310.m7813();
                        iM3169 = (i3 - C0773.m3169("ܶ᩸")) * (-83);
                        i5 = ((iM3169 ^ i4) * 14291) ^ 1029549979;
                        i = -496004470;
                        i7 = iM3169 ^ i;
                        break;
                    case -1224416453:
                    case 902556336:
                        Looper looperM6230 = C1783.m6230();
                        if (C3448.f11240 < 0) {
                            if (C2834.f9334 > 0) {
                                if (!C2878.f9462 && C17202.f56030) {
                                    handler = new Handler(looperM6230);
                                    if (C2375.f7641 > 0) {
                                        iM3169 = (C0773.m3169("ܳ᩻") ^ i4) * (-115);
                                        i5 = ((iM3169 ^ i3) * 5673) ^ 965412259;
                                        i = 7655115;
                                        i7 = iM3169 ^ i;
                                        break;
                                    }
                                }
                            }
                            iM2761 = C0619.m2761("ۛ᩸") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-12955)) ^ (-1217886220);
                            i6 = -864765006;
                            break;
                        }
                        iM2761 = C0619.m2761("۟᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-31651)) ^ (-615408166);
                        i6 = 426775433;
                        break;
                    case -1222481798:
                    case 1437760855:
                        this.f79608 = runnableArr;
                        if (C0773.m3161() == 0) {
                            iM3169 = C0619.m2761("ۡ᩻") ^ i3;
                            i5 = ((iM3169 ^ i4) * 9259) ^ (-347090083);
                            i = 82853710;
                            i7 = iM3169 ^ i;
                        } else {
                            iM2761 = C0619.m2761("۟᩺") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-31651)) ^ (-615408166);
                            i6 = 426775433;
                        }
                        break;
                    case -1214918788:
                    case -949603136:
                        runnableArr = new Runnable[3];
                        if (C2702.f8586 <= 0) {
                            iM3169 = (C0773.m3169("۫ۨ") ^ i4) * (-11);
                            i5 = ((iM3169 ^ i3) * 233) ^ 527876770;
                            i = -63772862;
                        } else {
                            iM3169 = (C0619.m2761("ۤۡ") + i4) * (-41);
                            i5 = ((iM3169 ^ i3) * (-11189)) ^ 242474928;
                            i = -238476867;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1160405531:
                    case -283362874:
                        C1146.m4231();
                        if (!C1519.m5403()) {
                            iM2761 = C0619.m2761("ۛ᩸") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-12955)) ^ (-1217886220);
                            i6 = -864765006;
                        } else {
                            iM2761 = C0619.m2761("۟᩺") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-31651)) ^ (-615408166);
                            i6 = 426775433;
                        }
                        break;
                    case -1091949082:
                    case -788551777:
                        RunnableC1848.m6360();
                        if (C2354.f7599 < 0) {
                            iM3169 = (i3 - C0773.m3169("ܶ᩸")) * (-83);
                            i5 = ((iM3169 ^ i4) * 14291) ^ 1029549979;
                            i = -496004470;
                        } else {
                            iM3169 = (C0773.m3169("ܶ᩶") + i4) * 91;
                            i5 = ((iM3169 ^ i3) * 15171) ^ (-1999210695);
                            i = 1347521647;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 381792750:
                    case 1721956265:
                        this.f79613 = new C6660(this);
                        return;
                    case 1420138886:
                    case 2065882031:
                        C0487.m2356();
                        if (C2702.f8586 > 0) {
                            iM2761 = C0619.m2761("ۛ᩸") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-12955)) ^ (-1217886220);
                            i6 = -864765006;
                        }
                        iM3169 = (i3 - C0773.m3169("ܶ᩸")) * (-83);
                        i5 = ((iM3169 ^ i4) * 14291) ^ 1029549979;
                        i = -496004470;
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        arrayList = new ArrayList();
                        if (C1519.f5300 < 0) {
                            iM3169 = (C0619.m2761("᩻ۘ") ^ i3) * (-45);
                            i5 = ((iM3169 ^ i4) * (-31429)) ^ 998724532;
                            i = 490685489;
                            i7 = iM3169 ^ i;
                        } else {
                            iM2761 = C0619.m2761("۟᩺") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-31651)) ^ (-615408166);
                            i6 = 426775433;
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:
    
        if (l.C2375.f7641 <= 0) goto L23;
     */
    static {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24560.<clinit>():void");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0137 A[PHI: r1
      0x0137: PHI (r1v4 android.os.Handler) = (r1v2 android.os.Handler), (r1v3 android.os.Handler), (r1v2 android.os.Handler) binds: [B:49:0x0135, B:25:0x0073, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0194 A[PHI: r7
      0x0194: PHI (r7v8 l.ۨ᩷ۧ) = (r7v4 l.ۨ᩷ۧ), (r7v5 l.ۨ᩷ۧ), (r7v4 l.ۨ᩷ۧ) binds: [B:57:0x0192, B:36:0x00be, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54841(int i) {
        int iM2761;
        int i2;
        Handler handler = null;
        int i3 = -1550732283;
        int i4 = C1519.f5300;
        int i5 = C1080.f3865;
        int iM2762 = C0619.m2761("᩶᩻") ^ i4;
        int i6 = ((iM2762 ^ i5) * 9617) ^ 1213806946;
        int i7 = -1148512538;
        while (true) {
            int i8 = iM2762 ^ i7;
            RunnableC12625 runnableC12625 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-3091)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2139582175:
                    case -883943615:
                        if (C1343.f4799 == 0) {
                            iM2761 = (C0619.m2761("֨۠") ^ i5) * 65;
                            i6 = ((iM2761 ^ i4) * (-24315)) ^ (-705562080);
                            i2 = -181652579;
                        } else {
                            iM2761 = (C0619.m2761("ᩴۧ") + i4) * (-21);
                            i6 = ((iM2761 ^ i5) * 32523) ^ 1861043007;
                            i2 = -995231801;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1914356591:
                    case -1304452181:
                        if (C2485.f7950 != 0) {
                            iM2761 = C0773.m3169("ᩳۙ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 15119) ^ (-74241633);
                            i2 = 1528691983;
                        } else {
                            iM2761 = C0773.m3169("ܿ۟") ^ i4;
                            i6 = ((iM2761 ^ i5) * 14387) ^ 1790418352;
                            i2 = -1446061056;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1719545113:
                    case 634094272:
                        handler.postDelayed(runnableC12625, 30000L);
                        break;
                    case -1568413564:
                    case 1861722913:
                        C3077.m10041();
                        if (C23916.m53419() != 0) {
                        }
                        iM2761 = (C0619.m2761("֨۠") ^ i5) * 65;
                        i6 = ((iM2761 ^ i4) * (-24315)) ^ (-705562080);
                        i2 = -181652579;
                        i8 = iM2761 ^ i2;
                        break;
                    case -1456051409:
                    case 1442673808:
                        handler = this.f79607;
                        if (RunnableC3646.m11813() != 0) {
                            iM2761 = (C0619.m2761("ᩴۧ") + i4) * (-21);
                            i6 = ((iM2761 ^ i5) * 32523) ^ 1861043007;
                            i2 = -995231801;
                        } else {
                            iM2761 = (C0773.m3169("۠ۤ") ^ i4) * (-19);
                            i6 = ((iM2761 ^ i5) * (-24261)) ^ 90013002;
                            i2 = 1282135391;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1248517204:
                    case 322478361:
                        C2702.m8876();
                        if (C1321.f4751 < 0) {
                        }
                        iM2761 = C0773.m3169("ᩳۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15119) ^ (-74241633);
                        i2 = 1528691983;
                        i8 = iM2761 ^ i2;
                        break;
                    case -1175453369:
                    case 1812955884:
                        if (AbstractC3624.f12429 > 0) {
                            runnableC12625 = new RunnableC12625(i, 0, this);
                            if (RunnableC3646.f12471) {
                                iM2761 = (i4 - C0619.m2761("ܿۜ")) * 41;
                                i6 = ((iM2761 ^ i5) * 7919) ^ (-907258157);
                                i2 = -669473269;
                            } else {
                                iM2761 = C0773.m3169("ۨ۬") ^ i5;
                                i6 = ((iM2761 ^ i4) * 11593) ^ 1899414441;
                                i2 = -754864448;
                            }
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case -754926015:
                    case -424460615:
                        if (C1542.m5459() < 0) {
                            iM2761 = (C0619.m2761("ۚ۠") ^ i5) * 73;
                            i6 = ((iM2761 ^ i4) * (-10053)) ^ (-837205020);
                            i2 = -1117818090;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case 69114458:
                    case 1991289791:
                        if (C23916.f77426 > 0) {
                            iM2761 = (i5 - C0773.m3169("۠᩵")) * (-19);
                            i6 = ((iM2761 ^ i4) * 15087) ^ 874702643;
                            i2 = 243881360;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case 140977452:
                    case 513138862:
                        this.f79608[i] = runnableC12625;
                        if (!RunnableC1848.m6360()) {
                            iM2761 = (i4 - C0619.m2761("᩻ܳ")) * (-103);
                            i6 = ((iM2761 ^ i5) * (-20333)) ^ 112835162;
                            i2 = -1135128736;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case 761337224:
                    case 1586670071:
                        if (AbstractC0641.f2496 >= 0) {
                            iM2761 = (C0619.m2761("ᩴۧ") + i4) * (-21);
                            i6 = ((iM2761 ^ i5) * 32523) ^ 1861043007;
                            i2 = -995231801;
                        } else {
                            iM2761 = (C0773.m3169("֫ۛ") ^ i5) * (-39);
                            i6 = ((iM2761 ^ i4) * (-21099)) ^ (-48429792);
                            i2 = -1312297933;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 1077094221:
                    case 1984969414:
                        C1080.m4050();
                        C1519.m5403();
                        break;
                    case 1659723084:
                    case 1693894684:
                        if (C2288.f7433 <= 0) {
                            iM2761 = (i4 - C0619.m2761("ܿۜ")) * 41;
                            i6 = ((iM2761 ^ i5) * 7919) ^ (-907258157);
                            i2 = -669473269;
                        } else {
                            iM2761 = (C0619.m2761("ۜۘ") + i4) * 57;
                            i6 = ((iM2761 ^ i5) * 30733) ^ (-16757449);
                            i2 = 274612962;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 2098086070:
                    case 2138043302:
                        C0862.m3503();
                        iM2761 = (C0619.m2761("֨۠") ^ i5) * 65;
                        i6 = ((iM2761 ^ i4) * (-24315)) ^ (-705562080);
                        i2 = -181652579;
                        i8 = iM2761 ^ i2;
                        break;
                    default:
                        if (C1321.m4852()) {
                            iM2761 = C0773.m3169("ܰۛ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-13701)) ^ (-540640338);
                            i2 = 1385908485;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ܿۜ")) * 41;
                            i6 = ((iM2761 ^ i5) * 7919) ^ (-907258157);
                            i2 = -669473269;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                }
                return;
            }
            iM2762 = C0619.m2761("᩶ܿ") ^ i5;
            i6 = ((iM2762 ^ i4) * (-623)) ^ (-41690322);
            i7 = -1502925353;
        }
    }

    @Override // l.AbstractC13213
    /* JADX INFO: renamed from: ۤ */
    public final void mo6417() {
        boolean z = false;
        Runnable[] runnableArr = null;
        int i = 0;
        Runnable runnable = null;
        int i2 = 1985305124;
        int i3 = C4282.f15546;
        int i4 = C23916.f77426;
        int iM2761 = (C0619.m2761("ۘۢ") + i4) * 63;
        int i5 = ((iM2761 ^ i3) * (-15931)) ^ (-911236407);
        int i6 = -223450169;
        while (true) {
            i2 = ((((i2 ^ i3) * (-4283)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2035955977:
                case 2043546836:
                    runnable = runnableArr[i];
                    if (runnable != null) {
                        iM2761 = C0619.m2761("ܳۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-17667)) ^ (-2048255081);
                        i6 = 913782168;
                    } else {
                        iM2761 = C0773.m3169("ۛۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14901) ^ (-236013589);
                        i6 = -1061739579;
                    }
                    break;
                case -1939179179:
                case -602610368:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۜ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * 12503) ^ 1242027094;
                        i6 = -1517367518;
                    } else {
                        iM2761 = (C0619.m2761("ܿ֨") ^ i4) * 5;
                        i5 = ((iM2761 ^ i3) * (-2951)) ^ 1908348527;
                        i6 = 676721109;
                    }
                    break;
                case -1937173849:
                case -1099735705:
                    z = false;
                    z = false;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11389)) ^ (-1997908357);
                        i6 = 1729779696;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-30985)) ^ 593716690;
                        i6 = -823225841;
                    }
                    break;
                case -1911017891:
                case 1979432522:
                    if (this.f79611) {
                        iM2761 = C0773.m3169("۬᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17079) ^ 218483624;
                        i6 = 1686865391;
                    } else {
                        iM2761 = C0773.m3169("ۤۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 31811) ^ 1306223260;
                        i6 = -2039797788;
                    }
                    break;
                case -1871094654:
                case 2054206375:
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0773.m3169("֨ܽ") + i4) * (-63);
                        i5 = ((iM2761 ^ i3) * (-15383)) ^ (-569519086);
                        i6 = 663718474;
                    } else {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11389)) ^ (-1997908357);
                        i6 = 1729779696;
                    }
                    break;
                case -1649703102:
                case 341176579:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0773.m3169("ۜ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * 12503) ^ 1242027094;
                        i6 = -1517367518;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩻ۨ")) * (-31);
                        i5 = ((iM2761 ^ i4) * (-25513)) ^ (-203377060);
                        i6 = -764039562;
                    }
                    break;
                case -1620216915:
                case -1123728979:
                    C2354.m7983();
                    break;
                case -1563933582:
                case -316688658:
                    this.f79609 = z ? 1 : 0;
                    C2834.m9332(this.f79612);
                    break;
                case -1502677727:
                case -109048419:
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11389)) ^ (-1997908357);
                        i6 = 1729779696;
                    } else {
                        iM2761 = C0773.m3169("ۜ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * 12503) ^ 1242027094;
                        i6 = -1517367518;
                    }
                    break;
                case -1316227246:
                case 823998521:
                    runnableArr = this.f79608;
                    if (i < runnableArr.length) {
                        iM2761 = (C0773.m3169("᩷۠") ^ i4) * 77;
                        i5 = ((iM2761 ^ i3) * (-25363)) ^ (-69067859);
                        i6 = 869944804;
                    } else {
                        iM2761 = C0773.m3169("᩺᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-32451)) ^ 1543755872;
                        i6 = 1364938271;
                    }
                    break;
                case -932819000:
                case 1408114918:
                    C1564.m5509();
                    if (C2287.f7432 < 0) {
                        iM2761 = C0619.m2761("ᩳۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-31709)) ^ (-1384932549);
                        i6 = -1260791458;
                    } else {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11389)) ^ (-1997908357);
                        i6 = 1729779696;
                    }
                    break;
                case -898014605:
                case 1580225598:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("֨ܽ") + i4) * (-63);
                        i5 = ((iM2761 ^ i3) * (-15383)) ^ (-569519086);
                        i6 = 663718474;
                    } else {
                        iM2761 = C0619.m2761("ۨۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17037)) ^ 155764547;
                        i6 = 292895360;
                    }
                    break;
                case -386507420:
                case 731297252:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ᩳۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-31709)) ^ (-1384932549);
                        i6 = -1260791458;
                    } else {
                        iM2761 = (C0773.m3169("᩷ᩴ") ^ i3) * 25;
                        i5 = ((iM2761 ^ i4) * 13555) ^ (-660304134);
                        i6 = -1545683437;
                    }
                    break;
                case -364002642:
                case 1729381229:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ᩳۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-31709)) ^ (-1384932549);
                        i6 = -1260791458;
                    } else {
                        iM2761 = C0773.m3169("ܶ֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22183)) ^ 1225322503;
                        i6 = -1488440863;
                    }
                    break;
                case -178562507:
                case 315911321:
                    this.f79607.removeCallbacks(runnable);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("۟ۙ") + i4) * 3;
                        i5 = ((iM2761 ^ i3) * (-11775)) ^ 1119659115;
                        i6 = 2026553752;
                    } else {
                        iM2761 = (C0773.m3169("ۗܺ") ^ i3) * (-27);
                        i5 = ((iM2761 ^ i4) * 9151) ^ 699531604;
                        i6 = 47861039;
                    }
                    break;
                case -115510209:
                case 237468814:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("۟ۙ") + i4) * 3;
                        i5 = ((iM2761 ^ i3) * (-11775)) ^ 1119659115;
                        i6 = 2026553752;
                    } else {
                        iM2761 = C0619.m2761("֡ۗ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-15933)) ^ 1799598890;
                        i6 = 1349870540;
                    }
                    break;
                case 492772635:
                case 812196507:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("ۜ᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * 12503) ^ 1242027094;
                        i6 = -1517367518;
                    } else {
                        iM2761 = C0619.m2761("ۛ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8917)) ^ 492458712;
                        i6 = -1463214812;
                    }
                    break;
                case 538847169:
                case 1806921245:
                    runnableArr[i] = null;
                    iM2761 = C0773.m3169("ۛۙ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 14901) ^ (-236013589);
                    i6 = -1061739579;
                    break;
                case 729602202:
                case 1960208783:
                    i = 0;
                    iM2761 = (C0773.m3169("֫᩶") + i4) * 31;
                    i5 = ((iM2761 ^ i3) * (-25033)) ^ (-1724685939);
                    i6 = 276996710;
                    break;
                case 1122350142:
                case 1431724048:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩶֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11389)) ^ (-1997908357);
                        i6 = 1729779696;
                    } else {
                        iM2761 = C0773.m3169("᩺ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 30275) ^ (-1181458081);
                        i6 = -258404896;
                    }
                    break;
                case 1136316686:
                case 1533176653:
                    C2354.m7983();
                    C3492.m11488();
                    iM2761 = C0773.m3169("ۜ᩵") ^ i4;
                    i5 = ((iM2761 ^ i3) * 12503) ^ 1242027094;
                    i6 = -1517367518;
                    break;
                case 1583884149:
                case 1948128228:
                    C21576.m49063(this.f79613);
                    this.f79611 = z;
                    iM2761 = C0773.m3169("ۤۧ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 31811) ^ 1306223260;
                    i6 = -2039797788;
                    break;
                default:
                    i++;
                    iM2761 = (C0773.m3169("֫᩶") + i4) * 31;
                    i5 = ((iM2761 ^ i3) * (-25033)) ^ (-1724685939);
                    i6 = 276996710;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0255 A[PHI: r18 r20
      0x0255: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:60:0x0253, B:12:0x007d, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:60:0x0253, B:12:0x007d, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0287 A[PHI: r7 r8 r16 r17
      0x0287: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:64:0x0285, B:12:0x007d, B:81:0x0287] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:64:0x0285, B:12:0x007d, B:81:0x0287] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0285, B:12:0x007d, B:81:0x0287] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0285, B:12:0x007d, B:81:0x0287] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m54845(Context context) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        Context context2 = context;
        int i4 = C3033.f9831;
        int i5 = C1542.f5343;
        int iM31611 = C0773.m3169("ۚ۟") ^ i5;
        int i6 = ((iM31611 ^ i4) * (-1373)) ^ (-936278408);
        String strM11486 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM31611 ^ 1530473425;
        int iM2761 = 0;
        int iM31612 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = -690278380;
        String strM6246 = null;
        String strM12271 = null;
        int iM2762 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i4) * (-22689)) >> 31));
            switch (i16) {
                case -1635734424:
                case 2140421226:
                    C3448.m11248();
                    if (C0487.f2131 <= 0) {
                        iM31610 = C0619.m2761("ۙۗ") ^ i5;
                        i6 = ((iM31610 ^ i4) * (-9827)) ^ 1952654827;
                        i3 = 835910293;
                    } else {
                        iM31610 = (i4 - C0619.m2761("ۖۗ")) * 47;
                        i6 = ((iM31610 ^ i5) * 22371) ^ 1594211127;
                        i3 = 1267757740;
                    }
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case -839078853:
                case 895679714:
                    if (i15 - (s * s2) < 0) {
                        iM31610 = C0619.m2761("ᩳ᩺") ^ i4;
                        i6 = ((iM31610 ^ i5) * 8737) ^ 837896245;
                        i3 = -27442352;
                    } else {
                        iM31610 = C0773.m3169("᩻ۜ") ^ i5;
                        i6 = ((iM31610 ^ i4) * 28721) ^ (-672260209);
                        i3 = -1816051364;
                    }
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case -626804047:
                case 1684787369:
                    i13 = 18908;
                    iM31610 = (C0773.m3169("ۢۡ") + i5) * 57;
                    i6 = ((iM31610 ^ i4) * (-25617)) ^ 1533219693;
                    i3 = -1585698110;
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case -541842269:
                case -146680086:
                    strM6246 = C1783.m6246(context2, 2119551568 ^ iM2761);
                    sArr3 = f79606;
                    if (C2834.f9334 > 0) {
                        iM3169 = (i4 - C0619.m2761("ᩳܰ")) * (-83);
                        i = ((iM3169 ^ i5) * (-20419)) ^ (-1274253532);
                        i2 = 64513332;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    } else {
                        iM31610 = (C0619.m2761("᩷ۜ") ^ i4) * 119;
                        i6 = ((iM31610 ^ i5) * 14253) ^ (-604192301);
                        i3 = 506739569;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    }
                    break;
                case -533940072:
                case 2094573872:
                    if (C2375.f7641 > 0) {
                        iM31610 = (C0619.m2761("᩷ۜ") ^ i4) * 119;
                        i6 = ((iM31610 ^ i5) * 14253) ^ (-604192301);
                        i3 = 506739569;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۡ۟")) * (-63);
                        i = ((iM3169 ^ i4) * (-17649)) ^ 704425663;
                        i2 = 213738544;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case -505178845:
                case 1060684139:
                    i15 = i14 + 9284209;
                    s2 = 6094;
                    if (C4238.m13540() <= 0) {
                        iM31610 = (C0619.m2761("᩷ۜ") ^ i4) * 119;
                        i6 = ((iM31610 ^ i5) * 14253) ^ (-604192301);
                        i3 = 506739569;
                    } else {
                        iM31610 = C0619.m2761("ܶۙ") ^ i4;
                        i6 = ((iM31610 ^ i5) * (-4051)) ^ (-2042238568);
                        i3 = 572549618;
                    }
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case -237032791:
                case 293744285:
                    i13 = 41787;
                    iM31610 = (C0773.m3169("ۢۡ") + i5) * 57;
                    i6 = ((iM31610 ^ i4) * (-25617)) ^ 1533219693;
                    i3 = -1585698110;
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case -142018287:
                case 447949195:
                    strM11486 = C3492.m11486(f79606, 342, 3, i13);
                    if (C2023.f6737) {
                        iM31610 = C0619.m2761("ۙܳ") ^ i5;
                        i6 = ((iM31610 ^ i4) * 26727) ^ 1773952204;
                        i3 = -1454529586;
                    } else {
                        iM31610 = C0619.m2761("᩶۟") ^ i4;
                        i6 = ((iM31610 ^ i5) * (-23389)) ^ (-855316677);
                        i3 = -1309903258;
                    }
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case -135104835:
                case 1121063019:
                    if (!C0862.m3503()) {
                        iM31610 = C0619.m2761("ۙۗ") ^ i5;
                        i6 = ((iM31610 ^ i4) * (-9827)) ^ 1952654827;
                        i3 = 835910293;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۡ۟")) * (-63);
                        i = ((iM3169 ^ i4) * (-17649)) ^ 704425663;
                        i2 = 213738544;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case -116681038:
                case 170987173:
                    return new String[]{strM12271, strM6246, C1783.m6246(context2, iM31612 ^ i8)};
                case -40205122:
                case 557945117:
                    C2375.m8065();
                    C1826.m6301();
                    return null;
                case 110271155:
                case 1580429029:
                    iM2762 = 2098368342 ^ C0619.m2761(strM11486);
                    if (!C3779.m12264()) {
                        iM31610 = C0619.m2761("ۙܳ") ^ i5;
                        i6 = ((iM31610 ^ i4) * 26727) ^ 1773952204;
                        i3 = -1454529586;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    } else {
                        iM3169 = C0619.m2761("۫ۤ") ^ i5;
                        i = ((iM3169 ^ i4) * 9109) ^ (-957150399);
                        i2 = 274606354;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case 307769528:
                case 1632576745:
                    sArr = f79606;
                    c = 341;
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = (i4 - C0619.m2761("ۖۗ")) * 47;
                        i6 = ((iM31610 ^ i5) * 22371) ^ 1594211127;
                        i3 = 1267757740;
                    } else {
                        iM31610 = C0773.m3169("۠᩶") ^ i5;
                        i6 = ((iM31610 ^ i4) * (-16199)) ^ 1783204411;
                        i3 = 1013769216;
                    }
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case 618526225:
                case 1963838394:
                    s = sArr[c];
                    i14 = s * s;
                    if (C2966.f9654 >= 0) {
                        iM31610 = C0619.m2761("ۙۗ") ^ i5;
                        i6 = ((iM31610 ^ i4) * (-9827)) ^ 1952654827;
                        i3 = 835910293;
                    } else {
                        iM31610 = (C0773.m3169("ۖܽ") + i4) * (-19);
                        i6 = ((iM31610 ^ i5) * (-3413)) ^ (-307892653);
                        i3 = -746945698;
                    }
                    i7 = iM31610 ^ i3;
                    context2 = context;
                    break;
                case 741226551:
                case 1438173717:
                    iM31612 = C0773.m3169(C17202.m40377(sArr3, i10, i12, i13));
                    i8 = 2122264318;
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ۘۜ") ^ i4;
                        i = ((iM3169 ^ i5) * (-2625)) ^ (-1232794903);
                        i2 = -437389813;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    } else {
                        iM31610 = (i4 - C0619.m2761("ۖۗ")) * 47;
                        i6 = ((iM31610 ^ i5) * 22371) ^ 1594211127;
                        i3 = 1267757740;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    }
                    break;
                case 1064632189:
                case 1859545672:
                    i10 = 348;
                    i12 = 3;
                    if (C3998.f13671 == 0) {
                        iM3169 = C0619.m2761("ܽۢ") ^ i5;
                        i = ((iM3169 ^ i4) * 29663) ^ 1583107327;
                        i2 = 484044156;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    } else {
                        iM31610 = (C0619.m2761("᩷ۜ") ^ i4) * 119;
                        i6 = ((iM31610 ^ i5) * 14253) ^ (-604192301);
                        i3 = 506739569;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    }
                    break;
                case 1497314407:
                case 1953639405:
                    strM12271 = C3779.m12271(context2, iM2762);
                    sArr2 = f79606;
                    i9 = 345;
                    i11 = 3;
                    if (C3033.m9845() <= 0) {
                        iM3169 = (i5 - C0619.m2761("ۡ۟")) * (-63);
                        i = ((iM3169 ^ i4) * (-17649)) ^ 704425663;
                        i2 = 213738544;
                    } else {
                        iM3169 = C0773.m3169("ۚۗ") ^ i5;
                        i = ((iM3169 ^ i4) * 19875) ^ 273553853;
                        i2 = -201780229;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 1656506740:
                case 2025054631:
                    C2023.m6964();
                    C4282.m13644();
                    iM3169 = (i5 - C0619.m2761("ۡ۟")) * (-63);
                    i = ((iM3169 ^ i4) * (-17649)) ^ 704425663;
                    i2 = 213738544;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                default:
                    iM2761 = C0619.m2761(AbstractC3624.m11769(sArr2, i9, i11, i13));
                    if (C3690.f12684 > 0) {
                        iM3169 = (C0619.m2761("֨ܳ") + i4) * (-29);
                        i = ((iM3169 ^ i5) * (-28549)) ^ (-2077818840);
                        i2 = 616206613;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    } else {
                        iM31610 = C0619.m2761("ۙܳ") ^ i5;
                        i6 = ((iM31610 ^ i4) * 26727) ^ 1773952204;
                        i3 = -1454529586;
                        i7 = iM31610 ^ i3;
                        context2 = context;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۤ */
    public final void mo29777(InterfaceC11217 interfaceC11217) {
        this.f79610 = false;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x04c7 A[PHI: r4 r24 r28
      0x04c7: PHI (r4v124 android.content.IntentFilter) = (r4v114 android.content.IntentFilter), (r4v115 android.content.IntentFilter), (r4v125 android.content.IntentFilter) binds: [B:132:0x04c5, B:128:0x049c, B:13:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r24v5 java.lang.String[]) = (r24v2 java.lang.String[]), (r24v3 java.lang.String[]), (r24v2 java.lang.String[]) binds: [B:132:0x04c5, B:128:0x049c, B:13:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r28v85 int) = (r28v74 int), (r28v75 int), (r28v86 int) binds: [B:132:0x04c5, B:128:0x049c, B:13:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x060c A[PHI: r4 r7 r28
      0x060c: PHI (r4v106 android.content.IntentFilter) = (r4v15 android.content.IntentFilter), (r4v104 android.content.IntentFilter), (r4v107 android.content.IntentFilter) binds: [B:117:0x040b, B:161:0x060a, B:154:0x05c9] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r7v48 int) = (r7v8 int), (r7v2 int), (r7v2 int) binds: [B:117:0x040b, B:161:0x060a, B:154:0x05c9] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r28v64 int) = (r28v14 int), (r28v62 int), (r28v65 int) binds: [B:117:0x040b, B:161:0x060a, B:154:0x05c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x065d A[PHI: r3 r4 r28
      0x065d: PHI (r3v5 boolean) = (r3v3 boolean), (r3v2 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:165:0x0643, B:158:0x05ec, B:151:0x05a3, B:143:0x055d] A[DONT_GENERATE, DONT_INLINE]
      0x065d: PHI (r4v110 android.content.IntentFilter) = 
      (r4v103 android.content.IntentFilter)
      (r4v105 android.content.IntentFilter)
      (r4v108 android.content.IntentFilter)
      (r4v111 android.content.IntentFilter)
     binds: [B:165:0x0643, B:158:0x05ec, B:151:0x05a3, B:143:0x055d] A[DONT_GENERATE, DONT_INLINE]
      0x065d: PHI (r28v69 int) = (r28v61 int), (r28v63 int), (r28v66 int), (r28v70 int) binds: [B:165:0x0643, B:158:0x05ec, B:151:0x05a3, B:143:0x055d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x0744 A[PHI: r4 r16 r17 r18 r19 r20 r21 r28
      0x0744: PHI (r4v97 android.content.IntentFilter) = (r4v95 android.content.IntentFilter), (r4v96 android.content.IntentFilter), (r4v98 android.content.IntentFilter) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r16v4 char) = (r16v3 char), (r16v2 char), (r16v2 char) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r17v11 short) = (r17v2 short), (r17v4 short), (r17v2 short) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r18v6 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v4 int) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v4 int) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v4 int) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]
      0x0744: PHI (r28v55 int) = (r28v52 int), (r28v53 int), (r28v56 int) binds: [B:184:0x0742, B:181:0x070b, B:176:0x06e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        if (l.C4282.f15546 <= 0) goto L21;
     */
    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo29780(l.InterfaceC11217 r33) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24560.mo29780(l.ۤ᩻ۙ):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:119:0x0495 A[PHI: r0 r5 r17
      0x0495: PHI (r0v27 short) = (r0v3 short), (r0v4 short), (r0v28 short) binds: [B:118:0x0493, B:114:0x0473, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0495: PHI (r5v81 java.lang.Runnable) = (r5v55 java.lang.Runnable), (r5v56 java.lang.Runnable), (r5v82 java.lang.Runnable) binds: [B:118:0x0493, B:114:0x0473, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0495: PHI (r17v5 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]) binds: [B:118:0x0493, B:114:0x0473, B:16:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (l.C0619.f2439 == false) goto L20;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m54842(int r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24560.m54842(int, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0146 A[PHI: r4 r5 r6 r7
      0x0146: PHI (r4v4 java.lang.String) = 
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:38:0x0144, B:34:0x0122, B:26:0x00d0, B:15:0x0084, B:12:0x007b, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:38:0x0144, B:34:0x0122, B:26:0x00d0, B:15:0x0084, B:12:0x007b, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r6v4 java.lang.Object[]) = 
      (r6v2 java.lang.Object[])
      (r6v3 java.lang.Object[])
      (r6v2 java.lang.Object[])
      (r6v2 java.lang.Object[])
      (r6v2 java.lang.Object[])
      (r6v2 java.lang.Object[])
     binds: [B:38:0x0144, B:34:0x0122, B:26:0x00d0, B:15:0x0084, B:12:0x007b, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:38:0x0144, B:34:0x0122, B:26:0x00d0, B:15:0x0084, B:12:0x007b, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0176 A[PHI: r3 r8 r9
      0x0176: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:22:0x00ab, B:9:0x0072, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:22:0x00ab, B:9:0x0072, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:22:0x00ab, B:9:0x0072, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x021c A[PHI: r2
      0x021c: PHI (r2v4 java.util.ArrayList) = (r2v2 java.util.ArrayList), (r2v2 java.util.ArrayList), (r2v3 java.util.ArrayList), (r2v2 java.util.ArrayList) binds: [B:55:0x0204, B:51:0x01e7, B:48:0x01cd, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b0 A[PHI: r18 r19 r20 r25
      0x02b0: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:70:0x02ae, B:66:0x0290, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:70:0x02ae, B:66:0x0290, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:70:0x02ae, B:66:0x0290, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r25v5 short) = (r25v3 short), (r25v4 short), (r25v3 short) binds: [B:70:0x02ae, B:66:0x0290, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e4 A[PHI: r11 r13 r14 r16 r17
      0x02e4: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:74:0x02e2, B:44:0x01ad, B:17:0x0088, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:74:0x02e2, B:44:0x01ad, B:17:0x0088, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:74:0x02e2, B:44:0x01ad, B:17:0x0088, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:74:0x02e2, B:44:0x01ad, B:17:0x0088, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:74:0x02e2, B:44:0x01ad, B:17:0x0088, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m54846() {
        int iM2761;
        int i;
        int i2;
        int i3 = C0773.f2792;
        int i4 = C0269.f1558;
        int iM3169 = (i4 - C0773.m3169("ܺ᩷")) * 61;
        int i5 = ((iM3169 ^ i3) * (-20375)) ^ 957129783;
        String strJoin = null;
        String strM2361 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-111617929);
        int iM31610 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 1517349431;
        short s3 = 0;
        String strM53420 = null;
        Object[] objArr = null;
        short[] sArr3 = null;
        ArrayList arrayList = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 2263) >> 31));
            switch (i11) {
                case -2047115040:
                case -1701282198:
                    C22673.m51160(C17202.m40366(iM31610 ^ i13, objArr));
                    C3448.m11253(arrayList);
                    iM2761 = C0773.m3169("۟۫") ^ i4;
                    i = ((iM2761 ^ i3) * 4341) ^ 1717480822;
                    i2 = 1886176574;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2011757383:
                case -815892565:
                    objArr = new Object[i12];
                    objArr[0] = strJoin;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۜܺ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-19871)) ^ (-562463325);
                        i2 = -1250085247;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܺ") + i4) * q.h;
                        i = ((iM2761 ^ i3) * 4015) ^ (-1151758697);
                        i2 = -1889697701;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1918346908:
                case 107831297:
                    int i14 = s2 + s;
                    i10 = i14 * i14;
                    s3 = 35252;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("ۧۖ") + i3) * 11;
                        i = ((iM2761 ^ i4) * (-4211)) ^ 1547339854;
                        i2 = -1769836280;
                    } else {
                        iM2761 = C0619.m2761("᩵ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 25273) ^ 2106615413;
                        i2 = -1856587069;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1775445371:
                case -1651043335:
                    if (this.f79609 == 0) {
                        iM2761 = (i3 - C0619.m2761("֡᩷")) * (-55);
                        i = ((iM2761 ^ i4) * 28423) ^ 1059673295;
                        i2 = -1567205208;
                    } else {
                        iM2761 = C0773.m3169("۟۫") ^ i4;
                        i = ((iM2761 ^ i3) * 4341) ^ 1717480822;
                        i2 = 1886176574;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1766727038:
                case 1247890022:
                    i7 = 17541;
                    iM2761 = C0773.m3169("᩷ۧ") ^ i4;
                    i = ((iM2761 ^ i3) * 16899) ^ 1667443933;
                    i2 = -2123887292;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1739474934:
                case 599836437:
                    sArr2 = f79606;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("᩷ۡ") ^ i3;
                        i = ((iM2761 ^ i4) * (-26773)) ^ (-1290078261);
                        i2 = -1941344734;
                    } else {
                        iM2761 = C0619.m2761("֫ۢ") ^ i4;
                        i = ((iM2761 ^ i3) * 27395) ^ 1197764808;
                        i2 = 1458886597;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1607349430:
                case -733067136:
                    i7 = 50466;
                    iM2761 = C0773.m3169("᩷ۧ") ^ i4;
                    i = ((iM2761 ^ i3) * 16899) ^ 1667443933;
                    i2 = -2123887292;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1523445351:
                case -353119551:
                    iM31610 = C0773.m3169(strM2361);
                    i13 = 2126304554;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ᩳۤ")) * (-107);
                        i = ((iM2761 ^ i3) * (-26999)) ^ 1050212899;
                        i2 = 1225570921;
                    } else {
                        iM2761 = C0773.m3169("ۜۨ") ^ i4;
                        i = ((iM2761 ^ i3) * 12225) ^ 1837609520;
                        i2 = -1430404237;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1372738037:
                case 84565348:
                    if (this.f79610) {
                        iM2761 = C0619.m2761("᩻֫") ^ i3;
                        i = ((iM2761 ^ i4) * (-27381)) ^ 805287134;
                        i2 = -284536384;
                    } else {
                        iM2761 = C0773.m3169("۟۫") ^ i4;
                        i = ((iM2761 ^ i3) * 4341) ^ 1717480822;
                        i2 = 1886176574;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1160882195:
                case -860913615:
                    sArr3 = f79606;
                    c = 351;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("᩸᩺") + i3) * (-81);
                        i = ((iM2761 ^ i4) * 26485) ^ 1942997818;
                        i2 = 1459438173;
                    } else {
                        iM2761 = (C0619.m2761("ۙ᩺") + i4) * (-39);
                        i = ((iM2761 ^ i3) * 31149) ^ (-603479036);
                        i2 = -30008956;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1151449882:
                case 2041772365:
                    strM2361 = C0487.m2361(sArr2, 353, 3, i7);
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0619.m2761("ۜܺ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-19871)) ^ (-562463325);
                        i2 = -1250085247;
                    } else {
                        iM2761 = C0773.m3169("۬ۤ") ^ i3;
                        i = ((iM2761 ^ i4) * (-13999)) ^ 1944424310;
                        i2 = -676547512;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1031202781:
                case -570600224:
                    arrayList = this.f79612;
                    if (C1321.m4851(arrayList)) {
                        iM2761 = C0773.m3169("۟۫") ^ i4;
                        i = ((iM2761 ^ i3) * 4341) ^ 1717480822;
                        i2 = 1886176574;
                    } else {
                        iM2761 = C0619.m2761("ᩳܳ") ^ i4;
                        i = ((iM2761 ^ i3) * 13831) ^ 56531405;
                        i2 = 712487515;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -960827595:
                case 841771620:
                    s2 = sArr3[c];
                    s = 8813;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ۧۖ") + i3) * 11;
                        i = ((iM2761 ^ i4) * (-4211)) ^ 1547339854;
                        i2 = -1769836280;
                    } else {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i3;
                        i = ((iM2761 ^ i4) * 24289) ^ (-1288894383);
                        i2 = 1961894826;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -611264949:
                case 1342868942:
                    C2375.m8065();
                    C2878.m9491();
                    iM2761 = (C0619.m2761("᩸᩺") + i3) * (-81);
                    i = ((iM2761 ^ i4) * 26485) ^ 1942997818;
                    i2 = 1459438173;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -473171660:
                case 1615537641:
                    if (i10 - (s2 * s3) >= 0) {
                        iM2761 = (i4 - C0619.m2761("ܰ۟")) * (-41);
                        i = ((iM2761 ^ i3) * 25675) ^ (-1897464105);
                        i2 = -77099374;
                    } else {
                        iM2761 = C0619.m2761("᩷ۙ") ^ i3;
                        i = ((iM2761 ^ i4) * (-9533)) ^ (-1347563242);
                        i2 = -760444767;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -352538389:
                case 2010429967:
                    RunnableC3646.m11813();
                    if (C2419.f7754 < 0) {
                        iM2761 = (C0619.m2761("ۜܺ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-19871)) ^ (-562463325);
                        i2 = -1250085247;
                    } else {
                        iM2761 = (C0773.m3169("ۧۖ") + i3) * 11;
                        i = ((iM2761 ^ i4) * (-4211)) ^ 1547339854;
                        i2 = -1769836280;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -332230472:
                case 185893312:
                    C1321.m4852();
                    break;
                case -293714265:
                case 1385413685:
                    strJoin = TextUtils.join(strM53420, arrayList);
                    i12 = 1;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۜܺ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-19871)) ^ (-562463325);
                        i2 = -1250085247;
                    } else {
                        iM2761 = (C0619.m2761("ۡ᩶") + i3) * (-21);
                        i = ((iM2761 ^ i4) * (-28357)) ^ 2129642373;
                        i2 = 1471285217;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -147313229:
                case 87167332:
                    sArr = f79606;
                    i8 = 352;
                    i9 = 1;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("᩸᩺") + i3) * (-81);
                        i = ((iM2761 ^ i4) * 26485) ^ 1942997818;
                        i2 = 1459438173;
                    } else {
                        iM2761 = C0773.m3169("ܿۧ") ^ i3;
                        i = ((iM2761 ^ i4) * (-14651)) ^ 2047256742;
                        i2 = 1423212905;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -19649087:
                case 1080314974:
                    C4238.m13540();
                    if (C2354.f7599 < 0) {
                        iM2761 = (C0619.m2761("ۜܺ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-19871)) ^ (-562463325);
                        i2 = -1250085247;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩳۤ")) * (-107);
                        i = ((iM2761 ^ i3) * (-26999)) ^ 1050212899;
                        i2 = 1225570921;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 449531429:
                case 2052775200:
                    C1343.m4943();
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("᩸᩺") + i3) * (-81);
                        i = ((iM2761 ^ i4) * 26485) ^ 1942997818;
                        i2 = 1459438173;
                    } else {
                        iM2761 = (C0619.m2761("ۜܺ") + i4) * 59;
                        i = ((iM2761 ^ i3) * (-19871)) ^ (-562463325);
                        i2 = -1250085247;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1596622541:
                case 1792165529:
                    break;
                default:
                    strM53420 = C23916.m53420(sArr, i8, i9, i7);
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ᩳۤ")) * (-107);
                        i = ((iM2761 ^ i3) * (-26999)) ^ 1050212899;
                        i2 = 1225570921;
                    } else {
                        iM2761 = (C0773.m3169("᩵۫") ^ i4) * 5;
                        i = ((iM2761 ^ i3) * 25807) ^ (-172381906);
                        i2 = 35809674;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
