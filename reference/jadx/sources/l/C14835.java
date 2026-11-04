package l;

/* JADX INFO: renamed from: l.ܰ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C14835 extends AbstractC8036 implements InterfaceC4149 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f48522;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14769 f48523;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2920 f48524;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4395 f48525;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC24287 f48526;

    public C14835(C4395 c4395, EnumC24287 enumC24287, AbstractC22295 abstractC22295, C14769 c14769) {
        this.f48525 = c4395;
        this.f48526 = enumC24287;
        this.f48522 = abstractC22295;
        this.f48523 = c14769;
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1516(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return EnumC22621.MODULE;
    }

    @Override // l.InterfaceC4149
    public final C14769 getAnnotations() {
        return this.f48525.f15824;
    }

    @Override // l.InterfaceC4149
    /* JADX INFO: renamed from: ۨ */
    public final EnumC24287 mo13304() {
        return this.f48526;
    }

    @Override // l.InterfaceC4149
    public final AbstractC22295 getName() {
        return this.f48522;
    }

    @Override // l.InterfaceC4149
    /* JADX INFO: renamed from: ۜ */
    public final C14769 mo13303() {
        return this.f48523;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5871(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68532;
    }
}
