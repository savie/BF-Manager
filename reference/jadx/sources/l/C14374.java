package l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ܰۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14374 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0205 f45325;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C14374(C0205 c0205) {
        this.f45325 = c0205;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C0205 c0205 = this.f45325;
        if (!c0205.f1387.isInProgress() && motionEvent2.getPointerCount() == 1) {
            c0205.m1612(-f, -f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C0205 c0205 = this.f45325;
        if (c0205.f1377) {
            return true;
        }
        c0205.f1371 = 0;
        c0205.f1381 = 0;
        double d = 536870911;
        c0205.f1376.fling(0, 0, (int) f, (int) (-f2), (int) Math.max(-536870911, ((1.0f - c0205.f1374) * c0205.getWidth()) - c0205.f1389), (int) (-c0205.f1389), (int) (-Math.min(d, (c0205.f1384 - c0205.m1622()) * ((double) c0205.f1374))), (int) Math.min(d, (c0205.m1608() - c0205.f1384) * ((double) c0205.f1374)));
        c0205.postInvalidateOnAnimation();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C0205 c0205 = this.f45325;
        if (c0205.f1380 != null && c0205.f1386 != null) {
            C18104 c18104 = (C18104) c0205.f1375.get(c0205.f1380.m30337(c0205.f1384 + ((double) (motionEvent.getY() / c0205.f1374))));
            if (c18104 != null) {
                int i = c18104.f59258;
                if (c0205.f1386.mo22606(i)) {
                    float fM30343 = (float) ((c0205.f1380.m30343(i) - c0205.f1384) * ((double) c0205.f1374));
                    if (c0205.f1397.m16582(motionEvent.getX(), motionEvent.getY(), c0205.getWidth() / 2.0f, (Math.min(c0205.getHeight(), ((float) (c0205.f1380.m30341(i) * ((double) c0205.f1374))) + fM30343) + Math.max(0.0f, fM30343)) / 2.0f)) {
                        if (c0205.f1373 != null) {
                            c0205.f1373.mo19204(i);
                            return true;
                        }
                    }
                }
            }
            if (c18104 != null) {
                int i2 = c18104.f59258;
                if (!c0205.f1386.mo22606(i2) && c18104.f59253) {
                    c0205.mo1651(i2);
                    return true;
                }
            }
            if (c0205.f1373 != null) {
                c0205.f1373.mo19201();
            }
        } else if (c0205.f1373 != null) {
            c0205.f1373.mo19201();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C0205 c0205 = this.f45325;
        float f = c0205.f1374;
        float f2 = c0205.f1374 > 1.01f ? 1.0f : 2.0f;
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        c0205.f1394 = ValueAnimator.ofFloat(f, f2);
        c0205.f1394.setDuration(180L);
        c0205.f1394.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۘۚ֫
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0205.m1615(this.f13427.f45325, ((Float) valueAnimator.getAnimatedValue()).floatValue(), x, y);
            }
        });
        c0205.f1394.start();
        return true;
    }
}
