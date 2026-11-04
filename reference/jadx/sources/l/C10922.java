package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.ۤܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10922 extends AbstractC12218 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34574 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f34575;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Drawable f34576;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5703 f34577;

    public C10922(AbstractC5703 abstractC5703) {
        this.f34577 = abstractC5703;
    }

    @Override // l.AbstractC12218
    public final void onDrawOver(Canvas canvas, C25227 c25227, C15529 c15529) {
        if (this.f34576 == null) {
            return;
        }
        int childCount = c25227.getChildCount();
        int width = c25227.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c25227.getChildAt(i);
            if (m27719(c25227, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f34576.setBounds(0, height, width, this.f34575 + height);
                this.f34576.draw(canvas);
            }
        }
    }

    @Override // l.AbstractC12218
    public final void getItemOffsets(Rect rect, View view, C25227 c25227, C15529 c15529) {
        if (m27719(c25227, view)) {
            rect.bottom = this.f34575;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27719(C25227 c25227, View view) {
        AbstractC11800 childViewHolder = c25227.getChildViewHolder(view);
        if (!(childViewHolder instanceof C1228) || !((C1228) childViewHolder).m4465()) {
            return false;
        }
        boolean z = this.f34574;
        int iIndexOfChild = c25227.indexOfChild(view);
        if (iIndexOfChild >= c25227.getChildCount() - 1) {
            return z;
        }
        AbstractC11800 childViewHolder2 = c25227.getChildViewHolder(c25227.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C1228) && ((C1228) childViewHolder2).m4461();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27721(Drawable drawable) {
        if (drawable != null) {
            this.f34575 = drawable.getIntrinsicHeight();
        } else {
            this.f34575 = 0;
        }
        this.f34576 = drawable;
        this.f34577.f19696.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27720(int i) {
        this.f34575 = i;
        this.f34577.f19696.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27722(boolean z) {
        this.f34574 = z;
    }
}
