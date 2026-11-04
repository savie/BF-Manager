package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۙۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4855 extends AbstractC24709 implements InterfaceC9372 {
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

    @Override // java.util.Collection, java.lang.Iterable
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

    @Override // l.AbstractC24709, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // l.AbstractC24709, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC12028 abstractC12028;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC12028 = (AbstractC12028) it;
            if (!abstractC12028.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C0096) it).next()));
        abstractC12028.remove();
        return true;
    }

    @Override // l.AbstractC24709, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentMapC17249 concurrentMapC17249 = this.a;
        C9790[] c9790Arr = concurrentMapC17249.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        return new C0096(c9790Arr, length, length, concurrentMapC17249, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC24709, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            AbstractC12028 abstractC12028 = (AbstractC12028) it;
            if (!abstractC12028.hasNext()) {
                return z;
            }
            if (collection.contains(((C0096) it).next())) {
                abstractC12028.remove();
                z = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentMapC17249.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        ConcurrentMapC17249 concurrentMapC17249 = this.a;
        long j = concurrentMapC17249.j();
        C9790[] c9790Arr = concurrentMapC17249.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        return new C7554(c9790Arr, length, 0, length, j < 0 ? 0L : j, 1);
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
                consumer.n(c9790A.c);
            }
        }
    }
}
