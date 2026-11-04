package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۤۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10832 extends AbstractC8639 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Object[] f34312;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f34313;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final transient int f34314;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC17589 f34315;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

    public C10832(AbstractC17589 abstractC17589, Object[] objArr, int i, int i2) {
        this.f34315 = abstractC17589;
        this.f34312 = objArr;
        this.f34313 = i;
        this.f34314 = i2;
    }

    @Override // l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        return mo6621().listIterator(0);
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        return mo6621().mo6619(i, objArr);
    }

    @Override // l.AbstractC8639
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC1928 mo23284() {
        return new C22021(this);
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f34315.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34314;
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
