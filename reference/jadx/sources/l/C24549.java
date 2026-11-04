package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public final class C24549 extends AbstractC18581 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f79574;

    @Override // l.AbstractC18581, l.InterfaceC7664, l.InterfaceC8409
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

    @Override // l.AbstractC18581, l.InterfaceC7664
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

    @Override // l.AbstractC18581
    /* JADX INFO: renamed from: ۙ */
    public final void mo11911(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f79574.f62429[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24549(C19327 c19327) {
        super(c19327);
        this.f79574 = c19327;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24549(C19327 c19327, int i, int i2, boolean z) {
        super(c19327, i, i2, z);
        this.f79574 = c19327;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f60365 ? 257 : 321;
    }

    @Override // l.AbstractC18581
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18581 mo11910(int i, int i2, boolean z) {
        return new C24549(this.f79574, i, i2, z);
    }
}
