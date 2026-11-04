package l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.᩺ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes.dex */
public final class C24072 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f77850;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0205 f77851;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f77852;

    public C24072(C0205 c0205) {
        this.f77851 = c0205;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f77850 = scaleGestureDetector.getFocusX();
        this.f77852 = scaleGestureDetector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX() - this.f77850;
        float focusY = scaleGestureDetector.getFocusY() - this.f77852;
        C0205 c0205 = this.f77851;
        c0205.m1612(focusX, focusY);
        this.f77850 = scaleGestureDetector.getFocusX();
        this.f77852 = scaleGestureDetector.getFocusY();
        C0205.m1615(c0205, scaleGestureDetector.getScaleFactor() * c0205.f1374, this.f77850, this.f77852);
        return true;
    }
}
