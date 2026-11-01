package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3261 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f12117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4403 f12118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12119 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f12116 = true;

    public C3261(C4403 c4403, Object[] objArr) {
        this.f12118 = c4403;
        this.f12117 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12119 < this.f12117.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12116 = false;
        int i = this.f12119;
        this.f12119 = i + 1;
        return this.f12117[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12116) {
            throw new IllegalStateException();
        }
        this.f12118.remove(this.f12117[this.f12119 - 1]);
        this.f12116 = true;
    }
}
