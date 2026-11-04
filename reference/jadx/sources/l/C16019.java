package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16019 implements Iterable, InterfaceC22091 {
    public final Iterable a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C16019(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9410(this.a.iterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C4937.forEach(this.a, new C16765(consumer, 1));
    }

    @Override // java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return C13629.spliteratorUnknownSize(iterator(), 0);
    }
}
