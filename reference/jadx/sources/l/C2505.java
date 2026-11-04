package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C2505 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC1057 f8017;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8018;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2374 f8019;

    static {
        ApplicationC23172.m52091(37);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C2505(String str, ViewOnClickListenerC1057 viewOnClickListenerC1057, C2374 c2374) {
        int i = -1781365245;
        int i2 = C3033.f9831;
        int i3 = C0950.f3488;
        this.f8018 = str;
        this.f8017 = viewOnClickListenerC1057;
        this.f8019 = c2374;
        int iM3169 = (i2 - C0773.m3169("ܺ᩵")) * (-93);
        int i4 = ((iM3169 ^ i3) * (-16691)) ^ (-2104452251);
        int i5 = 585774921;
        while (true) {
            i = (iM3169 ^ i5) ^ (i4 & (((i ^ i3) * (-13759)) >> 31));
            switch (i) {
                case -1723571284:
                case 898386258:
                    C1783.m6232();
                    C0862.m3503();
                    iM3169 = (i3 - C0773.m3169("᩻ܽ")) * (-21);
                    i4 = ((iM3169 ^ i2) * (-27211)) ^ (-1393491963);
                    i5 = -926962841;
                    break;
                case -1592790571:
                case 698102586:
                    C1343.m4943();
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("֡᩸") ^ i3) * (-79);
                        i4 = ((iM3169 ^ i2) * (-5205)) ^ 1641922981;
                        i5 = 633307840;
                    } else {
                        iM3169 = (C0773.m3169("֫᩹") ^ i3) * (-17);
                        i4 = ((iM3169 ^ i2) * (-24143)) ^ (-1139611002);
                        i5 = -1977543542;
                    }
                    break;
                case -1161842408:
                case 1359951433:
                    C3099.m10095();
                    throw new RuntimeException();
                case -52588980:
                case -7848284:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("᩺᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29429)) ^ (-1385161232);
                        i5 = -968663125;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩺᩶")) * 51;
                        i4 = ((iM3169 ^ i3) * (-18535)) ^ 737826328;
                        i5 = -2126701135;
                    }
                    break;
                case 512095509:
                case 1225739355:
                    return;
                case 1242634726:
                case 2084566868:
                    C1080.m4050();
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("֡᩸") ^ i3) * (-79);
                        i4 = ((iM3169 ^ i2) * (-5205)) ^ 1641922981;
                        i5 = 633307840;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۙ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * (-11309)) ^ (-1271937279);
                        i5 = -1219280165;
                    }
                    break;
                default:
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ᩴۙ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i3) * (-11309)) ^ (-1271937279);
                        i5 = -1219280165;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩻ܽ")) * (-21);
                        i4 = ((iM3169 ^ i2) * (-27211)) ^ (-1393491963);
                        i5 = -926962841;
                    }
                    break;
            }
        }
    }
}
