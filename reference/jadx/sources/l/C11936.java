package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11936 implements Iterable, InterfaceC16585 {
    public final Iterable a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C11936(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10152(this.a.iterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C0356.forEach(this.a, new C4879(consumer, 1));
    }

    @Override // java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return C19988.b(iterator(), 0);
    }
}
