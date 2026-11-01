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

/* JADX INFO: renamed from: l.᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes.dex */
public class C22815 extends C4905 implements InterfaceC16651, InterfaceC12854 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74221;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5175 f74222;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f74223;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f74224;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC6586 f74225;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12418 f74226;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74227;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC5092 f74228;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74229;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC0422 f74230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f74231;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Context f74232;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.C4905, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C4905, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C3306 generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C4905, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // l.C4905, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C3306 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public C22815(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f74223 = (int) (56.0f * f);
        this.f74229 = (int) (f * 4.0f);
        this.f74232 = context;
        this.f74227 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50504(int i) {
        if (this.f74227 != i) {
            this.f74227 = i;
            if (i == 0) {
                this.f74232 = getContext();
            } else {
                this.f74232 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m50507() {
        return this.f74227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50497(C5175 c5175) {
        this.f74222 = c5175;
        c5175.m14337(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5175 c5175 = this.f74222;
        if (c5175 != null) {
            c5175.updateMenuView(false);
            if (this.f74222.m14333()) {
                this.f74222.m14342();
                this.f74222.m14343();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // l.C4905, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        ?? r5;
        int i5;
        int i6;
        int i7;
        C12418 c12418;
        boolean z2 = this.f74231;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f74231 = z3;
        if (z2 != z3) {
            this.f74221 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f74231 && (c12418 = this.f74226) != null && size != this.f74221) {
            this.f74221 = size;
            c12418.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f74231 || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C12937 c12937 = (C12937) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c12937).rightMargin = 0;
                ((LinearLayout.LayoutParams) c12937).leftMargin = 0;
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
        int i10 = this.f74223;
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
            i3 = this.f74229;
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
                boolean z5 = childAt instanceof ViewOnClickListenerC6772;
                int i21 = i15 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C12937 c12938 = (C12937) childAt.getLayoutParams();
                c12938.f43000 = false;
                c12938.f42997 = 0;
                c12938.f42998 = 0;
                c12938.f43001 = false;
                ((LinearLayout.LayoutParams) c12938).leftMargin = 0;
                ((LinearLayout.LayoutParams) c12938).rightMargin = 0;
                c12938.f43002 = z5 && !TextUtils.isEmpty(((ViewOnClickListenerC6772) childAt).getText());
                int i22 = c12938.f42999 ? 1 : i11;
                C12937 c12939 = (C12937) childAt.getLayoutParams();
                i5 = mode;
                i6 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ViewOnClickListenerC6772 viewOnClickListenerC6772 = z5 ? (ViewOnClickListenerC6772) childAt : null;
                boolean z6 = (viewOnClickListenerC6772 == null || TextUtils.isEmpty(viewOnClickListenerC6772.getText())) ? false : true;
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
                c12939.f43001 = !c12939.f42999 && z6;
                c12939.f42998 = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                int iMax = Math.max(i16, i7);
                if (c12938.f43001) {
                    i18++;
                }
                if (c12938.f42999) {
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
                C12937 c129310 = (C12937) getChildAt(i28).getLayoutParams();
                boolean z9 = z8;
                if (c129310.f43001) {
                    int i29 = c129310.f42998;
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
                C12937 c129311 = (C12937) childAt2.getLayoutParams();
                int i32 = childMeasureSpec;
                int i33 = i14;
                long j3 = 1 << i31;
                if ((j2 & j3) == 0) {
                    if (c129311.f42998 == i30) {
                        j |= j3;
                    }
                } else {
                    if (z7 && c129311.f43002) {
                        r5 = 1;
                        r5 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i3 + i13, 0, i3, 0);
                        }
                    } else {
                        r5 = 1;
                    }
                    c129311.f42998 += r5;
                    c129311.f43000 = r5;
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
                if ((j & 1) != 0 && !((C12937) getChildAt(0).getLayoutParams()).f43002) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((C12937) getChildAt(i36).getLayoutParams()).f43002) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C12937 c129312 = (C12937) childAt3.getLayoutParams();
                    if (childAt3 instanceof ViewOnClickListenerC6772) {
                        c129312.f42997 = i37;
                        c129312.f43000 = true;
                        if (i38 == 0 && !c129312.f43002) {
                            ((LinearLayout.LayoutParams) c129312).leftMargin = (-i37) / 2;
                        }
                    } else if (c129312.f42999) {
                        c129312.f42997 = i37;
                        c129312.f43000 = true;
                        ((LinearLayout.LayoutParams) c129312).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c129312).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c129312).rightMargin = i37 / 2;
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
                C12937 c129313 = (C12937) childAt4.getLayoutParams();
                if (c129313.f43000) {
                    i4 = i34;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c129313.f42998 * i13) + c129313.f42997, 1073741824), i4);
                } else {
                    i4 = i34;
                }
                i39++;
                i34 = i4;
            }
        }
        setMeasuredDimension(i24, i23 != 1073741824 ? i35 : i25);
    }

    @Override // l.C4905, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f74231) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        int i7 = C20344.f65886;
        boolean z2 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C12937 c12937 = (C12937) childAt.getLayoutParams();
                if (c12937.f42999) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m50499(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c12937).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c12937).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c12937).leftMargin) + ((LinearLayout.LayoutParams) c12937).rightMargin;
                    m50499(i10);
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
                C12937 c12938 = (C12937) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c12938.f42999) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c12938).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c12938).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C12937 c12939 = (C12937) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c12939.f42999) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c12939).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = C8015.m21118(measuredWidth4, ((LinearLayout.LayoutParams) c12939).rightMargin, iMax, i19);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m50502();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50495(Drawable drawable) {
        m50493();
        this.f74222.m14336(drawable);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Drawable m50500() {
        m50493();
        return this.f74222.m14344();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m50501() {
        return this.f74224;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50498(boolean z) {
        this.f74224 = z;
    }

    public static C12937 generateDefaultLayoutParams() {
        C12937 c12937 = new C12937(-2, -2);
        c12937.f42999 = false;
        ((LinearLayout.LayoutParams) c12937).gravity = 16;
        return c12937;
    }

    @Override // l.C4905, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C12937(getContext(), attributeSet);
    }

    @Override // l.C4905, android.view.ViewGroup
    public final C3306 generateLayoutParams(AttributeSet attributeSet) {
        return new C12937(getContext(), attributeSet);
    }

    public static C12937 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C12937 c12937;
        if (layoutParams != null) {
            if (layoutParams instanceof C12937) {
                C12937 c12938 = (C12937) layoutParams;
                c12937 = new C12937(c12938);
                c12937.f42999 = c12938.f42999;
            } else {
                c12937 = new C12937(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c12937).gravity <= 0) {
                ((LinearLayout.LayoutParams) c12937).gravity = 16;
            }
            return c12937;
        }
        return generateDefaultLayoutParams();
    }

    @Override // l.C4905, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C12937;
    }

    @Override // l.InterfaceC16651
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo26120(C23707 c23707) {
        return this.f74226.performItemAction(c23707, 0);
    }

    @Override // l.InterfaceC12854
    public final void initialize(C12418 c12418) {
        this.f74226 = c12418;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Menu m50493() {
        if (this.f74226 == null) {
            Context context = getContext();
            C12418 c12418 = new C12418(context);
            this.f74226 = c12418;
            c12418.setCallback(new C3763(this));
            C5175 c5175 = new C5175(context);
            this.f74222 = c5175;
            c5175.m14332();
            C5175 c5176 = this.f74222;
            InterfaceC5092 c0941 = this.f74228;
            if (c0941 == null) {
                c0941 = new C0941();
            }
            c5176.setCallback(c0941);
            this.f74226.addMenuPresenter(this.f74222, this.f74232);
            this.f74222.m14337(this);
        }
        return this.f74226;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50496(InterfaceC5092 interfaceC5092, InterfaceC0422 interfaceC0422) {
        this.f74228 = interfaceC5092;
        this.f74230 = interfaceC0422;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C12418 m50508() {
        return this.f74226;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m50506() {
        C5175 c5175 = this.f74222;
        return c5175 != null && c5175.m14343();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m50492() {
        C5175 c5175 = this.f74222;
        return c5175 != null && c5175.m14342();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m50494() {
        C5175 c5175 = this.f74222;
        return c5175 != null && c5175.m14333();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m50503() {
        C5175 c5175 = this.f74222;
        if (c5175 != null) {
            return c5175.f17954 != null || c5175.m14333();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50502() {
        C5175 c5175 = this.f74222;
        if (c5175 != null) {
            c5175.m14342();
            C23438 c23438 = c5175.f17951;
            if (c23438 != null) {
                c23438.m6954();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50499(int i) {
        boolean zMo8866 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC22109)) {
            zMo8866 = ((InterfaceC22109) childAt).mo8866();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC22109)) ? zMo8866 : ((InterfaceC22109) childAt2).mo8867() | zMo8866;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m50505() {
        this.f74222.m14345();
    }
}
