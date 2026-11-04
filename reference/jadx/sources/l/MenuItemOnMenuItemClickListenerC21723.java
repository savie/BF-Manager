package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC21723 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f69320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC10534 f69321;

    public MenuItemOnMenuItemClickListenerC21723(MenuItemC10534 menuItemC10534, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f69321 = menuItemC10534;
        this.f69320 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f69320.onMenuItemClick(this.f69321.m37831(menuItem));
    }
}
