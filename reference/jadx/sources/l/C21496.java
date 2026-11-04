package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes.dex */
public final class C21496 extends AbstractC16274 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14782 f68716;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        C15243.m36590(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        C15243.m36590(collection, "elements");
        return this.f68716.m35604(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        C15243.m36590(collection, "elements");
        this.f68716.m35607();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        C15243.m36590(collection, "elements");
        this.f68716.m35607();
        return super.retainAll(collection);
    }

    @Override // l.AbstractC16274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo38606(Map.Entry entry) {
        C15243.m36590(entry, "element");
        return this.f68716.m35605(entry);
    }

    @Override // l.AbstractC16274
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo38607(Map.Entry entry) {
        C15243.m36590(entry, "element");
        return this.f68716.m35609(entry);
    }

    public C21496(C14782 c14782) {
        this.f68716 = c14782;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C15243.m36590((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4014
    /* JADX INFO: renamed from: ᩷ */
    public final int mo12987() {
        return this.f68716.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f68716.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f68716.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C14782 c14782 = this.f68716;
        c14782.getClass();
        return new C20750(c14782);
    }
}
