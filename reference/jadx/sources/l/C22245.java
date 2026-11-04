package l;

/* JADX INFO: renamed from: l.᩷ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22245 extends AbstractC4566 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC18252 f71649;

    public C22245(AbstractC13294 abstractC13294) {
        super(0);
        this.f71649 = abstractC13294;
    }

    public C22245(InterfaceC18252 interfaceC18252, int i, int i2) {
        super(i, i2);
        this.f71649 = interfaceC18252;
    }

    @Override // l.AbstractC4566
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14344() {
        return this.f71649.size();
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final long mo8663(int i) {
        return this.f71649.getLong(i);
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9301 mo8664(int i, int i2) {
        return new C22245(this.f71649, i, i2);
    }
}
