package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12372 implements InterfaceC7535 {
    public long a;
    public final long b;
    public final double c;
    public final double d;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC14884.b(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC14884.g(this, consumer);
    }

    public C12372(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    @Override // l.InterfaceC20693
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C12372 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C12372(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        doubleConsumer.accept(C22249.current().a(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C22249 c22249Current = C22249.current();
            do {
                doubleConsumer.accept(c22249Current.a(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
