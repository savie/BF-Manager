package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7126 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21869 f23485;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C21869 c21869 = this.f23485;
        C4715 c4715M49563 = null;
        if (obj != null) {
            try {
                c4715M49563 = c21869.m49563(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c4715M49563 != null) {
            c21869.m49564(c4715M49563, true);
        }
        return c4715M49563 != null;
    }

    public C7126(C21869 c21869) {
        this.f23485 = c21869;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23485.f69702;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8617(this.f23485);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23485.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23485.clear();
    }
}
