package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۛۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6021 implements InterfaceC19282 {
    public long a;
    public final long b;
    public final long c;
    public final long d;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
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

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    public C6021(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // l.InterfaceC20693
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C6021 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C6021(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        longConsumer.accept(C22249.current().c(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C22249 c22249Current = C22249.current();
            do {
                longConsumer.accept(c22249Current.c(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
