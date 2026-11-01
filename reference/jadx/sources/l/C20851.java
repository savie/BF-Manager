package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20851 implements InterfaceC18576 {
    public int a;
    public final int b;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 17749;
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        return null;
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    public C20851(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        int i = this.a;
        if (i >= this.b) {
            return false;
        }
        this.a = i + 1;
        intConsumer.accept(i);
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        int i = this.b;
        this.a = i;
        for (int i2 = this.a; i2 < i; i2++) {
            intConsumer.accept(i2);
        }
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (((long) this.b) - ((long) this.a)) + ((long) 0);
    }

    @Override // l.InterfaceC20693
    public final InterfaceC18576 trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.a = i2;
        return new C20851(i, i2);
    }
}
