package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3YF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1630 implements InterfaceC16545 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f5647;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11324 f5648;

    public C1630(C11324 c11324) {
        this.f5648 = c11324;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5776(Drawable drawable) {
        this.f5647 = drawable;
        this.f5648.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5775(int i, int i2, int i3, int i4) {
        C11324 c11324 = this.f5648;
        c11324.mShadowBounds.set(i, i2, i3, i4);
        Rect rect = c11324.mContentPadding;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m5774() {
        return this.f5647;
    }
}
