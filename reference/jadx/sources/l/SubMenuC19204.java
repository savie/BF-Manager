package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4O7 */
/* JADX INFO: loaded from: classes5.dex */
public final class SubMenuC19204 extends MenuC3680 implements SubMenu {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceSubMenuC3368 f62017;

    public SubMenuC19204(Context context, InterfaceSubMenuC3368 interfaceSubMenuC3368) {
        super(context, interfaceSubMenuC3368);
        this.f62017 = interfaceSubMenuC3368;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f62017.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f62017.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f62017.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f62017.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f62017.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f62017.clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f62017.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f62017.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m36508(this.f62017.getItem());
    }
}
