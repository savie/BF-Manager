package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20060 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13347 f64463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f64464;

    public C20060(AbstractC13347 abstractC13347, Iterator it) {
        this.f64463 = abstractC13347;
        this.f64464 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64464.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f64463.mo2185(this.f64464.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f64464.remove();
    }
}
