package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.۟ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes3.dex */
public class C7312 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC19307 f24282;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24283;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Point f24284;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC8724 f24285;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f24286;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f24287;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f24288;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final PointF f24289;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f24290;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f24291;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f24292;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10135 f24293;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24294;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24295;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24296;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f24297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RunnableC8018 f24298;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public WindowManager f24299;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f24300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19508(float f, int i) {
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

    public C7312(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24284 = new Point();
        VelocityTracker.obtain();
        this.f24289 = new PointF();
        m19509(context);
    }

    public C7312(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24284 = new Point();
        VelocityTracker.obtain();
        this.f24289 = new PointF();
        m19509(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19509(Context context) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f24287 = scaledTouchSlop * scaledTouchSlop;
        this.f24295 = false;
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        this.f24299 = windowManager;
        windowManager.getDefaultDisplay().getSize(this.f24284);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f24291 = layoutParams;
        if (i >= 26) {
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

    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RunnableC8018 runnableC8018;
        if (!this.f24295) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            setPressed(true);
            this.f24290 = motionEvent.getX();
            this.f24300 = motionEvent.getY();
            this.f24297 = motionEvent.getRawX();
            this.f24288 = motionEvent.getRawY();
            this.f24283 = false;
            WindowManager.LayoutParams layoutParams = this.f24291;
            this.f24296 = layoutParams.x;
            this.f24292 = layoutParams.y;
            this.f24286 = false;
            if (isLongClickable()) {
                if (this.f24298 == null) {
                    this.f24298 = new RunnableC8018(this);
                }
                this.f24298.m21120();
                this.f24298.m21121();
                postDelayed(this.f24298, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 1) {
            runnableC8018 = this.f24298;
            if (runnableC8018 != null) {
                removeCallbacks(runnableC8018);
            }
            setPressed(false);
            if (this.f24283) {
                this.f24283 = false;
                return true;
            }
            if (!this.f24286 && isClickable() && action == 1) {
                performClick();
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                runnableC8018 = this.f24298;
                if (runnableC8018 != null) {
                    removeCallbacks(runnableC8018);
                }
                setPressed(false);
                if (this.f24283) {
                    this.f24283 = false;
                    return true;
                }
                if (!this.f24286) {
                    performClick();
                    return true;
                }
            }
        } else if (!this.f24286) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = this.f24297 - rawX;
            float f2 = this.f24288 - rawY;
            if (!this.f24283) {
                float fAbs = Math.abs(f);
                float fAbs2 = Math.abs(f2);
                if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f24287) {
                    this.f24283 = true;
                    if (this.f24294) {
                        this.f24297 = rawX;
                        this.f24288 = rawY;
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    RunnableC8018 runnableC8019 = this.f24298;
                    if (runnableC8019 != null) {
                        removeCallbacks(runnableC8019);
                    }
                    InterfaceC8724 interfaceC8724 = this.f24285;
                    if (interfaceC8724 != null) {
                        interfaceC8724.mo2338();
                    }
                }
            }
            if (this.f24283) {
                WindowManager.LayoutParams layoutParams2 = this.f24291;
                float f3 = layoutParams2.x;
                PointF pointF = this.f24289;
                pointF.x = f3;
                pointF.y = layoutParams2.y;
                int i = this.f24296;
                int i2 = this.f24292;
                float f4 = -f;
                float f5 = -f2;
                InterfaceC19307 interfaceC19307 = this.f24282;
                if (interfaceC19307 != null) {
                    interfaceC19307.mo22938(pointF, i, i2, f4, f5);
                    return true;
                }
                float f6 = i + f4;
                pointF.x = f6;
                pointF.y = i2 + f5;
                Point point = this.f24284;
                layoutParams2.x = m19508(f6, point.x - getWidth());
                this.f24291.y = m19508(pointF.y, point.y - getHeight());
                this.f24299.updateViewLayout(this, this.f24291);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m19520() {
        this.f24294 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m19522() {
        return this.f24290;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m19521() {
        return this.f24300;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19519(int[] iArr) {
        WindowManager.LayoutParams layoutParams = this.f24291;
        iArr[0] = layoutParams.x;
        iArr[1] = layoutParams.y;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19517(InterfaceC19307 interfaceC19307) {
        this.f24282 = interfaceC19307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19516(InterfaceC8724 interfaceC8724) {
        this.f24285 = interfaceC8724;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        WindowManager.LayoutParams layoutParams;
        Display defaultDisplay = this.f24299.getDefaultDisplay();
        Point point = this.f24284;
        defaultDisplay.getSize(point);
        if (!this.f24295 || (layoutParams = this.f24291) == null) {
            return;
        }
        if (layoutParams.x > 0) {
            layoutParams.x = point.x - getWidth();
        }
        if (this.f24291.y > point.y - getHeight()) {
            this.f24291.y = point.y - getHeight();
        }
        this.f24299.updateViewLayout(this, this.f24291);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19514() {
        if (this.f24295 || !C6696.m18094(getContext()) || this.f24295) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f24291;
        float f = layoutParams.x;
        Point point = this.f24284;
        layoutParams.x = m19508(f, point.x - getWidth());
        WindowManager.LayoutParams layoutParams2 = this.f24291;
        layoutParams2.y = m19508(layoutParams2.y, point.y - getHeight());
        this.f24299.addView(this, this.f24291);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m19513() {
        boolean z = this.f24295;
        if (z && z) {
            this.f24299.removeView(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19515(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f24291;
        if (layoutParams.x == i && layoutParams.y == i2) {
            return;
        }
        layoutParams.x = i;
        layoutParams.y = i2;
        if (this.f24295) {
            this.f24299.updateViewLayout(this, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24295 = true;
        InterfaceC10135 interfaceC10135 = this.f24293;
        if (interfaceC10135 != null) {
            ((C19520) interfaceC10135).m44578();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24295 = false;
        RunnableC8018 runnableC8018 = this.f24298;
        if (runnableC8018 != null) {
            removeCallbacks(runnableC8018);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19518(C19520 c19520) {
        this.f24293 = c19520;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f24295;
    }
}
