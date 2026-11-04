package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4060 extends AbstractC19482 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object[] f13849;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final transient int f13850;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f13851;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1340 f13852;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC7767 f13853;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public transient int[] f13854;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient int f13855;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f13856;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f13857;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f13858;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f13859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22706 f13860;

    public C4060(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f13858 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, i);
        this.f13855 = iM30014;
        this.f13850 = iM30014;
        this.f13859 = iM30014 - 1;
        this.f13856 = C11972.m30029(0.75f, iM30014);
        int i2 = this.f13855 + 1;
        this.f13849 = new Object[i2];
        this.f13854 = new int[i2];
    }

    public C4060() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int m13098(int i) {
        Object obj;
        int[] iArr = this.f13854;
        int i2 = iArr[i];
        this.f13851--;
        Object[] objArr = this.f13849;
        loop0: while (true) {
            int i3 = (i + 1) & this.f13859;
            while (true) {
                obj = objArr[i3];
                if (obj != null) {
                    int iM30015 = C11972.m30015(obj.hashCode());
                    int i4 = this.f13859;
                    int i5 = iM30015 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i5 || i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            objArr[i] = obj;
            iArr[i] = iArr[i3];
            i = i3;
        }
        objArr[i] = null;
        int i6 = this.f13855;
        if (i6 > this.f13850 && this.f13851 < this.f13856 / 4 && i6 > 16) {
            m13101(i6 / 2);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m13093() {
        this.f13857 = false;
        Object[] objArr = this.f13849;
        int i = this.f13855;
        objArr[i] = null;
        int i2 = this.f13854[i];
        int i3 = this.f13851 - 1;
        this.f13851 = i3;
        if (i > this.f13850 && i3 < this.f13856 / 4 && i > 16) {
            m13101(i / 2);
        }
        return i2;
    }

    @Override // l.AbstractC19482, java.util.Map
    public final void putAll(Map map) {
        float f = this.f13858;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, map.size());
            if (iM30014 > this.f13855) {
                m13101(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f13851) / f))));
            if (iMin > this.f13855) {
                m13101(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m13097(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f13857 ? this.f13855 : -(this.f13855 + 1);
        }
        Object[] objArr = this.f13849;
        int iM30015 = C11972.m30015(obj.hashCode()) & this.f13859;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return -(iM30015 + 1);
        }
        if (obj.equals(obj3)) {
            return iM30015;
        }
        do {
            iM30015 = (iM30015 + 1) & this.f13859;
            obj2 = objArr[iM30015];
            if (obj2 == null) {
                return -(iM30015 + 1);
            }
        } while (!obj.equals(obj2));
        return iM30015;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13094(int i, int i2, Object obj) {
        if (i == this.f13855) {
            this.f13857 = true;
        }
        this.f13849[i] = obj;
        this.f13854[i] = i2;
        int i3 = this.f13851;
        this.f13851 = i3 + 1;
        if (i3 >= this.f13856) {
            m13101(C11972.m30014(this.f13858, i3 + 2));
        }
    }

    @Override // l.AbstractC22466, l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ */
    public final int mo7845(int i, Object obj) {
        int iM13097 = m13097(obj);
        if (iM13097 < 0) {
            m13094((-iM13097) - 1, i, obj);
            return 0;
        }
        int[] iArr = this.f13854;
        int i2 = iArr[iM13097];
        iArr[iM13097] = i;
        return i2;
    }

    @Override // l.AbstractC22466, l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ */
    public final int mo7846(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f13857) {
                return m13093();
            }
            return 0;
        }
        Object[] objArr = this.f13849;
        int iM30015 = C11972.m30015(obj.hashCode()) & this.f13859;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return m13098(iM30015);
        }
        do {
            iM30015 = (iM30015 + 1) & this.f13859;
            obj2 = objArr[iM30015];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return m13098(iM30015);
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7848(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f13857) {
                return this.f13854[this.f13855];
            }
            return 0;
        }
        Object[] objArr = this.f13849;
        int iM30015 = C11972.m30015(obj.hashCode()) & this.f13859;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return this.f13854[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f13859;
            obj2 = objArr[iM30015];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return this.f13854[iM30015];
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f13857;
        }
        Object[] objArr = this.f13849;
        int iM30015 = C11972.m30015(obj.hashCode()) & this.f13859;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM30015 = (iM30015 + 1) & this.f13859;
                obj2 = objArr[iM30015];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // l.InterfaceC19722
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo7849(int i) {
        Object[] objArr = this.f13849;
        int[] iArr = this.f13854;
        if (this.f13857 && iArr[this.f13855] == i) {
            return true;
        }
        int i2 = this.f13855;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (objArr[i3] != null && iArr[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    @Override // l.AbstractC19482
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13099(int i, String str) {
        Object obj;
        if (str == null) {
            if (this.f13857) {
                return this.f13854[this.f13855];
            }
        } else {
            Object[] objArr = this.f13849;
            int iM30015 = C11972.m30015(str.hashCode()) & this.f13859;
            Object obj2 = objArr[iM30015];
            if (obj2 != null) {
                if (str.equals(obj2)) {
                    return this.f13854[iM30015];
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f13859;
                    obj = objArr[iM30015];
                    if (obj == null) {
                    }
                } while (!str.equals(obj));
                return this.f13854[iM30015];
            }
        }
        return i;
    }

    @Override // l.AbstractC19482, l.InterfaceC19722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13100(String str, C7924 c7924) {
        int iM13097 = m13097(str);
        if (iM13097 >= 0) {
            return this.f13854[iM13097];
        }
        int iMo7848 = c7924.mo7848(str);
        m13094((-iM13097) - 1, iMo7848, str);
        return iMo7848;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f13851 == 0) {
            return;
        }
        this.f13851 = 0;
        this.f13857 = false;
        Arrays.fill(this.f13849, (Object) null);
    }

    @Override // l.AbstractC22466, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f13851;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13851 == 0;
    }

    @Override // l.InterfaceC19722
    /* JADX INFO: renamed from: ۙۙ */
    public final InterfaceC7767 mo7847() {
        if (this.f13860 == null) {
            this.f13860 = new C3314(this);
        }
        return this.f13860;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f13853 == null) {
            this.f13853 = new C17484(this);
        }
        return this.f13853;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f13852 == null) {
            this.f13852 = new C5552(this);
        }
        return this.f13852;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13101(int i) {
        Object obj;
        Object[] objArr = this.f13849;
        int[] iArr = this.f13854;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr2 = new int[i3];
        int i4 = this.f13855;
        int i5 = this.f13857 ? this.f13851 - 1 : this.f13851;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM30015 = C11972.m30015(obj.hashCode()) & i2;
                if (objArr2[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + 1) & i2;
                    } while (objArr2[iM30015] != null);
                }
                objArr2[iM30015] = objArr[i4];
                iArr2[iM30015] = iArr[i4];
                i5 = i6;
            } else {
                iArr2[i] = iArr[this.f13855];
                this.f13855 = i;
                this.f13859 = i2;
                this.f13856 = C11972.m30029(this.f13858, i);
                this.f13849 = objArr2;
                this.f13854 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C4060 c4060 = (C4060) super.clone();
            c4060.f13853 = null;
            c4060.f13852 = null;
            c4060.f13860 = null;
            c4060.f13857 = this.f13857;
            c4060.f13849 = (Object[]) this.f13849.clone();
            c4060.f13854 = (int[]) this.f13854.clone();
            return c4060;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC19482, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f13849;
        int[] iArr = this.f13854;
        int i = this.f13857 ? this.f13851 - 1 : this.f13851;
        int i2 = 0;
        int i3 = 0;
        int iHashCode = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iHashCode = obj.hashCode();
            }
            iHashCode ^= iArr[i2];
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        return this.f13857 ? i3 + iArr[this.f13855] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f13849;
        int[] iArr = this.f13854;
        C1823 c1823 = new C1823(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f13851;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM46974 = c1823.m46974();
            objectOutputStream.writeObject(objArr[iM46974]);
            objectOutputStream.writeInt(iArr[iM46974]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f13851;
        float f = this.f13858;
        int iM30014 = C11972.m30014(f, i2);
        this.f13855 = iM30014;
        this.f13856 = C11972.m30029(f, iM30014);
        int i3 = this.f13855;
        this.f13859 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f13849 = objArr;
        int[] iArr = new int[i3 + 1];
        this.f13854 = iArr;
        int i4 = this.f13851;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            int i6 = objectInputStream.readInt();
            if (object == null) {
                i = this.f13855;
                this.f13857 = true;
            } else {
                int iM30015 = C11972.m30015(object.hashCode());
                int i7 = this.f13859;
                while (true) {
                    i = iM30015 & i7;
                    if (objArr[i] != null) {
                        iM30015 = i + 1;
                        i7 = this.f13859;
                    }
                }
            }
            objArr[i] = object;
            iArr[i] = i6;
            i4 = i5;
        }
    }
}
