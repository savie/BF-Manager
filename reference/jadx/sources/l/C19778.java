package l;

/* JADX INFO: renamed from: l.᩵᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8II */
/* JADX INFO: loaded from: classes5.dex */
public final class C19778 extends C1577 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6599 f63530;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9195 f63531;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19778(C9195 c9195, InterfaceC6599 interfaceC6599, InterfaceC6599 interfaceC65910) {
        super(interfaceC6599);
        this.f63531 = c9195;
        this.f63530 = interfaceC65910;
    }

    @Override // l.C1577, l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C12950 c12950Mo5381 = this.f63530.mo5381(j);
        C22828 c22828 = c12950Mo5381.f43052;
        long j2 = c22828.f74278;
        long j3 = c22828.f74277;
        C9195 c9195 = this.f63531;
        C22828 c22829 = new C22828(j2, j3 + c9195.f31272);
        C22828 c228210 = c12950Mo5381.f43053;
        return new C12950(c22829, new C22828(c228210.f74278, c228210.f74277 + c9195.f31272));
    }
}
