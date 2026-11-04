package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10415 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map.Entry f33104;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f33105;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1467 f33106;

    public C10415(C1467 c1467, Iterator it) {
        this.f33105 = it;
        this.f33106 = c1467;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33105.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f33105.next();
        this.f33104 = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C12128.m30314("no calls to next() since the last call to remove()", this.f33104 != null);
        Collection collection = (Collection) this.f33104.getValue();
        this.f33105.remove();
        AbstractC20024.m46062(this.f33106.f5118, collection.size());
        collection.clear();
        this.f33104 = null;
    }
}
