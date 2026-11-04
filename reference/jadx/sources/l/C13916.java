package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E61U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13916 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f44131;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f44132;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f44133;

    public C13916(List list, List list2, Iterator it) {
        this.f44132 = list.iterator();
        this.f44131 = list2.iterator();
        this.f44133 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44132.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Set setOf;
        String string = ((CharSequence) this.f44132.next()).toString();
        Iterator it = this.f44131;
        if (it.hasNext()) {
            setOf = (Set) it.next();
        } else {
            setOf = AbstractC8639.of();
        }
        Iterator it2 = this.f44133;
        return new C7205(it2.hasNext() ? (String) it2.next() : null, string, setOf);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
