package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19366 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f62557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f62560;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f62561 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Collection f62559 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Iterator f62558 = EnumC24085.INSTANCE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo44782(Object obj, Object obj2);

    public AbstractC19366(AbstractC20024 abstractC20024) {
        this.f62557 = abstractC20024;
        this.f62560 = abstractC20024.f64322.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62560.hasNext() || this.f62558.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f62558.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f62560.next();
            this.f62561 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f62559 = collection;
            this.f62558 = collection.iterator();
        }
        return this.f62558.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f62558.remove();
        Collection collection = this.f62559;
        C17359.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f62560.remove();
        }
        AbstractC20024.m46060(this.f62557);
    }
}
