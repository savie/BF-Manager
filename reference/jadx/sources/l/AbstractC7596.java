package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48M7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7596 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25084;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25085;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25086;

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo12504(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo12505(int i);

    public AbstractC7596(int i) {
        this.f25085 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25086 < this.f25085;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo12505 = mo12505(this.f25086);
        this.f25086++;
        this.f25084 = true;
        return objMo12505;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f25084) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f25086 - 1;
        this.f25086 = i;
        mo12504(i);
        this.f25085--;
        this.f25084 = false;
    }
}
