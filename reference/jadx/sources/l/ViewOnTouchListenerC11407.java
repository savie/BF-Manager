package l;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۧۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 58U6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC11407 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC9387 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1713 f35875;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final GestureDetector f35877;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final PointF f35872 = new PointF();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PointF f35874 = new PointF();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float f35873 = 25.0f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile float f35876 = 3.1415927f;

    public ViewOnTouchListenerC11407(Context context, InterfaceC1713 interfaceC1713) {
        this.f35875 = interfaceC1713;
        this.f35877 = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f35877.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f35872.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f35872.x) / this.f35873;
        float y = motionEvent2.getY();
        PointF pointF = this.f35872;
        float f3 = (y - pointF.y) / this.f35873;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f35876;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f35874;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ((C15136) this.f35875).m36413(this.f35874);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((C15136) this.f35875).f49386.performClick();
    }

    @Override // l.InterfaceC9387
    /* JADX INFO: renamed from: ۙ */
    public final void mo24714(float f, float[] fArr) {
        this.f35876 = -f;
    }
}
