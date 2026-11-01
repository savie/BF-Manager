package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.֡ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C0169 extends AbstractC22477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14282 f1262;

    public C0169(C14282 c14282) {
        this.f1262 = c14282;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C14282) this.f1262.mo8943(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C14282) this.f1262.mo8950(((InterfaceC14551) obj).mo17726(), ((InterfaceC14551) obj2).mo17726())).mo8949();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C14282) this.f1262.mo8952(((InterfaceC14551) obj).mo17726())).mo8949();
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C17103(this.f1262);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C8637) this.f1262.f46804.mo8949()).f29796;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C14282 c14282 = this.f1262;
            C7225 c7225M8948 = c14282.f46804.m8948(((Integer) entry.getKey()).intValue());
            if (c7225M8948 != null && c14282.m34514(c7225M8948.f29881) && entry.equals(c7225M8948)) {
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
            C14282 c14282 = this.f1262;
            C7225 c7225M8948 = c14282.f46804.m8948(((Integer) entry.getKey()).intValue());
            if (c7225M8948 != null && c14282.m34514(c7225M8948.f29881)) {
                c14282.remove(c7225M8948.f29881);
            }
            if (c7225M8948 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C1580) it).hasNext()) {
            i++;
            ((C17103) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1262.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f1262.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f1262.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C14282 c14282 = this.f1262;
        C7225 c7225 = c14282.f46804.f11225;
        return !(c14282.firstEntry() != null);
    }
}
