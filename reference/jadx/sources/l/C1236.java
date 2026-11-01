package l;

import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.֨ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1236 extends LinearLayout {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f5405;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236(C12527 c12527, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f5405 = c12527;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C12527 c12527 = this.f5405;
        if (C12527.m31119(c12527) && c12527.f41920 != null) {
            i = View.MeasureSpec.makeMeasureSpec(c12527.f41920.getWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C12527.m31119(this.f5405);
    }
}
