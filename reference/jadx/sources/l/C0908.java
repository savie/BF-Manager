package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0908 extends AbstractC15706 implements InterfaceC18576 {
    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    @Override // l.AbstractC15706
    public final AbstractC15706 e(InterfaceC20693 interfaceC20693) {
        return new C0908(this.b, interfaceC20693, this.a);
    }

    @Override // l.AbstractC15706
    public final void d() {
        C8463 c8463 = new C8463();
        this.h = c8463;
        C13638.requireNonNull(c8463);
        this.e = this.b.g0(new C23405(c8463, 1));
        this.f = new C5295(17, this);
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC10110 trySplit() {
        return (InterfaceC18576) super.trySplit();
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC18576 trySplit() {
        return (InterfaceC18576) super.trySplit();
    }

    @Override // l.AbstractC15706, l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        return (InterfaceC18576) super.trySplit();
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        C13638.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            C8463 c8463 = (C8463) this.h;
            long j = this.g;
            int iR = c8463.r(j);
            if (c8463.c == 0 && iR == 0) {
                i = ((int[]) c8463.e)[(int) j];
            } else {
                i = ((int[][]) c8463.f)[iR][(int) (j - c8463.d[iR])];
            }
            intConsumer.accept(i);
        }
        return zA;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            C13638.requireNonNull(intConsumer);
            c();
            C13638.requireNonNull(intConsumer);
            C23405 c23405 = new C23405(intConsumer, 0);
            this.b.f0(this.d, c23405);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
