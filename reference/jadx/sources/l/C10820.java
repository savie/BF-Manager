package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۤۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10820 implements InterfaceC3012 {
    public long a;
    public final long b;
    public final double c;
    public final double d;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2946.b(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2946.g(this, consumer);
    }

    public C10820(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10820 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C10820(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        doubleConsumer.accept(C20233.current().a(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C20233 c20233Current = C20233.current();
            do {
                doubleConsumer.accept(c20233Current.a(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
