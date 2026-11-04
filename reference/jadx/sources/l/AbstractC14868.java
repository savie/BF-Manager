package l;

import java.util.AbstractSet;

/* JADX INFO: renamed from: l.ܰ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14868 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC5942 f48593;

    public AbstractC14868(ConcurrentMapC5942 concurrentMapC5942) {
        this.f48593 = concurrentMapC5942;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f48593.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f48593.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f48593.clear();
    }
}
