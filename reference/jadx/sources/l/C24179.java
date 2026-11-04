package l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P1 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C24179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f78318;

    public C24179(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f78318 = new GestureDetector(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54155(MotionEvent motionEvent) {
        return this.f78318.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54153() {
        this.f78318.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54154(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f78318.setOnDoubleTapListener(onDoubleTapListener);
    }
}
