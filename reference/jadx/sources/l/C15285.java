package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15285 extends AbstractC14868 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC5942 f49971;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15285(ConcurrentMapC5942 concurrentMapC5942) {
        super(concurrentMapC5942);
        this.f49971 = concurrentMapC5942;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C19761(this.f49971);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f49971.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f49971.remove(obj) != null;
    }
}
