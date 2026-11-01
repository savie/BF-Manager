package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C7952 extends AbstractC22207 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f26115;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public transient Object[] f26116;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f26117;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f26118;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final transient int f26119;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14572 f26120;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26121;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f26122;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient char[] f26123;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f26124;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1558 f26125;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient int f26126;

    public C7952(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f26115 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, i);
        this.f26126 = iM25124;
        this.f26119 = iM25124;
        this.f26124 = iM25124 - 1;
        this.f26117 = C9927.m25131(0.75f, iM25124);
        int i2 = this.f26126 + 1;
        this.f26123 = new char[i2];
        this.f26116 = new Object[i2];
    }

    public C7952() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object m20985(int i) {
        char c;
        Object[] objArr = this.f26116;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f26121--;
        char[] cArr = this.f26123;
        loop0: while (true) {
            int i2 = (i + 1) & this.f26124;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM25125 = C9927.m25125((int) c);
                    int i3 = this.f26124;
                    int i4 = iM25125 & i3;
                    if (i > i2) {
                        if (i >= i4 && i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    } else {
                        if (i >= i4 || i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    }
                } else {
                    break loop0;
                }
            }
            cArr[i] = c;
            objArr[i] = objArr[i2];
            i = i2;
        }
        cArr[i] = 0;
        objArr[i] = null;
        int i5 = this.f26126;
        if (i5 > this.f26119 && this.f26121 < this.f26117 / 4 && i5 > 16) {
            m20986(i5 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m20982() {
        this.f26122 = false;
        Object[] objArr = this.f26116;
        int i = this.f26126;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f26121 - 1;
        this.f26121 = i2;
        if (i > this.f26119 && i2 < this.f26117 / 4 && i > 16) {
            m20986(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC22207, java.util.Map
    public final void putAll(Map map) {
        float f = this.f26115;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, map.size());
            if (iM25124 > this.f26126) {
                m20986(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f26121) / f))));
            if (iMin > this.f26126) {
                m20986(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC2450, l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7435(char c, Object obj) {
        int i;
        if (c == 0) {
            i = this.f26122 ? this.f26126 : -(this.f26126 + 1);
        } else {
            char[] cArr = this.f26123;
            int iM25125 = C9927.m25125((int) c) & this.f26124;
            char c2 = cArr[iM25125];
            if (c2 != 0) {
                if (c != c2) {
                    while (true) {
                        iM25125 = (iM25125 + 1) & this.f26124;
                        char c3 = cArr[iM25125];
                        if (c3 == 0) {
                            i = -(iM25125 + 1);
                        } else if (c == c3) {
                        }
                    }
                }
                i = iM25125;
            } else {
                i = -(iM25125 + 1);
            }
        }
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 == this.f26126) {
                this.f26122 = true;
            }
            this.f26123[i2] = c;
            this.f26116[i2] = obj;
            int i3 = this.f26121;
            this.f26121 = i3 + 1;
            if (i3 < this.f26117) {
                return null;
            }
            m20986(C9927.m25124(this.f26115, i3 + 2));
            return null;
        }
        Object[] objArr = this.f26116;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // l.AbstractC2450, l.InterfaceC17081
    /* JADX INFO: renamed from: ۚ */
    public final Object mo7436(char c) {
        char c2;
        if (c == 0) {
            if (this.f26122) {
                return m20982();
            }
            return null;
        }
        char[] cArr = this.f26123;
        int iM25125 = C9927.m25125((int) c) & this.f26124;
        char c3 = cArr[iM25125];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return m20985(iM25125);
        }
        do {
            iM25125 = (iM25125 + 1) & this.f26124;
            c2 = cArr[iM25125];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return m20985(iM25125);
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ܰ */
    public final Object mo15966(char c) {
        char c2;
        if (c == 0) {
            if (this.f26122) {
                return this.f26116[this.f26126];
            }
            return null;
        }
        char[] cArr = this.f26123;
        int iM25125 = C9927.m25125((int) c) & this.f26124;
        char c3 = cArr[iM25125];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return this.f26116[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f26124;
            c2 = cArr[iM25125];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return this.f26116[iM25125];
    }

    @Override // l.AbstractC22207, l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15965(char c) {
        char c2;
        if (c == 0) {
            return this.f26122;
        }
        char[] cArr = this.f26123;
        int iM25125 = C9927.m25125((int) c) & this.f26124;
        char c3 = cArr[iM25125];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM25125 = (iM25125 + 1) & this.f26124;
                c2 = cArr[iM25125];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        char[] cArr = this.f26123;
        Object[] objArr = this.f26116;
        if (this.f26122 && C13638.equals(objArr[this.f26126], obj)) {
            return true;
        }
        int i = this.f26126;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] != 0 && C13638.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f26121 == 0) {
            return;
        }
        this.f26121 = 0;
        this.f26122 = false;
        Arrays.fill(this.f26123, (char) 0);
        Arrays.fill(this.f26116, (Object) null);
    }

    @Override // l.AbstractC2450, l.InterfaceC6456
    public final int size() {
        return this.f26121;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f26121 == 0;
    }

    @Override // l.InterfaceC9321
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18660 mo8794() {
        if (this.f26125 == null) {
            this.f26125 = new C22769(this);
        }
        return this.f26125;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f26120 == null) {
            this.f26120 = new C12891(this);
        }
        return this.f26120;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f26118 == null) {
            this.f26118 = new C11480(this);
        }
        return this.f26118;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20986(int i) {
        char c;
        char[] cArr = this.f26123;
        Object[] objArr = this.f26116;
        int i2 = i - 1;
        int i3 = i + 1;
        char[] cArr2 = new char[i3];
        Object[] objArr2 = new Object[i3];
        int i4 = this.f26126;
        int i5 = this.f26122 ? this.f26121 - 1 : this.f26121;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    c = cArr[i4];
                } while (c == 0);
                int iM25125 = C9927.m25125((int) c) & i2;
                if (cArr2[iM25125] != 0) {
                    do {
                        iM25125 = (iM25125 + 1) & i2;
                    } while (cArr2[iM25125] != 0);
                }
                cArr2[iM25125] = cArr[i4];
                objArr2[iM25125] = objArr[i4];
                i5 = i6;
            } else {
                objArr2[i] = objArr[this.f26126];
                this.f26126 = i;
                this.f26124 = i2;
                this.f26117 = C9927.m25131(this.f26115, i);
                this.f26123 = cArr2;
                this.f26116 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C7952 c7952 = (C7952) super.clone();
            c7952.f26120 = null;
            c7952.f26118 = null;
            c7952.f26125 = null;
            c7952.f26122 = this.f26122;
            c7952.f26123 = (char[]) this.f26123.clone();
            c7952.f26116 = (Object[]) this.f26116.clone();
            return c7952;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC22207, java.util.Map
    public final int hashCode() {
        char cHashCode;
        char[] cArr = this.f26123;
        Object[] objArr = this.f26116;
        int i = this.f26122 ? this.f26121 - 1 : this.f26121;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                cHashCode = cArr[i2];
                if (cHashCode != 0) {
                    break;
                }
                i2++;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                cHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += cHashCode;
            i2++;
            i = i4;
        }
        if (!this.f26122) {
            return i3;
        }
        Object obj2 = objArr[this.f26126];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        char[] cArr = this.f26123;
        Object[] objArr = this.f26116;
        C2306 c2306 = new C2306(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f26121;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM35989 = c2306.m35989();
            objectOutputStream.writeChar(cArr[iM35989]);
            objectOutputStream.writeObject(objArr[iM35989]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f26121;
        float f = this.f26115;
        int iM25124 = C9927.m25124(f, i2);
        this.f26126 = iM25124;
        this.f26117 = C9927.m25131(f, iM25124);
        int i3 = this.f26126;
        this.f26124 = i3 - 1;
        char[] cArr = new char[i3 + 1];
        this.f26123 = cArr;
        Object[] objArr = new Object[i3 + 1];
        this.f26116 = objArr;
        int i4 = this.f26121;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            Object object = objectInputStream.readObject();
            if (c == 0) {
                i = this.f26126;
                this.f26122 = true;
            } else {
                int iM25125 = C9927.m25125((int) c);
                int i6 = this.f26124;
                while (true) {
                    i = iM25125 & i6;
                    if (cArr[i] != 0) {
                        iM25125 = i + 1;
                        i6 = this.f26124;
                    }
                }
            }
            cArr[i] = c;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
