package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩵᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20929 implements Drawable.Callback {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f66967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12724 f66968;

    public C20929(C12724 c12724, Drawable.Callback callback) {
        this.f66968 = c12724;
        this.f66967 = callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f66967.invalidateDrawable(this.f66968);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f66967.scheduleDrawable(this.f66968, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f66967.unscheduleDrawable(this.f66968, runnable);
    }
}
