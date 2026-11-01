package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܽ۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C16494 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5910 f53001;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C16494(AbstractC5910 abstractC5910) {
        this.f53001 = abstractC5910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38769() {
        return this.f53000;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38770(int i) {
        this.f53000 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53000 < this.f53001.mo39302();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f53000;
        this.f53000 = i + 1;
        return this.f53001.get(i);
    }

    public int nextIndex() {
        return m38769();
    }
}
