package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩺᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AK7 */
/* JADX INFO: loaded from: classes.dex */
public class C23313 extends C17492 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75585;

    public C23313(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C23313(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51393(int i) {
        this.f75585 = i;
    }

    @Override // l.C17492, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f75585 > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                int i4 = this.f75585;
                if (size > i4) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                }
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f75585, Integer.MIN_VALUE);
            } else if (mode == 1073741824 && size > (i3 = this.f75585)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }
}
