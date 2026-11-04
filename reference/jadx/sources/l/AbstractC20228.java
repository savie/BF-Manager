package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩵֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TBU5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20228 extends AbstractC3074 implements InterfaceC9257, InterfaceC21089 {
    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return spliterator();
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC2546 spliterator() {
        return new C19657(iterator(), C8008.m21873(this), comparator());
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC15224 iterator() {
        return iterator();
    }
}
