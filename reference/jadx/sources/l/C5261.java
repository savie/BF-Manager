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

/* JADX INFO: renamed from: l.ۙ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB32 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5261 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Handler f18539;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f18541 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f18540 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f18538 = m15832(64);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f18537 = Executors.newFixedThreadPool(C11138.f35105);

    static {
        Thread thread = new Thread(new RunnableC13814(0));
        thread.setName("Custom-Looper");
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15833() {
        Looper.prepare();
        Looper looperMyLooper = Looper.myLooper();
        C17359.requireNonNull(looperMyLooper);
        f18539 = new Handler(looperMyLooper);
        Looper.loop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m15832(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15837(ExecutorService executorService) {
        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Handler m15838() {
        while (true) {
            Handler handler = f18539;
            if (handler != null) {
                return handler;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15834(Object obj) {
        m15838().removeCallbacksAndMessages(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15836(Runnable runnable, Object obj, long j) {
        Handler handlerM15838 = m15838();
        handlerM15838.removeCallbacksAndMessages(obj);
        handlerM15838.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15835(Object obj, long j, Runnable runnable) {
        Handler handlerM15838 = m15838();
        handlerM15838.removeCallbacksAndMessages(obj);
        handlerM15838.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15831(ExecutorService executorService, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(executorService.submit((Callable) it.next()));
        }
        return arrayList2;
    }
}
