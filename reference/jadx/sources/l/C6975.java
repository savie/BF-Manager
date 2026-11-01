package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: l.ۜ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6975 extends AbstractC23867 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f23467;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22685 f23468;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f23469;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f23470;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient Object[] f23471;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final transient int f23472;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18660 f23473;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23474;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient boolean f23475;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient Object[] f23476;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f23477;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17228 f23478;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient int f23479;

    public C6975() {
        throw null;
    }

    public C6975(InterfaceC22685 interfaceC22685) {
        this.f23468 = interfaceC22685;
        this.f23467 = 0.75f;
        int iM25124 = C9927.m25124(0.75f, 16);
        this.f23479 = iM25124;
        this.f23472 = iM25124;
        this.f23477 = iM25124 - 1;
        this.f23470 = C9927.m25131(0.75f, iM25124);
        int i = this.f23479 + 1;
        this.f23476 = new Object[i];
        this.f23471 = new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object m18757(int i) {
        Object obj;
        Object[] objArr = this.f23471;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.f23474--;
        Object[] objArr2 = this.f23476;
        loop0: while (true) {
            int i2 = (i + 1) & this.f23477;
            while (true) {
                obj = objArr2[i2];
                if (obj != null) {
                    int iM25125 = C9927.m25125(this.f23468.mo3246(obj));
                    int i3 = this.f23477;
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
            objArr2[i] = obj;
            objArr[i] = objArr[i2];
            i = i2;
        }
        objArr2[i] = null;
        objArr[i] = null;
        int i5 = this.f23479;
        if (i5 > this.f23472 && this.f23474 < this.f23470 / 4 && i5 > 16) {
            m18760(i5 / 2);
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object m18756() {
        this.f23475 = false;
        Object[] objArr = this.f23476;
        int i = this.f23479;
        objArr[i] = null;
        Object[] objArr2 = this.f23471;
        Object obj = objArr2[i];
        objArr2[i] = null;
        int i2 = this.f23474 - 1;
        this.f23474 = i2;
        if (i > this.f23472 && i2 < this.f23470 / 4 && i > 16) {
            m18760(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC23867, java.util.Map
    public final void putAll(Map map) {
        float f = this.f23467;
        if (f <= 0.5d) {
            int iM25124 = C9927.m25124(f, map.size());
            if (iM25124 > this.f23479) {
                m18760(iM25124);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C9927.m25127((long) Math.ceil((map.size() + this.f23474) / f))));
            if (iMin > this.f23479) {
                m18760(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m18758(Object obj) {
        Object obj2;
        if (this.f23468.mo3247(obj, null)) {
            return this.f23475 ? this.f23479 : -(this.f23479 + 1);
        }
        Object[] objArr = this.f23476;
        int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & this.f23477;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return -(iM25125 + 1);
        }
        if (this.f23468.mo3247(obj, obj3)) {
            return iM25125;
        }
        do {
            iM25125 = (iM25125 + 1) & this.f23477;
            obj2 = objArr[iM25125];
            if (obj2 == null) {
                return -(iM25125 + 1);
            }
        } while (!this.f23468.mo3247(obj, obj2));
        return iM25125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18753(int i, Object obj, Object obj2) {
        if (i == this.f23479) {
            this.f23475 = true;
        }
        this.f23476[i] = obj;
        this.f23471[i] = obj2;
        int i2 = this.f23474;
        this.f23474 = i2 + 1;
        if (i2 >= this.f23470) {
            m18760(C9927.m25124(this.f23467, i2 + 2));
        }
    }

    @Override // l.InterfaceC5939, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM18758 = m18758(obj);
        if (iM18758 < 0) {
            m18753((-iM18758) - 1, obj, obj2);
            return null;
        }
        Object[] objArr = this.f23471;
        Object obj3 = objArr[iM18758];
        objArr[iM18758] = obj2;
        return obj3;
    }

    @Override // l.InterfaceC5939, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        if (this.f23468.mo3247(obj, null)) {
            if (this.f23475) {
                return m18756();
            }
        } else {
            Object[] objArr = this.f23476;
            int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & this.f23477;
            Object obj3 = objArr[iM25125];
            if (obj3 != null) {
                if (this.f23468.mo3247(obj, obj3)) {
                    return m18757(iM25125);
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f23477;
                    obj2 = objArr[iM25125];
                    if (obj2 == null) {
                    }
                } while (!this.f23468.mo3247(obj, obj2));
                return m18757(iM25125);
            }
        }
        return null;
    }

    @Override // l.InterfaceC6456
    public final Object get(Object obj) {
        Object obj2;
        if (!this.f23468.mo3247(obj, null)) {
            Object[] objArr = this.f23476;
            int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & this.f23477;
            Object obj3 = objArr[iM25125];
            if (obj3 != null) {
                if (this.f23468.mo3247(obj, obj3)) {
                    return this.f23471[iM25125];
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f23477;
                    obj2 = objArr[iM25125];
                    if (obj2 == null) {
                    }
                } while (!this.f23468.mo3247(obj, obj2));
                return this.f23471[iM25125];
            }
        } else if (this.f23475) {
            return this.f23471[this.f23479];
        }
        return null;
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (this.f23468.mo3247(obj, null)) {
            return this.f23475;
        }
        Object[] objArr = this.f23476;
        int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & this.f23477;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (!this.f23468.mo3247(obj, obj3)) {
            do {
                iM25125 = (iM25125 + 1) & this.f23477;
                obj2 = objArr[iM25125];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f23468.mo3247(obj, obj2));
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f23476;
        Object[] objArr2 = this.f23471;
        if (this.f23475 && C13638.equals(objArr2[this.f23479], obj)) {
            return true;
        }
        int i = this.f23479;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (objArr[i2] != null && C13638.equals(objArr2[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        if (!this.f23468.mo3247(obj, null)) {
            Object[] objArr = this.f23476;
            int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & this.f23477;
            Object obj4 = objArr[iM25125];
            if (obj4 != null) {
                if (this.f23468.mo3247(obj, obj4)) {
                    return this.f23471[iM25125];
                }
                do {
                    iM25125 = (iM25125 + 1) & this.f23477;
                    obj3 = objArr[iM25125];
                    if (obj3 == null) {
                    }
                } while (!this.f23468.mo3247(obj, obj3));
                return this.f23471[iM25125];
            }
        } else if (this.f23475) {
            return this.f23471[this.f23479];
        }
        return obj2;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        int iM18758 = m18758(obj);
        if (iM18758 >= 0) {
            return this.f23471[iM18758];
        }
        m18753((-iM18758) - 1, obj, obj2);
        return null;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final boolean remove(Object obj, Object obj2) {
        if (this.f23468.mo3247(obj, null)) {
            if (!this.f23475 || !C13638.equals(obj2, this.f23471[this.f23479])) {
                return false;
            }
            m18756();
            return true;
        }
        Object[] objArr = this.f23476;
        int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & this.f23477;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (this.f23468.mo3247(obj, obj3) && C13638.equals(obj2, this.f23471[iM25125])) {
            m18757(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & this.f23477;
            Object obj4 = objArr[iM25125];
            if (obj4 == null) {
                return false;
            }
            if (this.f23468.mo3247(obj, obj4) && C13638.equals(obj2, this.f23471[iM25125])) {
                m18757(iM25125);
                return true;
            }
        }
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM18758 = m18758(obj);
        if (iM18758 < 0 || !C13638.equals(obj2, this.f23471[iM18758])) {
            return false;
        }
        this.f23471[iM18758] = obj3;
        return true;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        int iM18758 = m18758(obj);
        if (iM18758 < 0) {
            return null;
        }
        Object[] objArr = this.f23471;
        Object obj3 = objArr[iM18758];
        objArr[iM18758] = obj2;
        return obj3;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        C13638.requireNonNull(biFunction);
        int iM18758 = m18758(obj);
        if (iM18758 < 0 || (obj2 = this.f23471[iM18758]) == null) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            if (this.f23468.mo3247(obj, null)) {
                m18756();
            } else {
                m18757(iM18758);
            }
            return null;
        }
        this.f23471[iM18758] = objApply;
        return objApply;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        C13638.requireNonNull(biFunction);
        int iM18758 = m18758(obj);
        Object objApply = biFunction.apply(obj, iM18758 >= 0 ? this.f23471[iM18758] : null);
        if (objApply == null) {
            if (iM18758 >= 0) {
                if (this.f23468.mo3247(obj, null)) {
                    m18756();
                } else {
                    m18757(iM18758);
                }
            }
            return null;
        }
        if (iM18758 < 0) {
            m18753((-iM18758) - 1, obj, objApply);
            return objApply;
        }
        this.f23471[iM18758] = objApply;
        return objApply;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        C13638.requireNonNull(biFunction);
        C13638.requireNonNull(obj2);
        int iM18758 = m18758(obj);
        if (iM18758 < 0 || (obj3 = this.f23471[iM18758]) == null) {
            if (iM18758 < 0) {
                m18753((-iM18758) - 1, obj, obj2);
                return obj2;
            }
            this.f23471[iM18758] = obj2;
            return obj2;
        }
        Object objApply = biFunction.apply(obj3, obj2);
        if (objApply == null) {
            if (this.f23468.mo3247(obj, null)) {
                m18756();
            } else {
                m18757(iM18758);
            }
            return null;
        }
        this.f23471[iM18758] = objApply;
        return objApply;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f23474 == 0) {
            return;
        }
        this.f23474 = 0;
        this.f23475 = false;
        Arrays.fill(this.f23476, (Object) null);
        Arrays.fill(this.f23471, (Object) null);
    }

    @Override // l.AbstractC11167, l.InterfaceC6456
    public final int size() {
        return this.f23474;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f23474 == 0;
    }

    @Override // l.AbstractC23867, java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        if (this.f23475) {
            Object[] objArr = this.f23476;
            int i = this.f23479;
            biConsumer.accept(objArr[i], this.f23471[i]);
        }
        Object[] objArr2 = this.f23476;
        int i2 = this.f23479;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return;
            }
            Object obj = objArr2[i3];
            if (obj != null) {
                biConsumer.accept(obj, this.f23471[i3]);
            }
            i2 = i3;
        }
    }

    @Override // l.InterfaceC5939
    /* JADX INFO: renamed from: ۜܰ */
    public final InterfaceC18660 mo16212() {
        if (this.f23478 == null) {
            this.f23478 = new C5564(this);
        }
        return this.f23478;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f23473 == null) {
            this.f23473 = new C14032(this);
        }
        return this.f23473;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f23469 == null) {
            this.f23469 = new C14407(this);
        }
        return this.f23469;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18759() {
        float f = this.f23474;
        float f2 = this.f23467;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f23479 || this.f23474 > C9927.m25131(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m18760(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18760(int i) {
        Object obj;
        Object[] objArr = this.f23476;
        Object[] objArr2 = this.f23471;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr3 = new Object[i3];
        Object[] objArr4 = new Object[i3];
        int i4 = this.f23479;
        int i5 = this.f23475 ? this.f23474 - 1 : this.f23474;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM25125 = C9927.m25125(this.f23468.mo3246(obj)) & i2;
                if (objArr3[iM25125] != null) {
                    do {
                        iM25125 = (iM25125 + 1) & i2;
                    } while (objArr3[iM25125] != null);
                }
                objArr3[iM25125] = objArr[i4];
                objArr4[iM25125] = objArr2[i4];
                i5 = i6;
            } else {
                objArr4[i] = objArr2[this.f23479];
                this.f23479 = i;
                this.f23477 = i2;
                this.f23470 = C9927.m25131(this.f23467, i);
                this.f23476 = objArr3;
                this.f23471 = objArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C6975 c6975 = (C6975) super.clone();
            c6975.f23473 = null;
            c6975.f23469 = null;
            c6975.f23478 = null;
            c6975.f23475 = this.f23475;
            c6975.f23476 = (Object[]) this.f23476.clone();
            c6975.f23471 = (Object[]) this.f23471.clone();
            c6975.f23468 = this.f23468;
            return c6975;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC23867, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f23476;
        Object[] objArr2 = this.f23471;
        int i = this.f23475 ? this.f23474 - 1 : this.f23474;
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
                iHashCode = this.f23468.mo3246(obj);
            }
            Object obj2 = objArr2[i2];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f23475) {
            return i3;
        }
        Object obj3 = objArr2[this.f23479];
        return i3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f23476;
        Object[] objArr2 = this.f23471;
        C1705 c1705 = new C1705(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f23474;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM50014 = c1705.m50014();
            objectOutputStream.writeObject(objArr[iM50014]);
            objectOutputStream.writeObject(objArr2[iM50014]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f23474;
        float f = this.f23467;
        int iM25124 = C9927.m25124(f, i2);
        this.f23479 = iM25124;
        this.f23470 = C9927.m25131(f, iM25124);
        int i3 = this.f23479;
        this.f23477 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f23476 = objArr;
        Object[] objArr2 = new Object[i3 + 1];
        this.f23471 = objArr2;
        int i4 = this.f23474;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (this.f23468.mo3247(object, null)) {
                i = this.f23479;
                this.f23475 = true;
            } else {
                int iM25125 = C9927.m25125(this.f23468.mo3246(object));
                int i6 = this.f23477;
                while (true) {
                    i = iM25125 & i6;
                    if (objArr[i] != null) {
                        iM25125 = i + 1;
                        i6 = this.f23477;
                    }
                }
            }
            objArr[i] = object;
            objArr2[i] = object2;
            i4 = i5;
        }
    }
}
