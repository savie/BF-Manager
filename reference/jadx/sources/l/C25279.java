package l;

/* JADX INFO: renamed from: l.᩻᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C25279 extends AbstractC22295 implements InterfaceC5641 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f81646;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f81647;

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1974(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return EnumC22621.INSTANCE_OF;
    }

    public final InterfaceC19637 getType() {
        AbstractC8036 abstractC8036 = this.f81647;
        if (!(abstractC8036 instanceof AbstractC2903)) {
            return abstractC8036;
        }
        if (abstractC8036.m21911(EnumC21461.f68486)) {
            return ((C24335) this.f81647).f78930.f40166;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2903 m56439() {
        AbstractC8036 abstractC8036 = this.f81647;
        if (abstractC8036 instanceof AbstractC2903) {
            return (AbstractC2903) abstractC8036;
        }
        return null;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5899(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68534;
    }
}
