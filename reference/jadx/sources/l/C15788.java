package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15788 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f51131;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Function f51132;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f51133 = C20021.f64126;

    public C15788(Iterable iterable, Function function) {
        this.f51131 = iterable.iterator();
        this.f51132 = function;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        Iterator it2 = this.f51133;
        if (it2 != null && !it2.hasNext()) {
            do {
                Iterator it3 = this.f51131;
                if (it3.hasNext()) {
                    it = (Iterator) this.f51132.apply(it3.next());
                    this.f51133 = it;
                } else {
                    this.f51133 = null;
                    break;
                }
            } while (!it.hasNext());
        }
        return this.f51133 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f51133 == C20021.f64126 && !hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f51133.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
