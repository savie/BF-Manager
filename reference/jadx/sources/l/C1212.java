package l;

import android.content.Context;
import android.view.MenuItem;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.menu.PluginMenu;
import bin.mt.plugin.api.ui.menu.PluginPopupMenu;

/* JADX INFO: renamed from: l.֨ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7I8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1212 implements PluginPopupMenu {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19111 f4444;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18452 f4445;

    public C1212(PluginContext pluginContext, Context context, PluginView pluginView) {
        C18452 c18452 = new C18452(context, ((C6128) pluginView).m17689(), 0);
        this.f4445 = c18452;
        this.f4444 = new C19111(pluginContext, c18452.m42995(), new C2329());
        c18452.m42997();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final PluginMenu getMenu() {
        return this.f4444;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setGravity(int i) {
        this.f4445.m42992(i);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final int getGravity() {
        return this.f4445.m42996();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void show() {
        this.f4445.mo21878();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void dismiss() {
        this.f4445.m42991();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setOnMenuItemClickListener(PluginMenu.OnMenuItemClickListener onMenuItemClickListener) {
        C18452 c18452 = this.f4445;
        if (onMenuItemClickListener == null) {
            c18452.m42994((InterfaceC21436) null);
        } else {
            c18452.m42994(new C13768(this, onMenuItemClickListener));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m4432(C1212 c1212, PluginMenu.OnMenuItemClickListener onMenuItemClickListener, MenuItem menuItem) {
        C10160 c10160M44234 = c1212.f4444.m44234(menuItem.getItemId());
        if (c10160M44234 != null) {
            return onMenuItemClickListener.onMenuItemClick(c10160M44234);
        }
        return false;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setOnDismissListener(PluginPopupMenu.OnDismissListener onDismissListener) {
        C18452 c18452 = this.f4445;
        if (onDismissListener == null) {
            c18452.m42993((InterfaceC14722) null);
        } else {
            c18452.m42993(new C8440(this, onDismissListener));
        }
    }
}
