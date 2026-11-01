package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5145 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17877 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3733 f17878;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    public C5145(AbstractC3733 abstractC3733) {
        this.f17878 = abstractC3733;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17877 < this.f17878.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f17877;
        this.f17877 = i + 1;
        return this.f17878.getItem(i);
    }
}
