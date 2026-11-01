package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1950 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11705 f7350;

    public C1950(C11705 c11705) {
        this.f7350 = c11705;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7350.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7350.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C11705 c11705 = this.f7350;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iM29225 = c11705.m29225(entry.getKey());
        return iM29225 != -1 && C13638.equals(C11705.m29238(c11705, iM29225), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C11705 c11705 = this.f7350;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (c11705.m29245()) {
            return false;
        }
        int iM29223 = c11705.m29223();
        int iM7909 = C2531.m7909(entry.getKey(), entry.getValue(), iM29223, C11705.m29237(c11705), c11705.m29233(), c11705.m29239(), c11705.m29240());
        if (iM7909 == -1) {
            return false;
        }
        c11705.m29243(iM7909, iM29223);
        C11705.m29241(c11705);
        c11705.m29247();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C11705 c11705 = this.f7350;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.entrySet().iterator();
        }
        return new C23824(c11705);
    }
}
