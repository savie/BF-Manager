package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9563 extends AbstractC6470 {
    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C9563((InterfaceC18576) interfaceC20693, this);
    }

    @Override // l.InterfaceC18576
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTest;
        if (this.c && a() && ((InterfaceC18576) this.a).tryAdvance((IntConsumer) this)) {
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

    @Override // l.AbstractC14316, l.InterfaceC20693
    public final InterfaceC18576 trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (InterfaceC18576) super.trySplit();
    }
}
