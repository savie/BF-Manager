package l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes5.dex */
public final class GestureDetectorOnGestureListenerC19199 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1300 f62076;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62077;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f62078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62079;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62080;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public GestureDetectorOnGestureListenerC19199(C1300 c1300, int i) {
        this.f62076 = c1300;
        this.f62077 = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C1300 c1300 = this.f62076;
        c1300.scrollTo(c1300.getScrollX() + ((int) (f + 0.5f)), c1300.getScrollY() + ((int) (f2 + 0.5f)));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        long j = this.f62078;
        C1300 c1300 = this.f62076;
        if (j != 0) {
            long eventTime = motionEvent.getEventTime() - this.f62078;
            if (eventTime >= 40 && eventTime <= 300) {
                int x = this.f62080 - ((int) motionEvent.getX());
                int y = this.f62079 - ((int) motionEvent.getY());
                if ((y * y) + (x * x) < this.f62077) {
                    this.f62078 = 0L;
                    float fM4709 = c1300.m4709();
                    final int scrollX = c1300.getScrollX();
                    final int scrollY = c1300.getScrollY();
                    if (c1300.f4683 == fM4709) {
                        fM4709 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1300.f4683, fM4709);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.۟ܽ֫
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C1300 c1301 = this.f26613.f62076;
                            c1301.f4683 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            c1301.scrollTo((int) (scrollX * animatedFraction), (int) (scrollY * animatedFraction));
                            c1301.postInvalidateOnAnimation();
                        }
                    });
                    valueAnimatorOfFloat.start();
                    return true;
                }
            }
        }
        this.f62078 = motionEvent.getEventTime();
        this.f62080 = (int) motionEvent.getX();
        this.f62079 = (int) motionEvent.getY();
        int width = c1300.getWidth();
        int height = c1300.getHeight();
        int i = (int) ((c1300.f4668 * c1300.f4683) + 0.5f);
        int i2 = (int) ((c1300.f4676 * c1300.f4683) + 0.5f);
        float x2 = (motionEvent.getX() + c1300.getScrollX()) - ((width - i) / 2.0f);
        float y2 = (motionEvent.getY() + c1300.getScrollY()) - ((height - i2) / 2.0f);
        boolean z = x2 < ((float) (-c1300.f4673)) || y2 < ((float) (-c1300.f4673)) || x2 > ((float) (i + c1300.f4673)) || y2 > ((float) (i2 + c1300.f4673));
        C4283 c4283 = new C4283(c1300.f4683, c1300.f4673);
        int i3 = c1300.f4680;
        if (i3 == 0) {
            Iterator it = c1300.f4675.iterator();
            while (it.hasNext()) {
                c4283.m13661((C24421) it.next(), x2);
            }
            Iterator it2 = c1300.f4660.iterator();
            while (it2.hasNext()) {
                c4283.m13661((C24421) it2.next(), y2);
            }
        } else if (i3 == 1) {
            if (c1300.f4674 != null) {
                c4283.m13661(c1300.f4674, x2);
                c4283.m13661(c1300.f4659, y2);
            }
        } else if (i3 == 2 && c1300.f4657 != null) {
            c4283.m13661(c1300.f4657, x2);
            c4283.m13661(c1300.f4654, y2);
        }
        C14723 c14723 = (C14723) c4283.m13660();
        c1300.m4719(c14723);
        c1300.f4666 = c14723;
        c1300.f4664 = (c14723 == null && z) ? false : true;
        c1300.invalidate();
        return true;
    }
}
