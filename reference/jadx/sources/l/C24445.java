package l;

/* JADX INFO: renamed from: l.᩺ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C24445 extends AbstractC22295 implements InterfaceC23367 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f79357;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18477 f79358;

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1971(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        int i = C25081.f81107[this.f79358.f60145.ordinal()];
        if (i == 1) {
            return EnumC22621.UNBOUNDED_WILDCARD;
        }
        if (i == 2) {
            return EnumC22621.EXTENDS_WILDCARD;
        }
        if (i == 3) {
            return EnumC22621.SUPER_WILDCARD;
        }
        throw new AssertionError("Unknown wildcard bound " + this.f79358);
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5896(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68450;
    }
}
