package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩶ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC21429 implements Executor {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f68268;

    public /* synthetic */ ExecutorC21429(C24132 c24132) {
        this.f68268 = c24132;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f68268.post(runnable);
    }
}
