package l;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.֨ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC1315 extends AbstractFutureC13992 implements RunnableFuture {
    public static final long serialVersionUID = 2838392045355241008L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Callable f4727;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f4728;

    public RunnableFutureC1315(Callable callable) {
        callable.getClass();
        this.f4727 = callable;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object mo4842() {
        return this.f4728;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo4841() {
        try {
            this.f4728 = this.f4727.call();
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f4727 + "]";
    }
}
