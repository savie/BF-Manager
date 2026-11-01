package l;

/* JADX INFO: renamed from: l.ۘܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4027 extends AbstractC2616 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f14890;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14891;

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo1570();

    public AbstractC4027(int i) {
        super(i);
        this.f14891 = -1;
        this.f14890 = false;
    }

    public AbstractC4027(int i, int i2) {
        super(i);
        this.f14891 = i2;
        this.f14890 = true;
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final int mo4401() {
        return this.f14890 ? this.f14891 : mo1570();
    }

    @Override // l.AbstractC2616, l.AbstractC1622, l.InterfaceC20693
    public final InterfaceC11790 trySplit() {
        InterfaceC11790 interfaceC11790TrySplit = super.trySplit();
        if (!this.f14890 && interfaceC11790TrySplit != null) {
            this.f14891 = mo1570();
            this.f14890 = true;
        }
        return interfaceC11790TrySplit;
    }
}
