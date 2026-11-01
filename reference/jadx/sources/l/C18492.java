package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ᩴۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18492 extends AbstractC22477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15671 f58933;

    public C18492(C15671 c15671) {
        this.f58933 = c15671;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C15671) this.f58933.mo37338(((InterfaceC14260) obj).mo14566())).mo8794();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C15671) this.f58933.mo37340(((InterfaceC14260) obj).mo14566(), ((InterfaceC14260) obj2).mo14566())).mo8794();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C15671) this.f58933.mo37342(((InterfaceC14260) obj).mo14566())).mo8794();
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C8615(this.f58933);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C3674) this.f58933.f50887.mo8794()).f13434;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C15671 c15671 = this.f58933;
            C22726 c22726M38563 = c15671.f50887.m38563(((Character) entry.getKey()).charValue());
            if (c22726M38563 != null && c15671.m37339(c22726M38563.f18265) && entry.equals(c22726M38563)) {
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
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C15671 c15671 = this.f58933;
            C22726 c22726M38563 = c15671.f50887.m38563(((Character) entry.getKey()).charValue());
            if (c22726M38563 != null && c15671.m37339(c22726M38563.f18265)) {
                c15671.mo7436(c22726M38563.f18265);
            }
            if (c22726M38563 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C19904) it).hasNext()) {
            i++;
            ((C8615) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f58933.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f58933.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f58933.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C15671 c15671 = this.f58933;
        C22726 c22726 = c15671.f50887.f52701;
        return !(c15671.firstEntry() != null);
    }
}
