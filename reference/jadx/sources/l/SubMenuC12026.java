package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A53X */
/* JADX INFO: loaded from: classes4.dex */
public class SubMenuC12026 extends C9898 implements SubMenu {
    public C8407 mItem;
    public C9898 mParentMenu;

    public SubMenuC12026(Context context, C9898 c9898, C8407 c8407) {
        super(context);
        this.mParentMenu = c9898;
        this.mItem = c8407;
    }

    @Override // l.C9898, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // l.C9898
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // l.C9898
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // l.C9898
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    @Override // l.C9898
    public void setCallback(InterfaceC7662 interfaceC7662) {
        this.mParentMenu.setCallback(interfaceC7662);
    }

    @Override // l.C9898
    public C9898 getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // l.C9898
    public boolean dispatchMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(c9898, menuItem) || this.mParentMenu.dispatchMenuItemSelected(c9898, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // l.C9898
    public boolean expandItemActionView(C8407 c8407) {
        return this.mParentMenu.expandItemActionView(c8407);
    }

    @Override // l.C9898
    public boolean collapseItemActionView(C8407 c8407) {
        return this.mParentMenu.collapseItemActionView(c8407);
    }

    @Override // l.C9898
    public String getActionViewStatesKey() {
        C8407 c8407 = this.mItem;
        int itemId = c8407 != null ? c8407.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // l.C9898, l.InterfaceMenuC10774, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // l.C9898
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
