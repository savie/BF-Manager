package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4044 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13779 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13780;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14484 f13781;

    public C4044(AbstractC14484 abstractC14484, int i) {
        this.f13781 = abstractC14484;
        this.f13780 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13779 < this.f13780;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f13779;
        this.f13779 = i + 1;
        return this.f13781.getName(i);
    }
}
