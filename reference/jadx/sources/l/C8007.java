package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8007 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8713 f26258;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f26259;

    public C8007(AbstractC8713 abstractC8713, Iterator it) {
        this.f26258 = abstractC8713;
        this.f26259 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26259.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C19296 c19296 = new C19296(this.f26258);
        c19296.f62269 = this.f26259.next();
        return c19296;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
