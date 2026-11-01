package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18719 extends AbstractMap {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient Set f60725;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Collection f60726;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f60725;
        if (set != null) {
            return set;
        }
        C15588 c15588 = new C15588((C0064) this);
        this.f60725 = c15588;
        return c15588;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f60726;
        if (collection != null) {
            return collection;
        }
        C18013 c18013 = new C18013(this);
        this.f60726 = c18013;
        return c18013;
    }
}
