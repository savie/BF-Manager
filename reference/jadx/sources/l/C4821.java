package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4821 implements InterfaceC0422 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6938 f16961;

    public C4821(C6938 c6938) {
        this.f16961 = c6938;
    }

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        InterfaceC0422 interfaceC0422 = this.f16961.mMenuBuilderCallback;
        return interfaceC0422 != null && interfaceC0422.onMenuItemSelected(c12418, menuItem);
    }

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
        C6938 c6938 = this.f16961;
        if (!c6938.mMenuView.m50494()) {
            c6938.mMenuHostHelper.m17514(c12418);
        }
        InterfaceC0422 interfaceC0422 = c6938.mMenuBuilderCallback;
        if (interfaceC0422 != null) {
            interfaceC0422.onMenuModeChange(c12418);
        }
    }
}
