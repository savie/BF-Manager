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
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ܰܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C14763 extends AbstractC15685 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient int[] f48233;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48234;

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C14763(int[] iArr) {
        this.f48233 = iArr;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m35500(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f48233 = C8052.f26680;
        } else {
            this.f48233 = new int[i];
        }
    }

    public C14763(int i) {
        m35500(i);
    }

    public C14763() {
        this.f48233 = C8052.f26679;
    }

    public C14763(InterfaceC9018 interfaceC9018) {
        int[] iArrCopyOf;
        if (interfaceC9018 instanceof C14763) {
            C14763 c14763 = (C14763) interfaceC9018;
            int[] iArr = c14763.f48233;
            int i = c14763.f48234;
            if (i == 0) {
                iArrCopyOf = C8052.f26680;
            } else {
                iArrCopyOf = Arrays.copyOf(iArr, i);
            }
            this.f48233 = iArrCopyOf;
            this.f48234 = iArrCopyOf.length;
            return;
        }
        m35500(interfaceC9018.size());
        int[] iArr2 = this.f48233;
        int size = interfaceC9018.size();
        this.f48234 = size;
        interfaceC9018.mo14688(0, 0, size, iArr2);
    }

    public C14763(int[] iArr, int i) {
        this(34);
        System.arraycopy(iArr, 1, this.f48233, 0, 34);
        this.f48234 = 34;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14763 m35499(int[] iArr) {
        int length = iArr.length;
        if (length > iArr.length) {
            throw new IllegalArgumentException(C12669.m31437(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(length, "The specified length (", ") is greater than the array size (")));
        }
        C14763 c14763 = new C14763(iArr);
        c14763.f48234 = length;
        return c14763;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35502(int i) {
        int[] iArr = this.f48233;
        if (i <= iArr.length) {
            return;
        }
        if (iArr != C8052.f26679) {
            i = (int) Math.max(Math.min(((long) iArr.length) + ((long) (iArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(this.f48233, 0, iArr2, 0, this.f48234);
        this.f48233 = iArr2;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final void add(int i, int i2) {
        m37462(i);
        m35502(this.f48234 + 1);
        int i3 = this.f48234;
        if (i != i3) {
            int[] iArr = this.f48233;
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.f48233[i] = i2;
        this.f48234++;
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        m35502(this.f48234 + 1);
        int[] iArr = this.f48233;
        int i2 = this.f48234;
        this.f48234 = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // l.InterfaceC9018
    public final int getInt(int i) {
        if (i < this.f48234) {
            return this.f48233[i];
        }
        throw new IndexOutOfBoundsException(C12669.m31437(this.f48234, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int indexOf(int i) {
        int[] iArr = this.f48233;
        for (int i2 = 0; i2 < this.f48234; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        C18450.m42990(iArr.length, i2, i3);
        System.arraycopy(this.f48233, i, iArr, i2, i3);
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int lastIndexOf(int i) {
        int[] iArr = this.f48233;
        int i2 = this.f48234;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            if (i == iArr[i3]) {
                return i3;
            }
            i2 = i3;
        }
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ܶ */
    public final int mo14697(int i) {
        int i2 = this.f48234;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f48234, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f48233;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.f48234 = i4;
        if (i != i4) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        }
        return i3;
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4933(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        mo14697(iIndexOf);
        return true;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    public final int set(int i, int i2) {
        if (i >= this.f48234) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f48234, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f48233;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // l.AbstractC15685, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f48234 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48234;
    }

    @Override // l.AbstractC15685, l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        if (i == 0 && i2 == this.f48234) {
            return this;
        }
        m37462(i);
        m37462(i2);
        if (i <= i2) {
            return new C4323(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f48234 == 0;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14687(int i, int i2) {
        C18450.m42985(this.f48234, i, i2);
        int[] iArr = this.f48233;
        System.arraycopy(iArr, i2, iArr, i, this.f48234 - i2);
        this.f48234 -= i2 - i;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14698(int i, int i2, int[] iArr) {
        m37462(i);
        C18450.m42990(iArr.length, 0, i2);
        m35502(this.f48234 + i2);
        int[] iArr2 = this.f48233;
        System.arraycopy(iArr2, i, iArr2, i + i2, this.f48234 - i);
        System.arraycopy(iArr, 0, this.f48233, i, i2);
        this.f48234 += i2;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14689(int i, int i2, int[] iArr) {
        m37462(i);
        C18450.m42990(iArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f48234) {
            System.arraycopy(iArr, 0, this.f48233, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f48234, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC15685, l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f48233;
        for (int i = 0; i < this.f48234; i++) {
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // l.AbstractC15685
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14691(int i, InterfaceC1340 interfaceC1340) {
        if (interfaceC1340 instanceof InterfaceC9018) {
            return m35501(i, (InterfaceC9018) interfaceC1340);
        }
        m37462(i);
        int size = interfaceC1340.size();
        if (size == 0) {
            return false;
        }
        m35502(this.f48234 + size);
        int[] iArr = this.f48233;
        System.arraycopy(iArr, i, iArr, i + size, this.f48234 - i);
        InterfaceC6036 it = interfaceC1340.iterator();
        this.f48234 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f48233[i] = it.nextInt();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35501(int i, InterfaceC9018 interfaceC9018) {
        m37462(i);
        int size = interfaceC9018.size();
        if (size == 0) {
            return false;
        }
        m35502(this.f48234 + size);
        int[] iArr = this.f48233;
        System.arraycopy(iArr, i, iArr, i + size, this.f48234 - i);
        interfaceC9018.mo14688(0, i, size, this.f48233);
        this.f48234 += size;
        return true;
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo14696(InterfaceC1340 interfaceC1340) {
        int i;
        int[] iArr = this.f48233;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f48234;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC1340.contains(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f48234 = i3;
        return z;
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4932(IntPredicate intPredicate) {
        int i;
        int[] iArr = this.f48233;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f48234;
            if (i2 >= i) {
                break;
            }
            if (!intPredicate.test(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f48234 = i3;
        return z;
    }

    @Override // l.AbstractC15685, java.util.List
    public final InterfaceC8273 listIterator(int i) {
        m37462(i);
        return new C20731(i, this);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C12526(this);
    }

    @Override // l.AbstractC15685, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C12526(this);
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ */
    public final void mo14694(InterfaceC4544 interfaceC4544) {
        if (interfaceC4544 == null) {
            C8052.m21940(this.f48234, this.f48233);
        } else {
            C8052.m21942(this.f48233, 0, this.f48234, interfaceC4544, (int[]) null);
        }
    }

    @Override // l.AbstractC15685, l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14699(InterfaceC4544 interfaceC4544) {
        if (interfaceC4544 == null) {
            C8052.m21940(this.f48234, this.f48233);
        } else {
            C8052.m21941(this.f48233, 0, this.f48234, interfaceC4544);
        }
    }

    public final Object clone() {
        int[] iArrCopyOf;
        int[] iArr = this.f48233;
        int i = this.f48234;
        if (i == 0) {
            iArrCopyOf = C8052.f26680;
        } else {
            iArrCopyOf = Arrays.copyOf(iArr, i);
        }
        C14763 c14763 = new C14763(iArrCopyOf);
        c14763.f48234 = this.f48234;
        return c14763;
    }

    @Override // l.AbstractC15685, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C14763) {
            C14763 c14763 = (C14763) obj;
            if (c14763 != this) {
                int i = this.f48234;
                int i2 = c14763.f48234;
                if (i == i2) {
                    int[] iArr = this.f48233;
                    int[] iArr2 = c14763.f48233;
                    if (iArr != iArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (iArr[i3] == iArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C4323) {
            return ((C4323) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC15685, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C14763) {
            C14763 c14763 = (C14763) list;
            int i = this.f48234;
            int i2 = c14763.f48234;
            int[] iArr = this.f48233;
            int[] iArr2 = c14763.f48233;
            if (iArr != iArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Integer.compare(iArr[i3], iArr2[i3]);
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
        if (list instanceof C4323) {
            return -((C4323) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f48233;
        for (int i = 0; i < this.f48234; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f48234];
        this.f48233 = iArr;
        for (int i = 0; i < this.f48234; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
