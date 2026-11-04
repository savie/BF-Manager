package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2662 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f8477;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22970 f8478;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14769 f8479 = C14769.m35543();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22970 f8480 = null;

    public C2662(C22010 c22010, AbstractC22664 abstractC22664) {
        this.f8477 = c22010;
        this.f8478 = m8818(abstractC22664);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC22970 abstractC22970 = this.f8478;
        C22010 c22010 = this.f8477;
        if (abstractC22970 == c22010.f71034.f48321) {
            this.f8478 = m8818(c22010.f71021.m55137(this.f8480.f38067));
        }
        return this.f8478 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC22970 abstractC22970 = this.f8478;
        this.f8480 = abstractC22970;
        AbstractC22970 abstractC22971 = this.f8477.f71034.f48321;
        this.f8478 = abstractC22971;
        C11972.m30026((abstractC22970 == null && abstractC22970 == abstractC22971) ? false : true);
        return this.f8480;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22970 m8818(AbstractC22664 abstractC22664) {
        if (!abstractC22664.m51067(EnumC21172.CLASS) && !abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            return null;
        }
        AbstractC22664 abstractC22664M55161 = this.f8477.f71021.m55161(abstractC22664, false);
        if (this.f8479.contains(abstractC22664M55161.f73596)) {
            return null;
        }
        this.f8479 = this.f8479.m35552(abstractC22664M55161.f73596);
        return abstractC22664M55161.f73596;
    }
}
