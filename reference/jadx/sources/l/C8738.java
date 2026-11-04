package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8738 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28416;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final IntentFilter f28417;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f28418;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f28419;

    public C8738(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f28417 = intentFilter;
        this.f28419 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(128, "Receiver{");
        sbM3018.append(this.f28419);
        sbM3018.append(" filter=");
        sbM3018.append(this.f28417);
        if (this.f28418) {
            sbM3018.append(" DEAD");
        }
        sbM3018.append(l.d);
        return sbM3018.toString();
    }
}
