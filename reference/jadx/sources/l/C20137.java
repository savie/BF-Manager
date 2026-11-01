package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩶ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20137 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65372;

    public /* synthetic */ C20137(int i, Object obj) {
        this.f65371 = i;
        this.f65372 = obj;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f65371) {
            case 0:
                C16609.m39050((InterfaceC0380) this.f65372, (Object[]) obj);
                break;
            case 1:
                ((MenuItem) this.f65372).setChecked(((Boolean) obj).booleanValue());
                break;
            case 2:
                C0906.m3606((C0906) this.f65372);
                break;
            default:
                C20890.m46979((C20890) this.f65372, (C6094) obj);
                break;
        }
    }
}
