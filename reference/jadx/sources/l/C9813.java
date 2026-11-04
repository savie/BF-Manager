package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۢۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9813 implements InterfaceC7577 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31608;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31609;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final VelocityTracker f31610 = VelocityTracker.obtain();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f31611;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f31612;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ScaleGestureDetector f31613;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float f31614;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f31615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18018 f31616;

    public C9813(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f31614 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f31612 = viewConfiguration.getScaledTouchSlop();
        this.f31613 = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC18764(this));
    }

    @Override // l.InterfaceC7577
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20718() {
        return this.f31613.isInProgress();
    }

    @Override // l.InterfaceC7577
    /* JADX INFO: renamed from: ۙ */
    public final void mo20717(MotionEvent motionEvent) {
        this.f31613.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        VelocityTracker velocityTracker = this.f31610;
        if (actionMasked == 0) {
            velocityTracker.clear();
            velocityTracker.addMovement(motionEvent);
            this.f31615 = motionEvent.getX();
            this.f31611 = motionEvent.getY();
            this.f31609 = false;
            this.f31608 = 0;
            return;
        }
        if (actionMasked == 1) {
            if (this.f31609) {
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f31614) {
                    ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f31616;
                    motionEvent.getX();
                    motionEvent.getY();
                    viewOnTouchListenerC18018.m42020(-xVelocity, -yVelocity);
                    return;
                }
                return;
            }
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f31608++;
                this.f31609 = false;
                return;
            } else {
                if (actionMasked != 6) {
                    return;
                }
                int i = this.f31608 - 1;
                this.f31608 = i;
                if (i == 0) {
                    this.f31615 = Float.NaN;
                    this.f31611 = Float.NaN;
                    velocityTracker.clear();
                    return;
                }
                return;
            }
        }
        if (this.f31608 == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Float.isNaN(this.f31615) || Float.isNaN(this.f31611)) {
                this.f31615 = x;
                this.f31611 = y;
                velocityTracker.addMovement(motionEvent);
                return;
            }
            float f = x - this.f31615;
            float f2 = y - this.f31611;
            if (!this.f31609) {
                this.f31609 = Math.sqrt((double) ((f2 * f2) + (f * f))) >= ((double) this.f31612);
            }
            if (this.f31609) {
                this.f31616.m42011(f, f2);
                this.f31615 = x;
                this.f31611 = y;
                velocityTracker.addMovement(motionEvent);
            }
        }
    }
}
