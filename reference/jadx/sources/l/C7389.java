package l;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۟ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7389 extends AbstractC15857 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC12329 m19715(Object obj) {
        if (obj == null) {
            return C0333.f1740;
        }
        return new C0333(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC12329 m19716(Throwable th) {
        C20090 c20090 = new C20090();
        c20090.mo14564(th);
        return c20090;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC12329 m19717(InterfaceFutureC12329 interfaceFutureC12329, C22517 c22517, final Executor executor) {
        int i = AbstractRunnableC18678.f60625;
        final C17972 c17972 = new C17972();
        c17972.f60627 = interfaceFutureC12329;
        c17972.f60626 = c22517;
        executor.getClass();
        if (executor != EnumC8095.INSTANCE) {
            executor = new Executor() { // from class: l.ܿۢܶ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        c17972.mo14564((Throwable) e);
                    }
                }
            };
        }
        ((C0333) interfaceFutureC12329).mo1994(c17972, executor);
        return c17972;
    }
}
