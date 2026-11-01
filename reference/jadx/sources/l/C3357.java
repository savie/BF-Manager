package l;

/* JADX INFO: renamed from: l.ۗܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public class C3357 extends C10435 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6761 f12429;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3357(C6761 c6761, InterfaceC18195 interfaceC18195) {
        super(interfaceC18195);
        this.f12429 = c6761;
    }

    @Override // l.C10435, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2933(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        InterfaceC18195 interfaceC18195 = this.f12429.f22834.f68418;
        InterfaceC18195 interfaceC18196 = this.f35634;
        return interfaceC18195.mo2933(interfaceC18196.mo4574().m44602(abstractC16579), interfaceC18196.mo4574().m44602(abstractC165710), c10391);
    }

    @Override // l.C10435, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public void mo2545(InterfaceC12260 interfaceC12260, C11948 c11948) {
        C23549 c23549 = this.f12429.f22831;
        C14377 c14377 = C14707.f48054;
        this.f35634.mo2545(interfaceC12260, c23549.m51910(new C14377("compiler", "incompatible.ret.type.in.lambda", c11948)));
    }
}
