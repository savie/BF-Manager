package l;

/* JADX INFO: renamed from: l.۫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12311 extends AbstractC20777 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f41142;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f41143;

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo24749();

    public AbstractC12311(int i) {
        super(i);
        this.f41143 = -1;
        this.f41142 = false;
    }

    public AbstractC12311(int i, int i2) {
        super(i);
        this.f41143 = i2;
        this.f41142 = true;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final int mo1946() {
        return this.f41142 ? this.f41143 : mo24749();
    }

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final InterfaceC7371 trySplit() {
        InterfaceC7371 interfaceC7371TrySplit = super.trySplit();
        if (!this.f41142 && interfaceC7371TrySplit != null) {
            this.f41143 = mo24749();
            this.f41142 = true;
        }
        return interfaceC7371TrySplit;
    }
}
