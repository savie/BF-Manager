package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܺۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1Q1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15735 extends AbstractCollection implements InterfaceC10131, InterfaceC10441 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C5669.m15559(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C8720.m22565(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
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

    public boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo3182(int i) {
        InterfaceC13431 it = iterator();
        while (it.hasNext()) {
            if (i == it.nextInt()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void forEach(IntConsumer intConsumer) {
        iterator().forEachRemaining(intConsumer);
    }

    /* JADX INFO: renamed from: ᩷ */
    public int[] mo3181() {
        int size = size();
        if (size == 0) {
            return C8014.f26269;
        }
        int[] iArr = new int[size];
        InterfaceC13431 it = iterator();
        if (size < 0) {
            throw new IllegalArgumentException(C2271.m6966(size, "The maximum number of elements (", ") is negative"));
        }
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0 || !it.hasNext()) {
                break;
            }
            iArr[i] = it.nextInt();
            i++;
            size = i2;
        }
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        return add(num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC10131
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return contains(((Integer) obj).intValue());
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo3172(InterfaceC10131 interfaceC10131) {
        InterfaceC13431 it = interfaceC10131.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC10131
    @Deprecated
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo3182(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC10131) {
            return mo3172((InterfaceC10131) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo19503(InterfaceC10131 interfaceC10131) {
        InterfaceC13431 it = interfaceC10131.iterator();
        while (it.hasNext()) {
            if (!contains(it.nextInt())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC10131) {
            return mo19503((InterfaceC10131) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo3176(InterfaceC10131 interfaceC10131) {
        InterfaceC13431 it = interfaceC10131.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo3182(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC10131) {
            return mo3176((InterfaceC10131) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo3165(InterfaceC10131 interfaceC10131) {
        InterfaceC13431 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC10131.contains(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC10131) {
            return mo3165((InterfaceC10131) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC13431 it = iterator();
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
                sb.append(String.valueOf(it.nextInt()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo3171(IntPredicate intPredicate) {
        C13638.requireNonNull(intPredicate);
        InterfaceC13431 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (intPredicate.test(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC10131
    public final InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC10131
    public final InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
