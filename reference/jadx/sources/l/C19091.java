package l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19091 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9214 f61682;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C19091(C9214 c9214) {
        this.f61682 = c9214;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C9214 c9214 = this.f61682;
        if (!c9214.f31332.isInProgress() && motionEvent2.getPointerCount() == 1) {
            c9214.m23708(-f, -f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C9214 c9214 = this.f61682;
        if (c9214.f31316) {
            return true;
        }
        c9214.f31317 = 0;
        c9214.f31313 = 0;
        double d = 536870911;
        c9214.f31320.fling(0, 0, (int) f, (int) (-f2), (int) Math.max(-536870911, ((1.0f - c9214.f31315) * c9214.getWidth()) - c9214.f31323), (int) (-c9214.f31323), (int) (-Math.min(d, (c9214.f31306 - c9214.m23717()) * ((double) c9214.f31315))), (int) Math.min(d, (c9214.m23705() - c9214.f31306) * ((double) c9214.f31315)));
        c9214.postInvalidateOnAnimation();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C9214 c9214 = this.f61682;
        if (c9214.f31334 != null && c9214.f31324 != null) {
            C19797 c19797 = (C19797) c9214.f31311.get(c9214.f31334.m51402(c9214.f31306 + ((double) (motionEvent.getY() / c9214.f31315))));
            if (c19797 != null) {
                int i = c19797.f63568;
                if (((C0103) c9214.f31324).m1129(i)) {
                    float fM51410 = (float) ((c9214.f31334.m51410(i) - c9214.f31306) * ((double) c9214.f31315));
                    if (c9214.f31308.m24545(motionEvent.getX(), motionEvent.getY(), c9214.getWidth() / 2.0f, (Math.min(c9214.getHeight(), ((float) (c9214.f31334.m51407(i) * ((double) c9214.f31315))) + fM51410) + Math.max(0.0f, fM51410)) / 2.0f)) {
                        if (c9214.f31322 != null) {
                            c9214.f31322.mo18822(i);
                            return true;
                        }
                    }
                }
            }
            if (c19797 != null) {
                int i2 = c19797.f63568;
                if (!((C0103) c9214.f31324).m1129(i2) && c19797.f63567) {
                    c9214.mo19712(i2);
                    return true;
                }
            }
            if (c9214.f31322 != null) {
                c9214.f31322.mo18819();
            }
        } else if (c9214.f31322 != null) {
            c9214.f31322.mo18819();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C9214 c9214 = this.f61682;
        float f = c9214.f31315;
        float f2 = c9214.f31315 > 1.01f ? 1.0f : 2.0f;
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        c9214.f31329 = ValueAnimator.ofFloat(f, f2);
        c9214.f31329.setDuration(180L);
        c9214.f31329.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ᩳ᩻۬
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9214.m23712(this.f58628.f61682, ((Float) valueAnimator.getAnimatedValue()).floatValue(), x, y);
            }
        });
        c9214.f31329.start();
        return true;
    }
}
