package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17429 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6140 f55446;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f55447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f55448;

    public C17429(C6140 c6140) {
        this.f55446 = c6140;
        long j = c6140.f37607;
        this.f55447 = j == 0 ? 0 : (int) (c6140.f37609 / j);
        this.f55448 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55448 < this.f55447;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f55448;
        this.f55448 = i + 1;
        C6140 c6140 = this.f55446;
        return new C12491(c6140.f37606, c6140, (int) ((((long) i) * c6140.f37607) + c6140.f37608));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
