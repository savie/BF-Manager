package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֡᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0721 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Collection f2650;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8179 f2651;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f2652;

    public C0721(C8179 c8179) {
        this.f2651 = c8179;
        this.f2652 = c8179.f26975.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2652.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f2652.next();
        this.f2650 = (Collection) entry.getValue();
        return this.f2651.m22089(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C12128.m30314("no calls to next() since the last call to remove()", this.f2650 != null);
        this.f2652.remove();
        AbstractC20024.m46062(this.f2651.f26974, this.f2650.size());
        this.f2650.clear();
        this.f2650 = null;
    }
}
