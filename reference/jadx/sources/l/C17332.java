package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public final class C17332 extends AbstractC20316 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f56440;

    @Override // l.AbstractC20316, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17441.m40942(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC20316, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17441.m40943(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC20316
    /* JADX INFO: renamed from: ۙ */
    public final void mo6003(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f56440.f77781[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17332(C24046 c24046) {
        super(c24046);
        this.f56440 = c24046;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17332(C24046 c24046, int i, int i2, boolean z) {
        super(c24046, i, i2, z);
        this.f56440 = c24046;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f65200 ? 257 : 321;
    }

    @Override // l.AbstractC20316
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20316 mo6002(int i, int i2, boolean z) {
        return new C17332(this.f56440, i, i2, z);
    }
}
