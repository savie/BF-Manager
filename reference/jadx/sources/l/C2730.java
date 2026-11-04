package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4U5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2730 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9085 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8696 f9086;

    public C2730(AbstractC8696 abstractC8696) {
        this.f9086 = abstractC8696;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9085 < this.f9086.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f9085;
        this.f9085 = i + 1;
        return this.f9086.mo23382(i);
    }
}
