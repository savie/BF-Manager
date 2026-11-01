package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15611 extends AbstractC12083 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f50750;

    @Override // l.AbstractC12083, l.InterfaceC18576, l.InterfaceC20693
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

    @Override // l.AbstractC12083, l.InterfaceC18576, l.InterfaceC20693
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

    @Override // l.AbstractC12083
    /* JADX INFO: renamed from: ۙ */
    public final void mo15785(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f50750.f36415[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15611(C10672 c10672) {
        super(c10672);
        this.f50750 = c10672;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15611(C10672 c10672, int i, int i2, boolean z) {
        super(c10672, i, i2, z);
        this.f50750 = c10672;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f40440 ? 257 : 321;
    }

    @Override // l.AbstractC12083
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12083 mo15784(int i, int i2, boolean z) {
        return new C15611(this.f50750, i, i2, z);
    }
}
