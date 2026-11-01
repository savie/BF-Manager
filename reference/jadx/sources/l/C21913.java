package l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.᩸᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21913 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f71098;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9214 f71099;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f71100;

    public C21913(C9214 c9214) {
        this.f71099 = c9214;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f71098 = scaleGestureDetector.getFocusX();
        this.f71100 = scaleGestureDetector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX() - this.f71098;
        float focusY = scaleGestureDetector.getFocusY() - this.f71100;
        C9214 c9214 = this.f71099;
        c9214.m23708(focusX, focusY);
        this.f71098 = scaleGestureDetector.getFocusX();
        this.f71100 = scaleGestureDetector.getFocusY();
        C9214.m23712(c9214, scaleGestureDetector.getScaleFactor() * c9214.f31315, this.f71098, this.f71100);
        return true;
    }
}
