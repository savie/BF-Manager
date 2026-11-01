package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֡ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0531 extends ListView {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12527 f2281;

    public C0531(C12527 c12527) {
        super(c12527.f41911);
        this.f2281 = c12527;
        setScrollBarDefaultDelayBeforeFade(ViewConfiguration.getScrollDefaultDelay() * 3);
        if (Build.VERSION.SDK_INT >= 23) {
            setScrollIndicators(3);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        C12527 c12527 = this.f2281;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(c12527.f41929.getHeight() - c12527.f41921.getHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C12527.m31119(this.f2281)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }
}
