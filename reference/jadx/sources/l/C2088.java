package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.֫ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes3.dex */
public class C2088 extends C18495 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f6921;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f6922;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final RunnableC9263 f6923;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f6924;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Paint f6925;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float f6926;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f6927;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f6928;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f6929;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f6930;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23073 f6931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f6932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f6933;

    public C2088(ActivityC3846 activityC3846) {
        super(activityC3846);
        this.f6925 = new Paint();
        this.f6931 = new C23073(3);
        this.f6923 = new RunnableC9263(3, this);
        this.f6927 = -1L;
        float f = activityC3846.getResources().getDisplayMetrics().density;
        this.f6924 = 8.0f * f;
        this.f6926 = f * 48.0f;
        this.f6929 = ViewConfiguration.get(activityC3846).getScaledTouchSlop();
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f6927 = SystemClock.uptimeMillis();
        RunnableC9263 runnableC9263 = this.f6923;
        if (runnableC9263 == null) {
            return;
        }
        removeCallbacks(runnableC9263);
        postDelayed(runnableC9263, 1500L);
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int iComputeVerticalScrollRange = computeVerticalScrollRange();
        int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
        int i = iComputeVerticalScrollRange - iComputeVerticalScrollExtent;
        int width = getWidth();
        int height = getHeight();
        C23073 c23073 = this.f6931;
        if (width > 0 && height > 0 && i > 0 && iComputeVerticalScrollExtent > 0 && (this.f6928 || iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            float fM7184 = m7184(jUptimeMillis);
            if (fM7184 > 0.0f) {
                this.f6922 = true;
                float f = height;
                float fMin = Math.min(this.f6926, f);
                float fMax = i != 0 ? ((f - fMin) * Math.max(0, Math.min(computeVerticalScrollOffset(), i))) / i : 0.0f;
                float f2 = width;
                float f3 = this.f6924;
                c23073.m51985(f2 - f3, fMax, f2, fMax + fMin);
                float scrollX = getScrollX() + width;
                float scrollY = getScrollY();
                Paint paint = this.f6925;
                paint.setColor((((int) (57 * fM7184)) << 24) | 7829367);
                float f4 = scrollX - (f3 * fM7184);
                canvas.drawRect(f4, scrollY, scrollX, f + scrollY, paint);
                int i2 = this.f6928 ? C3296.f10738 : -579373193;
                paint.setColor((i2 & 16777215) | (((int) (((i2 >>> 24) & 255) * fM7184)) << 24));
                float f5 = scrollY + fMax;
                canvas.drawRect(f4, f5, scrollX, f5 + fMin, paint);
                if (this.f6928 || jUptimeMillis - this.f6927 < 1500) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
        }
        this.f6922 = false;
        c23073.m51984();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m7184(long j) {
        if (!this.f6928) {
            long j2 = this.f6927;
            if (j2 < 0) {
                return 0.0f;
            }
            long j3 = j - j2;
            if (j3 < 0 || j3 > 1800) {
                return 0.0f;
            }
            if (j3 > 1500) {
                return 1.0f - ((j3 - 1500) / 300.0f);
            }
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7185() {
        this.f6932 = false;
        this.f6928 = true;
        this.f6921 = this.f6931.f74853 - this.f6933;
        removeCallbacks(this.f6923);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7186(float f) {
        int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        float height = getHeight() - Math.min(this.f6926, getHeight());
        if (iComputeVerticalScrollRange <= 0 || height <= 0.0f) {
            return;
        }
        scrollTo(getScrollX(), Math.round(iComputeVerticalScrollRange * Math.max(0.0f, Math.min((f + this.f6921) / height, 1.0f))));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6928) {
            if (actionMasked == 2) {
                m7186(motionEvent.getY());
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.f6928 = false;
                this.f6927 = SystemClock.uptimeMillis();
                RunnableC9263 runnableC9263 = this.f6923;
                if (runnableC9263 != null) {
                    removeCallbacks(runnableC9263);
                    postDelayed(runnableC9263, 1500L);
                    invalidate();
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        if (actionMasked == 0) {
            this.f6932 = false;
            int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
            int iComputeVerticalScrollRange = computeVerticalScrollRange();
            if (this.f6922 && m7184(SystemClock.uptimeMillis()) > 0.0f) {
                C23073 c23073 = this.f6931;
                if (c23073.f74855 > c23073.f74854 && c23073.f74850 > c23073.f74853 && iComputeVerticalScrollExtent > 0 && iComputeVerticalScrollRange > iComputeVerticalScrollExtent && iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f) {
                    this.f6930 = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f6933 = y;
                    if (c23073.m51988(this.f6930, y)) {
                        m7185();
                        return true;
                    }
                    this.f6932 = c23073.m51987(this.f6930, this.f6933);
                }
            }
        } else if (actionMasked == 1) {
            this.f6932 = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3 || actionMasked == 5) {
                this.f6932 = false;
            }
        } else if (this.f6932) {
            float x = motionEvent.getX() - this.f6930;
            float y2 = motionEvent.getY() - this.f6933;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                this.f6932 = false;
            } else {
                float fAbs = Math.abs(y2);
                float f = this.f6929;
                if (fAbs > f && Math.abs(y2) > Math.abs(x)) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    m7185();
                    m7186(motionEvent.getY());
                    return true;
                }
                if (Math.abs(x) > f) {
                    this.f6932 = false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f6923);
        super.onDetachedFromWindow();
    }
}
