package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۫֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12060 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f40343;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Map.Entry f40344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16998 f40345;

    public C12060(C16998 c16998, Iterator it) {
        this.f40343 = it;
        this.f40345 = c16998;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40343.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f40343.next();
        this.f40344 = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C18304.m42522("no calls to next() since the last call to remove()", this.f40344 != null);
        Collection collection = (Collection) this.f40344.getValue();
        this.f40343.remove();
        AbstractC11830.m29506(this.f40345.f54346, collection.size());
        collection.clear();
        this.f40344 = null;
    }
}
