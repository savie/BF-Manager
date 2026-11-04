package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8512 extends AbstractC12023 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f27823;

    @Override // l.InterfaceC8409
    public int characteristics() {
        return 16464;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo14637();

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo1161(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC2546 mo1162(int i, int i2);

    public AbstractC8512(int i) {
        this.f27823 = i;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return ((long) mo14637()) - ((long) this.f27823);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public boolean tryAdvance(Consumer consumer) {
        if (this.f27823 >= mo14637()) {
            return false;
        }
        int i = this.f27823;
        this.f27823 = i + 1;
        consumer.accept(mo1161(i));
        return true;
    }

    @Override // l.AbstractC12023, l.InterfaceC8409
    public void forEachRemaining(Consumer consumer) {
        int iMo14637 = mo14637();
        while (true) {
            int i = this.f27823;
            if (i >= iMo14637) {
                return;
            }
            consumer.accept(mo1161(i));
            this.f27823++;
        }
    }

    @Override // l.InterfaceC8409
    public InterfaceC2546 trySplit() {
        int iMo14637 = mo14637();
        int i = this.f27823;
        int iMo14638 = mo14637();
        int i2 = this.f27823;
        int iM18182 = C6421.m18182(iMo14638, i2, 2, i);
        if (iM18182 == i2 || iM18182 == iMo14637) {
            return null;
        }
        if (iM18182 >= i2 && iM18182 <= iMo14637) {
            InterfaceC2546 interfaceC2546Mo1162 = mo1162(i2, iM18182);
            this.f27823 = iM18182;
            return interfaceC2546Mo1162;
        }
        StringBuilder sbM12235 = C3769.m12235(iM18182, "splitPoint ", " outside of range of current position ");
        sbM12235.append(this.f27823);
        sbM12235.append(" and range end ");
        sbM12235.append(iMo14637);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }
}
