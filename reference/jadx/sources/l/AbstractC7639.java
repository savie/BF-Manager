package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۟ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7639 extends AbstractC1911 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25223;

    @Override // l.InterfaceC20693
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2759();

    /* JADX INFO: renamed from: ۙ */
    public abstract long mo8512(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC10462 mo8513(int i, int i2);

    public AbstractC7639(int i) {
        this.f25223 = i;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return ((long) mo2759()) - ((long) this.f25223);
    }

    @Override // l.InterfaceC19282
    public boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f25223 >= mo2759()) {
            return false;
        }
        int i = this.f25223;
        this.f25223 = i + 1;
        longConsumer.accept(mo8512(i));
        return true;
    }

    @Override // l.AbstractC1911, l.InterfaceC19282
    public void forEachRemaining(LongConsumer longConsumer) {
        int iMo2759 = mo2759();
        while (true) {
            int i = this.f25223;
            if (i >= iMo2759) {
                return;
            }
            longConsumer.accept(mo8512(i));
            this.f25223++;
        }
    }

    @Override // l.AbstractC1911, l.InterfaceC20693
    public InterfaceC10462 trySplit() {
        int iMo2759 = mo2759();
        int i = this.f25223;
        int iMo27510 = mo2759();
        int i2 = this.f25223;
        int iM9602 = C3184.m9602(iMo27510, i2, 2, i);
        if (iM9602 == i2 || iM9602 == iMo2759) {
            return null;
        }
        if (iM9602 >= i2 && iM9602 <= iMo2759) {
            InterfaceC10462 interfaceC10462Mo8513 = mo8513(i2, iM9602);
            this.f25223 = iM9602;
            return interfaceC10462Mo8513;
        }
        StringBuilder sbM40153 = C17214.m40153(iM9602, "splitPoint ", " outside of range of current position ");
        sbM40153.append(this.f25223);
        sbM40153.append(" and range end ");
        sbM40153.append(iMo2759);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }
}
