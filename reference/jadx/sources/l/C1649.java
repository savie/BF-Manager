package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֫ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes3.dex */
public class C1649 implements InterfaceC12835, Serializable, InterfaceC9372 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12835 f5724;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15663 f5725;

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final /* synthetic */ void forEach(Consumer consumer) {
        C24024.m53581(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C15072.m36334(this, predicate);
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

    public C1649(InterfaceC5881 interfaceC5881, C15663 c15663) {
        C17359.requireNonNull(interfaceC5881);
        this.f5724 = interfaceC5881;
        this.f5725 = c15663;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo5933(char c) {
        boolean zMo5933;
        synchronized (this.f5725) {
            zMo5933 = this.f5724.mo5933(c);
        }
        return zMo5933;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean mo5936(char c) {
        boolean zMo5936;
        synchronized (this.f5725) {
            zMo5936 = this.f5724.mo5936(c);
        }
        return zMo5936;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo4843(char c) {
        boolean zMo4843;
        synchronized (this.f5725) {
            zMo4843 = this.f5724.mo4843(c);
        }
        return zMo4843;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f5725) {
            size = this.f5724.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f5725) {
            zIsEmpty = this.f5724.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f5725) {
            array = this.f5724.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean add(Character ch) {
        boolean zAdd;
        synchronized (this.f5725) {
            zAdd = this.f5724.add(ch);
        }
        return zAdd;
    }

    @Override // l.InterfaceC12835, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f5725) {
            zContains = this.f5724.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC12835, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f5725) {
            zRemove = this.f5724.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f5725) {
            array = this.f5724.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC21040 iterator() {
        return this.f5724.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC16321 spliterator() {
        return this.f5724.spliterator();
    }

    @Override // l.InterfaceC12835, java.util.Collection, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: stream */
    public InterfaceC20670 mo52749stream() {
        return this.f5724.mo52749stream();
    }

    @Override // l.InterfaceC12835, java.util.Collection, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: parallelStream */
    public InterfaceC20670 mo52748parallelStream() {
        return this.f5724.mo52748parallelStream();
    }

    @Override // l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5932(InterfaceC12089 interfaceC12089) {
        synchronized (this.f5725) {
            this.f5724.mo5932(interfaceC12089);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f5725) {
            zAddAll = this.f5724.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f5725) {
            zContainsAll = this.f5724.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f5725) {
            zRemoveAll = this.f5724.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f5725) {
            zRetainAll = this.f5724.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo5935(InterfaceC13338 interfaceC13338) {
        boolean zMo5935;
        synchronized (this.f5725) {
            zMo5935 = this.f5724.mo5935(interfaceC13338);
        }
        return zMo5935;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f5725) {
            this.f5724.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f5725) {
            string = this.f5724.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f5725) {
            iHashCode = this.f5724.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f5725) {
            zEquals = this.f5724.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f5725) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
