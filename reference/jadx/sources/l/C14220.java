package l;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N15Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C14220 extends WebChromeClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20934 f44938;

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        int i = -1232556433;
        int i2 = C11235.f35427;
        int i3 = C1146.f4234;
        int iM3169 = C0773.m3169("ۧۘ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-27743)) ^ (-1128707452);
        int i5 = 61809495;
        while (true) {
            i = ((((i ^ i2) * 27267) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2064438374:
                case 1650082888:
                    C1321.m4852();
                    if (!RunnableC3646.f12471) {
                        iM3169 = (i3 - C0773.m3169("᩷ܶ")) * 123;
                        i4 = ((iM3169 ^ i2) * (-10441)) ^ (-831529233);
                        i5 = -781227368;
                    } else {
                        iM3169 = (C0619.m2761("ۤܰ") ^ i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-1363)) ^ (-50531110);
                        i5 = 598338547;
                    }
                    break;
                case -1772968288:
                case 229879479:
                    C1542.m5459();
                    C2287.m7745();
                    iM3169 = (C0619.m2761("ۤܰ") ^ i3) * (-69);
                    i4 = ((iM3169 ^ i2) * (-1363)) ^ (-50531110);
                    i5 = 598338547;
                    break;
                case -1677299226:
                case 688700635:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0619.m2761("֡֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22187) ^ (-490259348);
                        i5 = 78651859;
                    } else {
                        iM3169 = C0773.m3169("۟ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-22845)) ^ (-555984947);
                        i5 = 1717651656;
                    }
                    break;
                case -1466779003:
                case -703018358:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("ۤܰ") ^ i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-1363)) ^ (-50531110);
                        i5 = 598338547;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۬") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 31251) ^ (-1479442238);
                        i5 = -1803128430;
                    }
                    break;
                case -1310331035:
                case 1571570341:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i3 - C0773.m3169("᩷ܶ")) * 123;
                        i4 = ((iM3169 ^ i2) * (-10441)) ^ (-831529233);
                        i5 = -781227368;
                    } else {
                        iM3169 = C0773.m3169("ۖܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27447)) ^ 893924267;
                        i5 = -2031280345;
                    }
                    break;
                case -1277779580:
                case 1983627751:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("֡֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22187) ^ (-490259348);
                        i5 = 78651859;
                    } else {
                        iM3169 = (C0773.m3169("ܽۢ") ^ i2) * (-61);
                        i4 = ((iM3169 ^ i3) * 12747) ^ (-644245195);
                        i5 = -541235364;
                    }
                    break;
                case -1122768740:
                case -562111582:
                    this.f44938.setTitle(str);
                    break;
                case -1020126465:
                case -805161268:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (C0773.m3169("᩹ܺ") ^ i3) * (-63);
                        i4 = ((iM3169 ^ i2) * 20387) ^ 735260951;
                        i5 = -205870741;
                    } else {
                        iM3169 = (C0773.m3169("ۘ᩵") + i2) * 39;
                        i4 = ((iM3169 ^ i3) * 8395) ^ 1887028665;
                        i5 = -578174165;
                    }
                    break;
                case -939293003:
                case 430829321:
                    AbstractC0641.m2813();
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30615) ^ 1067690377;
                        i5 = 1768946157;
                    } else {
                        iM3169 = C0619.m2761("֡֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22187) ^ (-490259348);
                        i5 = 78651859;
                    }
                    break;
                case -834918448:
                case 519913833:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("֡֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22187) ^ (-490259348);
                        i5 = 78651859;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۢۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM3169 ^ i2) * (-28851)) ^ (-1223327661);
                        i5 = 1573941678;
                    }
                    break;
                case -332654308:
                case 685299029:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30615) ^ 1067690377;
                        i5 = 1768946157;
                    } else {
                        iM3169 = C0773.m3169("۬ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12827)) ^ 644139279;
                        i5 = -1226177381;
                    }
                    break;
                case -210489934:
                case 604563976:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i3 - C0773.m3169("᩷ܶ")) * 123;
                        i4 = ((iM3169 ^ i2) * (-10441)) ^ (-831529233);
                        i5 = -781227368;
                    } else {
                        iM3169 = C0773.m3169("᩷᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4279)) ^ (-801933327);
                        i5 = 1934101017;
                    }
                    break;
                case -74641042:
                case 260056560:
                    AbstractC0641.m2813();
                    if (C2834.m9344() < 0) {
                        iM3169 = C0619.m2761("֡֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22187) ^ (-490259348);
                        i5 = 78651859;
                    } else {
                        iM3169 = (C0619.m2761("ۤܰ") ^ i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-1363)) ^ (-50531110);
                        i5 = 598338547;
                    }
                    break;
                case 336590702:
                case 1511897126:
                    if (C1080.m4050()) {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i3) * (-125);
                        i4 = ((iM3169 ^ i2) * (-11521)) ^ 307117991;
                        i5 = -54721517;
                    } else {
                        iM3169 = (C0619.m2761("ۤܰ") ^ i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-1363)) ^ (-50531110);
                        i5 = 598338547;
                    }
                    break;
                case 541986991:
                case 2101471873:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("᩹ܺ") ^ i3) * (-63);
                        i4 = ((iM3169 ^ i2) * 20387) ^ 735260951;
                        i5 = -205870741;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4673)) ^ (-261535656);
                        i5 = 746577769;
                    }
                    break;
                default:
                    C3734.m12152();
                    break;
            }
            return;
        }
    }

    public C14220(ActivityC20934 activityC20934) {
        this.f44938 = activityC20934;
    }
}
