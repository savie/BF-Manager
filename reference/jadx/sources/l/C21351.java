package l;

/* JADX INFO: renamed from: l.᩶ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C21351 extends AbstractC19969 implements InterfaceC4390 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14769 f68007;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f68008;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14769 f68009;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f68010;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC24528 f68011;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC24528 f68006 = EnumC24528.STATEMENT;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC24528 f68005 = EnumC24528.RULE;

    public C21351(EnumC24528 enumC24528, C14769 c14769, C14769 c147610, AbstractC8036 abstractC8036) {
        C11972.m30021(c14769);
        C11972.m30026(c14769.isEmpty() || c14769.f48335 != null);
        this.f68011 = enumC24528;
        this.f68007 = c14769;
        this.f68009 = c147610;
        this.f68008 = abstractC8036;
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo2611(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return EnumC22621.CASE;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m48575() {
        return (C14769) C1170.stream(this.f68007).filter(new C4725(2)).map(new C24125(5)).collect(C14769.m35544());
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14769 m48574() {
        if (this.f68011 == EnumC24528.STATEMENT) {
            return this.f68009;
        }
        return null;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5887(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68530;
    }
}
