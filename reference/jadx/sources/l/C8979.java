package l;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8979 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f29276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f29277;

    public C8979(Iterable iterable) {
        this.f29277 = iterable;
        this.f29276 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29276.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C2503.toPath((File) this.f29276.next());
    }
}
