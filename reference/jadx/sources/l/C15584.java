package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15584 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13347 f50687;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f50688;

    public C15584(AbstractC13347 abstractC13347, Iterator it) {
        this.f50687 = abstractC13347;
        this.f50688 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50688.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f50687.mo2185(this.f50688.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f50688.remove();
    }
}
