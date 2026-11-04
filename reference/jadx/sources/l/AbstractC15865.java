package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8530 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15865 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f51593;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9086 f51594;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9086 f51595;

    public AbstractC15865(Context context) {
        this.f51593 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MenuItem m37831(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC22709)) {
            return menuItem;
        }
        InterfaceMenuItemC22709 interfaceMenuItemC22709 = (InterfaceMenuItemC22709) menuItem;
        if (this.f51595 == null) {
            this.f51595 = new C9086();
        }
        MenuItem menuItem2 = (MenuItem) this.f51595.get(interfaceMenuItemC22709);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC10534 menuItemC10534 = new MenuItemC10534(this.f51593, interfaceMenuItemC22709);
        this.f51595.put(interfaceMenuItemC22709, menuItemC10534);
        return menuItemC10534;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SubMenu m37832(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC19725)) {
            return subMenu;
        }
        InterfaceSubMenuC19725 interfaceSubMenuC19725 = (InterfaceSubMenuC19725) subMenu;
        if (this.f51594 == null) {
            this.f51594 = new C9086();
        }
        SubMenu subMenu2 = (SubMenu) this.f51594.get(interfaceSubMenuC19725);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC6061 subMenuC6061 = new SubMenuC6061(this.f51593, interfaceSubMenuC19725);
        this.f51594.put(interfaceSubMenuC19725, subMenuC6061);
        return subMenuC6061;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m37835() {
        C9086 c9086 = this.f51595;
        if (c9086 != null) {
            c9086.clear();
        }
        C9086 c9087 = this.f51594;
        if (c9087 != null) {
            c9087.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37833(int i) {
        if (this.f51595 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f51595.size()) {
            if (((InterfaceMenuItemC22709) this.f51595.m24220(i2)).getGroupId() == i) {
                this.f51595.m24222(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37834(int i) {
        if (this.f51595 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f51595.size(); i2++) {
            if (((InterfaceMenuItemC22709) this.f51595.m24220(i2)).getItemId() == i) {
                this.f51595.m24222(i2);
                return;
            }
        }
    }
}
