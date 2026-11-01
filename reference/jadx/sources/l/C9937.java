package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۤ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9937 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f33919;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f33920;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33921;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f33922;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33922;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f33919;
        if (i == this.f33920) {
            if (!this.f33922) {
                throw new NoSuchElementException();
            }
            this.f33922 = false;
        } else {
            this.f33919 = this.f33921 + i;
        }
        return Character.valueOf((char) i);
    }

    public C9937(char c, int i) {
        this.f33921 = i;
        this.f33920 = c;
        boolean z = false;
        if (i <= 0 ? 1 >= c : 1 < c || 1 == c) {
            z = true;
        }
        this.f33922 = z;
        this.f33919 = z ? (char) 1 : c;
    }
}
