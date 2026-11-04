package l;

/* JADX INFO: renamed from: l.ܰۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C14436 implements InterfaceC1013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f45444;

    public final String toString() {
        return "CheckContext: basicHandler";
    }

    public C14436(C22092 c22092) {
        this.f45444 = c22092;
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final void mo3910(InterfaceC5075 interfaceC5075, C17007 c17007) {
        C7312 c7312 = this.f45444.f71200;
        C11040 c11040 = C22843.f74058;
        c7312.m34520(interfaceC5075, new C11040("compiler", "prob.found.req", c17007));
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3911(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        return this.f45444.f71203.m55164(abstractC22664, abstractC22665, c1083);
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final C2596 mo2276() {
        return this.f45444.f71223.f45700;
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ᩷ */
    public final C4192 mo2277() {
        return this.f45444.f71209.f41172;
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final C1083 mo3909(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return new C2504(this.f45444, interfaceC5075, "unchecked.assign", abstractC22664, abstractC22665);
    }
}
