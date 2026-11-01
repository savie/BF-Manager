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

/* JADX INFO: renamed from: l.۬ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13016 extends AbstractC5543 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object[] f43408;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f43409;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43410;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f43411;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f43412;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int f43413;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int f43414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f43415;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC22685 f43416;

    public C13016() {
        throw null;
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C13016(InterfaceC22685 interfaceC22685) {
        this.f43416 = interfaceC22685;
        this.f43415 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f43409 = iM25124;
        this.f43414 = iM25124;
        this.f43413 = iM25124 - 1;
        this.f43411 = C9927.m25131(0.75f, iM25124);
        this.f43408 = new Object[this.f43409 + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f43415;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, collection.size());
            if (iM25124 > this.f43409) {
                m32195(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((collection.size() + this.f43410) / f))));
            if (iMin > this.f43409) {
                m32195(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (this.f43416.mo3247(obj, null)) {
            if (this.f43412) {
                return false;
            }
            this.f43412 = true;
            this.f43408[this.f43409] = obj;
        } else {
            Object[] objArr = this.f43408;
            int iM25125 = C9927.m25125(this.f43416.mo3246(obj)) & this.f43413;
            Object obj3 = objArr[iM25125];
            if (obj3 != null) {
                if (this.f43416.mo3247(obj3, obj)) {
                    return false;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f43413;
                    obj2 = objArr[iM25125];
                    if (obj2 != null) {
                    }
                } while (!this.f43416.mo3247(obj2, obj));
                return false;
            }
            objArr[iM25125] = obj;
        }
        int i = this.f43410;
        this.f43410 = i + 1;
        if (i >= this.f43411) {
            m32195(C9927.m25124(this.f43415, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32194(int i) {
        Object obj;
        this.f43410--;
        Object[] objArr = this.f43408;
        loop0: while (true) {
            int i2 = (i + 1) & this.f43413;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM25125 = C9927.m25125(this.f43416.mo3246(obj));
                    int i3 = this.f43413;
                    int i4 = iM25125 & i3;
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
        int i5 = this.f43409;
        if (i5 <= this.f43414 || this.f43410 >= this.f43411 / 4 || i5 <= 16) {
            return;
        }
        m32195(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f43416.mo3247(obj, null)) {
            if (this.f43412) {
                this.f43412 = false;
                Object[] objArr = this.f43408;
                int i = this.f43409;
                objArr[i] = null;
                int i2 = this.f43410 - 1;
                this.f43410 = i2;
                if (i > this.f43414 && i2 < this.f43411 / 4 && i > 16) {
                    m32195(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f43408;
            int iM25125 = C9927.m25125(this.f43416.mo3246(obj)) & this.f43413;
            Object obj3 = objArr2[iM25125];
            if (obj3 != null) {
                if (this.f43416.mo3247(obj, obj3)) {
                    m32194(iM25125);
                    return true;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f43413;
                    obj2 = objArr2[iM25125];
                    if (obj2 == null) {
                    }
                } while (!this.f43416.mo3247(obj, obj2));
                m32194(iM25125);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f43416.mo3247(obj, null)) {
            return this.f43412;
        }
        Object[] objArr = this.f43408;
        int iM25125 = C9927.m25125(this.f43416.mo3246(obj)) & this.f43413;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (!this.f43416.mo3247(obj, obj3)) {
            do {
                iM25125 = (iM25125 + 1) & this.f43413;
                obj2 = objArr[iM25125];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f43416.mo3247(obj, obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f43410 == 0) {
            return;
        }
        this.f43410 = 0;
        this.f43412 = false;
        Arrays.fill(this.f43408, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43410;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f43410 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C22188 c22188 = new C22188(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f43410;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c22188.next());
            i = i2;
        }
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C22188(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C22188(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C1020(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C1020(this);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f43408;
        if (this.f43412) {
            consumer.accept(objArr[this.f43409]);
        }
        int i = this.f43409;
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
    public final void m32195(int i) {
        Object obj;
        Object[] objArr = this.f43408;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f43409;
        int i4 = this.f43412 ? this.f43410 - 1 : this.f43410;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM25125 = C9927.m25125(this.f43416.mo3246(obj)) & i2;
                if (objArr2[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + 1) & i2;
                    } while (objArr2[iM25125] != null);
                }
                objArr2[iM25125] = objArr[i3];
                i4 = i5;
            } else {
                this.f43409 = i;
                this.f43413 = i2;
                this.f43411 = C9927.m25131(this.f43415, i);
                this.f43408 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C13016 c13016 = (C13016) super.clone();
            c13016.f43408 = (Object[]) this.f43408.clone();
            c13016.f43412 = this.f43412;
            c13016.f43416 = this.f43416;
            return c13016;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC5543, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f43408;
        int i = this.f43412 ? this.f43410 - 1 : this.f43410;
        int iMo3246 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iMo3246;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iMo3246 = this.f43416.mo3246(obj) + iMo3246;
            }
            i2++;
            i = i3;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM25125;
        objectInputStream.defaultReadObject();
        int i = this.f43410;
        float f = this.f43415;
        int iM25124 = C9927.m25124(f, i);
        this.f43409 = iM25124;
        this.f43411 = C9927.m25131(f, iM25124);
        int i2 = this.f43409;
        this.f43413 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f43408 = objArr;
        int i3 = this.f43410;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (this.f43416.mo3247(object, null)) {
                iM25125 = this.f43409;
                this.f43412 = true;
            } else {
                iM25125 = C9927.m25125(this.f43416.mo3246(object)) & this.f43413;
                if (objArr[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + 1) & this.f43413;
                    } while (objArr[iM25125] != null);
                }
            }
            objArr[iM25125] = object;
            i3 = i4;
        }
    }
}
