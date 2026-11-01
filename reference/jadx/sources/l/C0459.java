package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֡ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0459 extends AbstractC19385 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient char[] f2072;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f2073;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2074;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f2075;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f2076;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int f2077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int f2078;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f2079 = 0.75f;

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C0459() {
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f2073 = iM25124;
        this.f2078 = iM25124;
        this.f2077 = iM25124 - 1;
        this.f2075 = C9927.m25131(0.75f, iM25124);
        this.f2072 = new char[this.f2073 + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2285(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil(j / this.f2079))));
        if (iMin > this.f2073) {
            m2287(iMin);
        }
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2290(InterfaceC23475 interfaceC23475) {
        float f = this.f2079;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, interfaceC23475.size());
            if (iM25124 > this.f2073) {
                m2287(iM25124);
            }
        } else {
            m2285(interfaceC23475.size() + this.f2074);
        }
        return super.mo2290(interfaceC23475);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f2079;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, collection.size());
            if (iM25124 > this.f2073) {
                m2287(iM25124);
            }
        } else {
            m2285(collection.size() + this.f2074);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo2291(char c) {
        char c2;
        if (c == 0) {
            if (this.f2076) {
                return false;
            }
            this.f2076 = true;
        } else {
            char[] cArr = this.f2072;
            int iM25125 = C9927.m25125((int) c) & this.f2077;
            char c3 = cArr[iM25125];
            if (c3 != 0) {
                if (c3 == c) {
                    return false;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f2077;
                    c2 = cArr[iM25125];
                    if (c2 != 0) {
                    }
                } while (c2 != c);
                return false;
            }
            cArr[iM25125] = c;
        }
        int i = this.f2074;
        this.f2074 = i + 1;
        if (i >= this.f2075) {
            m2287(C9927.m25124(this.f2079, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m2284(int i) {
        char c;
        this.f2074--;
        char[] cArr = this.f2072;
        loop0: while (true) {
            int i2 = (i + 1) & this.f2077;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM25125 = C9927.m25125((int) c);
                    int i3 = this.f2077;
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
                } else {
                    break loop0;
                }
            }
            cArr[i] = c;
            i = i2;
        }
        cArr[i] = 0;
        int i5 = this.f2073;
        if (i5 <= this.f2078 || this.f2074 >= this.f2075 / 4 || i5 <= 16) {
            return;
        }
        m2287(i5 / 2);
    }

    @Override // l.AbstractC19385
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2289(char c) {
        char c2;
        if (c == 0) {
            if (this.f2076) {
                this.f2076 = false;
                char[] cArr = this.f2072;
                int i = this.f2073;
                cArr[i] = 0;
                int i2 = this.f2074 - 1;
                this.f2074 = i2;
                if (i > this.f2078 && i2 < this.f2075 / 4 && i > 16) {
                    m2287(i / 2);
                }
                return true;
            }
        } else {
            char[] cArr2 = this.f2072;
            int iM25125 = C9927.m25125((int) c) & this.f2077;
            char c3 = cArr2[iM25125];
            if (c3 != 0) {
                if (c == c3) {
                    m2284(iM25125);
                    return true;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f2077;
                    c2 = cArr2[iM25125];
                    if (c2 == 0) {
                    }
                } while (c != c2);
                m2284(iM25125);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo2286(char c) {
        char c2;
        if (c == 0) {
            return this.f2076;
        }
        char[] cArr = this.f2072;
        int iM25125 = C9927.m25125((int) c) & this.f2077;
        char c3 = cArr[iM25125];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM25125 = (iM25125 + 1) & this.f2077;
                c2 = cArr[iM25125];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f2074 == 0) {
            return;
        }
        this.f2074 = 0;
        this.f2076 = false;
        Arrays.fill(this.f2072, (char) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2074;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2074 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C15983 c15983 = new C15983(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f2074;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeChar(c15983.mo1416());
            i = i2;
        }
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15983(this);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15277 iterator() {
        return new C15983(this);
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C20216(this);
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C20216(this);
    }

    @Override // l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2288(InterfaceC1164 interfaceC1164) {
        char[] cArr = this.f2072;
        if (this.f2076) {
            interfaceC1164.mo4297(cArr[this.f2073]);
        }
        int i = this.f2073;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC1164.mo4297(c);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2287(int i) {
        char c;
        char[] cArr = this.f2072;
        int i2 = i - 1;
        char[] cArr2 = new char[i + 1];
        int i3 = this.f2073;
        int i4 = this.f2076 ? this.f2074 - 1 : this.f2074;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    c = cArr[i3];
                } while (c == 0);
                int iM25125 = C9927.m25125((int) c) & i2;
                if (cArr2[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & i2;
                    } while (cArr2[iM25125] != 0);
                }
                cArr2[iM25125] = cArr[i3];
                i4 = i5;
            } else {
                this.f2073 = i;
                this.f2077 = i2;
                this.f2075 = C9927.m25131(this.f2079, i);
                this.f2072 = cArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C0459 c0459 = (C0459) super.clone();
            c0459.f2072 = (char[]) this.f2072.clone();
            c0459.f2076 = this.f2076;
            return c0459;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC19385, java.util.Collection, java.util.Set
    public final int hashCode() {
        char c;
        char[] cArr = this.f2072;
        int i = this.f2076 ? this.f2074 - 1 : this.f2074;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                return i2;
            }
            while (true) {
                c = cArr[i3];
                if (c == 0) {
                    i3++;
                }
            }
            i2 += c;
            i3++;
            i = i4;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM25125;
        objectInputStream.defaultReadObject();
        int i = this.f2074;
        float f = this.f2079;
        int iM25124 = C9927.m25124(f, i);
        this.f2073 = iM25124;
        this.f2075 = C9927.m25131(f, iM25124);
        int i2 = this.f2073;
        this.f2077 = i2 - 1;
        char[] cArr = new char[i2 + 1];
        this.f2072 = cArr;
        int i3 = this.f2074;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            if (c == 0) {
                iM25125 = this.f2073;
                this.f2076 = true;
            } else {
                iM25125 = C9927.m25125((int) c) & this.f2077;
                if (cArr[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & this.f2077;
                    } while (cArr[iM25125] != 0);
                }
            }
            cArr[iM25125] = c;
            i3 = i4;
        }
    }
}
