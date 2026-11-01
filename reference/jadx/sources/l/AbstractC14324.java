package l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܳۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6Y */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14324 extends AbstractC23496 implements InterfaceC4733, InterfaceC15049 {
    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return mo13102(((Integer) obj).intValue());
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return spliterator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return mo13100(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return mo13104(((Integer) obj).intValue());
    }

    @Override // l.AbstractC23496, l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11790 spliterator() {
        return new C15318(mo13101(), C17745.m41307(this), comparator());
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Integer.valueOf(mo13103());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Integer.valueOf(mo13099());
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo13101();
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ InterfaceC13431 iterator() {
        return mo13101();
    }
}
