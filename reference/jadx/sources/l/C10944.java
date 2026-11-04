package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C10944 implements InterfaceExecutorC22879 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Executor f34605;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7376 f34606;

    public C10944(Executor executor, C7376 c7376) {
        this.f34605 = executor;
        this.f34606 = c7376;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34605.execute(runnable);
    }

    @Override // l.InterfaceExecutorC22879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27772() {
        this.f34606.accept(this.f34605);
    }
}
