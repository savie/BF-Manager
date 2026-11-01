package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17577 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC21937 f55869;

    public C17577(ConcurrentMapC21937 concurrentMapC21937) {
        this.f55869 = concurrentMapC21937;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f55869.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f55869.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f55869.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C16872(this.f55869);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f55869.containsValue(obj);
    }
}
