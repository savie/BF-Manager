package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21396 extends AbstractC0477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f69571 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator[] f69572;

    public C21396(Iterator[] itArr) {
        this.f69572 = itArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69571 < this.f69572.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f69571;
        Iterator[] itArr = this.f69572;
        Iterator it = itArr[i];
        C13638.requireNonNull(it);
        int i2 = this.f69571;
        itArr[i2] = null;
        this.f69571 = i2 + 1;
        return it;
    }
}
