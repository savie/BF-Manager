package l;

/* JADX INFO: renamed from: l.ۙ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5245 extends AbstractC24155 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC9018 f18485;

    public C5245(AbstractC15685 abstractC15685) {
        super(0);
        this.f18485 = abstractC15685;
    }

    public C5245(InterfaceC9018 interfaceC9018, int i, int i2) {
        super(i, i2);
        this.f18485 = interfaceC9018;
    }

    @Override // l.AbstractC24155
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo15798() {
        return this.f18485.size();
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final int mo3336(int i) {
        return this.f18485.getInt(i);
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15949 mo3337(int i, int i2) {
        return new C5245(this.f18485, i, i2);
    }
}
