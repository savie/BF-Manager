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

/* JADX INFO: renamed from: l.۫۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12966 extends AbstractC13448 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f41565;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f41566;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f41567;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f41568;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f41569;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int[] f41570;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f41571;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f41572 = 0.75f;

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C12966() {
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f41568 = iM30014;
        this.f41571 = iM30014;
        this.f41565 = iM30014 - 1;
        this.f41567 = C11972.m30029(0.75f, iM30014);
        this.f41570 = new int[this.f41568 + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32356(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil(j / this.f41572))));
        if (iMin > this.f41568) {
            m32358(iMin);
        }
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14692(InterfaceC1340 interfaceC1340) {
        float f = this.f41572;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, interfaceC1340.size());
            if (iM30014 > this.f41568) {
                m32358(iM30014);
            }
        } else {
            m32356(interfaceC1340.size() + this.f41566);
        }
        return super.mo14692(interfaceC1340);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        float f = this.f41572;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, collection.size());
            if (iM30014 > this.f41568) {
                m32358(iM30014);
            }
        } else {
            m32356(collection.size() + this.f41566);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        int i2;
        if (i == 0) {
            if (this.f41569) {
                return false;
            }
            this.f41569 = true;
        } else {
            int[] iArr = this.f41570;
            int iM30015 = C11972.m30015(i) & this.f41565;
            int i3 = iArr[iM30015];
            if (i3 != 0) {
                if (i3 == i) {
                    return false;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f41565;
                    i2 = iArr[iM30015];
                    if (i2 != 0) {
                    }
                } while (i2 != i);
                return false;
            }
            iArr[iM30015] = i;
        }
        int i4 = this.f41566;
        this.f41566 = i4 + 1;
        if (i4 >= this.f41567) {
            m32358(C11972.m30014(this.f41572, i4 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32357(int i) {
        int i2;
        this.f41566--;
        int[] iArr = this.f41570;
        loop0: while (true) {
            int i3 = (i + 1) & this.f41565;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM30015 = C11972.m30015(i2);
                    int i4 = this.f41565;
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
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f41568;
        if (i6 <= this.f41571 || this.f41566 >= this.f41567 / 4 || i6 <= 16) {
            return;
        }
        m32358(i6 / 2);
    }

    @Override // l.AbstractC13448
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f41569) {
                this.f41569 = false;
                int[] iArr = this.f41570;
                int i3 = this.f41568;
                iArr[i3] = 0;
                int i4 = this.f41566 - 1;
                this.f41566 = i4;
                if (i3 > this.f41571 && i4 < this.f41567 / 4 && i3 > 16) {
                    m32358(i3 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f41570;
            int iM30015 = C11972.m30015(i) & this.f41565;
            int i5 = iArr2[iM30015];
            if (i5 != 0) {
                if (i == i5) {
                    m32357(iM30015);
                    return true;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f41565;
                    i2 = iArr2[iM30015];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m32357(iM30015);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f41569;
        }
        int[] iArr = this.f41570;
        int iM30015 = C11972.m30015(i) & this.f41565;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM30015 = (iM30015 + 1) & this.f41565;
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
        if (this.f41566 == 0) {
            return;
        }
        this.f41566 = 0;
        this.f41569 = false;
        Arrays.fill(this.f41570, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41566;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f41566 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C19679 c19679 = new C19679(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f41566;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c19679.nextInt());
            i = i2;
        }
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C19679(this);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C19679(this);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C15203(this);
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return new C15203(this);
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f41570;
        if (this.f41569) {
            intConsumer.accept(iArr[this.f41568]);
        }
        int i = this.f41568;
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m32359() {
        float f = this.f41566;
        float f2 = this.f41572;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f41568 || this.f41566 > C11972.m30029(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m32358(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32358(int i) {
        int i2;
        int[] iArr = this.f41570;
        int i3 = i - 1;
        int[] iArr2 = new int[i + 1];
        int i4 = this.f41568;
        int i5 = this.f41569 ? this.f41566 - 1 : this.f41566;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    i2 = iArr[i4];
                } while (i2 == 0);
                int iM30015 = C11972.m30015(i2) & i3;
                if (iArr2[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & i3;
                    } while (iArr2[iM30015] != 0);
                }
                iArr2[iM30015] = iArr[i4];
                i5 = i6;
            } else {
                this.f41568 = i;
                this.f41565 = i3;
                this.f41567 = C11972.m30029(this.f41572, i);
                this.f41570 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C12966 c12966 = (C12966) super.clone();
            c12966.f41570 = (int[]) this.f41570.clone();
            c12966.f41569 = this.f41569;
            return c12966;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC13448, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f41570;
        int i2 = this.f41569 ? this.f41566 - 1 : this.f41566;
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
        int iM30015;
        objectInputStream.defaultReadObject();
        int i = this.f41566;
        float f = this.f41572;
        int iM30014 = C11972.m30014(f, i);
        this.f41568 = iM30014;
        this.f41567 = C11972.m30029(f, iM30014);
        int i2 = this.f41568;
        this.f41565 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f41570 = iArr;
        int i3 = this.f41566;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            int i5 = objectInputStream.readInt();
            if (i5 == 0) {
                iM30015 = this.f41568;
                this.f41569 = true;
            } else {
                iM30015 = C11972.m30015(i5) & this.f41565;
                if (iArr[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & this.f41565;
                    } while (iArr[iM30015] != 0);
                }
            }
            iArr[iM30015] = i5;
            i3 = i4;
        }
    }
}
