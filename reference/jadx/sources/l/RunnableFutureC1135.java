package l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.֨۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableFutureC1135 extends AbstractFutureC23009 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f5103;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Runnable f5104;

    public RunnableFutureC1135(Runnable runnable, Object obj) {
        runnable.getClass();
        this.f5104 = runnable;
        this.f5103 = obj;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object mo4167() {
        return this.f5103;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo4168() {
        this.f5104.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f5104 + "]";
    }
}
