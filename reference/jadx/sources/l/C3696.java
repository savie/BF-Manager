package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696 extends AbstractC21336 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f13495;

    @Override // l.AbstractC21336, l.InterfaceC18576, l.InterfaceC20693
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

    @Override // l.AbstractC21336, l.InterfaceC18576, l.InterfaceC20693
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

    @Override // l.AbstractC21336
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10865(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f13495.f26054[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3696(C7931 c7931) {
        super(c7931);
        this.f13495 = c7931;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3696(C7931 c7931, int i, int i2, boolean z) {
        super(c7931, i, i2, z);
        this.f13495 = c7931;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f69445 ? 257 : 321;
    }

    @Override // l.AbstractC21336
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21336 mo10864(int i, int i2, boolean z) {
        return new C3696(this.f13495, i, i2, z);
    }
}
