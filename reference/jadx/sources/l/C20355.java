package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20355 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65289;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65290;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f65291;

    public C20355(int i, Iterator it) {
        this.f65290 = i;
        this.f65291 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65289 < this.f65290 && this.f65291.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f65289++;
        return this.f65291.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f65291.remove();
    }
}
