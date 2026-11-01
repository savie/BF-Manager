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

/* JADX INFO: renamed from: l.ᩳۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17954 extends AbstractC5543 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object[] f57420;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f57421;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f57422;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f57423;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f57424;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int f57425;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int f57426;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f57427 = 0.75f;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C17954() {
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f57421 = iM25124;
        this.f57426 = iM25124;
        this.f57425 = iM25124 - 1;
        this.f57423 = C9927.m25131(0.75f, iM25124);
        this.f57420 = new Object[this.f57421 + 1];
    }

    static {
        C11064.of(new C3842(), new C6665(), new C22894(), EnumC23764.UNORDERED);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f57427;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, collection.size());
            if (iM25124 > this.f57421) {
                m41780(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((collection.size() + this.f57422) / f))));
            if (iMin > this.f57421) {
                m41780(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f57424) {
                return false;
            }
            this.f57424 = true;
        } else {
            Object[] objArr = this.f57420;
            int iM25125 = C9927.m25125(obj.hashCode()) & this.f57425;
            Object obj3 = objArr[iM25125];
            if (obj3 != null) {
                if (obj3.equals(obj)) {
                    return false;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f57425;
                    obj2 = objArr[iM25125];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(obj));
                return false;
            }
            objArr[iM25125] = obj;
        }
        int i = this.f57422;
        this.f57422 = i + 1;
        if (i >= this.f57423) {
            m41780(C9927.m25124(this.f57427, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m41779(int i) {
        Object obj;
        this.f57422--;
        Object[] objArr = this.f57420;
        loop0: while (true) {
            int i2 = (i + 1) & this.f57425;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM25125 = C9927.m25125(obj.hashCode());
                    int i3 = this.f57425;
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
        int i5 = this.f57421;
        if (i5 <= this.f57426 || this.f57422 >= this.f57423 / 4 || i5 <= 16) {
            return;
        }
        m41780(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f57424) {
                this.f57424 = false;
                Object[] objArr = this.f57420;
                int i = this.f57421;
                objArr[i] = null;
                int i2 = this.f57422 - 1;
                this.f57422 = i2;
                if (i > this.f57426 && i2 < this.f57423 / 4 && i > 16) {
                    m41780(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f57420;
            int iM25125 = C9927.m25125(obj.hashCode()) & this.f57425;
            Object obj3 = objArr2[iM25125];
            if (obj3 != null) {
                if (obj.equals(obj3)) {
                    m41779(iM25125);
                    return true;
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f57425;
                    obj2 = objArr2[iM25125];
                    if (obj2 == null) {
                    }
                } while (!obj.equals(obj2));
                m41779(iM25125);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f57424;
        }
        Object[] objArr = this.f57420;
        int iM25125 = C9927.m25125(obj.hashCode()) & this.f57425;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM25125 = (iM25125 + 1) & this.f57425;
                obj2 = objArr[iM25125];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f57422 == 0) {
            return;
        }
        this.f57422 = 0;
        this.f57424 = false;
        Arrays.fill(this.f57420, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f57422;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f57422 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C15133 c15133 = new C15133(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f57422;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c15133.next());
            i = i2;
        }
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C15133(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C15133(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C21482(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C21482(this);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f57420;
        if (this.f57424) {
            consumer.accept(objArr[this.f57421]);
        }
        int i = this.f57421;
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
    public final void m41780(int i) {
        Object obj;
        Object[] objArr = this.f57420;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f57421;
        int i4 = this.f57424 ? this.f57422 - 1 : this.f57422;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM25125 = C9927.m25125(obj.hashCode()) & i2;
                if (objArr2[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + 1) & i2;
                    } while (objArr2[iM25125] != null);
                }
                objArr2[iM25125] = objArr[i3];
                i4 = i5;
            } else {
                this.f57421 = i;
                this.f57425 = i2;
                this.f57423 = C9927.m25131(this.f57427, i);
                this.f57420 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C17954 c17954 = (C17954) super.clone();
            c17954.f57420 = (Object[]) this.f57420.clone();
            c17954.f57424 = this.f57424;
            return c17954;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC5543, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f57420;
        int i = this.f57424 ? this.f57422 - 1 : this.f57422;
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
        int iM25125;
        objectInputStream.defaultReadObject();
        int i = this.f57422;
        float f = this.f57427;
        int iM25124 = C9927.m25124(f, i);
        this.f57421 = iM25124;
        this.f57423 = C9927.m25131(f, iM25124);
        int i2 = this.f57421;
        this.f57425 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f57420 = objArr;
        int i3 = this.f57422;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (object == null) {
                iM25125 = this.f57421;
                this.f57424 = true;
            } else {
                iM25125 = C9927.m25125(object.hashCode()) & this.f57425;
                if (objArr[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + 1) & this.f57425;
                    } while (objArr[iM25125] != null);
                }
            }
            objArr[iM25125] = object;
            i3 = i4;
        }
    }
}
