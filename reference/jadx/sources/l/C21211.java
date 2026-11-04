package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21211 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f67699;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f67700;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67702;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67702;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f67701;
        if (i == this.f67700) {
            if (!this.f67702) {
                throw new NoSuchElementException();
            }
            this.f67702 = false;
        } else {
            this.f67701 = this.f67699 + i;
        }
        return Character.valueOf((char) i);
    }

    public C21211(char c, int i) {
        this.f67699 = i;
        this.f67700 = c;
        boolean z = false;
        if (i <= 0 ? 1 >= c : 1 < c || 1 == c) {
            z = true;
        }
        this.f67702 = z;
        this.f67701 = z ? (char) 1 : c;
    }
}
