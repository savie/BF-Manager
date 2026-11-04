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

/* JADX INFO: renamed from: l.᩷ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes2.dex */
public final class C21982 extends AbstractC13294 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient long[] f70927;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70928;

    @Override // l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C21982(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f70927 = C15268.f49916;
        } else {
            this.f70927 = new long[i];
        }
    }

    public C21982() {
        this.f70927 = C15268.f49915;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49718(int i) {
        long[] jArr = this.f70927;
        if (i <= jArr.length) {
            return;
        }
        if (jArr != C15268.f49915) {
            i = (int) Math.max(Math.min(((long) jArr.length) + ((long) (jArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        long[] jArr2 = new long[i];
        System.arraycopy(this.f70927, 0, jArr2, 0, this.f70928);
        this.f70927 = jArr2;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ */
    public final void mo37193(int i, long j) {
        m32831(i);
        m49718(this.f70928 + 1);
        int i2 = this.f70928;
        if (i != i2) {
            long[] jArr = this.f70927;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.f70927[i] = j;
        this.f70928++;
    }

    @Override // l.AbstractC13711, l.InterfaceC5574
    public final boolean add(long j) {
        m49718(this.f70928 + 1);
        long[] jArr = this.f70927;
        int i = this.f70928;
        this.f70928 = i + 1;
        jArr[i] = j;
        return true;
    }

    @Override // l.InterfaceC18252
    public final long getLong(int i) {
        if (i < this.f70928) {
            return this.f70927[i];
        }
        throw new IndexOutOfBoundsException(C12669.m31437(this.f70928, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC13294, l.InterfaceC18252
    /* JADX INFO: renamed from: ۫ */
    public final int mo32834(long j) {
        long[] jArr = this.f70927;
        for (int i = 0; i < this.f70928; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ */
    public final void mo37194(long[] jArr, int i, int i2, int i3) {
        C18450.m42990(jArr.length, i2, i3);
        System.arraycopy(this.f70927, i, jArr, i2, i3);
    }

    @Override // l.AbstractC13294, l.InterfaceC18252
    /* JADX INFO: renamed from: ᩷ */
    public final int mo32836(long j) {
        long[] jArr = this.f70927;
        int i = this.f70928;
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

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۤ */
    public final long mo37196(int i) {
        int i2 = this.f70928;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f70928, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f70927;
        long j = jArr[i];
        int i3 = i2 - 1;
        this.f70928 = i3;
        if (i != i3) {
            System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
        }
        return j;
    }

    @Override // l.InterfaceC5574
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16517(long j) {
        int iMo32834 = mo32834(j);
        if (iMo32834 == -1) {
            return false;
        }
        mo37196(iMo32834);
        return true;
    }

    @Override // l.InterfaceC18252
    public final long set(int i, long j) {
        if (i >= this.f70928) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f70928, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f70927;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // l.AbstractC13294, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f70928 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f70928;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f70928) {
            return this;
        }
        m32831(i);
        m32831(i2);
        if (i <= i2) {
            return new C4828(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f70928 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49717() {
        int i;
        long[] jArr = this.f70927;
        if (jArr.length <= 0 || (i = this.f70928) == jArr.length) {
            return;
        }
        long[] jArr2 = new long[Math.max(0, i)];
        System.arraycopy(this.f70927, 0, jArr2, 0, this.f70928);
        this.f70927 = jArr2;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ */
    public final void mo37191(int i, int i2) {
        C18450.m42985(this.f70928, i, i2);
        long[] jArr = this.f70927;
        System.arraycopy(jArr, i2, jArr, i, this.f70928 - i2);
        this.f70928 -= i2 - i;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ */
    public final void mo37192(int i, int i2, long[] jArr) {
        m32831(i);
        C18450.m42990(jArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f70928) {
            System.arraycopy(jArr, 0, this.f70927, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f70928, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC13294, l.AbstractC13711, l.InterfaceC3336
    public final void forEach(LongConsumer longConsumer) {
        long[] jArr = this.f70927;
        for (int i = 0; i < this.f70928; i++) {
            longConsumer.accept(jArr[i]);
        }
    }

    @Override // l.AbstractC13294
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32833(int i, InterfaceC5574 interfaceC5574) {
        if (interfaceC5574 instanceof InterfaceC18252) {
            return mo37195(i, (InterfaceC18252) interfaceC5574);
        }
        m32831(i);
        int size = interfaceC5574.size();
        if (size == 0) {
            return false;
        }
        m49718(this.f70928 + size);
        long[] jArr = this.f70927;
        System.arraycopy(jArr, i, jArr, i + size, this.f70928 - i);
        InterfaceC12285 it = interfaceC5574.iterator();
        this.f70928 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f70927[i] = it.nextLong();
            size = i2;
            i++;
        }
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37195(int i, InterfaceC18252 interfaceC18252) {
        m32831(i);
        int size = interfaceC18252.size();
        if (size == 0) {
            return false;
        }
        m49718(this.f70928 + size);
        long[] jArr = this.f70927;
        System.arraycopy(jArr, i, jArr, i + size, this.f70928 - i);
        interfaceC18252.mo37194(this.f70927, 0, i, size);
        this.f70928 += size;
        return true;
    }

    @Override // l.AbstractC13711
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6351(InterfaceC5574 interfaceC5574) {
        int i;
        long[] jArr = this.f70927;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f70928;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC5574.mo6352(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f70928 = i3;
        return z;
    }

    @Override // l.AbstractC13711, l.InterfaceC5574
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6349(LongPredicate longPredicate) {
        int i;
        long[] jArr = this.f70927;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f70928;
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
        this.f70928 = i3;
        return z;
    }

    @Override // l.AbstractC13294, java.util.List
    public final InterfaceC0353 listIterator(int i) {
        m32831(i);
        return new C2853(this, i);
    }

    @Override // l.AbstractC13294, l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C8819(this);
    }

    @Override // l.AbstractC13294, l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ */
    public final void mo32832(InterfaceC16760 interfaceC16760) {
        if (interfaceC16760 == null) {
            C15268.m36632(this.f70928, this.f70927);
        } else {
            C15268.m36634(this.f70927, 0, this.f70928, interfaceC16760, (long[]) null);
        }
    }

    @Override // l.AbstractC13294, l.InterfaceC18252
    /* JADX INFO: renamed from: ᩷ */
    public final void mo32837(InterfaceC16760 interfaceC16760) {
        if (interfaceC16760 == null) {
            C15268.m36632(this.f70928, this.f70927);
        } else {
            C15268.m36633(this.f70927, 0, this.f70928, interfaceC16760);
        }
    }

    public final Object clone() {
        long[] jArrCopyOf;
        long[] jArr = this.f70927;
        int i = this.f70928;
        if (i == 0) {
            jArrCopyOf = C15268.f49916;
        } else {
            jArrCopyOf = Arrays.copyOf(jArr, i);
        }
        C21982 c21982 = new C21982();
        c21982.f70927 = jArrCopyOf;
        c21982.f70928 = this.f70928;
        return c21982;
    }

    @Override // l.AbstractC13294, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C21982) {
            C21982 c21982 = (C21982) obj;
            if (c21982 != this) {
                int i = this.f70928;
                int i2 = c21982.f70928;
                if (i == i2) {
                    long[] jArr = this.f70927;
                    long[] jArr2 = c21982.f70927;
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
        if (obj instanceof C4828) {
            return ((C4828) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC13294
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C21982) {
            C21982 c21982 = (C21982) list;
            int i = this.f70928;
            int i2 = c21982.f70928;
            long[] jArr = this.f70927;
            long[] jArr2 = c21982.f70927;
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
        if (list instanceof C4828) {
            return -((C4828) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f70927;
        for (int i = 0; i < this.f70928; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f70928];
        this.f70927 = jArr;
        for (int i = 0; i < this.f70928; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
