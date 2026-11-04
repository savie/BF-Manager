package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10022 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f32143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f32144;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32145;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32146;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32146;
    }

    public final int nextInt() {
        int i = this.f32145;
        if (i == this.f32144) {
            if (!this.f32146) {
                throw new NoSuchElementException();
            }
            this.f32146 = false;
            return i;
        }
        this.f32145 = this.f32143 + i;
        return i;
    }

    public C10022(int i, int i2, int i3) {
        this.f32143 = i3;
        this.f32144 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f32146 = z;
        this.f32145 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }
}
