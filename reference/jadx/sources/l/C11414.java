package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۧۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11414 extends AbstractC8431 {
    @Override // l.AbstractC24620
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C11414((InterfaceC9900) interfaceC8409, this);
    }

    @Override // l.InterfaceC9900
    public final boolean tryAdvance(LongConsumer longConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC8409 interfaceC8409 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC9900) interfaceC8409).tryAdvance((LongConsumer) this);
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
        return ((InterfaceC9900) interfaceC8409).tryAdvance(longConsumer);
    }
}
