package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩴۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes5.dex */
public class C18601 extends C14369 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22398 f59178;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f59179;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f59180;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f59181;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f59182;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f59183;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Paint f59184;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final RunnableC17895 f59185;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f59186;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f59187;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f59188;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f59189;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f59190;

    public C18601(ActivityC10181 activityC10181) {
        super(activityC10181);
        this.f59184 = new Paint();
        this.f59178 = new C22398(3);
        this.f59185 = new RunnableC17895(0, this);
        this.f59190 = -1L;
        float f = activityC10181.getResources().getDisplayMetrics().density;
        this.f59182 = 8.0f * f;
        this.f59179 = f * 48.0f;
        this.f59180 = ViewConfiguration.get(activityC10181).getScaledTouchSlop();
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f59190 = SystemClock.uptimeMillis();
        RunnableC17895 runnableC17895 = this.f59185;
        if (runnableC17895 == null) {
            return;
        }
        removeCallbacks(runnableC17895);
        postDelayed(runnableC17895, 1500L);
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
        C22398 c22398 = this.f59178;
        if (width > 0 && height > 0 && i > 0 && iComputeVerticalScrollExtent > 0 && (this.f59181 || iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            float fM43009 = m43009(jUptimeMillis);
            if (fM43009 > 0.0f) {
                this.f59183 = true;
                float f = height;
                float fMin = Math.min(this.f59179, f);
                float fMax = i != 0 ? ((f - fMin) * Math.max(0, Math.min(computeVerticalScrollOffset(), i))) / i : 0.0f;
                float f2 = width;
                float f3 = this.f59182;
                c22398.m49669(f2 - f3, fMax, f2, fMax + fMin);
                float scrollX = getScrollX() + width;
                float scrollY = getScrollY();
                Paint paint = this.f59184;
                paint.setColor((((int) (57 * fM43009)) << 24) | 7829367);
                float f4 = scrollX - (f3 * fM43009);
                canvas.drawRect(f4, scrollY, scrollX, f + scrollY, paint);
                int i2 = this.f59181 ? C20368.f65970 : -579373193;
                paint.setColor((i2 & 16777215) | (((int) (((i2 >>> 24) & 255) * fM43009)) << 24));
                float f5 = scrollY + fMax;
                canvas.drawRect(f4, f5, scrollX, f5 + fMin, paint);
                if (this.f59181 || jUptimeMillis - this.f59190 < 1500) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
        }
        this.f59183 = false;
        c22398.m49668();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m43009(long j) {
        if (!this.f59181) {
            long j2 = this.f59190;
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
    private void m43010() {
        this.f59188 = false;
        this.f59181 = true;
        this.f59187 = this.f59178.f73107 - this.f59189;
        removeCallbacks(this.f59185);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43011(float f) {
        int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        float height = getHeight() - Math.min(this.f59179, getHeight());
        if (iComputeVerticalScrollRange <= 0 || height <= 0.0f) {
            return;
        }
        scrollTo(getScrollX(), Math.round(iComputeVerticalScrollRange * Math.max(0.0f, Math.min((f + this.f59187) / height, 1.0f))));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f59181) {
            if (actionMasked == 2) {
                m43011(motionEvent.getY());
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.f59181 = false;
                this.f59190 = SystemClock.uptimeMillis();
                RunnableC17895 runnableC17895 = this.f59185;
                if (runnableC17895 != null) {
                    removeCallbacks(runnableC17895);
                    postDelayed(runnableC17895, 1500L);
                    invalidate();
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        if (actionMasked == 0) {
            this.f59188 = false;
            int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
            int iComputeVerticalScrollRange = computeVerticalScrollRange();
            if (this.f59183 && m43009(SystemClock.uptimeMillis()) > 0.0f) {
                C22398 c22398 = this.f59178;
                if (c22398.f73105 > c22398.f73109 && c22398.f73106 > c22398.f73107 && iComputeVerticalScrollExtent > 0 && iComputeVerticalScrollRange > iComputeVerticalScrollExtent && iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f) {
                    this.f59186 = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f59189 = y;
                    if (c22398.m49672(this.f59186, y)) {
                        m43010();
                        return true;
                    }
                    this.f59188 = c22398.m49671(this.f59186, this.f59189);
                }
            }
        } else if (actionMasked == 1) {
            this.f59188 = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3 || actionMasked == 5) {
                this.f59188 = false;
            }
        } else if (this.f59188) {
            float x = motionEvent.getX() - this.f59186;
            float y2 = motionEvent.getY() - this.f59189;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                this.f59188 = false;
            } else {
                float fAbs = Math.abs(y2);
                float f = this.f59180;
                if (fAbs > f && Math.abs(y2) > Math.abs(x)) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    m43010();
                    m43011(motionEvent.getY());
                    return true;
                }
                if (Math.abs(x) > f) {
                    this.f59188 = false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f59185);
        super.onDetachedFromWindow();
    }
}
