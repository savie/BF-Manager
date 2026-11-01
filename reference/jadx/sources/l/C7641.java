package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۟ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C7641 extends AbstractC8202 implements InterfaceC11190, RandomAccess, InterfaceC11211 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7641 f25228 = new C7641(new float[0], 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f25229;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float[] f25230;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m21491();
        if (i < 0 || i > (i2 = this.f25229)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f25229);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
        float[] fArr = this.f25230;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0833.m3428(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f25230, i, fArr2, i + 1, this.f25229 - i);
            this.f25230 = fArr2;
        }
        this.f25230[i] = fFloatValue;
        this.f25229++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m20196(((Float) obj).floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m21491();
        m20194(i);
        float[] fArr = this.f25230;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C7641 m20195() {
        return f25228;
    }

    public C7641() {
        this(new float[10], 0, true);
    }

    public C7641(float[] fArr, int i, boolean z) {
        super(z);
        this.f25230 = fArr;
        this.f25229 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21491();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f25230;
        System.arraycopy(fArr, i2, fArr, i, this.f25229 - i2);
        this.f25229 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7641)) {
            return super.equals(obj);
        }
        C7641 c7641 = (C7641) obj;
        if (this.f25229 != c7641.f25229) {
            return false;
        }
        float[] fArr = c7641.f25230;
        for (int i = 0; i < this.f25229; i++) {
            if (Float.floatToIntBits(this.f25230[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f25229; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f25230[i]);
        }
        return iFloatToIntBits;
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2016 mo3072(int i) {
        if (i < this.f25229) {
            throw new IllegalArgumentException();
        }
        return new C7641(Arrays.copyOf(this.f25230, i), this.f25229, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m20194(i);
        return Float.valueOf(this.f25230[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f25229;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f25230[i2] == fFloatValue) {
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
        return this.f25229;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20196(float f) {
        m21491();
        int i = this.f25229;
        float[] fArr = this.f25230;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0833.m3428(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f25230 = fArr2;
        }
        float[] fArr3 = this.f25230;
        int i2 = this.f25229;
        this.f25229 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // l.AbstractC8202, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21491();
        byte[] bArr = C9779.f33478;
        collection.getClass();
        if (!(collection instanceof C7641)) {
            return super.addAll(collection);
        }
        C7641 c7641 = (C7641) collection;
        int i = c7641.f25229;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25229;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f25230;
        if (i3 > fArr.length) {
            this.f25230 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c7641.f25230, 0, this.f25230, this.f25229, c7641.f25229);
        this.f25229 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        m20194(i);
        float[] fArr = this.f25230;
        float f = fArr[i];
        int i2 = this.f25229;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f25229--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20194(int i) {
        if (i < 0 || i >= this.f25229) {
            StringBuilder sbM40153 = C17214.m40153(i, "Index:", ", Size:");
            sbM40153.append(this.f25229);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
