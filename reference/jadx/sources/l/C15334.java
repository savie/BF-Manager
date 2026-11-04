package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܳۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15334 extends AbstractC8863 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient float[] f50088;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50089;

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C15334(float[] fArr) {
        this.f50088 = fArr;
    }

    public C15334() {
        this.f50088 = C11605.f36437;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float[] m36786() {
        return this.f50088;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15334 m36782(float[] fArr) {
        int length = fArr.length;
        if (length > fArr.length) {
            throw new IllegalArgumentException(C12669.m31437(fArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(length, "The specified length (", ") is greater than the array size (")));
        }
        C15334 c15334 = new C15334(fArr);
        c15334.f50089 = length;
        return c15334;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36785(int i) {
        float[] fArr = this.f50088;
        if (i > fArr.length) {
            if (fArr != C11605.f36437 || i > 10) {
                int i2 = this.f50089;
                if (i > fArr.length) {
                    float[] fArr2 = new float[i];
                    System.arraycopy(fArr, 0, fArr2, 0, i2);
                    fArr = fArr2;
                }
                this.f50088 = fArr;
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m36784(int i) {
        float[] fArr = this.f50088;
        if (i <= fArr.length) {
            return;
        }
        if (fArr != C11605.f36437) {
            i = (int) Math.max(Math.min(((long) fArr.length) + ((long) (fArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        float[] fArr2 = new float[i];
        System.arraycopy(this.f50088, 0, fArr2, 0, this.f50089);
        this.f50088 = fArr2;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25096(float f, int i) {
        m23741(i);
        m36784(this.f50089 + 1);
        int i2 = this.f50089;
        if (i != i2) {
            float[] fArr = this.f50088;
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        }
        this.f50088[i] = f;
        this.f50089++;
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    public final boolean add(float f) {
        m36784(this.f50089 + 1);
        float[] fArr = this.f50088;
        int i = this.f50089;
        this.f50089 = i + 1;
        fArr[i] = f;
        return true;
    }

    @Override // l.InterfaceC21874
    public final float getFloat(int i) {
        if (i < this.f50089) {
            return this.f50088[i];
        }
        throw new IndexOutOfBoundsException(C12669.m31437(this.f50089, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC8863, l.InterfaceC21874
    /* JADX INFO: renamed from: ᩸ */
    public final int mo23745(float f) {
        float[] fArr = this.f50088;
        for (int i = 0; i < this.f50089; i++) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(fArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC8863, l.InterfaceC21874
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23743(float f) {
        float[] fArr = this.f50088;
        int i = this.f50089;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(fArr[i2])) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ܺ */
    public final float mo25095(int i) {
        int i2 = this.f50089;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f50089, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f50088;
        float f = fArr[i];
        int i3 = i2 - 1;
        this.f50089 = i3;
        if (i != i3) {
            System.arraycopy(fArr, i + 1, fArr, i, i3 - i);
        }
        return f;
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2883(float f) {
        int iMo23745 = mo23745(f);
        if (iMo23745 == -1) {
            return false;
        }
        mo25095(iMo23745);
        return true;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ */
    public final float mo25091(float f, int i) {
        if (i >= this.f50089) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f50089, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f50088;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ */
    public final void mo25093(int i, int i2, int i3, float[] fArr) {
        C18450.m42990(fArr.length, i2, i3);
        System.arraycopy(this.f50088, i, fArr, i2, i3);
    }

    @Override // l.AbstractC8863, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f50089 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50089;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f50089) {
            return this;
        }
        m23741(i);
        m23741(i2);
        if (i <= i2) {
            return new C19810(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f50089 == 0;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ */
    public final void mo25092(int i, int i2) {
        C18450.m42985(this.f50089, i, i2);
        float[] fArr = this.f50088;
        System.arraycopy(fArr, i2, fArr, i, this.f50089 - i2);
        this.f50089 -= i2 - i;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ۙ */
    public final void mo25094(int i, int i2, float[] fArr) {
        m23741(i);
        C18450.m42990(fArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f50089) {
            System.arraycopy(fArr, 0, this.f50088, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f50089, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC8863, l.AbstractC0660, l.InterfaceC10113
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2884(InterfaceC0419 interfaceC0419) {
        float[] fArr = this.f50088;
        for (int i = 0; i < this.f50089; i++) {
            interfaceC0419.mo2223(fArr[i]);
        }
    }

    @Override // l.AbstractC8863
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23742(int i, InterfaceC17572 interfaceC17572) {
        if (interfaceC17572 instanceof InterfaceC21874) {
            return m36783(i, (InterfaceC21874) interfaceC17572);
        }
        m23741(i);
        int size = interfaceC17572.size();
        if (size == 0) {
            return false;
        }
        m36784(this.f50089 + size);
        float[] fArr = this.f50088;
        System.arraycopy(fArr, i, fArr, i + size, this.f50089 - i);
        InterfaceC9367 it = interfaceC17572.iterator();
        this.f50089 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f50088[i] = it.nextFloat();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36783(int i, InterfaceC21874 interfaceC21874) {
        m23741(i);
        int size = interfaceC21874.size();
        if (size == 0) {
            return false;
        }
        m36784(this.f50089 + size);
        float[] fArr = this.f50088;
        System.arraycopy(fArr, i, fArr, i + size, this.f50089 - i);
        interfaceC21874.mo25093(0, i, size, this.f50088);
        this.f50089 += size;
        return true;
    }

    @Override // l.AbstractC0660
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2882(InterfaceC17572 interfaceC17572) {
        int i;
        float[] fArr = this.f50088;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f50089;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC17572.mo6580(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f50089 = i3;
        return z;
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2880(InterfaceC1737 interfaceC1737) {
        int i;
        float[] fArr = this.f50088;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f50089;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC1737.mo6144(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f50089 = i3;
        return z;
    }

    @Override // l.AbstractC8863, java.util.List
    public final InterfaceC10685 listIterator(int i) {
        m23741(i);
        return new C4894(this, i);
    }

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C22048(this);
    }

    @Override // l.AbstractC8863, l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15906 spliterator() {
        return new C22048(this);
    }

    @Override // l.AbstractC8863, l.InterfaceC21874
    /* JADX INFO: renamed from: ᩷ */
    public final void mo23744(InterfaceC6386 interfaceC6386) {
        if (interfaceC6386 == null) {
            C11605.m29164(0, this.f50089, this.f50088, null);
        } else {
            C11605.m29165(this.f50088, 0, this.f50089, interfaceC6386, null);
        }
    }

    public final Object clone() {
        float[] fArrCopyOf;
        float[] fArr = this.f50088;
        int i = this.f50089;
        if (i == 0) {
            fArrCopyOf = C11605.f36438;
        } else {
            fArrCopyOf = Arrays.copyOf(fArr, i);
        }
        C15334 c15334 = new C15334(fArrCopyOf);
        c15334.f50089 = this.f50089;
        return c15334;
    }

    @Override // l.AbstractC8863, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C15334) {
            C15334 c15334 = (C15334) obj;
            if (c15334 != this) {
                int i = this.f50089;
                int i2 = c15334.f50089;
                if (i == i2) {
                    float[] fArr = this.f50088;
                    float[] fArr2 = c15334.f50088;
                    if (fArr != fArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (fArr[i3] == fArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C19810) {
            return ((C19810) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC8863
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C15334) {
            C15334 c15334 = (C15334) list;
            int i = this.f50089;
            int i2 = c15334.f50089;
            float[] fArr = this.f50088;
            float[] fArr2 = c15334.f50088;
            if (fArr != fArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Float.compare(fArr[i3], fArr2[i3]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    return -1;
                }
                if (i3 < i) {
                    return 1;
                }
            }
            return 0;
        }
        if (list instanceof C19810) {
            return -((C19810) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f50088;
        for (int i = 0; i < this.f50089; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f50089];
        this.f50088 = fArr;
        for (int i = 0; i < this.f50089; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
