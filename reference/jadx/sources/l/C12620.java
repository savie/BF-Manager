package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.۫᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F5 */
/* JADX INFO: loaded from: classes4.dex */
public class C12620 implements InterfaceC0624, Serializable, InterfaceC10441 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0624 f42173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f42174;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C12620(InterfaceC0624 interfaceC0624, Object obj) {
        C13638.requireNonNull(interfaceC0624);
        this.f42173 = interfaceC0624;
        this.f42174 = obj;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f42174) {
            zAdd = this.f42173.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f42174) {
            zContains = this.f42173.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f42174) {
            zRemove = this.f42173.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f42174) {
            size = this.f42173.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f42174) {
            zIsEmpty = this.f42173.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f42174) {
            array = this.f42173.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f42174) {
            array = this.f42173.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC6269 iterator() {
        return this.f42173.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC7371 spliterator() {
        return this.f42173.spliterator();
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public InterfaceC5046 stream() {
        return C9030.stream(this.f42173);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public InterfaceC5046 parallelStream() {
        return C9030.parallelStream(this.f42173);
    }

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public void forEach(Consumer consumer) {
        synchronized (this.f42174) {
            C0356.forEach(this.f42173, consumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f42174) {
            zAddAll = this.f42173.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f42174) {
            zContainsAll = this.f42173.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f42174) {
            zRemoveAll = this.f42173.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f42174) {
            zRetainAll = this.f42173.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f42174) {
            zRemoveIf = C9030.removeIf(this.f42173, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f42174) {
            this.f42173.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f42174) {
            string = this.f42173.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f42174) {
            iHashCode = this.f42173.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f42174) {
            zEquals = this.f42173.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f42174) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
