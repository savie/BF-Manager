package l;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractFragmentC6889 extends Fragment implements InterfaceC18381, InterfaceC14651, InterfaceC21365, InterfaceC4497 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C25227 f22854;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0482 f22855;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ContextThemeWrapper f22856;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0923 f22857 = new C0923(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22858 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f22860 = new HandlerC18822(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Runnable f22859 = new RunnableC9871(this);

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void m19154();

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.MT_Protector;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.f22856 = contextThemeWrapper;
        C0482 c0482 = new C0482(contextThemeWrapper);
        this.f22855 = c0482;
        c0482.m2334((InterfaceC21365) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        m19154();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C25227 c25227;
        ContextThemeWrapper contextThemeWrapper = this.f22856;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, C9430.f30589, C2506.m8385(contextThemeWrapper, R.attr.MT_Protector, android.R.attr.preferenceFragmentStyle), 0);
        this.f22858 = typedArrayObtainStyledAttributes.getResourceId(0, this.f22858);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f22856);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f22858, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!this.f22856.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c25227 = (C25227) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c25227 = (C25227) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c25227.setLayoutManager(new C0067(getActivity()));
            c25227.setAccessibilityDelegateCompat(new C19127(c25227));
        }
        this.f22854 = c25227;
        C0923 c0923 = this.f22857;
        c25227.addItemDecoration(c0923);
        c0923.m3730(drawable);
        if (dimensionPixelSize != -1) {
            c0923.m3729(dimensionPixelSize);
        }
        c0923.m3731(z);
        if (this.f22854.getParent() == null) {
            viewGroup2.addView(this.f22854);
        }
        this.f22860.post(this.f22859);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C10176 c10176M2339;
        super.onViewCreated(view, bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (c10176M2339 = this.f22855.m2339()) == null) {
            return;
        }
        c10176M2339.mo12564(bundle2);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f22855.m2333((InterfaceC18381) this);
        this.f22855.m2331((InterfaceC14651) this);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f22855.m2333((InterfaceC18381) null);
        this.f22855.m2331((InterfaceC14651) null);
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        Runnable runnable = this.f22859;
        Handler handler = this.f22860;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        this.f22854 = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C10176 c10176M2339 = this.f22855.m2339();
        if (c10176M2339 != null) {
            Bundle bundle2 = new Bundle();
            c10176M2339.mo12600(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19153() {
        C10176 c10176M2339 = this.f22855.m2339();
        if (c10176M2339 != null) {
            this.f22854.setAdapter(new C3465(c10176M2339));
            c10176M2339.mo12582();
        }
    }

    @Override // l.InterfaceC18381
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16736(C3906 c3906) {
        if (c3906.m12593() == null || !(getActivity() instanceof InterfaceC2414)) {
            return false;
        }
        return ((InterfaceC2414) getActivity()).m8157();
    }

    @Override // l.InterfaceC21365
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo16734(C10176 c10176) {
        if (getActivity() instanceof InterfaceC8380) {
            ((InterfaceC8380) getActivity()).m22551();
        }
    }

    @Override // l.InterfaceC4497
    @Deprecated
    public final C3906 findPreference(String str) {
        C0482 c0482 = this.f22855;
        if (c0482 == null) {
            return null;
        }
        return c0482.m2328((CharSequence) str);
    }

    @Override // l.InterfaceC14651
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo16735(AbstractC14937 abstractC14937) {
        DialogFragment dialogFragmentC24790;
        if (!(getActivity() instanceof InterfaceC9125 ? ((InterfaceC9125) getActivity()).m24274() : false) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC14937 instanceof C10462) {
                String strM12557 = abstractC14937.m12557();
                dialogFragmentC24790 = new DialogFragmentC1514();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM12557);
                dialogFragmentC24790.setArguments(bundle);
            } else if (abstractC14937 instanceof C21806) {
                String strM12558 = abstractC14937.m12557();
                dialogFragmentC24790 = new DialogFragmentC22552();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM12558);
                dialogFragmentC24790.setArguments(bundle2);
            } else if (abstractC14937 instanceof C1669) {
                String strM12559 = abstractC14937.m12557();
                dialogFragmentC24790 = new DialogFragmentC24790();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM12559);
                dialogFragmentC24790.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragmentC24790.setTargetFragment(this, 0);
            dialogFragmentC24790.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }
}
