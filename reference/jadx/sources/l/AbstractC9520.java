package l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۡܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YRI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9520 extends AbstractC1318 implements InterfaceC17067, InterfaceC21089 {
    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C7240) ((C6539) this).f21975.mo19865(((Character) obj).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C7240) ((C6539) this).f21975.mo19864(((Character) obj).charValue(), ((Character) obj2).charValue())).keySet();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C7240) ((C6539) this).f21975.mo19860(((Character) obj).charValue())).keySet();
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        InterfaceC8360 interfaceC8360Mo2497 = mo2497();
        long jM21873 = C8008.m21873(this);
        ((C6539) this).f21975.comparator();
        return new C14829(interfaceC8360Mo2497, jM21873, null);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Character.valueOf(((C6539) this).f21975.mo19862());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Character.valueOf(((C6539) this).f21975.mo19861());
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo2497();
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ InterfaceC21040 iterator() {
        return mo2497();
    }
}
