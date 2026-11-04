package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23409 extends AbstractC2262 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75777;

    @Override // l.InterfaceC8409
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo30492();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3336(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC15949 mo3337(int i, int i2);

    public AbstractC23409(int i) {
        this.f75777 = i;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return ((long) mo30492()) - ((long) this.f75777);
    }

    @Override // l.InterfaceC7664
    public boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f75777 >= mo30492()) {
            return false;
        }
        int i = this.f75777;
        this.f75777 = i + 1;
        intConsumer.accept(mo3336(i));
        return true;
    }

    @Override // l.AbstractC2262, l.InterfaceC7664
    public void forEachRemaining(IntConsumer intConsumer) {
        int iMo30492 = mo30492();
        while (true) {
            int i = this.f75777;
            if (i >= iMo30492) {
                return;
            }
            intConsumer.accept(mo3336(i));
            this.f75777++;
        }
    }

    @Override // l.AbstractC2262, l.InterfaceC9154, l.InterfaceC8409
    public InterfaceC15949 trySplit() {
        int iMo30492 = mo30492();
        int i = this.f75777;
        int iMo30493 = mo30492();
        int i2 = this.f75777;
        int iM18182 = C6421.m18182(iMo30493, i2, 2, i);
        if (iM18182 == i2 || iM18182 == iMo30492) {
            return null;
        }
        if (iM18182 >= i2 && iM18182 <= iMo30492) {
            InterfaceC15949 interfaceC15949Mo3337 = mo3337(i2, iM18182);
            this.f75777 = iM18182;
            return interfaceC15949Mo3337;
        }
        StringBuilder sbM12235 = C3769.m12235(iM18182, "splitPoint ", " outside of range of current position ");
        sbM12235.append(this.f75777);
        sbM12235.append(" and range end ");
        sbM12235.append(iMo30492);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }
}
