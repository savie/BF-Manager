package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17194 extends AbstractC7959 implements Set {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Collection f56023;

    public C17194(Collection collection) {
        this.f56023 = collection;
    }

    @Override // l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo26313() {
        return this.f56023;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C12324.m30737(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return C12324.m30742(this, obj);
    }
}
