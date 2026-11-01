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

/* JADX INFO: renamed from: l.᩶ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: EC53 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20257 extends AbstractCollection implements InterfaceC14800, InterfaceC10441 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C19988.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return add(((Long) obj).longValue());
    }

    public boolean add(long j) {
        throw new UnsupportedOperationException();
    }

    public void forEach(LongConsumer longConsumer) {
        iterator().forEachRemaining(longConsumer);
    }

    public void forEach(Consumer consumer) {
        C13638.requireNonNull(consumer);
        forEach(consumer instanceof LongConsumer ? (LongConsumer) consumer : new C2699(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo6642(((Long) obj).longValue());
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6641(InterfaceC14800 interfaceC14800) {
        InterfaceC1288 it = interfaceC14800.iterator();
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
        return mo21796(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC14800) {
            return mo6641((InterfaceC14800) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo6644(InterfaceC14800 interfaceC14800) {
        InterfaceC1288 it = interfaceC14800.iterator();
        while (it.hasNext()) {
            if (!mo6642(it.nextLong())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC14800) {
            return mo6644((InterfaceC14800) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo6643(InterfaceC14800 interfaceC14800) {
        InterfaceC1288 it = interfaceC14800.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo21796(it.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC14800) {
            return mo6643((InterfaceC14800) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo6639(InterfaceC14800 interfaceC14800) {
        InterfaceC1288 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC14800.mo6642(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC14800) {
            return mo6639((InterfaceC14800) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC1288 it = iterator();
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

    @Override // java.util.Collection, l.InterfaceC10441
    public boolean removeIf(final Predicate predicate) {
        return mo6640(predicate instanceof LongPredicate ? (LongPredicate) predicate : new LongPredicate() { // from class: l.᩻᩸ᩴ
            public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
                return C18389.$default$and(this, longPredicate);
            }

            public /* synthetic */ LongPredicate negate() {
                return C18389.$default$negate(this);
            }

            public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
                return C18389.$default$or(this, longPredicate);
            }

            @Override // java.util.function.LongPredicate
            public final boolean test(long j) {
                return predicate.test(Long.valueOf(j));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6640(LongPredicate longPredicate) {
        C13638.requireNonNull(longPredicate);
        InterfaceC1288 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (longPredicate.test(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }
}
