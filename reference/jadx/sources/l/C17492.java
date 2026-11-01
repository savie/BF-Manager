package l;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.umeng.analytics.pro.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public class C17492 extends ViewGroup implements InterfaceC2145 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final float FLING_DESTRETCH_FACTOR = 4.0f;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    public static final float INFLEXION = 0.35f;
    public static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    public static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    public static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static boolean sDebugAssertionsEnabled;
    public static final C20315 sDefaultEdgeEffectFactory;
    public static final Interpolator sQuinticInterpolator;
    public static boolean sVerboseLoggingEnabled;
    public C11143 mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public AbstractC0414 mAdapter;
    public C9942 mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public InterfaceC17348 mChildDrawingOrderCallback;
    public C19820 mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public C6059 mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public RunnableC9007 mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public InterfaceC4086 mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public AbstractC1825 mItemAnimator;
    public InterfaceC23699 mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public AbstractC5498 mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final C18904 mObserver;
    public List mOnChildAttachStateListeners;
    public AbstractC13260 mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    public final List mPendingAccessibilityImportanceChange;
    public C19610 mPendingSavedState;
    public final float mPhysicalCoef;
    public boolean mPostedAnimatorRunner;
    public C8301 mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final C21726 mRecycler;
    public InterfaceC18198 mRecyclerListener;
    public final List mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public AbstractC6909 mScrollListener;
    public List mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public C9908 mScrollingChildHelper;
    public final C16082 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final RunnableC16787 mViewFlinger;
    public final InterfaceC18573 mViewInfoProcessCallback;
    public final C7990 mViewInfoStore;
    public static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setEdgeEffectFactory(C6059 c6059) {
        c6059.getClass();
        this.mEdgeEffectFactory = c6059;
        invalidateGlows();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC8882();
        sDefaultEdgeEffectFactory = new C20315();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40729(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40749(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public C17492(Context context) {
        this(context, null);
    }

    public C17492(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C17492(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C18904(this);
        this.mRecycler = new C21726(this);
        this.mViewInfoStore = new C7990();
        this.mUpdateChildViewsRunnable = new RunnableC8176(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C2885();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC16787(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C8301() : null;
        C16082 c16082 = new C16082();
        c16082.f52022 = -1;
        c16082.f52013 = 0;
        c16082.f52014 = 0;
        c16082.f52018 = 1;
        c16082.f52011 = 0;
        c16082.f52020 = false;
        c16082.f52015 = false;
        c16082.f52021 = false;
        c16082.f52023 = false;
        c16082.f52024 = false;
        c16082.f52016 = false;
        this.mState = c16082;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C9588(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC19465(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C10293(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C3619.m10724(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C3619.m10723(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m5956(this.mItemAnimatorListener);
        initAdapterManager();
        m40737();
        m40709();
        int i2 = C5031.f17539;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C11143(this));
        int[] iArr = C19114.f61753;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C5031.m13983(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        m40719(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C5031.m13983(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(bin.mt.plus.R.id.MT_Protector, Boolean.TRUE);
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m40709() {
        if (C5031.m13976(this) == 0) {
            C5031.m13994((ViewGroup) this, 8);
        }
    }

    public C11143 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C11143 c11143) {
        this.mAccessibilityDelegate = c11143;
        C5031.m13990(this, c11143);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40719(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM40713 = m40713(context, strTrim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> clsAsSubclass = Class.forName(strM40713, false, classLoader).asSubclass(AbstractC5498.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM40713, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC5498) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM40713, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM40713, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM40713, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM40713, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM40713, e7);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m40713(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return C17492.class.getPackage().getName() + '.' + str;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m40737() {
        this.mChildHelper = new C19820(new C7470(this));
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C9942(new C20876(this));
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void swapAdapter(AbstractC0414 abstractC0414, boolean z) {
        setLayoutFrozen(false);
        m40722(abstractC0414, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(AbstractC0414 abstractC0414) {
        setLayoutFrozen(false);
        m40722(abstractC0414, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        AbstractC1825 abstractC1825 = this.mItemAnimator;
        if (abstractC1825 != null) {
            abstractC1825.mo5963();
        }
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C21726 c21726 = this.mRecycler;
        c21726.f70436.clear();
        c21726.m48482();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40722(AbstractC0414 abstractC0414, boolean z, boolean z2) {
        AbstractC0414 abstractC0415 = this.mAdapter;
        if (abstractC0415 != null) {
            abstractC0415.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m25165();
        AbstractC0414 abstractC0416 = this.mAdapter;
        this.mAdapter = abstractC0414;
        if (abstractC0414 != null) {
            abstractC0414.registerAdapterDataObserver(this.mObserver);
            abstractC0414.onAttachedToRecyclerView(this);
        }
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.onAdapterChanged(abstractC0416, this.mAdapter);
        }
        this.mRecycler.m48478(abstractC0416, this.mAdapter, z);
        this.mState.f52020 = true;
    }

    public AbstractC0414 getAdapter() {
        return this.mAdapter;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC18198 interfaceC18198) {
        this.mRecyclerListener = interfaceC18198;
    }

    public void addRecyclerListener(InterfaceC18198 interfaceC18198) {
        C9535.m24384("'listener' arg cannot be null.", interfaceC18198 != null);
        this.mRecyclerListeners.add(interfaceC18198);
    }

    public void removeRecyclerListener(InterfaceC18198 interfaceC18198) {
        this.mRecyclerListeners.remove(interfaceC18198);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            return abstractC5498.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC1264 interfaceC1264) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC1264);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC1264 interfaceC1264) {
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC1264);
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(AbstractC5498 abstractC5498) {
        if (abstractC5498 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC1825 abstractC1825 = this.mItemAnimator;
            if (abstractC1825 != null) {
                abstractC1825.mo5963();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C21726 c21726 = this.mRecycler;
            c21726.f70436.clear();
            c21726.m48482();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C21726 c21727 = this.mRecycler;
            c21727.f70436.clear();
            c21727.m48482();
        }
        C19820 c19820 = this.mChildHelper;
        C17492 c17492 = c19820.f63625.f24878;
        c19820.f63622.m37247();
        ArrayList arrayList = c19820.f63624;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AbstractC12554 abstractC12554M40745 = m40745((View) arrayList.get(size));
            if (abstractC12554M40745 != null) {
                abstractC12554M40745.onLeftHiddenState(c17492);
            }
            arrayList.remove(size);
        }
        int childCount = c17492.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c17492.getChildAt(i);
            c17492.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c17492.removeAllViews();
        this.mLayout = abstractC5498;
        if (abstractC5498 != null) {
            if (abstractC5498.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC5498 + " is already attached to a RecyclerView:" + abstractC5498.mRecyclerView.exceptionLabel());
            }
            abstractC5498.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m48489();
        requestLayout();
    }

    public void setOnFlingListener(AbstractC13260 abstractC13260) {
        this.mOnFlingListener = abstractC13260;
    }

    public AbstractC13260 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C19610 c19610 = new C19610(super.onSaveInstanceState());
        C19610 c19611 = this.mPendingSavedState;
        if (c19611 == null) {
            AbstractC5498 abstractC5498 = this.mLayout;
            if (abstractC5498 != null) {
                c19610.f62961 = abstractC5498.onSaveInstanceState();
                return c19610;
            }
            c19610.f62961 = null;
            return c19610;
        }
        c19610.f62961 = c19611.f62961;
        return c19610;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19610)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19610 c19610 = (C19610) parcelable;
        this.mPendingSavedState = c19610;
        super.onRestoreInstanceState(c19610.getSuperState());
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40723(AbstractC12554 abstractC12554) {
        View view = abstractC12554.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m48488(getChildViewHolder(view));
        if (abstractC12554.isTmpDetached()) {
            this.mChildHelper.m45065(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m45066(view, -1, true);
        } else {
            this.mChildHelper.m45064(view);
        }
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM45061 = this.mChildHelper.m45061(view);
        if (zM45061) {
            AbstractC12554 abstractC12554M40745 = m40745(view);
            this.mRecycler.m48488(abstractC12554M40745);
            this.mRecycler.m48479(abstractC12554M40745);
            if (sVerboseLoggingEnabled) {
                C13638.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!zM45061);
        return zM45061;
    }

    public AbstractC5498 getLayoutManager() {
        return this.mLayout;
    }

    public C15377 getRecycledViewPool() {
        return this.mRecycler.m48476();
    }

    public void setRecycledViewPool(C15377 c15377) {
        this.mRecycler.m48481(c15377);
    }

    public void setViewCacheExtension(AbstractC0558 abstractC0558) {
        this.mRecycler.getClass();
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m48473(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i;
        if (i != 2) {
            m40739();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(AbstractC3236 abstractC3236, int i) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC3236);
        } else {
            this.mItemDecorations.add(i, abstractC3236);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(AbstractC3236 abstractC3236) {
        addItemDecoration(abstractC3236, -1);
    }

    public AbstractC3236 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return (AbstractC3236) this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(AbstractC3236 abstractC3236) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC3236);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC17348 interfaceC17348) {
        if (interfaceC17348 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC17348;
        setChildrenDrawingOrderEnabled(interfaceC17348 != null);
    }

    @Deprecated
    public void setOnScrollListener(AbstractC6909 abstractC6909) {
        this.mScrollListener = abstractC6909;
    }

    public void addOnScrollListener(AbstractC6909 abstractC6909) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC6909);
    }

    public void removeOnScrollListener(AbstractC6909 abstractC6909) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC6909);
        }
    }

    public void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            return;
        }
        abstractC5498.scrollToPosition(i);
        awakenScrollBars();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i) {
        AbstractC5498 abstractC5498;
        if (this.mLayoutSuppressed || (abstractC5498 = this.mLayout) == null) {
            return;
        }
        abstractC5498.smoothScrollToPosition(this, this.mState, i);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC5498.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public void nestedScrollBy(int i, int i2) {
        m40717(i, i2, (MotionEvent) null, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40717(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC5498.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM40711 = i - m40711(i, height);
        int iM40744 = i2 - m40744(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM40711 : 0, zCanScrollVertically ? iM40744 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iM40711 -= iArr2[0];
            iM40744 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iM40711 : 0, zCanScrollVertically ? iM40744 : 0, motionEvent, i3);
        RunnableC9007 runnableC9007 = this.mGapWorker;
        if (runnableC9007 != null && (iM40711 != 0 || iM40744 != 0)) {
            runnableC9007.m23323(this, iM40711, iM40744);
        }
        stopNestedScroll(i3);
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = C8684.f29888;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = C8684.f29888;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
        } else {
            if (!this.mAdapterHelper.m25166()) {
                return;
            }
            if (this.mAdapterHelper.m25162(4) && !this.mAdapterHelper.m25162(11)) {
                int i2 = C8684.f29888;
                Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m25156();
                if (!this.mLayoutWasDefered) {
                    if (m40743()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m25159();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else {
                if (this.mAdapterHelper.m25166()) {
                    int i3 = C8684.f29888;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m40743() {
        int iM45062 = this.mChildHelper.m45062();
        for (int i = 0; i < iM45062; i++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45072(i));
            if (abstractC12554M40745 != null && !abstractC12554M40745.shouldIgnore() && abstractC12554M40745.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & o.a.r) != 8194) {
                m40716(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m40711(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C0883.m3556(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C0883.m3558(this.mLeftGlow, -width, 1.0f - height);
                if (C0883.m3556(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && C0883.m3556(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fM3558 = C0883.m3558(this.mRightGlow, width, height);
                    if (C0883.m3556(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fM3558;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m40744(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C0883.m3556(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C0883.m3558(this.mTopGlow, -height, width);
                if (C0883.m3556(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && C0883.m3556(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fM3558 = C0883.m3558(this.mBottomGlow, height, 1.0f - width);
                    if (C0883.m3556(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fM3558;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null && abstractC5498.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null && abstractC5498.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null && abstractC5498.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null && abstractC5498.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null && abstractC5498.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null && abstractC5498.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null || this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC5498.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.m39439(i, i2, interpolator, i3);
            return;
        }
        scrollBy(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public boolean fling(int i, int i2) {
        int i3;
        int i4;
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null || this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC5498.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            i3 = i;
            i = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect != null && C0883.m3556(edgeEffect) != 0.0f) {
                int i5 = -i;
                if (m40734(this.mLeftGlow, i5, getWidth())) {
                    this.mLeftGlow.onAbsorb(i5);
                    i = 0;
                }
            } else {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || C0883.m3556(edgeEffect2) == 0.0f) {
                    i3 = i;
                    i = 0;
                } else if (m40734(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            }
            i3 = 0;
        }
        if (i2 == 0) {
            i4 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 != null && C0883.m3556(edgeEffect3) != 0.0f) {
                int i6 = -i2;
                if (m40734(this.mTopGlow, i6, getHeight())) {
                    this.mTopGlow.onAbsorb(i6);
                    i2 = 0;
                }
            } else {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || C0883.m3556(edgeEffect4) == 0.0f) {
                    i4 = i2;
                    i2 = 0;
                } else if (m40734(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            }
            i4 = 0;
        }
        if (i != 0 || i2 != 0) {
            int i7 = this.mMaxFlingVelocity;
            i = Math.max(-i7, Math.min(i, i7));
            int i8 = this.mMaxFlingVelocity;
            i2 = Math.max(-i8, Math.min(i2, i8));
            this.mViewFlinger.m39438(i, i2);
        }
        if (i3 == 0 && i4 == 0) {
            return (i == 0 && i2 == 0) ? false : true;
        }
        float f = i3;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC13260 abstractC13260 = this.mOnFlingListener;
            if (abstractC13260 != null && abstractC13260.onFling(i3, i4)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i9 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i9, Math.min(i3, i9));
                int i10 = this.mMaxFlingVelocity;
                this.mViewFlinger.m39438(iMax, Math.max(-i10, Math.min(i4, i10)));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40734(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return m40710(-i) < C0883.m3556(edgeEffect) * ((float) i2);
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return m40712(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return m40712(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m40712(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C0883.m3556(edgeEffect) != 0.0f) {
            int iRound = Math.round(C0883.m3558(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || C0883.m3556(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(C0883.m3558(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public void stopScroll() {
        setScrollState(0);
        m40739();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m40739() {
        RunnableC16787 runnableC16787 = this.mViewFlinger;
        runnableC16787.f53774.removeCallbacks(runnableC16787);
        runnableC16787.f53775.abortAnimation();
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40716(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                C0883.m3558(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                C0883.m3558(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                C0883.m3558(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        C0883.m3558(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            C0883.m3558(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            C0883.m3558(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        int i2 = C5031.f17539;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40752() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            int i3 = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        int i3 = C5031.f17539;
        postInvalidateOnAnimation();
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((C20315) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((C20315) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((C20315) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((C20315) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public C6059 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return m40733(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m40721(viewOnFocusSearchFailed, (View) null);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40733(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            m40721(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40721(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C22432) {
            C22432 c22432 = (C22432) layoutParams;
            if (!c22432.f73215) {
                Rect rect = c22432.f73213;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null || !abstractC5498.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.m48483();
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = RunnableC9007.f30801;
            RunnableC9007 runnableC9007 = (RunnableC9007) threadLocal.get();
            this.mGapWorker = runnableC9007;
            if (runnableC9007 == null) {
                this.mGapWorker = new RunnableC9007();
                int i = C5031.f17539;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC9007 runnableC9008 = this.mGapWorker;
                runnableC9008.f30804 = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC9008);
            }
            ArrayList arrayList = this.mGapWorker.f30803;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC9007 runnableC9007;
        super.onDetachedFromWindow();
        AbstractC1825 abstractC1825 = this.mItemAnimator;
        if (abstractC1825 != null) {
            abstractC1825.mo5963();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C17867.f56569.mo5812() != null) {
        }
        this.mRecycler.m48472();
        C10763.m27067(this);
        if (!ALLOW_THREAD_GAP_WORK || (runnableC9007 = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = runnableC9007.f30803.remove(this);
        if (sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(exceptionLabel());
        throw new IllegalStateException(sbM23356.toString());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException("" + exceptionLabel());
        }
    }

    public void addOnItemTouchListener(InterfaceC4086 interfaceC4086) {
        this.mOnItemTouchListeners.add(interfaceC4086);
    }

    public void removeOnItemTouchListener(InterfaceC4086 interfaceC4086) {
        this.mOnItemTouchListeners.remove(interfaceC4086);
        if (this.mInterceptingOnItemTouchListener == interfaceC4086) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40732(MotionEvent motionEvent) {
        InterfaceC4086 interfaceC4086 = this.mInterceptingOnItemTouchListener;
        if (interfaceC4086 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m40750(motionEvent);
        }
        interfaceC4086.mo2546(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m40750(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC4086 interfaceC4086 = (InterfaceC4086) this.mOnItemTouchListeners.get(i);
            if (interfaceC4086.mo2548(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC4086;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (m40750(motionEvent)) {
            m40715();
            return true;
        }
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC5498.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (m40708(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m40715();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            m40742(motionEvent);
        }
        return this.mScrollState == 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m40708(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || C0883.m3556(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            C0883.m3558(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && C0883.m3556(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C0883.m3558(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && C0883.m3556(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C0883.m3558(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || C0883.m3556(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        C0883.m3558(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC4086) this.mOnItemTouchListeners.get(i)).mo2547(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[PHI: r0
      0x00c2: PHI (r0v39 int) = (r0v26 int), (r0v43 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (m40732(motionEvent)) {
            m40715();
            return true;
        }
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC5498.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (zCanScrollVertically) {
                i = zCanScrollHorizontally;
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            i = zCanScrollHorizontally;
            startNestedScroll(i, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                m40738();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMin = this.mLastTouchX - x2;
                int iMin2 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        if (iMin > 0) {
                            iMin = Math.max(0, iMin - this.mTouchSlop);
                        } else {
                            iMin = Math.min(0, iMin + this.mTouchSlop);
                        }
                        if (iMin != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (zCanScrollVertically) {
                        if (iMin2 > 0) {
                            iMin2 = Math.max(0, iMin2 - this.mTouchSlop);
                        } else {
                            iMin2 = Math.min(0, iMin2 + this.mTouchSlop);
                        }
                        if (iMin2 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iM40711 = iMin - m40711(iMin, motionEvent.getY());
                    int iM40744 = iMin2 - m40744(iMin2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM40711 : 0, zCanScrollVertically ? iM40744 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iM40711 -= iArr4[0];
                        iM40744 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i2 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i2 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i3 = iM40744;
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iM40711 : 0, zCanScrollVertically ? i3 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC9007 runnableC9007 = this.mGapWorker;
                    if (runnableC9007 != null && (iM40711 != 0 || i3 != 0)) {
                        runnableC9007.m23323(this, iM40711, i3);
                    }
                }
            } else if (actionMasked == 3) {
                m40715();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                m40742(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m40738() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m40752();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40715() {
        m40738();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40742(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue;
                } else if (this.mLayout.canScrollHorizontally()) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                m40717((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC5498.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f52018 == 1) {
                m40741();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f52023 = true;
            m40707();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f52023 = true;
                m40707();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            m40751();
            onExitLayoutOrScroll();
            C16082 c16082 = this.mState;
            if (c16082.f52016) {
                c16082.f52015 = true;
            } else {
                this.mAdapterHelper.m25168();
                this.mState.f52015 = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f52016) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0414 abstractC0414 = this.mAdapter;
        if (abstractC0414 != null) {
            this.mState.f52011 = abstractC0414.getItemCount();
        } else {
            this.mState.f52011 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f52015 = false;
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i3 = C5031.f17539;
        setMeasuredDimension(AbstractC5498.m15187(i, paddingRight, getMinimumWidth()), AbstractC5498.m15187(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(AbstractC1825 abstractC1825) {
        AbstractC1825 abstractC1826 = this.mItemAnimator;
        if (abstractC1826 != null) {
            abstractC1826.mo5963();
            this.mItemAnimator.m5956((InterfaceC23699) null);
        }
        this.mItemAnimator = abstractC1825;
        if (abstractC1825 != null) {
            abstractC1825.m5956(this.mItemAnimatorListener);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                m40746();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40746() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public AbstractC1825 getItemAnimator() {
        return this.mItemAnimator;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        int i = C5031.f17539;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m40757() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m40751() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m25165();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (m40757()) {
            this.mAdapterHelper.m25156();
        } else {
            this.mAdapterHelper.m25168();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f52024 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C16082 c16082 = this.mState;
        c16082.f52016 = c16082.f52024 && z2 && !this.mDataSetHasChangedAfterLayout && m40757();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f52023 = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f52018 == 1) {
            m40741();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m40707();
        } else {
            C9942 c9942 = this.mAdapterHelper;
            if ((!c9942.f33948.isEmpty() && !c9942.f33946.isEmpty()) || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                m40707();
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
            }
        }
        m40736();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m40754() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC12554 abstractC12554FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC12554FindContainingViewHolder == null) {
            m40753();
            return;
        }
        this.mState.f52019 = this.mAdapter.hasStableIds() ? abstractC12554FindContainingViewHolder.getItemId() : -1L;
        C16082 c16082 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = abstractC12554FindContainingViewHolder.isRemoved() ? abstractC12554FindContainingViewHolder.mOldPosition : abstractC12554FindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        c16082.f52017 = absoluteAdapterPosition;
        this.mState.f52012 = m40740(abstractC12554FindContainingViewHolder.itemView);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m40753() {
        C16082 c16082 = this.mState;
        c16082.f52019 = -1L;
        c16082.f52017 = -1;
        c16082.f52012 = -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private View m40756() {
        AbstractC12554 abstractC12554FindViewHolderForAdapterPosition;
        C16082 c16082 = this.mState;
        int i = c16082.f52017;
        if (i == -1) {
            i = 0;
        }
        int iM38108 = c16082.m38108();
        for (int i2 = i; i2 < iM38108; i2++) {
            AbstractC12554 abstractC12554FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC12554FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC12554FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC12554FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM38108, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC12554FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC12554FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC12554FindViewHolderForAdapterPosition.itemView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m40755() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f63624.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m45062() == 0) {
                requestFocus();
                return;
            }
        }
        View viewM40756 = null;
        AbstractC12554 abstractC12554FindViewHolderForItemId = (this.mState.f52019 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f52019);
        if (abstractC12554FindViewHolderForItemId != null) {
            if (this.mChildHelper.f63624.contains(abstractC12554FindViewHolderForItemId.itemView) || !abstractC12554FindViewHolderForItemId.itemView.hasFocusable()) {
                if (this.mChildHelper.m45062() > 0) {
                    viewM40756 = m40756();
                }
            } else {
                viewM40756 = abstractC12554FindViewHolderForItemId.itemView;
            }
        } else if (this.mChildHelper.m45062() > 0) {
            viewM40756 = m40756();
        }
        if (viewM40756 != null) {
            int i = this.mState.f52012;
            if (i != -1 && (viewFindViewById = viewM40756.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewM40756 = viewFindViewById;
            }
            viewM40756.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m40740(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void fillRemainingScrollValues(C16082 c16082) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f53775;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c16082.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c16082.getClass();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40741() {
        C17867 c17867;
        this.mState.m38109(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f52023 = false;
        startInterceptRequestLayout();
        C7990 c7990 = this.mViewInfoStore;
        c7990.f26225.clear();
        c7990.f26226.m22704();
        onEnterLayoutOrScroll();
        m40751();
        m40754();
        C16082 c16082 = this.mState;
        c16082.f52021 = c16082.f52024 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c16082.f52015 = c16082.f52016;
        c16082.f52011 = this.mAdapter.getItemCount();
        m40730(this.mMinMaxLayoutPositions);
        if (this.mState.f52024) {
            int iM45062 = this.mChildHelper.m45062();
            for (int i = 0; i < iM45062; i++) {
                AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45072(i));
                if (!abstractC12554M40745.shouldIgnore() && (!abstractC12554M40745.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC1825 abstractC1825 = this.mItemAnimator;
                    AbstractC1825.m5949(abstractC12554M40745);
                    abstractC12554M40745.getUnmodifiedPayloads();
                    abstractC1825.getClass();
                    C14527 c14527 = new C14527();
                    c14527.m34967(abstractC12554M40745);
                    C12274 c12274 = this.mViewInfoStore.f26225;
                    C17867 c17867M41454 = (C17867) c12274.getOrDefault(abstractC12554M40745, null);
                    if (c17867M41454 == null) {
                        c17867M41454 = C17867.m41454();
                        c12274.put(abstractC12554M40745, c17867M41454);
                    }
                    c17867M41454.f56571 = c14527;
                    c17867M41454.f56570 |= 4;
                    if (this.mState.f52021 && abstractC12554M40745.isUpdated() && !abstractC12554M40745.isRemoved() && !abstractC12554M40745.shouldIgnore() && !abstractC12554M40745.isInvalid()) {
                        this.mViewInfoStore.f26226.m22706(getChangedHolderKey(abstractC12554M40745), abstractC12554M40745);
                    }
                }
            }
        }
        if (this.mState.f52016) {
            saveOldPositions();
            C16082 c16083 = this.mState;
            boolean z = c16083.f52020;
            c16083.f52020 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c16083);
            this.mState.f52020 = z;
            for (int i2 = 0; i2 < this.mChildHelper.m45062(); i2++) {
                AbstractC12554 abstractC12554M40746 = m40745(this.mChildHelper.m45072(i2));
                if (!abstractC12554M40746.shouldIgnore() && ((c17867 = (C17867) this.mViewInfoStore.f26225.getOrDefault(abstractC12554M40746, null)) == null || (c17867.f56570 & 4) == 0)) {
                    AbstractC1825.m5949(abstractC12554M40746);
                    boolean zHasAnyOfTheFlags = abstractC12554M40746.hasAnyOfTheFlags(8192);
                    AbstractC1825 abstractC1826 = this.mItemAnimator;
                    abstractC12554M40746.getUnmodifiedPayloads();
                    abstractC1826.getClass();
                    C14527 c14528 = new C14527();
                    c14528.m34967(abstractC12554M40746);
                    if (!zHasAnyOfTheFlags) {
                        C12274 c12275 = this.mViewInfoStore.f26225;
                        C17867 c17867M41455 = (C17867) c12275.getOrDefault(abstractC12554M40746, null);
                        if (c17867M41455 == null) {
                            c17867M41455 = C17867.m41454();
                            c12275.put(abstractC12554M40746, c17867M41455);
                        }
                        c17867M41455.f56570 |= 2;
                        c17867M41455.f56571 = c14528;
                    } else {
                        recordAnimationInfoIfBouncedHiddenView(abstractC12554M40746, c14528);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f52018 = 2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m40707() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m38109(6);
        this.mAdapterHelper.m25168();
        this.mState.f52011 = this.mAdapter.getItemCount();
        this.mState.f52014 = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f62961;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C16082 c16082 = this.mState;
        c16082.f52015 = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c16082);
        C16082 c16083 = this.mState;
        c16083.f52020 = false;
        c16083.f52024 = c16083.f52024 && this.mItemAnimator != null;
        c16083.f52018 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m40736() {
        C14527 c14527;
        C14527 c14528;
        C10293 c10293;
        boolean zMo8682;
        int i;
        int i2;
        C10293 c10294;
        this.mState.m38109(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C16082 c16082 = this.mState;
        c16082.f52018 = 1;
        if (c16082.f52024) {
            for (int iM45062 = this.mChildHelper.m45062() - 1; iM45062 >= 0; iM45062--) {
                AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45072(iM45062));
                if (!abstractC12554M40745.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(abstractC12554M40745);
                    this.mItemAnimator.getClass();
                    C14527 c14529 = new C14527();
                    c14529.m34967(abstractC12554M40745);
                    AbstractC12554 abstractC12554 = (AbstractC12554) this.mViewInfoStore.f26226.m22709(changedHolderKey, null);
                    if (abstractC12554 == null || abstractC12554.shouldIgnore()) {
                        this.mViewInfoStore.m21051(abstractC12554M40745, c14529);
                    } else {
                        C17867 c17867 = (C17867) this.mViewInfoStore.f26225.getOrDefault(abstractC12554, null);
                        boolean z = (c17867 == null || (c17867.f56570 & 1) == 0) ? false : true;
                        C17867 c17868 = (C17867) this.mViewInfoStore.f26225.getOrDefault(abstractC12554M40745, null);
                        boolean z2 = (c17868 == null || (c17868.f56570 & 1) == 0) ? false : true;
                        if (z && abstractC12554 == abstractC12554M40745) {
                            this.mViewInfoStore.m21051(abstractC12554M40745, c14529);
                        } else {
                            C14527 c14527M21053 = this.mViewInfoStore.m21053(abstractC12554);
                            this.mViewInfoStore.m21051(abstractC12554M40745, c14529);
                            C14527 c14527M21050 = this.mViewInfoStore.m21050(abstractC12554M40745);
                            if (c14527M21053 == null) {
                                m40718(changedHolderKey, abstractC12554M40745, abstractC12554);
                            } else {
                                m40724(abstractC12554, abstractC12554M40745, c14527M21053, c14527M21050, z, z2);
                            }
                        }
                    }
                }
            }
            C7990 c7990 = this.mViewInfoStore;
            InterfaceC18573 interfaceC18573 = this.mViewInfoProcessCallback;
            C12274 c12274 = c7990.f26225;
            for (int size = c12274.size() - 1; size >= 0; size--) {
                AbstractC12554 abstractC12555 = (AbstractC12554) c12274.m30510(size);
                C17867 c17869 = (C17867) c12274.m30509(size);
                int i3 = c17869.f56570;
                if ((i3 & 3) == 3) {
                    c10294 = (C10293) interfaceC18573;
                } else {
                    if ((i3 & 1) != 0) {
                        C14527 c145210 = c17869.f56571;
                        if (c145210 == null) {
                            c10294 = (C10293) interfaceC18573;
                        } else {
                            C14527 c145211 = c17869.f56572;
                            C17492 c17492 = ((C10293) interfaceC18573).f35045;
                            c17492.mRecycler.m48488(abstractC12555);
                            c17492.animateDisappearance(abstractC12555, c145210, c145211);
                        }
                    } else {
                        if ((i3 & 14) == 14) {
                            c14527 = c17869.f56571;
                            c14528 = c17869.f56572;
                            c10293 = (C10293) interfaceC18573;
                        } else if ((i3 & 12) == 12) {
                            C14527 c145212 = c17869.f56571;
                            C14527 c145213 = c17869.f56572;
                            C10293 c10295 = (C10293) interfaceC18573;
                            c10295.getClass();
                            abstractC12555.setIsRecyclable(false);
                            C17492 c17493 = c10295.f35045;
                            if (c17493.mDataSetHasChangedAfterLayout) {
                                AbstractC14671 abstractC14671 = (AbstractC14671) c17493.mItemAnimator;
                                abstractC14671.getClass();
                                int i4 = c145212.f47589;
                                int i5 = c145212.f47590;
                                if (abstractC12555.shouldIgnore()) {
                                    int i6 = c145212.f47589;
                                    i2 = c145212.f47590;
                                    i = i6;
                                } else {
                                    i = c145213.f47589;
                                    i2 = c145213.f47590;
                                }
                                if (abstractC14671.mo8683(abstractC12555, abstractC12555, i4, i5, i, i2)) {
                                    c17493.postAnimationRunner();
                                }
                            } else {
                                AbstractC14671 abstractC14672 = (AbstractC14671) c17493.mItemAnimator;
                                abstractC14672.getClass();
                                int i7 = c145212.f47589;
                                int i8 = c145213.f47589;
                                if (i7 == i8 && c145212.f47590 == c145213.f47590) {
                                    abstractC14672.m5955(abstractC12555);
                                    zMo8682 = false;
                                } else {
                                    zMo8682 = abstractC14672.mo8682(abstractC12555, i7, c145212.f47590, i8, c145213.f47590);
                                }
                                if (zMo8682) {
                                    c17493.postAnimationRunner();
                                }
                            }
                        } else if ((i3 & 4) != 0) {
                            C14527 c145214 = c17869.f56571;
                            C17492 c17494 = ((C10293) interfaceC18573).f35045;
                            c17494.mRecycler.m48488(abstractC12555);
                            c17494.animateDisappearance(abstractC12555, c145214, null);
                        } else if ((i3 & 8) != 0) {
                            c14527 = c17869.f56571;
                            c14528 = c17869.f56572;
                            c10293 = (C10293) interfaceC18573;
                        }
                        c10293.f35045.animateAppearance(abstractC12555, c14527, c14528);
                    }
                    c17869.f56570 = 0;
                    c17869.f56571 = null;
                    c17869.f56572 = null;
                    C17867.f56569.mo5813(c17869);
                }
                C17492 c17495 = c10294.f35045;
                c17495.mLayout.removeAndRecycleView(abstractC12555.itemView, c17495.mRecycler);
                c17869.f56570 = 0;
                c17869.f56571 = null;
                c17869.f56572 = null;
                C17867.f56569.mo5813(c17869);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C16082 c16083 = this.mState;
        c16083.f52013 = c16083.f52011;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c16083.f52024 = false;
        c16083.f52016 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f70438;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC5498.mPrefetchMaxCountObserved = 0;
            abstractC5498.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m48489();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C7990 c7991 = this.mViewInfoStore;
        c7991.f26225.clear();
        c7991.f26226.m22704();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (m40731(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        m40755();
        m40753();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40718(long j, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555) {
        int iM45062 = this.mChildHelper.m45062();
        for (int i = 0; i < iM45062; i++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45072(i));
            if (abstractC12554M40745 != abstractC12554 && getChangedHolderKey(abstractC12554M40745) == j) {
                AbstractC0414 abstractC0414 = this.mAdapter;
                if (abstractC0414 != null && abstractC0414.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC12554M40745 + " \n View Holder 2:" + abstractC12554 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC12554M40745 + " \n View Holder 2:" + abstractC12554 + exceptionLabel());
            }
        }
        C13638.toString(abstractC12555);
        C13638.toString(abstractC12554);
        exceptionLabel();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC12554 abstractC12554, C14527 c14527) {
        abstractC12554.setFlags(0, 8192);
        if (this.mState.f52021 && abstractC12554.isUpdated() && !abstractC12554.isRemoved() && !abstractC12554.shouldIgnore()) {
            this.mViewInfoStore.f26226.m22706(getChangedHolderKey(abstractC12554), abstractC12554);
        }
        C12274 c12274 = this.mViewInfoStore.f26225;
        C17867 c17867M41454 = (C17867) c12274.getOrDefault(abstractC12554, null);
        if (c17867M41454 == null) {
            c17867M41454 = C17867.m41454();
            c12274.put(abstractC12554, c17867M41454);
        }
        c17867M41454.f56571 = c14527;
        c17867M41454.f56570 |= 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40730(int[] iArr) {
        int iM45062 = this.mChildHelper.m45062();
        if (iM45062 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM45062; i3++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45072(i3));
            if (!abstractC12554M40745.shouldIgnore()) {
                int layoutPosition = abstractC12554M40745.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40731(int i, int i2) {
        m40730(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC12554 abstractC12554M40745 = m40745(view);
        if (abstractC12554M40745 != null) {
            if (abstractC12554M40745.isTmpDetached()) {
                abstractC12554M40745.clearTmpDetachFlag();
            } else if (!abstractC12554M40745.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC12554M40745 + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public long getChangedHolderKey(AbstractC12554 abstractC12554) {
        return this.mAdapter.hasStableIds() ? abstractC12554.getItemId() : abstractC12554.mPosition;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public void animateAppearance(AbstractC12554 abstractC12554, C14527 c14527, C14527 c14528) {
        boolean zMo8682;
        abstractC12554.setIsRecyclable(false);
        AbstractC14671 abstractC14671 = (AbstractC14671) this.mItemAnimator;
        if (c14527 != null) {
            abstractC14671.getClass();
            int i = c14527.f47589;
            int i2 = c14528.f47589;
            if (i != i2 || c14527.f47590 != c14528.f47590) {
                zMo8682 = abstractC14671.mo8682(abstractC12554, i, c14527.f47590, i2, c14528.f47590);
            } else {
                abstractC14671.mo8681(abstractC12554);
                zMo8682 = true;
            }
        } else {
            abstractC14671.mo8681(abstractC12554);
            zMo8682 = true;
        }
        if (zMo8682) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC12554 abstractC12554, C14527 c14527, C14527 c14528) {
        boolean zMo8682;
        m40723(abstractC12554);
        abstractC12554.setIsRecyclable(false);
        AbstractC14671 abstractC14671 = (AbstractC14671) this.mItemAnimator;
        abstractC14671.getClass();
        int i = c14527.f47589;
        int i2 = c14527.f47590;
        View view = abstractC12554.itemView;
        int left = c14528 == null ? view.getLeft() : c14528.f47589;
        int top = c14528 == null ? view.getTop() : c14528.f47590;
        if (!abstractC12554.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zMo8682 = abstractC14671.mo8682(abstractC12554, i, i2, left, top);
        } else {
            abstractC14671.mo8684(abstractC12554);
            zMo8682 = true;
        }
        if (zMo8682) {
            postAnimationRunner();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40724(AbstractC12554 abstractC12554, AbstractC12554 abstractC12555, C14527 c14527, C14527 c14528, boolean z, boolean z2) {
        int i;
        int i2;
        abstractC12554.setIsRecyclable(false);
        if (z) {
            m40723(abstractC12554);
        }
        if (abstractC12554 != abstractC12555) {
            if (z2) {
                m40723(abstractC12555);
            }
            abstractC12554.mShadowedHolder = abstractC12555;
            m40723(abstractC12554);
            this.mRecycler.m48488(abstractC12554);
            abstractC12555.setIsRecyclable(false);
            abstractC12555.mShadowingHolder = abstractC12554;
        }
        AbstractC14671 abstractC14671 = (AbstractC14671) this.mItemAnimator;
        abstractC14671.getClass();
        int i3 = c14527.f47589;
        int i4 = c14527.f47590;
        if (abstractC12555.shouldIgnore()) {
            int i5 = c14527.f47589;
            i2 = c14527.f47590;
            i = i5;
        } else {
            i = c14528.f47589;
            i2 = c14528.f47590;
        }
        if (abstractC14671.mo8683(abstractC12554, abstractC12555, i3, i4, i, i2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C8684.f29888;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void markItemDecorInsetsDirty() {
        int iM45070 = this.mChildHelper.m45070();
        for (int i = 0; i < iM45070; i++) {
            ((C22432) this.mChildHelper.m45068(i).getLayoutParams()).f73215 = true;
        }
        ArrayList arrayList = this.mRecycler.f70440;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C22432 c22432 = (C22432) ((AbstractC12554) arrayList.get(i2)).itemView.getLayoutParams();
            if (c22432 != null) {
                c22432.f73215 = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC3236) this.mItemDecorations.get(i)).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo5950()) ? z : true) {
            int i2 = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3236) this.mItemDecorations.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C22432) && this.mLayout.checkLayoutParams((C22432) layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC5498.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC5498.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC5498.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        AbstractC1825 abstractC1825 = this.mItemAnimator;
        return abstractC1825 != null && abstractC1825.mo5950();
    }

    public void saveOldPositions() {
        int iM45070 = this.mChildHelper.m45070();
        for (int i = 0; i < iM45070; i++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i));
            if (sDebugAssertionsEnabled && abstractC12554M40745.mPosition == -1 && !abstractC12554M40745.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!abstractC12554M40745.shouldIgnore()) {
                abstractC12554M40745.saveOldPosition();
            }
        }
    }

    public void clearOldPositions() {
        int iM45070 = this.mChildHelper.m45070();
        for (int i = 0; i < iM45070; i++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i));
            if (!abstractC12554M40745.shouldIgnore()) {
                abstractC12554M40745.clearOldPosition();
            }
        }
        C21726 c21726 = this.mRecycler;
        ArrayList arrayList = c21726.f70436;
        ArrayList arrayList2 = c21726.f70440;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC12554) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC12554) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c21726.f70438;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC12554) c21726.f70438.get(i4)).clearOldPosition();
            }
        }
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM45070 = this.mChildHelper.m45070();
        int i10 = -1;
        if (i < i2) {
            i3 = -1;
            i5 = i;
            i4 = i2;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i11 = 0; i11 < iM45070; i11++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i11));
            if (abstractC12554M40745 != null && (i9 = abstractC12554M40745.mPosition) >= i5 && i9 <= i4) {
                if (sVerboseLoggingEnabled) {
                    abstractC12554M40745.toString();
                }
                if (abstractC12554M40745.mPosition == i) {
                    abstractC12554M40745.offsetPosition(i2 - i, false);
                } else {
                    abstractC12554M40745.offsetPosition(i3, false);
                }
                this.mState.f52020 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f70440;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i10 = 1;
            i6 = i;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC12554 abstractC12554 = (AbstractC12554) arrayList.get(i12);
            if (abstractC12554 != null && (i8 = abstractC12554.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC12554.offsetPosition(i2 - i, false);
                } else {
                    abstractC12554.offsetPosition(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    abstractC12554.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM45070 = this.mChildHelper.m45070();
        for (int i3 = 0; i3 < iM45070; i3++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i3));
            if (abstractC12554M40745 != null && !abstractC12554M40745.shouldIgnore() && abstractC12554M40745.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC12554M40745.toString();
                }
                abstractC12554M40745.offsetPosition(i2, false);
                this.mState.f52020 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f70440;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC12554 abstractC12554 = (AbstractC12554) arrayList.get(i4);
            if (abstractC12554 != null && abstractC12554.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC12554.toString();
                }
                abstractC12554.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM45070 = this.mChildHelper.m45070();
        for (int i4 = 0; i4 < iM45070; i4++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i4));
            if (abstractC12554M40745 != null && !abstractC12554M40745.shouldIgnore()) {
                int i5 = abstractC12554M40745.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC12554M40745.toString();
                    }
                    abstractC12554M40745.offsetPosition(-i2, z);
                    this.mState.f52020 = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        abstractC12554M40745.toString();
                    }
                    abstractC12554M40745.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f52020 = true;
                }
            }
        }
        C21726 c21726 = this.mRecycler;
        ArrayList arrayList = c21726.f70440;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC12554 abstractC12554 = (AbstractC12554) arrayList.get(size);
            if (abstractC12554 != null) {
                int i6 = abstractC12554.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC12554.toString();
                    }
                    abstractC12554.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC12554.addFlags(8);
                    c21726.m48484(size);
                }
            }
        }
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iM45070 = this.mChildHelper.m45070();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM45070; i6++) {
            View viewM45068 = this.mChildHelper.m45068(i6);
            AbstractC12554 abstractC12554M40745 = m40745(viewM45068);
            if (abstractC12554M40745 != null && !abstractC12554M40745.shouldIgnore() && (i4 = abstractC12554M40745.mPosition) >= i && i4 < i5) {
                abstractC12554M40745.addFlags(2);
                abstractC12554M40745.addChangePayload(obj);
                ((C22432) viewM45068.getLayoutParams()).f73215 = true;
            }
        }
        C21726 c21726 = this.mRecycler;
        ArrayList arrayList = c21726.f70440;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC12554 abstractC12554 = (AbstractC12554) arrayList.get(size);
            if (abstractC12554 != null && (i3 = abstractC12554.mPosition) >= i && i3 < i5) {
                abstractC12554.addFlags(2);
                c21726.m48484(size);
            }
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC12554 abstractC12554) {
        AbstractC1825 abstractC1825 = this.mItemAnimator;
        return abstractC1825 == null || abstractC1825.mo5957(abstractC12554, abstractC12554.getUnmodifiedPayloads());
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void markKnownViewsInvalid() {
        int iM45070 = this.mChildHelper.m45070();
        for (int i = 0; i < iM45070; i++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i));
            if (abstractC12554M40745 != null && !abstractC12554M40745.shouldIgnore()) {
                abstractC12554M40745.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C21726 c21726 = this.mRecycler;
        ArrayList arrayList = c21726.f70440;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC12554 abstractC12554 = (AbstractC12554) arrayList.get(i2);
            if (abstractC12554 != null) {
                abstractC12554.addFlags(6);
                abstractC12554.addChangePayload(null);
            }
        }
        AbstractC0414 abstractC0414 = c21726.f70439.mAdapter;
        if (abstractC0414 == null || !abstractC0414.hasStableIds()) {
            c21726.m48482();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public AbstractC12554 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m40745(view);
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC12554 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC12554 m40745(View view) {
        if (view == null) {
            return null;
        }
        return ((C22432) view.getLayoutParams()).f73212;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        AbstractC12554 abstractC12554M40745 = m40745(view);
        if (abstractC12554M40745 != null) {
            return abstractC12554M40745.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        AbstractC12554 abstractC12554M40745 = m40745(view);
        if (abstractC12554M40745 != null) {
            return abstractC12554M40745.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        AbstractC12554 abstractC12554M40745;
        AbstractC0414 abstractC0414 = this.mAdapter;
        if (abstractC0414 == null || !abstractC0414.hasStableIds() || (abstractC12554M40745 = m40745(view)) == null) {
            return -1L;
        }
        return abstractC12554M40745.getItemId();
    }

    @Deprecated
    public AbstractC12554 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC12554 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC12554 findViewHolderForAdapterPosition(int i) {
        AbstractC12554 abstractC12554 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM45070 = this.mChildHelper.m45070();
        for (int i2 = 0; i2 < iM45070; i2++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i2));
            if (abstractC12554M40745 != null && !abstractC12554M40745.isRemoved() && getAdapterPositionInRecyclerView(abstractC12554M40745) == i) {
                C19820 c19820 = this.mChildHelper;
                if (!c19820.f63624.contains(abstractC12554M40745.itemView)) {
                    return abstractC12554M40745;
                }
                abstractC12554 = abstractC12554M40745;
            }
        }
        return abstractC12554;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public AbstractC12554 findViewHolderForPosition(int i, boolean z) {
        C19820 c19820;
        int iM45070 = this.mChildHelper.m45070();
        AbstractC12554 abstractC12554 = null;
        for (int i2 = 0; i2 < iM45070; i2++) {
            AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i2));
            if (abstractC12554M40745 != null && !abstractC12554M40745.isRemoved()) {
                if (z) {
                    if (abstractC12554M40745.mPosition != i) {
                        continue;
                    } else {
                        c19820 = this.mChildHelper;
                        if (c19820.f63624.contains(abstractC12554M40745.itemView)) {
                            return abstractC12554M40745;
                        }
                        abstractC12554 = abstractC12554M40745;
                    }
                } else if (abstractC12554M40745.getLayoutPosition() != i) {
                    continue;
                } else {
                    c19820 = this.mChildHelper;
                    if (c19820.f63624.contains(abstractC12554M40745.itemView)) {
                        return abstractC12554M40745;
                    }
                    abstractC12554 = abstractC12554M40745;
                }
            }
        }
        return abstractC12554;
    }

    public AbstractC12554 findViewHolderForItemId(long j) {
        AbstractC0414 abstractC0414 = this.mAdapter;
        AbstractC12554 abstractC12554 = null;
        if (abstractC0414 != null && abstractC0414.hasStableIds()) {
            int iM45070 = this.mChildHelper.m45070();
            for (int i = 0; i < iM45070; i++) {
                AbstractC12554 abstractC12554M40745 = m40745(this.mChildHelper.m45068(i));
                if (abstractC12554M40745 != null && !abstractC12554M40745.isRemoved() && abstractC12554M40745.getItemId() == j) {
                    C19820 c19820 = this.mChildHelper;
                    if (!c19820.f63624.contains(abstractC12554M40745.itemView)) {
                        return abstractC12554M40745;
                    }
                    abstractC12554 = abstractC12554M40745;
                }
            }
        }
        return abstractC12554;
    }

    public View findChildViewUnder(float f, float f2) {
        int iM45062 = this.mChildHelper.m45062();
        while (true) {
            iM45062--;
            if (iM45062 < 0) {
                return null;
            }
            View viewM45072 = this.mChildHelper.m45072(iM45062);
            float translationX = viewM45072.getTranslationX();
            float translationY = viewM45072.getTranslationY();
            if (f >= viewM45072.getLeft() + translationX && f <= viewM45072.getRight() + translationX && f2 >= viewM45072.getTop() + translationY && f2 <= viewM45072.getBottom() + translationY) {
                return viewM45072;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int iM45062 = this.mChildHelper.m45062();
        for (int i2 = 0; i2 < iM45062; i2++) {
            this.mChildHelper.m45072(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int iM45062 = this.mChildHelper.m45062();
        for (int i2 = 0; i2 < iM45062; i2++) {
            this.mChildHelper.m45072(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        m40720(view, rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40720(View view, Rect rect) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        Rect rect2 = c22432.f73213;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c22432).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c22432).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c22432).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c22432).bottomMargin);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        boolean z = c22432.f73215;
        Rect rect = c22432.f73213;
        if (!z || (this.mState.f52015 && (c22432.f73212.isUpdated() || c22432.f73212.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((AbstractC3236) this.mItemDecorations.get(i)).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c22432.f73215 = false;
        return rect;
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC6909 abstractC6909 = this.mScrollListener;
        if (abstractC6909 != null) {
            abstractC6909.onScrolled(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC6909) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
                }
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m40710(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * 0.015f)));
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC5498 abstractC5498 = this.mLayout;
        if (abstractC5498 != null) {
            abstractC5498.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC6909 abstractC6909 = this.mScrollListener;
        if (abstractC6909 != null) {
            abstractC6909.onScrollStateChanged(this, i);
        }
        List list = this.mScrollListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC6909) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m25166();
    }

    public void repositionShadowingViews() {
        AbstractC12554 abstractC12554;
        int iM45062 = this.mChildHelper.m45062();
        for (int i = 0; i < iM45062; i++) {
            View viewM45072 = this.mChildHelper.m45072(i);
            AbstractC12554 childViewHolder = getChildViewHolder(viewM45072);
            if (childViewHolder != null && (abstractC12554 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC12554.itemView;
                int left = viewM45072.getLeft();
                int top = viewM45072.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17492 m40714(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C17492) {
            return (C17492) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C17492 c17492M40714 = m40714(viewGroup.getChildAt(i));
            if (c17492M40714 != null) {
                return c17492M40714;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40747(AbstractC12554 abstractC12554) {
        WeakReference weakReference = abstractC12554.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC12554.itemView) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC12554.mNestedRecyclerView = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public void dispatchChildDetached(View view) {
        AbstractC12554 abstractC12554M40745 = m40745(view);
        onChildDetachedFromWindow(view);
        AbstractC0414 abstractC0414 = this.mAdapter;
        if (abstractC0414 != null && abstractC12554M40745 != null) {
            abstractC0414.onViewDetachedFromWindow(abstractC12554M40745);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC1264) this.mOnChildAttachStateListeners.get(size)).mo4587(view);
            }
        }
    }

    public void dispatchChildAttached(View view) {
        AbstractC12554 abstractC12554M40745 = m40745(view);
        onChildAttachedToWindow(view);
        AbstractC0414 abstractC0414 = this.mAdapter;
        if (abstractC0414 != null && abstractC12554M40745 != null) {
            abstractC0414.onViewAttachedToWindow(abstractC12554M40745);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC1264) this.mOnChildAttachStateListeners.get(size)).mo4588(view);
            }
        }
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC12554 abstractC12554, int i) {
        if (isComputingLayout()) {
            abstractC12554.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC12554);
            return false;
        }
        View view = abstractC12554.itemView;
        int i2 = C5031.f17539;
        view.setImportantForAccessibility(i);
        return true;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC12554 abstractC12554 = (AbstractC12554) this.mPendingAccessibilityImportanceChange.get(size);
                if (abstractC12554.itemView.getParent() == this && !abstractC12554.shouldIgnore() && (i = abstractC12554.mPendingAccessibilityState) != -1) {
                    View view = abstractC12554.itemView;
                    int i2 = C5031.f17539;
                    view.setImportantForAccessibility(i);
                    abstractC12554.mPendingAccessibilityState = -1;
                }
            } else {
                this.mPendingAccessibilityImportanceChange.clear();
                return;
            }
        }
    }

    public int getAdapterPositionInRecyclerView(AbstractC12554 abstractC12554) {
        if (abstractC12554.hasAnyOfTheFlags(524) || !abstractC12554.isBound()) {
            return -1;
        }
        C9942 c9942 = this.mAdapterHelper;
        int i = abstractC12554.mPosition;
        ArrayList arrayList = c9942.f33946;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8531 c8531 = (C8531) arrayList.get(i2);
            int i3 = c8531.f29534;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c8531.f29533;
                    if (i4 <= i) {
                        int i5 = c8531.f29536;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c8531.f29533;
                    if (i6 == i) {
                        i = c8531.f29536;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c8531.f29536 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c8531.f29533 <= i) {
                i += c8531.f29536;
            }
        }
        return i;
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C18178(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), resources.getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), resources.getDimensionPixelOffset(bin.mt.plus.R.dimen.MT_Protector));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m40706().m25100(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return m40706().m25101();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m40706().m25105(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return m40706().m25105(i, i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m40706().m25109(0);
    }

    public void stopNestedScroll(int i) {
        m40706().m25109(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m40706().m25104(0);
    }

    public boolean hasNestedScrollingParent(int i) {
        return m40706().m25104(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m40706().m25106(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m40706().m25107(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m40706().m25099(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m40706().m25108(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m40706().m25108(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m40706().m25103(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return m40706().m25102(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C9908 m40706() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C9908(this);
        }
        return this.mScrollingChildHelper;
    }
}
