package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۚᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5508 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18908;

    public /* synthetic */ C5508(int i, Object obj) {
        this.f18907 = i;
        this.f18908 = obj;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f18907) {
            case 0:
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : (MenuItem[]) this.f18908) {
                    menuItem.setVisible(!bool.booleanValue());
                }
                break;
            default:
                C8765.m22773((C8765) this.f18908);
                break;
        }
    }
}
