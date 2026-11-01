package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3047 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C4603 f11427;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11427.f16300 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C4603 c4603 = this.f11427;
            this.f11427 = c4603.f16300;
            return c4603;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
