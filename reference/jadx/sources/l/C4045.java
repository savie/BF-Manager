package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.ۘܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes3.dex */
public final class C4045 extends AbstractC3236 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractFragmentC21685 f14944;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14945 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f14946;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Drawable f14947;

    public C4045(AbstractFragmentC21685 abstractFragmentC21685) {
        this.f14944 = abstractFragmentC21685;
    }

    @Override // l.AbstractC3236
    public final void onDrawOver(Canvas canvas, C17492 c17492, C16082 c16082) {
        if (this.f14947 == null) {
            return;
        }
        int childCount = c17492.getChildCount();
        int width = c17492.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c17492.getChildAt(i);
            if (m11549(c17492, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f14947.setBounds(0, height, width, this.f14946 + height);
                this.f14947.draw(canvas);
            }
        }
    }

    @Override // l.AbstractC3236
    public final void getItemOffsets(Rect rect, View view, C17492 c17492, C16082 c16082) {
        if (m11549(c17492, view)) {
            rect.bottom = this.f14946;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m11549(C17492 c17492, View view) {
        AbstractC12554 childViewHolder = c17492.getChildViewHolder(view);
        if (!(childViewHolder instanceof C4170) || !((C4170) childViewHolder).m11815()) {
            return false;
        }
        boolean z = this.f14945;
        int iIndexOfChild = c17492.indexOfChild(view);
        if (iIndexOfChild >= c17492.getChildCount() - 1) {
            return z;
        }
        AbstractC12554 childViewHolder2 = c17492.getChildViewHolder(c17492.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C4170) && ((C4170) childViewHolder2).m11811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11551(Drawable drawable) {
        if (drawable != null) {
            this.f14946 = drawable.getIntrinsicHeight();
        } else {
            this.f14946 = 0;
        }
        this.f14947 = drawable;
        this.f14944.f70335.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11550(int i) {
        this.f14946 = i;
        this.f14944.f70335.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11552(boolean z) {
        this.f14945 = z;
    }
}
