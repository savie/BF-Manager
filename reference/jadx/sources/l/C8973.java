package l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1JQ */
/* JADX INFO: loaded from: classes3.dex */
public class C8973 extends AbstractC3472 {
    public C8973(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8973(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC3472, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10196();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m10196();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m10196();
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ܰ */
    public final void mo10204() {
        C11795 c11795 = (C11795) getLayoutParams();
        c11795.f39661.m46608(0);
        c11795.f39661.m46620(0);
    }
}
