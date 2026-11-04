package l;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ۗܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3550 extends AbstractC12499 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC14736 m11571(Object obj) {
        if (obj == null) {
            return C24434.f79315;
        }
        return new C24434(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC14736 m11572(Throwable th) {
        C6534 c6534 = new C6534();
        c6534.mo2584(th);
        return c6534;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC14736 m11573(InterfaceFutureC14736 interfaceFutureC14736, C5591 c5591, final Executor executor) {
        int i = AbstractRunnableC25180.f81389;
        final C11753 c11753 = new C11753();
        c11753.f81391 = interfaceFutureC14736;
        c11753.f81390 = c5591;
        executor.getClass();
        if (executor != EnumC16974.INSTANCE) {
            executor = new Executor() { // from class: l.᩶ܽܽ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        c11753.mo2584((Throwable) e);
                    }
                }
            };
        }
        ((C24434) interfaceFutureC14736).mo7375(c11753, executor);
        return c11753;
    }
}
