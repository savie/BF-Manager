package l;

/* JADX INFO: renamed from: l.ۤ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8II */
/* JADX INFO: loaded from: classes4.dex */
public final class C11230 extends C20248 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9060 f35422;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23165 f35423;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11230(C23165 c23165, InterfaceC9060 interfaceC9060, InterfaceC9060 interfaceC9061) {
        super(interfaceC9060);
        this.f35423 = c23165;
        this.f35422 = interfaceC9061;
    }

    @Override // l.C20248, l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C9805 c9805Mo2290 = this.f35422.mo2290(j);
        C2349 c2349 = c9805Mo2290.f31592;
        long j2 = c2349.f7574;
        long j3 = c2349.f7573;
        C23165 c23165 = this.f35423;
        C2349 c23410 = new C2349(j2, j3 + c23165.f75088);
        C2349 c23411 = c9805Mo2290.f31593;
        return new C9805(c23410, new C2349(c23411.f7574, c23411.f7573 + c23165.f75088));
    }
}
