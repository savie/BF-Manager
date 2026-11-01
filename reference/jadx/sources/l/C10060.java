package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10060 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC0618 f34384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f34385;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21825 f34383 = C21825.m48588();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC0618 f34386 = null;

    public C10060(C20145 c20145, AbstractC16579 abstractC16579) {
        this.f34385 = c20145;
        this.f34384 = m25472(abstractC16579);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC0618 abstractC0618 = this.f34384;
        C20145 c20145 = this.f34385;
        if (abstractC0618 == c20145.f65410.f14243) {
            this.f34384 = m25472(c20145.f65444.m52432(this.f34386.f77449));
        }
        return this.f34384 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC0618 abstractC0618 = this.f34384;
        this.f34386 = abstractC0618;
        AbstractC0618 abstractC0619 = this.f34385.f65410.f14243;
        this.f34384 = abstractC0619;
        C6171.m17176((abstractC0618 == null && abstractC0618 == abstractC0619) ? false : true);
        return this.f34386;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0618 m25472(AbstractC16579 abstractC16579) {
        if (!abstractC16579.m39001(EnumC6617.CLASS) && !abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            return null;
        }
        AbstractC16579 abstractC16579M52422 = this.f34385.f65444.m52422(abstractC16579, false);
        if (this.f34383.contains(abstractC16579M52422.f53222)) {
            return null;
        }
        this.f34383 = this.f34383.m48597(abstractC16579M52422.f53222);
        return abstractC16579M52422.f53222;
    }
}
