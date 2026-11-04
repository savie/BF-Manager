package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes.dex */
public final class C24793 implements InterfaceC23301 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f80242 = new HashMap();

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ */
    public final void mo6005() {
    }

    public C24793(C3163 c3163) {
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ */
    public final void mo6006(C21566 c21566) {
        throw c21566;
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ */
    public final void mo6008(C24550 c24550, InterfaceC14852 interfaceC14852) {
        this.f80242.put(c24550, new C15841(c24550, new C17333(interfaceC14852)));
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ */
    public final void mo6007(C24550 c24550) {
        this.f80242.remove(c24550);
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6009() {
        HashMap map = this.f80242;
        C4937.forEach(map.values(), new C11366());
        map.clear();
    }
}
