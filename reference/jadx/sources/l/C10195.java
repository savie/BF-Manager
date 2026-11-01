package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10195 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 f34824;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC19367 f34825;

    public C10195(AbstractC19367 abstractC19367, AbstractC19367 abstractC19368) {
        this.f34825 = abstractC19367;
        this.f34824 = abstractC19368;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC19367 abstractC19367 = this.f34825;
        return (abstractC19367 == null || abstractC19367 == this.f34824) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC19367 abstractC19367 = this.f34825;
        this.f34825 = abstractC19367.m44390();
        return abstractC19367;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
