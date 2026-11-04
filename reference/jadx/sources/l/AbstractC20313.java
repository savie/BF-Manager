package l;

/* JADX INFO: renamed from: l.᩵ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79UX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20313 extends AbstractC3159 implements InterfaceC21299, InterfaceC0416 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12108 f65190;

    /* JADX INFO: renamed from: ۤ */
    public abstract AbstractC12108 mo1465(InterfaceC23032 interfaceC23032);

    public AbstractC20313(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878, i);
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC21299 mo12790() {
        return (AbstractC20313) getNext();
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC21299 mo12774() {
        AbstractC20313 abstractC20313 = (AbstractC20313) getNext();
        if (abstractC20313 != null) {
            m10311((AbstractC12108) null);
            abstractC20313.m10314();
        }
        return abstractC20313;
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC21299 mo12790() {
        return (AbstractC20313) getNext();
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo12789() {
        return m10338() != 0;
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo12778(InterfaceC21299 interfaceC21299) {
        if (((C14826) m10321()).m35706(getClass().getSimpleName())) {
            return ((C14826) m10321()).m35706(interfaceC21299.getClass().getSimpleName());
        }
        return false;
    }

    @Override // l.InterfaceC0416
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC12108 mo1726(InterfaceC23032 interfaceC23032) {
        AbstractC12108 abstractC12108Mo1465 = mo1465(interfaceC23032);
        abstractC12108Mo1465.mo10310(getDigest());
        mo12766((InterfaceC18315) abstractC12108Mo1465);
        AbstractC20313 abstractC20313 = (AbstractC20313) getNext();
        if (abstractC20313 != null) {
            abstractC12108Mo1465.m10311(abstractC20313.mo1726(interfaceC23032));
        }
        return abstractC12108Mo1465;
    }

    @Override // l.AbstractC3159, l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public final int mo10305(int i, byte[] bArr) {
        int iMo10305 = super.mo10305(i, bArr);
        int size = size();
        int iM10325 = m10325();
        if (size == iM10325) {
            return iMo10305;
        }
        throw new IllegalStateException(String.format("Wrong size calculation have %d expect %d", Integer.valueOf(size), Integer.valueOf(iM10325)));
    }

    @Override // l.AbstractC3159, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC12108 mo1727() {
        return this.f65190;
    }

    @Override // l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC17965 mo1727() {
        return this.f65190;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18315 mo1727() {
        return this.f65190;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public final void mo12766(InterfaceC18315 interfaceC18315) {
        if (interfaceC18315 != null && !(interfaceC18315 instanceof AbstractC3159)) {
            throw new IllegalArgumentException("Incompatible response");
        }
        this.f65190 = (AbstractC12108) interfaceC18315;
    }
}
