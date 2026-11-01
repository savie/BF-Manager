package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܳ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14200 extends AbstractC22477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11752 f46574 = new C11752(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21605 f46575;

    public C14200(C21605 c21605) {
        this.f46575 = c21605;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C6788) this.f46575.mo8943(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C6788) this.f46575.mo8950(((InterfaceC14551) obj).mo17726(), ((InterfaceC14551) obj2).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C6788) this.f46575.mo8952(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f46574;
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C2909(this.f46575);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        return entry.equals(this.f46575.m48311(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C21605 c21605 = this.f46575;
            C9261 c9261M48311 = c21605.m48311(iIntValue);
            if (c9261M48311 != null && C13638.equals(c9261M48311.f29882, entry.getValue())) {
                c21605.remove(c9261M48311.f29881);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46575.f70078;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46575.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f46575.f70079;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f46575.f70080;
    }
}
