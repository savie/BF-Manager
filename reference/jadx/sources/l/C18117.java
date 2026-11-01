package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩳܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18117 implements Drawable.Callback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f57931;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC18823 f57932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Rect f57933;

    public C18117(TextView textView, RunnableC18823 runnableC18823, Rect rect) {
        this.f57931 = textView;
        this.f57932 = runnableC18823;
        this.f57933 = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        TextView textView = this.f57931;
        if (looperMyLooper != mainLooper) {
            textView.post(new RunnableC21645(this, drawable));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (!this.f57933.equals(bounds)) {
            this.f57932.m43428();
            this.f57933 = new Rect(bounds);
        } else {
            textView.postInvalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f57931.postDelayed(runnable, j - SystemClock.uptimeMillis());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f57931.removeCallbacks(runnable);
    }
}
