package l;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.ۡܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9414 extends C19111 implements PluginSubMenu {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10160 f30553;

    public C9414(PluginContext pluginContext, String str, String str2, SubMenuC12026 subMenuC12026, InterfaceC19722 interfaceC19722) {
        super(pluginContext, subMenuC12026, interfaceC19722);
        this.f30553 = new C10160(pluginContext, str, str2, (InterfaceMenuItemC22709) subMenuC12026.getItem(), this);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final PluginSubMenu setIcon(Drawable drawable) {
        ((InterfaceSubMenuC19725) this.f61850).setIcon(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final PluginMenuItem getItem() {
        return this.f30553;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final C10160 getItem() {
        return this.f30553;
    }
}
