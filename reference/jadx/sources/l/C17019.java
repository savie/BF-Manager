package l;

import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.ܺᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17019 extends LinearLayout {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f55593;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019(C2849 c2849, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f55593 = c2849;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C2849 c2849 = this.f55593;
        if (C2849.m9396(c2849) && c2849.f9415 != null) {
            i = View.MeasureSpec.makeMeasureSpec(c2849.f9415.getWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C2849.m9396(this.f55593);
    }
}
