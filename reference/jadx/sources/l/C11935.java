package l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۨ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11935 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f40036 = new ThreadPoolExecutor(0, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HandlerThread f40037;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Handler f40038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29731(Runnable runnable) {
        if (f40038 == null) {
            synchronized (C11935.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f40037 = handlerThread;
                handlerThread.start();
                f40038 = new Handler(f40037.getLooper());
            }
        }
        f40038.post(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Executor m29730() {
        return new ExecutorC14052();
    }
}
