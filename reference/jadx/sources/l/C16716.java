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

/* JADX INFO: renamed from: l.ܺ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16716 extends AbstractC20228 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object[] f53995;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient int f53996;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient int f53997;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC18449 f53998;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f53999;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f54000;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final transient int f54001;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f54002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f54003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f54004;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient long[] f54005;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f54006;

    public C16716() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C16716(InterfaceC18449 interfaceC18449) {
        this.f54004 = -1;
        this.f53999 = -1;
        this.f53998 = interfaceC18449;
        this.f54006 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f53997 = iM30014;
        this.f54001 = iM30014;
        this.f54002 = iM30014 - 1;
        this.f53996 = C11972.m30029(0.75f, iM30014);
        int i = this.f53997 + 1;
        this.f53995 = new Object[i];
        this.f54005 = new long[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f54006;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, collection.size());
            if (iM30014 > this.f53997) {
                m39484(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((collection.size() + this.f54000) / f))));
            if (iMin > this.f53997) {
                m39484(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        Object obj2;
        if (this.f53998.mo25786(obj, null)) {
            if (this.f54003) {
                return false;
            }
            i = this.f53997;
            this.f54003 = true;
            this.f53995[i] = obj;
        } else {
            Object[] objArr = this.f53995;
            int iM30015 = C11972.m30015(this.f53998.mo25785(obj)) & this.f54002;
            Object obj3 = objArr[iM30015];
            if (obj3 != null) {
                if (this.f53998.mo25786(obj3, obj)) {
                    return false;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f54002;
                    obj2 = objArr[iM30015];
                    if (obj2 != null) {
                    }
                } while (!this.f53998.mo25786(obj2, obj));
                return false;
            }
            objArr[iM30015] = obj;
            i = iM30015;
        }
        int i2 = this.f54000;
        if (i2 == 0) {
            this.f53999 = i;
            this.f54004 = i;
            this.f54005[i] = -1;
        } else {
            long[] jArr = this.f54005;
            int i3 = this.f53999;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) i) & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((((long) i3) & 4294967295L) << 32) | 4294967295L;
            this.f53999 = i;
        }
        this.f54000 = i2 + 1;
        if (i2 >= this.f53996) {
            m39484(C11972.m30014(this.f54006, i2 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m39482(int i) {
        Object obj;
        Object[] objArr = this.f53995;
        while (true) {
            int i2 = (i + 1) & this.f54002;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM30015 = C11972.m30015(this.f53998.mo25785(obj));
                int i3 = this.f54002;
                int i4 = iM30015 & i3;
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
            m39483(i2, i);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m39480(int i) {
        this.f54000--;
        m39481(i);
        m39482(i);
        int i2 = this.f53997;
        if (i2 <= this.f54001 || this.f54000 >= this.f53996 / 4 || i2 <= 16) {
            return;
        }
        m39484(i2 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f53998.mo25786(obj, null)) {
            if (this.f54003) {
                this.f54003 = false;
                Object[] objArr = this.f53995;
                int i = this.f53997;
                objArr[i] = null;
                this.f54000--;
                m39481(i);
                int i2 = this.f53997;
                if (i2 > this.f54001 && this.f54000 < this.f53996 / 4 && i2 > 16) {
                    m39484(i2 / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f53995;
            int iM30015 = C11972.m30015(this.f53998.mo25785(obj)) & this.f54002;
            Object obj3 = objArr2[iM30015];
            if (obj3 != null) {
                if (this.f53998.mo25786(obj, obj3)) {
                    m39480(iM30015);
                    return true;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f54002;
                    obj2 = objArr2[iM30015];
                    if (obj2 == null) {
                    }
                } while (!this.f53998.mo25786(obj, obj2));
                m39480(iM30015);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f53998.mo25786(obj, null)) {
            return this.f54003;
        }
        Object[] objArr = this.f53995;
        int iM30015 = C11972.m30015(this.f53998.mo25785(obj)) & this.f54002;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (!this.f53998.mo25786(obj, obj3)) {
            do {
                iM30015 = (iM30015 + 1) & this.f54002;
                obj2 = objArr[iM30015];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f53998.mo25786(obj, obj2));
        }
        return true;
    }

    public final Object removeFirst() {
        int i = this.f54000;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f54004;
        if (i == 1) {
            this.f53999 = -1;
            this.f54004 = -1;
        } else {
            long[] jArr = this.f54005;
            int i3 = (int) jArr[i2];
            this.f54004 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
        }
        Object obj = this.f53995[i2];
        this.f54000 = i - 1;
        if (this.f53998.mo25786(obj, null)) {
            this.f54003 = false;
            this.f53995[this.f53997] = null;
        } else {
            m39482(i2);
        }
        int i4 = this.f53997;
        if (i4 > this.f54001 && this.f54000 < this.f53996 / 4 && i4 > 16) {
            m39484(i4 / 2);
        }
        return obj;
    }

    public final Object removeLast() {
        int i = this.f54000;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f53999;
        if (i == 1) {
            this.f53999 = -1;
            this.f54004 = -1;
        } else {
            long[] jArr = this.f54005;
            int i3 = (int) (jArr[i2] >>> 32);
            this.f53999 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | 4294967295L;
            }
        }
        Object obj = this.f53995[i2];
        this.f54000 = i - 1;
        if (this.f53998.mo25786(obj, null)) {
            this.f54003 = false;
            this.f53995[this.f53997] = null;
        } else {
            m39482(i2);
        }
        int i4 = this.f53997;
        if (i4 > this.f54001 && this.f54000 < this.f53996 / 4 && i4 > 16) {
            m39484(i4 / 2);
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f54000 == 0) {
            return;
        }
        this.f54000 = 0;
        this.f54003 = false;
        Arrays.fill(this.f53995, (Object) null);
        this.f53999 = -1;
        this.f54004 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f54000;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f54000 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39481(int i) {
        if (this.f54000 == 0) {
            this.f53999 = -1;
            this.f54004 = -1;
            return;
        }
        if (this.f54004 == i) {
            long[] jArr = this.f54005;
            int i2 = (int) jArr[i];
            this.f54004 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f53999 == i) {
            long[] jArr2 = this.f54005;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f53999 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f54005;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39483(int i, int i2) {
        if (this.f54000 == 1) {
            this.f53999 = i2;
            this.f54004 = i2;
            this.f54005[i2] = -1;
            return;
        }
        if (this.f54004 == i) {
            this.f54004 = i2;
            long[] jArr = this.f54005;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f53999 == i) {
            this.f53999 = i2;
            long[] jArr2 = this.f54005;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f54005;
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
        if (this.f54000 == 0) {
            throw new NoSuchElementException();
        }
        return this.f53995[this.f54004];
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (this.f54000 == 0) {
            throw new NoSuchElementException();
        }
        return this.f53995[this.f53999];
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
        C24922 c24922 = new C24922(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f54000;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c24922.next());
            i = i2;
        }
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C24922(this);
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C24922(this);
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C24922(this);
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C22641(new C24922(this), C8008.m21873(this), 81);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        int i = this.f54004;
        while (i != -1) {
            int i2 = (int) this.f54005[i];
            consumer.accept(this.f53995[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39484(int i) {
        int i2;
        Object[] objArr = this.f53995;
        int i3 = i - 1;
        int i4 = i + 1;
        Object[] objArr2 = new Object[i4];
        int i5 = this.f54004;
        long[] jArr = this.f54005;
        long[] jArr2 = new long[i4];
        this.f54004 = -1;
        int i6 = this.f54000;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            if (!this.f53998.mo25786(objArr[i5], null)) {
                int iM30015 = C11972.m30015(this.f53998.mo25785(objArr[i5]));
                while (true) {
                    i2 = iM30015 & i3;
                    if (objArr2[i2] == null) {
                        break;
                    } else {
                        iM30015 = i2 + 1;
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
                this.f54004 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f54005 = jArr2;
        this.f53999 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f53997 = i;
        this.f54002 = i3;
        this.f53996 = C11972.m30029(this.f54006, i);
        this.f53995 = objArr2;
    }

    public final Object clone() {
        try {
            C16716 c16716 = (C16716) super.clone();
            c16716.f53995 = (Object[]) this.f53995.clone();
            c16716.f54003 = this.f54003;
            c16716.f54005 = (long[]) this.f54005.clone();
            c16716.f53998 = this.f53998;
            return c16716;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC3074, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f53995;
        int i = this.f54003 ? this.f54000 - 1 : this.f54000;
        int iMo25785 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iMo25785;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iMo25785 = this.f53998.mo25785(obj) + iMo25785;
            }
            i2++;
            i = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM30015;
        objectInputStream.defaultReadObject();
        int i = this.f54000;
        float f = this.f54006;
        int iM30014 = C11972.m30014(f, i);
        this.f53997 = iM30014;
        this.f53996 = C11972.m30029(f, iM30014);
        int i2 = this.f53997;
        this.f54002 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f53995 = objArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f54005 = jArr;
        int i3 = -1;
        this.f53999 = -1;
        this.f54004 = -1;
        int i4 = this.f54000;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            Object object = objectInputStream.readObject();
            if (this.f53998.mo25786(object, null)) {
                iM30015 = this.f53997;
                this.f54003 = r3;
            } else {
                iM30015 = C11972.m30015(this.f53998.mo25785(object)) & this.f54002;
                if (objArr[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + r3) & this.f54002;
                    } while (objArr[iM30015] != null);
                }
            }
            objArr[iM30015] = object;
            if (this.f54004 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM30015) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM30015];
                jArr[iM30015] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f54004 = iM30015;
                jArr[iM30015] = jArr[iM30015] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM30015;
            r3 = 1;
            i3 = -1;
        }
        this.f53999 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
