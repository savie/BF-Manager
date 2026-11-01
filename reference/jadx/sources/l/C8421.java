package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8421 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29188;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f29189;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C8421(Iterator it) {
        C13465.m32966(it, "iterator");
        this.f29189 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29189.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f29188;
        this.f29188 = i + 1;
        if (i >= 0) {
            return new C18298(i, this.f29189.next());
        }
        throw new ArithmeticException("Index overflow has happened.");
    }
}
