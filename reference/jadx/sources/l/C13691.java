package l;

import android.app.Activity;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۬ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C13691 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f43433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f43434;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43435;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8536 f43436;

    static {
        ApplicationC23172.m52091(UMErrorCode.E_UM_BE_JSON_FAILED);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C13691(String str, int i, Activity activity, C8536 c8536) {
        int i2 = -1227659391;
        int i3 = C1519.f5300;
        int i4 = C2287.f7432;
        this.f43433 = str;
        this.f43435 = i;
        this.f43434 = activity;
        this.f43436 = c8536;
        int iM3169 = (C0773.m3169("᩸۫") + i3) * (-35);
        int i5 = ((iM3169 ^ i4) * (-1551)) ^ 1371659980;
        int i6 = 307525105;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * 6665) >> 31));
            switch (i2) {
                case -2123350732:
                case -2039033365:
                    C1519.m5403();
                    if (C0269.f1558 > 0) {
                        iM3169 = (C0773.m3169("֫֨") + i3) * (-123);
                        i5 = ((iM3169 ^ i4) * (-3637)) ^ (-532882729);
                        i6 = 467092397;
                    } else {
                        iM3169 = C0619.m2761("ۚۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-10751)) ^ (-1611849003);
                        i6 = -432033052;
                    }
                    break;
                case -2045850207:
                case -381386879:
                    C2485.m8357();
                    throw new RuntimeException();
                case -1603113460:
                case 1611267210:
                    return;
                case -515649052:
                case 1662341979:
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("᩻ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-14925)) ^ 984648483;
                        i6 = 1493925366;
                    } else {
                        iM3169 = C0773.m3169("ۙܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13693) ^ (-1079099879);
                        i6 = 543501176;
                    }
                    break;
                case -380383928:
                case -224070220:
                    if (C23916.f77426 > 0) {
                        iM3169 = C0619.m2761("ۨ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * 29217) ^ (-702254931);
                        i6 = -1419393170;
                    } else {
                        iM3169 = (C0773.m3169("֫֨") + i3) * (-123);
                        i5 = ((iM3169 ^ i4) * (-3637)) ^ (-532882729);
                        i6 = 467092397;
                    }
                    break;
                case 573051594:
                case 1947969503:
                    C1826.m6301();
                    iM3169 = (C0773.m3169("֫֨") + i3) * (-123);
                    i5 = ((iM3169 ^ i4) * (-3637)) ^ (-532882729);
                    i6 = 467092397;
                    break;
                default:
                    C2287.m7745();
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۗ֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-24431)) ^ 1104504926;
                        i6 = 1766099701;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * 29217) ^ (-702254931);
                        i6 = -1419393170;
                    }
                    break;
            }
        }
    }
}
