package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩳۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18036 extends AbstractCollection implements InterfaceC13535, InterfaceC10441 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C7890.m20823(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C4361.m12205(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
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
        return add(((Float) obj).floatValue());
    }

    public boolean add(float f) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۚ */
    public boolean mo6889(float f) {
        InterfaceC10007 it = iterator();
        while (it.hasNext()) {
            if (f == it.nextFloat()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo6890(InterfaceC17767 interfaceC17767) {
        iterator().forEachRemaining(interfaceC17767);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo28524(InterfaceC13535 interfaceC13535) {
        InterfaceC10007 it = interfaceC13535.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // l.InterfaceC13535
    @Deprecated
    /* JADX INFO: renamed from: ܰ */
    public final boolean add(Float f) {
        return add(f.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC13535) {
            return mo28524((InterfaceC13535) collection);
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC13535
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo5900(((Float) obj).floatValue());
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo28525(InterfaceC13535 interfaceC13535) {
        InterfaceC10007 it = interfaceC13535.iterator();
        while (it.hasNext()) {
            if (!mo5900(it.nextFloat())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC13535
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo6889(((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC13535) {
            return mo28525((InterfaceC13535) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo27738(InterfaceC13535 interfaceC13535) {
        InterfaceC10007 it = interfaceC13535.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo6889(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC13535) {
            return mo27738((InterfaceC13535) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo28523(InterfaceC13535 interfaceC13535) {
        InterfaceC10007 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC13535.mo5900(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC13535) {
            return mo28523((InterfaceC13535) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC10007 it = iterator();
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
                sb.append(String.valueOf(it.nextFloat()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6888(InterfaceC1539 interfaceC1539) {
        InterfaceC10007 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC1539.mo5315(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC13535, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC13535, l.InterfaceC10441
    public final InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
