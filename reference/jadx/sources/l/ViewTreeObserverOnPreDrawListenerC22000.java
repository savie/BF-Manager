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

/* JADX INFO: renamed from: l.᩷ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O98K */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC22000 extends C15688 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final int f70964 = C6907.m19160(1.5f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24132 f70965;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f70966;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f70967;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Rect f70968;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f70969;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f70970;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int[] f70971;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Rect f70972;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f70973;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f70974;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f70975;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f70976;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f70977;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f70978;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f70979;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f70980;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final List f70981;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f70982;

    public ViewTreeObserverOnPreDrawListenerC22000(Context context, C24132 c24132, int i) {
        Drawable drawableMutate;
        super(context);
        this.f70971 = new int[2];
        this.f70972 = new Rect();
        Rect rect = new Rect();
        this.f70968 = rect;
        this.f70981 = Collections.singletonList(rect);
        this.f70970 = i;
        this.f70965 = c24132;
        this.f70967 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (i == 0) {
            drawableMutate = C9217.m24392(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(230);
        } else if (i == 1) {
            drawableMutate = C9217.m24392(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else if (i == 2) {
            drawableMutate = C9217.m24392(context.getResources(), R.drawable.MT_Protector, null).mutate();
            drawableMutate.setAlpha(210);
        } else {
            throw new IllegalArgumentException();
        }
        drawableMutate.setColorFilter(new PorterDuffColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN));
        setImageDrawable(drawableMutate);
        PopupWindow popupWindow = new PopupWindow(this);
        this.f70969 = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setClippingEnabled(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        C20323.m46664(popupWindow, 1999);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49732() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f70970;
        C24132 c24132 = this.f70965;
        if (actionMasked == 0) {
            this.f70977 = true;
            c24132.m53970();
            C14540 c14540 = c24132.f78066;
            this.f70974 = false;
            this.f70976 = motionEvent.getRawX();
            this.f70980 = motionEvent.getRawY();
            if (i == 0) {
                float width = (getWidth() / 2.0f) + this.f70973;
                float fM16189 = this.f70966 - (c14540.m16189() / 2.0f);
                this.f70982 = width - this.f70976;
                this.f70979 = fM16189 - this.f70980;
                c24132.f78127 = Math.min(c14540.m16189() + (c24132.m53995() / 2.0f) + c24132.getPaddingTop(), fM16189);
                c24132.f78053 = Math.min((c24132.getHeight() - c24132.getPaddingBottom()) - (c14540.m16189() / 2.0f), Math.max((c24132.getHeight() - c24132.getPaddingBottom()) - c24132.m53995(), fM16189));
                c24132.f78015 = 0;
                c24132.m54031(true);
            } else if (i == 1) {
                float width2 = ((getWidth() * 3) / 4.0f) + this.f70973;
                float fM161810 = this.f70966 - (c14540.m16189() / 2.0f);
                this.f70982 = width2 - this.f70976;
                this.f70979 = fM161810 - this.f70980;
                c24132.f78127 = Math.min(c14540.m16189() + (c24132.m53995() / 2.0f) + c24132.getPaddingTop(), fM161810);
                c24132.f78053 = Math.min((c24132.getHeight() - c24132.getPaddingBottom()) - (c14540.m16189() / 2.0f), Math.max((c24132.getHeight() - c24132.getPaddingBottom()) - c24132.m53995(), fM161810));
                c24132.f78015 = 0;
                c24132.m54051(Math.max(c24132.m53968(), c24132.m53882()), true);
            } else if (i == 2) {
                float width3 = (getWidth() / 4.0f) + this.f70973;
                float fM161811 = this.f70966 - (c14540.m16189() / 2.0f);
                this.f70982 = width3 - this.f70976;
                this.f70979 = fM161811 - this.f70980;
                c24132.f78127 = Math.min(c14540.m16189() + (c24132.m53995() / 2.0f) + c24132.getPaddingTop(), fM161811);
                c24132.f78053 = Math.min((c24132.getHeight() - c24132.getPaddingBottom()) - (c14540.m16189() / 2.0f), Math.max((c24132.getHeight() - c24132.getPaddingBottom()) - c24132.m53995(), fM161811));
                c24132.f78015 = 0;
                c24132.m54051(Math.min(c24132.m53968(), c24132.m53882()), true);
            }
            this.f70982 -= c24132.getPaddingLeft();
            this.f70979 -= c24132.getPaddingTop();
            return true;
        }
        if (actionMasked == 1) {
            c24132.m53969();
            if (i == 0) {
                c24132.m54031(false);
                c24132.m53956(-1);
            } else if (i == 1) {
                c24132.m54051(0, false);
                c24132.m53956(Math.min(c24132.m53968(), c24132.m53882()));
            } else if (i == 2) {
                c24132.m54051(0, false);
                c24132.m53956(Math.max(c24132.m53968(), c24132.m53882()));
            }
            c24132.m54007();
            this.f70977 = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                c24132.m53969();
                if (i == 0) {
                    c24132.m54031(false);
                } else if (i == 1 || i == 2) {
                    c24132.m54051(0, false);
                }
                this.f70977 = false;
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (!this.f70974) {
            int i2 = (int) (rawX - this.f70976);
            int i3 = (int) (rawY - this.f70980);
            float fAbs = Math.abs(i2);
            float f = this.f70967;
            if (fAbs <= f && Math.abs(i3) <= f) {
                return true;
            }
            this.f70974 = true;
        }
        float f2 = this.f70979 + rawY;
        boolean z = c24132.f78015 == 0;
        float f3 = c24132.f78127;
        if (f2 < f3) {
            c24132.f78015 = -C24132.m53860((int) (f3 - f2));
            if (z) {
                c24132.f78133 = SystemClock.uptimeMillis();
            }
            c24132.postInvalidateOnAnimation();
        } else {
            float f4 = c24132.f78053;
            if (f2 > f4) {
                c24132.f78015 = C24132.m53860((int) (f2 - f4));
                if (z) {
                    c24132.f78133 = SystemClock.uptimeMillis();
                }
                c24132.postInvalidateOnAnimation();
            } else {
                c24132.f78015 = 0;
            }
        }
        float fM161812 = c24132.f78066.m16189() / 2.0f;
        float paddingTop = c24132.f78053 - c24132.getPaddingTop();
        float f5 = rawY + this.f70979;
        if (f5 >= fM161812) {
            fM161812 = f5 > paddingTop ? paddingTop : f5;
        }
        if (i == 0) {
            c24132.m54087(rawX + this.f70982, fM161812);
            return true;
        }
        c24132.m53982(rawX + this.f70982, fM161812);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49731(int i, int i2, boolean z) {
        this.f70973 = i;
        this.f70966 = i2;
        this.f70978 = z;
        C24132 c24132 = this.f70965;
        boolean z2 = z && c24132.isAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.f70975;
        if (z2 != (viewTreeObserver != null)) {
            if (z2) {
                ViewTreeObserver viewTreeObserver2 = c24132.getViewTreeObserver();
                this.f70975 = viewTreeObserver2;
                viewTreeObserver2.addOnPreDrawListener(this);
            } else {
                if (viewTreeObserver.isAlive()) {
                    this.f70975.removeOnPreDrawListener(this);
                }
                this.f70975 = null;
            }
        }
        m49730();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m49730();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m49730() {
        int iRound;
        Drawable drawable;
        C24132 c24132 = this.f70965;
        if (c24132.isInEditMode()) {
            return;
        }
        int i = this.f70973;
        int i2 = this.f70966;
        int width = 0;
        boolean z = this.f70978 && c24132.isAttachedToWindow() && c24132.isShown() && c24132.getWindowVisibility() == 0;
        if (z && !c24132.m54056() && !c24132.m53963()) {
            Rect rect = this.f70972;
            if (c24132.getLocalVisibleRect(rect)) {
                int width2 = getWidth();
                if (width2 <= 0 && (drawable = getDrawable()) != null) {
                    width2 = drawable.getIntrinsicWidth();
                }
                if (width2 < 0) {
                    width2 = 0;
                }
                int i3 = this.f70970;
                if (i3 == 1) {
                    iRound = Math.round(width2 * 0.75f);
                } else if (i3 == 2) {
                    iRound = Math.round(width2 * 0.25f);
                } else {
                    iRound = width2 / 2;
                }
                int scrollX = (c24132.getScrollX() + (iRound + i)) - c24132.getPaddingLeft();
                int scrollY = (c24132.getScrollY() + i2) - c24132.getPaddingTop();
                int i4 = rect.left;
                int i5 = f70964;
                if (scrollX < (i4 - i5) - 1 || scrollX >= rect.right + i5 || scrollY < rect.top || scrollY >= rect.bottom + 1) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        PopupWindow popupWindow = this.f70969;
        if (!z) {
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        int[] iArr = this.f70971;
        c24132.getLocationInWindow(iArr);
        int i6 = i + iArr[0];
        int i7 = i2 + iArr[1];
        if (i6 < 0) {
            setTranslationX(i6);
        } else {
            width = c24132.getRootView().getWidth() - getWidth();
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
            popupWindow.showAtLocation(c24132, 8388659, width, i7);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m49733() {
        return this.f70977 && this.f70969.isShowing();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f70968.set(0, 0, getWidth(), getHeight());
            setSystemGestureExclusionRects(this.f70981);
        }
    }
}
