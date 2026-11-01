package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public class C2746 extends ViewGroup implements InterfaceC3556, InterfaceC4697 {
    public static final Class[] CONSTRUCTOR_PARAMS;
    public static final int EVENT_NESTED_SCROLL = 1;
    public static final int EVENT_PRE_DRAW = 0;
    public static final int EVENT_VIEW_REMOVED = 2;
    public static final String TAG = "CoordinatorLayout";
    public static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
    public static final int TYPE_ON_INTERCEPT = 0;
    public static final int TYPE_ON_TOUCH = 1;
    public static final String WIDGET_PACKAGE_NAME;
    public static final ThreadLocal sConstructors;
    public static final InterfaceC23646 sRectPool;
    public InterfaceC11754 mApplyWindowInsetsListener;
    public final int[] mBehaviorConsumed;
    public View mBehaviorTouchView;
    public final C5569 mChildDag;
    public final List mDependencySortedChildren;
    public boolean mDisallowInterceptReset;
    public boolean mDrawStatusBarBackground;
    public boolean mIsAttachedToWindow;
    public int[] mKeylines;
    public C15844 mLastInsets;
    public boolean mNeedsPreDrawListener;
    public final C13871 mNestedScrollingParentHelper;
    public View mNestedScrollingTarget;
    public final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    public ViewTreeObserverOnPreDrawListenerC3327 mOnPreDrawListener;
    public Paint mScrimPaint;
    public Drawable mStatusBarBackground;
    public final List mTempDependenciesList;
    public final List mTempList1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m8359(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8361(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m8376(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0 ? i | 48 : i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m8379(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    static {
        Package r0 = C2746.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C11920();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal();
        sRectPool = new C1772(12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m8362() {
        Rect rect = (Rect) sRectPool.mo5812();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8365(Rect rect) {
        rect.setEmpty();
        sRectPool.mo5813(rect);
    }

    public C2746(Context context) {
        this(context, null);
    }

    public C2746(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C2746(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C5569();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C13871();
        int[] iArr = C17439.f55539;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.MT_Protector);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, R.style.MT_Protector);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.mKeylines;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        m8377();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1916(this));
        int i3 = C5031.f17539;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8373(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC3327(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            int i = C5031.f17539;
            if (getFitsSystemWindows()) {
                C5031.m14002(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8373(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                int i = C5031.f17539;
                C7603.m20134(drawable3, getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            int i2 = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C10405.m26304(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public final C15844 setWindowInsets(C15844 c15844) {
        if (C13638.equals(this.mLastInsets, c15844)) {
            return c15844;
        }
        this.mLastInsets = c15844;
        boolean z = false;
        boolean z2 = c15844 != null && c15844.m37681() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C15844 c15844M8363 = m8363(c15844);
        requestLayout();
        return c15844M8363;
    }

    public final C15844 getLastWindowInsets() {
        return this.mLastInsets;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8373(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC23790 abstractC23790 = ((C9679) childAt.getLayoutParams()).f32626;
            if (abstractC23790 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC23790.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    abstractC23790.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C9679) getChildAt(i2).getLayoutParams()).m24632();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8371(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8374(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.mTempList1;
        m8371(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C9679 c9679 = (C9679) view.getLayoutParams();
            AbstractC23790 abstractC23790 = c9679.f32626;
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && abstractC23790 != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = abstractC23790.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = abstractC23790.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM24626 = c9679.m24626();
                boolean zM24628 = c9679.m24628(this, view);
                z = zM24628 && !zM24626;
                if (zM24628 && !z) {
                    break;
                }
            } else if (abstractC23790 != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC23790.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC23790.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m8373(true);
        }
        boolean zM8374 = m8374(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM8374;
        }
        m8373(true);
        return zM8374;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM8374;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zM8374 = m8374(motionEvent, 1);
            if (!zM8374) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zM8374) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            m8373(false);
            return zOnTouchEvent;
        }
        zM8374 = false;
        AbstractC23790 abstractC23790 = ((C9679) this.mBehaviorTouchView.getLayoutParams()).f32626;
        if (abstractC23790 != null) {
            zOnTouchEvent = abstractC23790.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zM8374) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m8373(false);
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        m8373(false);
        this.mDisallowInterceptReset = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m8360(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i < 0 || i >= iArr.length) {
            toString();
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23790 m8364(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = sConstructors;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC23790) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(C0252.m1693("Could not inflate Behavior subclass ", str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9679 getResolvedLayoutParams(View view) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        if (!c9679.f32629) {
            if (view instanceof InterfaceC11090) {
                c9679.m24624(((InterfaceC11090) view).getBehavior());
                c9679.f32629 = true;
                return c9679;
            }
            InterfaceC14618 interfaceC14618 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC14618 = (InterfaceC14618) superclass.getAnnotation(InterfaceC14618.class);
                if (interfaceC14618 != null) {
                    break;
                }
            }
            if (interfaceC14618 != null) {
                try {
                    c9679.m24624((AbstractC23790) interfaceC14618.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    interfaceC14618.value().getName();
                }
            }
            c9679.f32629 = true;
        }
        return c9679;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0066 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:32:0x0072
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m8380() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2746.m8380():void");
    }

    public void getDescendantRect(View view, Rect rect) {
        C22503.m50023(this, view, rect);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        AbstractC23790 abstractC23790;
        C9679 c9679;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax;
        m8380();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i12 = C5031.f17539;
        int layoutDirection = getLayoutDirection();
        boolean z = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i13 = paddingLeft + paddingRight;
        int i14 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.mLastInsets != null && getFitsSystemWindows();
        int size3 = this.mDependencySortedChildren.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        C2746 c2746 = this;
        int iCombineMeasuredStates = 0;
        int i17 = 0;
        while (i17 < size3) {
            View view = (View) c2746.mDependencySortedChildren.get(i17);
            int i18 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i11 = size3;
                iCombineMeasuredStates = i18;
                i9 = i17;
            } else {
                C9679 c96710 = (C9679) view.getLayoutParams();
                int i19 = c96710.f32628;
                if (i19 < 0 || mode == 0) {
                    i3 = i17;
                    i4 = i16;
                } else {
                    int iM8360 = c2746.m8360(i19);
                    i3 = i17;
                    int absoluteGravity = Gravity.getAbsoluteGravity(m8359(c96710.f32632), layoutDirection) & 7;
                    i4 = i16;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iM8360);
                    } else {
                        if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                            iMax = Math.max(0, iM8360 - paddingLeft);
                        }
                        if (z2 || view.getFitsSystemWindows()) {
                            i6 = i;
                            iMakeMeasureSpec = i2;
                        } else {
                            int iM37672 = c2746.mLastInsets.m37672() + c2746.mLastInsets.m37683();
                            int iM37670 = c2746.mLastInsets.m37670() + c2746.mLastInsets.m37681();
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - iM37672, mode);
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2 - iM37670, mode2);
                            i6 = iMakeMeasureSpec2;
                        }
                        abstractC23790 = c96710.f32626;
                        if (abstractC23790 != null) {
                            c9679 = c96710;
                            i9 = i3;
                            i8 = i18;
                            i10 = i4;
                            i7 = i15;
                            i11 = size3;
                            if (!abstractC23790.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                            }
                            C9679 c96711 = c9679;
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c96711).leftMargin + ((ViewGroup.MarginLayoutParams) c96711).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c96711).topMargin + ((ViewGroup.MarginLayoutParams) c96711).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                            i15 = iMax2;
                            i16 = iMax3;
                            c2746 = this;
                        } else {
                            c9679 = c96710;
                            i7 = i15;
                            i8 = i18;
                            i9 = i3;
                            i10 = i4;
                            i11 = size3;
                        }
                        onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                        C9679 c96712 = c9679;
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c96712).leftMargin + ((ViewGroup.MarginLayoutParams) c96712).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c96712).topMargin + ((ViewGroup.MarginLayoutParams) c96712).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax4;
                        i16 = iMax5;
                        c2746 = this;
                    }
                    i5 = iMax;
                    if (z2) {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    } else {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    }
                    abstractC23790 = c96710.f32626;
                    if (abstractC23790 != null) {
                        c9679 = c96710;
                        i9 = i3;
                        i8 = i18;
                        i10 = i4;
                        i7 = i15;
                        i11 = size3;
                        if (!abstractC23790.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                        }
                        C9679 c96713 = c9679;
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c96713).leftMargin + ((ViewGroup.MarginLayoutParams) c96713).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c96713).topMargin + ((ViewGroup.MarginLayoutParams) c96713).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax6;
                        i16 = iMax7;
                        c2746 = this;
                    } else {
                        c9679 = c96710;
                        i7 = i15;
                        i8 = i18;
                        i9 = i3;
                        i10 = i4;
                        i11 = size3;
                    }
                    onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                    C9679 c96714 = c9679;
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c96714).leftMargin + ((ViewGroup.MarginLayoutParams) c96714).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c96714).topMargin + ((ViewGroup.MarginLayoutParams) c96714).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax8;
                    i16 = iMax9;
                    c2746 = this;
                }
                i5 = 0;
                if (z2) {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                } else {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                }
                abstractC23790 = c96710.f32626;
                if (abstractC23790 != null) {
                    c9679 = c96710;
                    i9 = i3;
                    i8 = i18;
                    i10 = i4;
                    i7 = i15;
                    i11 = size3;
                    if (!abstractC23790.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                    }
                    C9679 c96715 = c9679;
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c96715).leftMargin + ((ViewGroup.MarginLayoutParams) c96715).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c96715).topMargin + ((ViewGroup.MarginLayoutParams) c96715).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax10;
                    i16 = iMax11;
                    c2746 = this;
                } else {
                    c9679 = c96710;
                    i7 = i15;
                    i8 = i18;
                    i9 = i3;
                    i10 = i4;
                    i11 = size3;
                }
                onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                C9679 c96716 = c9679;
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c96716).leftMargin + ((ViewGroup.MarginLayoutParams) c96716).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c96716).topMargin + ((ViewGroup.MarginLayoutParams) c96716).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                i15 = iMax12;
                i16 = iMax13;
                c2746 = this;
            }
            i17 = i9 + 1;
            size3 = i11;
        }
        int i20 = iCombineMeasuredStates;
        c2746.setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i20), View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15844 m8363(C15844 c15844) {
        AbstractC23790 abstractC23790;
        if (c15844.m37686()) {
            return c15844;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int i2 = C5031.f17539;
            if (childAt.getFitsSystemWindows() && (abstractC23790 = ((C9679) childAt.getLayoutParams()).f32626) != null) {
                c15844 = abstractC23790.onApplyWindowInsets(this, childAt, c15844);
                if (c15844.m37686()) {
                    return c15844;
                }
            }
        }
        return c15844;
    }

    public void onLayoutChild(View view, int i) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        View view2 = c9679.f32633;
        if (view2 == null && c9679.f32624 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m8370(view, view2, i);
            return;
        }
        int i2 = c9679.f32628;
        if (i2 >= 0) {
            m8367(view, i2, i);
        } else {
            m8366(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC23790 abstractC23790;
        int i5 = C5031.f17539;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.mDependencySortedChildren.get(i6);
            if (view.getVisibility() != 8 && ((abstractC23790 = ((C9679) view.getLayoutParams()).f32626) == null || !abstractC23790.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        C15844 c15844 = this.mLastInsets;
        int iM37681 = c15844 != null ? c15844.m37681() : 0;
        if (iM37681 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM37681);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m8377();
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C9679) view.getLayoutParams()).f32631.set(rect);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C9679) view.getLayoutParams()).f32631);
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8368(View view, int i, Rect rect, Rect rect2, C9679 c9679, int i2, int i3) {
        int iWidth;
        int iHeight;
        int absoluteGravity = Gravity.getAbsoluteGravity(m8379(c9679.f32632), i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m8376(c9679.f32627), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (i6 == 1) {
            iWidth = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            iWidth = rect.left;
        } else {
            iWidth = rect.right;
        }
        if (i7 == 16) {
            iHeight = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            iHeight = rect.top;
        } else {
            iHeight = rect.bottom;
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8372(C9679 c9679, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c9679).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c9679).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c9679).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c9679).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m8368(view, i, rect, rect2, c9679, measuredWidth, measuredHeight);
        m8372(c9679, rect2, measuredWidth, measuredHeight);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8370(View view, View view2, int i) {
        Rect rectM8362 = m8362();
        Rect rectM8363 = m8362();
        try {
            getDescendantRect(view2, rectM8362);
            getDesiredAnchoredChildRect(view, i, rectM8362, rectM8363);
            view.layout(rectM8363.left, rectM8363.top, rectM8363.right, rectM8363.bottom);
        } finally {
            m8365(rectM8362);
            m8365(rectM8363);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8367(View view, int i, int i2) {
        int i3;
        C9679 c9679 = (C9679) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(m8359(c9679.f32632), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM8360 = m8360(i) - measuredWidth;
        if (i4 == 1) {
            iM8360 += measuredWidth / 2;
        } else if (i4 == 5) {
            iM8360 += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c9679).leftMargin, Math.min(iM8360, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c9679).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c9679).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c9679).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8366(View view, int i) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        Rect rectM8362 = m8362();
        rectM8362.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c9679).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c9679).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c9679).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c9679).bottomMargin);
        if (this.mLastInsets != null) {
            int i2 = C5031.f17539;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectM8362.left = this.mLastInsets.m37683() + rectM8362.left;
                rectM8362.top = this.mLastInsets.m37681() + rectM8362.top;
                rectM8362.right -= this.mLastInsets.m37672();
                rectM8362.bottom -= this.mLastInsets.m37670();
            }
        }
        Rect rectM8363 = m8362();
        Gravity.apply(m8376(c9679.f32632), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM8362, rectM8363, i);
        view.layout(rectM8363.left, rectM8363.top, rectM8363.right, rectM8363.bottom);
        m8365(rectM8362);
        m8365(rectM8363);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        AbstractC23790 abstractC23790 = c9679.f32626;
        if (abstractC23790 != null) {
            float scrimOpacity = abstractC23790.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c9679.f32626.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(m8361(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    public final void onChildViewsChanged(int i) {
        int i2;
        AbstractC23790 abstractC23790;
        boolean zOnDependentViewChanged;
        int i3 = C5031.f17539;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectM8362 = m8362();
        Rect rectM8363 = m8362();
        Rect rectM8364 = m8362();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.mDependencySortedChildren.get(i4);
            C9679 c9679 = (C9679) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (c9679.f32640 == ((View) this.mDependencySortedChildren.get(i5))) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, rectM8363);
                if (c9679.f32625 != 0 && !rectM8363.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c9679.f32625, layoutDirection);
                    int i6 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i6 == 48) {
                        rectM8362.top = Math.max(rectM8362.top, rectM8363.bottom);
                    } else if (i6 == 80) {
                        rectM8362.bottom = Math.max(rectM8362.bottom, getHeight() - rectM8363.top);
                    }
                    int i7 = absoluteGravity & 7;
                    if (i7 == 3) {
                        rectM8362.left = Math.max(rectM8362.left, rectM8363.right);
                    } else if (i7 == 5) {
                        rectM8362.right = Math.max(rectM8362.right, getWidth() - rectM8363.left);
                    }
                }
                if (c9679.f32634 != 0 && view.getVisibility() == 0) {
                    m8369(view, rectM8362, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, rectM8364);
                    if (!rectM8364.equals(rectM8363)) {
                        recordLastChildRect(view, rectM8363);
                        for (i2 = i4 + 1; i2 < size; i2++) {
                            View view2 = (View) this.mDependencySortedChildren.get(i2);
                            C9679 c96710 = (C9679) view2.getLayoutParams();
                            abstractC23790 = c96710.f32626;
                            if (abstractC23790 == null && abstractC23790.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && c96710.m24622()) {
                                    c96710.m24629();
                                } else {
                                    if (i == 2) {
                                        abstractC23790.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    } else {
                                        zOnDependentViewChanged = abstractC23790.onDependentViewChanged(this, view2, view);
                                    }
                                    if (i == 1) {
                                        c96710.m24625(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = (View) this.mDependencySortedChildren.get(i2);
                        C9679 c96711 = (C9679) view3.getLayoutParams();
                        abstractC23790 = c96711.f32626;
                        if (abstractC23790 == null) {
                        }
                    }
                }
            }
        }
        m8365(rectM8362);
        m8365(rectM8363);
        m8365(rectM8364);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8369(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        int i8 = C5031.f17539;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            C9679 c9679 = (C9679) view.getLayoutParams();
            AbstractC23790 abstractC23790 = c9679.f32626;
            Rect rectM8362 = m8362();
            Rect rectM8363 = m8362();
            rectM8363.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC23790 != null && abstractC23790.getInsetDodgeRect(this, view, rectM8362)) {
                if (!rectM8363.contains(rectM8362)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM8362.toShortString() + " | Bounds:" + rectM8363.toShortString());
                }
            } else {
                rectM8362.set(rectM8363);
            }
            m8365(rectM8363);
            if (!rectM8362.isEmpty()) {
                int absoluteGravity = Gravity.getAbsoluteGravity(c9679.f32634, i);
                boolean z3 = true;
                if ((absoluteGravity & 48) != 48 || (i6 = (rectM8362.top - ((ViewGroup.MarginLayoutParams) c9679).topMargin) - c9679.f32638) >= (i7 = rect.top)) {
                    z = false;
                } else {
                    m8378(view, i7 - i6);
                    z = true;
                }
                if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectM8362.bottom) - ((ViewGroup.MarginLayoutParams) c9679).bottomMargin) + c9679.f32638) < (i5 = rect.bottom)) {
                    m8378(view, height - i5);
                    z = true;
                }
                if (!z) {
                    m8378(view, 0);
                }
                if ((absoluteGravity & 3) != 3 || (i3 = (rectM8362.left - ((ViewGroup.MarginLayoutParams) c9679).leftMargin) - c9679.f32630) >= (i4 = rect.left)) {
                    z2 = false;
                } else {
                    m8381(view, i4 - i3);
                    z2 = true;
                }
                if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectM8362.right) - ((ViewGroup.MarginLayoutParams) c9679).rightMargin) + c9679.f32630) >= (i2 = rect.right)) {
                    z3 = z2;
                } else {
                    m8381(view, width - i2);
                }
                if (!z3) {
                    m8381(view, 0);
                }
                m8365(rectM8362);
                return;
            }
            m8365(rectM8362);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m8381(View view, int i) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        int i2 = c9679.f32630;
        if (i2 != i) {
            C5031.m14009(i - i2, view);
            c9679.f32630 = i;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m8378(View view, int i) {
        C9679 c9679 = (C9679) view.getLayoutParams();
        int i2 = c9679.f32638;
        if (i2 != i) {
            C5031.m14004(i - i2, view);
            c9679.f32638 = i;
        }
    }

    public void dispatchDependentViewsChanged(View view) {
        List listM15384 = this.mChildDag.m15384(view);
        if (listM15384 == null || listM15384.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM15384.size(); i++) {
            View view2 = (View) listM15384.get(i);
            AbstractC23790 abstractC23790 = ((C9679) view2.getLayoutParams()).f32626;
            if (abstractC23790 != null) {
                abstractC23790.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public List getDependencies(View view) {
        ArrayList arrayListM15379 = this.mChildDag.m15379(view);
        this.mTempDependenciesList.clear();
        if (arrayListM15379 != null) {
            this.mTempDependenciesList.addAll(arrayListM15379);
        }
        return this.mTempDependenciesList;
    }

    public List getDependents(View view) {
        List listM15384 = this.mChildDag.m15384(view);
        this.mTempDependenciesList.clear();
        if (listM15384 != null) {
            this.mTempDependenciesList.addAll(listM15384);
        }
        return this.mTempDependenciesList;
    }

    public final List getDependencySortedChildren() {
        m8380();
        return C0561.unmodifiableList(this.mDependencySortedChildren);
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (m8375(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8375(View view) {
        return this.mChildDag.m15383(view);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC3327(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    public void offsetChildToAnchor(View view, int i) {
        AbstractC23790 abstractC23790;
        C9679 c9679 = (C9679) view.getLayoutParams();
        if (c9679.f32633 != null) {
            Rect rectM8362 = m8362();
            Rect rectM8363 = m8362();
            Rect rectM8364 = m8362();
            getDescendantRect(c9679.f32633, rectM8362);
            getChildRect(view, false, rectM8363);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m8368(view, i, rectM8362, rectM8364, c9679, measuredWidth, measuredHeight);
            boolean z = (rectM8364.left == rectM8363.left && rectM8364.top == rectM8363.top) ? false : true;
            m8372(c9679, rectM8364, measuredWidth, measuredHeight);
            int i2 = rectM8364.left - rectM8363.left;
            int i3 = rectM8364.top - rectM8363.top;
            if (i2 != 0) {
                C5031.m14009(i2, view);
            }
            if (i3 != 0) {
                C5031.m14004(i3, view);
            }
            if (z && (abstractC23790 = c9679.f32626) != null) {
                abstractC23790.onDependentViewChanged(this, view, c9679.f32633);
            }
            m8365(rectM8362);
            m8365(rectM8363);
            m8365(rectM8364);
        }
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect rectM8362 = m8362();
        getDescendantRect(view, rectM8362);
        try {
            return rectM8362.contains(i, i2);
        } finally {
            m8365(rectM8362);
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM8362 = m8362();
        getChildRect(view, view.getParent() != this, rectM8362);
        Rect rectM8363 = m8362();
        getChildRect(view2, view2.getParent() != this, rectM8363);
        try {
            if (rectM8362.left <= rectM8363.right && rectM8362.top <= rectM8363.bottom && rectM8362.right >= rectM8363.left && rectM8362.bottom >= rectM8363.top) {
                z = true;
            }
            return z;
        } finally {
            m8365(rectM8362);
            m8365(rectM8363);
        }
    }

    @Override // android.view.ViewGroup
    public C9679 generateLayoutParams(AttributeSet attributeSet) {
        return new C9679(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C9679 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C9679) {
            return new C9679((C9679) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C9679((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C9679(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C9679 generateDefaultLayoutParams() {
        return new C9679();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C9679) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // l.InterfaceC3556
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C9679 c9679 = (C9679) childAt.getLayoutParams();
                AbstractC23790 abstractC23790 = c9679.f32626;
                if (abstractC23790 != null) {
                    boolean zOnStartNestedScroll = abstractC23790.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    c9679.m24623(i2, zOnStartNestedScroll);
                    z |= zOnStartNestedScroll;
                } else {
                    c9679.m24623(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // l.InterfaceC3556
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC23790 abstractC23790;
        this.mNestedScrollingParentHelper.m33711(i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C9679 c9679 = (C9679) childAt.getLayoutParams();
            if (c9679.m24627(i2) && (abstractC23790 = c9679.f32626) != null) {
                abstractC23790.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // l.InterfaceC3556
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m33713(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C9679 c9679 = (C9679) childAt.getLayoutParams();
            if (c9679.m24627(i)) {
                AbstractC23790 abstractC23790 = c9679.f32626;
                if (abstractC23790 != null) {
                    abstractC23790.onStopNestedScroll(this, childAt, view, i);
                }
                c9679.m24623(i, false);
                c9679.m24629();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // l.InterfaceC3556
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // l.InterfaceC4697
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC23790 abstractC23790;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C9679 c9679 = (C9679) childAt.getLayoutParams();
                if (c9679.m24627(i5) && (abstractC23790 = c9679.f32626) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC23790.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    int iMax2 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i6 = iMax2;
                    iMax = i4 > 0 ? Math.max(iMax, iArr4[1]) : Math.min(iMax, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + iMax;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // l.InterfaceC3556
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC23790 abstractC23790;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C9679 c9679 = (C9679) childAt.getLayoutParams();
                if (c9679.m24627(i3) && (abstractC23790 = c9679.f32626) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC23790.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    int iMax2 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i4 = iMax2;
                    iMax = i2 > 0 ? Math.max(iMax, iArr4[1]) : Math.min(iMax, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = iMax;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC23790 abstractC23790;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C9679 c9679 = (C9679) childAt.getLayoutParams();
                if (c9679.m24627(0) && (abstractC23790 = c9679.f32626) != null) {
                    zOnNestedFling |= abstractC23790.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC23790 abstractC23790;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C9679 c9679 = (C9679) childAt.getLayoutParams();
                if (c9679.m24627(0) && (abstractC23790 = c9679.f32626) != null) {
                    zOnNestedPreFling |= abstractC23790.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m33709();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C14037)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14037 c14037 = (C14037) parcelable;
        super.onRestoreInstanceState(c14037.getSuperState());
        SparseArray sparseArray = c14037.f46154;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC23790 abstractC23790 = getResolvedLayoutParams(childAt).f32626;
            if (id != -1 && abstractC23790 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC23790.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        C14037 c14037 = new C14037(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC23790 abstractC23790 = ((C9679) childAt.getLayoutParams()).f32626;
            if (id != -1 && abstractC23790 != null && (parcelableOnSaveInstanceState = abstractC23790.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        c14037.f46154 = sparseArray;
        return c14037;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC23790 abstractC23790 = ((C9679) view.getLayoutParams()).f32626;
        if (abstractC23790 == null || !abstractC23790.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m8377() {
        int i = C5031.f17539;
        if (getFitsSystemWindows()) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new C6150(this);
            }
            C5031.m13989(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        C5031.m13989(this, (InterfaceC11754) null);
    }
}
