package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6J6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19525 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f63003;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C19525(C1626 c1626) {
        this.f63003 = c1626;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C1626 c1626 = this.f63003;
        if (!c1626.m5734(c1626.f5622) || !c1626.m5730(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        c1626.performClick();
        return true;
    }
}
