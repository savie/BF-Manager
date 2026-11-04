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

/* JADX INFO: renamed from: l.ۜۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1Q1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6957 extends AbstractCollection implements InterfaceC1340, InterfaceC9372 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C3052.m9926(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10288.m26521(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo4933(int i) {
        InterfaceC6036 it = iterator();
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

    /* JADX INFO: renamed from: ۘ */
    public int[] mo2687() {
        int size = size();
        if (size == 0) {
            return C8052.f26680;
        }
        int[] iArr = new int[size];
        InterfaceC6036 it = iterator();
        if (size < 0) {
            throw new IllegalArgumentException(C14442.m34864(size, "The maximum number of elements (", ") is negative"));
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public boolean add(Integer num) {
        return add(num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC1340
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return contains(((Integer) obj).intValue());
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo14692(InterfaceC1340 interfaceC1340) {
        InterfaceC6036 it = interfaceC1340.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC1340
    @Deprecated
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo4933(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC1340) {
            return mo14692((InterfaceC1340) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo19257(InterfaceC1340 interfaceC1340) {
        InterfaceC6036 it = interfaceC1340.iterator();
        while (it.hasNext()) {
            if (!contains(it.nextInt())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC1340) {
            return mo19257((InterfaceC1340) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo14696(InterfaceC1340 interfaceC1340) {
        InterfaceC6036 it = interfaceC1340.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo4933(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC1340) {
            return mo14696((InterfaceC1340) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo14701(InterfaceC1340 interfaceC1340) {
        InterfaceC6036 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC1340.contains(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC1340) {
            return mo14701((InterfaceC1340) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6036 it = iterator();
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
    public boolean mo4932(IntPredicate intPredicate) {
        C17359.requireNonNull(intPredicate);
        InterfaceC6036 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (intPredicate.test(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC1340
    public final InterfaceC20670 stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1340
    public final InterfaceC20670 parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
