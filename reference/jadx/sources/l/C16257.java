package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ܶܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes4.dex */
public class C16257 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f52818;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f52819;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f52820;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f52821;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final PointF f52822;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f52823;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f52824;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f52825;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f52826;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f52827;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC17003 f52828;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52829;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public WindowManager f52830;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC25209 f52831;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f52832;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f52833;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RunnableC11782 f52834;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17749 f52835;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Point f52836;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38576(float f, int i) {
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

    public C16257(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f52836 = new Point();
        VelocityTracker.obtain();
        this.f52822 = new PointF();
        m38577(contextThemeWrapper);
    }

    public C16257(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52836 = new Point();
        VelocityTracker.obtain();
        this.f52822 = new PointF();
        m38577(context);
    }

    public C16257(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52836 = new Point();
        VelocityTracker.obtain();
        this.f52822 = new PointF();
        m38577(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38577(Context context) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f52833 = scaledTouchSlop * scaledTouchSlop;
        this.f52829 = false;
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        this.f52830 = windowManager;
        windowManager.getDefaultDisplay().getSize(this.f52836);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f52827 = layoutParams;
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RunnableC11782 runnableC11782;
        if (!this.f52829) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            setPressed(true);
            this.f52819 = motionEvent.getX();
            this.f52825 = motionEvent.getY();
            this.f52832 = motionEvent.getRawX();
            this.f52826 = motionEvent.getRawY();
            this.f52824 = false;
            WindowManager.LayoutParams layoutParams = this.f52827;
            this.f52818 = layoutParams.x;
            this.f52823 = layoutParams.y;
            this.f52821 = false;
            if (isLongClickable()) {
                if (this.f52834 == null) {
                    this.f52834 = new RunnableC11782(this);
                }
                this.f52834.m29603();
                this.f52834.m29604();
                postDelayed(this.f52834, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 1) {
            runnableC11782 = this.f52834;
            if (runnableC11782 != null) {
                removeCallbacks(runnableC11782);
            }
            setPressed(false);
            if (this.f52824) {
                this.f52824 = false;
                return true;
            }
            if (!this.f52821 && isClickable() && action == 1) {
                performClick();
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                runnableC11782 = this.f52834;
                if (runnableC11782 != null) {
                    removeCallbacks(runnableC11782);
                }
                setPressed(false);
                if (this.f52824) {
                    this.f52824 = false;
                    return true;
                }
                if (!this.f52821) {
                    performClick();
                    return true;
                }
            }
        } else if (!this.f52821) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = this.f52832 - rawX;
            float f2 = this.f52826 - rawY;
            if (!this.f52824) {
                float fAbs = Math.abs(f);
                float fAbs2 = Math.abs(f2);
                if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f52833) {
                    this.f52824 = true;
                    if (this.f52820) {
                        this.f52832 = rawX;
                        this.f52826 = rawY;
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    RunnableC11782 runnableC11783 = this.f52834;
                    if (runnableC11783 != null) {
                        removeCallbacks(runnableC11783);
                    }
                    InterfaceC17003 interfaceC17003 = this.f52828;
                    if (interfaceC17003 != null) {
                        interfaceC17003.mo14636();
                    }
                }
            }
            if (this.f52824) {
                WindowManager.LayoutParams layoutParams2 = this.f52827;
                float f3 = layoutParams2.x;
                PointF pointF = this.f52822;
                pointF.x = f3;
                pointF.y = layoutParams2.y;
                int i = this.f52818;
                int i2 = this.f52823;
                float f4 = -f;
                float f5 = -f2;
                InterfaceC25209 interfaceC25209 = this.f52831;
                if (interfaceC25209 != null) {
                    interfaceC25209.mo19063(pointF, i, i2, f4, f5);
                    return true;
                }
                float f6 = i + f4;
                pointF.x = f6;
                pointF.y = i2 + f5;
                Point point = this.f52836;
                layoutParams2.x = m38576(f6, point.x - getWidth());
                this.f52827.y = m38576(pointF.y, point.y - getHeight());
                this.f52830.updateViewLayout(this, this.f52827);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m38588() {
        this.f52820 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m38589() {
        return this.f52819;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m38587() {
        return this.f52825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38586(int[] iArr) {
        WindowManager.LayoutParams layoutParams = this.f52827;
        iArr[0] = layoutParams.x;
        iArr[1] = layoutParams.y;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38585(InterfaceC25209 interfaceC25209) {
        this.f52831 = interfaceC25209;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38584(InterfaceC17003 interfaceC17003) {
        this.f52828 = interfaceC17003;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        WindowManager.LayoutParams layoutParams;
        Display defaultDisplay = this.f52830.getDefaultDisplay();
        Point point = this.f52836;
        defaultDisplay.getSize(point);
        if (!this.f52829 || (layoutParams = this.f52827) == null) {
            return;
        }
        if (layoutParams.x > 0) {
            layoutParams.x = point.x - getWidth();
        }
        if (this.f52827.y > point.y - getHeight()) {
            this.f52827.y = point.y - getHeight();
        }
        this.f52830.updateViewLayout(this, this.f52827);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38581() {
        if (this.f52829 || !C7756.m21107(getContext()) || this.f52829) {
            return;
        }
        Display defaultDisplay = this.f52830.getDefaultDisplay();
        Point point = this.f52836;
        defaultDisplay.getSize(point);
        WindowManager.LayoutParams layoutParams = this.f52827;
        layoutParams.x = m38576(layoutParams.x, point.x - getWidth());
        WindowManager.LayoutParams layoutParams2 = this.f52827;
        layoutParams2.y = m38576(layoutParams2.y, point.y - getHeight());
        this.f52830.addView(this, this.f52827);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo38590() {
        boolean z = this.f52829;
        if (z && z) {
            this.f52830.removeView(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38582(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52827;
        if (layoutParams.x == i && layoutParams.y == i2) {
            return;
        }
        layoutParams.x = i;
        layoutParams.y = i2;
        if (this.f52829) {
            this.f52830.updateViewLayout(this, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52829 = true;
        InterfaceC17749 interfaceC17749 = this.f52835;
        if (interfaceC17749 != null) {
            ((C9999) interfaceC17749).m25857();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52829 = false;
        RunnableC11782 runnableC11782 = this.f52834;
        if (runnableC11782 != null) {
            removeCallbacks(runnableC11782);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38583(C9999 c9999) {
        this.f52835 = c9999;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f52829;
    }
}
