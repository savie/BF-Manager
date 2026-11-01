package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9140 implements InterfaceC0422 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16195 f31086;

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
    }

    public C9140(C16195 c16195) {
        this.f31086 = c16195;
    }

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        InterfaceC21133 interfaceC21133 = this.f31086.f52294;
        if (interfaceC21133 != null) {
            return interfaceC21133.onMenuItemClick(menuItem);
        }
        return false;
    }
}
