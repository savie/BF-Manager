package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9507 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2796 f30790;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f30791;

    public C9507(C2796 c2796, Iterator it) {
        this.f30790 = c2796;
        this.f30791 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30791.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C19906.m45835(this.f30790.f9202, this.f30791.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30791.remove();
    }
}
