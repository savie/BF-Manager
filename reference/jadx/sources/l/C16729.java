package l;

/* JADX INFO: renamed from: l.ܽܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16729 extends AbstractC0582 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21750 f53564;

    public C16729(AbstractC23785 abstractC23785) {
        super(0);
        this.f53564 = abstractC23785;
    }

    public C16729(InterfaceC21750 interfaceC21750, int i, int i2) {
        super(i, i2);
        this.f53564 = interfaceC21750;
    }

    @Override // l.AbstractC0582
    /* JADX INFO: renamed from: ܰ */
    public final int mo2760() {
        return this.f53564.size();
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ */
    public final long mo8512(int i) {
        return this.f53564.getLong(i);
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10462 mo8513(int i, int i2) {
        return new C16729(this.f53564, i, i2);
    }
}
