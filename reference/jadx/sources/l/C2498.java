package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9OW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2498 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f8005;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8005.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f8005.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
