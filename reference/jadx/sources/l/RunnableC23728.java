package l;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: l.᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23728 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76782;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14556 f76783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntentSender.SendIntentException f76784;

    public RunnableC23728(C14556 c14556, int i, IntentSender.SendIntentException sendIntentException) {
        this.f76783 = c14556;
        this.f76782 = i;
        this.f76784 = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76783.m20786(this.f76782, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f76784));
    }
}
