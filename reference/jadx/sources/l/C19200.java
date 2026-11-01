package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E61U */
/* JADX INFO: loaded from: classes4.dex */
public final class C19200 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f62013;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f62014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f62015;

    public C19200(List list, List list2, Iterator it) {
        this.f62013 = list.iterator();
        this.f62014 = list2.iterator();
        this.f62015 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62013.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Set setOf;
        String string = ((CharSequence) this.f62013.next()).toString();
        Iterator it = this.f62014;
        if (it.hasNext()) {
            setOf = (Set) it.next();
        } else {
            setOf = AbstractC23844.of();
        }
        Iterator it2 = this.f62015;
        return new C7911(it2.hasNext() ? (String) it2.next() : null, string, setOf);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
