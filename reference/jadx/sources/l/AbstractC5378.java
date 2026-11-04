package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5378 extends AbstractC4301 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC4301, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public final void mo5932(InterfaceC12089 interfaceC12089) {
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5935(InterfaceC13338 interfaceC13338) {
        return false;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        return false;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C9851.f31712;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ InterfaceC21040 iterator() {
        return C9851.f31712;
    }

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return C21543.f68822;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C8338.f27328;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return C21543.f68822;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4301, java.util.Collection, l.InterfaceC9372
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C17359.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo13696(InterfaceC12835 interfaceC12835) {
        return interfaceC12835.isEmpty();
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13694(InterfaceC12835 interfaceC12835) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo13695(InterfaceC12835 interfaceC12835) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo13697(InterfaceC12835 interfaceC12835) {
        throw new UnsupportedOperationException();
    }
}
