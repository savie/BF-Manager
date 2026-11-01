package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes3.dex */
public final class C3446 extends AbstractC22477 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f12679;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12680;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f12681;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC22685 f12682;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient int f12683;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f12684;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient int f12685;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f12686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient Object[] f12687;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient long[] f12688;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f12689;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final transient int f12690;

    public C3446() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C3446(InterfaceC22685 interfaceC22685) {
        this.f12679 = -1;
        this.f12684 = -1;
        this.f12682 = interfaceC22685;
        this.f12689 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f12685 = iM25124;
        this.f12690 = iM25124;
        this.f12681 = iM25124 - 1;
        this.f12683 = C9927.m25131(0.75f, iM25124);
        int i = this.f12685 + 1;
        this.f12687 = new Object[i];
        this.f12688 = new long[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f12689;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, collection.size());
            if (iM25124 > this.f12685) {
                m10152(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((collection.size() + this.f12680) / f))));
            if (iMin > this.f12685) {
                m10152(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        Object obj2;
        if (this.f12682.mo3247(obj, null)) {
            if (this.f12686) {
                return false;
            }
            i = this.f12685;
            this.f12686 = true;
            this.f12687[i] = obj;
        } else {
            Object[] objArr = this.f12687;
            int iM25125 = C9927.m25125(this.f12682.mo3246(obj)) & this.f12681;
            Object obj3 = objArr[iM25125];
            if (obj3 != null) {
                if (this.f12682.mo3247(obj3, obj)) {
                    return false;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f12681;
                    obj2 = objArr[iM25125];
                    if (obj2 != null) {
                    }
                } while (!this.f12682.mo3247(obj2, obj));
                return false;
            }
            objArr[iM25125] = obj;
            i = iM25125;
        }
        int i2 = this.f12680;
        if (i2 == 0) {
            this.f12684 = i;
            this.f12679 = i;
            this.f12688[i] = -1;
        } else {
            long[] jArr = this.f12688;
            int i3 = this.f12684;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) i) & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((((long) i3) & 4294967295L) << 32) | 4294967295L;
            this.f12684 = i;
        }
        this.f12680 = i2 + 1;
        if (i2 >= this.f12683) {
            m10152(C9927.m25124(this.f12689, i2 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m10154(int i) {
        Object obj;
        Object[] objArr = this.f12687;
        while (true) {
            int i2 = (i + 1) & this.f12681;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM25125 = C9927.m25125(this.f12682.mo3246(obj));
                int i3 = this.f12681;
                int i4 = iM25125 & i3;
                if (i > i2) {
                    if (i >= i4 && i4 > i2) {
                        break;
                    } else {
                        i2 = (i2 + 1) & i3;
                    }
                } else if (i >= i4 || i4 > i2) {
                    break;
                } else {
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr[i] = obj;
            m10155(i2, i);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m10151(int i) {
        this.f12680--;
        m10153(i);
        m10154(i);
        int i2 = this.f12685;
        if (i2 <= this.f12690 || this.f12680 >= this.f12683 / 4 || i2 <= 16) {
            return;
        }
        m10152(i2 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f12682.mo3247(obj, null)) {
            if (this.f12686) {
                this.f12686 = false;
                Object[] objArr = this.f12687;
                int i = this.f12685;
                objArr[i] = null;
                this.f12680--;
                m10153(i);
                int i2 = this.f12685;
                if (i2 > this.f12690 && this.f12680 < this.f12683 / 4 && i2 > 16) {
                    m10152(i2 / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f12687;
            int iM25125 = C9927.m25125(this.f12682.mo3246(obj)) & this.f12681;
            Object obj3 = objArr2[iM25125];
            if (obj3 != null) {
                if (this.f12682.mo3247(obj, obj3)) {
                    m10151(iM25125);
                    return true;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f12681;
                    obj2 = objArr2[iM25125];
                    if (obj2 == null) {
                    }
                } while (!this.f12682.mo3247(obj, obj2));
                m10151(iM25125);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f12682.mo3247(obj, null)) {
            return this.f12686;
        }
        Object[] objArr = this.f12687;
        int iM25125 = C9927.m25125(this.f12682.mo3246(obj)) & this.f12681;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (!this.f12682.mo3247(obj, obj3)) {
            do {
                iM25125 = (iM25125 + 1) & this.f12681;
                obj2 = objArr[iM25125];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f12682.mo3247(obj, obj2));
        }
        return true;
    }

    public final Object removeFirst() {
        int i = this.f12680;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f12679;
        if (i == 1) {
            this.f12684 = -1;
            this.f12679 = -1;
        } else {
            long[] jArr = this.f12688;
            int i3 = (int) jArr[i2];
            this.f12679 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
        }
        Object obj = this.f12687[i2];
        this.f12680 = i - 1;
        if (this.f12682.mo3247(obj, null)) {
            this.f12686 = false;
            this.f12687[this.f12685] = null;
        } else {
            m10154(i2);
        }
        int i4 = this.f12685;
        if (i4 > this.f12690 && this.f12680 < this.f12683 / 4 && i4 > 16) {
            m10152(i4 / 2);
        }
        return obj;
    }

    public final Object removeLast() {
        int i = this.f12680;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f12684;
        if (i == 1) {
            this.f12684 = -1;
            this.f12679 = -1;
        } else {
            long[] jArr = this.f12688;
            int i3 = (int) (jArr[i2] >>> 32);
            this.f12684 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | 4294967295L;
            }
        }
        Object obj = this.f12687[i2];
        this.f12680 = i - 1;
        if (this.f12682.mo3247(obj, null)) {
            this.f12686 = false;
            this.f12687[this.f12685] = null;
        } else {
            m10154(i2);
        }
        int i4 = this.f12685;
        if (i4 > this.f12690 && this.f12680 < this.f12683 / 4 && i4 > 16) {
            m10152(i4 / 2);
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12680 == 0) {
            return;
        }
        this.f12680 = 0;
        this.f12686 = false;
        Arrays.fill(this.f12687, (Object) null);
        this.f12684 = -1;
        this.f12679 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12680;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12680 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10153(int i) {
        if (this.f12680 == 0) {
            this.f12684 = -1;
            this.f12679 = -1;
            return;
        }
        if (this.f12679 == i) {
            long[] jArr = this.f12688;
            int i2 = (int) jArr[i];
            this.f12679 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f12684 == i) {
            long[] jArr2 = this.f12688;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f12684 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f12688;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10155(int i, int i2) {
        if (this.f12680 == 1) {
            this.f12684 = i2;
            this.f12679 = i2;
            this.f12688[i2] = -1;
            return;
        }
        if (this.f12679 == i) {
            this.f12679 = i2;
            long[] jArr = this.f12688;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f12684 == i) {
            this.f12684 = i2;
            long[] jArr2 = this.f12688;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f12688;
        long j3 = jArr3[i];
        int i5 = (int) (j3 >>> 32);
        int i6 = (int) j3;
        long j4 = jArr3[i5];
        long j5 = ((long) i2) & 4294967295L;
        jArr3[i5] = ((j4 ^ j5) & 4294967295L) ^ j4;
        long j6 = jArr3[i6];
        jArr3[i6] = ((-4294967296L) & ((j5 << 32) ^ j6)) ^ j6;
        jArr3[i2] = j3;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (this.f12680 == 0) {
            throw new NoSuchElementException();
        }
        return this.f12687[this.f12679];
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (this.f12680 == 0) {
            throw new NoSuchElementException();
        }
        return this.f12687[this.f12684];
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C9798 c9798 = new C9798(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f12680;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c9798.next());
            i = i2;
        }
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C9798(this);
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C9798(this);
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C9798(this);
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C17249(new C9798(this), C17745.m41307(this), 81);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        int i = this.f12679;
        while (i != -1) {
            int i2 = (int) this.f12688[i];
            consumer.accept(this.f12687[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m10152(int i) {
        int i2;
        Object[] objArr = this.f12687;
        int i3 = i - 1;
        int i4 = i + 1;
        Object[] objArr2 = new Object[i4];
        int i5 = this.f12679;
        long[] jArr = this.f12688;
        long[] jArr2 = new long[i4];
        this.f12679 = -1;
        int i6 = this.f12680;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            if (!this.f12682.mo3247(objArr[i5], null)) {
                int iM25125 = C9927.m25125(this.f12682.mo3246(objArr[i5]));
                while (true) {
                    i2 = iM25125 & i3;
                    if (objArr2[i2] == null) {
                        break;
                    } else {
                        iM25125 = i2 + 1;
                    }
                }
            } else {
                i2 = i;
            }
            objArr2[i2] = objArr[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                jArr2[i7] = (((((long) i2) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i2];
                jArr2[i2] = j2 ^ ((((((long) i7) & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                this.f12679 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f12688 = jArr2;
        this.f12684 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f12685 = i;
        this.f12681 = i3;
        this.f12683 = C9927.m25131(this.f12689, i);
        this.f12687 = objArr2;
    }

    public final Object clone() {
        try {
            C3446 c3446 = (C3446) super.clone();
            c3446.f12687 = (Object[]) this.f12687.clone();
            c3446.f12686 = this.f12686;
            c3446.f12688 = (long[]) this.f12688.clone();
            c3446.f12682 = this.f12682;
            return c3446;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC5543, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f12687;
        int i = this.f12686 ? this.f12680 - 1 : this.f12680;
        int iMo3246 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iMo3246;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iMo3246 = this.f12682.mo3246(obj) + iMo3246;
            }
            i2++;
            i = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM25125;
        objectInputStream.defaultReadObject();
        int i = this.f12680;
        float f = this.f12689;
        int iM25124 = C9927.m25124(f, i);
        this.f12685 = iM25124;
        this.f12683 = C9927.m25131(f, iM25124);
        int i2 = this.f12685;
        this.f12681 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f12687 = objArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f12688 = jArr;
        int i3 = -1;
        this.f12684 = -1;
        this.f12679 = -1;
        int i4 = this.f12680;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            Object object = objectInputStream.readObject();
            if (this.f12682.mo3247(object, null)) {
                iM25125 = this.f12685;
                this.f12686 = r3;
            } else {
                iM25125 = C9927.m25125(this.f12682.mo3246(object)) & this.f12681;
                if (objArr[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + r3) & this.f12681;
                    } while (objArr[iM25125] != null);
                }
            }
            objArr[iM25125] = object;
            if (this.f12679 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM25125) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM25125];
                jArr[iM25125] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f12679 = iM25125;
                jArr[iM25125] = jArr[iM25125] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM25125;
            r3 = 1;
            i3 = -1;
        }
        this.f12684 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
