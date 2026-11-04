package l;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I5W3 */
/* JADX INFO: loaded from: classes4.dex */
public class C16434 extends SeekBar {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23894 f53316;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f53316.m53398(canvas);
    }

    public C16434(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C16434(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9457.m24831(getContext(), this);
        C23894 c23894 = new C23894(this);
        this.f53316 = c23894;
        c23894.mo29937(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f53316.m53400();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f53316.m53399();
    }
}
