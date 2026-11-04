package l;

/* JADX INFO: renamed from: l.᩸᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes.dex */
public final class C23019 extends AbstractC10048 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15559 f74702;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9002 f74703;

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ */
    public final void mo17247(byte[] bArr) {
        this.f74703.m24018(0, bArr.length, bArr);
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ */
    public final void mo17246(AbstractC19728 abstractC19728) {
        byte[] bArrMo42394 = abstractC19728.mo42394();
        this.f74703.m24018(abstractC19728.mo42398(), abstractC19728.mo42395(), bArrMo42394);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23019(C15559 c15559, C24705 c24705) {
        super(c24705);
        this.f74702 = c15559;
        this.f74703 = new C9002(64);
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25984(AbstractC22664 abstractC22664) {
        int i = C11084.f34942[abstractC22664.mo9097().ordinal()];
        if (i == 1 || i == 2) {
            mo25984(this.f74702.f50602.m55132(((C23765) abstractC22664).f72657));
        } else {
            super.mo25984(abstractC22664);
        }
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ */
    public final void mo17245(char c) {
        this.f74703.m24017(c);
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ */
    public final void mo25983(C24550 c24550) {
        this.f74702.m37273(c24550);
    }
}
