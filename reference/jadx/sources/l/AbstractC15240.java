package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 8530 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15240 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f49699;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12274 f49700;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12274 f49701;

    public AbstractC15240(Context context) {
        this.f49699 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MenuItem m36508(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC9720)) {
            return menuItem;
        }
        InterfaceMenuItemC9720 interfaceMenuItemC9720 = (InterfaceMenuItemC9720) menuItem;
        if (this.f49701 == null) {
            this.f49701 = new C12274();
        }
        MenuItem menuItem2 = (MenuItem) this.f49701.getOrDefault(interfaceMenuItemC9720, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC4386 menuItemC4386 = new MenuItemC4386(this.f49699, interfaceMenuItemC9720);
        this.f49701.put(interfaceMenuItemC9720, menuItemC4386);
        return menuItemC4386;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SubMenu m36509(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC3368)) {
            return subMenu;
        }
        InterfaceSubMenuC3368 interfaceSubMenuC3368 = (InterfaceSubMenuC3368) subMenu;
        if (this.f49700 == null) {
            this.f49700 = new C12274();
        }
        SubMenu subMenu2 = (SubMenu) this.f49700.getOrDefault(interfaceSubMenuC3368, null);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC19204 subMenuC19204 = new SubMenuC19204(this.f49699, interfaceSubMenuC3368);
        this.f49700.put(interfaceSubMenuC3368, subMenuC19204);
        return subMenuC19204;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36507() {
        C12274 c12274 = this.f49701;
        if (c12274 != null) {
            c12274.clear();
        }
        C12274 c12275 = this.f49700;
        if (c12275 != null) {
            c12275.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36510(int i) {
        if (this.f49701 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f49701.size()) {
            if (((InterfaceMenuItemC9720) this.f49701.m30510(i2)).getGroupId() == i) {
                this.f49701.m30509(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36511(int i) {
        if (this.f49701 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f49701.size(); i2++) {
            if (((InterfaceMenuItemC9720) this.f49701.m30510(i2)).getItemId() == i) {
                this.f49701.m30509(i2);
                return;
            }
        }
    }
}
