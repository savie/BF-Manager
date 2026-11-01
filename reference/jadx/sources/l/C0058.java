package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0058 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f920;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f922;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f923;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f923;
    }

    public final int nextInt() {
        int i = this.f920;
        if (i == this.f921) {
            if (!this.f923) {
                throw new NoSuchElementException();
            }
            this.f923 = false;
            return i;
        }
        this.f920 = this.f922 + i;
        return i;
    }

    public C0058(int i, int i2, int i3) {
        this.f922 = i3;
        this.f921 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f923 = z;
        this.f920 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }
}
