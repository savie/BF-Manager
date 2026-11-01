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

/* JADX INFO: renamed from: l.᩸ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class AbstractFragmentC21685 extends Fragment implements InterfaceC2759, InterfaceC14050, InterfaceC11933, InterfaceC4897 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ContextThemeWrapper f70332;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5582 f70333;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17492 f70335;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4045 f70334 = new C4045(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f70331 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f70337 = new HandlerC1223(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Runnable f70336 = new RunnableC13219(this);

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void m48427();

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
        this.f70332 = contextThemeWrapper;
        C5582 c5582 = new C5582(contextThemeWrapper);
        this.f70333 = c5582;
        c5582.m15450((InterfaceC11933) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        m48427();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17492 c17492;
        ContextThemeWrapper contextThemeWrapper = this.f70332;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, C6993.f23529, C12398.m30832(contextThemeWrapper, R.attr.MT_Protector, android.R.attr.preferenceFragmentStyle), 0);
        this.f70331 = typedArrayObtainStyledAttributes.getResourceId(0, this.f70331);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f70332);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f70331, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!this.f70332.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c17492 = (C17492) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c17492 = (C17492) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c17492.setLayoutManager(new C13115(getActivity()));
            c17492.setAccessibilityDelegateCompat(new C1348(c17492));
        }
        this.f70335 = c17492;
        C4045 c4045 = this.f70334;
        c17492.addItemDecoration(c4045);
        c4045.m11551(drawable);
        if (dimensionPixelSize != -1) {
            c4045.m11550(dimensionPixelSize);
        }
        c4045.m11552(z);
        if (this.f70335.getParent() == null) {
            viewGroup2.addView(this.f70335);
        }
        this.f70337.post(this.f70336);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C13344 c13344M15454;
        super.onViewCreated(view, bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (c13344M15454 = this.f70333.m15454()) == null) {
            return;
        }
        c13344M15454.mo13138(bundle2);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f70333.m15449((InterfaceC2759) this);
        this.f70333.m15451((InterfaceC14050) this);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f70333.m15449((InterfaceC2759) null);
        this.f70333.m15451((InterfaceC14050) null);
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        Runnable runnable = this.f70336;
        Handler handler = this.f70337;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        this.f70335 = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13344 c13344M15454 = this.f70333.m15454();
        if (c13344M15454 != null) {
            Bundle bundle2 = new Bundle();
            c13344M15454.mo13167(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48426() {
        C13344 c13344M15454 = this.f70333.m15454();
        if (c13344M15454 != null) {
            this.f70335.setAdapter(new C23803(c13344M15454));
            c13344M15454.mo4129();
        }
    }

    @Override // l.InterfaceC2759
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8422(C4751 c4751) {
        if (c4751.m13152() == null || !(getActivity() instanceof InterfaceC23097)) {
            return false;
        }
        return ((InterfaceC23097) getActivity()).m51105();
    }

    @Override // l.InterfaceC11933
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo29729(C13344 c13344) {
        if (getActivity() instanceof InterfaceC15336) {
            ((InterfaceC15336) getActivity()).m36714();
        }
    }

    @Override // l.InterfaceC4897
    @Deprecated
    public final C4751 findPreference(String str) {
        C5582 c5582 = this.f70333;
        if (c5582 == null) {
            return null;
        }
        return c5582.m15446((CharSequence) str);
    }

    @Override // l.InterfaceC14050
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo33996(AbstractC14071 abstractC14071) {
        DialogFragment dialogFragmentC16892;
        if (!(getActivity() instanceof InterfaceC6868 ? ((InterfaceC6868) getActivity()).m18489() : false) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC14071 instanceof C13365) {
                String strM13157 = abstractC14071.m13157();
                dialogFragmentC16892 = new DialogFragmentC4191();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM13157);
                dialogFragmentC16892.setArguments(bundle);
            } else if (abstractC14071 instanceof C8426) {
                String strM13158 = abstractC14071.m13157();
                dialogFragmentC16892 = new DialogFragmentC9132();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM13158);
                dialogFragmentC16892.setArguments(bundle2);
            } else if (abstractC14071 instanceof C20420) {
                String strM13159 = abstractC14071.m13157();
                dialogFragmentC16892 = new DialogFragmentC16892();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM13159);
                dialogFragmentC16892.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragmentC16892.setTargetFragment(this, 0);
            dialogFragmentC16892.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }
}
