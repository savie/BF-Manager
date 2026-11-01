package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩶ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20362 extends AbstractC8202 implements InterfaceC23890, RandomAccess, InterfaceC11211 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C20362 f65933 = new C20362(0, false, new int[0]);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65934;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f65935;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m21491();
        if (i < 0 || i > (i2 = this.f65934)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f65934);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        int[] iArr = this.f65935;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f65935, i, iArr2, i + 1, this.f65934 - i);
            this.f65935 = iArr2;
        }
        this.f65935[i] = iIntValue;
        this.f65934++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mo45940(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m21491();
        m45938(i);
        int[] iArr = this.f65935;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C20362 m45939() {
        return f65933;
    }

    public C20362() {
        this(0, true, new int[10]);
    }

    public C20362(int i, boolean z, int[] iArr) {
        super(z);
        this.f65935 = iArr;
        this.f65934 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21491();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f65935;
        System.arraycopy(iArr, i2, iArr, i, this.f65934 - i2);
        this.f65934 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20362)) {
            return super.equals(obj);
        }
        C20362 c20362 = (C20362) obj;
        if (this.f65934 != c20362.f65934) {
            return false;
        }
        int[] iArr = c20362.f65935;
        for (int i = 0; i < this.f65934; i++) {
            if (this.f65935[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f65934; i2++) {
            i = (i * 31) + this.f65935[i2];
        }
        return i;
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2016 mo3072(int i) {
        if (i < this.f65934) {
            throw new IllegalArgumentException();
        }
        return new C20362(this.f65934, true, Arrays.copyOf(this.f65935, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // l.InterfaceC23890
    public final int getInt(int i) {
        m45938(i);
        return this.f65935[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f65934;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f65935[i2] == iIntValue) {
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
        return this.f65934;
    }

    @Override // l.InterfaceC23890
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo45940(int i) {
        m21491();
        int i2 = this.f65934;
        int[] iArr = this.f65935;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f65935 = iArr2;
        }
        int[] iArr3 = this.f65935;
        int i3 = this.f65934;
        this.f65934 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // l.AbstractC8202, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21491();
        byte[] bArr = C9779.f33478;
        collection.getClass();
        if (!(collection instanceof C20362)) {
            return super.addAll(collection);
        }
        C20362 c20362 = (C20362) collection;
        int i = c20362.f65934;
        if (i == 0) {
            return false;
        }
        int i2 = this.f65934;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f65935;
        if (i3 > iArr.length) {
            this.f65935 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c20362.f65935, 0, this.f65935, this.f65934, c20362.f65934);
        this.f65934 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        m45938(i);
        int[] iArr = this.f65935;
        int i2 = iArr[i];
        int i3 = this.f65934;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f65934--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45938(int i) {
        if (i < 0 || i >= this.f65934) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f65934);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
