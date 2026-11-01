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

/* JADX INFO: renamed from: l.ۙۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C4609 extends AbstractC3053 implements Set, Serializable, InterfaceC22810 {
    public static final long serialVersionUID = 7249069246763182397L;
    public final Object b;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C2223.convert(C21980.stream(C9030.b(this), true));
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C19613.$default$removeIf(this, predicate);
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

    public C4609(ConcurrentMapC13783 concurrentMapC13783, Object obj) {
        super(concurrentMapC13783);
        this.b = obj;
    }

    @Override // l.AbstractC3053, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // l.AbstractC3053, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // l.AbstractC3053, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentMapC13783 concurrentMapC13783 = this.a;
        C19427[] c19427Arr = concurrentMapC13783.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        return new C18015(c19427Arr, length, length, concurrentMapC13783, 0);
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
        while (((AbstractC1081) it).hasNext()) {
            iHashCode += ((C18015) it).next().hashCode();
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
        return new C18721(c19427Arr, length, 0, length, j < 0 ? 0L : j, 0);
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
                consumer.n(c19427A.b);
            }
        }
    }
}
