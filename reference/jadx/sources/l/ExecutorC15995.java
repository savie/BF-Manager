package l;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AMD */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC15995 implements Executor {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f51918;

    public ExecutorC15995(Handler handler) {
        this.f51918 = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f51918;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
