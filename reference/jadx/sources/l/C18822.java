package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18822 extends AbstractC20172 implements Set {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collection f60999;

    public C18822(Collection collection) {
        this.f60999 = collection;
    }

    @Override // l.AbstractC16644
    /* JADX INFO: renamed from: ۚ */
    public final Object mo2173() {
        return this.f60999;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C21209.m47668(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return C21209.m47673(this, obj);
    }
}
