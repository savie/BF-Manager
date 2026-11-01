package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4877 extends AbstractC7575 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC21937 f17156;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4877(ConcurrentMapC21937 concurrentMapC21937) {
        super(concurrentMapC21937);
        this.f17156 = concurrentMapC21937;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3341(this.f17156);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        ConcurrentMapC21937 concurrentMapC21937;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (concurrentMapC21937 = this.f17156).get(key)) != null && concurrentMapC21937.f71164.m34035(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f17156.remove(key, entry.getValue());
    }
}
