package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10941 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15416 f34600;

    public C10941(C15416 c15416) {
        this.f34600 = c15416;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34600.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f34600.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C15416 c15416 = this.f34600;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.keySet().remove(obj);
        }
        return c15416.m36910(obj) != C15416.f50234;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f34600.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C15416 c15416 = this.f34600;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.keySet().iterator();
        }
        return new C8836(c15416);
    }
}
