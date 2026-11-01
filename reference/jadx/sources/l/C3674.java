package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۘۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3674 extends AbstractC22477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12848 f13434 = new C12848();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16376 f13435;

    public C3674(C16376 c16376) {
        this.f13435 = c16376;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C15671) this.f13435.mo37338(((InterfaceC14260) obj).mo14566())).mo8794();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C15671) this.f13435.mo37340(((InterfaceC14260) obj).mo14566(), ((InterfaceC14260) obj2).mo14566())).mo8794();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C15671) this.f13435.mo37342(((InterfaceC14260) obj).mo14566())).mo8794();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f13434;
    }

    @Override // l.AbstractC22477, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC21086 iterator() {
        return new C14965(this.f13435);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        return entry.equals(this.f13435.m38563(((Character) entry.getKey()).charValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C16376 c16376 = this.f13435;
            C22726 c22726M38563 = c16376.m38563(cCharValue);
            if (c22726M38563 != null && C13638.equals(c22726M38563.f18266, entry.getValue())) {
                c16376.mo7436(c22726M38563.f18265);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13435.f52700;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13435.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f13435.f52701;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f13435.f52702;
    }
}
