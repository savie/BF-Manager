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

/* JADX INFO: renamed from: l.ۗ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public class C3072 extends ViewGroup implements InterfaceC21745, InterfaceC4591, InterfaceC7024 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9955 = 0;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f9956 = {R.attr.enabled};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Animation f9957;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f9958;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f9959;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final DecelerateInterpolator f9960;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public Animation f9961;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f9962;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f9963;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f9964;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public float f9965;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f9966;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Animation f9967;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f9968;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f9969;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13774 f9970;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f9971;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final int[] f9972;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public View f9973;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f9974;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f9975;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9976;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C10556 f9977;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f9978;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C22464 f9979;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public Animation.AnimationListener f9980;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Animation f9981;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9982;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C13735 f9983;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f9984;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Animation f9985;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17242 f9986;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9987;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public Animation f9988;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f9989;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f9990;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10024() {
        this.f9970.clearAnimation();
        this.f9979.stop();
        this.f9970.setVisibility(8);
        this.f9970.getBackground().setAlpha(255);
        this.f9979.setAlpha(255);
        m10025(this.f9959 - this.f9969);
        this.f9969 = this.f9970.getTop();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m10024();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            m10014(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C23210(super.onSaveInstanceState(), this.f9978);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C23210 c23210 = (C23210) parcelable;
        super.onRestoreInstanceState(c23210.getSuperState());
        m10014(c23210.f75193, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10024();
    }

    public C3072(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9978 = false;
        this.f9965 = -1.0f;
        this.f9990 = new int[2];
        this.f9972 = new int[2];
        this.f9974 = new int[2];
        this.f9976 = -1;
        this.f9958 = -1;
        this.f9980 = new AnimationAnimationListenerC15004(this);
        this.f9957 = new C24702(this);
        this.f9967 = new C16496(this);
        this.f9962 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f9971 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f9960 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.f9982 = i;
        this.f9970 = new C13774(getContext());
        C22464 c22464 = new C22464(getContext());
        this.f9979 = c22464;
        c22464.m50652();
        this.f9970.setImageDrawable(this.f9979);
        this.f9970.setVisibility(8);
        addView(this.f9970);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f9984 = i2;
        this.f9965 = i2;
        this.f9977 = new C10556();
        this.f9983 = new C13735(this);
        setNestedScrollingEnabled(true);
        int i3 = -i;
        this.f9969 = i3;
        this.f9959 = i3;
        m10017(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9956);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f9958;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10020(InterfaceC17242 interfaceC17242) {
        this.f9986 = interfaceC17242;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10021(boolean z) {
        m10014(z, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m10014(boolean z, boolean z2) {
        if (z && this.f9978 != z) {
            this.f9978 = z;
            m10025((this.f9984 + this.f9959) - this.f9969);
            this.f9964 = z2;
            this.f9970.setVisibility(0);
            this.f9979.setAlpha(255);
            C12767 c12767 = new C12767(this);
            this.f9988 = c12767;
            c12767.setDuration(this.f9971);
            Animation.AnimationListener animationListener = this.f9980;
            if (animationListener != null) {
                this.f9970.m33662(animationListener);
            }
            this.f9970.clearAnimation();
            this.f9970.startAnimation(this.f9988);
            return;
        }
        m10011(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10011(boolean z, boolean z2) {
        if (this.f9978 != z) {
            this.f9964 = z2;
            m10015();
            this.f9978 = z;
            Animation.AnimationListener animationListener = this.f9980;
            if (!z) {
                m10019(animationListener);
                return;
            }
            this.f9968 = this.f9969;
            Animation animation = this.f9957;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f9960);
            if (animationListener != null) {
                this.f9970.m33662(animationListener);
            }
            this.f9970.clearAnimation();
            this.f9970.startAnimation(animation);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10019(Animation.AnimationListener animationListener) {
        C5310 c5310 = new C5310(this);
        this.f9961 = c5310;
        c5310.setDuration(150L);
        this.f9970.m33662(animationListener);
        this.f9970.clearAnimation();
        this.f9970.startAnimation(this.f9961);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10018(int i) {
        this.f9970.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10022(int... iArr) {
        m10015();
        this.f9979.m50656(iArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m10026() {
        return this.f9978;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m10015() {
        if (this.f9973 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f9970)) {
                    this.f9973 = childAt;
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
        if (this.f9973 == null) {
            m10015();
        }
        View view = this.f9973;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f9970.getMeasuredWidth();
        int measuredHeight2 = this.f9970.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f9969;
        this.f9970.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9973 == null) {
            m10015();
        }
        View view = this.f9973;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        int i3 = this.f9982;
        this.f9970.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.f9958 = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f9970) {
                this.f9958 = i4;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10023() {
        View view = this.f9973;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m10015();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m10023() && !this.f9978 && !this.f9987) {
            if (actionMasked == 0) {
                m10025(this.f9959 - this.f9970.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.f9976 = pointerId;
                this.f9963 = false;
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex2 >= 0) {
                    this.f9966 = motionEvent.getY(iFindPointerIndex2);
                    return this.f9963;
                }
            } else {
                if (actionMasked == 1) {
                    this.f9963 = false;
                    this.f9976 = -1;
                } else if (actionMasked == 2) {
                    int i = this.f9976;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        m10016(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f9963 = false;
                    this.f9976 = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f9976) {
                        this.f9976 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f9963;
            }
        }
        return false;
    }

    @Override // l.InterfaceC21745
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f9983.m33558(i, i2, i3, i4, this.f9972, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f9972[1] : i7;
        if (i8 >= 0 || m10023()) {
            return;
        }
        float fAbs = this.f9989 + Math.abs(i8);
        this.f9989 = fAbs;
        m10012(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // l.InterfaceC4591
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // l.InterfaceC4591
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // l.InterfaceC4591
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // l.InterfaceC4591
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f9974);
    }

    @Override // l.InterfaceC4591
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f9978 || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f9977.m27005(i);
        startNestedScroll(i & 2);
        this.f9989 = 0.0f;
        this.f9987 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f9989;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f9989 = 0.0f;
                } else {
                    this.f9989 = f - f2;
                    iArr[1] = i2;
                }
                m10012(this.f9989);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f9990;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f9977.m27004();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f9977.m27007();
        this.f9987 = false;
        float f = this.f9989;
        if (f > 0.0f) {
            m10013(f);
            this.f9989 = 0.0f;
        } else {
            post(new Runnable() { // from class: l.ᩴ֨᩷
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C3072.f9955;
                    this.f62909.m10024();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f9974);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f9983.m33559(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9983.m33560();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f9983.m33564(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f9983.m33568(0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9983.m33563(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f9983.m33565(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f9983.m33567(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f9983.m33562(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f9983.m33562(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f9983.m33561(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f9983.m33561(f, f2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m10012(float f) {
        Animation animation;
        Animation animation2;
        this.f9979.m50655(true);
        float f2 = this.f9965;
        float fMin = Math.min(1.0f, Math.abs(f / f2));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - f2;
        float f3 = this.f9984;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i = this.f9959 + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        if (this.f9970.getVisibility() != 0) {
            this.f9970.setVisibility(0);
        }
        this.f9970.setScaleX(1.0f);
        this.f9970.setScaleY(1.0f);
        if (f < f2) {
            if (this.f9979.getAlpha() > 76 && ((animation2 = this.f9981) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                C1581 c1581 = new C1581(this, this.f9979.getAlpha(), 76);
                c1581.setDuration(300L);
                this.f9970.m33662(null);
                this.f9970.clearAnimation();
                this.f9970.startAnimation(c1581);
                this.f9981 = c1581;
            }
        } else if (this.f9979.getAlpha() < 255 && ((animation = this.f9985) == null || !animation.hasStarted() || animation.hasEnded())) {
            C1581 c1582 = new C1581(this, this.f9979.getAlpha(), 255);
            c1582.setDuration(300L);
            this.f9970.m33662(null);
            this.f9970.clearAnimation();
            this.f9970.startAnimation(c1582);
            this.f9985 = c1582;
        }
        this.f9979.m50657(Math.min(0.8f, fMax * 0.8f));
        this.f9979.m50653(Math.min(1.0f, fMax));
        this.f9979.m50658(((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f);
        m10025(i - this.f9969);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m10013(float f) {
        if (f > this.f9965) {
            m10011(true, true);
            return;
        }
        this.f9978 = false;
        this.f9979.m50657(0.0f);
        AnimationAnimationListenerC11275 animationAnimationListenerC11275 = new AnimationAnimationListenerC11275(this);
        this.f9968 = this.f9969;
        Animation animation = this.f9967;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.f9960);
        this.f9970.m33662(animationAnimationListenerC11275);
        this.f9970.clearAnimation();
        this.f9970.startAnimation(animation);
        this.f9979.m50655(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m10023() && !this.f9978 && !this.f9987) {
            if (actionMasked == 0) {
                this.f9976 = motionEvent.getPointerId(0);
                this.f9963 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9976);
                if (iFindPointerIndex >= 0) {
                    if (this.f9963) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.f9975) * 0.5f;
                        this.f9963 = false;
                        m10013(y);
                    }
                    this.f9976 = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f9976);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    m10016(y2);
                    if (this.f9963) {
                        float f = (y2 - this.f9975) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m10012(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f9976) {
                            this.f9976 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f9976 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m10016(float f) {
        float f2 = this.f9966;
        float f3 = f - f2;
        float f4 = this.f9962;
        if (f3 <= f4 || this.f9963) {
            return;
        }
        this.f9975 = f2 + f4;
        this.f9963 = true;
        this.f9979.setAlpha(76);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10017(float f) {
        int i = this.f9968;
        m10025((i + ((int) ((this.f9959 - i) * f))) - this.f9970.getTop());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10025(int i) {
        this.f9970.bringToFront();
        C22666.m51107(i, this.f9970);
        this.f9969 = this.f9970.getTop();
    }
}
