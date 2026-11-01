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

/* JADX INFO: renamed from: l.᩶ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19947 extends AbstractC8096 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient char[] f63895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63896;

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C19947(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C2271.m6966(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f63895 = C17124.f54609;
        } else {
            this.f63895 = new char[i];
        }
    }

    public C19947() {
        this.f63895 = C17124.f54608;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19947(char[] cArr) {
        int length = cArr.length;
        this(length);
        System.arraycopy(cArr, 0, this.f63895, 0, length);
        this.f63896 = length;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m45244(int i) {
        char[] cArr = this.f63895;
        if (i <= cArr.length) {
            return;
        }
        if (cArr != C17124.f54608) {
            i = (int) Math.max(Math.min(((long) cArr.length) + ((long) (cArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(this.f63895, 0, cArr2, 0, this.f63896);
        this.f63895 = cArr2;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ܰ */
    public final void mo26241(char c, int i) {
        m21307(i);
        m45244(this.f63896 + 1);
        int i2 = this.f63896;
        if (i != i2) {
            char[] cArr = this.f63895;
            System.arraycopy(cArr, i, cArr, i + 1, i2 - i);
        }
        this.f63895[i] = c;
        this.f63896++;
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2291(char c) {
        m45244(this.f63896 + 1);
        char[] cArr = this.f63895;
        int i = this.f63896;
        this.f63896 = i + 1;
        cArr[i] = c;
        return true;
    }

    @Override // l.InterfaceC10338
    public final char getChar(int i) {
        if (i < this.f63896) {
            return this.f63895[i];
        }
        throw new IndexOutOfBoundsException(C12441.m30911(this.f63896, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC8096, l.InterfaceC10338
    public final int indexOf(char c) {
        char[] cArr = this.f63895;
        for (int i = 0; i < this.f63896; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC8096, l.InterfaceC10338
    public final int lastIndexOf(char c) {
        char[] cArr = this.f63895;
        int i = this.f63896;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (c == cArr[i2]) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ᩵ */
    public final char mo26242(int i) {
        int i2 = this.f63896;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f63896, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f63895;
        char c = cArr[i];
        int i3 = i2 - 1;
        this.f63896 = i3;
        if (i != i3) {
            System.arraycopy(cArr, i + 1, cArr, i, i3 - i);
        }
        return c;
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5455(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        mo26242(iIndexOf);
        return true;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final char mo26237(char c, int i) {
        if (i >= this.f63896) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f63896, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f63895;
        char c2 = cArr[i];
        cArr[i] = c;
        return c2;
    }

    @Override // l.AbstractC8096, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f63896 = 0;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo26239(int i, int i2, char[] cArr, int i3) {
        C7000.m18807(cArr.length, i2, i3);
        System.arraycopy(this.f63895, i, cArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63896;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f63896) {
            return this;
        }
        m21307(i);
        m21307(i2);
        if (i <= i2) {
            return new C15714(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f63896 == 0;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo26238(int i, int i2) {
        C7000.m18804(this.f63896, i, i2);
        char[] cArr = this.f63895;
        System.arraycopy(cArr, i2, cArr, i, this.f63896 - i2);
        this.f63896 -= i2 - i;
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo26240(char[] cArr, int i, int i2) {
        m21307(i);
        C7000.m18807(cArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f63896) {
            System.arraycopy(cArr, 0, this.f63895, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f63896, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC8096, l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public final void mo2288(InterfaceC1164 interfaceC1164) {
        char[] cArr = this.f63895;
        for (int i = 0; i < this.f63896; i++) {
            interfaceC1164.mo4297(cArr[i]);
        }
    }

    @Override // l.AbstractC8096
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21309(int i, InterfaceC23475 interfaceC23475) {
        if (interfaceC23475 instanceof InterfaceC10338) {
            InterfaceC10338 interfaceC10338 = (InterfaceC10338) interfaceC23475;
            m21307(i);
            int size = interfaceC10338.size();
            if (size != 0) {
                m45244(this.f63896 + size);
                char[] cArr = this.f63895;
                System.arraycopy(cArr, i, cArr, i + size, this.f63896 - i);
                interfaceC10338.mo26239(0, i, this.f63895, size);
                this.f63896 += size;
                return true;
            }
        } else {
            m21307(i);
            int size2 = interfaceC23475.size();
            if (size2 != 0) {
                m45244(this.f63896 + size2);
                char[] cArr2 = this.f63895;
                System.arraycopy(cArr2, i, cArr2, i + size2, this.f63896 - i);
                InterfaceC15277 it = interfaceC23475.iterator();
                this.f63896 += size2;
                while (true) {
                    int i2 = size2 - 1;
                    if (size2 == 0) {
                        return true;
                    }
                    this.f63895[i] = it.mo1416();
                    size2 = i2;
                    i++;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo11182(InterfaceC23475 interfaceC23475) {
        int i;
        char[] cArr = this.f63895;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f63896;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC23475.mo2286(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f63896 = i3;
        return z;
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5454(InterfaceC23744 interfaceC23744) {
        int i;
        char[] cArr = this.f63895;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f63896;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC23744.mo16050(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f63896 = i3;
        return z;
    }

    @Override // l.AbstractC8096, java.util.List
    public final InterfaceC20921 listIterator(int i) {
        m21307(i);
        return new C8658(this, i);
    }

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return new C10069(this);
    }

    @Override // l.AbstractC8096, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C10069(this);
    }

    @Override // l.AbstractC8096, l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ */
    public final void mo21308(InterfaceC4692 interfaceC4692) {
        if (interfaceC4692 != null) {
            C17124.m39986(this.f63895, 0, this.f63896, interfaceC4692, (char[]) null);
        } else {
            C17124.m39983(this.f63895, this.f63896);
        }
    }

    @Override // l.AbstractC8096, l.InterfaceC10338
    /* JADX INFO: renamed from: ܰ */
    public final void mo21310(InterfaceC4692 interfaceC4692) {
        if (interfaceC4692 == null) {
            C17124.m39983(this.f63895, this.f63896);
        } else {
            C17124.m39985(this.f63895, 0, this.f63896, interfaceC4692);
        }
    }

    public final Object clone() {
        char[] cArrCopyOf;
        char[] cArr = this.f63895;
        int i = this.f63896;
        if (i == 0) {
            cArrCopyOf = C17124.f54609;
        } else {
            cArrCopyOf = Arrays.copyOf(cArr, i);
        }
        C19947 c19947 = new C19947();
        c19947.f63895 = cArrCopyOf;
        c19947.f63896 = this.f63896;
        return c19947;
    }

    @Override // l.AbstractC8096, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C19947) {
            C19947 c19947 = (C19947) obj;
            if (c19947 != this) {
                int i = this.f63896;
                int i2 = c19947.f63896;
                if (i == i2) {
                    char[] cArr = this.f63895;
                    char[] cArr2 = c19947.f63895;
                    if (cArr != cArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (cArr[i3] == cArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C15714) {
            return ((C15714) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC8096
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C19947) {
            C19947 c19947 = (C19947) list;
            int i = this.f63896;
            int i2 = c19947.f63896;
            char[] cArr = this.f63895;
            char[] cArr2 = c19947.f63895;
            if (cArr != cArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Character.compare(cArr[i3], cArr2[i3]);
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
        if (list instanceof C15714) {
            return -((C15714) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f63895;
        for (int i = 0; i < this.f63896; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f63896];
        this.f63895 = cArr;
        for (int i = 0; i < this.f63896; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
