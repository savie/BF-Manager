package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnApplyWindowInsetsListenerC18761 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3977 f60929 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f60930;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22491 f60931;

    public ViewOnApplyWindowInsetsListenerC18761(View view, InterfaceC22491 interfaceC22491) {
        this.f60930 = view;
        this.f60931 = interfaceC22491;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3977 c3977M12812 = C3977.m12812(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC22491 interfaceC22491 = this.f60931;
        if (i < 30) {
            C9810.m25557(windowInsets, this.f60930);
            if (c3977M12812.equals(this.f60929)) {
                return interfaceC22491.onApplyWindowInsets(view, c3977M12812).m12827();
            }
        }
        this.f60929 = c3977M12812;
        C3977 c3977OnApplyWindowInsets = interfaceC22491.onApplyWindowInsets(view, c3977M12812);
        if (i >= 30) {
            return c3977OnApplyWindowInsets.m12827();
        }
        int i2 = C22666.f73603;
        C7574.m20697(view);
        return c3977OnApplyWindowInsets.m12827();
    }
}
