package l;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩻ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes.dex */
public final class C24962 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17502 f80839;

    public C24962(C17502 c17502) {
        this.f80839 = c17502;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C17502 c17502 = this.f80839;
        int scrollX = (int) (c17502.getScrollX() + f + 0.5f);
        int scrollY = (int) (c17502.getScrollY() + f2 + 0.5f);
        int iM41024 = c17502.m41024();
        int iM41034 = c17502.m41034();
        if (scrollX < 0) {
            if (motionEvent2 != null) {
                C19577.m45178(c17502.f56880, (-f) / c17502.getWidth(), 1.0f - (motionEvent2.getY() / c17502.getHeight()));
                int i = C22666.f73603;
                c17502.postInvalidateOnAnimation();
                if (!c17502.f56872.isFinished()) {
                    c17502.f56872.onRelease();
                }
            }
            scrollX = 0;
        } else if (scrollX > iM41024) {
            if (motionEvent2 != null) {
                C19577.m45178(c17502.f56872, f / c17502.getWidth(), motionEvent2.getY() / c17502.getHeight());
                int i2 = C22666.f73603;
                c17502.postInvalidateOnAnimation();
                if (!c17502.f56880.isFinished()) {
                    c17502.f56880.onRelease();
                }
            }
            scrollX = iM41024;
        }
        if (scrollY < 0) {
            if (motionEvent2 != null) {
                C19577.m45178(c17502.f56871, (-f2) / c17502.getHeight(), motionEvent2.getX() / c17502.getWidth());
                int i3 = C22666.f73603;
                c17502.postInvalidateOnAnimation();
                if (!c17502.f56862.isFinished()) {
                    c17502.f56862.onRelease();
                }
            }
            scrollY = 0;
        } else if (scrollY > iM41034) {
            if (motionEvent2 != null) {
                C19577.m45178(c17502.f56862, f2 / c17502.getHeight(), 1.0f - (motionEvent2.getX() / c17502.getWidth()));
                int i4 = C22666.f73603;
                c17502.postInvalidateOnAnimation();
                if (!c17502.f56871.isFinished()) {
                    c17502.f56871.onRelease();
                }
            }
            scrollY = iM41034;
        }
        c17502.scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C17502 c17502 = this.f80839;
        if (c17502.f56867 == null) {
            return true;
        }
        c17502.f56863.fling(c17502.getScrollX(), c17502.getScrollY(), (int) (-f), (int) (-f2), 0, c17502.m41024(), 0, c17502.m41034());
        c17502.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C17502 c17502 = this.f80839;
        if (c17502.f56867 == null) {
            return true;
        }
        PointF pointF = new PointF(motionEvent.getX() + c17502.getScrollX(), motionEvent.getY() + c17502.getScrollY());
        C17502.m41033(c17502, pointF);
        C5570 c5570 = c17502.f56867;
        C19740 c19740M16510 = c5570.m16510(pointF);
        if (c19740M16510 != null) {
            c5570.f19353 = c19740M16510.f63550;
        } else {
            c5570.f19353 = -1;
        }
        c17502.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC16756 interfaceC16756;
        C17502 c17502 = this.f80839;
        if (c17502.f56867 == null || (interfaceC16756 = c17502.f56883) == null) {
            return;
        }
        PointF pointF = new PointF(motionEvent.getX() + c17502.getScrollX(), motionEvent.getY() + c17502.getScrollY());
        C17502.m41033(c17502, pointF);
        C19740 c19740M16510 = c17502.f56867.m16510(pointF);
        if (C10608.m27079(((C1505) interfaceC16756).f5239, (c19740M16510 == null || c19740M16510.f63557.isEmpty()) ? -1 : c19740M16510.f63550, motionEvent.getX(), motionEvent.getY())) {
            c17502.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        C17502 c17502 = this.f80839;
        if (c17502.f56867 == null) {
            return true;
        }
        float f = 0.5f;
        if (c17502.f56878 >= 0.5f) {
            f = 1.0f;
            if (c17502.f56878 >= 1.0f) {
                f = 0.2f;
            }
        }
        ValueAnimator duration = ValueAnimator.ofFloat(c17502.f56878, f).setDuration(200L);
        final PointF pointF = new PointF();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۧۢᩴ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MotionEvent motionEvent2 = motionEvent;
                float x = motionEvent2.getX();
                C17502 c17503 = this.f36285.f80839;
                float scrollX = x + c17503.getScrollX();
                float y = motionEvent2.getY() + c17503.getScrollY();
                PointF pointF2 = pointF;
                pointF2.set(scrollX, y);
                C17502.m41033(c17503, pointF2);
                c17503.f56878 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c17503.m41020(pointF2);
                c17503.scrollTo(C17502.m41017(c17503, (int) (pointF2.x - motionEvent2.getX())), C17502.m41031(c17503, (int) (pointF2.y - motionEvent2.getY())));
                c17503.invalidate();
            }
        });
        duration.start();
        return true;
    }
}
