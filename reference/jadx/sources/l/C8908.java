package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۡ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: RGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8908 extends AbstractC8202 implements InterfaceC0605, RandomAccess, InterfaceC11211 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C8908 f30556 = new C8908(new boolean[0], 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f30557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean[] f30558;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m21491();
        if (i < 0 || i > (i2 = this.f30557)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f30557);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        boolean[] zArr = this.f30558;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f30558, i, zArr2, i + 1, this.f30557 - i);
            this.f30558 = zArr2;
        }
        this.f30558[i] = zBooleanValue;
        this.f30557++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m23171(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m21491();
        m23169(i);
        boolean[] zArr = this.f30558;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C8908 m23170() {
        return f30556;
    }

    public C8908() {
        this(new boolean[10], 0, true);
    }

    public C8908(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f30558 = zArr;
        this.f30557 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21491();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f30558;
        System.arraycopy(zArr, i2, zArr, i, this.f30557 - i2);
        this.f30557 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8908)) {
            return super.equals(obj);
        }
        C8908 c8908 = (C8908) obj;
        if (this.f30557 != c8908.f30557) {
            return false;
        }
        boolean[] zArr = c8908.f30558;
        for (int i = 0; i < this.f30557; i++) {
            if (this.f30558[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM24888 = 1;
        for (int i = 0; i < this.f30557; i++) {
            iM24888 = (iM24888 * 31) + C9779.m24888(this.f30558[i]);
        }
        return iM24888;
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2016 mo3072(int i) {
        if (i < this.f30557) {
            throw new IllegalArgumentException();
        }
        return new C8908(Arrays.copyOf(this.f30558, i), this.f30557, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m23169(i);
        return Boolean.valueOf(this.f30558[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f30557;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30558[i2] == zBooleanValue) {
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
        return this.f30557;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23171(boolean z) {
        m21491();
        int i = this.f30557;
        boolean[] zArr = this.f30558;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0833.m3428(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f30558 = zArr2;
        }
        boolean[] zArr3 = this.f30558;
        int i2 = this.f30557;
        this.f30557 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // l.AbstractC8202, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21491();
        byte[] bArr = C9779.f33478;
        collection.getClass();
        if (!(collection instanceof C8908)) {
            return super.addAll(collection);
        }
        C8908 c8908 = (C8908) collection;
        int i = c8908.f30557;
        if (i == 0) {
            return false;
        }
        int i2 = this.f30557;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f30558;
        if (i3 > zArr.length) {
            this.f30558 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c8908.f30558, 0, this.f30558, this.f30557, c8908.f30557);
        this.f30557 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        m23169(i);
        boolean[] zArr = this.f30558;
        boolean z = zArr[i];
        int i2 = this.f30557;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f30557--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23169(int i) {
        if (i < 0 || i >= this.f30557) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f30557);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
