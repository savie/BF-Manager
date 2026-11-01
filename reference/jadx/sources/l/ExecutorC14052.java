package l;

import java.util.LinkedList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܰ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC14052 implements Executor {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinkedList f46193 = new LinkedList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f46194;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f46193.offer(new RunnableC4878(this, runnable));
        if (this.f46194 == null) {
            m34002();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34002() {
        Runnable runnable = (Runnable) this.f46193.poll();
        this.f46194 = runnable;
        if (runnable != null) {
            C11935.f40036.execute(runnable);
        }
    }
}
