package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23261 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18321 f75472;

    public C23261(C18321 c18321) {
        this.f75472 = c18321;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75472 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18321 c18321 = this.f75472;
        if (c18321 == null) {
            throw new NoSuchElementException();
        }
        InterfaceC17428 interfaceC17428 = c18321.f58453;
        this.f75472 = this.f75472.f58451;
        return interfaceC17428;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
