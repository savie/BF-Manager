package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩴۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19771 implements InterfaceC9900 {
    public long a;
    public final long b;
    public final long c;
    public final long d;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 17728;
    }

    @Override // l.InterfaceC9900, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18851.a(this, consumer);
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

    @Override // l.InterfaceC9900, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C18851.b(this, consumer);
    }

    public C19771(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // l.InterfaceC9900, l.InterfaceC9154, l.InterfaceC8409
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C19771 trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new C19771(j, j2, this.c, this.d);
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        longConsumer.accept(C20233.current().c(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            C20233 c20233Current = C20233.current();
            do {
                longConsumer.accept(c20233Current.c(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }
}
