package l;

/* JADX INFO: renamed from: l.᩸ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22767 extends AbstractC8639 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f73870;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient AbstractC17589 f73871;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

    public C22767(AbstractC17589 abstractC17589, AbstractC1928 abstractC1928) {
        this.f73871 = abstractC17589;
        this.f73870 = abstractC1928;
    }

    @Override // l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        return this.f73870.listIterator(0);
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        return this.f73870.mo6619(i, objArr);
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1928 mo6621() {
        return this.f73870;
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f73871.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73871.size();
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
