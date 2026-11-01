package l;

/* JADX INFO: renamed from: l.ۖۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2504 extends C1116 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f9917;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2504(C20145 c20145, AbstractC16579 abstractC16579, InterfaceC18195 interfaceC18195) {
        this.f9917 = c20145;
        C6761 c6761 = c20145.f65406;
        C13638.requireNonNull(c6761);
        super(c6761, C21059.f68595, abstractC16579, interfaceC18195);
    }

    @Override // l.C1116
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo4137(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579M52419;
        if (abstractC16579.m39001(EnumC6617.DEFERRED)) {
            return ((C10104) abstractC16579).m25713((C1116) this);
        }
        AbstractC16579 abstractC165710 = this.f5036;
        C20145 c20145 = this.f9917;
        if (abstractC16579 != abstractC165710) {
            c20145.f65444.getClass();
            abstractC16579 = C23800.m52343(abstractC16579);
        }
        if (interfaceC12260 == null || interfaceC12260.mo9276() == null) {
            abstractC16579M52419 = c20145.f65444.m52419(abstractC16579);
        } else {
            abstractC16579M52419 = this.f5037.mo4574().m44586(interfaceC12260.mo9276(), abstractC16579, true);
        }
        return super.mo4137(interfaceC12260, c20145.f65433.m47251(interfaceC12260, abstractC16579M52419));
    }

    @Override // l.C1116
    /* JADX INFO: renamed from: ۙ */
    public final C1116 mo4134(AbstractC16579 abstractC16579) {
        return new C2504(this.f9917, abstractC16579, this.f5037);
    }

    @Override // l.C1116
    /* JADX INFO: renamed from: ۙ */
    public final C1116 mo4136(InterfaceC18195 interfaceC18195) {
        return new C2504(this.f9917, this.f5036, interfaceC18195);
    }
}
