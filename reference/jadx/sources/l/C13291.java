package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13291 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f42445;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C13291(Iterator it) {
        C15243.m36590(it, "iterator");
        this.f42445 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42445.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f42444;
        this.f42444 = i + 1;
        if (i >= 0) {
            return new C20004(i, this.f42445.next());
        }
        throw new ArithmeticException("Index overflow has happened.");
    }
}
