package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A53X */
/* JADX INFO: loaded from: classes4.dex */
public class SubMenuC7915 extends C12418 implements SubMenu {
    public C23707 mItem;
    public C12418 mParentMenu;

    public SubMenuC7915(Context context, C12418 c12418, C23707 c23707) {
        super(context);
        this.mParentMenu = c12418;
        this.mItem = c23707;
    }

    @Override // l.C12418, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // l.C12418
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // l.C12418
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // l.C12418
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

    @Override // l.C12418
    public void setCallback(InterfaceC0422 interfaceC0422) {
        this.mParentMenu.setCallback(interfaceC0422);
    }

    @Override // l.C12418
    public C12418 getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // l.C12418
    public boolean dispatchMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(c12418, menuItem) || this.mParentMenu.dispatchMenuItemSelected(c12418, menuItem);
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

    @Override // l.C12418
    public boolean expandItemActionView(C23707 c23707) {
        return this.mParentMenu.expandItemActionView(c23707);
    }

    @Override // l.C12418
    public boolean collapseItemActionView(C23707 c23707) {
        return this.mParentMenu.collapseItemActionView(c23707);
    }

    @Override // l.C12418
    public String getActionViewStatesKey() {
        C23707 c23707 = this.mItem;
        int itemId = c23707 != null ? c23707.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // l.C12418, l.InterfaceMenuC1957, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // l.C12418
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
