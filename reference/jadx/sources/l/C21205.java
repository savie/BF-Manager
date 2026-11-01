package l;

/* JADX INFO: renamed from: l.᩷᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C21205 extends C7281 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f69003;

    @Override // l.C7281, l.C4748, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return m47666(abstractC16579);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        return this.f69003.f43867.m52402(c0309);
    }

    @Override // l.C7281, l.C4748, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC16579 mo1767(Object obj, AbstractC16579 abstractC16579) {
        return m47666(abstractC16579);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1768(C0309 c0309, Object obj) {
        return this.f69003.f43867.m52402(c0309);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21205(C13174 c13174, AbstractC23903 abstractC23903, EnumC11678 enumC11678) {
        this.f69003 = c13174;
        C5870 c5870 = c13174.f43866.f65438;
        C13638.requireNonNull(c5870);
        super(c5870, EnumC9729.SPECULATIVE, abstractC23903, enumC11678);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m47666(AbstractC16579 abstractC16579) {
        if (abstractC16579.m39001(EnumC6617.DEFERRED)) {
            return m13122(super.mo1767((Object) null, abstractC16579));
        }
        if (!abstractC16579.m39001(EnumC6617.BOT)) {
            return abstractC16579;
        }
        C13174 c13174 = this.f69003;
        return c13174.f43867.m52383(c13174.f43868.f14293).f77449;
    }
}
