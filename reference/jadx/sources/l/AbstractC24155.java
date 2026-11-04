package l;

/* JADX INFO: renamed from: l.᩺۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24155 extends AbstractC23409 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f78168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f78169;

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo15798();

    public AbstractC24155(int i) {
        super(i);
        this.f78169 = -1;
        this.f78168 = false;
    }

    public AbstractC24155(int i, int i2) {
        super(i);
        this.f78169 = i2;
        this.f78168 = true;
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final int mo30492() {
        return this.f78168 ? this.f78169 : mo15798();
    }

    @Override // l.AbstractC23409, l.AbstractC2262, l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15949 trySplit() {
        InterfaceC15949 interfaceC15949TrySplit = super.trySplit();
        if (!this.f78168 && interfaceC15949TrySplit != null) {
            this.f78169 = mo15798();
            this.f78168 = true;
        }
        return interfaceC15949TrySplit;
    }
}
