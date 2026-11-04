package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes5.dex */
public class C17531 extends C10993 implements InterfaceC18849, InterfaceC11280 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56982;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC16785 f56983;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f56984;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f56985;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9898 f56986;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C13056 f56987;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Context f56988;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f56989;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC12772 f56990;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56991;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC7662 f56992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f56993;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.C10993, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C10993, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C22182 generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C10993, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // l.C10993, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C22182 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public C17531(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f56989 = (int) (56.0f * f);
        this.f56982 = (int) (f * 4.0f);
        this.f56988 = context;
        this.f56984 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41180(int i) {
        if (this.f56984 != i) {
            this.f56984 = i;
            if (i == 0) {
                this.f56988 = getContext();
            } else {
                this.f56988 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41176() {
        return this.f56984;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41169(C13056 c13056) {
        this.f56987 = c13056;
        c13056.m32532(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C13056 c13056 = this.f56987;
        if (c13056 != null) {
            c13056.updateMenuView(false);
            if (this.f56987.m32541()) {
                this.f56987.m32536();
                this.f56987.m32535();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // l.C10993, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        ?? r5;
        int i5;
        int i6;
        int i7;
        C9898 c9898;
        boolean z2 = this.f56993;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f56993 = z3;
        if (z2 != z3) {
            this.f56991 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f56993 && (c9898 = this.f56986) != null && size != this.f56991) {
            this.f56991 = size;
            c9898.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f56993 || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C11564 c11564 = (C11564) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c11564).rightMargin = 0;
                ((LinearLayout.LayoutParams) c11564).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f56989;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z4 = false;
        int i18 = 0;
        long j = 0;
        while (true) {
            i3 = this.f56982;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() == 8) {
                i5 = mode;
                i6 = paddingBottom;
            } else {
                boolean z5 = childAt instanceof ViewOnClickListenerC16611;
                int i21 = i15 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C11564 c11565 = (C11564) childAt.getLayoutParams();
                c11565.f36358 = false;
                c11565.f36362 = 0;
                c11565.f36357 = 0;
                c11565.f36361 = false;
                ((LinearLayout.LayoutParams) c11565).leftMargin = 0;
                ((LinearLayout.LayoutParams) c11565).rightMargin = 0;
                c11565.f36359 = z5 && !TextUtils.isEmpty(((ViewOnClickListenerC16611) childAt).getText());
                int i22 = c11565.f36360 ? 1 : i11;
                C11564 c11566 = (C11564) childAt.getLayoutParams();
                i5 = mode;
                i6 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ViewOnClickListenerC16611 viewOnClickListenerC16611 = z5 ? (ViewOnClickListenerC16611) childAt : null;
                boolean z6 = (viewOnClickListenerC16611 == null || TextUtils.isEmpty(viewOnClickListenerC16611.getText())) ? false : true;
                if (i22 <= 0 || (z6 && i22 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i13, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i7++;
                    }
                    if (z6 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c11566.f36361 = !c11566.f36360 && z6;
                c11566.f36357 = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                int iMax = Math.max(i16, i7);
                if (c11565.f36361) {
                    i18++;
                }
                if (c11565.f36360) {
                    z4 = true;
                }
                i11 -= i7;
                int iMax2 = Math.max(i14, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    i16 = iMax;
                    j |= (long) (1 << i17);
                    i15 = i21;
                    i14 = iMax2;
                } else {
                    i16 = iMax;
                    i14 = iMax2;
                    i15 = i21;
                }
            }
            i17++;
            size3 = i19;
            i9 = i20;
            paddingBottom = i6;
            mode = i5;
        }
        int i23 = mode;
        int i24 = i9;
        int i25 = size3;
        boolean z7 = z4 && i15 == 2;
        boolean z8 = false;
        while (true) {
            if (i18 <= 0 || i11 <= 0) {
                z = z8;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j2 = 0;
            while (i28 < childCount2) {
                C11564 c11567 = (C11564) getChildAt(i28).getLayoutParams();
                boolean z9 = z8;
                if (c11567.f36361) {
                    int i29 = c11567.f36357;
                    if (i29 < i26) {
                        j2 = 1 << i28;
                        i26 = i29;
                        i27 = 1;
                    } else if (i29 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z8 = z9;
            }
            z = z8;
            j |= j2;
            if (i27 > i11) {
                break;
            }
            int i30 = i26 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                C11564 c11568 = (C11564) childAt2.getLayoutParams();
                int i32 = childMeasureSpec;
                int i33 = i14;
                long j3 = 1 << i31;
                if ((j2 & j3) == 0) {
                    if (c11568.f36357 == i30) {
                        j |= j3;
                    }
                } else {
                    if (z7 && c11568.f36359) {
                        r5 = 1;
                        r5 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i3 + i13, 0, i3, 0);
                        }
                    } else {
                        r5 = 1;
                    }
                    c11568.f36357 += r5;
                    c11568.f36358 = r5;
                    i11--;
                }
                i31++;
                childMeasureSpec = i32;
                i14 = i33;
            }
            z8 = true;
        }
        int i34 = childMeasureSpec;
        int i35 = i14;
        boolean z10 = !z4 && i15 == 1;
        if (i11 > 0 && j != 0 && (i11 < i15 - 1 || z10 || i16 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C11564) getChildAt(0).getLayoutParams()).f36359) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((C11564) getChildAt(i36).getLayoutParams()).f36359) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C11564 c11569 = (C11564) childAt3.getLayoutParams();
                    if (childAt3 instanceof ViewOnClickListenerC16611) {
                        c11569.f36362 = i37;
                        c11569.f36358 = true;
                        if (i38 == 0 && !c11569.f36359) {
                            ((LinearLayout.LayoutParams) c11569).leftMargin = (-i37) / 2;
                        }
                    } else if (c11569.f36360) {
                        c11569.f36362 = i37;
                        c11569.f36358 = true;
                        ((LinearLayout.LayoutParams) c11569).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c11569).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c11569).rightMargin = i37 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt4 = getChildAt(i39);
                C11564 c115610 = (C11564) childAt4.getLayoutParams();
                if (c115610.f36358) {
                    i4 = i34;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c115610.f36357 * i13) + c115610.f36362, 1073741824), i4);
                } else {
                    i4 = i34;
                }
                i39++;
                i34 = i4;
            }
        }
        setMeasuredDimension(i24, i23 != 1073741824 ? i35 : i25);
    }

    @Override // l.C10993, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f56993) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        int i7 = C19374.f62602;
        boolean z2 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C11564 c11564 = (C11564) childAt.getLayoutParams();
                if (c11564.f36360) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m41171(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c11564).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c11564).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c11564).leftMargin) + ((LinearLayout.LayoutParams) c11564).rightMargin;
                    m41171(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i6 / 2) - (measuredWidth2 / 2);
            int i13 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C11564 c11565 = (C11564) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c11565.f36360) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c11565).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c11565).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C11564 c11566 = (C11564) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c11566.f36360) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c11566).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = C24579.m54897(measuredWidth4, ((LinearLayout.LayoutParams) c11566).rightMargin, iMax, i19);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m41173();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41167(Drawable drawable) {
        m41181();
        this.f56987.m32530(drawable);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Drawable m41179() {
        m41181();
        return this.f56987.m32540();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41174() {
        return this.f56985;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41170(boolean z) {
        this.f56985 = z;
    }

    public static C11564 generateDefaultLayoutParams() {
        C11564 c11564 = new C11564(-2, -2);
        c11564.f36360 = false;
        ((LinearLayout.LayoutParams) c11564).gravity = 16;
        return c11564;
    }

    @Override // l.C10993, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C11564(getContext(), attributeSet);
    }

    @Override // l.C10993, android.view.ViewGroup
    public final C22182 generateLayoutParams(AttributeSet attributeSet) {
        return new C11564(getContext(), attributeSet);
    }

    public static C11564 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C11564 c11564;
        if (layoutParams != null) {
            if (layoutParams instanceof C11564) {
                C11564 c11565 = (C11564) layoutParams;
                c11564 = new C11564(c11565);
                c11564.f36360 = c11565.f36360;
            } else {
                c11564 = new C11564(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c11564).gravity <= 0) {
                ((LinearLayout.LayoutParams) c11564).gravity = 16;
            }
            return c11564;
        }
        return generateDefaultLayoutParams();
    }

    @Override // l.C10993, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C11564;
    }

    @Override // l.InterfaceC18849
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12636(C8407 c8407) {
        return this.f56986.performItemAction(c8407, 0);
    }

    @Override // l.InterfaceC11280
    public final void initialize(C9898 c9898) {
        this.f56986 = c9898;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Menu m41181() {
        if (this.f56986 == null) {
            Context context = getContext();
            C9898 c9898 = new C9898(context);
            this.f56986 = c9898;
            c9898.setCallback(new C24991(this));
            C13056 c13056 = new C13056(context);
            this.f56987 = c13056;
            c13056.m32537();
            C13056 c13057 = this.f56987;
            InterfaceC12772 c1870 = this.f56990;
            if (c1870 == null) {
                c1870 = new C1870();
            }
            c13057.setCallback(c1870);
            this.f56986.addMenuPresenter(this.f56987, this.f56988);
            this.f56987.m32532(this);
        }
        return this.f56986;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41168(InterfaceC12772 interfaceC12772, InterfaceC7662 interfaceC7662) {
        this.f56990 = interfaceC12772;
        this.f56992 = interfaceC7662;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9898 m41182() {
        return this.f56986;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41178() {
        C13056 c13056 = this.f56987;
        return c13056 != null && c13056.m32535();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m41175() {
        C13056 c13056 = this.f56987;
        return c13056 != null && c13056.m32536();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41166() {
        C13056 c13056 = this.f56987;
        return c13056 != null && c13056.m32541();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m41172() {
        C13056 c13056 = this.f56987;
        if (c13056 != null) {
            return c13056.f41778 != null || c13056.m32541();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41173() {
        C13056 c13056 = this.f56987;
        if (c13056 != null) {
            c13056.m32536();
            C8298 c8298 = c13056.f41783;
            if (c8298 != null) {
                c8298.m36140();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41171(int i) {
        boolean zMo16579 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC5599)) {
            zMo16579 = ((InterfaceC5599) childAt).mo16579();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC5599)) ? zMo16579 : ((InterfaceC5599) childAt2).mo16580() | zMo16579;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m41177() {
        this.f56987.m32538();
    }
}
