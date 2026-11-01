package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5IE */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6827 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f23004;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo5533(Object obj);

    public AbstractC6827(Iterator it) {
        it.getClass();
        this.f23004 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23004.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo5533(this.f23004.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23004.remove();
    }
}
