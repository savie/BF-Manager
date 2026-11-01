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

/* JADX INFO: renamed from: l.ܶۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C15070 extends AbstractC10796 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient int[] f49125;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49126;

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C15070(int[] iArr) {
        this.f49125 = iArr;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m36101(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C2271.m6966(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f49125 = C8014.f26269;
        } else {
            this.f49125 = new int[i];
        }
    }

    public C15070(int i) {
        m36101(i);
    }

    public C15070() {
        this.f49125 = C8014.f26268;
    }

    public C15070(InterfaceC10609 interfaceC10609) {
        int[] iArrCopyOf;
        if (interfaceC10609 instanceof C15070) {
            C15070 c15070 = (C15070) interfaceC10609;
            int[] iArr = c15070.f49125;
            int i = c15070.f49126;
            if (i == 0) {
                iArrCopyOf = C8014.f26269;
            } else {
                iArrCopyOf = Arrays.copyOf(iArr, i);
            }
            this.f49125 = iArrCopyOf;
            this.f49126 = iArrCopyOf.length;
            return;
        }
        m36101(interfaceC10609.size());
        int[] iArr2 = this.f49125;
        int size = interfaceC10609.size();
        this.f49126 = size;
        interfaceC10609.mo3167(0, 0, size, iArr2);
    }

    public C15070(int[] iArr, int i) {
        this(34);
        System.arraycopy(iArr, 1, this.f49125, 0, 34);
        this.f49126 = 34;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15070 m36102(int[] iArr) {
        int length = iArr.length;
        if (length > iArr.length) {
            throw new IllegalArgumentException(C12441.m30911(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(length, "The specified length (", ") is greater than the array size (")));
        }
        C15070 c15070 = new C15070(iArr);
        c15070.f49126 = length;
        return c15070;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m36103(int i) {
        int[] iArr = this.f49125;
        if (i <= iArr.length) {
            return;
        }
        if (iArr != C8014.f26268) {
            i = (int) Math.max(Math.min(((long) iArr.length) + ((long) (iArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(this.f49125, 0, iArr2, 0, this.f49126);
        this.f49125 = iArr2;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final void add(int i, int i2) {
        m27091(i);
        m36103(this.f49126 + 1);
        int i3 = this.f49126;
        if (i != i3) {
            int[] iArr = this.f49125;
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.f49125[i] = i2;
        this.f49126++;
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        m36103(this.f49126 + 1);
        int[] iArr = this.f49125;
        int i2 = this.f49126;
        this.f49126 = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // l.InterfaceC10609
    public final int getInt(int i) {
        if (i < this.f49126) {
            return this.f49125[i];
        }
        throw new IndexOutOfBoundsException(C12441.m30911(this.f49126, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int indexOf(int i) {
        int[] iArr = this.f49125;
        for (int i2 = 0; i2 < this.f49126; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int lastIndexOf(int i) {
        int[] iArr = this.f49125;
        int i2 = this.f49126;
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

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        C7000.m18807(iArr.length, i2, i3);
        System.arraycopy(this.f49125, i, iArr, i2, i3);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3180(int i) {
        int i2 = this.f49126;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f49126, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f49125;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.f49126 = i4;
        if (i != i4) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        }
        return i3;
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo3182(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        mo3180(iIndexOf);
        return true;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    public final int set(int i, int i2) {
        if (i >= this.f49126) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f49126, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f49125;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // l.AbstractC10796, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f49126 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49126;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        if (i == 0 && i2 == this.f49126) {
            return this;
        }
        m27091(i);
        m27091(i2);
        if (i <= i2) {
            return new C22831(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f49126 == 0;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3166(int i, int i2) {
        C7000.m18804(this.f49126, i, i2);
        int[] iArr = this.f49125;
        System.arraycopy(iArr, i2, iArr, i, this.f49126 - i2);
        this.f49126 -= i2 - i;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3177(int i, int i2, int[] iArr) {
        m27091(i);
        C7000.m18807(iArr.length, 0, i2);
        m36103(this.f49126 + i2);
        int[] iArr2 = this.f49125;
        System.arraycopy(iArr2, i, iArr2, i + i2, this.f49126 - i);
        System.arraycopy(iArr, 0, this.f49125, i, i2);
        this.f49126 += i2;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3168(int i, int i2, int[] iArr) {
        m27091(i);
        C7000.m18807(iArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f49126) {
            System.arraycopy(iArr, 0, this.f49125, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f49126, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC10796, l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f49125;
        for (int i = 0; i < this.f49126; i++) {
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // l.AbstractC10796
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3170(int i, InterfaceC10131 interfaceC10131) {
        if (interfaceC10131 instanceof InterfaceC10609) {
            return m36104(i, (InterfaceC10609) interfaceC10131);
        }
        m27091(i);
        int size = interfaceC10131.size();
        if (size == 0) {
            return false;
        }
        m36103(this.f49126 + size);
        int[] iArr = this.f49125;
        System.arraycopy(iArr, i, iArr, i + size, this.f49126 - i);
        InterfaceC13431 it = interfaceC10131.iterator();
        this.f49126 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f49125[i] = it.nextInt();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36104(int i, InterfaceC10609 interfaceC10609) {
        m27091(i);
        int size = interfaceC10609.size();
        if (size == 0) {
            return false;
        }
        m36103(this.f49126 + size);
        int[] iArr = this.f49125;
        System.arraycopy(iArr, i, iArr, i + size, this.f49126 - i);
        interfaceC10609.mo3167(0, i, size, this.f49125);
        this.f49126 += size;
        return true;
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo3176(InterfaceC10131 interfaceC10131) {
        int i;
        int[] iArr = this.f49125;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f49126;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC10131.contains(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f49126 = i3;
        return z;
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3171(IntPredicate intPredicate) {
        int i;
        int[] iArr = this.f49125;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f49126;
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
        this.f49126 = i3;
        return z;
    }

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator(int i) {
        m27091(i);
        return new C0957(i, this);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C12953(this);
    }

    @Override // l.AbstractC10796, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C12953(this);
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ */
    public final void mo3174(InterfaceC16481 interfaceC16481) {
        if (interfaceC16481 == null) {
            C8014.m21114(this.f49126, this.f49125);
        } else {
            C8014.m21116(this.f49125, 0, this.f49126, interfaceC16481, (int[]) null);
        }
    }

    @Override // l.AbstractC10796, l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3178(InterfaceC16481 interfaceC16481) {
        if (interfaceC16481 == null) {
            C8014.m21114(this.f49126, this.f49125);
        } else {
            C8014.m21115(this.f49125, 0, this.f49126, interfaceC16481);
        }
    }

    public final Object clone() {
        int[] iArrCopyOf;
        int[] iArr = this.f49125;
        int i = this.f49126;
        if (i == 0) {
            iArrCopyOf = C8014.f26269;
        } else {
            iArrCopyOf = Arrays.copyOf(iArr, i);
        }
        C15070 c15070 = new C15070(iArrCopyOf);
        c15070.f49126 = this.f49126;
        return c15070;
    }

    @Override // l.AbstractC10796, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C15070) {
            C15070 c15070 = (C15070) obj;
            if (c15070 != this) {
                int i = this.f49126;
                int i2 = c15070.f49126;
                if (i == i2) {
                    int[] iArr = this.f49125;
                    int[] iArr2 = c15070.f49125;
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
        if (obj instanceof C22831) {
            return ((C22831) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC10796, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C15070) {
            C15070 c15070 = (C15070) list;
            int i = this.f49126;
            int i2 = c15070.f49126;
            int[] iArr = this.f49125;
            int[] iArr2 = c15070.f49125;
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
        if (list instanceof C22831) {
            return -((C22831) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f49125;
        for (int i = 0; i < this.f49126; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f49126];
        this.f49125 = iArr;
        for (int i = 0; i < this.f49126; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
