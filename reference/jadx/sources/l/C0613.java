package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes3.dex */
public final class C0613 extends AbstractC6252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14782 f2427;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        C15243.m36590(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C15243.m36590(collection, "elements");
        this.f2427.m35607();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C15243.m36590(collection, "elements");
        this.f2427.m35607();
        return super.retainAll(collection);
    }

    public C0613(C14782 c14782) {
        this.f2427 = c14782;
    }

    @Override // l.AbstractC6252
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo2737() {
        return this.f2427.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f2427.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2427.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f2427.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C14782 c14782 = this.f2427;
        c14782.getClass();
        return new C4342(c14782);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2427.m35606(obj);
    }
}
