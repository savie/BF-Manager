package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5687 extends AbstractC23844 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f19405;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f19406;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f19407;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC6910 f19408;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return true;
    }

    public C5687(AbstractC6910 abstractC6910, Object[] objArr, int i, int i2) {
        this.f19408 = abstractC6910;
        this.f19407 = objArr;
        this.f19406 = i;
        this.f19405 = i2;
    }

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        return mo5971().listIterator(0);
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        return mo5971().mo5968(i, objArr);
    }

    @Override // l.AbstractC23844
    /* JADX INFO: renamed from: ֨ */
    public final AbstractC22433 mo12084() {
        return new C2864(this);
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19408.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19405;
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
