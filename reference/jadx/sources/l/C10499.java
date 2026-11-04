package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10499 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 f33407;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC4534 f33408;

    public C10499(AbstractC4534 abstractC4534, AbstractC4534 abstractC4535) {
        this.f33408 = abstractC4534;
        this.f33407 = abstractC4535;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC4534 abstractC4534 = this.f33408;
        return (abstractC4534 == null || abstractC4534 == this.f33407) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC4534 abstractC4534 = this.f33408;
        this.f33408 = abstractC4534.m14261();
        return abstractC4534;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
