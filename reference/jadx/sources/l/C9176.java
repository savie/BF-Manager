package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9176 extends AbstractC24753 implements InterfaceC7664 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }

    @Override // l.AbstractC24753
    public final AbstractC24753 e(InterfaceC8409 interfaceC8409) {
        return new C9176(this.b, interfaceC8409, this.a);
    }

    @Override // l.AbstractC24753
    public final void d() {
        C7991 c7991 = new C7991();
        this.h = c7991;
        C17359.requireNonNull(c7991);
        this.e = this.b.g0(new C6195(c7991, 1));
        this.f = new C3249(18, this);
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC7664 trySplit() {
        return (InterfaceC7664) super.trySplit();
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        return (InterfaceC7664) super.trySplit();
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC9154 trySplit() {
        return (InterfaceC7664) super.trySplit();
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        C17359.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            C7991 c7991 = (C7991) this.h;
            long j = this.g;
            int iR = c7991.r(j);
            if (c7991.c == 0 && iR == 0) {
                i = ((int[]) c7991.e)[(int) j];
            } else {
                i = ((int[][]) c7991.f)[iR][(int) (j - c7991.d[iR])];
            }
            intConsumer.accept(i);
        }
        return zA;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            C17359.requireNonNull(intConsumer);
            c();
            C17359.requireNonNull(intConsumer);
            C6195 c6195 = new C6195(intConsumer, 0);
            this.b.f0(this.d, c6195);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
