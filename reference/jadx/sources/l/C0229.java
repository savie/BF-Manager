package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0229 extends AbstractC0477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f1420;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f1421;

    public C0229(Object obj) {
        this.f1421 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f1420;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1420) {
            throw new NoSuchElementException();
        }
        this.f1420 = true;
        return this.f1421;
    }
}
