package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩷ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22142 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f71319;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14854 f71320;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f71321;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f71322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f71323;

    public RunnableC22142(C10953 c10953, C19904 c19904, String str, Bundle bundle, C14854 c14854) {
        this.f71321 = c10953;
        this.f71322 = c19904;
        this.f71323 = str;
        this.f71319 = bundle;
        this.f71320 = c14854;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23678 c23678 = (C23678) this.f71321.f34619.f42128.get(this.f71322.f64055.getBinder());
        Bundle bundle = this.f71319;
        if (c23678 == null) {
            C17359.toString(bundle);
            return;
        }
        String str = this.f71323;
        C16964 c16964 = new C16964(str, this.f71320);
        c16964.m21883();
        if (c16964.m21884()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
