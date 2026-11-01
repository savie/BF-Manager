package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13951 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC4777 f45903;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC4777 f45904;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11834 f45905;

    public C13951(C11834 c11834, AbstractC4777 abstractC4777) {
        this.f45905 = c11834;
        this.f45903 = abstractC4777;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45903 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC4777 abstractC4777 = this.f45903;
        this.f45904 = abstractC4777;
        if (abstractC4777 != null) {
            this.f45903 = abstractC4777.f16793;
            return abstractC4777;
        }
        this.f45903 = null;
        return abstractC4777;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC4777 abstractC4777 = this.f45904;
        if (abstractC4777 != null) {
            this.f45905.m29522(abstractC4777);
            this.f45904 = null;
        }
    }
}
