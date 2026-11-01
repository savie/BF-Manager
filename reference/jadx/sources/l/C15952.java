package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܺ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15952 implements InterfaceC7359, InterfaceC4397, InterfaceC21133, InterfaceC0380, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51660;

    public /* synthetic */ C15952(Object obj) {
        this.f51660 = obj;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        C7236.m19297((C7236) this.f51660, menuItem);
        return true;
    }

    @Override // l.InterfaceC4397
    public void writeByte(int i) {
        ((InterfaceC16662) this.f51660).writeByte(i);
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        ((C22032) this.f51660).m48923((C14500) obj, false);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC19333) obj).mo2611((C16841) this.f51660);
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        throw new C9573((String) this.f51660);
    }
}
