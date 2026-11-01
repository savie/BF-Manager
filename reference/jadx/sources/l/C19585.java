package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19585 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f62914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9002 f62915;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C19585(C9002 c9002) {
        this.f62915 = c9002;
        this.f62914 = c9002.f30792.iterator();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f62915.f30793.invoke(this.f62914.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62914.hasNext();
    }
}
