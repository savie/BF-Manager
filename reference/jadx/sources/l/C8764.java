package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۡ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8764 extends AbstractC8202 implements InterfaceC14718, RandomAccess, InterfaceC11211 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C8764 f30128 = new C8764(new long[0], 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f30129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f30130;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m21491();
        if (i < 0 || i > (i2 = this.f30129)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f30129);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        long[] jArr = this.f30130;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f30130, i, jArr2, i + 1, this.f30129 - i);
            this.f30130 = jArr2;
        }
        this.f30130[i] = jLongValue;
        this.f30129++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m22769(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m21491();
        m22767(i);
        long[] jArr = this.f30130;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C8764 m22768() {
        return f30128;
    }

    public C8764() {
        this(new long[10], 0, true);
    }

    public C8764(long[] jArr, int i, boolean z) {
        super(z);
        this.f30130 = jArr;
        this.f30129 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21491();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f30130;
        System.arraycopy(jArr, i2, jArr, i, this.f30129 - i2);
        this.f30129 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8764)) {
            return super.equals(obj);
        }
        C8764 c8764 = (C8764) obj;
        if (this.f30129 != c8764.f30129) {
            return false;
        }
        long[] jArr = c8764.f30130;
        for (int i = 0; i < this.f30129; i++) {
            if (this.f30130[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM24887 = 1;
        for (int i = 0; i < this.f30129; i++) {
            iM24887 = (iM24887 * 31) + C9779.m24887(this.f30130[i]);
        }
        return iM24887;
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2016 mo3072(int i) {
        if (i < this.f30129) {
            throw new IllegalArgumentException();
        }
        return new C8764(Arrays.copyOf(this.f30130, i), this.f30129, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m22767(i);
        return this.f30130[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f30129;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30130[i2] == jLongValue) {
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
        return this.f30129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22769(long j) {
        m21491();
        int i = this.f30129;
        long[] jArr = this.f30130;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0833.m3428(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f30130 = jArr2;
        }
        long[] jArr3 = this.f30130;
        int i2 = this.f30129;
        this.f30129 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // l.AbstractC8202, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21491();
        byte[] bArr = C9779.f33478;
        collection.getClass();
        if (!(collection instanceof C8764)) {
            return super.addAll(collection);
        }
        C8764 c8764 = (C8764) collection;
        int i = c8764.f30129;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30129;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f30130;
        if (i3 > jArr.length) {
            this.f30130 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c8764.f30130, 0, this.f30130, this.f30129, c8764.f30129);
        this.f30129 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        m22767(i);
        long[] jArr = this.f30130;
        long j = jArr[i];
        int i2 = this.f30129;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f30129--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22767(int i) {
        if (i < 0 || i >= this.f30129) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f30129);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
