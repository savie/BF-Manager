package l;

/* JADX INFO: renamed from: l.ܿᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79UX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17529 extends AbstractC12591 implements InterfaceC3314, InterfaceC14087 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public AbstractC6240 f55725;

    /* JADX INFO: renamed from: ۨ */
    public abstract AbstractC6240 mo3799(InterfaceC19067 interfaceC19067);

    public AbstractC17529(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601, i);
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC3314 mo9818() {
        return (AbstractC17529) getNext();
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC3314 mo9818() {
        return (AbstractC17529) getNext();
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC3314 mo9819() {
        AbstractC17529 abstractC17529 = (AbstractC17529) getNext();
        if (abstractC17529 != null) {
            m31347((AbstractC6240) null);
            abstractC17529.m31348();
        }
        return abstractC17529;
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo9822() {
        return m31359() != 0;
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9820(InterfaceC3314 interfaceC3314) {
        if (((C9895) m31354()).m25049(getClass().getSimpleName())) {
            return ((C9895) m31354()).m25049(interfaceC3314.getClass().getSimpleName());
        }
        return false;
    }

    @Override // l.InterfaceC14087
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC6240 mo13364(InterfaceC19067 interfaceC19067) {
        AbstractC6240 abstractC6240Mo3799 = mo3799(interfaceC19067);
        abstractC6240Mo3799.mo24568(getDigest());
        mo24567((InterfaceC4913) abstractC6240Mo3799);
        AbstractC17529 abstractC17529 = (AbstractC17529) getNext();
        if (abstractC17529 != null) {
            abstractC6240Mo3799.m31347(abstractC17529.mo13364(interfaceC19067));
        }
        return abstractC6240Mo3799;
    }

    @Override // l.AbstractC12591, l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final int mo24565(int i, byte[] bArr) {
        int iMo24565 = super.mo24565(i, bArr);
        int size = size();
        int iM31339 = m31339();
        if (size == iM31339) {
            return iMo24565;
        }
        throw new IllegalStateException(String.format("Wrong size calculation have %d expect %d", Integer.valueOf(size), Integer.valueOf(iM31339)));
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4913 mo9821() {
        return this.f55725;
    }

    @Override // l.AbstractC12591, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC6240 mo9821() {
        return this.f55725;
    }

    @Override // l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC9522 mo9821() {
        return this.f55725;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final void mo24567(InterfaceC4913 interfaceC4913) {
        if (interfaceC4913 != null && !(interfaceC4913 instanceof AbstractC12591)) {
            throw new IllegalArgumentException("Incompatible response");
        }
        this.f55725 = (AbstractC6240) interfaceC4913;
    }
}
