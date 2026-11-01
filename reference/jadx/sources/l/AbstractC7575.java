package l;

import java.util.AbstractSet;

/* JADX INFO: renamed from: l.۟ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7575 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC21937 f25104;

    public AbstractC7575(ConcurrentMapC21937 concurrentMapC21937) {
        this.f25104 = concurrentMapC21937;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25104.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f25104.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f25104.clear();
    }
}
