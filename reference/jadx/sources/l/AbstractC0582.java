package l;

/* JADX INFO: renamed from: l.֡ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0582 extends AbstractC7639 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f2547;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2548;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo2760();

    public AbstractC0582(int i) {
        super(i);
        this.f2548 = -1;
        this.f2547 = false;
    }

    public AbstractC0582(int i, int i2) {
        super(i);
        this.f2548 = i2;
        this.f2547 = true;
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2759() {
        return this.f2547 ? this.f2548 : mo2760();
    }

    @Override // l.AbstractC7639, l.AbstractC1911, l.InterfaceC20693
    public final InterfaceC10462 trySplit() {
        InterfaceC10462 interfaceC10462TrySplit = super.trySplit();
        if (!this.f2547 && interfaceC10462TrySplit != null) {
            this.f2548 = mo2760();
            this.f2547 = true;
        }
        return interfaceC10462TrySplit;
    }
}
