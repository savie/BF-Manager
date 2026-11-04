package l;

import java.util.LinkedList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩹ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC23496 implements Executor {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedList f75971 = new LinkedList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f75972;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f75971.offer(new RunnableC16036(this, runnable));
        if (this.f75972 == null) {
            m52685();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m52685() {
        Runnable runnable = (Runnable) this.f75971.poll();
        this.f75972 = runnable;
        if (runnable != null) {
            C3358.f10966.execute(runnable);
        }
    }
}
