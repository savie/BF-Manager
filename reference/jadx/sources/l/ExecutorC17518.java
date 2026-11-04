package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC17518 extends AbstractC24130 implements Executor {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC18951 f56944;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ExecutorC17518 f56945 = new ExecutorC17518();

    @Override // l.AbstractC18951
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        AbstractC18951 c16355 = C21248.f67801;
        int iM34279 = C14117.m34279();
        if (64 >= iM34279) {
            iM34279 = 64;
        }
        int iM34274 = C14117.m34274(iM34279, 12, "kotlinx.coroutines.io.parallelism");
        c16355.getClass();
        if (iM34274 < 1) {
            throw new IllegalArgumentException(C13645.m33382(iM34274, "Expected positive parallelism level, but got ").toString());
        }
        if (iM34274 < C14534.f45727) {
            if (iM34274 < 1) {
                throw new IllegalArgumentException(C13645.m33382(iM34274, "Expected positive parallelism level, but got ").toString());
            }
            c16355 = new C16355(c16355, iM34274);
        }
        f56944 = c16355;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo11210(C24963.f80840, runnable);
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable) {
        f56944.mo11210(interfaceC11536, runnable);
    }
}
