package l;

import android.app.Activity;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C13684 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45143;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f45144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3475 f45145;

    static {
        ApplicationC6132.m17119(123);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C13684(Activity activity, C3475 c3475, String str) {
        int i = -466356766;
        int i2 = C1668.f6641;
        int i3 = ThreadFactoryC3888.f14547;
        this.f45143 = str;
        this.f45144 = activity;
        this.f45145 = c3475;
        int iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-18301)) ^ 177342664;
        int i5 = -1568463054;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i2) * 29285) >> 31));
            switch (i) {
                case -2066536137:
                case -851023286:
                    C2249.m6915();
                    C2332.m7079();
                    throw new RuntimeException();
                case -925176757:
                case -290516829:
                    C7105.m18985();
                    if (C0671.f2816 == 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰۢ")) * (-127);
                        i4 = ((iM11306 ^ i2) * 22305) ^ 1891729168;
                        i5 = -397012712;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27271) ^ 318758132;
                        i5 = -1846526609;
                    }
                    break;
                case -186616304:
                case 1824297327:
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i2) * 3;
                        i4 = ((iM11306 ^ i3) * (-9599)) ^ 127600125;
                        i5 = 1063932143;
                    } else {
                        iM11306 = C19806.m45029("ܰܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1385) ^ (-882534056);
                        i5 = 447143935;
                    }
                    break;
                case -116927051:
                case 2119244310:
                    return;
                case 109717589:
                case 1678201107:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("᩶᩵") + i3) * 25;
                        i4 = ((iM11306 ^ i2) * 25607) ^ (-2104802435);
                        i5 = 1091738313;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰۢ")) * (-127);
                        i4 = ((iM11306 ^ i2) * 22305) ^ 1891729168;
                        i5 = -397012712;
                    }
                    break;
                case 823767490:
                case 1971369907:
                    C10634.m26820();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰۢ")) * (-127);
                    i4 = ((iM11306 ^ i2) * 22305) ^ 1891729168;
                    i5 = -397012712;
                    break;
                default:
                    C1377.m4833();
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("᩶᩵") + i3) * 25;
                        i4 = ((iM11306 ^ i2) * 25607) ^ (-2104802435);
                        i5 = 1091738313;
                    } else {
                        iM11306 = (C19806.m45029("۠᩵") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i2) * 29103) ^ 640256852;
                        i5 = -749625392;
                    }
                    break;
            }
        }
    }
}
