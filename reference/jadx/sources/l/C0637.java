package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0637 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f2750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2751;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C0637(Object[] objArr) {
        this.f2750 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2751 < this.f2750.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f2750;
            int i = this.f2751;
            this.f2751 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f2751--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
