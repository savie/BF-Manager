package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C4939 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC1057 f17219;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f17220;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5532 f17221;

    static {
        ApplicationC23172.m52091(58);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C4939(String str, ViewOnClickListenerC1057 viewOnClickListenerC1057, C5532 c5532) {
        int i = 187405195;
        int i2 = C1564.f5401;
        int i3 = C3690.f12684;
        this.f17220 = str;
        this.f17219 = viewOnClickListenerC1057;
        this.f17221 = c5532;
        int iM2761 = (i3 - C0619.m2761("ۚۛ")) * (-101);
        int i4 = ((iM2761 ^ i2) * 23931) ^ 2071151949;
        int i5 = -59396584;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i2) * 22657) >> 31));
            switch (i) {
                case -1169142744:
                case 882151194:
                    C20932.m47848();
                    iM2761 = (i3 - C0773.m3169("֫᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM2761 ^ i2) * 21359) ^ (-1898693909);
                    i5 = -1852198172;
                    break;
                case -828264188:
                case -556899901:
                    C1542.m5459();
                    throw new RuntimeException();
                case -702014499:
                case -54645726:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("᩷᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7441) ^ (-1370939733);
                        i5 = -1854221253;
                    } else {
                        iM2761 = (C0773.m3169("ۘܰ") ^ i2) * 119;
                        i4 = ((iM2761 ^ i3) * (-26915)) ^ 1909399128;
                        i5 = 594452381;
                    }
                    break;
                case -551355232:
                case 1412156081:
                    return;
                case -336692374:
                case 356858752:
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0773.m3169("ܺᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17147) ^ (-1759760531);
                        i5 = 916710105;
                    } else {
                        iM2761 = (C0619.m2761("᩷֨") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * (-8775)) ^ (-1692579400);
                        i5 = 1305776162;
                    }
                    break;
                case 139483584:
                case 1921568259:
                    C1783.m6232();
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i3 - C0773.m3169("֫᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 21359) ^ (-1898693909);
                        i5 = -1852198172;
                    } else {
                        iM2761 = C0619.m2761("ܳ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24079)) ^ (-1417605353);
                        i5 = -1060678595;
                    }
                    break;
                default:
                    C1519.m5403();
                    if (!C2702.m8876()) {
                        iM2761 = C0773.m3169("ܺᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17147) ^ (-1759760531);
                        i5 = 916710105;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֫᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 21359) ^ (-1898693909);
                        i5 = -1852198172;
                    }
                    break;
            }
        }
    }
}
