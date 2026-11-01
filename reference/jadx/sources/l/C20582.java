package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20582 extends AbstractC3730 {
    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C20582((InterfaceC19282) interfaceC20693, this);
    }

    @Override // l.InterfaceC19282
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC20693 interfaceC20693 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC19282) interfaceC20693).tryAdvance((LongConsumer) this);
                if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.b.set(true);
                }
                longConsumer.accept(this.f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC19282) interfaceC20693).tryAdvance(longConsumer);
    }
}
