package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ᩴۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19717 extends AbstractC8682 implements InterfaceC16733, RandomAccess, InterfaceC24917 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C19717 f63461 = new C19717(0, false, new int[0]);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f63462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f63463;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m23373();
        if (i < 0 || i > (i2 = this.f63462)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f63462);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        int[] iArr = this.f63463;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f63463, i, iArr2, i + 1, this.f63462 - i);
            this.f63463 = iArr2;
        }
        this.f63463[i] = iIntValue;
        this.f63462++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mo39511(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m23373();
        m45411(i);
        int[] iArr = this.f63463;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C19717 m45412() {
        return f63461;
    }

    public C19717() {
        this(0, true, new int[10]);
    }

    public C19717(int i, boolean z, int[] iArr) {
        super(z);
        this.f63463 = iArr;
        this.f63462 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m23373();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f63463;
        System.arraycopy(iArr, i2, iArr, i, this.f63462 - i2);
        this.f63462 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19717)) {
            return super.equals(obj);
        }
        C19717 c19717 = (C19717) obj;
        if (this.f63462 != c19717.f63462) {
            return false;
        }
        int[] iArr = c19717.f63463;
        for (int i = 0; i < this.f63462; i++) {
            if (this.f63463[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f63462; i2++) {
            i = (i * 31) + this.f63463[i2];
        }
        return i;
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15987 mo4024(int i) {
        if (i < this.f63462) {
            throw new IllegalArgumentException();
        }
        return new C19717(this.f63462, true, Arrays.copyOf(this.f63463, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // l.InterfaceC16733
    public final int getInt(int i) {
        m45411(i);
        return this.f63463[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f63462;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f63463[i2] == iIntValue) {
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
        return this.f63462;
    }

    @Override // l.InterfaceC16733
    /* JADX INFO: renamed from: ۧ */
    public final void mo39511(int i) {
        m23373();
        int i2 = this.f63462;
        int[] iArr = this.f63463;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f63463 = iArr2;
        }
        int[] iArr3 = this.f63463;
        int i3 = this.f63462;
        this.f63462 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // l.AbstractC8682, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m23373();
        byte[] bArr = C23447.f75887;
        collection.getClass();
        if (!(collection instanceof C19717)) {
            return super.addAll(collection);
        }
        C19717 c19717 = (C19717) collection;
        int i = c19717.f63462;
        if (i == 0) {
            return false;
        }
        int i2 = this.f63462;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f63463;
        if (i3 > iArr.length) {
            this.f63463 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c19717.f63463, 0, this.f63463, this.f63462, c19717.f63462);
        this.f63462 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        m45411(i);
        int[] iArr = this.f63463;
        int i2 = iArr[i];
        int i3 = this.f63462;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f63462--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45411(int i) {
        if (i < 0 || i >= this.f63462) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f63462);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
