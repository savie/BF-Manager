package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89QF */
/* JADX INFO: loaded from: classes3.dex */
public final class C14236 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f46633;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17372 f46634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46635;

    public C14236(int i, InterfaceC17372 interfaceC17372) {
        this.f46633 = i;
        this.f46634 = interfaceC17372;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f46635 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46635 < this.f46633;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f46635;
        this.f46635 = i + 1;
        return this.f46634.apply(i);
    }
}
