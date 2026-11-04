package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC19264 implements Executor {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f62298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Executor f62300;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f62299 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f62297 = new ArrayDeque();

    public ExecutorC19264(Executor executor) {
        this.f62300 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.f62299) {
            this.f62297.add(new Runnable() { // from class: l.۟ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    ExecutorC19264 executorC19264 = this.f26731;
                    executorC19264.getClass();
                    try {
                        runnable2.run();
                    } finally {
                        executorC19264.m44601();
                    }
                }
            });
            if (this.f62298 == null) {
                m44601();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44601() {
        synchronized (this.f62299) {
            Runnable runnable = (Runnable) this.f62297.poll();
            this.f62298 = runnable;
            if (runnable != null) {
                ((ExecutorC10313) this.f62300).execute(runnable);
            }
        }
    }
}
