package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15295 extends AbstractC6724 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterable f49835;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18116 f49836;

    public C15295(C18116 c18116, Collection collection) {
        this.f49836 = c18116;
        this.f49835 = collection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C9548)) {
            return null;
        }
        C9548 c9548 = (C9548) obj;
        C21644 c21644 = (C21644) this.f49836.f57930.get(c9548.f32247);
        if (c21644 == null || !((C9548) c21644.getKey()).equals(c9548)) {
            return null;
        }
        return c21644.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f49836.f57930.size();
    }

    @Override // l.AbstractC6724
    /* JADX INFO: renamed from: ۙ */
    public final Iterator mo18156() {
        return this.f49835.iterator();
    }
}
