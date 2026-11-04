package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes.dex */
public class C23406 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75766;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12217 f75767;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C23406(AbstractC12217 abstractC12217) {
        this.f75767 = abstractC12217;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52595() {
        return this.f75766;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52596(int i) {
        this.f75766 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75766 < this.f75767.mo4094();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f75766;
        this.f75766 = i + 1;
        return this.f75767.get(i);
    }

    public int nextIndex() {
        return m52595();
    }
}
