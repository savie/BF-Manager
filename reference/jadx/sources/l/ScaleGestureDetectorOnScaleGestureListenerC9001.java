package l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.ۡܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC9001 implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10412 f30791;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC9001(C10412 c10412) {
        this.f30791 = c10412;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f30791.f35597.m43543(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }
}
