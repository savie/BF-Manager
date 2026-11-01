package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۨ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11728 extends AbstractC22477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6788 f39419;

    public C11728(C6788 c6788) {
        this.f39419 = c6788;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C6788) this.f39419.mo8943(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C6788) this.f39419.mo8950(((InterfaceC14551) obj).mo17726(), ((InterfaceC14551) obj2).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C6788) this.f39419.mo8952(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C22311(this.f39419);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C14200) this.f39419.f22917.mo8949()).f46574;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C6788 c6788 = this.f39419;
            C9261 c9261M48311 = c6788.f22917.m48311(((Integer) entry.getKey()).intValue());
            if (c9261M48311 != null && c6788.m18390(c9261M48311.f29881) && entry.equals(c9261M48311)) {
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
            C6788 c6788 = this.f39419;
            C9261 c9261M48311 = c6788.f22917.m48311(((Integer) entry.getKey()).intValue());
            if (c9261M48311 != null && c6788.m18390(c9261M48311.f29881)) {
                c6788.remove(c9261M48311.f29881);
            }
            if (c9261M48311 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C23017) it).hasNext()) {
            i++;
            ((C22311) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39419.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f39419.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f39419.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C6788 c6788 = this.f39419;
        C9261 c9261 = c6788.f22917.f70079;
        return !(c6788.firstEntry() != null);
    }
}
