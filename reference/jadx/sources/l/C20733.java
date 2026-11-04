package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
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

/* JADX INFO: renamed from: l.᩵ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes5.dex */
public class C20733 extends FloatingActionButton {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66436;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f66437;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public float f66438;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f66439;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f66440;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f66441;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f66442;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ValueAnimator f66443;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f66444;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f66445;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public HandlerC13547 f66446;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String f66447;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f66448;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66449;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Point f66450;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f66451;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f66452;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public WindowManager f66453;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f66454;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f66455;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String f66456;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f66457;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f66458;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f66459;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f66460;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47418(float f, int i) {
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
    public static /* synthetic */ void m47421(C20733 c20733) {
        if (c20733.isPressed()) {
            return;
        }
        float width = (c20733.getWidth() / 5.0f) * 4.0f;
        if (c20733.f66439.x == 0) {
            width = -width;
        }
        float f = c20733.f66445;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c20733, "alpha", 0.8f * f, f * 0.35f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c20733, "translationX", 0.0f, width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        c20733.f66441 = animatorSet;
        animatorSet.start();
        c20733.f66449 = true;
    }

    public C20733(Context context, String str) {
        super(context);
        Point point = new Point();
        this.f66450 = point;
        this.f66445 = 1.0f;
        this.f66446 = new HandlerC13547(this, new C4791(8));
        this.f66460 = VelocityTracker.obtain();
        this.f66447 = "fbpx:".concat(str);
        this.f66456 = "fbpy:".concat(str);
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        this.f66453 = windowManager;
        C17359.requireNonNull(windowManager);
        windowManager.getDefaultDisplay().getSize(point);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f66448 = scaledTouchSlop * scaledTouchSlop;
        this.f66437 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f66438 = viewConfiguration.getScaledMinimumFlingVelocity() * 8;
        setCompatElevation(0.0f);
        setAlpha(0.85f);
        setSize(1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47429() {
        return this.f66451 || getParent() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20733 m47419(Context context, String str) {
        return new C20733(context, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47427(float f) {
        if (f < 0.0f || f > 1.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Opacity must be between 0 and 1");
        }
        AnimatorSet animatorSet = this.f66441;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f66441 = null;
        }
        this.f66445 = f;
        setAlpha((this.f66449 ? 0.35f : 0.8f) * f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47426() {
        if (this.f66439 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f66439 = layoutParams;
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
        Point point = this.f66450;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        this.f66458 = ApplicationC17729.f58258.getFloat(this.f66447, 1.0f);
        this.f66459 = ApplicationC17729.f58258.getFloat(this.f66456, Float.NaN);
        m47420(getMeasuredWidth(), getMeasuredHeight());
        this.f66453.addView(this, this.f66439);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47420(int i, int i2) {
        Point point = this.f66450;
        int iMax = Math.max(0, point.x - i);
        int iMax2 = Math.max(0, point.y - i2);
        this.f66439.x = m47418(Math.round(this.f66458 * iMax), iMax);
        this.f66439.y = m47418(Float.isNaN(this.f66459) ? point.y / 3 : Math.round(this.f66459 * iMax2), iMax2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m47424() {
        if (!this.f66440 || this.f66439 == null) {
            return;
        }
        Point point = this.f66450;
        int iMax = Math.max(0, point.x - getWidth());
        int iMax2 = Math.max(0, point.y - getHeight());
        this.f66458 = iMax == 0 ? 0.0f : m47418(this.f66439.x, iMax) / iMax;
        this.f66459 = iMax2 != 0 ? m47418(this.f66439.y, iMax2) / iMax2 : 0.0f;
        ApplicationC17729.f58258.edit().putFloat(this.f66447, this.f66458).putFloat(this.f66456, this.f66459).apply();
        this.f66440 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47428() {
        if (getParent() != null) {
            this.f66453.removeView(this);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void hide() {
        setVisibility(8);
        this.f66446.removeMessages(0);
        m47425();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void show() {
        setVisibility(0);
        m47423();
        float alpha = getAlpha();
        setAlpha(0.0f);
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, alpha).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47423() {
        AnimatorSet animatorSet = this.f66441;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f66441 = null;
        }
        if (this.f66449 || getTranslationX() != 0.0f) {
            this.f66449 = false;
            setAlpha(this.f66445 * 0.8f);
            setTranslationX(0.0f);
        }
        HandlerC13547 handlerC13547 = this.f66446;
        handlerC13547.removeMessages(0);
        if (ApplicationC17729.f58258.getBoolean("floating_button_stick_to_edge", true)) {
            handlerC13547.sendEmptyMessageDelayed(0, c.a);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m47425() {
        ValueAnimator valueAnimator = this.f66443;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f66443 = null;
        }
        m47424();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f66455) {
            this.f66455 = false;
            m47420(i3 - i, i4 - i2);
            this.f66453.updateViewLayout(this, this.f66439);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f66451 = true;
        this.f66455 = true;
        m47423();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f66451 = false;
        this.f66446.removeMessages(0);
        AnimatorSet animatorSet = this.f66441;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f66441 = null;
        }
        m47425();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m47425();
        WindowManager windowManager = this.f66453;
        windowManager.getDefaultDisplay().getSize(this.f66450);
        if (this.f66451) {
            m47420(getWidth(), getHeight());
            windowManager.updateViewLayout(this, this.f66439);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a  */
    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f66451) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        VelocityTracker velocityTracker = this.f66460;
        if (action == 0) {
            m47425();
            velocityTracker.clear();
        }
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        try {
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
            if (action != 0) {
                Point point = this.f66450;
                if (action == 1) {
                    boolean z = this.f66452;
                    this.f66452 = false;
                    m47423();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f66436) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        float yVelocity = velocityTracker.getYVelocity();
                        m47425();
                        final int iMax = Math.max(0, point.x - getWidth());
                        final int iMax2 = Math.max(0, point.y - getHeight());
                        int i = this.f66437;
                        float f = -i;
                        float f2 = i;
                        final C3579 c3579 = new C3579(m47418(this.f66439.x, iMax), m47418(this.f66439.y, iMax2), Math.max(f, Math.min(xVelocity, f2)), Math.max(f, Math.min(yVelocity, f2)), iMax, this.f66438);
                        final long[] jArr = {0};
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩹ܿ᩻
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C20733.m47422(this.f76863, jArr, c3579, iMax, iMax2, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat.setDuration(1000L);
                        this.f66443 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    if (action == 1 && !z) {
                        performClick();
                    }
                } else if (action == 2) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float f3 = this.f66457 - rawX2;
                    float f4 = this.f66454 - rawY2;
                    if (!this.f66436) {
                        float fAbs = Math.abs(f3);
                        float fAbs2 = Math.abs(f4);
                        if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f66448) {
                            setPressed(false);
                            this.f66436 = true;
                        }
                    }
                    if (this.f66436) {
                        m47423();
                        this.f66439.x = m47418(this.f66444 - f3, point.x - getWidth());
                        this.f66439.y = m47418(this.f66442 - f4, point.y - getHeight());
                        this.f66440 = true;
                        this.f66453.updateViewLayout(this, this.f66439);
                        return true;
                    }
                } else if (action == 3) {
                    boolean z2 = this.f66452;
                    this.f66452 = false;
                    m47423();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f66436) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity2 = velocityTracker.getXVelocity();
                        float yVelocity2 = velocityTracker.getYVelocity();
                        m47425();
                        final int iMax3 = Math.max(0, point.x - getWidth());
                        final int iMax4 = Math.max(0, point.y - getHeight());
                        int i2 = this.f66437;
                        float f5 = -i2;
                        float f6 = i2;
                        final C3579 c35710 = new C3579(m47418(this.f66439.x, iMax3), m47418(this.f66439.y, iMax4), Math.max(f5, Math.min(xVelocity2, f6)), Math.max(f5, Math.min(yVelocity2, f6)), iMax3, this.f66438);
                        final long[] jArr2 = {0};
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩹ܿ᩻
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C20733.m47422(this.f76863, jArr2, c35710, iMax3, iMax4, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat2.setDuration(1000L);
                        this.f66443 = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.start();
                        return true;
                    }
                    if (action == 1) {
                        performClick();
                    }
                }
                return true;
            }
            boolean z3 = this.f66449 || getTranslationX() != 0.0f;
            this.f66452 = z3;
            setPressed(!z3);
            this.f66457 = motionEvent.getRawX();
            this.f66454 = motionEvent.getRawY();
            this.f66436 = false;
            WindowManager.LayoutParams layoutParams = this.f66439;
            this.f66444 = layoutParams.x;
            this.f66442 = layoutParams.y;
            return true;
        } catch (Throwable th) {
            motionEvent.offsetLocation(-rawX, -rawY);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47422(C20733 c20733, long[] jArr, C3579 c3579, int i, int i2, ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        boolean zM11632 = false;
        float f = (currentPlayTime - jArr[0]) / 1000.0f;
        jArr[0] = currentPlayTime;
        if (f <= 0.0f) {
            return;
        }
        while (f > 0.0f && !zM11632) {
            float fMin = Math.min(f, 0.032f);
            f -= fMin;
            zM11632 = c3579.m11632(i, fMin, i2);
        }
        if (currentPlayTime >= 1000 && !zM11632) {
            c3579.m11631(i);
            zM11632 = true;
        }
        c20733.f66439.x = Math.round(c3579.f12259);
        c20733.f66439.y = Math.round(c3579.f12258);
        c20733.f66440 = true;
        if (c20733.f66451) {
            c20733.f66453.updateViewLayout(c20733, c20733.f66439);
        }
        if (zM11632) {
            c20733.f66443 = null;
            valueAnimator.cancel();
            c20733.m47424();
            c20733.m47423();
        }
    }
}
