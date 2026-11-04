package l;

/* JADX INFO: renamed from: l.ۗ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3419 extends AbstractC4516 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC4516 f11091;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC4516 f11092 = C12150.f39059;

    public C3419(AbstractC6403 abstractC6403) {
        this.f11091 = abstractC6403.f21604.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11092.hasNext() || this.f11091.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f11092.hasNext()) {
            this.f11092 = ((AbstractC4911) this.f11091.next()).iterator();
        }
        return this.f11092.next();
    }
}
