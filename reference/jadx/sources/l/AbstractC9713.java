package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9713 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32706;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f32707;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11705 f32708;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32709;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract Object mo24671(int i);

    public AbstractC9713(C11705 c11705) {
        this.f32708 = c11705;
        this.f32709 = c11705.f39347;
        this.f32707 = c11705.isEmpty() ? -1 : 0;
        this.f32706 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32707 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C11705 c11705 = this.f32708;
        if (c11705.f39347 == this.f32709) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f32707;
            this.f32706 = i;
            Object objMo24671 = mo24671(i);
            this.f32707 = c11705.m29246(this.f32707);
            return objMo24671;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C11705 c11705 = this.f32708;
        if (c11705.f39347 == this.f32709) {
            C18304.m42522("no calls to next() since the last call to remove()", this.f32706 >= 0);
            this.f32709 += 32;
            c11705.remove(C11705.m29227(c11705, this.f32706));
            this.f32707--;
            this.f32706 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
