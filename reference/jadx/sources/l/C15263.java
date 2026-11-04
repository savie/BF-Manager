package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܳۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CFJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15263 extends AbstractC8682 implements InterfaceC13004, RandomAccess, InterfaceC24917 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C15263 f49902 = new C15263(new double[0], 0, false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double[] f49904;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m23373();
        if (i < 0 || i > (i2 = this.f49903)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f49903);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        double[] dArr = this.f49904;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f49904, i, dArr2, i + 1, this.f49903 - i);
            this.f49904 = dArr2;
        }
        this.f49904[i] = dDoubleValue;
        this.f49903++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m36616(((Double) obj).doubleValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m23373();
        m36614(i);
        double[] dArr = this.f49904;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C15263 m36615() {
        return f49902;
    }

    public C15263() {
        this(new double[10], 0, true);
    }

    public C15263(double[] dArr, int i, boolean z) {
        super(z);
        this.f49904 = dArr;
        this.f49903 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m23373();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f49904;
        System.arraycopy(dArr, i2, dArr, i, this.f49903 - i2);
        this.f49903 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15263)) {
            return super.equals(obj);
        }
        C15263 c15263 = (C15263) obj;
        if (this.f49903 != c15263.f49903) {
            return false;
        }
        double[] dArr = c15263.f49904;
        for (int i = 0; i < this.f49903; i++) {
            if (Double.doubleToLongBits(this.f49904[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM52660 = 1;
        for (int i = 0; i < this.f49903; i++) {
            iM52660 = (iM52660 * 31) + C23447.m52660(Double.doubleToLongBits(this.f49904[i]));
        }
        return iM52660;
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15987 mo4024(int i) {
        if (i < this.f49903) {
            throw new IllegalArgumentException();
        }
        return new C15263(Arrays.copyOf(this.f49904, i), this.f49903, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m36614(i);
        return Double.valueOf(this.f49904[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f49903;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f49904[i2] == dDoubleValue) {
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
        return this.f49903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36616(double d) {
        m23373();
        int i = this.f49903;
        double[] dArr = this.f49904;
        if (i == dArr.length) {
            double[] dArr2 = new double[C7376.m20246(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f49904 = dArr2;
        }
        double[] dArr3 = this.f49904;
        int i2 = this.f49903;
        this.f49903 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // l.AbstractC8682, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m23373();
        byte[] bArr = C23447.f75887;
        collection.getClass();
        if (!(collection instanceof C15263)) {
            return super.addAll(collection);
        }
        C15263 c15263 = (C15263) collection;
        int i = c15263.f49903;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49903;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f49904;
        if (i3 > dArr.length) {
            this.f49904 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c15263.f49904, 0, this.f49904, this.f49903, c15263.f49903);
        this.f49903 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        m36614(i);
        double[] dArr = this.f49904;
        double d = dArr[i];
        int i2 = this.f49903;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f49903--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36614(int i) {
        if (i < 0 || i >= this.f49903) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f49903);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
