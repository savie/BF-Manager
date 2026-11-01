package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3763 implements InterfaceC0422 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22815 f13622;

    public C3763(C22815 c22815) {
        this.f13622 = c22815;
    }

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        InterfaceC6586 interfaceC6586 = this.f13622.f74225;
        if (interfaceC6586 != null) {
            C6938 c6938 = ((C9740) interfaceC6586).f32766;
            if (c6938.mMenuHostHelper.m17513(menuItem)) {
                zOnMenuItemClick = true;
            } else {
                InterfaceC1293 interfaceC1293 = c6938.mOnMenuItemClickListener;
                zOnMenuItemClick = interfaceC1293 != null ? interfaceC1293.onMenuItemClick(menuItem) : false;
            }
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
        InterfaceC0422 interfaceC0422 = this.f13622.f74230;
        if (interfaceC0422 != null) {
            interfaceC0422.onMenuModeChange(c12418);
        }
    }
}
