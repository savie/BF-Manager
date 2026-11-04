package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19875 extends AbstractC10924 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f63911;

    @Override // l.AbstractC10924, l.InterfaceC7664, l.InterfaceC8409
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

    @Override // l.AbstractC10924, l.InterfaceC7664
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

    @Override // l.AbstractC10924
    /* JADX INFO: renamed from: ۙ */
    public final void mo3733(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f63911.f50195[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19875(C15399 c15399) {
        super(c15399);
        this.f63911 = c15399;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19875(C15399 c15399, int i, int i2, boolean z) {
        super(c15399, i, i2, z);
        this.f63911 = c15399;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f34584 ? 256 : 320;
    }

    @Override // l.AbstractC10924
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC10924 mo3732(int i, int i2, boolean z) {
        return new C19875(this.f63911, i, i2, z);
    }
}
