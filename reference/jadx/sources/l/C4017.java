package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4017 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f13724 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f13725;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 17749;
    }

    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17441.m40942(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        return null;
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        return null;
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17441.m40943(this, consumer);
    }

    @Override // l.InterfaceC7664, l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return null;
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return null;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return null;
    }

    public C4017(int i) {
        this.f13725 = i;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        if (this.f13724) {
            return false;
        }
        this.f13724 = true;
        intConsumer.accept(this.f13725);
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f13724 ? 0L : 1L;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        if (this.f13724) {
            return;
        }
        this.f13724 = true;
        intConsumer.accept(this.f13725);
    }
}
