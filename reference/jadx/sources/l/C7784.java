package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7784 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f25855;

    public C7784(Iterator it) {
        this.f25855 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25855.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f25855.next();
        return entry.getValue() instanceof C18971 ? new C0326(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25855.remove();
    }
}
