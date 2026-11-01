package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B3YF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5217 implements InterfaceC12979 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f18067;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22151 f18068;

    public C5217(C22151 c22151) {
        this.f18068 = c22151;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14398(Drawable drawable) {
        this.f18067 = drawable;
        this.f18068.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14397(int i, int i2, int i3, int i4) {
        C22151 c22151 = this.f18068;
        c22151.mShadowBounds.set(i, i2, i3, i4);
        Rect rect = c22151.mContentPadding;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m14396() {
        return this.f18067;
    }
}
