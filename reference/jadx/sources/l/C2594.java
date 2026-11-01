package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۖܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2594 implements Drawable.Callback {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f10183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5417 f10184;

    public C2594(C5417 c5417, Drawable.Callback callback) {
        this.f10184 = c5417;
        this.f10183 = callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f10183.invalidateDrawable(this.f10184);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f10183.scheduleDrawable(this.f10184, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f10183.unscheduleDrawable(this.f10184, runnable);
    }
}
