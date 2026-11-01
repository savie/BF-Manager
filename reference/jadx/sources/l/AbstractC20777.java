package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20777 extends AbstractC1309 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f67579;

    @Override // l.InterfaceC20693
    public int characteristics() {
        return 16464;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1946();

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo13685(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC7371 mo13686(int i, int i2);

    public AbstractC20777(int i) {
        this.f67579 = i;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return ((long) mo1946()) - ((long) this.f67579);
    }

    @Override // l.InterfaceC20693
    public boolean tryAdvance(Consumer consumer) {
        if (this.f67579 >= mo1946()) {
            return false;
        }
        int i = this.f67579;
        this.f67579 = i + 1;
        consumer.accept(mo13685(i));
        return true;
    }

    @Override // l.AbstractC1309, l.InterfaceC20693
    public void forEachRemaining(Consumer consumer) {
        int iMo1946 = mo1946();
        while (true) {
            int i = this.f67579;
            if (i >= iMo1946) {
                return;
            }
            consumer.accept(mo13685(i));
            this.f67579++;
        }
    }

    @Override // l.InterfaceC20693
    public InterfaceC7371 trySplit() {
        int iMo1946 = mo1946();
        int i = this.f67579;
        int iMo1947 = mo1946();
        int i2 = this.f67579;
        int iM9602 = C3184.m9602(iMo1947, i2, 2, i);
        if (iM9602 == i2 || iM9602 == iMo1946) {
            return null;
        }
        if (iM9602 >= i2 && iM9602 <= iMo1946) {
            InterfaceC7371 interfaceC7371Mo13686 = mo13686(i2, iM9602);
            this.f67579 = iM9602;
            return interfaceC7371Mo13686;
        }
        StringBuilder sbM40153 = C17214.m40153(iM9602, "splitPoint ", " outside of range of current position ");
        sbM40153.append(this.f67579);
        sbM40153.append(" and range end ");
        sbM40153.append(iMo1946);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }
}
