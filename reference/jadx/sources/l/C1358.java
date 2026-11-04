package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֨ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1358 extends ListView {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2849 f4843;

    public C1358(C2849 c2849) {
        super(c2849.f9406);
        this.f4843 = c2849;
        setScrollBarDefaultDelayBeforeFade(ViewConfiguration.getScrollDefaultDelay() * 3);
        if (Build.VERSION.SDK_INT >= 23) {
            setScrollIndicators(3);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        C2849 c2849 = this.f4843;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(c2849.f9384.getHeight() - c2849.f9385.getHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C2849.m9396(this.f4843)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }
}
