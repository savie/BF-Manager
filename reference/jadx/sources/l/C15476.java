package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15476 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21825 f50425;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50425.f70877 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C21825 c21825 = this.f50425;
        C21825 c21826 = c21825.f70877;
        if (c21826 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c21825.f70876;
        this.f50425 = c21826;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
