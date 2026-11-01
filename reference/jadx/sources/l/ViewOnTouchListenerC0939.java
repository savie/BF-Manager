package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC0939 extends AbstractC12554 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5380 f3743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4647 f3744;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f3744.m12830(this);
        return false;
    }
}
