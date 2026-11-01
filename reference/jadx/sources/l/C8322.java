package l;

/* JADX INFO: renamed from: l.۠ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8322 extends AbstractC1826 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient AbstractC19611 f28852;

    public C8322(AbstractC19611 abstractC19611) {
        this.f28852 = abstractC19611;
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28852.mo44700(obj);
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        AbstractC19611 abstractC19611 = this.f28852;
        abstractC19611.getClass();
        return new C21727(abstractC19611);
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public final int mo5968(int i, Object[] objArr) {
        AbstractC0477 it = this.f28852.f62963.values().iterator();
        while (it.hasNext()) {
            i = ((AbstractC1826) it.next()).mo5968(i, objArr);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f28852.f62962;
    }

    @Override // l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
