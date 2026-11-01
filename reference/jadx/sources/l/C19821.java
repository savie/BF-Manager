package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19821 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0064 f63626;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Collection f63627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f63628;

    public C19821(C0064 c0064) {
        this.f63626 = c0064;
        this.f63628 = c0064.f963.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63628.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f63628.next();
        this.f63627 = (Collection) entry.getValue();
        return this.f63626.m982(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C18304.m42522("no calls to next() since the last call to remove()", this.f63627 != null);
        this.f63628.remove();
        AbstractC11830.m29506(this.f63626.f964, this.f63627.size());
        this.f63627.clear();
        this.f63627 = null;
    }
}
