package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12685 extends AbstractC24753 implements InterfaceC9900 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18851.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C18851.b(this, consumer);
    }

    @Override // l.AbstractC24753
    public final AbstractC24753 e(InterfaceC8409 interfaceC8409) {
        return new C12685(this.b, interfaceC8409, this.a);
    }

    @Override // l.AbstractC24753
    public final void d() {
        C16216 c16216 = new C16216();
        this.h = c16216;
        C17359.requireNonNull(c16216);
        this.e = this.b.g0(new C13431(c16216, 1));
        this.f = new C3249(19, this);
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        return (InterfaceC9900) super.trySplit();
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC9154 trySplit() {
        return (InterfaceC9900) super.trySplit();
    }

    @Override // l.AbstractC24753, l.InterfaceC8409
    public final InterfaceC9900 trySplit() {
        return (InterfaceC9900) super.trySplit();
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        C17359.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            C16216 c16216 = (C16216) this.h;
            long j2 = this.g;
            int iR = c16216.r(j2);
            if (c16216.c == 0 && iR == 0) {
                j = ((long[]) c16216.e)[(int) j2];
            } else {
                j = ((long[][]) c16216.f)[iR][(int) (j2 - c16216.d[iR])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            C17359.requireNonNull(longConsumer);
            c();
            C17359.requireNonNull(longConsumer);
            C13431 c13431 = new C13431(longConsumer, 0);
            this.b.f0(this.d, c13431);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
