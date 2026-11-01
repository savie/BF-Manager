package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۤܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10412 implements InterfaceC19584 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f35596;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18878 f35597;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f35598;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35599;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f35600;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f35601;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final VelocityTracker f35602 = VelocityTracker.obtain();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f35603;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ScaleGestureDetector f35604;

    public C10412(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f35600 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35596 = viewConfiguration.getScaledTouchSlop();
        this.f35604 = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC9001(this));
    }

    @Override // l.InterfaceC19584
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26311() {
        return this.f35604.isInProgress();
    }

    @Override // l.InterfaceC19584
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26310(MotionEvent motionEvent) {
        this.f35604.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        VelocityTracker velocityTracker = this.f35602;
        if (actionMasked == 0) {
            velocityTracker.clear();
            velocityTracker.addMovement(motionEvent);
            this.f35603 = motionEvent.getX();
            this.f35601 = motionEvent.getY();
            this.f35599 = false;
            this.f35598 = 0;
            return;
        }
        if (actionMasked == 1) {
            if (this.f35599) {
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f35600) {
                    ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f35597;
                    motionEvent.getX();
                    motionEvent.getY();
                    viewOnTouchListenerC18878.m43552(-xVelocity, -yVelocity);
                    return;
                }
                return;
            }
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f35598++;
                this.f35599 = false;
                return;
            } else {
                if (actionMasked != 6) {
                    return;
                }
                int i = this.f35598 - 1;
                this.f35598 = i;
                if (i == 0) {
                    this.f35603 = Float.NaN;
                    this.f35601 = Float.NaN;
                    velocityTracker.clear();
                    return;
                }
                return;
            }
        }
        if (this.f35598 == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Float.isNaN(this.f35603) || Float.isNaN(this.f35601)) {
                this.f35603 = x;
                this.f35601 = y;
                velocityTracker.addMovement(motionEvent);
                return;
            }
            float f = x - this.f35603;
            float f2 = y - this.f35601;
            if (!this.f35599) {
                this.f35599 = Math.sqrt((double) ((f2 * f2) + (f * f))) >= ((double) this.f35596);
            }
            if (this.f35599) {
                this.f35597.m43542(f, f2);
                this.f35603 = x;
                this.f35601 = y;
                velocityTracker.addMovement(motionEvent);
            }
        }
    }
}
