package l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.֫֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1475 extends C16998 implements SortedSet {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f6004;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1475(AbstractC11830 abstractC11830, SortedMap sortedMap) {
        super(abstractC11830, sortedMap);
        this.f6004 = abstractC11830;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo5121().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo5121().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new C1475(this.f6004, mo5121().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo5121().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C1475(this.f6004, mo5121().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C1475(this.f6004, mo5121().tailMap(obj));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SortedMap mo5121() {
        return (SortedMap) this.f74624;
    }
}
