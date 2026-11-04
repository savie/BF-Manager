package l;

/* JADX INFO: renamed from: l.ۧ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11947 implements InterfaceC24457 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25374 f38477;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1858 f38478;

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final /* synthetic */ void mo3465() {
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        C25374 c25374 = this.f38477;
        return c25374.f81922.m31648() || c25374.f81925.mo23076() == EnumC2619.DESTROYED;
    }

    public C11947(C25374 c25374, C1858 c1858) {
        this.f38477 = c25374;
        this.f38478 = c1858;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ۙ */
    public final void mo12170(long j, long j2, long j3, long j4) {
        C1858 c1858 = this.f38478;
        c1858.m6378(j);
        C25374 c25374 = this.f38477;
        c25374.f81922.m31636(c1858);
        c25374.f81922.m31633(j4);
        c25374.f81922.m31631(c1858.m6380());
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ܺۙ */
    public final C12919 mo12171() {
        return this.f38477.f81919;
    }
}
