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

/* JADX INFO: renamed from: l.ۘۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3864 extends AbstractC12769 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object[] f13181;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final transient int f13182;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f13183;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public transient Object[] f13184;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC7767 f13185;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC18449 f13186;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient int f13187;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient int f13188;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f13189;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient boolean f13190;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f13191;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f13192;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22510 f13193;

    public C3864() {
        throw null;
    }

    public C3864(InterfaceC18449 interfaceC18449) {
        this.f13186 = interfaceC18449;
        this.f13191 = 0.75f;
        int iM30014 = C11972.m30014(0.75f, 16);
        this.f13187 = iM30014;
        this.f13182 = iM30014;
        this.f13192 = iM30014 - 1;
        this.f13188 = C11972.m30029(0.75f, iM30014);
        int i = this.f13187 + 1;
        this.f13181 = new Object[i];
        this.f13184 = new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object m12500(int i) {
        Object obj;
        Object[] objArr = this.f13184;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.f13183--;
        Object[] objArr2 = this.f13181;
        loop0: while (true) {
            int i2 = (i + 1) & this.f13192;
            while (true) {
                obj = objArr2[i2];
                if (obj != null) {
                    int iM30015 = C11972.m30015(this.f13186.mo25785(obj));
                    int i3 = this.f13192;
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
            objArr2[i] = obj;
            objArr[i] = objArr[i2];
            i = i2;
        }
        objArr2[i] = null;
        objArr[i] = null;
        int i5 = this.f13187;
        if (i5 > this.f13182 && this.f13183 < this.f13188 / 4 && i5 > 16) {
            m12502(i5 / 2);
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object m12499() {
        this.f13190 = false;
        Object[] objArr = this.f13181;
        int i = this.f13187;
        objArr[i] = null;
        Object[] objArr2 = this.f13184;
        Object obj = objArr2[i];
        objArr2[i] = null;
        int i2 = this.f13183 - 1;
        this.f13183 = i2;
        if (i > this.f13182 && i2 < this.f13188 / 4 && i > 16) {
            m12502(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC12769, java.util.Map
    public final void putAll(Map map) {
        float f = this.f13191;
        if (f <= 0.5d) {
            int iM30014 = C11972.m30014(f, map.size());
            if (iM30014 > this.f13187) {
                m12502(iM30014);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C11972.m30016((long) Math.ceil((map.size() + this.f13183) / f))));
            if (iMin > this.f13187) {
                m12502(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m12498(Object obj) {
        Object obj2;
        if (this.f13186.mo25786(obj, null)) {
            return this.f13190 ? this.f13187 : -(this.f13187 + 1);
        }
        Object[] objArr = this.f13181;
        int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & this.f13192;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return -(iM30015 + 1);
        }
        if (this.f13186.mo25786(obj, obj3)) {
            return iM30015;
        }
        do {
            iM30015 = (iM30015 + 1) & this.f13192;
            obj2 = objArr[iM30015];
            if (obj2 == null) {
                return -(iM30015 + 1);
            }
        } while (!this.f13186.mo25786(obj, obj2));
        return iM30015;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12495(int i, Object obj, Object obj2) {
        if (i == this.f13187) {
            this.f13190 = true;
        }
        this.f13181[i] = obj;
        this.f13184[i] = obj2;
        int i2 = this.f13183;
        this.f13183 = i2 + 1;
        if (i2 >= this.f13188) {
            m12502(C11972.m30014(this.f13191, i2 + 2));
        }
    }

    @Override // l.InterfaceC19526, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM12498 = m12498(obj);
        if (iM12498 < 0) {
            m12495((-iM12498) - 1, obj, obj2);
            return null;
        }
        Object[] objArr = this.f13184;
        Object obj3 = objArr[iM12498];
        objArr[iM12498] = obj2;
        return obj3;
    }

    @Override // l.InterfaceC19526, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        if (this.f13186.mo25786(obj, null)) {
            if (this.f13190) {
                return m12499();
            }
        } else {
            Object[] objArr = this.f13181;
            int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & this.f13192;
            Object obj3 = objArr[iM30015];
            if (obj3 != null) {
                if (this.f13186.mo25786(obj, obj3)) {
                    return m12500(iM30015);
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f13192;
                    obj2 = objArr[iM30015];
                    if (obj2 == null) {
                    }
                } while (!this.f13186.mo25786(obj, obj2));
                return m12500(iM30015);
            }
        }
        return null;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (!this.f13186.mo25786(obj, null)) {
            Object[] objArr = this.f13181;
            int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & this.f13192;
            Object obj3 = objArr[iM30015];
            if (obj3 != null) {
                if (this.f13186.mo25786(obj, obj3)) {
                    return this.f13184[iM30015];
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f13192;
                    obj2 = objArr[iM30015];
                    if (obj2 == null) {
                    }
                } while (!this.f13186.mo25786(obj, obj2));
                return this.f13184[iM30015];
            }
        } else if (this.f13190) {
            return this.f13184[this.f13187];
        }
        return null;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (this.f13186.mo25786(obj, null)) {
            return this.f13190;
        }
        Object[] objArr = this.f13181;
        int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & this.f13192;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (!this.f13186.mo25786(obj, obj3)) {
            do {
                iM30015 = (iM30015 + 1) & this.f13192;
                obj2 = objArr[iM30015];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f13186.mo25786(obj, obj2));
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f13181;
        Object[] objArr2 = this.f13184;
        if (this.f13190 && C17359.equals(objArr2[this.f13187], obj)) {
            return true;
        }
        int i = this.f13187;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (objArr[i2] != null && C17359.equals(objArr2[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        if (!this.f13186.mo25786(obj, null)) {
            Object[] objArr = this.f13181;
            int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & this.f13192;
            Object obj4 = objArr[iM30015];
            if (obj4 != null) {
                if (this.f13186.mo25786(obj, obj4)) {
                    return this.f13184[iM30015];
                }
                do {
                    iM30015 = (iM30015 + 1) & this.f13192;
                    obj3 = objArr[iM30015];
                    if (obj3 == null) {
                    }
                } while (!this.f13186.mo25786(obj, obj3));
                return this.f13184[iM30015];
            }
        } else if (this.f13190) {
            return this.f13184[this.f13187];
        }
        return obj2;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        int iM12498 = m12498(obj);
        if (iM12498 >= 0) {
            return this.f13184[iM12498];
        }
        m12495((-iM12498) - 1, obj, obj2);
        return null;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final boolean remove(Object obj, Object obj2) {
        if (this.f13186.mo25786(obj, null)) {
            if (!this.f13190 || !C17359.equals(obj2, this.f13184[this.f13187])) {
                return false;
            }
            m12499();
            return true;
        }
        Object[] objArr = this.f13181;
        int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & this.f13192;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (this.f13186.mo25786(obj, obj3) && C17359.equals(obj2, this.f13184[iM30015])) {
            m12500(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & this.f13192;
            Object obj4 = objArr[iM30015];
            if (obj4 == null) {
                return false;
            }
            if (this.f13186.mo25786(obj, obj4) && C17359.equals(obj2, this.f13184[iM30015])) {
                m12500(iM30015);
                return true;
            }
        }
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM12498 = m12498(obj);
        if (iM12498 < 0 || !C17359.equals(obj2, this.f13184[iM12498])) {
            return false;
        }
        this.f13184[iM12498] = obj3;
        return true;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        int iM12498 = m12498(obj);
        if (iM12498 < 0) {
            return null;
        }
        Object[] objArr = this.f13184;
        Object obj3 = objArr[iM12498];
        objArr[iM12498] = obj2;
        return obj3;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        C17359.requireNonNull(biFunction);
        int iM12498 = m12498(obj);
        if (iM12498 < 0 || (obj2 = this.f13184[iM12498]) == null) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            if (this.f13186.mo25786(obj, null)) {
                m12499();
            } else {
                m12500(iM12498);
            }
            return null;
        }
        this.f13184[iM12498] = objApply;
        return objApply;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        C17359.requireNonNull(biFunction);
        int iM12498 = m12498(obj);
        Object objApply = biFunction.apply(obj, iM12498 >= 0 ? this.f13184[iM12498] : null);
        if (objApply == null) {
            if (iM12498 >= 0) {
                if (this.f13186.mo25786(obj, null)) {
                    m12499();
                } else {
                    m12500(iM12498);
                }
            }
            return null;
        }
        if (iM12498 < 0) {
            m12495((-iM12498) - 1, obj, objApply);
            return objApply;
        }
        this.f13184[iM12498] = objApply;
        return objApply;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        C17359.requireNonNull(biFunction);
        C17359.requireNonNull(obj2);
        int iM12498 = m12498(obj);
        if (iM12498 < 0 || (obj3 = this.f13184[iM12498]) == null) {
            if (iM12498 < 0) {
                m12495((-iM12498) - 1, obj, obj2);
                return obj2;
            }
            this.f13184[iM12498] = obj2;
            return obj2;
        }
        Object objApply = biFunction.apply(obj3, obj2);
        if (objApply == null) {
            if (this.f13186.mo25786(obj, null)) {
                m12499();
            } else {
                m12500(iM12498);
            }
            return null;
        }
        this.f13184[iM12498] = objApply;
        return objApply;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f13183 == 0) {
            return;
        }
        this.f13183 = 0;
        this.f13190 = false;
        Arrays.fill(this.f13181, (Object) null);
        Arrays.fill(this.f13184, (Object) null);
    }

    @Override // l.AbstractC15006, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f13183;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13183 == 0;
    }

    @Override // l.AbstractC12769, java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        if (this.f13190) {
            Object[] objArr = this.f13181;
            int i = this.f13187;
            biConsumer.accept(objArr[i], this.f13184[i]);
        }
        Object[] objArr2 = this.f13181;
        int i2 = this.f13187;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return;
            }
            Object obj = objArr2[i3];
            if (obj != null) {
                biConsumer.accept(obj, this.f13184[i3]);
            }
            i2 = i3;
        }
    }

    @Override // l.InterfaceC19526
    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC7767 mo12503() {
        if (this.f13193 == null) {
            this.f13193 = new C3118(this);
        }
        return this.f13193;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f13185 == null) {
            this.f13185 = new C17288(this);
        }
        return this.f13185;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f13189 == null) {
            this.f13189 = new C5356(this);
        }
        return this.f13189;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12501() {
        float f = this.f13183;
        float f2 = this.f13191;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f13187 || this.f13183 > C11972.m30029(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m12502(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m12502(int i) {
        Object obj;
        Object[] objArr = this.f13181;
        Object[] objArr2 = this.f13184;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr3 = new Object[i3];
        Object[] objArr4 = new Object[i3];
        int i4 = this.f13187;
        int i5 = this.f13190 ? this.f13183 - 1 : this.f13183;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM30015 = C11972.m30015(this.f13186.mo25785(obj)) & i2;
                if (objArr3[iM30015] != null) {
                    do {
                        iM30015 = (iM30015 + 1) & i2;
                    } while (objArr3[iM30015] != null);
                }
                objArr3[iM30015] = objArr[i4];
                objArr4[iM30015] = objArr2[i4];
                i5 = i6;
            } else {
                objArr4[i] = objArr2[this.f13187];
                this.f13187 = i;
                this.f13192 = i2;
                this.f13188 = C11972.m30029(this.f13191, i);
                this.f13181 = objArr3;
                this.f13184 = objArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C3864 c3864 = (C3864) super.clone();
            c3864.f13185 = null;
            c3864.f13189 = null;
            c3864.f13193 = null;
            c3864.f13190 = this.f13190;
            c3864.f13181 = (Object[]) this.f13181.clone();
            c3864.f13184 = (Object[]) this.f13184.clone();
            c3864.f13186 = this.f13186;
            return c3864;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC12769, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f13181;
        Object[] objArr2 = this.f13184;
        int i = this.f13190 ? this.f13183 - 1 : this.f13183;
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
                iHashCode = this.f13186.mo25785(obj);
            }
            Object obj2 = objArr2[i2];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f13190) {
            return i3;
        }
        Object obj3 = objArr2[this.f13187];
        return i3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f13181;
        Object[] objArr2 = this.f13184;
        C1627 c1627 = new C1627(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f13183;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM46538 = c1627.m46538();
            objectOutputStream.writeObject(objArr[iM46538]);
            objectOutputStream.writeObject(objArr2[iM46538]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f13183;
        float f = this.f13191;
        int iM30014 = C11972.m30014(f, i2);
        this.f13187 = iM30014;
        this.f13188 = C11972.m30029(f, iM30014);
        int i3 = this.f13187;
        this.f13192 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f13181 = objArr;
        Object[] objArr2 = new Object[i3 + 1];
        this.f13184 = objArr2;
        int i4 = this.f13183;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (this.f13186.mo25786(object, null)) {
                i = this.f13187;
                this.f13190 = true;
            } else {
                int iM30015 = C11972.m30015(this.f13186.mo25785(object));
                int i6 = this.f13192;
                while (true) {
                    i = iM30015 & i6;
                    if (objArr[i] != null) {
                        iM30015 = i + 1;
                        i6 = this.f13192;
                    }
                }
            }
            objArr[i] = object;
            objArr2[i] = object2;
            i4 = i5;
        }
    }
}
