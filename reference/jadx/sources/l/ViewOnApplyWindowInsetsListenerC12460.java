package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnApplyWindowInsetsListenerC12460 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15844 f41538 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f41539;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11754 f41540;

    public ViewOnApplyWindowInsetsListenerC12460(View view, InterfaceC11754 interfaceC11754) {
        this.f41539 = view;
        this.f41540 = interfaceC11754;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C15844 c15844M37669 = C15844.m37669(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC11754 interfaceC11754 = this.f41540;
        if (i < 30) {
            C17398.m40531(windowInsets, this.f41539);
            if (c15844M37669.equals(this.f41538)) {
                return interfaceC11754.onApplyWindowInsets(view, c15844M37669).m37687();
            }
        }
        this.f41538 = c15844M37669;
        C15844 c15844OnApplyWindowInsets = interfaceC11754.onApplyWindowInsets(view, c15844M37669);
        if (i >= 30) {
            return c15844OnApplyWindowInsets.m37687();
        }
        int i2 = C5031.f17539;
        C16693.m39169(view);
        return c15844OnApplyWindowInsets.m37687();
    }
}
