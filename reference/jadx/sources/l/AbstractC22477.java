package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩹ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBU5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22477 extends AbstractC5543 implements InterfaceC10194, InterfaceC15049 {
    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return spliterator();
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC7371 spliterator() {
        return new C5960(iterator(), C17745.m41307(this), comparator());
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC6269 iterator() {
        return iterator();
    }
}
