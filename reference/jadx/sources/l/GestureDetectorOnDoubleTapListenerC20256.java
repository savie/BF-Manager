package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩵ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4JY */
/* JADX INFO: loaded from: classes5.dex */
public final class GestureDetectorOnDoubleTapListenerC20256 implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18018 f65043;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC20256(ViewOnTouchListenerC18018 viewOnTouchListenerC18018) {
        this.f65043 = viewOnTouchListenerC18018;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f65043;
        if (viewOnTouchListenerC18018 == null) {
            return false;
        }
        viewOnTouchListenerC18018.m42022();
        this.f65043.getClass();
        this.f65043.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float fM42018 = this.f65043.m42018();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f65043;
            if (fM42018 < 3.0f) {
                viewOnTouchListenerC18018.m42021(3.0f, x, y);
                return true;
            }
            viewOnTouchListenerC18018.m42021(1.0f, x, y);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
