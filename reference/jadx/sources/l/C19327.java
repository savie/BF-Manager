package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19327 extends AbstractC9193 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int[] f62429;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final transient int f62430;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f62431;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f62432;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5509 f62433;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public transient Object[] f62434;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient int f62435;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f62436;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f62437;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f62438;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f62439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC2174 f62440;

    public C19327(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f62438 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, i);
        this.f62435 = iM30014;
        this.f62430 = iM30014;
        this.f62439 = iM30014 - 1;
        this.f62436 = C11972.m30029(0.75f, iM30014);
        int i2 = this.f62435 + 1;
        this.f62429 = new int[i2];
        this.f62434 = new Object[i2];
    }

    public C19327() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object m44709(int i) {
        int i2;
        Object[] objArr = this.f62434;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f62431--;
        int[] iArr = this.f62429;
        loop0: while (true) {
            int i3 = (i + 1) & this.f62439;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM30015 = C11972.m30015(i2);
                    int i4 = this.f62439;
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
            iArr[i] = i2;
            objArr[i] = objArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        objArr[i] = null;
        int i6 = this.f62435;
        if (i6 > this.f62430 && this.f62431 < this.f62436 / 4 && i6 > 16) {
            m44712(i6 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m44705() {
        this.f62437 = false;
        Object[] objArr = this.f62434;
        int i = this.f62435;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f62431 - 1;
        this.f62431 = i2;
        if (i > this.f62430 && i2 < this.f62436 / 4 && i > 16) {
            m44712(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC9193, java.util.Map
    public final void putAll(Map map) {
        float f = this.f62438;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, map.size());
            if (iM30014 > this.f62435) {
                m44712(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f62431) / f))));
            if (iMin > this.f62435) {
                m44712(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m44710(int i) {
        int i2;
        if (i == 0) {
            return this.f62437 ? this.f62435 : -(this.f62435 + 1);
        }
        int[] iArr = this.f62429;
        int iM30015 = C11972.m30015(i) & this.f62439;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return -(iM30015 + 1);
        }
        if (i == i3) {
            return iM30015;
        }
        do {
            iM30015 = (iM30015 + 1) & this.f62439;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return -(iM30015 + 1);
            }
        } while (i != i2);
        return iM30015;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44706(int i, int i2, Object obj) {
        if (i == this.f62435) {
            this.f62437 = true;
        }
        this.f62429[i] = i2;
        this.f62434[i] = obj;
        int i3 = this.f62431;
        this.f62431 = i3 + 1;
        if (i3 >= this.f62436) {
            m44712(C11972.m30014(this.f62438, i3 + 2));
        }
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        int iM44710 = m44710(i);
        if (iM44710 < 0) {
            m44706((-iM44710) - 1, i, obj);
            return null;
        }
        Object[] objArr = this.f62434;
        Object obj2 = objArr[iM44710];
        objArr[iM44710] = obj;
        return obj2;
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    public final Object remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f62437) {
                return m44705();
            }
            return null;
        }
        int[] iArr = this.f62429;
        int iM30015 = C11972.m30015(i) & this.f62439;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return m44709(iM30015);
        }
        do {
            iM30015 = (iM30015 + 1) & this.f62439;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return m44709(iM30015);
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        int i2;
        if (i == 0) {
            if (this.f62437) {
                return this.f62434[this.f62435];
            }
            return null;
        }
        int[] iArr = this.f62429;
        int iM30015 = C11972.m30015(i) & this.f62439;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return this.f62434[iM30015];
        }
        do {
            iM30015 = (iM30015 + 1) & this.f62439;
            i2 = iArr[iM30015];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.f62434[iM30015];
    }

    @Override // l.AbstractC9193, l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13467(int i) {
        int i2;
        if (i == 0) {
            return this.f62437;
        }
        int[] iArr = this.f62429;
        int iM30015 = C11972.m30015(i) & this.f62439;
        int i3 = iArr[iM30015];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM30015 = (iM30015 + 1) & this.f62439;
                i2 = iArr[iM30015];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int[] iArr = this.f62429;
        Object[] objArr = this.f62434;
        if (this.f62437 && C17359.equals(objArr[this.f62435], obj)) {
            return true;
        }
        int i = this.f62435;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && C17359.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m44711(int i, Object obj) {
        int iM44710 = m44710(i);
        if (iM44710 >= 0) {
            return this.f62434[iM44710];
        }
        m44706((-iM44710) - 1, i, obj);
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f62431 == 0) {
            return;
        }
        this.f62431 = 0;
        this.f62437 = false;
        Arrays.fill(this.f62429, 0);
        Arrays.fill(this.f62434, (Object) null);
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f62431;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f62431 == 0;
    }

    @Override // l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC7767 mo13468() {
        if (this.f62440 == null) {
            this.f62440 = new C14851(this);
        }
        return this.f62440;
    }

    @Override // java.util.Map
    public final InterfaceC5509 keySet() {
        if (this.f62433 == null) {
            this.f62433 = new C6649(this);
        }
        return this.f62433;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f62432 == null) {
            this.f62432 = new C16343(this);
        }
        return this.f62432;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44712(int i) {
        int i2;
        int[] iArr = this.f62429;
        Object[] objArr = this.f62434;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        Object[] objArr2 = new Object[i4];
        int i5 = this.f62435;
        int i6 = this.f62437 ? this.f62431 - 1 : this.f62431;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM30015 = C11972.m30015(i2) & i3;
                if (iArr2[iM30015] != 0) {
                    do {
                        iM30015 = (iM30015 + 1) & i3;
                    } while (iArr2[iM30015] != 0);
                }
                iArr2[iM30015] = iArr[i5];
                objArr2[iM30015] = objArr[i5];
                i6 = i7;
            } else {
                objArr2[i] = objArr[this.f62435];
                this.f62435 = i;
                this.f62439 = i3;
                this.f62436 = C11972.m30029(this.f62438, i);
                this.f62429 = iArr2;
                this.f62434 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C19327 c19327 = (C19327) super.clone();
            c19327.f62433 = null;
            c19327.f62432 = null;
            c19327.f62440 = null;
            c19327.f62437 = this.f62437;
            c19327.f62429 = (int[]) this.f62429.clone();
            c19327.f62434 = (Object[]) this.f62434.clone();
            return c19327;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC9193, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int[] iArr = this.f62429;
        Object[] objArr = this.f62434;
        int i = this.f62437 ? this.f62431 - 1 : this.f62431;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                iHashCode = iArr[i2];
                if (iHashCode != 0) {
                    break;
                }
                i2++;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                iHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f62437) {
            return i3;
        }
        Object obj2 = objArr[this.f62435];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f62429;
        Object[] objArr = this.f62434;
        C23803 c23803 = new C23803(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f62431;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM49040 = c23803.m49040();
            objectOutputStream.writeInt(iArr[iM49040]);
            objectOutputStream.writeObject(objArr[iM49040]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f62431;
        float f = this.f62438;
        int iM30014 = C11972.m30014(f, i2);
        this.f62435 = iM30014;
        this.f62436 = C11972.m30029(f, iM30014);
        int i3 = this.f62435;
        this.f62439 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f62429 = iArr;
        Object[] objArr = new Object[i3 + 1];
        this.f62434 = objArr;
        int i4 = this.f62431;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (i6 == 0) {
                i = this.f62435;
                this.f62437 = true;
            } else {
                int iM30015 = C11972.m30015(i6);
                int i7 = this.f62439;
                while (true) {
                    i = iM30015 & i7;
                    if (iArr[i] != 0) {
                        iM30015 = i + 1;
                        i7 = this.f62439;
                    }
                }
            }
            iArr[i] = i6;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
