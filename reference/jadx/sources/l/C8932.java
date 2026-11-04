package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T58S */
/* JADX INFO: loaded from: classes4.dex */
public final class C8932 extends AbstractC11528 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile Handler f29127;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f29128 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f29126 = Executors.newFixedThreadPool(4, new ThreadFactoryC9677());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23844(Runnable runnable) {
        if (this.f29127 == null) {
            synchronized (this.f29128) {
                if (this.f29127 == null) {
                    this.f29127 = m23843(Looper.getMainLooper());
                }
            }
        }
        this.f29127.post(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Handler m23843(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2966.m9661(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
