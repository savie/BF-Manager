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

/* JADX INFO: renamed from: l.ۧۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10982 extends AbstractC20859 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient float[] f37398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37399;

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C10982(float[] fArr) {
        this.f37398 = fArr;
    }

    public C10982() {
        this.f37398 = C9571.f32282;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float[] m27737() {
        return this.f37398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10982 m27733(float[] fArr) {
        int length = fArr.length;
        if (length > fArr.length) {
            throw new IllegalArgumentException(C12441.m30911(fArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(length, "The specified length (", ") is greater than the array size (")));
        }
        C10982 c10982 = new C10982(fArr);
        c10982.f37399 = length;
        return c10982;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27736(int i) {
        float[] fArr = this.f37398;
        if (i > fArr.length) {
            if (fArr != C9571.f32282 || i > 10) {
                int i2 = this.f37399;
                if (i > fArr.length) {
                    float[] fArr2 = new float[i];
                    System.arraycopy(fArr, 0, fArr2, 0, i2);
                    fArr = fArr2;
                }
                this.f37398 = fArr;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m27732(int i) {
        float[] fArr = this.f37398;
        if (i <= fArr.length) {
            return;
        }
        if (fArr != C9571.f32282) {
            i = (int) Math.max(Math.min(((long) fArr.length) + ((long) (fArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        float[] fArr2 = new float[i];
        System.arraycopy(this.f37398, 0, fArr2, 0, this.f37399);
        this.f37398 = fArr2;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ܰ */
    public final void mo26069(float f, int i) {
        m46896(i);
        m27732(this.f37399 + 1);
        int i2 = this.f37399;
        if (i != i2) {
            float[] fArr = this.f37398;
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        }
        this.f37398[i] = f;
        this.f37399++;
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    public final boolean add(float f) {
        m27732(this.f37399 + 1);
        float[] fArr = this.f37398;
        int i = this.f37399;
        this.f37399 = i + 1;
        fArr[i] = f;
        return true;
    }

    @Override // l.InterfaceC16357
    public final float getFloat(int i) {
        if (i < this.f37399) {
            return this.f37398[i];
        }
        throw new IndexOutOfBoundsException(C12441.m30911(this.f37399, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC20859, l.InterfaceC16357
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo27734(float f) {
        float[] fArr = this.f37398;
        for (int i = 0; i < this.f37399; i++) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(fArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC20859, l.InterfaceC16357
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo27739(float f) {
        float[] fArr = this.f37398;
        int i = this.f37399;
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

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ܶ */
    public final float mo26070(int i) {
        int i2 = this.f37399;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f37399, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f37398;
        float f = fArr[i];
        int i3 = i2 - 1;
        this.f37399 = i3;
        if (i != i3) {
            System.arraycopy(fArr, i + 1, fArr, i, i3 - i);
        }
        return f;
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo6889(float f) {
        int iMo27734 = mo27734(f);
        if (iMo27734 == -1) {
            return false;
        }
        mo26070(iMo27734);
        return true;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final float mo26064(float f, int i) {
        if (i >= this.f37399) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f37399, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f37398;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // l.AbstractC20859, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f37399 = 0;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo26066(int i, int i2, int i3, float[] fArr) {
        C7000.m18807(fArr.length, i2, i3);
        System.arraycopy(this.f37398, i, fArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37399;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f37399) {
            return this;
        }
        m46896(i);
        m46896(i2);
        if (i <= i2) {
            return new C6042(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f37399 == 0;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo26065(int i, int i2) {
        C7000.m18804(this.f37399, i, i2);
        float[] fArr = this.f37398;
        System.arraycopy(fArr, i2, fArr, i, this.f37399 - i2);
        this.f37399 -= i2 - i;
    }

    @Override // l.InterfaceC16357
    /* JADX INFO: renamed from: ۙ */
    public final void mo26067(int i, int i2, float[] fArr) {
        m46896(i);
        C7000.m18807(fArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f37399) {
            System.arraycopy(fArr, 0, this.f37398, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f37399, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC20859, l.AbstractC18036, l.InterfaceC19179
    /* JADX INFO: renamed from: ܰ */
    public final void mo6890(InterfaceC17767 interfaceC17767) {
        float[] fArr = this.f37398;
        for (int i = 0; i < this.f37399; i++) {
            interfaceC17767.mo35707(fArr[i]);
        }
    }

    @Override // l.AbstractC20859
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo26068(int i, InterfaceC13535 interfaceC13535) {
        if (interfaceC13535 instanceof InterfaceC16357) {
            return m27735(i, (InterfaceC16357) interfaceC13535);
        }
        m46896(i);
        int size = interfaceC13535.size();
        if (size == 0) {
            return false;
        }
        m27732(this.f37399 + size);
        float[] fArr = this.f37398;
        System.arraycopy(fArr, i, fArr, i + size, this.f37399 - i);
        InterfaceC10007 it = interfaceC13535.iterator();
        this.f37399 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f37398[i] = it.nextFloat();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27735(int i, InterfaceC16357 interfaceC16357) {
        m46896(i);
        int size = interfaceC16357.size();
        if (size == 0) {
            return false;
        }
        m27732(this.f37399 + size);
        float[] fArr = this.f37398;
        System.arraycopy(fArr, i, fArr, i + size, this.f37399 - i);
        interfaceC16357.mo26066(0, i, size, this.f37398);
        this.f37399 += size;
        return true;
    }

    @Override // l.AbstractC18036
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo27738(InterfaceC13535 interfaceC13535) {
        int i;
        float[] fArr = this.f37398;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f37399;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC13535.mo5900(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f37399 = i3;
        return z;
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6888(InterfaceC1539 interfaceC1539) {
        int i;
        float[] fArr = this.f37398;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f37399;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC1539.mo5315(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f37399 = i3;
        return z;
    }

    @Override // l.AbstractC20859, java.util.List
    public final InterfaceC12124 listIterator(int i) {
        m46896(i);
        return new C0397(this, i);
    }

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11501 spliterator() {
        return new C16626(this);
    }

    @Override // l.AbstractC20859, l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C16626(this);
    }

    @Override // l.AbstractC20859, l.InterfaceC16357
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo27740(InterfaceC12829 interfaceC12829) {
        if (interfaceC12829 == null) {
            C9571.m24436(0, this.f37399, this.f37398, null);
        } else {
            C9571.m24437(this.f37398, 0, this.f37399, interfaceC12829, null);
        }
    }

    public final Object clone() {
        float[] fArrCopyOf;
        float[] fArr = this.f37398;
        int i = this.f37399;
        if (i == 0) {
            fArrCopyOf = C9571.f32283;
        } else {
            fArrCopyOf = Arrays.copyOf(fArr, i);
        }
        C10982 c10982 = new C10982(fArrCopyOf);
        c10982.f37399 = this.f37399;
        return c10982;
    }

    @Override // l.AbstractC20859, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C10982) {
            C10982 c10982 = (C10982) obj;
            if (c10982 != this) {
                int i = this.f37399;
                int i2 = c10982.f37399;
                if (i == i2) {
                    float[] fArr = this.f37398;
                    float[] fArr2 = c10982.f37398;
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
        if (obj instanceof C6042) {
            return ((C6042) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC20859
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C10982) {
            C10982 c10982 = (C10982) list;
            int i = this.f37399;
            int i2 = c10982.f37399;
            float[] fArr = this.f37398;
            float[] fArr2 = c10982.f37398;
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
        if (list instanceof C6042) {
            return -((C6042) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f37398;
        for (int i = 0; i < this.f37399; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f37399];
        this.f37398 = fArr;
        for (int i = 0; i < this.f37399; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
