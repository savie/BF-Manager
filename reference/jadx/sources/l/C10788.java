package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۧۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10788 extends AbstractC15706 implements InterfaceC19282 {
    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    @Override // l.AbstractC15706
    public final AbstractC15706 e(InterfaceC20693 interfaceC20693) {
        return new C10788(this.b, interfaceC20693, this.a);
    }

    @Override // l.AbstractC15706
    public final void d() {
        C16336 c16336 = new C16336();
        this.h = c16336;
        C13638.requireNonNull(c16336);
        this.e = this.b.g0(new C8671(c16336, 1));
        this.f = new C5295(18, this);
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC10110 trySplit() {
        return (InterfaceC19282) super.trySplit();
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC19282 trySplit() {
        return (InterfaceC19282) super.trySplit();
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        return (InterfaceC19282) super.trySplit();
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        C13638.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            C16336 c16336 = (C16336) this.h;
            long j2 = this.g;
            int iR = c16336.r(j2);
            if (c16336.c == 0 && iR == 0) {
                j = ((long[]) c16336.e)[(int) j2];
            } else {
                j = ((long[][]) c16336.f)[iR][(int) (j2 - c16336.d[iR])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            C13638.requireNonNull(longConsumer);
            c();
            C13638.requireNonNull(longConsumer);
            C8671 c8671 = new C8671(longConsumer, 0);
            this.b.f0(this.d, c8671);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
