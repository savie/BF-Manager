package l;

/* JADX INFO: renamed from: l.۟ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7453 extends AbstractC0916 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16357 f24838;

    public C7453(AbstractC20859 abstractC20859) {
        super(0);
        this.f24838 = abstractC20859;
    }

    public C7453(InterfaceC16357 interfaceC16357, int i, int i2) {
        super(i, i2);
        this.f24838 = interfaceC16357;
    }

    @Override // l.AbstractC0916
    /* JADX INFO: renamed from: ܰ */
    public final int mo3638() {
        return this.f24838.size();
    }

    @Override // l.AbstractC2327
    /* JADX INFO: renamed from: ۙ */
    public final float mo7063(int i) {
        return this.f24838.getFloat(i);
    }

    @Override // l.AbstractC2327
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11501 mo7064(int i, int i2) {
        return new C7453(this.f24838, i, i2);
    }
}
