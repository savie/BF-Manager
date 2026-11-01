package l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ۙۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: KAKB */
/* JADX INFO: loaded from: classes2.dex */
public class C4489 extends FrameLayout {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15971;

    public C4489(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Point point = C13932.f45877;
        this.f15971 = Math.min(Math.min(point.x, point.y) - C13932.m33769(64.0f), C13932.m33769(330.0f));
    }

    public C4489(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Point point = C13932.f45877;
        this.f15971 = Math.min(Math.min(point.x, point.y) - C13932.m33769(64.0f), C13932.m33769(330.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!isInEditMode()) {
            i = View.MeasureSpec.makeMeasureSpec(this.f15971, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
