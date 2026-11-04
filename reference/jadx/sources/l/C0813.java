package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0813 extends AbstractC9016 {
    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo3277() {
        AbstractC21169 abstractC21169 = this.f29369;
        return abstractC21169.getHeight() - abstractC21169.getPaddingBottom();
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3267() {
        return this.f29369.getHeight();
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3269(int i) {
        this.f29369.offsetChildrenVertical(i);
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo3273() {
        return this.f29369.getPaddingTop();
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo3278(View view) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        return this.f29369.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c18185).topMargin + ((ViewGroup.MarginLayoutParams) c18185).bottomMargin;
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo3271(View view) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        return this.f29369.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c18185).leftMargin + ((ViewGroup.MarginLayoutParams) c18185).rightMargin;
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3268(View view) {
        return this.f29369.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C18185) view.getLayoutParams())).bottomMargin;
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo3280(View view) {
        return this.f29369.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C18185) view.getLayoutParams())).topMargin;
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo3276(View view) {
        AbstractC21169 abstractC21169 = this.f29369;
        Rect rect = this.f29368;
        abstractC21169.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo3274(View view) {
        AbstractC21169 abstractC21169 = this.f29369;
        Rect rect = this.f29368;
        abstractC21169.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo3272() {
        AbstractC21169 abstractC21169 = this.f29369;
        return (abstractC21169.getHeight() - abstractC21169.getPaddingTop()) - abstractC21169.getPaddingBottom();
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo3270() {
        return this.f29369.getPaddingBottom();
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo3279() {
        return this.f29369.getHeightMode();
    }

    @Override // l.AbstractC9016
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo3275() {
        return this.f29369.getWidthMode();
    }
}
