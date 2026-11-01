package l;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AMD */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC6566 implements Executor {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Handler f22111;

    public ExecutorC6566(Handler handler) {
        this.f22111 = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f22111;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
