package l;

/* JADX INFO: renamed from: l.᩸ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21727 extends AbstractC0477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC0477 f70442;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC0477 f70443 = C19280.f62237;

    public C21727(AbstractC19611 abstractC19611) {
        this.f70442 = abstractC19611.f62963.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f70443.hasNext() || this.f70442.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f70443.hasNext()) {
            this.f70443 = ((AbstractC1826) this.f70442.next()).iterator();
        }
        return this.f70443.next();
    }
}
