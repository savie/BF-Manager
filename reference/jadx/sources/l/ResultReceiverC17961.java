package l;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ᩳۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2CV */
/* JADX INFO: loaded from: classes4.dex */
public final class ResultReceiverC17961 extends ResultReceiver {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f57450;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile int f57451;

    public ResultReceiverC17961() {
        super(null);
        this.f57451 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41793() {
        this.f57451 = -1;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f57451 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41792() {
        if (f57450 > 10) {
            return -1;
        }
        for (int i = 0; this.f57451 == -1 && i < 60; i += 5) {
            SystemClock.sleep(5L);
        }
        if (this.f57451 == -1) {
            f57450++;
        } else {
            f57450 = 0;
        }
        return this.f57451;
    }
}
