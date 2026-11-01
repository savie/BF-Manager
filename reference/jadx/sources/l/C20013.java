package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Service;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.alipay.sdk.m.y.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.᩶ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes5.dex */
public class C20013 extends FloatingActionButton {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f64072;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f64073;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f64074;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final String f64075;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f64076;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f64077;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f64078;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f64079;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public HandlerC10184 f64080;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f64081;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Point f64082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64083;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f64084;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ValueAnimator f64085;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f64086;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final String f64087;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f64088;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f64089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f64090;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f64091;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f64092;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64093;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public WindowManager f64094;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f64095;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45317(float f, int i) {
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = i;
            if (f > f2) {
                f = f2;
            }
        }
        return (int) f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45320(C20013 c20013) {
        if (c20013.isPressed()) {
            return;
        }
        float width = (c20013.getWidth() / 5.0f) * 4.0f;
        if (c20013.f64095.x == 0) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c20013, "alpha", 0.8f, 0.35f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c20013, "translationX", 0.0f, width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        c20013.f64073 = animatorSet;
        animatorSet.start();
        c20013.f64093 = true;
    }

    public C20013(Service service, String str) {
        super(service);
        Point point = new Point();
        this.f64082 = point;
        this.f64080 = new HandlerC10184(this, new C1694(8));
        this.f64081 = VelocityTracker.obtain();
        this.f64087 = "fbpx:".concat(str);
        this.f64075 = "fbpy:".concat(str);
        WindowManager windowManager = (WindowManager) service.getApplicationContext().getSystemService("window");
        this.f64094 = windowManager;
        C13638.requireNonNull(windowManager);
        windowManager.getDefaultDisplay().getSize(point);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(service);
        float scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f64077 = scaledTouchSlop * scaledTouchSlop;
        this.f64083 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f64086 = viewConfiguration.getScaledMinimumFlingVelocity() * 8;
        setCompatElevation(0.0f);
        setAlpha(0.85f);
        setSize(1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m45326() {
        return this.f64089 || getParent() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20013 m45318(Service service, String str) {
        return new C20013(service, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45324() {
        if (this.f64095 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f64095 = layoutParams;
            if (Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2003;
            }
            layoutParams.format = 1;
            layoutParams.gravity = 8388659;
            layoutParams.flags = 40;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        Point point = this.f64082;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        this.f64078 = ApplicationC0716.f2992.getFloat(this.f64087, 1.0f);
        this.f64084 = ApplicationC0716.f2992.getFloat(this.f64075, Float.NaN);
        m45319(getMeasuredWidth(), getMeasuredHeight());
        this.f64094.addView(this, this.f64095);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45319(int i, int i2) {
        Point point = this.f64082;
        int iMax = Math.max(0, point.x - i);
        int iMax2 = Math.max(0, point.y - i2);
        this.f64095.x = m45317(Math.round(this.f64078 * iMax), iMax);
        this.f64095.y = m45317(Float.isNaN(this.f64084) ? point.y / 3 : Math.round(this.f64084 * iMax2), iMax2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m45322() {
        if (!this.f64076 || this.f64095 == null) {
            return;
        }
        Point point = this.f64082;
        int iMax = Math.max(0, point.x - getWidth());
        int iMax2 = Math.max(0, point.y - getHeight());
        this.f64078 = iMax == 0 ? 0.0f : m45317(this.f64095.x, iMax) / iMax;
        this.f64084 = iMax2 != 0 ? m45317(this.f64095.y, iMax2) / iMax2 : 0.0f;
        ApplicationC0716.f2992.edit().putFloat(this.f64087, this.f64078).putFloat(this.f64075, this.f64084).apply();
        this.f64076 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45325() {
        if (getParent() != null) {
            this.f64094.removeView(this);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void hide() {
        setVisibility(8);
        this.f64080.removeMessages(0);
        m45316();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void show() {
        setVisibility(0);
        m45323();
        float alpha = getAlpha();
        setAlpha(0.0f);
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, alpha).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m45323() {
        AnimatorSet animatorSet = this.f64073;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f64073 = null;
        }
        if (this.f64093 || getTranslationX() != 0.0f) {
            this.f64093 = false;
            setAlpha(0.8f);
            setTranslationX(0.0f);
        }
        HandlerC10184 handlerC10184 = this.f64080;
        handlerC10184.removeMessages(0);
        if (ApplicationC0716.f2992.getBoolean("floating_button_stick_to_edge", true)) {
            handlerC10184.sendEmptyMessageDelayed(0, c.a);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m45316() {
        ValueAnimator valueAnimator = this.f64085;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f64085 = null;
        }
        m45322();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f64091) {
            this.f64091 = false;
            m45319(i3 - i, i4 - i2);
            this.f64094.updateViewLayout(this, this.f64095);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f64089 = true;
        this.f64091 = true;
        m45323();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f64089 = false;
        this.f64080.removeMessages(0);
        AnimatorSet animatorSet = this.f64073;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f64073 = null;
        }
        m45316();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m45316();
        WindowManager windowManager = this.f64094;
        windowManager.getDefaultDisplay().getSize(this.f64082);
        if (this.f64089) {
            m45319(getWidth(), getHeight());
            windowManager.updateViewLayout(this, this.f64095);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a  */
    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f64089) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        VelocityTracker velocityTracker = this.f64081;
        if (action == 0) {
            m45316();
            velocityTracker.clear();
        }
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        try {
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
            if (action != 0) {
                Point point = this.f64082;
                if (action == 1) {
                    boolean z = this.f64079;
                    this.f64079 = false;
                    m45323();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f64090) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        float yVelocity = velocityTracker.getYVelocity();
                        m45316();
                        final int iMax = Math.max(0, point.x - getWidth());
                        final int iMax2 = Math.max(0, point.y - getHeight());
                        int i = this.f64083;
                        float f = -i;
                        float f2 = i;
                        final C15780 c15780 = new C15780(m45317(this.f64095.x, iMax), m45317(this.f64095.y, iMax2), Math.max(f, Math.min(xVelocity, f2)), Math.max(f, Math.min(yVelocity, f2)), iMax, this.f64086);
                        final long[] jArr = {0};
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩷ۜ᩺
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C20013.m45321(this.f67367, jArr, c15780, iMax, iMax2, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat.setDuration(1000L);
                        this.f64085 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    if (action == 1 && !z) {
                        performClick();
                    }
                } else if (action == 2) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float f3 = this.f64092 - rawX2;
                    float f4 = this.f64072 - rawY2;
                    if (!this.f64090) {
                        float fAbs = Math.abs(f3);
                        float fAbs2 = Math.abs(f4);
                        if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f64077) {
                            setPressed(false);
                            this.f64090 = true;
                        }
                    }
                    if (this.f64090) {
                        m45323();
                        this.f64095.x = m45317(this.f64088 - f3, point.x - getWidth());
                        this.f64095.y = m45317(this.f64074 - f4, point.y - getHeight());
                        this.f64076 = true;
                        this.f64094.updateViewLayout(this, this.f64095);
                        return true;
                    }
                } else if (action == 3) {
                    boolean z2 = this.f64079;
                    this.f64079 = false;
                    m45323();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f64090) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity2 = velocityTracker.getXVelocity();
                        float yVelocity2 = velocityTracker.getYVelocity();
                        m45316();
                        final int iMax3 = Math.max(0, point.x - getWidth());
                        final int iMax4 = Math.max(0, point.y - getHeight());
                        int i2 = this.f64083;
                        float f5 = -i2;
                        float f6 = i2;
                        final C15780 c15781 = new C15780(m45317(this.f64095.x, iMax3), m45317(this.f64095.y, iMax4), Math.max(f5, Math.min(xVelocity2, f6)), Math.max(f5, Math.min(yVelocity2, f6)), iMax3, this.f64086);
                        final long[] jArr2 = {0};
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩷ۜ᩺
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C20013.m45321(this.f67367, jArr2, c15781, iMax3, iMax4, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat2.setDuration(1000L);
                        this.f64085 = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.start();
                        return true;
                    }
                    if (action == 1) {
                        performClick();
                    }
                }
                return true;
            }
            boolean z3 = this.f64093 || getTranslationX() != 0.0f;
            this.f64079 = z3;
            setPressed(!z3);
            this.f64092 = motionEvent.getRawX();
            this.f64072 = motionEvent.getRawY();
            this.f64090 = false;
            WindowManager.LayoutParams layoutParams = this.f64095;
            this.f64088 = layoutParams.x;
            this.f64074 = layoutParams.y;
            return true;
        } catch (Throwable th) {
            motionEvent.offsetLocation(-rawX, -rawY);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45321(C20013 c20013, long[] jArr, C15780 c15780, int i, int i2, ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        boolean zM37520 = false;
        float f = (currentPlayTime - jArr[0]) / 1000.0f;
        jArr[0] = currentPlayTime;
        if (f <= 0.0f) {
            return;
        }
        while (f > 0.0f && !zM37520) {
            float fMin = Math.min(f, 0.032f);
            f -= fMin;
            zM37520 = c15780.m37520(i, fMin, i2);
        }
        if (currentPlayTime >= 1000 && !zM37520) {
            c15780.m37519(i);
            zM37520 = true;
        }
        c20013.f64095.x = Math.round(c15780.f51101);
        c20013.f64095.y = Math.round(c15780.f51104);
        c20013.f64076 = true;
        if (c20013.f64089) {
            c20013.f64094.updateViewLayout(c20013, c20013.f64095);
        }
        if (zM37520) {
            c20013.f64085 = null;
            valueAnimator.cancel();
            c20013.m45322();
            c20013.m45323();
        }
    }
}
