package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֡ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0376 extends AbstractC3053 implements InterfaceC10441 {
    public static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C2223.convert(C21980.stream(C9030.b(this), true));
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.Collection, java.lang.Iterable
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

    @Override // l.AbstractC3053, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // l.AbstractC3053, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC1081 abstractC1081;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC1081 = (AbstractC1081) it;
            if (!abstractC1081.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C18015) it).next()));
        abstractC1081.remove();
        return true;
    }

    @Override // l.AbstractC3053, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentMapC13783 concurrentMapC13783 = this.a;
        C19427[] c19427Arr = concurrentMapC13783.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        return new C18015(c19427Arr, length, length, concurrentMapC13783, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3053, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            AbstractC1081 abstractC1081 = (AbstractC1081) it;
            if (!abstractC1081.hasNext()) {
                return z;
            }
            if (collection.contains(((C18015) it).next())) {
                abstractC1081.remove();
                z = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentMapC13783.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        ConcurrentMapC13783 concurrentMapC13783 = this.a;
        long j = concurrentMapC13783.j();
        C19427[] c19427Arr = concurrentMapC13783.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        return new C18721(c19427Arr, length, 0, length, j < 0 ? 0L : j, 1);
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
                consumer.n(c19427A.c);
            }
        }
    }
}
