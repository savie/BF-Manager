package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩳ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19437 implements Drawable.Callback {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC10486 f62810;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f62811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Rect f62812;

    public C19437(TextView textView, RunnableC10486 runnableC10486, Rect rect) {
        this.f62811 = textView;
        this.f62810 = runnableC10486;
        this.f62812 = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        TextView textView = this.f62811;
        if (looperMyLooper != mainLooper) {
            textView.post(new RunnableC8250(this, drawable));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (!this.f62812.equals(bounds)) {
            this.f62810.m26951();
            this.f62812 = new Rect(bounds);
        } else {
            textView.postInvalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f62811.postDelayed(runnable, j - SystemClock.uptimeMillis());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f62811.removeCallbacks(runnable);
    }
}
