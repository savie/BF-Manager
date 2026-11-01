package l;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.۫۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58U6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC12431 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC15253 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC16664 f41479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final GestureDetector f41484;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PointF f41482 = new PointF();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final PointF f41481 = new PointF();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f41480 = 25.0f;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile float f41483 = 3.1415927f;

    public ViewOnTouchListenerC12431(Context context, InterfaceC16664 interfaceC16664) {
        this.f41479 = interfaceC16664;
        this.f41484 = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f41484.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f41482.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f41482.x) / this.f41480;
        float y = motionEvent2.getY();
        PointF pointF = this.f41482;
        float f3 = (y - pointF.y) / this.f41480;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f41483;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f41481;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ((C15959) this.f41479).m37943(this.f41481);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((C15959) this.f41479).f51723.performClick();
    }

    @Override // l.InterfaceC15253
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30899(float f, float[] fArr) {
        this.f41483 = -f;
    }
}
