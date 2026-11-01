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

/* JADX INFO: renamed from: l.ۘۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC92 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3861 extends AbstractCollection implements InterfaceC23475, InterfaceC10441 {
    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public /* synthetic */ void forEach(Consumer consumer) {
        C3986.m11487(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10775.m27076(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
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
        return mo2291(((Character) obj).charValue());
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo2291(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ۚ */
    public boolean mo5455(char c) {
        InterfaceC15277 it = iterator();
        while (it.hasNext()) {
            if (c == it.mo1416()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2288(InterfaceC1164 interfaceC1164) {
        iterator().forEachRemaining(interfaceC1164);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2290(InterfaceC23475 interfaceC23475) {
        InterfaceC15277 it = interfaceC23475.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo2291(it.mo1416())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC23475) {
            return mo2290((InterfaceC23475) collection);
        }
        return super.addAll(collection);
    }

    @Override // l.InterfaceC23475
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean add(Character ch) {
        return mo2291(ch.charValue());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo11183(InterfaceC23475 interfaceC23475) {
        InterfaceC15277 it = interfaceC23475.iterator();
        while (it.hasNext()) {
            if (!mo2286(it.mo1416())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC23475
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo2286(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC23475) {
            return mo11183((InterfaceC23475) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo11182(InterfaceC23475 interfaceC23475) {
        InterfaceC15277 it = interfaceC23475.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo5455(it.mo1416())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC23475
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo5455(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC23475) {
            return mo11182((InterfaceC23475) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean mo11181(InterfaceC23475 interfaceC23475) {
        InterfaceC15277 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC23475.mo2286(it.mo1416())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC23475) {
            return mo11181((InterfaceC23475) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15277 it = iterator();
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
                sb.append(String.valueOf(it.mo1416()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5454(InterfaceC23744 interfaceC23744) {
        InterfaceC15277 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC23744.mo16050(it.mo1416())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC23475, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC23475, l.InterfaceC10441
    public final InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
