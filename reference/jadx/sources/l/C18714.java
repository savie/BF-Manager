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

/* JADX INFO: renamed from: l.ᩳ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18714 extends AbstractC5991 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int[] f60836;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient int f60837;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient int f60838;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f60840;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final transient int f60841;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f60842;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f60843;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient long[] f60845;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f60844 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f60839 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f60846 = 0.75f;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC16695, java.util.SortedSet
    public final InterfaceC4544 comparator() {
        return null;
    }

    @Override // l.AbstractC5991, l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C18714() {
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f60838 = iM30014;
        this.f60841 = iM30014;
        this.f60842 = iM30014 - 1;
        this.f60837 = C11972.m30029(0.75f, iM30014);
        int i = this.f60838 + 1;
        this.f60836 = new int[i];
        this.f60845 = new long[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43522(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil(j / this.f60846))));
        if (iMin > this.f60838) {
            m43526(iMin);
        }
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14692(InterfaceC1340 interfaceC1340) {
        float f = this.f60846;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, interfaceC1340.size());
            if (iM30014 > this.f60838) {
                m43526(iM30014);
            }
        } else {
            m43522(interfaceC1340.size() + this.f60840);
        }
        return super.mo14692(interfaceC1340);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        float f = this.f60846;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, collection.size());
            if (iM30014 > this.f60838) {
                m43526(iM30014);
            }
        } else {
            m43522(collection.size() + this.f60840);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        int i2;
        int i3;
        if (i == 0) {
            if (this.f60843) {
                return false;
            }
            i2 = this.f60838;
            this.f60843 = true;
        } else {
            int[] iArr = this.f60836;
            int iM30015 = C11972.m30015(i) & this.f60842;
            int i4 = iArr[iM30015];
            if (i4 != 0) {
                if (i4 == i) {
                    return false;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f60842;
                    i3 = iArr[iM30015];
                    if (i3 != 0) {
                    }
                } while (i3 != i);
                return false;
            }
            iArr[iM30015] = i;
            i2 = iM30015;
        }
        int i5 = this.f60840;
        if (i5 == 0) {
            this.f60839 = i2;
            this.f60844 = i2;
            this.f60845[i2] = -1;
        } else {
            long[] jArr = this.f60845;
            int i6 = this.f60839;
            long j = jArr[i6];
            jArr[i6] = j ^ (((((long) i2) & 4294967295L) ^ j) & 4294967295L);
            jArr[i2] = ((((long) i6) & 4294967295L) << 32) | 4294967295L;
            this.f60839 = i2;
        }
        this.f60840 = i5 + 1;
        if (i5 >= this.f60837) {
            m43526(C11972.m30014(this.f60846, i5 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m43523(int i) {
        int i2;
        this.f60840--;
        m43524(i);
        int[] iArr = this.f60836;
        loop0: while (true) {
            int i3 = (i + 1) & this.f60842;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM30015 = C11972.m30015(i2);
                    int i4 = this.f60842;
                    int i5 = iM30015 & i4;
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
            m43525(i3, i);
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f60838;
        if (i6 <= this.f60841 || this.f60840 >= this.f60837 / 4 || i6 <= 16) {
            return;
        }
        m43526(i6 / 2);
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f60843) {
                this.f60843 = false;
                int[] iArr = this.f60836;
                int i3 = this.f60838;
                iArr[i3] = 0;
                this.f60840--;
                m43524(i3);
                int i4 = this.f60838;
                if (i4 > this.f60841 && this.f60840 < this.f60837 / 4 && i4 > 16) {
                    m43526(i4 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f60836;
            int iM30015 = C11972.m30015(i) & this.f60842;
            int i5 = iArr2[iM30015];
            if (i5 != 0) {
                if (i == i5) {
                    m43523(iM30015);
                    return true;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f60842;
                    i2 = iArr2[iM30015];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m43523(iM30015);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f60843;
        }
        int[] iArr = this.f60836;
        int iM30015 = C11972.m30015(i) & this.f60842;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM30015 = (iM30015 + 1) & this.f60842;
                i2 = iArr[iM30015];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f60840 == 0) {
            return;
        }
        this.f60840 = 0;
        this.f60843 = false;
        Arrays.fill(this.f60836, 0);
        this.f60839 = -1;
        this.f60844 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f60840;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f60840 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43524(int i) {
        if (this.f60840 == 0) {
            this.f60839 = -1;
            this.f60844 = -1;
            return;
        }
        if (this.f60844 == i) {
            long[] jArr = this.f60845;
            int i2 = (int) jArr[i];
            this.f60844 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f60839 == i) {
            long[] jArr2 = this.f60845;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f60839 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f60845;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43525(int i, int i2) {
        if (this.f60840 == 1) {
            this.f60839 = i2;
            this.f60844 = i2;
            this.f60845[i2] = -1;
            return;
        }
        if (this.f60844 == i) {
            this.f60844 = i2;
            long[] jArr = this.f60845;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f60839 == i) {
            this.f60839 = i2;
            long[] jArr2 = this.f60845;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f60845;
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

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩵ */
    public final int mo8337() {
        if (this.f60840 == 0) {
            throw new NoSuchElementException();
        }
        return this.f60836[this.f60844];
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۫ۙ */
    public final int mo8335() {
        if (this.f60840 == 0) {
            throw new NoSuchElementException();
        }
        return this.f60836[this.f60839];
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC16695 mo8336(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16695 mo8338(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC16695 mo8334(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C7527 c7527 = new C7527(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f60840;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c7527.nextInt());
            i = i2;
        }
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7527(this);
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C7527(this);
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC8273 iterator() {
        return new C7527(this);
    }

    @Override // l.AbstractC5991, l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C14457(new C7527(this), C8008.m21873(this), 337);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC8273 mo11424() {
        return new C7527(this);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        int i = this.f60844;
        while (i != -1) {
            int i2 = (int) this.f60845[i];
            intConsumer.accept(this.f60836[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m43526(int i) {
        int i2;
        int[] iArr = this.f60836;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        int i5 = this.f60844;
        long[] jArr = this.f60845;
        long[] jArr2 = new long[i4];
        this.f60844 = -1;
        int i6 = this.f60840;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i10 = iArr[i5];
            if (i10 != 0) {
                int iM30015 = C11972.m30015(i10);
                while (true) {
                    i2 = iM30015 & i3;
                    if (iArr2[i2] == 0) {
                        break;
                    } else {
                        iM30015 = i2 + 1;
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
                this.f60844 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f60845 = jArr2;
        this.f60839 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f60838 = i;
        this.f60842 = i3;
        this.f60837 = C11972.m30029(this.f60846, i);
        this.f60836 = iArr2;
    }

    public final Object clone() {
        try {
            C18714 c18714 = (C18714) super.clone();
            c18714.f60836 = (int[]) this.f60836.clone();
            c18714.f60843 = this.f60843;
            c18714.f60845 = (long[]) this.f60845.clone();
            return c18714;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC13448, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f60836;
        int i2 = this.f60843 ? this.f60840 - 1 : this.f60840;
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
        int iM30015;
        objectInputStream.defaultReadObject();
        int i = this.f60840;
        float f = this.f60846;
        int iM30014 = C11972.m30014(f, i);
        this.f60838 = iM30014;
        this.f60837 = C11972.m30029(f, iM30014);
        int i2 = this.f60838;
        this.f60842 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f60836 = iArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f60845 = jArr;
        int i3 = -1;
        this.f60839 = -1;
        this.f60844 = -1;
        int i4 = this.f60840;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            int i7 = objectInputStream.readInt();
            if (i7 == 0) {
                iM30015 = this.f60838;
                this.f60843 = r3;
            } else {
                iM30015 = C11972.m30015(i7) & this.f60842;
                if (iArr[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + r3) & this.f60842;
                    } while (iArr[iM30015] != 0);
                }
            }
            iArr[iM30015] = i7;
            if (this.f60844 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM30015) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM30015];
                jArr[iM30015] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f60844 = iM30015;
                jArr[iM30015] = jArr[iM30015] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM30015;
            r3 = 1;
            i3 = -1;
        }
        this.f60839 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
