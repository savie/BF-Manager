package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֫᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G93V */
/* JADX INFO: loaded from: classes3.dex */
public final class C2037 extends AbstractC8202 implements RandomAccess {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C2037 f7591 = new C2037(new Object[0], 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f7592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object[] f7593;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C2037 m6534() {
        return f7591;
    }

    public C2037(Object[] objArr, int i, boolean z) {
        super(z);
        this.f7593 = objArr;
        this.f7592 = i;
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2016 mo3072(int i) {
        if (i < this.f7592) {
            throw new IllegalArgumentException();
        }
        return new C2037(Arrays.copyOf(this.f7593, i), this.f7592, true);
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21491();
        int i = this.f7592;
        Object[] objArr = this.f7593;
        if (i == objArr.length) {
            this.f7593 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7593;
        int i2 = this.f7592;
        this.f7592 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m21491();
        if (i < 0 || i > (i2 = this.f7592)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f7592);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        Object[] objArr = this.f7593;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f7593, i, objArr2, i + 1, this.f7592 - i);
            this.f7593 = objArr2;
        }
        this.f7593[i] = obj;
        this.f7592++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m6533(i);
        return this.f7593[i];
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        m6533(i);
        Object[] objArr = this.f7593;
        Object obj = objArr[i];
        int i2 = this.f7592;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f7592--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m21491();
        m6533(i);
        Object[] objArr = this.f7593;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7592;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6533(int i) {
        if (i < 0 || i >= this.f7592) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f7592);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
