package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.۠ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1KE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8250 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f28701 = new Handler();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4245 f28702;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public RunnableC18833 f28703;

    public C8250(ServiceC23297 serviceC23297) {
        this.f28702 = new C4245(serviceC23297);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m21639(EnumC1651 enumC1651) {
        RunnableC18833 runnableC18833 = this.f28703;
        if (runnableC18833 != null) {
            runnableC18833.run();
        }
        RunnableC18833 runnableC18834 = new RunnableC18833(this.f28702, enumC1651);
        this.f28703 = runnableC18834;
        this.f28701.postAtFrontOfQueue(runnableC18834);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21643() {
        m21639(EnumC1651.ON_CREATE);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21644() {
        m21639(EnumC1651.ON_START);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m21642() {
        m21639(EnumC1651.ON_START);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21640() {
        m21639(EnumC1651.ON_STOP);
        m21639(EnumC1651.ON_DESTROY);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4245 m21641() {
        return this.f28702;
    }
}
