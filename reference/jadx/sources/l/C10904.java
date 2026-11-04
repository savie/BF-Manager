package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C10904 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34526;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC1057 f34527;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34528;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1803 f34529;

    static {
        ApplicationC23172.m52091(97);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C10904(int i, String str, ViewOnClickListenerC1057 viewOnClickListenerC1057, C1803 c1803) {
        int i2 = 391821790;
        int i3 = C20932.f66974;
        int i4 = C2419.f7754;
        this.f34528 = i;
        this.f34526 = str;
        this.f34527 = viewOnClickListenerC1057;
        this.f34529 = c1803;
        int iM2761 = C0619.m2761("ۚ᩺") ^ i4;
        int i5 = ((iM2761 ^ i3) * 15513) ^ 946417575;
        int i6 = 2061801022;
        while (true) {
            i2 = (iM2761 ^ i6) ^ (i5 & (((i2 ^ i3) * (-1805)) >> 31));
            switch (i2) {
                case -2041366748:
                case -225199788:
                    if (C2419.m8174() >= 0) {
                        iM2761 = (C0773.m3169("ܶ֨") ^ i3) * (-59);
                        i5 = ((iM2761 ^ i4) * 24037) ^ 393787748;
                        i6 = 243357911;
                    } else {
                        iM2761 = C0619.m2761("ۨۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 16909) ^ 1964496467;
                        i6 = -1874019913;
                    }
                    break;
                case -2013384984:
                case 848881361:
                    if (C1542.f5343 > 0) {
                        iM2761 = C0619.m2761("ۤۖ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22535) ^ 146312452;
                        i6 = 1963945225;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩴ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2761 ^ i3) * 13069) ^ 1139183966;
                        i6 = -1315632247;
                    }
                    break;
                case -1203449852:
                case 1759956530:
                    C4282.m13644();
                    if (!C1519.m5403()) {
                        iM2761 = C0619.m2761("ۤۖ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22535) ^ 146312452;
                        i6 = 1963945225;
                    } else {
                        iM2761 = (C0619.m2761("֡֡") + i4) * 69;
                        i5 = ((iM2761 ^ i3) * 23897) ^ (-897561576);
                        i6 = -892999809;
                    }
                    break;
                case -1165972032:
                case 2132962378:
                    return;
                case 45240749:
                case 942054026:
                    C0487.m2356();
                    C3492.m11488();
                    throw new RuntimeException();
                case 1409170065:
                case 1606646270:
                    RunnableC3646.m11813();
                    C0487.m2356();
                    iM2761 = (C0619.m2761("֡֡") + i4) * 69;
                    i5 = ((iM2761 ^ i3) * 23897) ^ (-897561576);
                    i6 = -892999809;
                    break;
                default:
                    C2023.m6964();
                    if (C2288.f7433 > 0) {
                        iM2761 = C0619.m2761("ۤۖ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22535) ^ 146312452;
                        i6 = 1963945225;
                    } else {
                        iM2761 = (C0619.m2761("ۢܶ") ^ i4) * (-55);
                        i5 = ((iM2761 ^ i3) * 13477) ^ 1352440110;
                        i6 = 697733222;
                    }
                    break;
            }
        }
    }
}
