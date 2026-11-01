package l;

/* JADX INFO: renamed from: l.֨ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1261 implements InterfaceC18195 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f5478;

    public final String toString() {
        return "CheckContext: basicHandler";
    }

    public C1261(C21017 c21017) {
        this.f5478 = c21017;
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final void mo2545(InterfaceC12260 interfaceC12260, C11948 c11948) {
        C20414 c20414 = this.f5478.f68429;
        C5909 c5909 = C23879.f77204;
        c20414.m48199(interfaceC12260, new C5909("compiler", "prob.found.req", c11948));
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2933(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        return this.f5478.f68417.m52428(abstractC16579, abstractC165710, c10391);
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19524 mo4574() {
        return this.f5478.f68441.f43861;
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12926 mo4575() {
        return this.f5478.f68416.f20035;
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10391 mo4573(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return new C8318(this.f5478, interfaceC12260, "unchecked.assign", abstractC16579, abstractC165710);
    }
}
