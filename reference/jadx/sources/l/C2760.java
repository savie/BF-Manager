package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2760 extends AbstractC7575 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC21937 f10574;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2760(ConcurrentMapC21937 concurrentMapC21937) {
        super(concurrentMapC21937);
        this.f10574 = concurrentMapC21937;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11934(this.f10574);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f10574.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f10574.remove(obj) != null;
    }
}
