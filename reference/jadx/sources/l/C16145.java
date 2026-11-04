package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܶܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16145 extends AbstractC20228 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4213 f52434;

    public C16145(C4213 c4213) {
        this.f52434 = c4213;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C4213) this.f52434.mo13472(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C4213) this.f52434.mo13473(((InterfaceC5903) obj).mo3870(), ((InterfaceC5903) obj2).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C4213) this.f52434.mo13475(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C20621(this.f52434);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C5705) this.f52434.f15392.mo13468()).f19704;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C4213 c4213 = this.f52434;
            C11670 c11670M42894 = c4213.f15392.m42894(((Integer) entry.getKey()).intValue());
            if (c11670M42894 != null && c4213.m13471(c11670M42894.f3592) && entry.equals(c11670M42894)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C4213 c4213 = this.f52434;
            C11670 c11670M42894 = c4213.f15392.m42894(((Integer) entry.getKey()).intValue());
            if (c11670M42894 != null && c4213.m13471(c11670M42894.f3592) && C17359.equals(c11670M42894.f3593, entry.getValue())) {
                c4213.remove(c11670M42894.f3592);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C14653) it).hasNext()) {
            i++;
            ((C20621) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f52434.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f52434.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f52434.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C4213 c4213 = this.f52434;
        C11670 c11670 = c4213.f15392.f59888;
        return !(c4213.firstEntry() != null);
    }
}
