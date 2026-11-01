package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C6646 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f22456;

    public C6646(Iterator it) {
        this.f22456 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22456.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f22456.next();
        return entry.getValue() instanceof C22875 ? new C3823(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22456.remove();
    }
}
