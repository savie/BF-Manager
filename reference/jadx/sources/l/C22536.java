package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩹᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22536 implements InterfaceC20723, InterfaceC21133 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73506;

    public /* synthetic */ C22536(Object obj) {
        this.f73506 = obj;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((ActivityC15481) this.f73506).onOptionsItemSelected(menuItem);
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC15785 mo4000() {
        return new C12616((C11601) this.f73506);
    }
}
