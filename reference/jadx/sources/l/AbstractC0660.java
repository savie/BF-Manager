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

/* JADX INFO: renamed from: l.֡᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 91W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0660 extends AbstractCollection implements InterfaceC17572, InterfaceC9372 {
    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public /* synthetic */ void forEach(Consumer consumer) {
        C19064.m44169(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C16826.m39744(this, predicate);
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
        return add(((Float) obj).floatValue());
    }

    @Override // l.InterfaceC17572
    public boolean add(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean mo2883(float f) {
        InterfaceC9367 it = iterator();
        while (it.hasNext()) {
            if (f == it.nextFloat()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10113
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo2884(InterfaceC0419 interfaceC0419) {
        iterator().forEachRemaining(interfaceC0419);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo2881(InterfaceC17572 interfaceC17572) {
        InterfaceC9367 it = interfaceC17572.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // l.InterfaceC17572
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean add(Float f) {
        return add(f.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC17572) {
            return mo2881((InterfaceC17572) collection);
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC17572
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo6580(((Float) obj).floatValue());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo2886(InterfaceC17572 interfaceC17572) {
        InterfaceC9367 it = interfaceC17572.iterator();
        while (it.hasNext()) {
            if (!mo6580(it.nextFloat())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC17572
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo2883(((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC17572) {
            return mo2886((InterfaceC17572) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo2882(InterfaceC17572 interfaceC17572) {
        InterfaceC9367 it = interfaceC17572.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo2883(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC17572) {
            return mo2882((InterfaceC17572) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo2887(InterfaceC17572 interfaceC17572) {
        InterfaceC9367 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC17572.mo6580(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC17572) {
            return mo2887((InterfaceC17572) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC9367 it = iterator();
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

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo2880(InterfaceC1737 interfaceC1737) {
        InterfaceC9367 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC1737.mo6144(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC17572, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC17572, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
