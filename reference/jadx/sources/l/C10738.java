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

/* JADX INFO: renamed from: l.ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public class C10738 extends ViewGroup implements InterfaceC8246, InterfaceC3556, InterfaceC4697 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f36585 = {R.attr.MT_Protector, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final Rect f36586;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final C15844 f36587;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5010 f36588;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f36589;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19535 f36590;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final Rect f36591;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f36592;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f36593;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f36594;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C15844 f36595;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15844 f36596;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C13871 f36597;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public OverScroller f36598;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18829 f36599;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C15844 f36600;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f36601;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C5798 f36602;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f36603;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ViewPropertyAnimator f36604;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Rect f36605;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f36606;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f36607;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Rect f36608;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public Drawable f36609;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f36610;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20615 f36611;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AnimatorListenerAdapter f36612;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C15844 f36613;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f36614;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Rect f36615;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // l.InterfaceC3556
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    static {
        C1025 c1025 = new C1025();
        c1025.m3872(C13954.m33793(0, 1, 0, 1));
        f36587 = c1025.m3869();
        f36586 = new Rect();
    }

    public C10738(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36610 = 0;
        this.f36608 = new Rect();
        this.f36591 = new Rect();
        this.f36615 = new Rect();
        this.f36605 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C15844 c15844 = C15844.f51279;
        this.f36596 = c15844;
        this.f36595 = c15844;
        this.f36600 = c15844;
        this.f36613 = c15844;
        this.f36612 = new C0153(this);
        this.f36614 = new RunnableC16382(this);
        this.f36607 = new RunnableC12149(this);
        m26970(context);
        this.f36597 = new C13871();
        C5798 c5798 = new C5798(context);
        c5798.setWillNotDraw(true);
        this.f36602 = c5798;
        addView(c5798);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26970(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f36585);
        this.f36606 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f36609 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f36598 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m26976();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26973(C5010 c5010) {
        this.f36588 = c5010;
        if (getWindowToken() != null) {
            this.f36588.m13896(this.f36610);
            int i = this.f36589;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C5031.m14002(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m26972() {
        return this.f36593;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26974(boolean z) {
        this.f36592 = z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m26970(getContext());
        C5031.m14002(this);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m26975();
        int i2 = this.f36589 ^ i;
        this.f36589 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C5010 c5010 = this.f36588;
        if (c5010 != null) {
            c5010.m13900(!z2);
            if (z || !z2) {
                this.f36588.m13901();
            } else {
                this.f36588.m13885();
            }
        }
        if ((i2 & 256) == 0 || this.f36588 == null) {
            return;
        }
        C5031.m14002(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f36610 = i;
        C5010 c5010 = this.f36588;
        if (c5010 != null) {
            c5010.m13896(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26971(View view, Rect rect, boolean z) {
        boolean z2;
        C17087 c17087 = (C17087) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c17087).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c17087).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c17087).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c17087).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c17087).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c17087).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c17087).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c17087).bottomMargin = i8;
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
        m26975();
        C15844 c15844M37669 = C15844.m37669(this, windowInsets);
        boolean zM26971 = m26971(this.f36611, new Rect(c15844M37669.m37683(), c15844M37669.m37681(), c15844M37669.m37672(), c15844M37669.m37670()), false);
        Rect rect = this.f36608;
        C5031.m13991(this, c15844M37669, rect);
        C15844 c15844M37675 = c15844M37669.m37675(rect.left, rect.top, rect.right, rect.bottom);
        this.f36596 = c15844M37675;
        boolean z = true;
        if (!this.f36595.equals(c15844M37675)) {
            this.f36595 = this.f36596;
            zM26971 = true;
        }
        Rect rect2 = this.f36591;
        if (rect2.equals(rect)) {
            z = zM26971;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c15844M37669.m37674().m37682().m37685().m37687();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C17087(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C17087(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C17087(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C17087;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m26975();
        measureChildWithMargins(this.f36611, i, 0, i2, 0);
        C17087 c17087 = (C17087) this.f36611.getLayoutParams();
        int iMax = Math.max(0, this.f36611.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c17087).leftMargin + ((ViewGroup.MarginLayoutParams) c17087).rightMargin);
        int iMax2 = Math.max(0, this.f36611.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c17087).topMargin + ((ViewGroup.MarginLayoutParams) c17087).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f36611.getMeasuredState());
        int i3 = C5031.f17539;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f36606;
            if (this.f36592) {
                this.f36611.getClass();
            }
        } else {
            measuredHeight = this.f36611.getVisibility() != 8 ? this.f36611.getMeasuredHeight() : 0;
        }
        Rect rect = this.f36608;
        Rect rect2 = this.f36615;
        rect2.set(rect);
        this.f36600 = this.f36596;
        if (!this.f36593 && !z) {
            C5798 c5798 = this.f36602;
            C15844 c15844 = f36587;
            Rect rect3 = this.f36605;
            C5031.m13991(c5798, c15844, rect3);
            if (!rect3.equals(f36586)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f36600 = this.f36600.m37675(0, measuredHeight, 0, 0);
            } else {
                C13954 c13954M33793 = C13954.m33793(this.f36600.m37683(), this.f36600.m37681() + measuredHeight, this.f36600.m37672(), this.f36600.m37670());
                C1025 c1025 = new C1025(this.f36600);
                c1025.m3872(c13954M33793);
                this.f36600 = c1025.m3869();
            }
        } else {
            C13954 c13954M33794 = C13954.m33793(this.f36600.m37683(), this.f36600.m37681() + measuredHeight, this.f36600.m37672(), this.f36600.m37670());
            C1025 c1026 = new C1025(this.f36600);
            c1026.m3872(c13954M33794);
            this.f36600 = c1026.m3869();
        }
        m26971(this.f36599, rect2, true);
        if (!this.f36613.equals(this.f36600)) {
            C15844 c15845 = this.f36600;
            this.f36613 = c15845;
            C5031.m13978(this.f36599, c15845);
        }
        measureChildWithMargins(this.f36599, i, 0, i2, 0);
        C17087 c17088 = (C17087) this.f36599.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f36599.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c17088).leftMargin + ((ViewGroup.MarginLayoutParams) c17088).rightMargin);
        int iMax4 = Math.max(iMax2, this.f36599.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c17088).topMargin + ((ViewGroup.MarginLayoutParams) c17088).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f36599.getMeasuredState());
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
                C17087 c17087 = (C17087) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c17087).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c17087).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f36609 != null) {
            if (this.f36611.getVisibility() == 0) {
                translationY = (int) (this.f36611.getTranslationY() + this.f36611.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f36609.setBounds(0, translationY, getWidth(), this.f36609.getIntrinsicHeight() + translationY);
            this.f36609.draw(canvas);
        }
    }

    @Override // l.InterfaceC4697
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // l.InterfaceC3556
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
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
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f36611.getVisibility() != 0) {
            return false;
        }
        return this.f36594;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f36597.m33710(i);
        C20615 c20615 = this.f36611;
        this.f36603 = c20615 != null ? -((int) c20615.getTranslationY()) : 0;
        m26976();
        C5010 c5010 = this.f36588;
        if (c5010 != null) {
            c5010.m13893();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f36603 + i2;
        this.f36603 = i5;
        m26976();
        this.f36611.setTranslationY(-Math.max(0, Math.min(i5, this.f36611.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f36594 || this.f36601) {
            return;
        }
        if (this.f36603 <= this.f36611.getHeight()) {
            m26976();
            postDelayed(this.f36614, 600L);
        } else {
            m26976();
            postDelayed(this.f36607, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f36594 || !z) {
            return false;
        }
        this.f36598.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f36598.getFinalY() <= this.f36611.getHeight()) {
            m26976();
            ((RunnableC16382) this.f36614).run();
        } else {
            m26976();
            ((RunnableC12149) this.f36607).run();
        }
        this.f36601 = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f36597.m33709();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m26975() {
        InterfaceC19535 wrapper;
        if (this.f36599 == null) {
            this.f36599 = (C18829) findViewById(R.id.MT_Protector);
            this.f36611 = (C20615) findViewById(R.id.MT_Protector);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.MT_Protector);
            if (callbackFindViewById instanceof InterfaceC19535) {
                wrapper = (InterfaceC19535) callbackFindViewById;
            } else if (callbackFindViewById instanceof C6938) {
                wrapper = ((C6938) callbackFindViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
            }
            this.f36590 = wrapper;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26977(boolean z) {
        if (z != this.f36594) {
            this.f36594 = z;
            if (z) {
                return;
            }
            m26976();
            m26976();
            this.f36611.setTranslationY(-Math.max(0, Math.min(0, this.f36611.getHeight())));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m26976() {
        removeCallbacks(this.f36614);
        removeCallbacks(this.f36607);
        ViewPropertyAnimator viewPropertyAnimator = this.f36604;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۙ */
    public final void mo21630(Window.Callback callback) {
        m26975();
        this.f36590.mo44625(callback);
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۙ */
    public final void mo21631(CharSequence charSequence) {
        m26975();
        this.f36590.mo44626(charSequence);
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۙ */
    public final void mo21628(int i) {
        m26975();
        if (i == 2) {
            this.f36590.getClass();
        } else if (i == 5) {
            this.f36590.getClass();
        } else {
            if (i != 109) {
                return;
            }
            this.f36593 = true;
        }
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21632() {
        m26975();
        return this.f36590.mo44628();
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo21627() {
        m26975();
        return this.f36590.mo44619();
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo21636() {
        m26975();
        return this.f36590.mo44635();
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo21634() {
        m26975();
        return this.f36590.mo44631();
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo21635() {
        m26975();
        return this.f36590.mo44634();
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۚ */
    public final void mo21633() {
        m26975();
        this.f36590.mo44629();
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ۙ */
    public final void mo21629(Menu menu, InterfaceC5092 interfaceC5092) {
        m26975();
        this.f36590.mo44624(menu, interfaceC5092);
    }

    @Override // l.InterfaceC8246
    /* JADX INFO: renamed from: ֨ */
    public final void mo21626() {
        m26975();
        this.f36590.mo44632();
    }
}
