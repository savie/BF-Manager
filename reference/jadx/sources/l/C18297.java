package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes4.dex */
public final class C18297 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21825 f58384;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f58384.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f58384.isEmpty()) {
            throw new NoSuchElementException();
        }
        C21825 c21825 = this.f58384;
        Object obj = c21825.f70876;
        this.f58384 = c21825.f70877;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
