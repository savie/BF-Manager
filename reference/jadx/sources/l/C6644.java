package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6644 extends AbstractC6227 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f22434;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public transient int[] f22435;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f22436;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10131 f22437;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final transient int f22438;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18660 f22439;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22440;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f22441;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient Object[] f22442;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f22443;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17537 f22444;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient int f22445;

    public C6644(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f22434 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, i);
        this.f22445 = iM25124;
        this.f22438 = iM25124;
        this.f22443 = iM25124 - 1;
        this.f22436 = C9927.m25131(0.75f, iM25124);
        int i2 = this.f22445 + 1;
        this.f22442 = new Object[i2];
        this.f22435 = new int[i2];
    }

    public C6644() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int m18017(int i) {
        Object obj;
        int[] iArr = this.f22435;
        int i2 = iArr[i];
        this.f22440--;
        Object[] objArr = this.f22442;
        loop0: while (true) {
            int i3 = (i + 1) & this.f22443;
            while (true) {
                obj = objArr[i3];
                if (obj != null) {
                    int iM25125 = C9927.m25125(obj.hashCode());
                    int i4 = this.f22443;
                    int i5 = iM25125 & i4;
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
        int i6 = this.f22445;
        if (i6 > this.f22438 && this.f22440 < this.f22436 / 4 && i6 > 16) {
            m18021(i6 / 2);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m18013() {
        this.f22441 = false;
        Object[] objArr = this.f22442;
        int i = this.f22445;
        objArr[i] = null;
        int i2 = this.f22435[i];
        int i3 = this.f22440 - 1;
        this.f22440 = i3;
        if (i > this.f22438 && i3 < this.f22436 / 4 && i > 16) {
            m18021(i / 2);
        }
        return i2;
    }

    @Override // l.AbstractC6227, java.util.Map
    public final void putAll(Map map) {
        float f = this.f22434;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, map.size());
            if (iM25124 > this.f22445) {
                m18021(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f22440) / f))));
            if (iMin > this.f22445) {
                m18021(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m18018(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f22441 ? this.f22445 : -(this.f22445 + 1);
        }
        Object[] objArr = this.f22442;
        int iM25125 = C9927.m25125(obj.hashCode()) & this.f22443;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return -(iM25125 + 1);
        }
        if (obj.equals(obj3)) {
            return iM25125;
        }
        do {
            iM25125 = (iM25125 + 1) & this.f22443;
            obj2 = objArr[iM25125];
            if (obj2 == null) {
                return -(iM25125 + 1);
            }
        } while (!obj.equals(obj2));
        return iM25125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18014(int i, int i2, Object obj) {
        if (i == this.f22445) {
            this.f22441 = true;
        }
        this.f22442[i] = obj;
        this.f22435[i] = i2;
        int i3 = this.f22440;
        this.f22440 = i3 + 1;
        if (i3 >= this.f22436) {
            m18021(C9927.m25124(this.f22434, i3 + 2));
        }
    }

    @Override // l.AbstractC17516, l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18019(int i, Object obj) {
        int iM18018 = m18018(obj);
        if (iM18018 < 0) {
            m18014((-iM18018) - 1, i, obj);
            return 0;
        }
        int[] iArr = this.f22435;
        int i2 = iArr[iM18018];
        iArr[iM18018] = i;
        return i2;
    }

    @Override // l.AbstractC17516, l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18020(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f22441) {
                return m18013();
            }
            return 0;
        }
        Object[] objArr = this.f22442;
        int iM25125 = C9927.m25125(obj.hashCode()) & this.f22443;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return m18017(iM25125);
        }
        do {
            iM25125 = (iM25125 + 1) & this.f22443;
            obj2 = objArr[iM25125];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return m18017(iM25125);
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo18022(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f22441) {
                return this.f22435[this.f22445];
            }
            return 0;
        }
        Object[] objArr = this.f22442;
        int iM25125 = C9927.m25125(obj.hashCode()) & this.f22443;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return this.f22435[iM25125];
        }
        do {
            iM25125 = (iM25125 + 1) & this.f22443;
            obj2 = objArr[iM25125];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return this.f22435[iM25125];
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f22441;
        }
        Object[] objArr = this.f22442;
        int iM25125 = C9927.m25125(obj.hashCode()) & this.f22443;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM25125 = (iM25125 + 1) & this.f22443;
                obj2 = objArr[iM25125];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo17316(int i) {
        Object[] objArr = this.f22442;
        int[] iArr = this.f22435;
        if (this.f22441 && iArr[this.f22445] == i) {
            return true;
        }
        int i2 = this.f22445;
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

    @Override // l.AbstractC6227
    /* JADX INFO: renamed from: ۙ */
    public final int mo17278(int i, String str) {
        Object obj;
        if (str == null) {
            if (this.f22441) {
                return this.f22435[this.f22445];
            }
        } else {
            Object[] objArr = this.f22442;
            int iM25125 = C9927.m25125(str.hashCode()) & this.f22443;
            Object obj2 = objArr[iM25125];
            if (obj2 != null) {
                if (str.equals(obj2)) {
                    return this.f22435[iM25125];
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f22443;
                    obj = objArr[iM25125];
                    if (obj == null) {
                    }
                } while (!str.equals(obj));
                return this.f22435[iM25125];
            }
        }
        return i;
    }

    @Override // l.AbstractC6227, l.InterfaceC6248
    /* JADX INFO: renamed from: ۙ */
    public final int mo17279(String str, C22112 c22112) {
        int iM18018 = m18018(str);
        if (iM18018 >= 0) {
            return this.f22435[iM18018];
        }
        int iMo18022 = c22112.mo18022(str);
        m18014((-iM18018) - 1, iMo18022, str);
        return iMo18022;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f22440 == 0) {
            return;
        }
        this.f22440 = 0;
        this.f22441 = false;
        Arrays.fill(this.f22442, (Object) null);
    }

    @Override // l.AbstractC17516, l.InterfaceC6456
    public final int size() {
        return this.f22440;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f22440 == 0;
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۙۙ */
    public final InterfaceC18660 mo17317() {
        if (this.f22444 == null) {
            this.f22444 = new C5233(this);
        }
        return this.f22444;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f22439 == null) {
            this.f22439 = new C13701(this);
        }
        return this.f22439;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f22437 == null) {
            this.f22437 = new C14716(this);
        }
        return this.f22437;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18021(int i) {
        Object obj;
        Object[] objArr = this.f22442;
        int[] iArr = this.f22435;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr2 = new int[i3];
        int i4 = this.f22445;
        int i5 = this.f22441 ? this.f22440 - 1 : this.f22440;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM25125 = C9927.m25125(obj.hashCode()) & i2;
                if (objArr2[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + 1) & i2;
                    } while (objArr2[iM25125] != null);
                }
                objArr2[iM25125] = objArr[i4];
                iArr2[iM25125] = iArr[i4];
                i5 = i6;
            } else {
                iArr2[i] = iArr[this.f22445];
                this.f22445 = i;
                this.f22443 = i2;
                this.f22436 = C9927.m25131(this.f22434, i);
                this.f22442 = objArr2;
                this.f22435 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C6644 c6644 = (C6644) super.clone();
            c6644.f22439 = null;
            c6644.f22437 = null;
            c6644.f22444 = null;
            c6644.f22441 = this.f22441;
            c6644.f22442 = (Object[]) this.f22442.clone();
            c6644.f22435 = (int[]) this.f22435.clone();
            return c6644;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC6227, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f22442;
        int[] iArr = this.f22435;
        int i = this.f22441 ? this.f22440 - 1 : this.f22440;
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
        return this.f22441 ? i3 + iArr[this.f22445] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f22442;
        int[] iArr = this.f22435;
        C2014 c2014 = new C2014(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f22440;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM49177 = c2014.m49177();
            objectOutputStream.writeObject(objArr[iM49177]);
            objectOutputStream.writeInt(iArr[iM49177]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f22440;
        float f = this.f22434;
        int iM25124 = C9927.m25124(f, i2);
        this.f22445 = iM25124;
        this.f22436 = C9927.m25131(f, iM25124);
        int i3 = this.f22445;
        this.f22443 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f22442 = objArr;
        int[] iArr = new int[i3 + 1];
        this.f22435 = iArr;
        int i4 = this.f22440;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            int i6 = objectInputStream.readInt();
            if (object == null) {
                i = this.f22445;
                this.f22441 = true;
            } else {
                int iM25125 = C9927.m25125(object.hashCode());
                int i7 = this.f22443;
                while (true) {
                    i = iM25125 & i7;
                    if (objArr[i] != null) {
                        iM25125 = i + 1;
                        i7 = this.f22443;
                    }
                }
            }
            objArr[i] = object;
            iArr[i] = i6;
            i4 = i5;
        }
    }
}
