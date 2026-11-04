package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩸۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F5 */
/* JADX INFO: loaded from: classes.dex */
public class C22684 implements InterfaceC21938, Serializable, InterfaceC9372 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21938 f73658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f73659;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
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
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C22684(InterfaceC21938 interfaceC21938, Object obj) {
        C17359.requireNonNull(interfaceC21938);
        this.f73658 = interfaceC21938;
        this.f73659 = obj;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f73659) {
            zAdd = this.f73658.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f73659) {
            zContains = this.f73658.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f73659) {
            zRemove = this.f73658.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f73659) {
            size = this.f73658.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f73659) {
            zIsEmpty = this.f73658.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f73659) {
            array = this.f73658.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f73659) {
            array = this.f73658.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC15224 iterator() {
        return this.f73658.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC2546 spliterator() {
        return this.f73658.spliterator();
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public InterfaceC20670 mo52749stream() {
        return C1170.stream(this.f73658);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public InterfaceC20670 mo52748parallelStream() {
        return C1170.parallelStream(this.f73658);
    }

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public void forEach(Consumer consumer) {
        synchronized (this.f73659) {
            C4937.forEach(this.f73658, consumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f73659) {
            zAddAll = this.f73658.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f73659) {
            zContainsAll = this.f73658.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f73659) {
            zRemoveAll = this.f73658.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f73659) {
            zRetainAll = this.f73658.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f73659) {
            zRemoveIf = C1170.removeIf(this.f73658, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f73659) {
            this.f73658.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f73659) {
            string = this.f73658.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f73659) {
            iHashCode = this.f73658.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f73659) {
            zEquals = this.f73658.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f73659) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
