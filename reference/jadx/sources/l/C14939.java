package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14939 extends AbstractC8228 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f48782;

    @Override // l.AbstractC8228, l.InterfaceC8409
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

    @Override // l.AbstractC8228, l.InterfaceC8409, l.InterfaceC7664
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

    @Override // l.AbstractC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo22134(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f48782.f5295[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14939(C1516 c1516) {
        super(c1516);
        this.f48782 = c1516;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14939(C1516 c1516, int i, int i2, boolean z) {
        super(c1516, i, i2, z);
        this.f48782 = c1516;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f27085 ? 257 : 321;
    }

    @Override // l.AbstractC8228
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8228 mo22133(int i, int i2, boolean z) {
        return new C14939(this.f48782, i, i2, z);
    }
}
