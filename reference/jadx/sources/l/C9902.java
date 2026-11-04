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

/* JADX INFO: renamed from: l.ۢۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9902 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10120 f31829;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 f31832;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0954 f31833;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f31831 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31830 = -1;

    public C9902(C10120 c10120, C0954 c0954, ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f31829 = c10120;
        this.f31833 = c0954;
        this.f31832 = componentCallbacksC11612;
    }

    public C9902(C10120 c10120, C0954 c0954, ClassLoader classLoader, C21309 c21309, C0208 c0208) {
        this.f31829 = c10120;
        this.f31833 = c0954;
        ComponentCallbacksC11612 componentCallbacksC11612Mo27138 = c21309.mo27138(c0208.f1412);
        Bundle bundle = c0208.f1409;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        componentCallbacksC11612Mo27138.setArguments(bundle);
        componentCallbacksC11612Mo27138.mWho = c0208.f1408;
        componentCallbacksC11612Mo27138.mFromLayout = c0208.f1411;
        componentCallbacksC11612Mo27138.mRestored = true;
        componentCallbacksC11612Mo27138.mFragmentId = c0208.f1404;
        componentCallbacksC11612Mo27138.mContainerId = c0208.f1410;
        componentCallbacksC11612Mo27138.mTag = c0208.f1403;
        componentCallbacksC11612Mo27138.mRetainInstance = c0208.f1402;
        componentCallbacksC11612Mo27138.mRemoving = c0208.f1406;
        componentCallbacksC11612Mo27138.mDetached = c0208.f1400;
        componentCallbacksC11612Mo27138.mHidden = c0208.f1407;
        componentCallbacksC11612Mo27138.mMaxState = EnumC2619.values()[c0208.f1401];
        Bundle bundle2 = c0208.f1405;
        if (bundle2 != null) {
            componentCallbacksC11612Mo27138.mSavedFragmentState = bundle2;
        } else {
            componentCallbacksC11612Mo27138.mSavedFragmentState = new Bundle();
        }
        this.f31832 = componentCallbacksC11612Mo27138;
        if (AbstractC3191.m10427(2)) {
            C17359.toString(componentCallbacksC11612Mo27138);
        }
    }

    public C9902(C10120 c10120, C0954 c0954, ComponentCallbacksC11612 componentCallbacksC11612, C0208 c0208) {
        this.f31829 = c10120;
        this.f31833 = c0954;
        this.f31832 = componentCallbacksC11612;
        componentCallbacksC11612.mSavedViewState = null;
        componentCallbacksC11612.mSavedViewRegistryState = null;
        componentCallbacksC11612.mBackStackNesting = 0;
        componentCallbacksC11612.mInLayout = false;
        componentCallbacksC11612.mAdded = false;
        ComponentCallbacksC11612 componentCallbacksC11613 = componentCallbacksC11612.mTarget;
        componentCallbacksC11612.mTargetWho = componentCallbacksC11613 != null ? componentCallbacksC11613.mWho : null;
        componentCallbacksC11612.mTarget = null;
        Bundle bundle = c0208.f1405;
        if (bundle != null) {
            componentCallbacksC11612.mSavedFragmentState = bundle;
        } else {
            componentCallbacksC11612.mSavedFragmentState = new Bundle();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m25719() {
        return this.f31832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25721(int i) {
        this.f31830 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25724() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (componentCallbacksC11612.mFragmentManager == null) {
            return componentCallbacksC11612.mState;
        }
        int iMin = this.f31830;
        int i = C18853.f61234[componentCallbacksC11612.mMaxState.ordinal()];
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
        if (componentCallbacksC11612.mFromLayout) {
            if (componentCallbacksC11612.mInLayout) {
                iMin = Math.max(this.f31830, 2);
                View view = componentCallbacksC11612.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f31830 < 4 ? Math.min(iMin, componentCallbacksC11612.mState) : Math.min(iMin, 1);
            }
        }
        if (!componentCallbacksC11612.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = componentCallbacksC11612.mContainer;
        EnumC3827 enumC3827M41969 = viewGroup != null ? AbstractC17997.m41958(viewGroup, componentCallbacksC11612.getParentFragmentManager()).m41969(this) : null;
        if (enumC3827M41969 == EnumC3827.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (enumC3827M41969 == EnumC3827.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (componentCallbacksC11612.mRemoving) {
            if (componentCallbacksC11612.isInBackStack()) {
                iMin = Math.min(iMin, 1);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (componentCallbacksC11612.mDeferStart && componentCallbacksC11612.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC3191.m10427(2)) {
            C17359.toString(componentCallbacksC11612);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25725() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f31831;
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (z) {
            if (AbstractC3191.m10427(2)) {
                C17359.toString(componentCallbacksC11612);
                return;
            }
            return;
        }
        try {
            this.f31831 = true;
            boolean z2 = false;
            while (true) {
                int iM25724 = m25724();
                int i = componentCallbacksC11612.mState;
                C0954 c0954 = this.f31833;
                if (iM25724 != i) {
                    C10120 c10120 = this.f31829;
                    if (iM25724 > i) {
                        switch (i + 1) {
                            case 0:
                                m25731();
                                break;
                            case 1:
                                if (AbstractC3191.m10427(3)) {
                                    C17359.toString(componentCallbacksC11612);
                                }
                                if (!componentCallbacksC11612.mIsCreated) {
                                    c10120.m26080(false);
                                    componentCallbacksC11612.performCreate(componentCallbacksC11612.mSavedFragmentState);
                                    c10120.m26081(false);
                                } else {
                                    componentCallbacksC11612.restoreChildFragmentState(componentCallbacksC11612.mSavedFragmentState);
                                    componentCallbacksC11612.mState = 1;
                                }
                                break;
                            case 2:
                                m25723();
                                m25732();
                                break;
                            case 3:
                                if (AbstractC3191.m10427(3)) {
                                    C17359.toString(componentCallbacksC11612);
                                }
                                componentCallbacksC11612.performActivityCreated(componentCallbacksC11612.mSavedFragmentState);
                                c10120.m26079(false);
                                break;
                            case 4:
                                if (componentCallbacksC11612.mView != null && (viewGroup3 = componentCallbacksC11612.mContainer) != null) {
                                    AbstractC17997.m41958(viewGroup3, componentCallbacksC11612.getParentFragmentManager()).m41964(EnumC14267.m34599(componentCallbacksC11612.mView.getVisibility()), this);
                                }
                                componentCallbacksC11612.mState = 4;
                                break;
                            case 5:
                                if (AbstractC3191.m10427(3)) {
                                    C17359.toString(componentCallbacksC11612);
                                }
                                componentCallbacksC11612.performStart();
                                c10120.m26091(false);
                                break;
                            case 6:
                                componentCallbacksC11612.mState = 6;
                                break;
                            case 7:
                                m25733();
                                break;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m25726();
                                break;
                            case 0:
                                if (componentCallbacksC11612.mBeingSaved && c0954.m3816(componentCallbacksC11612.mWho) == null) {
                                    m25728();
                                }
                                m25730();
                                break;
                            case 1:
                                m25727();
                                componentCallbacksC11612.mState = 1;
                                break;
                            case 2:
                                componentCallbacksC11612.mInLayout = false;
                                componentCallbacksC11612.mState = 2;
                                break;
                            case 3:
                                if (AbstractC3191.m10427(3)) {
                                    C17359.toString(componentCallbacksC11612);
                                }
                                if (componentCallbacksC11612.mBeingSaved) {
                                    m25728();
                                } else if (componentCallbacksC11612.mView != null && componentCallbacksC11612.mSavedViewState == null) {
                                    m25729();
                                }
                                if (componentCallbacksC11612.mView != null && (viewGroup2 = componentCallbacksC11612.mContainer) != null) {
                                    AbstractC17997.m41958(viewGroup2, componentCallbacksC11612.getParentFragmentManager()).m41968(this);
                                }
                                componentCallbacksC11612.mState = 3;
                                break;
                            case 4:
                                if (AbstractC3191.m10427(3)) {
                                    C17359.toString(componentCallbacksC11612);
                                }
                                componentCallbacksC11612.performStop();
                                c10120.m26086(false);
                                break;
                            case 5:
                                componentCallbacksC11612.mState = 5;
                                break;
                            case 6:
                                if (AbstractC3191.m10427(3)) {
                                    C17359.toString(componentCallbacksC11612);
                                }
                                componentCallbacksC11612.performPause();
                                c10120.m26084(false);
                                break;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && componentCallbacksC11612.mRemoving && !componentCallbacksC11612.isInBackStack() && !componentCallbacksC11612.mBeingSaved) {
                        if (AbstractC3191.m10427(3)) {
                            C17359.toString(componentCallbacksC11612);
                        }
                        c0954.m3817().m12648(componentCallbacksC11612);
                        c0954.m3825(this);
                        if (AbstractC3191.m10427(3)) {
                            C17359.toString(componentCallbacksC11612);
                        }
                        componentCallbacksC11612.initState();
                    }
                    if (componentCallbacksC11612.mHiddenChanged) {
                        if (componentCallbacksC11612.mView != null && (viewGroup = componentCallbacksC11612.mContainer) != null) {
                            AbstractC17997 abstractC17997M41958 = AbstractC17997.m41958(viewGroup, componentCallbacksC11612.getParentFragmentManager());
                            if (componentCallbacksC11612.mHidden) {
                                abstractC17997M41958.m41963(this);
                            } else {
                                abstractC17997M41958.m41966(this);
                            }
                        }
                        AbstractC3191 abstractC3191 = componentCallbacksC11612.mFragmentManager;
                        if (abstractC3191 != null) {
                            abstractC3191.m10435(componentCallbacksC11612);
                        }
                        componentCallbacksC11612.mHiddenChanged = false;
                        componentCallbacksC11612.onHiddenChanged(componentCallbacksC11612.mHidden);
                        componentCallbacksC11612.mChildFragmentManager.m10464();
                    }
                    return;
                }
            }
        } finally {
            this.f31831 = false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25723() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (componentCallbacksC11612.mFromLayout && componentCallbacksC11612.mInLayout && !componentCallbacksC11612.mPerformedCreateView) {
            if (AbstractC3191.m10427(3)) {
                C17359.toString(componentCallbacksC11612);
            }
            componentCallbacksC11612.performCreateView(componentCallbacksC11612.performGetLayoutInflater(componentCallbacksC11612.mSavedFragmentState), null, componentCallbacksC11612.mSavedFragmentState);
            View view = componentCallbacksC11612.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC11612.mView.setTag(R.id.MT_Protector, componentCallbacksC11612);
                if (componentCallbacksC11612.mHidden) {
                    componentCallbacksC11612.mView.setVisibility(8);
                }
                componentCallbacksC11612.performViewCreated();
                this.f31829.m26087(false);
                componentCallbacksC11612.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25722(ClassLoader classLoader) {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        Bundle bundle = componentCallbacksC11612.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        componentCallbacksC11612.mSavedViewState = componentCallbacksC11612.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        componentCallbacksC11612.mSavedViewRegistryState = componentCallbacksC11612.mSavedFragmentState.getBundle("android:view_registry_state");
        componentCallbacksC11612.mTargetWho = componentCallbacksC11612.mSavedFragmentState.getString("android:target_state");
        if (componentCallbacksC11612.mTargetWho != null) {
            componentCallbacksC11612.mTargetRequestCode = componentCallbacksC11612.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = componentCallbacksC11612.mSavedUserVisibleHint;
        if (bool != null) {
            componentCallbacksC11612.mUserVisibleHint = bool.booleanValue();
            componentCallbacksC11612.mSavedUserVisibleHint = null;
        } else {
            componentCallbacksC11612.mUserVisibleHint = componentCallbacksC11612.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (componentCallbacksC11612.mUserVisibleHint) {
            return;
        }
        componentCallbacksC11612.mDeferStart = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25731() {
        boolean zM10427 = AbstractC3191.m10427(3);
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (zM10427) {
            C17359.toString(componentCallbacksC11612);
        }
        ComponentCallbacksC11612 componentCallbacksC11613 = componentCallbacksC11612.mTarget;
        C9902 c9902M3819 = null;
        C0954 c0954 = this.f31833;
        if (componentCallbacksC11613 != null) {
            C9902 c9902M38110 = c0954.m3819(componentCallbacksC11613.mWho);
            if (c9902M38110 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC11612 + " declared target fragment " + componentCallbacksC11612.mTarget + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC11612.mTargetWho = componentCallbacksC11612.mTarget.mWho;
            componentCallbacksC11612.mTarget = null;
            c9902M3819 = c9902M38110;
        } else {
            String str = componentCallbacksC11612.mTargetWho;
            if (str != null && (c9902M3819 = c0954.m3819(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC11612);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C8947.m23910(sb, componentCallbacksC11612.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c9902M3819 != null) {
            c9902M3819.m25725();
        }
        componentCallbacksC11612.mHost = componentCallbacksC11612.mFragmentManager.m10504();
        componentCallbacksC11612.mParentFragment = componentCallbacksC11612.mFragmentManager.m10491();
        C10120 c10120 = this.f31829;
        c10120.m26083(false);
        componentCallbacksC11612.performAttach();
        c10120.m26089(false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25732() {
        String resourceName;
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (componentCallbacksC11612.mFromLayout) {
            return;
        }
        if (AbstractC3191.m10427(3)) {
            C17359.toString(componentCallbacksC11612);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = componentCallbacksC11612.performGetLayoutInflater(componentCallbacksC11612.mSavedFragmentState);
        ViewGroup viewGroup = componentCallbacksC11612.mContainer;
        if (viewGroup == null) {
            int i = componentCallbacksC11612.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(C10185.m26294("Cannot create fragment ", componentCallbacksC11612, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) componentCallbacksC11612.mFragmentManager.m10490().mo21642(componentCallbacksC11612.mContainerId);
                if (viewGroup == null) {
                    if (!componentCallbacksC11612.mRestored) {
                        try {
                            resourceName = componentCallbacksC11612.getResources().getResourceName(componentCallbacksC11612.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC11612.mContainerId) + " (" + resourceName + ") for fragment " + componentCallbacksC11612);
                    }
                } else if (!(viewGroup instanceof C4155)) {
                    C9047.m24156(componentCallbacksC11612, viewGroup);
                }
            }
        }
        componentCallbacksC11612.mContainer = viewGroup;
        componentCallbacksC11612.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, componentCallbacksC11612.mSavedFragmentState);
        View view = componentCallbacksC11612.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            componentCallbacksC11612.mView.setTag(R.id.MT_Protector, componentCallbacksC11612);
            if (viewGroup != null) {
                m25720();
            }
            if (componentCallbacksC11612.mHidden) {
                componentCallbacksC11612.mView.setVisibility(8);
            }
            View view2 = componentCallbacksC11612.mView;
            int i2 = C22666.f73603;
            if (view2.isAttachedToWindow()) {
                C22666.m51079(componentCallbacksC11612.mView);
            } else {
                View view3 = componentCallbacksC11612.mView;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7666(view3));
            }
            componentCallbacksC11612.performViewCreated();
            this.f31829.m26087(false);
            int visibility = componentCallbacksC11612.mView.getVisibility();
            componentCallbacksC11612.setPostOnViewCreatedAlpha(componentCallbacksC11612.mView.getAlpha());
            if (componentCallbacksC11612.mContainer != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC11612.mView.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC11612.setFocusedView(viewFindFocus);
                    if (AbstractC3191.m10427(2)) {
                        viewFindFocus.toString();
                        C17359.toString(componentCallbacksC11612);
                    }
                }
                componentCallbacksC11612.mView.setAlpha(0.0f);
            }
        }
        componentCallbacksC11612.mState = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25733() {
        boolean zM10427 = AbstractC3191.m10427(3);
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (zM10427) {
            C17359.toString(componentCallbacksC11612);
        }
        View focusedView = componentCallbacksC11612.getFocusedView();
        if (focusedView != null) {
            if (focusedView == componentCallbacksC11612.mView) {
                focusedView.requestFocus();
                if (AbstractC3191.m10427(2)) {
                    focusedView.toString();
                    C17359.toString(componentCallbacksC11612);
                    C17359.toString(componentCallbacksC11612.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == componentCallbacksC11612.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (AbstractC3191.m10427(2)) {
                    focusedView.toString();
                    C17359.toString(componentCallbacksC11612);
                    C17359.toString(componentCallbacksC11612.mView.findFocus());
                }
            }
        }
        componentCallbacksC11612.setFocusedView(null);
        componentCallbacksC11612.performResume();
        this.f31829.m26078(false);
        componentCallbacksC11612.mSavedFragmentState = null;
        componentCallbacksC11612.mSavedViewState = null;
        componentCallbacksC11612.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m25728() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        C0208 c0208 = new C0208(componentCallbacksC11612);
        if (componentCallbacksC11612.mState <= -1 || c0208.f1405 != null) {
            c0208.f1405 = componentCallbacksC11612.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            componentCallbacksC11612.performSaveInstanceState(bundle);
            this.f31829.m26082(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (componentCallbacksC11612.mView != null) {
                m25729();
            }
            if (componentCallbacksC11612.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", componentCallbacksC11612.mSavedViewState);
            }
            if (componentCallbacksC11612.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", componentCallbacksC11612.mSavedViewRegistryState);
            }
            if (!componentCallbacksC11612.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", componentCallbacksC11612.mUserVisibleHint);
            }
            c0208.f1405 = bundle;
            if (componentCallbacksC11612.mTargetWho != null) {
                if (bundle == null) {
                    c0208.f1405 = new Bundle();
                }
                c0208.f1405.putString("android:target_state", componentCallbacksC11612.mTargetWho);
                int i = componentCallbacksC11612.mTargetRequestCode;
                if (i != 0) {
                    c0208.f1405.putInt("android:target_req_state", i);
                }
            }
        }
        this.f31833.m3801(componentCallbacksC11612.mWho, c0208);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25729() {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (componentCallbacksC11612.mView == null) {
            return;
        }
        if (AbstractC3191.m10427(2)) {
            C17359.toString(componentCallbacksC11612);
            C17359.toString(componentCallbacksC11612.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC11612.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC11612.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC11612.mViewLifecycleOwner.m55180(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC11612.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m25727() {
        View view;
        boolean zM10427 = AbstractC3191.m10427(3);
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (zM10427) {
            C17359.toString(componentCallbacksC11612);
        }
        ViewGroup viewGroup = componentCallbacksC11612.mContainer;
        if (viewGroup != null && (view = componentCallbacksC11612.mView) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC11612.performDestroyView();
        this.f31829.m26085(false);
        componentCallbacksC11612.mContainer = null;
        componentCallbacksC11612.mView = null;
        componentCallbacksC11612.mViewLifecycleOwner = null;
        componentCallbacksC11612.mViewLifecycleOwnerLiveData.mo40353((Object) null);
        componentCallbacksC11612.mInLayout = false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25730() {
        ComponentCallbacksC11612 componentCallbacksC11612M3823;
        boolean zM10427 = AbstractC3191.m10427(3);
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (zM10427) {
            C17359.toString(componentCallbacksC11612);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = componentCallbacksC11612.mRemoving && !componentCallbacksC11612.isInBackStack();
        C0954 c0954 = this.f31833;
        if (z && !componentCallbacksC11612.mBeingSaved) {
            c0954.m3801(componentCallbacksC11612.mWho, null);
        }
        if (z || c0954.m3817().m12644(componentCallbacksC11612)) {
            AbstractC18325 abstractC18325 = componentCallbacksC11612.mHost;
            if (abstractC18325 instanceof InterfaceC3518) {
                zIsChangingConfigurations = c0954.m3817().m12646();
            } else if (C1402.m5130(abstractC18325.m42754())) {
                zIsChangingConfigurations = true ^ ((Activity) abstractC18325.m42754()).isChangingConfigurations();
            }
            if ((z && !componentCallbacksC11612.mBeingSaved) || zIsChangingConfigurations) {
                c0954.m3817().m12648(componentCallbacksC11612);
            }
            componentCallbacksC11612.performDestroy();
            this.f31829.m26090(false);
            for (C9902 c9902 : c0954.m3821()) {
                if (c9902 != null) {
                    ComponentCallbacksC11612 componentCallbacksC11613 = c9902.f31832;
                    if (componentCallbacksC11612.mWho.equals(componentCallbacksC11613.mTargetWho)) {
                        componentCallbacksC11613.mTarget = componentCallbacksC11612;
                        componentCallbacksC11613.mTargetWho = null;
                    }
                }
            }
            String str = componentCallbacksC11612.mTargetWho;
            if (str != null) {
                componentCallbacksC11612.mTarget = c0954.m3823(str);
            }
            c0954.m3825(this);
            return;
        }
        String str2 = componentCallbacksC11612.mTargetWho;
        if (str2 != null && (componentCallbacksC11612M3823 = c0954.m3823(str2)) != null && componentCallbacksC11612M3823.mRetainInstance) {
            componentCallbacksC11612.mTarget = componentCallbacksC11612M3823;
        }
        componentCallbacksC11612.mState = 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25726() {
        boolean zM10427 = AbstractC3191.m10427(3);
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        if (zM10427) {
            C17359.toString(componentCallbacksC11612);
        }
        componentCallbacksC11612.performDetach();
        this.f31829.m26088(false);
        componentCallbacksC11612.mState = -1;
        componentCallbacksC11612.mHost = null;
        componentCallbacksC11612.mParentFragment = null;
        componentCallbacksC11612.mFragmentManager = null;
        if ((!componentCallbacksC11612.mRemoving || componentCallbacksC11612.isInBackStack()) && !this.f31833.m3817().m12644(componentCallbacksC11612)) {
            return;
        }
        if (AbstractC3191.m10427(3)) {
            C17359.toString(componentCallbacksC11612);
        }
        componentCallbacksC11612.initState();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25720() {
        C0954 c0954 = this.f31833;
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f31832;
        componentCallbacksC11612.mContainer.addView(componentCallbacksC11612.mView, c0954.m3820(componentCallbacksC11612));
    }
}
