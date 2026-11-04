package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22162 extends C21791 {
    public static final long serialVersionUID = 7854390611657943733L;

    @Override // l.C8233, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C17359.requireNonNull(consumer);
        C1170.a(this.a, new C16765(consumer, 2));
    }

    @Override // l.C8233, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C14198(C1170.b(this.a));
    }

    @Override // l.C8233, java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C12465.stream(spliterator(), false);
    }

    @Override // l.C8233, java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(spliterator(), true);
    }

    @Override // l.C8233, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C18674(this);
    }

    @Override // l.C8233, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C8978((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // l.C8233, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C8978((Map.Entry) array[i]);
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

    @Override // l.C8233, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.a.contains(new C8978((Map.Entry) obj));
        }
        return false;
    }

    @Override // l.C8233, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // l.C21791, java.util.Collection, java.util.Set
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
