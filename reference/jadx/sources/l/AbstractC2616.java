package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2616 extends AbstractC1622 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f10225;

    @Override // l.InterfaceC20693
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo4401();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1568(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC11790 mo1569(int i, int i2);

    public AbstractC2616(int i) {
        this.f10225 = i;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return ((long) mo4401()) - ((long) this.f10225);
    }

    @Override // l.InterfaceC18576
    public boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f10225 >= mo4401()) {
            return false;
        }
        int i = this.f10225;
        this.f10225 = i + 1;
        intConsumer.accept(mo1568(i));
        return true;
    }

    @Override // l.AbstractC1622, l.InterfaceC18576
    public void forEachRemaining(IntConsumer intConsumer) {
        int iMo4401 = mo4401();
        while (true) {
            int i = this.f10225;
            if (i >= iMo4401) {
                return;
            }
            intConsumer.accept(mo1568(i));
            this.f10225++;
        }
    }

    @Override // l.AbstractC1622, l.InterfaceC20693
    public InterfaceC11790 trySplit() {
        int iMo4401 = mo4401();
        int i = this.f10225;
        int iMo4402 = mo4401();
        int i2 = this.f10225;
        int iM9602 = C3184.m9602(iMo4402, i2, 2, i);
        if (iM9602 == i2 || iM9602 == iMo4401) {
            return null;
        }
        if (iM9602 >= i2 && iM9602 <= iMo4401) {
            InterfaceC11790 interfaceC11790Mo1569 = mo1569(i2, iM9602);
            this.f10225 = iM9602;
            return interfaceC11790Mo1569;
        }
        StringBuilder sbM40153 = C17214.m40153(iM9602, "splitPoint ", " outside of range of current position ");
        sbM40153.append(this.f10225);
        sbM40153.append(" and range end ");
        sbM40153.append(iMo4401);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }
}
