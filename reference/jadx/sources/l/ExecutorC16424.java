package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC16424 implements Executor {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Runnable f52841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Executor f52843;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f52840 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f52842 = new ArrayDeque();

    public ExecutorC16424(Executor executor) {
        this.f52843 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f52840) {
            this.f52842.add(new RunnableC0195(this, runnable));
            if (this.f52841 == null) {
                m38678();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38678() {
        synchronized (this.f52840) {
            Runnable runnable = (Runnable) this.f52842.poll();
            this.f52841 = runnable;
            if (runnable != null) {
                ((ExecutorC12191) this.f52843).execute(runnable);
            }
        }
    }
}
