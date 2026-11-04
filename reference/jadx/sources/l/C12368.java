package l;

/* JADX INFO: renamed from: l.ۨ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12368 extends AbstractC4911 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient AbstractC6403 f39725;

    public C12368(AbstractC6403 abstractC6403) {
        this.f39725 = abstractC6403;
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f39725.mo17039(obj);
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        AbstractC6403 abstractC6403 = this.f39725;
        abstractC6403.getClass();
        return new C3419(abstractC6403);
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ */
    public final int mo6619(int i, Object[] objArr) {
        AbstractC4516 it = this.f39725.f21604.values().iterator();
        while (it.hasNext()) {
            i = ((AbstractC4911) it.next()).mo6619(i, objArr);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f39725.f21605;
    }

    @Override // l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
