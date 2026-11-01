package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۛۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public class C6018 extends ViewGroup implements InterfaceC4697, InterfaceC3556, InterfaceC2145 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20452 = 0;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f20453 = {R.attr.enabled};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Animation f20454;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f20455;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f20456;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f20457;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f20458;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f20459;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f20460;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9908 f20461;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15191 f20462;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int[] f20463;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f20464;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public Animation f20465;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public View f20466;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f20467;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f20468;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20469;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f20470;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Animation f20471;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20472;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16602 f20473;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final DecelerateInterpolator f20474;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C8135 f20475;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f20476;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Animation f20477;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20478;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f20479;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Animation f20480;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f20481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Animation f20482;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f20483;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Animation.AnimationListener f20484;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C13871 f20485;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f20486;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20487;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16338() {
        this.f20462.clearAnimation();
        this.f20475.stop();
        this.f20462.setVisibility(8);
        this.f20462.getBackground().setAlpha(255);
        this.f20475.setAlpha(255);
        m16339(this.f20459 - this.f20487);
        this.f20487 = this.f20462.getTop();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m16338();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            m16330(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C17307(super.onSaveInstanceState(), this.f20479);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C17307 c17307 = (C17307) parcelable;
        super.onRestoreInstanceState(c17307.getSuperState());
        m16330(c17307.f55087, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m16338();
    }

    public C6018(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20479 = false;
        this.f20468 = -1.0f;
        this.f20486 = new int[2];
        this.f20463 = new int[2];
        this.f20455 = new int[2];
        this.f20476 = -1;
        this.f20469 = -1;
        this.f20484 = new AnimationAnimationListenerC8841(this);
        this.f20477 = new C20130(this);
        this.f20471 = new C0373(this);
        this.f20483 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f20470 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f20474 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.f20478 = i;
        this.f20462 = new C15191(getContext());
        C8135 c8135 = new C8135(getContext());
        this.f20475 = c8135;
        c8135.m21439();
        this.f20462.setImageDrawable(this.f20475);
        this.f20462.setVisibility(8);
        addView(this.f20462);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f20481 = i2;
        this.f20468 = i2;
        this.f20485 = new C13871();
        this.f20461 = new C9908(this);
        setNestedScrollingEnabled(true);
        int i3 = -i;
        this.f20487 = i3;
        this.f20459 = i3;
        m16331(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20453);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f20469;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16334(InterfaceC16602 interfaceC16602) {
        this.f20473 = interfaceC16602;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16335(boolean z) {
        m16330(z, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16330(boolean z, boolean z2) {
        if (z && this.f20479 != z) {
            this.f20479 = z;
            m16339((this.f20481 + this.f20459) - this.f20487);
            this.f20472 = z2;
            this.f20462.setVisibility(0);
            this.f20475.setAlpha(255);
            C10252 c10252 = new C10252(this);
            this.f20480 = c10252;
            c10252.setDuration(this.f20470);
            Animation.AnimationListener animationListener = this.f20484;
            if (animationListener != null) {
                this.f20462.m36410(animationListener);
            }
            this.f20462.clearAnimation();
            this.f20462.startAnimation(this.f20480);
            return;
        }
        m16327(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16327(boolean z, boolean z2) {
        if (this.f20479 != z) {
            this.f20472 = z2;
            m16325();
            this.f20479 = z;
            Animation.AnimationListener animationListener = this.f20484;
            if (!z) {
                m16333(animationListener);
                return;
            }
            this.f20456 = this.f20487;
            Animation animation = this.f20477;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f20474);
            if (animationListener != null) {
                this.f20462.m36410(animationListener);
            }
            this.f20462.clearAnimation();
            this.f20462.startAnimation(animation);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16333(Animation.AnimationListener animationListener) {
        C7429 c7429 = new C7429(this);
        this.f20465 = c7429;
        c7429.setDuration(150L);
        this.f20462.m36410(animationListener);
        this.f20462.clearAnimation();
        this.f20462.startAnimation(this.f20465);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16332(int i) {
        this.f20462.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16336(int... iArr) {
        m16325();
        this.f20475.m21443(iArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16340() {
        return this.f20479;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m16325() {
        if (this.f20466 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f20462)) {
                    this.f20466 = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f20466 == null) {
            m16325();
        }
        View view = this.f20466;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f20462.getMeasuredWidth();
        int measuredHeight2 = this.f20462.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f20487;
        this.f20462.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f20466 == null) {
            m16325();
        }
        View view = this.f20466;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        int i3 = this.f20478;
        this.f20462.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.f20469 = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f20462) {
                this.f20469 = i4;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16337() {
        View view = this.f20466;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m16325();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m16337() && !this.f20479 && !this.f20457) {
            if (actionMasked == 0) {
                m16339(this.f20459 - this.f20462.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.f20476 = pointerId;
                this.f20460 = false;
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex2 >= 0) {
                    this.f20467 = motionEvent.getY(iFindPointerIndex2);
                    return this.f20460;
                }
            } else {
                if (actionMasked == 1) {
                    this.f20460 = false;
                    this.f20476 = -1;
                } else if (actionMasked == 2) {
                    int i = this.f20476;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        m16326(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f20460 = false;
                    this.f20476 = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f20476) {
                        this.f20476 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f20460;
            }
        }
        return false;
    }

    @Override // l.InterfaceC4697
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f20461.m25099(i, i2, i3, i4, this.f20463, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f20463[1] : i7;
        if (i8 >= 0 || m16337()) {
            return;
        }
        float fAbs = this.f20464 + Math.abs(i8);
        this.f20464 = fAbs;
        m16328(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // l.InterfaceC3556
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // l.InterfaceC3556
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // l.InterfaceC3556
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // l.InterfaceC3556
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f20455);
    }

    @Override // l.InterfaceC3556
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f20479 || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f20485.m33710(i);
        startNestedScroll(i & 2);
        this.f20464 = 0.0f;
        this.f20457 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f20464;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f20464 = 0.0f;
                } else {
                    this.f20464 = f - f2;
                    iArr[1] = i2;
                }
                m16328(this.f20464);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f20486;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f20485.m33709();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f20485.m33712();
        this.f20457 = false;
        float f = this.f20464;
        if (f > 0.0f) {
            m16329(f);
            this.f20464 = 0.0f;
        } else {
            post(new Runnable() { // from class: l.᩵ۧܰ
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C6018.f20452;
                    this.f62583.m16338();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f20455);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f20461.m25100(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f20461.m25101();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f20461.m25105(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f20461.m25109(0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f20461.m25104(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f20461.m25106(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f20461.m25108(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f20461.m25103(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f20461.m25103(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f20461.m25102(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f20461.m25102(f, f2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m16328(float f) {
        Animation animation;
        Animation animation2;
        this.f20475.m21442(true);
        float f2 = this.f20468;
        float fMin = Math.min(1.0f, Math.abs(f / f2));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - f2;
        float f3 = this.f20481;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i = this.f20459 + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        if (this.f20462.getVisibility() != 0) {
            this.f20462.setVisibility(0);
        }
        this.f20462.setScaleX(1.0f);
        this.f20462.setScaleY(1.0f);
        if (f < f2) {
            if (this.f20475.getAlpha() > 76 && ((animation2 = this.f20454) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                C20835 c20835 = new C20835(this, this.f20475.getAlpha(), 76);
                c20835.setDuration(300L);
                this.f20462.m36410(null);
                this.f20462.clearAnimation();
                this.f20462.startAnimation(c20835);
                this.f20454 = c20835;
            }
        } else if (this.f20475.getAlpha() < 255 && ((animation = this.f20482) == null || !animation.hasStarted() || animation.hasEnded())) {
            C20835 c20836 = new C20835(this, this.f20475.getAlpha(), 255);
            c20836.setDuration(300L);
            this.f20462.m36410(null);
            this.f20462.clearAnimation();
            this.f20462.startAnimation(c20836);
            this.f20482 = c20836;
        }
        this.f20475.m21444(Math.min(0.8f, fMax * 0.8f));
        this.f20475.m21440(Math.min(1.0f, fMax));
        this.f20475.m21445(((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f);
        m16339(i - this.f20487);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16329(float f) {
        if (f > this.f20468) {
            m16327(true, true);
            return;
        }
        this.f20479 = false;
        this.f20475.m21444(0.0f);
        AnimationAnimationListenerC15897 animationAnimationListenerC15897 = new AnimationAnimationListenerC15897(this);
        this.f20456 = this.f20487;
        Animation animation = this.f20471;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.f20474);
        this.f20462.m36410(animationAnimationListenerC15897);
        this.f20462.clearAnimation();
        this.f20462.startAnimation(animation);
        this.f20475.m21442(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m16337() && !this.f20479 && !this.f20457) {
            if (actionMasked == 0) {
                this.f20476 = motionEvent.getPointerId(0);
                this.f20460 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f20476);
                if (iFindPointerIndex >= 0) {
                    if (this.f20460) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.f20458) * 0.5f;
                        this.f20460 = false;
                        m16329(y);
                    }
                    this.f20476 = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f20476);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    m16326(y2);
                    if (this.f20460) {
                        float f = (y2 - this.f20458) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m16328(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f20476) {
                            this.f20476 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f20476 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m16326(float f) {
        float f2 = this.f20467;
        float f3 = f - f2;
        float f4 = this.f20483;
        if (f3 <= f4 || this.f20460) {
            return;
        }
        this.f20458 = f2 + f4;
        this.f20460 = true;
        this.f20475.setAlpha(76);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16331(float f) {
        int i = this.f20456;
        m16339((i + ((int) ((this.f20459 - i) * f))) - this.f20462.getTop());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16339(int i) {
        this.f20462.bringToFront();
        C5031.m14004(i, this.f20462);
        this.f20487 = this.f20462.getTop();
    }
}
