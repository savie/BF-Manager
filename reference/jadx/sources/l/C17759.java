package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩳۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C17759 implements InterfaceC7163 {
    public final double[] a;
    public int b;

    @Override // l.InterfaceC8616
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC22686.z(this, consumer);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.C(this, j, j2);
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
        AbstractC22686.w(this, (Double[]) objArr, i);
    }

    @Override // l.InterfaceC0853
    public final void e(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // l.InterfaceC0853
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    public C17759(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    public C17759(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // l.InterfaceC0853
    public final InterfaceC10110 spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        C19988.a(((double[]) C13638.requireNonNull(dArr)).length, 0, i);
        return new C23661(dArr, 0, i, 1040);
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        C19988.a(((double[]) C13638.requireNonNull(dArr)).length, 0, i);
        return new C23661(dArr, 0, i, 1040);
    }

    @Override // l.InterfaceC0853
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // l.InterfaceC8616
    public final long count() {
        return this.b;
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
