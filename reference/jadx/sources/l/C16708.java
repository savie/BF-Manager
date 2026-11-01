package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16708 extends C20457 {
    public static final long serialVersionUID = 7854390611657943733L;

    @Override // l.C18824, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C13638.requireNonNull(consumer);
        C9030.a(this.a, new C4879(consumer, 2));
    }

    @Override // l.C18824, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C20236(C9030.b(this.a));
    }

    @Override // l.C18824, java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C21980.stream(spliterator(), false);
    }

    @Override // l.C18824, java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 parallelStream() {
        return C21980.stream(spliterator(), true);
    }

    @Override // l.C18824, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21646(this);
    }

    @Override // l.C18824, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C20941((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // l.C18824, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C20941((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // l.C18824, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.a.contains(new C20941((Map.Entry) obj));
        }
        return false;
    }

    @Override // l.C18824, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // l.C20457, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
