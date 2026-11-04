package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5418 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18908;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17350 f18909;

    public C5418(C17350 c17350) {
        this.f18909 = c17350;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18908 < this.f18909.f56463;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f18908;
        this.f18908 = i + 1;
        C11383 c11383 = new C11383(this.f18909);
        if (!c11383.m28730(i)) {
            return null;
        }
        C12875 c12875 = new C12875();
        c12875.f41208 = new C14763();
        c12875.f41207 = c11383.m28729();
        c12875.f41206 = c11383.m28727();
        for (int i2 = 0; i2 < c11383.m28731(); i2++) {
            c12875.f41208.add(c11383.m28732(i2));
        }
        return c12875;
    }
}
