package l;

/* JADX INFO: renamed from: l.᩺᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24527 extends AbstractC23781 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f79541;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79542;

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo23938();

    public AbstractC24527(int i) {
        super(i);
        this.f79542 = -1;
        this.f79541 = false;
    }

    public AbstractC24527(int i, int i2) {
        super(i);
        this.f79542 = i2;
        this.f79541 = true;
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final int mo31302() {
        return this.f79541 ? this.f79542 : mo23938();
    }

    @Override // l.AbstractC23781, l.AbstractC2809, l.InterfaceC8409
    public final InterfaceC16321 trySplit() {
        InterfaceC16321 interfaceC16321TrySplit = super.trySplit();
        if (!this.f79541 && interfaceC16321TrySplit != null) {
            this.f79542 = mo23938();
            this.f79541 = true;
        }
        return interfaceC16321TrySplit;
    }
}
