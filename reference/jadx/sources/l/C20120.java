package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20120 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16390 f64624;

    public C20120(C16390 c16390) {
        this.f64624 = c16390;
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        InterfaceC7662 interfaceC7662 = this.f64624.mMenuBuilderCallback;
        return interfaceC7662 != null && interfaceC7662.onMenuItemSelected(c9898, menuItem);
    }

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
        C16390 c16390 = this.f64624;
        if (!c16390.mMenuView.m41166()) {
            c16390.mMenuHostHelper.m3993(c9898);
        }
        InterfaceC7662 interfaceC7662 = c16390.mMenuBuilderCallback;
        if (interfaceC7662 != null) {
            interfaceC7662.onMenuModeChange(c9898);
        }
    }
}
