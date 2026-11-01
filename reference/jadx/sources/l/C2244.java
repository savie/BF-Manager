package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۖۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes3.dex */
public final class C2244 implements InterfaceC13535, Serializable, InterfaceC10441 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13535 f8043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16232 f8044;

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final /* synthetic */ void forEach(Consumer consumer) {
        C7890.m20823(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C4361.m12205(this, predicate);
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

    public C2244(InterfaceC13535 interfaceC13535, C16232 c16232) {
        C13638.requireNonNull(interfaceC13535);
        this.f8043 = interfaceC13535;
        this.f8044 = c16232;
    }

    @Override // l.InterfaceC13535
    public final boolean add(float f) {
        boolean zAdd;
        synchronized (this.f8044) {
            zAdd = this.f8043.add(f);
        }
        return zAdd;
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5900(float f) {
        boolean zMo5900;
        synchronized (this.f8044) {
            zMo5900 = this.f8043.mo5900(f);
        }
        return zMo5900;
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo6889(float f) {
        boolean zMo6889;
        synchronized (this.f8044) {
            zMo6889 = this.f8043.mo6889(f);
        }
        return zMo6889;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f8044) {
            size = this.f8043.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f8044) {
            zIsEmpty = this.f8043.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f8044) {
            array = this.f8043.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean add(Float f) {
        boolean zAdd;
        synchronized (this.f8044) {
            zAdd = this.f8043.add(f);
        }
        return zAdd;
    }

    @Override // l.InterfaceC13535, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f8044) {
            zContains = this.f8043.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC13535, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f8044) {
            zRemove = this.f8043.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f8044) {
            array = this.f8043.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f8043.iterator();
    }

    @Override // l.InterfaceC13535, java.util.Collection, java.lang.Iterable, l.InterfaceC19179
    public final InterfaceC10007 iterator() {
        return this.f8043.iterator();
    }

    @Override // l.InterfaceC13535, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11501 spliterator() {
        return this.f8043.spliterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return this.f8043.spliterator();
    }

    @Override // l.InterfaceC13535, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final InterfaceC5046 stream() {
        return this.f8043.stream();
    }

    @Override // l.InterfaceC13535, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final InterfaceC5046 parallelStream() {
        return this.f8043.parallelStream();
    }

    @Override // l.InterfaceC19179
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6890(InterfaceC17767 interfaceC17767) {
        synchronized (this.f8044) {
            this.f8043.mo6890(interfaceC17767);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f8044) {
            zAddAll = this.f8043.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f8044) {
            zContainsAll = this.f8043.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f8044) {
            zRemoveAll = this.f8043.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f8044) {
            zRetainAll = this.f8043.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6888(InterfaceC1539 interfaceC1539) {
        boolean zMo6888;
        synchronized (this.f8044) {
            zMo6888 = this.f8043.mo6888(interfaceC1539);
        }
        return zMo6888;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f8044) {
            this.f8043.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f8044) {
            string = this.f8043.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f8044) {
            iHashCode = this.f8043.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f8044) {
            zEquals = this.f8043.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f8044) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
