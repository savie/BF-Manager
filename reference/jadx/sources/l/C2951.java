package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2951 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9635 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5101 f9636;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    public C2951(AbstractC5101 abstractC5101) {
        this.f9636 = abstractC5101;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9635 < this.f9636.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9635;
        this.f9635 = i + 1;
        return this.f9636.getItem(i);
    }
}
