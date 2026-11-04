package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۤ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AK7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10511 extends C25227 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f33443;

    public C10511(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C10511(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26974(int i) {
        this.f33443 = i;
    }

    @Override // l.C25227, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f33443 > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                int i4 = this.f33443;
                if (size > i4) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                }
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f33443, Integer.MIN_VALUE);
            } else if (mode == 1073741824 && size > (i3 = this.f33443)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }
}
