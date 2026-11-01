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

/* JADX INFO: renamed from: l.ܺܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16042 extends ComponentCallbacksC22654 implements InterfaceC2759, InterfaceC14050, InterfaceC11933, InterfaceC4897 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f51920;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5582 f51921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51925;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17492 f51926;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Runnable f51928;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19569 f51924 = new C19569(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51923 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f51927 = new HandlerC18157(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f51922 = new RunnableC18863(this);

    /* JADX INFO: renamed from: ۚ */
    public abstract void mo8658();

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.MT_Protector;
        }
        requireContext().getTheme().applyStyle(i, false);
        C5582 c5582 = new C5582(requireContext());
        this.f51921 = c5582;
        c5582.m15450((InterfaceC11933) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        mo8658();
    }

    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17492 c17492;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, C6993.f23524, R.attr.MT_Protector, 0);
        this.f51923 = typedArrayObtainStyledAttributes.getResourceId(0, this.f51923);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f51923, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c17492 = (C17492) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c17492 = (C17492) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c17492.setLayoutManager(new C13115(requireContext()));
            c17492.setAccessibilityDelegateCompat(new C1348(c17492));
        }
        this.f51926 = c17492;
        C19569 c19569 = this.f51924;
        c17492.addItemDecoration(c19569);
        c19569.m44672(drawable);
        if (dimensionPixelSize != -1) {
            c19569.m44671(dimensionPixelSize);
        }
        c19569.m44673(z);
        if (this.f51926.getParent() == null) {
            viewGroup2.addView(this.f51926);
        }
        this.f51927.post(this.f51922);
        return viewInflate;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C13344 c13344M15454;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (c13344M15454 = this.f51921.m15454()) != null) {
            c13344M15454.mo13138(bundle2);
        }
        if (this.f51920) {
            m38032();
            Runnable runnable = this.f51928;
            if (runnable != null) {
                ((RunnableC8280) runnable).run();
                this.f51928 = null;
            }
        }
        this.f51925 = true;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onStart() {
        super.onStart();
        this.f51921.m15449((InterfaceC2759) this);
        this.f51921.m15451((InterfaceC14050) this);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onStop() {
        super.onStop();
        this.f51921.m15449((InterfaceC2759) null);
        this.f51921.m15451((InterfaceC14050) null);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        Runnable runnable = this.f51922;
        Handler handler = this.f51927;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        if (this.f51920) {
            this.f51926.setAdapter(null);
            C13344 c13344M15454 = this.f51921.m15454();
            if (c13344M15454 != null) {
                c13344M15454.mo13172();
            }
        }
        this.f51926 = null;
        super.onDestroyView();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13344 c13344M15454 = this.f51921.m15454();
        if (c13344M15454 != null) {
            Bundle bundle2 = new Bundle();
            c13344M15454.mo13167(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5582 m38031() {
        return this.f51921;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13344 m38029() {
        return this.f51921.m15454();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38032() {
        C13344 c13344M15454 = this.f51921.m15454();
        if (c13344M15454 != null) {
            this.f51926.setAdapter(new C23803(c13344M15454));
            c13344M15454.mo4129();
        }
    }

    @Override // l.InterfaceC2759
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8422(C4751 c4751) {
        if (c4751.m13152() == null) {
            return false;
        }
        boolean zMo9941 = false;
        for (ComponentCallbacksC22654 parentFragment = this; !zMo9941 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC10397) {
                zMo9941 = ((InterfaceC10397) parentFragment).mo9941(this, c4751);
            }
        }
        if (!zMo9941 && (getContext() instanceof InterfaceC10397)) {
            zMo9941 = ((InterfaceC10397) getContext()).mo9941(this, c4751);
        }
        if (!zMo9941 && (getActivity() instanceof InterfaceC10397)) {
            zMo9941 = ((InterfaceC10397) getActivity()).mo9941(this, c4751);
        }
        if (zMo9941) {
            return true;
        }
        AbstractC8894 parentFragmentManager = getParentFragmentManager();
        Bundle bundleM13165 = c4751.m13165();
        C0075 c0075M23108 = parentFragmentManager.m23108();
        requireActivity().getClassLoader();
        ComponentCallbacksC22654 componentCallbacksC22654Mo1008 = c0075M23108.mo1008(c4751.m13152());
        componentCallbacksC22654Mo1008.setArguments(bundleM13165);
        componentCallbacksC22654Mo1008.setTargetFragment(this, 0);
        AbstractC11447 abstractC11447M23118 = parentFragmentManager.m23118();
        abstractC11447M23118.m28562(((View) requireView().getParent()).getId(), componentCallbacksC22654Mo1008, null);
        abstractC11447M23118.m28560();
        abstractC11447M23118.mo8560();
        return true;
    }

    @Override // l.InterfaceC11933
    /* JADX INFO: renamed from: ۙ */
    public final void mo29729(C13344 c13344) {
        boolean zM20100 = false;
        for (ComponentCallbacksC22654 parentFragment = this; !zM20100 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC7574) {
                zM20100 = ((InterfaceC7574) parentFragment).m20100();
            }
        }
        if (!zM20100 && (getContext() instanceof InterfaceC7574)) {
            zM20100 = ((InterfaceC7574) getContext()).m20100();
        }
        if (zM20100 || !(getActivity() instanceof InterfaceC7574)) {
            return;
        }
        ((InterfaceC7574) getActivity()).m20100();
    }

    @Override // l.InterfaceC4897
    public final C4751 findPreference(String str) {
        C5582 c5582 = this.f51921;
        if (c5582 == null) {
            return null;
        }
        return c5582.m15446((CharSequence) str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38030(int i) {
        C5582 c5582 = this.f51921;
        if (c5582 != null) {
            if (this.f51921.m15453(c5582.m15447(requireContext(), i, this.f51921.m15454()))) {
                this.f51920 = true;
                if (this.f51925) {
                    Handler handler = this.f51927;
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

    @Override // l.InterfaceC14050
    /* JADX INFO: renamed from: ۙ */
    public final void mo33996(AbstractC14071 abstractC14071) {
        DialogInterfaceOnCancelListenerC11281 c17597;
        boolean zM23293 = false;
        for (ComponentCallbacksC22654 parentFragment = this; !zM23293 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC8986) {
                zM23293 = ((InterfaceC8986) parentFragment).m23293();
            }
        }
        if (!zM23293 && (getContext() instanceof InterfaceC8986)) {
            zM23293 = ((InterfaceC8986) getContext()).m23293();
        }
        if (!zM23293 && (getActivity() instanceof InterfaceC8986)) {
            zM23293 = ((InterfaceC8986) getActivity()).m23293();
        }
        if (!zM23293 && getParentFragmentManager().m23119("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC14071 instanceof C13365) {
                String strM13157 = abstractC14071.m13157();
                c17597 = new C23243();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM13157);
                c17597.setArguments(bundle);
            } else if (abstractC14071 instanceof C8426) {
                String strM13158 = abstractC14071.m13157();
                c17597 = new C7720();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM13158);
                c17597.setArguments(bundle2);
            } else if (abstractC14071 instanceof C20420) {
                String strM13159 = abstractC14071.m13157();
                c17597 = new C17597();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM13159);
                c17597.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + abstractC14071.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            c17597.setTargetFragment(this, 0);
            c17597.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38033(String str) {
        RunnableC8280 runnableC8280 = new RunnableC8280(this, str);
        if (this.f51926 == null) {
            this.f51928 = runnableC8280;
        } else {
            runnableC8280.run();
        }
    }
}
