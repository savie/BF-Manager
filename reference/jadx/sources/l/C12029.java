package l;

/* JADX INFO: renamed from: l.ۨ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12029 extends C14479 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f38765;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12029(C22010 c22010, AbstractC22664 abstractC22664, InterfaceC1013 interfaceC1013) {
        this.f38765 = c22010;
        C0310 c0310 = c22010.f71016;
        C17359.requireNonNull(c0310);
        super(c0310, C22114.f71281, abstractC22664, interfaceC1013);
    }

    @Override // l.C14479
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo30220(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664M55158;
        if (abstractC22664.m51067(EnumC21172.DEFERRED)) {
            return ((C8666) abstractC22664).m23334((C14479) this);
        }
        AbstractC22664 abstractC22665 = this.f45575;
        C22010 c22010 = this.f38765;
        if (abstractC22664 != abstractC22665) {
            c22010.f71021.getClass();
            abstractC22664 = C24705.m55074(abstractC22664);
        }
        if (interfaceC5075 == null || interfaceC5075.mo7192() == null) {
            abstractC22664M55158 = c22010.f71021.m55158(abstractC22664);
        } else {
            abstractC22664M55158 = this.f45571.mo2276().m8695(interfaceC5075.mo7192(), abstractC22664, true);
        }
        return super.mo30220(interfaceC5075, c22010.f71023.m50037(interfaceC5075, abstractC22664M55158));
    }

    @Override // l.C14479
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14479 mo30219(AbstractC22664 abstractC22664) {
        return new C12029(this.f38765, abstractC22664, this.f45571);
    }

    @Override // l.C14479
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14479 mo30218(InterfaceC1013 interfaceC1013) {
        return new C12029(this.f38765, this.f45575, interfaceC1013);
    }
}
