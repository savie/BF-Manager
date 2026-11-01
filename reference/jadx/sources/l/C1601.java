package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֫ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes3.dex */
public class C1601 implements InterfaceC23475, Serializable, InterfaceC10441 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23475 f6479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10732 f6480;

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final /* synthetic */ void forEach(Consumer consumer) {
        C3986.m11487(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10775.m27076(this, predicate);
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

    public C1601(InterfaceC14572 interfaceC14572, C10732 c10732) {
        C13638.requireNonNull(interfaceC14572);
        this.f6479 = interfaceC14572;
        this.f6480 = c10732;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ܰ */
    public boolean mo2291(char c) {
        boolean zMo2291;
        synchronized (this.f6480) {
            zMo2291 = this.f6479.mo2291(c);
        }
        return zMo2291;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public boolean mo2286(char c) {
        boolean zMo2286;
        synchronized (this.f6480) {
            zMo2286 = this.f6479.mo2286(c);
        }
        return zMo2286;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean mo5455(char c) {
        boolean zMo5455;
        synchronized (this.f6480) {
            zMo5455 = this.f6479.mo5455(c);
        }
        return zMo5455;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f6480) {
            size = this.f6479.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f6480) {
            zIsEmpty = this.f6479.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f6480) {
            array = this.f6479.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean add(Character ch) {
        boolean zAdd;
        synchronized (this.f6480) {
            zAdd = this.f6479.add(ch);
        }
        return zAdd;
    }

    @Override // l.InterfaceC23475, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f6480) {
            zContains = this.f6479.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC23475, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f6480) {
            zRemove = this.f6479.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f6480) {
            array = this.f6479.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC15277 iterator() {
        return this.f6479.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11687 spliterator() {
        return this.f6479.spliterator();
    }

    @Override // l.InterfaceC23475, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public InterfaceC5046 stream() {
        return this.f6479.stream();
    }

    @Override // l.InterfaceC23475, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public InterfaceC5046 parallelStream() {
        return this.f6479.parallelStream();
    }

    @Override // l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public void mo2288(InterfaceC1164 interfaceC1164) {
        synchronized (this.f6480) {
            this.f6479.mo2288(interfaceC1164);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f6480) {
            zAddAll = this.f6479.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f6480) {
            zContainsAll = this.f6479.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f6480) {
            zRemoveAll = this.f6479.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f6480) {
            zRetainAll = this.f6479.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo5454(InterfaceC23744 interfaceC23744) {
        boolean zMo5454;
        synchronized (this.f6480) {
            zMo5454 = this.f6479.mo5454(interfaceC23744);
        }
        return zMo5454;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f6480) {
            this.f6479.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f6480) {
            string = this.f6479.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f6480) {
            iHashCode = this.f6479.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f6480) {
            zEquals = this.f6479.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f6480) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
