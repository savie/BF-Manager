package l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.ۖܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC2806 extends AbstractFutureC13992 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Runnable f9225;

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ᩸ */
    public final /* bridge */ /* synthetic */ Object mo4842() {
        return null;
    }

    public RunnableFutureC2806(Runnable runnable) {
        this.f9225 = runnable;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo4841() {
        this.f9225.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f9225 + "]";
    }
}
