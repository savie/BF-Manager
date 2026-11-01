package l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۢ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes3.dex */
public class FragmentC9891 extends Fragment {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33768 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC11302 f33769;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m25034(EnumC1651.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC11302 interfaceC11302 = this.f33769;
        if (interfaceC11302 != null) {
            interfaceC11302.onStart();
        }
        m25034(EnumC1651.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC11302 interfaceC11302 = this.f33769;
        if (interfaceC11302 != null) {
            interfaceC11302.mo28305();
        }
        m25034(EnumC1651.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m25034(EnumC1651.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m25034(EnumC1651.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m25034(EnumC1651.ON_DESTROY);
        this.f33769 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m25034(EnumC1651 enumC1651) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C13465.m32967(activity, "activity");
            C24002.m52832(activity, enumC1651);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25035(C16946 c16946) {
        this.f33769 = c16946;
    }
}
