package l;

/* JADX INFO: renamed from: l.ۖ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2897 extends AbstractC12177 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC21874 f9489;

    public C2897(AbstractC8863 abstractC8863) {
        super(0);
        this.f9489 = abstractC8863;
    }

    public C2897(InterfaceC21874 interfaceC21874, int i, int i2) {
        super(i, i2);
        this.f9489 = interfaceC21874;
    }

    @Override // l.AbstractC12177
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo9527() {
        return this.f9489.size();
    }

    @Override // l.AbstractC23366
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo9525(int i) {
        return this.f9489.getFloat(i);
    }

    @Override // l.AbstractC23366
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15906 mo9526(int i, int i2) {
        return new C2897(this.f9489, i, i2);
    }
}
