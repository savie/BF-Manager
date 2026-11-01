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

/* JADX INFO: renamed from: l.᩷ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes5.dex */
public class C20714 implements InterfaceC10131, Serializable, InterfaceC10441 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10131 f67348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f67349;

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final /* synthetic */ void forEach(Consumer consumer) {
        C5669.m15559(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C8720.m22565(this, predicate);
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

    public C20714(InterfaceC14842 interfaceC14842, Object obj) {
        C13638.requireNonNull(interfaceC14842);
        this.f67348 = interfaceC14842;
        this.f67349 = obj;
    }

    @Override // l.InterfaceC10131
    public boolean add(int i) {
        boolean zAdd;
        synchronized (this.f67349) {
            zAdd = this.f67348.add(i);
        }
        return zAdd;
    }

    @Override // l.InterfaceC10131
    public boolean contains(int i) {
        boolean zContains;
        synchronized (this.f67349) {
            zContains = this.f67348.contains(i);
        }
        return zContains;
    }

    @Override // l.InterfaceC10131
    /* JADX INFO: renamed from: ᩸ */
    public boolean mo3182(int i) {
        boolean zMo3182;
        synchronized (this.f67349) {
            zMo3182 = this.f67348.mo3182(i);
        }
        return zMo3182;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f67349) {
            size = this.f67348.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f67349) {
            zIsEmpty = this.f67348.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public int[] mo3181() {
        int[] iArrMo3181;
        synchronized (this.f67349) {
            iArrMo3181 = this.f67348.mo3181();
        }
        return iArrMo3181;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f67349) {
            array = this.f67348.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public boolean add(Integer num) {
        boolean zAdd;
        synchronized (this.f67349) {
            zAdd = this.f67348.add(num);
        }
        return zAdd;
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f67349) {
            zContains = this.f67348.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f67349) {
            zRemove = this.f67348.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f67349) {
            array = this.f67348.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC13431 iterator() {
        return this.f67348.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11790 spliterator() {
        return this.f67348.spliterator();
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public InterfaceC5046 stream() {
        return this.f67348.stream();
    }

    @Override // l.InterfaceC10131, java.util.Collection
    @Deprecated
    public InterfaceC5046 parallelStream() {
        return this.f67348.parallelStream();
    }

    @Override // l.InterfaceC22603
    public void forEach(IntConsumer intConsumer) {
        synchronized (this.f67349) {
            this.f67348.forEach(intConsumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f67349) {
            zAddAll = this.f67348.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f67349) {
            zContainsAll = this.f67348.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f67349) {
            zRemoveAll = this.f67348.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f67349) {
            zRetainAll = this.f67348.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC10131
    /* JADX INFO: renamed from: ۙ */
    public boolean mo3171(IntPredicate intPredicate) {
        boolean zMo3171;
        synchronized (this.f67349) {
            zMo3171 = this.f67348.mo3171(intPredicate);
        }
        return zMo3171;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f67349) {
            this.f67348.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f67349) {
            string = this.f67348.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f67349) {
            iHashCode = this.f67348.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f67349) {
            zEquals = this.f67348.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f67349) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
