package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1559 extends AbstractC14295 {
    @Override // l.AbstractC14295, l.InterfaceC5046
    public final void forEach(Consumer consumer) {
        if (!this.h.r) {
            s0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // l.AbstractC14295, l.InterfaceC5046
    public final void forEachOrdered(Consumer consumer) {
        if (!this.h.r) {
            s0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // l.InterfaceC6124
    public final InterfaceC6124 unordered() {
        return !EnumC2970.ORDERED.s(this.m) ? this : new C15859(this, EnumC2970.r);
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
