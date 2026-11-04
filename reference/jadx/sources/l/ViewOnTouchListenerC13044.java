package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.۫ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC13044 extends AbstractC11800 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8352 f41742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11999 f41743;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f41743.m30178(this);
        return false;
    }
}
