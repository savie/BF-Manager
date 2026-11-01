package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3361 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11705 f12448;

    public C3361(C11705 c11705) {
        this.f12448 = c11705;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12448.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12448.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C11705 c11705 = this.f12448;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.keySet().remove(obj);
        }
        return c11705.m29236(obj) != C11705.f39343;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12448.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C11705 c11705 = this.f12448;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.keySet().iterator();
        }
        return new C11124(c11705);
    }
}
