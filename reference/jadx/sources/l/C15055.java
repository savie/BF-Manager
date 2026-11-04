package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܳۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C15055 implements InterfaceC13409 {
    public final Object[] a;
    public int b;

    @Override // l.InterfaceC13409
    public final /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.F(this, j, j2, intFunction);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC13409
    public final InterfaceC13409 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C15055(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    public C15055(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return C13847.a(this.a, 0, this.b);
    }

    @Override // l.InterfaceC13409
    public final void k(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // l.InterfaceC13409
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC13409
    public final long count() {
        return this.b;
    }

    @Override // l.InterfaceC13409
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.n(this.a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
