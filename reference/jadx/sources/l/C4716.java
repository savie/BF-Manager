package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: PB32 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4716 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Handler f16634;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f16632 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f16636 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f16635 = m13048(64);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f16633 = Executors.newFixedThreadPool(C5464.f18831);

    static {
        Thread thread = new Thread(new RunnableC3575(0));
        thread.setName("Custom-Looper");
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13049() {
        Looper.prepare();
        Looper looperMyLooper = Looper.myLooper();
        C13638.requireNonNull(looperMyLooper);
        f16634 = new Handler(looperMyLooper);
        Looper.loop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m13048(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13052(ExecutorService executorService) {
        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Handler m13053() {
        while (true) {
            Handler handler = f16634;
            if (handler != null) {
                return handler;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13051(Runnable runnable, Object obj, long j) {
        Handler handlerM13053 = m13053();
        handlerM13053.removeCallbacksAndMessages(obj);
        handlerM13053.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13050(Object obj, long j, Runnable runnable) {
        Handler handlerM13053 = m13053();
        handlerM13053.removeCallbacksAndMessages(obj);
        handlerM13053.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13047(ExecutorService executorService, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(executorService.submit((Callable) it.next()));
        }
        return arrayList2;
    }
}
