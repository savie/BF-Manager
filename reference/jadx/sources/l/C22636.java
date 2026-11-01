package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes.dex */
public final class C22636 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73753;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f73754 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14875 f73755;

    public C22636(AbstractC14875 abstractC14875, int i) {
        this.f73755 = abstractC14875;
        this.f73753 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f73754 < this.f73753;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f73754;
        this.f73754 = i + 1;
        return this.f73755.getName(i);
    }
}
