package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15879 extends AbstractC4516 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f51635 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator[] f51636;

    public C15879(Iterator[] itArr) {
        this.f51636 = itArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51635 < this.f51636.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f51635;
        Iterator[] itArr = this.f51636;
        Iterator it = itArr[i];
        C17359.requireNonNull(it);
        int i2 = this.f51635;
        itArr[i2] = null;
        this.f51635 = i2 + 1;
        return it;
    }
}
