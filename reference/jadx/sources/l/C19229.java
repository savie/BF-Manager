package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes5.dex */
public class C19229 extends FrameLayout implements InterfaceC4697, InterfaceC2145 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f62127;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C7940 f62128;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f62129;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17817 f62130;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f62131;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int[] f62132;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f62133;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C13871 f62134;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f62135;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public OverScroller f62136;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f62137;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f62138;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f62139;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f62140;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f62141;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f62142;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f62143;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Rect f62144;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f62145;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19080 f62146;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f62147;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f62148;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f62149;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9908 f62150;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f62151;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final float f62152;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62153;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f62154;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final float f62126 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final C22757 f62124 = new C22757();

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f62125 = {R.attr.fillViewport};

    @Override // l.InterfaceC3556
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public C19229(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C19229(Context context, AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.f62144 = new Rect();
        this.f62143 = true;
        this.f62154 = false;
        this.f62127 = null;
        this.f62138 = false;
        this.f62153 = true;
        this.f62145 = -1;
        this.f62132 = new int[2];
        this.f62141 = new int[2];
        this.f62146 = new C19080(getContext(), new C21345(this));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C22051.m48996(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f62147 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C22051.m48996(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f62140 = edgeEffect2;
        this.f62152 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f62136 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f62151 = viewConfiguration.getScaledTouchSlop();
        this.f62142 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f62133 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f62125, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z != this.f62135) {
            this.f62135 = z;
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f62134 = new C13871();
        this.f62150 = new C9908(this);
        setNestedScrollingEnabled(true);
        C5031.m13990(this, f62124);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f62150.m25105(i, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44179(int i, int i2) {
        return this.f62150.m25105(2, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m44187(int i) {
        this.f62150.m25109(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f62150.m25104(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f62150.m25108(i, i2, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44181(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f62150.m25108(i, i2, iArr, (int[]) null, i3);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f62150.m25100(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f62150.m25101();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m44187(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f62150.m25106(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f62150.m25103(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f62150.m25102(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f62150.m25102(f, f2);
    }

    @Override // l.InterfaceC4697
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m44167(i4, i5, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44167(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f62150.m25099(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // l.InterfaceC3556
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f62134.m33711(i, i2);
        m44179(2, i2);
    }

    @Override // l.InterfaceC3556
    public final void onStopNestedScroll(View view, int i) {
        this.f62134.m33713(i);
        m44187(i);
    }

    @Override // l.InterfaceC3556
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m44167(i4, i5, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m44181(i, i2, iArr, null, 0);
    }

    @Override // l.InterfaceC3556
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m44181(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m44167(i4, 0, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m44186((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f62134.m33709();
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44177(InterfaceC17817 interfaceC17817) {
        this.f62130 = interfaceC17817;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC17817 interfaceC17817 = this.f62130;
        if (interfaceC17817 != null) {
            interfaceC17817.mo5798(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f62135 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m44182(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44182(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f62144.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (isFocused() && keyEvent.getKeyCode() != 4) {
                    viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                        return true;
                    }
                }
            } else if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    if (keyEvent.isAltPressed()) {
                        return m44184(33);
                    }
                    return m44178(33);
                }
                if (keyCode == 20) {
                    if (keyEvent.isAltPressed()) {
                        return m44184(130);
                    }
                    return m44178(130);
                }
                if (keyCode == 62) {
                    m44174(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m44184(33);
                }
                if (keyCode == 93) {
                    return m44184(130);
                }
                if (keyCode == 122) {
                    m44174(33);
                    return false;
                }
                if (keyCode == 123) {
                    m44174(130);
                    return false;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad A[PHI: r1
      0x01ad: PHI (r1v11 android.view.VelocityTracker) = (r1v7 android.view.VelocityTracker), (r1v16 android.view.VelocityTracker) binds: [B:84:0x01ab, B:30:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        VelocityTracker velocityTracker;
        float fM3558;
        int iRound;
        int i;
        ViewParent parent2;
        if (this.f62148 == null) {
            this.f62148 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f62139 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f62139);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f62147;
            EdgeEffect edgeEffect2 = this.f62140;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker2 = this.f62148;
                velocityTracker2.computeCurrentVelocity(1000, this.f62133);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f62145);
                if (Math.abs(yVelocity) >= this.f62142) {
                    if (C0883.m3556(edgeEffect) != 0.0f) {
                        if (m44172(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m44186(-yVelocity);
                        }
                    } else if (C0883.m3556(edgeEffect2) == 0.0f) {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!this.f62150.m25102(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m44186(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        if (m44172(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            m44186(i3);
                        }
                    }
                } else if (this.f62136.springBack(getScrollX(), getScrollY(), 0, 0, 0, m44175())) {
                    postInvalidateOnAnimation();
                }
                this.f62145 = -1;
                this.f62138 = false;
                velocityTracker = this.f62148;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f62148 = null;
                }
                m44187(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f62145);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f62129 - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (C0883.m3556(edgeEffect) != 0.0f) {
                        fM3558 = -C0883.m3558(edgeEffect, -height, x);
                        if (C0883.m3556(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (C0883.m3556(edgeEffect2) != 0.0f) {
                        fM3558 = C0883.m3558(edgeEffect2, height, 1.0f - x);
                        if (C0883.m3556(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i4 - iRound;
                        if (!this.f62138 && Math.abs(i) > this.f62151) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f62138 = true;
                            if (i > 0) {
                                i -= this.f62151;
                            } else {
                                i += this.f62151;
                            }
                        }
                        if (this.f62138) {
                            int iM44164 = m44164(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f62129 = y - iM44164;
                            this.f62139 += iM44164;
                        }
                    }
                    f = fM3558;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i4 - iRound;
                    if (!this.f62138) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f62138 = true;
                        if (i > 0) {
                            i -= this.f62151;
                        } else {
                            i += this.f62151;
                        }
                    }
                    if (this.f62138) {
                        int iM44165 = m44164(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f62129 = y - iM44165;
                        this.f62139 += iM44165;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f62138 && getChildCount() > 0) {
                    if (this.f62136.springBack(getScrollX(), getScrollY(), 0, 0, 0, m44175())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f62145 = -1;
                this.f62138 = false;
                velocityTracker = this.f62148;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f62148 = null;
                }
                m44187(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f62129 = (int) motionEvent.getY(actionIndex);
                this.f62145 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m44168(motionEvent);
                this.f62129 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f62145));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f62138 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f62136.isFinished()) {
                this.f62136.abortAnimation();
                m44187(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f62129 = y2;
            this.f62145 = pointerId;
            m44179(2, 0);
        }
        VelocityTracker velocityTracker3 = this.f62148;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f62148) != null) {
            velocityTracker.recycle();
            this.f62148 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f62138) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m44173(motionEvent) && this.f62136.isFinished()) {
                        z = false;
                    }
                    this.f62138 = z;
                    velocityTracker = this.f62148;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f62148 = null;
                    }
                } else {
                    this.f62129 = y;
                    this.f62145 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f62148;
                    if (velocityTracker3 == null) {
                        this.f62148 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f62148.addMovement(motionEvent);
                    this.f62136.computeScrollOffset();
                    if (!m44173(motionEvent) && this.f62136.isFinished()) {
                        z = false;
                    }
                    this.f62138 = z;
                    m44179(2, 0);
                }
            } else {
                if (!m44173(motionEvent)) {
                    z = false;
                }
                this.f62138 = z;
                velocityTracker = this.f62148;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f62148 = null;
                }
            }
        } else if (i == 1) {
            this.f62138 = false;
            this.f62145 = -1;
            velocityTracker2 = this.f62148;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f62148 = null;
            }
            if (this.f62136.springBack(getScrollX(), getScrollY(), 0, 0, 0, m44175())) {
                postInvalidateOnAnimation();
            }
            m44187(0);
        } else if (i == 2) {
            int i2 = this.f62145;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f62129) > this.f62151 && (2 & this.f62134.m33709()) == 0) {
                    this.f62138 = true;
                    this.f62129 = y2;
                    if (this.f62148 == null) {
                        this.f62148 = VelocityTracker.obtain();
                    }
                    this.f62148.addMovement(motionEvent);
                    this.f62139 = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i == 3) {
            this.f62138 = false;
            this.f62145 = -1;
            velocityTracker2 = this.f62148;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f62148 = null;
            }
            if (this.f62136.springBack(getScrollX(), getScrollY(), 0, 0, 0, m44175())) {
                postInvalidateOnAnimation();
            }
            m44187(0);
        } else if (i == 6) {
            m44168(motionEvent);
        }
        return this.f62138;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m44164(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m44179(2, i3);
        }
        boolean zM25108 = this.f62150.m25108(0, i, this.f62141, this.f62132, i3);
        int[] iArr = this.f62132;
        int[] iArr2 = this.f62141;
        if (zM25108) {
            i4 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int iM44175 = m44175();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && m44175() > 0)) && !z;
        boolean z3 = m44180(i4, 0, scrollY, iM44175) && !this.f62150.m25104(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.f62150.m25099(0, scrollY2, 0, i4 - scrollY2, this.f62132, i3, iArr2);
        int i6 = i5 + iArr[1];
        int i7 = i4 - iArr2[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f62140;
        EdgeEffect edgeEffect2 = this.f62147;
        if (i8 < 0) {
            if (z2) {
                C0883.m3558(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > iM44175 && z2) {
            C0883.m3558(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f62148) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m44187(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44172(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM3556 = C0883.m3556(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f62152 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f62126;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM3556;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m44173(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f62147;
        if (C0883.m3556(edgeEffect) != 0.0f) {
            C0883.m3558(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f62140;
        if (C0883.m3556(edgeEffect2) == 0.0f) {
            return z;
        }
        C0883.m3558(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44168(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f62145) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f62129 = (int) motionEvent.getY(i);
            this.f62145 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f62148;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float axisValue;
        int width;
        if (motionEvent.getAction() == 8 && !this.f62138) {
            if ((motionEvent.getSource() & 2) != 2) {
                if ((motionEvent.getSource() & 4194304) == 4194304) {
                    i = 26;
                    axisValue = motionEvent.getAxisValue(26);
                    width = getWidth() / 2;
                } else {
                    i = 0;
                    axisValue = 0.0f;
                    width = 0;
                }
            } else {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            }
            if (axisValue != 0.0f) {
                m44164(-((int) (axisValue * m44185())), width, 1, (motionEvent.getSource() & o.a.r) == 8194);
                if (i != 0) {
                    this.f62146.m43852(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m44185() {
        if (this.f62149 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f62149 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f62149;
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44180(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.f62150.m25104(1)) {
            this.f62136.springBack(i2, i4, 0, 0, 0, m44175());
        }
        super.scrollTo(i2, i4);
        return z || z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44175() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44174(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f62144;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m44169(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44184(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f62144;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m44169(i, rect.top, rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44169(int i, int i2, int i3) {
        boolean z;
        ArrayList<View> arrayList;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < size) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 >= bottom || top >= i3) {
                arrayList = focusables;
            } else {
                boolean z4 = i2 < top && bottom < i3;
                arrayList = focusables;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
            i5++;
            focusables = arrayList;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m44164(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44178(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (viewFindNextFocus != null && m44170(viewFindNextFocus, height, getHeight())) {
            Rect rect = this.f62144;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m44164(m44176(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m44164(height, 0, 1, true);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m44170(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44170(View view, int i, int i2) {
        Rect rect = this.f62144;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44166(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f62137 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f62136.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                m44179(2, 1);
            } else {
                m44187(1);
            }
            this.f62131 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f62136.isFinished()) {
                this.f62136.abortAnimation();
                m44187(1);
            }
            scrollBy(i, i2);
        }
        this.f62137 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44183(int i) {
        m44166(0 - getScrollX(), i - getScrollY(), true);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int iM44175;
        int i2;
        int overScrollMode;
        if (this.f62136.isFinished()) {
            return;
        }
        this.f62136.computeScrollOffset();
        int currY = this.f62136.getCurrY();
        int i3 = currY - this.f62131;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f62147;
        EdgeEffect edgeEffect2 = this.f62140;
        if (i3 > 0 && C0883.m3556(edgeEffect) != 0.0f) {
            iRound = Math.round(C0883.m3558(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (iRound != i3) {
                edgeEffect.finish();
            }
        } else {
            if (i3 < 0 && C0883.m3556(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(C0883.m3558(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect2.finish();
                }
            }
            this.f62131 = currY;
            iArr = this.f62141;
            iArr[1] = 0;
            m44181(0, i3, iArr, null, 1);
            i = i3 - iArr[1];
            iM44175 = m44175();
            if (i != 0) {
                int scrollY = getScrollY();
                m44180(i, getScrollX(), scrollY, iM44175);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f62150.m25099(0, scrollY2, 0, i4, this.f62132, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i2 && iM44175 > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f62136.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f62136.getCurrVelocity());
                    }
                }
                this.f62136.abortAnimation();
                m44187(i2);
            }
            if (!this.f62136.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                m44187(i2);
            }
        }
        i3 -= iRound;
        this.f62131 = currY;
        iArr = this.f62141;
        iArr[1] = 0;
        m44181(0, i3, iArr, null, 1);
        i = i3 - iArr[1];
        iM44175 = m44175();
        if (i != 0) {
            int scrollY3 = getScrollY();
            m44180(i, getScrollX(), scrollY3, iM44175);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i - scrollY4;
            iArr[1] = 0;
            i2 = 1;
            this.f62150.m25099(0, scrollY4, 0, i5, this.f62132, 1, iArr);
            i = i5 - iArr[1];
        } else {
            i2 = 1;
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f62136.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f62136.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f62136.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f62136.getCurrVelocity());
            }
            this.f62136.abortAnimation();
            m44187(i2);
        }
        if (!this.f62136.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m44187(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44176(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i4 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return Math.max(i, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f62143) {
            Rect rect = this.f62144;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM44176 = m44176(rect);
            if (iM44176 != 0) {
                scrollBy(0, iM44176);
            }
        } else {
            this.f62127 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect != null && m44170(viewFindNextFocusFromRect, 0, getHeight())) {
            return viewFindNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM44176 = m44176(rect);
        boolean z2 = iM44176 != 0;
        if (z2) {
            if (!z) {
                m44166(0, iM44176, false);
            } else {
                scrollBy(0, iM44176);
                return z2;
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f62143 = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f62143 = false;
        View view = this.f62127;
        if (view != null && m44171(view, this)) {
            View view2 = this.f62127;
            Rect rect = this.f62144;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM44176 = m44176(rect);
            if (iM44176 != 0) {
                scrollBy(0, iM44176);
            }
        }
        this.f62127 = null;
        if (!this.f62154) {
            if (this.f62128 != null) {
                scrollTo(getScrollX(), this.f62128.f26101);
                this.f62128 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f62154 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f62154 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m44170(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f62144;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM44176 = m44176(rect);
        if (iM44176 != 0) {
            if (!this.f62153) {
                scrollBy(0, iM44176);
            } else {
                m44166(0, iM44176, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44171(View view, C19229 c19229) {
        if (view == c19229) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m44171((View) parent, c19229);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44186(int i) {
        if (getChildCount() > 0) {
            this.f62136.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m44179(2, 1);
            this.f62131 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f62147;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C14996.m35976(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C14996.m35976(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f62140;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(m44175(), scrollY) + height2;
        if (C14996.m35976(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (C14996.m35976(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7940)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7940 c7940 = (C7940) parcelable;
        super.onRestoreInstanceState(c7940.getSuperState());
        this.f62128 = c7940;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C7940 c7940 = new C7940(super.onSaveInstanceState());
        c7940.f26101 = getScrollY();
        return c7940;
    }
}
