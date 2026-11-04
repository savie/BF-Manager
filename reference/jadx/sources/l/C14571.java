package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14571 extends AbstractC7114 {
    @Override // l.AbstractC24620
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C14571((InterfaceC7664) interfaceC8409, this);
    }

    @Override // l.InterfaceC7664
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC7664) this.a).tryAdvance((IntConsumer) this)) {
            zTest = this.e.test(this.f);
            if (zTest) {
                intConsumer.accept(this.f);
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
    public final InterfaceC7664 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC7664) super.trySplit();
    }
}
