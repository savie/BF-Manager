package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3273 extends AbstractC22968 {
    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C3273((InterfaceC7535) interfaceC20693, this);
    }

    @Override // l.InterfaceC7535
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC7535) this.a).tryAdvance((DoubleConsumer) this)) {
            zTest = this.e.test(this.f);
            if (zTest) {
                doubleConsumer.accept(this.f);
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
    public final InterfaceC7535 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC7535) super.trySplit();
    }
}
