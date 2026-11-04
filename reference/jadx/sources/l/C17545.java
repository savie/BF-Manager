package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17545 extends AbstractC20529 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f57020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f57021;

    @Override // l.AbstractC20529
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo41196() {
        Set set = this.f57020;
        int iMo41196 = set instanceof AbstractC20529 ? ((AbstractC20529) set).mo41196() : set.size();
        Set set2 = this.f57021;
        return Math.min(iMo41196, set2 instanceof AbstractC20529 ? ((AbstractC20529) set2).mo41196() : set2.size());
    }

    public C17545(Set set, Set set2) {
        this.f57020 = set;
        this.f57021 = set2;
    }

    @Override // l.AbstractC20529, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC4516 iterator() {
        return new C16799(this.f57020, this.f57021);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f57020.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f57021.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f57021, this.f57020);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f57020.contains(obj) && this.f57021.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f57020.containsAll(collection) && this.f57021.containsAll(collection);
    }
}
