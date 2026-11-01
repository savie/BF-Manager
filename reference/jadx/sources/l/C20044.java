package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20044 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0287 f64180;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f64181;

    public C20044(AbstractC0287 abstractC0287, Iterator it) {
        this.f64180 = abstractC0287;
        this.f64181 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64181.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f64180.mo1810(this.f64181.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f64181.remove();
    }
}
