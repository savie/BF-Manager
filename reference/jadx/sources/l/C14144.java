package l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.۬᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C14144 extends C1467 implements SortedSet {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f44728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14144(AbstractC20024 abstractC20024, SortedMap sortedMap) {
        super(abstractC20024, sortedMap);
        this.f44728 = abstractC20024;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo9648().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo9648().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C14144(this.f44728, mo9648().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo9648().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C14144(this.f44728, mo9648().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C14144(this.f44728, mo9648().tailMap(obj));
    }

    /* JADX INFO: renamed from: ۤ */
    public SortedMap mo9648() {
        return (SortedMap) this.f5499;
    }
}
