package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.ۖۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N52K */
/* JADX INFO: loaded from: classes2.dex */
public class C2294 extends ProgressBar {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8171 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC7856 f8172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RunnableC17794 f8173;

    public C2294(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8172 = new RunnableC7856(3, this);
        this.f8173 = new RunnableC17794(1, this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f8172);
        removeCallbacks(this.f8173);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8172);
        removeCallbacks(this.f8173);
    }
}
