package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O5U4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7064 extends RatingBar {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13415 f23718;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM32900 = this.f23718.m32900();
        if (bitmapM32900 != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM32900.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C7064(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C7064(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C17500.m40762(getContext(), this);
        C13415 c13415 = new C13415(this);
        this.f23718 = c13415;
        c13415.mo32902(attributeSet, i);
    }
}
