package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩷֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes.dex */
public final class C21715 extends AbstractC8682 implements InterfaceC24939, RandomAccess, InterfaceC24917 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21715 f69297 = new C21715(new float[0], 0, false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float[] f69299;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m23373();
        if (i < 0 || i > (i2 = this.f69298)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f69298);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
        float[] fArr = this.f69299;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C7376.m20246(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f69299, i, fArr2, i + 1, this.f69298 - i);
            this.f69299 = fArr2;
        }
        this.f69299[i] = fFloatValue;
        this.f69298++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m49285(((Float) obj).floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m23373();
        m49283(i);
        float[] fArr = this.f69299;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C21715 m49284() {
        return f69297;
    }

    public C21715() {
        this(new float[10], 0, true);
    }

    public C21715(float[] fArr, int i, boolean z) {
        super(z);
        this.f69299 = fArr;
        this.f69298 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m23373();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f69299;
        System.arraycopy(fArr, i2, fArr, i, this.f69298 - i2);
        this.f69298 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21715)) {
            return super.equals(obj);
        }
        C21715 c21715 = (C21715) obj;
        if (this.f69298 != c21715.f69298) {
            return false;
        }
        float[] fArr = c21715.f69299;
        for (int i = 0; i < this.f69298; i++) {
            if (Float.floatToIntBits(this.f69299[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f69298; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f69299[i]);
        }
        return iFloatToIntBits;
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15987 mo4024(int i) {
        if (i < this.f69298) {
            throw new IllegalArgumentException();
        }
        return new C21715(Arrays.copyOf(this.f69299, i), this.f69298, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m49283(i);
        return Float.valueOf(this.f69299[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f69298;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f69299[i2] == fFloatValue) {
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
        return this.f69298;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49285(float f) {
        m23373();
        int i = this.f69298;
        float[] fArr = this.f69299;
        if (i == fArr.length) {
            float[] fArr2 = new float[C7376.m20246(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f69299 = fArr2;
        }
        float[] fArr3 = this.f69299;
        int i2 = this.f69298;
        this.f69298 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // l.AbstractC8682, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m23373();
        byte[] bArr = C23447.f75887;
        collection.getClass();
        if (!(collection instanceof C21715)) {
            return super.addAll(collection);
        }
        C21715 c21715 = (C21715) collection;
        int i = c21715.f69298;
        if (i == 0) {
            return false;
        }
        int i2 = this.f69298;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f69299;
        if (i3 > fArr.length) {
            this.f69299 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c21715.f69299, 0, this.f69299, this.f69298, c21715.f69298);
        this.f69298 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        m49283(i);
        float[] fArr = this.f69299;
        float f = fArr[i];
        int i2 = this.f69298;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f69298--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49283(int i) {
        if (i < 0 || i >= this.f69298) {
            StringBuilder sbM12235 = C3769.m12235(i, "Index:", ", Size:");
            sbM12235.append(this.f69298);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
