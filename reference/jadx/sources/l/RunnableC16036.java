package l;

/* JADX INFO: renamed from: l.ܶۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16036 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f52020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC23496 f52021;

    public RunnableC16036(ExecutorC23496 executorC23496, Runnable runnable) {
        this.f52021 = executorC23496;
        this.f52020 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC23496 executorC23496 = this.f52021;
        try {
            this.f52020.run();
        } finally {
            executorC23496.m52685();
        }
    }
}
