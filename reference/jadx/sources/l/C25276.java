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

/* JADX INFO: renamed from: l.᩻᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public class C25276 extends ViewGroup implements InterfaceC4591, InterfaceC21745 {
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
    public static final InterfaceC8276 sRectPool;
    public InterfaceC22491 mApplyWindowInsetsListener;
    public final int[] mBehaviorConsumed;
    public View mBehaviorTouchView;
    public final C17070 mChildDag;
    public final List mDependencySortedChildren;
    public boolean mDisallowInterceptReset;
    public boolean mDrawStatusBarBackground;
    public boolean mIsAttachedToWindow;
    public int[] mKeylines;
    public C3977 mLastInsets;
    public boolean mNeedsPreDrawListener;
    public final C10556 mNestedScrollingParentHelper;
    public View mNestedScrollingTarget;
    public final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    public ViewTreeObserverOnPreDrawListenerC13341 mOnPreDrawListener;
    public Paint mScrimPaint;
    public Drawable mStatusBarBackground;
    public final List mTempDependenciesList;
    public final List mTempList1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m56412(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m56427(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0 ? i | 48 : i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m56430(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m56433(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    static {
        Package r0 = C25276.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C11849();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal();
        sRectPool = new C13496(12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m56413() {
        Rect rect = (Rect) sRectPool.mo18919();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56416(Rect rect) {
        rect.setEmpty();
        sRectPool.mo18920(rect);
    }

    public C25276(Context context) {
        this(context, null);
    }

    public C25276(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C25276(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C17070();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C10556();
        int[] iArr = C13888.f44043;
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
        m56428();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC20054(this));
        int i3 = C22666.f73603;
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
        m56424(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC13341(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            int i = C22666.f73603;
            if (getFitsSystemWindows()) {
                C22666.m51079(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56424(false);
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
                int i = C22666.f73603;
                C0597.m2695(drawable3, getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            int i2 = C22666.f73603;
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
        setStatusBarBackground(i != 0 ? C7508.m20563(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public final C3977 setWindowInsets(C3977 c3977) {
        if (C17359.equals(this.mLastInsets, c3977)) {
            return c3977;
        }
        this.mLastInsets = c3977;
        boolean z = false;
        boolean z2 = c3977 != null && c3977.m12824() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C3977 c3977M56414 = m56414(c3977);
        requestLayout();
        return c3977M56414;
    }

    public final C3977 getLastWindowInsets() {
        return this.mLastInsets;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56424(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC11103 abstractC11103 = ((C15578) childAt.getLayoutParams()).f50657;
            if (abstractC11103 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC11103.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    abstractC11103.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C15578) getChildAt(i2).getLayoutParams()).m37308();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56422(List list) {
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
    private boolean m56425(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.mTempList1;
        m56422(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C15578 c15578 = (C15578) view.getLayoutParams();
            AbstractC11103 abstractC11103 = c15578.f50657;
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && abstractC11103 != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = abstractC11103.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = abstractC11103.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM37304 = c15578.m37304();
                boolean zM37306 = c15578.m37306(this, view);
                z = zM37306 && !zM37304;
                if (zM37306 && !z) {
                    break;
                }
            } else if (abstractC11103 != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC11103.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC11103.onTouchEvent(this, view, motionEventObtain);
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
            m56424(true);
        }
        boolean zM56425 = m56425(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM56425;
        }
        m56424(true);
        return zM56425;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM56425;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zM56425 = m56425(motionEvent, 1);
            if (!zM56425) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zM56425) {
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
            m56424(false);
            return zOnTouchEvent;
        }
        zM56425 = false;
        AbstractC11103 abstractC11103 = ((C15578) this.mBehaviorTouchView.getLayoutParams()).f50657;
        if (abstractC11103 != null) {
            zOnTouchEvent = abstractC11103.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zM56425) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m56424(false);
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        m56424(false);
        this.mDisallowInterceptReset = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m56411(int i) {
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
    public static AbstractC11103 m56415(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = C8008.m21875('.', str2, str);
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
            return (AbstractC11103) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(C25272.m56409("Could not inflate Behavior subclass ", str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15578 getResolvedLayoutParams(View view) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        if (!c15578.f50662) {
            if (view instanceof InterfaceC22292) {
                c15578.m37302(((InterfaceC22292) view).getBehavior());
                c15578.f50662 = true;
                return c15578;
            }
            InterfaceC23038 interfaceC23038 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC23038 = (InterfaceC23038) superclass.getAnnotation(InterfaceC23038.class);
                if (interfaceC23038 != null) {
                    break;
                }
            }
            if (interfaceC23038 != null) {
                try {
                    c15578.m37302((AbstractC11103) interfaceC23038.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    interfaceC23038.value().getName();
                }
            }
            c15578.f50662 = true;
        }
        return c15578;
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56431() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C25276.m56431():void");
    }

    public void getDescendantRect(View view, Rect rect) {
        C17816.m41660(this, view, rect);
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
        AbstractC11103 abstractC11103;
        C15578 c15578;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax;
        m56431();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i12 = C22666.f73603;
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
        C25276 c25276 = this;
        int iCombineMeasuredStates = 0;
        int i17 = 0;
        while (i17 < size3) {
            View view = (View) c25276.mDependencySortedChildren.get(i17);
            int i18 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i11 = size3;
                iCombineMeasuredStates = i18;
                i9 = i17;
            } else {
                C15578 c15579 = (C15578) view.getLayoutParams();
                int i19 = c15579.f50669;
                if (i19 < 0 || mode == 0) {
                    i3 = i17;
                    i4 = i16;
                } else {
                    int iM56411 = c25276.m56411(i19);
                    i3 = i17;
                    int absoluteGravity = Gravity.getAbsoluteGravity(m56433(c15579.f50661), layoutDirection) & 7;
                    i4 = i16;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iM56411);
                    } else {
                        if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                            iMax = Math.max(0, iM56411 - paddingLeft);
                        }
                        if (z2 || view.getFitsSystemWindows()) {
                            i6 = i;
                            iMakeMeasureSpec = i2;
                        } else {
                            int iM12814 = c25276.mLastInsets.m12814() + c25276.mLastInsets.m12822();
                            int iM12825 = c25276.mLastInsets.m12825() + c25276.mLastInsets.m12824();
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - iM12814, mode);
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2 - iM12825, mode2);
                            i6 = iMakeMeasureSpec2;
                        }
                        abstractC11103 = c15579.f50657;
                        if (abstractC11103 != null) {
                            c15578 = c15579;
                            i9 = i3;
                            i8 = i18;
                            i10 = i4;
                            i7 = i15;
                            i11 = size3;
                            if (!abstractC11103.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                            }
                            C15578 c155710 = c15578;
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c155710).leftMargin + ((ViewGroup.MarginLayoutParams) c155710).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c155710).topMargin + ((ViewGroup.MarginLayoutParams) c155710).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                            i15 = iMax2;
                            i16 = iMax3;
                            c25276 = this;
                        } else {
                            c15578 = c15579;
                            i7 = i15;
                            i8 = i18;
                            i9 = i3;
                            i10 = i4;
                            i11 = size3;
                        }
                        onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                        C15578 c155711 = c15578;
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c155711).leftMargin + ((ViewGroup.MarginLayoutParams) c155711).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c155711).topMargin + ((ViewGroup.MarginLayoutParams) c155711).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax4;
                        i16 = iMax5;
                        c25276 = this;
                    }
                    i5 = iMax;
                    if (z2) {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    } else {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    }
                    abstractC11103 = c15579.f50657;
                    if (abstractC11103 != null) {
                        c15578 = c15579;
                        i9 = i3;
                        i8 = i18;
                        i10 = i4;
                        i7 = i15;
                        i11 = size3;
                        if (!abstractC11103.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                        }
                        C15578 c155712 = c15578;
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c155712).leftMargin + ((ViewGroup.MarginLayoutParams) c155712).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c155712).topMargin + ((ViewGroup.MarginLayoutParams) c155712).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax6;
                        i16 = iMax7;
                        c25276 = this;
                    } else {
                        c15578 = c15579;
                        i7 = i15;
                        i8 = i18;
                        i9 = i3;
                        i10 = i4;
                        i11 = size3;
                    }
                    onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                    C15578 c155713 = c15578;
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c155713).leftMargin + ((ViewGroup.MarginLayoutParams) c155713).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c155713).topMargin + ((ViewGroup.MarginLayoutParams) c155713).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax8;
                    i16 = iMax9;
                    c25276 = this;
                }
                i5 = 0;
                if (z2) {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                } else {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                }
                abstractC11103 = c15579.f50657;
                if (abstractC11103 != null) {
                    c15578 = c15579;
                    i9 = i3;
                    i8 = i18;
                    i10 = i4;
                    i7 = i15;
                    i11 = size3;
                    if (!abstractC11103.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                    }
                    C15578 c155714 = c15578;
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c155714).leftMargin + ((ViewGroup.MarginLayoutParams) c155714).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c155714).topMargin + ((ViewGroup.MarginLayoutParams) c155714).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax10;
                    i16 = iMax11;
                    c25276 = this;
                } else {
                    c15578 = c15579;
                    i7 = i15;
                    i8 = i18;
                    i9 = i3;
                    i10 = i4;
                    i11 = size3;
                }
                onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                C15578 c155715 = c15578;
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c155715).leftMargin + ((ViewGroup.MarginLayoutParams) c155715).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c155715).topMargin + ((ViewGroup.MarginLayoutParams) c155715).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                i15 = iMax12;
                i16 = iMax13;
                c25276 = this;
            }
            i17 = i9 + 1;
            size3 = i11;
        }
        int i20 = iCombineMeasuredStates;
        c25276.setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i20), View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3977 m56414(C3977 c3977) {
        AbstractC11103 abstractC11103;
        if (c3977.m12828()) {
            return c3977;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int i2 = C22666.f73603;
            if (childAt.getFitsSystemWindows() && (abstractC11103 = ((C15578) childAt.getLayoutParams()).f50657) != null) {
                c3977 = abstractC11103.onApplyWindowInsets(this, childAt, c3977);
                if (c3977.m12828()) {
                    return c3977;
                }
            }
        }
        return c3977;
    }

    public void onLayoutChild(View view, int i) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        View view2 = c15578.f50660;
        if (view2 == null && c15578.f50664 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m56421(view, view2, i);
            return;
        }
        int i2 = c15578.f50669;
        if (i2 >= 0) {
            m56418(view, i2, i);
        } else {
            m56417(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC11103 abstractC11103;
        int i5 = C22666.f73603;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.mDependencySortedChildren.get(i6);
            if (view.getVisibility() != 8 && ((abstractC11103 = ((C15578) view.getLayoutParams()).f50657) == null || !abstractC11103.onLayoutChild(this, view, layoutDirection))) {
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
        C3977 c3977 = this.mLastInsets;
        int iM12824 = c3977 != null ? c3977.m12824() : 0;
        if (iM12824 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM12824);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m56428();
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C15578) view.getLayoutParams()).f50663.set(rect);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C15578) view.getLayoutParams()).f50663);
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
    private void m56419(View view, int i, Rect rect, Rect rect2, C15578 c15578, int i2, int i3) {
        int iWidth;
        int iHeight;
        int absoluteGravity = Gravity.getAbsoluteGravity(m56430(c15578.f50661), i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m56427(c15578.f50659), i);
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
    private void m56423(C15578 c15578, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c15578).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c15578).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c15578).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c15578).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m56419(view, i, rect, rect2, c15578, measuredWidth, measuredHeight);
        m56423(c15578, rect2, measuredWidth, measuredHeight);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56421(View view, View view2, int i) {
        Rect rectM56413 = m56413();
        Rect rectM56414 = m56413();
        try {
            getDescendantRect(view2, rectM56413);
            getDesiredAnchoredChildRect(view, i, rectM56413, rectM56414);
            view.layout(rectM56414.left, rectM56414.top, rectM56414.right, rectM56414.bottom);
        } finally {
            m56416(rectM56413);
            m56416(rectM56414);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56418(View view, int i, int i2) {
        int i3;
        C15578 c15578 = (C15578) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(m56433(c15578.f50661), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM56411 = m56411(i) - measuredWidth;
        if (i4 == 1) {
            iM56411 += measuredWidth / 2;
        } else if (i4 == 5) {
            iM56411 += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c15578).leftMargin, Math.min(iM56411, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c15578).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c15578).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c15578).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56417(View view, int i) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        Rect rectM56413 = m56413();
        rectM56413.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c15578).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c15578).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c15578).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c15578).bottomMargin);
        if (this.mLastInsets != null) {
            int i2 = C22666.f73603;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectM56413.left = this.mLastInsets.m12822() + rectM56413.left;
                rectM56413.top = this.mLastInsets.m12824() + rectM56413.top;
                rectM56413.right -= this.mLastInsets.m12814();
                rectM56413.bottom -= this.mLastInsets.m12825();
            }
        }
        Rect rectM56414 = m56413();
        Gravity.apply(m56427(c15578.f50661), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM56413, rectM56414, i);
        view.layout(rectM56414.left, rectM56414.top, rectM56414.right, rectM56414.bottom);
        m56416(rectM56413);
        m56416(rectM56414);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        AbstractC11103 abstractC11103 = c15578.f50657;
        if (abstractC11103 != null) {
            float scrimOpacity = abstractC11103.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c15578.f50657.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(m56412(Math.round(scrimOpacity * 255.0f), 0, 255));
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
        AbstractC11103 abstractC11103;
        boolean zOnDependentViewChanged;
        int i3 = C22666.f73603;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectM56413 = m56413();
        Rect rectM56414 = m56413();
        Rect rectM56415 = m56413();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.mDependencySortedChildren.get(i4);
            C15578 c15578 = (C15578) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (c15578.f50665 == ((View) this.mDependencySortedChildren.get(i5))) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, rectM56414);
                if (c15578.f50672 != 0 && !rectM56414.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c15578.f50672, layoutDirection);
                    int i6 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i6 == 48) {
                        rectM56413.top = Math.max(rectM56413.top, rectM56414.bottom);
                    } else if (i6 == 80) {
                        rectM56413.bottom = Math.max(rectM56413.bottom, getHeight() - rectM56414.top);
                    }
                    int i7 = absoluteGravity & 7;
                    if (i7 == 3) {
                        rectM56413.left = Math.max(rectM56413.left, rectM56414.right);
                    } else if (i7 == 5) {
                        rectM56413.right = Math.max(rectM56413.right, getWidth() - rectM56414.left);
                    }
                }
                if (c15578.f50671 != 0 && view.getVisibility() == 0) {
                    m56420(view, rectM56413, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, rectM56415);
                    if (!rectM56415.equals(rectM56414)) {
                        recordLastChildRect(view, rectM56414);
                        for (i2 = i4 + 1; i2 < size; i2++) {
                            View view2 = (View) this.mDependencySortedChildren.get(i2);
                            C15578 c15579 = (C15578) view2.getLayoutParams();
                            abstractC11103 = c15579.f50657;
                            if (abstractC11103 == null && abstractC11103.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && c15579.m37311()) {
                                    c15579.m37309();
                                } else {
                                    if (i == 2) {
                                        abstractC11103.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    } else {
                                        zOnDependentViewChanged = abstractC11103.onDependentViewChanged(this, view2, view);
                                    }
                                    if (i == 1) {
                                        c15579.m37303(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = (View) this.mDependencySortedChildren.get(i2);
                        C15578 c155710 = (C15578) view3.getLayoutParams();
                        abstractC11103 = c155710.f50657;
                        if (abstractC11103 == null) {
                        }
                    }
                }
            }
        }
        m56416(rectM56413);
        m56416(rectM56414);
        m56416(rectM56415);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56420(View view, Rect rect, int i) {
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
        int i8 = C22666.f73603;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            C15578 c15578 = (C15578) view.getLayoutParams();
            AbstractC11103 abstractC11103 = c15578.f50657;
            Rect rectM56413 = m56413();
            Rect rectM56414 = m56413();
            rectM56414.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC11103 != null && abstractC11103.getInsetDodgeRect(this, view, rectM56413)) {
                if (!rectM56414.contains(rectM56413)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM56413.toShortString() + " | Bounds:" + rectM56414.toShortString());
                }
            } else {
                rectM56413.set(rectM56414);
            }
            m56416(rectM56414);
            if (!rectM56413.isEmpty()) {
                int absoluteGravity = Gravity.getAbsoluteGravity(c15578.f50671, i);
                boolean z3 = true;
                if ((absoluteGravity & 48) != 48 || (i6 = (rectM56413.top - ((ViewGroup.MarginLayoutParams) c15578).topMargin) - c15578.f50670) >= (i7 = rect.top)) {
                    z = false;
                } else {
                    m56429(view, i7 - i6);
                    z = true;
                }
                if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectM56413.bottom) - ((ViewGroup.MarginLayoutParams) c15578).bottomMargin) + c15578.f50670) < (i5 = rect.bottom)) {
                    m56429(view, height - i5);
                    z = true;
                }
                if (!z) {
                    m56429(view, 0);
                }
                if ((absoluteGravity & 3) != 3 || (i3 = (rectM56413.left - ((ViewGroup.MarginLayoutParams) c15578).leftMargin) - c15578.f50658) >= (i4 = rect.left)) {
                    z2 = false;
                } else {
                    m56432(view, i4 - i3);
                    z2 = true;
                }
                if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectM56413.right) - ((ViewGroup.MarginLayoutParams) c15578).rightMargin) + c15578.f50658) >= (i2 = rect.right)) {
                    z3 = z2;
                } else {
                    m56432(view, width - i2);
                }
                if (!z3) {
                    m56432(view, 0);
                }
                m56416(rectM56413);
                return;
            }
            m56416(rectM56413);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56432(View view, int i) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        int i2 = c15578.f50658;
        if (i2 != i) {
            C22666.m51120(i - i2, view);
            c15578.f50658 = i;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56429(View view, int i) {
        C15578 c15578 = (C15578) view.getLayoutParams();
        int i2 = c15578.f50670;
        if (i2 != i) {
            C22666.m51107(i - i2, view);
            c15578.f50670 = i;
        }
    }

    public void dispatchDependentViewsChanged(View view) {
        List listM40205 = this.mChildDag.m40205(view);
        if (listM40205 == null || listM40205.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM40205.size(); i++) {
            View view2 = (View) listM40205.get(i);
            AbstractC11103 abstractC11103 = ((C15578) view2.getLayoutParams()).f50657;
            if (abstractC11103 != null) {
                abstractC11103.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public List getDependencies(View view) {
        ArrayList arrayListM40209 = this.mChildDag.m40209(view);
        this.mTempDependenciesList.clear();
        if (arrayListM40209 != null) {
            this.mTempDependenciesList.addAll(arrayListM40209);
        }
        return this.mTempDependenciesList;
    }

    public List getDependents(View view) {
        List listM40205 = this.mChildDag.m40205(view);
        this.mTempDependenciesList.clear();
        if (listM40205 != null) {
            this.mTempDependenciesList.addAll(listM40205);
        }
        return this.mTempDependenciesList;
    }

    public final List getDependencySortedChildren() {
        m56431();
        return C4681.unmodifiableList(this.mDependencySortedChildren);
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (m56426(getChildAt(i))) {
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
    private boolean m56426(View view) {
        return this.mChildDag.m40206(view);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC13341(this);
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
        AbstractC11103 abstractC11103;
        C15578 c15578 = (C15578) view.getLayoutParams();
        if (c15578.f50660 != null) {
            Rect rectM56413 = m56413();
            Rect rectM56414 = m56413();
            Rect rectM56415 = m56413();
            getDescendantRect(c15578.f50660, rectM56413);
            getChildRect(view, false, rectM56414);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m56419(view, i, rectM56413, rectM56415, c15578, measuredWidth, measuredHeight);
            boolean z = (rectM56415.left == rectM56414.left && rectM56415.top == rectM56414.top) ? false : true;
            m56423(c15578, rectM56415, measuredWidth, measuredHeight);
            int i2 = rectM56415.left - rectM56414.left;
            int i3 = rectM56415.top - rectM56414.top;
            if (i2 != 0) {
                C22666.m51120(i2, view);
            }
            if (i3 != 0) {
                C22666.m51107(i3, view);
            }
            if (z && (abstractC11103 = c15578.f50657) != null) {
                abstractC11103.onDependentViewChanged(this, view, c15578.f50660);
            }
            m56416(rectM56413);
            m56416(rectM56414);
            m56416(rectM56415);
        }
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect rectM56413 = m56413();
        getDescendantRect(view, rectM56413);
        try {
            return rectM56413.contains(i, i2);
        } finally {
            m56416(rectM56413);
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM56413 = m56413();
        getChildRect(view, view.getParent() != this, rectM56413);
        Rect rectM56414 = m56413();
        getChildRect(view2, view2.getParent() != this, rectM56414);
        try {
            if (rectM56413.left <= rectM56414.right && rectM56413.top <= rectM56414.bottom && rectM56413.right >= rectM56414.left && rectM56413.bottom >= rectM56414.top) {
                z = true;
            }
            return z;
        } finally {
            m56416(rectM56413);
            m56416(rectM56414);
        }
    }

    @Override // android.view.ViewGroup
    public C15578 generateLayoutParams(AttributeSet attributeSet) {
        return new C15578(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C15578 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C15578) {
            return new C15578((C15578) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C15578((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C15578(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C15578 generateDefaultLayoutParams() {
        return new C15578();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C15578) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // l.InterfaceC4591
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C15578 c15578 = (C15578) childAt.getLayoutParams();
                AbstractC11103 abstractC11103 = c15578.f50657;
                if (abstractC11103 != null) {
                    boolean zOnStartNestedScroll = abstractC11103.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    c15578.m37301(i2, zOnStartNestedScroll);
                    z |= zOnStartNestedScroll;
                } else {
                    c15578.m37301(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // l.InterfaceC4591
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC11103 abstractC11103;
        this.mNestedScrollingParentHelper.m27006(i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C15578 c15578 = (C15578) childAt.getLayoutParams();
            if (c15578.m37305(i2) && (abstractC11103 = c15578.f50657) != null) {
                abstractC11103.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // l.InterfaceC4591
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m27008(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C15578 c15578 = (C15578) childAt.getLayoutParams();
            if (c15578.m37305(i)) {
                AbstractC11103 abstractC11103 = c15578.f50657;
                if (abstractC11103 != null) {
                    abstractC11103.onStopNestedScroll(this, childAt, view, i);
                }
                c15578.m37301(i, false);
                c15578.m37309();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // l.InterfaceC4591
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // l.InterfaceC21745
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC11103 abstractC11103;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C15578 c15578 = (C15578) childAt.getLayoutParams();
                if (c15578.m37305(i5) && (abstractC11103 = c15578.f50657) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC11103.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
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

    @Override // l.InterfaceC4591
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC11103 abstractC11103;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C15578 c15578 = (C15578) childAt.getLayoutParams();
                if (c15578.m37305(i3) && (abstractC11103 = c15578.f50657) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC11103.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
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
        AbstractC11103 abstractC11103;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C15578 c15578 = (C15578) childAt.getLayoutParams();
                if (c15578.m37305(0) && (abstractC11103 = c15578.f50657) != null) {
                    zOnNestedFling |= abstractC11103.onNestedFling(this, childAt, view, f, f2, z);
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
        AbstractC11103 abstractC11103;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C15578 c15578 = (C15578) childAt.getLayoutParams();
                if (c15578.m37305(0) && (abstractC11103 = c15578.f50657) != null) {
                    zOnNestedPreFling |= abstractC11103.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m27004();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2155)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2155 c2155 = (C2155) parcelable;
        super.onRestoreInstanceState(c2155.getSuperState());
        SparseArray sparseArray = c2155.f7106;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC11103 abstractC11103 = getResolvedLayoutParams(childAt).f50657;
            if (id != -1 && abstractC11103 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC11103.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        C2155 c2155 = new C2155(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC11103 abstractC11103 = ((C15578) childAt.getLayoutParams()).f50657;
            if (id != -1 && abstractC11103 != null && (parcelableOnSaveInstanceState = abstractC11103.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        c2155.f7106 = sparseArray;
        return c2155;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC11103 abstractC11103 = ((C15578) view.getLayoutParams()).f50657;
        if (abstractC11103 == null || !abstractC11103.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56428() {
        int i = C22666.f73603;
        if (getFitsSystemWindows()) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new C5138(this);
            }
            C22666.m51097(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        C22666.m51097(this, (InterfaceC22491) null);
    }
}
