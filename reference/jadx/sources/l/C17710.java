package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17710 implements Drawable.Callback {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Drawable.Callback f56235;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41256(Drawable.Callback callback) {
        this.f56235 = callback;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback m41255() {
        Drawable.Callback callback = this.f56235;
        this.f56235 = null;
        return callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.f56235;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.f56235;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
