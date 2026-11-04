package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C0218 extends AbstractC4516 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1421;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f1422;

    public C0218(Object obj) {
        this.f1422 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f1421;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1421) {
            throw new NoSuchElementException();
        }
        this.f1421 = true;
        return this.f1422;
    }
}
