package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.᩷ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N52K */
/* JADX INFO: loaded from: classes.dex */
public class C21815 extends ProgressBar {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69554 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC3291 f69555;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RunnableC24725 f69556;

    public C21815(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f69555 = new RunnableC3291(1, this);
        this.f69556 = new RunnableC24725(1, this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f69555);
        removeCallbacks(this.f69556);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f69555);
        removeCallbacks(this.f69556);
    }
}
