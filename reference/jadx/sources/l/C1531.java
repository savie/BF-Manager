package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֫ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1531 extends AbstractC3730 {
    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C1531((InterfaceC19282) interfaceC20693, this);
    }

    @Override // l.InterfaceC19282
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC19282) this.a).tryAdvance((LongConsumer) this)) {
            zTest = this.e.test(this.f);
            if (zTest) {
                longConsumer.accept(this.f);
                return true;
            }
        } else {
            zTest = true;
        }
        this.c = false;
        if (!zTest) {
            this.b.set(true);
        }
        return false;
    }

    @Override // l.AbstractC14316, l.InterfaceC20693
    public final InterfaceC19282 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC19282) super.trySplit();
    }
}
