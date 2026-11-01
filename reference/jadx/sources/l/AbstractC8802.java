package l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۡۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YRI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8802 extends AbstractC19385 implements InterfaceC4630, InterfaceC15049 {
    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C15671) ((C1039) this).f4840.mo37338(((Character) obj).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C15671) ((C1039) this).f4840.mo37340(((Character) obj).charValue(), ((Character) obj2).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C15671) ((C1039) this).f4840.mo37342(((Character) obj).charValue())).keySet();
    }

    @Override // l.AbstractC19385, l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        InterfaceC20921 interfaceC20921Mo12780 = mo12780();
        long jM41307 = C17745.m41307(this);
        ((C1039) this).f4840.comparator();
        return new C22976(interfaceC20921Mo12780, jM41307, null);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Character.valueOf(((C1039) this).f4840.mo37341());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Character.valueOf(((C1039) this).f4840.mo37343());
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo12780();
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC15277 iterator() {
        return mo12780();
    }
}
