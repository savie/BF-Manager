package l;

/* JADX INFO: renamed from: l.۟ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7981 extends AbstractC10217 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f26519;

    public C7981(Iterable iterable) {
        this.f26519 = AbstractC1928.m6612(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC10217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 mo21765() {
        AbstractC14956 abstractC14956ListIterator = this.f26519.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            if (((Boolean) ((C9471) abstractC14956ListIterator.next()).f30689.orElse(Boolean.FALSE)).booleanValue()) {
                return C15867.of(Boolean.TRUE);
            }
        }
        return C15867.empty();
    }

    @Override // l.AbstractC10217
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10217 mo21764(AbstractC10217 abstractC10217) {
        if (!(abstractC10217 instanceof C7981)) {
            return abstractC10217;
        }
        return new C7981(C16625.m39329(this.f26519, ((C7981) abstractC10217).f26519));
    }
}
