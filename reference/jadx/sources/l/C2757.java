package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۖܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CIS6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2757 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8723 f9120;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7276 f9121;

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
    }

    public C2757(C8723 c8723, C7276 c7276) {
        this.f9120 = c8723;
        this.f9121 = c7276;
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        menuItem.setChecked(true);
        this.f9120.dismiss();
        this.f9121.accept(menuItem.getItemId());
        return true;
    }
}
