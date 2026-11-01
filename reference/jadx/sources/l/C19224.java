package l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.᩵ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X16C */
/* JADX INFO: loaded from: classes4.dex */
public class C19224 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public WindowManager f62108;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7935 f62109;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Point f62110;

    public C19224(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19224(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62110 = new Point();
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.f62108 = (WindowManager) context.getApplicationContext().getSystemService("window");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44152(C7935 c7935) {
        this.f62109 = c7935;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C7935 c7935 = this.f62109;
        if (c7935 == null || c7935.getPaddingBottom() == 0 || !z) {
            return;
        }
        Display defaultDisplay = this.f62108.getDefaultDisplay();
        Point point = this.f62110;
        defaultDisplay.getSize(point);
        c7935.m20963(((float) i4) > ((float) point.y) * 0.8f);
    }
}
