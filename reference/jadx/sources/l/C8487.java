package l;

import android.view.ActionMode;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.۠۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C8487 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6996 f27778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActionMode.Callback f27779;

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
    }

    public C8487(C6996 c6996, ActionMode.Callback callback) {
        this.f27778 = c6996;
        this.f27779 = callback;
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        return this.f27779.onActionItemClicked(this.f27778, menuItem);
    }
}
