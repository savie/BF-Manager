package l;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: renamed from: l.ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11277 implements InterfaceC0422 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14805 f38101;

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        return false;
    }

    public C11277(C14805 c14805) {
        this.f38101 = c14805;
    }

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
        C14805 c14805 = this.f38101;
        Window.Callback callback = c14805.f48405;
        if (c14805.f48402.mo44619()) {
            callback.onPanelClosed(108, c12418);
        } else if (callback.onPreparePanel(0, null, c12418)) {
            callback.onMenuOpened(108, c12418);
        }
    }
}
