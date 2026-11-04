package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18512 extends AbstractC4014 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14782 f60203;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        C15243.m36590(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        C15243.m36590(collection, "elements");
        this.f60203.m35607();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        C15243.m36590(collection, "elements");
        this.f60203.m35607();
        return super.retainAll(collection);
    }

    public C18512(C14782 c14782) {
        this.f60203 = c14782;
    }

    @Override // l.AbstractC4014
    /* JADX INFO: renamed from: ᩷ */
    public final int mo12987() {
        return this.f60203.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f60203.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f60203.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f60203.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f60203.m35608(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C14782 c14782 = this.f60203;
        c14782.getClass();
        return new C24480(c14782);
    }
}
