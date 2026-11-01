package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۧۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C10767 implements InterfaceC23620 {
    public final long[] a;
    public int b;

    @Override // l.InterfaceC8616
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC22686.B(this, consumer);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.E(this, j, j2);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC22686.v(this, intFunction);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final /* bridge */ /* synthetic */ InterfaceC8616 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.InterfaceC0853
    public final InterfaceC0853 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC22686.y(this, (Long[]) objArr, i);
    }

    @Override // l.InterfaceC0853
    public final void e(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // l.InterfaceC0853
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    public C10767(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    public C10767(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // l.InterfaceC0853
    public final InterfaceC10110 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        C19988.a(((long[]) C13638.requireNonNull(jArr)).length, 0, i);
        return new C4006(jArr, 0, i, 1040);
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        C19988.a(((long[]) C13638.requireNonNull(jArr)).length, 0, i);
        return new C4006(jArr, 0, i, 1040);
    }

    @Override // l.InterfaceC0853
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // l.InterfaceC8616
    public final long count() {
        return this.b;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
