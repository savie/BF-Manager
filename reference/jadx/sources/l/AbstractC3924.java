package l;

/* JADX INFO: renamed from: l.ۘۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3924 extends AbstractC2513 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f14631;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14632;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo11386();

    public AbstractC3924(int i) {
        super(i);
        this.f14632 = -1;
        this.f14631 = false;
    }

    public AbstractC3924(int i, int i2) {
        super(i);
        this.f14632 = i2;
        this.f14631 = true;
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final int mo4112() {
        return this.f14631 ? this.f14632 : mo11386();
    }

    @Override // l.AbstractC2513, l.AbstractC10213, l.InterfaceC10110, l.InterfaceC20693
    public final InterfaceC11687 trySplit() {
        InterfaceC11687 interfaceC11687TrySplit = super.trySplit();
        if (!this.f14631 && interfaceC11687TrySplit != null) {
            this.f14632 = mo11386();
            this.f14631 = true;
        }
        return interfaceC11687TrySplit;
    }
}
