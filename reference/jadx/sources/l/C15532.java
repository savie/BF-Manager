package l;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I5W3 */
/* JADX INFO: loaded from: classes4.dex */
public class C15532 extends SeekBar {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21881 f50564;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f50564.m48673(canvas);
    }

    public C15532(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C15532(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C17500.m40762(getContext(), this);
        C21881 c21881 = new C21881(this);
        this.f50564 = c21881;
        c21881.mo32902(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f50564.m48675();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f50564.m48674();
    }
}
