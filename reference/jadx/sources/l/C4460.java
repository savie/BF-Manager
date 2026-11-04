package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4460 extends AbstractC24007 {
    @Override // l.AbstractC24007, l.InterfaceC20670
    public final void forEach(Consumer consumer) {
        if (!this.h.r) {
            s0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // l.AbstractC24007, l.InterfaceC20670
    public final void forEachOrdered(Consumer consumer) {
        if (!this.h.r) {
            s0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // l.InterfaceC19924
    public final InterfaceC19924 unordered() {
        return !EnumC21614.ORDERED.p(this.m) ? this : new C25124(this, EnumC21614.r);
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
