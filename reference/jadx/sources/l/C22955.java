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

/* JADX INFO: renamed from: l.᩺ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22955 extends AbstractC3053 implements Set, InterfaceC22810 {
    public static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C2223.convert(C21980.stream(C9030.b(this), true));
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C2223.convert(C21980.stream(C9030.b(this), false));
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // l.AbstractC3053, java.util.Collection
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

    @Override // l.AbstractC3053, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
    }

    @Override // l.AbstractC3053, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentMapC13783 concurrentMapC13783 = this.a;
        C19427[] c19427Arr = concurrentMapC13783.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        return new C6726(c19427Arr, length, length, concurrentMapC13783);
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

    @Override // java.util.Collection, l.InterfaceC10441
    public final boolean removeIf(Predicate predicate) {
        ConcurrentMapC13783 concurrentMapC13783 = this.a;
        predicate.getClass();
        C19427[] c19427Arr = concurrentMapC13783.a;
        boolean z = false;
        if (c19427Arr != null) {
            C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
            while (true) {
                C19427 c19427A = c20838.a();
                if (c19427A == null) {
                    break;
                }
                Object obj = c19427A.b;
                Object obj2 = c19427A.c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentMapC13783.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C19427[] c19427Arr = this.a.a;
        int iHashCode = 0;
        if (c19427Arr != null) {
            C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
            while (true) {
                C19427 c19427A = c20838.a();
                if (c19427A == null) {
                    break;
                }
                iHashCode += c19427A.hashCode();
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

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, l.InterfaceC22810, l.InterfaceC16585
    public final InterfaceC20693 spliterator() {
        ConcurrentMapC13783 concurrentMapC13783 = this.a;
        long j = concurrentMapC13783.j();
        C19427[] c19427Arr = concurrentMapC13783.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        return new C15194(c19427Arr, length, 0, length, j >= 0 ? j : 0L, concurrentMapC13783);
    }

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C19427[] c19427Arr = this.a.a;
        if (c19427Arr == null) {
            return;
        }
        C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
        while (true) {
            C19427 c19427A = c20838.a();
            if (c19427A == null) {
                return;
            } else {
                consumer.n(new C8138(c19427A.b, c19427A.c, this.a));
            }
        }
    }
}
