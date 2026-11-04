package l;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۚ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W6Y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5991 extends AbstractC13448 implements InterfaceC16695, InterfaceC21089 {
    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return mo8338(((Integer) obj).intValue());
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return spliterator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return mo8334(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return mo8336(((Integer) obj).intValue());
    }

    @Override // l.AbstractC13448, l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15949 spliterator() {
        return new C21171(mo11424(), C8008.m21873(this), comparator());
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return Integer.valueOf(mo8337());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return Integer.valueOf(mo8335());
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo11424();
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC6036 iterator() {
        return mo11424();
    }
}
