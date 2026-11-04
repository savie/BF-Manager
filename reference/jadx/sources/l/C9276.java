package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9276 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f30170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f30171;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30173;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30173;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f30172;
        if (j == this.f30171) {
            if (!this.f30173) {
                throw new NoSuchElementException();
            }
            this.f30173 = false;
        } else {
            this.f30172 = this.f30170 + j;
        }
        return Long.valueOf(j);
    }

    public C9276(long j, long j2) {
        this.f30170 = j2;
        this.f30171 = j;
        boolean z = false;
        if (j2 <= 0 ? 1 >= j : 1 <= j) {
            z = true;
        }
        this.f30173 = z;
        this.f30172 = z ? 1L : j;
    }
}
