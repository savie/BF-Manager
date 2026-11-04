package l;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: renamed from: l.ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C2724 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7199 f9082;

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        return false;
    }

    public C2724(C7199 c7199) {
        this.f9082 = c7199;
    }

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
        C7199 c7199 = this.f9082;
        Window.Callback callback = c7199.f23768;
        if (c7199.f23767.mo18350()) {
            callback.onPanelClosed(108, c9898);
        } else if (callback.onPreparePanel(0, null, c9898)) {
            callback.onMenuOpened(108, c9898);
        }
    }
}
