package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۬ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13749 extends AbstractC8682 implements InterfaceC17479, RandomAccess, InterfaceC24917 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C13749 f43625 = new C13749(new long[0], 0, false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f43627;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m23373();
        if (i < 0 || i > (i2 = this.f43626)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f43626);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        long[] jArr = this.f43627;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f43627, i, jArr2, i + 1, this.f43626 - i);
            this.f43627 = jArr2;
        }
        this.f43627[i] = jLongValue;
        this.f43626++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m33596(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m23373();
        m33594(i);
        long[] jArr = this.f43627;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13749 m33595() {
        return f43625;
    }

    public C13749() {
        this(new long[10], 0, true);
    }

    public C13749(long[] jArr, int i, boolean z) {
        super(z);
        this.f43627 = jArr;
        this.f43626 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m23373();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f43627;
        System.arraycopy(jArr, i2, jArr, i, this.f43626 - i2);
        this.f43626 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13749)) {
            return super.equals(obj);
        }
        C13749 c13749 = (C13749) obj;
        if (this.f43626 != c13749.f43626) {
            return false;
        }
        long[] jArr = c13749.f43627;
        for (int i = 0; i < this.f43626; i++) {
            if (this.f43627[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM52660 = 1;
        for (int i = 0; i < this.f43626; i++) {
            iM52660 = (iM52660 * 31) + C23447.m52660(this.f43627[i]);
        }
        return iM52660;
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15987 mo4024(int i) {
        if (i < this.f43626) {
            throw new IllegalArgumentException();
        }
        return new C13749(Arrays.copyOf(this.f43627, i), this.f43626, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m33594(i);
        return this.f43627[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f43626;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f43627[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43626;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33596(long j) {
        m23373();
        int i = this.f43626;
        long[] jArr = this.f43627;
        if (i == jArr.length) {
            long[] jArr2 = new long[C7376.m20246(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f43627 = jArr2;
        }
        long[] jArr3 = this.f43627;
        int i2 = this.f43626;
        this.f43626 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // l.AbstractC8682, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m23373();
        byte[] bArr = C23447.f75887;
        collection.getClass();
        if (!(collection instanceof C13749)) {
            return super.addAll(collection);
        }
        C13749 c13749 = (C13749) collection;
        int i = c13749.f43626;
        if (i == 0) {
            return false;
        }
        int i2 = this.f43626;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f43627;
        if (i3 > jArr.length) {
            this.f43627 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c13749.f43627, 0, this.f43627, this.f43626, c13749.f43626);
        this.f43626 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        m33594(i);
        long[] jArr = this.f43627;
        long j = jArr[i];
        int i2 = this.f43626;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f43626--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33594(int i) {
        if (i < 0 || i >= this.f43626) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f43626);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
