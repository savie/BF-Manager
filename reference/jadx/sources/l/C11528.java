package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۨۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11528 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38747;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38748;

    public /* synthetic */ C11528(int i, Object obj) {
        this.f38747 = i;
        this.f38748 = obj;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f38747) {
            case 0:
                ((MenuItem) this.f38748).setEnabled(((Boolean) obj).booleanValue());
                break;
            default:
                C0906.m3610((C0906) this.f38748, (C6094) obj);
                break;
        }
    }
}
