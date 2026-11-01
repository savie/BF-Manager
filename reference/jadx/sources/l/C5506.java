package l;

import android.content.res.Configuration;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: l.ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4VG */
/* JADX INFO: loaded from: classes2.dex */
public class C5506 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0071 c0071M993 = C0071.m993(getContext());
        c0071M993.m996();
        requestLayout();
        c0071M993.m994();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((C2683) view).getClass();
        throw null;
    }
}
