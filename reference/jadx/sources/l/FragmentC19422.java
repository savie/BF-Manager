package l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ᩳ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P96C */
/* JADX INFO: loaded from: classes5.dex */
public class FragmentC19422 extends Fragment {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62761 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC21660 f62762;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m44915(EnumC9330.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC21660 interfaceC21660 = this.f62762;
        if (interfaceC21660 != null) {
            interfaceC21660.onStart();
        }
        m44915(EnumC9330.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC21660 interfaceC21660 = this.f62762;
        if (interfaceC21660 != null) {
            interfaceC21660.mo49197();
        }
        m44915(EnumC9330.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m44915(EnumC9330.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m44915(EnumC9330.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m44915(EnumC9330.ON_DESTROY);
        this.f62762 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m44915(EnumC9330 enumC9330) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C15243.m36591(activity, "getActivity(...)");
            C18676.m43427(activity, enumC9330);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44916(C24644 c24644) {
        this.f62762 = c24644;
    }
}
