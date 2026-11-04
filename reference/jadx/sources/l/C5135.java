package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۙ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes3.dex */
public final class C5135 extends AbstractC1318 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f17895;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f17896;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f17897;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f17898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f17899;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient char[] f17900;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f17901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f17902 = 0.75f;

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C5135() {
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f17898 = iM30014;
        this.f17901 = iM30014;
        this.f17895 = iM30014 - 1;
        this.f17897 = C11972.m30029(0.75f, iM30014);
        this.f17900 = new char[this.f17898 + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15525(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil(j / this.f17902))));
        if (iMin > this.f17898) {
            m15527(iMin);
        }
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13694(InterfaceC12835 interfaceC12835) {
        float f = this.f17902;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, interfaceC12835.size());
            if (iM30014 > this.f17898) {
                m15527(iM30014);
            }
        } else {
            m15525(interfaceC12835.size() + this.f17896);
        }
        return super.mo13694(interfaceC12835);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        float f = this.f17902;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, collection.size());
            if (iM30014 > this.f17898) {
                m15527(iM30014);
            }
        } else {
            m15525(collection.size() + this.f17896);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5933(char c) {
        char c2;
        if (c == 0) {
            if (this.f17899) {
                return false;
            }
            this.f17899 = true;
        } else {
            char[] cArr = this.f17900;
            int iM30015 = C11972.m30015((int) c) & this.f17895;
            char c3 = cArr[iM30015];
            if (c3 != 0) {
                if (c3 == c) {
                    return false;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f17895;
                    c2 = cArr[iM30015];
                    if (c2 != 0) {
                    }
                } while (c2 != c);
                return false;
            }
            cArr[iM30015] = c;
        }
        int i = this.f17896;
        this.f17896 = i + 1;
        if (i >= this.f17897) {
            m15527(C11972.m30014(this.f17902, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m15526(int i) {
        char c;
        this.f17896--;
        char[] cArr = this.f17900;
        loop0: while (true) {
            int i2 = (i + 1) & this.f17895;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM30015 = C11972.m30015((int) c);
                    int i3 = this.f17895;
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
                } else {
                    break loop0;
                }
            }
            cArr[i] = c;
            i = i2;
        }
        cArr[i] = 0;
        int i5 = this.f17898;
        if (i5 <= this.f17901 || this.f17896 >= this.f17897 / 4 || i5 <= 16) {
            return;
        }
        m15527(i5 / 2);
    }

    @Override // l.AbstractC1318
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4844(char c) {
        char c2;
        if (c == 0) {
            if (this.f17899) {
                this.f17899 = false;
                char[] cArr = this.f17900;
                int i = this.f17898;
                cArr[i] = 0;
                int i2 = this.f17896 - 1;
                this.f17896 = i2;
                if (i > this.f17901 && i2 < this.f17897 / 4 && i > 16) {
                    m15527(i / 2);
                }
                return true;
            }
        } else {
            char[] cArr2 = this.f17900;
            int iM30015 = C11972.m30015((int) c) & this.f17895;
            char c3 = cArr2[iM30015];
            if (c3 != 0) {
                if (c == c3) {
                    m15526(iM30015);
                    return true;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f17895;
                    c2 = cArr2[iM30015];
                    if (c2 == 0) {
                    }
                } while (c != c2);
                m15526(iM30015);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        char c2;
        if (c == 0) {
            return this.f17899;
        }
        char[] cArr = this.f17900;
        int iM30015 = C11972.m30015((int) c) & this.f17895;
        char c3 = cArr[iM30015];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM30015 = (iM30015 + 1) & this.f17895;
                c2 = cArr[iM30015];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f17896 == 0) {
            return;
        }
        this.f17896 = 0;
        this.f17899 = false;
        Arrays.fill(this.f17900, (char) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17896;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f17896 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C6869 c6869 = new C6869(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f17896;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeChar(c6869.mo5320());
            i = i2;
        }
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6869(this);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC21040 iterator() {
        return new C6869(this);
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C13580(this);
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C13580(this);
    }

    @Override // l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public final void mo5932(InterfaceC12089 interfaceC12089) {
        char[] cArr = this.f17900;
        if (this.f17899) {
            interfaceC12089.mo10258(cArr[this.f17898]);
        }
        int i = this.f17898;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC12089.mo10258(c);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15527(int i) {
        char c;
        char[] cArr = this.f17900;
        int i2 = i - 1;
        char[] cArr2 = new char[i + 1];
        int i3 = this.f17898;
        int i4 = this.f17899 ? this.f17896 - 1 : this.f17896;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    c = cArr[i3];
                } while (c == 0);
                int iM30015 = C11972.m30015((int) c) & i2;
                if (cArr2[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & i2;
                    } while (cArr2[iM30015] != 0);
                }
                cArr2[iM30015] = cArr[i3];
                i4 = i5;
            } else {
                this.f17898 = i;
                this.f17895 = i2;
                this.f17897 = C11972.m30029(this.f17902, i);
                this.f17900 = cArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C5135 c5135 = (C5135) super.clone();
            c5135.f17900 = (char[]) this.f17900.clone();
            c5135.f17899 = this.f17899;
            return c5135;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC1318, java.util.Collection, java.util.Set
    public final int hashCode() {
        char c;
        char[] cArr = this.f17900;
        int i = this.f17899 ? this.f17896 - 1 : this.f17896;
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
        int iM30015;
        objectInputStream.defaultReadObject();
        int i = this.f17896;
        float f = this.f17902;
        int iM30014 = C11972.m30014(f, i);
        this.f17898 = iM30014;
        this.f17897 = C11972.m30029(f, iM30014);
        int i2 = this.f17898;
        this.f17895 = i2 - 1;
        char[] cArr = new char[i2 + 1];
        this.f17900 = cArr;
        int i3 = this.f17896;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            if (c == 0) {
                iM30015 = this.f17898;
                this.f17899 = true;
            } else {
                iM30015 = C11972.m30015((int) c) & this.f17895;
                if (cArr[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & this.f17895;
                    } while (cArr[iM30015] != 0);
                }
            }
            cArr[iM30015] = c;
            i3 = i4;
        }
    }
}
