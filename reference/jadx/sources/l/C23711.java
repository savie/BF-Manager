package l;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes.dex */
public final class C23711 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14539 f76733;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10660 f76734;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f76735 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f76736 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 f76737;

    public C23711(C10660 c10660, C14539 c14539, ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f76734 = c10660;
        this.f76733 = c14539;
        this.f76737 = componentCallbacksC22654;
    }

    public C23711(C10660 c10660, C14539 c14539, ClassLoader classLoader, C0075 c0075, C17360 c17360) {
        this.f76734 = c10660;
        this.f76733 = c14539;
        ComponentCallbacksC22654 componentCallbacksC22654Mo1008 = c0075.mo1008(c17360.f55240);
        Bundle bundle = c17360.f55237;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        componentCallbacksC22654Mo1008.setArguments(bundle);
        componentCallbacksC22654Mo1008.mWho = c17360.f55231;
        componentCallbacksC22654Mo1008.mFromLayout = c17360.f55239;
        componentCallbacksC22654Mo1008.mRestored = true;
        componentCallbacksC22654Mo1008.mFragmentId = c17360.f55235;
        componentCallbacksC22654Mo1008.mContainerId = c17360.f55229;
        componentCallbacksC22654Mo1008.mTag = c17360.f55233;
        componentCallbacksC22654Mo1008.mRetainInstance = c17360.f55236;
        componentCallbacksC22654Mo1008.mRemoving = c17360.f55241;
        componentCallbacksC22654Mo1008.mDetached = c17360.f55238;
        componentCallbacksC22654Mo1008.mHidden = c17360.f55232;
        componentCallbacksC22654Mo1008.mMaxState = EnumC9414.values()[c17360.f55234];
        Bundle bundle2 = c17360.f55230;
        if (bundle2 != null) {
            componentCallbacksC22654Mo1008.mSavedFragmentState = bundle2;
        } else {
            componentCallbacksC22654Mo1008.mSavedFragmentState = new Bundle();
        }
        this.f76737 = componentCallbacksC22654Mo1008;
        if (AbstractC8894.m23060(2)) {
            C13638.toString(componentCallbacksC22654Mo1008);
        }
    }

    public C23711(C10660 c10660, C14539 c14539, ComponentCallbacksC22654 componentCallbacksC22654, C17360 c17360) {
        this.f76734 = c10660;
        this.f76733 = c14539;
        this.f76737 = componentCallbacksC22654;
        componentCallbacksC22654.mSavedViewState = null;
        componentCallbacksC22654.mSavedViewRegistryState = null;
        componentCallbacksC22654.mBackStackNesting = 0;
        componentCallbacksC22654.mInLayout = false;
        componentCallbacksC22654.mAdded = false;
        ComponentCallbacksC22654 componentCallbacksC22655 = componentCallbacksC22654.mTarget;
        componentCallbacksC22654.mTargetWho = componentCallbacksC22655 != null ? componentCallbacksC22655.mWho : null;
        componentCallbacksC22654.mTarget = null;
        Bundle bundle = c17360.f55230;
        if (bundle != null) {
            componentCallbacksC22654.mSavedFragmentState = bundle;
        } else {
            componentCallbacksC22654.mSavedFragmentState = new Bundle();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m52206() {
        return this.f76737;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52208(int i) {
        this.f76736 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m52212() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (componentCallbacksC22654.mFragmentManager == null) {
            return componentCallbacksC22654.mState;
        }
        int iMin = this.f76736;
        int i = C11011.f37442[componentCallbacksC22654.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i == 3) {
                iMin = Math.min(iMin, 1);
            } else if (i == 4) {
                iMin = Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (componentCallbacksC22654.mFromLayout) {
            if (componentCallbacksC22654.mInLayout) {
                iMin = Math.max(this.f76736, 2);
                View view = componentCallbacksC22654.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f76736 < 4 ? Math.min(iMin, componentCallbacksC22654.mState) : Math.min(iMin, 1);
            }
        }
        if (!componentCallbacksC22654.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = componentCallbacksC22654.mContainer;
        EnumC19914 enumC19914M30225 = viewGroup != null ? AbstractC12153.m30220(viewGroup, componentCallbacksC22654.getParentFragmentManager()).m30225(this) : null;
        if (enumC19914M30225 == EnumC19914.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (enumC19914M30225 == EnumC19914.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (componentCallbacksC22654.mRemoving) {
            if (componentCallbacksC22654.isInBackStack()) {
                iMin = Math.min(iMin, 1);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (componentCallbacksC22654.mDeferStart && componentCallbacksC22654.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC8894.m23060(2)) {
            C13638.toString(componentCallbacksC22654);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m52211() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f76735;
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (z) {
            if (AbstractC8894.m23060(2)) {
                C13638.toString(componentCallbacksC22654);
                return;
            }
            return;
        }
        try {
            this.f76735 = true;
            boolean z2 = false;
            while (true) {
                int iM52212 = m52212();
                int i = componentCallbacksC22654.mState;
                C14539 c14539 = this.f76733;
                if (iM52212 != i) {
                    C10660 c10660 = this.f76734;
                    if (iM52212 > i) {
                        switch (i + 1) {
                            case 0:
                                m52214();
                                break;
                            case 1:
                                if (AbstractC8894.m23060(3)) {
                                    C13638.toString(componentCallbacksC22654);
                                }
                                if (!componentCallbacksC22654.mIsCreated) {
                                    c10660.m26857(false);
                                    componentCallbacksC22654.performCreate(componentCallbacksC22654.mSavedFragmentState);
                                    c10660.m26856(false);
                                } else {
                                    componentCallbacksC22654.restoreChildFragmentState(componentCallbacksC22654.mSavedFragmentState);
                                    componentCallbacksC22654.mState = 1;
                                }
                                break;
                            case 2:
                                m52213();
                                m52205();
                                break;
                            case 3:
                                if (AbstractC8894.m23060(3)) {
                                    C13638.toString(componentCallbacksC22654);
                                }
                                componentCallbacksC22654.performActivityCreated(componentCallbacksC22654.mSavedFragmentState);
                                c10660.m26853(false);
                                break;
                            case 4:
                                if (componentCallbacksC22654.mView != null && (viewGroup3 = componentCallbacksC22654.mContainer) != null) {
                                    AbstractC12153.m30220(viewGroup3, componentCallbacksC22654.getParentFragmentManager()).m30229(EnumC0157.m1253(componentCallbacksC22654.mView.getVisibility()), this);
                                }
                                componentCallbacksC22654.mState = 4;
                                break;
                            case 5:
                                if (AbstractC8894.m23060(3)) {
                                    C13638.toString(componentCallbacksC22654);
                                }
                                componentCallbacksC22654.performStart();
                                c10660.m26863(false);
                                break;
                            case 6:
                                componentCallbacksC22654.mState = 6;
                                break;
                            case 7:
                                m52218();
                                break;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m52204();
                                break;
                            case 0:
                                if (componentCallbacksC22654.mBeingSaved && c14539.m35000(componentCallbacksC22654.mWho) == null) {
                                    m52215();
                                }
                                m52210();
                                break;
                            case 1:
                                m52217();
                                componentCallbacksC22654.mState = 1;
                                break;
                            case 2:
                                componentCallbacksC22654.mInLayout = false;
                                componentCallbacksC22654.mState = 2;
                                break;
                            case 3:
                                if (AbstractC8894.m23060(3)) {
                                    C13638.toString(componentCallbacksC22654);
                                }
                                if (componentCallbacksC22654.mBeingSaved) {
                                    m52215();
                                } else if (componentCallbacksC22654.mView != null && componentCallbacksC22654.mSavedViewState == null) {
                                    m52216();
                                }
                                if (componentCallbacksC22654.mView != null && (viewGroup2 = componentCallbacksC22654.mContainer) != null) {
                                    AbstractC12153.m30220(viewGroup2, componentCallbacksC22654.getParentFragmentManager()).m30234(this);
                                }
                                componentCallbacksC22654.mState = 3;
                                break;
                            case 4:
                                if (AbstractC8894.m23060(3)) {
                                    C13638.toString(componentCallbacksC22654);
                                }
                                componentCallbacksC22654.performStop();
                                c10660.m26859(false);
                                break;
                            case 5:
                                componentCallbacksC22654.mState = 5;
                                break;
                            case 6:
                                if (AbstractC8894.m23060(3)) {
                                    C13638.toString(componentCallbacksC22654);
                                }
                                componentCallbacksC22654.performPause();
                                c10660.m26862(false);
                                break;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && componentCallbacksC22654.mRemoving && !componentCallbacksC22654.isInBackStack() && !componentCallbacksC22654.mBeingSaved) {
                        if (AbstractC8894.m23060(3)) {
                            C13638.toString(componentCallbacksC22654);
                        }
                        c14539.m35001().m45629(componentCallbacksC22654);
                        c14539.m34999(this);
                        if (AbstractC8894.m23060(3)) {
                            C13638.toString(componentCallbacksC22654);
                        }
                        componentCallbacksC22654.initState();
                    }
                    if (componentCallbacksC22654.mHiddenChanged) {
                        if (componentCallbacksC22654.mView != null && (viewGroup = componentCallbacksC22654.mContainer) != null) {
                            AbstractC12153 abstractC12153M30220 = AbstractC12153.m30220(viewGroup, componentCallbacksC22654.getParentFragmentManager());
                            if (componentCallbacksC22654.mHidden) {
                                abstractC12153M30220.m30230(this);
                            } else {
                                abstractC12153M30220.m30232(this);
                            }
                        }
                        AbstractC8894 abstractC8894 = componentCallbacksC22654.mFragmentManager;
                        if (abstractC8894 != null) {
                            abstractC8894.m23075(componentCallbacksC22654);
                        }
                        componentCallbacksC22654.mHiddenChanged = false;
                        componentCallbacksC22654.onHiddenChanged(componentCallbacksC22654.mHidden);
                        componentCallbacksC22654.mChildFragmentManager.m23116();
                    }
                    return;
                }
            }
        } finally {
            this.f76735 = false;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m52213() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (componentCallbacksC22654.mFromLayout && componentCallbacksC22654.mInLayout && !componentCallbacksC22654.mPerformedCreateView) {
            if (AbstractC8894.m23060(3)) {
                C13638.toString(componentCallbacksC22654);
            }
            componentCallbacksC22654.performCreateView(componentCallbacksC22654.performGetLayoutInflater(componentCallbacksC22654.mSavedFragmentState), null, componentCallbacksC22654.mSavedFragmentState);
            View view = componentCallbacksC22654.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC22654.mView.setTag(R.id.MT_Protector, componentCallbacksC22654);
                if (componentCallbacksC22654.mHidden) {
                    componentCallbacksC22654.mView.setVisibility(8);
                }
                componentCallbacksC22654.performViewCreated();
                this.f76734.m26861(false);
                componentCallbacksC22654.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52209(ClassLoader classLoader) {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        Bundle bundle = componentCallbacksC22654.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        componentCallbacksC22654.mSavedViewState = componentCallbacksC22654.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        componentCallbacksC22654.mSavedViewRegistryState = componentCallbacksC22654.mSavedFragmentState.getBundle("android:view_registry_state");
        componentCallbacksC22654.mTargetWho = componentCallbacksC22654.mSavedFragmentState.getString("android:target_state");
        if (componentCallbacksC22654.mTargetWho != null) {
            componentCallbacksC22654.mTargetRequestCode = componentCallbacksC22654.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = componentCallbacksC22654.mSavedUserVisibleHint;
        if (bool != null) {
            componentCallbacksC22654.mUserVisibleHint = bool.booleanValue();
            componentCallbacksC22654.mSavedUserVisibleHint = null;
        } else {
            componentCallbacksC22654.mUserVisibleHint = componentCallbacksC22654.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (componentCallbacksC22654.mUserVisibleHint) {
            return;
        }
        componentCallbacksC22654.mDeferStart = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52214() {
        boolean zM23060 = AbstractC8894.m23060(3);
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (zM23060) {
            C13638.toString(componentCallbacksC22654);
        }
        ComponentCallbacksC22654 componentCallbacksC22655 = componentCallbacksC22654.mTarget;
        C23711 c23711M34988 = null;
        C14539 c14539 = this.f76733;
        if (componentCallbacksC22655 != null) {
            C23711 c23711M34989 = c14539.m34988(componentCallbacksC22655.mWho);
            if (c23711M34989 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC22654 + " declared target fragment " + componentCallbacksC22654.mTarget + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC22654.mTargetWho = componentCallbacksC22654.mTarget.mWho;
            componentCallbacksC22654.mTarget = null;
            c23711M34988 = c23711M34989;
        } else {
            String str = componentCallbacksC22654.mTargetWho;
            if (str != null && (c23711M34988 = c14539.m34988(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC22654);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C22697.m50267(sb, componentCallbacksC22654.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c23711M34988 != null) {
            c23711M34988.m52211();
        }
        componentCallbacksC22654.mHost = componentCallbacksC22654.mFragmentManager.m23106();
        componentCallbacksC22654.mParentFragment = componentCallbacksC22654.mFragmentManager.m23136();
        C10660 c10660 = this.f76734;
        c10660.m26850(false);
        componentCallbacksC22654.performAttach();
        c10660.m26858(false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52205() {
        String resourceName;
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (componentCallbacksC22654.mFromLayout) {
            return;
        }
        if (AbstractC8894.m23060(3)) {
            C13638.toString(componentCallbacksC22654);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = componentCallbacksC22654.performGetLayoutInflater(componentCallbacksC22654.mSavedFragmentState);
        ViewGroup viewGroup = componentCallbacksC22654.mContainer;
        if (viewGroup == null) {
            int i = componentCallbacksC22654.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(C3509.m10332("Cannot create fragment ", componentCallbacksC22654, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) componentCallbacksC22654.mFragmentManager.m23135().mo12110(componentCallbacksC22654.mContainerId);
                if (viewGroup == null) {
                    if (!componentCallbacksC22654.mRestored) {
                        try {
                            resourceName = componentCallbacksC22654.getResources().getResourceName(componentCallbacksC22654.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC22654.mContainerId) + " (" + resourceName + ") for fragment " + componentCallbacksC22654);
                    }
                } else if (!(viewGroup instanceof C15599)) {
                    C1568.m5369(componentCallbacksC22654, viewGroup);
                }
            }
        }
        componentCallbacksC22654.mContainer = viewGroup;
        componentCallbacksC22654.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, componentCallbacksC22654.mSavedFragmentState);
        View view = componentCallbacksC22654.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            componentCallbacksC22654.mView.setTag(R.id.MT_Protector, componentCallbacksC22654);
            if (viewGroup != null) {
                m52207();
            }
            if (componentCallbacksC22654.mHidden) {
                componentCallbacksC22654.mView.setVisibility(8);
            }
            View view2 = componentCallbacksC22654.mView;
            int i2 = C5031.f17539;
            if (view2.isAttachedToWindow()) {
                C5031.m14002(componentCallbacksC22654.mView);
            } else {
                View view3 = componentCallbacksC22654.mView;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC6071(view3));
            }
            componentCallbacksC22654.performViewCreated();
            this.f76734.m26861(false);
            int visibility = componentCallbacksC22654.mView.getVisibility();
            componentCallbacksC22654.setPostOnViewCreatedAlpha(componentCallbacksC22654.mView.getAlpha());
            if (componentCallbacksC22654.mContainer != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC22654.mView.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC22654.setFocusedView(viewFindFocus);
                    if (AbstractC8894.m23060(2)) {
                        viewFindFocus.toString();
                        C13638.toString(componentCallbacksC22654);
                    }
                }
                componentCallbacksC22654.mView.setAlpha(0.0f);
            }
        }
        componentCallbacksC22654.mState = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m52218() {
        boolean zM23060 = AbstractC8894.m23060(3);
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (zM23060) {
            C13638.toString(componentCallbacksC22654);
        }
        View focusedView = componentCallbacksC22654.getFocusedView();
        if (focusedView != null) {
            if (focusedView == componentCallbacksC22654.mView) {
                focusedView.requestFocus();
                if (AbstractC8894.m23060(2)) {
                    focusedView.toString();
                    C13638.toString(componentCallbacksC22654);
                    C13638.toString(componentCallbacksC22654.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == componentCallbacksC22654.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (AbstractC8894.m23060(2)) {
                    focusedView.toString();
                    C13638.toString(componentCallbacksC22654);
                    C13638.toString(componentCallbacksC22654.mView.findFocus());
                }
            }
        }
        componentCallbacksC22654.setFocusedView(null);
        componentCallbacksC22654.performResume();
        this.f76734.m26852(false);
        componentCallbacksC22654.mSavedFragmentState = null;
        componentCallbacksC22654.mSavedViewState = null;
        componentCallbacksC22654.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m52215() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        C17360 c17360 = new C17360(componentCallbacksC22654);
        if (componentCallbacksC22654.mState <= -1 || c17360.f55230 != null) {
            c17360.f55230 = componentCallbacksC22654.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            componentCallbacksC22654.performSaveInstanceState(bundle);
            this.f76734.m26855(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (componentCallbacksC22654.mView != null) {
                m52216();
            }
            if (componentCallbacksC22654.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", componentCallbacksC22654.mSavedViewState);
            }
            if (componentCallbacksC22654.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", componentCallbacksC22654.mSavedViewRegistryState);
            }
            if (!componentCallbacksC22654.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", componentCallbacksC22654.mUserVisibleHint);
            }
            c17360.f55230 = bundle;
            if (componentCallbacksC22654.mTargetWho != null) {
                if (bundle == null) {
                    c17360.f55230 = new Bundle();
                }
                c17360.f55230.putString("android:target_state", componentCallbacksC22654.mTargetWho);
                int i = componentCallbacksC22654.mTargetRequestCode;
                if (i != 0) {
                    c17360.f55230.putInt("android:target_req_state", i);
                }
            }
        }
        this.f76733.m34978(componentCallbacksC22654.mWho, c17360);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52216() {
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (componentCallbacksC22654.mView == null) {
            return;
        }
        if (AbstractC8894.m23060(2)) {
            C13638.toString(componentCallbacksC22654);
            C13638.toString(componentCallbacksC22654.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC22654.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC22654.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC22654.mViewLifecycleOwner.m47818(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC22654.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m52217() {
        View view;
        boolean zM23060 = AbstractC8894.m23060(3);
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (zM23060) {
            C13638.toString(componentCallbacksC22654);
        }
        ViewGroup viewGroup = componentCallbacksC22654.mContainer;
        if (viewGroup != null && (view = componentCallbacksC22654.mView) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC22654.performDestroyView();
        this.f76734.m26860(false);
        componentCallbacksC22654.mContainer = null;
        componentCallbacksC22654.mView = null;
        componentCallbacksC22654.mViewLifecycleOwner = null;
        componentCallbacksC22654.mViewLifecycleOwnerLiveData.mo23642((Object) null);
        componentCallbacksC22654.mInLayout = false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52210() {
        ComponentCallbacksC22654 componentCallbacksC22654M34997;
        boolean zM23060 = AbstractC8894.m23060(3);
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (zM23060) {
            C13638.toString(componentCallbacksC22654);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = componentCallbacksC22654.mRemoving && !componentCallbacksC22654.isInBackStack();
        C14539 c14539 = this.f76733;
        if (z && !componentCallbacksC22654.mBeingSaved) {
            c14539.m34978(componentCallbacksC22654.mWho, null);
        }
        if (z || c14539.m35001().m45630(componentCallbacksC22654)) {
            AbstractC16304 abstractC16304 = componentCallbacksC22654.mHost;
            if (abstractC16304 instanceof InterfaceC17422) {
                zIsChangingConfigurations = c14539.m35001().m45626();
            } else if (C6009.m16315(abstractC16304.m38450())) {
                zIsChangingConfigurations = true ^ ((Activity) abstractC16304.m38450()).isChangingConfigurations();
            }
            if ((z && !componentCallbacksC22654.mBeingSaved) || zIsChangingConfigurations) {
                c14539.m35001().m45629(componentCallbacksC22654);
            }
            componentCallbacksC22654.performDestroy();
            this.f76734.m26851(false);
            for (C23711 c23711 : c14539.m34995()) {
                if (c23711 != null) {
                    ComponentCallbacksC22654 componentCallbacksC22655 = c23711.f76737;
                    if (componentCallbacksC22654.mWho.equals(componentCallbacksC22655.mTargetWho)) {
                        componentCallbacksC22655.mTarget = componentCallbacksC22654;
                        componentCallbacksC22655.mTargetWho = null;
                    }
                }
            }
            String str = componentCallbacksC22654.mTargetWho;
            if (str != null) {
                componentCallbacksC22654.mTarget = c14539.m34997(str);
            }
            c14539.m34999(this);
            return;
        }
        String str2 = componentCallbacksC22654.mTargetWho;
        if (str2 != null && (componentCallbacksC22654M34997 = c14539.m34997(str2)) != null && componentCallbacksC22654M34997.mRetainInstance) {
            componentCallbacksC22654.mTarget = componentCallbacksC22654M34997;
        }
        componentCallbacksC22654.mState = 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m52204() {
        boolean zM23060 = AbstractC8894.m23060(3);
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        if (zM23060) {
            C13638.toString(componentCallbacksC22654);
        }
        componentCallbacksC22654.performDetach();
        this.f76734.m26854(false);
        componentCallbacksC22654.mState = -1;
        componentCallbacksC22654.mHost = null;
        componentCallbacksC22654.mParentFragment = null;
        componentCallbacksC22654.mFragmentManager = null;
        if ((!componentCallbacksC22654.mRemoving || componentCallbacksC22654.isInBackStack()) && !this.f76733.m35001().m45630(componentCallbacksC22654)) {
            return;
        }
        if (AbstractC8894.m23060(3)) {
            C13638.toString(componentCallbacksC22654);
        }
        componentCallbacksC22654.initState();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52207() {
        C14539 c14539 = this.f76733;
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f76737;
        componentCallbacksC22654.mContainer.addView(componentCallbacksC22654.mView, c14539.m34994(componentCallbacksC22654));
    }
}
