package l;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7727 {
    /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
    public abstract void m21011(int i);

    /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
    public abstract void m21012(Typeface typeface);

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        m21010(handler).post(new RunnableC19852(1, this, typeface));
    }

    public final void callbackFailAsync(int i, Handler handler) {
        m21010(handler).post(new RunnableC6991(i, 1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Handler m21010(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
