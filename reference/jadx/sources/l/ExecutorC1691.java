package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC1691 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable, "SessionRecoveryDiagnostics").start();
    }
}
