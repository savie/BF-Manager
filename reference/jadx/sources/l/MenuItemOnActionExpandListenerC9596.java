package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes3.dex */
public final class MenuItemOnActionExpandListenerC9596 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MenuItem.OnActionExpandListener f32335;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC4386 f32336;

    public MenuItemOnActionExpandListenerC9596(MenuItemC4386 menuItemC4386, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f32336 = menuItemC4386;
        this.f32335 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f32335.onMenuItemActionExpand(this.f32336.m36508(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f32335.onMenuItemActionCollapse(this.f32336.m36508(menuItem));
    }
}
