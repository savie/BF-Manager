package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩶᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21526 extends AbstractC14066 {
    @Override // l.AbstractC24620
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C21526((InterfaceC3012) interfaceC8409, this);
    }

    @Override // l.InterfaceC3012
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC3012) this.a).tryAdvance((DoubleConsumer) this)) {
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

    @Override // l.AbstractC24620, l.InterfaceC8409
    public final InterfaceC3012 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC3012) super.trySplit();
    }
}
