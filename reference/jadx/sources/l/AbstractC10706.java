package l;

/* JADX INFO: renamed from: l.ۤۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10706 extends AbstractC8512 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f33997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33998;

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo20761();

    public AbstractC10706(int i) {
        super(i);
        this.f33998 = -1;
        this.f33997 = false;
    }

    public AbstractC10706(int i, int i2) {
        super(i);
        this.f33998 = i2;
        this.f33997 = true;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final int mo14637() {
        return this.f33997 ? this.f33998 : mo20761();
    }

    @Override // l.AbstractC8512, l.InterfaceC8409
    public final InterfaceC2546 trySplit() {
        InterfaceC2546 interfaceC2546TrySplit = super.trySplit();
        if (!this.f33997 && interfaceC2546TrySplit != null) {
            this.f33998 = mo20761();
            this.f33997 = true;
        }
        return interfaceC2546TrySplit;
    }
}
