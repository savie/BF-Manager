package l;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes3.dex */
public class C2332 extends ViewGroup implements InterfaceC12463, InterfaceC4591, InterfaceC21745 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f7520 = {R.attr.MT_Protector, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final Rect f7521;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final C3977 f7522;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Runnable f7523;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20668 f7524;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7525;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ViewPropertyAnimator f7526;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f7527;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9043 f7528;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public OverScroller f7529;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f7530;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC6498 f7531;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Rect f7532;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3977 f7533;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C3977 f7534;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C10556 f7535;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f7536;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f7537;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f7538;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C3977 f7539;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Drawable f7540;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final Rect f7541;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final AnimatorListenerAdapter f7542;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13100 f7543;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Rect f7544;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C3977 f7545;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20977 f7546;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f7547;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f7548;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f7549;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f7550;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // l.InterfaceC4591
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    static {
        C15163 c15163 = new C15163();
        c15163.m36480(C13275.m32819(0, 1, 0, 1));
        f7522 = c15163.m36477();
        f7521 = new Rect();
    }

    public C2332(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7549 = 0;
        this.f7544 = new Rect();
        this.f7548 = new Rect();
        this.f7532 = new Rect();
        this.f7541 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C3977 c3977 = C3977.f13623;
        this.f7533 = c3977;
        this.f7545 = c3977;
        this.f7534 = c3977;
        this.f7539 = c3977;
        this.f7542 = new C7552(this);
        this.f7550 = new RunnableC18739(this);
        this.f7523 = new RunnableC9788(this);
        m7852(context);
        this.f7535 = new C10556();
        C9043 c9043 = new C9043(context);
        c9043.setWillNotDraw(true);
        this.f7528 = c9043;
        addView(c9043);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7852(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f7520);
        this.f7538 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f7540 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f7529 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7862();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7859(C13100 c13100) {
        this.f7543 = c13100;
        if (getWindowToken() != null) {
            this.f7543.m32569(this.f7549);
            int i = this.f7536;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C22666.m51079(this);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7854() {
        return this.f7525;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7860(boolean z) {
        this.f7537 = z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m7852(getContext());
        C22666.m51079(this);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m7864();
        int i2 = this.f7536 ^ i;
        this.f7536 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C13100 c13100 = this.f7543;
        if (c13100 != null) {
            c13100.m32567(!z2);
            if (z || !z2) {
                this.f7543.m32570();
            } else {
                this.f7543.m32565();
            }
        }
        if ((i2 & 256) == 0 || this.f7543 == null) {
            return;
        }
        C22666.m51079(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f7549 = i;
        C13100 c13100 = this.f7543;
        if (c13100 != null) {
            c13100.m32569(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7853(View view, Rect rect, boolean z) {
        boolean z2;
        C0840 c0840 = (C0840) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0840).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0840).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0840).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0840).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0840).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0840).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0840).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0840).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m7864();
        C3977 c3977M12812 = C3977.m12812(this, windowInsets);
        boolean zM7853 = m7853(this.f7546, new Rect(c3977M12812.m12822(), c3977M12812.m12824(), c3977M12812.m12814(), c3977M12812.m12825()), false);
        Rect rect = this.f7544;
        C22666.m51094(this, c3977M12812, rect);
        C3977 c3977M12816 = c3977M12812.m12816(rect.left, rect.top, rect.right, rect.bottom);
        this.f7533 = c3977M12816;
        boolean z = true;
        if (!this.f7545.equals(c3977M12816)) {
            this.f7545 = this.f7533;
            zM7853 = true;
        }
        Rect rect2 = this.f7548;
        if (rect2.equals(rect)) {
            z = zM7853;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c3977M12812.m12815().m12823().m12831().m12827();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0840(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0840(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0840(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0840;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m7864();
        measureChildWithMargins(this.f7546, i, 0, i2, 0);
        C0840 c0840 = (C0840) this.f7546.getLayoutParams();
        int iMax = Math.max(0, this.f7546.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0840).leftMargin + ((ViewGroup.MarginLayoutParams) c0840).rightMargin);
        int iMax2 = Math.max(0, this.f7546.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0840).topMargin + ((ViewGroup.MarginLayoutParams) c0840).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f7546.getMeasuredState());
        int i3 = C22666.f73603;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f7538;
            if (this.f7537) {
                this.f7546.getClass();
            }
        } else {
            measuredHeight = this.f7546.getVisibility() != 8 ? this.f7546.getMeasuredHeight() : 0;
        }
        Rect rect = this.f7544;
        Rect rect2 = this.f7532;
        rect2.set(rect);
        this.f7534 = this.f7533;
        if (!this.f7525 && !z) {
            C9043 c9043 = this.f7528;
            C3977 c3977 = f7522;
            Rect rect3 = this.f7541;
            C22666.m51094(c9043, c3977, rect3);
            if (!rect3.equals(f7521)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f7534 = this.f7534.m12816(0, measuredHeight, 0, 0);
            } else {
                C13275 c13275M32819 = C13275.m32819(this.f7534.m12822(), this.f7534.m12824() + measuredHeight, this.f7534.m12814(), this.f7534.m12825());
                C15163 c15163 = new C15163(this.f7534);
                c15163.m36480(c13275M32819);
                this.f7534 = c15163.m36477();
            }
        } else {
            C13275 c13275M328110 = C13275.m32819(this.f7534.m12822(), this.f7534.m12824() + measuredHeight, this.f7534.m12814(), this.f7534.m12825());
            C15163 c15164 = new C15163(this.f7534);
            c15164.m36480(c13275M328110);
            this.f7534 = c15164.m36477();
        }
        m7853(this.f7524, rect2, true);
        if (!this.f7539.equals(this.f7534)) {
            C3977 c3978 = this.f7534;
            this.f7539 = c3978;
            C22666.m51083(this.f7524, c3978);
        }
        measureChildWithMargins(this.f7524, i, 0, i2, 0);
        C0840 c0841 = (C0840) this.f7524.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f7524.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0841).leftMargin + ((ViewGroup.MarginLayoutParams) c0841).rightMargin);
        int iMax4 = Math.max(iMax2, this.f7524.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0841).topMargin + ((ViewGroup.MarginLayoutParams) c0841).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f7524.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0840 c0840 = (C0840) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0840).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0840).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f7540 != null) {
            if (this.f7546.getVisibility() == 0) {
                translationY = (int) (this.f7546.getTranslationY() + this.f7546.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f7540.setBounds(0, translationY, getWidth(), this.f7540.getIntrinsicHeight() + translationY);
            this.f7540.draw(canvas);
        }
    }

    @Override // l.InterfaceC21745
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // l.InterfaceC4591
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
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
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f7546.getVisibility() != 0) {
            return false;
        }
        return this.f7527;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f7535.m27005(i);
        C20977 c20977 = this.f7546;
        this.f7547 = c20977 != null ? -((int) c20977.getTranslationY()) : 0;
        m7862();
        C13100 c13100 = this.f7543;
        if (c13100 != null) {
            c13100.m32566();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f7547 + i2;
        this.f7547 = i5;
        m7862();
        this.f7546.setTranslationY(-Math.max(0, Math.min(i5, this.f7546.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f7527 || this.f7530) {
            return;
        }
        if (this.f7547 <= this.f7546.getHeight()) {
            m7862();
            postDelayed(this.f7550, 600L);
        } else {
            m7862();
            postDelayed(this.f7523, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f7527 || !z) {
            return false;
        }
        this.f7529.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f7529.getFinalY() <= this.f7546.getHeight()) {
            m7862();
            ((RunnableC18739) this.f7550).run();
        } else {
            m7862();
            ((RunnableC9788) this.f7523).run();
        }
        this.f7530 = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f7535.m27004();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7864() {
        InterfaceC6498 wrapper;
        if (this.f7524 == null) {
            this.f7524 = (C20668) findViewById(R.id.MT_Protector);
            this.f7546 = (C20977) findViewById(R.id.MT_Protector);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.MT_Protector);
            if (callbackFindViewById instanceof InterfaceC6498) {
                wrapper = (InterfaceC6498) callbackFindViewById;
            } else if (callbackFindViewById instanceof C16390) {
                wrapper = ((C16390) callbackFindViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
            }
            this.f7531 = wrapper;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7868(boolean z) {
        if (z != this.f7527) {
            this.f7527 = z;
            if (z) {
                return;
            }
            m7862();
            m7862();
            this.f7546.setTranslationY(-Math.max(0, Math.min(0, this.f7546.getHeight())));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m7862() {
        removeCallbacks(this.f7550);
        removeCallbacks(this.f7523);
        ViewPropertyAnimator viewPropertyAnimator = this.f7526;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7857(Window.Callback callback) {
        m7864();
        this.f7531.mo18338(callback);
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7858(CharSequence charSequence) {
        m7864();
        this.f7531.mo18339(charSequence);
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7855(int i) {
        m7864();
        if (i == 2) {
            this.f7531.getClass();
        } else if (i == 5) {
            this.f7531.getClass();
        } else {
            if (i != 109) {
                return;
            }
            this.f7525 = true;
        }
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7861() {
        m7864();
        return this.f7531.mo18341();
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo7870() {
        m7864();
        return this.f7531.mo18350();
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo7866() {
        m7864();
        return this.f7531.mo18346();
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo7863() {
        m7864();
        return this.f7531.mo18343();
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo7869() {
        m7864();
        return this.f7531.mo18349();
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo7867() {
        m7864();
        this.f7531.mo18347();
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7856(Menu menu, InterfaceC12772 interfaceC12772) {
        m7864();
        this.f7531.mo18337(menu, interfaceC12772);
    }

    @Override // l.InterfaceC12463
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo7865() {
        m7864();
        this.f7531.mo18342();
    }
}
