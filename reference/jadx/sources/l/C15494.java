package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes4.dex */
public final class C15494 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f50474;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50475;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final IntentFilter f50476;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50477;

    public C15494(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f50476 = intentFilter;
        this.f50474 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(128, "Receiver{");
        sbM40152.append(this.f50474);
        sbM40152.append(" filter=");
        sbM40152.append(this.f50476);
        if (this.f50477) {
            sbM40152.append(" DEAD");
        }
        sbM40152.append(l.d);
        return sbM40152.toString();
    }
}
