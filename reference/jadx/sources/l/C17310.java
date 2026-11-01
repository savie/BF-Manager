package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17310 implements InterfaceC18576 {
    public long a;
    public final long b;
    public final int c;
    public final int d;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
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

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    public C17310(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    @Override // l.InterfaceC20693
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C17310 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C17310(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        intConsumer.accept(C22249.current().b(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C22249 c22249Current = C22249.current();
            do {
                intConsumer.accept(c22249Current.b(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
