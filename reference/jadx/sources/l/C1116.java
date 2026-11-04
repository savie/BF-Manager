package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1116 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC5942 f4175;

    public C1116(ConcurrentMapC5942 concurrentMapC5942) {
        this.f4175 = concurrentMapC5942;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4175.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f4175.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4175.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C19015(this.f4175);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4175.containsValue(obj);
    }
}
