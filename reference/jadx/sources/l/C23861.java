package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes.dex */
public final class C23861 implements InterfaceC3398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f77130 = new HashMap();

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10069() {
    }

    public C23861(C4831 c4831) {
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10070(C4146 c4146) {
        throw c4146;
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10072(C22492 c22492, InterfaceC13320 interfaceC13320) {
        this.f77130.put(c22492, new C9750(c22492, new C1987(interfaceC13320)));
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ۙ */
    public final void mo10071(C22492 c22492) {
        this.f77130.remove(c22492);
    }

    @Override // l.InterfaceC3398
    /* JADX INFO: renamed from: ܰ */
    public final void mo10073() {
        HashMap map = this.f77130;
        C0356.forEach(map.values(), new C11161());
        map.clear();
    }
}
