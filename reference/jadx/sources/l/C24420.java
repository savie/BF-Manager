package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24420 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18452 f79287;

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
    }

    public C24420(C18452 c18452) {
        this.f79287 = c18452;
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        InterfaceC21436 interfaceC21436 = this.f79287.f60069;
        if (interfaceC21436 != null) {
            return interfaceC21436.onMenuItemClick(menuItem);
        }
        return false;
    }
}
