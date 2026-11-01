package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4U5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17788 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f56399 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18494 f56400;

    public C17788(AbstractC18494 abstractC18494) {
        this.f56400 = abstractC18494;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56399 < this.f56400.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f56399;
        this.f56399 = i + 1;
        return this.f56400.mo42889(i);
    }
}
