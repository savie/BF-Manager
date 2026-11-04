package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۘۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3957 extends AbstractC8431 {
    @Override // l.AbstractC24620
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C3957((InterfaceC9900) interfaceC8409, this);
    }

    @Override // l.InterfaceC9900
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC9900) this.a).tryAdvance((LongConsumer) this)) {
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

    @Override // l.AbstractC24620, l.InterfaceC8409
    public final InterfaceC9900 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC9900) super.trySplit();
    }
}
