package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۖᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2685 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10368;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10369;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10370;

    public /* synthetic */ C2685(int i, Object obj, Object obj2) {
        this.f10369 = i;
        this.f10370 = obj;
        this.f10368 = obj2;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f10369) {
            case 0:
                MenuItem menuItem = (MenuItem) this.f10370;
                MenuItem menuItem2 = (MenuItem) this.f10368;
                Boolean bool = (Boolean) obj;
                menuItem.setChecked(bool.booleanValue());
                menuItem2.setEnabled(!bool.booleanValue());
                break;
            default:
                AbstractC0656.m2973((AbstractC0656) this.f10370, (C4785) this.f10368);
                break;
        }
    }
}
