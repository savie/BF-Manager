package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8347 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13567 f27342;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f27343;

    public C8347(AbstractC13567 abstractC13567, Iterator it) {
        this.f27342 = abstractC13567;
        this.f27343 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27343.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6856 c6856 = new C6856(this.f27342);
        c6856.f22770 = this.f27343.next();
        return c6856;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
