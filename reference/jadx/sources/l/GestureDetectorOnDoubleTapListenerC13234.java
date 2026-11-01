package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.۬ܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: R4JY */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnDoubleTapListenerC13234 implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18878 f43988;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC13234(ViewOnTouchListenerC18878 viewOnTouchListenerC18878) {
        this.f43988 = viewOnTouchListenerC18878;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f43988;
        if (viewOnTouchListenerC18878 == null) {
            return false;
        }
        viewOnTouchListenerC18878.m43539();
        this.f43988.getClass();
        this.f43988.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float fM43538 = this.f43988.m43538();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (fM43538 < this.f43988.m43547()) {
                ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f43988;
                viewOnTouchListenerC18878.m43544(viewOnTouchListenerC18878.m43547(), x, y, true);
                return true;
            }
            ViewOnTouchListenerC18878 viewOnTouchListenerC18879 = this.f43988;
            viewOnTouchListenerC18879.m43544(viewOnTouchListenerC18879.m43553(), x, y, true);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
