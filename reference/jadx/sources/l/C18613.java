package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89QF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18613 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23057 f60524;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f60525;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60526;

    public C18613(int i, InterfaceC23057 interfaceC23057) {
        this.f60525 = i;
        this.f60524 = interfaceC23057;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f60526 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60526 < this.f60525;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f60526;
        this.f60526 = i + 1;
        return this.f60524.apply(i);
    }
}
