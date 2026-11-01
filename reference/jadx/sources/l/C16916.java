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
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ܽ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16916 extends AbstractC23785 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient long[] f54097;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54098;

    @Override // l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C16916(int i) {
        this.f54097 = new long[100];
    }

    public C16916() {
        this.f54097 = C11272.f38093;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m39600(int i) {
        long[] jArr = this.f54097;
        if (i <= jArr.length) {
            return;
        }
        if (jArr != C11272.f38093) {
            i = (int) Math.max(Math.min(((long) jArr.length) + ((long) (jArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        long[] jArr2 = new long[i];
        System.arraycopy(this.f54097, 0, jArr2, 0, this.f54098);
        this.f54097 = jArr2;
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ */
    public final void mo27937(int i, long j) {
        m52322(i);
        m39600(this.f54098 + 1);
        int i2 = this.f54098;
        if (i != i2) {
            long[] jArr = this.f54097;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.f54097[i] = j;
        this.f54098++;
    }

    @Override // l.AbstractC20257, l.InterfaceC14800
    public final boolean add(long j) {
        m39600(this.f54098 + 1);
        long[] jArr = this.f54097;
        int i = this.f54098;
        this.f54098 = i + 1;
        jArr[i] = j;
        return true;
    }

    @Override // l.InterfaceC21750
    public final long getLong(int i) {
        if (i < this.f54098) {
            return this.f54097[i];
        }
        throw new IndexOutOfBoundsException(C12441.m30911(this.f54098, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC23785, l.InterfaceC21750
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo39601(long j) {
        long[] jArr = this.f54097;
        for (int i = 0; i < this.f54098; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC23785, l.InterfaceC21750
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo39604(long j) {
        long[] jArr = this.f54097;
        int i = this.f54098;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (j == jArr[i2]) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ */
    public final void mo27938(long[] jArr, int i, int i2, int i3) {
        C7000.m18807(jArr.length, i2, i3);
        System.arraycopy(this.f54097, i, jArr, i2, i3);
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۨ */
    public final long mo27941(int i) {
        int i2 = this.f54098;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f54098, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f54097;
        long j = jArr[i];
        int i3 = i2 - 1;
        this.f54098 = i3;
        if (i != i3) {
            System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
        }
        return j;
    }

    @Override // l.InterfaceC14800
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo21796(long j) {
        int iMo39601 = mo39601(j);
        if (iMo39601 == -1) {
            return false;
        }
        mo27941(iMo39601);
        return true;
    }

    @Override // l.InterfaceC21750
    public final long set(int i, long j) {
        if (i >= this.f54098) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f54098, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f54097;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // l.AbstractC23785, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f54098 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54098;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f54098) {
            return this;
        }
        m52322(i);
        m52322(i2);
        if (i <= i2) {
            return new C0687(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f54098 == 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m39602() {
        int i;
        long[] jArr = this.f54097;
        if (jArr.length <= 0 || (i = this.f54098) == jArr.length) {
            return;
        }
        long[] jArr2 = new long[Math.max(0, i)];
        System.arraycopy(this.f54097, 0, jArr2, 0, this.f54098);
        this.f54097 = jArr2;
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ */
    public final void mo27935(int i, int i2) {
        C7000.m18804(this.f54098, i, i2);
        long[] jArr = this.f54097;
        System.arraycopy(jArr, i2, jArr, i, this.f54098 - i2);
        this.f54098 -= i2 - i;
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ */
    public final void mo27936(int i, int i2, long[] jArr) {
        m52322(i);
        C7000.m18807(jArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f54098) {
            System.arraycopy(jArr, 0, this.f54097, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f54098, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC23785, l.AbstractC20257, l.InterfaceC5522
    public final void forEach(LongConsumer longConsumer) {
        long[] jArr = this.f54097;
        for (int i = 0; i < this.f54098; i++) {
            longConsumer.accept(jArr[i]);
        }
    }

    @Override // l.AbstractC23785
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27939(int i, InterfaceC14800 interfaceC14800) {
        if (interfaceC14800 instanceof InterfaceC21750) {
            return mo27940(i, (InterfaceC21750) interfaceC14800);
        }
        m52322(i);
        int size = interfaceC14800.size();
        if (size == 0) {
            return false;
        }
        m39600(this.f54098 + size);
        long[] jArr = this.f54097;
        System.arraycopy(jArr, i, jArr, i + size, this.f54098 - i);
        InterfaceC1288 it = interfaceC14800.iterator();
        this.f54098 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f54097[i] = it.nextLong();
            size = i2;
            i++;
        }
    }

    @Override // l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27940(int i, InterfaceC21750 interfaceC21750) {
        m52322(i);
        int size = interfaceC21750.size();
        if (size == 0) {
            return false;
        }
        m39600(this.f54098 + size);
        long[] jArr = this.f54097;
        System.arraycopy(jArr, i, jArr, i + size, this.f54098 - i);
        interfaceC21750.mo27938(this.f54097, 0, i, size);
        this.f54098 += size;
        return true;
    }

    @Override // l.AbstractC20257
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo6643(InterfaceC14800 interfaceC14800) {
        int i;
        long[] jArr = this.f54097;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f54098;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC14800.mo6642(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f54098 = i3;
        return z;
    }

    @Override // l.AbstractC20257, l.InterfaceC14800
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6640(LongPredicate longPredicate) {
        int i;
        long[] jArr = this.f54097;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f54098;
            if (i2 >= i) {
                break;
            }
            if (!longPredicate.test(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f54098 = i3;
        return z;
    }

    @Override // l.AbstractC23785, java.util.List
    public final InterfaceC18222 listIterator(int i) {
        m52322(i);
        return new C7744(this, i);
    }

    @Override // l.AbstractC23785, l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C21149(this);
    }

    @Override // l.AbstractC23785, l.InterfaceC21750
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39603(InterfaceC4816 interfaceC4816) {
        if (interfaceC4816 == null) {
            C11272.m28247(this.f54098, this.f54097);
        } else {
            C11272.m28249(this.f54097, 0, this.f54098, interfaceC4816, (long[]) null);
        }
    }

    @Override // l.AbstractC23785, l.InterfaceC21750
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39605(InterfaceC4816 interfaceC4816) {
        if (interfaceC4816 == null) {
            C11272.m28247(this.f54098, this.f54097);
        } else {
            C11272.m28248(this.f54097, 0, this.f54098, interfaceC4816);
        }
    }

    public final Object clone() {
        long[] jArrCopyOf;
        long[] jArr = this.f54097;
        int i = this.f54098;
        if (i == 0) {
            jArrCopyOf = C11272.f38094;
        } else {
            jArrCopyOf = Arrays.copyOf(jArr, i);
        }
        C16916 c16916 = new C16916();
        c16916.f54097 = jArrCopyOf;
        c16916.f54098 = this.f54098;
        return c16916;
    }

    @Override // l.AbstractC23785, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C16916) {
            C16916 c16916 = (C16916) obj;
            if (c16916 != this) {
                int i = this.f54098;
                int i2 = c16916.f54098;
                if (i == i2) {
                    long[] jArr = this.f54097;
                    long[] jArr2 = c16916.f54097;
                    if (jArr != jArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (jArr[i3] == jArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C0687) {
            return ((C0687) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC23785
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C16916) {
            C16916 c16916 = (C16916) list;
            int i = this.f54098;
            int i2 = c16916.f54098;
            long[] jArr = this.f54097;
            long[] jArr2 = c16916.f54097;
            if (jArr != jArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Long.compare(jArr[i3], jArr2[i3]);
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
        if (list instanceof C0687) {
            return -((C0687) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f54097;
        for (int i = 0; i < this.f54098; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f54098];
        this.f54097 = jArr;
        for (int i = 0; i < this.f54098; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
