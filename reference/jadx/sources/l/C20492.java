package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩶᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20492 extends C13435 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public int f66451;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public View f66452;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public View f66453;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public int f66454;

    public C20492(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66451 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46297(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f66453 = viewGroup.getChildAt(0);
        this.f66452 = viewGroup2.getChildAt(0);
        this.f66451 = -1;
        requestLayout();
    }

    @Override // l.C19383, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        View view = this.f66453;
        if (view != null && size > 0) {
            if (this.f66451 != size) {
                this.f66451 = size;
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                View view2 = this.f66452;
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iMax = Math.max(measuredHeight, view2.getMeasuredHeight());
                this.f66454 = iMax;
                this.f66454 = getPaddingBottom() + getPaddingTop() + iMax;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(View.resolveSize(this.f66454, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
