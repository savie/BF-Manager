package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C12072 implements InterfaceC6478 {
    public final long[] a;
    public int b;

    @Override // l.InterfaceC13409
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC13956.B(this, consumer);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.E(this, j, j2);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC13956.v(this, intFunction);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC13409
    public final /* bridge */ /* synthetic */ InterfaceC13409 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.InterfaceC9459, l.InterfaceC13409
    public final InterfaceC9459 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC13956.y(this, (Long[]) objArr, i);
    }

    @Override // l.InterfaceC9459
    public final void e(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // l.InterfaceC9459
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    public C12072(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    public C12072(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        C13629.a(((long[]) C17359.requireNonNull(jArr)).length, 0, i);
        return new C24642(jArr, 0, i, 1040);
    }

    @Override // l.InterfaceC9459, l.InterfaceC13409
    public final InterfaceC9154 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        C13629.a(((long[]) C17359.requireNonNull(jArr)).length, 0, i);
        return new C24642(jArr, 0, i, 1040);
    }

    @Override // l.InterfaceC9459
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // l.InterfaceC13409
    public final long count() {
        return this.b;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
