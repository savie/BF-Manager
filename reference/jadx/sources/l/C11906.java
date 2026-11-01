package l;

/* JADX INFO: renamed from: l.ۨ᩵۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C11906 extends AbstractC5930 implements InterfaceC24008 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f39945;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f39946;

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3938(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.INSTANCE_OF;
    }

    public final InterfaceC17428 getType() {
        AbstractC8774 abstractC8774 = this.f39946;
        if (!(abstractC8774 instanceof AbstractC20372)) {
            return abstractC8774;
        }
        if (abstractC8774.m22847(EnumC18651.f60568)) {
            return ((C15103) this.f39946).f49323.f22477;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20372 m29699() {
        AbstractC8774 abstractC8774 = this.f39946;
        if (abstractC8774 instanceof AbstractC20372) {
            return (AbstractC20372) abstractC8774;
        }
        return null;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1886(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60550;
    }
}
