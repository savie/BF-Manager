package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܺ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C16503 extends AbstractC24709 implements Set, Serializable, InterfaceC14375 {
    public static final long serialVersionUID = 7249069246763182397L;
    public final Object b;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C3516.convert(C12465.stream(C1170.b(this), true));
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final /* synthetic */ InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10118.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C3516.convert(C12465.stream(C1170.b(this), false));
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final /* synthetic */ InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C16503(ConcurrentMapC17249 concurrentMapC17249, Object obj) {
        super(concurrentMapC17249);
        this.b = obj;
    }

    @Override // l.AbstractC24709, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // l.AbstractC24709, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // l.AbstractC24709, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentMapC17249 concurrentMapC17249 = this.a;
        C9790[] c9790Arr = concurrentMapC17249.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        return new C0096(c9790Arr, length, length, concurrentMapC17249, 0);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return this.a.f(obj, obj2, true) == null;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Object obj = this.b;
        if (obj == null) {
            throw new UnsupportedOperationException();
        }
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (this.a.f(it.next(), obj, true) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object it = iterator();
        int iHashCode = 0;
        while (((AbstractC12028) it).hasNext()) {
            iHashCode += ((C0096) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set != this) {
            return containsAll(set) && set.containsAll(this);
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, l.InterfaceC14375, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        ConcurrentMapC17249 concurrentMapC17249 = this.a;
        long j = concurrentMapC17249.j();
        C9790[] c9790Arr = concurrentMapC17249.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        return new C7554(c9790Arr, length, 0, length, j < 0 ? 0L : j, 0);
    }

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C9790[] c9790Arr = this.a.a;
        if (c9790Arr == null) {
            return;
        }
        C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
        while (true) {
            C9790 c9790A = c8300.a();
            if (c9790A == null) {
                return;
            } else {
                consumer.n(c9790A.b);
            }
        }
    }
}
