package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩷ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22156 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71369;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71371;

    public /* synthetic */ C22156(int i, Object obj, Object obj2) {
        this.f71369 = i;
        this.f71371 = obj;
        this.f71370 = obj2;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f71369) {
            case 0:
                MenuItem menuItem = (MenuItem) this.f71371;
                MenuItem menuItem2 = (MenuItem) this.f71370;
                Boolean bool = (Boolean) obj;
                menuItem.setChecked(bool.booleanValue());
                menuItem2.setEnabled(!bool.booleanValue());
                break;
            default:
                AbstractC12881.m31918((AbstractC12881) this.f71371, (C13511) this.f71370);
                break;
        }
    }
}
