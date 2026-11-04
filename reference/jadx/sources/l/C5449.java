package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۚۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5449 extends AbstractC24753 implements InterfaceC3012 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2946.b(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2946.g(this, consumer);
    }

    @Override // l.AbstractC24753
    public final AbstractC24753 e(InterfaceC8409 interfaceC8409) {
        return new C5449(this.b, interfaceC8409, this.a);
    }

    @Override // l.AbstractC24753
    public final void d() {
        C20890 c20890 = new C20890();
        this.h = c20890;
        C17359.requireNonNull(c20890);
        this.e = this.b.g0(new C2639(c20890, 1));
        this.f = new C3249(17, this);
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC3012 trySplit() {
        return (InterfaceC3012) super.trySplit();
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        return (InterfaceC3012) super.trySplit();
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC9154 trySplit() {
        return (InterfaceC3012) super.trySplit();
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        C17359.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            C20890 c20890 = (C20890) this.h;
            long j = this.g;
            int iR = c20890.r(j);
            if (c20890.c == 0 && iR == 0) {
                d = ((double[]) c20890.e)[(int) j];
            } else {
                d = ((double[][]) c20890.f)[iR][(int) (j - c20890.d[iR])];
            }
            doubleConsumer.accept(d);
        }
        return zA;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            C17359.requireNonNull(doubleConsumer);
            c();
            C17359.requireNonNull(doubleConsumer);
            C2639 c2639 = new C2639(doubleConsumer, 0);
            this.b.f0(this.d, c2639);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
