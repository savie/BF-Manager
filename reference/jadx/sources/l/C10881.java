package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10881 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f36992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9470 f36993;

    public C10881(C9470 c9470, Iterator it) {
        this.f36993 = c9470;
        this.f36992 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36992.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f36992.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f36993.m24246();
        this.f36992.remove();
    }

    public final boolean equals(Object obj) {
        return this.f36992.equals(obj);
    }

    public final int hashCode() {
        return this.f36992.hashCode();
    }

    public final String toString() {
        return this.f36992.toString();
    }
}
