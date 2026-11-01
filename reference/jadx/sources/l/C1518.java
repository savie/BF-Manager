package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֫֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C1518 implements InterfaceC13036 {
    public final int[] a;
    public int b;

    @Override // l.InterfaceC8616
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC22686.A(this, consumer);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.D(this, j, j2);
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
        AbstractC22686.x(this, (Integer[]) objArr, i);
    }

    @Override // l.InterfaceC0853
    public final void e(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // l.InterfaceC0853
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    public C1518(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    public C1518(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }

    @Override // l.InterfaceC0853
    public final InterfaceC10110 spliterator() {
        return C19988.spliterator(this.a, 0, this.b, 1040);
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        return C19988.spliterator(this.a, 0, this.b, 1040);
    }

    @Override // l.InterfaceC0853
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // l.InterfaceC8616
    public final long count() {
        return this.b;
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
