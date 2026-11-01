package l;

/* JADX INFO: renamed from: l.ۖۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2327 extends AbstractC20154 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f8255;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract float mo7063(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3637();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC11501 mo7064(int i, int i2);

    public AbstractC2327(int i) {
        this.f8255 = i;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return ((long) mo3637()) - ((long) this.f8255);
    }

    @Override // l.InterfaceC10110
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC17767 interfaceC17767) {
        if (this.f8255 >= mo3637()) {
            return false;
        }
        int i = this.f8255;
        this.f8255 = i + 1;
        interfaceC17767.mo35707(mo7063(i));
        return true;
    }

    @Override // l.AbstractC20154, l.InterfaceC10110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC17767 interfaceC17767) {
        int iMo3637 = mo3637();
        while (true) {
            int i = this.f8255;
            if (i >= iMo3637) {
                return;
            }
            interfaceC17767.mo35707(mo7063(i));
            this.f8255++;
        }
    }
}
