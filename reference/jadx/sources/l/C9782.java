package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9782 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f31535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31536;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C9782(Object[] objArr) {
        C15243.m36590(objArr, "array");
        this.f31535 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31536 < this.f31535.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f31535;
            int i = this.f31536;
            this.f31536 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f31536--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
