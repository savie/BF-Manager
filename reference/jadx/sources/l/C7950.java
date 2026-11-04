package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۟ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7950 extends C14019 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public View f26422;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public View f26423;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public int f26424;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public int f26425;

    public C7950(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26425 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21644(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f26423 = viewGroup.getChildAt(0);
        this.f26422 = viewGroup2.getChildAt(0);
        this.f26425 = -1;
        requestLayout();
    }

    @Override // l.C15179, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        View view = this.f26423;
        if (view != null && size > 0) {
            if (this.f26425 != size) {
                this.f26425 = size;
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                View view2 = this.f26422;
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iMax = Math.max(measuredHeight, view2.getMeasuredHeight());
                this.f26424 = iMax;
                this.f26424 = getPaddingBottom() + getPaddingTop() + iMax;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(View.resolveSize(this.f26424, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
