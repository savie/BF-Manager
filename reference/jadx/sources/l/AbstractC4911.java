package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۙ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4911 extends AbstractCollection implements Serializable, InterfaceC9372 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object[] f17148 = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public /* synthetic */ void forEach(Consumer consumer) {
        C13689.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract AbstractC4516 iterator();

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10118.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
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

    /* JADX INFO: renamed from: ۤ */
    public Object[] mo14904() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo14905();

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f17148);
    }

    /* JADX INFO: renamed from: ᩴ */
    public int mo14906() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩸ */
    public int mo14907() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC1928 mo6621() {
        if (isEmpty()) {
            int i = AbstractC1928.f6477;
            return C4867.f16966;
        }
        Object[] array = toArray(f17148);
        int i2 = AbstractC1928.f6477;
        return AbstractC1928.m6618(array.length, array);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo6619(int i, Object[] objArr) {
        AbstractC4516 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object writeReplace() {
        return new C13114(toArray(f17148));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo14904 = mo14904();
            if (objArrMo14904 == null) {
                if (objArr.length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(objArrMo14904, mo14906(), mo14907(), objArr.getClass());
            }
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo6619(0, objArr);
        return objArr;
    }
}
