package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2279 extends AbstractC5329 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterable f7425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25400 f7426;

    public C2279(C25400 c25400, Collection collection) {
        this.f7426 = c25400;
        this.f7425 = collection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C2346)) {
            return null;
        }
        C2346 c2346 = (C2346) obj;
        C11973 c11973 = (C11973) this.f7426.f81980.get(c2346.f7568);
        if (c11973 == null || !((C2346) c11973.getKey()).equals(c2346)) {
            return null;
        }
        return c11973.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7426.f81980.size();
    }

    @Override // l.AbstractC5329
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator mo7724() {
        return this.f7425.iterator();
    }
}
