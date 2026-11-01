package l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܳ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C14177 extends C0064 implements SortedMap {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public SortedSet f46530;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f46531;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14177(AbstractC11830 abstractC11830, SortedMap sortedMap) {
        super(abstractC11830, sortedMap);
        this.f46531 = abstractC11830;
    }

    /* JADX INFO: renamed from: ܰ */
    public SortedMap mo15745() {
        return (SortedMap) this.f963;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo15745().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo15745().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo15745().lastKey();
    }

    public SortedMap headMap(Object obj) {
        return new C14177(this.f46531, mo15745().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C14177(this.f46531, mo15745().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C14177(this.f46531, mo15745().tailMap(obj));
    }

    @Override // l.C0064, java.util.AbstractMap, java.util.Map
    public SortedSet keySet() {
        SortedSet sortedSet = this.f46530;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo15744 = mo15744();
        this.f46530 = sortedSetMo15744;
        return sortedSetMo15744;
    }

    /* JADX INFO: renamed from: ۙ */
    public SortedSet mo15744() {
        return new C1475(this.f46531, mo15745());
    }
}
