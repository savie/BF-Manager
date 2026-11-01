package l;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩹۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes.dex */
public final class C22280 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13108 f72819;

    public C22280(C13108 c13108) {
        this.f72819 = c13108;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C13108 c13108 = this.f72819;
        int scrollX = (int) (c13108.getScrollX() + f + 0.5f);
        int scrollY = (int) (c13108.getScrollY() + f2 + 0.5f);
        int iM32403 = c13108.m32403();
        int iM32390 = c13108.m32390();
        if (scrollX < 0) {
            if (motionEvent2 != null) {
                C0883.m3557(c13108.f43669, (-f) / c13108.getWidth(), 1.0f - (motionEvent2.getY() / c13108.getHeight()));
                int i = C5031.f17539;
                c13108.postInvalidateOnAnimation();
                if (!c13108.f43658.isFinished()) {
                    c13108.f43658.onRelease();
                }
            }
            scrollX = 0;
        } else if (scrollX > iM32403) {
            if (motionEvent2 != null) {
                C0883.m3557(c13108.f43658, f / c13108.getWidth(), motionEvent2.getY() / c13108.getHeight());
                int i2 = C5031.f17539;
                c13108.postInvalidateOnAnimation();
                if (!c13108.f43669.isFinished()) {
                    c13108.f43669.onRelease();
                }
            }
            scrollX = iM32403;
        }
        if (scrollY < 0) {
            if (motionEvent2 != null) {
                C0883.m3557(c13108.f43673, (-f2) / c13108.getHeight(), motionEvent2.getX() / c13108.getWidth());
                int i3 = C5031.f17539;
                c13108.postInvalidateOnAnimation();
                if (!c13108.f43668.isFinished()) {
                    c13108.f43668.onRelease();
                }
            }
            scrollY = 0;
        } else if (scrollY > iM32390) {
            if (motionEvent2 != null) {
                C0883.m3557(c13108.f43668, f2 / c13108.getHeight(), 1.0f - (motionEvent2.getX() / c13108.getWidth()));
                int i4 = C5031.f17539;
                c13108.postInvalidateOnAnimation();
                if (!c13108.f43673.isFinished()) {
                    c13108.f43673.onRelease();
                }
            }
            scrollY = iM32390;
        }
        c13108.scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C13108 c13108 = this.f72819;
        if (c13108.f43664 == null) {
            return true;
        }
        c13108.f43661.fling(c13108.getScrollX(), c13108.getScrollY(), (int) (-f), (int) (-f2), 0, c13108.m32403(), 0, c13108.m32390());
        c13108.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C13108 c13108 = this.f72819;
        if (c13108.f43664 == null) {
            return true;
        }
        PointF pointF = new PointF(motionEvent.getX() + c13108.getScrollX(), motionEvent.getY() + c13108.getScrollY());
        C13108.m32408(c13108, pointF);
        C11697 c11697 = c13108.f43664;
        C3353 c3353M29209 = c11697.m29209(pointF);
        if (c3353M29209 != null) {
            c11697.f39324 = c3353M29209.f12423;
        } else {
            c11697.f39324 = -1;
        }
        c13108.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC1112 interfaceC1112;
        C13108 c13108 = this.f72819;
        if (c13108.f43664 == null || (interfaceC1112 = c13108.f43665) == null) {
            return;
        }
        PointF pointF = new PointF(motionEvent.getX() + c13108.getScrollX(), motionEvent.getY() + c13108.getScrollY());
        C13108.m32408(c13108, pointF);
        C3353 c3353M29209 = c13108.f43664.m29209(pointF);
        if (C14895.m35610(((C13484) interfaceC1112).f44569, (c3353M29209 == null || c3353M29209.f12405.isEmpty()) ? -1 : c3353M29209.f12423, motionEvent.getX(), motionEvent.getY())) {
            c13108.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        C13108 c13108 = this.f72819;
        if (c13108.f43664 == null) {
            return true;
        }
        float f = 0.5f;
        if (c13108.f43671 >= 0.5f) {
            f = 1.0f;
            if (c13108.f43671 >= 1.0f) {
                f = 0.2f;
            }
        }
        ValueAnimator duration = ValueAnimator.ofFloat(c13108.f43671, f).setDuration(200L);
        final PointF pointF = new PointF();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۚ۫ۚ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MotionEvent motionEvent2 = motionEvent;
                float x = motionEvent2.getX();
                C13108 c13109 = this.f18473.f72819;
                float scrollX = x + c13109.getScrollX();
                float y = motionEvent2.getY() + c13109.getScrollY();
                PointF pointF2 = pointF;
                pointF2.set(scrollX, y);
                C13108.m32408(c13109, pointF2);
                c13109.f43671 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c13109.m32397(pointF2);
                c13109.scrollTo(C13108.m32394(c13109, (int) (pointF2.x - motionEvent2.getX())), C13108.m32406(c13109, (int) (pointF2.y - motionEvent2.getY())));
                c13109.invalidate();
            }
        });
        duration.start();
        return true;
    }
}
