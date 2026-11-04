package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public class C8147 extends ViewGroup {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f26863;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f26865;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f26867;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Matrix f26868;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f26869;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f26870;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f26871;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C0689 f26872;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f26873;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f26874;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f26875;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f26876;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f26877;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f26878;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f26879;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C0689 f26880;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f26881;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f26882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20581 f26883;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f26884;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Paint f26885;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f26886;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f26887;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Rect f26888;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f26889;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f26890;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12621 f26891;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C25302 f26892;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f26893;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f26894;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C25302 f26895;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f26864 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f26866 = {R.attr.layout_gravity};

    static {
        int i = Build.VERSION.SDK_INT;
        f26863 = true;
        f26865 = true;
        f26867 = i >= 29;
    }

    public C8147(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C8147(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26891 = new C12621();
        this.f26886 = DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
        this.f26885 = new Paint();
        this.f26877 = true;
        this.f26890 = 3;
        this.f26884 = 3;
        this.f26881 = 3;
        this.f26893 = 3;
        this.f26883 = new C23810(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f26873 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0689 c0689 = new C0689(this, 3);
        this.f26872 = c0689;
        C0689 c06810 = new C0689(this, 5);
        this.f26880 = c06810;
        C25302 c25302M56520 = C25302.m56520(this, 1.0f, c0689);
        this.f26892 = c25302M56520;
        c25302M56520.m56540(1);
        c25302M56520.m56534(f2);
        c0689.m2987(c25302M56520);
        C25302 c25302M56521 = C25302.m56520(this, 1.0f, c06810);
        this.f26895 = c25302M56521;
        c25302M56521.m56540(2);
        c25302M56521.m56534(f2);
        c06810.m2987(c25302M56521);
        setFocusableInTouchMode(true);
        int i2 = C22666.f73603;
        setImportantForAccessibility(1);
        C22666.m51098(this, new C20826(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC3672());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f26864);
            try {
                this.f26894 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C16350.f53088, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f26878 = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f26878 = getResources().getDimension(bin.mt.plus.R.dimen.MT_Protector);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f26870 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22040(WindowInsets windowInsets, boolean z) {
        this.f26882 = windowInsets;
        this.f26889 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22044(int i) {
        this.f26886 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22041(InterfaceC6656 interfaceC6656) {
        if (interfaceC6656 == null) {
            return;
        }
        if (this.f26879 == null) {
            this.f26879 = new ArrayList();
        }
        this.f26879.add(interfaceC6656);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22056(InterfaceC6656 interfaceC6656) {
        ArrayList arrayList;
        if (interfaceC6656 == null || (arrayList = this.f26879) == null) {
            return;
        }
        arrayList.remove(interfaceC6656);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m22048(int i) {
        m22038(i, 3);
        m22038(i, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22038(int i, int i2) {
        View viewM22053;
        int i3 = C22666.f73603;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f26890 = i;
        } else if (i2 == 5) {
            this.f26884 = i;
        } else if (i2 == 8388611) {
            this.f26881 = i;
        } else if (i2 == 8388613) {
            this.f26893 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f26892 : this.f26895).m56545();
        }
        if (i != 1) {
            if (i == 2 && (viewM22053 = m22053(absoluteGravity)) != null) {
                m22047(viewM22053);
                return;
            }
            return;
        }
        View viewM22054 = m22053(absoluteGravity);
        if (viewM22054 != null) {
            m22039(viewM22054, true);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22055(int i, View view) {
        if (!m22029(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        m22038(i, ((C24556) view.getLayoutParams()).f79592);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22045(int i) {
        int i2 = C22666.f73603;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i3 = this.f26890;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f26881 : this.f26893;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i == 5) {
            int i5 = this.f26884;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f26893 : this.f26881;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 8388611) {
            int i7 = this.f26881;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f26890 : this.f26884;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i9 = this.f26893;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f26884 : this.f26890;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22034(View view) {
        if (!m22029(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return m22045(((C24556) view.getLayoutParams()).f79592);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22046(int i, View view) {
        int i2;
        View rootView;
        int iM56531 = this.f26892.m56531();
        int iM56532 = this.f26895.m56531();
        if (iM56531 == 1 || iM56532 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iM56531 != 2 && iM56532 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C24556) view.getLayoutParams()).f79593;
            if (f == 0.0f) {
                C24556 c24556 = (C24556) view.getLayoutParams();
                if ((c24556.f79595 & 1) == 1) {
                    c24556.f79595 = 0;
                    ArrayList arrayList = this.f26879;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC6656) this.f26879.get(size)).onDrawerClosed(view);
                        }
                    }
                    m22032(view, false);
                    m22027(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C24556 c24557 = (C24556) view.getLayoutParams();
                if ((c24557.f79595 & 1) == 0) {
                    c24557.f79595 = 1;
                    ArrayList arrayList2 = this.f26879;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC6656) this.f26879.get(size2)).onDrawerOpened(view);
                        }
                    }
                    m22032(view, true);
                    m22027(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f26869) {
            this.f26869 = i2;
            ArrayList arrayList3 = this.f26879;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC6656) this.f26879.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m22032(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !m22029(childAt)) || (z && childAt == view)) {
                int i3 = C22666.f73603;
                i = 1;
            } else {
                int i4 = C22666.f73603;
                i = 4;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22027(View view) {
        C8451 c8451 = C8451.f27627;
        C22666.m51125(c8451.m22638(), view);
        if (!m22030(view) || m22034(view) == 2) {
            return;
        }
        C22666.m51096(view, c8451, null, this.f26883);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22054(float f, View view) {
        C24556 c24556 = (C24556) view.getLayoutParams();
        if (f == c24556.f79593) {
            return;
        }
        c24556.f79593 = f;
        ArrayList arrayList = this.f26879;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC6656) this.f26879.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22036(float f, View view) {
        float f2 = ((C24556) view.getLayoutParams()).f79593;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m22043(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m22054(f, view);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m22051(View view) {
        int i = ((C24556) view.getLayoutParams()).f79592;
        int i2 = C22666.f73603;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22043(int i, View view) {
        return (m22051(view) & i) == i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m22053(int i) {
        int i2 = C22666.f73603;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m22051(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22026(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26877 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26877 = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f26882 != null) {
            int i3 = C22666.f73603;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i4 = C22666.f73603;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C24556 c24556 = (C24556) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c24556.f79592, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f26882;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f26882;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c24556).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c24556).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c24556).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c24556).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m22031(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c24556).leftMargin) - ((ViewGroup.MarginLayoutParams) c24556).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c24556).topMargin) - ((ViewGroup.MarginLayoutParams) c24556).bottomMargin, 1073741824));
                } else {
                    if (!m22029(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f26865) {
                        float fM51105 = C22666.m51105(childAt);
                        float f = this.f26878;
                        if (fM51105 != f) {
                            C22666.m51087(childAt, f);
                        }
                    }
                    int iM22051 = m22051(childAt) & 7;
                    boolean z4 = iM22051 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(C8947.m23910(new StringBuilder("Child drawer has absolute gravity "), m22026(iM22051), " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f26873 + ((ViewGroup.MarginLayoutParams) c24556).leftMargin + ((ViewGroup.MarginLayoutParams) c24556).rightMargin, ((ViewGroup.MarginLayoutParams) c24556).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c24556).topMargin + ((ViewGroup.MarginLayoutParams) c24556).bottomMargin, ((ViewGroup.MarginLayoutParams) c24556).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f26865) {
            return;
        }
        int i2 = C22666.f73603;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.f26871 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C24556 c24556 = (C24556) childAt.getLayoutParams();
                if (m22031(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c24556).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c24556).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c24556).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m22043(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c24556.f79593 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (c24556.f79593 * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != c24556.f79593;
                    int i10 = c24556.f79592 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c24556).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) c24556).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c24556).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) c24556).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) c24556).bottomMargin);
                    }
                    if (z2) {
                        m22054(f, childAt);
                    }
                    int i18 = c24556.f79593 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (f26867 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C13275 c13275M12826 = C3977.m12812(null, rootWindowInsets).m12826();
            C25302 c25302 = this.f26892;
            c25302.m56546(Math.max(c25302.m56543(), c13275M12826.f42407));
            C25302 c25303 = this.f26895;
            c25303.m56546(Math.max(c25303.m56543(), c13275M12826.f42406));
        }
        this.f26871 = false;
        this.f26877 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f26871) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C24556) getChildAt(i).getLayoutParams()).f79593);
        }
        this.f26887 = fMax;
        boolean zM56550 = this.f26892.m56550();
        boolean zM56551 = this.f26895.m56550();
        if (zM56550 || zM56551) {
            int i2 = C22666.f73603;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f26889 || (drawable = this.f26894) == null) {
            return;
        }
        Object obj = this.f26882;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zM22031 = m22031(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM22031) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m22029(childAt) && childAt.getHeight() >= height) {
                    if (m22043(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f26887;
        if (f > 0.0f && zM22031) {
            int i4 = this.f26886;
            Paint paint = this.f26885;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m22031(View view) {
        return ((C24556) view.getLayoutParams()).f79592 == 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m22029(View view) {
        int i = ((C24556) view.getLayoutParams()).f79592;
        int i2 = C22666.f73603;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM56532;
        int actionMasked = motionEvent.getActionMasked();
        C25302 c25302 = this.f26892;
        boolean zM56549 = c25302.m56549(motionEvent) | this.f26895.m56549(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m22042(true);
                this.f26875 = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m22042(true);
                    this.f26875 = false;
                }
            } else if (c25302.m56541()) {
                this.f26872.m2988();
                this.f26880.m2988();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f26876 = x;
            this.f26874 = y;
            z = this.f26887 > 0.0f && (viewM56532 = c25302.m56532((int) x, (int) y)) != null && m22031(viewM56532);
            this.f26875 = false;
        }
        if (!zM56549 && !z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!((C24556) getChildAt(i).getLayoutParams()).f79594) {
                }
            }
            if (!this.f26875) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f26887 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f26888 == null) {
                this.f26888 = new Rect();
            }
            childAt.getHitRect(this.f26888);
            if (this.f26888.contains((int) x, (int) y) && !m22031(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f26868 == null) {
                            this.f26868 = new Matrix();
                        }
                        matrix.invert(this.f26868);
                        motionEventObtain.transform(this.f26868);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        C25302 c25302 = this.f26892;
        c25302.m56537(motionEvent);
        this.f26895.m56537(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f26876 = x;
            this.f26874 = y;
            this.f26875 = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            m22042(true);
            this.f26875 = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewM56532 = c25302.m56532((int) x2, (int) y2);
        if (viewM56532 != null && m22031(viewM56532)) {
            float f = x2 - this.f26876;
            float f2 = y2 - this.f26874;
            int iM56539 = c25302.m56539();
            if ((f2 * f2) + (f * f) < iM56539 * iM56539) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i);
                    if ((((C24556) childAt.getLayoutParams()).f79595 & 1) == 1) {
                        break;
                    }
                    i++;
                }
                z = childAt == null || m22034(childAt) == 2;
            }
        }
        m22042(z);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m22042(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22042(boolean z) {
        boolean zM56538;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C24556 c24556 = (C24556) childAt.getLayoutParams();
            if (m22029(childAt) && (!z || c24556.f79594)) {
                int width = childAt.getWidth();
                if (m22043(3, childAt)) {
                    int top = childAt.getTop();
                    zM56538 = this.f26892.m56538(childAt, -width, top);
                } else {
                    zM56538 = this.f26895.m56538(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zM56538;
                c24556.f79594 = false;
            }
        }
        this.f26872.m2988();
        this.f26880.m2988();
        if (z2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22047(View view) {
        if (!m22029(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C24556 c24556 = (C24556) view.getLayoutParams();
        if (this.f26877) {
            c24556.f79593 = 1.0f;
            c24556.f79595 = 1;
            m22032(view, true);
            m22027(view);
        } else {
            c24556.f79595 |= 2;
            if (m22043(3, view)) {
                this.f26892.m56538(view, 0, view.getTop());
            } else {
                this.f26895.m56538(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m22049(int i) {
        View viewM22053 = m22053(i);
        if (viewM22053 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m22026(i));
        }
        m22047(viewM22053);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22039(View view, boolean z) {
        if (!m22029(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C24556 c24556 = (C24556) view.getLayoutParams();
        if (this.f26877) {
            c24556.f79593 = 0.0f;
            c24556.f79595 = 0;
        } else if (z) {
            c24556.f79595 |= 4;
            if (m22043(3, view)) {
                this.f26892.m56538(view, -view.getWidth(), view.getTop());
            } else {
                this.f26895.m56538(view, getWidth(), view.getTop());
            }
        } else {
            m22036(0.0f, view);
            m22046(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22037(int i) {
        View viewM22053 = m22053(i);
        if (viewM22053 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m22026(i));
        }
        m22039(viewM22053, true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m22030(View view) {
        if (m22029(view)) {
            return (((C24556) view.getLayoutParams()).f79595 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m22057(int i) {
        View viewM22053 = m22053(i);
        if (viewM22053 != null) {
            return m22030(viewM22053);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m22028(View view) {
        if (m22029(view)) {
            return ((C24556) view.getLayoutParams()).f79593 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m22050(int i) {
        View viewM22053 = m22053(i);
        if (viewM22053 != null) {
            return m22028(viewM22053);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C24556 c24556 = new C24556(-1, -1);
        c24556.f79592 = 0;
        return c24556;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C24556)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                C24556 c24556 = new C24556(layoutParams);
                c24556.f79592 = 0;
                return c24556;
            }
            C24556 c24557 = new C24556((ViewGroup.MarginLayoutParams) layoutParams);
            c24557.f79592 = 0;
            return c24557;
        }
        C24556 c24558 = (C24556) layoutParams;
        C24556 c24559 = new C24556(c24558);
        c24559.f79592 = 0;
        c24559.f79592 = c24558.f79592;
        return c24559;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C24556) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C24556(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.f26870;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (m22029(childAt)) {
                if (m22030(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m22052() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m22052() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m22029(childAt) && m22028(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22035() {
        if (this.f26875) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f26875 = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewM22052 = m22052();
            if (viewM22052 != null && m22034(viewM22052) == 0) {
                m22042(false);
            }
            return viewM22052 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM22053;
        if (!(parcelable instanceof C14858)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14858 c14858 = (C14858) parcelable;
        super.onRestoreInstanceState(c14858.getSuperState());
        int i = c14858.f48564;
        if (i != 0 && (viewM22053 = m22053(i)) != null) {
            m22047(viewM22053);
        }
        int i2 = c14858.f48567;
        if (i2 != 3) {
            m22038(i2, 3);
        }
        int i3 = c14858.f48566;
        if (i3 != 3) {
            m22038(i3, 5);
        }
        int i4 = c14858.f48563;
        if (i4 != 3) {
            m22038(i4, 8388611);
        }
        int i5 = c14858.f48565;
        if (i5 != 3) {
            m22038(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C14858 c14858 = new C14858(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C24556 c24556 = (C24556) getChildAt(i).getLayoutParams();
            int i2 = c24556.f79595;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c14858.f48564 = c24556.f79592;
                break;
            }
        }
        c14858.f48567 = this.f26890;
        c14858.f48566 = this.f26884;
        c14858.f48563 = this.f26881;
        c14858.f48565 = this.f26893;
        return c14858;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((C24556) childAt.getLayoutParams()).f79595 & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m22029(view)) {
            int i3 = C22666.f73603;
            view.setImportantForAccessibility(4);
        } else {
            int i4 = C22666.f73603;
            view.setImportantForAccessibility(1);
        }
        if (f26863) {
            return;
        }
        C22666.m51098(view, this.f26891);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m22033(View view) {
        int i = C22666.f73603;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }
}
