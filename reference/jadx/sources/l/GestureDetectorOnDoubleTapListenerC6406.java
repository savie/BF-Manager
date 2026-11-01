package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۜ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes2.dex */
public final class GestureDetectorOnDoubleTapListenerC6406 implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17695 f21725;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC6406(C17695 c17695) {
        this.f21725 = c17695;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f21725.f56191.f61734 = 0.0f;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C19107 c19107 = this.f21725.f56191;
        c19107.f61705 = false;
        c19107.m43902(motionEvent);
        return true;
    }
}
