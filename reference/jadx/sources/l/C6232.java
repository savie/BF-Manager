package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T58S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6232 extends AbstractC4332 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile Handler f21149;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f21150;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f21151;

    public C6232() {
        super(1);
        this.f21150 = new Object();
        this.f21151 = Executors.newFixedThreadPool(4, new ThreadFactoryC12583());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17287(Runnable runnable) {
        if (this.f21149 == null) {
            synchronized (this.f21150) {
                if (this.f21149 == null) {
                    this.f21149 = m17286(Looper.getMainLooper());
                }
            }
        }
        this.f21149.post(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Handler m17286(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17521.m40780(looper);
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
