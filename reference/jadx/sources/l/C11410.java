package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۨۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11410 extends AbstractC22055 {
    @Override // l.InterfaceC8616
    public final InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.j(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 > jCount) {
            return AbstractC22686.L(EnumC22761.REFERENCE, this.a.j(j, jCount, intFunction), this.b.j(0L, j2 - jCount, intFunction));
        }
        return this.a.j(j, j2, intFunction);
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        return new C0887(this);
    }

    @Override // l.InterfaceC8616
    public final void k(Object[] objArr, int i) {
        C13638.requireNonNull(objArr);
        InterfaceC8616 interfaceC8616 = this.a;
        interfaceC8616.k(objArr, i);
        this.b.k(objArr, i + ((int) interfaceC8616.count()));
    }

    @Override // l.InterfaceC8616
    public final Object[] m(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // l.InterfaceC8616
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
