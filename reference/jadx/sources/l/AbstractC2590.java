package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2590 extends AbstractC2108 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8314;

    @Override // l.InterfaceC8409
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo8662();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo8663(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC9301 mo8664(int i, int i2);

    public AbstractC2590(int i) {
        this.f8314 = i;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return ((long) mo8662()) - ((long) this.f8314);
    }

    @Override // l.InterfaceC9900
    public boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f8314 >= mo8662()) {
            return false;
        }
        int i = this.f8314;
        this.f8314 = i + 1;
        longConsumer.accept(mo8663(i));
        return true;
    }

    @Override // l.AbstractC2108, l.InterfaceC9900
    public void forEachRemaining(LongConsumer longConsumer) {
        int iMo8662 = mo8662();
        while (true) {
            int i = this.f8314;
            if (i >= iMo8662) {
                return;
            }
            longConsumer.accept(mo8663(i));
            this.f8314++;
        }
    }

    @Override // l.AbstractC2108, l.InterfaceC8409
    public InterfaceC9301 trySplit() {
        int iMo8662 = mo8662();
        int i = this.f8314;
        int iMo8663 = mo8662();
        int i2 = this.f8314;
        int iM18182 = C6421.m18182(iMo8663, i2, 2, i);
        if (iM18182 == i2 || iM18182 == iMo8662) {
            return null;
        }
        if (iM18182 >= i2 && iM18182 <= iMo8662) {
            InterfaceC9301 interfaceC9301Mo8664 = mo8664(i2, iM18182);
            this.f8314 = iM18182;
            return interfaceC9301Mo8664;
        }
        StringBuilder sbM12235 = C3769.m12235(iM18182, "splitPoint ", " outside of range of current position ");
        sbM12235.append(this.f8314);
        sbM12235.append(" and range end ");
        sbM12235.append(iMo8662);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }
}
