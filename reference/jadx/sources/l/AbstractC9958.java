package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9958 extends AbstractRunnableC17718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC12075 f34027;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Executor f34028;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FutureC12075 f34029;

    public AbstractC9958(Executor executor, FutureC12075 futureC12075, FutureC12075 futureC12076) {
        this.f34028 = executor;
        this.f34029 = futureC12075;
        this.f34027 = futureC12076;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m25177() {
        Executor executor = this.f34028;
        if (m50891()) {
            if (executor == null) {
                return true;
            }
            this.f34028 = null;
            executor.execute(this);
        }
        return false;
    }

    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo25178() {
        return this.f34029 != null;
    }
}
