package l;

/* JADX INFO: renamed from: l.ܶܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C16129 extends AbstractC22295 implements InterfaceC25274 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f52412;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f52413;

    public C16129(AbstractC22295 abstractC22295, AbstractC22295 abstractC22296) {
        this.f52413 = abstractC22295;
        this.f52412 = abstractC22296;
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1960(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return EnumC22621.ARRAY_ACCESS;
    }

    @Override // l.InterfaceC25274
    public final AbstractC22295 getExpression() {
        return this.f52413;
    }

    @Override // l.InterfaceC25274
    public final AbstractC22295 getIndex() {
        return this.f52412;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5873(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68527;
    }
}
