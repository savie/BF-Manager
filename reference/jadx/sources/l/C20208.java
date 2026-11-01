package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩶ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20208 extends AbstractC22968 {
    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C20208((InterfaceC7535) interfaceC20693, this);
    }

    @Override // l.InterfaceC7535
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC20693 interfaceC20693 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC7535) interfaceC20693).tryAdvance((DoubleConsumer) this);
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
        return ((InterfaceC7535) interfaceC20693).tryAdvance(doubleConsumer);
    }
}
