package l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P1 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C10614 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f36276;

    public C10614(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f36276 = new GestureDetector(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26793(MotionEvent motionEvent) {
        return this.f36276.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26791() {
        this.f36276.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26792(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f36276.setOnDoubleTapListener(onDoubleTapListener);
    }
}
