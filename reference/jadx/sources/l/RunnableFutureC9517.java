package l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.ۡܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableFutureC9517 extends AbstractFutureC13992 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Object f30822;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Runnable f30823;

    public RunnableFutureC9517(Runnable runnable, Object obj) {
        runnable.getClass();
        this.f30823 = runnable;
        this.f30822 = obj;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo4842() {
        return this.f30822;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo4841() {
        this.f30823.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f30823 + "]";
    }
}
