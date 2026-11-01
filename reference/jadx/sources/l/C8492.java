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
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8492 extends AbstractC14324 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f29425;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f29426;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient int f29427;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient int f29429;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f29430;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int[] f29431;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient long[] f29432;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final transient int f29434;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f29424 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f29428 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f29433 = 0.75f;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC4733, java.util.SortedSet
    public final InterfaceC16481 comparator() {
        return null;
    }

    @Override // l.AbstractC14324, l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C8492() {
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f29429 = iM25124;
        this.f29434 = iM25124;
        this.f29426 = iM25124 - 1;
        this.f29427 = C9927.m25131(0.75f, iM25124);
        int i = this.f29429 + 1;
        this.f29431 = new int[i];
        this.f29432 = new long[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22186(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil(j / this.f29433))));
        if (iMin > this.f29429) {
            m22188(iMin);
        }
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3172(InterfaceC10131 interfaceC10131) {
        float f = this.f29433;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, interfaceC10131.size());
            if (iM25124 > this.f29429) {
                m22188(iM25124);
            }
        } else {
            m22186(interfaceC10131.size() + this.f29425);
        }
        return super.mo3172(interfaceC10131);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        float f = this.f29433;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, collection.size());
            if (iM25124 > this.f29429) {
                m22188(iM25124);
            }
        } else {
            m22186(collection.size() + this.f29425);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        int i2;
        int i3;
        if (i == 0) {
            if (this.f29430) {
                return false;
            }
            i2 = this.f29429;
            this.f29430 = true;
        } else {
            int[] iArr = this.f29431;
            int iM25125 = C9927.m25125(i) & this.f29426;
            int i4 = iArr[iM25125];
            if (i4 != 0) {
                if (i4 == i) {
                    return false;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f29426;
                    i3 = iArr[iM25125];
                    if (i3 != 0) {
                    }
                } while (i3 != i);
                return false;
            }
            iArr[iM25125] = i;
            i2 = iM25125;
        }
        int i5 = this.f29425;
        if (i5 == 0) {
            this.f29428 = i2;
            this.f29424 = i2;
            this.f29432[i2] = -1;
        } else {
            long[] jArr = this.f29432;
            int i6 = this.f29428;
            long j = jArr[i6];
            jArr[i6] = j ^ (((((long) i2) & 4294967295L) ^ j) & 4294967295L);
            jArr[i2] = ((((long) i6) & 4294967295L) << 32) | 4294967295L;
            this.f29428 = i2;
        }
        this.f29425 = i5 + 1;
        if (i5 >= this.f29427) {
            m22188(C9927.m25124(this.f29433, i5 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22187(int i) {
        int i2;
        this.f29425--;
        m22189(i);
        int[] iArr = this.f29431;
        loop0: while (true) {
            int i3 = (i + 1) & this.f29426;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM25125 = C9927.m25125(i2);
                    int i4 = this.f29426;
                    int i5 = iM25125 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i3 = (i3 + 1) & i4;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            m22190(i3, i);
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f29429;
        if (i6 <= this.f29434 || this.f29425 >= this.f29427 / 4 || i6 <= 16) {
            return;
        }
        m22188(i6 / 2);
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f29430) {
                this.f29430 = false;
                int[] iArr = this.f29431;
                int i3 = this.f29429;
                iArr[i3] = 0;
                this.f29425--;
                m22189(i3);
                int i4 = this.f29429;
                if (i4 > this.f29434 && this.f29425 < this.f29427 / 4 && i4 > 16) {
                    m22188(i4 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f29431;
            int iM25125 = C9927.m25125(i) & this.f29426;
            int i5 = iArr2[iM25125];
            if (i5 != 0) {
                if (i == i5) {
                    m22187(iM25125);
                    return true;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f29426;
                    i2 = iArr2[iM25125];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m22187(iM25125);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f29430;
        }
        int[] iArr = this.f29431;
        int iM25125 = C9927.m25125(i) & this.f29426;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM25125 = (iM25125 + 1) & this.f29426;
                i2 = iArr[iM25125];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f29425 == 0) {
            return;
        }
        this.f29425 = 0;
        this.f29430 = false;
        Arrays.fill(this.f29431, 0);
        this.f29428 = -1;
        this.f29424 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29425;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29425 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22189(int i) {
        if (this.f29425 == 0) {
            this.f29428 = -1;
            this.f29424 = -1;
            return;
        }
        if (this.f29424 == i) {
            long[] jArr = this.f29432;
            int i2 = (int) jArr[i];
            this.f29424 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f29428 == i) {
            long[] jArr2 = this.f29432;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f29428 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f29432;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22190(int i, int i2) {
        if (this.f29425 == 1) {
            this.f29428 = i2;
            this.f29424 = i2;
            this.f29432[i2] = -1;
            return;
        }
        if (this.f29424 == i) {
            this.f29424 = i2;
            long[] jArr = this.f29432;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f29428 == i) {
            this.f29428 = i2;
            long[] jArr2 = this.f29432;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f29432;
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

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩵ */
    public final int mo13103() {
        if (this.f29425 == 0) {
            throw new NoSuchElementException();
        }
        return this.f29431[this.f29424];
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ֨ۙ */
    public final int mo13099() {
        if (this.f29425 == 0) {
            throw new NoSuchElementException();
        }
        return this.f29431[this.f29428];
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4733 mo13104(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4733 mo13102(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC4733 mo13100(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C19075 c19075 = new C19075(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f29425;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c19075.nextInt());
            i = i2;
        }
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C19075(this);
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C19075(this);
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC21191 iterator() {
        return new C19075(this);
    }

    @Override // l.AbstractC14324, l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C23079(new C19075(this), C17745.m41307(this), 337);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC21191 mo13101() {
        return new C19075(this);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        int i = this.f29424;
        while (i != -1) {
            int i2 = (int) this.f29432[i];
            intConsumer.accept(this.f29431[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22188(int i) {
        int i2;
        int[] iArr = this.f29431;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        int i5 = this.f29424;
        long[] jArr = this.f29432;
        long[] jArr2 = new long[i4];
        this.f29424 = -1;
        int i6 = this.f29425;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i10 = iArr[i5];
            if (i10 != 0) {
                int iM25125 = C9927.m25125(i10);
                while (true) {
                    i2 = iM25125 & i3;
                    if (iArr2[i2] == 0) {
                        break;
                    } else {
                        iM25125 = i2 + 1;
                    }
                }
            } else {
                i2 = i;
            }
            iArr2[i2] = iArr[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                jArr2[i7] = (((((long) i2) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i2];
                jArr2[i2] = ((((((long) i7) & 4294967295L) << 32) ^ j2) & (-4294967296L)) ^ j2;
            } else {
                this.f29424 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f29432 = jArr2;
        this.f29428 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f29429 = i;
        this.f29426 = i3;
        this.f29427 = C9927.m25131(this.f29433, i);
        this.f29431 = iArr2;
    }

    public final Object clone() {
        try {
            C8492 c8492 = (C8492) super.clone();
            c8492.f29431 = (int[]) this.f29431.clone();
            c8492.f29430 = this.f29430;
            c8492.f29432 = (long[]) this.f29432.clone();
            return c8492;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC23496, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f29431;
        int i2 = this.f29430 ? this.f29425 - 1 : this.f29425;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                return i3;
            }
            while (true) {
                i = iArr[i4];
                if (i == 0) {
                    i4++;
                }
            }
            i3 += i;
            i4++;
            i2 = i5;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM25125;
        objectInputStream.defaultReadObject();
        int i = this.f29425;
        float f = this.f29433;
        int iM25124 = C9927.m25124(f, i);
        this.f29429 = iM25124;
        this.f29427 = C9927.m25131(f, iM25124);
        int i2 = this.f29429;
        this.f29426 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f29431 = iArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f29432 = jArr;
        int i3 = -1;
        this.f29428 = -1;
        this.f29424 = -1;
        int i4 = this.f29425;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            int i7 = objectInputStream.readInt();
            if (i7 == 0) {
                iM25125 = this.f29429;
                this.f29430 = r3;
            } else {
                iM25125 = C9927.m25125(i7) & this.f29426;
                if (iArr[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + r3) & this.f29426;
                    } while (iArr[iM25125] != 0);
                }
            }
            iArr[iM25125] = i7;
            if (this.f29424 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM25125) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM25125];
                jArr[iM25125] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f29424 = iM25125;
                jArr[iM25125] = jArr[iM25125] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM25125;
            r3 = 1;
            i3 = -1;
        }
        this.f29428 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
