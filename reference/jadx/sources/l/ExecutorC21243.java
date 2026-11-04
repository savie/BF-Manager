package l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩶ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0R */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ExecutorC21243 implements Executor {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Handler f67781;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f67781.post(runnable);
    }
}
