package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes.dex */
public final class C22993 extends AbstractC21581 {
    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ܰ */
    public final int mo36481() {
        AbstractC5498 abstractC5498 = this.f70033;
        return abstractC5498.getWidth() - abstractC5498.getPaddingRight();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۙ */
    public final int mo36474() {
        return this.f70033.getWidth();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۙ */
    public final void mo36476(int i) {
        this.f70033.offsetChildrenHorizontal(i);
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ᩹ */
    public final int mo36483() {
        return this.f70033.getPaddingLeft();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ܰ */
    public final int mo36482(View view) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        return this.f70033.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c22432).leftMargin + ((ViewGroup.MarginLayoutParams) c22432).rightMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۨ */
    public final int mo36480(View view) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        return this.f70033.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c22432).topMargin + ((ViewGroup.MarginLayoutParams) c22432).bottomMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۙ */
    public final int mo36475(View view) {
        return this.f70033.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).rightMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۖ */
    public final int mo36473(View view) {
        return this.f70033.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).leftMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۚ */
    public final int mo36478(View view) {
        AbstractC5498 abstractC5498 = this.f70033;
        Rect rect = this.f70032;
        abstractC5498.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ᩹ */
    public final int mo36484(View view) {
        AbstractC5498 abstractC5498 = this.f70033;
        Rect rect = this.f70032;
        abstractC5498.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ֨ */
    public final int mo36471() {
        AbstractC5498 abstractC5498 = this.f70033;
        return (abstractC5498.getWidth() - abstractC5498.getPaddingLeft()) - abstractC5498.getPaddingRight();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۨ */
    public final int mo36479() {
        return this.f70033.getPaddingRight();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۖ */
    public final int mo36472() {
        return this.f70033.getWidthMode();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۚ */
    public final int mo36477() {
        return this.f70033.getHeightMode();
    }
}
