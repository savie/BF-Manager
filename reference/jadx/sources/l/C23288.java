package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23288 extends AbstractC19054 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f75534;

    @Override // l.AbstractC19054, l.InterfaceC20693
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

    @Override // l.AbstractC19054, l.InterfaceC20693
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

    @Override // l.AbstractC19054
    /* JADX INFO: renamed from: ۙ */
    public final void mo4947(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f75534.f31228[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23288(C9177 c9177) {
        super(c9177);
        this.f75534 = c9177;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23288(C9177 c9177, int i, int i2, boolean z) {
        super(c9177, i, i2, z);
        this.f75534 = c9177;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f61617 ? 257 : 321;
    }

    @Override // l.AbstractC19054
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19054 mo4946(int i, int i2, boolean z) {
        return new C23288(this.f75534, i, i2, z);
    }
}
