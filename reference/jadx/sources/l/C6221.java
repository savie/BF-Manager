package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6221 implements InterfaceC3398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f21140 = new HashMap();

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10070(C4146 c4146) {
    }

    public C6221(C4831 c4831) {
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10069() {
        C0356.forEach(this.f21140.values(), new C16805());
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10072(C22492 c22492, InterfaceC13320 interfaceC13320) {
        this.f21140.put(c22492, new C9750(c22492, new C17510(this, interfaceC13320)));
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10071(C22492 c22492) {
        this.f21140.remove(c22492);
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ܰ */
    public final void mo10073() {
        C0356.forEach(this.f21140.values(), new C12572());
    }
}
