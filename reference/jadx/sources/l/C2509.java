package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2509 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Function f8026;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f8027;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f8028 = C8475.f27762;

    public C2509(Iterable iterable, Function function) {
        this.f8027 = iterable.iterator();
        this.f8026 = function;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        Iterator it2 = this.f8028;
        if (it2 != null && !it2.hasNext()) {
            do {
                Iterator it3 = this.f8027;
                if (it3.hasNext()) {
                    it = (Iterator) this.f8026.apply(it3.next());
                    this.f8028 = it;
                } else {
                    this.f8028 = null;
                    break;
                }
            } while (!it.hasNext());
        }
        return this.f8028 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8028 == C8475.f27762 && !hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f8028.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
