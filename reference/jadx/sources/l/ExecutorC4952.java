package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۙ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC4952 implements Executor {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f17290;

    public /* synthetic */ ExecutorC4952(C6111 c6111) {
        this.f17290 = c6111;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17290.post(runnable);
    }
}
