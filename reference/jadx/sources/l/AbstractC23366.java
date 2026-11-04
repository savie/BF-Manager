package l;

/* JADX INFO: renamed from: l.᩹ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23366 extends AbstractC14083 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75652;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract float mo9525(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo30440();

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC15906 mo9526(int i, int i2);

    public AbstractC23366(int i) {
        this.f75652 = i;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return ((long) mo30440()) - ((long) this.f75652);
    }

    @Override // l.InterfaceC9154
    /* JADX INFO: renamed from: ᩷, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC0419 interfaceC0419) {
        if (this.f75652 >= mo30440()) {
            return false;
        }
        int i = this.f75652;
        this.f75652 = i + 1;
        interfaceC0419.mo2223(mo9525(i));
        return true;
    }

    @Override // l.AbstractC14083, l.InterfaceC9154
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC0419 interfaceC0419) {
        int iMo30440 = mo30440();
        while (true) {
            int i = this.f75652;
            if (i >= iMo30440) {
                return;
            }
            interfaceC0419.mo2223(mo9525(i));
            this.f75652++;
        }
    }
}
