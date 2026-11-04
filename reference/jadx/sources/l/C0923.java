package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes3.dex */
public final class C0923 extends AbstractC12218 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f3436 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f3437;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Drawable f3438;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractFragmentC6889 f3439;

    public C0923(AbstractFragmentC6889 abstractFragmentC6889) {
        this.f3439 = abstractFragmentC6889;
    }

    @Override // l.AbstractC12218
    public final void onDrawOver(Canvas canvas, C25227 c25227, C15529 c15529) {
        if (this.f3438 == null) {
            return;
        }
        int childCount = c25227.getChildCount();
        int width = c25227.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c25227.getChildAt(i);
            if (m3728(c25227, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f3438.setBounds(0, height, width, this.f3437 + height);
                this.f3438.draw(canvas);
            }
        }
    }

    @Override // l.AbstractC12218
    public final void getItemOffsets(Rect rect, View view, C25227 c25227, C15529 c15529) {
        if (m3728(c25227, view)) {
            rect.bottom = this.f3437;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m3728(C25227 c25227, View view) {
        AbstractC11800 childViewHolder = c25227.getChildViewHolder(view);
        if (!(childViewHolder instanceof C1228) || !((C1228) childViewHolder).m4465()) {
            return false;
        }
        boolean z = this.f3436;
        int iIndexOfChild = c25227.indexOfChild(view);
        if (iIndexOfChild >= c25227.getChildCount() - 1) {
            return z;
        }
        AbstractC11800 childViewHolder2 = c25227.getChildViewHolder(c25227.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C1228) && ((C1228) childViewHolder2).m4461();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3730(Drawable drawable) {
        if (drawable != null) {
            this.f3437 = drawable.getIntrinsicHeight();
        } else {
            this.f3437 = 0;
        }
        this.f3438 = drawable;
        this.f3439.f22854.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3729(int i) {
        this.f3437 = i;
        this.f3439.f22854.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3731(boolean z) {
        this.f3436 = z;
    }
}
