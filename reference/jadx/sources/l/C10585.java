package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤ᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10585 implements InterfaceExecutorC7762 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Executor f36202;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11996 f36203;

    public C10585(Executor executor, C11996 c11996) {
        this.f36202 = executor;
        this.f36203 = c11996;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f36202.execute(runnable);
    }

    @Override // l.InterfaceExecutorC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo20430() {
        this.f36203.accept(this.f36202);
    }
}
