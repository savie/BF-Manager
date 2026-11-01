package l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۠ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9OW */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C8120 extends AbstractList implements InterfaceC17935, RandomAccess {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21463 f28440;

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17935 mo21382() {
        return this;
    }

    public C8120(C21463 c21463) {
        this.f28440 = c21463;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f28440.get(i);
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Object mo21384(int i) {
        return this.f28440.mo21384(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28440.size();
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21383(AbstractC23725 abstractC23725) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C17997 c17997 = new C17997();
        c17997.f57537 = ((AbstractList) this.f28440).listIterator(i);
        return c17997;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C18703 c18703 = new C18703();
        c18703.f60675 = ((AbstractList) this.f28440).iterator();
        return c18703;
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List mo21385() {
        return this.f28440.mo21385();
    }
}
