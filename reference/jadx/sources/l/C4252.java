package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4252 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15477;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f15478;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f15479;

    public C4252(String str) {
        this.f15478 = str;
        C14692 c14692 = new C14692(str);
        this.f15479 = c14692;
        this.f15477 = ((Integer) c14692.next()).intValue();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f15477;
        C14692 c14692 = (C14692) this.f15479;
        boolean zHasNext = c14692.hasNext();
        String str = this.f15478;
        if (zHasNext) {
            this.f15477 = ((Integer) c14692.next()).intValue();
        } else if (hasNext()) {
            this.f15477 = str.length();
        } else {
            throw new NoSuchElementException();
        }
        return str.substring(i, this.f15477);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15477 < this.f15478.length();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
