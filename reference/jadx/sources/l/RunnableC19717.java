package l;

import android.app.Dialog;

/* JADX INFO: renamed from: l.᩵᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19717 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Dialog f63285;

    public RunnableC19717(Dialog dialog) {
        this.f63285 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f63285.dismiss();
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.DialogUtils", "dismiss dialog exception", e);
        }
    }
}
