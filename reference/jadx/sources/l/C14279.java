package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܰ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C14279 implements List, RandomAccess, InterfaceC5427 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f45109;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, l.InterfaceC5427, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C15121.$default$spliterator(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(mo52749stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public /* synthetic */ InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C14279(List list) {
        C17359.requireNonNull(list);
        Object[] array = list.toArray();
        C17359.requireNonNull(array);
        this.f45109 = array;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f45109.length;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f45109.length == 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f45109[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.f45109;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (C17359.equals(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f45109;
        int length = objArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!C17359.equals(objArr[length], obj));
        return length;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3839(this);
    }

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        for (Object obj : this.f45109) {
            consumer.accept(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f45109;
        return Arrays.copyOf(objArr, objArr.length);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2 = this.f45109;
        return Arrays.copyOf(objArr2, objArr2.length);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
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
    public final ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof C14279;
        Object[] objArr = this.f45109;
        if (z) {
            return Arrays.equals(objArr, ((C14279) obj).f45109);
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int length = objArr.length;
        if (length != list.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!C17359.equals(objArr[i], list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f45109);
    }

    public final String toString() {
        return "ImmutableList{" + Arrays.toString(this.f45109) + '}';
    }
}
