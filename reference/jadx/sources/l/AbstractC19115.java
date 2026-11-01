package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HO */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19115 extends AbstractC16706 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61754;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f61755;

    /* JADX INFO: renamed from: ܰ */
    public abstract Object mo19960(int i);

    public AbstractC19115(int i, int i2) {
        C18304.m42519(i2, i);
        this.f61755 = i;
        this.f61754 = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f61754 < this.f61755;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f61754;
        this.f61754 = i + 1;
        return mo19960(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f61754;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f61754 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f61754 - 1;
        this.f61754 = i;
        return mo19960(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f61754 - 1;
    }
}
