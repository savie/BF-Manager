package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15913 extends AbstractC6470 {
    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C15913((InterfaceC18576) interfaceC20693, this);
    }

    @Override // l.InterfaceC18576
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        InterfaceC20693 interfaceC20693 = this.a;
        if (z) {
            boolean z2 = false;
            this.c = false;
            while (true) {
                zTryAdvance = ((InterfaceC18576) interfaceC20693).tryAdvance((IntConsumer) this);
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
        return ((InterfaceC18576) interfaceC20693).tryAdvance(intConsumer);
    }
}
