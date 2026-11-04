package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes.dex */
public final class C23859 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3721 f77242;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f77243;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f77245 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f77244 = true;

    public C23859(C3721 c3721, Object[] objArr) {
        this.f77242 = c3721;
        this.f77243 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77245 < this.f77243.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f77244 = false;
        int i = this.f77245;
        this.f77245 = i + 1;
        return this.f77243[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f77244) {
            throw new IllegalStateException();
        }
        this.f77242.remove(this.f77243[this.f77245 - 1]);
        this.f77244 = true;
    }
}
