package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21129 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7704 f67506;

    public C21129(C7704 c7704) {
        this.f67506 = c7704;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67506 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C7704 c7704 = this.f67506;
        if (c7704 == null) {
            throw new NoSuchElementException();
        }
        InterfaceC19637 interfaceC19637 = c7704.f25414;
        this.f67506 = this.f67506.f25413;
        return interfaceC19637;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
