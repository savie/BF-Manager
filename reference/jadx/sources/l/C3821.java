package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3821 extends AbstractC0999 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f14163;

    @Override // l.AbstractC0999, l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13907.m33739(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC0999, l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13907.m33740(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC0999
    /* JADX INFO: renamed from: ۙ */
    public final void mo3826(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f14163.f22435[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3821(C6644 c6644) {
        super(c6644);
        this.f14163 = c6644;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3821(C6644 c6644, int i, int i2, boolean z) {
        super(c6644, i, i2, z);
        this.f14163 = c6644;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f4674 ? 256 : 320;
    }

    @Override // l.AbstractC0999
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC0999 mo3825(int i, int i2, boolean z) {
        return new C3821(this.f14163, i, i2, z);
    }
}
