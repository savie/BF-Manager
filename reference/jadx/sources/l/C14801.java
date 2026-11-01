package l;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14801 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f48392;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Deque f48393;

    public C14801(AbstractC4817 abstractC4817, Deque deque) {
        this.f48393 = deque;
        if (abstractC4817.m13390()) {
            this.f48392 = ((C0583) deque).descendingIterator();
        } else {
            this.f48392 = ((C0583) deque).iterator();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Deque m35467() {
        return this.f48393;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48392.hasNext();
    }

    @Override // java.util.Iterator
    public final InterfaceC11273 next() {
        return (InterfaceC11273) this.f48392.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f48392.remove();
    }
}
