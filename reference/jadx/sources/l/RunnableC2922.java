package l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2922 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8888 f9565;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9566;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntentSender.SendIntentException f9567;

    public RunnableC2922(C8888 c8888, int i, IntentSender.SendIntentException sendIntentException) {
        this.f9565 = c8888;
        this.f9566 = i;
        this.f9567 = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9565.m31425(this.f9566, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f9567));
    }
}
