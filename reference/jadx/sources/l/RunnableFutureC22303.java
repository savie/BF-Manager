package l;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.᩹۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC22303 extends AbstractFutureC23009 implements RunnableFuture {
    public static final long serialVersionUID = 2838392045355241008L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Callable f72845;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f72846;

    public RunnableFutureC22303(Callable callable) {
        callable.getClass();
        this.f72845 = callable;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۖ */
    public final Object mo4167() {
        return this.f72846;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4168() {
        try {
            this.f72846 = this.f72845.call();
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f72845 + "]";
    }
}
