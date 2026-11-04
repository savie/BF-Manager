package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.۬۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: EC53 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13711 extends AbstractCollection implements InterfaceC5574, InterfaceC9372 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(mo52749stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return add(((Long) obj).longValue());
    }

    @Override // l.InterfaceC5574
    public boolean add(long j) {
        throw new UnsupportedOperationException();
    }

    public void forEach(LongConsumer longConsumer) {
        iterator().forEachRemaining(longConsumer);
    }

    public void forEach(Consumer consumer) {
        C17359.requireNonNull(consumer);
        forEach(consumer instanceof LongConsumer ? (LongConsumer) consumer : new C23474(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo6352(((Long) obj).longValue());
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6350(InterfaceC5574 interfaceC5574) {
        InterfaceC12285 it = interfaceC5574.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo16517(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC5574) {
            return mo6350((InterfaceC5574) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo6353(InterfaceC5574 interfaceC5574) {
        InterfaceC12285 it = interfaceC5574.iterator();
        while (it.hasNext()) {
            if (!mo6352(it.nextLong())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC5574) {
            return mo6353((InterfaceC5574) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo6351(InterfaceC5574 interfaceC5574) {
        InterfaceC12285 it = interfaceC5574.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo16517(it.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC5574) {
            return mo6351((InterfaceC5574) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo6354(InterfaceC5574 interfaceC5574) {
        InterfaceC12285 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC5574.mo6352(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC5574) {
            return mo6354((InterfaceC5574) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12285 it = iterator();
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(String.valueOf(it.nextLong()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public boolean removeIf(final Predicate predicate) {
        return mo6349(predicate instanceof LongPredicate ? (LongPredicate) predicate : new LongPredicate() { // from class: l.۫ۢ᩹
            public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
                return C0380.$default$and(this, longPredicate);
            }

            public /* synthetic */ LongPredicate negate() {
                return C0380.$default$negate(this);
            }

            public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
                return C0380.$default$or(this, longPredicate);
            }

            @Override // java.util.function.LongPredicate
            public final boolean test(long j) {
                return predicate.test(Long.valueOf(j));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6349(LongPredicate longPredicate) {
        C17359.requireNonNull(longPredicate);
        InterfaceC12285 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (longPredicate.test(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }
}
