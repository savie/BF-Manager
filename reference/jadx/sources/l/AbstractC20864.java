package l;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20864 {
    /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
    public abstract void m46899(int i);

    /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
    public abstract void m46900(Typeface typeface);

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        m46898(handler).post(new RunnableC0428(1, this, typeface));
    }

    public final void callbackFailAsync(final int i, Handler handler) {
        m46898(handler).post(new Runnable() { // from class: l.۟۫
            @Override // java.lang.Runnable
            public final void run() {
                this.f24851.m46899(i);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Handler m46898(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
