package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes.dex */
public final class C23999 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f77643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3861 f77644;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C23999(C3861 c3861) {
        this.f77644 = c3861;
        this.f77643 = c3861.f13173.iterator();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f77644.f13174.invoke(this.f77643.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77643.hasNext();
    }
}
