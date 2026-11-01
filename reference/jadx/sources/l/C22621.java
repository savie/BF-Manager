package l;

/* JADX INFO: renamed from: l.᩹᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22621 extends AbstractC23844 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient AbstractC6910 f73715;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f73716;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return true;
    }

    public C22621(AbstractC6910 abstractC6910, AbstractC22433 abstractC22433) {
        this.f73715 = abstractC6910;
        this.f73716 = abstractC22433;
    }

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        return this.f73716.listIterator(0);
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        return this.f73716.mo5968(i, objArr);
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC22433 mo5971() {
        return this.f73716;
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f73715.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73715.size();
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
