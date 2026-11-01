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

/* JADX INFO: renamed from: l.ܿܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes4.dex */
public class C17381 extends ViewGroup {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f55279;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f55280;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f55281;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f55282 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f55283 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Rect f55284;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f55285;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f55286;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f55287;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f55288;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55289;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C12443 f55290;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f55291;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f55292;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C12443 f55293;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f55294;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f55295;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f55296;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f55297;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f55298;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C15265 f55299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f55300;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f55301;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8601 f55302;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Matrix f55303;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f55304;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public Paint f55305;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Drawable f55306;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10326 f55307;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f55308;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f55309;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C15265 f55310;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f55311;

    static {
        int i = Build.VERSION.SDK_INT;
        f55280 = true;
        f55281 = true;
        f55279 = i >= 29;
    }

    public C17381(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C17381(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55307 = new C10326();
        this.f55301 = DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
        this.f55305 = new Paint();
        this.f55311 = true;
        this.f55291 = 3;
        this.f55309 = 3;
        this.f55285 = 3;
        this.f55287 = 3;
        this.f55302 = new C8209(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f55298 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C12443 c12443 = new C12443(this, 3);
        this.f55290 = c12443;
        C12443 c12444 = new C12443(this, 5);
        this.f55293 = c12444;
        C15265 c15265M36541 = C15265.m36541(this, 1.0f, c12443);
        this.f55299 = c15265M36541;
        c15265M36541.m36562(1);
        c15265M36541.m36556(f2);
        c12443.m30919(c15265M36541);
        C15265 c15265M36542 = C15265.m36541(this, 1.0f, c12444);
        this.f55310 = c15265M36542;
        c15265M36542.m36562(2);
        c15265M36542.m36556(f2);
        c12444.m30919(c15265M36542);
        setFocusableInTouchMode(true);
        int i2 = C5031.f17539;
        setImportantForAccessibility(1);
        C5031.m13990(this, new C8915(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC19498());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f55282);
            try {
                this.f55306 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C18792.f60919, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f55292 = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f55292 = getResources().getDimension(bin.mt.plus.R.dimen.MT_Protector);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f55289 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40480(WindowInsets windowInsets, boolean z) {
        this.f55288 = windowInsets;
        this.f55304 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40495(int i) {
        this.f55301 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40481(InterfaceC7503 interfaceC7503) {
        if (interfaceC7503 == null) {
            return;
        }
        if (this.f55296 == null) {
            this.f55296 = new ArrayList();
        }
        this.f55296.add(interfaceC7503);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40494(InterfaceC7503 interfaceC7503) {
        ArrayList arrayList;
        if (interfaceC7503 == null || (arrayList = this.f55296) == null) {
            return;
        }
        arrayList.remove(interfaceC7503);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40478(int i, int i2) {
        View viewM40491;
        int i3 = C5031.f17539;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f55291 = i;
        } else if (i2 == 5) {
            this.f55309 = i;
        } else if (i2 == 8388611) {
            this.f55285 = i;
        } else if (i2 == 8388613) {
            this.f55287 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f55299 : this.f55310).m36565();
        }
        if (i != 1) {
            if (i == 2 && (viewM40491 = m40491(absoluteGravity)) != null) {
                m40487(viewM40491);
                return;
            }
            return;
        }
        View viewM40492 = m40491(absoluteGravity);
        if (viewM40492 != null) {
            m40479(viewM40492, true);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40493(int i, View view) {
        if (!m40466(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        m40478(i, ((C20909) view.getLayoutParams()).f67943);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40485(int i) {
        int i2 = C5031.f17539;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i3 = this.f55291;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f55285 : this.f55287;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i == 5) {
            int i5 = this.f55309;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f55287 : this.f55285;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 8388611) {
            int i7 = this.f55285;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f55291 : this.f55309;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i9 = this.f55287;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f55309 : this.f55291;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40474(View view) {
        if (!m40466(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return m40485(((C20909) view.getLayoutParams()).f67943);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40486(int i, View view) {
        int i2;
        View rootView;
        int iM36553 = this.f55299.m36553();
        int iM36554 = this.f55310.m36553();
        if (iM36553 == 1 || iM36554 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iM36553 != 2 && iM36554 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C20909) view.getLayoutParams()).f67944;
            if (f == 0.0f) {
                C20909 c20909 = (C20909) view.getLayoutParams();
                if ((c20909.f67942 & 1) == 1) {
                    c20909.f67942 = 0;
                    ArrayList arrayList = this.f55296;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC7503) this.f55296.get(size)).onDrawerClosed(view);
                        }
                    }
                    m40471(view, false);
                    m40468(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C20909 c209010 = (C20909) view.getLayoutParams();
                if ((c209010.f67942 & 1) == 0) {
                    c209010.f67942 = 1;
                    ArrayList arrayList2 = this.f55296;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC7503) this.f55296.get(size2)).onDrawerOpened(view);
                        }
                    }
                    m40471(view, true);
                    m40468(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f55295) {
            this.f55295 = i2;
            ArrayList arrayList3 = this.f55296;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC7503) this.f55296.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40471(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !m40466(childAt)) || (z && childAt == view)) {
                int i3 = C5031.f17539;
                i = 1;
            } else {
                int i4 = C5031.f17539;
                i = 4;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m40468(View view) {
        C9494 c9494 = C9494.f32118;
        C5031.m13973(c9494.m24321(), view);
        if (!m40472(view) || m40474(view) == 2) {
            return;
        }
        C5031.m13988(view, c9494, null, this.f55302);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40492(float f, View view) {
        C20909 c20909 = (C20909) view.getLayoutParams();
        if (f == c20909.f67944) {
            return;
        }
        c20909.f67944 = f;
        ArrayList arrayList = this.f55296;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC7503) this.f55296.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40476(float f, View view) {
        float f2 = ((C20909) view.getLayoutParams()).f67944;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m40483(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m40492(f, view);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40489(View view) {
        int i = ((C20909) view.getLayoutParams()).f67943;
        int i2 = C5031.f17539;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40483(int i, View view) {
        return (m40489(view) & i) == i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m40491(int i) {
        int i2 = C5031.f17539;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m40489(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m40465(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55311 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55311 = true;
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
        if (this.f55288 != null) {
            int i3 = C5031.f17539;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i4 = C5031.f17539;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C20909 c20909 = (C20909) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c20909.f67943, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f55288;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f55288;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c20909).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c20909).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c20909).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c20909).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m40469(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c20909).leftMargin) - ((ViewGroup.MarginLayoutParams) c20909).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c20909).topMargin) - ((ViewGroup.MarginLayoutParams) c20909).bottomMargin, 1073741824));
                } else {
                    if (!m40466(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f55281) {
                        float fM14006 = C5031.m14006(childAt);
                        float f = this.f55292;
                        if (fM14006 != f) {
                            C5031.m13982(childAt, f);
                        }
                    }
                    int iM40489 = m40489(childAt) & 7;
                    boolean z4 = iM40489 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(C22697.m50267(new StringBuilder("Child drawer has absolute gravity "), m40465(iM40489), " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f55298 + ((ViewGroup.MarginLayoutParams) c20909).leftMargin + ((ViewGroup.MarginLayoutParams) c20909).rightMargin, ((ViewGroup.MarginLayoutParams) c20909).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c20909).topMargin + ((ViewGroup.MarginLayoutParams) c20909).bottomMargin, ((ViewGroup.MarginLayoutParams) c20909).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f55281) {
            return;
        }
        int i2 = C5031.f17539;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.f55300 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C20909 c20909 = (C20909) childAt.getLayoutParams();
                if (m40469(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c20909).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c20909).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c20909).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m40483(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c20909.f67944 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (c20909.f67944 * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != c20909.f67944;
                    int i10 = c20909.f67943 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c20909).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) c20909).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c20909).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) c20909).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) c20909).bottomMargin);
                    }
                    if (z2) {
                        m40492(f, childAt);
                    }
                    int i18 = c20909.f67944 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (f55279 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C13954 c13954M37689 = C15844.m37669(null, rootWindowInsets).m37689();
            C15265 c15265 = this.f55299;
            c15265.m36566(Math.max(c15265.m36570(), c13954M37689.f45915));
            C15265 c15266 = this.f55310;
            c15266.m36566(Math.max(c15266.m36570(), c13954M37689.f45914));
        }
        this.f55300 = false;
        this.f55311 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f55300) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C20909) getChildAt(i).getLayoutParams()).f67944);
        }
        this.f55308 = fMax;
        boolean zM36552 = this.f55299.m36552();
        boolean zM36553 = this.f55310.m36552();
        if (zM36552 || zM36553) {
            int i2 = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f55304 || (drawable = this.f55306) == null) {
            return;
        }
        Object obj = this.f55288;
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
        boolean zM40469 = m40469(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM40469) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m40466(childAt) && childAt.getHeight() >= height) {
                    if (m40483(3, childAt)) {
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
        float f = this.f55308;
        if (f > 0.0f && zM40469) {
            int i4 = this.f55301;
            Paint paint = this.f55305;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m40469(View view) {
        return ((C20909) view.getLayoutParams()).f67943 == 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m40466(View view) {
        int i = ((C20909) view.getLayoutParams()).f67943;
        int i2 = C5031.f17539;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM36554;
        int actionMasked = motionEvent.getActionMasked();
        C15265 c15265 = this.f55299;
        boolean zM36569 = c15265.m36569(motionEvent) | this.f55310.m36569(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m40482(true);
                this.f55297 = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m40482(true);
                    this.f55297 = false;
                }
            } else if (c15265.m36563()) {
                this.f55290.m30920();
                this.f55293.m30920();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f55286 = x;
            this.f55294 = y;
            z = this.f55308 > 0.0f && (viewM36554 = c15265.m36554((int) x, (int) y)) != null && m40469(viewM36554);
            this.f55297 = false;
        }
        if (!zM36569 && !z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!((C20909) getChildAt(i).getLayoutParams()).f67945) {
                }
            }
            if (!this.f55297) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f55308 <= 0.0f) {
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
            if (this.f55284 == null) {
                this.f55284 = new Rect();
            }
            childAt.getHitRect(this.f55284);
            if (this.f55284.contains((int) x, (int) y) && !m40469(childAt)) {
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
                        if (this.f55303 == null) {
                            this.f55303 = new Matrix();
                        }
                        matrix.invert(this.f55303);
                        motionEventObtain.transform(this.f55303);
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
        C15265 c15265 = this.f55299;
        c15265.m36559(motionEvent);
        this.f55310.m36559(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f55286 = x;
            this.f55294 = y;
            this.f55297 = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            m40482(true);
            this.f55297 = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewM36554 = c15265.m36554((int) x2, (int) y2);
        if (viewM36554 != null && m40469(viewM36554)) {
            float f = x2 - this.f55286;
            float f2 = y2 - this.f55294;
            int iM36564 = c15265.m36564();
            if ((f2 * f2) + (f * f) < iM36564 * iM36564) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i);
                    if ((((C20909) childAt.getLayoutParams()).f67942 & 1) == 1) {
                        break;
                    }
                    i++;
                }
                z = childAt == null || m40474(childAt) == 2;
            }
        }
        m40482(z);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m40482(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40482(boolean z) {
        boolean zM36560;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C20909 c20909 = (C20909) childAt.getLayoutParams();
            if (m40466(childAt) && (!z || c20909.f67945)) {
                int width = childAt.getWidth();
                if (m40483(3, childAt)) {
                    int top = childAt.getTop();
                    zM36560 = this.f55299.m36560(childAt, -width, top);
                } else {
                    zM36560 = this.f55310.m36560(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zM36560;
                c20909.f67945 = false;
            }
        }
        this.f55290.m30920();
        this.f55293.m30920();
        if (z2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40487(View view) {
        if (!m40466(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C20909 c20909 = (C20909) view.getLayoutParams();
        if (this.f55311) {
            c20909.f67944 = 1.0f;
            c20909.f67942 = 1;
            m40471(view, true);
            m40468(view);
        } else {
            c20909.f67942 |= 2;
            if (m40483(3, view)) {
                this.f55299.m36560(view, 0, view.getTop());
            } else {
                this.f55310.m36560(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40484(int i) {
        View viewM40491 = m40491(i);
        if (viewM40491 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m40465(i));
        }
        m40487(viewM40491);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40479(View view, boolean z) {
        if (!m40466(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C20909 c20909 = (C20909) view.getLayoutParams();
        if (this.f55311) {
            c20909.f67944 = 0.0f;
            c20909.f67942 = 0;
        } else if (z) {
            c20909.f67942 |= 4;
            if (m40483(3, view)) {
                this.f55299.m36560(view, -view.getWidth(), view.getTop());
            } else {
                this.f55310.m36560(view, getWidth(), view.getTop());
            }
        } else {
            m40476(0.0f, view);
            m40486(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40477(int i) {
        View viewM40491 = m40491(i);
        if (viewM40491 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m40465(i));
        }
        m40479(viewM40491, true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m40472(View view) {
        if (m40466(view)) {
            return (((C20909) view.getLayoutParams()).f67942 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m40473(int i) {
        View viewM40491 = m40491(i);
        if (viewM40491 != null) {
            return m40472(viewM40491);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m40470(View view) {
        if (m40466(view)) {
            return ((C20909) view.getLayoutParams()).f67944 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m40488() {
        View viewM40491 = m40491(8388611);
        if (viewM40491 != null) {
            return m40470(viewM40491);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C20909 c20909 = new C20909(-1, -1);
        c20909.f67943 = 0;
        return c20909;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C20909)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                C20909 c20909 = new C20909(layoutParams);
                c20909.f67943 = 0;
                return c20909;
            }
            C20909 c209010 = new C20909((ViewGroup.MarginLayoutParams) layoutParams);
            c209010.f67943 = 0;
            return c209010;
        }
        C20909 c209011 = (C20909) layoutParams;
        C20909 c209012 = new C20909(c209011);
        c209012.f67943 = 0;
        c209012.f67943 = c209011.f67943;
        return c209012;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C20909) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C20909(getContext(), attributeSet);
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
            arrayList2 = this.f55289;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (m40466(childAt)) {
                if (m40472(childAt)) {
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
        if (i == 4 && m40490() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m40490() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m40466(childAt) && m40470(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40475() {
        if (this.f55297) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f55297 = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewM40490 = m40490();
            if (viewM40490 != null && m40474(viewM40490) == 0) {
                m40482(false);
            }
            return viewM40490 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM40491;
        if (!(parcelable instanceof C20204)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C20204 c20204 = (C20204) parcelable;
        super.onRestoreInstanceState(c20204.getSuperState());
        int i = c20204.f65560;
        if (i != 0 && (viewM40491 = m40491(i)) != null) {
            m40487(viewM40491);
        }
        int i2 = c20204.f65563;
        if (i2 != 3) {
            m40478(i2, 3);
        }
        int i3 = c20204.f65559;
        if (i3 != 3) {
            m40478(i3, 5);
        }
        int i4 = c20204.f65562;
        if (i4 != 3) {
            m40478(i4, 8388611);
        }
        int i5 = c20204.f65561;
        if (i5 != 3) {
            m40478(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C20204 c20204 = new C20204(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C20909 c20909 = (C20909) getChildAt(i).getLayoutParams();
            int i2 = c20909.f67942;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c20204.f65560 = c20909.f67943;
                break;
            }
        }
        c20204.f65563 = this.f55291;
        c20204.f65559 = this.f55309;
        c20204.f65562 = this.f55285;
        c20204.f65561 = this.f55287;
        return c20204;
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
            if ((((C20909) childAt.getLayoutParams()).f67942 & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m40466(view)) {
            int i3 = C5031.f17539;
            view.setImportantForAccessibility(4);
        } else {
            int i4 = C5031.f17539;
            view.setImportantForAccessibility(1);
        }
        if (f55280) {
            return;
        }
        C5031.m13990(view, this.f55307);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m40467(View view) {
        int i = C5031.f17539;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }
}
