package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۡۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C8637 extends AbstractC22477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19220 f29796 = new C19220();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2991 f29797;

    public C8637(C2991 c2991) {
        this.f29797 = c2991;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C14282) this.f29797.mo8943(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C14282) this.f29797.mo8950(((InterfaceC14551) obj).mo17726(), ((InterfaceC14551) obj2).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C14282) this.f29797.mo8952(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f29796;
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C20631(this.f29797);
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
        return entry.equals(this.f29797.m8948(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        C2991 c2991 = this.f29797;
        C7225 c7225M8948 = c2991.m8948(iIntValue);
        if (c7225M8948 == null || !C13638.equals(c7225M8948.f29882, entry.getValue())) {
            return false;
        }
        c2991.remove(c7225M8948.f29881);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29797.f11224;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29797.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f29797.f11225;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f29797.f11226;
    }
}
