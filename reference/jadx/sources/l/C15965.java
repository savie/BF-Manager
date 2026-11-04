package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܶ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G93V */
/* JADX INFO: loaded from: classes5.dex */
public final class C15965 extends AbstractC8682 implements RandomAccess {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C15965 f51836 = new C15965(new Object[0], 0, false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51837;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object[] f51838;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C15965 m38083() {
        return f51836;
    }

    public C15965(Object[] objArr, int i, boolean z) {
        super(z);
        this.f51838 = objArr;
        this.f51837 = i;
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15987 mo4024(int i) {
        if (i < this.f51837) {
            throw new IllegalArgumentException();
        }
        return new C15965(Arrays.copyOf(this.f51838, i), this.f51837, true);
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m23373();
        int i = this.f51837;
        Object[] objArr = this.f51838;
        if (i == objArr.length) {
            this.f51838 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f51838;
        int i2 = this.f51837;
        this.f51837 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m23373();
        if (i < 0 || i > (i2 = this.f51837)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f51837);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        Object[] objArr = this.f51838;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f51838, i, objArr2, i + 1, this.f51837 - i);
            this.f51838 = objArr2;
        }
        this.f51838[i] = obj;
        this.f51837++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m38082(i);
        return this.f51838[i];
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        m38082(i);
        Object[] objArr = this.f51838;
        Object obj = objArr[i];
        int i2 = this.f51837;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f51837--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m23373();
        m38082(i);
        Object[] objArr = this.f51838;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51837;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38082(int i) {
        if (i < 0 || i >= this.f51837) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f51837);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
