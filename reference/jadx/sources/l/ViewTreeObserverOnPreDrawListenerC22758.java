package l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O98K */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC22758 extends C2830 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final int f74116 = C13932.m33769(1.5f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f74117;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f74118;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f74119;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f74120;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Rect f74121;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f74122;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f74123;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f74124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74125;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f74126;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f74127;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final List f74128;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f74129;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f74130;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6111 f74131;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f74132;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f74133;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Rect f74134;

    public ViewTreeObserverOnPreDrawListenerC22758(Context context, C6111 c6111, int i) {
        Drawable drawableMutate;
        super(context);
        this.f74118 = new int[2];
        this.f74134 = new Rect();
        Rect rect = new Rect();
        this.f74121 = rect;
        this.f74128 = Collections.singletonList(rect);
        this.f74127 = i;
        this.f74131 = c6111;
        this.f74129 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (i == 0) {
            drawableMutate = C16631.m39101(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(230);
        } else if (i == 1) {
            drawableMutate = C16631.m39101(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else if (i == 2) {
            drawableMutate = C16631.m39101(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else {
            throw new IllegalArgumentException();
        }
        drawableMutate.setColorFilter(new PorterDuffColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN));
        setImageDrawable(drawableMutate);
        PopupWindow popupWindow = new PopupWindow(this);
        this.f74124 = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        C10057.m25464(popupWindow, 1999);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50425() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f74127;
        C6111 c6111 = this.f74131;
        if (actionMasked == 0) {
            this.f74117 = true;
            c6111.m16915();
            C1590 c1590 = c6111.f20794;
            this.f74126 = false;
            this.f74130 = motionEvent.getRawX();
            this.f74133 = motionEvent.getRawY();
            if (i == 0) {
                float width = (getWidth() / 2.0f) + this.f74123;
                float fM17870 = this.f74125 - (c1590.m17870() / 2.0f);
                this.f74119 = width - this.f74130;
                this.f74122 = fM17870 - this.f74133;
                c6111.f20749 = Math.min(c1590.m17870() + (c6111.m17062() / 2.0f) + c6111.getPaddingTop(), fM17870);
                c6111.f20757 = Math.min((c6111.getHeight() - c6111.getPaddingBottom()) - (c1590.m17870() / 2.0f), Math.max((c6111.getHeight() - c6111.getPaddingBottom()) - c6111.m17062(), fM17870));
                c6111.f20766 = 0;
                c6111.m17007(true);
            } else if (i == 1) {
                float width2 = ((getWidth() * 3) / 4.0f) + this.f74123;
                float fM17871 = this.f74125 - (c1590.m17870() / 2.0f);
                this.f74119 = width2 - this.f74130;
                this.f74122 = fM17871 - this.f74133;
                c6111.f20749 = Math.min(c1590.m17870() + (c6111.m17062() / 2.0f) + c6111.getPaddingTop(), fM17871);
                c6111.f20757 = Math.min((c6111.getHeight() - c6111.getPaddingBottom()) - (c1590.m17870() / 2.0f), Math.max((c6111.getHeight() - c6111.getPaddingBottom()) - c6111.m17062(), fM17871));
                c6111.f20766 = 0;
                c6111.m16906(Math.max(c6111.m16916(), c6111.m17020()), true);
            } else if (i == 2) {
                float width3 = (getWidth() / 4.0f) + this.f74123;
                float fM17872 = this.f74125 - (c1590.m17870() / 2.0f);
                this.f74119 = width3 - this.f74130;
                this.f74122 = fM17872 - this.f74133;
                c6111.f20749 = Math.min(c1590.m17870() + (c6111.m17062() / 2.0f) + c6111.getPaddingTop(), fM17872);
                c6111.f20757 = Math.min((c6111.getHeight() - c6111.getPaddingBottom()) - (c1590.m17870() / 2.0f), Math.max((c6111.getHeight() - c6111.getPaddingBottom()) - c6111.m17062(), fM17872));
                c6111.f20766 = 0;
                c6111.m16906(Math.min(c6111.m16916(), c6111.m17020()), true);
            }
            this.f74119 -= c6111.getPaddingLeft();
            this.f74122 -= c6111.getPaddingTop();
            return true;
        }
        if (actionMasked == 1) {
            c6111.m16808();
            if (i == 0) {
                c6111.m17007(false);
                c6111.m16946(-1);
            } else if (i == 1) {
                c6111.m16906(0, false);
                c6111.m16946(Math.min(c6111.m16916(), c6111.m17020()));
            } else if (i == 2) {
                c6111.m16906(0, false);
                c6111.m16946(Math.max(c6111.m16916(), c6111.m17020()));
            }
            c6111.m16819();
            this.f74117 = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                c6111.m16808();
                if (i == 0) {
                    c6111.m17007(false);
                } else if (i == 1 || i == 2) {
                    c6111.m16906(0, false);
                }
                this.f74117 = false;
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (!this.f74126) {
            int i2 = (int) (rawX - this.f74130);
            int i3 = (int) (rawY - this.f74133);
            float fAbs = Math.abs(i2);
            float f = this.f74129;
            if (fAbs <= f && Math.abs(i3) <= f) {
                return true;
            }
            this.f74126 = true;
        }
        float f2 = this.f74122 + rawY;
        boolean z = c6111.f20766 == 0;
        float f3 = c6111.f20749;
        if (f2 < f3) {
            c6111.f20766 = -C6111.m16701((int) (f3 - f2));
            if (z) {
                c6111.f20849 = SystemClock.uptimeMillis();
            }
            c6111.postInvalidateOnAnimation();
        } else {
            float f4 = c6111.f20757;
            if (f2 > f4) {
                c6111.f20766 = C6111.m16701((int) (f2 - f4));
                if (z) {
                    c6111.f20849 = SystemClock.uptimeMillis();
                }
                c6111.postInvalidateOnAnimation();
            } else {
                c6111.f20766 = 0;
            }
        }
        float fM17873 = c6111.f20794.m17870() / 2.0f;
        float paddingTop = c6111.f20757 - c6111.getPaddingTop();
        float f5 = rawY + this.f74122;
        if (f5 >= fM17873) {
            fM17873 = f5 > paddingTop ? paddingTop : f5;
        }
        if (i == 0) {
            c6111.m16822(rawX + this.f74119, fM17873);
            return true;
        }
        c6111.m16961(rawX + this.f74119, fM17873);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50424(int i, int i2, boolean z) {
        this.f74123 = i;
        this.f74125 = i2;
        this.f74132 = z;
        C6111 c6111 = this.f74131;
        boolean z2 = z && c6111.isAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.f74120;
        if (z2 != (viewTreeObserver != null)) {
            if (z2) {
                ViewTreeObserver viewTreeObserver2 = c6111.getViewTreeObserver();
                this.f74120 = viewTreeObserver2;
                viewTreeObserver2.addOnPreDrawListener(this);
            } else {
                if (viewTreeObserver.isAlive()) {
                    this.f74120.removeOnPreDrawListener(this);
                }
                this.f74120 = null;
            }
        }
        m50422();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m50422();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m50422() {
        int iRound;
        Drawable drawable;
        int i = this.f74123;
        int i2 = this.f74125;
        boolean z = this.f74132;
        int width = 0;
        C6111 c6111 = this.f74131;
        boolean z2 = z && c6111.isAttachedToWindow() && c6111.isShown() && c6111.getWindowVisibility() == 0;
        if (z2 && !c6111.m16945() && !c6111.m16918()) {
            Rect rect = this.f74134;
            if (c6111.getLocalVisibleRect(rect)) {
                int width2 = getWidth();
                if (width2 <= 0 && (drawable = getDrawable()) != null) {
                    width2 = drawable.getIntrinsicWidth();
                }
                if (width2 < 0) {
                    width2 = 0;
                }
                int i3 = this.f74127;
                if (i3 == 1) {
                    iRound = Math.round(width2 * 0.75f);
                } else if (i3 == 2) {
                    iRound = Math.round(width2 * 0.25f);
                } else {
                    iRound = width2 / 2;
                }
                int scrollX = (c6111.getScrollX() + (iRound + i)) - c6111.getPaddingLeft();
                int scrollY = (c6111.getScrollY() + i2) - c6111.getPaddingTop();
                int i4 = rect.left;
                int i5 = f74116;
                if (scrollX < (i4 - i5) - 1 || scrollX >= rect.right + i5 || scrollY < rect.top || scrollY >= rect.bottom + 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        PopupWindow popupWindow = this.f74124;
        if (!z2) {
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        int[] iArr = this.f74118;
        c6111.getLocationInWindow(iArr);
        int i6 = i + iArr[0];
        int i7 = i2 + iArr[1];
        if (i6 < 0) {
            setTranslationX(i6);
        } else {
            width = c6111.getRootView().getWidth() - getWidth();
            if (i6 > width) {
                setTranslationX(i6 - width);
            } else {
                setTranslationX(0.0f);
                width = i6;
            }
        }
        if (popupWindow.isShowing()) {
            popupWindow.update(width, i7, -1, -1);
        } else {
            popupWindow.showAtLocation(c6111, 8388659, width, i7);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m50423() {
        return this.f74117 && this.f74124.isShowing();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f74121.set(0, 0, getWidth(), getHeight());
            setSystemGestureExclusionRects(this.f74128);
        }
    }
}
