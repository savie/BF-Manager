package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17261 extends AbstractMap {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Set f56236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Collection f56237;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f56236;
        if (set != null) {
            return set;
        }
        C18620 c18620 = new C18620((C8179) this);
        this.f56236 = c18620;
        return c18620;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f56237;
        if (collection != null) {
            return collection;
        }
        C16515 c16515 = new C16515(this);
        this.f56237 = c16515;
        return c16515;
    }
}
