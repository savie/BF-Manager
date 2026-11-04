package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۖܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes3.dex */
public class C2831 implements InterfaceC1340, Serializable, InterfaceC9372 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1340 f9331;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f9332;

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final /* synthetic */ void forEach(Consumer consumer) {
        C3052.m9926(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10288.m26521(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C2831(InterfaceC5509 interfaceC5509, Object obj) {
        C17359.requireNonNull(interfaceC5509);
        this.f9331 = interfaceC5509;
        this.f9332 = obj;
    }

    @Override // l.InterfaceC1340
    public boolean add(int i) {
        boolean zAdd;
        synchronized (this.f9332) {
            zAdd = this.f9331.add(i);
        }
        return zAdd;
    }

    @Override // l.InterfaceC1340
    public boolean contains(int i) {
        boolean zContains;
        synchronized (this.f9332) {
            zContains = this.f9331.contains(i);
        }
        return zContains;
    }

    @Override // l.InterfaceC1340
    /* JADX INFO: renamed from: ܽ */
    public boolean mo4933(int i) {
        boolean zMo4933;
        synchronized (this.f9332) {
            zMo4933 = this.f9331.mo4933(i);
        }
        return zMo4933;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f9332) {
            size = this.f9331.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f9332) {
            zIsEmpty = this.f9331.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public int[] mo2687() {
        int[] iArrMo2687;
        synchronized (this.f9332) {
            iArrMo2687 = this.f9331.mo2687();
        }
        return iArrMo2687;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f9332) {
            array = this.f9331.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        boolean zAdd;
        synchronized (this.f9332) {
            zAdd = this.f9331.add(num);
        }
        return zAdd;
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f9332) {
            zContains = this.f9331.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f9332) {
            zRemove = this.f9331.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f9332) {
            array = this.f9331.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC6036 iterator() {
        return this.f9331.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15949 spliterator() {
        return this.f9331.spliterator();
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public InterfaceC20670 stream() {
        return this.f9331.stream();
    }

    @Override // l.InterfaceC1340, java.util.Collection
    @Deprecated
    public InterfaceC20670 parallelStream() {
        return this.f9331.parallelStream();
    }

    @Override // l.InterfaceC20206
    public void forEach(IntConsumer intConsumer) {
        synchronized (this.f9332) {
            this.f9331.forEach(intConsumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f9332) {
            zAddAll = this.f9331.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f9332) {
            zContainsAll = this.f9331.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f9332) {
            zRemoveAll = this.f9331.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f9332) {
            zRetainAll = this.f9331.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC1340
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4932(IntPredicate intPredicate) {
        boolean zMo4932;
        synchronized (this.f9332) {
            zMo4932 = this.f9331.mo4932(intPredicate);
        }
        return zMo4932;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f9332) {
            this.f9331.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f9332) {
            string = this.f9331.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f9332) {
            iHashCode = this.f9331.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f9332) {
            zEquals = this.f9331.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f9332) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
