package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25015 extends AbstractC7114 {
    @Override // l.AbstractC24620
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C25015((InterfaceC7664) interfaceC8409, this);
    }

    @Override // l.InterfaceC7664
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC8409 interfaceC8409 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC7664) interfaceC8409).tryAdvance((IntConsumer) this);
                if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                    break;
                }
                z2 = true;
            }
            if (zTryAdvance) {
                if (z2) {
                    this.b.set(true);
                }
                intConsumer.accept(this.f);
            }
            return zTryAdvance;
        }
        return ((InterfaceC7664) interfaceC8409).tryAdvance(intConsumer);
    }
}
