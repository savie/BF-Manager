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

/* JADX INFO: renamed from: l.᩺۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes2.dex */
public final class C24176 extends AbstractC3074 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f78303;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f78304;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f78305;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC18449 f78306;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f78307;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f78308;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Object[] f78309;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f78310;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f78311;

    public C24176() {
        throw null;
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C24176(InterfaceC18449 interfaceC18449) {
        this.f78306 = interfaceC18449;
        this.f78311 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f78307 = iM30014;
        this.f78310 = iM30014;
        this.f78303 = iM30014 - 1;
        this.f78305 = C11972.m30029(0.75f, iM30014);
        this.f78309 = new Object[this.f78307 + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f78311;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, collection.size());
            if (iM30014 > this.f78307) {
                m54152(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((collection.size() + this.f78304) / f))));
            if (iMin > this.f78307) {
                m54152(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (this.f78306.mo25786(obj, null)) {
            if (this.f78308) {
                return false;
            }
            this.f78308 = true;
            this.f78309[this.f78307] = obj;
        } else {
            Object[] objArr = this.f78309;
            int iM30015 = C11972.m30015(this.f78306.mo25785(obj)) & this.f78303;
            Object obj3 = objArr[iM30015];
            if (obj3 != null) {
                if (this.f78306.mo25786(obj3, obj)) {
                    return false;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f78303;
                    obj2 = objArr[iM30015];
                    if (obj2 != null) {
                    }
                } while (!this.f78306.mo25786(obj2, obj));
                return false;
            }
            objArr[iM30015] = obj;
        }
        int i = this.f78304;
        this.f78304 = i + 1;
        if (i >= this.f78305) {
            m54152(C11972.m30014(this.f78311, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m54151(int i) {
        Object obj;
        this.f78304--;
        Object[] objArr = this.f78309;
        loop0: while (true) {
            int i2 = (i + 1) & this.f78303;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM30015 = C11972.m30015(this.f78306.mo25785(obj));
                    int i3 = this.f78303;
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
        int i5 = this.f78307;
        if (i5 <= this.f78310 || this.f78304 >= this.f78305 / 4 || i5 <= 16) {
            return;
        }
        m54152(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f78306.mo25786(obj, null)) {
            if (this.f78308) {
                this.f78308 = false;
                Object[] objArr = this.f78309;
                int i = this.f78307;
                objArr[i] = null;
                int i2 = this.f78304 - 1;
                this.f78304 = i2;
                if (i > this.f78310 && i2 < this.f78305 / 4 && i > 16) {
                    m54152(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f78309;
            int iM30015 = C11972.m30015(this.f78306.mo25785(obj)) & this.f78303;
            Object obj3 = objArr2[iM30015];
            if (obj3 != null) {
                if (this.f78306.mo25786(obj, obj3)) {
                    m54151(iM30015);
                    return true;
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f78303;
                    obj2 = objArr2[iM30015];
                    if (obj2 == null) {
                    }
                } while (!this.f78306.mo25786(obj, obj2));
                m54151(iM30015);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f78306.mo25786(obj, null)) {
            return this.f78308;
        }
        Object[] objArr = this.f78309;
        int iM30015 = C11972.m30015(this.f78306.mo25785(obj)) & this.f78303;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (!this.f78306.mo25786(obj, obj3)) {
            do {
                iM30015 = (iM30015 + 1) & this.f78303;
                obj2 = objArr[iM30015];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f78306.mo25786(obj, obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f78304 == 0) {
            return;
        }
        this.f78304 = 0;
        this.f78308 = false;
        Arrays.fill(this.f78309, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f78304;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f78304 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C12241 c12241 = new C12241(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f78304;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c12241.next());
            i = i2;
        }
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C12241(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C12241(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C6276(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C6276(this);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f78309;
        if (this.f78308) {
            consumer.accept(objArr[this.f78307]);
        }
        int i = this.f78307;
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
    public final void m54152(int i) {
        Object obj;
        Object[] objArr = this.f78309;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f78307;
        int i4 = this.f78308 ? this.f78304 - 1 : this.f78304;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM30015 = C11972.m30015(this.f78306.mo25785(obj)) & i2;
                if (objArr2[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + 1) & i2;
                    } while (objArr2[iM30015] != null);
                }
                objArr2[iM30015] = objArr[i3];
                i4 = i5;
            } else {
                this.f78307 = i;
                this.f78303 = i2;
                this.f78305 = C11972.m30029(this.f78311, i);
                this.f78309 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C24176 c24176 = (C24176) super.clone();
            c24176.f78309 = (Object[]) this.f78309.clone();
            c24176.f78308 = this.f78308;
            c24176.f78306 = this.f78306;
            return c24176;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC3074, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f78309;
        int i = this.f78308 ? this.f78304 - 1 : this.f78304;
        int iMo25785 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iMo25785;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iMo25785 = this.f78306.mo25785(obj) + iMo25785;
            }
            i2++;
            i = i3;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM30015;
        objectInputStream.defaultReadObject();
        int i = this.f78304;
        float f = this.f78311;
        int iM30014 = C11972.m30014(f, i);
        this.f78307 = iM30014;
        this.f78305 = C11972.m30029(f, iM30014);
        int i2 = this.f78307;
        this.f78303 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f78309 = objArr;
        int i3 = this.f78304;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (this.f78306.mo25786(object, null)) {
                iM30015 = this.f78307;
                this.f78308 = true;
            } else {
                iM30015 = C11972.m30015(this.f78306.mo25785(object)) & this.f78303;
                if (objArr[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + 1) & this.f78303;
                    } while (objArr[iM30015] != null);
                }
            }
            objArr[iM30015] = object;
            i3 = i4;
        }
    }
}
