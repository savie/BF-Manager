package l;

/* JADX INFO: renamed from: l.ۙ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4878 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f17157;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC14052 f17158;

    public RunnableC4878(ExecutorC14052 executorC14052, Runnable runnable) {
        this.f17158 = executorC14052;
        this.f17157 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC14052 executorC14052 = this.f17158;
        try {
            this.f17157.run();
        } finally {
            executorC14052.m34002();
        }
    }
}
