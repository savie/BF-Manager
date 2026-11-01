package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2329 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0918 f8257;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0918 c0918 = this.f8257;
        C22086 c22086M3643 = null;
        if (obj != null) {
            try {
                c22086M3643 = c0918.m3643(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c22086M3643 != null) {
            c0918.m3644(c22086M3643, true);
        }
        return c22086M3643 != null;
    }

    public C2329(C0918 c0918) {
        this.f8257 = c0918;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8257.f3678;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11503(this.f8257);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8257.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8257.clear();
    }
}
