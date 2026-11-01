package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10483 extends AbstractC15735 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7660 f35924;

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C10483(C7660 c7660) {
        this.f35924 = c7660;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f35924.mo17316(i);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C19655(this);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C19655(this);
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return new C9072(this, 0, this.f35924.f25321);
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
        C7660 c7660 = this.f35924;
        int[] iArr = c7660.f25319;
        int i = c7660.f25321;
        for (int i2 = 0; i2 < i; i2++) {
            intConsumer.accept(iArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f35924.f25321;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f35924.clear();
    }
}
