package l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۗۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3358 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f10966 = new ThreadPoolExecutor(0, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static HandlerThread f10967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Handler f10968;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11058(Runnable runnable) {
        if (f10968 == null) {
            synchronized (C3358.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f10967 = handlerThread;
                handlerThread.start();
                f10968 = new Handler(f10967.getLooper());
            }
        }
        f10968.post(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Executor m11057() {
        return new ExecutorC23496();
    }
}
