package l;

/* JADX INFO: renamed from: l.᩻ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes.dex */
public final class C23431 extends AbstractC1557 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f75858;

    public C23431(Iterable iterable) {
        this.f75858 = AbstractC22433.m49797(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC1557
    /* JADX INFO: renamed from: ۙ */
    public final C11521 mo5337() {
        AbstractC16706 abstractC16706ListIterator = this.f75858.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            if (((Boolean) ((C2968) abstractC16706ListIterator.next()).f11103.orElse(Boolean.FALSE)).booleanValue()) {
                return C11521.of(Boolean.TRUE);
            }
        }
        return C11521.empty();
    }

    @Override // l.AbstractC1557
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1557 mo5336(AbstractC1557 abstractC1557) {
        if (!(abstractC1557 instanceof C23431)) {
            return abstractC1557;
        }
        return new C23431(C22808.m50465(this.f75858, ((C23431) abstractC1557).f75858));
    }
}
