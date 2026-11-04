package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24991 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17531 f80928;

    public C24991(C17531 c17531) {
        this.f80928 = c17531;
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        InterfaceC16785 interfaceC16785 = this.f80928.f56983;
        if (interfaceC16785 != null) {
            C16390 c16390 = ((C11169) interfaceC16785).f35166;
            if (c16390.mMenuHostHelper.m3992(menuItem)) {
                zOnMenuItemClick = true;
            } else {
                InterfaceC25342 interfaceC25342 = c16390.mOnMenuItemClickListener;
                zOnMenuItemClick = interfaceC25342 != null ? interfaceC25342.onMenuItemClick(menuItem) : false;
            }
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
        InterfaceC7662 interfaceC7662 = this.f80928.f56992;
        if (interfaceC7662 != null) {
            interfaceC7662.onMenuModeChange(c9898);
        }
    }
}
