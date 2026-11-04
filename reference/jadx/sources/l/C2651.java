package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2651 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21869 f8462;

    public C2651(C21869 c21869) {
        this.f8462 = c21869;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8462.f69702;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C9362(this.f8462);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C4715 c4715M49563;
        if (obj instanceof Map.Entry) {
            C21869 c21869 = this.f8462;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C4715 c4715 = null;
            if (key != null) {
                try {
                    c4715M49563 = c21869.m49563(key, false);
                } catch (ClassCastException unused) {
                    c4715M49563 = null;
                }
            } else {
                c4715M49563 = null;
            }
            if (c4715M49563 != null && C17359.equals(c4715M49563.f16630, entry.getValue())) {
                c4715 = c4715M49563;
            }
            if (c4715 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C4715 c4715M49563;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C21869 c21869 = this.f8462;
            C4715 c4715 = null;
            if (key != null) {
                try {
                    c4715M49563 = c21869.m49563(key, false);
                } catch (ClassCastException unused) {
                    c4715M49563 = null;
                }
            } else {
                c4715M49563 = null;
            }
            if (c4715M49563 != null && C17359.equals(c4715M49563.f16630, entry.getValue())) {
                c4715 = c4715M49563;
            }
            if (c4715 != null) {
                c21869.m49564(c4715, true);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8462.clear();
    }
}
