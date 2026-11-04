package l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.᩻᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X16C */
/* JADX INFO: loaded from: classes.dex */
public class C25297 extends View {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11870 f81700;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public WindowManager f81701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Point f81702;

    public C25297(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C25297(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81702 = new Point();
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.f81701 = (WindowManager) context.getApplicationContext().getSystemService("window");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56487(C11870 c11870) {
        this.f81700 = c11870;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C11870 c11870 = this.f81700;
        if (c11870 == null || c11870.getPaddingBottom() == 0 || !z) {
            return;
        }
        Display defaultDisplay = this.f81701.getDefaultDisplay();
        Point point = this.f81702;
        defaultDisplay.getSize(point);
        c11870.m29744(((float) i4) > ((float) point.y) * 0.8f);
    }
}
