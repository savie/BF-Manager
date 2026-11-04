package l;

/* JADX INFO: renamed from: l.ᩳܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19217 extends AbstractC24527 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC9105 f62167;

    public C19217(AbstractC10266 abstractC10266) {
        super(0);
        this.f62167 = abstractC10266;
    }

    public C19217(InterfaceC9105 interfaceC9105, int i, int i2) {
        super(i, i2);
        this.f62167 = interfaceC9105;
    }

    @Override // l.AbstractC24527
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23938() {
        return this.f62167.size();
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final char mo23935(int i) {
        return this.f62167.getChar(i);
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16321 mo23936(int i, int i2) {
        return new C19217(this.f62167, i, i2);
    }
}
