package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7991 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26227;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f26228;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f26229;

    public C7991(int i, Iterator it) {
        this.f26227 = i;
        this.f26229 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26228 < this.f26227 && this.f26229.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26228++;
        return this.f26229.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26229.remove();
    }
}
