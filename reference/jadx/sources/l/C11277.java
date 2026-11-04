package l;

/* JADX INFO: renamed from: l.ۧ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11277 extends AbstractC10706 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC17462 f35576;

    public C11277(AbstractC23212 abstractC23212) {
        super(0);
        this.f35576 = abstractC23212;
    }

    public C11277(InterfaceC17462 interfaceC17462, int i, int i2) {
        super(i, i2);
        this.f35576 = interfaceC17462;
    }

    @Override // l.AbstractC10706
    /* JADX INFO: renamed from: ᩷ */
    public final int mo20761() {
        return this.f35576.size();
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1161(int i) {
        return this.f35576.get(i);
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C11277(this.f35576, i, i2);
    }
}
