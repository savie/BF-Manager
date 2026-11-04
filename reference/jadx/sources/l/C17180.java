package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O5U4 */
/* JADX INFO: loaded from: classes4.dex */
public class C17180 extends RatingBar {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11959 f55994;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM29935 = this.f55994.m29935();
        if (bitmapM29935 != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM29935.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C17180(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C17180(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9457.m24831(getContext(), this);
        C11959 c11959 = new C11959(this);
        this.f55994 = c11959;
        c11959.mo29937(attributeSet, i);
    }
}
