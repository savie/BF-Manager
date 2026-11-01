package l;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.᩺ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37IG */
/* JADX INFO: loaded from: classes.dex */
public final class C22818 extends C0944 implements PluginSubMenu {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12940 f74234;

    public C22818(PluginContext pluginContext, String str, String str2, SubMenuC7915 subMenuC7915, InterfaceC6248 interfaceC6248) {
        super(pluginContext, subMenuC7915, interfaceC6248);
        this.f74234 = new C12940(pluginContext, str, str2, (InterfaceMenuItemC9720) subMenuC7915.getItem(), this);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final PluginSubMenu setIcon(Drawable drawable) {
        ((InterfaceSubMenuC3368) this.f3752).setIcon(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final PluginMenuItem getItem() {
        return this.f74234;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final C12940 getItem() {
        return this.f74234;
    }
}
