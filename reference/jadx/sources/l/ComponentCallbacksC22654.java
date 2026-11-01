package l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩺֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC22654 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1423, InterfaceC17422, InterfaceC16469, InterfaceC19985 {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C21948 mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public AbstractC8894 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public InterfaceC20950 mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC8894 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC16304 mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C4245 mLifecycleRegistry;
    public EnumC9414 mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public ComponentCallbacksC22654 mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AbstractC12776 mSavedStateAttachListener;
    public C15752 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public ComponentCallbacksC22654 mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C21324 mViewLifecycleOwner;
    public C9186 mViewLifecycleOwnerLiveData;
    public String mWho;

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC22654 componentCallbacksC22654) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // l.InterfaceC1423
    public AbstractC3062 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public InterfaceC1423 getViewLifecycleOwner() {
        C21324 c21324 = this.mViewLifecycleOwner;
        if (c21324 != null) {
            return c21324;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC19769 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // l.InterfaceC17422
    public C12484 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m50192() == EnumC9414.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.m23070(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m50192() {
        EnumC9414 enumC9414 = this.mMaxState;
        if (enumC9414 == EnumC9414.INITIALIZED || this.mParentFragment == null) {
            return enumC9414.ordinal();
        }
        return Math.min(enumC9414.ordinal(), this.mParentFragment.m50192());
    }

    @Override // l.InterfaceC16469
    public InterfaceC20950 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC8894.m23060(3)) {
                C13638.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C21655(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // l.InterfaceC16469
    public AbstractC3310 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC8894.m23060(3)) {
            C13638.toString(requireContext().getApplicationContext());
        }
        C11966 c11966 = new C11966();
        if (application != null) {
            c11966.m9814().put(C7544.f25042, application);
        }
        c11966.m9814().put(C4015.f14871, this);
        c11966.m9814().put(C4015.f14870, this);
        if (getArguments() != null) {
            c11966.m9814().put(C4015.f14869, getArguments());
        }
        return c11966;
    }

    @Override // l.InterfaceC19985
    public final C20690 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m37489();
    }

    public ComponentCallbacksC22654() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C10305();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC14809(this);
        this.mMaxState = EnumC9414.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C9186();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new C2107(this);
        m50185();
    }

    public ComponentCallbacksC22654(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50185() {
        this.mLifecycleRegistry = new C4245(this);
        this.mSavedStateRegistryController = new C15752(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        m50190(this.mSavedStateAttachListener);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentCallbacksC22654 m50187(Context context, String str) {
        return m50188(context, str, (Bundle) null);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentCallbacksC22654 m50188(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) C0075.m1006(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC22654.getClass().getClassLoader());
                componentCallbacksC22654.setArguments(bundle);
            }
            return componentCallbacksC22654;
        } catch (IllegalAccessException e) {
            throw new C0780(C16523.m38890("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0780(C16523.m38890("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0780(C16523.m38890("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0780(C16523.m38890("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m47815(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m47816(EnumC1651.ON_CREATE);
        }
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " does not have any arguments."));
    }

    public final boolean isStateSaved() {
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        if (abstractC8894 == null) {
            return false;
        }
        return abstractC8894.m23132();
    }

    public void setInitialSavedState(C6425 c6425) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c6425 == null || (bundle = c6425.f21764) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC22654 componentCallbacksC22654, int i) {
        if (componentCallbacksC22654 != null) {
            C1568.m5364(this, componentCallbacksC22654, i);
        }
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        AbstractC8894 abstractC8895 = componentCallbacksC22654 != null ? componentCallbacksC22654.mFragmentManager : null;
        if (abstractC8894 != null && abstractC8895 != null && abstractC8894 != abstractC8895) {
            throw new IllegalArgumentException(C3509.m10332("Fragment ", componentCallbacksC22654, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ComponentCallbacksC22654 componentCallbacksC22654M50189 = componentCallbacksC22654; componentCallbacksC22654M50189 != null; componentCallbacksC22654M50189 = componentCallbacksC22654M50189.m50189(false)) {
            if (componentCallbacksC22654M50189.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC22654 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC22654 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC22654.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC22654;
        } else {
            this.mTargetWho = componentCallbacksC22654.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public final ComponentCallbacksC22654 getTargetFragment() {
        return m50189(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ComponentCallbacksC22654 m50189(boolean z) {
        String str;
        if (z) {
            C1568.m5359(this);
        }
        ComponentCallbacksC22654 componentCallbacksC22654 = this.mTarget;
        if (componentCallbacksC22654 != null) {
            return componentCallbacksC22654;
        }
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        if (abstractC8894 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC8894.m23078(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C1568.m5367(this);
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        AbstractC16304 abstractC16304 = this.mHost;
        if (abstractC16304 == null) {
            return null;
        }
        return abstractC16304.m38450();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to a context."));
    }

    public final ActivityC19126 getActivity() {
        AbstractC16304 abstractC16304 = this.mHost;
        if (abstractC16304 == null) {
            return null;
        }
        return (ActivityC19126) abstractC16304.m38454();
    }

    public final ActivityC19126 requireActivity() {
        ActivityC19126 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to an activity."));
    }

    public final Object getHost() {
        AbstractC16304 abstractC16304 = this.mHost;
        if (abstractC16304 == null) {
            return null;
        }
        return abstractC16304.mo20672();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to a host."));
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Deprecated
    public final AbstractC8894 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final AbstractC8894 getParentFragmentManager() {
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        if (abstractC8894 != null) {
            return abstractC8894;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " not associated with a fragment manager."));
    }

    @Deprecated
    public final AbstractC8894 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final AbstractC8894 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " has not been attached yet."));
    }

    public final ComponentCallbacksC22654 getParentFragment() {
        return this.mParentFragment;
    }

    public final ComponentCallbacksC22654 requireParentFragment() {
        ComponentCallbacksC22654 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C3509.m10332("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        if (abstractC8894 != null) {
            ComponentCallbacksC22654 componentCallbacksC22654 = this.mParentFragment;
            abstractC8894.getClass();
            if (componentCallbacksC22654 == null ? false : componentCallbacksC22654.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            ComponentCallbacksC22654 componentCallbacksC22654 = this.mParentFragment;
            if (!(componentCallbacksC22654 == null ? true : componentCallbacksC22654.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C1568.m5366(this);
        this.mRetainInstance = z;
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        if (abstractC8894 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            abstractC8894.m23122(this);
        } else {
            abstractC8894.m23142(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C1568.m5368(this);
        return this.mRetainInstance;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo20668();
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo20668();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        C1568.m5365(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC8894 abstractC8894 = this.mFragmentManager;
            abstractC8894.m23094(abstractC8894.m23072(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Deprecated
    public AbstractC5615 getLoaderManager() {
        return AbstractC5615.m15485(this);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC16304 abstractC16304 = this.mHost;
        if (abstractC16304 == null) {
            throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to Activity"));
        }
        abstractC16304.m38451(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m23089(this, intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to Activity"));
        }
        if (AbstractC8894.m23060(2)) {
            toString();
            C13638.toString(intentSender);
            C13638.toString(intent);
            C13638.toString(bundle);
        }
        getParentFragmentManager().m23090(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (AbstractC8894.m23060(2)) {
            toString();
            C13638.toString(intent);
        }
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(C3509.m10332("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m23093(this, strArr, i);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC16304 abstractC16304 = this.mHost;
        if (abstractC16304 != null) {
            return abstractC16304.mo20671(str);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC16304 abstractC16304 = this.mHost;
        if (abstractC16304 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo20670 = abstractC16304.mo20670();
        layoutInflaterMo20670.setFactory2(this.mChildFragmentManager.m23137());
        return layoutInflaterMo20670;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC16304 abstractC16304 = this.mHost;
        Activity activityM38454 = abstractC16304 == null ? null : abstractC16304.m38454();
        if (activityM38454 != null) {
            this.mCalled = false;
            onInflate(activityM38454, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC16304 abstractC16304 = this.mHost;
        Activity activityM38454 = abstractC16304 == null ? null : abstractC16304.m38454();
        if (activityM38454 != null) {
            this.mCalled = false;
            onAttach(activityM38454);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        AbstractC8894 abstractC8894 = this.mChildFragmentManager;
        if (abstractC8894.f30484 >= 1) {
            return;
        }
        abstractC8894.m23101();
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m23081(parcelable);
        this.mChildFragmentManager.m23101();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public View getView() {
        return this.mView;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C3509.m10332("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void initState() {
        m50185();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C10305();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void setEnterSharedElementCallback(AbstractC1231 abstractC1231) {
        m50193().getClass();
    }

    public void setExitSharedElementCallback(AbstractC1231 abstractC1231) {
        m50193().getClass();
    }

    public void setEnterTransition(Object obj) {
        m50193().f71197 = obj;
    }

    public Object getEnterTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        return c21948.f71197;
    }

    public void setReturnTransition(Object obj) {
        m50193().f71210 = obj;
    }

    public Object getReturnTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        Object obj = c21948.f71210;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public void setExitTransition(Object obj) {
        m50193().f71196 = obj;
    }

    public Object getExitTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        return c21948.f71196;
    }

    public void setReenterTransition(Object obj) {
        m50193().f71209 = obj;
    }

    public Object getReenterTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        Object obj = c21948.f71209;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m50193().f71202 = obj;
    }

    public Object getSharedElementEnterTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        return c21948.f71202;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m50193().f71211 = obj;
    }

    public Object getSharedElementReturnTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        Object obj = c21948.f71211;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m50193().f71199 = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null || (bool = c21948.f71199) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m50193().f71207 = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null || (bool = c21948.f71207) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void postponeEnterTransition() {
        m50193().f71200 = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        m50193().f71200 = true;
        AbstractC8894 abstractC8894 = this.mFragmentManager;
        if (abstractC8894 != null) {
            handler = abstractC8894.m23106().m38453();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m50193().f71200) {
            return;
        }
        if (this.mHost == null) {
            m50193().f71200 = false;
        } else if (Looper.myLooper() != this.mHost.m38453().getLooper()) {
            this.mHost.m38453().postAtFrontOfQueue(new RunnableC9870(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC8894 abstractC8894;
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 != null) {
            c21948.f71200 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC8894 = this.mFragmentManager) == null) {
            return;
        }
        AbstractC12153 abstractC12153M30221 = AbstractC12153.m30221(viewGroup, abstractC8894.m23069());
        abstractC12153M30221.m30226();
        if (z) {
            this.mHost.m38453().post(new RunnableC3518(abstractC12153M30221));
        } else {
            abstractC12153M30221.m30227();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC22654 componentCallbacksC22654M50189 = m50189(false);
        if (componentCallbacksC22654M50189 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC22654M50189);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC5615.m15485(this).mo11857(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m23083(C15489.m37076(str, EnumC19730.f63352), fileDescriptor, printWriter, strArr);
    }

    public ComponentCallbacksC22654 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m23111(str);
    }

    public AbstractC20537 createFragmentContainer() {
        return new C4308(this);
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((AbstractC12776) it.next()).mo6659();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m23088(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m38450());
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.m23140(this);
        this.mChildFragmentManager.m23073();
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m23103();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo9171(new C13482(this));
        this.mSavedStateRegistryController.m37490(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m11902(EnumC1651.ON_CREATE);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m23103();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C21324(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m47819()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m47814();
        C23773.m52318(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        C21324 c21324 = this.mViewLifecycleOwner;
        C13465.m32966(view, "<this>");
        view.setTag(R.id.MT_Protector, c21324);
        C12076.m30041(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.mo23642(this.mViewLifecycleOwner);
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m23133();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m23103();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        m50191();
        this.mChildFragmentManager.m23112();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m50191() {
        if (AbstractC8894.m23060(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void performStart() {
        this.mChildFragmentManager.m23103();
        this.mChildFragmentManager.m23126(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onStart()"));
        }
        C4245 c4245 = this.mLifecycleRegistry;
        EnumC1651 enumC1651 = EnumC1651.ON_START;
        c4245.m11902(enumC1651);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m47816(enumC1651);
        }
        this.mChildFragmentManager.m23128();
    }

    public void performResume() {
        this.mChildFragmentManager.m23103();
        this.mChildFragmentManager.m23126(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onResume()"));
        }
        C4245 c4245 = this.mLifecycleRegistry;
        EnumC1651 enumC1651 = EnumC1651.ON_RESUME;
        c4245.m11902(enumC1651);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m47816(enumC1651);
        }
        this.mChildFragmentManager.m23141();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m23103();
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM23061 = AbstractC8894.m23061(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM23061) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM23061);
            onPrimaryNavigationFragmentChanged(zM23061);
            this.mChildFragmentManager.m23104();
        }
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.m23098(menu, menuInflater) | z;
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.m23124(menu) | z;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m23125(menuItem);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m23099(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m23082(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m37492(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.m23143());
    }

    public void performPause() {
        this.mChildFragmentManager.m23074();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m47816(EnumC1651.ON_PAUSE);
        }
        this.mLifecycleRegistry.m11902(EnumC1651.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performStop() {
        this.mChildFragmentManager.m23138();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m47816(EnumC1651.ON_STOP);
        }
        this.mLifecycleRegistry.m11902(EnumC1651.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m23071();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo9170().m24173(EnumC9414.CREATED)) {
            this.mViewLifecycleOwner.m47816(EnumC1651.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        AbstractC5615.m15485(this).mo11856();
        this.mPerformedCreateView = false;
    }

    public void performDestroy() {
        this.mChildFragmentManager.m23139();
        this.mLifecycleRegistry.m11902(EnumC1651.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C5802(C3509.m10332("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.m23115()) {
            return;
        }
        this.mChildFragmentManager.m23139();
        this.mChildFragmentManager = new C10305();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C21948 m50193() {
        if (this.mAnimationInfo == null) {
            C21948 c21948 = new C21948();
            c21948.f71197 = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c21948.f71210 = obj;
            c21948.f71196 = null;
            c21948.f71209 = obj;
            c21948.f71202 = null;
            c21948.f71211 = obj;
            c21948.f71212 = 1.0f;
            c21948.f71206 = null;
            this.mAnimationInfo = c21948;
        }
        return this.mAnimationInfo;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m50193().f71205 = i;
        m50193().f71213 = i2;
        m50193().f71214 = i3;
        m50193().f71208 = i4;
    }

    public int getEnterAnim() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return 0;
        }
        return c21948.f71205;
    }

    public int getExitAnim() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return 0;
        }
        return c21948.f71213;
    }

    public int getPopEnterAnim() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return 0;
        }
        return c21948.f71214;
    }

    public int getPopExitAnim() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return 0;
        }
        return c21948.f71208;
    }

    public boolean getPopDirection() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return false;
        }
        return c21948.f71198;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m50193().f71198 = z;
    }

    public int getNextTransition() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return 0;
        }
        return c21948.f71201;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m50193();
        this.mAnimationInfo.f71201 = i;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        C21948 c21948 = this.mAnimationInfo;
        return (c21948 == null || (arrayList = c21948.f71203) == null) ? new ArrayList() : arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        C21948 c21948 = this.mAnimationInfo;
        return (c21948 == null || (arrayList = c21948.f71204) == null) ? new ArrayList() : arrayList;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        m50193();
        C21948 c21948 = this.mAnimationInfo;
        c21948.f71203 = arrayList;
        c21948.f71204 = arrayList2;
    }

    public AbstractC1231 getEnterTransitionCallback() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        c21948.getClass();
        return null;
    }

    public AbstractC1231 getExitTransitionCallback() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        c21948.getClass();
        return null;
    }

    public View getAnimatingAway() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        c21948.getClass();
        return null;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m50193().f71212 = f;
    }

    public float getPostOnViewCreatedAlpha() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return 1.0f;
        }
        return c21948.f71212;
    }

    public void setFocusedView(View view) {
        m50193().f71206 = view;
    }

    public View getFocusedView() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return null;
        }
        return c21948.f71206;
    }

    public boolean isPostponed() {
        C21948 c21948 = this.mAnimationInfo;
        if (c21948 == null) {
            return false;
        }
        return c21948.f71200;
    }

    public final AbstractC6462 registerForActivityResult(AbstractC15636 abstractC15636, InterfaceC3639 interfaceC3639) {
        return m50186(abstractC15636, new C11365(this), interfaceC3639);
    }

    public final AbstractC6462 registerForActivityResult(AbstractC15636 abstractC15636, AbstractC7874 abstractC7874, InterfaceC3639 interfaceC3639) {
        return m50186(abstractC15636, new C2191(abstractC7874), interfaceC3639);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC6462 m50186(AbstractC15636 abstractC15636, InterfaceC11568 interfaceC11568, InterfaceC3639 interfaceC3639) {
        if (this.mState > 1) {
            throw new IllegalStateException(C3509.m10332("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        m50190(new C5014(this, interfaceC11568, atomicReference, abstractC15636, interfaceC3639));
        return new C23981(atomicReference);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50190(AbstractC12776 abstractC12776) {
        if (this.mState >= 0) {
            abstractC12776.mo6659();
        } else {
            this.mOnPreAttachedListeners.add(abstractC12776);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }
}
