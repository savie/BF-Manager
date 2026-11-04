package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10810 extends AbstractC14868 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC5942 f34297;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10810(ConcurrentMapC5942 concurrentMapC5942) {
        super(concurrentMapC5942);
        this.f34297 = concurrentMapC5942;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21999(this.f34297);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        ConcurrentMapC5942 concurrentMapC5942;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (concurrentMapC5942 = this.f34297).get(key)) != null && concurrentMapC5942.f20350.m31910(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f34297.remove(key, entry.getValue());
    }
}
