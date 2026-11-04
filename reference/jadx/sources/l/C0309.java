package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0309 extends AbstractC3074 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f1657;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f1658;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f1659;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f1660;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f1661;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Object[] f1662;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f1663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f1664 = 0.75f;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C0309() {
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f1660 = iM30014;
        this.f1663 = iM30014;
        this.f1657 = iM30014 - 1;
        this.f1659 = C11972.m30029(0.75f, iM30014);
        this.f1662 = new Object[this.f1660 + 1];
    }

    static {
        C15448.of(new C4873(1), new C4038(), new C14478(), EnumC13211.UNORDERED);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f1664;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, collection.size());
            if (iM30014 > this.f1660) {
                m1898(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((collection.size() + this.f1658) / f))));
            if (iMin > this.f1660) {
                m1898(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f1661) {
                return false;
            }
            this.f1661 = true;
        } else {
            Object[] objArr = this.f1662;
            int iM30015 = C11972.m30015(obj.hashCode()) & this.f1657;
            Object obj3 = objArr[iM30015];
            if (obj3 != null) {
                if (obj3.equals(obj)) {
                    return false;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f1657;
                    obj2 = objArr[iM30015];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(obj));
                return false;
            }
            objArr[iM30015] = obj;
        }
        int i = this.f1658;
        this.f1658 = i + 1;
        if (i >= this.f1659) {
            m1898(C11972.m30014(this.f1664, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m1897(int i) {
        Object obj;
        this.f1658--;
        Object[] objArr = this.f1662;
        loop0: while (true) {
            int i2 = (i + 1) & this.f1657;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM30015 = C11972.m30015(obj.hashCode());
                    int i3 = this.f1657;
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
            objArr[i] = obj;
            i = i2;
        }
        objArr[i] = null;
        int i5 = this.f1660;
        if (i5 <= this.f1663 || this.f1658 >= this.f1659 / 4 || i5 <= 16) {
            return;
        }
        m1898(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f1661) {
                this.f1661 = false;
                Object[] objArr = this.f1662;
                int i = this.f1660;
                objArr[i] = null;
                int i2 = this.f1658 - 1;
                this.f1658 = i2;
                if (i > this.f1663 && i2 < this.f1659 / 4 && i > 16) {
                    m1898(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f1662;
            int iM30015 = C11972.m30015(obj.hashCode()) & this.f1657;
            Object obj3 = objArr2[iM30015];
            if (obj3 != null) {
                if (obj.equals(obj3)) {
                    m1897(iM30015);
                    return true;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f1657;
                    obj2 = objArr2[iM30015];
                    if (obj2 == null) {
                    }
                } while (!obj.equals(obj2));
                m1897(iM30015);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f1661;
        }
        Object[] objArr = this.f1662;
        int iM30015 = C11972.m30015(obj.hashCode()) & this.f1657;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM30015 = (iM30015 + 1) & this.f1657;
                obj2 = objArr[iM30015];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1658 == 0) {
            return;
        }
        this.f1658 = 0;
        this.f1661 = false;
        Arrays.fill(this.f1662, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1658;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1658 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C21192 c21192 = new C21192(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f1658;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c21192.next());
            i = i2;
        }
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21192(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C21192(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C18208(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C18208(this);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f1662;
        if (this.f1661) {
            consumer.accept(objArr[this.f1660]);
        }
        int i = this.f1660;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            Object obj = objArr[i2];
            if (obj != null) {
                consumer.accept(obj);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1898(int i) {
        Object obj;
        Object[] objArr = this.f1662;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f1660;
        int i4 = this.f1661 ? this.f1658 - 1 : this.f1658;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM30015 = C11972.m30015(obj.hashCode()) & i2;
                if (objArr2[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + 1) & i2;
                    } while (objArr2[iM30015] != null);
                }
                objArr2[iM30015] = objArr[i3];
                i4 = i5;
            } else {
                this.f1660 = i;
                this.f1657 = i2;
                this.f1659 = C11972.m30029(this.f1664, i);
                this.f1662 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C0309 c0309 = (C0309) super.clone();
            c0309.f1662 = (Object[]) this.f1662.clone();
            c0309.f1661 = this.f1661;
            return c0309;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC3074, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f1662;
        int i = this.f1661 ? this.f1658 - 1 : this.f1658;
        int iHashCode = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iHashCode = obj.hashCode() + iHashCode;
            }
            i2++;
            i = i3;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM30015;
        objectInputStream.defaultReadObject();
        int i = this.f1658;
        float f = this.f1664;
        int iM30014 = C11972.m30014(f, i);
        this.f1660 = iM30014;
        this.f1659 = C11972.m30029(f, iM30014);
        int i2 = this.f1660;
        this.f1657 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f1662 = objArr;
        int i3 = this.f1658;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (object == null) {
                iM30015 = this.f1660;
                this.f1661 = true;
            } else {
                iM30015 = C11972.m30015(object.hashCode()) & this.f1657;
                if (objArr[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + 1) & this.f1657;
                    } while (objArr[iM30015] != null);
                }
            }
            objArr[iM30015] = object;
            i3 = i4;
        }
    }
}
