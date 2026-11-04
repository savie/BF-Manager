package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20868 extends AbstractC3123 {
    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC16194 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC16194 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC3123, l.InterfaceC16194
    public final void forEach(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEach(longConsumer);
        } else {
            AbstractC3123.u0(s0()).forEachRemaining(longConsumer);
        }
    }

    @Override // l.AbstractC3123, l.InterfaceC16194
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC3123.u0(s0()).forEachRemaining(longConsumer);
        }
    }

    @Override // l.InterfaceC19924
    public final InterfaceC19924 unordered() {
        return !EnumC21614.ORDERED.p(this.m) ? this : new C11939(this, EnumC21614.r, 2);
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
