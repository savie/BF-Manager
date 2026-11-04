package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes.dex */
public final class C23306 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3168 f75471;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75471.f10278 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C3168 c3168 = this.f75471;
            this.f75471 = c3168.f10278;
            return c3168;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
