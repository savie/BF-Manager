package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class MenuItemOnActionExpandListenerC4569 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MenuItem.OnActionExpandListener f16249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC10534 f16250;

    public MenuItemOnActionExpandListenerC4569(MenuItemC10534 menuItemC10534, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16250 = menuItemC10534;
        this.f16249 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f16249.onMenuItemActionExpand(this.f16250.m37831(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f16249.onMenuItemActionCollapse(this.f16250.m37831(menuItem));
    }
}
