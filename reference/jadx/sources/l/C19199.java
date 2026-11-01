package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19199 extends AbstractC7944 {
    @Override // l.AbstractC5752, l.InterfaceC6124, l.InterfaceC19386
    public final InterfaceC18796 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC5752, l.InterfaceC6124, l.InterfaceC19386
    public final InterfaceC18796 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC7944, l.InterfaceC18796
    public final void forEach(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEach(longConsumer);
        } else {
            AbstractC7944.u0(s0()).forEachRemaining(longConsumer);
        }
    }

    @Override // l.AbstractC7944, l.InterfaceC18796
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC7944.u0(s0()).forEachRemaining(longConsumer);
        }
    }

    @Override // l.InterfaceC6124
    public final InterfaceC6124 unordered() {
        return !EnumC2970.ORDERED.s(this.m) ? this : new C6553(this, EnumC2970.r, 2);
    }

    @Override // l.AbstractC5752, l.InterfaceC6124
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return spliterator();
    }

    @Override // l.AbstractC5752
    public final boolean p0() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        throw new UnsupportedOperationException();
    }
}
