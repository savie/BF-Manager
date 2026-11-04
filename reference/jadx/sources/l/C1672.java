package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֫ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672 implements InterfaceC23301 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f5775 = new HashMap();

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6006(C21566 c21566) {
    }

    public C1672(C3163 c3163) {
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6005() {
        C4937.forEach(this.f5775.values(), new C15095());
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6008(C24550 c24550, InterfaceC14852 interfaceC14852) {
        this.f5775.put(c24550, new C15841(c24550, new C5401(this, interfaceC14852)));
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6007(C24550 c24550) {
        this.f5775.remove(c24550);
    }

    @Override // l.InterfaceC23301
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo6009() {
        C4937.forEach(this.f5775.values(), new C12858());
    }
}
