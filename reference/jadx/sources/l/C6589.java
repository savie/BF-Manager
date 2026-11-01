package l;

import android.content.Context;
import android.view.MenuItem;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.menu.PluginMenu;
import bin.mt.plugin.api.ui.menu.PluginPopupMenu;

/* JADX INFO: renamed from: l.ۜۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7I8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6589 implements PluginPopupMenu {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0944 f22207;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16195 f22208;

    public C6589(PluginContext pluginContext, Context context, PluginView pluginView) {
        C16195 c16195 = new C16195(context, ((C3247) pluginView).m9720(), 0);
        this.f22208 = c16195;
        this.f22207 = new C0944(pluginContext, c16195.m38298(), new C7660());
        c16195.m38292();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final PluginMenu getMenu() {
        return this.f22207;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setGravity(int i) {
        this.f22208.m38294(i);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final int getGravity() {
        return this.f22208.m38299();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void show() {
        this.f22208.m38297();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void dismiss() {
        this.f22208.m38293();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setOnMenuItemClickListener(PluginMenu.OnMenuItemClickListener onMenuItemClickListener) {
        C16195 c16195 = this.f22208;
        if (onMenuItemClickListener == null) {
            c16195.m38296((InterfaceC21133) null);
        } else {
            c16195.m38296(new C19078(this, onMenuItemClickListener));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m17896(C6589 c6589, PluginMenu.OnMenuItemClickListener onMenuItemClickListener, MenuItem menuItem) {
        C12940 c12940M3706 = c6589.f22207.m3706(menuItem.getItemId());
        if (c12940M3706 != null) {
            return onMenuItemClickListener.onMenuItemClick(c12940M3706);
        }
        return false;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setOnDismissListener(final PluginPopupMenu.OnDismissListener onDismissListener) {
        C16195 c16195 = this.f22208;
        if (onDismissListener == null) {
            c16195.m38295((InterfaceC7728) null);
        } else {
            c16195.m38295(new InterfaceC7728() { // from class: l.ۘۜۘ
                @Override // l.InterfaceC7728
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo11010(C16195 c16196) {
                    C6589 c6589 = this.f13627;
                    c6589.getClass();
                    onDismissListener.onDismiss(c6589);
                }
            });
        }
    }
}
