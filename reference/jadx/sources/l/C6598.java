package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6598 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC12563 f22081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC12563 f22082;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24498 f22083;

    public C6598(C24498 c24498, AbstractC12563 abstractC12563) {
        this.f22083 = c24498;
        this.f22082 = abstractC12563;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22082 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC12563 abstractC12563 = this.f22082;
        this.f22081 = abstractC12563;
        if (abstractC12563 != null) {
            this.f22082 = abstractC12563.f40349;
            return abstractC12563;
        }
        this.f22082 = null;
        return abstractC12563;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC12563 abstractC12563 = this.f22081;
        if (abstractC12563 != null) {
            this.f22083.m54761(abstractC12563);
            this.f22081 = null;
        }
    }
}
