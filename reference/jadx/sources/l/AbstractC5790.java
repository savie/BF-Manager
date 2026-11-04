package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۚܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5790 extends AbstractRunnableC11009 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Executor f19884;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public FutureC23690 f19885;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f19886;

    public AbstractC5790(Executor executor, FutureC23690 futureC23690, FutureC23690 futureC23691) {
        this.f19884 = executor;
        this.f19886 = futureC23690;
        this.f19885 = futureC23691;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m16889() {
        Executor executor = this.f19884;
        if (m34091()) {
            if (executor == null) {
                return true;
            }
            this.f19884 = null;
            executor.execute(this);
        }
        return false;
    }

    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo16890() {
        return this.f19886 != null;
    }
}
