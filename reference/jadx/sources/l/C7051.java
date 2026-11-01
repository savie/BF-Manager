package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7051 extends AbstractC23392 {
    @Override // l.AbstractC5752, l.InterfaceC6124, l.InterfaceC19386
    public final InterfaceC13514 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // l.AbstractC5752, l.InterfaceC6124, l.InterfaceC19386
    public final InterfaceC13514 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.AbstractC23392, l.InterfaceC13514
    public final void forEach(IntConsumer intConsumer) {
        if (this.h.r) {
            super.forEach(intConsumer);
        } else {
            AbstractC23392.u0(s0()).forEachRemaining(intConsumer);
        }
    }

    @Override // l.AbstractC23392, l.InterfaceC13514
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.h.r) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC23392.u0(s0()).forEachRemaining(intConsumer);
        }
    }

    @Override // l.InterfaceC6124
    public final InterfaceC6124 unordered() {
        return !EnumC2970.ORDERED.s(this.m) ? this : new C9294(this, EnumC2970.r, 1);
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
