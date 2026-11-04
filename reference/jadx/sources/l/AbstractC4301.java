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

/* JADX INFO: renamed from: l.ۘܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UC92 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4301 extends AbstractCollection implements InterfaceC12835, InterfaceC9372 {
    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public /* synthetic */ void forEach(Consumer consumer) {
        C24024.m53581(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C15072.m36334(this, predicate);
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
        return C3516.convert(mo52749stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo5933(((Character) obj).charValue());
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5933(char c) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo4843(char c) {
        InterfaceC21040 it = iterator();
        while (it.hasNext()) {
            if (c == it.mo5320()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public void mo5932(InterfaceC12089 interfaceC12089) {
        iterator().forEachRemaining(interfaceC12089);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo13694(InterfaceC12835 interfaceC12835) {
        InterfaceC21040 it = interfaceC12835.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo5933(it.mo5320())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC12835) {
            return mo13694((InterfaceC12835) collection);
        }
        return super.addAll(collection);
    }

    @Override // l.InterfaceC12835
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean add(Character ch) {
        return mo5933(ch.charValue());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo13696(InterfaceC12835 interfaceC12835) {
        InterfaceC21040 it = interfaceC12835.iterator();
        while (it.hasNext()) {
            if (!mo5936(it.mo5320())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC12835
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo5936(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC12835) {
            return mo13696((InterfaceC12835) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo13695(InterfaceC12835 interfaceC12835) {
        InterfaceC21040 it = interfaceC12835.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo4843(it.mo5320())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC12835
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo4843(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC12835) {
            return mo13695((InterfaceC12835) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo13697(InterfaceC12835 interfaceC12835) {
        InterfaceC21040 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC12835.mo5936(it.mo5320())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC12835) {
            return mo13697((InterfaceC12835) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC21040 it = iterator();
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
                sb.append(String.valueOf(it.mo5320()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5935(InterfaceC13338 interfaceC13338) {
        InterfaceC21040 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC13338.mo28051(it.mo5320())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC12835, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC12835, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
