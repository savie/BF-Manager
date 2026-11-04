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

/* JADX INFO: renamed from: l.᩹ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes.dex */
public final class C23540 implements InterfaceC17572, Serializable, InterfaceC9372 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17572 f76049;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7482 f76050;

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final /* synthetic */ void forEach(Consumer consumer) {
        C19064.m44169(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C16826.m39744(this, predicate);
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

    public C23540(InterfaceC17572 interfaceC17572, C7482 c7482) {
        C17359.requireNonNull(interfaceC17572);
        this.f76049 = interfaceC17572;
        this.f76050 = c7482;
    }

    @Override // l.InterfaceC17572
    public final boolean add(float f) {
        boolean zAdd;
        synchronized (this.f76050) {
            zAdd = this.f76049.add(f);
        }
        return zAdd;
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6580(float f) {
        boolean zMo6580;
        synchronized (this.f76050) {
            zMo6580 = this.f76049.mo6580(f);
        }
        return zMo6580;
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2883(float f) {
        boolean zMo2883;
        synchronized (this.f76050) {
            zMo2883 = this.f76049.mo2883(f);
        }
        return zMo2883;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f76050) {
            size = this.f76049.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f76050) {
            zIsEmpty = this.f76049.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f76050) {
            array = this.f76049.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: merged with bridge method [inline-methods] */
    public final boolean add(Float f) {
        boolean zAdd;
        synchronized (this.f76050) {
            zAdd = this.f76049.add(f);
        }
        return zAdd;
    }

    @Override // l.InterfaceC17572, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f76050) {
            zContains = this.f76049.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC17572, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f76050) {
            zRemove = this.f76049.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f76050) {
            array = this.f76049.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f76049.iterator();
    }

    @Override // l.InterfaceC17572, java.util.Collection, java.lang.Iterable, l.InterfaceC10113
    public final InterfaceC9367 iterator() {
        return this.f76049.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return this.f76049.spliterator();
    }

    @Override // l.InterfaceC17572, java.util.Collection, java.lang.Iterable
    public final InterfaceC15906 spliterator() {
        return this.f76049.spliterator();
    }

    @Override // l.InterfaceC17572, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: stream, reason: collision with other method in class */
    public final InterfaceC20670 mo52749stream() {
        return this.f76049.mo52749stream();
    }

    @Override // l.InterfaceC17572, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: parallelStream, reason: collision with other method in class */
    public final InterfaceC20670 mo52748parallelStream() {
        return this.f76049.mo52748parallelStream();
    }

    @Override // l.InterfaceC10113
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2884(InterfaceC0419 interfaceC0419) {
        synchronized (this.f76050) {
            this.f76049.mo2884(interfaceC0419);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f76050) {
            zAddAll = this.f76049.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f76050) {
            zContainsAll = this.f76049.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f76050) {
            zRemoveAll = this.f76049.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f76050) {
            zRetainAll = this.f76049.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2880(InterfaceC1737 interfaceC1737) {
        boolean zMo2880;
        synchronized (this.f76050) {
            zMo2880 = this.f76049.mo2880(interfaceC1737);
        }
        return zMo2880;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f76050) {
            this.f76049.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f76050) {
            string = this.f76049.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f76050) {
            iHashCode = this.f76049.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76050) {
            zEquals = this.f76049.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f76050) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
