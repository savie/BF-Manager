package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19393 extends AbstractC12504 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient char[] f62668;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final transient int f62669;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f62670;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f62671;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5881 f62672;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public transient Object[] f62673;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient int f62674;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f62675;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f62676;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f62677;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f62678;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC2240 f62679;

    public C19393(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f62677 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, i);
        this.f62674 = iM30014;
        this.f62669 = iM30014;
        this.f62678 = iM30014 - 1;
        this.f62675 = C11972.m30029(0.75f, iM30014);
        int i2 = this.f62674 + 1;
        this.f62668 = new char[i2];
        this.f62673 = new Object[i2];
    }

    public C19393() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object m44852(int i) {
        char c;
        Object[] objArr = this.f62673;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f62670--;
        char[] cArr = this.f62668;
        loop0: while (true) {
            int i2 = (i + 1) & this.f62678;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM30015 = C11972.m30015((int) c);
                    int i3 = this.f62678;
                    int i4 = iM30015 & i3;
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
        int i5 = this.f62674;
        if (i5 > this.f62669 && this.f62670 < this.f62675 / 4 && i5 > 16) {
            m44853(i5 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m44849() {
        this.f62676 = false;
        Object[] objArr = this.f62673;
        int i = this.f62674;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f62670 - 1;
        this.f62670 = i2;
        if (i > this.f62669 && i2 < this.f62675 / 4 && i > 16) {
            m44853(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC12504, java.util.Map
    public final void putAll(Map map) {
        float f = this.f62677;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, map.size());
            if (iM30014 > this.f62674) {
                m44853(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f62670) / f))));
            if (iMin > this.f62674) {
                m44853(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC3555, l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11584(char c, Object obj) {
        int i;
        if (c == 0) {
            i = this.f62676 ? this.f62674 : -(this.f62674 + 1);
        } else {
            char[] cArr = this.f62668;
            int iM30015 = C11972.m30015((int) c) & this.f62678;
            char c2 = cArr[iM30015];
            if (c2 != 0) {
                if (c != c2) {
                    while (true) {
                        iM30015 = (iM30015 + 1) & this.f62678;
                        char c3 = cArr[iM30015];
                        if (c3 == 0) {
                            i = -(iM30015 + 1);
                        } else if (c == c3) {
                        }
                    }
                }
                i = iM30015;
            } else {
                i = -(iM30015 + 1);
            }
        }
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 == this.f62674) {
                this.f62676 = true;
            }
            this.f62668[i2] = c;
            this.f62673[i2] = obj;
            int i3 = this.f62670;
            this.f62670 = i3 + 1;
            if (i3 < this.f62675) {
                return null;
            }
            m44853(C11972.m30014(this.f62677, i3 + 2));
            return null;
        }
        Object[] objArr = this.f62673;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // l.AbstractC3555, l.InterfaceC23123
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo11585(char c) {
        char c2;
        if (c == 0) {
            if (this.f62676) {
                return m44849();
            }
            return null;
        }
        char[] cArr = this.f62668;
        int iM30015 = C11972.m30015((int) c) & this.f62678;
        char c3 = cArr[iM30015];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return m44852(iM30015);
        }
        do {
            iM30015 = (iM30015 + 1) & this.f62678;
            c2 = cArr[iM30015];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return m44852(iM30015);
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo19863(char c) {
        char c2;
        if (c == 0) {
            if (this.f62676) {
                return this.f62673[this.f62674];
            }
            return null;
        }
        char[] cArr = this.f62668;
        int iM30015 = C11972.m30015((int) c) & this.f62678;
        char c3 = cArr[iM30015];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return this.f62673[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f62678;
            c2 = cArr[iM30015];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return this.f62673[iM30015];
    }

    @Override // l.AbstractC12504, l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19857(char c) {
        char c2;
        if (c == 0) {
            return this.f62676;
        }
        char[] cArr = this.f62668;
        int iM30015 = C11972.m30015((int) c) & this.f62678;
        char c3 = cArr[iM30015];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM30015 = (iM30015 + 1) & this.f62678;
                c2 = cArr[iM30015];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        char[] cArr = this.f62668;
        Object[] objArr = this.f62673;
        if (this.f62676 && C17359.equals(objArr[this.f62674], obj)) {
            return true;
        }
        int i = this.f62674;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] != 0 && C17359.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f62670 == 0) {
            return;
        }
        this.f62670 = 0;
        this.f62676 = false;
        Arrays.fill(this.f62668, (char) 0);
        Arrays.fill(this.f62673, (Object) null);
    }

    @Override // l.AbstractC3555, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f62670;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f62670 == 0;
    }

    @Override // l.InterfaceC11934, l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC7767 mo19859() {
        if (this.f62679 == null) {
            this.f62679 = new C14917(this);
        }
        return this.f62679;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f62672 == null) {
            this.f62672 = new C6715(this);
        }
        return this.f62672;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f62671 == null) {
            this.f62671 = new C16409(this);
        }
        return this.f62671;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44853(int i) {
        char c;
        char[] cArr = this.f62668;
        Object[] objArr = this.f62673;
        int i2 = i - 1;
        int i3 = i + 1;
        char[] cArr2 = new char[i3];
        Object[] objArr2 = new Object[i3];
        int i4 = this.f62674;
        int i5 = this.f62676 ? this.f62670 - 1 : this.f62670;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    c = cArr[i4];
                } while (c == 0);
                int iM30015 = C11972.m30015((int) c) & i2;
                if (cArr2[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & i2;
                    } while (cArr2[iM30015] != 0);
                }
                cArr2[iM30015] = cArr[i4];
                objArr2[iM30015] = objArr[i4];
                i5 = i6;
            } else {
                objArr2[i] = objArr[this.f62674];
                this.f62674 = i;
                this.f62678 = i2;
                this.f62675 = C11972.m30029(this.f62677, i);
                this.f62668 = cArr2;
                this.f62673 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C19393 c19393 = (C19393) super.clone();
            c19393.f62672 = null;
            c19393.f62671 = null;
            c19393.f62679 = null;
            c19393.f62676 = this.f62676;
            c19393.f62668 = (char[]) this.f62668.clone();
            c19393.f62673 = (Object[]) this.f62673.clone();
            return c19393;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC12504, java.util.Map
    public final int hashCode() {
        char cHashCode;
        char[] cArr = this.f62668;
        Object[] objArr = this.f62673;
        int i = this.f62676 ? this.f62670 - 1 : this.f62670;
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
        if (!this.f62676) {
            return i3;
        }
        Object obj2 = objArr[this.f62674];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        char[] cArr = this.f62668;
        Object[] objArr = this.f62673;
        C23869 c23869 = new C23869(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f62670;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM49168 = c23869.m49168();
            objectOutputStream.writeChar(cArr[iM49168]);
            objectOutputStream.writeObject(objArr[iM49168]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f62670;
        float f = this.f62677;
        int iM30014 = C11972.m30014(f, i2);
        this.f62674 = iM30014;
        this.f62675 = C11972.m30029(f, iM30014);
        int i3 = this.f62674;
        this.f62678 = i3 - 1;
        char[] cArr = new char[i3 + 1];
        this.f62668 = cArr;
        Object[] objArr = new Object[i3 + 1];
        this.f62673 = objArr;
        int i4 = this.f62670;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            Object object = objectInputStream.readObject();
            if (c == 0) {
                i = this.f62674;
                this.f62676 = true;
            } else {
                int iM30015 = C11972.m30015((int) c);
                int i6 = this.f62678;
                while (true) {
                    i = iM30015 & i6;
                    if (cArr[i] != 0) {
                        iM30015 = i + 1;
                        i6 = this.f62678;
                    }
                }
            }
            cArr[i] = c;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
