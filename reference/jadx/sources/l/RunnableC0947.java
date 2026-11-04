package l;

import android.app.Dialog;

/* JADX INFO: renamed from: l.֨ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0947 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Dialog f3486;

    public RunnableC0947(Dialog dialog) {
        this.f3486 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3486.dismiss();
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.DialogUtils", "dismiss dialog exception", e);
        }
    }
}
