package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۙܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC4704 extends AbstractC21015 implements Executor {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final ExecutorC4704 f16610 = new ExecutorC4704();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final RunnableC2858 f16611;

    @Override // l.AbstractC12405
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        C23050 c23050 = C23050.f74892;
        int iM38428 = C16265.m38428();
        if (64 >= iM38428) {
            iM38428 = 64;
        }
        int iM38429 = C16265.m38429(iM38428, 12, "kotlinx.coroutines.io.parallelism");
        c23050.getClass();
        if (iM38429 < 1) {
            throw new IllegalArgumentException(C8479.m22141(iM38429, "Expected positive parallelism level, but got ").toString());
        }
        f16611 = new RunnableC2858(c23050, iM38429);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo8623(C1218.f5350, runnable);
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ۙ */
    public final void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable) {
        f16611.mo8623(interfaceC22386, runnable);
    }
}
