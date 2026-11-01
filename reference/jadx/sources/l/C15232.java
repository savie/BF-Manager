package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes4.dex */
public final class C15232 extends AbstractC21581 {
    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo36481() {
        AbstractC5498 abstractC5498 = this.f70033;
        return abstractC5498.getHeight() - abstractC5498.getPaddingBottom();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo36474() {
        return this.f70033.getHeight();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36476(int i) {
        this.f70033.offsetChildrenVertical(i);
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo36483() {
        return this.f70033.getPaddingTop();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo36482(View view) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        return this.f70033.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c22432).topMargin + ((ViewGroup.MarginLayoutParams) c22432).bottomMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo36480(View view) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        return this.f70033.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c22432).leftMargin + ((ViewGroup.MarginLayoutParams) c22432).rightMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo36475(View view) {
        return this.f70033.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).bottomMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo36473(View view) {
        return this.f70033.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).topMargin;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo36478(View view) {
        AbstractC5498 abstractC5498 = this.f70033;
        Rect rect = this.f70032;
        abstractC5498.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo36484(View view) {
        AbstractC5498 abstractC5498 = this.f70033;
        Rect rect = this.f70032;
        abstractC5498.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo36471() {
        AbstractC5498 abstractC5498 = this.f70033;
        return (abstractC5498.getHeight() - abstractC5498.getPaddingTop()) - abstractC5498.getPaddingBottom();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo36479() {
        return this.f70033.getPaddingBottom();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo36472() {
        return this.f70033.getHeightMode();
    }

    @Override // l.AbstractC21581
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo36477() {
        return this.f70033.getWidthMode();
    }
}
