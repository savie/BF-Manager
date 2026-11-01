package l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC14257 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f46670;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46671;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f46672;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9318 f46673;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46674;

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

    public GestureDetectorOnGestureListenerC14257(C9318 c9318, int i) {
        this.f46673 = c9318;
        this.f46671 = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C9318 c9318 = this.f46673;
        c9318.scrollTo(c9318.getScrollX() + ((int) (f + 0.5f)), c9318.getScrollY() + ((int) (f2 + 0.5f)));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        long j = this.f46672;
        C9318 c9318 = this.f46673;
        if (j != 0) {
            long eventTime = motionEvent.getEventTime() - this.f46672;
            if (eventTime >= 40 && eventTime <= 300) {
                int x = this.f46674 - ((int) motionEvent.getX());
                int y = this.f46670 - ((int) motionEvent.getY());
                if ((y * y) + (x * x) < this.f46671) {
                    this.f46672 = 0L;
                    float fM23908 = c9318.m23908();
                    final int scrollX = c9318.getScrollX();
                    final int scrollY = c9318.getScrollY();
                    if (c9318.f31605 == fM23908) {
                        fM23908 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c9318.f31605, fM23908);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩻ۗ۬
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C9318 c9319 = this.f75852.f46673;
                            c9319.f31605 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            c9319.scrollTo((int) (scrollX * animatedFraction), (int) (scrollY * animatedFraction));
                            c9319.postInvalidateOnAnimation();
                        }
                    });
                    valueAnimatorOfFloat.start();
                    return true;
                }
            }
        }
        this.f46672 = motionEvent.getEventTime();
        this.f46674 = (int) motionEvent.getX();
        this.f46670 = (int) motionEvent.getY();
        int width = c9318.getWidth();
        int height = c9318.getHeight();
        int i = (int) ((c9318.f31632 * c9318.f31605) + 0.5f);
        int i2 = (int) ((c9318.f31601 * c9318.f31605) + 0.5f);
        float x2 = (motionEvent.getX() + c9318.getScrollX()) - ((width - i) / 2.0f);
        float y2 = (motionEvent.getY() + c9318.getScrollY()) - ((height - i2) / 2.0f);
        boolean z = x2 < ((float) (-c9318.f31594)) || y2 < ((float) (-c9318.f31594)) || x2 > ((float) (i + c9318.f31594)) || y2 > ((float) (i2 + c9318.f31594));
        C12140 c12140 = new C12140(c9318.f31605, c9318.f31594);
        int i3 = c9318.f31616;
        if (i3 == 0) {
            Iterator it = c9318.f31624.iterator();
            while (it.hasNext()) {
                c12140.m30214((C16373) it.next(), x2);
            }
            Iterator it2 = c9318.f31603.iterator();
            while (it2.hasNext()) {
                c12140.m30214((C16373) it2.next(), y2);
            }
        } else if (i3 == 1) {
            if (c9318.f31623 != null) {
                c12140.m30214(c9318.f31623, x2);
                c12140.m30214(c9318.f31602, y2);
            }
        } else if (i3 == 2 && c9318.f31596 != null) {
            c12140.m30214(c9318.f31596, x2);
            c12140.m30214(c9318.f31608, y2);
        }
        C17078 c17078 = (C17078) c12140.m30213();
        c9318.m23904(c17078);
        c9318.f31619 = c17078;
        c9318.f31595 = (c17078 == null && z) ? false : true;
        c9318.invalidate();
        return true;
    }
}
