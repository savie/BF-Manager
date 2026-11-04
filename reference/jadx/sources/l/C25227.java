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
import android.view.KeyEvent;
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

/* JADX INFO: renamed from: l.᩻ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes.dex */
public class C25227 extends ViewGroup implements InterfaceC7024 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final float FLING_DESTRETCH_FACTOR = 4.0f;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    public static final float INFLEXION = 0.35f;
    public static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    public static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    public static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static boolean sDebugAssertionsEnabled;
    public static final C13292 sDefaultEdgeEffectFactory;
    public static final Interpolator sQuinticInterpolator;
    public static boolean sVerboseLoggingEnabled;
    public C17767 mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public AbstractC12964 mAdapter;
    public C22221 mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public InterfaceC24899 mChildDrawingOrderCallback;
    public C15507 mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public C3295 mDifferentialMotionFlingController;
    public final InterfaceC20449 mDifferentialMotionFlingTarget;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public C16693 mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public RunnableC4542 mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public InterfaceC18931 mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public AbstractC3269 mItemAnimator;
    public InterfaceC15947 mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public AbstractC21169 mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public boolean mLowResRotaryEncoderFeature;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final C6998 mObserver;
    public List mOnChildAttachStateListeners;
    public AbstractC7744 mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    public final List mPendingAccessibilityImportanceChange;
    public C5089 mPendingSavedState;
    public final float mPhysicalCoef;
    public boolean mPostedAnimatorRunner;
    public C7304 mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final C2523 mRecycler;
    public InterfaceC8489 mRecyclerListener;
    public final List mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public AbstractC9980 mScrollListener;
    public List mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public C13735 mScrollingChildHelper;
    public final C15529 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final RunnableC2106 mViewFlinger;
    public final InterfaceC7326 mViewInfoProcessCallback;
    public final C14037 mViewInfoStore;
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

    public void setEdgeEffectFactory(C16693 c16693) {
        c16693.getClass();
        this.mEdgeEffectFactory = c16693;
        invalidateGlows();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i >= 23;
        ALLOW_THREAD_GAP_WORK = true;
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC4761();
        sDefaultEdgeEffectFactory = new C13292();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56252(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56279(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public C25227(Context context) {
        this(context, null);
    }

    public C25227(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C25227(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C6998(this);
        this.mRecycler = new C2523(this);
        this.mViewInfoStore = new C14037();
        this.mUpdateChildViewsRunnable = new RunnableC6780(this);
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
        this.mItemAnimator = new C20729();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC2106(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C7304() : null;
        C15529 c15529 = new C15529();
        c15529.f50524 = -1;
        c15529.f50515 = 0;
        c15529.f50516 = 0;
        c15529.f50517 = 1;
        c15529.f50520 = 0;
        c15529.f50523 = false;
        c15529.f50525 = false;
        c15529.f50522 = false;
        c15529.f50521 = false;
        c15529.f50528 = false;
        c15529.f50519 = false;
        this.mState = c15529;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C20423(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC13491(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C21915(this);
        C10726 c10726 = new C10726(this);
        this.mDifferentialMotionFlingTarget = c10726;
        this.mDifferentialMotionFlingController = new C3295(getContext(), c10726);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C5512.m16415(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C5512.m16414(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m10756(this.mItemAnimatorListener);
        initAdapterManager();
        m56264();
        m56231();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C17767(this));
        int[] iArr = C14103.f44613;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C22666.m51088(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
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
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        m56242(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C22666.m51088(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(bin.mt.plus.R.id.MT_Protector, Boolean.TRUE);
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m56231() {
        if (C22666.m51081(this) == 0) {
            C22666.m51100((ViewGroup) this, 8);
        }
    }

    public C17767 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C17767 c17767) {
        this.mAccessibilityDelegate = c17767;
        C22666.m51098(this, c17767);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56242(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM56236 = m56236(context, strTrim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> clsAsSubclass = Class.forName(strM56236, false, classLoader).asSubclass(AbstractC21169.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM56236, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC21169) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM56236, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM56236, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM56236, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM56236, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM56236, e7);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m56236(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return C25227.class.getPackage().getName() + '.' + str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m56264() {
        this.mChildHelper = new C15507(new C22661(this));
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C22221(new C19677(this));
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

    public void swapAdapter(AbstractC12964 abstractC12964, boolean z) {
        setLayoutFrozen(false);
        m56247(abstractC12964, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(AbstractC12964 abstractC12964) {
        setLayoutFrozen(false);
        m56247(abstractC12964, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        AbstractC3269 abstractC3269 = this.mItemAnimator;
        if (abstractC3269 != null) {
            abstractC3269.mo10765();
        }
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C2523 c2523 = this.mRecycler;
        c2523.f8064.clear();
        c2523.m8424();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56247(AbstractC12964 abstractC12964, boolean z, boolean z2) {
        AbstractC12964 abstractC12965 = this.mAdapter;
        if (abstractC12965 != null) {
            abstractC12965.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m50274();
        AbstractC12964 abstractC12966 = this.mAdapter;
        this.mAdapter = abstractC12964;
        if (abstractC12964 != null) {
            abstractC12964.registerAdapterDataObserver(this.mObserver);
            abstractC12964.onAttachedToRecyclerView(this);
        }
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.onAdapterChanged(abstractC12966, this.mAdapter);
        }
        this.mRecycler.m8420(abstractC12966, this.mAdapter, z);
        this.mState.f50523 = true;
    }

    public AbstractC12964 getAdapter() {
        return this.mAdapter;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC8489 interfaceC8489) {
        this.mRecyclerListener = interfaceC8489;
    }

    public void addRecyclerListener(InterfaceC8489 interfaceC8489) {
        C11293.m28553("'listener' arg cannot be null.", interfaceC8489 != null);
        this.mRecyclerListeners.add(interfaceC8489);
    }

    public void removeRecyclerListener(InterfaceC8489 interfaceC8489) {
        this.mRecyclerListeners.remove(interfaceC8489);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            return abstractC21169.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0286 interfaceC0286) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0286);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0286 interfaceC0286) {
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0286);
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(AbstractC21169 abstractC21169) {
        if (abstractC21169 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC3269 abstractC3269 = this.mItemAnimator;
            if (abstractC3269 != null) {
                abstractC3269.mo10765();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C2523 c2523 = this.mRecycler;
            c2523.f8064.clear();
            c2523.m8424();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C2523 c2524 = this.mRecycler;
            c2524.f8064.clear();
            c2524.m8424();
        }
        C15507 c15507 = this.mChildHelper;
        C25227 c25227 = c15507.f50475.f73581;
        c15507.f50472.m45919();
        ArrayList arrayList = c15507.f50473;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AbstractC11800 abstractC11800M56274 = m56274((View) arrayList.get(size));
            if (abstractC11800M56274 != null) {
                abstractC11800M56274.onLeftHiddenState(c25227);
            }
            arrayList.remove(size);
        }
        int childCount = c25227.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c25227.getChildAt(i);
            c25227.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c25227.removeAllViews();
        this.mLayout = abstractC21169;
        if (abstractC21169 != null) {
            if (abstractC21169.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC21169 + " is already attached to a RecyclerView:" + abstractC21169.mRecyclerView.exceptionLabel());
            }
            abstractC21169.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m8423();
        requestLayout();
    }

    public void setOnFlingListener(AbstractC7744 abstractC7744) {
        this.mOnFlingListener = abstractC7744;
    }

    public AbstractC7744 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5089 c5089 = new C5089(super.onSaveInstanceState());
        C5089 c50810 = this.mPendingSavedState;
        if (c50810 == null) {
            AbstractC21169 abstractC21169 = this.mLayout;
            if (abstractC21169 != null) {
                c5089.f17781 = abstractC21169.onSaveInstanceState();
                return c5089;
            }
            c5089.f17781 = null;
            return c5089;
        }
        c5089.f17781 = c50810.f17781;
        return c5089;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5089)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5089 c5089 = (C5089) parcelable;
        this.mPendingSavedState = c5089;
        super.onRestoreInstanceState(c5089.getSuperState());
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
    private void m56245(AbstractC11800 abstractC11800) {
        View view = abstractC11800.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m8428(getChildViewHolder(view));
        if (abstractC11800.isTmpDetached()) {
            this.mChildHelper.m37153(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m37154(view, -1, true);
        } else {
            this.mChildHelper.m37152(view);
        }
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM37162 = this.mChildHelper.m37162(view);
        if (zM37162) {
            AbstractC11800 abstractC11800M56274 = m56274(view);
            this.mRecycler.m8428(abstractC11800M56274);
            this.mRecycler.m8418(abstractC11800M56274);
            if (sVerboseLoggingEnabled) {
                C17359.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!zM37162);
        return zM37162;
    }

    public AbstractC21169 getLayoutManager() {
        return this.mLayout;
    }

    public C9234 getRecycledViewPool() {
        return this.mRecycler.m8414();
    }

    public void setRecycledViewPool(C9234 c9234) {
        this.mRecycler.m8417(c9234);
    }

    public void setViewCacheExtension(AbstractC5835 abstractC5835) {
        this.mRecycler.getClass();
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m8430(i);
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
            m56265();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(AbstractC12218 abstractC12218, int i) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC12218);
        } else {
            this.mItemDecorations.add(i, abstractC12218);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(AbstractC12218 abstractC12218) {
        addItemDecoration(abstractC12218, -1);
    }

    public AbstractC12218 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return (AbstractC12218) this.mItemDecorations.get(i);
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

    public void removeItemDecoration(AbstractC12218 abstractC12218) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC12218);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC24899 interfaceC24899) {
        if (interfaceC24899 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC24899;
        setChildrenDrawingOrderEnabled(interfaceC24899 != null);
    }

    @Deprecated
    public void setOnScrollListener(AbstractC9980 abstractC9980) {
        this.mScrollListener = abstractC9980;
    }

    public void addOnScrollListener(AbstractC9980 abstractC9980) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC9980);
    }

    public void removeOnScrollListener(AbstractC9980 abstractC9980) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC9980);
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
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            return;
        }
        abstractC21169.scrollToPosition(i);
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
        AbstractC21169 abstractC21169;
        if (this.mLayoutSuppressed || (abstractC21169 = this.mLayout) == null) {
            return;
        }
        abstractC21169.smoothScrollToPosition(this, this.mState, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC21169 layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    smoothScrollBy(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                if (keyCode == 122) {
                    if (zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed) {
                    itemCount = getAdapter().getItemCount();
                }
                smoothScrollToPosition(itemCount);
                return true;
            }
        } else if (layoutManager.canScrollHorizontally()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    smoothScrollBy(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                if (keyCode2 == 122) {
                    if (zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed2) {
                    itemCount = getAdapter().getItemCount();
                }
                smoothScrollToPosition(itemCount);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC21169.canScrollHorizontally();
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
        m56240(i, i2, (MotionEvent) null, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56240(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC21169.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM56234 = i - m56234(i, height);
        int iM56273 = i2 - m56273(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM56234 : 0, zCanScrollVertically ? iM56273 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iM56234 -= iArr2[0];
            iM56273 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iM56234 : 0, zCanScrollVertically ? iM56273 : 0, motionEvent, i3);
        RunnableC4542 runnableC4542 = this.mGapWorker;
        if (runnableC4542 != null && (iM56234 != 0 || iM56273 != 0)) {
            runnableC4542.m14284(this, iM56234, iM56273);
        }
        stopNestedScroll(i3);
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
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
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.m50272()) {
            if (this.mAdapterHelper.m50269(4) && !this.mAdapterHelper.m50269(11)) {
                Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m50277();
                if (!this.mLayoutWasDefered) {
                    if (m56260()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m50266();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                Trace.endSection();
                return;
            }
            if (this.mAdapterHelper.m50272()) {
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m56260() {
        int iM37150 = this.mChildHelper.m37150();
        for (int i = 0; i < iM37150; i++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37160(i));
            if (abstractC11800M56274 != null && !abstractC11800M56274.shouldIgnore() && abstractC11800M56274.isUpdated()) {
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
            if (motionEvent != null && !C18856.m43749(motionEvent, o.a.r)) {
                m56239(motionEvent.getX(), i11, motionEvent.getY(), i13);
                if (Build.VERSION.SDK_INT >= 31 && C18856.m43749(motionEvent, 4194304)) {
                    m56268();
                }
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
    private int m56234(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C19577.m45177(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C19577.m45179(this.mLeftGlow, -width, 1.0f - height);
                if (C19577.m45177(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && C19577.m45177(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fM45179 = C19577.m45179(this.mRightGlow, width, height);
                    if (C19577.m45177(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fM45179;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m56273(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C19577.m45177(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C19577.m45179(this.mTopGlow, -height, width);
                if (C19577.m45177(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && C19577.m45177(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fM45179 = C19577.m45179(this.mBottomGlow, height, 1.0f - width);
                    if (C19577.m45177(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fM45179;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null && abstractC21169.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null && abstractC21169.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null && abstractC21169.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null && abstractC21169.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null && abstractC21169.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null && abstractC21169.canScrollVertically()) {
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
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null || this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC21169.canScrollHorizontally()) {
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
            this.mViewFlinger.m7281(i, i2, interpolator, i3);
            return;
        }
        scrollBy(i, i2);
    }

    public boolean fling(int i, int i2) {
        return m56255(i, i2, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public boolean flingNoThresholdCheck(int i, int i2) {
        return m56255(i, i2, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56255(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null || this.mLayoutSuppressed) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC21169.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (!zCanScrollHorizontally || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            i5 = i;
            i = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect != null && C19577.m45177(edgeEffect) != 0.0f) {
                int i7 = -i;
                if (m56258(this.mLeftGlow, i7, getWidth())) {
                    this.mLeftGlow.onAbsorb(i7);
                    i = 0;
                }
            } else {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || C19577.m45177(edgeEffect2) == 0.0f) {
                    i5 = i;
                    i = 0;
                } else if (m56258(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            }
            i5 = 0;
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 != null && C19577.m45177(edgeEffect3) != 0.0f) {
                int i8 = -i2;
                if (m56258(this.mTopGlow, i8, getHeight())) {
                    this.mTopGlow.onAbsorb(i8);
                    i2 = 0;
                }
            } else {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || C19577.m45177(edgeEffect4) == 0.0f) {
                    i6 = i2;
                    i2 = 0;
                } else if (m56258(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            }
            i6 = 0;
        }
        if (i != 0 || i2 != 0) {
            int i9 = -i4;
            i = Math.max(i9, Math.min(i, i4));
            i2 = Math.max(i9, Math.min(i2, i4));
            m56276(1);
            this.mViewFlinger.m7280(i, i2);
        }
        if (i5 == 0 && i6 == 0) {
            return (i == 0 && i2 == 0) ? false : true;
        }
        float f = i5;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zCanScrollHorizontally || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC7744 abstractC7744 = this.mOnFlingListener;
            if (abstractC7744 != null && abstractC7744.onFling(i5, i6)) {
                return true;
            }
            if (z) {
                m56276(1);
                int i10 = -i4;
                this.mViewFlinger.m7280(Math.max(i10, Math.min(i5, i4)), Math.max(i10, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56276(int i) {
        boolean zCanScrollHorizontally = this.mLayout.canScrollHorizontally();
        int i2 = zCanScrollHorizontally;
        if (this.mLayout.canScrollVertically()) {
            i2 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        startNestedScroll(i2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56258(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return m56233(-i) < C19577.m45177(edgeEffect) * ((float) i2);
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return m56235(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return m56235(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m56235(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C19577.m45177(edgeEffect) != 0.0f) {
            int iRound = Math.round(C19577.m45179(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || C19577.m45177(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(C19577.m45179(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public void stopScroll() {
        setScrollState(0);
        m56265();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m56265() {
        RunnableC2106 runnableC2106 = this.mViewFlinger;
        runnableC2106.f6974.removeCallbacks(runnableC2106);
        runnableC2106.f6973.abortAnimation();
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.stopSmoothScroller();
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
    private void m56239(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                C19577.m45179(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                C19577.m45179(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                C19577.m45179(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        C19577.m45179(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            C19577.m45179(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            C19577.m45179(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m56268() {
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
        postInvalidateOnAnimation();
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((C13292) this.mEdgeEffectFactory).getClass();
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
        ((C13292) this.mEdgeEffectFactory).getClass();
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
        ((C13292) this.mEdgeEffectFactory).getClass();
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
        ((C13292) this.mEdgeEffectFactory).getClass();
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

    public C16693 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
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
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                z = focusFinder.findNextFocus(this, view, (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17) == null;
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
            return m56257(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m56244(viewOnFocusSearchFailed, (View) null);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56257(View view, View view2, int i) {
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
            m56244(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56244(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C18185) {
            C18185 c18185 = (C18185) layoutParams;
            if (!c18185.f59427) {
                Rect rect = c18185.f59425;
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
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null || !abstractC21169.onAddFocusables(this, arrayList, i, i2)) {
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
        this.mRecycler.m8421();
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = RunnableC4542.f16146;
            RunnableC4542 runnableC4542 = (RunnableC4542) threadLocal.get();
            this.mGapWorker = runnableC4542;
            if (runnableC4542 == null) {
                this.mGapWorker = new RunnableC4542();
                int i = C22666.f73603;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC4542 runnableC4543 = this.mGapWorker;
                runnableC4543.f16149 = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC4543);
            }
            ArrayList arrayList = this.mGapWorker.f16150;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC4542 runnableC4542;
        super.onDetachedFromWindow();
        AbstractC3269 abstractC3269 = this.mItemAnimator;
        if (abstractC3269 != null) {
            abstractC3269.mo10765();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C8817.f28819.mo18919() != null) {
        }
        this.mRecycler.m8429();
        C9880.m25688(this);
        if (!ALLOW_THREAD_GAP_WORK || (runnableC4542 = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = runnableC4542.f16150.remove(this);
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
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(exceptionLabel());
        throw new IllegalStateException(sbM27333.toString());
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

    public void addOnItemTouchListener(InterfaceC18931 interfaceC18931) {
        this.mOnItemTouchListeners.add(interfaceC18931);
    }

    public void removeOnItemTouchListener(InterfaceC18931 interfaceC18931) {
        this.mOnItemTouchListeners.remove(interfaceC18931);
        if (this.mInterceptingOnItemTouchListener == interfaceC18931) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56256(MotionEvent motionEvent) {
        InterfaceC18931 interfaceC18931 = this.mInterceptingOnItemTouchListener;
        if (interfaceC18931 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m56280(motionEvent);
        }
        interfaceC18931.mo9314(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m56280(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC18931 interfaceC18931 = (InterfaceC18931) this.mOnItemTouchListeners.get(i);
            if (interfaceC18931.mo9319(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC18931;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (m56280(motionEvent)) {
            m56238();
            return true;
        }
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC21169.canScrollHorizontally();
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
            if (m56282(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            m56276(0);
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
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m56238();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            m56263(motionEvent);
        }
        return this.mScrollState == 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m56282(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || C19577.m45177(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            C19577.m45179(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && C19577.m45177(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C19577.m45179(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && C19577.m45177(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C19577.m45179(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || C19577.m45177(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        C19577.m45179(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC18931) this.mOnItemTouchListeners.get(i)).mo9315(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[PHI: r0
      0x00c2: PHI (r0v39 int) = (r0v26 int), (r0v43 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (m56256(motionEvent)) {
            m56238();
            return true;
        }
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC21169.canScrollHorizontally();
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
            m56276(0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                m56232();
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
                    int iM56234 = iMin - m56234(iMin, motionEvent.getY());
                    int iM56273 = iMin2 - m56273(iMin2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM56234 : 0, zCanScrollVertically ? iM56273 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iM56234 -= iArr4[0];
                        iM56273 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i2 = iM56273;
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iM56234 : 0, zCanScrollVertically ? i2 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC4542 runnableC4542 = this.mGapWorker;
                    if (runnableC4542 != null && (iM56234 != 0 || i2 != 0)) {
                        runnableC4542.m14284(this, iM56234, i2);
                    }
                }
            } else if (actionMasked == 3) {
                m56238();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                m56263(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m56232() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m56268();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56238() {
        m56232();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56263(MotionEvent motionEvent) {
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

    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[PHI: r2
      0x0066: PHI (r2v5 float) = (r2v1 float), (r2v12 float) binds: [B:20:0x0047, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float axisValue;
        boolean z;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    axisValue = motionEvent.getAxisValue(10);
                    z = false;
                    i = 0;
                } else {
                    i = 0;
                    axisValue = 0.0f;
                    z = false;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue;
                } else {
                    if (!this.mLayout.canScrollHorizontally()) {
                    }
                    z = this.mLowResRotaryEncoderFeature;
                }
                axisValue = 0.0f;
                z = this.mLowResRotaryEncoderFeature;
            } else {
                i = 0;
                axisValue = 0.0f;
                z = false;
            }
            int i2 = (int) (f * this.mScaledVerticalScrollFactor);
            int i3 = (int) (axisValue * this.mScaledHorizontalScrollFactor);
            if (z) {
                OverScroller overScroller = this.mViewFlinger.f6973;
                smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, null, Integer.MIN_VALUE, true);
            } else {
                m56240(i3, i2, motionEvent, 1);
            }
            if (i != 0 && !z) {
                this.mDifferentialMotionFlingController.m10869(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC21169.isAutoMeasureEnabled()) {
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
            if (this.mState.f50517 == 1) {
                m56262();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f50521 = true;
            m56281();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f50521 = true;
                m56281();
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
            m56269();
            onExitLayoutOrScroll();
            C15529 c15529 = this.mState;
            if (c15529.f50519) {
                c15529.f50525 = true;
            } else {
                this.mAdapterHelper.m50275();
                this.mState.f50525 = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f50519) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC12964 abstractC12964 = this.mAdapter;
        if (abstractC12964 != null) {
            this.mState.f50520 = abstractC12964.getItemCount();
        } else {
            this.mState.f50520 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f50525 = false;
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i3 = C22666.f73603;
        setMeasuredDimension(AbstractC21169.m48280(i, paddingRight, getMinimumWidth()), AbstractC21169.m48280(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(AbstractC3269 abstractC3269) {
        AbstractC3269 abstractC32610 = this.mItemAnimator;
        if (abstractC32610 != null) {
            abstractC32610.mo10765();
            this.mItemAnimator.m10756((InterfaceC15947) null);
        }
        this.mItemAnimator = abstractC3269;
        if (abstractC3269 != null) {
            abstractC3269.m10756(this.mItemAnimatorListener);
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
                m56275();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m56275() {
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

    public AbstractC3269 getItemAnimator() {
        return this.mItemAnimator;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        int i = C22666.f73603;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m56284() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m56269() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m50274();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (m56284()) {
            this.mAdapterHelper.m50277();
        } else {
            this.mAdapterHelper.m50275();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f50528 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C15529 c15529 = this.mState;
        c15529.f50519 = c15529.f50528 && z2 && !this.mDataSetHasChangedAfterLayout && m56284();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f50521 = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f50517 == 1) {
            m56262();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m56281();
        } else {
            C22221 c22221 = this.mAdapterHelper;
            if ((!c22221.f71596.isEmpty() && !c22221.f71598.isEmpty()) || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                m56281();
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
            }
        }
        m56271();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m56272() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC11800 abstractC11800FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC11800FindContainingViewHolder == null) {
            m56283();
            return;
        }
        this.mState.f50526 = this.mAdapter.hasStableIds() ? abstractC11800FindContainingViewHolder.getItemId() : -1L;
        C15529 c15529 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = abstractC11800FindContainingViewHolder.isRemoved() ? abstractC11800FindContainingViewHolder.mOldPosition : abstractC11800FindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        c15529.f50518 = absoluteAdapterPosition;
        this.mState.f50527 = m56261(abstractC11800FindContainingViewHolder.itemView);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m56283() {
        C15529 c15529 = this.mState;
        c15529.f50526 = -1L;
        c15529.f50518 = -1;
        c15529.f50527 = -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private View m56267() {
        AbstractC11800 abstractC11800FindViewHolderForAdapterPosition;
        C15529 c15529 = this.mState;
        int i = c15529.f50518;
        if (i == -1) {
            i = 0;
        }
        int iM37184 = c15529.m37184();
        for (int i2 = i; i2 < iM37184; i2++) {
            AbstractC11800 abstractC11800FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC11800FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC11800FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC11800FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM37184, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC11800FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC11800FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC11800FindViewHolderForAdapterPosition.itemView;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m56270() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.mChildHelper.f50473.contains(getFocusedChild())) {
                return;
            }
        }
        View viewM56267 = null;
        AbstractC11800 abstractC11800FindViewHolderForItemId = (this.mState.f50526 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f50526);
        if (abstractC11800FindViewHolderForItemId != null) {
            if (this.mChildHelper.f50473.contains(abstractC11800FindViewHolderForItemId.itemView) || !abstractC11800FindViewHolderForItemId.itemView.hasFocusable()) {
                if (this.mChildHelper.m37150() > 0) {
                    viewM56267 = m56267();
                }
            } else {
                viewM56267 = abstractC11800FindViewHolderForItemId.itemView;
            }
        } else if (this.mChildHelper.m37150() > 0) {
            viewM56267 = m56267();
        }
        if (viewM56267 != null) {
            int i = this.mState.f50527;
            if (i != -1 && (viewFindViewById = viewM56267.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewM56267 = viewFindViewById;
            }
            viewM56267.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m56261(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void fillRemainingScrollValues(C15529 c15529) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f6973;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c15529.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c15529.getClass();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m56262() {
        C8817 c8817;
        this.mState.m37185(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f50521 = false;
        startInterceptRequestLayout();
        C14037 c14037 = this.mViewInfoStore;
        c14037.f44482.clear();
        c14037.f44483.m43574();
        onEnterLayoutOrScroll();
        m56269();
        m56272();
        C15529 c15529 = this.mState;
        c15529.f50522 = c15529.f50528 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c15529.f50525 = c15529.f50519;
        c15529.f50520 = this.mAdapter.getItemCount();
        m56253(this.mMinMaxLayoutPositions);
        if (this.mState.f50528) {
            int iM37150 = this.mChildHelper.m37150();
            for (int i = 0; i < iM37150; i++) {
                AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37160(i));
                if (!abstractC11800M56274.shouldIgnore() && (!abstractC11800M56274.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC3269 abstractC3269 = this.mItemAnimator;
                    AbstractC3269.m10752(abstractC11800M56274);
                    abstractC11800M56274.getUnmodifiedPayloads();
                    abstractC3269.getClass();
                    C23407 c23407 = new C23407();
                    c23407.m52597(abstractC11800M56274);
                    C9086 c9086 = this.mViewInfoStore.f44482;
                    C8817 c8817M23658 = (C8817) c9086.get(abstractC11800M56274);
                    if (c8817M23658 == null) {
                        c8817M23658 = C8817.m23658();
                        c9086.put(abstractC11800M56274, c8817M23658);
                    }
                    c8817M23658.f28821 = c23407;
                    c8817M23658.f28820 |= 4;
                    if (this.mState.f50522 && abstractC11800M56274.isUpdated() && !abstractC11800M56274.isRemoved() && !abstractC11800M56274.shouldIgnore() && !abstractC11800M56274.isInvalid()) {
                        this.mViewInfoStore.f44483.m43576(getChangedHolderKey(abstractC11800M56274), abstractC11800M56274);
                    }
                }
            }
        }
        if (this.mState.f50519) {
            saveOldPositions();
            C15529 c155210 = this.mState;
            boolean z = c155210.f50523;
            c155210.f50523 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c155210);
            this.mState.f50523 = z;
            for (int i2 = 0; i2 < this.mChildHelper.m37150(); i2++) {
                AbstractC11800 abstractC11800M56275 = m56274(this.mChildHelper.m37160(i2));
                if (!abstractC11800M56275.shouldIgnore() && ((c8817 = (C8817) this.mViewInfoStore.f44482.get(abstractC11800M56275)) == null || (c8817.f28820 & 4) == 0)) {
                    AbstractC3269.m10752(abstractC11800M56275);
                    boolean zHasAnyOfTheFlags = abstractC11800M56275.hasAnyOfTheFlags(8192);
                    AbstractC3269 abstractC32610 = this.mItemAnimator;
                    abstractC11800M56275.getUnmodifiedPayloads();
                    abstractC32610.getClass();
                    C23407 c23408 = new C23407();
                    c23408.m52597(abstractC11800M56275);
                    if (!zHasAnyOfTheFlags) {
                        C9086 c9087 = this.mViewInfoStore.f44482;
                        C8817 c8817M23659 = (C8817) c9087.get(abstractC11800M56275);
                        if (c8817M23659 == null) {
                            c8817M23659 = C8817.m23658();
                            c9087.put(abstractC11800M56275, c8817M23659);
                        }
                        c8817M23659.f28820 |= 2;
                        c8817M23659.f28821 = c23408;
                    } else {
                        recordAnimationInfoIfBouncedHiddenView(abstractC11800M56275, c23408);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f50517 = 2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m56281() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m37185(6);
        this.mAdapterHelper.m50275();
        this.mState.f50520 = this.mAdapter.getItemCount();
        this.mState.f50516 = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f17781;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C15529 c15529 = this.mState;
        c15529.f50525 = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c15529);
        C15529 c155210 = this.mState;
        c155210.f50523 = false;
        c155210.f50528 = c155210.f50528 && this.mItemAnimator != null;
        c155210.f50517 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m56271() {
        C23407 c23407;
        C23407 c23408;
        C21915 c21915;
        boolean zMo47413;
        int i;
        int i2;
        C21915 c21916;
        this.mState.m37185(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C15529 c15529 = this.mState;
        c15529.f50517 = 1;
        if (c15529.f50528) {
            for (int iM37150 = this.mChildHelper.m37150() - 1; iM37150 >= 0; iM37150--) {
                AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37160(iM37150));
                if (!abstractC11800M56274.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(abstractC11800M56274);
                    this.mItemAnimator.getClass();
                    C23407 c23409 = new C23407();
                    c23409.m52597(abstractC11800M56274);
                    AbstractC11800 abstractC11800 = (AbstractC11800) this.mViewInfoStore.f44483.m43573(changedHolderKey);
                    if (abstractC11800 != null && !abstractC11800.shouldIgnore()) {
                        C8817 c8817 = (C8817) this.mViewInfoStore.f44482.get(abstractC11800);
                        boolean z = (c8817 == null || (c8817.f28820 & 1) == 0) ? false : true;
                        C8817 c8818 = (C8817) this.mViewInfoStore.f44482.get(abstractC11800M56274);
                        boolean z2 = (c8818 == null || (c8818.f28820 & 1) == 0) ? false : true;
                        if (z && abstractC11800 == abstractC11800M56274) {
                            this.mViewInfoStore.m34202(abstractC11800M56274, c23409);
                        } else {
                            C23407 c23407M34204 = this.mViewInfoStore.m34204(abstractC11800);
                            this.mViewInfoStore.m34202(abstractC11800M56274, c23409);
                            C23407 c23407M34201 = this.mViewInfoStore.m34201(abstractC11800M56274);
                            if (c23407M34204 == null) {
                                m56241(changedHolderKey, abstractC11800M56274, abstractC11800);
                            } else {
                                m56246(abstractC11800, abstractC11800M56274, c23407M34204, c23407M34201, z, z2);
                            }
                        }
                    } else {
                        this.mViewInfoStore.m34202(abstractC11800M56274, c23409);
                    }
                }
            }
            C14037 c14037 = this.mViewInfoStore;
            InterfaceC7326 interfaceC7326 = this.mViewInfoProcessCallback;
            C9086 c9086 = c14037.f44482;
            for (int size = c9086.size() - 1; size >= 0; size--) {
                AbstractC11800 abstractC11801 = (AbstractC11800) c9086.m24220(size);
                C8817 c8819 = (C8817) c9086.m24222(size);
                int i3 = c8819.f28820;
                if ((i3 & 3) == 3) {
                    c21916 = (C21915) interfaceC7326;
                } else {
                    if ((i3 & 1) != 0) {
                        C23407 c234010 = c8819.f28821;
                        if (c234010 == null) {
                            c21916 = (C21915) interfaceC7326;
                        } else {
                            C23407 c234011 = c8819.f28822;
                            C25227 c25227 = ((C21915) interfaceC7326).f70767;
                            c25227.mRecycler.m8428(abstractC11801);
                            c25227.animateDisappearance(abstractC11801, c234010, c234011);
                        }
                    } else {
                        if ((i3 & 14) == 14) {
                            c23407 = c8819.f28821;
                            c23408 = c8819.f28822;
                            c21915 = (C21915) interfaceC7326;
                        } else if ((i3 & 12) == 12) {
                            C23407 c234012 = c8819.f28821;
                            C23407 c234013 = c8819.f28822;
                            C21915 c21917 = (C21915) interfaceC7326;
                            c21917.getClass();
                            abstractC11801.setIsRecyclable(false);
                            C25227 c25228 = c21917.f70767;
                            if (c25228.mDataSetHasChangedAfterLayout) {
                                AbstractC23735 abstractC23735 = (AbstractC23735) c25228.mItemAnimator;
                                abstractC23735.getClass();
                                int i4 = c234012.f75768;
                                int i5 = c234012.f75769;
                                if (abstractC11801.shouldIgnore()) {
                                    int i6 = c234012.f75768;
                                    i2 = c234012.f75769;
                                    i = i6;
                                } else {
                                    i = c234013.f75768;
                                    i2 = c234013.f75769;
                                }
                                if (abstractC23735.mo47414(abstractC11801, abstractC11801, i4, i5, i, i2)) {
                                    c25228.postAnimationRunner();
                                }
                            } else {
                                AbstractC23735 abstractC23736 = (AbstractC23735) c25228.mItemAnimator;
                                abstractC23736.getClass();
                                int i7 = c234012.f75768;
                                int i8 = c234013.f75768;
                                if (i7 != i8 || c234012.f75769 != c234013.f75769) {
                                    zMo47413 = abstractC23736.mo47413(abstractC11801, i7, c234012.f75769, i8, c234013.f75769);
                                } else {
                                    abstractC23736.m10755(abstractC11801);
                                    zMo47413 = false;
                                }
                                if (zMo47413) {
                                    c25228.postAnimationRunner();
                                }
                            }
                        } else if ((i3 & 4) != 0) {
                            C23407 c234014 = c8819.f28821;
                            C25227 c25229 = ((C21915) interfaceC7326).f70767;
                            c25229.mRecycler.m8428(abstractC11801);
                            c25229.animateDisappearance(abstractC11801, c234014, null);
                        } else if ((i3 & 8) != 0) {
                            c23407 = c8819.f28821;
                            c23408 = c8819.f28822;
                            c21915 = (C21915) interfaceC7326;
                        }
                        c21915.f70767.animateAppearance(abstractC11801, c23407, c23408);
                    }
                    c8819.f28820 = 0;
                    c8819.f28821 = null;
                    c8819.f28822 = null;
                    C8817.f28819.mo18920(c8819);
                }
                C25227 c252210 = c21916.f70767;
                c252210.mLayout.removeAndRecycleView(abstractC11801.itemView, c252210.mRecycler);
                c8819.f28820 = 0;
                c8819.f28821 = null;
                c8819.f28822 = null;
                C8817.f28819.mo18920(c8819);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C15529 c155210 = this.mState;
        c155210.f50515 = c155210.f50520;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c155210.f50528 = false;
        c155210.f50519 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f8066;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC21169.mPrefetchMaxCountObserved = 0;
            abstractC21169.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m8423();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C14037 c14038 = this.mViewInfoStore;
        c14038.f44482.clear();
        c14038.f44483.m43574();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (m56254(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        m56270();
        m56283();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56241(long j, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801) {
        int iM37150 = this.mChildHelper.m37150();
        for (int i = 0; i < iM37150; i++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37160(i));
            if (abstractC11800M56274 != abstractC11800 && getChangedHolderKey(abstractC11800M56274) == j) {
                AbstractC12964 abstractC12964 = this.mAdapter;
                if (abstractC12964 != null && abstractC12964.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC11800M56274 + " \n View Holder 2:" + abstractC11800 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC11800M56274 + " \n View Holder 2:" + abstractC11800 + exceptionLabel());
            }
        }
        C17359.toString(abstractC11801);
        C17359.toString(abstractC11800);
        exceptionLabel();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC11800 abstractC11800, C23407 c23407) {
        abstractC11800.setFlags(0, 8192);
        if (this.mState.f50522 && abstractC11800.isUpdated() && !abstractC11800.isRemoved() && !abstractC11800.shouldIgnore()) {
            this.mViewInfoStore.f44483.m43576(getChangedHolderKey(abstractC11800), abstractC11800);
        }
        C9086 c9086 = this.mViewInfoStore.f44482;
        C8817 c8817M23658 = (C8817) c9086.get(abstractC11800);
        if (c8817M23658 == null) {
            c8817M23658 = C8817.m23658();
            c9086.put(abstractC11800, c8817M23658);
        }
        c8817M23658.f28821 = c23407;
        c8817M23658.f28820 |= 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56253(int[] iArr) {
        int iM37150 = this.mChildHelper.m37150();
        if (iM37150 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM37150; i3++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37160(i3));
            if (!abstractC11800M56274.shouldIgnore()) {
                int layoutPosition = abstractC11800M56274.getLayoutPosition();
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
    private boolean m56254(int i, int i2) {
        m56253(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC11800 abstractC11800M56274 = m56274(view);
        if (abstractC11800M56274 != null) {
            if (abstractC11800M56274.isTmpDetached()) {
                abstractC11800M56274.clearTmpDetachFlag();
            } else if (!abstractC11800M56274.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC11800M56274 + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public long getChangedHolderKey(AbstractC11800 abstractC11800) {
        return this.mAdapter.hasStableIds() ? abstractC11800.getItemId() : abstractC11800.mPosition;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public void animateAppearance(AbstractC11800 abstractC11800, C23407 c23407, C23407 c23408) {
        boolean zMo47413;
        abstractC11800.setIsRecyclable(false);
        AbstractC23735 abstractC23735 = (AbstractC23735) this.mItemAnimator;
        if (c23407 != null) {
            abstractC23735.getClass();
            int i = c23407.f75768;
            int i2 = c23408.f75768;
            if (i != i2 || c23407.f75769 != c23408.f75769) {
                zMo47413 = abstractC23735.mo47413(abstractC11800, i, c23407.f75769, i2, c23408.f75769);
            } else {
                abstractC23735.mo47417(abstractC11800);
                zMo47413 = true;
            }
        } else {
            abstractC23735.mo47417(abstractC11800);
            zMo47413 = true;
        }
        if (zMo47413) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC11800 abstractC11800, C23407 c23407, C23407 c23408) {
        boolean zMo47413;
        m56245(abstractC11800);
        abstractC11800.setIsRecyclable(false);
        AbstractC23735 abstractC23735 = (AbstractC23735) this.mItemAnimator;
        abstractC23735.getClass();
        int i = c23407.f75768;
        int i2 = c23407.f75769;
        View view = abstractC11800.itemView;
        int left = c23408 == null ? view.getLeft() : c23408.f75768;
        int top = c23408 == null ? view.getTop() : c23408.f75769;
        if (!abstractC11800.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zMo47413 = abstractC23735.mo47413(abstractC11800, i, i2, left, top);
        } else {
            abstractC23735.mo47416(abstractC11800);
            zMo47413 = true;
        }
        if (zMo47413) {
            postAnimationRunner();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56246(AbstractC11800 abstractC11800, AbstractC11800 abstractC11801, C23407 c23407, C23407 c23408, boolean z, boolean z2) {
        int i;
        int i2;
        abstractC11800.setIsRecyclable(false);
        if (z) {
            m56245(abstractC11800);
        }
        if (abstractC11800 != abstractC11801) {
            if (z2) {
                m56245(abstractC11801);
            }
            abstractC11800.mShadowedHolder = abstractC11801;
            m56245(abstractC11800);
            this.mRecycler.m8428(abstractC11800);
            abstractC11801.setIsRecyclable(false);
            abstractC11801.mShadowingHolder = abstractC11800;
        }
        AbstractC23735 abstractC23735 = (AbstractC23735) this.mItemAnimator;
        abstractC23735.getClass();
        int i3 = c23407.f75768;
        int i4 = c23407.f75769;
        if (abstractC11801.shouldIgnore()) {
            int i5 = c23407.f75768;
            i2 = c23407.f75769;
            i = i5;
        } else {
            i = c23408.f75768;
            i2 = c23408.f75769;
        }
        if (abstractC23735.mo47414(abstractC11800, abstractC11801, i3, i4, i, i2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        int iM37158 = this.mChildHelper.m37158();
        for (int i = 0; i < iM37158; i++) {
            ((C18185) this.mChildHelper.m37155(i).getLayoutParams()).f59427 = true;
        }
        ArrayList arrayList = this.mRecycler.f8070;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18185 c18185 = (C18185) ((AbstractC11800) arrayList.get(i2)).itemView.getLayoutParams();
            if (c18185 != null) {
                c18185.f59427 = true;
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
            ((AbstractC12218) this.mItemDecorations.get(i)).onDrawOver(canvas, this, this.mState);
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
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo10762()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC12218) this.mItemDecorations.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C18185) && this.mLayout.checkLayoutParams((C18185) layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC21169.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC21169.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC21169.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        AbstractC3269 abstractC3269 = this.mItemAnimator;
        return abstractC3269 != null && abstractC3269.mo10762();
    }

    public void saveOldPositions() {
        int iM37158 = this.mChildHelper.m37158();
        for (int i = 0; i < iM37158; i++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i));
            if (sDebugAssertionsEnabled && abstractC11800M56274.mPosition == -1 && !abstractC11800M56274.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!abstractC11800M56274.shouldIgnore()) {
                abstractC11800M56274.saveOldPosition();
            }
        }
    }

    public void clearOldPositions() {
        int iM37158 = this.mChildHelper.m37158();
        for (int i = 0; i < iM37158; i++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i));
            if (!abstractC11800M56274.shouldIgnore()) {
                abstractC11800M56274.clearOldPosition();
            }
        }
        C2523 c2523 = this.mRecycler;
        ArrayList arrayList = c2523.f8064;
        ArrayList arrayList2 = c2523.f8070;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC11800) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC11800) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c2523.f8066;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC11800) c2523.f8066.get(i4)).clearOldPosition();
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
        int iM37158 = this.mChildHelper.m37158();
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
        for (int i11 = 0; i11 < iM37158; i11++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i11));
            if (abstractC11800M56274 != null && (i9 = abstractC11800M56274.mPosition) >= i5 && i9 <= i4) {
                if (sVerboseLoggingEnabled) {
                    abstractC11800M56274.toString();
                }
                if (abstractC11800M56274.mPosition == i) {
                    abstractC11800M56274.offsetPosition(i2 - i, false);
                } else {
                    abstractC11800M56274.offsetPosition(i3, false);
                }
                this.mState.f50523 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f8070;
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
            AbstractC11800 abstractC11800 = (AbstractC11800) arrayList.get(i12);
            if (abstractC11800 != null && (i8 = abstractC11800.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC11800.offsetPosition(i2 - i, false);
                } else {
                    abstractC11800.offsetPosition(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    abstractC11800.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM37158 = this.mChildHelper.m37158();
        for (int i3 = 0; i3 < iM37158; i3++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i3));
            if (abstractC11800M56274 != null && !abstractC11800M56274.shouldIgnore() && abstractC11800M56274.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC11800M56274.toString();
                }
                abstractC11800M56274.offsetPosition(i2, false);
                this.mState.f50523 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f8070;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC11800 abstractC11800 = (AbstractC11800) arrayList.get(i4);
            if (abstractC11800 != null && abstractC11800.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC11800.toString();
                }
                abstractC11800.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM37158 = this.mChildHelper.m37158();
        for (int i4 = 0; i4 < iM37158; i4++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i4));
            if (abstractC11800M56274 != null && !abstractC11800M56274.shouldIgnore()) {
                int i5 = abstractC11800M56274.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC11800M56274.toString();
                    }
                    abstractC11800M56274.offsetPosition(-i2, z);
                    this.mState.f50523 = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        abstractC11800M56274.toString();
                    }
                    abstractC11800M56274.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f50523 = true;
                }
            }
        }
        C2523 c2523 = this.mRecycler;
        ArrayList arrayList = c2523.f8070;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC11800 abstractC11800 = (AbstractC11800) arrayList.get(size);
            if (abstractC11800 != null) {
                int i6 = abstractC11800.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC11800.toString();
                    }
                    abstractC11800.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC11800.addFlags(8);
                    c2523.m8422(size);
                }
            }
        }
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iM37158 = this.mChildHelper.m37158();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM37158; i6++) {
            View viewM37155 = this.mChildHelper.m37155(i6);
            AbstractC11800 abstractC11800M56274 = m56274(viewM37155);
            if (abstractC11800M56274 != null && !abstractC11800M56274.shouldIgnore() && (i4 = abstractC11800M56274.mPosition) >= i && i4 < i5) {
                abstractC11800M56274.addFlags(2);
                abstractC11800M56274.addChangePayload(obj);
                ((C18185) viewM37155.getLayoutParams()).f59427 = true;
            }
        }
        C2523 c2523 = this.mRecycler;
        ArrayList arrayList = c2523.f8070;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC11800 abstractC11800 = (AbstractC11800) arrayList.get(size);
            if (abstractC11800 != null && (i3 = abstractC11800.mPosition) >= i && i3 < i5) {
                abstractC11800.addFlags(2);
                c2523.m8422(size);
            }
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC11800 abstractC11800) {
        AbstractC3269 abstractC3269 = this.mItemAnimator;
        return abstractC3269 == null || abstractC3269.mo10758(abstractC11800, abstractC11800.getUnmodifiedPayloads());
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void markKnownViewsInvalid() {
        int iM37158 = this.mChildHelper.m37158();
        for (int i = 0; i < iM37158; i++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i));
            if (abstractC11800M56274 != null && !abstractC11800M56274.shouldIgnore()) {
                abstractC11800M56274.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C2523 c2523 = this.mRecycler;
        ArrayList arrayList = c2523.f8070;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC11800 abstractC11800 = (AbstractC11800) arrayList.get(i2);
            if (abstractC11800 != null) {
                abstractC11800.addFlags(6);
                abstractC11800.addChangePayload(null);
            }
        }
        AbstractC12964 abstractC12964 = c2523.f8065.mAdapter;
        if (abstractC12964 == null || !abstractC12964.hasStableIds()) {
            c2523.m8424();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
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

    public AbstractC11800 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m56274(view);
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

    public AbstractC11800 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC11800 m56274(View view) {
        if (view == null) {
            return null;
        }
        return ((C18185) view.getLayoutParams()).f59428;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        AbstractC11800 abstractC11800M56274 = m56274(view);
        if (abstractC11800M56274 != null) {
            return abstractC11800M56274.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        AbstractC11800 abstractC11800M56274 = m56274(view);
        if (abstractC11800M56274 != null) {
            return abstractC11800M56274.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        AbstractC11800 abstractC11800M56274;
        AbstractC12964 abstractC12964 = this.mAdapter;
        if (abstractC12964 == null || !abstractC12964.hasStableIds() || (abstractC11800M56274 = m56274(view)) == null) {
            return -1L;
        }
        return abstractC11800M56274.getItemId();
    }

    @Deprecated
    public AbstractC11800 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC11800 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC11800 findViewHolderForAdapterPosition(int i) {
        AbstractC11800 abstractC11800 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM37158 = this.mChildHelper.m37158();
        for (int i2 = 0; i2 < iM37158; i2++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i2));
            if (abstractC11800M56274 != null && !abstractC11800M56274.isRemoved() && getAdapterPositionInRecyclerView(abstractC11800M56274) == i) {
                C15507 c15507 = this.mChildHelper;
                if (!c15507.f50473.contains(abstractC11800M56274.itemView)) {
                    return abstractC11800M56274;
                }
                abstractC11800 = abstractC11800M56274;
            }
        }
        return abstractC11800;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public AbstractC11800 findViewHolderForPosition(int i, boolean z) {
        C15507 c15507;
        int iM37158 = this.mChildHelper.m37158();
        AbstractC11800 abstractC11800 = null;
        for (int i2 = 0; i2 < iM37158; i2++) {
            AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i2));
            if (abstractC11800M56274 != null && !abstractC11800M56274.isRemoved()) {
                if (z) {
                    if (abstractC11800M56274.mPosition != i) {
                        continue;
                    } else {
                        c15507 = this.mChildHelper;
                        if (c15507.f50473.contains(abstractC11800M56274.itemView)) {
                            return abstractC11800M56274;
                        }
                        abstractC11800 = abstractC11800M56274;
                    }
                } else if (abstractC11800M56274.getLayoutPosition() != i) {
                    continue;
                } else {
                    c15507 = this.mChildHelper;
                    if (c15507.f50473.contains(abstractC11800M56274.itemView)) {
                        return abstractC11800M56274;
                    }
                    abstractC11800 = abstractC11800M56274;
                }
            }
        }
        return abstractC11800;
    }

    public AbstractC11800 findViewHolderForItemId(long j) {
        AbstractC12964 abstractC12964 = this.mAdapter;
        AbstractC11800 abstractC11800 = null;
        if (abstractC12964 != null && abstractC12964.hasStableIds()) {
            int iM37158 = this.mChildHelper.m37158();
            for (int i = 0; i < iM37158; i++) {
                AbstractC11800 abstractC11800M56274 = m56274(this.mChildHelper.m37155(i));
                if (abstractC11800M56274 != null && !abstractC11800M56274.isRemoved() && abstractC11800M56274.getItemId() == j) {
                    C15507 c15507 = this.mChildHelper;
                    if (!c15507.f50473.contains(abstractC11800M56274.itemView)) {
                        return abstractC11800M56274;
                    }
                    abstractC11800 = abstractC11800M56274;
                }
            }
        }
        return abstractC11800;
    }

    public View findChildViewUnder(float f, float f2) {
        int iM37150 = this.mChildHelper.m37150();
        while (true) {
            iM37150--;
            if (iM37150 < 0) {
                return null;
            }
            View viewM37160 = this.mChildHelper.m37160(iM37150);
            float translationX = viewM37160.getTranslationX();
            float translationY = viewM37160.getTranslationY();
            if (f >= viewM37160.getLeft() + translationX && f <= viewM37160.getRight() + translationX && f2 >= viewM37160.getTop() + translationY && f2 <= viewM37160.getBottom() + translationY) {
                return viewM37160;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int iM37150 = this.mChildHelper.m37150();
        for (int i2 = 0; i2 < iM37150; i2++) {
            this.mChildHelper.m37160(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int iM37150 = this.mChildHelper.m37150();
        for (int i2 = 0; i2 < iM37150; i2++) {
            this.mChildHelper.m37160(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        m56243(view, rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56243(View view, Rect rect) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        Rect rect2 = c18185.f59425;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c18185).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c18185).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c18185).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c18185).bottomMargin);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        boolean z = c18185.f59427;
        Rect rect = c18185.f59425;
        if (!z || (this.mState.f50525 && (c18185.f59428.isUpdated() || c18185.f59428.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((AbstractC12218) this.mItemDecorations.get(i)).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c18185.f59427 = false;
        return rect;
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC9980 abstractC9980 = this.mScrollListener;
        if (abstractC9980 != null) {
            abstractC9980.onScrolled(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC9980) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
                }
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m56233(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * 0.015f)));
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC21169 abstractC21169 = this.mLayout;
        if (abstractC21169 != null) {
            abstractC21169.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC9980 abstractC9980 = this.mScrollListener;
        if (abstractC9980 != null) {
            abstractC9980.onScrollStateChanged(this, i);
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
                ((AbstractC9980) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m50272();
    }

    public void repositionShadowingViews() {
        AbstractC11800 abstractC11800;
        int iM37150 = this.mChildHelper.m37150();
        for (int i = 0; i < iM37150; i++) {
            View viewM37160 = this.mChildHelper.m37160(i);
            AbstractC11800 childViewHolder = getChildViewHolder(viewM37160);
            if (childViewHolder != null && (abstractC11800 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC11800.itemView;
                int left = viewM37160.getLeft();
                int top = viewM37160.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25227 m56237(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C25227) {
            return (C25227) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C25227 c25227M56237 = m56237(viewGroup.getChildAt(i));
            if (c25227M56237 != null) {
                return c25227M56237;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56277(AbstractC11800 abstractC11800) {
        WeakReference weakReference = abstractC11800.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC11800.itemView) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC11800.mNestedRecyclerView = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public void dispatchChildDetached(View view) {
        AbstractC11800 abstractC11800M56274 = m56274(view);
        onChildDetachedFromWindow(view);
        AbstractC12964 abstractC12964 = this.mAdapter;
        if (abstractC12964 != null && abstractC11800M56274 != null) {
            abstractC12964.onViewDetachedFromWindow(abstractC11800M56274);
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
                ((InterfaceC0286) this.mOnChildAttachStateListeners.get(size)).mo1851(view);
            }
        }
    }

    public void dispatchChildAttached(View view) {
        AbstractC11800 abstractC11800M56274 = m56274(view);
        onChildAttachedToWindow(view);
        AbstractC12964 abstractC12964 = this.mAdapter;
        if (abstractC12964 != null && abstractC11800M56274 != null) {
            abstractC12964.onViewAttachedToWindow(abstractC11800M56274);
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
                ((InterfaceC0286) this.mOnChildAttachStateListeners.get(size)).mo1852(view);
            }
        }
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC11800 abstractC11800, int i) {
        if (isComputingLayout()) {
            abstractC11800.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC11800);
            return false;
        }
        abstractC11800.itemView.setImportantForAccessibility(i);
        return true;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC11800 abstractC11800 = (AbstractC11800) this.mPendingAccessibilityImportanceChange.get(size);
                if (abstractC11800.itemView.getParent() == this && !abstractC11800.shouldIgnore() && (i = abstractC11800.mPendingAccessibilityState) != -1) {
                    abstractC11800.itemView.setImportantForAccessibility(i);
                    abstractC11800.mPendingAccessibilityState = -1;
                }
            } else {
                this.mPendingAccessibilityImportanceChange.clear();
                return;
            }
        }
    }

    public int getAdapterPositionInRecyclerView(AbstractC11800 abstractC11800) {
        if (abstractC11800.hasAnyOfTheFlags(524) || !abstractC11800.isBound()) {
            return -1;
        }
        C22221 c22221 = this.mAdapterHelper;
        int i = abstractC11800.mPosition;
        ArrayList arrayList = c22221.f71598;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5067 c5067 = (C5067) arrayList.get(i2);
            int i3 = c5067.f17653;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c5067.f17656;
                    if (i4 <= i) {
                        int i5 = c5067.f17655;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c5067.f17656;
                    if (i6 == i) {
                        i = c5067.f17655;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c5067.f17655 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c5067.f17656 <= i) {
                i += c5067.f17655;
            }
        }
        return i;
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C2829(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), resources.getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector), resources.getDimensionPixelOffset(bin.mt.plus.R.dimen.MT_Protector));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m56266().m33559(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return m56266().m33560();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m56266().m33564(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return m56266().m33564(i, i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m56266().m33568(0);
    }

    public void stopNestedScroll(int i) {
        m56266().m33568(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m56266().m33563(0);
    }

    public boolean hasNestedScrollingParent(int i) {
        return m56266().m33563(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m56266().m33565(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m56266().m33566(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m56266().m33558(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m56266().m33567(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m56266().m33567(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m56266().m33562(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return m56266().m33561(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C13735 m56266() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C13735(this);
        }
        return this.mScrollingChildHelper;
    }
}
