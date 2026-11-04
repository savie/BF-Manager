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

/* JADX INFO: renamed from: l.ۧ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public class ComponentCallbacksC11612 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC11217, InterfaceC3518, InterfaceC21265, InterfaceC1843 {
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
    public C19817 mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public AbstractC3191 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public InterfaceC11721 mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC3191 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC18325 mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C20168 mLifecycleRegistry;
    public EnumC2619 mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public ComponentCallbacksC11612 mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AbstractC13104 mSavedStateAttachListener;
    public C5572 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public ComponentCallbacksC11612 mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C24711 mViewLifecycleOwner;
    public C17930 mViewLifecycleOwnerLiveData;
    public String mWho;

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC11612 componentCallbacksC11612) {
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

    @Override // l.InterfaceC11217
    public AbstractC8585 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public InterfaceC11217 getViewLifecycleOwner() {
        C24711 c24711 = this.mViewLifecycleOwner;
        if (c24711 != null) {
            return c24711;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC17184 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // l.InterfaceC3518
    public C23656 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m29176() == EnumC2619.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.m10477(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m29176() {
        EnumC2619 enumC2619 = this.mMaxState;
        if (enumC2619 == EnumC2619.INITIALIZED || this.mParentFragment == null) {
            return enumC2619.ordinal();
        }
        return Math.min(enumC2619.ordinal(), this.mParentFragment.m29176());
    }

    @Override // l.InterfaceC21265
    public InterfaceC11721 getDefaultViewModelProviderFactory() {
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
            if (application == null && AbstractC3191.m10427(3)) {
                C17359.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C22910(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // l.InterfaceC21265
    public AbstractC24402 getDefaultViewModelCreationExtras() {
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
        if (application == null && AbstractC3191.m10427(3)) {
            C17359.toString(requireContext().getApplicationContext());
        }
        C4264 c4264 = new C4264();
        if (application != null) {
            c4264.m54576().put(C2027.f6751, application);
        }
        c4264.m54576().put(C5010.f17389, this);
        c4264.m54576().put(C5010.f17388, this);
        if (getArguments() != null) {
            c4264.m54576().put(C5010.f17387, getArguments());
        }
        return c4264;
    }

    @Override // l.InterfaceC1843
    public final C15266 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m16513();
    }

    public ComponentCallbacksC11612() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C20345();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC9439(this);
        this.mMaxState = EnumC2619.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C17930();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new C2728(this);
        m29179();
    }

    public ComponentCallbacksC11612(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m29179() {
        this.mLifecycleRegistry = new C20168(this);
        this.mSavedStateRegistryController = new C5572(new C24964(this, new C13029(this)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        m29175(this.mSavedStateAttachListener);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentCallbacksC11612 m29171(Context context, String str) {
        return m29172(context, str, (Bundle) null);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentCallbacksC11612 m29172(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) C21309.m48548(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC11612.getClass().getClassLoader());
                componentCallbacksC11612.setArguments(bundle);
            }
            return componentCallbacksC11612;
        } catch (IllegalAccessException e) {
            throw new C15341(C14442.m34865("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C15341(C14442.m34865("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C15341(C14442.m34865("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C15341(C14442.m34865("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m55177(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m55179(EnumC9330.ON_CREATE);
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
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " does not have any arguments."));
    }

    public final boolean isStateSaved() {
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        if (abstractC3191 == null) {
            return false;
        }
        return abstractC3191.m10487();
    }

    public void setInitialSavedState(C1918 c1918) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c1918 == null || (bundle = c1918.f6451) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC11612 componentCallbacksC11612, int i) {
        if (componentCallbacksC11612 != null) {
            C9047.m24150(this, componentCallbacksC11612, i);
        }
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        AbstractC3191 abstractC3192 = componentCallbacksC11612 != null ? componentCallbacksC11612.mFragmentManager : null;
        if (abstractC3191 != null && abstractC3192 != null && abstractC3191 != abstractC3192) {
            throw new IllegalArgumentException(C10185.m26294("Fragment ", componentCallbacksC11612, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ComponentCallbacksC11612 componentCallbacksC11612M29173 = componentCallbacksC11612; componentCallbacksC11612M29173 != null; componentCallbacksC11612M29173 = componentCallbacksC11612M29173.m29173(false)) {
            if (componentCallbacksC11612M29173.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC11612 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC11612 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC11612.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC11612;
        } else {
            this.mTargetWho = componentCallbacksC11612.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public final ComponentCallbacksC11612 getTargetFragment() {
        return m29173(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ComponentCallbacksC11612 m29173(boolean z) {
        String str;
        if (z) {
            C9047.m24157(this);
        }
        ComponentCallbacksC11612 componentCallbacksC11612 = this.mTarget;
        if (componentCallbacksC11612 != null) {
            return componentCallbacksC11612;
        }
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        if (abstractC3191 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC3191.m10442(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C9047.m24153(this);
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        AbstractC18325 abstractC18325 = this.mHost;
        if (abstractC18325 == null) {
            return null;
        }
        return abstractC18325.m42754();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to a context."));
    }

    public final ActivityC3409 getActivity() {
        AbstractC18325 abstractC18325 = this.mHost;
        if (abstractC18325 == null) {
            return null;
        }
        return (ActivityC3409) abstractC18325.m42749();
    }

    public final ActivityC3409 requireActivity() {
        ActivityC3409 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to an activity."));
    }

    public final Object getHost() {
        AbstractC18325 abstractC18325 = this.mHost;
        if (abstractC18325 == null) {
            return null;
        }
        return abstractC18325.mo42751();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to a host."));
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
    public final AbstractC3191 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final AbstractC3191 getParentFragmentManager() {
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        if (abstractC3191 != null) {
            return abstractC3191;
        }
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " not associated with a fragment manager."));
    }

    @Deprecated
    public final AbstractC3191 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final AbstractC3191 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " has not been attached yet."));
    }

    public final ComponentCallbacksC11612 getParentFragment() {
        return this.mParentFragment;
    }

    public final ComponentCallbacksC11612 requireParentFragment() {
        ComponentCallbacksC11612 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C10185.m26294("Fragment ", this, " is not attached to any Fragment or host"));
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
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        if (abstractC3191 != null) {
            ComponentCallbacksC11612 componentCallbacksC11612 = this.mParentFragment;
            abstractC3191.getClass();
            if (componentCallbacksC11612 == null ? false : componentCallbacksC11612.isHidden()) {
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
            ComponentCallbacksC11612 componentCallbacksC11612 = this.mParentFragment;
            if (!(componentCallbacksC11612 == null ? true : componentCallbacksC11612.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C9047.m24154(this);
        this.mRetainInstance = z;
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        if (abstractC3191 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            abstractC3191.m10496(this);
        } else {
            abstractC3191.m10506(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C9047.m24155(this);
        return this.mRetainInstance;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo42748();
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo42748();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        C9047.m24151(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC3191 abstractC3191 = this.mFragmentManager;
            abstractC3191.m10448(abstractC3191.m10501(this));
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
    public AbstractC0535 getLoaderManager() {
        return AbstractC0535.m2504(this);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC18325 abstractC18325 = this.mHost;
        if (abstractC18325 == null) {
            throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to Activity"));
        }
        abstractC18325.m42745(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m10449(this, intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to Activity"));
        }
        if (AbstractC3191.m10427(2)) {
            toString();
            C17359.toString(intentSender);
            C17359.toString(intent);
            C17359.toString(bundle);
        }
        getParentFragmentManager().m10450(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (AbstractC3191.m10427(2)) {
            toString();
            C17359.toString(intent);
        }
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(C10185.m26294("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m10453(this, strArr, i);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC18325 abstractC18325 = this.mHost;
        if (abstractC18325 != null) {
            return abstractC18325.mo42753(str);
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
        AbstractC18325 abstractC18325 = this.mHost;
        if (abstractC18325 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo42750 = abstractC18325.mo42750();
        layoutInflaterMo42750.setFactory2(this.mChildFragmentManager.m10438());
        return layoutInflaterMo42750;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC18325 abstractC18325 = this.mHost;
        Activity activityM42749 = abstractC18325 == null ? null : abstractC18325.m42749();
        if (activityM42749 != null) {
            this.mCalled = false;
            onInflate(activityM42749, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC18325 abstractC18325 = this.mHost;
        Activity activityM42749 = abstractC18325 == null ? null : abstractC18325.m42749();
        if (activityM42749 != null) {
            this.mCalled = false;
            onAttach(activityM42749);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        AbstractC3191 abstractC3191 = this.mChildFragmentManager;
        if (abstractC3191.f10404 >= 1) {
            return;
        }
        abstractC3191.m10488();
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m10444(parcelable);
        this.mChildFragmentManager.m10488();
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
        throw new IllegalStateException(C10185.m26294("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
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
        m29179();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C20345();
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

    public void setEnterSharedElementCallback(AbstractC15711 abstractC15711) {
        m29178().getClass();
    }

    public void setExitSharedElementCallback(AbstractC15711 abstractC15711) {
        m29178().getClass();
    }

    public void setEnterTransition(Object obj) {
        m29178().f63703 = obj;
    }

    public Object getEnterTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        return c19817.f63703;
    }

    public void setReturnTransition(Object obj) {
        m29178().f63704 = obj;
    }

    public Object getReturnTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        Object obj = c19817.f63704;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public void setExitTransition(Object obj) {
        m29178().f63695 = obj;
    }

    public Object getExitTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        return c19817.f63695;
    }

    public void setReenterTransition(Object obj) {
        m29178().f63697 = obj;
    }

    public Object getReenterTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        Object obj = c19817.f63697;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m29178().f63688 = obj;
    }

    public Object getSharedElementEnterTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        return c19817.f63688;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m29178().f63701 = obj;
    }

    public Object getSharedElementReturnTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        Object obj = c19817.f63701;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m29178().f63689 = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null || (bool = c19817.f63689) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m29178().f63702 = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null || (bool = c19817.f63702) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void postponeEnterTransition() {
        m29178().f63700 = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        m29178().f63700 = true;
        AbstractC3191 abstractC3191 = this.mFragmentManager;
        if (abstractC3191 != null) {
            handler = abstractC3191.m10504().m42752();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m29178().f63700) {
            return;
        }
        if (this.mHost == null) {
            m29178().f63700 = false;
        } else if (Looper.myLooper() != this.mHost.m42752().getLooper()) {
            this.mHost.m42752().postAtFrontOfQueue(new RunnableC8694(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC3191 abstractC3191;
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 != null) {
            c19817.f63700 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC3191 = this.mFragmentManager) == null) {
            return;
        }
        AbstractC17997 abstractC17997M41957 = AbstractC17997.m41957(viewGroup, abstractC3191.m10486());
        abstractC17997M41957.m41970();
        if (z) {
            this.mHost.m42752().post(new RunnableC7203(abstractC17997M41957));
        } else {
            abstractC17997M41957.m41962();
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
        ComponentCallbacksC11612 componentCallbacksC11612M29173 = m29173(false);
        if (componentCallbacksC11612M29173 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC11612M29173);
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
            AbstractC0535.m2504(this).mo2506(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m10446(C14483.m34972(str, EnumC7687.f25319), fileDescriptor, printWriter, strArr);
    }

    public ComponentCallbacksC11612 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m10470(str);
    }

    public AbstractC24293 createFragmentContainer() {
        return new C13914(this);
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((AbstractC13104) it.next()).mo9062();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m10455(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m42754());
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.m10481(this);
        this.mChildFragmentManager.m10502();
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m10469();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo23077(new C4901(this));
        this.mSavedStateRegistryController.m16514(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m46395(EnumC9330.ON_CREATE);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m10469();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C24711(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m55181()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m55176();
        View view = this.mView;
        C24711 c24711 = this.mViewLifecycleOwner;
        C15243.m36590(view, "<this>");
        view.setTag(R.id.MT_Protector, c24711);
        View view2 = this.mView;
        C24711 c24712 = this.mViewLifecycleOwner;
        C15243.m36590(view2, "<this>");
        view2.setTag(R.id.MT_Protector, c24712);
        View view3 = this.mView;
        C24711 c24713 = this.mViewLifecycleOwner;
        C15243.m36590(view3, "<this>");
        view3.setTag(R.id.MT_Protector, c24713);
        this.mViewLifecycleOwnerLiveData.mo40353(this.mViewLifecycleOwner);
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m10482();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m10469();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        m29177();
        this.mChildFragmentManager.m10471();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m29177() {
        if (AbstractC3191.m10427(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void performStart() {
        this.mChildFragmentManager.m10469();
        this.mChildFragmentManager.m10500(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onStart()"));
        }
        C20168 c20168 = this.mLifecycleRegistry;
        EnumC9330 enumC9330 = EnumC9330.ON_START;
        c20168.m46395(enumC9330);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m55179(enumC9330);
        }
        this.mChildFragmentManager.m10483();
    }

    public void performResume() {
        this.mChildFragmentManager.m10469();
        this.mChildFragmentManager.m10500(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onResume()"));
        }
        C20168 c20168 = this.mLifecycleRegistry;
        EnumC9330 enumC9330 = EnumC9330.ON_RESUME;
        c20168.m46395(enumC9330);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m55179(enumC9330);
        }
        this.mChildFragmentManager.m10505();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m10469();
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM10411 = AbstractC3191.m10411(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM10411) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM10411);
            onPrimaryNavigationFragmentChanged(zM10411);
            this.mChildFragmentManager.m10474();
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
        return this.mChildFragmentManager.m10461(menu, menuInflater) | z;
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
        return this.mChildFragmentManager.m10498(menu) | z;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m10499(menuItem);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m10462(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m10445(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m16516(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.m10468());
    }

    public void performPause() {
        this.mChildFragmentManager.m10434();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m55179(EnumC9330.ON_PAUSE);
        }
        this.mLifecycleRegistry.m46395(EnumC9330.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performStop() {
        this.mChildFragmentManager.m10485();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m55179(EnumC9330.ON_STOP);
        }
        this.mLifecycleRegistry.m46395(EnumC9330.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m10478();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo23076().m8762(EnumC2619.CREATED)) {
            this.mViewLifecycleOwner.m55179(EnumC9330.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        AbstractC0535.m2504(this).mo2505();
        this.mPerformedCreateView = false;
    }

    public void performDestroy() {
        this.mChildFragmentManager.m10480();
        this.mLifecycleRegistry.m46395(EnumC9330.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C7556(C10185.m26294("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.m10467()) {
            return;
        }
        this.mChildFragmentManager.m10480();
        this.mChildFragmentManager = new C20345();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C19817 m29178() {
        if (this.mAnimationInfo == null) {
            C19817 c19817 = new C19817();
            c19817.f63703 = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c19817.f63704 = obj;
            c19817.f63695 = null;
            c19817.f63697 = obj;
            c19817.f63688 = null;
            c19817.f63701 = obj;
            c19817.f63699 = 1.0f;
            c19817.f63690 = null;
            this.mAnimationInfo = c19817;
        }
        return this.mAnimationInfo;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m29178().f63692 = i;
        m29178().f63696 = i2;
        m29178().f63705 = i3;
        m29178().f63698 = i4;
    }

    public int getEnterAnim() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return 0;
        }
        return c19817.f63692;
    }

    public int getExitAnim() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return 0;
        }
        return c19817.f63696;
    }

    public int getPopEnterAnim() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return 0;
        }
        return c19817.f63705;
    }

    public int getPopExitAnim() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return 0;
        }
        return c19817.f63698;
    }

    public boolean getPopDirection() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return false;
        }
        return c19817.f63687;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m29178().f63687 = z;
    }

    public int getNextTransition() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return 0;
        }
        return c19817.f63693;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m29178();
        this.mAnimationInfo.f63693 = i;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        C19817 c19817 = this.mAnimationInfo;
        return (c19817 == null || (arrayList = c19817.f63694) == null) ? new ArrayList() : arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        C19817 c19817 = this.mAnimationInfo;
        return (c19817 == null || (arrayList = c19817.f63691) == null) ? new ArrayList() : arrayList;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        m29178();
        C19817 c19817 = this.mAnimationInfo;
        c19817.f63694 = arrayList;
        c19817.f63691 = arrayList2;
    }

    public AbstractC15711 getEnterTransitionCallback() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        c19817.getClass();
        return null;
    }

    public AbstractC15711 getExitTransitionCallback() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        c19817.getClass();
        return null;
    }

    public View getAnimatingAway() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        c19817.getClass();
        return null;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m29178().f63699 = f;
    }

    public float getPostOnViewCreatedAlpha() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return 1.0f;
        }
        return c19817.f63699;
    }

    public void setFocusedView(View view) {
        m29178().f63690 = view;
    }

    public View getFocusedView() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return null;
        }
        return c19817.f63690;
    }

    public boolean isPostponed() {
        C19817 c19817 = this.mAnimationInfo;
        if (c19817 == null) {
            return false;
        }
        return c19817.f63700;
    }

    public final AbstractC17114 registerForActivityResult(AbstractC18606 abstractC18606, InterfaceC25320 interfaceC25320) {
        return m29174(abstractC18606, new C22055(this), interfaceC25320);
    }

    public final AbstractC17114 registerForActivityResult(AbstractC18606 abstractC18606, AbstractC12639 abstractC12639, InterfaceC25320 interfaceC25320) {
        return m29174(abstractC18606, new C10866(abstractC12639), interfaceC25320);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC17114 m29174(AbstractC18606 abstractC18606, InterfaceC12816 interfaceC12816, InterfaceC25320 interfaceC25320) {
        if (this.mState > 1) {
            throw new IllegalStateException(C10185.m26294("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        m29175(new C22801(this, interfaceC12816, atomicReference, abstractC18606, interfaceC25320));
        return new C1237(atomicReference);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29175(AbstractC13104 abstractC13104) {
        if (this.mState >= 0) {
            abstractC13104.mo9062();
        } else {
            this.mOnPreAttachedListeners.add(abstractC13104);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }
}
