package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֡᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CFJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0689 extends AbstractC8202 implements InterfaceC16834, RandomAccess, InterfaceC11211 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C0689 f2869 = new C0689(new double[0], 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f2870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double[] f2871;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m21491();
        if (i < 0 || i > (i2 = this.f2870)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f2870);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        double[] dArr = this.f2871;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f2871, i, dArr2, i + 1, this.f2870 - i);
            this.f2871 = dArr2;
        }
        this.f2871[i] = dDoubleValue;
        this.f2870++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3073(((Double) obj).doubleValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m21491();
        m3070(i);
        double[] dArr = this.f2871;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C0689 m3071() {
        return f2869;
    }

    public C0689() {
        this(new double[10], 0, true);
    }

    public C0689(double[] dArr, int i, boolean z) {
        super(z);
        this.f2871 = dArr;
        this.f2870 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21491();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f2871;
        System.arraycopy(dArr, i2, dArr, i, this.f2870 - i2);
        this.f2870 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0689)) {
            return super.equals(obj);
        }
        C0689 c0689 = (C0689) obj;
        if (this.f2870 != c0689.f2870) {
            return false;
        }
        double[] dArr = c0689.f2871;
        for (int i = 0; i < this.f2870; i++) {
            if (Double.doubleToLongBits(this.f2871[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM24887 = 1;
        for (int i = 0; i < this.f2870; i++) {
            iM24887 = (iM24887 * 31) + C9779.m24887(Double.doubleToLongBits(this.f2871[i]));
        }
        return iM24887;
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2016 mo3072(int i) {
        if (i < this.f2870) {
            throw new IllegalArgumentException();
        }
        return new C0689(Arrays.copyOf(this.f2871, i), this.f2870, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3070(i);
        return Double.valueOf(this.f2871[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f2870;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2871[i2] == dDoubleValue) {
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
        return this.f2870;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3073(double d) {
        m21491();
        int i = this.f2870;
        double[] dArr = this.f2871;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0833.m3428(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f2871 = dArr2;
        }
        double[] dArr3 = this.f2871;
        int i2 = this.f2870;
        this.f2870 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // l.AbstractC8202, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21491();
        byte[] bArr = C9779.f33478;
        collection.getClass();
        if (!(collection instanceof C0689)) {
            return super.addAll(collection);
        }
        C0689 c0689 = (C0689) collection;
        int i = c0689.f2870;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2870;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f2871;
        if (i3 > dArr.length) {
            this.f2871 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c0689.f2871, 0, this.f2871, this.f2870, c0689.f2870);
        this.f2870 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        m3070(i);
        double[] dArr = this.f2871;
        double d = dArr[i];
        int i2 = this.f2870;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f2870--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3070(int i) {
        if (i < 0 || i >= this.f2870) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f2870);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
