package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۤۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C10668 implements InterfaceC2047 {
    public final double[] a;
    public int b;

    @Override // l.InterfaceC13409
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC13956.z(this, consumer);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.C(this, j, j2);
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
        AbstractC13956.w(this, (Double[]) objArr, i);
    }

    @Override // l.InterfaceC9459
    public final void e(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // l.InterfaceC9459
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    public C10668(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    public C10668(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        C13629.a(((double[]) C17359.requireNonNull(dArr)).length, 0, i);
        return new C13058(dArr, 0, i, 1040);
    }

    @Override // l.InterfaceC9459, l.InterfaceC13409
    public final InterfaceC9154 spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        C13629.a(((double[]) C17359.requireNonNull(dArr)).length, 0, i);
        return new C13058(dArr, 0, i, 1040);
    }

    @Override // l.InterfaceC9459
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // l.InterfaceC13409
    public final long count() {
        return this.b;
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
