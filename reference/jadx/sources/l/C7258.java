package l;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7258 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f24163;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f24164;

    public C7258(Iterable iterable) {
        this.f24164 = iterable;
        this.f24163 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24163.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C7412.toPath((File) this.f24163.next());
    }
}
