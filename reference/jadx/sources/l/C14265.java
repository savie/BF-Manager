package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܰ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14265 extends AbstractC24709 implements Set, InterfaceC14375 {
    public static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C3516.convert(C12465.stream(C1170.b(this), true));
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final /* synthetic */ InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
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

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // l.AbstractC24709, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null) {
            return false;
        }
        return value == obj2 || value.equals(obj2);
    }

    @Override // l.AbstractC24709, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
    }

    @Override // l.AbstractC24709, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentMapC17249 concurrentMapC17249 = this.a;
        C9790[] c9790Arr = concurrentMapC17249.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        return new C3825(c9790Arr, length, length, concurrentMapC17249);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.a.f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final boolean removeIf(Predicate predicate) {
        ConcurrentMapC17249 concurrentMapC17249 = this.a;
        predicate.getClass();
        C9790[] c9790Arr = concurrentMapC17249.a;
        boolean z = false;
        if (c9790Arr != null) {
            C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
            while (true) {
                C9790 c9790A = c8300.a();
                if (c9790A == null) {
                    break;
                }
                Object obj = c9790A.b;
                Object obj2 = c9790A.c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentMapC17249.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C9790[] c9790Arr = this.a.a;
        int iHashCode = 0;
        if (c9790Arr != null) {
            C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
            while (true) {
                C9790 c9790A = c8300.a();
                if (c9790A == null) {
                    break;
                }
                iHashCode += c9790A.hashCode();
            }
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
        return new C20979(c9790Arr, length, 0, length, j >= 0 ? j : 0L, concurrentMapC17249);
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
                consumer.n(new C18741(c9790A.b, c9790A.c, this.a));
            }
        }
    }
}
