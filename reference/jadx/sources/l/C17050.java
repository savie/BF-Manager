package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܺ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17050 extends AbstractC14066 {
    @Override // l.AbstractC24620
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C17050((InterfaceC3012) interfaceC8409, this);
    }

    @Override // l.InterfaceC3012
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC8409 interfaceC8409 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC3012) interfaceC8409).tryAdvance((DoubleConsumer) this);
                if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.b.set(true);
                }
                doubleConsumer.accept(this.f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC3012) interfaceC8409).tryAdvance(doubleConsumer);
    }
}
