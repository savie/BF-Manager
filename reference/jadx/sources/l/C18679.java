package l;

/* JADX INFO: renamed from: l.ᩴۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18679 extends AbstractC3924 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10338 f60628;

    public C18679(AbstractC8096 abstractC8096) {
        super(0);
        this.f60628 = abstractC8096;
    }

    public C18679(InterfaceC10338 interfaceC10338, int i, int i2) {
        super(i, i2);
        this.f60628 = interfaceC10338;
    }

    @Override // l.AbstractC3924
    /* JADX INFO: renamed from: ܰ */
    public final int mo11386() {
        return this.f60628.size();
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final char mo7699(int i) {
        return this.f60628.getChar(i);
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11687 mo7700(int i, int i2) {
        return new C18679(this.f60628, i, i2);
    }
}
