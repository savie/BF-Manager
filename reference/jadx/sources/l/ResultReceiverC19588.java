package l;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ᩴۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2CV */
/* JADX INFO: loaded from: classes5.dex */
public final class ResultReceiverC19588 extends ResultReceiver {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f63163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f63164;

    public ResultReceiverC19588() {
        super(null);
        this.f63164 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45189() {
        this.f63164 = -1;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f63164 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45188() {
        if (f63163 > 10) {
            return -1;
        }
        for (int i = 0; this.f63164 == -1 && i < 60; i += 5) {
            SystemClock.sleep(5L);
        }
        if (this.f63164 == -1) {
            f63163++;
        } else {
            f63163 = 0;
        }
        return this.f63164;
    }
}
