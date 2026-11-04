package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes.dex */
public final class C24743 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f80123;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23251 f80124;

    public C24743(C23251 c23251, Iterator it) {
        this.f80124 = c23251;
        this.f80123 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80123.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f80123.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f80124.m52273();
        this.f80123.remove();
    }

    public final boolean equals(Object obj) {
        return this.f80123.equals(obj);
    }

    public final int hashCode() {
        return this.f80123.hashCode();
    }

    public final String toString() {
        return this.f80123.toString();
    }
}
