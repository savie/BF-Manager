package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8510 extends AbstractC7804 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f29488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f29489;

    @Override // l.AbstractC7804
    /* JADX INFO: renamed from: ܰ */
    public final int mo20470() {
        Set set = this.f29488;
        int iMo20470 = set instanceof AbstractC7804 ? ((AbstractC7804) set).mo20470() : set.size();
        Set set2 = this.f29489;
        return Math.min(iMo20470, set2 instanceof AbstractC7804 ? ((AbstractC7804) set2).mo20470() : set2.size());
    }

    public C8510(Set set, Set set2) {
        this.f29488 = set;
        this.f29489 = set2;
    }

    @Override // l.AbstractC7804, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC0477 iterator() {
        return new C19093(this.f29488, this.f29489);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f29488.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f29489.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f29489, this.f29488);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29488.contains(obj) && this.f29489.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f29488.containsAll(collection) && this.f29489.containsAll(collection);
    }
}
