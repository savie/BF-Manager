package l;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5703 extends ComponentCallbacksC11612 implements InterfaceC18381, InterfaceC14651, InterfaceC21365, InterfaceC4497 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f19689;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Runnable f19692;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C0482 f19693;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f19695;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C25227 f19696;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10922 f19694 = new C10922(this);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f19691 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f19697 = new HandlerC13600(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Runnable f19690 = new RunnableC4957(this);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract void mo16738();

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.MT_Protector;
        }
        requireContext().getTheme().applyStyle(i, false);
        C0482 c0482 = new C0482(requireContext());
        this.f19693 = c0482;
        c0482.m2334((InterfaceC21365) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        mo16738();
    }

    @Override // l.ComponentCallbacksC11612
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C25227 c25227;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, C9430.f30587, R.attr.MT_Protector, 0);
        this.f19691 = typedArrayObtainStyledAttributes.getResourceId(0, this.f19691);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f19691, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c25227 = (C25227) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c25227 = (C25227) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c25227.setLayoutManager(new C0067(requireContext()));
            c25227.setAccessibilityDelegateCompat(new C19127(c25227));
        }
        this.f19696 = c25227;
        C10922 c10922 = this.f19694;
        c25227.addItemDecoration(c10922);
        c10922.m27721(drawable);
        if (dimensionPixelSize != -1) {
            c10922.m27720(dimensionPixelSize);
        }
        c10922.m27722(z);
        if (this.f19696.getParent() == null) {
            viewGroup2.addView(this.f19696);
        }
        this.f19697.post(this.f19690);
        return viewInflate;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C10176 c10176M2339;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (c10176M2339 = this.f19693.m2339()) != null) {
            c10176M2339.mo12564(bundle2);
        }
        if (this.f19695) {
            m16739();
            Runnable runnable = this.f19692;
            if (runnable != null) {
                ((RunnableC22111) runnable).run();
                this.f19692 = null;
            }
        }
        this.f19689 = true;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onStart() {
        super.onStart();
        this.f19693.m2333((InterfaceC18381) this);
        this.f19693.m2331((InterfaceC14651) this);
    }

    @Override // l.ComponentCallbacksC11612
    public final void onStop() {
        super.onStop();
        this.f19693.m2333((InterfaceC18381) null);
        this.f19693.m2331((InterfaceC14651) null);
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        Runnable runnable = this.f19690;
        Handler handler = this.f19697;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        if (this.f19695) {
            this.f19696.setAdapter(null);
            C10176 c10176M2339 = this.f19693.m2339();
            if (c10176M2339 != null) {
                c10176M2339.mo12581();
            }
        }
        this.f19696 = null;
        super.onDestroyView();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C10176 c10176M2339 = this.f19693.m2339();
        if (c10176M2339 != null) {
            Bundle bundle2 = new Bundle();
            c10176M2339.mo12600(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0482 m16737() {
        return this.f19693;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16739() {
        C10176 c10176M2339 = this.f19693.m2339();
        if (c10176M2339 != null) {
            this.f19696.setAdapter(new C3465(c10176M2339));
            c10176M2339.mo12582();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10176 m16741() {
        return this.f19693.m2339();
    }

    @Override // l.InterfaceC18381
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo16736(C3906 c3906) {
        if (c3906.m12593() == null) {
            return false;
        }
        boolean zMo45734 = false;
        for (ComponentCallbacksC11612 parentFragment = this; !zMo45734 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC19873) {
                zMo45734 = ((InterfaceC19873) parentFragment).mo45734(this, c3906);
            }
        }
        if (!zMo45734 && (getContext() instanceof InterfaceC19873)) {
            zMo45734 = ((InterfaceC19873) getContext()).mo45734(this, c3906);
        }
        if (!zMo45734 && (getActivity() instanceof InterfaceC19873)) {
            zMo45734 = ((InterfaceC19873) getActivity()).mo45734(this, c3906);
        }
        if (zMo45734) {
            return true;
        }
        AbstractC3191 parentFragmentManager = getParentFragmentManager();
        Bundle bundleM12605 = c3906.m12605();
        C21309 c21309M10476 = parentFragmentManager.m10476();
        requireActivity().getClassLoader();
        ComponentCallbacksC11612 componentCallbacksC11612Mo27138 = c21309M10476.mo27138(c3906.m12593());
        componentCallbacksC11612Mo27138.setArguments(bundleM12605);
        componentCallbacksC11612Mo27138.setTargetFragment(this, 0);
        AbstractC4573 abstractC4573M10492 = parentFragmentManager.m10492();
        abstractC4573M10492.m14353(((View) requireView().getParent()).getId(), componentCallbacksC11612Mo27138, null);
        abstractC4573M10492.m14351();
        abstractC4573M10492.mo14363();
        return true;
    }

    @Override // l.InterfaceC21365
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16734(C10176 c10176) {
        boolean zM36863 = false;
        for (ComponentCallbacksC11612 parentFragment = this; !zM36863 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC15397) {
                zM36863 = ((InterfaceC15397) parentFragment).m36863();
            }
        }
        if (!zM36863 && (getContext() instanceof InterfaceC15397)) {
            zM36863 = ((InterfaceC15397) getContext()).m36863();
        }
        if (zM36863 || !(getActivity() instanceof InterfaceC15397)) {
            return;
        }
        ((InterfaceC15397) getActivity()).m36863();
    }

    @Override // l.InterfaceC4497
    public final C3906 findPreference(String str) {
        C0482 c0482 = this.f19693;
        if (c0482 == null) {
            return null;
        }
        return c0482.m2328((CharSequence) str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16733(int i) {
        C0482 c0482 = this.f19693;
        if (c0482 != null) {
            if (this.f19693.m2335(c0482.m2329(requireContext(), i, this.f19693.m2339()))) {
                this.f19695 = true;
                if (this.f19689) {
                    Handler handler = this.f19697;
                    if (handler.hasMessages(1)) {
                        return;
                    }
                    handler.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    @Override // l.InterfaceC14651
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16735(AbstractC14937 abstractC14937) {
        DialogInterfaceOnCancelListenerC19136 c17330;
        boolean zM51579 = false;
        for (ComponentCallbacksC11612 parentFragment = this; !zM51579 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC22857) {
                zM51579 = ((InterfaceC22857) parentFragment).m51579();
            }
        }
        if (!zM51579 && (getContext() instanceof InterfaceC22857)) {
            zM51579 = ((InterfaceC22857) getContext()).m51579();
        }
        if (!zM51579 && (getActivity() instanceof InterfaceC22857)) {
            zM51579 = ((InterfaceC22857) getActivity()).m51579();
        }
        if (!zM51579 && getParentFragmentManager().m10493("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC14937 instanceof C10462) {
                String strM12557 = abstractC14937.m12557();
                c17330 = new C3005();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM12557);
                c17330.setArguments(bundle);
            } else if (abstractC14937 instanceof C21806) {
                String strM12558 = abstractC14937.m12557();
                c17330 = new C15092();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM12558);
                c17330.setArguments(bundle2);
            } else if (abstractC14937 instanceof C1669) {
                String strM12559 = abstractC14937.m12557();
                c17330 = new C17330();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM12559);
                c17330.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + abstractC14937.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            c17330.setTargetFragment(this, 0);
            c17330.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16740(String str) {
        RunnableC22111 runnableC22111 = new RunnableC22111(this, str);
        if (this.f19696 == null) {
            this.f19692 = runnableC22111;
        } else {
            runnableC22111.run();
        }
    }
}
