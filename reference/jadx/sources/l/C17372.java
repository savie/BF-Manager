package l;

/* JADX INFO: renamed from: l.ܽۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77JV */
/* JADX INFO: loaded from: classes5.dex */
public class C17372 extends C15880 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f56511;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f56512;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0818 f56513;

    @Override // l.C15880, l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public boolean mo30572(C24132 c24132, boolean z, boolean z2, int i, int i2) {
        return true;
    }

    public C17372(int i, int i2, InterfaceC0818 interfaceC0818) {
        super(14);
        this.f56511 = i;
        this.f56512 = i2;
        this.f56513 = interfaceC0818;
    }

    @Override // l.C15880
    /* JADX INFO: renamed from: ܳ */
    public final int mo37855() {
        return this.f56511;
    }

    @Override // l.C15880
    /* JADX INFO: renamed from: ᩴ */
    public final int mo37856() {
        return this.f56512;
    }

    @Override // l.C15880, l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final void mo31675(C24132 c24132) {
        this.f56513.accept(c24132);
    }
}
