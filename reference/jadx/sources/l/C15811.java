package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15811 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0287 f51169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f51170;

    public C15811(AbstractC0287 abstractC0287, Iterator it) {
        this.f51169 = abstractC0287;
        this.f51170 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51170.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f51169.mo1810(this.f51170.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f51170.remove();
    }
}
