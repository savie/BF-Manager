package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5IE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13465 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f42859;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo8279(Object obj);

    public AbstractC13465(Iterator it) {
        it.getClass();
        this.f42859 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42859.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo8279(this.f42859.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f42859.remove();
    }
}
