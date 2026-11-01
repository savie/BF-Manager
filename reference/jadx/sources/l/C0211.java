package l;

/* JADX INFO: renamed from: l.֡ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C0211 extends AbstractC4027 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10609 f1380;

    public C0211(AbstractC10796 abstractC10796) {
        super(0);
        this.f1380 = abstractC10796;
    }

    public C0211(InterfaceC10609 interfaceC10609, int i, int i2) {
        super(i, i2);
        this.f1380 = interfaceC10609;
    }

    @Override // l.AbstractC4027
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo1570() {
        return this.f1380.size();
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1568(int i) {
        return this.f1380.getInt(i);
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11790 mo1569(int i, int i2) {
        return new C0211(this.f1380, i, i2);
    }
}
