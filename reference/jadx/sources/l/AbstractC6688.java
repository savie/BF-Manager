package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6688 extends AbstractC14956 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22280;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f22281;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract Object mo18709(int i);

    public AbstractC6688(int i, int i2) {
        C12128.m30311(i2, i);
        this.f22281 = i;
        this.f22280 = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f22280 < this.f22281;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f22280;
        this.f22280 = i + 1;
        return mo18709(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22280;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22280 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f22280 - 1;
        this.f22280 = i;
        return mo18709(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22280 - 1;
    }
}
