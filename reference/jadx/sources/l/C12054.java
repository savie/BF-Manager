package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12054 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f40326;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f40327;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f40328;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40329;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40329;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f40326;
        if (j == this.f40327) {
            if (!this.f40329) {
                throw new NoSuchElementException();
            }
            this.f40329 = false;
        } else {
            this.f40326 = this.f40328 + j;
        }
        return Long.valueOf(j);
    }

    public C12054(long j, long j2) {
        this.f40328 = j2;
        this.f40327 = j;
        boolean z = false;
        if (j2 <= 0 ? 1 >= j : 1 <= j) {
            z = true;
        }
        this.f40329 = z;
        this.f40326 = z ? 1L : j;
    }
}
