package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۨ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C11567 extends Thread {

    /* JADX INFO: renamed from: ᩴۖ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f38905;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38906;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23604 f38907;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38908;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13020 f38909;

    static {
        ApplicationC6132.m17119(UMErrorCode.E_UM_BE_JSON_FAILED);
        f38905 = new short[]{7473, -30540, -30561, -30540, -30533, -30574, -30487, -30474, -30543, -30557, -30475, -30474, -30492};
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C11567(String str, String str2, ViewOnClickListenerC23604 viewOnClickListenerC23604, C13020 c13020) {
        int i = 1259853686;
        int i2 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i3 = C1025.f4800;
        this.f38908 = str;
        this.f38906 = str2;
        this.f38907 = viewOnClickListenerC23604;
        this.f38909 = c13020;
        int iM45029 = C19806.m45029("ۧۢ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-527)) ^ (-638184870);
        int i5 = 1647290075;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i2) * (-739)) >> 31));
            switch (i) {
                case -1942073217:
                case 1514334281:
                    if (C0671.f2816 == 0) {
                        iM45029 = C19806.m45029("ᩴܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22951)) ^ (-1719813424);
                        i5 = -866778590;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19827) ^ (-413609183);
                        i5 = -2100586382;
                    }
                    break;
                case -1767927016:
                case -879916653:
                    RunnableC0195.m1431();
                    if (C2124.m6673() <= 0) {
                        iM45029 = C19806.m45029("ᩴܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22951)) ^ (-1719813424);
                        i5 = -866778590;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18867)) ^ 1915388345;
                        i5 = 41522572;
                    }
                    break;
                case -1653231010:
                case 1262229342:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (!C0526.f2219) {
                        iM45029 = (i2 - C19806.m45029("۬۫")) * (-101);
                        i4 = ((iM45029 ^ i3) * (-24861)) ^ (-338034314);
                        i5 = 1884849025;
                    } else {
                        iM45029 = C19806.m45029("ᩴܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22951)) ^ (-1719813424);
                        i5 = -866778590;
                    }
                    break;
                case -1298231601:
                case 1640424322:
                    if (RunnableC1564.f6300) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺᩵")) * (-77);
                        i4 = ((iM45029 ^ i2) * (-11763)) ^ (-1387612907);
                        i5 = 1631246901;
                    } else {
                        iM45029 = (C19806.m45029("᩶ܳ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * (-30693)) ^ 1603954391;
                        i5 = 1519272443;
                    }
                    break;
                case 484756946:
                case 963080553:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM45029 = (i2 - C19806.m45029("۬۫")) * (-101);
                    i4 = ((iM45029 ^ i3) * (-24861)) ^ (-338034314);
                    i5 = 1884849025;
                    break;
                case 525058477:
                case 1009159685:
                    return;
                default:
                    C1461.m5080();
                    C2124.m6673();
                    throw new RuntimeException();
            }
        }
    }
}
