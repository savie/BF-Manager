package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۛۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5827 implements InterfaceC8616 {
    public final Collection a;

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.F(this, j, j2, intFunction);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC8616 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C5827(Collection collection) {
        this.a = collection;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        return C9030.stream(this.a).spliterator();
    }

    @Override // l.InterfaceC8616
    public final void k(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // l.InterfaceC8616
    public final Object[] m(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // l.InterfaceC8616
    public final long count() {
        return this.a.size();
    }

    @Override // l.InterfaceC8616
    public final void forEach(Consumer consumer) {
        C9030.a(this.a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.a.size()), this.a);
    }
}
