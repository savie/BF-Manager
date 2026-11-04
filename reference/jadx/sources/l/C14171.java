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

/* JADX INFO: renamed from: l.۬᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14171 extends AbstractC10266 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient char[] f44819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44820;

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C14171(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f44819 = C22532.f72878;
        } else {
            this.f44819 = new char[i];
        }
    }

    public C14171() {
        this.f44819 = C22532.f72877;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14171(char[] cArr) {
        int length = cArr.length;
        this(length);
        System.arraycopy(cArr, 0, this.f44819, 0, length);
        this.f44820 = length;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34460(int i) {
        char[] cArr = this.f44819;
        if (i <= cArr.length) {
            return;
        }
        if (cArr != C22532.f72877) {
            i = (int) Math.max(Math.min(((long) cArr.length) + ((long) (cArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(this.f44819, 0, cArr2, 0, this.f44820);
        this.f44819 = cArr2;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ᩷ */
    public final void mo21904(char c, int i) {
        m26472(i);
        m34460(this.f44820 + 1);
        int i2 = this.f44820;
        if (i != i2) {
            char[] cArr = this.f44819;
            System.arraycopy(cArr, i, cArr, i + 1, i2 - i);
        }
        this.f44819[i] = c;
        this.f44820++;
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5933(char c) {
        m34460(this.f44820 + 1);
        char[] cArr = this.f44819;
        int i = this.f44820;
        this.f44820 = i + 1;
        cArr[i] = c;
        return true;
    }

    @Override // l.InterfaceC9105
    public final char getChar(int i) {
        if (i < this.f44820) {
            return this.f44819[i];
        }
        throw new IndexOutOfBoundsException(C12669.m31437(this.f44820, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC10266, l.InterfaceC9105
    public final int indexOf(char c) {
        char[] cArr = this.f44819;
        for (int i = 0; i < this.f44820; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10266, l.InterfaceC9105
    public final int lastIndexOf(char c) {
        char[] cArr = this.f44819;
        int i = this.f44820;
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

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ᩵ */
    public final char mo21903(int i) {
        int i2 = this.f44820;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f44820, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f44819;
        char c = cArr[i];
        int i3 = i2 - 1;
        this.f44820 = i3;
        if (i != i3) {
            System.arraycopy(cArr, i + 1, cArr, i, i3 - i);
        }
        return c;
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4843(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        mo21903(iIndexOf);
        return true;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final char mo21898(char c, int i) {
        if (i >= this.f44820) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f44820, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f44819;
        char c2 = cArr[i];
        cArr[i] = c;
        return c2;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final void mo21900(int i, int i2, char[] cArr, int i3) {
        C18450.m42990(cArr.length, i2, i3);
        System.arraycopy(this.f44819, i, cArr, i2, i3);
    }

    @Override // l.AbstractC10266, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f44820 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44820;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f44820) {
            return this;
        }
        m26472(i);
        m26472(i2);
        if (i <= i2) {
            return new C7460(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f44820 == 0;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final void mo21899(int i, int i2) {
        C18450.m42985(this.f44820, i, i2);
        char[] cArr = this.f44819;
        System.arraycopy(cArr, i2, cArr, i, this.f44820 - i2);
        this.f44820 -= i2 - i;
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final void mo21901(char[] cArr, int i, int i2) {
        m26472(i);
        C18450.m42990(cArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f44820) {
            System.arraycopy(cArr, 0, this.f44819, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f44820, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC10266, l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public final void mo5932(InterfaceC12089 interfaceC12089) {
        char[] cArr = this.f44819;
        for (int i = 0; i < this.f44820; i++) {
            interfaceC12089.mo10258(cArr[i]);
        }
    }

    @Override // l.AbstractC10266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21902(int i, InterfaceC12835 interfaceC12835) {
        if (interfaceC12835 instanceof InterfaceC9105) {
            InterfaceC9105 interfaceC9105 = (InterfaceC9105) interfaceC12835;
            m26472(i);
            int size = interfaceC9105.size();
            if (size != 0) {
                m34460(this.f44820 + size);
                char[] cArr = this.f44819;
                System.arraycopy(cArr, i, cArr, i + size, this.f44820 - i);
                interfaceC9105.mo21900(0, i, this.f44819, size);
                this.f44820 += size;
                return true;
            }
        } else {
            m26472(i);
            int size2 = interfaceC12835.size();
            if (size2 != 0) {
                m34460(this.f44820 + size2);
                char[] cArr2 = this.f44819;
                System.arraycopy(cArr2, i, cArr2, i + size2, this.f44820 - i);
                InterfaceC21040 it = interfaceC12835.iterator();
                this.f44820 += size2;
                while (true) {
                    int i2 = size2 - 1;
                    if (size2 == 0) {
                        return true;
                    }
                    this.f44819[i] = it.mo5320();
                    size2 = i2;
                    i++;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo13695(InterfaceC12835 interfaceC12835) {
        int i;
        char[] cArr = this.f44819;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f44820;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC12835.mo5936(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f44820 = i3;
        return z;
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5935(InterfaceC13338 interfaceC13338) {
        int i;
        char[] cArr = this.f44819;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f44820;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC13338.mo28051(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f44820 = i3;
        return z;
    }

    @Override // l.AbstractC10266, java.util.List
    public final InterfaceC8360 listIterator(int i) {
        m26472(i);
        return new C1494(this, i);
    }

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C9696(this);
    }

    @Override // l.AbstractC10266, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C9696(this);
    }

    @Override // l.AbstractC10266, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final void mo24255(InterfaceC16564 interfaceC16564) {
        if (interfaceC16564 != null) {
            C22532.m50775(this.f44819, 0, this.f44820, interfaceC16564, (char[]) null);
        } else {
            C22532.m50772(this.f44819, this.f44820);
        }
    }

    @Override // l.AbstractC10266, l.InterfaceC9105
    /* JADX INFO: renamed from: ᩷ */
    public final void mo24256(InterfaceC16564 interfaceC16564) {
        if (interfaceC16564 == null) {
            C22532.m50772(this.f44819, this.f44820);
        } else {
            C22532.m50774(this.f44819, 0, this.f44820, interfaceC16564);
        }
    }

    public final Object clone() {
        char[] cArrCopyOf;
        char[] cArr = this.f44819;
        int i = this.f44820;
        if (i == 0) {
            cArrCopyOf = C22532.f72878;
        } else {
            cArrCopyOf = Arrays.copyOf(cArr, i);
        }
        C14171 c14171 = new C14171();
        c14171.f44819 = cArrCopyOf;
        c14171.f44820 = this.f44820;
        return c14171;
    }

    @Override // l.AbstractC10266, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C14171) {
            C14171 c14171 = (C14171) obj;
            if (c14171 != this) {
                int i = this.f44820;
                int i2 = c14171.f44820;
                if (i == i2) {
                    char[] cArr = this.f44819;
                    char[] cArr2 = c14171.f44819;
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
        if (obj instanceof C7460) {
            return ((C7460) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC10266
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C14171) {
            C14171 c14171 = (C14171) list;
            int i = this.f44820;
            int i2 = c14171.f44820;
            char[] cArr = this.f44819;
            char[] cArr2 = c14171.f44819;
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
        if (list instanceof C7460) {
            return -((C7460) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f44819;
        for (int i = 0; i < this.f44820; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f44820];
        this.f44819 = cArr;
        for (int i = 0; i < this.f44820; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
