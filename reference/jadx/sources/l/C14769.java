package l;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes4.dex */
public class C14769 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48334 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f48335;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14769 f48336;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C14769 f48333 = new C6567(null, null);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Iterator f48332 = new C24467();

    public C14769(Object obj, C14769 c14769) {
        this.f48336 = c14769;
        this.f48335 = obj;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C14769 m35543() {
        return f48333;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m35541(Object obj, C14769 c14769) {
        C11972.m30021(obj);
        C14769 c147610 = f48333;
        for (Object obj2 : c14769) {
            if (obj2 != null && !obj2.equals(obj)) {
                c147610.getClass();
                c147610 = new C14769(obj2, c147610);
            }
        }
        return c147610.m35554();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m35553(C14769 c14769) {
        C18499 c18499 = new C18499();
        for (Object obj : this) {
            if (c14769.contains(obj)) {
                c18499.m43089(obj);
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m35548(C14769 c14769) {
        C18499 c18499 = new C18499();
        for (Object obj : this) {
            if (!c14769.contains(obj)) {
                c18499.m43089(obj);
            }
        }
        return c18499.m43093();
    }

    public static C14769 of(Object obj) {
        return new C14769(obj, f48333);
    }

    public static C14769 of(Object obj, Object obj2) {
        return new C14769(obj, of(obj2));
    }

    public static C14769 of(Object obj, Object obj2, Object obj3) {
        return new C14769(obj, of(obj2, obj3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m35540(Object obj, Object obj2, Object obj3, Object... objArr) {
        return new C14769(obj, new C14769(obj2, new C14769(obj3, m35542(objArr))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m35542(Object[] objArr) {
        C14769 c14769 = f48333;
        if (objArr != null) {
            int length = objArr.length - 1;
            while (length >= 0) {
                C14769 c147610 = new C14769(objArr[length], c14769);
                length--;
                c14769 = c147610;
            }
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m35539(Iterable iterable) {
        C18499 c18499 = new C18499();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c18499.m43089(it.next());
        }
        return c18499.m43093();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f48336 == null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35550() {
        return this.f48336 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35551() {
        int i = 0;
        C14769 c14769 = this;
        while (true) {
            c14769 = c14769.f48336;
            if (c14769 == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return m35551();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i2 > m35551() || i > i2) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        C14769 c14769 = this;
        for (int i3 = 0; c14769.f48336 != null && i3 != i2; i3++) {
            if (i3 >= i) {
                arrayList.add(c14769.f48335);
            }
            c14769 = c14769.f48336;
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[m35551()]);
    }

    /* JADX INFO: renamed from: ᩸ */
    public C14769 mo18485(C14769 c14769) {
        this.f48336 = c14769;
        return c14769;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m35552(Object obj) {
        return new C14769(obj, this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m35549(C14769 c14769) {
        if (isEmpty()) {
            return c14769;
        }
        if (c14769.isEmpty()) {
            return this;
        }
        if (c14769.f48336.isEmpty()) {
            return new C14769(c14769.f48335, this);
        }
        C14769 c14769M35554 = c14769.m35554();
        C11972.m30026(c14769M35554 != c14769);
        C14769 c147610 = this;
        while (c14769M35554.m35550()) {
            C14769 c147611 = c14769M35554.f48336;
            c14769M35554.mo18485(c147610);
            c147610 = c14769M35554;
            c14769M35554 = c147611;
        }
        return c147610;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m35554() {
        if (isEmpty() || this.f48336.isEmpty()) {
            return this;
        }
        C14769 c14769 = f48333;
        C14769 c147610 = this;
        while (c147610.m35550()) {
            C14769 c147611 = new C14769(c147610.f48335, c14769);
            c147610 = c147610.f48336;
            c14769 = c147611;
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m35546(Object obj) {
        return of(obj).m35549(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int i = 0;
        C14769 c14769 = this;
        while (c14769.m35550() && i < objArr.length) {
            objArr[i] = c14769.f48335;
            c14769 = c14769.f48336;
            i++;
        }
        if (c14769.isEmpty()) {
            if (i < objArr.length) {
                objArr[i] = null;
            }
            return objArr;
        }
        return toArray((Object[]) Array.newInstance(objArr.getClass().getComponentType(), m35551()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35545(String str) {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48335);
        for (C14769 c14769 = this.f48336; c14769.m35550(); c14769 = c14769.f48336) {
            sb.append(str);
            sb.append(c14769.f48335);
        }
        return sb.toString();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m35545(",");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (C14769 c14769 = this; c14769.f48336 != null; c14769 = c14769.f48336) {
            int i = iHashCode * 31;
            Object obj = c14769.f48335;
            iHashCode = i + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        C14769 c14769;
        if (obj instanceof C14769) {
            C14769 c147610 = (C14769) obj;
            C14769 c147611 = this;
            while (true) {
                c14769 = c147611.f48336;
                if (c14769 == null || c147610.f48336 == null) {
                    break;
                }
                Object obj2 = c147611.f48335;
                if (obj2 == null) {
                    if (c147610.f48335 != null) {
                        return false;
                    }
                } else if (!obj2.equals(c147610.f48335)) {
                    return false;
                }
                c147611 = c147611.f48336;
                c147610 = c147610.f48336;
            }
            return c14769 == null && c147610.f48336 == null;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        C14769 c147612 = this;
        while (c147612.f48336 != null && it.hasNext()) {
            Object next = it.next();
            Object obj3 = c147612.f48335;
            if (obj3 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!obj3.equals(next)) {
                return false;
            }
            c147612 = c147612.f48336;
        }
        return c147612.isEmpty() && !it.hasNext();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        for (C14769 c14769 = this; c14769.f48336 != null; c14769 = c14769.f48336) {
            if (obj == null) {
                if (c14769.f48335 == null) {
                    return true;
                }
            } else if (c14769.f48335.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Object last() {
        Object obj = null;
        C14769 c14769 = this;
        while (true) {
            C14769 c147610 = c14769.f48336;
            if (c147610 == null) {
                return obj;
            }
            obj = c14769.f48335;
            c14769 = c147610;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m35547(Function function) {
        C18499 c18499 = new C18499();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            Object objApply = function.apply(next);
            c18499.m43089(objApply);
            z |= objApply != next;
        }
        return z ? c18499.m43093() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        if (this.f48336 == null) {
            return f48332;
        }
        C4329 c4329 = new C4329();
        c4329.f15681 = this;
        return c4329;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        C14769 c14769 = this;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || c14769.isEmpty()) {
                break;
            }
            c14769 = c14769.f48336;
            i2 = i3;
        }
        if (!c14769.isEmpty()) {
            return c14769.f48335;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Index: ", ", Size: ");
        sbM12235.append(m35551());
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 0;
        C14769 c14769 = this;
        while (c14769.f48336 != null) {
            Object obj2 = c14769.f48335;
            if (obj2 == null) {
                if (obj == null) {
                    return i;
                }
                c14769 = c14769.f48336;
                i++;
            } else {
                if (obj2.equals(obj)) {
                    return i;
                }
                c14769 = c14769.f48336;
                i++;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = -1;
        int i2 = 0;
        C14769 c14769 = this;
        while (c14769.f48336 != null) {
            Object obj2 = c14769.f48335;
            if (obj2 == null) {
                if (obj == null) {
                    i = i2;
                }
            } else if (obj2.equals(obj)) {
                i = i2;
            }
            c14769 = c14769.f48336;
            i2++;
        }
        return i;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C4681.unmodifiableList(new ArrayList(this)).listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return C4681.unmodifiableList(new ArrayList(this)).listIterator(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5754 m35544() {
        return C15448.of(new C3583(), new C20737(), new C12532(), new C18964(7), new EnumC13211[0]);
    }
}
