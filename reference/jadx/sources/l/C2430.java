package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2430 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f7771;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8396 f7772;

    public C2430(C8396 c8396) {
        this.f7772 = c8396;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7771 < this.f7772.f27510;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7771;
        this.f7771 = i + 1;
        return this.f7772.get(i);
    }
}
