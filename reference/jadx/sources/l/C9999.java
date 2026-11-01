package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۤۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9999 extends AbstractC15706 implements InterfaceC7535 {
    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC14884.b(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC14884.g(this, consumer);
    }

    @Override // l.AbstractC15706
    public final AbstractC15706 e(InterfaceC20693 interfaceC20693) {
        return new C9999(this.b, interfaceC20693, this.a);
    }

    @Override // l.AbstractC15706
    public final void d() {
        C5848 c5848 = new C5848();
        this.h = c5848;
        C13638.requireNonNull(c5848);
        this.e = this.b.g0(new C12821(c5848, 1));
        this.f = new C5295(16, this);
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC7535 trySplit() {
        return (InterfaceC7535) super.trySplit();
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC10110 trySplit() {
        return (InterfaceC7535) super.trySplit();
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        return (InterfaceC7535) super.trySplit();
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        C13638.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            C5848 c5848 = (C5848) this.h;
            long j = this.g;
            int iR = c5848.r(j);
            if (c5848.c == 0 && iR == 0) {
                d = ((double[]) c5848.e)[(int) j];
            } else {
                d = ((double[][]) c5848.f)[iR][(int) (j - c5848.d[iR])];
            }
            doubleConsumer.accept(d);
        }
        return zA;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            C13638.requireNonNull(doubleConsumer);
            c();
            C13638.requireNonNull(doubleConsumer);
            C12821 c12821 = new C12821(doubleConsumer, 0);
            this.b.f0(this.d, c12821);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
