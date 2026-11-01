package l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.۬۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableFutureC13131 extends AbstractFutureC23009 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f43727;

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ Object mo4167() {
        return null;
    }

    public RunnableFutureC13131(Runnable runnable) {
        this.f43727 = runnable;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4168() {
        this.f43727.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f43727 + "]";
    }
}
