package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ᩴ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 76JG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ExecutorC19851 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
