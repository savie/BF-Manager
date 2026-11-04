package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۙܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4988 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14854 f17329;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f17330;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f17331;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f17332;

    public RunnableC4988(C10953 c10953, C19904 c19904, String str, Bundle bundle, C14854 c14854) {
        this.f17330 = c10953;
        this.f17332 = c19904;
        this.f17331 = str;
        this.f17329 = c14854;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C23678) this.f17330.f34619.f42128.get(this.f17332.f64055.getBinder())) == null) {
            return;
        }
        String str = this.f17331;
        C25170 c25170 = new C25170(str, this.f17329);
        c25170.m21880(4);
        c25170.m21882();
        if (!c25170.m21884()) {
            throw new IllegalStateException(C25272.m56409("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
