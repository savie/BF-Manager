package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11588 implements InterfaceC7664 {
    public int a;
    public final int b;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 17749;
    }

    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        return null;
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }

    public C11588(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        int i = this.a;
        if (i >= this.b) {
            return false;
        }
        this.a = i + 1;
        intConsumer.accept(i);
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        int i = this.b;
        this.a = i;
        for (int i2 = this.a; i2 < i; i2++) {
            intConsumer.accept(i2);
        }
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (((long) this.b) - ((long) this.a)) + ((long) 0);
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC7664 trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.a = i2;
        return new C11588(i, i2);
    }
}
