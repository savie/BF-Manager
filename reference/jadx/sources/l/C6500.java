package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۛܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6500 extends AbstractC12487 {
    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC20648 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC20648 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC12487, l.InterfaceC20648
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC12487.u0(s0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // l.AbstractC12487, l.InterfaceC20648
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC12487.u0(s0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // l.InterfaceC19924
    public final InterfaceC19924 unordered() {
        return !EnumC21614.ORDERED.p(this.m) ? this : new C8956(this, EnumC21614.r, 0);
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return spliterator();
    }

    @Override // l.AbstractC15470
    public final boolean p0() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15470
    public final InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143) {
        throw new UnsupportedOperationException();
    }
}
