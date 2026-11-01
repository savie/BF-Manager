package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24014 extends AbstractC23496 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int[] f77811;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f77812;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f77814;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f77815;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int f77816;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int f77817;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f77818 = 0.75f;

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C24014() {
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f77812 = iM25124;
        this.f77817 = iM25124;
        this.f77816 = iM25124 - 1;
        this.f77814 = C9927.m25131(0.75f, iM25124);
        this.f77811 = new int[this.f77812 + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52845(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil(j / this.f77818))));
        if (iMin > this.f77812) {
            m52846(iMin);
        }
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3172(InterfaceC10131 interfaceC10131) {
        float f = this.f77818;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, interfaceC10131.size());
            if (iM25124 > this.f77812) {
                m52846(iM25124);
            }
        } else {
            m52845(interfaceC10131.size() + this.f77813);
        }
        return super.mo3172(interfaceC10131);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        float f = this.f77818;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, collection.size());
            if (iM25124 > this.f77812) {
                m52846(iM25124);
            }
        } else {
            m52845(collection.size() + this.f77813);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        int i2;
        if (i == 0) {
            if (this.f77815) {
                return false;
            }
            this.f77815 = true;
        } else {
            int[] iArr = this.f77811;
            int iM25125 = C9927.m25125(i) & this.f77816;
            int i3 = iArr[iM25125];
            if (i3 != 0) {
                if (i3 == i) {
                    return false;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f77816;
                    i2 = iArr[iM25125];
                    if (i2 != 0) {
                    }
                } while (i2 != i);
                return false;
            }
            iArr[iM25125] = i;
        }
        int i4 = this.f77813;
        this.f77813 = i4 + 1;
        if (i4 >= this.f77814) {
            m52846(C9927.m25124(this.f77818, i4 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m52844(int i) {
        int i2;
        this.f77813--;
        int[] iArr = this.f77811;
        loop0: while (true) {
            int i3 = (i + 1) & this.f77816;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM25125 = C9927.m25125(i2);
                    int i4 = this.f77816;
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
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f77812;
        if (i6 <= this.f77817 || this.f77813 >= this.f77814 / 4 || i6 <= 16) {
            return;
        }
        m52846(i6 / 2);
    }

    @Override // l.AbstractC23496
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f77815) {
                this.f77815 = false;
                int[] iArr = this.f77811;
                int i3 = this.f77812;
                iArr[i3] = 0;
                int i4 = this.f77813 - 1;
                this.f77813 = i4;
                if (i3 > this.f77817 && i4 < this.f77814 / 4 && i3 > 16) {
                    m52846(i3 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f77811;
            int iM25125 = C9927.m25125(i) & this.f77816;
            int i5 = iArr2[iM25125];
            if (i5 != 0) {
                if (i == i5) {
                    m52844(iM25125);
                    return true;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f77816;
                    i2 = iArr2[iM25125];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m52844(iM25125);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f77815;
        }
        int[] iArr = this.f77811;
        int iM25125 = C9927.m25125(i) & this.f77816;
        int i3 = iArr[iM25125];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM25125 = (iM25125 + 1) & this.f77816;
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
        if (this.f77813 == 0) {
            return;
        }
        this.f77813 = 0;
        this.f77815 = false;
        Arrays.fill(this.f77811, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f77813;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f77813 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C6374 c6374 = new C6374(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f77813;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c6374.nextInt());
            i = i2;
        }
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6374(this);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C6374(this);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C11314(this);
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C11314(this);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f77811;
        if (this.f77815) {
            intConsumer.accept(iArr[this.f77812]);
        }
        int i = this.f77812;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 != 0) {
                intConsumer.accept(i3);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52847() {
        float f = this.f77813;
        float f2 = this.f77818;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f77812 || this.f77813 > C9927.m25131(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m52846(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52846(int i) {
        int i2;
        int[] iArr = this.f77811;
        int i3 = i - 1;
        int[] iArr2 = new int[i + 1];
        int i4 = this.f77812;
        int i5 = this.f77815 ? this.f77813 - 1 : this.f77813;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    i2 = iArr[i4];
                } while (i2 == 0);
                int iM25125 = C9927.m25125(i2) & i3;
                if (iArr2[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & i3;
                    } while (iArr2[iM25125] != 0);
                }
                iArr2[iM25125] = iArr[i4];
                i5 = i6;
            } else {
                this.f77812 = i;
                this.f77816 = i3;
                this.f77814 = C9927.m25131(this.f77818, i);
                this.f77811 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C24014 c24014 = (C24014) super.clone();
            c24014.f77811 = (int[]) this.f77811.clone();
            c24014.f77815 = this.f77815;
            return c24014;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC23496, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f77811;
        int i2 = this.f77815 ? this.f77813 - 1 : this.f77813;
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

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM25125;
        objectInputStream.defaultReadObject();
        int i = this.f77813;
        float f = this.f77818;
        int iM25124 = C9927.m25124(f, i);
        this.f77812 = iM25124;
        this.f77814 = C9927.m25131(f, iM25124);
        int i2 = this.f77812;
        this.f77816 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f77811 = iArr;
        int i3 = this.f77813;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            int i5 = objectInputStream.readInt();
            if (i5 == 0) {
                iM25125 = this.f77812;
                this.f77815 = true;
            } else {
                iM25125 = C9927.m25125(i5) & this.f77816;
                if (iArr[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & this.f77816;
                    } while (iArr[iM25125] != 0);
                }
            }
            iArr[iM25125] = i5;
            i3 = i4;
        }
    }
}
