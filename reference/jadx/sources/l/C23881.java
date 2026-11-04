package l;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes.dex */
public final class C23881 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f77349;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Deque f77350;

    public C23881(AbstractC6727 abstractC6727, Deque deque) {
        this.f77350 = deque;
        if (abstractC6727.m18776()) {
            this.f77349 = ((C1661) deque).descendingIterator();
        } else {
            this.f77349 = ((C1661) deque).iterator();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Deque m53383() {
        return this.f77350;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77349.hasNext();
    }

    @Override // java.util.Iterator
    public final InterfaceC17913 next() {
        return (InterfaceC17913) this.f77349.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f77349.remove();
    }
}
