package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۬ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: RGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13902 extends AbstractC8682 implements InterfaceC15241, RandomAccess, InterfaceC24917 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C13902 f44078 = new C13902(new boolean[0], 0, false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44079;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean[] f44080;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m23373();
        if (i < 0 || i > (i2 = this.f44079)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f44079);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        boolean[] zArr = this.f44080;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f44080, i, zArr2, i + 1, this.f44079 - i);
            this.f44080 = zArr2;
        }
        this.f44080[i] = zBooleanValue;
        this.f44079++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m33851(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m23373();
        m33849(i);
        boolean[] zArr = this.f44080;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13902 m33850() {
        return f44078;
    }

    public C13902() {
        this(new boolean[10], 0, true);
    }

    public C13902(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f44080 = zArr;
        this.f44079 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m23373();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f44080;
        System.arraycopy(zArr, i2, zArr, i, this.f44079 - i2);
        this.f44079 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13902)) {
            return super.equals(obj);
        }
        C13902 c13902 = (C13902) obj;
        if (this.f44079 != c13902.f44079) {
            return false;
        }
        boolean[] zArr = c13902.f44080;
        for (int i = 0; i < this.f44079; i++) {
            if (this.f44080[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM52661 = 1;
        for (int i = 0; i < this.f44079; i++) {
            iM52661 = (iM52661 * 31) + C23447.m52661(this.f44080[i]);
        }
        return iM52661;
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15987 mo4024(int i) {
        if (i < this.f44079) {
            throw new IllegalArgumentException();
        }
        return new C13902(Arrays.copyOf(this.f44080, i), this.f44079, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m33849(i);
        return Boolean.valueOf(this.f44080[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f44079;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44080[i2] == zBooleanValue) {
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
        return this.f44079;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33851(boolean z) {
        m23373();
        int i = this.f44079;
        boolean[] zArr = this.f44080;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C7376.m20246(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f44080 = zArr2;
        }
        boolean[] zArr3 = this.f44080;
        int i2 = this.f44079;
        this.f44079 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // l.AbstractC8682, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m23373();
        byte[] bArr = C23447.f75887;
        collection.getClass();
        if (!(collection instanceof C13902)) {
            return super.addAll(collection);
        }
        C13902 c13902 = (C13902) collection;
        int i = c13902.f44079;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44079;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f44080;
        if (i3 > zArr.length) {
            this.f44080 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c13902.f44080, 0, this.f44080, this.f44079, c13902.f44079);
        this.f44079 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        m33849(i);
        boolean[] zArr = this.f44080;
        boolean z = zArr[i];
        int i2 = this.f44079;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f44079--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33849(int i) {
        if (i < 0 || i >= this.f44079) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f44079);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
