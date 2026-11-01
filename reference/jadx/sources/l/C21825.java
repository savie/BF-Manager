package l;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes4.dex */
public class C21825 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70873 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C21825 f70874 = new C7008(null, null);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Iterator f70875 = new C23237();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f70876;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21825 f70877;

    public C21825(Object obj, C21825 c21825) {
        this.f70877 = c21825;
        this.f70876 = obj;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C21825 m48588() {
        return f70874;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m48585(Object obj, C21825 c21825) {
        C6171.m17171(obj);
        C21825 c21826 = f70874;
        for (Object obj2 : c21825) {
            if (obj2 != null && !obj2.equals(obj)) {
                c21826.getClass();
                c21826 = new C21825(obj2, c21826);
            }
        }
        return c21826.m48589();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m48598(C21825 c21825) {
        C19003 c19003 = new C19003();
        for (Object obj : this) {
            if (c21825.contains(obj)) {
                c19003.m43723(obj);
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m48593(C21825 c21825) {
        C19003 c19003 = new C19003();
        for (Object obj : this) {
            if (!c21825.contains(obj)) {
                c19003.m43723(obj);
            }
        }
        return c19003.m43726();
    }

    public static C21825 of(Object obj) {
        return new C21825(obj, f70874);
    }

    public static C21825 of(Object obj, Object obj2) {
        return new C21825(obj, of(obj2));
    }

    public static C21825 of(Object obj, Object obj2, Object obj3) {
        return new C21825(obj, of(obj2, obj3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m48584(Object obj, Object obj2, Object obj3, Object... objArr) {
        return new C21825(obj, new C21825(obj2, new C21825(obj3, m48586(objArr))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m48586(Object[] objArr) {
        C21825 c21825 = f70874;
        if (objArr != null) {
            int length = objArr.length - 1;
            while (length >= 0) {
                C21825 c21826 = new C21825(objArr[length], c21825);
                length--;
                c21825 = c21826;
            }
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m48583(Iterable iterable) {
        C19003 c19003 = new C19003();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c19003.m43723(it.next());
        }
        return c19003.m43726();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f70877 == null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m48595() {
        return this.f70877 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m48596() {
        int i = 0;
        C21825 c21825 = this;
        while (true) {
            c21825 = c21825.f70877;
            if (c21825 == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return m48596();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i2 > m48596() || i > i2) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        C21825 c21825 = this;
        for (int i3 = 0; c21825.f70877 != null && i3 != i2; i3++) {
            if (i3 >= i) {
                arrayList.add(c21825.f70876);
            }
            c21825 = c21825.f70877;
        }
        return C0561.unmodifiableList(arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[m48596()]);
    }

    /* JADX INFO: renamed from: ۖ */
    public C21825 mo18818(C21825 c21825) {
        this.f70877 = c21825;
        return c21825;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m48597(Object obj) {
        return new C21825(obj, this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m48594(C21825 c21825) {
        if (isEmpty()) {
            return c21825;
        }
        if (c21825.isEmpty()) {
            return this;
        }
        if (c21825.f70877.isEmpty()) {
            return new C21825(c21825.f70876, this);
        }
        C21825 c21825M48589 = c21825.m48589();
        C6171.m17176(c21825M48589 != c21825);
        C21825 c21826 = this;
        while (c21825M48589.m48595()) {
            C21825 c21827 = c21825M48589.f70877;
            c21825M48589.mo18818(c21826);
            c21826 = c21825M48589;
            c21825M48589 = c21827;
        }
        return c21826;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m48589() {
        if (isEmpty() || this.f70877.isEmpty()) {
            return this;
        }
        C21825 c21825 = f70874;
        C21825 c21826 = this;
        while (c21826.m48595()) {
            C21825 c21827 = new C21825(c21826.f70876, c21825);
            c21826 = c21826.f70877;
            c21825 = c21827;
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m48591(Object obj) {
        return of(obj).m48594(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int i = 0;
        C21825 c21825 = this;
        while (c21825.m48595() && i < objArr.length) {
            objArr[i] = c21825.f70876;
            c21825 = c21825.f70877;
            i++;
        }
        if (c21825.isEmpty()) {
            if (i < objArr.length) {
                objArr[i] = null;
            }
            return objArr;
        }
        return toArray((Object[]) Array.newInstance(objArr.getClass().getComponentType(), m48596()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48590(String str) {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70876);
        for (C21825 c21825 = this.f70877; c21825.m48595(); c21825 = c21825.f70877) {
            sb.append(str);
            sb.append(c21825.f70876);
        }
        return sb.toString();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m48590(",");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (C21825 c21825 = this; c21825.f70877 != null; c21825 = c21825.f70877) {
            int i = iHashCode * 31;
            Object obj = c21825.f70876;
            iHashCode = i + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        C21825 c21825;
        if (obj instanceof C21825) {
            C21825 c21826 = (C21825) obj;
            C21825 c21827 = this;
            while (true) {
                c21825 = c21827.f70877;
                if (c21825 == null || c21826.f70877 == null) {
                    break;
                }
                Object obj2 = c21827.f70876;
                if (obj2 == null) {
                    if (c21826.f70876 != null) {
                        return false;
                    }
                } else if (!obj2.equals(c21826.f70876)) {
                    return false;
                }
                c21827 = c21827.f70877;
                c21826 = c21826.f70877;
            }
            return c21825 == null && c21826.f70877 == null;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        C21825 c21828 = this;
        while (c21828.f70877 != null && it.hasNext()) {
            Object next = it.next();
            Object obj3 = c21828.f70876;
            if (obj3 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!obj3.equals(next)) {
                return false;
            }
            c21828 = c21828.f70877;
        }
        return c21828.isEmpty() && !it.hasNext();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        for (C21825 c21825 = this; c21825.f70877 != null; c21825 = c21825.f70877) {
            if (obj == null) {
                if (c21825.f70876 == null) {
                    return true;
                }
            } else if (c21825.f70876.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Object last() {
        Object obj = null;
        C21825 c21825 = this;
        while (true) {
            C21825 c21826 = c21825.f70877;
            if (c21826 == null) {
                return obj;
            }
            obj = c21825.f70876;
            c21825 = c21826;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m48592(Function function) {
        C19003 c19003 = new C19003();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            Object objApply = function.apply(next);
            c19003.m43723(objApply);
            z |= objApply != next;
        }
        return z ? c19003.m43726() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        if (this.f70877 == null) {
            return f70875;
        }
        C15476 c15476 = new C15476();
        c15476.f50425 = this;
        return c15476;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        C21825 c21825 = this;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || c21825.isEmpty()) {
                break;
            }
            c21825 = c21825.f70877;
            i2 = i3;
        }
        if (!c21825.isEmpty()) {
            return c21825.f70876;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Index: ", ", Size: ");
        sbM40153.append(m48596());
        throw new IndexOutOfBoundsException(sbM40153.toString());
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
        C21825 c21825 = this;
        while (c21825.f70877 != null) {
            Object obj2 = c21825.f70876;
            if (obj2 == null) {
                if (obj == null) {
                    return i;
                }
                c21825 = c21825.f70877;
                i++;
            } else {
                if (obj2.equals(obj)) {
                    return i;
                }
                c21825 = c21825.f70877;
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
        C21825 c21825 = this;
        while (c21825.f70877 != null) {
            Object obj2 = c21825.f70876;
            if (obj2 == null) {
                if (obj == null) {
                    i = i2;
                }
            } else if (obj2.equals(obj)) {
                i = i2;
            }
            c21825 = c21825.f70877;
            i2++;
        }
        return i;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C0561.unmodifiableList(new ArrayList(this)).listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return C0561.unmodifiableList(new ArrayList(this)).listIterator(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14592 m48587() {
        return C11064.of(new C1363(0), new C13359(0), new C4185(0), new C21051(8), new EnumC23764[0]);
    }
}
